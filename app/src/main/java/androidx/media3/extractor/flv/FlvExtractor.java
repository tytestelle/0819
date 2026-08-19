package androidx.media3.extractor.flv;

import O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
import androidx.media3.common.C;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.IndexSeekMap;
import androidx.media3.extractor.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.recyclerview.widget.ItemTouchHelper;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class FlvExtractor implements Extractor {
    public static final ExtractorsFactory FACTORY = new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(21);
    private static final int FLV_HEADER_SIZE = 9;
    private static final int FLV_TAG = 4607062;
    private static final int FLV_TAG_HEADER_SIZE = 11;
    private static final int STATE_READING_FLV_HEADER = 1;
    private static final int STATE_READING_TAG_DATA = 4;
    private static final int STATE_READING_TAG_HEADER = 3;
    private static final int STATE_SKIPPING_TO_TAG_HEADER = 2;
    private static final int TAG_TYPE_AUDIO = 8;
    private static final int TAG_TYPE_SCRIPT_DATA = 18;
    private static final int TAG_TYPE_VIDEO = 9;
    private AudioTagPayloadReader audioReader;
    private int bytesToNextTagHeader;
    private ExtractorOutput extractorOutput;
    private long mediaTagTimestampOffsetUs;
    private boolean outputFirstSample;
    private boolean outputSeekMap;
    private int tagDataSize;
    private long tagTimestampUs;
    private int tagType;
    private VideoTagPayloadReader videoReader;
    private final ParsableByteArray scratch = new ParsableByteArray(4);
    private final ParsableByteArray headerBuffer = new ParsableByteArray(9);
    private final ParsableByteArray tagHeaderBuffer = new ParsableByteArray(11);
    private final ParsableByteArray tagData = new ParsableByteArray();
    private final ScriptTagPayloadReader metadataReader = new ScriptTagPayloadReader();
    private int state = 1;

    @RequiresNonNull({"extractorOutput"})
    private void ensureReadyForMediaOutput() {
        if (this.outputSeekMap) {
            return;
        }
        this.extractorOutput.seekMap(new SeekMap.Unseekable(C.TIME_UNSET));
        this.outputSeekMap = true;
    }

    private long getCurrentTimestampUs() {
        if (this.outputFirstSample) {
            return this.mediaTagTimestampOffsetUs + this.tagTimestampUs;
        }
        if (this.metadataReader.getDurationUs() == C.TIME_UNSET) {
            return 0L;
        }
        return this.tagTimestampUs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Extractor[] lambda$static$0() {
        return new Extractor[]{new FlvExtractor()};
    }

    private ParsableByteArray prepareTagData(ExtractorInput extractorInput) {
        if (this.tagDataSize > this.tagData.capacity()) {
            ParsableByteArray parsableByteArray = this.tagData;
            parsableByteArray.reset(new byte[Math.max(parsableByteArray.capacity() * 2, this.tagDataSize)], 0);
        } else {
            this.tagData.setPosition(0);
        }
        this.tagData.setLimit(this.tagDataSize);
        extractorInput.readFully(this.tagData.getData(), 0, this.tagDataSize);
        return this.tagData;
    }

    @RequiresNonNull({"extractorOutput"})
    private boolean readFlvHeader(ExtractorInput extractorInput) {
        if (!extractorInput.readFully(this.headerBuffer.getData(), 0, 9, true)) {
            return false;
        }
        this.headerBuffer.setPosition(0);
        this.headerBuffer.skipBytes(4);
        int unsignedByte = this.headerBuffer.readUnsignedByte();
        boolean z = (unsignedByte & 4) != 0;
        boolean z2 = (unsignedByte & 1) != 0;
        if (z && this.audioReader == null) {
            this.audioReader = new AudioTagPayloadReader(this.extractorOutput.track(8, 1));
        }
        if (z2 && this.videoReader == null) {
            this.videoReader = new VideoTagPayloadReader(this.extractorOutput.track(9, 2));
        }
        this.extractorOutput.endTracks();
        this.bytesToNextTagHeader = this.headerBuffer.readInt() - 5;
        this.state = 2;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0087  */
    /* JADX WARN: Code duplicated, block: B:27:0x008b  */
    @RequiresNonNull({"extractorOutput"})
    private boolean readTagData(ExtractorInput extractorInput) {
        boolean zConsume;
        boolean z;
        long j;
        long currentTimestampUs = getCurrentTimestampUs();
        int i = this.tagType;
        if (i == 8 && this.audioReader != null) {
            ensureReadyForMediaOutput();
            zConsume = this.audioReader.consume(prepareTagData(extractorInput), currentTimestampUs);
        } else {
            if (i != 9 || this.videoReader == null) {
                if (i != 18 || this.outputSeekMap) {
                    extractorInput.skipFully(this.tagDataSize);
                    zConsume = false;
                    z = false;
                } else {
                    zConsume = this.metadataReader.consume(prepareTagData(extractorInput), currentTimestampUs);
                    long durationUs = this.metadataReader.getDurationUs();
                    if (durationUs != C.TIME_UNSET) {
                        this.extractorOutput.seekMap(new IndexSeekMap(this.metadataReader.getKeyFrameTagPositions(), this.metadataReader.getKeyFrameTimesUs(), durationUs));
                        this.outputSeekMap = true;
                    }
                }
                if (!this.outputFirstSample && zConsume) {
                    this.outputFirstSample = true;
                    if (this.metadataReader.getDurationUs() == C.TIME_UNSET) {
                        j = -this.tagTimestampUs;
                    } else {
                        j = 0;
                    }
                    this.mediaTagTimestampOffsetUs = j;
                }
                this.bytesToNextTagHeader = 4;
                this.state = 2;
                return z;
            }
            ensureReadyForMediaOutput();
            zConsume = this.videoReader.consume(prepareTagData(extractorInput), currentTimestampUs);
        }
        z = true;
        if (!this.outputFirstSample) {
            this.outputFirstSample = true;
            if (this.metadataReader.getDurationUs() == C.TIME_UNSET) {
                j = -this.tagTimestampUs;
            } else {
                j = 0;
            }
            this.mediaTagTimestampOffsetUs = j;
        }
        this.bytesToNextTagHeader = 4;
        this.state = 2;
        return z;
    }

    private boolean readTagHeader(ExtractorInput extractorInput) {
        if (!extractorInput.readFully(this.tagHeaderBuffer.getData(), 0, 11, true)) {
            return false;
        }
        this.tagHeaderBuffer.setPosition(0);
        this.tagType = this.tagHeaderBuffer.readUnsignedByte();
        this.tagDataSize = this.tagHeaderBuffer.readUnsignedInt24();
        this.tagTimestampUs = this.tagHeaderBuffer.readUnsignedInt24();
        this.tagTimestampUs = (((long) (this.tagHeaderBuffer.readUnsignedByte() << 24)) | this.tagTimestampUs) * 1000;
        this.tagHeaderBuffer.skipBytes(3);
        this.state = 4;
        return true;
    }

    private void skipToTagHeader(ExtractorInput extractorInput) {
        extractorInput.skipFully(this.bytesToNextTagHeader);
        this.bytesToNextTagHeader = 0;
        this.state = 3;
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
        this.extractorOutput = extractorOutput;
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) {
        Assertions.checkStateNotNull(this.extractorOutput);
        while (true) {
            int i = this.state;
            if (i != 1) {
                if (i == 2) {
                    skipToTagHeader(extractorInput);
                } else if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException();
                    }
                    if (readTagData(extractorInput)) {
                        return 0;
                    }
                } else if (!readTagHeader(extractorInput)) {
                    return -1;
                }
            } else if (!readFlvHeader(extractorInput)) {
                return -1;
            }
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j, long j2) {
        if (j == 0) {
            this.state = 1;
            this.outputFirstSample = false;
        } else {
            this.state = 3;
        }
        this.bytesToNextTagHeader = 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) {
        extractorInput.peekFully(this.scratch.getData(), 0, 3);
        this.scratch.setPosition(0);
        if (this.scratch.readUnsignedInt24() != FLV_TAG) {
            return false;
        }
        extractorInput.peekFully(this.scratch.getData(), 0, 2);
        this.scratch.setPosition(0);
        if ((this.scratch.readUnsignedShort() & ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION) != 0) {
            return false;
        }
        extractorInput.peekFully(this.scratch.getData(), 0, 4);
        this.scratch.setPosition(0);
        int i = this.scratch.readInt();
        extractorInput.resetPeekPosition();
        extractorInput.advancePeekPosition(i);
        extractorInput.peekFully(this.scratch.getData(), 0, 4);
        this.scratch.setPosition(0);
        return this.scratch.readInt() == 0;
    }
}
