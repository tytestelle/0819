package org.eclipse.jetty.util;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO extends AbstractMap implements Externalizable {
    public static final boolean CASE_INSENSTIVE = true;
    protected static final int __HASH_WIDTH = 17;
    protected HashSet _entrySet;
    protected boolean _ignoreCase;
    protected O00000OOoOOO00O00o0ooooooooO000ooooO0000 _nullEntry;
    protected Object _nullValue;
    protected O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 _root;
    protected Set _umEntrySet;
    protected int _width;

    public O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO() {
        this._width = 17;
        this._root = new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00();
        this._ignoreCase = false;
        this._nullEntry = null;
        this._nullValue = null;
        HashSet hashSet = new HashSet(3);
        this._entrySet = hashSet;
        this._umEntrySet = Collections.unmodifiableSet(hashSet);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this._root = new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00();
        this._nullEntry = null;
        this._nullValue = null;
        this._entrySet.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (obj == null) {
            return this._nullEntry != null;
        }
        return getEntry(obj.toString(), 0, obj.toString().length()) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        return this._umEntrySet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        if (obj == null) {
            return this._nullValue;
        }
        return obj instanceof String ? get((String) obj) : get(obj.toString());
    }

    public Map.Entry getBestEntry(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            return this._nullEntry;
        }
        O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = this._root;
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            char c = (char) bArr[i + i4];
            if (i3 == -1) {
                O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00[] o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00Arr = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4471O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01 = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00Arr == null ? null : o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00Arr[c % this._width];
                if (o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01 == null && i4 > 0) {
                    return o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
                }
                o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01;
                i3 = 0;
            }
            while (o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 != null) {
                char[] cArr = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4468O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                if (cArr[i3] == c || (this._ignoreCase && o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4469O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO[i3] == c)) {
                    i3++;
                    if (i3 == cArr.length) {
                        i3 = -1;
                    }
                } else {
                    if (i3 > 0) {
                        return null;
                    }
                    o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4470O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                }
            }
            return null;
        }
        if (i3 > 0) {
            return null;
        }
        if (o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 == null || o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4472O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 != null) {
            return o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
        }
        return null;
    }

    public Map.Entry getEntry(String str, int i, int i2) {
        if (str == null) {
            return this._nullEntry;
        }
        O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = this._root;
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            char cCharAt = str.charAt(i + i4);
            if (i3 == -1) {
                O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00[] o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00Arr = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4471O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00Arr == null ? null : o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00Arr[cCharAt % this._width];
                i3 = 0;
            }
            while (o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 != null) {
                char[] cArr = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4468O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                if (cArr[i3] == cCharAt || (this._ignoreCase && o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4469O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO[i3] == cCharAt)) {
                    i3++;
                    if (i3 == cArr.length) {
                        i3 = -1;
                    }
                } else {
                    if (i3 > 0) {
                        return null;
                    }
                    o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4470O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                }
            }
            return null;
        }
        if (i3 > 0) {
            return null;
        }
        if (o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 == null || o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4472O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 != null) {
            return o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
        }
        return null;
    }

    public int getWidth() {
        return this._width;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return this._entrySet.isEmpty();
    }

    public boolean isIgnoreCase() {
        return this._ignoreCase;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        return obj == null ? put((String) null, obj2) : put(obj.toString(), obj2);
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException {
        boolean z = objectInput.readBoolean();
        HashMap map = (HashMap) objectInput.readObject();
        setIgnoreCase(z);
        putAll(map);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        return obj == null ? remove((String) null) : remove(obj.toString());
    }

    public void setIgnoreCase(boolean z) {
        if (this._root.f4471O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo != null) {
            throw new IllegalStateException("Must be set before first put");
        }
        this._ignoreCase = z;
    }

    public void setWidth(int i) {
        this._width = i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this._entrySet.size();
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        HashMap map = new HashMap(this);
        objectOutput.writeBoolean(this._ignoreCase);
        objectOutput.writeObject(map);
    }

    public Object put(String str, Object obj) {
        if (str == null) {
            Object obj2 = this._nullValue;
            this._nullValue = obj;
            if (this._nullEntry == null) {
                O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000 = new O00000OOoOOO00O00o0ooooooooO000ooooO0000(this);
                this._nullEntry = o00000OOoOOO00O00o0ooooooooO000ooooO0000;
                this._entrySet.add(o00000OOoOOO00O00o0ooooooooO000ooooO0000);
            }
            return obj2;
        }
        O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = this._root;
        O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01 = null;
        O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo02 = null;
        int i = 0;
        int i2 = -1;
        loop0: while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (i2 == -1) {
                O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00[] o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00Arr = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4471O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo02 = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
                o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01 = null;
                o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00Arr == null ? null : o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00Arr[cCharAt % this._width];
                i2 = 0;
            }
            while (true) {
                if (o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 != null) {
                    char[] cArr = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4468O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    if (cArr[i2] == cCharAt || (this._ignoreCase && o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4469O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO[i2] == cCharAt)) {
                        i2++;
                        if (i2 == cArr.length) {
                            o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01 = null;
                        } else {
                            o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01 = null;
                        }
                        i++;
                    } else if (i2 == 0) {
                        o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01 = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
                        o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4470O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                    } else {
                        o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, i2);
                        i--;
                    }
                    i2 = -1;
                    i++;
                } else {
                    boolean z = this._ignoreCase;
                    o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00();
                    int length = str.length() - i;
                    o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4468O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new char[length];
                    o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4469O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new char[length];
                    for (int i3 = 0; i3 < length; i3++) {
                        char cCharAt2 = str.charAt(i + i3);
                        o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4468O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[i3] = cCharAt2;
                        if (z) {
                            if (Character.isUpperCase(cCharAt2)) {
                                cCharAt2 = Character.toLowerCase(cCharAt2);
                            } else if (Character.isLowerCase(cCharAt2)) {
                                cCharAt2 = Character.toUpperCase(cCharAt2);
                            }
                            o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4469O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO[i3] = cCharAt2;
                        }
                    }
                    if (o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01 == null) {
                        if (o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo02 != null) {
                            if (o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo02.f4471O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo == null) {
                                o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo02.f4471O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00[this._width];
                            }
                            O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00[] o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00Arr2 = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo02.f4471O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                            int i4 = this._width;
                            o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00Arr2[cCharAt % i4] = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
                            int i5 = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4469O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO[0] % i4;
                            if (o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4468O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[0] % i4 == i5) {
                                break loop0;
                            }
                            O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo03 = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00Arr2[i5];
                            if (o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo03 == null) {
                                o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00Arr2[i5] = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
                                break loop0;
                            }
                            while (true) {
                                O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo04 = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo03.f4470O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                                if (o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo04 == null) {
                                    break;
                                }
                                o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo03 = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo04;
                            }
                            o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo03.f4470O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
                            break loop0;
                        }
                        this._root = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
                        break loop0;
                    }
                    o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01.f4470O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
                    break loop0;
                }
            }
        }
        if (o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 == null) {
            return null;
        }
        if (i2 > 0) {
            o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, i2);
        }
        Object obj3 = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4473O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4472O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = str;
        o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4473O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = obj;
        this._entrySet.add(o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00);
        return obj3;
    }

    public Object remove(String str) {
        if (str == null) {
            Object obj = this._nullValue;
            O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000 = this._nullEntry;
            if (o00000OOoOOO00O00o0ooooooooO000ooooO0000 != null) {
                this._entrySet.remove(o00000OOoOOO00O00o0ooooooooO000ooooO0000);
                this._nullEntry = null;
                this._nullValue = null;
            }
            return obj;
        }
        O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = this._root;
        int i = -1;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (i == -1) {
                O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00[] o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00Arr = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4471O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00Arr == null ? null : o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00Arr[cCharAt % this._width];
                i = 0;
            }
            while (o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 != null) {
                char[] cArr = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4468O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                if (cArr[i] != cCharAt && (!this._ignoreCase || o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4469O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO[i] != cCharAt)) {
                    if (i > 0) {
                        return null;
                    }
                    o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4470O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                } else {
                    i++;
                    if (i == cArr.length) {
                        i = -1;
                    }
                }
            }
            return null;
        }
        if (i > 0) {
            return null;
        }
        if (o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 != null && o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4472O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 == null) {
            return null;
        }
        Object obj2 = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4473O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        this._entrySet.remove(o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00);
        o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4473O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = null;
        o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4472O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = null;
        return obj2;
    }

    public Object get(String str) {
        if (str == null) {
            return this._nullValue;
        }
        Map.Entry entry = getEntry(str, 0, str.length());
        if (entry == null) {
            return null;
        }
        return entry.getValue();
    }

    public Map.Entry getEntry(char[] cArr, int i, int i2) {
        if (cArr == null) {
            return this._nullEntry;
        }
        O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = this._root;
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            char c = cArr[i + i4];
            if (i3 == -1) {
                O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00[] o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00Arr = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4471O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00Arr == null ? null : o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00Arr[c % this._width];
                i3 = 0;
            }
            while (o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 != null) {
                char[] cArr2 = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4468O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                if (cArr2[i3] != c && (!this._ignoreCase || o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4469O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO[i3] != c)) {
                    if (i3 > 0) {
                        return null;
                    }
                    o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4470O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                } else {
                    i3++;
                    if (i3 == cArr2.length) {
                        i3 = -1;
                    }
                }
            }
            return null;
        }
        if (i3 > 0) {
            return null;
        }
        if (o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 == null || o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4472O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 != null) {
            return o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
        }
        return null;
    }

    public O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(boolean z) {
        this();
        this._ignoreCase = z;
    }

    public O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(boolean z, int i) {
        this();
        this._ignoreCase = z;
        this._width = i;
    }
}
