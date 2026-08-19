package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.KeyAttributes;
import androidx.constraintlayout.motion.widget.MotionController;
import androidx.constraintlayout.widget.R;

/* JADX INFO: loaded from: classes.dex */
public class MotionEffect extends MotionHelper {
    public static final int AUTO = -1;
    public static final int EAST = 2;
    public static final int NORTH = 0;
    public static final int SOUTH = 1;
    public static final String TAG = "FadeMove";
    private static final int UNSET = -1;
    public static final int WEST = 3;
    private int fadeMove;
    private float motionEffectAlpha;
    private int motionEffectEnd;
    private int motionEffectStart;
    private boolean motionEffectStrictMove;
    private int motionEffectTranslationX;
    private int motionEffectTranslationY;
    private int viewTransitionId;

    public MotionEffect(Context context) {
        super(context);
        this.motionEffectAlpha = 0.1f;
        this.motionEffectStart = 49;
        this.motionEffectEnd = 50;
        this.motionEffectTranslationX = 0;
        this.motionEffectTranslationY = 0;
        this.motionEffectStrictMove = true;
        this.viewTransitionId = -1;
        this.fadeMove = -1;
    }

    private void init(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MotionEffect);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == R.styleable.MotionEffect_motionEffect_start) {
                    int i2 = typedArrayObtainStyledAttributes.getInt(index, this.motionEffectStart);
                    this.motionEffectStart = i2;
                    this.motionEffectStart = Math.max(Math.min(i2, 99), 0);
                } else if (index == R.styleable.MotionEffect_motionEffect_end) {
                    int i3 = typedArrayObtainStyledAttributes.getInt(index, this.motionEffectEnd);
                    this.motionEffectEnd = i3;
                    this.motionEffectEnd = Math.max(Math.min(i3, 99), 0);
                } else if (index == R.styleable.MotionEffect_motionEffect_translationX) {
                    this.motionEffectTranslationX = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.motionEffectTranslationX);
                } else if (index == R.styleable.MotionEffect_motionEffect_translationY) {
                    this.motionEffectTranslationY = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.motionEffectTranslationY);
                } else if (index == R.styleable.MotionEffect_motionEffect_alpha) {
                    this.motionEffectAlpha = typedArrayObtainStyledAttributes.getFloat(index, this.motionEffectAlpha);
                } else if (index == R.styleable.MotionEffect_motionEffect_move) {
                    this.fadeMove = typedArrayObtainStyledAttributes.getInt(index, this.fadeMove);
                } else if (index == R.styleable.MotionEffect_motionEffect_strict) {
                    this.motionEffectStrictMove = typedArrayObtainStyledAttributes.getBoolean(index, this.motionEffectStrictMove);
                } else if (index == R.styleable.MotionEffect_motionEffect_viewTransition) {
                    this.viewTransitionId = typedArrayObtainStyledAttributes.getResourceId(index, this.viewTransitionId);
                }
            }
            int i4 = this.motionEffectStart;
            int i5 = this.motionEffectEnd;
            if (i4 == i5) {
                if (i4 > 0) {
                    this.motionEffectStart = i4 - 1;
                } else {
                    this.motionEffectEnd = i5 + 1;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionHelperInterface
    public boolean isDecorator() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0162  */
    /* JADX WARN: Code duplicated, block: B:87:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:89:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:92:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:94:0x01e5  */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0186, code lost:
    
        if (r14 == 0.0f) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x019a, code lost:
    
        if (r14 == 0.0f) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01aa, code lost:
    
        if (r15 == 0.0f) goto L57;
     */
    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionHelperInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPreSetup(androidx.constraintlayout.motion.widget.MotionLayout motionLayout, java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> controllerMap) {
        if (controllerMap == null || controllerMap.isEmpty()) return;
        int direction = this.fadeMove;
        if (direction == AUTO) {
            int north = 0, south = 0, east = 0, west = 0;
            for (MotionController c : controllerMap.values()) {
                if (c == null) continue;
                float dx = c.getFinalX() - c.getStartX();
                float dy = c.getFinalY() - c.getStartY();
                if (Math.abs(dx) > Math.abs(dy)) {
                    if (dx > 0) east++; else if (dx < 0) west++;
                } else if (dy > 0) south++; else if (dy < 0) north++;
            }
            int max = Math.max(Math.max(north, south), Math.max(east, west));
            if (max == north) direction = NORTH;
            else if (max == south) direction = SOUTH;
            else if (max == east) direction = EAST;
            else direction = WEST;
        }
        for (java.util.Map.Entry<android.view.View, MotionController> entry : controllerMap.entrySet()) {
            MotionController controller = entry.getValue();
            if (controller == null) continue;
            float dx = controller.getFinalX() - controller.getStartX();
            float dy = controller.getFinalY() - controller.getStartY();
            if (dx == 0f && dy == 0f) continue;
            boolean horizontal = Math.abs(dx) >= Math.abs(dy);
            boolean apply;
            switch (direction) {
                case NORTH: apply = motionEffectStrictMove ? (dy < 0 && !horizontal) : dy < 0; break;
                case SOUTH: apply = motionEffectStrictMove ? (dy > 0 && !horizontal) : dy > 0; break;
                case EAST: apply = motionEffectStrictMove ? (dx > 0 && horizontal) : dx > 0; break;
                case WEST: apply = motionEffectStrictMove ? (dx < 0 && horizontal) : dx < 0; break;
                default: apply = true;
            }
            if (!apply) continue;
            KeyAttributes start = new KeyAttributes();
            start.setFramePosition(this.motionEffectStart);
            start.setValue("alpha", Float.valueOf(this.motionEffectAlpha));
            if (this.motionEffectTranslationX != 0) start.setValue("translationX", Integer.valueOf(dx >= 0 ? this.motionEffectTranslationX : -this.motionEffectTranslationX));
            if (this.motionEffectTranslationY != 0) start.setValue("translationY", Integer.valueOf(dy >= 0 ? this.motionEffectTranslationY : -this.motionEffectTranslationY));
            controller.addKey(start);
            KeyAttributes end = new KeyAttributes();
            end.setFramePosition(this.motionEffectEnd);
            end.setValue("alpha", Float.valueOf(1.0f));
            if (this.motionEffectTranslationX != 0) end.setValue("translationX", Integer.valueOf(0));
            if (this.motionEffectTranslationY != 0) end.setValue("translationY", Integer.valueOf(0));
            controller.addKey(end);
        }
    }

    public MotionEffect(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.motionEffectAlpha = 0.1f;
        this.motionEffectStart = 49;
        this.motionEffectEnd = 50;
        this.motionEffectTranslationX = 0;
        this.motionEffectTranslationY = 0;
        this.motionEffectStrictMove = true;
        this.viewTransitionId = -1;
        this.fadeMove = -1;
        init(context, attributeSet);
    }

    public MotionEffect(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.motionEffectAlpha = 0.1f;
        this.motionEffectStart = 49;
        this.motionEffectEnd = 50;
        this.motionEffectTranslationX = 0;
        this.motionEffectTranslationY = 0;
        this.motionEffectStrictMove = true;
        this.viewTransitionId = -1;
        this.fadeMove = -1;
        init(context, attributeSet);
    }
}