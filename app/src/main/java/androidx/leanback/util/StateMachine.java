package androidx.leanback.util;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import androidx.annotation.RestrictTo;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class StateMachine {
    static final boolean DEBUG = false;
    public static final int STATUS_INVOKED = 1;
    public static final int STATUS_ZERO = 0;
    static final String TAG = "StateMachine";
    final ArrayList<State> mStates = new ArrayList<>();
    final ArrayList<State> mFinishedStates = new ArrayList<>();
    final ArrayList<State> mUnfinishedStates = new ArrayList<>();

    public static class Condition {
        final String mName;

        public Condition(String str) {
            this.mName = str;
        }

        public boolean canProceed() {
            return true;
        }
    }

    public static class Event {
        final String mName;

        public Event(String str) {
            this.mName = str;
        }
    }

    public static class State {
        final boolean mBranchEnd;
        final boolean mBranchStart;
        ArrayList<Transition> mIncomings;
        int mInvokedOutTransitions;
        final String mName;
        ArrayList<Transition> mOutgoings;
        int mStatus;

        public State(String str) {
            this(str, false, true);
        }

        public void addIncoming(Transition transition) {
            if (this.mIncomings == null) {
                this.mIncomings = new ArrayList<>();
            }
            this.mIncomings.add(transition);
        }

        public void addOutgoing(Transition transition) {
            if (this.mOutgoings == null) {
                this.mOutgoings = new ArrayList<>();
            }
            this.mOutgoings.add(transition);
        }

        public final boolean checkPreCondition() {
            ArrayList<Transition> arrayList = this.mIncomings;
            if (arrayList == null) {
                return true;
            }
            if (this.mBranchEnd) {
                Iterator<Transition> it = arrayList.iterator();
                while (it.hasNext()) {
                    if (it.next().mState != 1) {
                        return false;
                    }
                }
                return true;
            }
            Iterator<Transition> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (it2.next().mState == 1) {
                    return true;
                }
            }
            return false;
        }

        public final int getStatus() {
            return this.mStatus;
        }

        public void run() {
        }

        public final boolean runIfNeeded() {
            if (this.mStatus == 1 || !checkPreCondition()) {
                return false;
            }
            this.mStatus = 1;
            run();
            signalAutoTransitionsAfterRun();
            return true;
        }

        public final void signalAutoTransitionsAfterRun() {
            Condition condition;
            ArrayList<Transition> arrayList = this.mOutgoings;
            if (arrayList != null) {
                for (Transition transition : arrayList) {
                    if (transition.mEvent == null && ((condition = transition.mCondition) == null || condition.canProceed())) {
                        this.mInvokedOutTransitions++;
                        transition.mState = 1;
                        if (!this.mBranchStart) {
                            return;
                        }
                    }
                }
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("[");
            sb.append(this.mName);
            sb.append(" ");
            return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(sb, "]", this.mStatus);
        }

        public State(String str, boolean z, boolean z2) {
            this.mStatus = 0;
            this.mInvokedOutTransitions = 0;
            this.mName = str;
            this.mBranchStart = z;
            this.mBranchEnd = z2;
        }
    }

    public void addState(State state) {
        if (this.mStates.contains(state)) {
            return;
        }
        this.mStates.add(state);
    }

    public void addTransition(State state, State state2, Event event) {
        Transition transition = new Transition(state, state2, event);
        state2.addIncoming(transition);
        state.addOutgoing(transition);
    }

    public void fireEvent(Event event) {
        for (int i = 0; i < this.mFinishedStates.size(); i++) {
            State state = this.mFinishedStates.get(i);
            ArrayList<Transition> arrayList = state.mOutgoings;
            if (arrayList != null && (state.mBranchStart || state.mInvokedOutTransitions <= 0)) {
                for (Transition transition : arrayList) {
                    if (transition.mState != 1 && transition.mEvent == event) {
                        transition.mState = 1;
                        state.mInvokedOutTransitions++;
                        if (!state.mBranchStart) {
                            break;
                        }
                    }
                }
            }
        }
        runUnfinishedStates();
    }

    public void reset() {
        this.mUnfinishedStates.clear();
        this.mFinishedStates.clear();
        for (State state : this.mStates) {
            state.mStatus = 0;
            state.mInvokedOutTransitions = 0;
            ArrayList<Transition> arrayList = state.mOutgoings;
            if (arrayList != null) {
                Iterator<Transition> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().mState = 0;
                }
            }
        }
    }

    public void runUnfinishedStates() {
        boolean z;
        do {
            z = false;
            for (int size = this.mUnfinishedStates.size() - 1; size >= 0; size--) {
                State state = this.mUnfinishedStates.get(size);
                if (state.runIfNeeded()) {
                    this.mUnfinishedStates.remove(size);
                    this.mFinishedStates.add(state);
                    z = true;
                }
            }
        } while (z);
    }

    public void start() {
        this.mUnfinishedStates.addAll(this.mStates);
        runUnfinishedStates();
    }

    public void addTransition(State state, State state2, Condition condition) {
        Transition transition = new Transition(state, state2, condition);
        state2.addIncoming(transition);
        state.addOutgoing(transition);
    }

    public static class Transition {
        final Condition mCondition;
        final Event mEvent;
        final State mFromState;
        int mState;
        final State mToState;

        public Transition(State state, State state2, Event event) {
            this.mState = 0;
            if (event == null) {
                throw new IllegalArgumentException();
            }
            this.mFromState = state;
            this.mToState = state2;
            this.mEvent = event;
            this.mCondition = null;
        }

        public String toString() {
            String str;
            Event event = this.mEvent;
            if (event != null) {
                str = event.mName;
            } else {
                Condition condition = this.mCondition;
                str = condition != null ? condition.mName : TtmlNode.TEXT_EMPHASIS_AUTO;
            }
            return "[" + this.mFromState.mName + " -> " + this.mToState.mName + " <" + str + ">]";
        }

        public Transition(State state, State state2) {
            this.mState = 0;
            this.mFromState = state;
            this.mToState = state2;
            this.mEvent = null;
            this.mCondition = null;
        }

        public Transition(State state, State state2, Condition condition) {
            this.mState = 0;
            if (condition != null) {
                this.mFromState = state;
                this.mToState = state2;
                this.mEvent = null;
                this.mCondition = condition;
                return;
            }
            throw new IllegalArgumentException();
        }
    }

    public void addTransition(State state, State state2) {
        Transition transition = new Transition(state, state2);
        state2.addIncoming(transition);
        state.addOutgoing(transition);
    }
}
