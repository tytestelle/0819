package androidx.media3.exoplayer.upstream;

import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface LoaderErrorThrower {

    public static final class Placeholder implements LoaderErrorThrower {
        @Override // androidx.media3.exoplayer.upstream.LoaderErrorThrower
        public void maybeThrowError() {
        }

        @Override // androidx.media3.exoplayer.upstream.LoaderErrorThrower
        public void maybeThrowError(int i) {
        }
    }

    void maybeThrowError();

    void maybeThrowError(int i);
}
