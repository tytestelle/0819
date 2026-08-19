package androidx.core.view;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class TreeIterator<T> implements Iterator<T>, O0000oOo00ooOO00OoO00OO0000OoooOoooooOoo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {
    private final Function1<T, Iterator<T>> getChildIterator;
    private Iterator<? extends T> iterator;
    private final List<Iterator<T>> stack = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    public TreeIterator(Iterator<? extends T> it, Function1<? super T, ? extends Iterator<? extends T>> function1) {
        this.getChildIterator = function1;
        this.iterator = it;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private final void prepareNextIterator(T t) {
        Iterator<T> itInvoke = this.getChildIterator.invoke(t);
        if (itInvoke != null && itInvoke.hasNext()) {
            this.stack.add((Iterator<T>) this.iterator);
            this.iterator = itInvoke;
            return;
        }
        while (!this.iterator.hasNext() && !this.stack.isEmpty()) {
            this.iterator = (Iterator) kotlin.collections.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo(this.stack);
            List<Iterator<T>> list = this.stack;
            kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(list, "<this>");
            if (list.isEmpty()) {
                throw new NoSuchElementException("List is empty.");
            }
            list.remove(kotlin.collections.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o(list));
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.iterator.hasNext();
    }

    @Override // java.util.Iterator
    public T next() {
        T next = this.iterator.next();
        prepareNextIterator(next);
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
