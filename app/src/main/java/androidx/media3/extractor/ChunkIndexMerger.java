package androidx.media3.extractor;

import androidx.media3.common.util.UnstableApi;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class ChunkIndexMerger {
    private final Map<Long, ChunkIndex> chunkMap = new LinkedHashMap();

    public void add(ChunkIndex chunkIndex) {
        long[] jArr = chunkIndex.timesUs;
        if (jArr.length <= 0 || this.chunkMap.containsKey(Long.valueOf(jArr[0]))) {
            return;
        }
        this.chunkMap.put(Long.valueOf(chunkIndex.timesUs[0]), chunkIndex);
    }

    public void clear() {
        this.chunkMap.clear();
    }

    public ChunkIndex merge() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (ChunkIndex chunkIndex : this.chunkMap.values()) {
            arrayList.add(chunkIndex.sizes);
            arrayList2.add(chunkIndex.offsets);
            arrayList3.add(chunkIndex.durationsUs);
            arrayList4.add(chunkIndex.timesUs);
        }
        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()][]);
        long length = 0;
        for (int[] iArr2 : iArr) {
            length += (long) iArr2.length;
        }
        int i = (int) length;
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o("the total number of elements (%s) in the arrays must fit in an int", length, length == ((long) i));
        int[] iArr3 = new int[i];
        int length2 = 0;
        for (int[] iArr4 : iArr) {
            System.arraycopy(iArr4, 0, iArr3, length2, iArr4.length);
            length2 += iArr4.length;
        }
        return new ChunkIndex(iArr3, com.bumptech.glide.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), com.bumptech.glide.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), com.bumptech.glide.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0((long[][]) arrayList4.toArray(new long[arrayList4.size()][])));
    }

    public int size() {
        return this.chunkMap.size();
    }
}
