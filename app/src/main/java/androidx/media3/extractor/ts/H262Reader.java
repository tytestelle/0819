package androidx.media3.extractor.ts;

import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class H262Reader implements ElementaryStreamReader {
    private static final double[] FRAME_RATE_VALUES = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private static final int START_EXTENSION = 181;
    private static final int START_GROUP = 184;
    private static final int START_PICTURE = 0;
    private static final int START_SEQUENCE_HEADER = 179;
    private static final int START_USER_DATA = 178;
    private final String containerMimeType;
    private final CsdBuffer csdBuffer;
    private String formatId;
    private long frameDurationUs;
    private boolean hasOutputFormat;
    private TrackOutput output;
    private long pesTimeUs;
    private final boolean[] prefixFlags;
    private boolean sampleHasPicture;
    private boolean sampleIsKeyframe;
    private long samplePosition;
    private long sampleTimeUs;
    private boolean startedFirstSample;
    private long totalBytesWritten;

    @Nullable
    private final NalUnitTargetBuffer userData;

    @Nullable
    private final ParsableByteArray userDataParsable;

    @Nullable
    private final UserDataReader userDataReader;

    public static final class CsdBuffer {
        private static final byte[] START_CODE = {0, 0, 1};
        public byte[] data;
        private boolean isFilling;
        public int length;
        public int sequenceExtensionPosition;

        public CsdBuffer(int i) {
            this.data = new byte[i];
        }

        public void onData(byte[] bArr, int i, int i2) {
            if (this.isFilling) {
                int i3 = i2 - i;
                byte[] bArr2 = this.data;
                int length = bArr2.length;
                int i4 = this.length;
                if (length < i4 + i3) {
                    this.data = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.data, this.length, i3);
                this.length += i3;
            }
        }

        public boolean onStartCode(int i, int i2) {
            if (this.isFilling) {
                int i3 = this.length - i2;
                this.length = i3;
                if (this.sequenceExtensionPosition != 0 || i != H262Reader.START_EXTENSION) {
                    this.isFilling = false;
                    return true;
                }
                this.sequenceExtensionPosition = i3;
            } else if (i == H262Reader.START_SEQUENCE_HEADER) {
                this.isFilling = true;
            }
            byte[] bArr = START_CODE;
            onData(bArr, 0, bArr.length);
            return false;
        }

        public void reset() {
            this.isFilling = false;
            this.length = 0;
            this.sequenceExtensionPosition = 0;
        }
    }

    public H262Reader(String str) {
        this(null, str);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0078  */
    /* JADX WARN: Code duplicated, block: B:16:0x007d  */
    /* JADX WARN: Code duplicated, block: B:18:0x008c  */
    /* JADX WARN: Code duplicated, block: B:20:0x009e  */
    private static Pair<Format, Long> parseCsdBuffer(CsdBuffer csdBuffer, String str, String str2) {
        float f;
        int i;
        float f2;
        int i2;
        long j;
        double[] dArr;
        double d;
        int i3;
        int i4;
        byte[] bArrCopyOf = Arrays.copyOf(csdBuffer.data, csdBuffer.length);
        int i5 = bArrCopyOf[4] & 255;
        byte b = bArrCopyOf[5];
        int i6 = (i5 << 4) | ((b & 255) >> 4);
        int i7 = ((b & 15) << 8) | (bArrCopyOf[6] & 255);
        int i8 = (bArrCopyOf[7] & 240) >> 4;
        if (i8 == 2) {
            f = i7 * 4;
            i = i6 * 3;
        } else {
            if (i8 != 3) {
                if (i8 != 4) {
                    f2 = 1.0f;
                } else {
                    f = i7 * 121;
                    i = i6 * 100;
                }
                Format formatBuild = new Format.Builder().setId(str).setContainerMimeType(str2).setSampleMimeType(MimeTypes.VIDEO_MPEG2).setWidth(i6).setHeight(i7).setPixelWidthHeightRatio(f2).setInitializationData(Collections.singletonList(bArrCopyOf)).build();
                i2 = (bArrCopyOf[7] & 15) - 1;
                if (i2 >= 0) {
                    dArr = FRAME_RATE_VALUES;
                    if (i2 < dArr.length) {
                        d = dArr[i2];
                        byte b2 = bArrCopyOf[csdBuffer.sequenceExtensionPosition + 9];
                        i3 = (b2 & 96) >> 5;
                        i4 = b2 & 31;
                        if (i3 != i4) {
                            d *= (((double) i3) + 1.0d) / ((double) (i4 + 1));
                        }
                        j = (long) (1000000.0d / d);
                    } else {
                        j = 0;
                    }
                } else {
                    j = 0;
                }
                return Pair.create(formatBuild, Long.valueOf(j));
            }
            f = i7 * 16;
            i = i6 * 9;
        }
        f2 = f / i;
        Format formatBuild2 = new Format.Builder().setId(str).setContainerMimeType(str2).setSampleMimeType(MimeTypes.VIDEO_MPEG2).setWidth(i6).setHeight(i7).setPixelWidthHeightRatio(f2).setInitializationData(Collections.singletonList(bArrCopyOf)).build();
        i2 = (bArrCopyOf[7] & 15) - 1;
        if (i2 >= 0) {
            dArr = FRAME_RATE_VALUES;
            if (i2 < dArr.length) {
                d = dArr[i2];
                byte b3 = bArrCopyOf[csdBuffer.sequenceExtensionPosition + 9];
                i3 = (b3 & 96) >> 5;
                i4 = b3 & 31;
                if (i3 != i4) {
                    d *= (((double) i3) + 1.0d) / ((double) (i4 + 1));
                }
                j = (long) (1000000.0d / d);
            } else {
                j = 0;
            }
        } else {
            j = 0;
        }
        return Pair.create(formatBuild2, Long.valueOf(j));
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0114  */
    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void consume(ParsableByteArray parsableByteArray) {
        int i;
        Assertions.checkStateNotNull(this.output);
        int position = parsableByteArray.getPosition();
        int iLimit = parsableByteArray.limit();
        byte[] data = parsableByteArray.getData();
        this.totalBytesWritten += (long) parsableByteArray.bytesLeft();
        this.output.sampleData(parsableByteArray, parsableByteArray.bytesLeft());
        while (true) {
            int iFindNalUnit = NalUnitUtil.findNalUnit(data, position, iLimit, this.prefixFlags);
            if (iFindNalUnit == iLimit) {
                break;
            }
            int i2 = iFindNalUnit + 3;
            int i3 = parsableByteArray.getData()[i2] & 255;
            int i4 = iFindNalUnit - position;
            if (!this.hasOutputFormat) {
                if (i4 > 0) {
                    this.csdBuffer.onData(data, position, iFindNalUnit);
                }
                if (this.csdBuffer.onStartCode(i3, i4 < 0 ? -i4 : 0)) {
                    Pair<Format, Long> csdBuffer = parseCsdBuffer(this.csdBuffer, (String) Assertions.checkNotNull(this.formatId), this.containerMimeType);
                    this.output.format((Format) csdBuffer.first);
                    this.frameDurationUs = ((Long) csdBuffer.second).longValue();
                    this.hasOutputFormat = true;
                }
            }
            NalUnitTargetBuffer nalUnitTargetBuffer = this.userData;
            if (nalUnitTargetBuffer != null) {
                if (i4 > 0) {
                    nalUnitTargetBuffer.appendToNalUnit(data, position, iFindNalUnit);
                    i = 0;
                } else {
                    i = -i4;
                }
                if (this.userData.endNalUnit(i)) {
                    NalUnitTargetBuffer nalUnitTargetBuffer2 = this.userData;
                    ((ParsableByteArray) Util.castNonNull(this.userDataParsable)).reset(this.userData.nalData, NalUnitUtil.unescapeStream(nalUnitTargetBuffer2.nalData, nalUnitTargetBuffer2.nalLength));
                    ((UserDataReader) Util.castNonNull(this.userDataReader)).consume(this.sampleTimeUs, this.userDataParsable);
                }
                if (i3 == 178 && parsableByteArray.getData()[iFindNalUnit + 2] == 1) {
                    this.userData.startNalUnit(i3);
                }
            }
            if (i3 == 0 || i3 == START_SEQUENCE_HEADER) {
                int i5 = iLimit - iFindNalUnit;
                if (this.sampleHasPicture && this.hasOutputFormat) {
                    long j = this.sampleTimeUs;
                    if (j != C.TIME_UNSET) {
                        this.output.sampleMetadata(j, this.sampleIsKeyframe ? 1 : 0, ((int) (this.totalBytesWritten - this.samplePosition)) - i5, i5, null);
                    }
                }
                if (!this.startedFirstSample || this.sampleHasPicture) {
                    this.samplePosition = this.totalBytesWritten - ((long) i5);
                    long j2 = this.pesTimeUs;
                    if (j2 == C.TIME_UNSET) {
                        long j3 = this.sampleTimeUs;
                        j2 = j3 != C.TIME_UNSET ? j3 + this.frameDurationUs : -9223372036854775807L;
                    }
                    this.sampleTimeUs = j2;
                    this.sampleIsKeyframe = false;
                    this.pesTimeUs = C.TIME_UNSET;
                    this.startedFirstSample = true;
                }
                this.sampleHasPicture = i3 == 0;
            } else if (i3 == START_GROUP) {
                this.sampleIsKeyframe = true;
            }
            position = i2;
        }
        if (!this.hasOutputFormat) {
            this.csdBuffer.onData(data, position, iLimit);
        }
        NalUnitTargetBuffer nalUnitTargetBuffer3 = this.userData;
        if (nalUnitTargetBuffer3 != null) {
            nalUnitTargetBuffer3.appendToNalUnit(data, position, iLimit);
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        this.formatId = trackIdGenerator.getFormatId();
        this.output = extractorOutput.track(trackIdGenerator.getTrackId(), 2);
        UserDataReader userDataReader = this.userDataReader;
        if (userDataReader != null) {
            userDataReader.createTracks(extractorOutput, trackIdGenerator);
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void packetFinished(boolean z) {
        Assertions.checkStateNotNull(this.output);
        if (z) {
            boolean z2 = this.sampleIsKeyframe;
            this.output.sampleMetadata(this.sampleTimeUs, z2 ? 1 : 0, (int) (this.totalBytesWritten - this.samplePosition), 0, null);
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void packetStarted(long j, int i) {
        this.pesTimeUs = j;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void seek() {
        NalUnitUtil.clearPrefixFlags(this.prefixFlags);
        this.csdBuffer.reset();
        NalUnitTargetBuffer nalUnitTargetBuffer = this.userData;
        if (nalUnitTargetBuffer != null) {
            nalUnitTargetBuffer.reset();
        }
        this.totalBytesWritten = 0L;
        this.startedFirstSample = false;
        this.pesTimeUs = C.TIME_UNSET;
        this.sampleTimeUs = C.TIME_UNSET;
    }

    public H262Reader(@Nullable UserDataReader userDataReader, String str) {
        this.userDataReader = userDataReader;
        this.containerMimeType = str;
        this.prefixFlags = new boolean[4];
        this.csdBuffer = new CsdBuffer(128);
        if (userDataReader != null) {
            this.userData = new NalUnitTargetBuffer(178, 128);
            this.userDataParsable = new ParsableByteArray();
        } else {
            this.userData = null;
            this.userDataParsable = null;
        }
        this.pesTimeUs = C.TIME_UNSET;
        this.sampleTimeUs = C.TIME_UNSET;
    }
}
