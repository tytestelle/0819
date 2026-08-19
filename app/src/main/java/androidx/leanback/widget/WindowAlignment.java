package androidx.leanback.widget;

/* JADX INFO: loaded from: classes.dex */
final class WindowAlignment {
    public final Axis horizontal;
    private Axis mMainAxis;
    private int mOrientation = 0;
    private Axis mSecondAxis;
    public final Axis vertical;

    public static final class Axis {
        private static final int PF_KEYLINE_OVER_HIGH_EDGE = 2;
        private static final int PF_KEYLINE_OVER_LOW_EDGE = 1;
        private int mMaxEdge;
        private int mMaxScroll;
        private int mMinEdge;
        private int mMinScroll;
        private int mPaddingMax;
        private int mPaddingMin;
        private boolean mReversedFlow;
        private int mSize;
        private int mPreferredKeyLine = 2;
        private int mWindowAlignment = 3;
        private int mWindowAlignmentOffset = 0;
        private float mWindowAlignmentOffsetPercent = 50.0f;

        public Axis(String str) {
            reset();
        }

        public int calculateKeyline() {
            if (this.mReversedFlow) {
                int i = this.mWindowAlignmentOffset;
                int i2 = i >= 0 ? this.mSize - i : -i;
                float f = this.mWindowAlignmentOffsetPercent;
                return f != -1.0f ? i2 - ((int) ((this.mSize * f) / 100.0f)) : i2;
            }
            int i3 = this.mWindowAlignmentOffset;
            if (i3 < 0) {
                i3 += this.mSize;
            }
            float f2 = this.mWindowAlignmentOffsetPercent;
            return f2 != -1.0f ? i3 + ((int) ((this.mSize * f2) / 100.0f)) : i3;
        }

        public int calculateScrollToKeyLine(int i, int i2) {
            return i - i2;
        }

        public int getClientSize() {
            return (this.mSize - this.mPaddingMin) - this.mPaddingMax;
        }

        public int getMaxScroll() {
            return this.mMaxScroll;
        }

        public int getMinScroll() {
            return this.mMinScroll;
        }

        public int getPaddingMax() {
            return this.mPaddingMax;
        }

        public int getPaddingMin() {
            return this.mPaddingMin;
        }

        public int getScroll(int i) {
            int i2;
            int i3;
            int size = getSize();
            int iCalculateKeyline = calculateKeyline();
            boolean zIsMinUnknown = isMinUnknown();
            boolean zIsMaxUnknown = isMaxUnknown();
            if (!zIsMinUnknown) {
                int i4 = this.mPaddingMin;
                int i5 = iCalculateKeyline - i4;
                if (this.mReversedFlow ? (this.mWindowAlignment & 2) != 0 : (this.mWindowAlignment & 1) != 0) {
                    int i6 = this.mMinEdge;
                    if (i - i6 <= i5) {
                        int i7 = i6 - i4;
                        return (zIsMaxUnknown || i7 <= (i3 = this.mMaxScroll)) ? i7 : i3;
                    }
                }
            }
            if (!zIsMaxUnknown) {
                int i8 = this.mPaddingMax;
                int i9 = (size - iCalculateKeyline) - i8;
                if (this.mReversedFlow ? (this.mWindowAlignment & 1) != 0 : (this.mWindowAlignment & 2) != 0) {
                    int i10 = this.mMaxEdge;
                    if (i10 - i <= i9) {
                        int i11 = i10 - (size - i8);
                        return (zIsMinUnknown || i11 >= (i2 = this.mMinScroll)) ? i11 : i2;
                    }
                }
            }
            return calculateScrollToKeyLine(i, iCalculateKeyline);
        }

        public int getSize() {
            return this.mSize;
        }

        public int getWindowAlignment() {
            return this.mWindowAlignment;
        }

        public int getWindowAlignmentOffset() {
            return this.mWindowAlignmentOffset;
        }

        public float getWindowAlignmentOffsetPercent() {
            return this.mWindowAlignmentOffsetPercent;
        }

        public void invalidateScrollMax() {
            this.mMaxEdge = Integer.MAX_VALUE;
            this.mMaxScroll = Integer.MAX_VALUE;
        }

        public void invalidateScrollMin() {
            this.mMinEdge = Integer.MIN_VALUE;
            this.mMinScroll = Integer.MIN_VALUE;
        }

        public boolean isMaxUnknown() {
            return this.mMaxEdge == Integer.MAX_VALUE;
        }

        public boolean isMinUnknown() {
            return this.mMinEdge == Integer.MIN_VALUE;
        }

        public boolean isPreferKeylineOverHighEdge() {
            return (this.mPreferredKeyLine & 2) != 0;
        }

        public boolean isPreferKeylineOverLowEdge() {
            return (this.mPreferredKeyLine & 1) != 0;
        }

        public void reset() {
            this.mMinEdge = Integer.MIN_VALUE;
            this.mMaxEdge = Integer.MAX_VALUE;
        }

        public void setPadding(int i, int i2) {
            this.mPaddingMin = i;
            this.mPaddingMax = i2;
        }

