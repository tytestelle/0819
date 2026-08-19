package xyz.doikki.videoplayer.exo;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.media3.common.FileTypes;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.hls.HlsExtractorFactory;
import androidx.media3.exoplayer.hls.HlsMediaChunkExtractor;
import androidx.media3.exoplayer.hls.HlsTrackMetadataEntry;
import androidx.media3.exoplayer.hls.WebvttExtractor;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.mp3.Mp3Extractor;
import androidx.media3.extractor.mp4.FragmentedMp4Extractor;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.ts.Ac3Extractor;
import androidx.media3.extractor.ts.Ac4Extractor;
import androidx.media3.extractor.ts.AdtsExtractor;
import androidx.media3.extractor.ts.DefaultTsPayloadReaderFactory;
import com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
import com.google.androidx.media3.exoplayer.extractor.ts.MyTsExtractor;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class MyHlsExtractorFactory implements HlsExtractorFactory {
    private static final int[] DEFAULT_EXTRACTOR_ORDER = {8, 13, 11, 2, 0, 1, 7};
    private final boolean exposeCea608WhenMissingDeclarations;
    private final int payloadReaderFactoryFlags;

    public MyHlsExtractorFactory() {
        this(0, true);
    }

    private static void addFileTypeIfValidAndNotPresent(int i, List<Integer> list) {
        int[] iArr = DEFAULT_EXTRACTOR_ORDER;
        if (O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(iArr, i, 0, iArr.length) == -1 || list.contains(Integer.valueOf(i))) {
            return;
        }
        list.add(Integer.valueOf(i));
    }

    @Nullable
    @SuppressLint({"SwitchIntDef"})
    private Object createExtractorByFileType(int i, Format format, @Nullable List<Format> list, TimestampAdjuster timestampAdjuster) {
        if (i == 0) {
            return new Ac3Extractor();
        }
        if (i == 1) {
            return new Ac4Extractor();
        }
        if (i == 2) {
            return new AdtsExtractor();
        }
        if (i == 7) {
            return new Mp3Extractor(0, 0L);
        }
        if (i == 8) {
            return createFragmentedMp4Extractor(timestampAdjuster, format, list);
        }
        if (i == 11) {
            return createTsExtractor(this.payloadReaderFactoryFlags, this.exposeCea608WhenMissingDeclarations, format, list, timestampAdjuster);
        }
        if (i != 13) {
            return null;
        }
        return new WebvttExtractor(format.language, timestampAdjuster);
    }

    private static FragmentedMp4Extractor createFragmentedMp4Extractor(TimestampAdjuster timestampAdjuster, Format format, @Nullable List<Format> list) {
        int i = isFmp4Variant(format) ? 4 : 0;
        if (list == null) {
            list = Collections.emptyList();
        }
        return new FragmentedMp4Extractor(i, timestampAdjuster, null, list);
    }

    private static MyTsExtractor createTsExtractor(int i, boolean z, Format format, @Nullable List<Format> list, TimestampAdjuster timestampAdjuster) {
        int i2 = i | 16;
        if (list != null) {
            i2 = i | 48;
        } else {
            list = z ? Collections.singletonList(new Format.Builder().setSampleMimeType(MimeTypes.APPLICATION_CEA608).build()) : Collections.emptyList();
        }
        String str = format.codecs;
        if (!TextUtils.isEmpty(str)) {
            if (!MimeTypes.containsCodecsCorrespondingToMimeType(str, MimeTypes.AUDIO_AAC)) {
                i2 |= 2;
            }
            if (!MimeTypes.containsCodecsCorrespondingToMimeType(str, MimeTypes.VIDEO_H264)) {
                i2 |= 4;
            }
        }
        return new MyTsExtractor(2, timestampAdjuster, new DefaultTsPayloadReaderFactory(i2, list));
    }

    private static boolean isFmp4Variant(Format format) {
        Metadata metadata = format.metadata;
        if (metadata == null) {
            return false;
        }
        for (int i = 0; i < metadata.length(); i++) {
            Metadata.Entry entry = metadata.get(i);
            if (entry instanceof HlsTrackMetadataEntry) {
                return !((HlsTrackMetadataEntry) entry).variantInfos.isEmpty();
            }
        }
        return false;
    }

    private static boolean sniffQuietly(Extractor extractor, ExtractorInput extractorInput) {
        try {
            return extractor.sniff(extractorInput);
        } catch (EOFException unused) {
            return false;
        } finally {
            extractorInput.resetPeekPosition();
        }
    }

    @Override // androidx.media3.exoplayer.hls.HlsExtractorFactory
    public /* bridge */ /* synthetic */ HlsMediaChunkExtractor createExtractor(Uri uri, Format format, @Nullable List list, TimestampAdjuster timestampAdjuster, Map map, ExtractorInput extractorInput, PlayerId playerId) {
        return createExtractor(uri, format, (List<Format>) list, timestampAdjuster, (Map<String, List<String>>) map, extractorInput, playerId);
    }

    @Override // androidx.media3.exoplayer.hls.HlsExtractorFactory
    public final /* synthetic */ HlsExtractorFactory experimentalParseSubtitlesDuringExtraction(boolean z) {
        return androidx.media3.exoplayer.hls.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, z);
    }

    @Override // androidx.media3.exoplayer.hls.HlsExtractorFactory
    public final /* synthetic */ HlsExtractorFactory experimentalSetCodecsToParseWithinGopSampleDependencies(int i) {
        return androidx.media3.exoplayer.hls.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this, i);
    }

    @Override // androidx.media3.exoplayer.hls.HlsExtractorFactory
    public final /* synthetic */ Format getOutputTextFormat(Format format) {
        return androidx.media3.exoplayer.hls.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this, format);
    }

    @Override // androidx.media3.exoplayer.hls.HlsExtractorFactory
    public final /* synthetic */ HlsExtractorFactory setSubtitleParserFactory(SubtitleParser.Factory factory) {
        return androidx.media3.exoplayer.hls.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this, factory);
    }

    public MyHlsExtractorFactory(int i, boolean z) {
        this.payloadReaderFactoryFlags = i;
        this.exposeCea608WhenMissingDeclarations = z;
    }

    @Override // androidx.media3.exoplayer.hls.HlsExtractorFactory
    public MyBundledHlsMediaChunkExtractor createExtractor(Uri uri, Format format, @Nullable List<Format> list, TimestampAdjuster timestampAdjuster, Map<String, List<String>> map, ExtractorInput extractorInput, PlayerId playerId) {
        int iInferFileTypeFromMimeType = FileTypes.inferFileTypeFromMimeType(format.sampleMimeType);
        int iInferFileTypeFromResponseHeaders = FileTypes.inferFileTypeFromResponseHeaders(map);
        int iInferFileTypeFromUri = FileTypes.inferFileTypeFromUri(uri);
        int[] iArr = DEFAULT_EXTRACTOR_ORDER;
        ArrayList arrayList = new ArrayList(iArr.length);
        addFileTypeIfValidAndNotPresent(iInferFileTypeFromMimeType, arrayList);
        addFileTypeIfValidAndNotPresent(iInferFileTypeFromResponseHeaders, arrayList);
        addFileTypeIfValidAndNotPresent(iInferFileTypeFromUri, arrayList);
        for (int i : iArr) {
            addFileTypeIfValidAndNotPresent(i, arrayList);
        }
        extractorInput.resetPeekPosition();
        Extractor extractor = null;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            int iIntValue = ((Integer) arrayList.get(i2)).intValue();
            Extractor extractor2 = (Extractor) Assertions.checkNotNull(createExtractorByFileType(iIntValue, format, list, timestampAdjuster));
            if (sniffQuietly(extractor2, extractorInput)) {
                return new MyBundledHlsMediaChunkExtractor(extractor2, format, timestampAdjuster);
            }
            if (extractor == null && (iIntValue == iInferFileTypeFromMimeType || iIntValue == iInferFileTypeFromResponseHeaders || iIntValue == iInferFileTypeFromUri || iIntValue == 11)) {
                extractor = extractor2;
            }
        }
        return new MyBundledHlsMediaChunkExtractor((Extractor) Assertions.checkNotNull(extractor), format, timestampAdjuster);
    }
}
