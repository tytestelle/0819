package O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;

import O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.media3.common.MimeTypes;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import tv.danmaku.ijk.media.player.misc.IMediaFormat;

/* JADX INFO: loaded from: classes.dex */
public final class O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 implements O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 {

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public static final O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O f635O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO());

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public static final O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O f636O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O());

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public static final O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 f637O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(13);

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public static final List f638O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 f639O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO f640O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 f641O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = f637O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    public O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000(O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) {
        this.f640O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        this.f639O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
    }

    @Override // O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0
    public final boolean O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Object obj, O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO) {
        return true;
    }

    @Override // O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0
    public final O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Object obj, int i, int i2, O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO) throws Throwable {
        MediaMetadataRetriever mediaMetadataRetriever;
        int i3;
        long jLongValue = ((Long) o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(f635O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo("Requested frame must be non-negative, or DEFAULT_FRAME, given: ", jLongValue));
        }
        Integer num = (Integer) o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(f636O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
        if (num == null) {
            num = 2;
        }
        O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = (O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f595O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
        if (o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 == null) {
            o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f594O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        }
        O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01 = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
        this.f641O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getClass();
        MediaMetadataRetriever mediaMetadataRetriever2 = new MediaMetadataRetriever();
        try {
            switch (this.f639O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f190O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
                case 11:
                    AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
                    mediaMetadataRetriever2.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                    break;
                case 12:
                    mediaMetadataRetriever2.setDataSource(new O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00((ByteBuffer) obj));
                    break;
                default:
                    mediaMetadataRetriever2.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
                    break;
            }
            i3 = 29;
            mediaMetadataRetriever = mediaMetadataRetriever2;
            try {
                Bitmap bitmapO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(obj, mediaMetadataRetriever2, jLongValue, num.intValue(), i, i2, o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01);
                if (Build.VERSION.SDK_INT >= 29) {
                    mediaMetadataRetriever.release();
                } else {
                    mediaMetadataRetriever.release();
                }
                return O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this.f640O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, bitmapO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
            } catch (Throwable th) {
                th = th;
                if (Build.VERSION.SDK_INT >= i3) {
                    mediaMetadataRetriever.release();
                } else {
                    mediaMetadataRetriever.release();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            mediaMetadataRetriever = mediaMetadataRetriever2;
            i3 = 29;
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:60:0x0116  */
    /* JADX WARN: Code duplicated, block: B:71:0x0145  */
    /* JADX WARN: Code duplicated, block: B:73:0x014b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:77:0x0165 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:78:0x0167 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:84:0x017f  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:91:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    public final Bitmap O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(Object obj, MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        MediaExtractor mediaExtractor;
        String str = Build.DEVICE;
        Bitmap bitmapCreateBitmap = null;
        if (str != null && str.matches(".+_cheets|cheets_.+")) {
            try {
                if (MimeTypes.VIDEO_WEBM.equals(mediaMetadataRetriever.extractMetadata(12))) {
                    mediaExtractor = new MediaExtractor();
                    try {
                        switch (this.f639O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f190O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
                            case 11:
                                AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
                                mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                                break;
                            case 12:
                                mediaExtractor.setDataSource(new O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00((ByteBuffer) obj));
                                break;
                            default:
                                mediaExtractor.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
                                break;
                        }
                        int trackCount = mediaExtractor.getTrackCount();
                        for (int i9 = 0; i9 < trackCount; i9++) {
                            if (MimeTypes.VIDEO_VP8.equals(mediaExtractor.getTrackFormat(i9).getString(IMediaFormat.KEY_MIME))) {
                                mediaExtractor.release();
                                throw new IllegalStateException("Cannot decode VP8 video on CrOS.");
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        try {
                            if (Log.isLoggable("VideoDecoder", 3)) {
                                Log.d("VideoDecoder", "Exception trying to extract track info for a webm video on CrOS.", th);
                            }
                            if (mediaExtractor != null) {
                            }
                            if (Build.VERSION.SDK_INT >= 27) {
                                try {
                                    i6 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                                    i7 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                                    i8 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
                                    if (i8 != 90) {
                                        i7 = i6;
                                        i6 = i7;
                                    } else {
                                        i7 = i6;
                                        i6 = i7;
                                    }
                                    float fO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(i6, i7, i2, i3);
                                    bitmapCreateBitmap = mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(i6 * fO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO), Math.round(fO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO * i7));
                                } catch (Throwable th2) {
                                    if (Log.isLoggable("VideoDecoder", 3)) {
                                        Log.d("VideoDecoder", "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame", th2);
                                    }
                                }
                            }
                            if (bitmapCreateBitmap == null) {
                                bitmapCreateBitmap = mediaMetadataRetriever.getFrameAtTime(j, i);
                            }
                            if (Build.MODEL.startsWith("Pixel")) {
                                i4 = Build.VERSION.SDK_INT;
                                if (i4 >= 30) {
                                    try {
                                        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(36);
                                        String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
                                        i5 = Integer.parseInt(strExtractMetadata);
                                        int i10 = Integer.parseInt(strExtractMetadata2);
                                        if (i5 != 7) {
                                            if (Log.isLoggable("VideoDecoder", 3)) {
                                                Log.d("VideoDecoder", "Applying HDR 180 deg thumbnail correction");
                                            }
                                            Matrix matrix = new Matrix();
                                            matrix.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                                            bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix, true);
                                        } else {
                                            if (Log.isLoggable("VideoDecoder", 3)) {
                                                Log.d("VideoDecoder", "Applying HDR 180 deg thumbnail correction");
                                            }
                                            Matrix matrix2 = new Matrix();
                                            matrix2.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                                            bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix2, true);
                                        }
                                    } catch (NumberFormatException unused) {
                                        if (Log.isLoggable("VideoDecoder", 3)) {
                                            Log.d("VideoDecoder", "Exception trying to extract HDR transfer function or rotation");
                                        }
                                    }
                                }
                            } else {
                                i4 = Build.VERSION.SDK_INT;
                                if (i4 >= 30) {
                                    String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(36);
                                    String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(35);
                                    i5 = Integer.parseInt(strExtractMetadata3);
                                    int i11 = Integer.parseInt(strExtractMetadata4);
                                    if (i5 != 7) {
                                        if (Log.isLoggable("VideoDecoder", 3)) {
                                            Log.d("VideoDecoder", "Applying HDR 180 deg thumbnail correction");
                                        }
                                        Matrix matrix3 = new Matrix();
                                        matrix3.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                                        bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix3, true);
                                    } else {
                                        if (Log.isLoggable("VideoDecoder", 3)) {
                                            Log.d("VideoDecoder", "Applying HDR 180 deg thumbnail correction");
                                        }
                                        Matrix matrix4 = new Matrix();
                                        matrix4.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                                        bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix4, true);
                                    }
                                }
                            }
                            if (bitmapCreateBitmap != null) {
                                return bitmapCreateBitmap;
                            }
                            throw new O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o();
                        } catch (Throwable th3) {
                            if (mediaExtractor != null) {
                                mediaExtractor.release();
                            }
                            throw th3;
                        }
                    }
                    mediaExtractor.release();
                }
            } catch (Throwable th4) {
                th = th4;
                mediaExtractor = null;
            }
        }
        if (Build.VERSION.SDK_INT >= 27 && i2 != Integer.MIN_VALUE && i3 != Integer.MIN_VALUE && o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 != O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f593O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) {
            i6 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            i7 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            i8 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (i8 != 90 || i8 == 270) {
                i7 = i6;
                i6 = i7;
            }
            float fO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2 = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(i6, i7, i2, i3);
            bitmapCreateBitmap = mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(i6 * fO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2), Math.round(fO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2 * i7));
        }
        if (bitmapCreateBitmap == null) {
            bitmapCreateBitmap = mediaMetadataRetriever.getFrameAtTime(j, i);
        }
        if (Build.MODEL.startsWith("Pixel") || Build.VERSION.SDK_INT != 33) {
            i4 = Build.VERSION.SDK_INT;
            if (i4 >= 30 && i4 < 33) {
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(36);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(35);
                i5 = Integer.parseInt(strExtractMetadata5);
                int i12 = Integer.parseInt(strExtractMetadata6);
                if ((i5 != 7 || i5 == 6) && i12 == 6 && Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) == 180) {
                    if (Log.isLoggable("VideoDecoder", 3)) {
                        Log.d("VideoDecoder", "Applying HDR 180 deg thumbnail correction");
                    }
                    Matrix matrix5 = new Matrix();
                    matrix5.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix5, true);
                }
            }
        } else {
            Iterator it = f638O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.iterator();
            do {
                if (it.hasNext()) {
                }
            } while (!Build.ID.startsWith((String) it.next()));
            String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(36);
            String strExtractMetadata8 = mediaMetadataRetriever.extractMetadata(35);
            i5 = Integer.parseInt(strExtractMetadata7);
            int i13 = Integer.parseInt(strExtractMetadata8);
            if (i5 != 7) {
                if (Log.isLoggable("VideoDecoder", 3)) {
                    Log.d("VideoDecoder", "Applying HDR 180 deg thumbnail correction");
                }
                Matrix matrix6 = new Matrix();
                matrix6.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix6, true);
            } else {
                if (Log.isLoggable("VideoDecoder", 3)) {
                    Log.d("VideoDecoder", "Applying HDR 180 deg thumbnail correction");
                }
                Matrix matrix7 = new Matrix();
                matrix7.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix7, true);
            }
        }
        if (bitmapCreateBitmap != null) {
            return bitmapCreateBitmap;
        }
        throw new O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o();
    }
}
