package androidx.leanback.widget;

import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.leanback.util.MathUtil;

/* JADX INFO: loaded from: classes.dex */
class PlaybackControlsPresenter extends ControlBarPresenter {
    private static int sChildMarginBigger;
    private static int sChildMarginBiggest;
    private boolean mMoreActionsEnabled;

    public static class BoundData extends ControlBarPresenter.BoundData {
        ObjectAdapter secondaryActionsAdapter;
    }

    public class ViewHolder extends ControlBarPresenter.ViewHolder {
        final TextView mCurrentTime;
        long mCurrentTimeInMs;
        int mCurrentTimeMarginStart;
        StringBuilder mCurrentTimeStringBuilder;
        ObjectAdapter mMoreActionsAdapter;
        final FrameLayout mMoreActionsDock;
        ObjectAdapter.DataObserver mMoreActionsObserver;
        boolean mMoreActionsShowing;
        Presenter.ViewHolder mMoreActionsViewHolder;
        final ProgressBar mProgressBar;
        long mSecondaryProgressInMs;
        final TextView mTotalTime;
        long mTotalTimeInMs;
        int mTotalTimeMarginEnd;
        StringBuilder mTotalTimeStringBuilder;

        public ViewHolder(View view) {
            super(view);
            this.mCurrentTimeInMs = -1L;
            this.mTotalTimeInMs = -1L;
            this.mSecondaryProgressInMs = -1L;
            this.mTotalTimeStringBuilder = new StringBuilder();
            this.mCurrentTimeStringBuilder = new StringBuilder();
            this.mMoreActionsDock = (FrameLayout) view.findViewById(androidx.leanback.R.id.more_actions_dock);
            TextView textView = (TextView) view.findViewById(androidx.leanback.R.id.current_time);
            this.mCurrentTime = textView;
            TextView textView2 = (TextView) view.findViewById(androidx.leanback.R.id.total_time);
            this.mTotalTime = textView2;
            this.mProgressBar = (ProgressBar) view.findViewById(androidx.leanback.R.id.playback_progress);
            this.mMoreActionsObserver = new ObjectAdapter.DataObserver() { // from class: androidx.leanback.widget.PlaybackControlsPresenter.ViewHolder.1
                @Override // androidx.leanback.widget.ObjectAdapter.DataObserver
                public void onChanged() {
                    ViewHolder viewHolder = ViewHolder.this;
                    if (viewHolder.mMoreActionsShowing) {
                        viewHolder.showControls(viewHolder.mPresenter);
                    }
                }

                @Override // androidx.leanback.widget.ObjectAdapter.DataObserver
                public void onItemRangeChanged(int i, int i2) {
                    if (ViewHolder.this.mMoreActionsShowing) {
                        for (int i3 = 0; i3 < i2; i3++) {
                            ViewHolder viewHolder = ViewHolder.this;
                            viewHolder.bindControlToAction(i + i3, viewHolder.mPresenter);
                        }
                    }
                }
            };
            this.mCurrentTimeMarginStart = ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).getMarginStart();
            this.mTotalTimeMarginEnd = ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).getMarginEnd();
        }

        @Override // androidx.leanback.widget.ControlBarPresenter.ViewHolder
        public int getChildMarginFromCenter(Context context, int i) {
            int childMarginBigger;
            int controlIconWidth = PlaybackControlsPresenter.this.getControlIconWidth(context);
            if (i < 4) {
                childMarginBigger = PlaybackControlsPresenter.this.getChildMarginBiggest(context);
            } else {
                childMarginBigger = i < 6 ? PlaybackControlsPresenter.this.getChildMarginBigger(context) : PlaybackControlsPresenter.this.getChildMarginDefault(context);
            }
            return controlIconWidth + childMarginBigger;
        }

        public long getCurrentTime() {
            return this.mTotalTimeInMs;
        }

        @Override // androidx.leanback.widget.ControlBarPresenter.ViewHolder
        public ObjectAdapter getDisplayedAdapter() {
            return this.mMoreActionsShowing ? this.mMoreActionsAdapter : this.mAdapter;
        }

        public long getSecondaryProgress() {
            return this.mSecondaryProgressInMs;
        }

        public long getTotalTime() {
            return this.mTotalTimeInMs;
        }

        public void setCurrentTime(long j) {
            long j2 = j / 1000;
            if (j != this.mCurrentTimeInMs) {
                this.mCurrentTimeInMs = j;
                PlaybackControlsPresenter.formatTime(j2, this.mCurrentTimeStringBuilder);
                this.mCurrentTime.setText(this.mCurrentTimeStringBuilder.toString());
            }
            this.mProgressBar.setProgress((int) ((this.mCurrentTimeInMs / this.mTotalTimeInMs) * 2.147483647E9d));
        }

        public void setSecondaryProgress(long j) {
            this.mSecondaryProgressInMs = j;
            this.mProgressBar.setSecondaryProgress((int) ((j / this.mTotalTimeInMs) * 2.147483647E9d));
        }

        public void setTotalTime(long j) {
            if (j <= 0) {
                this.mTotalTime.setVisibility(8);
                this.mProgressBar.setVisibility(8);
                return;
            }
            this.mTotalTime.setVisibility(0);
            this.mProgressBar.setVisibility(0);
            this.mTotalTimeInMs = j;
            PlaybackControlsPresenter.formatTime(j / 1000, this.mTotalTimeStringBuilder);
            this.mTotalTime.setText(this.mTotalTimeStringBuilder.toString());
            this.mProgressBar.setMax(Integer.MAX_VALUE);
        }

        public void showMoreActions(boolean z) {
            if (!z) {
                Presenter.ViewHolder viewHolder = this.mMoreActionsViewHolder;
                if (viewHolder == null || viewHolder.view.getParent() == null) {
                    return;
                }
                this.mMoreActionsDock.removeView(this.mMoreActionsViewHolder.view);
                return;
            }
            if (this.mMoreActionsViewHolder == null) {
                PlaybackControlsRow.MoreActions moreActions = new PlaybackControlsRow.MoreActions(this.mMoreActionsDock.getContext());
                Presenter.ViewHolder viewHolderOnCreateViewHolder = this.mPresenter.onCreateViewHolder(this.mMoreActionsDock);
                this.mMoreActionsViewHolder = viewHolderOnCreateViewHolder;
                this.mPresenter.onBindViewHolder(viewHolderOnCreateViewHolder, moreActions);
                this.mPresenter.setOnClickListener(this.mMoreActionsViewHolder, new View.OnClickListener() { // from class: androidx.leanback.widget.PlaybackControlsPresenter.ViewHolder.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        ViewHolder.this.toggleMoreActions();
                    }
                });
            }
            if (this.mMoreActionsViewHolder.view.getParent() == null) {
                this.mMoreActionsDock.addView(this.mMoreActionsViewHolder.view);
            }
        }

        public void toggleMoreActions() {
            this.mMoreActionsShowing = !this.mMoreActionsShowing;
            showControls(this.mPresenter);
        }
    }

    public PlaybackControlsPresenter(int i) {
        super(i);
        this.mMoreActionsEnabled = true;
    }

    public static void formatTime(long j, StringBuilder sb) {
        long j2 = j / 60;
        long j3 = j2 / 60;
        long j4 = j - (j2 * 60);
        long j5 = j2 - (60 * j3);
        sb.setLength(0);
        if (j3 > 0) {
            sb.append(j3);
            sb.append(':');
            if (j5 < 10) {
                sb.append('0');
            }
        }
        sb.append(j5);
        sb.append(':');
        if (j4 < 10) {
            sb.append('0');
        }
        sb.append(j4);
    }

    public boolean areMoreActionsEnabled() {
        return this.mMoreActionsEnabled;
    }

    public void enableSecondaryActions(boolean z) {
        this.mMoreActionsEnabled = z;
    }

    public void enableTimeMargins(ViewHolder viewHolder, boolean z) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewHolder.mCurrentTime.getLayoutParams();
        marginLayoutParams.setMarginStart(z ? viewHolder.mCurrentTimeMarginStart : 0);
        viewHolder.mCurrentTime.setLayoutParams(marginLayoutParams);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) viewHolder.mTotalTime.getLayoutParams();
        marginLayoutParams2.setMarginEnd(z ? viewHolder.mTotalTimeMarginEnd : 0);
        viewHolder.mTotalTime.setLayoutParams(marginLayoutParams2);
    }

    public int getChildMarginBigger(Context context) {
        if (sChildMarginBigger == 0) {
            sChildMarginBigger = context.getResources().getDimensionPixelSize(androidx.leanback.R.dimen.lb_playback_controls_child_margin_bigger);
        }
        return sChildMarginBigger;
    }

    public int getChildMarginBiggest(Context context) {
        if (sChildMarginBiggest == 0) {
            sChildMarginBiggest = context.getResources().getDimensionPixelSize(androidx.leanback.R.dimen.lb_playback_controls_child_margin_biggest);
        }
        return sChildMarginBiggest;
    }

    public int getCurrentTime(ViewHolder viewHolder) {
        return MathUtil.safeLongToInt(getCurrentTimeLong(viewHolder));
    }

    public long getCurrentTimeLong(ViewHolder viewHolder) {
        return viewHolder.getCurrentTime();
    }

    public int getSecondaryProgress(ViewHolder viewHolder) {
        return MathUtil.safeLongToInt(getSecondaryProgressLong(viewHolder));
    }

    public long getSecondaryProgressLong(ViewHolder viewHolder) {
        return viewHolder.getSecondaryProgress();
    }

    public int getTotalTime(ViewHolder viewHolder) {
        return MathUtil.safeLongToInt(getTotalTimeLong(viewHolder));
    }

    public long getTotalTimeLong(ViewHolder viewHolder) {
        return viewHolder.getTotalTime();
    }

    @Override // androidx.leanback.widget.ControlBarPresenter, androidx.leanback.widget.Presenter
    public void onBindViewHolder(Presenter.ViewHolder viewHolder, Object obj) {
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        ObjectAdapter objectAdapter = viewHolder2.mMoreActionsAdapter;
        ObjectAdapter objectAdapter2 = ((BoundData) obj).secondaryActionsAdapter;
        if (objectAdapter != objectAdapter2) {
            viewHolder2.mMoreActionsAdapter = objectAdapter2;
            objectAdapter2.registerObserver(viewHolder2.mMoreActionsObserver);
            viewHolder2.mMoreActionsShowing = false;
        }
        super.onBindViewHolder(viewHolder, obj);
        viewHolder2.showMoreActions(this.mMoreActionsEnabled);
    }

    @Override // androidx.leanback.widget.ControlBarPresenter, androidx.leanback.widget.Presenter
    public Presenter.ViewHolder onCreateViewHolder(ViewGroup viewGroup) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(getLayoutResourceId(), viewGroup, false));
    }

    @Override // androidx.leanback.widget.ControlBarPresenter, androidx.leanback.widget.Presenter
    public void onUnbindViewHolder(Presenter.ViewHolder viewHolder) {
        super.onUnbindViewHolder(viewHolder);
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        ObjectAdapter objectAdapter = viewHolder2.mMoreActionsAdapter;
        if (objectAdapter != null) {
            objectAdapter.unregisterObserver(viewHolder2.mMoreActionsObserver);
            viewHolder2.mMoreActionsAdapter = null;
        }
    }

    public void resetFocus(ViewHolder viewHolder) {
        viewHolder.mControlBar.requestFocus();
    }

    public void setCurrentTime(ViewHolder viewHolder, int i) {
        setCurrentTimeLong(viewHolder, i);
    }

    public void setCurrentTimeLong(ViewHolder viewHolder, long j) {
        viewHolder.setCurrentTime(j);
    }

    public void setProgressColor(ViewHolder viewHolder, @ColorInt int i) {
        ((LayerDrawable) viewHolder.mProgressBar.getProgressDrawable()).setDrawableByLayerId(android.R.id.progress, new ClipDrawable(new ColorDrawable(i), 3, 1));
    }

    public void setSecondaryProgress(ViewHolder viewHolder, int i) {
        setSecondaryProgressLong(viewHolder, i);
    }

    public void setSecondaryProgressLong(ViewHolder viewHolder, long j) {
        viewHolder.setSecondaryProgress(j);
    }

    public void setTotalTime(ViewHolder viewHolder, int i) {
        setTotalTimeLong(viewHolder, i);
    }

    public void setTotalTimeLong(ViewHolder viewHolder, long j) {
        viewHolder.setTotalTime(j);
    }

    public void showPrimaryActions(ViewHolder viewHolder) {
        if (viewHolder.mMoreActionsShowing) {
            viewHolder.toggleMoreActions();
        }
    }
}
