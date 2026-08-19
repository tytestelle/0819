package O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000;
import org.fourthline.cling.controlpoint.SubscriptionCallback;
import org.fourthline.cling.model.gena.CancelReason;
import org.fourthline.cling.model.gena.GENASubscription;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.model.meta.Service;
import org.fourthline.cling.model.state.StateVariableValue;
import org.fourthline.cling.support.lastchange.Event;
import org.fourthline.cling.support.lastchange.EventedValue;
import org.fourthline.cling.support.lastchange.InstanceID;
import org.fourthline.cling.support.lastchange.LastChangeParser;

/* JADX INFO: loaded from: classes.dex */
public final class O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O extends SubscriptionCallback {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final LastChangeParser f89O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO f90O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO f91O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(Service service, LastChangeParser lastChangeParser, O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO) {
        super(service, 1800);
        this.f89O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = lastChangeParser;
        this.f90O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;
        this.f91O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO("SubscriptionCallback", 0);
    }

    public static String O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(GENASubscription gENASubscription) {
        String type = gENASubscription.getService().getServiceType().getType();
        String subscriptionId = gENASubscription.getSubscriptionId();
        return "[" + type + "](" + (subscriptionId != null ? (String) kotlin.collections.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo(kotlin.text.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O(subscriptionId, new String[]{"-"})) : null) + ")";
    }

    @Override // org.fourthline.cling.controlpoint.SubscriptionCallback
    public final void ended(GENASubscription subscription, CancelReason cancelReason, UpnpResponse upnpResponse) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(subscription, "subscription");
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this.f91O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(subscription) + " ended: " + cancelReason + ", " + upnpResponse);
        O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(new O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(this, subscription, 2));
    }

    @Override // org.fourthline.cling.controlpoint.SubscriptionCallback
    public final void established(GENASubscription subscription) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(subscription, "subscription");
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this.f91O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(subscription), " established"));
        O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(new O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(this, subscription, 0));
    }

    @Override // org.fourthline.cling.controlpoint.SubscriptionCallback
    public final void eventReceived(GENASubscription subscription) {
        List<InstanceID> instanceIDs;
        Object value;
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(subscription, "subscription");
        StateVariableValue stateVariableValue = (StateVariableValue) subscription.getCurrentValues().get("LastChange");
        List<EventedValue> values = null;
        String string = (stateVariableValue == null || (value = stateVariableValue.getValue()) == null) ? null : value.toString();
        if (string == null || string.length() == 0) {
            return;
        }
        Iterable o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new O0000oOoOo0OOo0O0o0O0oOoOo00OOOo0OO00O0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(0, string.length() - 1, 1);
        if ((o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo instanceof Collection) && ((Collection) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).isEmpty()) {
            return;
        }
        Iterator it = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.iterator();
        while (((O0000oOoOo0OOo0O0o0O0oOoOo00OOOo0OO00O0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) it).f1681O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
            char cCharAt = string.charAt(((O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000) it).nextInt());
            if (!Character.isWhitespace(cCharAt) && !Character.isSpaceChar(cCharAt)) {
                String str = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(subscription) + " eventReceived: " + subscription.getCurrentValues().keySet();
                O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this.f91O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, str);
                try {
                    Event event = this.f89O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.parse(string);
                    if (event != null && (instanceIDs = event.getInstanceIDs()) != null) {
                        InstanceID instanceID = instanceIDs.isEmpty() ? null : instanceIDs.get(0);
                        if (instanceID != null) {
                            values = instanceID.getValues();
                        }
                    }
                    if (values != null) {
                        for (EventedValue eventedValue : values) {
                            O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, "    value: [" + eventedValue.getClass().getSimpleName() + "] " + eventedValue);
                            O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(new O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(this, 0, subscription, eventedValue));
                        }
                        return;
                    }
                    return;
                } catch (Exception e) {
                    O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(subscription) + " currentValues: " + subscription.getCurrentValues());
                    e.printStackTrace();
                    return;
                }
            }
        }
    }

    @Override // org.fourthline.cling.controlpoint.SubscriptionCallback
    public final void eventsMissed(GENASubscription subscription, int i) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(subscription, "subscription");
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this.f91O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(subscription) + " eventsMissed: " + i);
    }

    @Override // org.fourthline.cling.controlpoint.SubscriptionCallback
    public final void failed(GENASubscription subscription, UpnpResponse upnpResponse, Exception exc, String str) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(subscription, "subscription");
        String strO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(subscription);
        StringBuilder sb = new StringBuilder();
        sb.append(strO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        sb.append(" failed:");
        sb.append(upnpResponse);
        sb.append(", ");
        sb.append(exc);
        String message = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(sb, ", ", str);
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this.f91O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getClass();
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(message, "message");
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(50, o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(), message, null);
        O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(new O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(this, subscription, 1));
    }
}
