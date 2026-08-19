package androidx.media3.extractor.mp4;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class MimeTypeResolver {
    private MimeTypeResolver() {
    }

    public static String getContainerMimeType(Format format) {
        String str = format.sampleMimeType;
        if (MimeTypes.isVideo(str)) {
            return "video/mp4";
        }
        if (MimeTypes.isAudio(str)) {
            return "audio/mp4";
        }
        if (!MimeTypes.isImage(str)) {
            return MimeTypes.APPLICATION_MP4;
        }
        if (Objects.equals(str, MimeTypes.IMAGE_HEIC)) {
            return MimeTypes.IMAGE_HEIF;
        }
        return Objects.equals(str, MimeTypes.IMAGE_AVIF) ? MimeTypes.IMAGE_AVIF : MimeTypes.APPLICATION_MP4;
    }

    public static String getContainerMimeType(List<TrackSampleTable> list) {
        Iterator<TrackSampleTable> it = list.iterator();
        boolean z = false;
        String str = null;
        while (it.hasNext()) {
            String str2 = it.next().track.format.sampleMimeType;
            if (MimeTypes.isVideo(str2)) {
                return "video/mp4";
            }
            if (MimeTypes.isAudio(str2)) {
                z = true;
            } else if (MimeTypes.isImage(str2)) {
                if (Objects.equals(str2, MimeTypes.IMAGE_HEIC)) {
                    str = MimeTypes.IMAGE_HEIF;
                } else if (Objects.equals(str2, MimeTypes.IMAGE_AVIF)) {
                    str = MimeTypes.IMAGE_AVIF;
                }
            }
        }
        if (z) {
            return "audio/mp4";
        }
        return str != null ? str : MimeTypes.APPLICATION_MP4;
    }
}
