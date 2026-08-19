package androidx.media3.ui;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class WebViewSubtitleOutput extends FrameLayout implements SubtitleView.Output {
    private static final float CSS_LINE_HEIGHT = 1.2f;
    private static final String DEFAULT_BACKGROUND_CSS_CLASS = "default_bg";
    private float bottomPaddingFraction;
    private final CanvasSubtitleOutput canvasSubtitleOutput;
    private float defaultTextSize;
    private int defaultTextSizeType;
    private CaptionStyleCompat style;
    private List<Cue> textCues;
    private final WebView webView;

    /* JADX INFO: renamed from: androidx.media3.ui.WebViewSubtitleOutput$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$android$text$Layout$Alignment;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            $SwitchMap$android$text$Layout$Alignment = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$text$Layout$Alignment[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$text$Layout$Alignment[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public WebViewSubtitleOutput(Context context) {
        this(context, null);
    }

    private static int anchorTypeToTranslatePercent(int i) {
        if (i != 1) {
            return i != 2 ? 0 : -100;
        }
        return -50;
    }

    private static String convertAlignmentToCss(@Nullable Layout.Alignment alignment) {
        if (alignment == null) {
            return TtmlNode.CENTER;
        }
        int i = AnonymousClass2.$SwitchMap$android$text$Layout$Alignment[alignment.ordinal()];
        if (i != 1) {
            return i != 2 ? TtmlNode.CENTER : TtmlNode.END;
        }
        return TtmlNode.START;
    }

    private static String convertCaptionStyleToCssTextShadow(CaptionStyleCompat captionStyleCompat) {
        int i = captionStyleCompat.edgeType;
        if (i == 1) {
            return Util.formatInvariant("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", HtmlUtils.toCssRgba(captionStyleCompat.edgeColor));
        }
        if (i == 2) {
            return Util.formatInvariant("0.1em 0.12em 0.15em %s", HtmlUtils.toCssRgba(captionStyleCompat.edgeColor));
        }
        if (i != 3) {
            return i != 4 ? "unset" : Util.formatInvariant("-0.05em -0.05em 0.15em %s", HtmlUtils.toCssRgba(captionStyleCompat.edgeColor));
        }
        return Util.formatInvariant("0.06em 0.08em 0.15em %s", HtmlUtils.toCssRgba(captionStyleCompat.edgeColor));
    }

    private String convertTextSizeToCss(int i, float f) {
        float fResolveTextSize = SubtitleViewUtils.resolveTextSize(i, f, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        return fResolveTextSize == -3.4028235E38f ? "unset" : Util.formatInvariant("%.2fpx", Float.valueOf(fResolveTextSize / getContext().getResources().getDisplayMetrics().density));
    }

    private static String convertVerticalTypeToCss(int i) {
        if (i != 1) {
            return i != 2 ? "horizontal-tb" : "vertical-lr";
        }
        return "vertical-rl";
    }

    private static String getBlockShearTransformFunction(Cue cue) {
        float f = cue.shearDegrees;
        if (f == 0.0f) {
            return "";
        }
        int i = cue.verticalType;
        return Util.formatInvariant("%s(%.2fdeg)", (i == 2 || i == 1) ? "skewY" : "skewX", Float.valueOf(f));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:26:0x010b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0125  */
    /* JADX WARN: Code duplicated, block: B:30:0x0128  */
    /* JADX WARN: Code duplicated, block: B:33:0x013f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0142 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0144  */
    /* JADX WARN: Code duplicated, block: B:39:0x014c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x014f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0152 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0161  */
    /* JADX WARN: Code duplicated, block: B:53:0x0189  */
    /* JADX WARN: Code duplicated, block: B:59:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:63:0x0225  */
    /* JADX WARN: Code duplicated, block: B:64:0x0243  */
    private void updateWebView() {
        String invariant;
        int iAnchorTypeToTranslatePercent;
        boolean z;
        float f;
        String invariant2;
        int i;
        int i2;
        int i3;
        String str;
        String str2;
        String str3;
        int i4;
        SpannedToHtmlConverter.HtmlAndCss htmlAndCssConvert;
        Iterator it;
        SpannedToHtmlConverter.HtmlAndCss htmlAndCss;
        Layout.Alignment alignment;
        String str4;
        boolean z2;
        WebViewSubtitleOutput webViewSubtitleOutput = this;
        StringBuilder sb = new StringBuilder();
        String cssRgba = HtmlUtils.toCssRgba(webViewSubtitleOutput.style.foregroundColor);
        String strConvertTextSizeToCss = webViewSubtitleOutput.convertTextSizeToCss(webViewSubtitleOutput.defaultTextSizeType, webViewSubtitleOutput.defaultTextSize);
        float f2 = CSS_LINE_HEIGHT;
        char c = 0;
        int i5 = 1;
        sb.append(Util.formatInvariant("<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>", cssRgba, strConvertTextSizeToCss, Float.valueOf(CSS_LINE_HEIGHT), convertCaptionStyleToCssTextShadow(webViewSubtitleOutput.style)));
        HashMap map = new HashMap();
        map.put(HtmlUtils.cssAllClassDescendantsSelector(DEFAULT_BACKGROUND_CSS_CLASS), Util.formatInvariant("background-color:%s;", HtmlUtils.toCssRgba(webViewSubtitleOutput.style.backgroundColor)));
        int i6 = 0;
        while (i6 < webViewSubtitleOutput.textCues.size()) {
            Cue cue = webViewSubtitleOutput.textCues.get(i6);
            float f3 = cue.position;
            float f4 = f3 != -3.4028235E38f ? f3 * 100.0f : 50.0f;
            int iAnchorTypeToTranslatePercent2 = anchorTypeToTranslatePercent(cue.positionAnchor);
            float f5 = cue.line;
            if (f5 == -3.4028235E38f) {
                Object[] objArr = new Object[i5];
                objArr[c] = Float.valueOf((1.0f - webViewSubtitleOutput.bottomPaddingFraction) * 100.0f);
                invariant = Util.formatInvariant("%.2f%%", objArr);
                iAnchorTypeToTranslatePercent = -100;
            } else if (cue.lineType != i5) {
                Float fValueOf = Float.valueOf(f5 * 100.0f);
                Object[] objArr2 = new Object[i5];
                objArr2[c] = fValueOf;
                invariant = Util.formatInvariant("%.2f%%", objArr2);
                iAnchorTypeToTranslatePercent = cue.verticalType == i5 ? -anchorTypeToTranslatePercent(cue.lineAnchor) : anchorTypeToTranslatePercent(cue.lineAnchor);
            } else {
                if (f5 >= 0.0f) {
                    Float fValueOf2 = Float.valueOf(f5 * f2);
                    Object[] objArr3 = new Object[i5];
                    objArr3[c] = fValueOf2;
                    invariant = Util.formatInvariant("%.2fem", objArr3);
                    iAnchorTypeToTranslatePercent = 0;
                } else {
                    Float fValueOf3 = Float.valueOf(((-f5) - 1.0f) * f2);
                    Object[] objArr4 = new Object[i5];
                    objArr4[c] = fValueOf3;
                    invariant = Util.formatInvariant("%.2fem", objArr4);
                    iAnchorTypeToTranslatePercent = 0;
                    z = true;
                }
                f = cue.size;
                if (f != -3.4028235E38f) {
                    Object[] objArr5 = new Object[i5];
                    objArr5[c] = Float.valueOf(f * 100.0f);
                    invariant2 = Util.formatInvariant("%.2f%%", objArr5);
                } else {
                    invariant2 = "fit-content";
                }
                String strConvertAlignmentToCss = convertAlignmentToCss(cue.textAlignment);
                String strConvertVerticalTypeToCss = convertVerticalTypeToCss(cue.verticalType);
                String strConvertTextSizeToCss2 = webViewSubtitleOutput.convertTextSizeToCss(cue.textSizeType, cue.textSize);
                if (cue.windowColorSet) {
                    i = cue.windowColor;
                } else {
                    i = webViewSubtitleOutput.style.windowColor;
                }
                String cssRgba2 = HtmlUtils.toCssRgba(i);
                i2 = iAnchorTypeToTranslatePercent;
                i3 = cue.verticalType;
                str = TtmlNode.RIGHT;
                str2 = "top";
                if (i3 != 1) {
                    if (i3 != 2) {
                        str = z ? "bottom" : "top";
                        str2 = TtmlNode.LEFT;
                    } else if (!z) {
                        str = TtmlNode.LEFT;
                    }
                } else if (z) {
                    str = TtmlNode.LEFT;
                }
                if (i3 != 2 || i3 == 1) {
                    str3 = "height";
                    i4 = i2;
                    i2 = iAnchorTypeToTranslatePercent2;
                } else {
                    str3 = "width";
                    i4 = iAnchorTypeToTranslatePercent2;
                }
                htmlAndCssConvert = SpannedToHtmlConverter.convert(cue.text, getContext().getResources().getDisplayMetrics().density);
                it = map.keySet().iterator();
                while (it.hasNext()) {
                    Iterator it2 = it;
                    String str5 = (String) it.next();
                    SpannedToHtmlConverter.HtmlAndCss htmlAndCss2 = htmlAndCssConvert;
                    str4 = (String) map.put(str5, (String) map.get(str5));
                    if (str4 != null || str4.equals(map.get(str5))) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    Assertions.checkState(z2);
                    it = it2;
                    htmlAndCssConvert = htmlAndCss2;
                }
                htmlAndCss = htmlAndCssConvert;
                HashMap map2 = map;
                sb.append(Util.formatInvariant("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", Integer.valueOf(i6), str2, Float.valueOf(f4), str, invariant, str3, invariant2, strConvertAlignmentToCss, strConvertVerticalTypeToCss, strConvertTextSizeToCss2, cssRgba2, Integer.valueOf(i4), Integer.valueOf(i2), getBlockShearTransformFunction(cue)));
                sb.append(Util.formatInvariant("<span class='%s'>", DEFAULT_BACKGROUND_CSS_CLASS));
                alignment = cue.multiRowAlignment;
                if (alignment != null) {
                    sb.append(Util.formatInvariant("<span style='display:inline-block; text-align:%s;'>", convertAlignmentToCss(alignment)));
                    sb.append(htmlAndCss.html);
                    sb.append("</span>");
                } else {
                    sb.append(htmlAndCss.html);
                }
                sb.append("</span></div>");
                i5 = 1;
                i6++;
                f2 = CSS_LINE_HEIGHT;
                c = 0;
                webViewSubtitleOutput = this;
                map = map2;
            }
            z = false;
            f = cue.size;
            if (f != -3.4028235E38f) {
                Object[] objArr6 = new Object[i5];
                objArr6[c] = Float.valueOf(f * 100.0f);
                invariant2 = Util.formatInvariant("%.2f%%", objArr6);
            } else {
                invariant2 = "fit-content";
            }
            String strConvertAlignmentToCss2 = convertAlignmentToCss(cue.textAlignment);
            String strConvertVerticalTypeToCss2 = convertVerticalTypeToCss(cue.verticalType);
            String strConvertTextSizeToCss3 = webViewSubtitleOutput.convertTextSizeToCss(cue.textSizeType, cue.textSize);
            if (cue.windowColorSet) {
                i = cue.windowColor;
            } else {
                i = webViewSubtitleOutput.style.windowColor;
            }
            String cssRgba3 = HtmlUtils.toCssRgba(i);
            i2 = iAnchorTypeToTranslatePercent;
            i3 = cue.verticalType;
            str = TtmlNode.RIGHT;
            str2 = "top";
            if (i3 != 1) {
                if (i3 != 2) {
                    str = z ? "bottom" : "top";
                    str2 = TtmlNode.LEFT;
                } else if (!z) {
                    str = TtmlNode.LEFT;
                }
            } else if (z) {
                str = TtmlNode.LEFT;
            }
            if (i3 != 2) {
                str3 = "height";
                i4 = i2;
                i2 = iAnchorTypeToTranslatePercent2;
            } else {
                str3 = "height";
                i4 = i2;
                i2 = iAnchorTypeToTranslatePercent2;
            }
            htmlAndCssConvert = SpannedToHtmlConverter.convert(cue.text, getContext().getResources().getDisplayMetrics().density);
            it = map.keySet().iterator();
            while (it.hasNext()) {
                Iterator it3 = it;
                String str6 = (String) it.next();
                SpannedToHtmlConverter.HtmlAndCss htmlAndCss3 = htmlAndCssConvert;
                str4 = (String) map.put(str6, (String) map.get(str6));
                if (str4 != null) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                Assertions.checkState(z2);
                it = it3;
                htmlAndCssConvert = htmlAndCss3;
            }
            htmlAndCss = htmlAndCssConvert;
            HashMap map3 = map;
            sb.append(Util.formatInvariant("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", Integer.valueOf(i6), str2, Float.valueOf(f4), str, invariant, str3, invariant2, strConvertAlignmentToCss2, strConvertVerticalTypeToCss2, strConvertTextSizeToCss3, cssRgba3, Integer.valueOf(i4), Integer.valueOf(i2), getBlockShearTransformFunction(cue)));
            sb.append(Util.formatInvariant("<span class='%s'>", DEFAULT_BACKGROUND_CSS_CLASS));
            alignment = cue.multiRowAlignment;
            if (alignment != null) {
                sb.append(Util.formatInvariant("<span style='display:inline-block; text-align:%s;'>", convertAlignmentToCss(alignment)));
                sb.append(htmlAndCss.html);
                sb.append("</span>");
            } else {
                sb.append(htmlAndCss.html);
            }
            sb.append("</span></div>");
            i5 = 1;
            i6++;
            f2 = CSS_LINE_HEIGHT;
            c = 0;
            webViewSubtitleOutput = this;
            map = map3;
        }
        HashMap map4 = map;
        sb.append("</div></body></html>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("<html><head><style>");
        for (String str7 : map4.keySet()) {
            sb2.append(str7);
            sb2.append("{");
            sb2.append((String) map4.get(str7));
            sb2.append("}");
        }
        sb2.append("</style></head>");
        sb.insert(0, (CharSequence) sb2);
        this.webView.loadData(Base64.encodeToString(sb.toString().getBytes(StandardCharsets.UTF_8), 1), "text/html", "base64");
    }

    public void destroy() {
        this.webView.destroy();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!z || this.textCues.isEmpty()) {
            return;
        }
        updateWebView();
    }

    @Override // androidx.media3.ui.SubtitleView.Output
    public void update(List<Cue> list, CaptionStyleCompat captionStyleCompat, float f, int i, float f2) {
        this.style = captionStyleCompat;
        this.defaultTextSize = f;
        this.defaultTextSizeType = i;
        this.bottomPaddingFraction = f2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            Cue cue = list.get(i2);
            if (cue.bitmap != null) {
                arrayList.add(cue);
            } else {
                arrayList2.add(cue);
            }
        }
        if (!this.textCues.isEmpty() || !arrayList2.isEmpty()) {
            this.textCues = arrayList2;
            updateWebView();
        }
        this.canvasSubtitleOutput.update(arrayList, captionStyleCompat, f, i, f2);
        invalidate();
    }

    public WebViewSubtitleOutput(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.textCues = Collections.emptyList();
        this.style = CaptionStyleCompat.DEFAULT;
        this.defaultTextSize = 0.0533f;
        this.defaultTextSizeType = 0;
        this.bottomPaddingFraction = 0.08f;
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context, attributeSet);
        this.canvasSubtitleOutput = canvasSubtitleOutput;
        WebView webView = new WebView(context, attributeSet) { // from class: androidx.media3.ui.WebViewSubtitleOutput.1
            @Override // android.webkit.WebView, android.view.View
            public boolean onTouchEvent(MotionEvent motionEvent) {
                super.onTouchEvent(motionEvent);
                return false;
            }

            @Override // android.view.View
            public boolean performClick() {
                super.performClick();
                return false;
            }
        };
        this.webView = webView;
        webView.setBackgroundColor(0);
        addView(canvasSubtitleOutput);
        addView(webView);
    }
}
