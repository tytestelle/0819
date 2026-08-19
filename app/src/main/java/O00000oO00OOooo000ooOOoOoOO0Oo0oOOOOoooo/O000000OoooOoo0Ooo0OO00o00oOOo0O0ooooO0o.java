package O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo;

import O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
import O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
import O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
import O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o implements O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 {

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public static final O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O f647O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme", null, O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f191O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final Context f648O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(Context context) {
        this.f648O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = context.getApplicationContext();
    }

    @Override // O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0
    public final boolean O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Object obj, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO) {
        String scheme = ((Uri) obj).getScheme();
        return scheme != null && scheme.equals("android.resource");
    }

    @Override // O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0
    public final /* bridge */ /* synthetic */ O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Object obj, int i, int i2, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO) {
        return O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o((Uri) obj, o000000oooOoo00ooo0O0000000o00O0Oooo0OOO);
    }

    public final O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(Uri uri, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO) {
        Context contextCreatePackageContext;
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new IllegalStateException("Package name for " + uri + " is null or empty");
        }
        Context context = this.f648O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (authority.equals(context.getPackageName())) {
            contextCreatePackageContext = context;
        } else {
            try {
                contextCreatePackageContext = context.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e) {
                if (!authority.contains(context.getPackageName())) {
                    throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e);
                }
                contextCreatePackageContext = context;
            }
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri.getPathSegments();
            String authority2 = uri.getAuthority();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            identifier = contextCreatePackageContext.getResources().getIdentifier(str2, str, authority2);
            if (identifier == 0) {
                identifier = Resources.getSystem().getIdentifier(str2, str, "android");
            }
            if (identifier == 0) {
                throw new IllegalArgumentException("Failed to find resource id for: " + uri);
            }
        } else {
            if (pathSegments.size() != 1) {
                throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
            }
            try {
                identifier = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e2) {
                throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e2);
            }
        }
        Resources.Theme theme = authority.equals(context.getPackageName()) ? (Resources.Theme) o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(f647O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) : null;
        Drawable drawableO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = theme == null ? com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(context, contextCreatePackageContext, identifier, null) : com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(context, context, identifier, theme);
        if (drawableO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 != null) {
            return new O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(drawableO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, 0);
        }
        return null;
    }
}
