package com.google.android.gms.wallet.fragment;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.gms.R;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.dynamic.LifecycleDelegate;
import com.google.android.gms.dynamic.zzb;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzf;
import com.google.android.gms.internal.zzaby;
import com.google.android.gms.internal.zzabz.zza;
import com.google.android.gms.internal.zzacg;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

@TargetApi(12)
public final class WalletFragment extends Fragment {
    private boolean mCreated = false;
    private final Fragment zzaCi = this;
    private WalletFragmentOptions zzbAF;
    private WalletFragmentInitParams zzbAG;
    private MaskedWalletRequest zzbAH;
    private MaskedWallet zzbAI;
    private Boolean zzbAJ;
    private b zzbAO;
    private final zzb zzbAP = zzb.zza(this);
    private final c zzbAQ = new c();
    private a zzbAR = new a(this);

    public interface OnStateChangedListener {
        void onStateChanged(WalletFragment walletFragment, int i, int i2, Bundle bundle);
    }

    static class a extends zza {
        private OnStateChangedListener a;
        private final WalletFragment b;

        a(WalletFragment walletFragment) {
            this.b = walletFragment;
        }

        public void a(OnStateChangedListener onStateChangedListener) {
            this.a = onStateChangedListener;
        }

        public void zza(int i, int i2, Bundle bundle) {
            if (this.a != null) {
                this.a.onStateChanged(this.b, i, i2, bundle);
            }
        }
    }

    private static class b implements LifecycleDelegate {
        private final zzaby a;

        private b(zzaby com_google_android_gms_internal_zzaby) {
            this.a = com_google_android_gms_internal_zzaby;
        }

