package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.google.android.gms.common.images.ImageManager.OnImageLoadedListener;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.internal.zzph;
import com.google.android.gms.internal.zzpi;
import com.google.android.gms.internal.zzpj;
import java.lang.ref.WeakReference;

public abstract class zza {
    final a zzapK;
    protected int zzapL = 0;
    protected int zzapM = 0;
    protected boolean zzapN = false;
    private boolean zzapO = true;
    private boolean zzapP = false;
    private boolean zzapQ = true;

    static final class a {
        public final Uri a;

        public a(Uri uri) {
            this.a = uri;
        }

        public boolean equals(Object obj) {
            return !(obj instanceof a) ? false : this == obj ? true : zzz.equal(((a) obj).a, this.a);
        }

        public int hashCode() {
            return zzz.hashCode(this.a);
        }
    }

    public static final class zzb extends zza {
        private WeakReference<ImageView> zzapR;

        public zzb(ImageView imageView, int i) {
            super(null, i);
            com.google.android.gms.common.internal.zzb.zzv(imageView);
            this.zzapR = new WeakReference(imageView);
        }

        public zzb(ImageView imageView, Uri uri) {
            super(uri, 0);
            com.google.android.gms.common.internal.zzb.zzv(imageView);
            this.zzapR = new WeakReference(imageView);
        }

        private void zza(ImageView imageView, Drawable drawable, boolean z, boolean z2, boolean z3) {
            Object obj = (z2 || z3) ? null : 1;
            if (obj != null && (imageView instanceof zzpi)) {
                int zzte = ((zzpi) imageView).zzte();
                if (this.zzapM != 0 && zzte == this.zzapM) {
                    return;
                }
            }
            boolean zzb = zzb(z, z2);
            Drawable zza = zzb ? zza(imageView.getDrawable(), drawable) : drawable;
            imageView.setImageDrawable(zza);
            if (imageView instanceof zzpi) {
                zzpi com_google_android_gms_internal_zzpi = (zzpi) imageView;
                com_google_android_gms_internal_zzpi.zzn(z3 ? this.zzapK.a : null);
                com_google_android_gms_internal_zzpi.zzbX(obj != null ? this.zzapM : 0);
            }
            if (zzb) {
                ((zzph) zza).startTransition(250);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof zzb)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            ImageView imageView = (ImageView) this.zzapR.get();
            ImageView imageView2 = (ImageView) ((zzb) obj).zzapR.get();
            boolean z = (imageView2 == null || imageView == null || !zzz.equal(imageView2, imageView)) ? false : true;
            return z;
        }

        public int hashCode() {
            return 0;
        }

        protected void zza(Drawable drawable, boolean z, boolean z2, boolean z3) {
            ImageView imageView = (ImageView) this.zzapR.get();
            if (imageView != null) {
                zza(imageView, drawable, z, z2, z3);
            }
        }
    }

    public static final class zzc extends zza {
        private WeakReference<OnImageLoadedListener> zzapS;

        public zzc(OnImageLoadedListener onImageLoadedListener, Uri uri) {
            super(uri, 0);
            com.google.android.gms.common.internal.zzb.zzv(onImageLoadedListener);
            this.zzapS = new WeakReference(onImageLoadedListener);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof zzc)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            zzc com_google_android_gms_common_images_zza_zzc = (zzc) obj;
            OnImageLoadedListener onImageLoadedListener = (OnImageLoadedListener) this.zzapS.get();
            OnImageLoadedListener onImageLoadedListener2 = (OnImageLoadedListener) com_google_android_gms_common_images_zza_zzc.zzapS.get();
            boolean z = onImageLoadedListener2 != null && onImageLoadedListener != null && zzz.equal(onImageLoadedListener2, onImageLoadedListener) && zzz.equal(com_google_android_gms_common_images_zza_zzc.zzapK, this.zzapK);
            return z;
        }

        public int hashCode() {
            return zzz.hashCode(this.zzapK);
        }

        protected void zza(Drawable drawable, boolean z, boolean z2, boolean z3) {
            if (!z2) {
                OnImageLoadedListener onImageLoadedListener = (OnImageLoadedListener) this.zzapS.get();
                if (onImageLoadedListener != null) {
                    onImageLoadedListener.onImageLoaded(this.zzapK.a, drawable, z3);
                }
            }
        }
    }

    public zza(Uri uri, int i) {
        this.zzapK = new a(uri);
        this.zzapM = i;
    }

    private Drawable zza(Context context, zzpj com_google_android_gms_internal_zzpj, int i) {
        return context.getResources().getDrawable(i);
    }

    protected zzph zza(Drawable drawable, Drawable drawable2) {
        if (drawable == null) {
            drawable = null;
        } else if (drawable instanceof zzph) {
            drawable = ((zzph) drawable).zztc();
        }
        return new zzph(drawable, drawable2);
    }

    void zza(Context context, Bitmap bitmap, boolean z) {
        com.google.android.gms.common.internal.zzb.zzv(bitmap);
        zza(new BitmapDrawable(context.getResources(), bitmap), z, false, true);
    }

    void zza(Context context, zzpj com_google_android_gms_internal_zzpj) {
        if (this.zzapQ) {
            zza(null, false, true, false);
        }
    }

    void zza(Context context, zzpj com_google_android_gms_internal_zzpj, boolean z) {
        Drawable drawable = null;
        if (this.zzapM != 0) {
            drawable = zza(context, com_google_android_gms_internal_zzpj, this.zzapM);
        }
        zza(drawable, z, false, false);
    }

    protected abstract void zza(Drawable drawable, boolean z, boolean z2, boolean z3);

    protected boolean zzb(boolean z, boolean z2) {
        return (!this.zzapO || z2 || z) ? false : true;
    }

    public void zzbV(int i) {
        this.zzapM = i;
    }
}
