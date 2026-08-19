package org.fourthline.cling.model.meta;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import org.fourthline.cling.model.Validatable;
import org.fourthline.cling.model.ValidationError;

/* JADX INFO: loaded from: classes2.dex */
public class StateVariableAllowedValueRange implements Validatable {
    private static final Logger log = Logger.getLogger(StateVariableAllowedValueRange.class.getName());
    private final long maximum;
    private final long minimum;
    private final long step;

    public StateVariableAllowedValueRange(long j, long j2) {
        this(j, j2, 1L);
    }

    public long getMaximum() {
        return this.maximum;
    }

    public long getMinimum() {
        return this.minimum;
    }

    public long getStep() {
        return this.step;
    }

    public boolean isInRange(long j) {
        return j >= getMinimum() && j <= getMaximum() && j % this.step == 0;
    }

    public String toString() {
        return "Range Min: " + getMinimum() + " Max: " + getMaximum() + " Step: " + getStep();
    }

    @Override // org.fourthline.cling.model.Validatable
    public List<ValidationError> validate() {
        return new ArrayList();
    }

    public StateVariableAllowedValueRange(long j, long j2, long j3) {
        if (j > j2) {
            Logger logger = log;
            StringBuilder sbO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(j, "UPnP specification violation, allowed value range minimum '", "' is greater than maximum '");
            sbO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.append(j2);
            sbO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.append("', switching values.");
            logger.warning(sbO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.toString());
            this.minimum = j2;
            this.maximum = j;
        } else {
            this.minimum = j;
            this.maximum = j2;
        }
        this.step = j3;
    }
}