        private int a() {
            try {
                return this.a.getState();
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }

        private void a(int i, int i2, Intent intent) {
            try {
                this.a.onActivityResult(i, i2, intent);
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }

        private void a(MaskedWallet maskedWallet) {
            try {
                this.a.updateMaskedWallet(maskedWallet);
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }

        private void a(MaskedWalletRequest maskedWalletRequest) {
            try {
                this.a.updateMaskedWalletRequest(maskedWalletRequest);
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }

        private void a(WalletFragmentInitParams walletFragmentInitParams) {
            try {
                this.a.initialize(walletFragmentInitParams);
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }

        private void a(boolean z) {
            try {
                this.a.setEnabled(z);
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }

        public void onCreate(Bundle bundle) {
            try {
                this.a.onCreate(bundle);
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }

        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            try {
                return (View) zze.zzx(this.a.onCreateView(zze.zzD(layoutInflater), zze.zzD(viewGroup), bundle));
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }

        public void onDestroy() {
        }

        public void onDestroyView() {
        }

        public void onInflate(Activity activity, Bundle bundle, Bundle bundle2) {
            try {
                this.a.zza(zze.zzD(activity), (WalletFragmentOptions) bundle.getParcelable("extraWalletFragmentOptions"), bundle2);
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }

        public void onLowMemory() {
        }

        public void onPause() {
            try {
                this.a.onPause();
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }

        public void onResume() {
            try {
                this.a.onResume();
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }

        public void onSaveInstanceState(Bundle bundle) {
            try {
                this.a.onSaveInstanceState(bundle);
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }

        public void onStart() {
            try {
                this.a.onStart();
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }

        public void onStop() {
            try {
                this.a.onStop();
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
    }

    private class c extends com.google.android.gms.dynamic.zza<b> implements OnClickListener {
        final /* synthetic */ WalletFragment a;

        private c(WalletFragment walletFragment) {
            this.a = walletFragment;
        }

        public void onClick(View view) {
            Context activity = this.a.zzaCi.getActivity();
            GooglePlayServicesUtil.showErrorDialogFragment(GooglePlayServicesUtil.isGooglePlayServicesAvailable(activity), activity, -1);
        }

        protected void zza(FrameLayout frameLayout) {
            int i = -1;
            int i2 = -2;
            View button = new Button(this.a.zzaCi.getActivity());
            button.setText(R.string.wallet_buy_button_place_holder);
            if (this.a.zzbAF != null) {
                WalletFragmentStyle fragmentStyle = this.a.zzbAF.getFragmentStyle();
                if (fragmentStyle != null) {
                    DisplayMetrics displayMetrics = this.a.zzaCi.getResources().getDisplayMetrics();
                    i = fragmentStyle.zza("buyButtonWidth", displayMetrics, -1);
                    i2 = fragmentStyle.zza("buyButtonHeight", displayMetrics, -2);
                }
            }
            button.setLayoutParams(new LayoutParams(i, i2));
            button.setOnClickListener(this);
            frameLayout.addView(button);
        }

        protected void zza(zzf<b> com_google_android_gms_dynamic_zzf_com_google_android_gms_wallet_fragment_WalletFragment_b) {
            Activity activity = this.a.zzaCi.getActivity();
            if (this.a.zzbAO == null && this.a.mCreated && activity != null) {
                try {
                    this.a.zzbAO = new b(zzacg.zza(activity, this.a.zzbAP, this.a.zzbAF, this.a.zzbAR));
                    this.a.zzbAF = null;
                    com_google_android_gms_dynamic_zzf_com_google_android_gms_wallet_fragment_WalletFragment_b.zza(this.a.zzbAO);
                    if (this.a.zzbAG != null) {
                        this.a.zzbAO.a(this.a.zzbAG);
                        this.a.zzbAG = null;
                    }
                    if (this.a.zzbAH != null) {
                        this.a.zzbAO.a(this.a.zzbAH);
                        this.a.zzbAH = null;
                    }
                    if (this.a.zzbAI != null) {
                        this.a.zzbAO.a(this.a.zzbAI);
                        this.a.zzbAI = null;
                    }
                    if (this.a.zzbAJ != null) {
                        this.a.zzbAO.a(this.a.zzbAJ.booleanValue());
                        this.a.zzbAJ = null;
                    }
                } catch (GooglePlayServicesNotAvailableException e) {
                }
            }
        }
    }

    public static WalletFragment newInstance(WalletFragmentOptions walletFragmentOptions) {
        WalletFragment walletFragment = new WalletFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("extraWalletFragmentOptions", walletFragmentOptions);
        walletFragment.zzaCi.setArguments(bundle);
        return walletFragment;
    }

    public int getState() {
        return this.zzbAO != null ? this.zzbAO.a() : 0;
    }

    public void initialize(WalletFragmentInitParams walletFragmentInitParams) {
        if (this.zzbAO != null) {
            this.zzbAO.a(walletFragmentInitParams);
            this.zzbAG = null;
        } else if (this.zzbAG == null) {
            this.zzbAG = walletFragmentInitParams;
            if (this.zzbAH != null) {
                Log.w("WalletFragment", "updateMaskedWalletRequest() was called before initialize()");
            }
            if (this.zzbAI != null) {
                Log.w("WalletFragment", "updateMaskedWallet() was called before initialize()");
            }
        } else {
            Log.w("WalletFragment", "initialize(WalletFragmentInitParams) was called more than once. Ignoring.");
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.zzbAO != null) {
            this.zzbAO.a(i, i2, intent);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            bundle.setClassLoader(WalletFragmentOptions.class.getClassLoader());
            WalletFragmentInitParams walletFragmentInitParams = (WalletFragmentInitParams) bundle.getParcelable("walletFragmentInitParams");
            if (walletFragmentInitParams != null) {
                if (this.zzbAG != null) {
                    Log.w("WalletFragment", "initialize(WalletFragmentInitParams) was called more than once.Ignoring.");
                }
                this.zzbAG = walletFragmentInitParams;
            }
            if (this.zzbAH == null) {
                this.zzbAH = (MaskedWalletRequest) bundle.getParcelable("maskedWalletRequest");
            }
            if (this.zzbAI == null) {
                this.zzbAI = (MaskedWallet) bundle.getParcelable("maskedWallet");
            }
            if (bundle.containsKey("walletFragmentOptions")) {
                this.zzbAF = (WalletFragmentOptions) bundle.getParcelable("walletFragmentOptions");
            }
            if (bundle.containsKey("enabled")) {
                this.zzbAJ = Boolean.valueOf(bundle.getBoolean("enabled"));
            }
        } else if (this.zzaCi.getArguments() != null) {
            WalletFragmentOptions walletFragmentOptions = (WalletFragmentOptions) this.zzaCi.getArguments().getParcelable("extraWalletFragmentOptions");
            if (walletFragmentOptions != null) {
                walletFragmentOptions.zzbt(this.zzaCi.getActivity());
                this.zzbAF = walletFragmentOptions;
            }
        }
        this.mCreated = true;
        this.zzbAQ.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.zzbAQ.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public void onDestroy() {
        super.onDestroy();
        this.mCreated = false;
    }

    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(activity, attributeSet, bundle);
        if (this.zzbAF == null) {
            this.zzbAF = WalletFragmentOptions.zzb((Context) activity, attributeSet);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("attrKeyWalletFragmentOptions", this.zzbAF);
        this.zzbAQ.onInflate(activity, bundle2, bundle);
    }

    public void onPause() {
        super.onPause();
        this.zzbAQ.onPause();
    }

    public void onResume() {
        super.onResume();
        this.zzbAQ.onResume();
        FragmentManager fragmentManager = this.zzaCi.getActivity().getFragmentManager();
        Fragment findFragmentByTag = fragmentManager.findFragmentByTag(GooglePlayServicesUtil.GMS_ERROR_DIALOG);
        if (findFragmentByTag != null) {
            fragmentManager.beginTransaction().remove(findFragmentByTag).commit();
            GooglePlayServicesUtil.showErrorDialogFragment(GooglePlayServicesUtil.isGooglePlayServicesAvailable(this.zzaCi.getActivity()), this.zzaCi.getActivity(), -1);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.setClassLoader(WalletFragmentOptions.class.getClassLoader());
        this.zzbAQ.onSaveInstanceState(bundle);
        if (this.zzbAG != null) {
            bundle.putParcelable("walletFragmentInitParams", this.zzbAG);
            this.zzbAG = null;
        }
        if (this.zzbAH != null) {
            bundle.putParcelable("maskedWalletRequest", this.zzbAH);
            this.zzbAH = null;
        }
        if (this.zzbAI != null) {
            bundle.putParcelable("maskedWallet", this.zzbAI);
            this.zzbAI = null;
        }
        if (this.zzbAF != null) {
            bundle.putParcelable("walletFragmentOptions", this.zzbAF);
            this.zzbAF = null;
        }
        if (this.zzbAJ != null) {
            bundle.putBoolean("enabled", this.zzbAJ.booleanValue());
            this.zzbAJ = null;
        }
    }

    public void onStart() {
        super.onStart();
        this.zzbAQ.onStart();
    }

    public void onStop() {
        super.onStop();
        this.zzbAQ.onStop();
    }

    public void setEnabled(boolean z) {
        if (this.zzbAO != null) {
            this.zzbAO.a(z);
            this.zzbAJ = null;
            return;
        }
        this.zzbAJ = Boolean.valueOf(z);
    }

    public void setOnStateChangedListener(OnStateChangedListener onStateChangedListener) {
        this.zzbAR.a(onStateChangedListener);
    }

    public void updateMaskedWallet(MaskedWallet maskedWallet) {
        if (this.zzbAO != null) {
            this.zzbAO.a(maskedWallet);
            this.zzbAI = null;
            return;
        }
        this.zzbAI = maskedWallet;
    }

    public void updateMaskedWalletRequest(MaskedWalletRequest maskedWalletRequest) {
        if (this.zzbAO != null) {
            this.zzbAO.a(maskedWalletRequest);
            this.zzbAH = null;
            return;
        }
        this.zzbAH = maskedWalletRequest;
    }
}
