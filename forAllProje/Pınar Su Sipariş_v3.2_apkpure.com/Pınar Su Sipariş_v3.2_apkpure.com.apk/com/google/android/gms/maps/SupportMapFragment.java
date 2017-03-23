package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzf;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.IMapFragmentDelegate;
import com.google.android.gms.maps.internal.MapLifecycleDelegate;
import com.google.android.gms.maps.internal.zzac;
import com.google.android.gms.maps.internal.zzad;
import com.google.android.gms.maps.internal.zzo.zza;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;

public class SupportMapFragment extends Fragment {
    private GoogleMap zzaZt;
    private final b zzbaf = new b(this);

    static class a implements MapLifecycleDelegate {
        private final Fragment a;
        private final IMapFragmentDelegate b;

        public a(Fragment fragment, IMapFragmentDelegate iMapFragmentDelegate) {
            this.b = (IMapFragmentDelegate) zzaa.zzz(iMapFragmentDelegate);
            this.a = (Fragment) zzaa.zzz(fragment);
        }

        public IMapFragmentDelegate a() {
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
            if (bundle == null) {
                try {
                    bundle = new Bundle();
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                }
            }
            Bundle arguments = this.a.getArguments();
            if (arguments != null && arguments.containsKey("MapOptions")) {
                zzac.zza(bundle, "MapOptions", arguments.getParcelable("MapOptions"));
            }
            this.b.onCreate(bundle);
        }

        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            try {
                return (View) zze.zzx(this.b.onCreateView(zze.zzD(layoutInflater), zze.zzD(viewGroup), bundle));
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onDestroy() {
            try {
                this.b.onDestroy();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onDestroyView() {
            try {
                this.b.onDestroyView();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onInflate(Activity activity, Bundle bundle, Bundle bundle2) {
            try {
                this.b.onInflate(zze.zzD(activity), (GoogleMapOptions) bundle.getParcelable("MapOptions"), bundle2);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
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
        private final Fragment b;
        private Activity c;
        private final List<OnMapReadyCallback> d = new ArrayList();

        b(Fragment fragment) {
            this.b = fragment;
        }

        private void a(Activity activity) {
            this.c = activity;
            a();
        }

        public void a() {
            if (this.c != null && this.a != null && zzxd() == null) {
                try {
                    MapsInitializer.initialize(this.c);
                    IMapFragmentDelegate zzA = zzad.zzaZ(this.c).zzA(zze.zzD(this.c));
                    if (zzA != null) {
                        this.a.zza(new a(this.b, zzA));
                        for (OnMapReadyCallback mapAsync : this.d) {
                            ((a) zzxd()).getMapAsync(mapAsync);
                        }
                        this.d.clear();
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
                this.d.add(onMapReadyCallback);
            }
        }

        public void b() {
            if (zzxd() != null) {
                ((a) zzxd()).b();
            }
        }

        protected void zza(zzf<a> com_google_android_gms_dynamic_zzf_com_google_android_gms_maps_SupportMapFragment_a) {
            this.a = com_google_android_gms_dynamic_zzf_com_google_android_gms_maps_SupportMapFragment_a;
            a();
        }
    }

    public static SupportMapFragment newInstance() {
        return new SupportMapFragment();
    }

    public static SupportMapFragment newInstance(GoogleMapOptions googleMapOptions) {
        SupportMapFragment supportMapFragment = new SupportMapFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("MapOptions", googleMapOptions);
        supportMapFragment.setArguments(bundle);
        return supportMapFragment;
    }

    @Deprecated
    public final GoogleMap getMap() {
        IMapFragmentDelegate zzDE = zzDE();
        if (zzDE == null) {
            return null;
        }
        try {
            IGoogleMapDelegate map = zzDE.getMap();
            if (map == null) {
                return null;
            }
            if (this.zzaZt == null || this.zzaZt.zzDs().asBinder() != map.asBinder()) {
                this.zzaZt = new GoogleMap(map);
            }
            return this.zzaZt;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void getMapAsync(OnMapReadyCallback onMapReadyCallback) {
        zzaa.zzdc("getMapAsync must be called on the main thread.");
        this.zzbaf.a(onMapReadyCallback);
    }

    public void onActivityCreated(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(SupportMapFragment.class.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.zzbaf.a(activity);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.zzbaf.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = this.zzbaf.onCreateView(layoutInflater, viewGroup, bundle);
        onCreateView.setClickable(true);
        return onCreateView;
    }

    public void onDestroy() {
        this.zzbaf.onDestroy();
        super.onDestroy();
    }

    public void onDestroyView() {
        this.zzbaf.onDestroyView();
        super.onDestroyView();
    }

    public final void onEnterAmbient(Bundle bundle) {
        zzaa.zzdc("onEnterAmbient must be called on the main thread.");
        this.zzbaf.a(bundle);
    }

    public final void onExitAmbient() {
        zzaa.zzdc("onExitAmbient must be called on the main thread.");
        this.zzbaf.b();
    }

    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(activity, attributeSet, bundle);
        this.zzbaf.a(activity);
        Parcelable createFromAttributes = GoogleMapOptions.createFromAttributes(activity, attributeSet);
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("MapOptions", createFromAttributes);
        this.zzbaf.onInflate(activity, bundle2, bundle);
    }

    public void onLowMemory() {
        this.zzbaf.onLowMemory();
        super.onLowMemory();
    }

    public void onPause() {
        this.zzbaf.onPause();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.zzbaf.onResume();
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(SupportMapFragment.class.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        this.zzbaf.onSaveInstanceState(bundle);
    }

    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }

    protected IMapFragmentDelegate zzDE() {
        this.zzbaf.a();
        return this.zzbaf.zzxd() == null ? null : ((a) this.zzbaf.zzxd()).a();
    }
}
