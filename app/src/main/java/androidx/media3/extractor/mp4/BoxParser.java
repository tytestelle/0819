package androidx.media3.extractor.mp4;

import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.media3.common.C;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.container.DolbyVisionConfig;
import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.container.Mp4AlternateGroupData;
import androidx.media3.container.Mp4Box;
import androidx.media3.container.Mp4LocationData;
import androidx.media3.container.Mp4TimestampData;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.Ac3Util;
import androidx.media3.extractor.Ac4Util;
import androidx.media3.extractor.AvcConfig;
import androidx.media3.extractor.ExtractorUtil;
import androidx.media3.extractor.GaplessInfoHolder;
import androidx.media3.extractor.HevcConfig;
import androidx.media3.extractor.OpusUtil;
import androidx.media3.extractor.VorbisUtil;
import com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
import com.google.common.base.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
import com.google.common.base.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
import com.google.common.collect.O0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO;
import com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class BoxParser {
    private static final int MAX_GAPLESS_TRIM_SIZE_SAMPLES = 4;
    private static final int SAMPLE_RATE_AMR_NB = 8000;
    private static final int SAMPLE_RATE_AMR_WB = 16000;
    private static final String TAG = "BoxParsers";
    private static final int TYPE_clcp = 1668047728;
    private static final int TYPE_mdta = 1835299937;
    private static final int TYPE_meta = 1835365473;
    private static final int TYPE_nclc = 1852009571;
    private static final int TYPE_nclx = 1852009592;
    private static final int TYPE_sbtl = 1935832172;
    private static final int TYPE_soun = 1936684398;
    private static final int TYPE_subp = 1937072752;
    private static final int TYPE_subt = 1937072756;
    private static final int TYPE_text = 1952807028;
    private static final int TYPE_vide = 1986618469;
    private static final byte[] opusMagic = Util.getUtf8Bytes("OpusHead");

    public static final class BtrtData {
        private final long avgBitrate;
        private final long maxBitrate;

        public BtrtData(long j, long j2) {
            this.avgBitrate = j;
            this.maxBitrate = j2;
        }
    }

    public static final class ChunkIterator {
        private final ParsableByteArray chunkOffsets;
        private final boolean chunkOffsetsAreLongs;
        public int index;
        public final int length;
        private int nextSamplesPerChunkChangeIndex;
        public int numSamples;
        public long offset;
        private int remainingSamplesPerChunkChanges;
        private final ParsableByteArray stsc;

        public ChunkIterator(ParsableByteArray parsableByteArray, ParsableByteArray parsableByteArray2, boolean z) throws ParserException {
            this.stsc = parsableByteArray;
            this.chunkOffsets = parsableByteArray2;
            this.chunkOffsetsAreLongs = z;
            parsableByteArray2.setPosition(12);
            this.length = parsableByteArray2.readUnsignedIntToInt();
            parsableByteArray.setPosition(12);
            this.remainingSamplesPerChunkChanges = parsableByteArray.readUnsignedIntToInt();
            ExtractorUtil.checkContainerInput(parsableByteArray.readInt() == 1, "first_chunk must be 1");
            this.index = -1;
        }

        public boolean moveNext() {
            int i = this.index + 1;
            this.index = i;
            if (i == this.length) {
                return false;
            }
            this.offset = this.chunkOffsetsAreLongs ? this.chunkOffsets.readUnsignedLongToLong() : this.chunkOffsets.readUnsignedInt();
            if (this.index == this.nextSamplesPerChunkChangeIndex) {
                this.numSamples = this.stsc.readUnsignedIntToInt();
                this.stsc.skipBytes(4);
                int i2 = this.remainingSamplesPerChunkChanges - 1;
                this.remainingSamplesPerChunkChanges = i2;
                this.nextSamplesPerChunkChangeIndex = i2 > 0 ? this.stsc.readUnsignedIntToInt() - 1 : -1;
            }
            return true;
        }
    }

    public static final class EsdsData {
        private final long bitrate;
        private final byte[] initializationData;
        private final String mimeType;
        private final long peakBitrate;

        public EsdsData(String str, byte[] bArr, long j, long j2) {
            this.mimeType = str;
            this.initializationData = bArr;
            this.bitrate = j;
            this.peakBitrate = j2;
        }
    }

    public static final class EyesData {
        private final StriData striData;

        public EyesData(StriData striData) {
            this.striData = striData;
        }
    }

    public static final class MdhdData {

        @Nullable
        private final String language;
        private final long mediaDurationUs;
        private final long timescale;

        public MdhdData(long j, long j2, @Nullable String str) {
            this.timescale = j;
            this.mediaDurationUs = j2;
            this.language = str;
        }
    }

    public interface SampleSizeBox {
        int getFixedSampleSize();

        int getSampleCount();

        int readNextSampleSize();
    }

    public static final class StriData {
        private final boolean eyeViewsReversed;
        private final boolean hasLeftEyeView;
        private final boolean hasRightEyeView;

        public StriData(boolean z, boolean z2, boolean z3) {
            this.hasLeftEyeView = z;
            this.hasRightEyeView = z2;
            this.eyeViewsReversed = z3;
        }
    }

    public static final class StsdData {
        public static final int STSD_HEADER_SIZE = 8;

        @Nullable
        public Format format;
        public int nalUnitLengthFieldLength;
        public int requiredSampleTransformation = 0;
        public final TrackEncryptionBox[] trackEncryptionBoxes;

        public StsdData(int i) {
            this.trackEncryptionBoxes = new TrackEncryptionBox[i];
        }
    }

    public static final class StszSampleSizeBox implements SampleSizeBox {
        private final ParsableByteArray data;
        private final int fixedSampleSize;
        private final int sampleCount;

        public StszSampleSizeBox(Mp4Box.LeafBox leafBox, Format format) {
            ParsableByteArray parsableByteArray = leafBox.data;
            this.data = parsableByteArray;
            parsableByteArray.setPosition(12);
            int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
            if (MimeTypes.AUDIO_RAW.equals(format.sampleMimeType)) {
                int pcmFrameSize = Util.getPcmFrameSize(format.pcmEncoding, format.channelCount);
                if (unsignedIntToInt == 0 || unsignedIntToInt % pcmFrameSize != 0) {
                    Log.w(BoxParser.TAG, "Audio sample size mismatch. stsd sample size: " + pcmFrameSize + ", stsz sample size: " + unsignedIntToInt);
                    unsignedIntToInt = pcmFrameSize;
                }
            }
            this.fixedSampleSize = unsignedIntToInt == 0 ? -1 : unsignedIntToInt;
            this.sampleCount = parsableByteArray.readUnsignedIntToInt();
        }

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
        public int getFixedSampleSize() {
            return this.fixedSampleSize;
        }

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
        public int getSampleCount() {
            return this.sampleCount;
        }

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
        public int readNextSampleSize() {
            int i = this.fixedSampleSize;
            return i == -1 ? this.data.readUnsignedIntToInt() : i;
        }
    }

    public static final class Stz2SampleSizeBox implements SampleSizeBox {
        private int currentByte;
        private final ParsableByteArray data;
        private final int fieldSize;
        private final int sampleCount;
        private int sampleIndex;

        public Stz2SampleSizeBox(Mp4Box.LeafBox leafBox) {
            ParsableByteArray parsableByteArray = leafBox.data;
            this.data = parsableByteArray;
            parsableByteArray.setPosition(12);
            this.fieldSize = parsableByteArray.readUnsignedIntToInt() & 255;
            this.sampleCount = parsableByteArray.readUnsignedIntToInt();
        }

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
        public int getFixedSampleSize() {
            return -1;
        }

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
        public int getSampleCount() {
            return this.sampleCount;
        }

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
        public int readNextSampleSize() {
            int i = this.fieldSize;
            if (i == 8) {
                return this.data.readUnsignedByte();
            }
            if (i == 16) {
                return this.data.readUnsignedShort();
            }
            int i2 = this.sampleIndex;
            this.sampleIndex = i2 + 1;
            if (i2 % 2 != 0) {
                return this.currentByte & 15;
            }
            int unsignedByte = this.data.readUnsignedByte();
            this.currentByte = unsignedByte;
            return (unsignedByte & 240) >> 4;
        }
    }

    public static final class TkhdData {
        private final int alternateGroup;
        private final long duration;
        private final int height;
        private final int id;
        private final int rotationDegrees;
        private final int width;

        public TkhdData(int i, long j, int i2, int i3, int i4, int i5) {
            this.id = i;
            this.duration = j;
            this.alternateGroup = i2;
            this.rotationDegrees = i3;
            this.width = i4;
            this.height = i5;
        }
    }

    public static final class VexuData {

        @Nullable
        private final EyesData eyesData;

        public VexuData(EyesData eyesData) {
            this.eyesData = eyesData;
        }

        public boolean hasBothEyeViews() {
            EyesData eyesData = this.eyesData;
            return eyesData != null && eyesData.striData.hasLeftEyeView && this.eyesData.striData.hasRightEyeView;
        }
    }

    private BoxParser() {
    }

    private static ByteBuffer allocateHdrStaticInfo() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static boolean canApplyEditWithGaplessInfo(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length - 1;
        return jArr[0] <= j2 && j2 < jArr[Util.constrainValue(4, 0, length)] && jArr[Util.constrainValue(jArr.length - 4, 0, length)] < j3 && j3 <= j;
    }

    private static int findBoxPosition(ParsableByteArray parsableByteArray, int i, int i2, int i3) throws ParserException {
        int position = parsableByteArray.getPosition();
        ExtractorUtil.checkContainerInput(position >= i2, null);
        while (position - i2 < i3) {
            parsableByteArray.setPosition(position);
            int i4 = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(i4 > 0, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == i) {
                return position;
            }
            position += i4;
        }
        return -1;
    }

    private static String formatVobsubIdx(byte[] bArr, int i, int i2) {
        Assertions.checkState(bArr.length == 64);
        ArrayList arrayList = new ArrayList(16);
        for (int i3 = 0; i3 < bArr.length - 3; i3 += 4) {
            arrayList.add(String.format("%06x", Integer.valueOf(vobsubYuvToRgb(O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(bArr[i3], bArr[i3 + 1], bArr[i3 + 2], bArr[i3 + 3])))));
        }
        StringBuilder sbO00000OOoOOO00O00o0ooooooooO000ooooO0000 = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OOoOOO00O00o0ooooooooO000ooooO0000(i, i2, "size: ", "x", "\npalette: ");
        sbO00000OOoOOO00O00o0ooooooooO000ooooO0000.append(new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(", ").O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(arrayList));
        sbO00000OOoOOO00O00o0ooooooooO000ooooO0000.append("\n");
        return sbO00000OOoOOO00O00o0ooooooooO000ooooO0000.toString();
    }

    @Nullable
    private static String getLanguageFromCode(int i) {
        char[] cArr = {(char) (((i >> 10) & 31) + 96), (char) (((i >> 5) & 31) + 96), (char) ((i & 31) + 96)};
        for (int i2 = 0; i2 < 3; i2++) {
            char c = cArr[i2];
            if (c < 'a' || c > 'z') {
                return null;
            }
        }
        return new String(cArr);
    }

    private static int getTrackTypeForHdlr(int i) {
        if (i == TYPE_soun) {
            return 1;
        }
        if (i == TYPE_vide) {
            return 2;
        }
        if (i == TYPE_text || i == TYPE_sbtl || i == TYPE_subt || i == TYPE_clcp || i == TYPE_subp) {
            return 3;
        }
        return i == 1835365473 ? 5 : -1;
    }

    public static void maybeSkipRemainingMetaBoxHeaderBytes(ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition();
        parsableByteArray.skipBytes(4);
        if (parsableByteArray.readInt() != 1751411826) {
            position += 4;
        }
        parsableByteArray.setPosition(position);
    }

    private static ColorInfo parseApvc(ParsableByteArray parsableByteArray) {
        ColorInfo.Builder builder = new ColorInfo.Builder();
        ParsableBitArray parsableBitArray = new ParsableBitArray(parsableByteArray.getData());
        parsableBitArray.setPosition(parsableByteArray.getPosition() * 8);
        parsableBitArray.skipBytes(1);
        int bits = parsableBitArray.readBits(8);
        for (int i = 0; i < bits; i++) {
            parsableBitArray.skipBytes(1);
            int bits2 = parsableBitArray.readBits(8);
            for (int i2 = 0; i2 < bits2; i2++) {
                parsableBitArray.skipBits(6);
                boolean bit = parsableBitArray.readBit();
                parsableBitArray.skipBit();
                parsableBitArray.skipBytes(11);
                parsableBitArray.skipBits(4);
                int bits3 = parsableBitArray.readBits(4) + 8;
                builder.setLumaBitdepth(bits3);
                builder.setChromaBitdepth(bits3);
                parsableBitArray.skipBytes(1);
                if (bit) {
                    int bits4 = parsableBitArray.readBits(8);
                    int bits5 = parsableBitArray.readBits(8);
                    parsableBitArray.skipBytes(1);
                    builder.setColorSpace(ColorInfo.isoColorPrimariesToColorSpace(bits4)).setColorRange(parsableBitArray.readBit() ? 1 : 2).setColorTransfer(ColorInfo.isoTransferCharacteristicsToColorTransfer(bits5));
                }
            }
        }
        return builder.build();
    }

    /* JADX WARN: Code duplicated, block: B:204:0x03af A[PHI: r8 r9 r10 r13 r16 r23
  0x03af: PHI (r8v52 java.lang.String) = 
  (r8v50 java.lang.String)
  (r8v51 java.lang.String)
  (r8v51 java.lang.String)
  (r8v53 java.lang.String)
  (r8v50 java.lang.String)
  (r8v50 java.lang.String)
 binds: [B:241:0x04a4, B:243:0x04b2, B:246:0x04bc, B:233:0x045f, B:207:0x03bd, B:203:0x037a] A[DONT_GENERATE, DONT_INLINE]
  0x03af: PHI (r9v19 java.util.List<byte[]>) = 
  (r9v8 java.util.List<byte[]>)
  (r9v8 java.util.List<byte[]>)
  (r9v18 java.util.List<byte[]>)
  (r9v8 java.util.List<byte[]>)
  (r9v23 java.util.List<byte[]>)
  (r9v30 java.util.List<byte[]>)
 binds: [B:241:0x04a4, B:243:0x04b2, B:246:0x04bc, B:233:0x045f, B:207:0x03bd, B:203:0x037a] A[DONT_GENERATE, DONT_INLINE]
  0x03af: PHI (r10v13 int) = (r10v10 int), (r10v10 int), (r10v10 int), (r10v10 int), (r10v19 int), (r10v10 int) binds: [B:241:0x04a4, B:243:0x04b2, B:246:0x04bc, B:233:0x045f, B:207:0x03bd, B:203:0x037a] A[DONT_GENERATE, DONT_INLINE]
  0x03af: PHI (r13v12 int) = (r13v9 int), (r13v9 int), (r13v9 int), (r13v23 int), (r13v26 int), (r13v30 int) binds: [B:241:0x04a4, B:243:0x04b2, B:246:0x04bc, B:233:0x045f, B:207:0x03bd, B:203:0x037a] A[DONT_GENERATE, DONT_INLINE]
  0x03af: PHI (r16v2 int) = (r16v1 int), (r16v1 int), (r16v1 int), (r16v3 int), (r16v1 int), (r16v1 int) binds: [B:241:0x04a4, B:243:0x04b2, B:246:0x04bc, B:233:0x045f, B:207:0x03bd, B:203:0x037a] A[DONT_GENERATE, DONT_INLINE]
  0x03af: PHI (r23v3 androidx.media3.extractor.mp4.BoxParser$EsdsData) = 
  (r23v1 androidx.media3.extractor.mp4.BoxParser$EsdsData)
  (r23v2 androidx.media3.extractor.mp4.BoxParser$EsdsData)
  (r23v2 androidx.media3.extractor.mp4.BoxParser$EsdsData)
  (r23v1 androidx.media3.extractor.mp4.BoxParser$EsdsData)
  (r23v1 androidx.media3.extractor.mp4.BoxParser$EsdsData)
  (r23v1 androidx.media3.extractor.mp4.BoxParser$EsdsData)
 binds: [B:241:0x04a4, B:243:0x04b2, B:246:0x04bc, B:233:0x045f, B:207:0x03bd, B:203:0x037a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x008d  */
    /* JADX WARN: Code duplicated, block: B:92:0x015f  */
    private static void parseAudioSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, int i4, @Nullable String str, boolean z, @Nullable DrmInitData drmInitData, StsdData stsdData, int i5) throws ParserException {
        int unsignedShort;
        int i6;
        int i7;
        int i8;
        int i9;
        String str2;
        String str3;
        String strBuildIamfCodecString;
        int i10;
        int pcmEncoding;
        int i11;
        int i12;
        String str4;
        int i13;
        int iIntValue = i;
        int i14 = i2;
        int i15 = i3;
        DrmInitData drmInitDataCopyWithSchemeType = drmInitData;
        parsableByteArray.setPosition(i14 + 16);
        if (z) {
            unsignedShort = parsableByteArray.readUnsignedShort();
            parsableByteArray.skipBytes(6);
        } else {
            parsableByteArray.skipBytes(8);
            unsignedShort = 0;
        }
        if (unsignedShort == 0 || unsignedShort == 1) {
            int unsignedShort2 = parsableByteArray.readUnsignedShort();
            parsableByteArray.skipBytes(6);
            int unsignedFixedPoint1616 = parsableByteArray.readUnsignedFixedPoint1616();
            parsableByteArray.setPosition(parsableByteArray.getPosition() - 4);
            i6 = parsableByteArray.readInt();
            if (unsignedShort == 1) {
                parsableByteArray.skipBytes(16);
            }
            i7 = unsignedFixedPoint1616;
            i8 = unsignedShort2;
            i9 = -1;
        } else {
            if (unsignedShort != 2) {
                return;
            }
            parsableByteArray.skipBytes(16);
            int iRound = (int) Math.round(parsableByteArray.readDouble());
            int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
            parsableByteArray.skipBytes(4);
            int unsignedIntToInt2 = parsableByteArray.readUnsignedIntToInt();
            int unsignedIntToInt3 = parsableByteArray.readUnsignedIntToInt();
            boolean z2 = (unsignedIntToInt3 & 1) != 0;
            boolean z3 = (unsignedIntToInt3 & 2) != 0;
            if (z2) {
                if (unsignedIntToInt2 == 32) {
                    i13 = 4;
                } else {
                    i13 = -1;
                }
            } else if (unsignedIntToInt2 == 8) {
                i13 = 3;
            } else if (unsignedIntToInt2 == 16) {
                i13 = z3 ? 268435456 : 2;
            } else if (unsignedIntToInt2 == 24) {
                i13 = z3 ? C.ENCODING_PCM_24BIT_BIG_ENDIAN : 21;
            } else if (unsignedIntToInt2 == 32) {
                i13 = z3 ? C.ENCODING_PCM_32BIT_BIG_ENDIAN : 22;
            } else {
                i13 = -1;
            }
            parsableByteArray.skipBytes(8);
            i7 = iRound;
            i8 = unsignedIntToInt;
            i9 = i13;
            i6 = 0;
        }
        if (iIntValue == 1767992678) {
            i8 = -1;
            i7 = -1;
        } else if (iIntValue == 1935764850) {
            i8 = 1;
            i7 = 8000;
        } else if (iIntValue == 1935767394) {
            i8 = 1;
            i7 = 16000;
        }
        int position = parsableByteArray.getPosition();
        if (iIntValue == 1701733217) {
            Pair<Integer, TrackEncryptionBox> sampleEntryEncryptionData = parseSampleEntryEncryptionData(parsableByteArray, i14, i15);
            if (sampleEntryEncryptionData != null) {
                iIntValue = ((Integer) sampleEntryEncryptionData.first).intValue();
                drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType == null ? null : drmInitDataCopyWithSchemeType.copyWithSchemeType(((TrackEncryptionBox) sampleEntryEncryptionData.second).schemeType);
                stsdData.trackEncryptionBoxes[i5] = (TrackEncryptionBox) sampleEntryEncryptionData.second;
            }
            parsableByteArray.setPosition(position);
        }
        String str5 = MimeTypes.AUDIO_MPEGH_MHM1;
        if (iIntValue == 1633889587) {
            str2 = MimeTypes.AUDIO_AC3;
        } else if (iIntValue == 1700998451) {
            str2 = MimeTypes.AUDIO_E_AC3;
        } else if (iIntValue == 1633889588) {
            str2 = MimeTypes.AUDIO_AC4;
        } else if (iIntValue == 1685353315) {
            str2 = MimeTypes.AUDIO_DTS;
        } else if (iIntValue == 1685353320 || iIntValue == 1685353324) {
            str2 = MimeTypes.AUDIO_DTS_HD;
        } else if (iIntValue == 1685353317) {
            str2 = MimeTypes.AUDIO_DTS_EXPRESS;
        } else if (iIntValue == 1685353336) {
            str2 = MimeTypes.AUDIO_DTS_X;
        } else if (iIntValue == 1935764850) {
            str2 = "audio/3gpp";
        } else if (iIntValue == 1935767394) {
            str2 = MimeTypes.AUDIO_AMR_WB;
        } else if (iIntValue == 1936684916) {
            str2 = MimeTypes.AUDIO_RAW;
            i9 = 2;
        } else if (iIntValue == 1953984371) {
            str2 = MimeTypes.AUDIO_RAW;
            i9 = 268435456;
        } else if (iIntValue == 1819304813) {
            if (i9 == -1) {
                str2 = MimeTypes.AUDIO_RAW;
                i9 = 2;
            } else {
                str2 = MimeTypes.AUDIO_RAW;
            }
        } else if (iIntValue == 778924082 || iIntValue == 778924083) {
            str2 = "audio/mpeg";
        } else if (iIntValue == 1835557169) {
            str2 = MimeTypes.AUDIO_MPEGH_MHA1;
        } else if (iIntValue == 1835560241) {
            str2 = MimeTypes.AUDIO_MPEGH_MHM1;
        } else if (iIntValue == 1634492771) {
            str2 = MimeTypes.AUDIO_ALAC;
        } else if (iIntValue == 1634492791) {
            str2 = MimeTypes.AUDIO_ALAW;
        } else if (iIntValue == 1970037111) {
            str2 = MimeTypes.AUDIO_MLAW;
        } else if (iIntValue == 1332770163) {
            str2 = MimeTypes.AUDIO_OPUS;
        } else if (iIntValue == 1716281667) {
            str2 = MimeTypes.AUDIO_FLAC;
        } else if (iIntValue == 1835823201) {
            str2 = MimeTypes.AUDIO_TRUEHD;
        } else {
            str2 = iIntValue == 1767992678 ? MimeTypes.AUDIO_IAMF : null;
        }
        int i16 = i9;
        String str6 = null;
        List<byte[]> listOf = null;
        EsdsData esdsFromParent = null;
        BtrtData btrtFromParent = null;
        while (position - i14 < i15) {
            parsableByteArray.setPosition(position);
            int i17 = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(i17 > 0, "childAtomSize must be positive");
            int i18 = parsableByteArray.readInt();
            if (i18 == 1835557187) {
                parsableByteArray.setPosition(position + 8);
                parsableByteArray.skipBytes(1);
                int unsignedByte = parsableByteArray.readUnsignedByte();
                parsableByteArray.skipBytes(1);
                if (Objects.equals(str2, str5)) {
                    i12 = 0;
                    str4 = String.format("mhm1.%02X", Integer.valueOf(unsignedByte));
                } else {
                    i12 = 0;
                    str4 = String.format("mha1.%02X", Integer.valueOf(unsignedByte));
                }
                int unsignedShort3 = parsableByteArray.readUnsignedShort();
                byte[] bArr = new byte[unsignedShort3];
                parsableByteArray.readBytes(bArr, i12, unsignedShort3);
                listOf = listOf == null ? O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of(bArr) : O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of(bArr, listOf.get(i12));
                strBuildIamfCodecString = str4;
            } else {
                i7 = i7;
                str5 = str5;
                if (i18 == 1835557200) {
                    parsableByteArray.setPosition(position + 8);
                    int unsignedByte2 = parsableByteArray.readUnsignedByte();
                    if (unsignedByte2 > 0) {
                        byte[] bArr2 = new byte[unsignedByte2];
                        parsableByteArray.readBytes(bArr2, 0, unsignedByte2);
                        listOf = listOf == null ? O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of(bArr2) : O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of(listOf.get(0), bArr2);
                    }
                } else {
                    if (i18 == 1702061171 || (z && i18 == 2002876005)) {
                        i7 = i7;
                        int iFindBoxPosition = i18 == 1702061171 ? position : findBoxPosition(parsableByteArray, Mp4Box.TYPE_esds, position, i17);
                        if (iFindBoxPosition != -1) {
                            esdsFromParent = parseEsdsFromParent(parsableByteArray, iFindBoxPosition);
                            str2 = esdsFromParent.mimeType;
                            byte[] bArr3 = esdsFromParent.initializationData;
                            if (bArr3 == null) {
                                strBuildIamfCodecString = str6;
                            } else if (MimeTypes.AUDIO_VORBIS.equals(str2)) {
                                listOf = VorbisUtil.parseVorbisCsdFromEsdsInitializationData(bArr3);
                                strBuildIamfCodecString = str6;
                            } else {
                                if (MimeTypes.AUDIO_AAC.equals(str2)) {
                                    AacUtil.Config audioSpecificConfig = AacUtil.parseAudioSpecificConfig(bArr3);
                                    i7 = audioSpecificConfig.sampleRateHz;
                                    i8 = audioSpecificConfig.channelCount;
                                    str3 = audioSpecificConfig.codecs;
                                } else {
                                    str3 = str6;
                                }
                                String str7 = str3;
                                listOf = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of(bArr3);
                                strBuildIamfCodecString = str7;
                            }
                        } else {
                            strBuildIamfCodecString = str6;
                        }
                    } else if (i18 == 1651798644) {
                        btrtFromParent = parseBtrtFromParent(parsableByteArray, position);
                    } else {
                        if (i18 == 1684103987) {
                            parsableByteArray.setPosition(position + 8);
                            stsdData.format = Ac3Util.parseAc3AnnexFFormat(parsableByteArray, Integer.toString(i4), str, drmInitDataCopyWithSchemeType);
                        } else if (i18 == 1684366131) {
                            parsableByteArray.setPosition(position + 8);
                            stsdData.format = Ac3Util.parseEAc3AnnexFFormat(parsableByteArray, Integer.toString(i4), str, drmInitDataCopyWithSchemeType);
                        } else {
                            if (i18 == 1684103988) {
                                parsableByteArray.setPosition(position + 8);
                                stsdData.format = Ac4Util.parseAc4AnnexEFormat(parsableByteArray, Integer.toString(i4), str, drmInitDataCopyWithSchemeType);
                            } else if (i18 == 1684892784) {
                                if (i6 <= 0) {
                                    throw ParserException.createForMalformedContainer("Invalid sample rate for Dolby TrueHD MLP stream: " + i6, null);
                                }
                                strBuildIamfCodecString = str6;
                                i7 = i6;
                                i8 = 2;
                            } else if (i18 == 1684305011 || i18 == 1969517683) {
                                i10 = i7;
                                stsdData.format = new Format.Builder().setId(i4).setSampleMimeType(str2).setChannelCount(i8).setSampleRate(i10).setDrmInitData(drmInitDataCopyWithSchemeType).setLanguage(str).build();
                            } else if (i18 == 1682927731) {
                                int i19 = i17 - 8;
                                byte[] bArr4 = opusMagic;
                                byte[] bArrCopyOf = Arrays.copyOf(bArr4, bArr4.length + i19);
                                parsableByteArray.setPosition(position + 8);
                                parsableByteArray.readBytes(bArrCopyOf, bArr4.length, i19);
                                listOf = OpusUtil.buildInitializationData(bArrCopyOf);
                                strBuildIamfCodecString = str6;
                                i7 = i7;
                            } else {
                                if (i18 == 1684425825) {
                                    byte[] bArr5 = new byte[i17 - 8];
                                    bArr5[0] = 102;
                                    bArr5[1] = 76;
                                    bArr5[2] = 97;
                                    bArr5[3] = 67;
                                    parsableByteArray.setPosition(position + 12);
                                    parsableByteArray.readBytes(bArr5, 4, i17 - 12);
                                    listOf = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of(bArr5);
                                    i7 = i7;
                                } else if (i18 == 1634492771) {
                                    int i20 = i17 - 12;
                                    byte[] bArr6 = new byte[i20];
                                    parsableByteArray.setPosition(position + 12);
                                    parsableByteArray.readBytes(bArr6, 0, i20);
                                    Pair<Integer, Integer> alacAudioSpecificConfig = CodecSpecificDataUtil.parseAlacAudioSpecificConfig(bArr6);
                                    int iIntValue2 = ((Integer) alacAudioSpecificConfig.first).intValue();
                                    int iIntValue3 = ((Integer) alacAudioSpecificConfig.second).intValue();
                                    listOf = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of(bArr6);
                                    i7 = iIntValue2;
                                    i8 = iIntValue3;
                                } else if (i18 == 1767990114) {
                                    parsableByteArray.setPosition(position + 9);
                                    int unsignedLeb128ToInt = parsableByteArray.readUnsignedLeb128ToInt();
                                    byte[] bArr7 = new byte[unsignedLeb128ToInt];
                                    parsableByteArray.readBytes(bArr7, 0, unsignedLeb128ToInt);
                                    strBuildIamfCodecString = CodecSpecificDataUtil.buildIamfCodecString(bArr7);
                                    listOf = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of(bArr7);
                                    i7 = i7;
                                } else if (i18 == 1885564227) {
                                    parsableByteArray.setPosition(position + 12);
                                    ByteOrder byteOrder = (parsableByteArray.readUnsignedByte() & 1) != 0 ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
                                    int unsignedByte3 = parsableByteArray.readUnsignedByte();
                                    if (iIntValue == 1768973165) {
                                        pcmEncoding = Util.getPcmEncoding(unsignedByte3, byteOrder);
                                        i11 = -1;
                                    } else {
                                        pcmEncoding = (iIntValue == 1718641517 && unsignedByte3 == 32 && byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) ? 4 : i16;
                                        i11 = -1;
                                    }
                                    i16 = pcmEncoding;
                                    if (pcmEncoding != i11) {
                                        str2 = MimeTypes.AUDIO_RAW;
                                    }
                                    i7 = i7;
                                } else {
                                    i10 = i7;
                                }
                                strBuildIamfCodecString = str6;
                            }
                            strBuildIamfCodecString = str6;
                            i7 = i10;
                        }
                        i10 = i7;
                        strBuildIamfCodecString = str6;
                        i7 = i10;
                    }
                    position += i17;
                    i15 = i3;
                    str5 = str5;
                    str6 = strBuildIamfCodecString;
                    i14 = i2;
                }
                strBuildIamfCodecString = str6;
            }
            i7 = i7;
            position += i17;
            i15 = i3;
            str5 = str5;
            str6 = strBuildIamfCodecString;
            i14 = i2;
        }
        if (stsdData.format != null || str2 == null) {
            return;
        }
        Format.Builder language = new Format.Builder().setId(i4).setSampleMimeType(str2).setCodecs(str6).setChannelCount(i8).setSampleRate(i7).setPcmEncoding(i16).setInitializationData(listOf).setDrmInitData(drmInitDataCopyWithSchemeType).setLanguage(str);
        if (esdsFromParent != null) {
            language.setAverageBitrate(O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000OOoOOO00O00o0ooooooooO000ooooO0000(esdsFromParent.bitrate)).setPeakBitrate(O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000OOoOOO00O00o0ooooooooO000ooooO0000(esdsFromParent.peakBitrate));
        } else if (btrtFromParent != null) {
            language.setAverageBitrate(O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000OOoOOO00O00o0ooooooooO000ooooO0000(btrtFromParent.avgBitrate)).setPeakBitrate(O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000OOoOOO00O00o0ooooooooO000ooooO0000(btrtFromParent.maxBitrate));
        }
        stsdData.format = language.build();
    }

    private static ColorInfo parseAv1c(ParsableByteArray parsableByteArray) {
        ColorInfo.Builder builder = new ColorInfo.Builder();
        ParsableBitArray parsableBitArray = new ParsableBitArray(parsableByteArray.getData());
        parsableBitArray.setPosition(parsableByteArray.getPosition() * 8);
        parsableBitArray.skipBytes(1);
        int bits = parsableBitArray.readBits(3);
        parsableBitArray.skipBits(6);
        boolean bit = parsableBitArray.readBit();
        boolean bit2 = parsableBitArray.readBit();
        if (bits == 2 && bit) {
            builder.setLumaBitdepth(bit2 ? 12 : 10);
            builder.setChromaBitdepth(bit2 ? 12 : 10);
        } else if (bits <= 2) {
            builder.setLumaBitdepth(bit ? 10 : 8);
            builder.setChromaBitdepth(bit ? 10 : 8);
        }
        parsableBitArray.skipBits(13);
        parsableBitArray.skipBit();
        int bits2 = parsableBitArray.readBits(4);
        if (bits2 != 1) {
            Log.i(TAG, "Unsupported obu_type: " + bits2);
            return builder.build();
        }
        if (parsableBitArray.readBit()) {
            Log.i(TAG, "Unsupported obu_extension_flag");
            return builder.build();
        }
        boolean bit3 = parsableBitArray.readBit();
        parsableBitArray.skipBit();
        if (bit3 && parsableBitArray.readBits(8) > 127) {
            Log.i(TAG, "Excessive obu_size");
            return builder.build();
        }
        int bits3 = parsableBitArray.readBits(3);
        parsableBitArray.skipBit();
        if (parsableBitArray.readBit()) {
            Log.i(TAG, "Unsupported reduced_still_picture_header");
            return builder.build();
        }
        if (parsableBitArray.readBit()) {
            Log.i(TAG, "Unsupported timing_info_present_flag");
            return builder.build();
        }
        if (parsableBitArray.readBit()) {
            Log.i(TAG, "Unsupported initial_display_delay_present_flag");
            return builder.build();
        }
        int bits4 = parsableBitArray.readBits(5);
        boolean z = false;
        for (int i = 0; i <= bits4; i++) {
            parsableBitArray.skipBits(12);
            if (parsableBitArray.readBits(5) > 7) {
                parsableBitArray.skipBit();
            }
        }
        int bits5 = parsableBitArray.readBits(4);
        int bits6 = parsableBitArray.readBits(4);
        parsableBitArray.skipBits(bits5 + 1);
        parsableBitArray.skipBits(bits6 + 1);
        if (parsableBitArray.readBit()) {
            parsableBitArray.skipBits(7);
        }
        parsableBitArray.skipBits(7);
        boolean bit4 = parsableBitArray.readBit();
        if (bit4) {
            parsableBitArray.skipBits(2);
        }
        if ((parsableBitArray.readBit() ? 2 : parsableBitArray.readBits(1)) > 0 && !parsableBitArray.readBit()) {
            parsableBitArray.skipBits(1);
        }
        if (bit4) {
            parsableBitArray.skipBits(3);
        }
        parsableBitArray.skipBits(3);
        boolean bit5 = parsableBitArray.readBit();
        if (bits3 == 2 && bit5) {
            parsableBitArray.skipBit();
        }
        if (bits3 != 1 && parsableBitArray.readBit()) {
            z = true;
        }
        if (parsableBitArray.readBit()) {
            int bits7 = parsableBitArray.readBits(8);
            int bits8 = parsableBitArray.readBits(8);
            builder.setColorSpace(ColorInfo.isoColorPrimariesToColorSpace(bits7)).setColorRange(((z || bits7 != 1 || bits8 != 13 || parsableBitArray.readBits(8) != 0) ? parsableBitArray.readBits(1) : 1) != 1 ? 2 : 1).setColorTransfer(ColorInfo.isoTransferCharacteristicsToColorTransfer(bits8));
        }
        return builder.build();
    }

    private static BtrtData parseBtrtFromParent(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.setPosition(i + 8);
        parsableByteArray.skipBytes(4);
        return new BtrtData(parsableByteArray.readUnsignedInt(), parsableByteArray.readUnsignedInt());
    }

    @Nullable
    public static Pair<Integer, TrackEncryptionBox> parseCommonEncryptionSinfFromParent(ParsableByteArray parsableByteArray, int i, int i2) throws ParserException {
        int i3 = i + 8;
        String string = null;
        Integer numValueOf = null;
        int i4 = -1;
        int i5 = 0;
        while (i3 - i < i2) {
            parsableByteArray.setPosition(i3);
            int i6 = parsableByteArray.readInt();
            int i7 = parsableByteArray.readInt();
            if (i7 == 1718775137) {
                numValueOf = Integer.valueOf(parsableByteArray.readInt());
            } else if (i7 == 1935894637) {
                parsableByteArray.skipBytes(4);
                string = parsableByteArray.readString(4);
            } else if (i7 == 1935894633) {
                i4 = i3;
                i5 = i6;
            }
            i3 += i6;
        }
        if (!C.CENC_TYPE_cenc.equals(string) && !C.CENC_TYPE_cbc1.equals(string) && !C.CENC_TYPE_cens.equals(string) && !C.CENC_TYPE_cbcs.equals(string)) {
            return null;
        }
        ExtractorUtil.checkContainerInput(numValueOf != null, "frma atom is mandatory");
        ExtractorUtil.checkContainerInput(i4 != -1, "schi atom is mandatory");
        TrackEncryptionBox schiFromParent = parseSchiFromParent(parsableByteArray, i4, i5, string);
        ExtractorUtil.checkContainerInput(schiFromParent != null, "tenc atom is mandatory");
        return Pair.create(numValueOf, (TrackEncryptionBox) Util.castNonNull(schiFromParent));
    }

    @Nullable
    private static Pair<long[], long[]> parseEdts(Mp4Box.ContainerBox containerBox) {
        Mp4Box.LeafBox leafBoxOfType = containerBox.getLeafBoxOfType(Mp4Box.TYPE_elst);
        if (leafBoxOfType == null) {
            return null;
        }
        ParsableByteArray parsableByteArray = leafBoxOfType.data;
        parsableByteArray.setPosition(8);
        int fullBoxVersion = parseFullBoxVersion(parsableByteArray.readInt());
        int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        long[] jArr = new long[unsignedIntToInt];
        long[] jArr2 = new long[unsignedIntToInt];
        for (int i = 0; i < unsignedIntToInt; i++) {
            jArr[i] = fullBoxVersion == 1 ? parsableByteArray.readUnsignedLongToLong() : parsableByteArray.readUnsignedInt();
            jArr2[i] = fullBoxVersion == 1 ? parsableByteArray.readLong() : parsableByteArray.readInt();
            if (parsableByteArray.readShort() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            parsableByteArray.skipBytes(2);
        }
        return Pair.create(jArr, jArr2);
    }

    private static EsdsData parseEsdsFromParent(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.setPosition(i + 12);
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        parsableByteArray.skipBytes(2);
        int unsignedByte = parsableByteArray.readUnsignedByte();
        if ((unsignedByte & 128) != 0) {
            parsableByteArray.skipBytes(2);
        }
        if ((unsignedByte & 64) != 0) {
            parsableByteArray.skipBytes(parsableByteArray.readUnsignedByte());
        }
        if ((unsignedByte & 32) != 0) {
            parsableByteArray.skipBytes(2);
        }
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        String mimeTypeFromMp4ObjectType = MimeTypes.getMimeTypeFromMp4ObjectType(parsableByteArray.readUnsignedByte());
        if ("audio/mpeg".equals(mimeTypeFromMp4ObjectType) || MimeTypes.AUDIO_DTS.equals(mimeTypeFromMp4ObjectType) || MimeTypes.AUDIO_DTS_HD.equals(mimeTypeFromMp4ObjectType)) {
            return new EsdsData(mimeTypeFromMp4ObjectType, null, -1L, -1L);
        }
        parsableByteArray.skipBytes(4);
        long unsignedInt = parsableByteArray.readUnsignedInt();
        long unsignedInt2 = parsableByteArray.readUnsignedInt();
        parsableByteArray.skipBytes(1);
        int expandableClassSize = parseExpandableClassSize(parsableByteArray);
        byte[] bArr = new byte[expandableClassSize];
        parsableByteArray.readBytes(bArr, 0, expandableClassSize);
        return new EsdsData(mimeTypeFromMp4ObjectType, bArr, unsignedInt2 > 0 ? unsignedInt2 : -1L, unsignedInt > 0 ? unsignedInt : -1L);
    }

    private static int parseExpandableClassSize(ParsableByteArray parsableByteArray) {
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int i = unsignedByte & 127;
        while ((unsignedByte & 128) == 128) {
            unsignedByte = parsableByteArray.readUnsignedByte();
            i = (i << 7) | (unsignedByte & 127);
        }
        return i;
    }

    public static int parseFullBoxFlags(int i) {
        return i & ViewCompat.MEASURED_SIZE_MASK;
    }

    public static int parseFullBoxVersion(int i) {
        return (i >> 24) & 255;
    }

    private static int parseHdlr(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(16);
        return parsableByteArray.readInt();
    }

    @Nullable
    private static Metadata parseIlst(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.skipBytes(8);
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray.getPosition() < i) {
            Metadata.Entry ilstElement = MetadataUtil.parseIlstElement(parsableByteArray);
            if (ilstElement != null) {
                arrayList.add(ilstElement);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    private static MdhdData parseMdhd(ParsableByteArray parsableByteArray) {
        long jScaleLargeTimestamp;
        parsableByteArray.setPosition(8);
        int fullBoxVersion = parseFullBoxVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(fullBoxVersion == 0 ? 8 : 16);
        long unsignedInt = parsableByteArray.readUnsignedInt();
        int position = parsableByteArray.getPosition();
        int i = fullBoxVersion == 0 ? 4 : 8;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                parsableByteArray.skipBytes(i);
                break;
            }
            if (parsableByteArray.getData()[position + i2] != -1) {
                long unsignedInt2 = fullBoxVersion == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
                if (unsignedInt2 == 0) {
                    break;
                }
                jScaleLargeTimestamp = Util.scaleLargeTimestamp(unsignedInt2, 1000000L, unsignedInt);
                return new MdhdData(unsignedInt, jScaleLargeTimestamp, getLanguageFromCode(parsableByteArray.readUnsignedShort()));
            }
            i2++;
        }
        jScaleLargeTimestamp = -9223372036854775807L;
        return new MdhdData(unsignedInt, jScaleLargeTimestamp, getLanguageFromCode(parsableByteArray.readUnsignedShort()));
    }

    @Nullable
    public static Metadata parseMdtaFromMeta(Mp4Box.ContainerBox containerBox) {
        Mp4Box.LeafBox leafBoxOfType = containerBox.getLeafBoxOfType(Mp4Box.TYPE_hdlr);
        Mp4Box.LeafBox leafBoxOfType2 = containerBox.getLeafBoxOfType(Mp4Box.TYPE_keys);
        Mp4Box.LeafBox leafBoxOfType3 = containerBox.getLeafBoxOfType(Mp4Box.TYPE_ilst);
        if (leafBoxOfType == null || leafBoxOfType2 == null || leafBoxOfType3 == null || parseHdlr(leafBoxOfType.data) != TYPE_mdta) {
            return null;
        }
        ParsableByteArray parsableByteArray = leafBoxOfType2.data;
        parsableByteArray.setPosition(12);
        int i = parsableByteArray.readInt();
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = parsableByteArray.readInt();
            parsableByteArray.skipBytes(4);
            strArr[i2] = parsableByteArray.readString(i3 - 8);
        }
        ParsableByteArray parsableByteArray2 = leafBoxOfType3.data;
        parsableByteArray2.setPosition(8);
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray2.bytesLeft() > 8) {
            int position = parsableByteArray2.getPosition();
            int i4 = parsableByteArray2.readInt();
            int i5 = parsableByteArray2.readInt() - 1;
            if (i5 < 0 || i5 >= i) {
                androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(i5, "Skipped metadata with unknown key index: ", TAG);
            } else {
                MdtaMetadataEntry mdtaMetadataEntryFromIlst = MetadataUtil.parseMdtaMetadataEntryFromIlst(parsableByteArray2, position + i4, strArr[i5]);
                if (mdtaMetadataEntryFromIlst != null) {
                    arrayList.add(mdtaMetadataEntryFromIlst);
                }
            }
            parsableByteArray2.setPosition(position + i4);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    private static void parseMetaDataSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, StsdData stsdData) {
        parsableByteArray.setPosition(i2 + 16);
        if (i == 1835365492) {
            parsableByteArray.readNullTerminatedString();
            String nullTerminatedString = parsableByteArray.readNullTerminatedString();
            if (nullTerminatedString != null) {
                stsdData.format = new Format.Builder().setId(i3).setSampleMimeType(nullTerminatedString).build();
            }
        }
    }

    public static Mp4TimestampData parseMvhd(ParsableByteArray parsableByteArray) {
        long unsignedInt;
        long unsignedInt2;
        parsableByteArray.setPosition(8);
        if (parseFullBoxVersion(parsableByteArray.readInt()) == 0) {
            unsignedInt = parsableByteArray.readUnsignedInt();
            unsignedInt2 = parsableByteArray.readUnsignedInt();
        } else {
            unsignedInt = parsableByteArray.readLong();
            unsignedInt2 = parsableByteArray.readLong();
        }
        return new Mp4TimestampData(unsignedInt, unsignedInt2, parsableByteArray.readUnsignedInt());
    }

    private static float parsePaspFromParent(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.setPosition(i + 8);
        return parsableByteArray.readUnsignedIntToInt() / parsableByteArray.readUnsignedIntToInt();
    }

    @Nullable
    private static byte[] parseProjFromParent(ParsableByteArray parsableByteArray, int i, int i2) {
        int i3 = i + 8;
        while (i3 - i < i2) {
            parsableByteArray.setPosition(i3);
            int i4 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1886547818) {
                return Arrays.copyOfRange(parsableByteArray.getData(), i3, i4 + i3);
            }
            i3 += i4;
        }
        return null;
    }

    @Nullable
    private static Pair<Integer, TrackEncryptionBox> parseSampleEntryEncryptionData(ParsableByteArray parsableByteArray, int i, int i2) throws ParserException {
        Pair<Integer, TrackEncryptionBox> commonEncryptionSinfFromParent;
        int position = parsableByteArray.getPosition();
        while (position - i < i2) {
            parsableByteArray.setPosition(position);
            int i3 = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(i3 > 0, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == 1936289382 && (commonEncryptionSinfFromParent = parseCommonEncryptionSinfFromParent(parsableByteArray, position, i3)) != null) {
                return commonEncryptionSinfFromParent;
            }
            position += i3;
        }
        return null;
    }

    @Nullable
    private static TrackEncryptionBox parseSchiFromParent(ParsableByteArray parsableByteArray, int i, int i2, String str) {
        int i3;
        int i4;
        int i5 = i + 8;
        while (true) {
            byte[] bArr = null;
            if (i5 - i >= i2) {
                return null;
            }
            parsableByteArray.setPosition(i5);
            int i6 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1952804451) {
                int fullBoxVersion = parseFullBoxVersion(parsableByteArray.readInt());
                parsableByteArray.skipBytes(1);
                if (fullBoxVersion == 0) {
                    parsableByteArray.skipBytes(1);
                    i4 = 0;
                    i3 = 0;
                } else {
                    int unsignedByte = parsableByteArray.readUnsignedByte();
                    i3 = unsignedByte & 15;
                    i4 = (unsignedByte & 240) >> 4;
                }
                boolean z = parsableByteArray.readUnsignedByte() == 1;
                int unsignedByte2 = parsableByteArray.readUnsignedByte();
                byte[] bArr2 = new byte[16];
                parsableByteArray.readBytes(bArr2, 0, 16);
                if (z && unsignedByte2 == 0) {
                    int unsignedByte3 = parsableByteArray.readUnsignedByte();
                    bArr = new byte[unsignedByte3];
                    parsableByteArray.readBytes(bArr, 0, unsignedByte3);
                }
                return new TrackEncryptionBox(z, str, unsignedByte2, bArr2, i4, i3, bArr);
            }
            i5 += i6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x025f A[DONT_INVERT, LOOP:11: B:100:0x025f->B:104:0x0269, LOOP_START, PHI: r25
  0x025f: PHI (r25v2 int) = (r25v1 int), (r25v3 int) binds: [B:99:0x025d, B:104:0x0269] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:101:0x0261  */
    /* JADX WARN: Code duplicated, block: B:104:0x0269 A[LOOP:11: B:100:0x025f->B:104:0x0269, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:105:0x026f A[EDGE_INSN: B:105:0x026f->B:106:0x0270 BREAK  A[LOOP:11: B:100:0x025f->B:104:0x0269]] */
    /* JADX WARN: Code duplicated, block: B:115:0x0282  */
    /* JADX WARN: Code duplicated, block: B:118:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:119:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:124:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:131:0x0320  */
    /* JADX WARN: Code duplicated, block: B:133:0x033b  */
    /* JADX WARN: Code duplicated, block: B:141:0x0371  */
    /* JADX WARN: Code duplicated, block: B:163:0x0431  */
    /* JADX WARN: Code duplicated, block: B:164:0x0433  */
    /* JADX WARN: Code duplicated, block: B:168:0x044b  */
    /* JADX WARN: Code duplicated, block: B:170:0x0455  */
    /* JADX WARN: Code duplicated, block: B:177:0x0492  */
    /* JADX WARN: Code duplicated, block: B:194:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:195:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:197:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:201:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:202:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:205:0x0503  */
    /* JADX WARN: Code duplicated, block: B:206:0x0506  */
    /* JADX WARN: Code duplicated, block: B:208:0x0509  */
    /* JADX WARN: Code duplicated, block: B:209:0x050c  */
    /* JADX WARN: Code duplicated, block: B:211:0x050f  */
    /* JADX WARN: Code duplicated, block: B:212:0x0511  */
    /* JADX WARN: Code duplicated, block: B:214:0x0515  */
    /* JADX WARN: Code duplicated, block: B:215:0x0518  */
    /* JADX WARN: Code duplicated, block: B:219:0x052a  */
    /* JADX WARN: Code duplicated, block: B:221:0x0538  */
    /* JADX WARN: Code duplicated, block: B:224:0x0547  */
    /* JADX WARN: Code duplicated, block: B:226:0x0571  */
    /* JADX WARN: Code duplicated, block: B:236:0x05b8  */
    /* JADX WARN: Code duplicated, block: B:243:0x04f2 A[EDGE_INSN: B:243:0x04f2->B:199:0x04f2 BREAK  A[LOOP:2: B:166:0x0446->B:198:0x04e5], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:257:0x01a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:0x024e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:262:0x019c A[EDGE_INSN: B:262:0x019c->B:69:0x019c BREAK  A[LOOP:9: B:65:0x017f->B:68:0x0187], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:265:0x026f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:266:0x0267 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0120  */
    /* JADX WARN: Code duplicated, block: B:55:0x0123  */
    /* JADX WARN: Code duplicated, block: B:58:0x012f A[LOOP:0: B:56:0x0129->B:58:0x012f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x0155  */
    /* JADX WARN: Code duplicated, block: B:64:0x0179  */
    /* JADX WARN: Code duplicated, block: B:66:0x0181  */
    /* JADX WARN: Code duplicated, block: B:68:0x0187 A[LOOP:9: B:65:0x017f->B:68:0x0187, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:72:0x01c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x01c6 A[ADDED_TO_REGION, LOOP:10: B:73:0x01c6->B:75:0x01ca, LOOP_START, PHI: r22 r23 r25
  0x01c6: PHI (r22v4 int) = (r22v1 int), (r22v5 int) binds: [B:72:0x01c4, B:75:0x01ca] A[DONT_GENERATE, DONT_INLINE]
  0x01c6: PHI (r23v3 int) = (r23v1 int), (r23v5 int) binds: [B:72:0x01c4, B:75:0x01ca] A[DONT_GENERATE, DONT_INLINE]
  0x01c6: PHI (r25v5 int) = (r25v1 int), (r25v6 int) binds: [B:72:0x01c4, B:75:0x01ca] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:79:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:82:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:83:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:88:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:90:0x020f  */
    /* JADX WARN: Code duplicated, block: B:95:0x022a  */
    public static TrackSampleTable parseStbl(Track track, Mp4Box.ContainerBox containerBox, GaplessInfoHolder gaplessInfoHolder) throws ParserException {
        SampleSizeBox stz2SampleSizeBox;
        boolean z;
        int unsignedIntToInt;
        int unsignedIntToInt2;
        int unsignedIntToInt3;
        int fixedSampleSize;
        boolean z2;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int[] iArr2;
        int i;
        int unsignedIntToInt4;
        int i2;
        int i3;
        int i4;
        int i5;
        int unsignedIntToInt5;
        long j;
        long j2;
        long j3;
        int i6;
        int i7;
        long[] jArr3;
        int[] iArr3;
        long[] jArrCopyOf;
        int[] iArrCopyOf;
        int i8;
        boolean z3;
        int i9;
        Track trackCopyWithFormat;
        String str;
        int[] iArr4;
        long[] jArr4;
        long j4;
        long j5;
        long j6;
        int i10;
        boolean zMoveNext;
        int i11;
        int i12;
        int nextSampleSize;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        long j7;
        int[] iArr5;
        long jScaleLargeTimestamp;
        long[] jArr5;
        long[] jArr6;
        boolean z4;
        int[] iArr6;
        int[] iArr7;
        long[] jArr7;
        int i18;
        boolean z5;
        int i19;
        int i20;
        long[] jArr8;
        int[] iArr8;
        int i21;
        int i22;
        int[] iArr9;
        boolean z6;
        boolean z7;
        long[] jArr9;
        int[] iArr10;
        int i23;
        int[] iArr11;
        long[] jArr10;
        int i24;
        int i25;
        int i26;
        long j8;
        boolean z8;
        long j9;
        int i27;
        int i28;
        long jScaleLargeTimestamp2;
        long j10;
        int[] iArr12;
        boolean z9;
        int i29;
        int i30;
        int i31;
        int i32;
        boolean z10;
        int i33;
        int i34;
        long j11;
        long jScaleLargeTimestamp3;
        long jScaleLargeTimestamp4;
        long jScaleLargeTimestamp5;
        long jScaleLargeValue;
        long[] jArr11;
        int[] iArr13;
        Track trackCopyWithFormat2 = track;
        Mp4Box.LeafBox leafBoxOfType = containerBox.getLeafBoxOfType(Mp4Box.TYPE_stsz);
        if (leafBoxOfType != null) {
            stz2SampleSizeBox = new StszSampleSizeBox(leafBoxOfType, trackCopyWithFormat2.format);
        } else {
            Mp4Box.LeafBox leafBoxOfType2 = containerBox.getLeafBoxOfType(Mp4Box.TYPE_stz2);
            if (leafBoxOfType2 == null) {
                throw ParserException.createForMalformedContainer("Track has no sample table size information", null);
            }
            stz2SampleSizeBox = new Stz2SampleSizeBox(leafBoxOfType2);
        }
        int sampleCount = stz2SampleSizeBox.getSampleCount();
        if (sampleCount == 0) {
            return new TrackSampleTable(track, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        if (trackCopyWithFormat2.type == 2) {
            long j12 = trackCopyWithFormat2.mediaDurationUs;
            if (j12 > 0) {
                trackCopyWithFormat2 = trackCopyWithFormat2.copyWithFormat(trackCopyWithFormat2.format.buildUpon().setFrameRate(sampleCount / (j12 / 1000000.0f)).build());
            }
        }
        Mp4Box.LeafBox leafBoxOfType3 = containerBox.getLeafBoxOfType(Mp4Box.TYPE_stco);
        if (leafBoxOfType3 == null) {
            leafBoxOfType3 = (Mp4Box.LeafBox) Assertions.checkNotNull(containerBox.getLeafBoxOfType(Mp4Box.TYPE_co64));
            z = true;
        } else {
            z = false;
        }
        ParsableByteArray parsableByteArray = leafBoxOfType3.data;
        ParsableByteArray parsableByteArray2 = ((Mp4Box.LeafBox) Assertions.checkNotNull(containerBox.getLeafBoxOfType(Mp4Box.TYPE_stsc))).data;
        ParsableByteArray parsableByteArray3 = ((Mp4Box.LeafBox) Assertions.checkNotNull(containerBox.getLeafBoxOfType(Mp4Box.TYPE_stts))).data;
        Mp4Box.LeafBox leafBoxOfType4 = containerBox.getLeafBoxOfType(Mp4Box.TYPE_stss);
        ParsableByteArray parsableByteArray4 = leafBoxOfType4 != null ? leafBoxOfType4.data : null;
        Mp4Box.LeafBox leafBoxOfType5 = containerBox.getLeafBoxOfType(Mp4Box.TYPE_ctts);
        ParsableByteArray parsableByteArray5 = leafBoxOfType5 != null ? leafBoxOfType5.data : null;
        ChunkIterator chunkIterator = new ChunkIterator(parsableByteArray2, parsableByteArray, z);
        parsableByteArray3.setPosition(12);
        int unsignedIntToInt6 = parsableByteArray3.readUnsignedIntToInt() - 1;
        int unsignedIntToInt7 = parsableByteArray3.readUnsignedIntToInt();
        int unsignedIntToInt8 = parsableByteArray3.readUnsignedIntToInt();
        if (parsableByteArray5 != null) {
            parsableByteArray5.setPosition(12);
            unsignedIntToInt = parsableByteArray5.readUnsignedIntToInt();
        } else {
            unsignedIntToInt = 0;
        }
        if (parsableByteArray4 != null) {
            parsableByteArray4.setPosition(12);
            unsignedIntToInt2 = parsableByteArray4.readUnsignedIntToInt();
            if (unsignedIntToInt2 > 0) {
                unsignedIntToInt3 = parsableByteArray4.readUnsignedIntToInt() - 1;
            } else {
                parsableByteArray4 = null;
            }
            fixedSampleSize = stz2SampleSizeBox.getFixedSampleSize();
            String str2 = trackCopyWithFormat2.format.sampleMimeType;
            if (fixedSampleSize == -1 && ((MimeTypes.AUDIO_RAW.equals(str2) || MimeTypes.AUDIO_MLAW.equals(str2) || MimeTypes.AUDIO_ALAW.equals(str2)) && unsignedIntToInt6 == 0 && unsignedIntToInt == 0 && unsignedIntToInt2 == 0)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                int i35 = chunkIterator.length;
                jArr11 = new long[i35];
                iArr13 = new int[i35];
                while (chunkIterator.moveNext()) {
                    int i36 = chunkIterator.index;
                    jArr11[i36] = chunkIterator.offset;
                    iArr13[i36] = chunkIterator.numSamples;
                }
                FixedSampleSizeRechunker.Results resultsRechunk = FixedSampleSizeRechunker.rechunk(fixedSampleSize, jArr11, iArr13, unsignedIntToInt8);
                jArr3 = resultsRechunk.offsets;
                int[] iArr14 = resultsRechunk.sizes;
                int i37 = resultsRechunk.maximumSize;
                long[] jArr12 = resultsRechunk.timestamps;
                iArrCopyOf = resultsRechunk.flags;
                long j13 = resultsRechunk.duration;
                j5 = resultsRechunk.totalSize;
                trackCopyWithFormat = trackCopyWithFormat2;
                iArr4 = iArr14;
                i3 = i37;
                jArr4 = jArr12;
                j4 = j13;
            } else {
                jArr = new long[sampleCount];
                iArr = new int[sampleCount];
                jArr2 = new long[sampleCount];
                iArr2 = new int[sampleCount];
                i = unsignedIntToInt6;
                unsignedIntToInt4 = unsignedIntToInt3;
                i2 = unsignedIntToInt;
                i3 = 0;
                i4 = 0;
                i5 = 0;
                unsignedIntToInt5 = 0;
                j = 0;
                j2 = 0;
                j3 = 0;
                Track track2 = trackCopyWithFormat2;
                i6 = 0;
                while (true) {
                    if (i6 < sampleCount) {
                        i7 = unsignedIntToInt2;
                        jArr3 = jArr;
                        iArr3 = iArr;
                        jArrCopyOf = jArr2;
                        iArrCopyOf = iArr2;
                        i8 = i4;
                        break;
                    }
                    j6 = j3;
                    i10 = i4;
                    zMoveNext = true;
                    while (i10 == 0) {
                        zMoveNext = chunkIterator.moveNext();
                        if (zMoveNext) {
                            break;
                        }
                        int i38 = unsignedIntToInt8;
                        long j14 = chunkIterator.offset;
                        i10 = chunkIterator.numSamples;
                        j6 = j14;
                        unsignedIntToInt8 = i38;
                        unsignedIntToInt2 = unsignedIntToInt2;
                        sampleCount = sampleCount;
                    }
                    i11 = sampleCount;
                    i12 = unsignedIntToInt8;
                    i7 = unsignedIntToInt2;
                    if (!zMoveNext) {
                        Log.w(TAG, "Unexpected end of chunk data");
                        long[] jArrCopyOf2 = Arrays.copyOf(jArr, i6);
                        int[] iArrCopyOf2 = Arrays.copyOf(iArr, i6);
                        jArrCopyOf = Arrays.copyOf(jArr2, i6);
                        iArrCopyOf = Arrays.copyOf(iArr2, i6);
                        jArr3 = jArrCopyOf2;
                        iArr3 = iArrCopyOf2;
                        sampleCount = i6;
                        i8 = i10;
                        break;
                    }
                    if (parsableByteArray5 != null) {
                        while (unsignedIntToInt5 == 0 && i2 > 0) {
                            unsignedIntToInt5 = parsableByteArray5.readUnsignedIntToInt();
                            i5 = parsableByteArray5.readInt();
                            i2--;
                        }
                        unsignedIntToInt5--;
                    }
                    int i39 = i5;
                    jArr[i6] = j6;
                    nextSampleSize = stz2SampleSizeBox.readNextSampleSize();
                    iArr[i6] = nextSampleSize;
                    ChunkIterator chunkIterator2 = chunkIterator;
                    SampleSizeBox sampleSizeBox = stz2SampleSizeBox;
                    j2 += (long) nextSampleSize;
                    if (nextSampleSize > i3) {
                        i3 = nextSampleSize;
                    }
                    jArr2[i6] = j + ((long) i39);
                    if (parsableByteArray4 == null) {
                        i13 = 1;
                    } else {
                        i13 = 0;
                    }
                    iArr2[i6] = i13;
                    if (i6 == unsignedIntToInt4) {
                        iArr2[i6] = 1;
                        i15 = i7 - 1;
                        if (i15 > 0) {
                            unsignedIntToInt4 = ((ParsableByteArray) Assertions.checkNotNull(parsableByteArray4)).readUnsignedIntToInt() - 1;
                        }
                        i14 = unsignedIntToInt4;
                    } else {
                        i14 = unsignedIntToInt4;
                        i15 = i7;
                    }
                    j += (long) i12;
                    unsignedIntToInt7--;
                    if (unsignedIntToInt7 == 0 || i <= 0) {
                        i16 = i12;
                        i17 = i;
                    } else {
                        int unsignedIntToInt9 = parsableByteArray3.readUnsignedIntToInt();
                        i16 = parsableByteArray3.readInt();
                        i17 = i - 1;
                        unsignedIntToInt7 = unsignedIntToInt9;
                    }
                    int i40 = i16;
                    long j15 = j6 + ((long) iArr[i6]);
                    i4 = i10 - 1;
                    i6++;
                    j3 = j15;
                    i5 = i39;
                    unsignedIntToInt4 = i14;
                    sampleCount = i11;
                    chunkIterator = chunkIterator2;
                    int i41 = i17;
                    unsignedIntToInt8 = i40;
                    i = i41;
                    unsignedIntToInt2 = i15;
                    stz2SampleSizeBox = sampleSizeBox;
                }
                long j16 = j + ((long) i5);
                if (parsableByteArray5 != null) {
                    z3 = true;
                    break;
                }
                while (true) {
                    if (i2 > 0) {
                        z3 = true;
                        break;
                    }
                    if (parsableByteArray5.readUnsignedIntToInt() != 0) {
                        z3 = false;
                        break;
                    }
                    parsableByteArray5.readInt();
                    i2--;
                }
                if (i7 != 0 && unsignedIntToInt7 == 0 && i8 == 0 && i == 0) {
                    i9 = unsignedIntToInt5;
                    if (i9 == 0 && z3) {
                        trackCopyWithFormat = track2;
                    }
                    iArr4 = iArr3;
                    jArr4 = jArrCopyOf;
                    j4 = j16;
                    j5 = j2;
                } else {
                    i9 = unsignedIntToInt5;
                }
                StringBuilder sb = new StringBuilder("Inconsistent stbl box for track ");
                trackCopyWithFormat = track2;
                sb.append(trackCopyWithFormat.id);
                sb.append(": remainingSynchronizationSamples ");
                sb.append(i7);
                sb.append(", remainingSamplesAtTimestampDelta ");
                sb.append(unsignedIntToInt7);
                sb.append(", remainingSamplesInChunk ");
                sb.append(i8);
                sb.append(", remainingTimestampDeltaChanges ");
                sb.append(i);
                sb.append(", remainingSamplesAtTimestampOffset ");
                sb.append(i9);
                if (z3) {
                    str = "";
                } else {
                    str = ", ctts invalid";
                }
                sb.append(str);
                Log.w(TAG, sb.toString());
                iArr4 = iArr3;
                jArr4 = jArrCopyOf;
                j4 = j16;
                j5 = j2;
            }
            int[] iArr15 = iArrCopyOf;
            j7 = trackCopyWithFormat.mediaDurationUs;
            if (j7 > 0) {
                jScaleLargeValue = Util.scaleLargeValue(j5 * 8, 1000000L, j7, RoundingMode.HALF_DOWN);
                if (jScaleLargeValue > 0 && jScaleLargeValue < 2147483647L) {
                    trackCopyWithFormat = trackCopyWithFormat.copyWithFormat(trackCopyWithFormat.format.buildUpon().setAverageBitrate((int) jScaleLargeValue).build());
                }
            }
            iArr5 = iArr15;
            jScaleLargeTimestamp = Util.scaleLargeTimestamp(j4, 1000000L, trackCopyWithFormat.timescale);
            jArr5 = trackCopyWithFormat.editListDurations;
            if (jArr5 == null) {
                Util.scaleLargeTimestampsInPlace(jArr4, 1000000L, trackCopyWithFormat.timescale);
                return new TrackSampleTable(trackCopyWithFormat, jArr3, iArr4, i3, jArr4, iArr5, jScaleLargeTimestamp);
            }
            if (jArr5.length == 1 && trackCopyWithFormat.type == 1 && jArr4.length >= 2) {
                j11 = ((long[]) Assertions.checkNotNull(trackCopyWithFormat.editListMediaTimes))[0];
                jScaleLargeTimestamp3 = Util.scaleLargeTimestamp(trackCopyWithFormat.editListDurations[0], trackCopyWithFormat.timescale, trackCopyWithFormat.movieTimescale) + j11;
                if (canApplyEditWithGaplessInfo(jArr4, j4, j11, jScaleLargeTimestamp3)) {
                    long j17 = j4 - jScaleLargeTimestamp3;
                    jScaleLargeTimestamp4 = Util.scaleLargeTimestamp(j11 - jArr4[0], trackCopyWithFormat.format.sampleRate, trackCopyWithFormat.timescale);
                    jScaleLargeTimestamp5 = Util.scaleLargeTimestamp(j17, trackCopyWithFormat.format.sampleRate, trackCopyWithFormat.timescale);
                    if ((jScaleLargeTimestamp4 == 0 || jScaleLargeTimestamp5 != 0) && jScaleLargeTimestamp4 <= 2147483647L && jScaleLargeTimestamp5 <= 2147483647L) {
                        gaplessInfoHolder.encoderDelay = (int) jScaleLargeTimestamp4;
                        gaplessInfoHolder.encoderPadding = (int) jScaleLargeTimestamp5;
                        Util.scaleLargeTimestampsInPlace(jArr4, 1000000L, trackCopyWithFormat.timescale);
                        return new TrackSampleTable(trackCopyWithFormat, jArr3, iArr4, i3, jArr4, iArr5, Util.scaleLargeTimestamp(trackCopyWithFormat.editListDurations[0], 1000000L, trackCopyWithFormat.movieTimescale));
                    }
                }
            }
            jArr6 = trackCopyWithFormat.editListDurations;
            if (jArr6.length != 1 && jArr6[0] == 0) {
                long j18 = ((long[]) Assertions.checkNotNull(trackCopyWithFormat.editListMediaTimes))[0];
                for (int i42 = 0; i42 < jArr4.length; i42++) {
                    jArr4[i42] = Util.scaleLargeTimestamp(jArr4[i42] - j18, 1000000L, trackCopyWithFormat.timescale);
                }
                return new TrackSampleTable(trackCopyWithFormat, jArr3, iArr4, i3, jArr4, iArr5, Util.scaleLargeTimestamp(j4 - j18, 1000000L, trackCopyWithFormat.timescale));
            }
            if (trackCopyWithFormat.type == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            iArr6 = new int[jArr6.length];
            iArr7 = new int[jArr6.length];
            jArr7 = (long[]) Assertions.checkNotNull(trackCopyWithFormat.editListMediaTimes);
            i18 = 0;
            z5 = false;
            i19 = 0;
            i20 = 0;
            while (true) {
                jArr8 = trackCopyWithFormat.editListDurations;
                if (i18 < jArr8.length) {
                    break;
                }
                int i43 = i3;
                j10 = jArr7[i18];
                if (j10 != -1) {
                    boolean z11 = z5;
                    int i44 = i19;
                    long jScaleLargeTimestamp6 = Util.scaleLargeTimestamp(jArr8[i18], trackCopyWithFormat.timescale, trackCopyWithFormat.movieTimescale);
                    iArr6[i18] = Util.binarySearchFloor(jArr4, j10, true, true);
                    long j19 = j10 + jScaleLargeTimestamp6;
                    iArr7[i18] = Util.binarySearchCeil(jArr4, j19, z4, false);
                    i30 = iArr6[i18];
                    while (true) {
                        i31 = iArr6[i18];
                        iArr12 = iArr5;
                        if (i31 < 0 || (iArr12[i31] & 1) != 0) {
                            break;
                        }
                        iArr6[i18] = i31 - 1;
                        iArr5 = iArr12;
                    }
                    if (i31 < 0) {
                        iArr6[i18] = i30;
                        while (true) {
                            i34 = iArr6[i18];
                            if (i34 >= iArr7[i18] || (iArr12[i34] & 1) != 0) {
                                break;
                            }
                            iArr6[i18] = i34 + 1;
                        }
                    }
                    if (trackCopyWithFormat.type == 2 && iArr6[i18] != iArr7[i18]) {
                        while (true) {
                            i33 = iArr7[i18];
                            if (i33 >= jArr4.length - 1 || jArr4[i33 + 1] > j19) {
                                break;
                            }
                            iArr7[i18] = i33 + 1;
                        }
                    }
                    int i45 = iArr7[i18];
                    i32 = iArr6[i18];
                    i29 = (i45 - i32) + i44;
                    if (i20 != i32) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z9 = z11 | z10;
                    i20 = i45;
                } else {
                    int i46 = i19;
                    iArr12 = iArr5;
                    z9 = z5;
                    i29 = i46;
                }
                i18++;
                iArr5 = iArr12;
                z5 = z9;
                iArr4 = iArr4;
                i19 = i29;
                i3 = i43;
                sampleCount = sampleCount;
            }
            iArr8 = iArr4;
            boolean z12 = z5;
            i21 = i19;
            i22 = i3;
            iArr9 = iArr5;
            if (i21 != sampleCount) {
                z6 = true;
            } else {
                z6 = false;
            }
            z7 = z12 | z6;
            if (z7) {
                jArr9 = new long[i21];
            } else {
                jArr9 = jArr3;
            }
            if (z7) {
                iArr10 = new int[i21];
            } else {
                iArr10 = iArr8;
            }
            if (z7) {
                i23 = 0;
            } else {
                i23 = i22;
            }
            if (z7) {
                iArr11 = new int[i21];
            } else {
                iArr11 = iArr9;
            }
            jArr10 = new long[i21];
            i24 = i23;
            i25 = 0;
            i26 = 0;
            j8 = 0;
            z8 = false;
            while (i25 < trackCopyWithFormat.editListDurations.length) {
                j9 = trackCopyWithFormat.editListMediaTimes[i25];
                i27 = iArr6[i25];
                int[] iArr16 = iArr6;
                i28 = iArr7[i25];
                int[] iArr17 = iArr7;
                if (z7) {
                    int i47 = i28 - i27;
                    System.arraycopy(jArr3, i27, jArr9, i26, i47);
                    System.arraycopy(iArr8, i27, iArr10, i26, i47);
                    System.arraycopy(iArr9, i27, iArr11, i26, i47);
                }
                int i48 = i24;
                while (i27 < i28) {
                    int i49 = i28;
                    int[] iArr18 = iArr9;
                    long jScaleLargeTimestamp7 = Util.scaleLargeTimestamp(j8, 1000000L, trackCopyWithFormat.movieTimescale);
                    long[] jArr13 = jArr9;
                    long[] jArr14 = jArr3;
                    jScaleLargeTimestamp2 = Util.scaleLargeTimestamp(jArr4[i27] - j9, 1000000L, trackCopyWithFormat.timescale);
                    if (jScaleLargeTimestamp2 < 0) {
                        z8 = true;
                    }
                    jArr10[i26] = jScaleLargeTimestamp7 + jScaleLargeTimestamp2;
                    if (!z7 && iArr10[i26] > i48) {
                        i48 = iArr8[i27];
                    }
                    i26++;
                    i27++;
                    iArr9 = iArr18;
                    i28 = i49;
                    jArr3 = jArr14;
                    jArr9 = jArr13;
                }
                j8 += trackCopyWithFormat.editListDurations[i25];
                i25++;
                iArr9 = iArr9;
                i24 = i48;
                iArr6 = iArr16;
                iArr7 = iArr17;
                jArr9 = jArr9;
            }
            long[] jArr15 = jArr9;
            long jScaleLargeTimestamp8 = Util.scaleLargeTimestamp(j8, 1000000L, trackCopyWithFormat.movieTimescale);
            if (z8) {
                trackCopyWithFormat = trackCopyWithFormat.copyWithFormat(trackCopyWithFormat.format.buildUpon().setHasPrerollSamples(true).build());
            }
            return new TrackSampleTable(trackCopyWithFormat, jArr15, iArr10, i24, jArr10, iArr11, jScaleLargeTimestamp8);
        }
        unsignedIntToInt2 = 0;
        unsignedIntToInt3 = -1;
        fixedSampleSize = stz2SampleSizeBox.getFixedSampleSize();
        String str3 = trackCopyWithFormat2.format.sampleMimeType;
        if (fixedSampleSize == -1) {
            z2 = false;
        } else {
            z2 = false;
        }
        if (z2) {
            int i310 = chunkIterator.length;
            jArr11 = new long[i310];
            iArr13 = new int[i310];
            while (chunkIterator.moveNext()) {
                int i311 = chunkIterator.index;
                jArr11[i311] = chunkIterator.offset;
                iArr13[i311] = chunkIterator.numSamples;
            }
            FixedSampleSizeRechunker.Results resultsRechunk2 = FixedSampleSizeRechunker.rechunk(fixedSampleSize, jArr11, iArr13, unsignedIntToInt8);
            jArr3 = resultsRechunk2.offsets;
            int[] iArr19 = resultsRechunk2.sizes;
            int i312 = resultsRechunk2.maximumSize;
            long[] jArr16 = resultsRechunk2.timestamps;
            iArrCopyOf = resultsRechunk2.flags;
            long j110 = resultsRechunk2.duration;
            j5 = resultsRechunk2.totalSize;
            trackCopyWithFormat = trackCopyWithFormat2;
            iArr4 = iArr19;
            i3 = i312;
            jArr4 = jArr16;
            j4 = j110;
        } else {
            jArr = new long[sampleCount];
            iArr = new int[sampleCount];
            jArr2 = new long[sampleCount];
            iArr2 = new int[sampleCount];
            i = unsignedIntToInt6;
            unsignedIntToInt4 = unsignedIntToInt3;
            i2 = unsignedIntToInt;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            unsignedIntToInt5 = 0;
            j = 0;
            j2 = 0;
            j3 = 0;
            Track track3 = trackCopyWithFormat2;
            i6 = 0;
            while (true) {
                if (i6 < sampleCount) {
                    i7 = unsignedIntToInt2;
                    jArr3 = jArr;
                    iArr3 = iArr;
                    jArrCopyOf = jArr2;
                    iArrCopyOf = iArr2;
                    i8 = i4;
                    break;
                }
                j6 = j3;
                i10 = i4;
                zMoveNext = true;
                while (i10 == 0) {
                    zMoveNext = chunkIterator.moveNext();
                    if (zMoveNext) {
                        break;
                        break;
                    }
                    int i313 = unsignedIntToInt8;
                    long j111 = chunkIterator.offset;
                    i10 = chunkIterator.numSamples;
                    j6 = j111;
                    unsignedIntToInt8 = i313;
                    unsignedIntToInt2 = unsignedIntToInt2;
                    sampleCount = sampleCount;
                }
                i11 = sampleCount;
                i12 = unsignedIntToInt8;
                i7 = unsignedIntToInt2;
                if (!zMoveNext) {
                    Log.w(TAG, "Unexpected end of chunk data");
                    long[] jArrCopyOf3 = Arrays.copyOf(jArr, i6);
                    int[] iArrCopyOf3 = Arrays.copyOf(iArr, i6);
                    jArrCopyOf = Arrays.copyOf(jArr2, i6);
                    iArrCopyOf = Arrays.copyOf(iArr2, i6);
                    jArr3 = jArrCopyOf3;
                    iArr3 = iArrCopyOf3;
                    sampleCount = i6;
                    i8 = i10;
                    break;
                }
                if (parsableByteArray5 != null) {
                    while (unsignedIntToInt5 == 0) {
                        unsignedIntToInt5 = parsableByteArray5.readUnsignedIntToInt();
                        i5 = parsableByteArray5.readInt();
                        i2--;
                    }
                    unsignedIntToInt5--;
                }
                int i314 = i5;
                jArr[i6] = j6;
                nextSampleSize = stz2SampleSizeBox.readNextSampleSize();
                iArr[i6] = nextSampleSize;
                ChunkIterator chunkIterator3 = chunkIterator;
                SampleSizeBox sampleSizeBox2 = stz2SampleSizeBox;
                j2 += (long) nextSampleSize;
                if (nextSampleSize > i3) {
                    i3 = nextSampleSize;
                }
                jArr2[i6] = j + ((long) i314);
                if (parsableByteArray4 == null) {
                    i13 = 1;
                } else {
                    i13 = 0;
                }
                iArr2[i6] = i13;
                if (i6 == unsignedIntToInt4) {
                    iArr2[i6] = 1;
                    i15 = i7 - 1;
                    if (i15 > 0) {
                        unsignedIntToInt4 = ((ParsableByteArray) Assertions.checkNotNull(parsableByteArray4)).readUnsignedIntToInt() - 1;
                    }
                    i14 = unsignedIntToInt4;
                } else {
                    i14 = unsignedIntToInt4;
                    i15 = i7;
                }
                j += (long) i12;
                unsignedIntToInt7--;
                if (unsignedIntToInt7 == 0) {
                    i16 = i12;
                    i17 = i;
                } else {
                    i16 = i12;
                    i17 = i;
                }
                int i410 = i16;
                long j112 = j6 + ((long) iArr[i6]);
                i4 = i10 - 1;
                i6++;
                j3 = j112;
                i5 = i314;
                unsignedIntToInt4 = i14;
                sampleCount = i11;
                chunkIterator = chunkIterator3;
                int i411 = i17;
                unsignedIntToInt8 = i410;
                i = i411;
                unsignedIntToInt2 = i15;
                stz2SampleSizeBox = sampleSizeBox2;
            }
            long j113 = j + ((long) i5);
            if (parsableByteArray5 != null) {
                z3 = true;
                break;
            }
            while (true) {
                if (i2 > 0) {
                    z3 = true;
                    break;
                }
                if (parsableByteArray5.readUnsignedIntToInt() != 0) {
                    z3 = false;
                    break;
                }
                parsableByteArray5.readInt();
                i2--;
            }
            if (i7 != 0) {
                i9 = unsignedIntToInt5;
                StringBuilder sb2 = new StringBuilder("Inconsistent stbl box for track ");
                trackCopyWithFormat = track3;
                sb2.append(trackCopyWithFormat.id);
                sb2.append(": remainingSynchronizationSamples ");
                sb2.append(i7);
                sb2.append(", remainingSamplesAtTimestampDelta ");
                sb2.append(unsignedIntToInt7);
                sb2.append(", remainingSamplesInChunk ");
                sb2.append(i8);
                sb2.append(", remainingTimestampDeltaChanges ");
                sb2.append(i);
                sb2.append(", remainingSamplesAtTimestampOffset ");
                sb2.append(i9);
                if (z3) {
                    str = ", ctts invalid";
                } else {
                    str = "";
                }
                sb2.append(str);
                Log.w(TAG, sb2.toString());
            } else {
                i9 = unsignedIntToInt5;
                StringBuilder sb3 = new StringBuilder("Inconsistent stbl box for track ");
                trackCopyWithFormat = track3;
                sb3.append(trackCopyWithFormat.id);
                sb3.append(": remainingSynchronizationSamples ");
                sb3.append(i7);
                sb3.append(", remainingSamplesAtTimestampDelta ");
                sb3.append(unsignedIntToInt7);
                sb3.append(", remainingSamplesInChunk ");
                sb3.append(i8);
                sb3.append(", remainingTimestampDeltaChanges ");
                sb3.append(i);
                sb3.append(", remainingSamplesAtTimestampOffset ");
                sb3.append(i9);
                if (z3) {
                    str = ", ctts invalid";
                } else {
                    str = "";
                }
                sb3.append(str);
                Log.w(TAG, sb3.toString());
            }
            iArr4 = iArr3;
            jArr4 = jArrCopyOf;
            j4 = j113;
            j5 = j2;
        }
        int[] iArr110 = iArrCopyOf;
        j7 = trackCopyWithFormat.mediaDurationUs;
        if (j7 > 0) {
            jScaleLargeValue = Util.scaleLargeValue(j5 * 8, 1000000L, j7, RoundingMode.HALF_DOWN);
            if (jScaleLargeValue > 0) {
                trackCopyWithFormat = trackCopyWithFormat.copyWithFormat(trackCopyWithFormat.format.buildUpon().setAverageBitrate((int) jScaleLargeValue).build());
            }
        }
        iArr5 = iArr110;
        jScaleLargeTimestamp = Util.scaleLargeTimestamp(j4, 1000000L, trackCopyWithFormat.timescale);
        jArr5 = trackCopyWithFormat.editListDurations;
        if (jArr5 == null) {
            Util.scaleLargeTimestampsInPlace(jArr4, 1000000L, trackCopyWithFormat.timescale);
            return new TrackSampleTable(trackCopyWithFormat, jArr3, iArr4, i3, jArr4, iArr5, jScaleLargeTimestamp);
        }
        if (jArr5.length == 1) {
            j11 = ((long[]) Assertions.checkNotNull(trackCopyWithFormat.editListMediaTimes))[0];
            jScaleLargeTimestamp3 = Util.scaleLargeTimestamp(trackCopyWithFormat.editListDurations[0], trackCopyWithFormat.timescale, trackCopyWithFormat.movieTimescale) + j11;
            if (canApplyEditWithGaplessInfo(jArr4, j4, j11, jScaleLargeTimestamp3)) {
                long j114 = j4 - jScaleLargeTimestamp3;
                jScaleLargeTimestamp4 = Util.scaleLargeTimestamp(j11 - jArr4[0], trackCopyWithFormat.format.sampleRate, trackCopyWithFormat.timescale);
                jScaleLargeTimestamp5 = Util.scaleLargeTimestamp(j114, trackCopyWithFormat.format.sampleRate, trackCopyWithFormat.timescale);
                if (jScaleLargeTimestamp4 == 0) {
                    gaplessInfoHolder.encoderDelay = (int) jScaleLargeTimestamp4;
                    gaplessInfoHolder.encoderPadding = (int) jScaleLargeTimestamp5;
                    Util.scaleLargeTimestampsInPlace(jArr4, 1000000L, trackCopyWithFormat.timescale);
                    return new TrackSampleTable(trackCopyWithFormat, jArr3, iArr4, i3, jArr4, iArr5, Util.scaleLargeTimestamp(trackCopyWithFormat.editListDurations[0], 1000000L, trackCopyWithFormat.movieTimescale));
                }
                gaplessInfoHolder.encoderDelay = (int) jScaleLargeTimestamp4;
                gaplessInfoHolder.encoderPadding = (int) jScaleLargeTimestamp5;
                Util.scaleLargeTimestampsInPlace(jArr4, 1000000L, trackCopyWithFormat.timescale);
                return new TrackSampleTable(trackCopyWithFormat, jArr3, iArr4, i3, jArr4, iArr5, Util.scaleLargeTimestamp(trackCopyWithFormat.editListDurations[0], 1000000L, trackCopyWithFormat.movieTimescale));
            }
        }
        jArr6 = trackCopyWithFormat.editListDurations;
        if (jArr6.length != 1) {
        }
        if (trackCopyWithFormat.type == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        iArr6 = new int[jArr6.length];
        iArr7 = new int[jArr6.length];
        jArr7 = (long[]) Assertions.checkNotNull(trackCopyWithFormat.editListMediaTimes);
        i18 = 0;
        z5 = false;
        i19 = 0;
        i20 = 0;
        while (true) {
            jArr8 = trackCopyWithFormat.editListDurations;
            if (i18 < jArr8.length) {
                break;
                break;
            }
            int i412 = i3;
            j10 = jArr7[i18];
            if (j10 != -1) {
                boolean z13 = z5;
                int i413 = i19;
                long jScaleLargeTimestamp9 = Util.scaleLargeTimestamp(jArr8[i18], trackCopyWithFormat.timescale, trackCopyWithFormat.movieTimescale);
                iArr6[i18] = Util.binarySearchFloor(jArr4, j10, true, true);
                long j115 = j10 + jScaleLargeTimestamp9;
                iArr7[i18] = Util.binarySearchCeil(jArr4, j115, z4, false);
                i30 = iArr6[i18];
                while (true) {
                    i31 = iArr6[i18];
                    iArr12 = iArr5;
                    if (i31 < 0) {
                        break;
                    }
                    break;
                    break;
                    iArr6[i18] = i31 - 1;
                    iArr5 = iArr12;
                }
                if (i31 < 0) {
                    iArr6[i18] = i30;
                    while (true) {
                        i34 = iArr6[i18];
                        if (i34 >= iArr7[i18]) {
                            break;
                        }
                        break;
                        break;
                        iArr6[i18] = i34 + 1;
                    }
                }
                if (trackCopyWithFormat.type == 2) {
                    while (true) {
                        i33 = iArr7[i18];
                        if (i33 >= jArr4.length - 1) {
                            break;
                        }
                        break;
                        break;
                        iArr7[i18] = i33 + 1;
                    }
                }
                int i414 = iArr7[i18];
                i32 = iArr6[i18];
                i29 = (i414 - i32) + i413;
                if (i20 != i32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z9 = z13 | z10;
                i20 = i414;
            } else {
                int i415 = i19;
                iArr12 = iArr5;
                z9 = z5;
                i29 = i415;
            }
            i18++;
            iArr5 = iArr12;
            z5 = z9;
            iArr4 = iArr4;
            i19 = i29;
            i3 = i412;
            sampleCount = sampleCount;
        }
        iArr8 = iArr4;
        boolean z14 = z5;
        i21 = i19;
        i22 = i3;
        iArr9 = iArr5;
        if (i21 != sampleCount) {
            z6 = true;
        } else {
            z6 = false;
        }
        z7 = z14 | z6;
        if (z7) {
            jArr9 = new long[i21];
        } else {
            jArr9 = jArr3;
        }
        if (z7) {
            iArr10 = new int[i21];
        } else {
            iArr10 = iArr8;
        }
        if (z7) {
            i23 = 0;
        } else {
            i23 = i22;
        }
        if (z7) {
            iArr11 = new int[i21];
        } else {
            iArr11 = iArr9;
        }
        jArr10 = new long[i21];
        i24 = i23;
        i25 = 0;
        i26 = 0;
        j8 = 0;
        z8 = false;
        while (i25 < trackCopyWithFormat.editListDurations.length) {
            j9 = trackCopyWithFormat.editListMediaTimes[i25];
            i27 = iArr6[i25];
            int[] iArr111 = iArr6;
            i28 = iArr7[i25];
            int[] iArr112 = iArr7;
            if (z7) {
                int i416 = i28 - i27;
                System.arraycopy(jArr3, i27, jArr9, i26, i416);
                System.arraycopy(iArr8, i27, iArr10, i26, i416);
                System.arraycopy(iArr9, i27, iArr11, i26, i416);
            }
            int i417 = i24;
            while (i27 < i28) {
                int i418 = i28;
                int[] iArr113 = iArr9;
                long jScaleLargeTimestamp10 = Util.scaleLargeTimestamp(j8, 1000000L, trackCopyWithFormat.movieTimescale);
                long[] jArr17 = jArr9;
                long[] jArr18 = jArr3;
                jScaleLargeTimestamp2 = Util.scaleLargeTimestamp(jArr4[i27] - j9, 1000000L, trackCopyWithFormat.timescale);
                if (jScaleLargeTimestamp2 < 0) {
                    z8 = true;
                }
                jArr10[i26] = jScaleLargeTimestamp10 + jScaleLargeTimestamp2;
                if (!z7) {
                }
                i26++;
                i27++;
                iArr9 = iArr113;
                i28 = i418;
                jArr3 = jArr18;
                jArr9 = jArr17;
            }
            j8 += trackCopyWithFormat.editListDurations[i25];
            i25++;
            iArr9 = iArr9;
            i24 = i417;
            iArr6 = iArr111;
            iArr7 = iArr112;
            jArr9 = jArr9;
        }
        long[] jArr19 = jArr9;
        long jScaleLargeTimestamp11 = Util.scaleLargeTimestamp(j8, 1000000L, trackCopyWithFormat.movieTimescale);
        if (z8) {
            trackCopyWithFormat = trackCopyWithFormat.copyWithFormat(trackCopyWithFormat.format.buildUpon().setHasPrerollSamples(true).build());
        }
        return new TrackSampleTable(trackCopyWithFormat, jArr19, iArr10, i24, jArr10, iArr11, jScaleLargeTimestamp11);
    }

    @Nullable
    private static EyesData parseStereoViewBox(ParsableByteArray parsableByteArray, int i, int i2) throws ParserException {
        parsableByteArray.setPosition(i + 8);
        int position = parsableByteArray.getPosition();
        while (position - i < i2) {
            parsableByteArray.setPosition(position);
            int i3 = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(i3 > 0, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == 1937011305) {
                parsableByteArray.skipBytes(4);
                int unsignedByte = parsableByteArray.readUnsignedByte();
                return new EyesData(new StriData((unsignedByte & 1) == 1, (unsignedByte & 2) == 2, (unsignedByte & 8) == 8));
            }
            position += i3;
        }
        return null;
    }

    private static StsdData parseStsd(ParsableByteArray parsableByteArray, TkhdData tkhdData, @Nullable String str, @Nullable DrmInitData drmInitData, boolean z) throws ParserException {
        parsableByteArray.setPosition(12);
        int i = parsableByteArray.readInt();
        StsdData stsdData = new StsdData(i);
        for (int i2 = 0; i2 < i; i2++) {
            int position = parsableByteArray.getPosition();
            int i3 = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(i3 > 0, "childAtomSize must be positive");
            int i4 = parsableByteArray.readInt();
            if (i4 == 1635148593 || i4 == 1635148595 || i4 == 1701733238 || i4 == 1831958048 || i4 == 1836070006 || i4 == 1752589105 || i4 == 1751479857 || i4 == 1932670515 || i4 == 1211250227 || i4 == 1748121139 || i4 == 1987063864 || i4 == 1987063865 || i4 == 1635135537 || i4 == 1685479798 || i4 == 1685479729 || i4 == 1685481573 || i4 == 1685481521 || i4 == 1634760241) {
                parseVideoSampleEntry(parsableByteArray, i4, position, i3, tkhdData.id, str, tkhdData.rotationDegrees, drmInitData, stsdData, i2);
            } else if (i4 == 1836069985 || i4 == 1701733217 || i4 == 1633889587 || i4 == 1700998451 || i4 == 1633889588 || i4 == 1835823201 || i4 == 1685353315 || i4 == 1685353317 || i4 == 1685353320 || i4 == 1685353324 || i4 == 1685353336 || i4 == 1935764850 || i4 == 1935767394 || i4 == 1819304813 || i4 == 1936684916 || i4 == 1953984371 || i4 == 778924082 || i4 == 778924083 || i4 == 1835557169 || i4 == 1835560241 || i4 == 1634492771 || i4 == 1634492791 || i4 == 1970037111 || i4 == 1332770163 || i4 == 1716281667 || i4 == 1767992678 || i4 == 1768973165 || i4 == 1718641517) {
                parseAudioSampleEntry(parsableByteArray, i4, position, i3, tkhdData.id, str, z, drmInitData, stsdData, i2);
            } else if (i4 == 1414810956 || i4 == 1954034535 || i4 == 2004251764 || i4 == 1937010800 || i4 == 1664495672 || i4 == 1836070003) {
                parseTextSampleEntry(parsableByteArray, i4, position, i3, tkhdData, str, stsdData);
            } else if (i4 == 1835365492) {
                parseMetaDataSampleEntry(parsableByteArray, i4, position, tkhdData.id, stsdData);
            } else if (i4 == 1667329389) {
                stsdData.format = new Format.Builder().setId(tkhdData.id).setSampleMimeType(MimeTypes.APPLICATION_CAMERA_MOTION).build();
            }
            parsableByteArray.setPosition(position + i3);
        }
        return stsdData;
    }

    private static void parseTextSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, TkhdData tkhdData, @Nullable String str, StsdData stsdData) {
        parsableByteArray.setPosition(i2 + 16);
        String str2 = MimeTypes.APPLICATION_TTML;
        O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OOf = null;
        long j = Long.MAX_VALUE;
        if (i != 1414810956) {
            if (i == 1954034535) {
                int i4 = i3 - 16;
                byte[] bArr = new byte[i4];
                parsableByteArray.readBytes(bArr, 0, i4);
                o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OOf = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of(bArr);
                str2 = MimeTypes.APPLICATION_TX3G;
            } else if (i == 2004251764) {
                str2 = MimeTypes.APPLICATION_MP4VTT;
            } else if (i == 1937010800) {
                j = 0;
            } else if (i == 1664495672) {
                stsdData.requiredSampleTransformation = 1;
                str2 = MimeTypes.APPLICATION_MP4CEA608;
            } else {
                if (i != 1836070003) {
                    throw new IllegalStateException();
                }
                int position = parsableByteArray.getPosition();
                parsableByteArray.skipBytes(4);
                if (parsableByteArray.readInt() == 1702061171) {
                    EsdsData esdsFromParent = parseEsdsFromParent(parsableByteArray, position);
                    if (esdsFromParent.initializationData == null || esdsFromParent.initializationData.length != 64) {
                        return;
                    }
                    o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OOf = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of(Util.getUtf8Bytes(formatVobsubIdx(esdsFromParent.initializationData, tkhdData.width, tkhdData.height)));
                    str2 = MimeTypes.APPLICATION_VOBSUB;
                } else {
                    str2 = null;
                }
            }
        }
        if (str2 != null) {
            stsdData.format = new Format.Builder().setId(tkhdData.id).setSampleMimeType(str2).setLanguage(str).setSubsampleOffsetUs(j).setInitializationData(o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OOf).build();
        }
    }

    private static TkhdData parseTkhd(ParsableByteArray parsableByteArray) {
        long j;
        int i;
        parsableByteArray.setPosition(8);
        int fullBoxVersion = parseFullBoxVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(fullBoxVersion == 0 ? 8 : 16);
        int i2 = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int position = parsableByteArray.getPosition();
        int i3 = fullBoxVersion == 0 ? 4 : 8;
        int i4 = 0;
        while (true) {
            j = C.TIME_UNSET;
            if (i4 >= i3) {
                parsableByteArray.skipBytes(i3);
                break;
            }
            if (parsableByteArray.getData()[position + i4] != -1) {
                long unsignedInt = fullBoxVersion == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
                if (unsignedInt == 0) {
                    break;
                }
                j = unsignedInt;
                break;
            }
            i4++;
        }
        parsableByteArray.skipBytes(10);
        int unsignedShort = parsableByteArray.readUnsignedShort();
        parsableByteArray.skipBytes(4);
        int i5 = parsableByteArray.readInt();
        int i6 = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int i7 = parsableByteArray.readInt();
        int i8 = parsableByteArray.readInt();
        if (i5 == 0 && i6 == 65536 && ((i7 == -65536 || i7 == 65536) && i8 == 0)) {
            i = 90;
        } else if (i5 == 0 && i6 == -65536 && ((i7 == 65536 || i7 == -65536) && i8 == 0)) {
            i = 270;
        } else {
            i = ((i5 == -65536 || i5 == 65536) && i6 == 0 && i7 == 0 && i8 == -65536) ? 180 : 0;
        }
        parsableByteArray.skipBytes(16);
        short s = parsableByteArray.readShort();
        parsableByteArray.skipBytes(2);
        return new TkhdData(i2, j, unsignedShort, i, s, parsableByteArray.readShort());
    }

    @Nullable
    public static Track parseTrak(Mp4Box.ContainerBox containerBox, Mp4Box.LeafBox leafBox, long j, @Nullable DrmInitData drmInitData, boolean z, boolean z2) throws ParserException {
        long[] jArr;
        long[] jArr2;
        Format formatBuild;
        Mp4Box.ContainerBox containerBoxOfType;
        Pair<long[], long[]> edts;
        Mp4Box.ContainerBox containerBox2 = (Mp4Box.ContainerBox) Assertions.checkNotNull(containerBox.getContainerBoxOfType(Mp4Box.TYPE_mdia));
        int trackTypeForHdlr = getTrackTypeForHdlr(parseHdlr(((Mp4Box.LeafBox) Assertions.checkNotNull(containerBox2.getLeafBoxOfType(Mp4Box.TYPE_hdlr))).data));
        if (trackTypeForHdlr == -1) {
            return null;
        }
        TkhdData tkhd = parseTkhd(((Mp4Box.LeafBox) Assertions.checkNotNull(containerBox.getLeafBoxOfType(Mp4Box.TYPE_tkhd))).data);
        long jScaleLargeTimestamp = C.TIME_UNSET;
        long j2 = j == C.TIME_UNSET ? tkhd.duration : j;
        long j3 = parseMvhd(leafBox.data).timescale;
        if (j2 != C.TIME_UNSET) {
            jScaleLargeTimestamp = Util.scaleLargeTimestamp(j2, 1000000L, j3);
        }
        long j4 = jScaleLargeTimestamp;
        Mp4Box.ContainerBox containerBox3 = (Mp4Box.ContainerBox) Assertions.checkNotNull(((Mp4Box.ContainerBox) Assertions.checkNotNull(containerBox2.getContainerBoxOfType(Mp4Box.TYPE_minf))).getContainerBoxOfType(Mp4Box.TYPE_stbl));
        MdhdData mdhd = parseMdhd(((Mp4Box.LeafBox) Assertions.checkNotNull(containerBox2.getLeafBoxOfType(Mp4Box.TYPE_mdhd))).data);
        Mp4Box.LeafBox leafBoxOfType = containerBox3.getLeafBoxOfType(Mp4Box.TYPE_stsd);
        if (leafBoxOfType == null) {
            throw ParserException.createForMalformedContainer("Malformed sample table (stbl) missing sample description (stsd)", null);
        }
        StsdData stsd = parseStsd(leafBoxOfType.data, tkhd, mdhd.language, drmInitData, z2);
        if (z || (containerBoxOfType = containerBox.getContainerBoxOfType(Mp4Box.TYPE_edts)) == null || (edts = parseEdts(containerBoxOfType)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) edts.first;
            jArr2 = (long[]) edts.second;
            jArr = jArr3;
        }
        if (stsd.format == null) {
            return null;
        }
        if (tkhd.alternateGroup != 0) {
            Mp4AlternateGroupData mp4AlternateGroupData = new Mp4AlternateGroupData(tkhd.alternateGroup);
            Format.Builder builderBuildUpon = stsd.format.buildUpon();
            Metadata metadata = stsd.format.metadata;
            formatBuild = builderBuildUpon.setMetadata(metadata != null ? metadata.copyWithAppendedEntries(mp4AlternateGroupData) : new Metadata(mp4AlternateGroupData)).build();
        } else {
            formatBuild = stsd.format;
        }
        return new Track(tkhd.id, trackTypeForHdlr, mdhd.timescale, j3, j4, mdhd.mediaDurationUs, formatBuild, stsd.requiredSampleTransformation, stsd.trackEncryptionBoxes, stsd.nalUnitLengthFieldLength, jArr, jArr2);
    }

    public static List<TrackSampleTable> parseTraks(Mp4Box.ContainerBox containerBox, GaplessInfoHolder gaplessInfoHolder, long j, @Nullable DrmInitData drmInitData, boolean z, boolean z2, O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) {
        Track track;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < containerBox.containerChildren.size(); i++) {
            Mp4Box.ContainerBox containerBox2 = containerBox.containerChildren.get(i);
            if (containerBox2.type == 1953653099 && (track = (Track) o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.apply(parseTrak(containerBox2, (Mp4Box.LeafBox) Assertions.checkNotNull(containerBox.getLeafBoxOfType(Mp4Box.TYPE_mvhd)), j, drmInitData, z, z2))) != null) {
                arrayList.add(parseStbl(track, (Mp4Box.ContainerBox) Assertions.checkNotNull(((Mp4Box.ContainerBox) Assertions.checkNotNull(((Mp4Box.ContainerBox) Assertions.checkNotNull(containerBox2.getContainerBoxOfType(Mp4Box.TYPE_mdia))).getContainerBoxOfType(Mp4Box.TYPE_minf))).getContainerBoxOfType(Mp4Box.TYPE_stbl)), gaplessInfoHolder));
            }
        }
        return arrayList;
    }

    public static Metadata parseUdta(Mp4Box.LeafBox leafBox) {
        ParsableByteArray parsableByteArray = leafBox.data;
        parsableByteArray.setPosition(8);
        Metadata metadata = new Metadata(new Metadata.Entry[0]);
        while (parsableByteArray.bytesLeft() >= 8) {
            int position = parsableByteArray.getPosition();
            int i = parsableByteArray.readInt();
            int i2 = parsableByteArray.readInt();
            if (i2 == 1835365473) {
                parsableByteArray.setPosition(position);
                metadata = metadata.copyWithAppendedEntriesFrom(parseUdtaMeta(parsableByteArray, position + i));
            } else if (i2 == 1936553057) {
                parsableByteArray.setPosition(position);
                metadata = metadata.copyWithAppendedEntriesFrom(SmtaAtomUtil.parseSmta(parsableByteArray, position + i));
            } else if (i2 == -1451722374) {
                metadata = metadata.copyWithAppendedEntriesFrom(parseXyz(parsableByteArray));
            }
            parsableByteArray.setPosition(position + i);
        }
        return metadata;
    }

    @Nullable
    private static Metadata parseUdtaMeta(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.skipBytes(8);
        maybeSkipRemainingMetaBoxHeaderBytes(parsableByteArray);
        while (parsableByteArray.getPosition() < i) {
            int position = parsableByteArray.getPosition();
            int i2 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1768715124) {
                parsableByteArray.setPosition(position);
                return parseIlst(parsableByteArray, position + i2);
            }
            parsableByteArray.setPosition(position + i2);
        }
        return null;
    }

    @Nullable
    public static VexuData parseVideoExtendedUsageBox(ParsableByteArray parsableByteArray, int i, int i2) throws ParserException {
        parsableByteArray.setPosition(i + 8);
        int position = parsableByteArray.getPosition();
        EyesData stereoViewBox = null;
        while (position - i < i2) {
            parsableByteArray.setPosition(position);
            int i3 = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(i3 > 0, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == 1702454643) {
                stereoViewBox = parseStereoViewBox(parsableByteArray, position, i3);
            }
            position += i3;
        }
        if (stereoViewBox == null) {
            return null;
        }
        return new VexuData(stereoViewBox);
    }

    /* JADX WARN: Code duplicated, block: B:207:0x04f2  */
    private static void parseVideoSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, int i4, @Nullable String str, int i5, @Nullable DrmInitData drmInitData, StsdData stsdData, int i6) throws ParserException {
        String str2;
        DrmInitData drmInitData2;
        int i7;
        int i8;
        int iIsoTransferCharacteristicsToColorTransfer;
        int i9;
        int i10;
        int i11;
        int i12 = i2;
        int i13 = i3;
        DrmInitData drmInitDataCopyWithSchemeType = drmInitData;
        StsdData stsdData2 = stsdData;
        parsableByteArray.setPosition(i12 + 16);
        parsableByteArray.skipBytes(16);
        int unsignedShort = parsableByteArray.readUnsignedShort();
        int unsignedShort2 = parsableByteArray.readUnsignedShort();
        parsableByteArray.skipBytes(50);
        int position = parsableByteArray.getPosition();
        int iIntValue = i;
        if (iIntValue == 1701733238) {
            Pair<Integer, TrackEncryptionBox> sampleEntryEncryptionData = parseSampleEntryEncryptionData(parsableByteArray, i12, i13);
            if (sampleEntryEncryptionData != null) {
                iIntValue = ((Integer) sampleEntryEncryptionData.first).intValue();
                drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType == null ? null : drmInitDataCopyWithSchemeType.copyWithSchemeType(((TrackEncryptionBox) sampleEntryEncryptionData.second).schemeType);
                stsdData2.trackEncryptionBoxes[i6] = (TrackEncryptionBox) sampleEntryEncryptionData.second;
            }
            parsableByteArray.setPosition(position);
        }
        String str3 = "video/3gpp";
        if (iIntValue == 1831958048) {
            str2 = "video/mpeg";
        } else {
            str2 = iIntValue == 1211250227 ? "video/3gpp" : null;
        }
        int i14 = 8;
        List<byte[]> listO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = null;
        int i15 = 8;
        float paspFromParent = 1.0f;
        ByteBuffer byteBufferAllocateHdrStaticInfo = null;
        String str4 = null;
        byte[] projFromParent = null;
        int i16 = -1;
        int i17 = -1;
        int i18 = -1;
        int i19 = -1;
        int i20 = -1;
        int iIsoColorPrimariesToColorSpace = -1;
        int i21 = -1;
        int iIsoTransferCharacteristicsToColorTransfer2 = -1;
        BtrtData btrtFromParent = null;
        EsdsData esdsFromParent = null;
        NalUnitUtil.H265VpsData h265VpsData = null;
        boolean z = false;
        while (position - i12 < i13) {
            parsableByteArray.setPosition(position);
            int position2 = parsableByteArray.getPosition();
            int i22 = parsableByteArray.readInt();
            if (i22 == 0 && parsableByteArray.getPosition() - i12 == i13) {
                break;
            }
            ExtractorUtil.checkContainerInput(i22 > 0, "childAtomSize must be positive");
            int i23 = parsableByteArray.readInt();
            if (i23 == 1635148611) {
                ExtractorUtil.checkContainerInput(str2 == null, null);
                parsableByteArray.setPosition(position2 + 8);
                AvcConfig avcConfig = AvcConfig.parse(parsableByteArray);
                listO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = avcConfig.initializationData;
                stsdData2.nalUnitLengthFieldLength = avcConfig.nalUnitLengthFieldLength;
                if (!z) {
                    paspFromParent = avcConfig.pixelWidthHeightRatio;
                }
                String str5 = avcConfig.codecs;
                int i24 = avcConfig.maxNumReorderFrames;
                int i25 = avcConfig.colorSpace;
                int i26 = avcConfig.colorRange;
                int i27 = avcConfig.colorTransfer;
                int i28 = avcConfig.bitdepthLuma;
                drmInitData2 = drmInitDataCopyWithSchemeType;
                unsignedShort = unsignedShort;
                unsignedShort2 = unsignedShort2;
                iIntValue = iIntValue;
                i17 = i24;
                iIsoColorPrimariesToColorSpace = i25;
                i7 = i26;
                iIsoTransferCharacteristicsToColorTransfer2 = i27;
                i15 = avcConfig.bitdepthChroma;
                i14 = i28;
                str4 = str5;
                str2 = MimeTypes.VIDEO_H264;
            } else if (i23 == 1752589123) {
                ExtractorUtil.checkContainerInput(str2 == null, null);
                parsableByteArray.setPosition(position2 + 8);
                HevcConfig hevcConfig = HevcConfig.parse(parsableByteArray);
                listO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = hevcConfig.initializationData;
                stsdData2.nalUnitLengthFieldLength = hevcConfig.nalUnitLengthFieldLength;
                if (!z) {
                    paspFromParent = hevcConfig.pixelWidthHeightRatio;
                }
                int i29 = hevcConfig.maxNumReorderPics;
                int i30 = hevcConfig.maxSubLayers;
                String str6 = hevcConfig.codecs;
                int i31 = hevcConfig.stereoMode;
                if (i31 != -1) {
                    i16 = i31;
                }
                int i32 = hevcConfig.decodedWidth;
                int i33 = hevcConfig.decodedHeight;
                int i34 = hevcConfig.colorSpace;
                int i35 = hevcConfig.colorRange;
                int i36 = hevcConfig.colorTransfer;
                int i37 = hevcConfig.bitdepthLuma;
                int i38 = hevcConfig.bitdepthChroma;
                h265VpsData = hevcConfig.vpsData;
                drmInitData2 = drmInitDataCopyWithSchemeType;
                iIsoColorPrimariesToColorSpace = i34;
                i7 = i35;
                iIsoTransferCharacteristicsToColorTransfer2 = i36;
                i18 = i30;
                str2 = MimeTypes.VIDEO_H265;
                i19 = i32;
                i17 = i29;
                str4 = str6;
                i14 = i37;
                i20 = i33;
                i15 = i38;
            } else {
                drmInitData2 = drmInitDataCopyWithSchemeType;
                if (i23 == 1818785347) {
                    ExtractorUtil.checkContainerInput(MimeTypes.VIDEO_H265.equals(str2), "lhvC must follow hvcC atom");
                    NalUnitUtil.H265VpsData h265VpsData2 = h265VpsData;
                    ExtractorUtil.checkContainerInput(h265VpsData2 != null && h265VpsData2.layerInfos.size() >= 2, "must have at least two layers");
                    parsableByteArray.setPosition(position2 + 8);
                    HevcConfig layered = HevcConfig.parseLayered(parsableByteArray, (NalUnitUtil.H265VpsData) Assertions.checkNotNull(h265VpsData2));
                    ExtractorUtil.checkContainerInput(stsdData2.nalUnitLengthFieldLength == layered.nalUnitLengthFieldLength, "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms");
                    int i39 = layered.colorSpace;
                    int i40 = iIsoColorPrimariesToColorSpace;
                    if (i39 != -1) {
                        ExtractorUtil.checkContainerInput(i40 == i39, "colorSpace must be the same for both views");
                    }
                    int i41 = layered.colorRange;
                    int i42 = i21;
                    if (i41 != -1) {
                        ExtractorUtil.checkContainerInput(i42 == i41, "colorRange must be the same for both views");
                    }
                    int i43 = layered.colorTransfer;
                    if (i43 != -1) {
                        int i44 = iIsoTransferCharacteristicsToColorTransfer2;
                        i11 = i44;
                        ExtractorUtil.checkContainerInput(i44 == i43, "colorTransfer must be the same for both views");
                    } else {
                        i11 = iIsoTransferCharacteristicsToColorTransfer2;
                    }
                    ExtractorUtil.checkContainerInput(i14 == layered.bitdepthLuma, "bitdepthLuma must be the same for both views");
                    ExtractorUtil.checkContainerInput(i15 == layered.bitdepthChroma, "bitdepthChroma must be the same for both views");
                    if (listO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO != null) {
                        O0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oOBuilder = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.builder();
                        o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oOBuilder.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(listO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                        o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oOBuilder.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(layered.initializationData);
                        listO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oOBuilder.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
                    } else {
                        ExtractorUtil.checkContainerInput(false, "initializationData must be already set from hvcC atom");
                    }
                    String str7 = layered.codecs;
                    h265VpsData = h265VpsData2;
                    str2 = MimeTypes.VIDEO_MV_HEVC;
                    iIsoColorPrimariesToColorSpace = i40;
                    i7 = i42;
                    iIsoTransferCharacteristicsToColorTransfer2 = i11;
                    str4 = str7;
                } else {
                    iIsoColorPrimariesToColorSpace = iIsoColorPrimariesToColorSpace;
                    i7 = i21;
                    iIsoTransferCharacteristicsToColorTransfer2 = iIsoTransferCharacteristicsToColorTransfer2;
                    NalUnitUtil.H265VpsData h265VpsData3 = h265VpsData;
                    if (i23 == 1986361461) {
                        VexuData videoExtendedUsageBox = parseVideoExtendedUsageBox(parsableByteArray, position2, i22);
                        if (videoExtendedUsageBox == null || videoExtendedUsageBox.eyesData == null) {
                            i10 = i16;
                            i16 = i10;
                        } else if (h265VpsData3 == null || h265VpsData3.layerInfos.size() < 2) {
                            i10 = i16;
                            if (i10 == -1) {
                                i16 = videoExtendedUsageBox.eyesData.striData.eyeViewsReversed ? 5 : 4;
                            } else {
                                i16 = i10;
                            }
                        } else {
                            ExtractorUtil.checkContainerInput(videoExtendedUsageBox.hasBothEyeViews(), "both eye views must be marked as available");
                            ExtractorUtil.checkContainerInput(!videoExtendedUsageBox.eyesData.striData.eyeViewsReversed, "for MV-HEVC, eye_views_reversed must be set to false");
                            i10 = i16;
                            i16 = i10;
                        }
                        h265VpsData = h265VpsData3;
                        unsignedShort = unsignedShort;
                        unsignedShort2 = unsignedShort2;
                        iIntValue = iIntValue;
                        iIsoColorPrimariesToColorSpace = iIsoColorPrimariesToColorSpace;
                        iIsoTransferCharacteristicsToColorTransfer2 = iIsoTransferCharacteristicsToColorTransfer2;
                    } else {
                        int i45 = i16;
                        if (i23 == 1685480259 || i23 == 1685485123 || i23 == 1685485379) {
                            i8 = i45;
                            unsignedShort = unsignedShort;
                            unsignedShort2 = unsignedShort2;
                            iIntValue = iIntValue;
                            int i46 = i14;
                            int i47 = i15;
                            iIsoTransferCharacteristicsToColorTransfer = iIsoTransferCharacteristicsToColorTransfer2;
                            int i48 = i22 - 8;
                            byte[] bArr = new byte[i48];
                            parsableByteArray.readBytes(bArr, 0, i48);
                            if (listO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO != null) {
                                O0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oOBuilder2 = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.builder();
                                o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oOBuilder2.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(listO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                                o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oOBuilder2.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(bArr);
                                listO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oOBuilder2.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
                            } else {
                                ExtractorUtil.checkContainerInput(false, "initializationData must already be set from hvcC or avcC atom");
                            }
                            parsableByteArray.setPosition(position2 + 8);
                            DolbyVisionConfig dolbyVisionConfig = DolbyVisionConfig.parse(parsableByteArray);
                            if (dolbyVisionConfig != null) {
                                String str8 = dolbyVisionConfig.codecs;
                                str2 = MimeTypes.VIDEO_DOLBY_VISION;
                                str4 = str8;
                            }
                            iIsoColorPrimariesToColorSpace = iIsoColorPrimariesToColorSpace;
                            i15 = i47;
                            i14 = i46;
                        } else if (i23 == 1987076931) {
                            ExtractorUtil.checkContainerInput(str2 == null, null);
                            String str9 = iIntValue == 1987063864 ? MimeTypes.VIDEO_VP8 : MimeTypes.VIDEO_VP9;
                            parsableByteArray.setPosition(position2 + 12);
                            byte unsignedByte = (byte) parsableByteArray.readUnsignedByte();
                            byte unsignedByte2 = (byte) parsableByteArray.readUnsignedByte();
                            int unsignedByte3 = parsableByteArray.readUnsignedByte();
                            int i49 = unsignedByte3 >> 4;
                            byte b = (byte) ((unsignedByte3 >> 1) & 7);
                            if (str9.equals(MimeTypes.VIDEO_VP9)) {
                                listO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = CodecSpecificDataUtil.buildVp9CodecPrivateInitializationData(unsignedByte, unsignedByte2, (byte) i49, b);
                            }
                            boolean z2 = (unsignedByte3 & 1) != 0;
                            int unsignedByte4 = parsableByteArray.readUnsignedByte();
                            int unsignedByte5 = parsableByteArray.readUnsignedByte();
                            int iIsoColorPrimariesToColorSpace2 = ColorInfo.isoColorPrimariesToColorSpace(unsignedByte4);
                            int i50 = z2 ? 1 : 2;
                            iIsoTransferCharacteristicsToColorTransfer2 = ColorInfo.isoTransferCharacteristicsToColorTransfer(unsignedByte5);
                            iIsoColorPrimariesToColorSpace = iIsoColorPrimariesToColorSpace2;
                            i14 = i49;
                            i15 = i14;
                            h265VpsData = h265VpsData3;
                            i7 = i50;
                            str2 = str9;
                            i16 = i45;
                        } else if (i23 == 1635135811) {
                            int i51 = i22 - 8;
                            byte[] bArr2 = new byte[i51];
                            parsableByteArray.readBytes(bArr2, 0, i51);
                            listO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of(bArr2);
                            parsableByteArray.setPosition(position2 + 8);
                            ColorInfo av1c = parseAv1c(parsableByteArray);
                            int i52 = av1c.lumaBitdepth;
                            int i53 = av1c.chromaBitdepth;
                            int i54 = av1c.colorSpace;
                            int i55 = av1c.colorRange;
                            iIsoTransferCharacteristicsToColorTransfer2 = av1c.colorTransfer;
                            i15 = i53;
                            iIsoColorPrimariesToColorSpace = i54;
                            i7 = i55;
                            str2 = MimeTypes.VIDEO_AV1;
                            h265VpsData = h265VpsData3;
                            i14 = i52;
                            i16 = i45;
                        } else if (i23 == 1668050025) {
                            if (byteBufferAllocateHdrStaticInfo == null) {
                                byteBufferAllocateHdrStaticInfo = allocateHdrStaticInfo();
                            }
                            ByteBuffer byteBuffer = byteBufferAllocateHdrStaticInfo;
                            byteBuffer.position(21);
                            byteBuffer.putShort(parsableByteArray.readShort());
                            byteBuffer.putShort(parsableByteArray.readShort());
                            byteBufferAllocateHdrStaticInfo = byteBuffer;
                            unsignedShort = unsignedShort;
                            unsignedShort2 = unsignedShort2;
                            iIntValue = iIntValue;
                            iIsoColorPrimariesToColorSpace = iIsoColorPrimariesToColorSpace;
                            h265VpsData = h265VpsData3;
                            iIsoTransferCharacteristicsToColorTransfer2 = iIsoTransferCharacteristicsToColorTransfer2;
                            i16 = i45;
                        } else {
                            if (i23 == 1835295606) {
                                if (byteBufferAllocateHdrStaticInfo == null) {
                                    byteBufferAllocateHdrStaticInfo = allocateHdrStaticInfo();
                                }
                                ByteBuffer byteBuffer2 = byteBufferAllocateHdrStaticInfo;
                                short s = parsableByteArray.readShort();
                                short s2 = parsableByteArray.readShort();
                                iIntValue = iIntValue;
                                short s3 = parsableByteArray.readShort();
                                short s4 = parsableByteArray.readShort();
                                int i56 = i15;
                                short s5 = parsableByteArray.readShort();
                                int i57 = i14;
                                short s6 = parsableByteArray.readShort();
                                i8 = i45;
                                short s7 = parsableByteArray.readShort();
                                unsignedShort2 = unsignedShort2;
                                short s8 = parsableByteArray.readShort();
                                long unsignedInt = parsableByteArray.readUnsignedInt();
                                long unsignedInt2 = parsableByteArray.readUnsignedInt();
                                unsignedShort = unsignedShort;
                                byteBuffer2.position(1);
                                byteBuffer2.putShort(s5);
                                byteBuffer2.putShort(s6);
                                byteBuffer2.putShort(s);
                                byteBuffer2.putShort(s2);
                                byteBuffer2.putShort(s3);
                                byteBuffer2.putShort(s4);
                                byteBuffer2.putShort(s7);
                                byteBuffer2.putShort(s8);
                                byteBuffer2.putShort((short) (unsignedInt / Renderer.DEFAULT_DURATION_TO_PROGRESS_US));
                                byteBuffer2.putShort((short) (unsignedInt2 / Renderer.DEFAULT_DURATION_TO_PROGRESS_US));
                                byteBufferAllocateHdrStaticInfo = byteBuffer2;
                                i15 = i56;
                                i14 = i57;
                            } else {
                                i8 = i45;
                                unsignedShort = unsignedShort;
                                unsignedShort2 = unsignedShort2;
                                iIntValue = iIntValue;
                                int i58 = i14;
                                int i59 = i15;
                                if (i23 == 1681012275) {
                                    ExtractorUtil.checkContainerInput(str2 == null, null);
                                    str2 = str3;
                                } else if (i23 == 1702061171) {
                                    ExtractorUtil.checkContainerInput(str2 == null, null);
                                    esdsFromParent = parseEsdsFromParent(parsableByteArray, position2);
                                    String str10 = esdsFromParent.mimeType;
                                    byte[] bArr3 = esdsFromParent.initializationData;
                                    if (bArr3 != null) {
                                        listO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of(bArr3);
                                    }
                                    str2 = str10;
                                } else if (i23 == 1651798644) {
                                    btrtFromParent = parseBtrtFromParent(parsableByteArray, position2);
                                } else if (i23 == 1885434736) {
                                    paspFromParent = parsePaspFromParent(parsableByteArray, position2);
                                    iIsoColorPrimariesToColorSpace = iIsoColorPrimariesToColorSpace;
                                    i15 = i59;
                                    i14 = i58;
                                    iIsoTransferCharacteristicsToColorTransfer2 = iIsoTransferCharacteristicsToColorTransfer2;
                                    z = true;
                                    h265VpsData = h265VpsData3;
                                    i16 = i8;
                                } else if (i23 == 1937126244) {
                                    projFromParent = parseProjFromParent(parsableByteArray, position2, i22);
                                } else if (i23 == 1936995172) {
                                    int unsignedByte6 = parsableByteArray.readUnsignedByte();
                                    parsableByteArray.skipBytes(3);
                                    if (unsignedByte6 != 0) {
                                        i9 = i8;
                                    } else {
                                        int unsignedByte7 = parsableByteArray.readUnsignedByte();
                                        if (unsignedByte7 == 0) {
                                            i9 = 0;
                                        } else if (unsignedByte7 == 1) {
                                            i9 = 1;
                                        } else if (unsignedByte7 == 2) {
                                            i9 = 2;
                                        } else if (unsignedByte7 != 3) {
                                            i9 = i8;
                                        } else {
                                            i9 = 3;
                                        }
                                    }
                                    i15 = i59;
                                    i14 = i58;
                                    iIsoTransferCharacteristicsToColorTransfer2 = iIsoTransferCharacteristicsToColorTransfer2;
                                    h265VpsData = h265VpsData3;
                                    i16 = i9;
                                    iIsoColorPrimariesToColorSpace = iIsoColorPrimariesToColorSpace;
                                } else if (i23 == 1634760259) {
                                    int i60 = i22 - 12;
                                    byte[] bArr4 = new byte[i60];
                                    parsableByteArray.setPosition(position2 + 12);
                                    parsableByteArray.readBytes(bArr4, 0, i60);
                                    listO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of(bArr4);
                                    ColorInfo apvc = parseApvc(new ParsableByteArray(bArr4));
                                    int i61 = apvc.lumaBitdepth;
                                    int i62 = apvc.chromaBitdepth;
                                    int i63 = apvc.colorSpace;
                                    int i64 = apvc.colorRange;
                                    int i65 = apvc.colorTransfer;
                                    str2 = MimeTypes.VIDEO_APV;
                                    iIsoTransferCharacteristicsToColorTransfer2 = i65;
                                    i14 = i61;
                                    i15 = i62;
                                    iIsoColorPrimariesToColorSpace = i63;
                                    i7 = i64;
                                    h265VpsData = h265VpsData3;
                                    i16 = i8;
                                } else {
                                    if (i23 == 1668246642) {
                                        iIsoTransferCharacteristicsToColorTransfer = iIsoTransferCharacteristicsToColorTransfer2;
                                        if (iIsoColorPrimariesToColorSpace == -1 && iIsoTransferCharacteristicsToColorTransfer == -1) {
                                            int i66 = parsableByteArray.readInt();
                                            if (i66 == TYPE_nclx || i66 == TYPE_nclc) {
                                                int unsignedShort3 = parsableByteArray.readUnsignedShort();
                                                int unsignedShort4 = parsableByteArray.readUnsignedShort();
                                                parsableByteArray.skipBytes(2);
                                                boolean z3 = i22 == 19 && (parsableByteArray.readUnsignedByte() & 128) != 0;
                                                iIsoColorPrimariesToColorSpace = ColorInfo.isoColorPrimariesToColorSpace(unsignedShort3);
                                                int i67 = z3 ? 1 : 2;
                                                iIsoTransferCharacteristicsToColorTransfer = ColorInfo.isoTransferCharacteristicsToColorTransfer(unsignedShort4);
                                                i7 = i67;
                                            } else {
                                                Log.w(TAG, "Unsupported color type: " + Mp4Box.getBoxTypeString(i66));
                                            }
                                        }
                                        i15 = i59;
                                        i14 = i58;
                                    } else {
                                        iIsoTransferCharacteristicsToColorTransfer = iIsoTransferCharacteristicsToColorTransfer2;
                                    }
                                    iIsoColorPrimariesToColorSpace = iIsoColorPrimariesToColorSpace;
                                    i15 = i59;
                                    i14 = i58;
                                }
                                i15 = i59;
                                i14 = i58;
                            }
                            h265VpsData = h265VpsData3;
                            i16 = i8;
                        }
                        iIsoTransferCharacteristicsToColorTransfer2 = iIsoTransferCharacteristicsToColorTransfer;
                        h265VpsData = h265VpsData3;
                        i16 = i8;
                    }
                }
            }
            position += i22;
            i12 = i2;
            i13 = i3;
            stsdData2 = stsdData;
            str3 = str3;
            iIntValue = iIntValue;
            drmInitDataCopyWithSchemeType = drmInitData2;
            i21 = i7;
            unsignedShort2 = unsignedShort2;
            unsignedShort = unsignedShort;
        }
        DrmInitData drmInitData3 = drmInitDataCopyWithSchemeType;
        int i68 = unsignedShort;
        int i69 = unsignedShort2;
        int i70 = i14;
        int i71 = i16;
        int i72 = iIsoColorPrimariesToColorSpace;
        int i73 = i21;
        int i74 = iIsoTransferCharacteristicsToColorTransfer2;
        int i75 = i15;
        if (str2 == null) {
            return;
        }
        Format.Builder colorInfo = new Format.Builder().setId(i4).setSampleMimeType(str2).setCodecs(str4).setWidth(i68).setHeight(i69).setDecodedWidth(i19).setDecodedHeight(i20).setPixelWidthHeightRatio(paspFromParent).setRotationDegrees(i5).setProjectionData(projFromParent).setStereoMode(i71).setInitializationData(listO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).setMaxNumReorderSamples(i17).setMaxSubLayers(i18).setDrmInitData(drmInitData3).setLanguage(str).setColorInfo(new ColorInfo.Builder().setColorSpace(i72).setColorRange(i73).setColorTransfer(i74).setHdrStaticInfo(byteBufferAllocateHdrStaticInfo != null ? byteBufferAllocateHdrStaticInfo.array() : null).setLumaBitdepth(i70).setChromaBitdepth(i75).build());
        if (btrtFromParent != null) {
            colorInfo.setAverageBitrate(O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000OOoOOO00O00o0ooooooooO000ooooO0000(btrtFromParent.avgBitrate)).setPeakBitrate(O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000OOoOOO00O00o0ooooooooO000ooooO0000(btrtFromParent.maxBitrate));
        } else if (esdsFromParent != null) {
            colorInfo.setAverageBitrate(O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000OOoOOO00O00o0ooooooooO000ooooO0000(esdsFromParent.bitrate)).setPeakBitrate(O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000OOoOOO00O00o0ooooooooO000ooooO0000(esdsFromParent.peakBitrate));
        }
        stsdData.format = colorInfo.build();
    }

    @Nullable
    private static Metadata parseXyz(ParsableByteArray parsableByteArray) {
        short s = parsableByteArray.readShort();
        parsableByteArray.skipBytes(2);
        String string = parsableByteArray.readString(s);
        int iMax = Math.max(string.lastIndexOf(43), string.lastIndexOf(45));
        try {
            return new Metadata(new Mp4LocationData(Float.parseFloat(string.substring(0, iMax)), Float.parseFloat(string.substring(iMax, string.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static int vobsubYuvToRgb(int i) {
        int i2 = (i >> 16) & 255;
        int i3 = ((i >> 8) & 255) - 128;
        int i4 = (i & 255) - 128;
        return Util.constrainValue(((i4 * 17790) / 10000) + i2, 0, 255) | (Util.constrainValue(((i3 * 14075) / 10000) + i2, 0, 255) << 16) | (Util.constrainValue((i2 - ((i4 * 3455) / 10000)) - ((i3 * 7169) / 10000), 0, 255) << 8);
    }
}
