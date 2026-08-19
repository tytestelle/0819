package androidx.leanback.widget;

import android.util.Pair;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class GuidedActionAdapterGroup {
    private static final boolean DEBUG_EDIT = false;
    private static final String TAG_EDIT = "EditableAction";
    ArrayList<Pair<GuidedActionAdapter, GuidedActionAdapter>> mAdapters = new ArrayList<>();
    private GuidedActionAdapter.EditListener mEditListener;
    private boolean mImeOpened;

    private void updateTextIntoAction(GuidedActionsStylist.ViewHolder viewHolder, TextView textView) {
        GuidedAction action = viewHolder.getAction();
        if (textView == viewHolder.getDescriptionView()) {
            if (action.getEditDescription() != null) {
                action.setEditDescription(textView.getText());
                return;
            } else {
                action.setDescription(textView.getText());
                return;
            }
        }
        if (textView == viewHolder.getTitleView()) {
            if (action.getEditTitle() != null) {
                action.setEditTitle(textView.getText());
            } else {
                action.setTitle(textView.getText());
            }
        }
    }

    public void addAdpter(GuidedActionAdapter guidedActionAdapter, GuidedActionAdapter guidedActionAdapter2) {
        this.mAdapters.add(new Pair<>(guidedActionAdapter, guidedActionAdapter2));
        if (guidedActionAdapter != null) {
            guidedActionAdapter.mGroup = this;
        }
        if (guidedActionAdapter2 != null) {
            guidedActionAdapter2.mGroup = this;
        }
    }

    public void closeIme(View view) {
        if (this.mImeOpened) {
            this.mImeOpened = false;
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            this.mEditListener.onImeClose();
        }
    }

    public void fillAndGoNext(GuidedActionAdapter guidedActionAdapter, TextView textView) {
        GuidedActionsStylist.ViewHolder viewHolderFindSubChildViewHolder = guidedActionAdapter.findSubChildViewHolder(textView);
        updateTextIntoAction(viewHolderFindSubChildViewHolder, textView);
        guidedActionAdapter.performOnActionClick(viewHolderFindSubChildViewHolder);
        long jOnGuidedActionEditedAndProceed = this.mEditListener.onGuidedActionEditedAndProceed(viewHolderFindSubChildViewHolder.getAction());
        boolean zFocusToNextAction = false;
        guidedActionAdapter.getGuidedActionsStylist().setEditingMode(viewHolderFindSubChildViewHolder, false);
        if (jOnGuidedActionEditedAndProceed != -3 && jOnGuidedActionEditedAndProceed != viewHolderFindSubChildViewHolder.getAction().getId()) {
            zFocusToNextAction = focusToNextAction(guidedActionAdapter, viewHolderFindSubChildViewHolder.getAction(), jOnGuidedActionEditedAndProceed);
        }
        if (zFocusToNextAction) {
            return;
        }
        closeIme(textView);
        viewHolderFindSubChildViewHolder.itemView.requestFocus();
    }

    public void fillAndStay(GuidedActionAdapter guidedActionAdapter, TextView textView) {
        GuidedActionsStylist.ViewHolder viewHolderFindSubChildViewHolder = guidedActionAdapter.findSubChildViewHolder(textView);
        updateTextIntoAction(viewHolderFindSubChildViewHolder, textView);
        this.mEditListener.onGuidedActionEditCanceled(viewHolderFindSubChildViewHolder.getAction());
        guidedActionAdapter.getGuidedActionsStylist().setEditingMode(viewHolderFindSubChildViewHolder, false);
        closeIme(textView);
        viewHolderFindSubChildViewHolder.itemView.requestFocus();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0011 A[LOOP:0: B:9:0x0012->B:8:0x0011, LOOP_END] */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0012, code lost:
    
        r9 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean focusToNextAction(GuidedActionAdapter adapter, GuidedAction action, long nextActionId) {
        int index = 0;
        if (nextActionId == GuidedAction.ACTION_ID_NEXT) {
            index = adapter.indexOf(action);
            if (index < 0) return false;
            index++;
        }
        int adapterIndex = mAdapters.indexOf(adapter);
        do {
            int size = adapter.getCount();
            if (nextActionId == GuidedAction.ACTION_ID_NEXT) {
                while (index < size && !adapter.getItem(index).isFocusable()) index++;
            } else {
                while (index < size && adapter.getItem(index).getId() != nextActionId) index++;
            }
            if (index < size) {
                GuidedActionsStylist.ViewHolder vh = (GuidedActionsStylist.ViewHolder)
                        adapter.getGuidedActionsStylist().getActionsGridView().findViewHolderForPosition(index);
                if (vh != null) {
                    if (vh.getAction().hasTextEditable()) {
                        openIme(adapter, vh);
                    } else {
                        closeIme(vh.itemView);
                        vh.itemView.requestFocus();
                    }
                    return true;
                }
                return false;
            }
            adapter = getNextAdapter(adapter);
            index = 0;
            if (adapter == null) return false;
            adapterIndex = mAdapters.indexOf(adapter);
        } while (adapterIndex >= 0);
        return false;
    }

    public GuidedActionAdapter getNextAdapter(GuidedActionAdapter guidedActionAdapter) {
        for (int i = 0; i < this.mAdapters.size(); i++) {
            Pair<GuidedActionAdapter, GuidedActionAdapter> pair = this.mAdapters.get(i);
            if (pair.first == guidedActionAdapter) {
                return (GuidedActionAdapter) pair.second;
            }
        }
        return null;
    }

    public void openIme(GuidedActionAdapter guidedActionAdapter, GuidedActionsStylist.ViewHolder viewHolder) {
        guidedActionAdapter.getGuidedActionsStylist().setEditingMode(viewHolder, true);
        View editingView = viewHolder.getEditingView();
        if (editingView == null || !viewHolder.isInEditingText()) {
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) editingView.getContext().getSystemService("input_method");
        editingView.setFocusable(true);
        editingView.requestFocus();
        inputMethodManager.showSoftInput(editingView, 0);
        if (this.mImeOpened) {
            return;
        }
        this.mImeOpened = true;
        this.mEditListener.onImeOpen();
    }

    public void setEditListener(GuidedActionAdapter.EditListener editListener) {
        this.mEditListener = editListener;
    }
}
