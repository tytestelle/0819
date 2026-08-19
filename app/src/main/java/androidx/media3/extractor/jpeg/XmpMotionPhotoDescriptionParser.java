package androidx.media3.extractor.jpeg;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.XmlPullParserUtil;
import com.google.common.collect.O0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO;
import com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes.dex */
final class XmpMotionPhotoDescriptionParser {
    private static final String TAG = "MotionPhotoXmpParser";
    private static final String[] MOTION_PHOTO_ATTRIBUTE_NAMES = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] DESCRIPTION_MOTION_PHOTO_PRESENTATION_TIMESTAMP_ATTRIBUTE_NAMES = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] DESCRIPTION_MICRO_VIDEO_OFFSET_ATTRIBUTE_NAMES = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    private XmpMotionPhotoDescriptionParser() {
    }

    @Nullable
    public static MotionPhotoDescription parse(String str) {
        try {
            return parseInternal(str);
        } catch (ParserException | NumberFormatException | XmlPullParserException unused) {
            Log.w(TAG, "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    @Nullable
    private static MotionPhotoDescription parseInternal(String str) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!XmlPullParserUtil.isStartTag(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw ParserException.createForMalformedContainer("Couldn't find xmp metadata", null);
        }
        O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OOf = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of();
        long motionPhotoPresentationTimestampUsFromDescription = C.TIME_UNSET;
        do {
            xmlPullParserNewPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParserNewPullParser, "rdf:Description")) {
                if (!parseMotionPhotoFlagFromDescription(xmlPullParserNewPullParser)) {
                    return null;
                }
                motionPhotoPresentationTimestampUsFromDescription = parseMotionPhotoPresentationTimestampUsFromDescription(xmlPullParserNewPullParser);
                o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OOf = parseMicroVideoOffsetFromDescription(xmlPullParserNewPullParser);
            } else if (XmlPullParserUtil.isStartTag(xmlPullParserNewPullParser, "Container:Directory")) {
                o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OOf = parseMotionPhotoV1Directory(xmlPullParserNewPullParser, "Container", "Item");
            } else if (XmlPullParserUtil.isStartTag(xmlPullParserNewPullParser, "GContainer:Directory")) {
                o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OOf = parseMotionPhotoV1Directory(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OOf.isEmpty()) {
            return null;
        }
        return new MotionPhotoDescription(motionPhotoPresentationTimestampUsFromDescription, o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OOf);
    }

    private static O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O parseMicroVideoOffsetFromDescription(XmlPullParser xmlPullParser) {
        for (String str : DESCRIPTION_MICRO_VIDEO_OFFSET_ATTRIBUTE_NAMES) {
            String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, str);
            if (attributeValue != null) {
                return O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of(new MotionPhotoDescription.ContainerItem("image/jpeg", "Primary", 0L, 0L), new MotionPhotoDescription.ContainerItem("video/mp4", "MotionPhoto", Long.parseLong(attributeValue), 0L));
            }
        }
        return O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of();
    }

    private static boolean parseMotionPhotoFlagFromDescription(XmlPullParser xmlPullParser) {
        for (String str : MOTION_PHOTO_ATTRIBUTE_NAMES) {
            String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, str);
            if (attributeValue != null) {
                return Integer.parseInt(attributeValue) == 1;
            }
        }
        return false;
    }

    private static long parseMotionPhotoPresentationTimestampUsFromDescription(XmlPullParser xmlPullParser) {
        for (String str : DESCRIPTION_MOTION_PHOTO_PRESENTATION_TIMESTAMP_ATTRIBUTE_NAMES) {
            String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, str);
            if (attributeValue != null) {
                long j = Long.parseLong(attributeValue);
                return j == -1 ? C.TIME_UNSET : j;
            }
        }
        return C.TIME_UNSET;
    }

    private static O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O parseMotionPhotoV1Directory(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        O0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oOBuilder = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.builder();
        String strO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(str, ":Item");
        String strO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(str, ":Directory");
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, strO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO)) {
                String strO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO3 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(str2, ":Mime");
                String strO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO4 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(str2, ":Semantic");
                String strO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO5 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(str2, ":Length");
                String strO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO6 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(str2, ":Padding");
                String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, strO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO3);
                String attributeValue2 = XmlPullParserUtil.getAttributeValue(xmlPullParser, strO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO4);
                String attributeValue3 = XmlPullParserUtil.getAttributeValue(xmlPullParser, strO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO5);
                String attributeValue4 = XmlPullParserUtil.getAttributeValue(xmlPullParser, strO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO6);
                if (attributeValue == null || attributeValue2 == null) {
                    return O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of();
                }
                o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oOBuilder.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(new MotionPhotoDescription.ContainerItem(attributeValue, attributeValue2, attributeValue3 != null ? Long.parseLong(attributeValue3) : 0L, attributeValue4 != null ? Long.parseLong(attributeValue4) : 0L));
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, strO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2));
        return o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oOBuilder.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
    }
}
