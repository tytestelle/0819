package com.bumptech.glide;

import O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.ArrayMap;
import com.bumptech.glide.manager.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public static volatile O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO f2814O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;

    /* JADX INFO: renamed from: O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, reason: collision with root package name */
    public static volatile boolean f2815O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO f2816O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 f2817O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 f2818O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 f2819O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final com.bumptech.glide.manager.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO f2820O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public final com.bumptech.glide.manager.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO f2821O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public final ArrayList f2822O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = new ArrayList();

    public O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Context context, O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000, O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, com.bumptech.glide.manager.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO, com.bumptech.glide.manager.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, ArrayMap arrayMap, List list, ArrayList arrayList, O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) {
        this.f2816O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        this.f2819O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        this.f2817O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        this.f2820O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
        this.f2821O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        this.f2818O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(context, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, new O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(this, arrayList, o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo), new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(17), o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, arrayMap, list, o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000, o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo);
    }

    public static O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (f2814O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo == null) {
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
                generatedAppGlideModule = null;
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e);
            } catch (InstantiationException e2) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e2);
            } catch (NoSuchMethodException e3) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e3);
            } catch (InvocationTargetException e4) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e4);
            }
            synchronized (O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.class) {
                if (f2814O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo == null) {
                    if (f2815O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    f2815O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = true;
                    try {
                        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(context, generatedAppGlideModule);
                        f2815O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = false;
                    } catch (Throwable th) {
                        f2815O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = false;
                        throw th;
                    }
                }
            }
        }
        return f2814O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
    }

    public static void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        ArrayMap arrayMap = new ArrayMap();
        O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = new O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(0);
        O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(28);
        Context applicationContext = context.getApplicationContext();
        Collections.emptyList();
        if (Log.isLoggable("ManifestParser", 3)) {
            Log.d("ManifestParser", "Loading Glide modules");
        }
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
            if (applicationInfo != null && applicationInfo.metaData != null) {
                if (Log.isLoggable("ManifestParser", 2)) {
                    Log.v("ManifestParser", "Got app info metadata: " + applicationInfo.metaData);
                }
                for (String str : applicationInfo.metaData.keySet()) {
                    if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(str);
                        throw null;
                    }
                }
                if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Finished loading Glide modules");
                }
            } else if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Got null app info metadata");
            }
        } catch (PackageManager.NameNotFoundException e) {
            if (Log.isLoggable("ManifestParser", 6)) {
                Log.e("ManifestParser", "Failed to parse glide modules", e);
            }
        }
        if (generatedAppGlideModule != null && !new HashSet().isEmpty()) {
            new HashSet();
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                throw new ClassCastException();
            }
        }
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            it3.next().getClass();
            throw new ClassCastException();
        }
        O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
        if (O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f468O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == 0) {
            O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f468O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i = O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f468O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (TextUtils.isEmpty("source")) {
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = new O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(new ThreadPoolExecutor(i, i, 0L, timeUnit, new PriorityBlockingQueue(), new O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, "source", false)));
        O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2 = new O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
        if (TextUtils.isEmpty("disk-cache")) {
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
        }
        O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1 = new O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(new ThreadPoolExecutor(1, 1, 0L, timeUnit, new PriorityBlockingQueue(), new O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2, "disk-cache", true)));
        if (O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f468O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == 0) {
            O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f468O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i2 = O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f468O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o >= 4 ? 2 : 1;
        O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO3 = new O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
        if (TextUtils.isEmpty("animation")) {
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
        }
        O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo2 = new O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(new ThreadPoolExecutor(i2, i2, 0L, timeUnit, new PriorityBlockingQueue(), new O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO3, "animation", true)));
        O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = new O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(new O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(applicationContext));
        com.bumptech.glide.manager.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new com.bumptech.glide.manager.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        int i3 = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f454O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = i3 > 0 ? new O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(i3) : new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(5);
        O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001 = new O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f456O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
        O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo3 = new O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f455O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO4 = new O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(applicationContext, new O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo3, new O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(applicationContext), o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1, o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, new O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(new ThreadPoolExecutor(0, Integer.MAX_VALUE, O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f467O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, timeUnit, new SynchronousQueue(), new O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(new O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(), "source-unlimited", false))), o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo2), o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo3, o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001, new com.bumptech.glide.manager.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(), o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, arrayMap, Collections.emptyList(), arrayList, generatedAppGlideModule, new O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO));
        applicationContext.registerComponentCallbacks(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO4);
        f2814O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO4;
    }

    public static O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(Context context) {
        O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(context).f2820O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(context);
    }

    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O00000OOoOOO00O00o0ooooooooO000ooooO0000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        this.f2817O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(0L);
        this.f2816O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo();
        this.f2819O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
    }

    public final void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o) {
        synchronized (this.f2822O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
            try {
                if (!this.f2822O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.contains(o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o)) {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
                this.f2822O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.remove(o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O00000OOoOOO00O00o0ooooooooO000ooooO0000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        synchronized (this.f2822O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
            try {
                Iterator it = this.f2822O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.iterator();
                while (it.hasNext()) {
                    ((O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o) it.next()).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f2817O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(i);
        this.f2816O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.trimMemory(i);
        this.f2819O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(i);
    }
}
