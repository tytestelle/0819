package androidx.media3.extractor.metadata.id3;

import androidx.annotation.Nullable;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O;
import com.google.errorprone.annotations.InlineMe;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import org.fourthline.cling.model.ServiceReference;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class TextInformationFrame extends Id3Frame {

    @Nullable
    public final String description;

    @Deprecated
    public final String value;
    public final O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O values;

    public TextInformationFrame(String str, @Nullable String str2, List<String> list) {
        super(str);
        Assertions.checkArgument(!list.isEmpty());
        this.description = str2;
        O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OCopyOf = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.copyOf((Collection) list);
        this.values = o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OCopyOf;
        this.value = (String) o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OCopyOf.get(0);
    }

    private static List<Integer> parseId3v2point4TimestampFrameForDate(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TextInformationFrame.class != obj.getClass()) {
            return false;
        }
        TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
        return Objects.equals(this.id, textInformationFrame.id) && Objects.equals(this.description, textInformationFrame.description) && this.values.equals(textInformationFrame.values);
    }

    public int hashCode() {
        int iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(527, 31, this.id);
        String str = this.description;
        return this.values.hashCode() + ((iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO + (str != null ? str.hashCode() : 0)) * 31);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.media3.extractor.metadata.id3.Id3Frame, androidx.media3.common.Metadata.Entry
    public void populateMediaMetadata(MediaMetadata.Builder builder) {
        String str = this.id;
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    b = 0;
                }
                break;
            case 82878:
                if (str.equals("TCM")) {
                    b = 1;
                }
                break;
            case 82897:
                if (str.equals("TDA")) {
                    b = 2;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    b = 3;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    b = 4;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    b = 5;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    b = 6;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    b = 7;
                }
                break;
            case 83536:
                if (str.equals("TXT")) {
                    b = 8;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    b = 9;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    b = 10;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    b = 11;
                }
                break;
            case 2569358:
                if (str.equals("TCON")) {
                    b = 12;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    b = 13;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    b = 14;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    b = 15;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    b = 16;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    b = 17;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    b = 18;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    b = 19;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    b = 20;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    b = 21;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    b = 22;
                }
                break;
        }
        try {
            switch (b) {
                case 0:
                case 10:
                    builder.setAlbumTitle((CharSequence) this.values.get(0));
                    break;
                case 1:
                case 11:
                    builder.setComposer((CharSequence) this.values.get(0));
                    break;
                case 2:
                case 13:
                    String str2 = (String) this.values.get(0);
                    builder.setRecordingMonth(Integer.valueOf(Integer.parseInt(str2.substring(2, 4)))).setRecordingDay(Integer.valueOf(Integer.parseInt(str2.substring(0, 2))));
                    break;
                case 3:
                case 18:
                    builder.setArtist((CharSequence) this.values.get(0));
                    break;
                case 4:
                case 19:
                    builder.setAlbumArtist((CharSequence) this.values.get(0));
                    break;
                case 5:
                case 20:
                    builder.setConductor((CharSequence) this.values.get(0));
                    break;
                case 6:
                case 21:
                    String[] strArrSplit = Util.split((String) this.values.get(0), ServiceReference.DELIMITER);
                    builder.setTrackNumber(Integer.valueOf(Integer.parseInt(strArrSplit[0]))).setTotalTrackCount(strArrSplit.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit[1])) : null);
                    break;
                case 7:
                case 17:
                    builder.setTitle((CharSequence) this.values.get(0));
                    break;
                case 8:
                case 16:
                    builder.setWriter((CharSequence) this.values.get(0));
                    break;
                case 9:
                case 22:
                    builder.setRecordingYear(Integer.valueOf(Integer.parseInt((String) this.values.get(0))));
                    break;
                case 12:
                    Integer numO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o((String) this.values.get(0));
                    if (numO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o != null) {
                        String strResolveV1Genre = Id3Util.resolveV1Genre(numO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.intValue());
                        if (strResolveV1Genre != null) {
                            builder.setGenre(strResolveV1Genre);
                        }
                    } else {
                        builder.setGenre((CharSequence) this.values.get(0));
                    }
                    break;
                case 14:
                    List<Integer> id3v2point4TimestampFrameForDate = parseId3v2point4TimestampFrameForDate((String) this.values.get(0));
                    int size = id3v2point4TimestampFrameForDate.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                builder.setRecordingDay(id3v2point4TimestampFrameForDate.get(2));
                            }
                        }
                        builder.setRecordingMonth(id3v2point4TimestampFrameForDate.get(1));
                    }
                    builder.setRecordingYear(id3v2point4TimestampFrameForDate.get(0));
                    break;
                case 15:
                    List<Integer> id3v2point4TimestampFrameForDate2 = parseId3v2point4TimestampFrameForDate((String) this.values.get(0));
                    int size2 = id3v2point4TimestampFrameForDate2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                builder.setReleaseDay(id3v2point4TimestampFrameForDate2.get(2));
                            }
                        }
                        builder.setReleaseMonth(id3v2point4TimestampFrameForDate2.get(1));
                    }
                    builder.setReleaseYear(id3v2point4TimestampFrameForDate2.get(0));
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public String toString() {
        return this.id + ": description=" + this.description + ": values=" + this.values;
    }

    @InlineMe(imports = {"com.google.common.collect.ImmutableList"}, replacement = "this(id, description, ImmutableList.of(value))")
    @Deprecated
    public TextInformationFrame(String str, @Nullable String str2, String str3) {
        this(str, str2, O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of(str3));
    }
}
