package kotlin.text;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO extends kotlin.jvm.internal.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO implements Function2 {
    final /* synthetic */ List<String> $delimitersList;
    final /* synthetic */ boolean $ignoreCase;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(List<String> list, boolean z) {
        super(2);
        this.$delimitersList = list;
        this.$ignoreCase = z;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00c8 A[EDGE_INSN: B:53:0x00c8->B:54:0x00c9 BREAK  A[LOOP:0: B:27:0x0062->B:38:0x0092]] */
    public final O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 invoke(CharSequence $receiver, int i) {
        Object next;
        O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        String str;
        Object next2;
        String str2;
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0($receiver, "$this$$receiver");
        List<String> list = this.$delimitersList;
        boolean z = this.$ignoreCase;
        if (z || list.size() != 1) {
            if (i < 0) {
                i = 0;
            }
            boolean z2 = $receiver instanceof String;
            int i2 = new O0000oOoOo0OOo0O0o0O0oOoOo00OOOo0OO00O0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(i, $receiver.length(), 1).f1677O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            if (!z2) {
                if (i <= i2) {
                    while (true) {
                        Iterator<T> it = list.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            str = (String) next;
                        } while (!O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O(str, $receiver, i, str.length(), z));
                        String str3 = (String) next;
                        if (str3 == null) {
                            if (i == i2) {
                                o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = null;
                                break;
                            }
                            i++;
                        } else {
                            o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = new O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(Integer.valueOf(i), str3);
                            break;
                        }
                    }
                } else {
                    o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = null;
                    break;
                }
            } else if (i <= i2) {
                while (true) {
                    Iterator<T> it2 = list.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                        str2 = (String) next2;
                    } while (!O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo(str2, (String) $receiver, i, str2.length(), z));
                    String str4 = (String) next2;
                    if (str4 == null) {
                        if (i == i2) {
                            o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = null;
                            break;
                        }
                        i++;
                    } else {
                        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = new O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(Integer.valueOf(i), str4);
                        break;
                    }
                }
            } else {
                o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = null;
                break;
            }
        } else {
            int size = list.size();
            if (size == 0) {
                throw new NoSuchElementException("List is empty.");
            }
            if (size != 1) {
                throw new IllegalArgumentException("List has more than one element.");
            }
            String str5 = list.get(0);
            if ((4 & 2) != 0) {
                i = 0;
            }
            int iO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000($receiver, str5, i, false);
            if (iO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 < 0) {
                o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = null;
                break;
            }
            o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = new O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(Integer.valueOf(iO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000), str5);
        }
        if (o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 != null) {
            return new O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.getFirst(), Integer.valueOf(((String) o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.getSecond()).length()));
        }
        return null;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((CharSequence) obj, ((Number) obj2).intValue());
    }
}
