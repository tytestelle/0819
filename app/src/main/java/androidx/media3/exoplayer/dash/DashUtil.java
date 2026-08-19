package androidx.media3.exoplayer.dash;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.exoplayer.dash.manifest.BaseUrl;
import androidx.media3.exoplayer.dash.manifest.DashManifest;
import androidx.media3.exoplayer.dash.manifest.DashManifestParser;
import androidx.media3.exoplayer.dash.manifest.Period;
import androidx.media3.exoplayer.dash.manifest.RangedUri;
import androidx.media3.exoplayer.dash.manifest.Representation;
import androidx.media3.exoplayer.source.chunk.BundledChunkExtractor;
import androidx.media3.exoplayer.source.chunk.ChunkExtractor;
import androidx.media3.exoplayer.source.chunk.InitializationChunk;
import androidx.media3.exoplayer.upstream.ParsingLoadable;
import androidx.media3.extractor.ChunkIndex;
import androidx.media3.extractor.mkv.MatroskaExtractor;
import androidx.media3.extractor.mp4.FragmentedMp4Extractor;
import androidx.media3.extractor.text.SubtitleParser;
import com.google.common.collect.O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class DashUtil {
    private DashUtil() {
    }

    public static DataSpec buildDataSpec(Representation representation, String str, RangedUri rangedUri, int i, Map<String, String> map) {
        return new DataSpec.Builder().setUri(rangedUri.resolveUri(str)).setPosition(rangedUri.start).setLength(rangedUri.length).setKey(resolveCacheKey(representation, rangedUri)).setFlags(i).setHttpRequestHeaders(map).build();
    }

    @Nullable
    private static Representation getFirstRepresentation(Period period, int i) {
        int adaptationSetIndex = period.getAdaptationSetIndex(i);
        if (adaptationSetIndex == -1) {
            return null;
        }
        List<Representation> list = period.adaptationSets.get(adaptationSetIndex).representations;
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Nullable
    public static ChunkIndex loadChunkIndex(DataSource dataSource, int i, Representation representation, int i2) {
        if (representation.getInitializationUri() == null) {
            return null;
        }
        ChunkExtractor chunkExtractorNewChunkExtractor = newChunkExtractor(i, representation.format);
        try {
            loadInitializationData(chunkExtractorNewChunkExtractor, dataSource, representation, i2, true);
            return chunkExtractorNewChunkExtractor.getChunkIndex();
        } finally {
            chunkExtractorNewChunkExtractor.release();
        }
    }

    @Nullable
    public static Format loadFormatWithDrmInitData(DataSource dataSource, Period period) {
        int i = 2;
        Representation firstRepresentation = getFirstRepresentation(period, 2);
        if (firstRepresentation == null) {
            i = 1;
            firstRepresentation = getFirstRepresentation(period, 1);
            if (firstRepresentation == null) {
                return null;
            }
        }
        Format format = firstRepresentation.format;
        Format formatLoadSampleFormat = loadSampleFormat(dataSource, i, firstRepresentation);
        return formatLoadSampleFormat == null ? format : formatLoadSampleFormat.withManifestFormatInfo(format);
    }

    private static void loadInitializationData(ChunkExtractor chunkExtractor, DataSource dataSource, Representation representation, int i, boolean z) {
        RangedUri rangedUri = (RangedUri) Assertions.checkNotNull(representation.getInitializationUri());
        if (z) {
            RangedUri indexUri = representation.getIndexUri();
            if (indexUri == null) {
                return;
            }
            RangedUri rangedUriAttemptMerge = rangedUri.attemptMerge(indexUri, ((BaseUrl) representation.baseUrls.get(i)).url);
            if (rangedUriAttemptMerge == null) {
                loadInitializationData(dataSource, representation, i, chunkExtractor, rangedUri);
                rangedUri = indexUri;
            } else {
                rangedUri = rangedUriAttemptMerge;
            }
        }
        loadInitializationData(dataSource, representation, i, chunkExtractor, rangedUri);
    }

    public static DashManifest loadManifest(DataSource dataSource, Uri uri) {
        return (DashManifest) ParsingLoadable.load(dataSource, new DashManifestParser(), uri, 4);
    }

    @Nullable
    public static Format loadSampleFormat(DataSource dataSource, int i, Representation representation, int i2) {
        if (representation.getInitializationUri() == null) {
            return null;
        }
        ChunkExtractor chunkExtractorNewChunkExtractor = newChunkExtractor(i, representation.format);
        try {
            loadInitializationData(chunkExtractorNewChunkExtractor, dataSource, representation, i2, false);
            return ((Format[]) Assertions.checkStateNotNull(chunkExtractorNewChunkExtractor.getSampleFormats()))[0];
        } finally {
            chunkExtractorNewChunkExtractor.release();
        }
    }

    private static ChunkExtractor newChunkExtractor(int i, Format format) {
        String str = format.containerMimeType;
        return new BundledChunkExtractor((str == null || !(str.startsWith(MimeTypes.VIDEO_WEBM) || str.startsWith(MimeTypes.AUDIO_WEBM))) ? new FragmentedMp4Extractor(SubtitleParser.Factory.UNSUPPORTED, 32) : new MatroskaExtractor(SubtitleParser.Factory.UNSUPPORTED, 2), i, format);
    }

    public static String resolveCacheKey(Representation representation, RangedUri rangedUri) {
        String cacheKey = representation.getCacheKey();
        return cacheKey != null ? cacheKey : rangedUri.resolveUri(((BaseUrl) representation.baseUrls.get(0)).url).toString();
    }

    public static void loadInitializationData(ChunkExtractor chunkExtractor, DataSource dataSource, Representation representation, boolean z) {
        loadInitializationData(chunkExtractor, dataSource, representation, 0, z);
    }

    @Nullable
    public static ChunkIndex loadChunkIndex(DataSource dataSource, int i, Representation representation) {
        return loadChunkIndex(dataSource, i, representation, 0);
    }

    private static void loadInitializationData(DataSource dataSource, Representation representation, int i, ChunkExtractor chunkExtractor, RangedUri rangedUri) {
        new InitializationChunk(dataSource, buildDataSpec(representation, ((BaseUrl) representation.baseUrls.get(i)).url, rangedUri, 0, O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.of()), representation.format, 0, null, chunkExtractor).load();
    }

    @Nullable
    public static Format loadSampleFormat(DataSource dataSource, int i, Representation representation) {
        return loadSampleFormat(dataSource, i, representation, 0);
    }

    @Deprecated
    public static DataSpec buildDataSpec(Representation representation, String str, RangedUri rangedUri, int i) {
        return buildDataSpec(representation, str, rangedUri, i, O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.of());
    }

    @Deprecated
    public static DataSpec buildDataSpec(Representation representation, RangedUri rangedUri, int i) {
        return buildDataSpec(representation, ((BaseUrl) representation.baseUrls.get(0)).url, rangedUri, i, O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.of());
    }
}
