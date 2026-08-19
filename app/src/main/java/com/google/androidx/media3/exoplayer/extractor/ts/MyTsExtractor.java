package com.google.androidx.media3.exoplayer.extractor.ts;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.ts.DefaultTsPayloadReaderFactory;
import androidx.media3.extractor.ts.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import androidx.media3.extractor.ts.SectionPayloadReader;
import androidx.media3.extractor.ts.SectionReader;
import androidx.media3.extractor.ts.TsPayloadReader;
import androidx.media3.extractor.ts.TsUtil;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class MyTsExtractor implements Extractor {
    private static final long AC3_FORMAT_IDENTIFIER = 1094921523;
    private static final long AC4_FORMAT_IDENTIFIER = 1094921524;
    private static final int BUFFER_SIZE = 9400;
    public static final int DEFAULT_TIMESTAMP_SEARCH_BYTES = 112800;
    private static final long E_AC3_FORMAT_IDENTIFIER = 1161904947;
    public static final ExtractorsFactory FACTORY = new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(5);
    private static final long HEVC_FORMAT_IDENTIFIER = 1212503619;
    private static final int MAX_PID_PLUS_ONE = 8192;
    public static final int MODE_HLS = 2;
    public static final int MODE_MULTI_PMT = 0;
    public static final int MODE_SINGLE_PMT = 1;
    private static final int SNIFF_TS_PACKET_COUNT = 5;
    public static final int TS_PACKET_SIZE = 188;
    private static final int TS_PAT_PID = 0;
    public static final int TS_STREAM_TYPE_AAC_ADTS = 15;
    public static final int TS_STREAM_TYPE_AAC_LATM = 17;
    public static final int TS_STREAM_TYPE_AC3 = 129;
    public static final int TS_STREAM_TYPE_AC4 = 172;
    public static final int TS_STREAM_TYPE_AIT = 257;
    public static final int TS_STREAM_TYPE_DC2_H262 = 128;
    public static final int TS_STREAM_TYPE_DTS = 138;
    public static final int TS_STREAM_TYPE_DVBSUBS = 89;
    public static final int TS_STREAM_TYPE_E_AC3 = 135;
    public static final int TS_STREAM_TYPE_H262 = 2;
    public static final int TS_STREAM_TYPE_H263 = 16;
    public static final int TS_STREAM_TYPE_H264 = 27;
    public static final int TS_STREAM_TYPE_H265 = 36;
    public static final int TS_STREAM_TYPE_HDMV_DTS = 130;
    public static final int TS_STREAM_TYPE_ID3 = 21;
    public static final int TS_STREAM_TYPE_MPA = 3;
    public static final int TS_STREAM_TYPE_MPA_LSF = 4;
    public static final int TS_STREAM_TYPE_SPLICE_INFO = 134;
    public static final int TS_SYNC_BYTE = 71;
    private int bytesSinceLastSync;
    private final SparseIntArray continuityCounters;
    private final TsDurationReader durationReader;
    private boolean hasOutputSeekMap;

    @Nullable
    private TsPayloadReader id3Reader;
    private final int mode;
    private ExtractorOutput output;
    private final TsPayloadReader.Factory payloadReaderFactory;
    private int pcrPid;
    private boolean pendingSeekToStart;
    private int remainingPmts;
    private final List<TimestampAdjuster> timestampAdjusters;
    private final int timestampSearchBytes;
    private final SparseBooleanArray trackIds;
    private final SparseBooleanArray trackPids;
    private boolean tracksEnded;
    private TsBinarySearchSeeker tsBinarySearchSeeker;
    private final ParsableByteArray tsPacketBuffer;
    private final SparseArray<TsPayloadReader> tsPayloadReaders;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    public class PatReader implements SectionPayloadReader {
        private final ParsableBitArray patScratch = new ParsableBitArray(new byte[4]);

        public PatReader() {
        }

        @Override // androidx.media3.extractor.ts.SectionPayloadReader
        public void consume(ParsableByteArray parsableByteArray) {
            if (parsableByteArray.readUnsignedByte() == 0 && (parsableByteArray.readUnsignedByte() & 128) != 0) {
                parsableByteArray.skipBytes(6);
                int iBytesLeft = parsableByteArray.bytesLeft() / 4;
                for (int i = 0; i < iBytesLeft; i++) {
                    parsableByteArray.readBytes(this.patScratch, 4);
                    int bits = this.patScratch.readBits(16);
                    this.patScratch.skipBits(3);
                    if (bits == 0) {
                        this.patScratch.skipBits(13);
                    } else {
                        int bits2 = this.patScratch.readBits(13);
                        if (MyTsExtractor.this.tsPayloadReaders.get(bits2) == null) {
                            MyTsExtractor.this.tsPayloadReaders.put(bits2, new SectionReader(MyTsExtractor.this.new PmtReader(bits2)));
                            MyTsExtractor.this.remainingPmts++;
                        }
                    }
                }
                if (MyTsExtractor.this.mode != 2) {
                    MyTsExtractor.this.tsPayloadReaders.remove(0);
                }
            }
        }

        @Override // androidx.media3.extractor.ts.SectionPayloadReader
        public void init(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        }
    }

    public class PmtReader implements SectionPayloadReader {
        private static final int TS_PMT_DESC_AC3 = 106;
        private static final int TS_PMT_DESC_AIT = 111;
        private static final int TS_PMT_DESC_DTS = 123;
        private static final int TS_PMT_DESC_DVBSUBS = 89;
        private static final int TS_PMT_DESC_DVB_EXT = 127;
        private static final int TS_PMT_DESC_DVB_EXT_AC4 = 21;
        private static final int TS_PMT_DESC_EAC3 = 122;
        private static final int TS_PMT_DESC_ISO639_LANG = 10;
        private static final int TS_PMT_DESC_REGISTRATION = 5;
        private final int pid;
        private final ParsableBitArray pmtScratch = new ParsableBitArray(new byte[5]);
        private final SparseArray<TsPayloadReader> trackIdToReaderScratch = new SparseArray<>();
        private final SparseIntArray trackIdToPidScratch = new SparseIntArray();

        public PmtReader(int i) {
            this.pid = i;
        }

        /* JADX WARN: Code duplicated, block: B:18:0x004a  */
        /* JADX WARN: Code duplicated, block: B:24:0x005d  */
        /* JADX WARN: Code duplicated, block: B:27:0x0065  */
        private TsPayloadReader.EsInfo readEsInfo(ParsableByteArray parsableByteArray, int i) {
            int position = parsableByteArray.getPosition();
            int i2 = position + i;
            String str = null;
            ArrayList arrayList = null;
            int i3 = -1;
            int unsignedByte = 0;
            while (parsableByteArray.getPosition() < i2) {
                int unsignedByte2 = parsableByteArray.readUnsignedByte();
                int position2 = parsableByteArray.getPosition() + parsableByteArray.readUnsignedByte();
                if (position2 > i2) {
                    break;
                }
                if (unsignedByte2 == 5) {
                    long unsignedInt = parsableByteArray.readUnsignedInt();
                    if (unsignedInt == MyTsExtractor.AC3_FORMAT_IDENTIFIER) {
                        i3 = 129;
                    } else if (unsignedInt == MyTsExtractor.E_AC3_FORMAT_IDENTIFIER) {
                        i3 = 135;
                    } else if (unsignedInt == MyTsExtractor.AC4_FORMAT_IDENTIFIER) {
                        i3 = 172;
                    } else if (unsignedInt == MyTsExtractor.HEVC_FORMAT_IDENTIFIER) {
                        i3 = 36;
                    }
                } else if (unsignedByte2 == 106) {
                    i3 = 129;
                } else if (unsignedByte2 == 122) {
                    i3 = 135;
                } else if (unsignedByte2 == 127) {
                    if (parsableByteArray.readUnsignedByte() == 21) {
                        i3 = 172;
                    }
                } else if (unsignedByte2 == 123) {
                    i3 = 138;
                } else if (unsignedByte2 == 10) {
                    String strTrim = parsableByteArray.readString(3).trim();
                    unsignedByte = parsableByteArray.readUnsignedByte();
                    str = strTrim;
                } else if (unsignedByte2 == 89) {
                    ArrayList arrayList2 = new ArrayList();
                    while (parsableByteArray.getPosition() < position2) {
                        String strTrim2 = parsableByteArray.readString(3).trim();
                        int unsignedByte3 = parsableByteArray.readUnsignedByte();
                        byte[] bArr = new byte[4];
                        parsableByteArray.readBytes(bArr, 0, 4);
                        arrayList2.add(new TsPayloadReader.DvbSubtitleInfo(strTrim2, unsignedByte3, bArr));
                    }
                    arrayList = arrayList2;
                    i3 = 89;
                } else if (unsignedByte2 == 111) {
                    i3 = 257;
                }
                parsableByteArray.skipBytes(position2 - parsableByteArray.getPosition());
            }
            parsableByteArray.setPosition(i2);
            return new TsPayloadReader.EsInfo(i3, str, unsignedByte, arrayList, Arrays.copyOfRange(parsableByteArray.getData(), position, i2));
        }

        @Override // androidx.media3.extractor.ts.SectionPayloadReader
        public void consume(ParsableByteArray parsableByteArray) {
            TimestampAdjuster timestampAdjuster;
            if (parsableByteArray.readUnsignedByte() != 2) {
                return;
            }
            if (MyTsExtractor.this.mode == 1 || MyTsExtractor.this.mode == 2 || MyTsExtractor.this.remainingPmts == 1) {
                timestampAdjuster = (TimestampAdjuster) MyTsExtractor.this.timestampAdjusters.get(0);
            } else {
                timestampAdjuster = new TimestampAdjuster(((TimestampAdjuster) MyTsExtractor.this.timestampAdjusters.get(0)).getFirstSampleTimestampUs());
                MyTsExtractor.this.timestampAdjusters.add(timestampAdjuster);
            }
            if ((parsableByteArray.readUnsignedByte() & 128) == 0) {
                return;
            }
            parsableByteArray.skipBytes(1);
            int unsignedShort = parsableByteArray.readUnsignedShort();
            int i = 3;
            parsableByteArray.skipBytes(3);
            parsableByteArray.readBytes(this.pmtScratch, 2);
            this.pmtScratch.skipBits(3);
            int i2 = 13;
            MyTsExtractor.this.pcrPid = this.pmtScratch.readBits(13);
            parsableByteArray.readBytes(this.pmtScratch, 2);
            int i3 = 4;
            this.pmtScratch.skipBits(4);
            parsableByteArray.skipBytes(this.pmtScratch.readBits(12));
            if (MyTsExtractor.this.mode == 2 && MyTsExtractor.this.id3Reader == null) {
                TsPayloadReader.EsInfo esInfo = new TsPayloadReader.EsInfo(21, null, 0, null, Util.EMPTY_BYTE_ARRAY);
                MyTsExtractor myTsExtractor = MyTsExtractor.this;
                myTsExtractor.id3Reader = myTsExtractor.payloadReaderFactory.createPayloadReader(21, esInfo);
                if (MyTsExtractor.this.id3Reader != null) {
                    MyTsExtractor.this.id3Reader.init(timestampAdjuster, MyTsExtractor.this.output, new TsPayloadReader.TrackIdGenerator(unsignedShort, 21, 8192));
                }
            }
            this.trackIdToReaderScratch.clear();
            this.trackIdToPidScratch.clear();
            int iBytesLeft = parsableByteArray.bytesLeft();
            while (iBytesLeft > 0) {
                parsableByteArray.readBytes(this.pmtScratch, 5);
                int bits = this.pmtScratch.readBits(8);
                this.pmtScratch.skipBits(i);
                int bits2 = this.pmtScratch.readBits(i2);
                this.pmtScratch.skipBits(i3);
                int bits3 = this.pmtScratch.readBits(12);
                TsPayloadReader.EsInfo esInfo2 = readEsInfo(parsableByteArray, bits3);
                if (bits == 6 || bits == 5) {
                    bits = esInfo2.streamType;
                }
                iBytesLeft -= bits3 + 5;
                int i4 = MyTsExtractor.this.mode == 2 ? bits : bits2;
                if (!MyTsExtractor.this.trackIds.get(i4)) {
                    TsPayloadReader tsPayloadReaderCreatePayloadReader = (MyTsExtractor.this.mode == 2 && bits == 21) ? MyTsExtractor.this.id3Reader : MyTsExtractor.this.payloadReaderFactory.createPayloadReader(bits, esInfo2);
                    if (MyTsExtractor.this.mode != 2 || bits2 < this.trackIdToPidScratch.get(i4, 8192)) {
                        this.trackIdToPidScratch.put(i4, bits2);
                        this.trackIdToReaderScratch.put(i4, tsPayloadReaderCreatePayloadReader);
                    }
                }
                i = 3;
                i3 = 4;
                i2 = 13;
            }
            int size = this.trackIdToPidScratch.size();
            for (int i5 = 0; i5 < size; i5++) {
                int iKeyAt = this.trackIdToPidScratch.keyAt(i5);
                int iValueAt = this.trackIdToPidScratch.valueAt(i5);
                MyTsExtractor.this.trackIds.put(iKeyAt, true);
                MyTsExtractor.this.trackPids.put(iValueAt, true);
                TsPayloadReader tsPayloadReaderValueAt = this.trackIdToReaderScratch.valueAt(i5);
                if (tsPayloadReaderValueAt != null) {
                    if (tsPayloadReaderValueAt != MyTsExtractor.this.id3Reader) {
                        tsPayloadReaderValueAt.init(timestampAdjuster, MyTsExtractor.this.output, new TsPayloadReader.TrackIdGenerator(unsignedShort, iKeyAt, 8192));
                    }
                    MyTsExtractor.this.tsPayloadReaders.put(iValueAt, tsPayloadReaderValueAt);
                }
            }
            if (MyTsExtractor.this.mode == 2) {
                if (MyTsExtractor.this.tracksEnded) {
                    return;
                }
                MyTsExtractor.this.output.endTracks();
                MyTsExtractor.this.remainingPmts = 0;
                MyTsExtractor.this.tracksEnded = true;
                return;
            }
            MyTsExtractor.this.tsPayloadReaders.remove(this.pid);
            MyTsExtractor myTsExtractor2 = MyTsExtractor.this;
            myTsExtractor2.remainingPmts = myTsExtractor2.mode == 1 ? 0 : MyTsExtractor.this.remainingPmts - 1;
            if (MyTsExtractor.this.remainingPmts == 0) {
                MyTsExtractor.this.output.endTracks();
                MyTsExtractor.this.tracksEnded = true;
            }
        }

        @Override // androidx.media3.extractor.ts.SectionPayloadReader
        public void init(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        }
    }

    public MyTsExtractor() {
        this(0);
    }

    private boolean fillBufferWithAtLeastOnePacket(ExtractorInput extractorInput) {
        byte[] data = this.tsPacketBuffer.getData();
        if (9400 - this.tsPacketBuffer.getPosition() < 188) {
            int iBytesLeft = this.tsPacketBuffer.bytesLeft();
            if (iBytesLeft > 0) {
                System.arraycopy(data, this.tsPacketBuffer.getPosition(), data, 0, iBytesLeft);
            }
            this.tsPacketBuffer.reset(data, iBytesLeft);
        }
        while (this.tsPacketBuffer.bytesLeft() < 188) {
            int iLimit = this.tsPacketBuffer.limit();
            int i = extractorInput.read(data, iLimit, 9400 - iLimit);
            if (i == -1) {
                return false;
            }
            this.tsPacketBuffer.setLimit(iLimit + i);
        }
        return true;
    }

    private int findEndOfFirstTsPacketInBuffer() throws ParserException {
        int position = this.tsPacketBuffer.getPosition();
        int iLimit = this.tsPacketBuffer.limit();
        int iFindSyncBytePosition = TsUtil.findSyncBytePosition(this.tsPacketBuffer.getData(), position, iLimit);
        this.tsPacketBuffer.setPosition(iFindSyncBytePosition);
        int i = iFindSyncBytePosition + 188;
        if (i > iLimit) {
            int i2 = (iFindSyncBytePosition - position) + this.bytesSinceLastSync;
            this.bytesSinceLastSync = i2;
            if (this.mode == 2 && i2 > 376) {
                throw ParserException.createForMalformedContainer("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            this.bytesSinceLastSync = 0;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Extractor[] lambda$static$0() {
        return new Extractor[]{new MyTsExtractor()};
    }

    private void maybeOutputSeekMap(long j) {
        if (this.hasOutputSeekMap) {
            return;
        }
        this.hasOutputSeekMap = true;
        if (this.durationReader.getDurationUs() == C.TIME_UNSET) {
            this.output.seekMap(new SeekMap.Unseekable(this.durationReader.getDurationUs()));
            return;
        }
        TsBinarySearchSeeker tsBinarySearchSeeker = new TsBinarySearchSeeker(this.durationReader.getPcrTimestampAdjuster(), this.durationReader.getDurationUs(), j, this.pcrPid, this.timestampSearchBytes);
        this.tsBinarySearchSeeker = tsBinarySearchSeeker;
        this.output.seekMap(tsBinarySearchSeeker.getSeekMap());
    }

    private void resetPayloadReaders() {
        this.trackIds.clear();
        this.tsPayloadReaders.clear();
        SparseArray<TsPayloadReader> sparseArrayCreateInitialPayloadReaders = this.payloadReaderFactory.createInitialPayloadReaders();
        int size = sparseArrayCreateInitialPayloadReaders.size();
        for (int i = 0; i < size; i++) {
            this.tsPayloadReaders.put(sparseArrayCreateInitialPayloadReaders.keyAt(i), sparseArrayCreateInitialPayloadReaders.valueAt(i));
        }
        this.tsPayloadReaders.put(0, new SectionReader(new PatReader()));
        this.id3Reader = null;
    }

    private boolean shouldConsumePacketPayload(int i) {
        return this.mode == 2 || this.tracksEnded || !this.trackPids.get(i, false);
    }

    @Override // androidx.media3.extractor.Extractor
    public final /* synthetic */ List getSniffFailureDetails() {
        return O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this);
    }

    @Override // androidx.media3.extractor.Extractor
    public final /* synthetic */ Extractor getUnderlyingImplementation() {
        return O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this);
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.output = extractorOutput;
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws ParserException {
        long length = extractorInput.getLength();
        if (this.tracksEnded) {
            if (length != -1 && this.mode != 2 && !this.durationReader.isDurationReadFinished()) {
                return this.durationReader.readDuration(extractorInput, positionHolder, this.pcrPid);
            }
            maybeOutputSeekMap(length);
            if (this.pendingSeekToStart) {
                this.pendingSeekToStart = false;
                seek(0L, 0L);
                if (extractorInput.getPosition() != 0) {
                    positionHolder.position = 0L;
                    return 1;
                }
            }
            TsBinarySearchSeeker tsBinarySearchSeeker = this.tsBinarySearchSeeker;
            if (tsBinarySearchSeeker != null && tsBinarySearchSeeker.isSeeking()) {
                return this.tsBinarySearchSeeker.handlePendingSeek(extractorInput, positionHolder);
            }
        }
        if (!fillBufferWithAtLeastOnePacket(extractorInput)) {
            return -1;
        }
        int iFindEndOfFirstTsPacketInBuffer = findEndOfFirstTsPacketInBuffer();
        int iLimit = this.tsPacketBuffer.limit();
        if (iFindEndOfFirstTsPacketInBuffer > iLimit) {
            return 0;
        }
        int i = this.tsPacketBuffer.readInt();
        if ((8388608 & i) != 0) {
            this.tsPacketBuffer.setPosition(iFindEndOfFirstTsPacketInBuffer);
            return 0;
        }
        int i2 = (4194304 & i) != 0 ? 1 : 0;
        int i3 = (2096896 & i) >> 8;
        boolean z = (i & 32) != 0;
        TsPayloadReader tsPayloadReader = (i & 16) != 0 ? this.tsPayloadReaders.get(i3) : null;
        if (tsPayloadReader == null) {
            this.tsPacketBuffer.setPosition(iFindEndOfFirstTsPacketInBuffer);
            return 0;
        }
        if (this.mode != 2) {
            int i4 = i & 15;
            int i5 = this.continuityCounters.get(i3, i4 - 1);
            this.continuityCounters.put(i3, i4);
            if (i5 == i4) {
                this.tsPacketBuffer.setPosition(iFindEndOfFirstTsPacketInBuffer);
                return 0;
            }
            if (i4 != ((i5 + 1) & 15)) {
                tsPayloadReader.seek();
            }
        }
        if (z) {
            int unsignedByte = this.tsPacketBuffer.readUnsignedByte();
            i2 |= (this.tsPacketBuffer.readUnsignedByte() & 64) != 0 ? 2 : 0;
            this.tsPacketBuffer.skipBytes(unsignedByte - 1);
        }
        boolean z2 = this.tracksEnded;
        if (shouldConsumePacketPayload(i3)) {
            this.tsPacketBuffer.setLimit(iFindEndOfFirstTsPacketInBuffer);
            tsPayloadReader.consume(this.tsPacketBuffer, i2);
            this.tsPacketBuffer.setLimit(iLimit);
        }
        if (this.mode != 2 && !z2 && this.tracksEnded && length != -1) {
            this.pendingSeekToStart = true;
        }
        this.tsPacketBuffer.setPosition(iFindEndOfFirstTsPacketInBuffer);
        return 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j, long j2) {
        TsBinarySearchSeeker tsBinarySearchSeeker;
        Assertions.checkState(this.mode != 2);
        int size = this.timestampAdjusters.size();
        for (int i = 0; i < size; i++) {
            TimestampAdjuster timestampAdjuster = this.timestampAdjusters.get(i);
            boolean z = timestampAdjuster.getTimestampOffsetUs() == C.TIME_UNSET;
            if (!z) {
                long firstSampleTimestampUs = timestampAdjuster.getFirstSampleTimestampUs();
                z = (firstSampleTimestampUs == C.TIME_UNSET || firstSampleTimestampUs == 0 || firstSampleTimestampUs == j2) ? false : true;
            }
            if (z) {
                timestampAdjuster.reset(j2);
            }
        }
        if (j2 != 0 && (tsBinarySearchSeeker = this.tsBinarySearchSeeker) != null) {
            tsBinarySearchSeeker.setSeekTargetUs(j2);
        }
        this.tsPacketBuffer.reset(0);
        this.continuityCounters.clear();
        for (int i2 = 0; i2 < this.tsPayloadReaders.size(); i2++) {
            this.tsPayloadReaders.valueAt(i2).seek();
        }
        this.bytesSinceLastSync = 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) {
        byte[] data = this.tsPacketBuffer.getData();
        extractorInput.peekFully(data, 0, 376);
        for (int i = 0; i < 376; i++) {
            if (data[i] == 71 && data[i + 1] == 64) {
                if (i <= 0) {
                    break;
                }
                extractorInput.skipFully(i);
                break;
            }
        }
        extractorInput.peekFully(data, 0, 940);
        for (int i2 = 0; i2 < 188; i2++) {
            int i3 = 0;
            while (true) {
                if (i3 >= 5) {
                    extractorInput.skipFully(i2);
                    return true;
                }
                if (data[(i3 * 188) + i2] != 71) {
                    break;
                }
                i3++;
            }
        }
        return false;
    }

    public MyTsExtractor(int i) {
        this(1, i, 112800);
    }

    public MyTsExtractor(int i, int i2, int i3) {
        this(i, new TimestampAdjuster(0L), new DefaultTsPayloadReaderFactory(i2), i3);
    }

    public MyTsExtractor(int i, TimestampAdjuster timestampAdjuster, TsPayloadReader.Factory factory) {
        this(i, timestampAdjuster, factory, 112800);
    }

    public MyTsExtractor(int i, TimestampAdjuster timestampAdjuster, TsPayloadReader.Factory factory, int i2) {
        this.payloadReaderFactory = (TsPayloadReader.Factory) Assertions.checkNotNull(factory);
        this.timestampSearchBytes = i2;
        this.mode = i;
        if (i != 1 && i != 2) {
            ArrayList arrayList = new ArrayList();
            this.timestampAdjusters = arrayList;
            arrayList.add(timestampAdjuster);
        } else {
            this.timestampAdjusters = Collections.singletonList(timestampAdjuster);
        }
        this.tsPacketBuffer = new ParsableByteArray(new byte[BUFFER_SIZE], 0);
        this.trackIds = new SparseBooleanArray();
        this.trackPids = new SparseBooleanArray();
        this.tsPayloadReaders = new SparseArray<>();
        this.continuityCounters = new SparseIntArray();
        this.durationReader = new TsDurationReader(i2);
        this.output = ExtractorOutput.PLACEHOLDER;
        this.pcrPid = -1;
        resetPayloadReaders();
    }
}
