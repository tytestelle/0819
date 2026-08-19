package androidx.media3.extractor.mp4;

import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.container.Mp4Box;
import androidx.media3.extractor.GaplessInfoHolder;
import androidx.media3.extractor.metadata.id3.ApicFrame;
import androidx.media3.extractor.metadata.id3.CommentFrame;
import androidx.media3.extractor.metadata.id3.Id3Frame;
import androidx.media3.extractor.metadata.id3.Id3Util;
import androidx.media3.extractor.metadata.id3.InternalFrame;
import androidx.media3.extractor.metadata.id3.TextInformationFrame;
import com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O;
import org.fourthline.cling.model.ServiceReference;

/* JADX INFO: loaded from: classes.dex */
final class MetadataUtil {
    private static final int PICTURE_TYPE_FRONT_COVER = 3;
    private static final int SHORT_TYPE_ALBUM = 6384738;
    private static final int SHORT_TYPE_ARTIST = 4280916;
    private static final int SHORT_TYPE_COMMENT = 6516084;
    private static final int SHORT_TYPE_COMPOSER_1 = 6516589;
    private static final int SHORT_TYPE_COMPOSER_2 = 7828084;
    private static final int SHORT_TYPE_ENCODER = 7630703;
    private static final int SHORT_TYPE_GENRE = 6776174;
    private static final int SHORT_TYPE_LYRICS = 7108978;
    private static final int SHORT_TYPE_NAME_1 = 7233901;
    private static final int SHORT_TYPE_NAME_2 = 7631467;
    private static final int SHORT_TYPE_YEAR = 6578553;
    private static final String TAG = "MetadataUtil";
    private static final int TYPE_ALBUM_ARTIST = 1631670868;
    private static final int TYPE_COMPILATION = 1668311404;
    private static final int TYPE_COVER_ART = 1668249202;
    private static final int TYPE_DISK_NUMBER = 1684632427;
    private static final int TYPE_GAPLESS_ALBUM = 1885823344;
    private static final int TYPE_GENRE = 1735291493;
    private static final int TYPE_GROUPING = 6779504;
    private static final int TYPE_INTERNAL = 757935405;
    private static final int TYPE_RATING = 1920233063;
    private static final int TYPE_SORT_ALBUM = 1936679276;
    private static final int TYPE_SORT_ALBUM_ARTIST = 1936679265;
    private static final int TYPE_SORT_ARTIST = 1936679282;
    private static final int TYPE_SORT_COMPOSER = 1936679791;
    private static final int TYPE_SORT_TRACK_NAME = 1936682605;
    private static final int TYPE_TEMPO = 1953329263;
    private static final int TYPE_TOP_BYTE_COPYRIGHT = 169;
    private static final int TYPE_TOP_BYTE_REPLACEMENT = 253;
    private static final int TYPE_TRACK_NUMBER = 1953655662;
    private static final int TYPE_TV_SHOW = 1953919848;
    private static final int TYPE_TV_SORT_SHOW = 1936683886;

    private MetadataUtil() {
    }

