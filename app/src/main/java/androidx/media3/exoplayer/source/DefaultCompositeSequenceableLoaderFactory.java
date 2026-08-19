package androidx.media3.exoplayer.source;

import androidx.media3.common.util.UnstableApi;
import com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class DefaultCompositeSequenceableLoaderFactory implements CompositeSequenceableLoaderFactory {
    @Override // androidx.media3.exoplayer.source.CompositeSequenceableLoaderFactory
    public SequenceableLoader create(List<? extends SequenceableLoader> list, List<List<Integer>> list2) {
        return new CompositeSequenceableLoader(list, list2);
    }

    @Override // androidx.media3.exoplayer.source.CompositeSequenceableLoaderFactory
    @Deprecated
    public SequenceableLoader createCompositeSequenceableLoader(SequenceableLoader... sequenceableLoaderArr) {
        return new CompositeSequenceableLoader(sequenceableLoaderArr);
    }

    @Override // androidx.media3.exoplayer.source.CompositeSequenceableLoaderFactory
    public SequenceableLoader empty() {
        return new CompositeSequenceableLoader(O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of(), O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of());
    }
}
