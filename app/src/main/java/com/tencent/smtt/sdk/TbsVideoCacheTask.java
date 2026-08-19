package com.tencent.smtt.sdk;

import android.content.Context;
import android.os.Bundle;
import com.tencent.smtt.export.external.DexLoader;

/* JADX INFO: loaded from: classes2.dex */
public class TbsVideoCacheTask {
    public static final String KEY_VIDEO_CACHE_PARAM_FILENAME = "filename";
    public static final String KEY_VIDEO_CACHE_PARAM_FOLDERPATH = "folderPath";
    public static final String KEY_VIDEO_CACHE_PARAM_HEADER = "header";
    public static final String KEY_VIDEO_CACHE_PARAM_URL = "url";
    Context a;
    TbsVideoCacheListener b;
    private String e;
    private String f;
    private boolean c = false;
    private o d = null;
    private Object g = null;

    public TbsVideoCacheTask(Context context, Bundle bundle, TbsVideoCacheListener tbsVideoCacheListener) {
        this.a = context;
        this.b = tbsVideoCacheListener;
        if (bundle != null) {
            this.e = bundle.getString("taskId");
            this.f = bundle.getString("url");
        }
        a(bundle);
    }

    private void a(Bundle bundle) {
        TbsVideoCacheListener tbsVideoCacheListener;
        String str;
        DexLoader dexLoaderC;
        if (this.d == null) {
            f.a(true).a(this.a, false, false);
            s sVarA = f.a(true).a();
            if (sVarA != null) {
                dexLoaderC = sVarA.c();
            } else {
                this.b.onVideoDownloadError(this, -1, "init engine error!", null);
                dexLoaderC = null;
            }
            if (dexLoaderC != null) {
                this.d = new o(dexLoaderC);
            } else {
                this.b.onVideoDownloadError(this, -1, "Java dexloader invalid!", null);
            }
        }
        o oVar = this.d;
        if (oVar != null) {
            Object objA = oVar.a(this.a, this, bundle);
            this.g = objA;
            if (objA != null) {
                return;
            }
            tbsVideoCacheListener = this.b;
            str = "init task error!";
        } else {
            tbsVideoCacheListener = this.b;
            if (tbsVideoCacheListener == null) {
                return;
            } else {
                str = "init error!";
            }
        }
        tbsVideoCacheListener.onVideoDownloadError(this, -1, str, null);
    }

    public long getContentLength() {
        o oVar = this.d;
        if (oVar != null && this.g != null) {
            return oVar.d();
        }
        TbsVideoCacheListener tbsVideoCacheListener = this.b;
        if (tbsVideoCacheListener == null) {
            return 0L;
        }
        tbsVideoCacheListener.onVideoDownloadError(this, -1, "getContentLength failed, init uncompleted!", null);
        return 0L;
    }

    public int getDownloadedSize() {
        o oVar = this.d;
        if (oVar != null && this.g != null) {
            return oVar.e();
        }
        TbsVideoCacheListener tbsVideoCacheListener = this.b;
        if (tbsVideoCacheListener == null) {
            return 0;
        }
        tbsVideoCacheListener.onVideoDownloadError(this, -1, "getDownloadedSize failed, init uncompleted!", null);
        return 0;
    }

    public int getProgress() {
        o oVar = this.d;
        if (oVar != null && this.g != null) {
            return oVar.f();
        }
        TbsVideoCacheListener tbsVideoCacheListener = this.b;
        if (tbsVideoCacheListener == null) {
            return 0;
        }
        tbsVideoCacheListener.onVideoDownloadError(this, -1, "getProgress failed, init uncompleted!", null);
        return 0;
    }

    public String getTaskID() {
        return this.e;
    }

    public String getTaskUrl() {
        return this.f;
    }

    public void pauseTask() {
        o oVar = this.d;
        if (oVar != null && this.g != null) {
            oVar.a();
            return;
        }
        TbsVideoCacheListener tbsVideoCacheListener = this.b;
        if (tbsVideoCacheListener != null) {
            tbsVideoCacheListener.onVideoDownloadError(this, -1, "pauseTask failed, init uncompleted!", null);
        }
    }

    public void removeTask(boolean z) {
        o oVar = this.d;
        if (oVar != null && this.g != null) {
            oVar.a(z);
            return;
        }
        TbsVideoCacheListener tbsVideoCacheListener = this.b;
        if (tbsVideoCacheListener != null) {
            tbsVideoCacheListener.onVideoDownloadError(this, -1, "removeTask failed, init uncompleted!", null);
        }
    }

    public void resumeTask() {
        o oVar = this.d;
        if (oVar != null && this.g != null) {
            oVar.b();
            return;
        }
        TbsVideoCacheListener tbsVideoCacheListener = this.b;
        if (tbsVideoCacheListener != null) {
            tbsVideoCacheListener.onVideoDownloadError(this, -1, "resumeTask failed, init uncompleted!", null);
        }
    }

    public void stopTask() {
        o oVar = this.d;
        if (oVar != null && this.g != null) {
            oVar.c();
            return;
        }
        TbsVideoCacheListener tbsVideoCacheListener = this.b;
        if (tbsVideoCacheListener != null) {
            tbsVideoCacheListener.onVideoDownloadError(this, -1, "stopTask failed, init uncompleted!", null);
        }
    }
}
