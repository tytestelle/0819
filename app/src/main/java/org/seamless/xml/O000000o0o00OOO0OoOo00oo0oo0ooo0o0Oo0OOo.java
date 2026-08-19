package org.seamless.xml;

import org.fourthline.cling.support.messagebox.parser.MessageElement;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo extends O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 {
    final /* synthetic */ O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(MessageElement messageElement, O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
        super(messageElement, o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
        this.this$0 = messageElement;
    }

    public O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO[] buildArray(O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO[] o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoOArr) {
        O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO[] o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoOArrNewChildrenArray = newChildrenArray(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoOArr.length);
        for (int i = 0; i < o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoOArrNewChildrenArray.length; i++) {
            o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoOArrNewChildrenArray[i] = build(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoOArr[i].getW3CElement());
        }
        return o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoOArrNewChildrenArray;
    }

    public O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO[] getChildElements() {
        return buildArray(this.element.getChildren());
    }

    public abstract O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO[] newChildrenArray(int i);

    public O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO[] getChildElements(String str) {
        return buildArray(this.element.getChildren(str));
    }
}
