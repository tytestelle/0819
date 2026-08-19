package androidx.media3.datasource;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.BitmapLoader;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;
import com.google.common.util.concurrent.O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000;
import com.google.common.util.concurrent.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o;
import com.google.common.util.concurrent.O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0;
import com.google.common.util.concurrent.O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class DataSourceBitmapLoader implements BitmapLoader {
    public static final O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O DEFAULT_EXECUTOR_SERVICE = O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo());
    private final DataSource.Factory dataSourceFactory;
    private final O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o listeningExecutorService;
    private final int maximumOutputDimension;

    @Nullable
    private final BitmapFactory.Options options;

    public DataSourceBitmapLoader(Context context) {
        this((O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o) Assertions.checkStateNotNull((O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o) DEFAULT_EXECUTOR_SERVICE.get()), new DefaultDataSource.Factory(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bitmap lambda$decodeBitmap$1(byte[] bArr) {
        return BitmapUtil.decode(bArr, bArr.length, this.options, this.maximumOutputDimension);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bitmap lambda$loadBitmap$2(Uri uri) {
        return load(this.dataSourceFactory.createDataSource(), uri, this.options, this.maximumOutputDimension);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o lambda$static$0() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        if (executorServiceNewSingleThreadExecutor instanceof O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o) {
            return (O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o) executorServiceNewSingleThreadExecutor;
        }
        return executorServiceNewSingleThreadExecutor instanceof ScheduledExecutorService ? new O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o((ScheduledExecutorService) executorServiceNewSingleThreadExecutor) : new O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0(executorServiceNewSingleThreadExecutor);
    }

    private static Bitmap load(DataSource dataSource, Uri uri, @Nullable BitmapFactory.Options options, int i) {
        try {
            dataSource.open(new DataSpec(uri));
            byte[] toEnd = DataSourceUtil.readToEnd(dataSource);
            return BitmapUtil.decode(toEnd, toEnd.length, options, i);
        } finally {
            dataSource.close();
        }
    }

    @Override // androidx.media3.common.util.BitmapLoader
    public O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 decodeBitmap(byte[] bArr) {
        return ((O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0) this.listeningExecutorService).O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(this, bArr, 0));
    }

    @Override // androidx.media3.common.util.BitmapLoader
    public O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 loadBitmap(Uri uri) {
        return ((O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0) this.listeningExecutorService).O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(this, uri, 1));
    }

    @Override // androidx.media3.common.util.BitmapLoader
    public final /* synthetic */ O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 loadBitmapFromMetadata(MediaMetadata mediaMetadata) {
        return androidx.media3.common.util.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, mediaMetadata);
    }

    @Override // androidx.media3.common.util.BitmapLoader
    public boolean supportsMimeType(String str) {
        return Util.isBitmapFactorySupportedMimeType(str);
    }

    public DataSourceBitmapLoader(O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o, DataSource.Factory factory) {
        this(o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o, factory, null);
    }

    public DataSourceBitmapLoader(O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o, DataSource.Factory factory, @Nullable BitmapFactory.Options options) {
        this(o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o, factory, options, -1);
    }

    public DataSourceBitmapLoader(O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o, DataSource.Factory factory, @Nullable BitmapFactory.Options options, int i) {
        this.listeningExecutorService = o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o;
        this.dataSourceFactory = factory;
        this.options = options;
        this.maximumOutputDimension = i;
    }
}