    @Nullable
    public static MdtaMetadataEntry findMdtaMetadataEntryWithKey(Metadata metadata, String str) {
        for (int i = 0; i < metadata.length(); i++) {
            Metadata.Entry entry = metadata.get(i);
            if (entry instanceof MdtaMetadataEntry) {
                MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) entry;
                if (mdtaMetadataEntry.key.equals(str)) {
                    return mdtaMetadataEntry;
                }
            }
        }
        return null;
    }

    @Nullable
    private static CommentFrame parseCommentAttribute(int i, ParsableByteArray parsableByteArray) {
        int i2 = parsableByteArray.readInt();
        if (parsableByteArray.readInt() == 1684108385) {
            parsableByteArray.skipBytes(8);
            String nullTerminatedString = parsableByteArray.readNullTerminatedString(i2 - 16);
            return new CommentFrame(C.LANGUAGE_UNDETERMINED, nullTerminatedString, nullTerminatedString);
        }
        Log.w(TAG, "Failed to parse comment attribute: " + Mp4Box.getBoxTypeString(i));
        return null;
    }

    @Nullable
    private static ApicFrame parseCoverArt(ParsableByteArray parsableByteArray) {
        String str;
        int i = parsableByteArray.readInt();
        if (parsableByteArray.readInt() != 1684108385) {
            Log.w(TAG, "Failed to parse cover art attribute");
            return null;
        }
        int fullBoxFlags = BoxParser.parseFullBoxFlags(parsableByteArray.readInt());
        if (fullBoxFlags == 13) {
            str = "image/jpeg";
        } else {
            str = fullBoxFlags == 14 ? "image/png" : null;
        }
        if (str == null) {
            O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(fullBoxFlags, "Unrecognized cover art flags: ", TAG);
            return null;
        }
        parsableByteArray.skipBytes(4);
        int i2 = i - 16;
        byte[] bArr = new byte[i2];
        parsableByteArray.readBytes(bArr, 0, i2);
        return new ApicFrame(str, null, 3, bArr);
    }

    @Nullable
    public static Metadata.Entry parseIlstElement(ParsableByteArray parsableByteArray) {
        int i = parsableByteArray.readInt() + parsableByteArray.getPosition();
        int i2 = parsableByteArray.readInt();
        int i3 = (i2 >> 24) & 255;
        try {
            if (i3 == TYPE_TOP_BYTE_COPYRIGHT || i3 == TYPE_TOP_BYTE_REPLACEMENT) {
                int i4 = 16777215 & i2;
                if (i4 == SHORT_TYPE_COMMENT) {
                    CommentFrame commentAttribute = parseCommentAttribute(i2, parsableByteArray);
                    parsableByteArray.setPosition(i);
                    return commentAttribute;
                }
                if (i4 == SHORT_TYPE_NAME_1 || i4 == SHORT_TYPE_NAME_2) {
                    TextInformationFrame textAttribute = parseTextAttribute(i2, "TIT2", parsableByteArray);
                    parsableByteArray.setPosition(i);
                    return textAttribute;
                }
                if (i4 == SHORT_TYPE_COMPOSER_1 || i4 == SHORT_TYPE_COMPOSER_2) {
                    TextInformationFrame textAttribute2 = parseTextAttribute(i2, "TCOM", parsableByteArray);
                    parsableByteArray.setPosition(i);
                    return textAttribute2;
                }
                if (i4 == SHORT_TYPE_YEAR) {
                    TextInformationFrame textAttribute3 = parseTextAttribute(i2, "TDRC", parsableByteArray);
                    parsableByteArray.setPosition(i);
                    return textAttribute3;
                }
                if (i4 == SHORT_TYPE_ARTIST) {
                    TextInformationFrame textAttribute4 = parseTextAttribute(i2, "TPE1", parsableByteArray);
                    parsableByteArray.setPosition(i);
                    return textAttribute4;
                }
                if (i4 == SHORT_TYPE_ENCODER) {
                    TextInformationFrame textAttribute5 = parseTextAttribute(i2, "TSSE", parsableByteArray);
                    parsableByteArray.setPosition(i);
                    return textAttribute5;
                }
                if (i4 == SHORT_TYPE_ALBUM) {
                    TextInformationFrame textAttribute6 = parseTextAttribute(i2, "TALB", parsableByteArray);
                    parsableByteArray.setPosition(i);
                    return textAttribute6;
                }
                if (i4 == SHORT_TYPE_LYRICS) {
                    TextInformationFrame textAttribute7 = parseTextAttribute(i2, "USLT", parsableByteArray);
                    parsableByteArray.setPosition(i);
                    return textAttribute7;
                }
                if (i4 == SHORT_TYPE_GENRE) {
                    TextInformationFrame textAttribute8 = parseTextAttribute(i2, "TCON", parsableByteArray);
                    parsableByteArray.setPosition(i);
                    return textAttribute8;
                }
                if (i4 == TYPE_GROUPING) {
                    TextInformationFrame textAttribute9 = parseTextAttribute(i2, "TIT1", parsableByteArray);
                    parsableByteArray.setPosition(i);
                    return textAttribute9;
                }
            } else {
                if (i2 == TYPE_GENRE) {
                    TextInformationFrame standardGenreAttribute = parseStandardGenreAttribute(parsableByteArray);
                    parsableByteArray.setPosition(i);
                    return standardGenreAttribute;
                }
                if (i2 == TYPE_DISK_NUMBER) {
                    TextInformationFrame indexAndCountAttribute = parseIndexAndCountAttribute(i2, "TPOS", parsableByteArray);
                    parsableByteArray.setPosition(i);
                    return indexAndCountAttribute;
                }
                if (i2 == TYPE_TRACK_NUMBER) {
                    TextInformationFrame indexAndCountAttribute2 = parseIndexAndCountAttribute(i2, "TRCK", parsableByteArray);
                    parsableByteArray.setPosition(i);
                    return indexAndCountAttribute2;
                }
                if (i2 == TYPE_TEMPO) {
                    Id3Frame integerAttribute = parseIntegerAttribute(i2, "TBPM", parsableByteArray, true, false);
                    parsableByteArray.setPosition(i);
                    return integerAttribute;
                }
                if (i2 == TYPE_COMPILATION) {
                    Id3Frame integerAttribute2 = parseIntegerAttribute(i2, "TCMP", parsableByteArray, true, true);
                    parsableByteArray.setPosition(i);
                    return integerAttribute2;
                }
                if (i2 == TYPE_COVER_ART) {
                    ApicFrame coverArt = parseCoverArt(parsableByteArray);
                    parsableByteArray.setPosition(i);
                    return coverArt;
                }
                if (i2 == TYPE_ALBUM_ARTIST) {
                    TextInformationFrame textAttribute10 = parseTextAttribute(i2, "TPE2", parsableByteArray);
                    parsableByteArray.setPosition(i);
                    return textAttribute10;
                }
                if (i2 == TYPE_SORT_TRACK_NAME) {
                    TextInformationFrame textAttribute11 = parseTextAttribute(i2, "TSOT", parsableByteArray);
                    parsableByteArray.setPosition(i);
                    return textAttribute11;
                }
                if (i2 == TYPE_SORT_ALBUM) {
                    TextInformationFrame textAttribute12 = parseTextAttribute(i2, "TSOA", parsableByteArray);
                    parsableByteArray.setPosition(i);
                    return textAttribute12;
                }
                if (i2 == TYPE_SORT_ARTIST) {
                    TextInformationFrame textAttribute13 = parseTextAttribute(i2, "TSOP", parsableByteArray);
                    parsableByteArray.setPosition(i);
                    return textAttribute13;
                }
                if (i2 == TYPE_SORT_ALBUM_ARTIST) {
                    TextInformationFrame textAttribute14 = parseTextAttribute(i2, "TSO2", parsableByteArray);
                    parsableByteArray.setPosition(i);
                    return textAttribute14;
                }
                if (i2 == TYPE_SORT_COMPOSER) {
                    TextInformationFrame textAttribute15 = parseTextAttribute(i2, "TSOC", parsableByteArray);
                    parsableByteArray.setPosition(i);
                    return textAttribute15;
                }
                if (i2 == TYPE_RATING) {
                    Id3Frame integerAttribute3 = parseIntegerAttribute(i2, "ITUNESADVISORY", parsableByteArray, false, false);
                    parsableByteArray.setPosition(i);
                    return integerAttribute3;
                }
                if (i2 == TYPE_GAPLESS_ALBUM) {
                    Id3Frame integerAttribute4 = parseIntegerAttribute(i2, "ITUNESGAPLESS", parsableByteArray, false, true);
                    parsableByteArray.setPosition(i);
                    return integerAttribute4;
                }
                if (i2 == TYPE_TV_SORT_SHOW) {
                    TextInformationFrame textAttribute16 = parseTextAttribute(i2, "TVSHOWSORT", parsableByteArray);
                    parsableByteArray.setPosition(i);
                    return textAttribute16;
                }
                if (i2 == TYPE_TV_SHOW) {
                    TextInformationFrame textAttribute17 = parseTextAttribute(i2, "TVSHOW", parsableByteArray);
                    parsableByteArray.setPosition(i);
                    return textAttribute17;
                }
                if (i2 == TYPE_INTERNAL) {
                    Id3Frame internalAttribute = parseInternalAttribute(parsableByteArray, i);
                    parsableByteArray.setPosition(i);
                    return internalAttribute;
                }
            }
            Log.d(TAG, "Skipped unknown metadata entry: " + Mp4Box.getBoxTypeString(i2));
            parsableByteArray.setPosition(i);
            return null;
        } catch (Throwable th) {
            parsableByteArray.setPosition(i);
            throw th;
        }
    }

    @Nullable
    private static TextInformationFrame parseIndexAndCountAttribute(int i, String str, ParsableByteArray parsableByteArray) {
        int i2 = parsableByteArray.readInt();
        if (parsableByteArray.readInt() == 1684108385 && i2 >= 22) {
            parsableByteArray.skipBytes(10);
            int unsignedShort = parsableByteArray.readUnsignedShort();
            if (unsignedShort > 0) {
                String strO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(unsignedShort, "");
                int unsignedShort2 = parsableByteArray.readUnsignedShort();
                if (unsignedShort2 > 0) {
                    strO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = strO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 + ServiceReference.DELIMITER + unsignedShort2;
                }
                return new TextInformationFrame(str, (String) null, O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of(strO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0));
            }
        }
        Log.w(TAG, "Failed to parse index/count attribute: " + Mp4Box.getBoxTypeString(i));
        return null;
    }

    @Nullable
    private static Id3Frame parseIntegerAttribute(int i, String str, ParsableByteArray parsableByteArray, boolean z, boolean z2) {
        int integerAttribute = parseIntegerAttribute(parsableByteArray);
        if (z2) {
            integerAttribute = Math.min(1, integerAttribute);
        }
        if (integerAttribute >= 0) {
            return z ? new TextInformationFrame(str, (String) null, O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of(Integer.toString(integerAttribute))) : new CommentFrame(C.LANGUAGE_UNDETERMINED, str, Integer.toString(integerAttribute));
        }
        Log.w(TAG, "Failed to parse uint8 attribute: " + Mp4Box.getBoxTypeString(i));
        return null;
    }

    @Nullable
    private static Id3Frame parseInternalAttribute(ParsableByteArray parsableByteArray, int i) {
        String nullTerminatedString = null;
        String nullTerminatedString2 = null;
        int i2 = -1;
        int i3 = -1;
        while (parsableByteArray.getPosition() < i) {
            int position = parsableByteArray.getPosition();
            int i4 = parsableByteArray.readInt();
            int i5 = parsableByteArray.readInt();
            parsableByteArray.skipBytes(4);
            if (i5 == 1835360622) {
                nullTerminatedString = parsableByteArray.readNullTerminatedString(i4 - 12);
            } else if (i5 == 1851878757) {
                nullTerminatedString2 = parsableByteArray.readNullTerminatedString(i4 - 12);
            } else {
                if (i5 == 1684108385) {
                    i2 = position;
                    i3 = i4;
                }
                parsableByteArray.skipBytes(i4 - 12);
            }
        }
        if (nullTerminatedString == null || nullTerminatedString2 == null || i2 == -1) {
            return null;
        }
        parsableByteArray.setPosition(i2);
        parsableByteArray.skipBytes(16);
        return new InternalFrame(nullTerminatedString, nullTerminatedString2, parsableByteArray.readNullTerminatedString(i3 - 16));
    }

    @Nullable
    public static MdtaMetadataEntry parseMdtaMetadataEntryFromIlst(ParsableByteArray parsableByteArray, int i, String str) {
        while (true) {
            int position = parsableByteArray.getPosition();
            if (position >= i) {
                return null;
            }
            int i2 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1684108385) {
                int i3 = parsableByteArray.readInt();
                int i4 = parsableByteArray.readInt();
                int i5 = i2 - 16;
                byte[] bArr = new byte[i5];
                parsableByteArray.readBytes(bArr, 0, i5);
                return new MdtaMetadataEntry(str, bArr, i4, i3);
            }
            parsableByteArray.setPosition(position + i2);
        }
    }

    @Nullable
    private static TextInformationFrame parseStandardGenreAttribute(ParsableByteArray parsableByteArray) {
        String strResolveV1Genre = Id3Util.resolveV1Genre(parseIntegerAttribute(parsableByteArray) - 1);
        if (strResolveV1Genre != null) {
            return new TextInformationFrame("TCON", (String) null, O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of(strResolveV1Genre));
        }
        Log.w(TAG, "Failed to parse standard genre code");
        return null;
    }

    @Nullable
    private static TextInformationFrame parseTextAttribute(int i, String str, ParsableByteArray parsableByteArray) {
        int i2 = parsableByteArray.readInt();
        if (parsableByteArray.readInt() == 1684108385) {
            parsableByteArray.skipBytes(8);
            return new TextInformationFrame(str, (String) null, O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of(parsableByteArray.readNullTerminatedString(i2 - 16)));
        }
        Log.w(TAG, "Failed to parse text attribute: " + Mp4Box.getBoxTypeString(i));
        return null;
    }

    public static void setFormatGaplessInfo(int i, GaplessInfoHolder gaplessInfoHolder, Format.Builder builder) {
        if (i == 1 && gaplessInfoHolder.hasGaplessInfo()) {
            builder.setEncoderDelay(gaplessInfoHolder.encoderDelay).setEncoderPadding(gaplessInfoHolder.encoderPadding);
        }
    }

    public static void setFormatMetadata(int i, @Nullable Metadata metadata, Format.Builder builder, @Nullable Metadata metadata2, Metadata... metadataArr) {
        if (metadata2 == null) {
            metadata2 = new Metadata(new Metadata.Entry[0]);
        }
        if (metadata != null) {
            for (int i2 = 0; i2 < metadata.length(); i2++) {
                Metadata.Entry entry = metadata.get(i2);
                if (entry instanceof MdtaMetadataEntry) {
                    MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) entry;
                    if (!mdtaMetadataEntry.key.equals(MdtaMetadataEntry.KEY_ANDROID_CAPTURE_FPS)) {
                        metadata2 = metadata2.copyWithAppendedEntries(mdtaMetadataEntry);
                    } else if (i == 2) {
                        metadata2 = metadata2.copyWithAppendedEntries(mdtaMetadataEntry);
                    }
                }
            }
        }
        for (Metadata metadata3 : metadataArr) {
            metadata2 = metadata2.copyWithAppendedEntriesFrom(metadata3);
        }
        if (metadata2.length() > 0) {
            builder.setMetadata(metadata2);
        }
    }

    private static int parseIntegerAttribute(ParsableByteArray parsableByteArray) {
        int i = parsableByteArray.readInt();
        if (parsableByteArray.readInt() == 1684108385) {
            parsableByteArray.skipBytes(8);
            int i2 = i - 16;
            if (i2 == 1) {
                return parsableByteArray.readUnsignedByte();
            }
            if (i2 == 2) {
                return parsableByteArray.readUnsignedShort();
            }
            if (i2 != 3) {
                if (i2 == 4 && (parsableByteArray.peekUnsignedByte() & 128) == 0) {
                    return parsableByteArray.readUnsignedIntToInt();
                }
            } else {
                return parsableByteArray.readUnsignedInt24();
            }
        }
        Log.w(TAG, "Failed to parse data atom to int");
        return -1;
    }
}
