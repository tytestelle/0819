package O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO;

import O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0;
import android.annotation.SuppressLint;
import androidx.annotation.OptIn;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.Player;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.exoplayer.trackselection.MappingTrackSelector;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.google.common.collect.O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo;
import java.util.ArrayList;
import java.util.List;
import xyz.doikki.videoplayer.exo.ExoMediaPlayer;

/* JADX INFO: loaded from: classes.dex */
public final class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO extends ExoMediaPlayer {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public String f975O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public String f976O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public String f977O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    @SuppressLint({"UnsafeOptInUsageError"})
    private void getExoSelectedTrack() {
        this.f975O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = "";
        this.f976O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = "";
        this.f977O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = "";
        O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo it = this.mMediaPlayer.getCurrentTracks().getGroups().iterator();
        while (it.hasNext()) {
            Tracks.Group group = (Tracks.Group) it.next();
            for (int i = 0; i < group.length; i++) {
                Format trackFormat = group.getTrackFormat(i);
                if (MimeTypes.isVideo(trackFormat.sampleMimeType)) {
                    if (group.isTrackSelected(i)) {
                        this.f975O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = trackFormat.id;
                    }
                } else if (MimeTypes.isAudio(trackFormat.sampleMimeType)) {
                    if (group.isTrackSelected(i)) {
                        this.f976O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = trackFormat.id;
                    }
                } else if (MimeTypes.isText(trackFormat.sampleMimeType) && group.isTrackSelected(i)) {
                    this.f977O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = trackFormat.id;
                }
            }
        }
    }

    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 o00000O00oOOo000000OOOo00OOOo0OooOO00OO0, boolean z, boolean z2) {
        MappingTrackSelector.MappedTrackInfo currentMappedTrackInfo = getTrackSelector().getCurrentMappedTrackInfo();
        if (currentMappedTrackInfo == null || o00000O00oOOo000000OOOo00OOOo0OooOO00OO0 == null) {
            return;
        }
        TrackGroupArray trackGroups = currentMappedTrackInfo.getTrackGroups(o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.f967O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        DefaultTrackSelector.SelectionOverride selectionOverride = new DefaultTrackSelector.SelectionOverride(o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.f968O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.f969O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
        DefaultTrackSelector.Parameters.Builder builderBuildUponParameters = getTrackSelector().buildUponParameters();
        if (z2 && !z) {
            builderBuildUponParameters.setRendererDisabled(o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.f967O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, true);
            LivePlayActivity.f2944O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo.setVisibility(8);
        } else {
            builderBuildUponParameters.setRendererDisabled(o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.f967O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, false);
        }
        builderBuildUponParameters.setSelectionOverride(o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.f967O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, trackGroups, selectionOverride);
        getTrackSelector().setParameters(builderBuildUponParameters);
    }

    @SuppressLint({"UnsafeOptInUsageError"})
    public List<O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0> getTrackInfo() {
        ArrayList arrayList = new ArrayList();
        MappingTrackSelector.MappedTrackInfo currentMappedTrackInfo = getTrackSelector().getCurrentMappedTrackInfo();
        if (currentMappedTrackInfo != null) {
            getExoSelectedTrack();
            for (int i = 0; i < currentMappedTrackInfo.getRendererCount(); i++) {
                TrackGroupArray trackGroups = currentMappedTrackInfo.getTrackGroups(i);
                for (int i2 = 0; i2 < trackGroups.length; i2++) {
                    TrackGroup trackGroup = trackGroups.get(i2);
                    for (int i3 = 0; i3 < trackGroup.length; i3++) {
                        Format format = trackGroup.getFormat(i3);
                        if (MimeTypes.isVideo(format.sampleMimeType)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(format.sampleMimeType);
                            sb.append(", ");
                            sb.append(this.trackNameProvider.getTrackName(format));
                            sb.append(", ");
                            String strO00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(sb, "FPS", (int) format.frameRate);
                            String str = this.f975O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                            int i4 = O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f1588O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                            boolean z = (str == null || str.length() == 0 || !this.f975O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.equals(format.id)) ? false : true;
                            O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 o00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = new O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0();
                            o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.f970O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.VIDEO;
                            o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.f971O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = strO00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
                            o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.f969O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = i3;
                            o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.f972O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = z;
                            o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.f968O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = i2;
                            o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.f967O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
                            arrayList.add(o00000O00oOOo000000OOOo00OOOo0OooOO00OO0);
                            if (z) {
                                O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.f1301O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.put("videoSelected", Integer.valueOf(arrayList.size() - 1));
                            }
                        } else if (MimeTypes.isAudio(format.sampleMimeType)) {
                            int i5 = format.sampleRate;
                            String str2 = format.sampleMimeType + ", " + this.trackNameProvider.getTrackName(format) + ", " + (i5 == -1 ? "-1" : i5 + "Hz");
                            String str3 = this.f976O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                            int i6 = O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f1588O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                            boolean z2 = (str3 == null || str3.length() == 0 || !this.f976O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.equals(format.id)) ? false : true;
                            O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 o00000O00oOOo000000OOOo00OOOo0OooOO00OO1 = new O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0();
                            o00000O00oOOo000000OOOo00OOOo0OooOO00OO1.f970O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.AUDIO;
                            o00000O00oOOo000000OOOo00OOOo0OooOO00OO1.f971O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = str2;
                            o00000O00oOOo000000OOOo00OOOo0OooOO00OO1.f969O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = i3;
                            o00000O00oOOo000000OOOo00OOOo0OooOO00OO1.f972O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = z2;
                            o00000O00oOOo000000OOOo00OOOo0OooOO00OO1.f968O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = i2;
                            o00000O00oOOo000000OOOo00OOOo0OooOO00OO1.f967O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
                            arrayList.add(o00000O00oOOo000000OOOo00OOOo0OooOO00OO1);
                            if (z2) {
                                O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.f1301O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.put("audioSelected", Integer.valueOf(arrayList.size() - 1));
                            }
                        } else if (MimeTypes.isText(format.sampleMimeType)) {
                            String str4 = format.sampleMimeType + ", " + this.trackNameProvider.getTrackName(format);
                            String str5 = this.f977O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                            int i7 = O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f1588O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                            boolean z3 = (str5 == null || str5.length() == 0 || !this.f977O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.equals(format.id)) ? false : true;
                            O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 o00000O00oOOo000000OOOo00OOOo0OooOO00OO2 = new O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0();
                            o00000O00oOOo000000OOOo00OOOo0OooOO00OO2.f970O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.SUBTITLE;
                            o00000O00oOOo000000OOOo00OOOo0OooOO00OO2.f971O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = str4;
                            o00000O00oOOo000000OOOo00OOOo0OooOO00OO2.f969O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = i3;
                            o00000O00oOOo000000OOOo00OOOo0OooOO00OO2.f972O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = z3;
                            o00000O00oOOo000000OOOo00OOOo0OooOO00OO2.f968O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = i2;
                            o00000O00oOOo000000OOOo00OOOo0OooOO00OO2.f967O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
                            arrayList.add(o00000O00oOOo000000OOOo00OOOo0OooOO00OO2);
                            if (z3) {
                                O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.f1301O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.put("subSelected", Integer.valueOf(arrayList.size() - 1));
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // xyz.doikki.videoplayer.exo.ExoMediaPlayer, androidx.media3.common.Player.Listener
    public final void onCues(List list) {
        androidx.media3.common.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(this, list);
        if (list.isEmpty()) {
            LivePlayActivity.f2944O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo.setVisibility(8);
        } else {
            LivePlayActivity.f2944O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo.setCues(list);
            LivePlayActivity.f2944O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo.setVisibility(0);
        }
    }

    @Override // xyz.doikki.videoplayer.exo.ExoMediaPlayer, androidx.media3.common.Player.Listener
    public final void onVideoSizeChanged(VideoSize videoSize) {
        super.onVideoSizeChanged(videoSize);
        this.mPlayerEventListener.onTrackList(getTrackInfo());
    }

    @OptIn(markerClass = {UnstableApi.class})
    public void setOnTimedTextListener(Player.Listener listener) {
        this.mMediaPlayer.addListener(listener);
    }
}
