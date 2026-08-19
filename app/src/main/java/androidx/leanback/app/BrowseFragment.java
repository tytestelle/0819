package androidx.leanback.app;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.ColorInt;
import androidx.leanback.R;
import androidx.leanback.transition.TransitionHelper;
import androidx.leanback.transition.TransitionListener;
import androidx.leanback.util.StateMachine;
import androidx.leanback.widget.BrowseFrameLayout;
import androidx.leanback.widget.InvisibleRowPresenter;
import androidx.leanback.widget.ListRow;
import androidx.leanback.widget.ObjectAdapter;
import androidx.leanback.widget.OnItemViewClickedListener;
import androidx.leanback.widget.OnItemViewSelectedListener;
import androidx.leanback.widget.PageRow;
import androidx.leanback.widget.Presenter;
import androidx.leanback.widget.PresenterSelector;
import androidx.leanback.widget.Row;
import androidx.leanback.widget.RowHeaderPresenter;
import androidx.leanback.widget.RowPresenter;
import androidx.leanback.widget.ScaleFrameLayout;
import androidx.leanback.widget.VerticalGridView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class BrowseFragment extends BaseFragment {
    private static final String CURRENT_SELECTED_POSITION = "currentSelectedPosition";
    static final boolean DEBUG = false;
    public static final int HEADERS_DISABLED = 3;
    public static final int HEADERS_ENABLED = 1;
    public static final int HEADERS_HIDDEN = 2;
    static final String HEADER_SHOW = "headerShow";
    static final String HEADER_STACK_INDEX = "headerStackIndex";
    private static final String IS_PAGE_ROW = "isPageRow";
    private static final String LB_HEADERS_BACKSTACK = "lbHeadersBackStack_";
    static final String TAG = "BrowseFragment";
    private ObjectAdapter mAdapter;
    private PresenterSelector mAdapterPresenter;
    BackStackListener mBackStackChangedListener;
    private boolean mBrandColorSet;
    BrowseFrameLayout mBrowseFrame;
    BrowseTransitionListener mBrowseTransitionListener;
    private int mContainerListAlignTop;
    private int mContainerListMarginStart;
    OnItemViewSelectedListener mExternalOnItemViewSelectedListener;
    private PresenterSelector mHeaderPresenterSelector;
    HeadersFragment mHeadersFragment;
    Object mHeadersTransition;
    boolean mIsPageRow;
    Fragment mMainFragment;
    MainFragmentAdapter mMainFragmentAdapter;
    ListRowDataAdapter mMainFragmentListRowDataAdapter;
    MainFragmentRowsAdapter mMainFragmentRowsAdapter;
    private OnItemViewClickedListener mOnItemViewClickedListener;
    Object mPageRow;
    private float mScaleFactor;
    private ScaleFrameLayout mScaleFrameLayout;
    private Object mSceneAfterEntranceTransition;
    Object mSceneWithHeaders;
    Object mSceneWithoutHeaders;
    String mWithHeadersBackStackName;
    private static final String ARG_TITLE = BrowseFragment.class.getCanonicalName() + ".title";
    private static final String ARG_HEADERS_STATE = BrowseFragment.class.getCanonicalName() + ".headersState";
    final StateMachine.State STATE_SET_ENTRANCE_START_STATE = new StateMachine.State("SET_ENTRANCE_START_STATE") { // from class: androidx.leanback.app.BrowseFragment.1
        @Override // androidx.leanback.util.StateMachine.State
        public void run() {
            BrowseFragment.this.setEntranceTransitionStartState();
        }
    };
    final StateMachine.Event EVT_HEADER_VIEW_CREATED = new StateMachine.Event("headerFragmentViewCreated");
    final StateMachine.Event EVT_MAIN_FRAGMENT_VIEW_CREATED = new StateMachine.Event("mainFragmentViewCreated");
    final StateMachine.Event EVT_SCREEN_DATA_READY = new StateMachine.Event("screenDataReady");
    private MainFragmentAdapterRegistry mMainFragmentAdapterRegistry = new MainFragmentAdapterRegistry();
    private int mHeadersState = 1;
    private int mBrandColor = 0;
    boolean mHeadersBackStackEnabled = true;
    boolean mShowingHeaders = true;
    boolean mCanShowHeaders = true;
    private boolean mMainFragmentScaleEnabled = true;
    private int mSelectedPosition = -1;
    boolean mStopped = true;
    private final SetSelectionRunnable mSetSelectionRunnable = new SetSelectionRunnable();
    private final BrowseFrameLayout.OnFocusSearchListener mOnFocusSearchListener = new BrowseFrameLayout.OnFocusSearchListener() { // from class: androidx.leanback.app.BrowseFragment.4
        @Override // androidx.leanback.widget.BrowseFrameLayout.OnFocusSearchListener
        public View onFocusSearch(View view, int i) {
            Fragment fragment;
            BrowseFragment browseFragment = BrowseFragment.this;
            if (browseFragment.mCanShowHeaders && browseFragment.isInHeadersTransition()) {
                return view;
            }
            if (BrowseFragment.this.getTitleView() != null && view != BrowseFragment.this.getTitleView() && i == 33) {
                return BrowseFragment.this.getTitleView();
            }
            if (BrowseFragment.this.getTitleView() != null && BrowseFragment.this.getTitleView().hasFocus() && i == 130) {
                BrowseFragment browseFragment2 = BrowseFragment.this;
                return (browseFragment2.mCanShowHeaders && browseFragment2.mShowingHeaders) ? browseFragment2.mHeadersFragment.getVerticalGridView() : browseFragment2.mMainFragment.getView();
            }
            boolean z = view.getLayoutDirection() == 1;
            int i2 = z ? 66 : 17;
            int i3 = z ? 17 : 66;
            BrowseFragment browseFragment3 = BrowseFragment.this;
            if (browseFragment3.mCanShowHeaders && i == i2) {
                if (browseFragment3.isVerticalScrolling()) {
                    return view;
                }
                BrowseFragment browseFragment4 = BrowseFragment.this;
                return (browseFragment4.mShowingHeaders || !browseFragment4.isHeadersDataReady()) ? view : BrowseFragment.this.mHeadersFragment.getVerticalGridView();
            }
            if (i == i3) {
                return (browseFragment3.isVerticalScrolling() || (fragment = BrowseFragment.this.mMainFragment) == null || fragment.getView() == null) ? view : BrowseFragment.this.mMainFragment.getView();
            }
            if (i == 130 && browseFragment3.mShowingHeaders) {
                return view;
            }
            return null;
        }
    };
    private final BrowseFrameLayout.OnChildFocusListener mOnChildFocusListener = new BrowseFrameLayout.OnChildFocusListener() { // from class: androidx.leanback.app.BrowseFragment.5
        @Override // androidx.leanback.widget.BrowseFrameLayout.OnChildFocusListener
        public void onRequestChildFocus(View view, View view2) {
            if (BrowseFragment.this.getChildFragmentManager().isDestroyed()) {
                return;
            }
            BrowseFragment browseFragment = BrowseFragment.this;
            if (!browseFragment.mCanShowHeaders || browseFragment.isInHeadersTransition()) {
                return;
            }
            int id = view.getId();
            if (id == R.id.browse_container_dock) {
                BrowseFragment browseFragment2 = BrowseFragment.this;
                if (browseFragment2.mShowingHeaders) {
                    browseFragment2.startHeadersTransitionInternal(false);
                    return;
                }
            }
            if (id == R.id.browse_headers_dock) {
                BrowseFragment browseFragment3 = BrowseFragment.this;
                if (browseFragment3.mShowingHeaders) {
                    return;
                }
                browseFragment3.startHeadersTransitionInternal(true);
            }
        }

        @Override // androidx.leanback.widget.BrowseFrameLayout.OnChildFocusListener
        public boolean onRequestFocusInDescendants(int i, Rect rect) {
            HeadersFragment headersFragment;
            if (BrowseFragment.this.getChildFragmentManager().isDestroyed()) {
                return true;
            }
            BrowseFragment browseFragment = BrowseFragment.this;
            if (browseFragment.mCanShowHeaders && browseFragment.mShowingHeaders && (headersFragment = browseFragment.mHeadersFragment) != null && headersFragment.getView() != null && BrowseFragment.this.mHeadersFragment.getView().requestFocus(i, rect)) {
                return true;
            }
            Fragment fragment = BrowseFragment.this.mMainFragment;
            if (fragment == null || fragment.getView() == null || !BrowseFragment.this.mMainFragment.getView().requestFocus(i, rect)) {
                return BrowseFragment.this.getTitleView() != null && BrowseFragment.this.getTitleView().requestFocus(i, rect);
            }
            return true;
        }
    };
    private HeadersFragment.OnHeaderClickedListener mHeaderClickedListener = new HeadersFragment.OnHeaderClickedListener() { // from class: androidx.leanback.app.BrowseFragment.10
        @Override // androidx.leanback.app.HeadersFragment.OnHeaderClickedListener
        public void onHeaderClicked(RowHeaderPresenter.ViewHolder viewHolder, Row row) {
            Fragment fragment;
            BrowseFragment browseFragment = BrowseFragment.this;
            if (!browseFragment.mCanShowHeaders || !browseFragment.mShowingHeaders || browseFragment.isInHeadersTransition() || (fragment = BrowseFragment.this.mMainFragment) == null || fragment.getView() == null) {
                return;
            }
            BrowseFragment.this.startHeadersTransitionInternal(false);
            BrowseFragment.this.mMainFragment.getView().requestFocus();
        }
    };
    private HeadersFragment.OnHeaderViewSelectedListener mHeaderViewSelectedListener = new HeadersFragment.OnHeaderViewSelectedListener() { // from class: androidx.leanback.app.BrowseFragment.11
        @Override // androidx.leanback.app.HeadersFragment.OnHeaderViewSelectedListener
        public void onHeaderSelected(RowHeaderPresenter.ViewHolder viewHolder, Row row) {
            int selectedPosition = BrowseFragment.this.mHeadersFragment.getSelectedPosition();
            BrowseFragment browseFragment = BrowseFragment.this;
            if (browseFragment.mShowingHeaders) {
                browseFragment.onRowSelected(selectedPosition);
            }
        }
    };
    private final RecyclerView.OnScrollListener mWaitScrollFinishAndCommitMainFragment = new RecyclerView.OnScrollListener() { // from class: androidx.leanback.app.BrowseFragment.12
        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (i == 0) {
                recyclerView.removeOnScrollListener(this);
                BrowseFragment browseFragment = BrowseFragment.this;
                if (browseFragment.mStopped) {
                    return;
                }
                browseFragment.commitMainFragment();
            }
        }
    };

    public final class BackStackListener implements FragmentManager.OnBackStackChangedListener {
        int mIndexOfHeadersBackStack = -1;
        int mLastEntryCount;

        public BackStackListener() {
            this.mLastEntryCount = BrowseFragment.this.getFragmentManager().getBackStackEntryCount();
        }

        public void load(Bundle bundle) {
            if (bundle != null) {
                int i = bundle.getInt(BrowseFragment.HEADER_STACK_INDEX, -1);
                this.mIndexOfHeadersBackStack = i;
                BrowseFragment.this.mShowingHeaders = i == -1;
                return;
            }
            BrowseFragment browseFragment = BrowseFragment.this;
            if (browseFragment.mShowingHeaders) {
                return;
            }
            browseFragment.getFragmentManager().beginTransaction().addToBackStack(BrowseFragment.this.mWithHeadersBackStackName).commit();
        }

        @Override // android.app.FragmentManager.OnBackStackChangedListener
        public void onBackStackChanged() {
            if (BrowseFragment.this.getFragmentManager() == null) {
                Log.w(BrowseFragment.TAG, "getFragmentManager() is null, stack:", new Exception());
                return;
            }
            int backStackEntryCount = BrowseFragment.this.getFragmentManager().getBackStackEntryCount();
            int i = this.mLastEntryCount;
            if (backStackEntryCount > i) {
                int i2 = backStackEntryCount - 1;
                if (BrowseFragment.this.mWithHeadersBackStackName.equals(BrowseFragment.this.getFragmentManager().getBackStackEntryAt(i2).getName())) {
                    this.mIndexOfHeadersBackStack = i2;
                }
            } else if (backStackEntryCount < i && this.mIndexOfHeadersBackStack >= backStackEntryCount) {
                if (!BrowseFragment.this.isHeadersDataReady()) {
                    BrowseFragment.this.getFragmentManager().beginTransaction().addToBackStack(BrowseFragment.this.mWithHeadersBackStackName).commit();
                    return;
                }
                this.mIndexOfHeadersBackStack = -1;
                BrowseFragment browseFragment = BrowseFragment.this;
                if (!browseFragment.mShowingHeaders) {
                    browseFragment.startHeadersTransitionInternal(true);
                }
            }
            this.mLastEntryCount = backStackEntryCount;
        }

        public void save(Bundle bundle) {
            bundle.putInt(BrowseFragment.HEADER_STACK_INDEX, this.mIndexOfHeadersBackStack);
        }
    }

    @Deprecated
    public static class BrowseTransitionListener {
        public void onHeadersTransitionStart(boolean z) {
        }

        public void onHeadersTransitionStop(boolean z) {
        }
    }

    public class ExpandPreLayout implements ViewTreeObserver.OnPreDrawListener {
        static final int STATE_FIRST_DRAW = 1;
        static final int STATE_INIT = 0;
        static final int STATE_SECOND_DRAW = 2;
        private final Runnable mCallback;
        private int mState;
        private final View mView;
        private MainFragmentAdapter mainFragmentAdapter;

        public ExpandPreLayout(Runnable runnable, MainFragmentAdapter mainFragmentAdapter, View view) {
            this.mView = view;
            this.mCallback = runnable;
            this.mainFragmentAdapter = mainFragmentAdapter;
        }

        public void execute() {
            this.mView.getViewTreeObserver().addOnPreDrawListener(this);
            this.mainFragmentAdapter.setExpand(false);
            this.mView.invalidate();
            this.mState = 0;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (BrowseFragment.this.getView() == null || FragmentUtil.getContext(BrowseFragment.this) == null) {
                this.mView.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            }
            int i = this.mState;
            if (i == 0) {
                this.mainFragmentAdapter.setExpand(true);
                this.mView.invalidate();
                this.mState = 1;
                return false;
            }
            if (i != 1) {
                return false;
            }
            this.mCallback.run();
            this.mView.getViewTreeObserver().removeOnPreDrawListener(this);
            this.mState = 2;
            return false;
        }
    }

    @Deprecated
    public static abstract class FragmentFactory<T extends Fragment> {
        public abstract T createFragment(Object obj);
    }

    @Deprecated
    public interface FragmentHost {
        void notifyDataReady(MainFragmentAdapter mainFragmentAdapter);

        void notifyViewCreated(MainFragmentAdapter mainFragmentAdapter);

        void showTitleView(boolean z);
    }

    public final class FragmentHostImpl implements FragmentHost {
        boolean mShowTitleView = true;

        public FragmentHostImpl() {
        }

        @Override // androidx.leanback.app.BrowseFragment.FragmentHost
        public void notifyDataReady(MainFragmentAdapter mainFragmentAdapter) {
            MainFragmentAdapter mainFragmentAdapter2 = BrowseFragment.this.mMainFragmentAdapter;
            if (mainFragmentAdapter2 == null || mainFragmentAdapter2.getFragmentHost() != this) {
                return;
            }
            BrowseFragment browseFragment = BrowseFragment.this;
            if (browseFragment.mIsPageRow) {
                browseFragment.mStateMachine.fireEvent(browseFragment.EVT_SCREEN_DATA_READY);
            }
        }

        @Override // androidx.leanback.app.BrowseFragment.FragmentHost
        public void notifyViewCreated(MainFragmentAdapter mainFragmentAdapter) {
            BrowseFragment browseFragment = BrowseFragment.this;
            browseFragment.mStateMachine.fireEvent(browseFragment.EVT_MAIN_FRAGMENT_VIEW_CREATED);
            BrowseFragment browseFragment2 = BrowseFragment.this;
            if (browseFragment2.mIsPageRow) {
                return;
            }
            browseFragment2.mStateMachine.fireEvent(browseFragment2.EVT_SCREEN_DATA_READY);
        }

        @Override // androidx.leanback.app.BrowseFragment.FragmentHost
        public void showTitleView(boolean z) {
            this.mShowTitleView = z;
            MainFragmentAdapter mainFragmentAdapter = BrowseFragment.this.mMainFragmentAdapter;
            if (mainFragmentAdapter == null || mainFragmentAdapter.getFragmentHost() != this) {
                return;
            }
            BrowseFragment browseFragment = BrowseFragment.this;
            if (browseFragment.mIsPageRow) {
                browseFragment.updateTitleViewVisibility();
            }
        }
    }

    @Deprecated
    public static class ListRowFragmentFactory extends FragmentFactory<RowsFragment> {
        @Override // androidx.leanback.app.BrowseFragment.FragmentFactory
        public RowsFragment createFragment(Object obj) {
            return new RowsFragment();
        }
    }

    @Deprecated
    public static class MainFragmentAdapter<T extends Fragment> {
        private final T mFragment;
        FragmentHostImpl mFragmentHost;
        private boolean mScalingEnabled;

        public MainFragmentAdapter(T t) {
            this.mFragment = t;
        }

        public final T getFragment() {
            return this.mFragment;
        }

        public final FragmentHost getFragmentHost() {
            return this.mFragmentHost;
        }

        public boolean isScalingEnabled() {
            return this.mScalingEnabled;
        }

        public boolean isScrolling() {
            return false;
        }

        public void onTransitionEnd() {
        }

        public boolean onTransitionPrepare() {
            return false;
        }

        public void onTransitionStart() {
        }

        public void setAlignment(int i) {
        }

        public void setEntranceTransitionState(boolean z) {
        }

        public void setExpand(boolean z) {
        }

        public void setFragmentHost(FragmentHostImpl fragmentHostImpl) {
            this.mFragmentHost = fragmentHostImpl;
        }

        public void setScalingEnabled(boolean z) {
            this.mScalingEnabled = z;
        }
    }

    @Deprecated
    public interface MainFragmentAdapterProvider {
        MainFragmentAdapter getMainFragmentAdapter();
    }

    @Deprecated
    public static final class MainFragmentAdapterRegistry {
        private static final FragmentFactory sDefaultFragmentFactory = new ListRowFragmentFactory();
        private final Map<Class<?>, FragmentFactory> mItemToFragmentFactoryMapping = new HashMap();

        public MainFragmentAdapterRegistry() {
            registerFragment(ListRow.class, sDefaultFragmentFactory);
        }

        public Fragment createFragment(Object obj) {
            FragmentFactory fragmentFactory = obj == null ? sDefaultFragmentFactory : this.mItemToFragmentFactoryMapping.get(obj.getClass());
            if (fragmentFactory == null && !(obj instanceof PageRow)) {
                fragmentFactory = sDefaultFragmentFactory;
            }
            return fragmentFactory.createFragment(obj);
        }

        public void registerFragment(Class<?> cls, FragmentFactory fragmentFactory) {
            this.mItemToFragmentFactoryMapping.put(cls, fragmentFactory);
        }
    }

    public class MainFragmentItemViewSelectedListener implements OnItemViewSelectedListener {
        MainFragmentRowsAdapter mMainFragmentRowsAdapter;

        public MainFragmentItemViewSelectedListener(MainFragmentRowsAdapter mainFragmentRowsAdapter) {
            this.mMainFragmentRowsAdapter = mainFragmentRowsAdapter;
        }

        @Override // androidx.leanback.widget.BaseOnItemViewSelectedListener
        public void onItemSelected(Presenter.ViewHolder viewHolder, Object obj, RowPresenter.ViewHolder viewHolder2, Row row) {
            BrowseFragment.this.onRowSelected(this.mMainFragmentRowsAdapter.getSelectedPosition());
            OnItemViewSelectedListener onItemViewSelectedListener = BrowseFragment.this.mExternalOnItemViewSelectedListener;
            if (onItemViewSelectedListener != null) {
                onItemViewSelectedListener.onItemSelected(viewHolder, obj, viewHolder2, row);
            }
        }
    }

    @Deprecated
    public static class MainFragmentRowsAdapter<T extends Fragment> {
        private final T mFragment;

        public MainFragmentRowsAdapter(T t) {
            if (t == null) {
                throw new IllegalArgumentException("Fragment can't be null");
            }
            this.mFragment = t;
        }

        public RowPresenter.ViewHolder findRowViewHolderByPosition(int i) {
            return null;
        }

        public final T getFragment() {
            return this.mFragment;
        }

        public int getSelectedPosition() {
            return 0;
        }

        public void setAdapter(ObjectAdapter objectAdapter) {
        }

        public void setOnItemViewClickedListener(OnItemViewClickedListener onItemViewClickedListener) {
        }

        public void setOnItemViewSelectedListener(OnItemViewSelectedListener onItemViewSelectedListener) {
        }

        public void setSelectedPosition(int i, boolean z) {
        }

        public void setSelectedPosition(int i, boolean z, Presenter.ViewHolderTask viewHolderTask) {
        }
    }

    @Deprecated
    public interface MainFragmentRowsAdapterProvider {
        MainFragmentRowsAdapter getMainFragmentRowsAdapter();
    }

    public final class SetSelectionRunnable implements Runnable {
        static final int TYPE_INTERNAL_SYNC = 0;
        static final int TYPE_INVALID = -1;
        static final int TYPE_USER_REQUEST = 1;
        private int mPosition;
        private boolean mSmooth;
        private int mType;

        public SetSelectionRunnable() {
            reset();
        }

        private void reset() {
            this.mPosition = -1;
            this.mType = -1;
            this.mSmooth = false;
        }

        public void post(int i, int i2, boolean z) {
            if (i2 >= this.mType) {
                this.mPosition = i;
                this.mType = i2;
                this.mSmooth = z;
                BrowseFragment.this.mBrowseFrame.removeCallbacks(this);
                BrowseFragment browseFragment = BrowseFragment.this;
                if (browseFragment.mStopped) {
                    return;
                }
                browseFragment.mBrowseFrame.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            BrowseFragment.this.setSelection(this.mPosition, this.mSmooth);
            reset();
        }

        public void start() {
            if (this.mType != -1) {
                BrowseFragment.this.mBrowseFrame.post(this);
            }
        }

        public void stop() {
            BrowseFragment.this.mBrowseFrame.removeCallbacks(this);
        }
    }

    public static Bundle createArgs(Bundle bundle, String str, int i) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString(ARG_TITLE, str);
        bundle.putInt(ARG_HEADERS_STATE, i);
        return bundle;
    }

    private boolean createMainFragment(ObjectAdapter objectAdapter, int i) {
        Object obj;
        boolean z = true;
        if (!this.mCanShowHeaders) {
            obj = null;
        } else {
            if (objectAdapter == null || objectAdapter.size() == 0) {
                return false;
            }
            if (i < 0) {
                i = 0;
            } else if (i >= objectAdapter.size()) {
                throw new IllegalArgumentException(String.format("Invalid position %d requested", Integer.valueOf(i)));
            }
            obj = objectAdapter.get(i);
        }
        boolean z2 = this.mIsPageRow;
        Object obj2 = this.mPageRow;
        boolean z3 = this.mCanShowHeaders && (obj instanceof PageRow);
        this.mIsPageRow = z3;
        Object obj3 = z3 ? obj : null;
        this.mPageRow = obj3;
        if (this.mMainFragment != null) {
            if (!z2) {
                z = z3;
            } else if (z3 && (obj2 == null || obj2 == obj3)) {
                z = false;
            }
        }
        if (z) {
            Fragment fragmentCreateFragment = this.mMainFragmentAdapterRegistry.createFragment(obj);
            this.mMainFragment = fragmentCreateFragment;
            if (!(fragmentCreateFragment instanceof MainFragmentAdapterProvider)) {
                throw new IllegalArgumentException("Fragment must implement MainFragmentAdapterProvider");
            }
            setMainFragmentAdapter();
        }
        return z;
    }

    private void expandMainFragment(boolean z) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mScaleFrameLayout.getLayoutParams();
        marginLayoutParams.setMarginStart(!z ? this.mContainerListMarginStart : 0);
        this.mScaleFrameLayout.setLayoutParams(marginLayoutParams);
        this.mMainFragmentAdapter.setExpand(z);
        setMainFragmentAlignment();
        float f = (!z && this.mMainFragmentScaleEnabled && this.mMainFragmentAdapter.isScalingEnabled()) ? this.mScaleFactor : 1.0f;
        this.mScaleFrameLayout.setLayoutScaleY(f);
        this.mScaleFrameLayout.setChildScale(f);
    }

    private void onExpandTransitionStart(boolean z, Runnable runnable) {
        if (z) {
            runnable.run();
        } else {
            new ExpandPreLayout(runnable, this.mMainFragmentAdapter, getView()).execute();
        }
    }

    private void readArguments(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        String str = ARG_TITLE;
        if (bundle.containsKey(str)) {
            setTitle(bundle.getString(str));
        }
        String str2 = ARG_HEADERS_STATE;
        if (bundle.containsKey(str2)) {
            setHeadersState(bundle.getInt(str2));
        }
    }

    private void replaceMainFragment(int i) {
        if (createMainFragment(this.mAdapter, i)) {
            swapToMainFragment();
            expandMainFragment((this.mCanShowHeaders && this.mShowingHeaders) ? false : true);
        }
    }

    private void setHeadersOnScreen(boolean z) {
        View view = this.mHeadersFragment.getView();
        if (view == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.setMarginStart(z ? 0 : -this.mContainerListMarginStart);
        view.setLayoutParams(marginLayoutParams);
    }

    private void setMainFragmentAlignment() {
        int i = this.mContainerListAlignTop;
        if (this.mMainFragmentScaleEnabled && this.mMainFragmentAdapter.isScalingEnabled() && this.mShowingHeaders) {
            i = (int) ((i / this.mScaleFactor) + 0.5f);
        }
        this.mMainFragmentAdapter.setAlignment(i);
    }

    private void swapToMainFragment() {
        if (this.mStopped) {
            return;
        }
        VerticalGridView verticalGridView = this.mHeadersFragment.getVerticalGridView();
        if (!isShowingHeaders() || verticalGridView == null || verticalGridView.getScrollState() == 0) {
            commitMainFragment();
            return;
        }
        getChildFragmentManager().beginTransaction().replace(R.id.scale_frame, new Fragment()).commit();
        verticalGridView.removeOnScrollListener(this.mWaitScrollFinishAndCommitMainFragment);
        verticalGridView.addOnScrollListener(this.mWaitScrollFinishAndCommitMainFragment);
    }

    private void updateWrapperPresenter() {
        ObjectAdapter objectAdapter = this.mAdapter;
        if (objectAdapter == null) {
            this.mAdapterPresenter = null;
            return;
        }
        final PresenterSelector presenterSelector = objectAdapter.getPresenterSelector();
        if (presenterSelector == null) {
            throw new IllegalArgumentException("Adapter.getPresenterSelector() is null");
        }
        if (presenterSelector == this.mAdapterPresenter) {
            return;
        }
        this.mAdapterPresenter = presenterSelector;
        Presenter[] presenters = presenterSelector.getPresenters();
        final InvisibleRowPresenter invisibleRowPresenter = new InvisibleRowPresenter();
        int length = presenters.length;
        final Presenter[] presenterArr = new Presenter[length + 1];
        System.arraycopy(presenterArr, 0, presenters, 0, presenters.length);
        presenterArr[length] = invisibleRowPresenter;
        this.mAdapter.setPresenterSelector(new PresenterSelector() { // from class: androidx.leanback.app.BrowseFragment.2
            @Override // androidx.leanback.widget.PresenterSelector
            public Presenter getPresenter(Object obj) {
                return ((Row) obj).isRenderedAsRowView() ? presenterSelector.getPresenter(obj) : invisibleRowPresenter;
            }

            @Override // androidx.leanback.widget.PresenterSelector
            public Presenter[] getPresenters() {
                return presenterArr;
            }
        });
    }

    public final void commitMainFragment() {
        FragmentManager childFragmentManager = getChildFragmentManager();
        int i = R.id.scale_frame;
        if (childFragmentManager.findFragmentById(i) != this.mMainFragment) {
            childFragmentManager.beginTransaction().replace(i, this.mMainFragment).commit();
        }
    }

    @Override // androidx.leanback.app.BaseFragment
    public Object createEntranceTransition() {
        return TransitionHelper.loadTransition(FragmentUtil.getContext(this), R.transition.lb_browse_entrance_transition);
    }

    public void createHeadersTransition() {
        Object objLoadTransition = TransitionHelper.loadTransition(FragmentUtil.getContext(this), this.mShowingHeaders ? R.transition.lb_browse_headers_in : R.transition.lb_browse_headers_out);
        this.mHeadersTransition = objLoadTransition;
        TransitionHelper.addTransitionListener(objLoadTransition, new TransitionListener() { // from class: androidx.leanback.app.BrowseFragment.9
            @Override // androidx.leanback.transition.TransitionListener
            public void onTransitionEnd(Object obj) {
                VerticalGridView verticalGridView;
                Fragment fragment;
                View view;
                BrowseFragment browseFragment = BrowseFragment.this;
                browseFragment.mHeadersTransition = null;
                MainFragmentAdapter mainFragmentAdapter = browseFragment.mMainFragmentAdapter;
                if (mainFragmentAdapter != null) {
                    mainFragmentAdapter.onTransitionEnd();
                    BrowseFragment browseFragment2 = BrowseFragment.this;
                    if (!browseFragment2.mShowingHeaders && (fragment = browseFragment2.mMainFragment) != null && (view = fragment.getView()) != null && !view.hasFocus()) {
                        view.requestFocus();
                    }
                }
                HeadersFragment headersFragment = BrowseFragment.this.mHeadersFragment;
                if (headersFragment != null) {
                    headersFragment.onTransitionEnd();
                    BrowseFragment browseFragment3 = BrowseFragment.this;
                    if (browseFragment3.mShowingHeaders && (verticalGridView = browseFragment3.mHeadersFragment.getVerticalGridView()) != null && !verticalGridView.hasFocus()) {
                        verticalGridView.requestFocus();
                    }
                }
                BrowseFragment.this.updateTitleViewVisibility();
                BrowseFragment browseFragment4 = BrowseFragment.this;
                BrowseTransitionListener browseTransitionListener = browseFragment4.mBrowseTransitionListener;
                if (browseTransitionListener != null) {
                    browseTransitionListener.onHeadersTransitionStop(browseFragment4.mShowingHeaders);
                }
            }

            @Override // androidx.leanback.transition.TransitionListener
            public void onTransitionStart(Object obj) {
            }
        });
    }

    @Override // androidx.leanback.app.BaseFragment
    public void createStateMachineStates() {
        super.createStateMachineStates();
        this.mStateMachine.addState(this.STATE_SET_ENTRANCE_START_STATE);
    }

    @Override // androidx.leanback.app.BaseFragment
    public void createStateMachineTransitions() {
        super.createStateMachineTransitions();
        this.mStateMachine.addTransition(this.STATE_ENTRANCE_ON_PREPARED, this.STATE_SET_ENTRANCE_START_STATE, this.EVT_HEADER_VIEW_CREATED);
        this.mStateMachine.addTransition(this.STATE_ENTRANCE_ON_PREPARED, this.STATE_ENTRANCE_ON_PREPARED_ON_CREATEVIEW, this.EVT_MAIN_FRAGMENT_VIEW_CREATED);
        this.mStateMachine.addTransition(this.STATE_ENTRANCE_ON_PREPARED, this.STATE_ENTRANCE_PERFORM, this.EVT_SCREEN_DATA_READY);
    }

    public void enableMainFragmentScaling(boolean z) {
        this.mMainFragmentScaleEnabled = z;
    }

    @Deprecated
    public void enableRowScaling(boolean z) {
        enableMainFragmentScaling(z);
    }

    public ObjectAdapter getAdapter() {
        return this.mAdapter;
    }

    @ColorInt
    public int getBrandColor() {
        return this.mBrandColor;
    }

    public HeadersFragment getHeadersFragment() {
        return this.mHeadersFragment;
    }

    public int getHeadersState() {
        return this.mHeadersState;
    }

    public Fragment getMainFragment() {
        return this.mMainFragment;
    }

    public final MainFragmentAdapterRegistry getMainFragmentRegistry() {
        return this.mMainFragmentAdapterRegistry;
    }

    public OnItemViewClickedListener getOnItemViewClickedListener() {
        return this.mOnItemViewClickedListener;
    }

    public OnItemViewSelectedListener getOnItemViewSelectedListener() {
        return this.mExternalOnItemViewSelectedListener;
    }

    public RowsFragment getRowsFragment() {
        Fragment fragment = this.mMainFragment;
        if (fragment instanceof RowsFragment) {
            return (RowsFragment) fragment;
        }
        return null;
    }

    public int getSelectedPosition() {
        return this.mSelectedPosition;
    }

    public RowPresenter.ViewHolder getSelectedRowViewHolder() {
        MainFragmentRowsAdapter mainFragmentRowsAdapter = this.mMainFragmentRowsAdapter;
        if (mainFragmentRowsAdapter == null) {
            return null;
        }
        return this.mMainFragmentRowsAdapter.findRowViewHolderByPosition(mainFragmentRowsAdapter.getSelectedPosition());
    }

    public boolean isFirstRowWithContent(int i) {
        ObjectAdapter objectAdapter = this.mAdapter;
        if (objectAdapter != null && objectAdapter.size() != 0) {
            int i2 = 0;
            while (i2 < this.mAdapter.size()) {
                if (((Row) this.mAdapter.get(i2)).isRenderedAsRowView()) {
                    return i == i2;
                }
                i2++;
            }
        }
        return true;
    }

    public boolean isFirstRowWithContentOrPageRow(int i) {
        ObjectAdapter objectAdapter = this.mAdapter;
        if (objectAdapter == null || objectAdapter.size() == 0) {
            return true;
        }
        int i2 = 0;
        while (i2 < this.mAdapter.size()) {
            Row row = (Row) this.mAdapter.get(i2);
            if (row.isRenderedAsRowView() || (row instanceof PageRow)) {
                return i == i2;
            }
            i2++;
        }
        return true;
    }

    public final boolean isHeadersDataReady() {
        ObjectAdapter objectAdapter = this.mAdapter;
        return (objectAdapter == null || objectAdapter.size() == 0) ? false : true;
    }

    public final boolean isHeadersTransitionOnBackEnabled() {
        return this.mHeadersBackStackEnabled;
    }

    public boolean isInHeadersTransition() {
        return this.mHeadersTransition != null;
    }

    public boolean isShowingHeaders() {
        return this.mShowingHeaders;
    }

    public boolean isVerticalScrolling() {
        return this.mHeadersFragment.isScrolling() || this.mMainFragmentAdapter.isScrolling();
    }

    @Override // androidx.leanback.app.BaseFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context context = FragmentUtil.getContext(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.styleable.LeanbackTheme);
        this.mContainerListMarginStart = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.LeanbackTheme_browseRowsMarginStart, context.getResources().getDimensionPixelSize(R.dimen.lb_browse_rows_margin_start));
        this.mContainerListAlignTop = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.LeanbackTheme_browseRowsMarginTop, context.getResources().getDimensionPixelSize(R.dimen.lb_browse_rows_margin_top));
        typedArrayObtainStyledAttributes.recycle();
        readArguments(getArguments());
        if (this.mCanShowHeaders) {
            if (this.mHeadersBackStackEnabled) {
                this.mWithHeadersBackStackName = LB_HEADERS_BACKSTACK + this;
                this.mBackStackChangedListener = new BackStackListener();
                getFragmentManager().addOnBackStackChangedListener(this.mBackStackChangedListener);
                this.mBackStackChangedListener.load(bundle);
            } else if (bundle != null) {
                this.mShowingHeaders = bundle.getBoolean(HEADER_SHOW);
            }
        }
        this.mScaleFactor = getResources().getFraction(R.fraction.lb_browse_rows_scale, 1, 1);
    }

    public HeadersFragment onCreateHeadersFragment() {
        return new HeadersFragment();
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FragmentManager childFragmentManager = getChildFragmentManager();
        int i = R.id.scale_frame;
        if (childFragmentManager.findFragmentById(i) == null) {
            this.mHeadersFragment = onCreateHeadersFragment();
            createMainFragment(this.mAdapter, this.mSelectedPosition);
            FragmentTransaction fragmentTransactionReplace = getChildFragmentManager().beginTransaction().replace(R.id.browse_headers_dock, this.mHeadersFragment);
            Fragment fragment = this.mMainFragment;
            if (fragment != null) {
                fragmentTransactionReplace.replace(i, fragment);
            } else {
                MainFragmentAdapter mainFragmentAdapter = new MainFragmentAdapter(null);
                this.mMainFragmentAdapter = mainFragmentAdapter;
                mainFragmentAdapter.setFragmentHost(new FragmentHostImpl());
            }
            fragmentTransactionReplace.commit();
        } else {
            this.mHeadersFragment = (HeadersFragment) getChildFragmentManager().findFragmentById(R.id.browse_headers_dock);
            this.mMainFragment = getChildFragmentManager().findFragmentById(i);
            this.mIsPageRow = bundle != null && bundle.getBoolean(IS_PAGE_ROW, false);
            this.mSelectedPosition = bundle != null ? bundle.getInt(CURRENT_SELECTED_POSITION, 0) : 0;
            setMainFragmentAdapter();
        }
        this.mHeadersFragment.setHeadersGone(true ^ this.mCanShowHeaders);
        PresenterSelector presenterSelector = this.mHeaderPresenterSelector;
        if (presenterSelector != null) {
            this.mHeadersFragment.setPresenterSelector(presenterSelector);
        }
        this.mHeadersFragment.setAdapter(this.mAdapter);
        this.mHeadersFragment.setOnHeaderViewSelectedListener(this.mHeaderViewSelectedListener);
        this.mHeadersFragment.setOnHeaderClickedListener(this.mHeaderClickedListener);
        View viewInflate = layoutInflater.inflate(R.layout.lb_browse_fragment, viewGroup, false);
        getProgressBarManager().setRootView((ViewGroup) viewInflate);
        BrowseFrameLayout browseFrameLayout = (BrowseFrameLayout) viewInflate.findViewById(R.id.browse_frame);
        this.mBrowseFrame = browseFrameLayout;
        browseFrameLayout.setOnChildFocusListener(this.mOnChildFocusListener);
        this.mBrowseFrame.setOnFocusSearchListener(this.mOnFocusSearchListener);
        installTitleView(layoutInflater, this.mBrowseFrame, bundle);
        ScaleFrameLayout scaleFrameLayout = (ScaleFrameLayout) viewInflate.findViewById(i);
        this.mScaleFrameLayout = scaleFrameLayout;
        scaleFrameLayout.setPivotX(0.0f);
        this.mScaleFrameLayout.setPivotY(this.mContainerListAlignTop);
        if (this.mBrandColorSet) {
            this.mHeadersFragment.setBackgroundColor(this.mBrandColor);
        }
        this.mSceneWithHeaders = TransitionHelper.createScene(this.mBrowseFrame, new Runnable() { // from class: androidx.leanback.app.BrowseFragment.6
            @Override // java.lang.Runnable
            public void run() {
                BrowseFragment.this.showHeaders(true);
            }
        });
        this.mSceneWithoutHeaders = TransitionHelper.createScene(this.mBrowseFrame, new Runnable() { // from class: androidx.leanback.app.BrowseFragment.7
            @Override // java.lang.Runnable
            public void run() {
                BrowseFragment.this.showHeaders(false);
            }
        });
        this.mSceneAfterEntranceTransition = TransitionHelper.createScene(this.mBrowseFrame, new Runnable() { // from class: androidx.leanback.app.BrowseFragment.8
            @Override // java.lang.Runnable
            public void run() {
                BrowseFragment.this.setEntranceTransitionEndState();
            }
        });
        return viewInflate;
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        if (this.mBackStackChangedListener != null) {
            getFragmentManager().removeOnBackStackChangedListener(this.mBackStackChangedListener);
        }
        super.onDestroy();
    }

    @Override // androidx.leanback.app.BaseFragment, androidx.leanback.app.BrandedFragment, android.app.Fragment
    public void onDestroyView() {
        setMainFragmentRowsAdapter(null);
        this.mPageRow = null;
        this.mMainFragmentAdapter = null;
        this.mMainFragment = null;
        this.mHeadersFragment = null;
        this.mBrowseFrame = null;
        this.mScaleFrameLayout = null;
        this.mSceneAfterEntranceTransition = null;
        this.mSceneWithHeaders = null;
        this.mSceneWithoutHeaders = null;
        super.onDestroyView();
    }

    @Override // androidx.leanback.app.BaseFragment
    public void onEntranceTransitionEnd() {
        MainFragmentAdapter mainFragmentAdapter = this.mMainFragmentAdapter;
        if (mainFragmentAdapter != null) {
            mainFragmentAdapter.onTransitionEnd();
        }
        HeadersFragment headersFragment = this.mHeadersFragment;
        if (headersFragment != null) {
            headersFragment.onTransitionEnd();
        }
    }

    @Override // androidx.leanback.app.BaseFragment
    public void onEntranceTransitionPrepare() {
        this.mHeadersFragment.onTransitionPrepare();
        this.mMainFragmentAdapter.setEntranceTransitionState(false);
        this.mMainFragmentAdapter.onTransitionPrepare();
    }

    @Override // androidx.leanback.app.BaseFragment
    public void onEntranceTransitionStart() {
        this.mHeadersFragment.onTransitionStart();
        this.mMainFragmentAdapter.onTransitionStart();
    }

    public void onRowSelected(int i) {
        this.mSetSelectionRunnable.post(i, 0, true);
    }

    @Override // androidx.leanback.app.BrandedFragment, android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(CURRENT_SELECTED_POSITION, this.mSelectedPosition);
        bundle.putBoolean(IS_PAGE_ROW, this.mIsPageRow);
        BackStackListener backStackListener = this.mBackStackChangedListener;
        if (backStackListener != null) {
            backStackListener.save(bundle);
        } else {
            bundle.putBoolean(HEADER_SHOW, this.mShowingHeaders);
        }
    }

    @Override // androidx.leanback.app.BrandedFragment, android.app.Fragment
    public void onStart() {
        Fragment fragment;
        HeadersFragment headersFragment;
        super.onStart();
        this.mHeadersFragment.setAlignment(this.mContainerListAlignTop);
        setMainFragmentAlignment();
        if (this.mCanShowHeaders && this.mShowingHeaders && (headersFragment = this.mHeadersFragment) != null && headersFragment.getView() != null) {
            this.mHeadersFragment.getView().requestFocus();
        } else if ((!this.mCanShowHeaders || !this.mShowingHeaders) && (fragment = this.mMainFragment) != null && fragment.getView() != null) {
            this.mMainFragment.getView().requestFocus();
        }
        if (this.mCanShowHeaders) {
            showHeaders(this.mShowingHeaders);
        }
        this.mStateMachine.fireEvent(this.EVT_HEADER_VIEW_CREATED);
        this.mStopped = false;
        commitMainFragment();
        this.mSetSelectionRunnable.start();
    }

    @Override // android.app.Fragment
    public void onStop() {
        this.mStopped = true;
        this.mSetSelectionRunnable.stop();
        super.onStop();
    }

    @Override // androidx.leanback.app.BaseFragment
    public void runEntranceTransition(Object obj) {
        TransitionHelper.runTransition(this.mSceneAfterEntranceTransition, obj);
    }

    public void setAdapter(ObjectAdapter objectAdapter) {
        this.mAdapter = objectAdapter;
        updateWrapperPresenter();
        if (getView() == null) {
            return;
        }
        updateMainFragmentRowsAdapter();
        this.mHeadersFragment.setAdapter(this.mAdapter);
    }

    public void setBrandColor(@ColorInt int i) {
        this.mBrandColor = i;
        this.mBrandColorSet = true;
        HeadersFragment headersFragment = this.mHeadersFragment;
        if (headersFragment != null) {
            headersFragment.setBackgroundColor(i);
        }
    }

    public void setBrowseTransitionListener(BrowseTransitionListener browseTransitionListener) {
        this.mBrowseTransitionListener = browseTransitionListener;
    }

    public void setEntranceTransitionEndState() {
        setHeadersOnScreen(this.mShowingHeaders);
        setSearchOrbViewOnScreen(true);
        this.mMainFragmentAdapter.setEntranceTransitionState(true);
    }

    public void setEntranceTransitionStartState() {
        setHeadersOnScreen(false);
        setSearchOrbViewOnScreen(false);
    }

    public void setHeaderPresenterSelector(PresenterSelector presenterSelector) {
        this.mHeaderPresenterSelector = presenterSelector;
        HeadersFragment headersFragment = this.mHeadersFragment;
        if (headersFragment != null) {
            headersFragment.setPresenterSelector(presenterSelector);
        }
    }

    public void setHeadersState(int i) {
        if (i < 1 || i > 3) {
            throw new IllegalArgumentException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(i, "Invalid headers state: "));
        }
        if (i != this.mHeadersState) {
            this.mHeadersState = i;
            if (i == 1) {
                this.mCanShowHeaders = true;
                this.mShowingHeaders = true;
            } else if (i == 2) {
                this.mCanShowHeaders = true;
                this.mShowingHeaders = false;
            } else if (i != 3) {
                Log.w(TAG, "Unknown headers state: " + i);
            } else {
                this.mCanShowHeaders = false;
                this.mShowingHeaders = false;
            }
            HeadersFragment headersFragment = this.mHeadersFragment;
            if (headersFragment != null) {
                headersFragment.setHeadersGone(true ^ this.mCanShowHeaders);
            }
        }
    }

    public final void setHeadersTransitionOnBackEnabled(boolean z) {
        this.mHeadersBackStackEnabled = z;
    }

    public void setMainFragmentAdapter() {
        MainFragmentAdapter mainFragmentAdapter = ((MainFragmentAdapterProvider) this.mMainFragment).getMainFragmentAdapter();
        this.mMainFragmentAdapter = mainFragmentAdapter;
        mainFragmentAdapter.setFragmentHost(new FragmentHostImpl());
        if (this.mIsPageRow) {
            setMainFragmentRowsAdapter(null);
            return;
        }
        ComponentCallbacks2 componentCallbacks2 = this.mMainFragment;
        if (componentCallbacks2 instanceof MainFragmentRowsAdapterProvider) {
            setMainFragmentRowsAdapter(((MainFragmentRowsAdapterProvider) componentCallbacks2).getMainFragmentRowsAdapter());
        } else {
            setMainFragmentRowsAdapter(null);
        }
        this.mIsPageRow = this.mMainFragmentRowsAdapter == null;
    }

    public void setMainFragmentRowsAdapter(MainFragmentRowsAdapter mainFragmentRowsAdapter) {
        MainFragmentRowsAdapter mainFragmentRowsAdapter2 = this.mMainFragmentRowsAdapter;
        if (mainFragmentRowsAdapter == mainFragmentRowsAdapter2) {
            return;
        }
        if (mainFragmentRowsAdapter2 != null) {
            mainFragmentRowsAdapter2.setAdapter(null);
        }
        this.mMainFragmentRowsAdapter = mainFragmentRowsAdapter;
        if (mainFragmentRowsAdapter != null) {
            mainFragmentRowsAdapter.setOnItemViewSelectedListener(new MainFragmentItemViewSelectedListener(mainFragmentRowsAdapter));
            this.mMainFragmentRowsAdapter.setOnItemViewClickedListener(this.mOnItemViewClickedListener);
        }
        updateMainFragmentRowsAdapter();
    }

    public void setOnItemViewClickedListener(OnItemViewClickedListener onItemViewClickedListener) {
        this.mOnItemViewClickedListener = onItemViewClickedListener;
        MainFragmentRowsAdapter mainFragmentRowsAdapter = this.mMainFragmentRowsAdapter;
        if (mainFragmentRowsAdapter != null) {
            mainFragmentRowsAdapter.setOnItemViewClickedListener(onItemViewClickedListener);
        }
    }

    public void setOnItemViewSelectedListener(OnItemViewSelectedListener onItemViewSelectedListener) {
        this.mExternalOnItemViewSelectedListener = onItemViewSelectedListener;
    }

    public void setSearchOrbViewOnScreen(boolean z) {
        View searchAffordanceView = getTitleViewAdapter().getSearchAffordanceView();
        if (searchAffordanceView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) searchAffordanceView.getLayoutParams();
            marginLayoutParams.setMarginStart(z ? 0 : -this.mContainerListMarginStart);
            searchAffordanceView.setLayoutParams(marginLayoutParams);
        }
    }

    public void setSelectedPosition(int i) {
        setSelectedPosition(i, true);
    }

    public void setSelection(int i, boolean z) {
        if (i == -1) {
            return;
        }
        this.mSelectedPosition = i;
        HeadersFragment headersFragment = this.mHeadersFragment;
        if (headersFragment == null || this.mMainFragmentAdapter == null) {
            return;
        }
        headersFragment.setSelectedPosition(i, z);
        replaceMainFragment(i);
        MainFragmentRowsAdapter mainFragmentRowsAdapter = this.mMainFragmentRowsAdapter;
        if (mainFragmentRowsAdapter != null) {
            mainFragmentRowsAdapter.setSelectedPosition(i, z);
        }
        updateTitleViewVisibility();
    }

    public void showHeaders(boolean z) {
        this.mHeadersFragment.setHeadersEnabled(z);
        setHeadersOnScreen(z);
        expandMainFragment(!z);
    }

    public void startHeadersTransition(boolean z) {
        if (!this.mCanShowHeaders) {
            throw new IllegalStateException("Cannot start headers transition");
        }
        if (isInHeadersTransition() || this.mShowingHeaders == z) {
            return;
        }
        startHeadersTransitionInternal(z);
    }

    public void startHeadersTransitionInternal(final boolean z) {
        if (!getFragmentManager().isDestroyed() && isHeadersDataReady()) {
            this.mShowingHeaders = z;
            this.mMainFragmentAdapter.onTransitionPrepare();
            this.mMainFragmentAdapter.onTransitionStart();
            onExpandTransitionStart(!z, new Runnable() { // from class: androidx.leanback.app.BrowseFragment.3
                @Override // java.lang.Runnable
                public void run() {
                    BrowseFragment.this.mHeadersFragment.onTransitionPrepare();
                    BrowseFragment.this.mHeadersFragment.onTransitionStart();
                    BrowseFragment.this.createHeadersTransition();
                    BrowseTransitionListener browseTransitionListener = BrowseFragment.this.mBrowseTransitionListener;
                    if (browseTransitionListener != null) {
                        browseTransitionListener.onHeadersTransitionStart(z);
                    }
                    TransitionHelper.runTransition(z ? BrowseFragment.this.mSceneWithHeaders : BrowseFragment.this.mSceneWithoutHeaders, BrowseFragment.this.mHeadersTransition);
                    BrowseFragment browseFragment = BrowseFragment.this;
                    if (browseFragment.mHeadersBackStackEnabled) {
                        if (!z) {
                            browseFragment.getFragmentManager().beginTransaction().addToBackStack(BrowseFragment.this.mWithHeadersBackStackName).commit();
                            return;
                        }
                        int i = browseFragment.mBackStackChangedListener.mIndexOfHeadersBackStack;
                        if (i >= 0) {
                            BrowseFragment.this.getFragmentManager().popBackStackImmediate(browseFragment.getFragmentManager().getBackStackEntryAt(i).getId(), 1);
                        }
                    }
                }
            });
        }
    }

    public void updateMainFragmentRowsAdapter() {
        ListRowDataAdapter listRowDataAdapter = this.mMainFragmentListRowDataAdapter;
        if (listRowDataAdapter != null) {
            listRowDataAdapter.detach();
            this.mMainFragmentListRowDataAdapter = null;
        }
        if (this.mMainFragmentRowsAdapter != null) {
            ObjectAdapter objectAdapter = this.mAdapter;
            ListRowDataAdapter listRowDataAdapter2 = objectAdapter != null ? new ListRowDataAdapter(objectAdapter) : null;
            this.mMainFragmentListRowDataAdapter = listRowDataAdapter2;
            this.mMainFragmentRowsAdapter.setAdapter(listRowDataAdapter2);
        }
    }

    public void updateTitleViewVisibility() {
        MainFragmentAdapter mainFragmentAdapter;
        MainFragmentAdapter mainFragmentAdapter2;
        if (!this.mShowingHeaders) {
            if ((!this.mIsPageRow || (mainFragmentAdapter2 = this.mMainFragmentAdapter) == null) ? isFirstRowWithContent(this.mSelectedPosition) : mainFragmentAdapter2.mFragmentHost.mShowTitleView) {
                showTitle(6);
                return;
            } else {
                showTitle(false);
                return;
            }
        }
        boolean zIsFirstRowWithContent = (!this.mIsPageRow || (mainFragmentAdapter = this.mMainFragmentAdapter) == null) ? isFirstRowWithContent(this.mSelectedPosition) : mainFragmentAdapter.mFragmentHost.mShowTitleView;
        boolean zIsFirstRowWithContentOrPageRow = isFirstRowWithContentOrPageRow(this.mSelectedPosition);
        int i = zIsFirstRowWithContent ? 2 : 0;
        if (zIsFirstRowWithContentOrPageRow) {
            i |= 4;
        }
        if (i != 0) {
            showTitle(i);
        } else {
            showTitle(false);
        }
    }

    public void setSelectedPosition(int i, boolean z) {
        this.mSetSelectionRunnable.post(i, 1, z);
    }

    public void setSelectedPosition(int i, boolean z, Presenter.ViewHolderTask viewHolderTask) {
        if (this.mMainFragmentAdapterRegistry == null) {
            return;
        }
        if (viewHolderTask != null) {
            startHeadersTransition(false);
        }
        MainFragmentRowsAdapter mainFragmentRowsAdapter = this.mMainFragmentRowsAdapter;
        if (mainFragmentRowsAdapter != null) {
            mainFragmentRowsAdapter.setSelectedPosition(i, z, viewHolderTask);
        }
    }
}
