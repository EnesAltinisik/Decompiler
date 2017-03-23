package com.google.android.gms.dynamic;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.zzh;
import com.google.android.gms.common.zze;
import java.util.Iterator;
import java.util.LinkedList;

public abstract class zza<T extends LifecycleDelegate> {
    private T zzaBY;
    private Bundle zzaBZ;
    private LinkedList<a> zzaCa;
    private final zzf<T> zzaCb = new zzf<T>(this) {
        final /* synthetic */ zza a;

        {
            this.a = r1;
        }

        public void zza(T t) {
            this.a.zzaBY = t;
            Iterator it = this.a.zzaCa.iterator();
            while (it.hasNext()) {
                ((a) it.next()).a(this.a.zzaBY);
            }
            this.a.zzaCa.clear();
            this.a.zzaBZ = null;
        }
    };

    private interface a {
        int a();

        void a(LifecycleDelegate lifecycleDelegate);
    }

    class AnonymousClass5 implements OnClickListener {
        final /* synthetic */ Context a;
        final /* synthetic */ int b;

        AnonymousClass5(Context context, int i) {
            this.a = context;
            this.b = i;
        }

        public void onClick(View view) {
            this.a.startActivity(GooglePlayServicesUtil.zzbC(this.b));
        }
    }

    private void zza(Bundle bundle, a aVar) {
        if (this.zzaBY != null) {
            aVar.a(this.zzaBY);
            return;
        }
        if (this.zzaCa == null) {
            this.zzaCa = new LinkedList();
        }
        this.zzaCa.add(aVar);
        if (bundle != null) {
            if (this.zzaBZ == null) {
                this.zzaBZ = (Bundle) bundle.clone();
            } else {
                this.zzaBZ.putAll(bundle);
            }
        }
        zza(this.zzaCb);
    }

    public static void zzb(FrameLayout frameLayout) {
        Context context = frameLayout.getContext();
        int isGooglePlayServicesAvailable = GooglePlayServicesUtil.isGooglePlayServicesAvailable(context);
        CharSequence zzb = zzh.zzb(context, isGooglePlayServicesAvailable, zze.zzam(context));
        CharSequence zzh = zzh.zzh(context, isGooglePlayServicesAvailable);
        View linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        View textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new LayoutParams(-2, -2));
        textView.setText(zzb);
        linearLayout.addView(textView);
        if (zzh != null) {
            View button = new Button(context);
            button.setLayoutParams(new LayoutParams(-2, -2));
            button.setText(zzh);
            linearLayout.addView(button);
            button.setOnClickListener(new AnonymousClass5(context, isGooglePlayServicesAvailable));
        }
    }

    private void zzeZ(int i) {
        while (!this.zzaCa.isEmpty() && ((a) this.zzaCa.getLast()).a() >= i) {
            this.zzaCa.removeLast();
        }
    }

    public void onCreate(final Bundle bundle) {
        zza(bundle, new a(this) {
            final /* synthetic */ zza b;

            public int a() {
                return 1;
            }

            public void a(LifecycleDelegate lifecycleDelegate) {
                this.b.zzaBY.onCreate(bundle);
            }
        });
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        final FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        final LayoutInflater layoutInflater2 = layoutInflater;
        final ViewGroup viewGroup2 = viewGroup;
        final Bundle bundle2 = bundle;
        zza(bundle, new a(this) {
            final /* synthetic */ zza e;

            public int a() {
                return 2;
            }

            public void a(LifecycleDelegate lifecycleDelegate) {
                frameLayout.removeAllViews();
                frameLayout.addView(this.e.zzaBY.onCreateView(layoutInflater2, viewGroup2, bundle2));
            }
        });
        if (this.zzaBY == null) {
            zza(frameLayout);
        }
        return frameLayout;
    }

    public void onDestroy() {
        if (this.zzaBY != null) {
            this.zzaBY.onDestroy();
        } else {
            zzeZ(1);
        }
    }

    public void onDestroyView() {
        if (this.zzaBY != null) {
            this.zzaBY.onDestroyView();
        } else {
            zzeZ(2);
        }
    }

    public void onInflate(final Activity activity, final Bundle bundle, final Bundle bundle2) {
        zza(bundle2, new a(this) {
            final /* synthetic */ zza d;

            public int a() {
                return 0;
            }

            public void a(LifecycleDelegate lifecycleDelegate) {
                this.d.zzaBY.onInflate(activity, bundle, bundle2);
            }
        });
    }

    public void onLowMemory() {
        if (this.zzaBY != null) {
            this.zzaBY.onLowMemory();
        }
    }

    public void onPause() {
        if (this.zzaBY != null) {
            this.zzaBY.onPause();
        } else {
            zzeZ(5);
        }
    }

    public void onResume() {
        zza(null, new a(this) {
            final /* synthetic */ zza a;

            {
                this.a = r1;
            }

            public int a() {
                return 5;
            }

            public void a(LifecycleDelegate lifecycleDelegate) {
                this.a.zzaBY.onResume();
            }
        });
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (this.zzaBY != null) {
            this.zzaBY.onSaveInstanceState(bundle);
        } else if (this.zzaBZ != null) {
            bundle.putAll(this.zzaBZ);
        }
    }

    public void onStart() {
        zza(null, new a(this) {
            final /* synthetic */ zza a;

            {
                this.a = r1;
            }

            public int a() {
                return 4;
            }

            public void a(LifecycleDelegate lifecycleDelegate) {
                this.a.zzaBY.onStart();
            }
        });
    }

    public void onStop() {
        if (this.zzaBY != null) {
            this.zzaBY.onStop();
        } else {
            zzeZ(4);
        }
    }

    protected void zza(FrameLayout frameLayout) {
        zzb(frameLayout);
    }

    protected abstract void zza(zzf<T> com_google_android_gms_dynamic_zzf_T);

    public T zzxd() {
        return this.zzaBY;
    }
}
