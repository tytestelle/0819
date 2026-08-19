package org.seamless.swing;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import javax.swing.AbstractButton;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO implements O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o {
    private static Logger log = Logger.getLogger(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.class.getName());
    private O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o parentController;
    private Container view;
    private List<O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o> subControllers = new ArrayList();
    private Map<String, O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo> actions = new HashMap();
    private Map<Class, List<O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000>> eventListeners = new HashMap();

    public O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Container container) {
        this.view = container;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        try {
            String actionCommand = ((AbstractButton) actionEvent.getSource()).getActionCommand();
            androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(this.actions.get(actionCommand));
            if (getParentController() != null) {
                log.fine("Passing action on to parent controller");
                this.parentController.actionPerformed(actionEvent);
            } else {
                throw new RuntimeException("Nobody is responsible for action command: " + actionCommand);
            }
        } catch (ClassCastException unused) {
            throw new IllegalArgumentException("Action source is not an Abstractbutton: " + actionEvent);
        }
    }

    public void deregisterAction(String str) {
        this.actions.remove(str);
    }

    @Override // org.seamless.swing.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o
    public void dispose() {
        log.fine("Disposing controller");
        Iterator<O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o> it = this.subControllers.iterator();
        while (it.hasNext()) {
            it.next().dispose();
            it.remove();
        }
    }

    public void failedActionExecute() {
    }

    public void finalActionExecute() {
    }

    public void fireEvent(O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
        fireEvent(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, false);
    }

    public void fireEventGlobal(O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
        fireEvent(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, true);
    }

    public O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o getParentController() {
        return this.parentController;
    }

    @Override // org.seamless.swing.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o
    public List<O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o> getSubControllers() {
        return this.subControllers;
    }

    @Override // org.seamless.swing.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o
    public Container getView() {
        return this.view;
    }

    public void postActionExecute() {
    }

    public void preActionExecute() {
    }

    public void registerAction(AbstractButton abstractButton, O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
        abstractButton.removeActionListener(this);
        abstractButton.addActionListener(this);
        this.actions.put(abstractButton.getActionCommand(), o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
    }

    public void registerEventListener(Class cls, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        log.fine("Registering listener: " + o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 + " for event type: " + cls.getName());
        List<O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000> arrayList = this.eventListeners.get(cls);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        arrayList.add(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
        this.eventListeners.put(cls, arrayList);
    }

    public void windowActivated(WindowEvent windowEvent) {
    }

    public void windowClosed(WindowEvent windowEvent) {
    }

    public void windowClosing(WindowEvent windowEvent) {
        dispose();
        getView().dispose();
    }

    public void windowDeactivated(WindowEvent windowEvent) {
    }

    public void windowDeiconified(WindowEvent windowEvent) {
    }

    public void windowIconified(WindowEvent windowEvent) {
    }

    public void windowOpened(WindowEvent windowEvent) {
    }

    @Override // org.seamless.swing.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o
    public void fireEvent(O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, boolean z) {
        if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.alreadyFired(this)) {
            log.finest("Event already fired here, ignoring...");
        } else {
            log.finest("Event has not been fired already");
            if (this.eventListeners.get(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.getClass()) != null) {
                log.finest("Have listeners for this type of event: " + this.eventListeners.get(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.getClass()));
                Iterator<O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000> it = this.eventListeners.get(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.getClass()).iterator();
                if (it.hasNext()) {
                    androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(it.next());
                    StringBuilder sb = new StringBuilder("Processing event: ");
                    sb.append(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.getClass().getName());
                    sb.append(" with listener: ");
                    throw null;
                }
            }
            o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.addFiredInController(this);
            log.fine("Passing event: " + o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.getClass().getName() + " DOWN in the controller hierarchy");
            Iterator<O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o> it2 = this.subControllers.iterator();
            while (it2.hasNext()) {
                it2.next().fireEvent(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, z);
            }
        }
        if (getParentController() == null || o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.alreadyFired(getParentController()) || !z) {
            log.finest("Event does not propagate up the tree from here");
            return;
        }
        log.fine("Passing event: " + o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.getClass().getName() + " UP in the controller hierarchy");
        getParentController().fireEvent(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, z);
    }

    public void registerAction(AbstractButton abstractButton, String str, O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
        abstractButton.setActionCommand(str);
        registerAction(abstractButton, o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
    }

    public O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Container container, O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
        this.view = container;
        if (o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o != null) {
            this.parentController = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getSubControllers().add(this);
        }
    }
}
