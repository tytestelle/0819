package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.DataReader;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.mp3.Mp3Extractor;
import com.google.common.collect.O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo;
import com.google.common.collect.O0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO;
import com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O;
import java.io.EOFException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class BundledExtractorsAdapter implements ProgressiveMediaExtractor {

    @Nullable
    private Extractor extractor;

    @Nullable
    private ExtractorInput extractorInput;
    private final ExtractorsFactory extractorsFactory;

    public BundledExtractorsAdapter(ExtractorsFactory extractorsFactory) {
        this.extractorsFactory = extractorsFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$init$0(Extractor extractor) {
        return extractor.getUnderlyingImplementation().getClass().getSimpleName();
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public void disableSeekingOnMp3Streams() {
        Extractor extractor = this.extractor;
        if (extractor == null) {
            return;
        }
        Extractor underlyingImplementation = extractor.getUnderlyingImplementation();
        if (underlyingImplementation instanceof Mp3Extractor) {
            ((Mp3Extractor) underlyingImplementation).disableSeeking();
        }
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public long getCurrentInputPosition() {
        ExtractorInput extractorInput = this.extractorInput;
        if (extractorInput != null) {
            return extractorInput.getPosition();
        }
        return -1L;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public void init(DataReader dataReader, Uri uri, Map<String, List<String>> map, long j, long j2, ExtractorOutput extractorOutput) throws UnrecognizedInputFormatException {
        DefaultExtractorInput defaultExtractorInput = new DefaultExtractorInput(dataReader, j, j2);
        this.extractorInput = defaultExtractorInput;
        if (this.extractor != null) {
            return;
        }
        Extractor[] extractorArrCreateExtractors = this.extractorsFactory.createExtractors(uri, map);
        O0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oOBuilderWithExpectedSize = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.builderWithExpectedSize(extractorArrCreateExtractors.length);
        boolean z = true;
        if (extractorArrCreateExtractors.length == 1) {
            this.extractor = extractorArrCreateExtractors[0];
        } else {
            for (Extractor extractor : extractorArrCreateExtractors) {
                try {
                    if (extractor.sniff(defaultExtractorInput)) {
                        this.extractor = extractor;
                        Assertions.checkState(true);
                        defaultExtractorInput.resetPeekPosition();
                        break;
                    } else {
                        o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oOBuilderWithExpectedSize.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(extractor.getSniffFailureDetails());
                        boolean z2 = this.extractor != null || defaultExtractorInput.getPosition() == j;
                        Assertions.checkState(z2);
                        defaultExtractorInput.resetPeekPosition();
                    }
                } catch (EOFException unused) {
                    if (this.extractor != null || defaultExtractorInput.getPosition() == j) {
                    }
                } catch (Throwable th) {
                    if (this.extractor == null && defaultExtractorInput.getPosition() != j) {
                        z = false;
                    }
                    Assertions.checkState(z);
                    defaultExtractorInput.resetPeekPosition();
                    throw th;
                }
                Assertions.checkState(z2);
                defaultExtractorInput.resetPeekPosition();
            }
            if (this.extractor == null) {
                throw new UnrecognizedInputFormatException("None of the available extractors (" + new com.google.common.base.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(", ").O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O0oOoo000OooOOOO00oOoooOO00oOooooo0(O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.copyOf(extractorArrCreateExtractors), new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(1))) + ") could read the stream.", (Uri) Assertions.checkNotNull(uri), o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oOBuilderWithExpectedSize.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO());
            }
        }
        this.extractor.init(extractorOutput);
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public int read(PositionHolder positionHolder) {
        return ((Extractor) Assertions.checkNotNull(this.extractor)).read((ExtractorInput) Assertions.checkNotNull(this.extractorInput), positionHolder);
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public void release() {
        Extractor extractor = this.extractor;
        if (extractor != null) {
            extractor.release();
            this.extractor = null;
        }
        this.extractorInput = null;
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public void seek(long j, long j2) {
        ((Extractor) Assertions.checkNotNull(this.extractor)).seek(j, j2);
    }
}
