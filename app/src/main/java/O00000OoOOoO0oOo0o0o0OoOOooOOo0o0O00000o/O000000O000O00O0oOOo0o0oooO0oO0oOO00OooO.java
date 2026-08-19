package O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO implements O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f470O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 1;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final Object f471O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final Object f472O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(AssetManager assetManager, O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
        this.f472O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = assetManager;
        this.f471O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    @Override // O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0
    public final boolean O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Object obj) {
        switch (this.f470O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                Uri uri = (Uri) obj;
                return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
            case 1:
                return true;
            case 2:
                return true;
            default:
                Uri uri2 = (Uri) obj;
                return "android.resource".equals(uri2.getScheme()) && ((Context) this.f472O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).getPackageName().equals(uri2.getAuthority());
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, java.lang.Object] */
    @Override // O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0
    public final O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Object obj, int i, int i2, O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO) {
        Uri uri;
        switch (this.f470O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                Uri uri2 = (Uri) obj;
                return new O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(new O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(uri2), this.f471O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO((AssetManager) this.f472O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, uri2.toString().substring(22)));
            case 1:
                Integer num = (Integer) obj;
                Resources.Theme theme = (Resources.Theme) o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f647O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                return new O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(new O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(num), new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(theme, theme != null ? theme.getResources() : ((Context) this.f472O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).getResources(), this.f471O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, num.intValue()));
            case 2:
                Integer num2 = (Integer) obj;
                Resources resources = (Resources) this.f471O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                try {
                    uri = Uri.parse("android.resource://" + resources.getResourcePackageName(num2.intValue()) + '/' + resources.getResourceTypeName(num2.intValue()) + '/' + resources.getResourceEntryName(num2.intValue()));
                    break;
                } catch (Resources.NotFoundException e) {
                    if (Log.isLoggable("ResourceLoader", 5)) {
                        Log.w("ResourceLoader", "Received invalid resource id: " + num2, e);
                    }
                    uri = null;
                }
                if (uri == null) {
                    return null;
                }
                return ((O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0) this.f472O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(uri, i, i2, o000000oooOoo00ooo0O0000000o00O0Oooo0OOO);
            default:
                Uri uri3 = (Uri) obj;
                List<String> pathSegments = uri3.getPathSegments();
                int size = pathSegments.size();
                O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = (O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0) this.f471O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = null;
                if (size == 1) {
                    try {
                        int i3 = Integer.parseInt(uri3.getPathSegments().get(0));
                        if (i3 != 0) {
                            o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Integer.valueOf(i3), i, i2, o000000oooOoo00ooo0O0000000o00O0Oooo0OOO);
                        } else if (Log.isLoggable("ResourceUriLoader", 5)) {
                            Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri3);
                        }
                        return o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    } catch (NumberFormatException e2) {
                        if (!Log.isLoggable("ResourceUriLoader", 5)) {
                            return o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        }
                        Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri3, e2);
                        return o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    }
                }
                if (pathSegments.size() != 2) {
                    if (!Log.isLoggable("ResourceUriLoader", 5)) {
                        return null;
                    }
                    Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri3);
                    return null;
                }
                List<String> pathSegments2 = uri3.getPathSegments();
                String str = pathSegments2.get(0);
                String str2 = pathSegments2.get(1);
                Context context = (Context) this.f472O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                int identifier = context.getResources().getIdentifier(str2, str, context.getPackageName());
                if (identifier != 0) {
                    return o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Integer.valueOf(identifier), i, i2, o000000oooOoo00ooo0O0000000o00O0Oooo0OOO);
                }
                if (!Log.isLoggable("ResourceUriLoader", 5)) {
                    return null;
                }
                Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri3);
                return null;
        }
    }

    public O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Resources resources, O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0) {
        this.f471O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = resources;
        this.f472O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
    }

    public O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Context context, O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) {
        this.f472O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = context.getApplicationContext();
        this.f471O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
    }

    public O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Context context, O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0) {
        this.f472O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = context.getApplicationContext();
        this.f471O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
    }
}
