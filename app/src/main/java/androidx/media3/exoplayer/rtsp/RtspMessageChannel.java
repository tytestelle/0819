package androidx.media3.exoplayer.rtsp;

import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.upstream.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
import com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class RtspMessageChannel implements Closeable {
    public static final Charset CHARSET = StandardCharsets.UTF_8;
    public static final int DEFAULT_RTSP_PORT = 554;
    private static final String TAG = "RtspMessageChannel";
    private volatile boolean closed;
    private final MessageListener messageListener;
    private Sender sender;
    private Socket socket;
    private final Loader receiverLoader = new Loader("ExoPlayer:RtspMessageChannel:ReceiverLoader");
    private final Map<Integer, InterleavedBinaryDataListener> interleavedBinaryDataListeners = Collections.synchronizedMap(new HashMap());

    public interface InterleavedBinaryDataListener {
        void onInterleavedBinaryDataReceived(byte[] bArr);
    }

    public final class LoaderCallbackImpl implements Loader.Callback<Receiver> {
        private LoaderCallbackImpl() {
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public void onLoadCanceled(Receiver receiver, long j, long j2, boolean z) {
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public void onLoadCompleted(Receiver receiver, long j, long j2) {
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public final /* synthetic */ void onLoadStarted(Loader.Loadable loadable, long j, long j2, int i) {
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, loadable, j, j2, i);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public Loader.LoadErrorAction onLoadError(Receiver receiver, long j, long j2, IOException iOException, int i) {
            if (!RtspMessageChannel.this.closed) {
                RtspMessageChannel.this.messageListener.onReceivingFailed(iOException);
            }
            return Loader.DONT_RETRY;
        }
    }

    public interface MessageListener {
        void onReceivingFailed(Exception exc);

        void onRtspMessageReceived(List<String> list);

        void onSendingFailed(List<String> list, Exception exc);
    }

    public static final class MessageParser {
        private static final int STATE_READING_BODY = 3;
        private static final int STATE_READING_FIRST_LINE = 1;
        private static final int STATE_READING_HEADER = 2;
        private long messageBodyLength;
        private final List<String> messageLines = new ArrayList();
        private int state = 1;

        private O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O addMessageBody(byte[] bArr) {
            Assertions.checkState(this.state == 3);
            if (bArr.length <= 0 || bArr[bArr.length - 1] != 10) {
                throw new IllegalArgumentException("Message body is empty or does not end with a LF.");
            }
            this.messageLines.add((bArr.length <= 1 || bArr[bArr.length + (-2)] != 13) ? new String(bArr, 0, bArr.length - 1, RtspMessageChannel.CHARSET) : new String(bArr, 0, bArr.length - 2, RtspMessageChannel.CHARSET));
            O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OCopyOf = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.copyOf((Collection) this.messageLines);
            reset();
            return o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OCopyOf;
        }

        @Nullable
        private O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O addMessageLine(byte[] bArr) {
            Assertions.checkArgument(bArr.length >= 2 && bArr[bArr.length - 2] == 13 && bArr[bArr.length - 1] == 10);
            String str = new String(bArr, 0, bArr.length - 2, RtspMessageChannel.CHARSET);
            this.messageLines.add(str);
            int i = this.state;
            if (i == 1) {
                if (!RtspMessageUtil.isRtspStartLine(str)) {
                    return null;
                }
                this.state = 2;
                return null;
            }
            if (i != 2) {
                throw new IllegalStateException();
            }
            long contentLengthHeader = RtspMessageUtil.parseContentLengthHeader(str);
            if (contentLengthHeader != -1) {
                this.messageBodyLength = contentLengthHeader;
            }
            if (!str.isEmpty()) {
                return null;
            }
            if (this.messageBodyLength > 0) {
                this.state = 3;
                return null;
            }
            O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OCopyOf = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.copyOf((Collection) this.messageLines);
            reset();
            return o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OCopyOf;
        }

        private static byte[] parseNextLine(byte b, DataInputStream dataInputStream) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = {b, dataInputStream.readByte()};
            byteArrayOutputStream.write(bArr);
            while (true) {
                if (bArr[0] == 13 && bArr[1] == 10) {
                    return byteArrayOutputStream.toByteArray();
                }
                bArr[0] = bArr[1];
                byte b2 = dataInputStream.readByte();
                bArr[1] = b2;
                byteArrayOutputStream.write(b2);
            }
        }

        private void reset() {
            this.messageLines.clear();
            this.state = 1;
            this.messageBodyLength = 0L;
        }

        public O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O parseNext(byte b, DataInputStream dataInputStream) throws IOException {
            O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OAddMessageLine = addMessageLine(parseNextLine(b, dataInputStream));
            while (o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OAddMessageLine == null) {
                if (this.state == 3) {
                    long j = this.messageBodyLength;
                    if (j <= 0) {
                        throw new IllegalStateException("Expects a greater than zero Content-Length.");
                    }
                    int iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(j);
                    Assertions.checkState(iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO != -1);
                    byte[] bArr = new byte[iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO];
                    dataInputStream.readFully(bArr, 0, iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                    o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OAddMessageLine = addMessageBody(bArr);
                } else {
                    o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OAddMessageLine = addMessageLine(parseNextLine(dataInputStream.readByte(), dataInputStream));
                }
            }
            return o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OAddMessageLine;
        }
    }

    public final class Receiver implements Loader.Loadable {
        private static final byte INTERLEAVED_MESSAGE_MARKER = 36;
        private final DataInputStream dataInputStream;
        private volatile boolean loadCanceled;
        private final MessageParser messageParser = new MessageParser();

        public Receiver(InputStream inputStream) {
            this.dataInputStream = new DataInputStream(inputStream);
        }

        private void handleInterleavedBinaryData() throws IOException {
            int unsignedByte = this.dataInputStream.readUnsignedByte();
            int unsignedShort = this.dataInputStream.readUnsignedShort();
            byte[] bArr = new byte[unsignedShort];
            this.dataInputStream.readFully(bArr, 0, unsignedShort);
            InterleavedBinaryDataListener interleavedBinaryDataListener = (InterleavedBinaryDataListener) RtspMessageChannel.this.interleavedBinaryDataListeners.get(Integer.valueOf(unsignedByte));
            if (interleavedBinaryDataListener == null || RtspMessageChannel.this.closed) {
                return;
            }
            interleavedBinaryDataListener.onInterleavedBinaryDataReceived(bArr);
        }

        private void handleRtspMessage(byte b) {
            if (RtspMessageChannel.this.closed) {
                return;
            }
            RtspMessageChannel.this.messageListener.onRtspMessageReceived(this.messageParser.parseNext(b, this.dataInputStream));
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
        public void cancelLoad() {
            this.loadCanceled = true;
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
        public void load() throws IOException {
            while (!this.loadCanceled) {
                byte b = this.dataInputStream.readByte();
                if (b == 36) {
                    handleInterleavedBinaryData();
                } else {
                    handleRtspMessage(b);
                }
            }
        }
    }

    public final class Sender implements Closeable {
        private final OutputStream outputStream;
        private final HandlerThread senderThread;
        private final Handler senderThreadHandler;

        public Sender(OutputStream outputStream) {
            this.outputStream = outputStream;
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:RtspMessageChannel:Sender");
            this.senderThread = handlerThread;
            handlerThread.start();
            this.senderThreadHandler = new Handler(handlerThread.getLooper());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$send$0(byte[] bArr, List list) {
            try {
                this.outputStream.write(bArr);
            } catch (Exception e) {
                if (RtspMessageChannel.this.closed) {
                    return;
                }
                RtspMessageChannel.this.messageListener.onSendingFailed(list, e);
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Handler handler = this.senderThreadHandler;
            HandlerThread handlerThread = this.senderThread;
            Objects.requireNonNull(handlerThread);
            handler.post(new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(handlerThread, 2));
            try {
                this.senderThread.join();
            } catch (InterruptedException unused) {
                this.senderThread.interrupt();
            }
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [byte[], java.io.Serializable] */
        public void send(List<String> list) {
            this.senderThreadHandler.post(new O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this, RtspMessageUtil.convertMessageToByteArray(list), list, 1));
        }
    }

    public RtspMessageChannel(MessageListener messageListener) {
        this.messageListener = messageListener;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.closed) {
            return;
        }
        try {
            Sender sender = this.sender;
            if (sender != null) {
                sender.close();
            }
            this.receiverLoader.release();
            Socket socket = this.socket;
            if (socket != null) {
                socket.close();
            }
        } finally {
            this.closed = true;
        }
    }

    public void open(Socket socket) {
        this.socket = socket;
        this.sender = new Sender(socket.getOutputStream());
        this.receiverLoader.startLoading(new Receiver(socket.getInputStream()), new LoaderCallbackImpl(), 0);
    }

    public void registerInterleavedBinaryDataListener(int i, InterleavedBinaryDataListener interleavedBinaryDataListener) {
        this.interleavedBinaryDataListeners.put(Integer.valueOf(i), interleavedBinaryDataListener);
    }

    public void send(List<String> list) {
        Assertions.checkStateNotNull(this.sender);
        this.sender.send(list);
    }
}
