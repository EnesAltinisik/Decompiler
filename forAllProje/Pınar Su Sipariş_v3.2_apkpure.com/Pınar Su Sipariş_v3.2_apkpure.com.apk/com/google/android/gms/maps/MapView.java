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
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.IMapViewDelegate;
import com.google.android.gms.maps.internal.MapLifecycleDelegate;
import com.google.android.gms.maps.internal.zzad;
import com.google.android.gms.maps.internal.zzo.zza;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;

public class MapView extends FrameLayout {
    private GoogleMap zzaZt;
    private final b zzaZz;

    static class a implements MapLifecycleDelegate {
        private final ViewGroup a;
        private final IMapViewDelegate b;
        private View c;

        public a(ViewGroup viewGroup, IMapViewDelegate iMapViewDelegate) {
            this.b = (IMapViewDelegate) zzaa.zzz(iMapViewDelegate);
            this.a = (ViewGroup) zzaa.zzz(viewGroup);
        }

        public IMapViewDelegate a() {
            return this.b;
        }

        public void a(Bundle bundle) {
            try {
                this.b.onEnterAmbient(bundle);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void b() {
            try {
                this.b.onExitAmbient();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void getMapAsync(final OnMapReadyCallback onMapReadyCallback) {
            try {
                this.b.getMapAsync(new zza(this) {
                    final /* synthetic */ a b;

                    public void zza(IGoogleMapDelegate iGoogleMapDelegate) throws RemoteException {
                        onMapReadyCallback.onMapReady(new GoogleMap(iGoogleMapDelegate));
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
            throw new UnsupportedOperationException("onCreateView not allowed on MapViewDelegate");
        }

        public void onDestroy() {
            try {
                this.b.onDestroy();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onDestroyView() {
            throw new UnsupportedOperationException("onDestroyView not allowed on MapViewDelegate");
        }

        public void onInflate(Activity activity, Bundle bundle, Bundle bundle2) {
            throw new UnsupportedOperationException("onInflate not allowed on MapViewDelegate");
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
        private final GoogleMapOptions d;
        private final List<OnMapReadyCallback> e = new ArrayList();

        b(ViewGroup viewGroup, Context context, GoogleMapOptions googleMapOptions) {
            this.b = viewGroup;
            this.c = context;
            this.d = googleMapOptions;
        }

        public void a() {
            if (this.a != null && zzxd() == null) {
                try {
                    MapsInitializer.initialize(this.c);
                    IMapViewDelegate zza = zzad.zzaZ(this.c).zza(zze.zzD(this.c), this.d);
                    if (zza != null) {
                        this.a.zza(new a(this.b, zza));
                        for (OnMapReadyCallback mapAsync : this.e) {
                            ((a) zzxd()).getMapAsync(mapAsync);
                        }
                        this.e.clear();
                    }
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                } catch (GooglePlayServicesNotAvailableException e2) {
                }
            }
        }

        public void a(Bundle bundle) {
            if (zzxd() != null) {
                ((a) zzxd()).a(bundle);
            }
        }

        public void a(OnMapReadyCallback onMapReadyCallback) {
            if (zzxd() != null) {
                ((a) zzxd()).getMapAsync(onMapReadyCallback);
            } else {
                this.e.add(onMapReadyCallback);
            }
        }

        public void b() {
            if (zzxd() != null) {
                ((a) zzxd()).b();
            }
        }

        protected void zza(zzf<a> com_google_android_gms_dynamic_zzf_com_google_android_gms_maps_MapView_a) {
            this.a = com_google_android_gms_dynamic_zzf_com_google_android_gms_maps_MapView_a;
            a();
        }
    }

    public MapView(Context context) {
        super(context);
        this.zzaZz = new b(this, context, null);
        zzDG();
    }

    public MapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zzaZz = new b(this, context, GoogleMapOptions.createFromAttributes(context, attributeSet));
        zzDG();
    }

    public MapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.zzaZz = new b(this, context, GoogleMapOptions.createFromAttributes(context, attributeSet));
        zzDG();
    }

    public MapView(Context context, GoogleMapOptions googleMapOptions) {
        super(context);
        this.zzaZz = new b(this, context, googleMapOptions);
        zzDG();
    }

    private void zzDG() {
        setClickable(true);
    }

    @Deprecated
    public final GoogleMap getMap() {
        if (this.zzaZt != null) {
            return this.zzaZt;
        }
        this.zzaZz.a();
        if (this.zzaZz.zzxd() == null) {
            return null;
        }
        try {
            this.zzaZt = new GoogleMap(((a) this.zzaZz.zzxd()).a().getMap());
            return this.zzaZt;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void getMapAsync(OnMapReadyCallback onMapReadyCallback) {
        zzaa.zzdc("getMapAsync() must be called on the main thread");
        this.zzaZz.a(onMapReadyCallback);
    }

    public final void onCreate(Bundle bundle) {
        this.zzaZz.onCreate(bundle);
        if (this.zzaZz.zzxd() == null) {
            com.google.android.gms.dynamic.zza.zzb((FrameLayout) this);
        }
    }

    public final void onDestroy() {
        this.zzaZz.onDestroy();
    }

    public final void onEnterAmbient(Bundle bundle) {
        zzaa.zzdc("onEnterAmbient() must be called on the main thread");
        this.zzaZz.a(bundle);
    }

    public final void onExitAmbient() {
        zzaa.zzdc("onExitAmbient() must be called on the main thread");
        this.zzaZz.b();
    }

    public final void onLowMemory() {
        this.zzaZz.onLowMemory();
    }

    public final void onPause() {
        this.zzaZz.onPause();
    }

    public final void onResume() {
        this.zzaZz.onResume();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.zzaZz.onSaveInstanceState(bundle);
    }
}