        public void setPreferKeylineOverHighEdge(boolean z) {
            this.mPreferredKeyLine = z ? this.mPreferredKeyLine | 2 : this.mPreferredKeyLine & (-3);
        }

        public void setPreferKeylineOverLowEdge(boolean z) {
            this.mPreferredKeyLine = z ? this.mPreferredKeyLine | 1 : this.mPreferredKeyLine & (-2);
        }

        public void setReversedFlow(boolean z) {
            this.mReversedFlow = z;
        }

        public void setSize(int i) {
            this.mSize = i;
        }

        public void setWindowAlignment(int i) {
            this.mWindowAlignment = i;
        }

        public void setWindowAlignmentOffset(int i) {
            this.mWindowAlignmentOffset = i;
        }

        public void setWindowAlignmentOffsetPercent(float f) {
            if ((f < 0.0f || f > 100.0f) && f != -1.0f) {
                throw new IllegalArgumentException();
            }
            this.mWindowAlignmentOffsetPercent = f;
        }

        public String toString() {
            return " min:" + this.mMinEdge + " " + this.mMinScroll + " max:" + this.mMaxEdge + " " + this.mMaxScroll;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
        
            r4.mMinScroll = r4.mMinEdge - r4.mPaddingMin;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
        
            r4.mMaxScroll = (r4.mMaxEdge - r4.mPaddingMin) - r5;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void updateMinMax(int minEdge, int maxEdge, int minChildViewCenter, int maxChildViewCenter) {
            this.mMinEdge = minEdge;
            this.mMaxEdge = maxEdge;
            int clientSize = getClientSize();
            int keyLine = calculateKeyline();
            boolean minUnknown = isMinUnknown();
            boolean maxUnknown = isMaxUnknown();
            if (!minUnknown) {
                if (!this.mReversedFlow ? (this.mWindowAlignment & 1) != 0 : (this.mWindowAlignment & 2) != 0) {
                    this.mMinScroll = this.mMinEdge - this.mPaddingMin;
                } else {
                    this.mMinScroll = calculateScrollToKeyLine(minChildViewCenter, keyLine);
                }
            }
            if (!maxUnknown) {
                if (!this.mReversedFlow ? (this.mWindowAlignment & 2) != 0 : (this.mWindowAlignment & 1) != 0) {
                    this.mMaxScroll = (this.mMaxEdge - this.mPaddingMin) - clientSize;
                } else {
                    this.mMaxScroll = calculateScrollToKeyLine(maxChildViewCenter, keyLine);
                }
            }
            if (minUnknown || maxUnknown) {
                return;
            }
            if (!this.mReversedFlow) {
                if ((this.mWindowAlignment & 1) != 0) {
                    if (isPreferKeylineOverLowEdge()) {
                        this.mMinScroll = Math.min(this.mMinScroll, calculateScrollToKeyLine(maxChildViewCenter, keyLine));
                    }
                    this.mMaxScroll = Math.max(this.mMinScroll, this.mMaxScroll);
                } else if ((this.mWindowAlignment & 2) != 0) {
                    if (isPreferKeylineOverHighEdge()) {
                        this.mMaxScroll = Math.max(this.mMaxScroll, calculateScrollToKeyLine(minChildViewCenter, keyLine));
                    }
                    this.mMinScroll = Math.min(this.mMinScroll, this.mMaxScroll);
                }
            } else {
                if ((this.mWindowAlignment & 1) != 0) {
                    if (isPreferKeylineOverLowEdge()) {
                        this.mMaxScroll = Math.max(this.mMaxScroll, calculateScrollToKeyLine(minChildViewCenter, keyLine));
                    }
                    this.mMinScroll = Math.min(this.mMinScroll, this.mMaxScroll);
                } else if ((this.mWindowAlignment & 2) != 0) {
                    if (isPreferKeylineOverHighEdge()) {
                        this.mMinScroll = Math.min(this.mMinScroll, calculateScrollToKeyLine(maxChildViewCenter, keyLine));
                    }
                    this.mMaxScroll = Math.max(this.mMinScroll, this.mMaxScroll);
                }
            }
        }
    }

    public WindowAlignment() {
        Axis axis = new Axis("vertical");
        this.vertical = axis;
        Axis axis2 = new Axis("horizontal");
        this.horizontal = axis2;
        this.mMainAxis = axis2;
        this.mSecondAxis = axis;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public Axis mainAxis() {
        return this.mMainAxis;
    }

    public void reset() {
        mainAxis().reset();
    }

    public Axis secondAxis() {
        return this.mSecondAxis;
    }

    public void setOrientation(int i) {
        this.mOrientation = i;
        if (i == 0) {
            this.mMainAxis = this.horizontal;
            this.mSecondAxis = this.vertical;
        } else {
            this.mMainAxis = this.vertical;
            this.mSecondAxis = this.horizontal;
        }
    }

    public String toString() {
        return "horizontal=" + this.horizontal + "; vertical=" + this.vertical;
    }
}
