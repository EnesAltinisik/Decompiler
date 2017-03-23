package com.google.android.gms.common.images;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.util.Log;
import android.widget.ImageView;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.images.zza.zzc;
import com.google.android.gms.common.internal.zzb;
import com.google.android.gms.common.util.zzs;
import com.google.android.gms.internal.zzpj;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class ImageManager {
    private static final Object zzapv = new Object();
    private static HashSet<Uri> zzapw = new HashSet();
    private static ImageManager zzapx;
    private static ImageManager zzapy;
    private final Context mContext;
    private final Handler mHandler = new Handler(Looper.getMainLooper());
    private final b zzapA;
    private final zzpj zzapB;
    private final Map<zza, ImageReceiver> zzapC;
    private final Map<Uri, ImageReceiver> zzapD;
    private final Map<Uri, Long> zzapE;
    private final ExecutorService zzapz = Executors.newFixedThreadPool(4);

    @KeepName
    private final class ImageReceiver extends ResultReceiver {
        final /* synthetic */ ImageManager a;
        private final Uri b;
        private final ArrayList<zza> c = new ArrayList();

        ImageReceiver(ImageManager imageManager, Uri uri) {
            this.a = imageManager;
            super(new Handler(Looper.getMainLooper()));
            this.b = uri;
        }

        public void a() {
            Intent intent = new Intent("com.google.android.gms.common.images.LOAD_IMAGE");
            intent.putExtra("com.google.android.gms.extras.uri", this.b);
            intent.putExtra("com.google.android.gms.extras.resultReceiver", this);
            intent.putExtra("com.google.android.gms.extras.priority", 3);
            this.a.mContext.sendBroadcast(intent);
        }

        public void a(zza com_google_android_gms_common_images_zza) {
            zzb.zzdc("ImageReceiver.addImageRequest() must be called in the main thread");
            this.c.add(com_google_android_gms_common_images_zza);
        }

        public void b(zza com_google_android_gms_common_images_zza) {
            zzb.zzdc("ImageReceiver.removeImageRequest() must be called in the main thread");
            this.c.remove(com_google_android_gms_common_images_zza);
        }

        public void onReceiveResult(int i, Bundle bundle) {
            this.a.zzapz.execute(new c(this.a, this.b, (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor")));
        }
    }

    public interface OnImageLoadedListener {
        void onImageLoaded(Uri uri, Drawable drawable, boolean z);
    }

    @TargetApi(11)
    private static final class a {
        static int a(ActivityManager activityManager) {
            return activityManager.getLargeMemoryClass();
        }
    }

    private static final class b extends android.support.v4.h.f<a, Bitmap> {
        public b(Context context) {
            super(a(context));
        }

        @TargetApi(11)
        private static int a(Context context) {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            int memoryClass = (((context.getApplicationInfo().flags & 1048576) != 0 ? 1 : null) == null || !zzs.zzuX()) ? activityManager.getMemoryClass() : a.a(activityManager);
            return (int) (((float) (memoryClass * 1048576)) * 0.33f);
        }

        protected int a(a aVar, Bitmap bitmap) {
            return bitmap.getHeight() * bitmap.getRowBytes();
        }

        protected void a(boolean z, a aVar, Bitmap bitmap, Bitmap bitmap2) {
            super.entryRemoved(z, aVar, bitmap, bitmap2);
        }

        protected /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
            a(z, (a) obj, (Bitmap) obj2, (Bitmap) obj3);
        }

        protected /* synthetic */ int sizeOf(Object obj, Object obj2) {
            return a((a) obj, (Bitmap) obj2);
        }
    }

    private final class c implements Runnable {
        final /* synthetic */ ImageManager a;
        private final Uri b;
        private final ParcelFileDescriptor c;

        public c(ImageManager imageManager, Uri uri, ParcelFileDescriptor parcelFileDescriptor) {
            this.a = imageManager;
            this.b = uri;
            this.c = parcelFileDescriptor;
        }

        public void run() {
            zzb.zzdd("LoadBitmapFromDiskRunnable can't be executed in the main thread");
            boolean z = false;
            Bitmap bitmap = null;
            if (this.c != null) {
                try {
                    bitmap = BitmapFactory.decodeFileDescriptor(this.c.getFileDescriptor());
                } catch (Throwable e) {
                    String valueOf = String.valueOf(this.b);
                    Log.e("ImageManager", new StringBuilder(String.valueOf(valueOf).length() + 34).append("OOM while loading bitmap for uri: ").append(valueOf).toString(), e);
                    z = true;
                }
                try {
                    this.c.close();
                } catch (Throwable e2) {
                    Log.e("ImageManager", "closed failed", e2);
                }
            }
            CountDownLatch countDownLatch = new CountDownLatch(1);
            this.a.mHandler.post(new f(this.a, this.b, bitmap, z, countDownLatch));
            try {
                countDownLatch.await();
            } catch (InterruptedException e3) {
                String valueOf2 = String.valueOf(this.b);
                Log.w("ImageManager", new StringBuilder(String.valueOf(valueOf2).length() + 32).append("Latch interrupted while posting ").append(valueOf2).toString());
            }
        }
    }

    private final class d implements Runnable {
        final /* synthetic */ ImageManager a;
        private final zza b;

        public d(ImageManager imageManager, zza com_google_android_gms_common_images_zza) {
            this.a = imageManager;
            this.b = com_google_android_gms_common_images_zza;
        }

        public void run() {
            zzb.zzdc("LoadImageRunnable must be executed on the main thread");
            ImageReceiver imageReceiver = (ImageReceiver) this.a.zzapC.get(this.b);
            if (imageReceiver != null) {
                this.a.zzapC.remove(this.b);
                imageReceiver.b(this.b);
            }
            a aVar = this.b.zzapK;
            if (aVar.a == null) {
                this.b.zza(this.a.mContext, this.a.zzapB, true);
                return;
            }
            Bitmap zza = this.a.zza(aVar);
            if (zza != null) {
                this.b.zza(this.a.mContext, zza, true);
                return;
            }
            Long l = (Long) this.a.zzapE.get(aVar.a);
            if (l != null) {
                if (SystemClock.elapsedRealtime() - l.longValue() < 3600000) {
                    this.b.zza(this.a.mContext, this.a.zzapB, true);
                    return;
                }
                this.a.zzapE.remove(aVar.a);
            }
            this.b.zza(this.a.mContext, this.a.zzapB);
            imageReceiver = (ImageReceiver) this.a.zzapD.get(aVar.a);
            if (imageReceiver == null) {
                imageReceiver = new ImageReceiver(this.a, aVar.a);
                this.a.zzapD.put(aVar.a, imageReceiver);
            }
            imageReceiver.a(this.b);
            if (!(this.b instanceof zzc)) {
                this.a.zzapC.put(this.b, imageReceiver);
            }
            synchronized (ImageManager.zzapv) {
                if (!ImageManager.zzapw.contains(aVar.a)) {
                    ImageManager.zzapw.add(aVar.a);
                    imageReceiver.a();
                }
            }
        }
    }

    @TargetApi(14)
    private static final class e implements ComponentCallbacks2 {
        private final b a;

        public e(b bVar) {
            this.a = bVar;
        }

        public void onConfigurationChanged(Configuration configuration) {
        }

        public void onLowMemory() {
            this.a.evictAll();
        }

        public void onTrimMemory(int i) {
            if (i >= 60) {
                this.a.evictAll();
            } else if (i >= 20) {
                this.a.trimToSize(this.a.size() / 2);
            }
        }
    }

    private final class f implements Runnable {
        final /* synthetic */ ImageManager a;
        private final Uri b;
        private final Bitmap c;
        private final CountDownLatch d;
        private boolean e;

        public f(ImageManager imageManager, Uri uri, Bitmap bitmap, boolean z, CountDownLatch countDownLatch) {
            this.a = imageManager;
            this.b = uri;
            this.c = bitmap;
            this.e = z;
            this.d = countDownLatch;
        }

        private void a(ImageReceiver imageReceiver, boolean z) {
            ArrayList a = imageReceiver.c;
            int size = a.size();
            for (int i = 0; i < size; i++) {
                zza com_google_android_gms_common_images_zza = (zza) a.get(i);
                if (z) {
                    com_google_android_gms_common_images_zza.zza(this.a.mContext, this.c, false);
                } else {
                    this.a.zzapE.put(this.b, Long.valueOf(SystemClock.elapsedRealtime()));
                    com_google_android_gms_common_images_zza.zza(this.a.mContext, this.a.zzapB, false);
                }
                if (!(com_google_android_gms_common_images_zza instanceof zzc)) {
                    this.a.zzapC.remove(com_google_android_gms_common_images_zza);
                }
            }
        }

        public void run() {
            zzb.zzdc("OnBitmapLoadedRunnable must be executed in the main thread");
            boolean z = this.c != null;
            if (this.a.zzapA != null) {
                if (this.e) {
                    this.a.zzapA.evictAll();
                    System.gc();
                    this.e = false;
                    this.a.mHandler.post(this);
                    return;
                } else if (z) {
                    this.a.zzapA.put(new a(this.b), this.c);
                }
            }
            ImageReceiver imageReceiver = (ImageReceiver) this.a.zzapD.remove(this.b);
            if (imageReceiver != null) {
                a(imageReceiver, z);
            }
            this.d.countDown();
            synchronized (ImageManager.zzapv) {
                ImageManager.zzapw.remove(this.b);
            }
        }
    }

    private ImageManager(Context context, boolean z) {
        this.mContext = context.getApplicationContext();
        if (z) {
            this.zzapA = new b(this.mContext);
            if (zzs.zzva()) {
                zzsZ();
            }
        } else {
            this.zzapA = null;
        }
        this.zzapB = new zzpj();
        this.zzapC = new HashMap();
        this.zzapD = new HashMap();
        this.zzapE = new HashMap();
    }

    public static ImageManager create(Context context) {
        return zzg(context, false);
    }

    private Bitmap zza(a aVar) {
        return this.zzapA == null ? null : (Bitmap) this.zzapA.get(aVar);
    }

    public static ImageManager zzg(Context context, boolean z) {
        if (z) {
            if (zzapy == null) {
                zzapy = new ImageManager(context, true);
            }
            return zzapy;
        }
        if (zzapx == null) {
            zzapx = new ImageManager(context, false);
        }
        return zzapx;
    }

    @TargetApi(14)
    private void zzsZ() {
        this.mContext.registerComponentCallbacks(new e(this.zzapA));
    }

    public void loadImage(ImageView imageView, int i) {
        zza(new zza.zzb(imageView, i));
    }

    public void loadImage(ImageView imageView, Uri uri) {
        zza(new zza.zzb(imageView, uri));
    }

    public void loadImage(ImageView imageView, Uri uri, int i) {
        zza com_google_android_gms_common_images_zza_zzb = new zza.zzb(imageView, uri);
        com_google_android_gms_common_images_zza_zzb.zzbV(i);
        zza(com_google_android_gms_common_images_zza_zzb);
    }

    public void loadImage(OnImageLoadedListener onImageLoadedListener, Uri uri) {
        zza(new zzc(onImageLoadedListener, uri));
    }

    public void loadImage(OnImageLoadedListener onImageLoadedListener, Uri uri, int i) {
        zza com_google_android_gms_common_images_zza_zzc = new zzc(onImageLoadedListener, uri);
        com_google_android_gms_common_images_zza_zzc.zzbV(i);
        zza(com_google_android_gms_common_images_zza_zzc);
    }

    public void zza(zza com_google_android_gms_common_images_zza) {
        zzb.zzdc("ImageManager.loadImage() must be called in the main thread");
        new d(this, com_google_android_gms_common_images_zza).run();
    }
}
