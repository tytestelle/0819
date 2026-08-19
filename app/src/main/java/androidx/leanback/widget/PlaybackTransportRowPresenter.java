package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class PlaybackTransportRowPresenter extends PlaybackRowPresenter {
    Presenter mDescriptionPresenter;
    OnActionClickedListener mOnActionClickedListener;
    private final ControlBarPresenter.OnControlClickedListener mOnControlClickedListener;
    private final ControlBarPresenter.OnControlSelectedListener mOnControlSelectedListener;
    ControlBarPresenter mPlaybackControlsPresenter;
    boolean mProgressColorSet;
    ControlBarPresenter mSecondaryControlsPresenter;
    boolean mSecondaryProgressColorSet;
    float mDefaultSeekIncrement = 0.01f;
    int mProgressColor = 0;
    int mSecondaryProgressColor = 0;

    public static class BoundData extends PlaybackControlsPresenter.BoundData {
        ViewHolder mRowViewHolder;
    }

    public class ViewHolder extends PlaybackRowPresenter.ViewHolder implements PlaybackSeekUi {
        BoundData mControlsBoundData;
        final ViewGroup mControlsDock;
        ControlBarPresenter.ViewHolder mControlsVh;
        final TextView mCurrentTime;
        long mCurrentTimeInMs;
        final ViewGroup mDescriptionDock;
        final Presenter.ViewHolder mDescriptionViewHolder;
        final ImageView mImageView;
        boolean mInSeek;
        final PlaybackControlsRow.OnPlaybackProgressCallback mListener;
        PlaybackControlsRow.PlayPauseAction mPlayPauseAction;
        long[] mPositions;
        int mPositionsLength;
        final SeekBar mProgressBar;
        BoundData mSecondaryBoundData;
        final ViewGroup mSecondaryControlsDock;
        ControlBarPresenter.ViewHolder mSecondaryControlsVh;
        long mSecondaryProgressInMs;
        PlaybackSeekUi.Client mSeekClient;
        PlaybackSeekDataProvider mSeekDataProvider;
        Object mSelectedItem;
        Presenter.ViewHolder mSelectedViewHolder;
        final StringBuilder mTempBuilder;
        int mThumbHeroIndex;
        PlaybackSeekDataProvider.ResultCallback mThumbResult;
        final ThumbsBar mThumbsBar;
        final TextView mTotalTime;
        long mTotalTimeInMs;

        public ViewHolder(View view, Presenter presenter) {
            super(view);
            this.mTotalTimeInMs = Long.MIN_VALUE;
            this.mCurrentTimeInMs = Long.MIN_VALUE;
            this.mTempBuilder = new StringBuilder();
            this.mControlsBoundData = new BoundData();
            this.mSecondaryBoundData = new BoundData();
            this.mThumbHeroIndex = -1;
            this.mListener = new PlaybackControlsRow.OnPlaybackProgressCallback() { // from class: androidx.leanback.widget.PlaybackTransportRowPresenter.ViewHolder.1
                @Override // androidx.leanback.widget.PlaybackControlsRow.OnPlaybackProgressCallback
                public void onBufferedPositionChanged(PlaybackControlsRow playbackControlsRow, long j) {
                    ViewHolder.this.setBufferedPosition(j);
                }

                @Override // androidx.leanback.widget.PlaybackControlsRow.OnPlaybackProgressCallback
                public void onCurrentPositionChanged(PlaybackControlsRow playbackControlsRow, long j) {
                    ViewHolder.this.setCurrentPosition(j);
                }

                @Override // androidx.leanback.widget.PlaybackControlsRow.OnPlaybackProgressCallback
                public void onDurationChanged(PlaybackControlsRow playbackControlsRow, long j) {
                    ViewHolder.this.setTotalTime(j);
                }
            };
            this.mThumbResult = new PlaybackSeekDataProvider.ResultCallback() { // from class: androidx.leanback.widget.PlaybackTransportRowPresenter.ViewHolder.2
                @Override // androidx.leanback.widget.PlaybackSeekDataProvider.ResultCallback
                public void onThumbnailLoaded(Bitmap bitmap, int i) {
                    ViewHolder viewHolder = ViewHolder.this;
                    int childCount = i - (viewHolder.mThumbHeroIndex - (viewHolder.mThumbsBar.getChildCount() / 2));
                    if (childCount < 0 || childCount >= ViewHolder.this.mThumbsBar.getChildCount()) {
                        return;
                    }
                    ViewHolder.this.mThumbsBar.setThumbBitmap(childCount, bitmap);
                }
            };
            this.mImageView = (ImageView) view.findViewById(androidx.leanback.R.id.image);
            ViewGroup viewGroup = (ViewGroup) view.findViewById(androidx.leanback.R.id.description_dock);
            this.mDescriptionDock = viewGroup;
            this.mCurrentTime = (TextView) view.findViewById(androidx.leanback.R.id.current_time);
            this.mTotalTime = (TextView) view.findViewById(androidx.leanback.R.id.total_time);
            SeekBar seekBar = (SeekBar) view.findViewById(androidx.leanback.R.id.playback_progress);
            this.mProgressBar = seekBar;
            seekBar.setOnClickListener(new View.OnClickListener() { // from class: androidx.leanback.widget.PlaybackTransportRowPresenter.ViewHolder.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    ViewHolder viewHolder = ViewHolder.this;
                    PlaybackTransportRowPresenter.this.onProgressBarClicked(viewHolder);
                }
            });
            seekBar.setOnKeyListener(new View.OnKeyListener() { // from class: androidx.leanback.widget.PlaybackTransportRowPresenter.ViewHolder.4
                @Override // android.view.View.OnKeyListener
                public boolean onKey(View view2, int i, KeyEvent keyEvent) {
                    if (i != 4) {
                        if (i != 66) {
                            if (i != 69) {
                                if (i != 81) {
                                    if (i != 111) {
                                        if (i != 89) {
                                            if (i != 90) {
                                                switch (i) {
                                                    case 19:
                                                    case 20:
                                                        return ViewHolder.this.mInSeek;
                                                    case 21:
                                                        break;
                                                    case 22:
                                                        break;
                                                    case 23:
                                                        break;
                                                    default:
                                                        return false;
                                                }
                                            }
                                        }
                                    }
                                }
                                if (keyEvent.getAction() == 0) {
                                    ViewHolder.this.onForward();
                                }
                                return true;
                            }
                            if (keyEvent.getAction() == 0) {
                                ViewHolder.this.onBackward();
                            }
                            return true;
                        }
                        if (!ViewHolder.this.mInSeek) {
                            return false;
                        }
                        if (keyEvent.getAction() == 1) {
                            ViewHolder.this.stopSeek(false);
                        }
                        return true;
                    }
                    if (!ViewHolder.this.mInSeek) {
                        return false;
                    }
                    if (keyEvent.getAction() == 1) {
                        ViewHolder viewHolder = ViewHolder.this;
                        viewHolder.stopSeek(!viewHolder.mProgressBar.isAccessibilityFocused());
                    }
                    return true;
                }
            });
            seekBar.setAccessibilitySeekListener(new SeekBar.AccessibilitySeekListener() { // from class: androidx.leanback.widget.PlaybackTransportRowPresenter.ViewHolder.5
                @Override // androidx.leanback.widget.SeekBar.AccessibilitySeekListener
                public boolean onAccessibilitySeekBackward() {
                    return ViewHolder.this.onBackward();
                }

                @Override // androidx.leanback.widget.SeekBar.AccessibilitySeekListener
                public boolean onAccessibilitySeekForward() {
                    return ViewHolder.this.onForward();
                }
            });
            seekBar.setMax(Integer.MAX_VALUE);
            this.mControlsDock = (ViewGroup) view.findViewById(androidx.leanback.R.id.controls_dock);
            this.mSecondaryControlsDock = (ViewGroup) view.findViewById(androidx.leanback.R.id.secondary_controls_dock);
            Presenter.ViewHolder viewHolderOnCreateViewHolder = presenter == null ? null : presenter.onCreateViewHolder(viewGroup);
            this.mDescriptionViewHolder = viewHolderOnCreateViewHolder;
            if (viewHolderOnCreateViewHolder != null) {
                viewGroup.addView(viewHolderOnCreateViewHolder.view);
            }
            this.mThumbsBar = (ThumbsBar) view.findViewById(androidx.leanback.R.id.thumbs_row);
        }

        public void dispatchItemSelection() {
            if (isSelected()) {
                if (this.mSelectedViewHolder == null) {
                    if (getOnItemViewSelectedListener() != null) {
                        getOnItemViewSelectedListener().onItemSelected(null, null, this, getRow());
                    }
                } else if (getOnItemViewSelectedListener() != null) {
                    getOnItemViewSelectedListener().onItemSelected(this.mSelectedViewHolder, this.mSelectedItem, this, getRow());
                }
            }
        }

        public final TextView getCurrentPositionView() {
            return this.mCurrentTime;
        }

        public final Presenter.ViewHolder getDescriptionViewHolder() {
            return this.mDescriptionViewHolder;
        }

        public final TextView getDurationView() {
            return this.mTotalTime;
        }

        public Presenter getPresenter(boolean z) {
            ObjectAdapter primaryActionsAdapter = z ? ((PlaybackControlsRow) getRow()).getPrimaryActionsAdapter() : ((PlaybackControlsRow) getRow()).getSecondaryActionsAdapter();
            if (primaryActionsAdapter == null) {
                return null;
            }
            if (primaryActionsAdapter.getPresenterSelector() instanceof ControlButtonPresenterSelector) {
                return ((ControlButtonPresenterSelector) primaryActionsAdapter.getPresenterSelector()).getSecondaryPresenter();
            }
            return primaryActionsAdapter.getPresenter(primaryActionsAdapter.size() > 0 ? primaryActionsAdapter.get(0) : null);
        }

        public boolean onBackward() {
            if (!startSeek()) {
                return false;
            }
            updateProgressInSeek(false);
            return true;
        }

        public boolean onForward() {
            if (!startSeek()) {
                return false;
            }
            updateProgressInSeek(true);
            return true;
        }

        public void onSetCurrentPositionLabel(long j) {
            if (this.mCurrentTime != null) {
                PlaybackTransportRowPresenter.formatTime(j, this.mTempBuilder);
                this.mCurrentTime.setText(this.mTempBuilder.toString());
            }
        }

        public void onSetDurationLabel(long j) {
            if (this.mTotalTime != null) {
                PlaybackTransportRowPresenter.formatTime(j, this.mTempBuilder);
                this.mTotalTime.setText(this.mTempBuilder.toString());
            }
        }

        public void setBufferedPosition(long j) {
            this.mSecondaryProgressInMs = j;
            this.mProgressBar.setSecondaryProgress((int) ((j / this.mTotalTimeInMs) * 2.147483647E9d));
        }

        public void setCurrentPosition(long j) {
            if (j != this.mCurrentTimeInMs) {
                this.mCurrentTimeInMs = j;
                onSetCurrentPositionLabel(j);
            }
            if (this.mInSeek) {
                return;
            }
            long j2 = this.mTotalTimeInMs;
            this.mProgressBar.setProgress(j2 > 0 ? (int) ((this.mCurrentTimeInMs / j2) * 2.147483647E9d) : 0);
        }

        @Override // androidx.leanback.widget.PlaybackSeekUi
        public void setPlaybackSeekUiClient(PlaybackSeekUi.Client client) {
            this.mSeekClient = client;
        }

        public void setTotalTime(long j) {
            if (this.mTotalTimeInMs != j) {
                this.mTotalTimeInMs = j;
                onSetDurationLabel(j);
            }
        }

        public boolean startSeek() {
            if (this.mInSeek) {
                return true;
            }
            PlaybackSeekUi.Client client = this.mSeekClient;
            if (client == null || !client.isSeekEnabled() || this.mTotalTimeInMs <= 0) {
                return false;
            }
            this.mInSeek = true;
            this.mSeekClient.onSeekStarted();
            PlaybackSeekDataProvider playbackSeekDataProvider = this.mSeekClient.getPlaybackSeekDataProvider();
            this.mSeekDataProvider = playbackSeekDataProvider;
            long[] seekPositions = playbackSeekDataProvider != null ? playbackSeekDataProvider.getSeekPositions() : null;
            this.mPositions = seekPositions;
            if (seekPositions != null) {
                int iBinarySearch = Arrays.binarySearch(seekPositions, this.mTotalTimeInMs);
                if (iBinarySearch >= 0) {
                    this.mPositionsLength = iBinarySearch + 1;
                } else {
                    this.mPositionsLength = (-1) - iBinarySearch;
                }
            } else {
                this.mPositionsLength = 0;
            }
            this.mControlsVh.view.setVisibility(8);
            this.mSecondaryControlsVh.view.setVisibility(4);
            this.mDescriptionViewHolder.view.setVisibility(4);
            this.mThumbsBar.setVisibility(0);
            return true;
        }

        public void stopSeek(boolean z) {
            if (this.mInSeek) {
                this.mInSeek = false;
                this.mSeekClient.onSeekFinished(z);
                PlaybackSeekDataProvider playbackSeekDataProvider = this.mSeekDataProvider;
                if (playbackSeekDataProvider != null) {
                    playbackSeekDataProvider.reset();
                }
                this.mThumbHeroIndex = -1;
                this.mThumbsBar.clearThumbBitmaps();
                this.mSeekDataProvider = null;
                this.mPositions = null;
                this.mPositionsLength = 0;
                this.mControlsVh.view.setVisibility(0);
                this.mSecondaryControlsVh.view.setVisibility(0);
                this.mDescriptionViewHolder.view.setVisibility(0);
                this.mThumbsBar.setVisibility(4);
            }
        }

        public void updateProgressInSeek(boolean z) {
            long j;
            long j2 = this.mCurrentTimeInMs;
            int i = this.mPositionsLength;
            long j3 = 0;
            if (i > 0) {
                int i2 = 0;
                int iBinarySearch = Arrays.binarySearch(this.mPositions, 0, i, j2);
                if (z) {
                    if (iBinarySearch < 0) {
                        int i3 = (-1) - iBinarySearch;
                        if (i3 <= this.mPositionsLength - 1) {
                            j = this.mPositions[i3];
                            i2 = i3;
                        } else {
                            j = this.mTotalTimeInMs;
                            if (i3 > 0) {
                                i2 = (-2) - iBinarySearch;
                            }
                        }
                        j3 = j;
                    } else if (iBinarySearch < this.mPositionsLength - 1) {
                        i2 = iBinarySearch + 1;
                        j3 = this.mPositions[i2];
                    } else {
                        j3 = this.mTotalTimeInMs;
                        i2 = iBinarySearch;
                    }
                } else if (iBinarySearch >= 0) {
                    if (iBinarySearch > 0) {
                        i2 = iBinarySearch - 1;
                        j3 = this.mPositions[i2];
                    }
                } else if ((-1) - iBinarySearch > 0) {
                    i2 = (-2) - iBinarySearch;
                    j3 = this.mPositions[i2];
                }
                updateThumbsInSeek(i2, z);
            } else {
                long defaultSeekIncrement = (long) (PlaybackTransportRowPresenter.this.getDefaultSeekIncrement() * this.mTotalTimeInMs);
                if (!z) {
                    defaultSeekIncrement = -defaultSeekIncrement;
                }
                long j4 = j2 + defaultSeekIncrement;
                long j5 = this.mTotalTimeInMs;
                if (j4 > j5) {
                    j3 = j5;
                } else if (j4 >= 0) {
                    j3 = j4;
                }
            }
            this.mProgressBar.setProgress((int) ((j3 / this.mTotalTimeInMs) * 2.147483647E9d));
            this.mSeekClient.onSeekPositionChanged(j3);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x0084 A[ADDED_TO_REGION, LOOP:0: B:30:0x0084->B:31:0x0086, LOOP_START, PHI: r7
  0x0084: PHI (r7v13 int) = (r7v12 int), (r7v14 int) binds: [B:29:0x0082, B:31:0x0086] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:31:0x0086 A[LOOP:0: B:30:0x0084->B:31:0x0086, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:32:0x0090 A[ADDED_TO_REGION, LOOP:3: B:32:0x0090->B:33:0x0092, LOOP_START, PHI: r5
  0x0090: PHI (r5v9 int) = (r5v8 int), (r5v10 int) binds: [B:29:0x0082, B:33:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:33:0x0092 A[LOOP:3: B:32:0x0090->B:33:0x0092, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:36:0x00a4 A[LOOP:1: B:34:0x009c->B:36:0x00a4, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:39:0x00b1 A[LOOP:2: B:38:0x00af->B:39:0x00b1, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:44:0x00ac A[EDGE_INSN: B:44:0x00ac->B:37:0x00ac BREAK  A[LOOP:1: B:34:0x009c->B:36:0x00a4], SYNTHETIC] */
        public void updateThumbsInSeek(int i, boolean z) {
            int iMin;
            int i2;
            int i3;
            int i4;
            if (this.mThumbHeroIndex == i) {
                return;
            }
            int childCount = this.mThumbsBar.getChildCount();
            if (childCount < 0 || (childCount & 1) == 0) {
                throw new RuntimeException();
            }
            int i5 = childCount / 2;
            int i6 = 0;
            int iMax = Math.max(i - i5, 0);
            int iMin2 = Math.min(i + i5, this.mPositionsLength - 1);
            int i7 = this.mThumbHeroIndex;
            if (i7 >= 0) {
                z = i > i7;
                int iMax2 = Math.max(i7 - i5, 0);
                int iMin3 = Math.min(this.mThumbHeroIndex + i5, this.mPositionsLength - 1);
                if (z) {
                    int iMax3 = Math.max(iMin3 + 1, iMax);
                    for (int i8 = iMax; i8 <= iMax3 - 1; i8++) {
                        ThumbsBar thumbsBar = this.mThumbsBar;
                        thumbsBar.setThumbBitmap((i8 - i) + i5, thumbsBar.getThumbBitmap((i8 - this.mThumbHeroIndex) + i5));
                    }
                    i2 = iMax3;
                } else {
                    iMin = Math.min(iMax2 - 1, iMin2);
                    for (int i9 = iMin2; i9 >= iMin + 1; i9--) {
                        ThumbsBar thumbsBar2 = this.mThumbsBar;
                        thumbsBar2.setThumbBitmap((i9 - i) + i5, thumbsBar2.getThumbBitmap((i9 - this.mThumbHeroIndex) + i5));
                    }
                    i2 = iMax;
                }
                this.mThumbHeroIndex = i;
                if (z) {
                    while (i2 <= iMin) {
                        this.mSeekDataProvider.getThumbnail(i2, this.mThumbResult);
                        i2++;
                    }
                } else {
                    while (iMin >= i2) {
                        this.mSeekDataProvider.getThumbnail(iMin, this.mThumbResult);
                        iMin--;
                    }
                }
                while (true) {
                    i3 = this.mThumbHeroIndex;
                    if (i6 < (i5 - i3) + iMax) {
                        break;
                    }
                    this.mThumbsBar.setThumbBitmap(i6, null);
                    i6++;
                }
                for (i4 = ((i5 + iMin2) - i3) + 1; i4 < childCount; i4++) {
                    this.mThumbsBar.setThumbBitmap(i4, null);
                }
            }
            i2 = iMax;
            iMin = iMin2;
            this.mThumbHeroIndex = i;
            if (z) {
                while (i2 <= iMin) {
                    this.mSeekDataProvider.getThumbnail(i2, this.mThumbResult);
                    i2++;
                }
            } else {
                while (iMin >= i2) {
                    this.mSeekDataProvider.getThumbnail(iMin, this.mThumbResult);
                    iMin--;
                }
            }
            while (true) {
                i3 = this.mThumbHeroIndex;
                if (i6 < (i5 - i3) + iMax) {
                    break;
                    break;
                } else {
                    this.mThumbsBar.setThumbBitmap(i6, null);
                    i6++;
                }
            }
            while (i4 < childCount) {
                this.mThumbsBar.setThumbBitmap(i4, null);
            }
        }
    }

    public PlaybackTransportRowPresenter() {
        ControlBarPresenter.OnControlSelectedListener onControlSelectedListener = new ControlBarPresenter.OnControlSelectedListener() { // from class: androidx.leanback.widget.PlaybackTransportRowPresenter.1
            @Override // androidx.leanback.widget.ControlBarPresenter.OnControlSelectedListener
            public void onControlSelected(Presenter.ViewHolder viewHolder, Object obj, ControlBarPresenter.BoundData boundData) {
                ViewHolder viewHolder2 = ((BoundData) boundData).mRowViewHolder;
                if (viewHolder2.mSelectedViewHolder == viewHolder && viewHolder2.mSelectedItem == obj) {
                    return;
                }
                viewHolder2.mSelectedViewHolder = viewHolder;
                viewHolder2.mSelectedItem = obj;
                viewHolder2.dispatchItemSelection();
            }
        };
        this.mOnControlSelectedListener = onControlSelectedListener;
        ControlBarPresenter.OnControlClickedListener onControlClickedListener = new ControlBarPresenter.OnControlClickedListener() { // from class: androidx.leanback.widget.PlaybackTransportRowPresenter.2
            @Override // androidx.leanback.widget.ControlBarPresenter.OnControlClickedListener
            public void onControlClicked(Presenter.ViewHolder viewHolder, Object obj, ControlBarPresenter.BoundData boundData) {
                RowPresenter.ViewHolder viewHolder2 = ((BoundData) boundData).mRowViewHolder;
                if (viewHolder2.getOnItemViewClickedListener() != null) {
                    viewHolder2.getOnItemViewClickedListener().onItemClicked(viewHolder, obj, viewHolder2, viewHolder2.getRow());
                }
                OnActionClickedListener onActionClickedListener = PlaybackTransportRowPresenter.this.mOnActionClickedListener;
                if (onActionClickedListener == null || !(obj instanceof Action)) {
                    return;
                }
                onActionClickedListener.onActionClicked((Action) obj);
            }
        };
        this.mOnControlClickedListener = onControlClickedListener;
        setHeaderPresenter(null);
        setSelectEffectEnabled(false);
        int i = androidx.leanback.R.layout.lb_control_bar;
        ControlBarPresenter controlBarPresenter = new ControlBarPresenter(i);
        this.mPlaybackControlsPresenter = controlBarPresenter;
        controlBarPresenter.setDefaultFocusToMiddle(false);
        ControlBarPresenter controlBarPresenter2 = new ControlBarPresenter(i);
        this.mSecondaryControlsPresenter = controlBarPresenter2;
        controlBarPresenter2.setDefaultFocusToMiddle(false);
        this.mPlaybackControlsPresenter.setOnControlSelectedListener(onControlSelectedListener);
        this.mSecondaryControlsPresenter.setOnControlSelectedListener(onControlSelectedListener);
        this.mPlaybackControlsPresenter.setOnControlClickedListener(onControlClickedListener);
        this.mSecondaryControlsPresenter.setOnControlClickedListener(onControlClickedListener);
    }

    public static void formatTime(long j, StringBuilder sb) {
        sb.setLength(0);
        if (j < 0) {
            sb.append("--");
            return;
        }
        long j2 = j / 1000;
        long j3 = j2 / 60;
        long j4 = j3 / 60;
        long j5 = j2 - (j3 * 60);
        long j6 = j3 - (60 * j4);
        if (j4 > 0) {
            sb.append(j4);
            sb.append(':');
            if (j6 < 10) {
                sb.append('0');
            }
        }
        sb.append(j6);
        sb.append(':');
        if (j5 < 10) {
            sb.append('0');
        }
        sb.append(j5);
    }

    private static int getDefaultProgressColor(Context context) {
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(androidx.leanback.R.attr.playbackProgressPrimaryColor, typedValue, true) ? context.getResources().getColor(typedValue.resourceId) : context.getResources().getColor(androidx.leanback.R.color.lb_playback_progress_color_no_theme);
    }

    private static int getDefaultSecondaryProgressColor(Context context) {
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(androidx.leanback.R.attr.playbackProgressSecondaryColor, typedValue, true) ? context.getResources().getColor(typedValue.resourceId) : context.getResources().getColor(androidx.leanback.R.color.lb_playback_progress_secondary_color_no_theme);
    }

    private void initRow(final ViewHolder viewHolder) {
        viewHolder.mControlsVh = (ControlBarPresenter.ViewHolder) this.mPlaybackControlsPresenter.onCreateViewHolder(viewHolder.mControlsDock);
        viewHolder.mProgressBar.setProgressColor(this.mProgressColorSet ? this.mProgressColor : getDefaultProgressColor(viewHolder.mControlsDock.getContext()));
        viewHolder.mProgressBar.setSecondaryProgressColor(this.mSecondaryProgressColorSet ? this.mSecondaryProgressColor : getDefaultSecondaryProgressColor(viewHolder.mControlsDock.getContext()));
        viewHolder.mControlsDock.addView(viewHolder.mControlsVh.view);
        ControlBarPresenter.ViewHolder viewHolder2 = (ControlBarPresenter.ViewHolder) this.mSecondaryControlsPresenter.onCreateViewHolder(viewHolder.mSecondaryControlsDock);
        viewHolder.mSecondaryControlsVh = viewHolder2;
        viewHolder.mSecondaryControlsDock.addView(viewHolder2.view);
        ((PlaybackTransportRowView) viewHolder.view.findViewById(androidx.leanback.R.id.transport_row)).setOnUnhandledKeyListener(new PlaybackTransportRowView.OnUnhandledKeyListener() { // from class: androidx.leanback.widget.PlaybackTransportRowPresenter.3
            @Override // androidx.leanback.widget.PlaybackTransportRowView.OnUnhandledKeyListener
            public boolean onUnhandledKey(KeyEvent keyEvent) {
                if (viewHolder.getOnKeyListener() != null) {
                    return viewHolder.getOnKeyListener().onKey(viewHolder.view, keyEvent.getKeyCode(), keyEvent);
                }
                return false;
            }
        });
    }

    @Override // androidx.leanback.widget.RowPresenter
    public RowPresenter.ViewHolder createRowViewHolder(ViewGroup viewGroup) {
        ViewHolder viewHolder = new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(androidx.leanback.R.layout.lb_playback_transport_controls_row, viewGroup, false), this.mDescriptionPresenter);
        initRow(viewHolder);
        return viewHolder;
    }

    public float getDefaultSeekIncrement() {
        return this.mDefaultSeekIncrement;
    }

    public OnActionClickedListener getOnActionClickedListener() {
        return this.mOnActionClickedListener;
    }

    @ColorInt
    public int getProgressColor() {
        return this.mProgressColor;
    }

    @ColorInt
    public int getSecondaryProgressColor() {
        return this.mSecondaryProgressColor;
    }

    @Override // androidx.leanback.widget.RowPresenter
    public void onBindRowViewHolder(RowPresenter.ViewHolder viewHolder, Object obj) {
        super.onBindRowViewHolder(viewHolder, obj);
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        PlaybackControlsRow playbackControlsRow = (PlaybackControlsRow) viewHolder2.getRow();
        if (playbackControlsRow.getItem() == null) {
            viewHolder2.mDescriptionDock.setVisibility(8);
        } else {
            viewHolder2.mDescriptionDock.setVisibility(0);
            Presenter.ViewHolder viewHolder3 = viewHolder2.mDescriptionViewHolder;
            if (viewHolder3 != null) {
                this.mDescriptionPresenter.onBindViewHolder(viewHolder3, playbackControlsRow.getItem());
            }
        }
        if (playbackControlsRow.getImageDrawable() == null) {
            viewHolder2.mImageView.setVisibility(8);
        } else {
            viewHolder2.mImageView.setVisibility(0);
        }
        viewHolder2.mImageView.setImageDrawable(playbackControlsRow.getImageDrawable());
        viewHolder2.mControlsBoundData.adapter = playbackControlsRow.getPrimaryActionsAdapter();
        viewHolder2.mControlsBoundData.presenter = viewHolder2.getPresenter(true);
        BoundData boundData = viewHolder2.mControlsBoundData;
        boundData.mRowViewHolder = viewHolder2;
        this.mPlaybackControlsPresenter.onBindViewHolder(viewHolder2.mControlsVh, boundData);
        viewHolder2.mSecondaryBoundData.adapter = playbackControlsRow.getSecondaryActionsAdapter();
        viewHolder2.mSecondaryBoundData.presenter = viewHolder2.getPresenter(false);
        BoundData boundData2 = viewHolder2.mSecondaryBoundData;
        boundData2.mRowViewHolder = viewHolder2;
        this.mSecondaryControlsPresenter.onBindViewHolder(viewHolder2.mSecondaryControlsVh, boundData2);
        viewHolder2.setTotalTime(playbackControlsRow.getDuration());
        viewHolder2.setCurrentPosition(playbackControlsRow.getCurrentPosition());
        viewHolder2.setBufferedPosition(playbackControlsRow.getBufferedPosition());
        playbackControlsRow.setOnPlaybackProgressChangedListener(viewHolder2.mListener);
    }

    public void onProgressBarClicked(ViewHolder viewHolder) {
        if (viewHolder != null) {
            if (viewHolder.mPlayPauseAction == null) {
                viewHolder.mPlayPauseAction = new PlaybackControlsRow.PlayPauseAction(viewHolder.view.getContext());
            }
            if (viewHolder.getOnItemViewClickedListener() != null) {
                viewHolder.getOnItemViewClickedListener().onItemClicked(viewHolder, viewHolder.mPlayPauseAction, viewHolder, viewHolder.getRow());
            }
            OnActionClickedListener onActionClickedListener = this.mOnActionClickedListener;
            if (onActionClickedListener != null) {
                onActionClickedListener.onActionClicked(viewHolder.mPlayPauseAction);
            }
        }
    }

    @Override // androidx.leanback.widget.PlaybackRowPresenter
    public void onReappear(RowPresenter.ViewHolder viewHolder) {
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        if (viewHolder2.view.hasFocus()) {
            viewHolder2.mProgressBar.requestFocus();
        }
    }

    @Override // androidx.leanback.widget.RowPresenter
    public void onRowViewAttachedToWindow(RowPresenter.ViewHolder viewHolder) {
        super.onRowViewAttachedToWindow(viewHolder);
        Presenter presenter = this.mDescriptionPresenter;
        if (presenter != null) {
            presenter.onViewAttachedToWindow(((ViewHolder) viewHolder).mDescriptionViewHolder);
        }
    }

    @Override // androidx.leanback.widget.RowPresenter
    public void onRowViewDetachedFromWindow(RowPresenter.ViewHolder viewHolder) {
        super.onRowViewDetachedFromWindow(viewHolder);
        Presenter presenter = this.mDescriptionPresenter;
        if (presenter != null) {
            presenter.onViewDetachedFromWindow(((ViewHolder) viewHolder).mDescriptionViewHolder);
        }
    }

    @Override // androidx.leanback.widget.RowPresenter
    public void onRowViewSelected(RowPresenter.ViewHolder viewHolder, boolean z) {
        super.onRowViewSelected(viewHolder, z);
        if (z) {
            ((ViewHolder) viewHolder).dispatchItemSelection();
        }
    }

    @Override // androidx.leanback.widget.RowPresenter
    public void onUnbindRowViewHolder(RowPresenter.ViewHolder viewHolder) {
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        PlaybackControlsRow playbackControlsRow = (PlaybackControlsRow) viewHolder2.getRow();
        Presenter.ViewHolder viewHolder3 = viewHolder2.mDescriptionViewHolder;
        if (viewHolder3 != null) {
            this.mDescriptionPresenter.onUnbindViewHolder(viewHolder3);
        }
        this.mPlaybackControlsPresenter.onUnbindViewHolder(viewHolder2.mControlsVh);
        this.mSecondaryControlsPresenter.onUnbindViewHolder(viewHolder2.mSecondaryControlsVh);
        playbackControlsRow.setOnPlaybackProgressChangedListener(null);
        super.onUnbindRowViewHolder(viewHolder);
    }

    public void setDefaultSeekIncrement(float f) {
        this.mDefaultSeekIncrement = f;
    }

    public void setDescriptionPresenter(Presenter presenter) {
        this.mDescriptionPresenter = presenter;
    }

    public void setOnActionClickedListener(OnActionClickedListener onActionClickedListener) {
        this.mOnActionClickedListener = onActionClickedListener;
    }

    public void setProgressColor(@ColorInt int i) {
        this.mProgressColor = i;
        this.mProgressColorSet = true;
    }

    public void setSecondaryProgressColor(@ColorInt int i) {
        this.mSecondaryProgressColor = i;
        this.mSecondaryProgressColorSet = true;
    }
}
