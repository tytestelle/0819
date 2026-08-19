package O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000;

import O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo;
import O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;
import O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0;
import O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo;
import O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000Ooo0Oo0ooOOOO0OoooOO000OoOOO0oOO0oO;
import O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000o0oO00ooo0OO000oOooo0OOOo000O0000Oo;
import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.core.state.Interpolator;
import androidx.constraintlayout.core.state.Transition;
import androidx.core.view.inputmethod.InputConnectionCompat;
import androidx.core.view.inputmethod.InputContentInfoCompat;
import androidx.media3.common.FlagSet;
import androidx.media3.common.Player;
import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.container.ReorderingBufferQueue;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.trackselection.RandomTrackSelection;
import androidx.media3.exoplayer.trackselection.TrackSelectionUtil;
import androidx.media3.extractor.BinarySearchSeeker;
import androidx.media3.extractor.FlacStreamMetadata;
import androidx.media3.extractor.mp4.FragmentedMp4Extractor;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.SubtitleExtractor;
import com.google.common.collect.O0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO;
import com.quickjs.JSArray;
import java.util.List;
import okhttp3.WebSocket;
import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 implements com.quickjs.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, Interpolator, InputConnectionCompat.OnCommitContentListener, ListenerSet.IterationFinishedEvent, com.google.common.util.concurrent.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0, DefaultTrackSelector.TrackInfo.Factory, TrackSelectionUtil.AdaptiveTrackSelectionFactory, BinarySearchSeeker.SeekTimestampConverter, ReorderingBufferQueue.OutputConsumer, Consumer, O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00, O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o, O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo, O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo, O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0, O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo, O0000Ooo0Oo0ooOOOO0OoooOO000OoOOO0oOO0oO, O0000o0oO00ooo0OO000oOooo0OOOo000O0000Oo {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f1511O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Object f1512O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(Object obj, int i) {
        this.f1511O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f1512O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj;
    }

    @Override // O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO
    public void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(int i) {
        switch (this.f1511O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 12:
                O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = (O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O) this.f1512O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                int i2 = o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1316O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1316O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = i;
                if (i2 != -1) {
                    o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.notifyItemChanged(i2);
                }
                int i3 = o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1316O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                if (i3 != -1) {
                    o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.notifyItemChanged(i3);
                }
                break;
            default:
                com.github.tvbox.osc.ui.dialog.O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo o0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo = (com.github.tvbox.osc.ui.dialog.O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo) this.f1512O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                o0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.f3293O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.post(new O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(o0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo, i, 13));
                break;
        }
    }

    @Override // com.quickjs.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O
    public void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(JSArray jSArray) {
        switch (this.f1511O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                String strO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = jSArray.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(0);
                int iO00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = jSArray.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0();
                WebSocket webSocket = (WebSocket) this.f1512O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                if (iO00000O00oOOo000000OOOo00OOOo0OooOO00OO0 > 1 && jSArray.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(1)) {
                    webSocket.send(ByteString.decodeHex(strO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.toLowerCase()));
                } else {
                    webSocket.send(strO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo);
                }
                break;
            default:
                O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = (O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) this.f1512O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                if (!jSArray.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(0)) {
                    o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.error(jSArray.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(1));
                }
                break;
        }
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(Object obj) {
        switch (this.f1511O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 10:
                ((SubtitleExtractor) this.f1512O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).lambda$parseAndWriteToOutput$0((CuesWithTiming) obj);
                break;
            default:
                ((O0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO) this.f1512O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo((CuesWithTiming) obj);
                break;
        }
    }

    @Override // androidx.media3.container.ReorderingBufferQueue.OutputConsumer
    public void consume(long j, ParsableByteArray parsableByteArray) {
        ((FragmentedMp4Extractor) this.f1512O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).lambda$new$2(j, parsableByteArray);
    }

    @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo.Factory
    public List create(int i, TrackGroup trackGroup, int[] iArr) {
        return DefaultTrackSelector.lambda$selectImageTrack$5((DefaultTrackSelector.Parameters) this.f1512O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, i, trackGroup, iArr);
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelectionUtil.AdaptiveTrackSelectionFactory
    public ExoTrackSelection createAdaptiveTrackSelection(ExoTrackSelection.Definition definition) {
        return ((RandomTrackSelection.Factory) this.f1512O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).lambda$createTrackSelections$0(definition);
    }

    @Override // androidx.constraintlayout.core.state.Interpolator
    public float getInterpolation(float f) {
        return Transition.lambda$getInterpolator$0((String) this.f1512O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, f);
    }

    @Override // androidx.media3.common.util.ListenerSet.IterationFinishedEvent
    public void invoke(Object obj, FlagSet flagSet) {
        ((SimpleBasePlayer) this.f1512O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).lambda$new$0((Player.Listener) obj, flagSet);
    }

    @Override // androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener
    public boolean onCommitContent(InputContentInfoCompat inputContentInfoCompat, int i, Bundle bundle) {
        return InputConnectionCompat.lambda$createOnCommitContentListenerUsingPerformReceiveContent$0((View) this.f1512O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, inputContentInfoCompat, i, bundle);
    }

    @Override // androidx.media3.extractor.BinarySearchSeeker.SeekTimestampConverter
    public long timeUsToTargetTime(long j) {
        return ((FlacStreamMetadata) this.f1512O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).getSampleNumber(j);
    }
}
