package androidx.collection;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
import O0000oOoOo0OOo0O0o0O0oOoOo00OOOo0OO00O0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
import android.support.v4.media.MediaDescriptionCompat;
import androidx.annotation.IntRange;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
import kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
import kotlin.jvm.internal.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;

/* JADX INFO: loaded from: classes.dex */
public abstract class ObjectList<E> {
    public int _size;
    public Object[] content;

    /* JADX INFO: renamed from: androidx.collection.ObjectList$toString$1, reason: invalid class name */
    public static final class AnonymousClass1 extends O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO implements Function1<E, CharSequence> {
        final /* synthetic */ ObjectList<E> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ObjectList<E> objectList) {
            super(1);
            this.this$0 = objectList;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(E e) {
            return e == this.this$0 ? "(this)" : String.valueOf(e);
        }
    }

    public /* synthetic */ ObjectList(int i, O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) {
        this(i);
    }

    public static /* synthetic */ void getContent$annotations() {
    }

    public static /* synthetic */ void get_size$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String joinToString$default(ObjectList objectList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i2 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i2 & 4) == 0 ? charSequence3 : "";
        int i3 = (i2 & 8) != 0 ? -1 : i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            function1 = null;
        }
        return objectList.joinToString(charSequence, charSequence5, charSequence6, i3, charSequence7, function1);
    }

    public final boolean any() {
        return isNotEmpty();
    }

    public abstract List<E> asList();

    public final boolean contains(E e) {
        return indexOf(e) >= 0;
    }

    public final boolean containsAll(E[] elements) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(elements, "elements");
        for (E e : elements) {
            if (!contains(e)) {
                return false;
            }
        }
        return true;
    }

    public final int count() {
        return this._size;
    }

    public final E elementAt(@IntRange(from = MediaDescriptionCompat.BT_FOLDER_TYPE_MIXED) int i) {
        if (i >= 0 && i < this._size) {
            return (E) this.content[i];
        }
        StringBuilder sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(i, "Index ", " must be in 0..");
        sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.append(this._size - 1);
        throw new IndexOutOfBoundsException(sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.toString());
    }

    public final E elementAtOrElse(@IntRange(from = MediaDescriptionCompat.BT_FOLDER_TYPE_MIXED) int i, Function1<? super Integer, ? extends E> defaultValue) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(defaultValue, "defaultValue");
        return (i < 0 || i >= this._size) ? defaultValue.invoke(Integer.valueOf(i)) : (E) this.content[i];
    }

    public boolean equals(Object obj) {
        if (obj instanceof ObjectList) {
            ObjectList objectList = (ObjectList) obj;
            int i = objectList._size;
            int i2 = this._size;
            if (i == i2) {
                Object[] objArr = this.content;
                Object[] objArr2 = objectList.content;
                O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOoO0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 = org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000(0, i2);
                int i3 = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOoO0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.f1676O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                int i4 = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOoO0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.f1677O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                if (i3 > i4) {
                    return true;
                }
                while (O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(objArr[i3], objArr2[i3])) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final E first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ObjectList is empty.");
        }
        return (E) this.content[0];
    }

    public final E firstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return get(0);
    }

    public final <R> R fold(R r, Function2<? super R, ? super E, ? extends R> operation) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(operation, "operation");
        Object[] objArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            r = operation.invoke(r, objArr[i2]);
        }
        return r;
    }

    public final <R> R foldIndexed(R r, Function3<? super Integer, ? super R, ? super E, ? extends R> operation) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(operation, "operation");
        Object[] objArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            r = operation.invoke(Integer.valueOf(i2), r, objArr[i2]);
        }
        return r;
    }

    public final <R> R foldRight(R r, Function2<? super E, ? super R, ? extends R> operation) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(operation, "operation");
        Object[] objArr = this.content;
        int i = this._size;
        while (true) {
            i--;
            if (-1 >= i) {
                return r;
            }
            r = operation.invoke(objArr[i], r);
        }
    }

    public final <R> R foldRightIndexed(R r, Function3<? super Integer, ? super E, ? super R, ? extends R> operation) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(operation, "operation");
        Object[] objArr = this.content;
        int i = this._size;
        while (true) {
            i--;
            if (-1 >= i) {
                return r;
            }
            r = operation.invoke(Integer.valueOf(i), objArr[i], r);
        }
    }

    public final void forEach(Function1<? super E, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO> block) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(block, "block");
        Object[] objArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            block.invoke(objArr[i2]);
        }
    }

    public final void forEachIndexed(Function2<? super Integer, ? super E, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO> block) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(block, "block");
        Object[] objArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            block.invoke(Integer.valueOf(i2), objArr[i2]);
        }
    }

    public final void forEachReversed(Function1<? super E, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO> block) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(block, "block");
        Object[] objArr = this.content;
        int i = this._size;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            } else {
                block.invoke(objArr[i]);
            }
        }
    }

    public final void forEachReversedIndexed(Function2<? super Integer, ? super E, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO> block) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(block, "block");
        Object[] objArr = this.content;
        int i = this._size;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            } else {
                block.invoke(Integer.valueOf(i), objArr[i]);
            }
        }
    }

    public final E get(@IntRange(from = MediaDescriptionCompat.BT_FOLDER_TYPE_MIXED) int i) {
        if (i >= 0 && i < this._size) {
            return (E) this.content[i];
        }
        StringBuilder sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(i, "Index ", " must be in 0..");
        sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.append(this._size - 1);
        throw new IndexOutOfBoundsException(sbO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.toString());
    }

    public final O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo getIndices() {
        return org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000(0, this._size);
    }

    @IntRange(from = -1)
    public final int getLastIndex() {
        return this._size - 1;
    }

    @IntRange(from = MediaDescriptionCompat.BT_FOLDER_TYPE_MIXED)
    public final int getSize() {
        return this._size;
    }

    public int hashCode() {
        Object[] objArr = this.content;
        int i = this._size;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final int indexOf(E e) {
        int i = 0;
        if (e == null) {
            Object[] objArr = this.content;
            int i2 = this._size;
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        Object[] objArr2 = this.content;
        int i3 = this._size;
        while (i < i3) {
            if (e.equals(objArr2[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final int indexOfFirst(Function1<? super E, Boolean> predicate) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(predicate, "predicate");
        Object[] objArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            if (predicate.invoke(objArr[i2]).booleanValue()) {
                return i2;
            }
        }
        return -1;
    }

    public final int indexOfLast(Function1<? super E, Boolean> predicate) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(predicate, "predicate");
        Object[] objArr = this.content;
        int i = this._size;
        do {
            i--;
            if (-1 >= i) {
                return -1;
            }
        } while (!predicate.invoke(objArr[i]).booleanValue());
        return i;
    }

    public final boolean isEmpty() {
        return this._size == 0;
    }

    public final boolean isNotEmpty() {
        return this._size != 0;
    }

    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, null, 63, null);
    }

    public final E last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ObjectList is empty.");
        }
        return (E) this.content[this._size - 1];
    }

    public final int lastIndexOf(E e) {
        if (e == null) {
            Object[] objArr = this.content;
            for (int i = this._size - 1; -1 < i; i--) {
                if (objArr[i] == null) {
                    return i;
                }
            }
        } else {
            Object[] objArr2 = this.content;
            for (int i2 = this._size - 1; -1 < i2; i2--) {
                if (e.equals(objArr2[i2])) {
                    return i2;
                }
            }
        }
        return -1;
    }

    public final E lastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.content[this._size - 1];
    }

    public final boolean none() {
        return isEmpty();
    }

    public final boolean reversedAny(Function1<? super E, Boolean> predicate) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(predicate, "predicate");
        Object[] objArr = this.content;
        for (int i = this._size - 1; -1 < i; i--) {
            if (predicate.invoke(objArr[i]).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return joinToString$default(this, null, "[", "]", 0, null, new AnonymousClass1(this), 25, null);
    }

    private ObjectList(int i) {
        this.content = i == 0 ? ObjectListKt.EmptyArray : new Object[i];
    }

    public final boolean any(Function1<? super E, Boolean> predicate) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(predicate, "predicate");
        Object[] objArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            if (predicate.invoke(objArr[i2]).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final int count(Function1<? super E, Boolean> predicate) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(predicate, "predicate");
        Object[] objArr = this.content;
        int i = this._size;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (predicate.invoke(objArr[i3]).booleanValue()) {
                i2++;
            }
        }
        return i2;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [E, java.lang.Object] */
    public final E firstOrNull(Function1<? super E, Boolean> predicate) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(predicate, "predicate");
        Object[] objArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            Object r3 = (Object) objArr[i2];
            if (predicate.invoke(r3).booleanValue()) {
                return r3;
            }
        }
        return null;
    }

    public final String joinToString(CharSequence separator) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(separator, "separator");
        return joinToString$default(this, separator, null, null, 0, null, null, 62, null);
    }

    public final boolean containsAll(List<? extends E> elements) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(elements, "elements");
        int size = elements.size();
        for (int i = 0; i < size; i++) {
            if (!contains(elements.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(separator, "separator");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(prefix, "prefix");
        return joinToString$default(this, separator, prefix, null, 0, null, null, 60, null);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [E, java.lang.Object] */
    public final E lastOrNull(Function1<? super E, Boolean> predicate) {
        Object r2;
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(predicate, "predicate");
        Object[] objArr = this.content;
        int i = this._size;
        do {
            i--;
            if (-1 >= i) {
                return null;
            }
            r2 = (Object) objArr[i];
        } while (!predicate.invoke(r2).booleanValue());
        return r2;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [E, java.lang.Object] */
    public final E first(Function1<? super E, Boolean> predicate) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(predicate, "predicate");
        Object[] objArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            Object r3 = (Object) objArr[i2];
            if (predicate.invoke(r3).booleanValue()) {
                return r3;
            }
        }
        throw new NoSuchElementException("ObjectList contains no element matching the predicate.");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(separator, "separator");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(prefix, "prefix");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, null, 56, null);
    }

    public final boolean containsAll(Iterable<? extends E> elements) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(separator, "separator");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(prefix, "prefix");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, i, null, null, 48, null);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [E, java.lang.Object] */
    public final E last(Function1<? super E, Boolean> predicate) {
        Object r2;
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(predicate, "predicate");
        Object[] objArr = this.content;
        int i = this._size;
        do {
            i--;
            if (-1 < i) {
                r2 = (Object) objArr[i];
            } else {
                throw new NoSuchElementException("ObjectList contains no element matching the predicate.");
            }
        } while (!predicate.invoke(r2).booleanValue());
        return r2;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(separator, "separator");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(prefix, "prefix");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(postfix, "postfix");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(truncated, "truncated");
        return joinToString$default(this, separator, prefix, postfix, i, truncated, null, 32, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean containsAll(ObjectList<E> elements) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(elements, "elements");
        Object[] objArr = elements.content;
        int i = elements._size;
        for (int i2 = 0; i2 < i; i2++) {
            if (!contains(objArr[i2])) {
                return false;
            }
        }
        return true;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence charSequence, int i, CharSequence charSequence2, Function1<? super E, ? extends CharSequence> function1) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(separator, "separator");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(prefix, "prefix");
        StringBuilder sbO00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(charSequence, "postfix", charSequence2, "truncated", prefix);
        Object[] objArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            Object obj = objArr[i3];
            if (i3 == i) {
                sbO00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.append(charSequence2);
                String string = sbO00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.toString();
                O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            }
            if (i3 != 0) {
                sbO00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.append(separator);
            }
            if (function1 == null) {
                sbO00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.append(obj);
            } else {
                sbO00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.append(function1.invoke(obj));
            }
        }
        sbO00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.append(charSequence);
        String string2 = sbO00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.toString();
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(string2, "StringBuilder().apply(builderAction).toString()");
        return string2;
    }
}
