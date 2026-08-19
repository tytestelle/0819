package androidx.media3.extractor.jpeg;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SingleSampleExtractor;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class JpegExtractor implements Extractor {
    public static final int FLAG_READ_IMAGE = 1;
    private static final int JPEG_FILE_SIGNATURE = 65496;
    private static final int JPEG_FILE_SIGNATURE_LENGTH = 2;
    private final Extractor extractor;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public JpegExtractor() {
        this(0);
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
        this.extractor.init(extractorOutput);
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) {
        return this.extractor.read(extractorInput, positionHolder);
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
        this.extractor.release();
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j, long j2) {
        this.extractor.seek(j, j2);
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) {
        return this.extractor.sniff(extractorInput);
    }

    public JpegExtractor(int i) {
        if ((i & 1) != 0) {
            this.extractor = new SingleSampleExtractor(JPEG_FILE_SIGNATURE, 2, "image/jpeg");
        } else {
            this.extractor = new JpegMotionPhotoExtractor();
        }
    }
}
