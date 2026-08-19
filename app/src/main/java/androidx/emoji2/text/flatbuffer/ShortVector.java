package androidx.emoji2.text.flatbuffer;

import com.tencent.smtt.export.external.interfaces.ISelectionInterface;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class ShortVector extends BaseVector {
    public ShortVector __assign(int i, ByteBuffer byteBuffer) {
        __reset(i, 2, byteBuffer);
        return this;
    }

    public short get(int i) {
        return this.bb.getShort(__element(i));
    }

    public int getAsUnsigned(int i) {
        return get(i) & ISelectionInterface.HELD_NOTHING;
    }
}
