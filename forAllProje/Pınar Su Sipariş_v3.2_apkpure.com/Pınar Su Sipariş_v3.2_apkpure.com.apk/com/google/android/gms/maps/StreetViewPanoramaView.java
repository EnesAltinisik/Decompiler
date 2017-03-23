package com.google.android.gms.maps;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzf;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate;
import com.google.android.gms.maps.internal.StreetViewLifecycleDelegate;
import com.google.android.gms.maps.internal.zzaa.zza;
import com.google.android.gms.maps.internal.zzad;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;

public class StreetViewPanoramaView extends FrameLayout {
    private StreetViewPanorama zzaZO;
    private final b zzbaa;

    static class a implements StreetViewLifecycleDelegate {
        private final ViewGroup a;
        private final IStreetViewPanoramaViewDelegate b;
        private View c;

        public a(ViewGroup viewGroup, IStreetViewPanoramaViewDelegate iStreetViewPanoramaViewDelegate) {
            this.b = (IStreetViewPanoramaViewDelegate) zzaa.zzz(iStreetViewPanoramaViewDelegate);
            this.a = (ViewGroup) zzaa.zzz(viewGroup);
        }

        public IStreetViewPanoramaViewDelegate a() {
            return this.b;
        }

        public void getStreetViewPanoramaAsync(final OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
            try {
                this.b.getStreetViewPanoramaAsync(new zza(this) {
                    final /* synthetic */ a b;

                    public void zza(IStreetViewPanoramaDelegate iStreetViewPanoramaDelegate) throws RemoteException {
                        onStreetViewPanoramaReadyCallback.onStreetViewPanoramaReady(new StreetViewPanorama(iStreetViewPanoramaDelegate));
                    }
                });
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onCreate(Bundle bundle) {
            try {
                this.b.onCreate(bundle);
                this.c = (View) zze.zzx(this.b.getView());
                this.a.removeAllViews();
                this.a.addView(this.c);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            throw new UnsupportedOperationException("onCreateView not allowed on StreetViewPanoramaViewDelegate");
        }

        public void onDestroy() {
            try {
                this.b.onDestroy();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onDestroyView() {
            throw new UnsupportedOperationException("onDestroyView not allowed on StreetViewPanoramaViewDelegate");
        }

        public void onInflate(Activity activity, Bundle bundle, Bundle bundle2) {
            throw new UnsupportedOperationException("onInflate not allowed on StreetViewPanoramaViewDelegate");
        }

        public void onLowMemory() {
            try {
                this.b.onLowMemory();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onPause() {
            try {
                this.b.onPause();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onResume() {
            try {
                this.b.onResume();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onSaveInstanceState(Bundle bundle) {
            try {
                this.b.onSaveInstanceState(bundle);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onStart() {
        }

        public void onStop() {
        }
    }

    static class b extends com.google.android.gms.dynamic.zza<a> {
        protected zzf<a> a;
        private final ViewGroup b;
        private final Context c;
        private final StreetViewPanoramaOptions d;
        private final List<OnStreetViewPanoramaReadyCallback> e = new ArrayList();

        b(ViewGroup viewGroup, Context context, StreetViewPanoramaOptions streetViewPanoramaOptions) {
            this.b = viewGroup;
            this.c = context;
            this.d = streetViewPanoramaOptions;
        }

        public void a() {
            if (this.a != null && zzxd() == null) {
                try {
                    this.a.zza(new a(this.b, zzad.zzaZ(this.c).zza(zze.zzD(this.c), this.d)));
                    for (OnStreetViewPanoramaReadyCallback streetViewPanoramaAsync : this.e) {
                        ((a) zzxd()).getStreetViewPanoramaAsync(streetViewPanoramaAsync);
                    }
                    this.e.clear();
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                } catch (GooglePlayServicesNotAvailableException e2) {
                }
            }
        }

        public void a(OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
            if (zzxd() != null) {
                ((a) zzxd()).getStreetViewPanoramaAsync(onStreetViewPanoramaReadyCallback);
            } else {
                this.e.add(onStreetViewPanoramaReadyCallback);
            }
        }

        protected void zza(zzf<a> com_google_android_gms_dynamic_zzf_com_google_android_gms_maps_StreetViewPanoramaView_a) {
            this.a = com_google_android_gms_dynamic_zzf_com_google_android_gms_maps_StreetViewPanoramaView_a;
            a();
        }
    }

    public StreetViewPanoramaView(Context context) {
        super(context);
        this.zzbaa = new b(this, context, null);
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zzbaa = new b(this, context, null);
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.zzbaa = new b(this, context, null);
    }

    public StreetViewPanoramaView(Context context, StreetViewPanoramaOptions streetViewPanoramaOptions) {
        super(context);
        this.zzbaa = new b(this, context, streetViewPanoramaOptions);
    }

    @Deprecated
    public final StreetViewPanorama getStreetViewPanorama() {
        if (this.zzaZO != null) {
            return this.zzaZO;
        }
        this.zzbaa.a();
        if (this.zzbaa.zzxd() == null) {
            return null;
        }
        try {
            this.zzaZO = new StreetViewPanorama(((a) this.zzbaa.zzxd()).a().getStreetViewPanorama());
            return this.zzaZO;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        zzaa.zzdc("getStreetViewPanoramaAsync() must be called on the main thread");
        this.zzbaa.a(onStreetViewPanoramaReadyCallback);
    }

    public final void onCreate(Bundle bundle) {
        this.zzbaa.onCreate(bundle);
        if (this.zzbaa.zzxd() == null) {
            com.google.android.gms.dynamic.zza.zzb((FrameLayout) this);
        }
    }

    public final void onDestroy() {
        this.zzbaa.onDestroy();
    }

    public final void onLowMemory() {
        this.zzbaa.onLowMemory();
    }

    public final void onPause() {
        this.zzbaa.onPause();
    }

    public final void onResume() {
        this.zzbaa.onResume();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.zzbaa.onSaveInstanceState(bundle);
    }
}
