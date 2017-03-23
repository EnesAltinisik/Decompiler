package com.google.android.gms.auth;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzm;
import com.google.android.gms.common.zze;
import com.google.android.gms.internal.zzbn.zza;
import com.google.android.gms.internal.zzmx;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

public class zzd {
    public static final int CHANGE_TYPE_ACCOUNT_ADDED = 1;
    public static final int CHANGE_TYPE_ACCOUNT_REMOVED = 2;
    public static final int CHANGE_TYPE_ACCOUNT_RENAMED_FROM = 3;
    public static final int CHANGE_TYPE_ACCOUNT_RENAMED_TO = 4;
    public static final String GOOGLE_ACCOUNT_TYPE = "com.google";
    public static final String KEY_ANDROID_PACKAGE_NAME = (VERSION.SDK_INT >= 14 ? "androidPackageName" : "androidPackageName");
    public static final String KEY_CALLER_UID = (VERSION.SDK_INT >= 11 ? "callerUid" : "callerUid");
    public static final String KEY_REQUEST_ACTIONS = "request_visible_actions";
    @Deprecated
    public static final String KEY_REQUEST_VISIBLE_ACTIVITIES = "request_visible_actions";
    public static final String KEY_SUPPRESS_PROGRESS_SCREEN = "suppressProgressScreen";
    public static final String WORK_ACCOUNT_TYPE = "com.google.work";
    private static final ComponentName zzaaV = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
    private static final ComponentName zzaaW = new ComponentName("com.google.android.gms", "com.google.android.gms.recovery.RecoveryService");

    private interface a<T> {
        T b(IBinder iBinder) throws RemoteException, IOException, GoogleAuthException;
    }

    class AnonymousClass1 implements a<TokenData> {
        final /* synthetic */ Account a;
        final /* synthetic */ String b;
        final /* synthetic */ Bundle c;

        AnonymousClass1(Account account, String str, Bundle bundle) {
            this.a = account;
            this.b = str;
            this.c = bundle;
        }

        public TokenData a(IBinder iBinder) throws RemoteException, IOException, GoogleAuthException {
            Bundle bundle = (Bundle) zzd.zzn(zza.zza(iBinder).zza(this.a, this.b, this.c));
            TokenData zzd = TokenData.zzd(bundle, "tokenDetails");
            if (zzd != null) {
                return zzd;
            }
            String string = bundle.getString("Error");
            Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
            zzmx zzcv = zzmx.zzcv(string);
            if (zzmx.zza(zzcv)) {
                throw new UserRecoverableAuthException(string, intent);
            } else if (zzmx.zzb(zzcv)) {
                throw new IOException(string);
            } else {
                throw new GoogleAuthException(string);
            }
        }

        public /* synthetic */ Object b(IBinder iBinder) throws RemoteException, IOException, GoogleAuthException {
            return a(iBinder);
        }
    }

    class AnonymousClass2 implements a<Void> {
        final /* synthetic */ String a;
        final /* synthetic */ Bundle b;

        AnonymousClass2(String str, Bundle bundle) {
            this.a = str;
            this.b = bundle;
        }

        public Void a(IBinder iBinder) throws RemoteException, IOException, GoogleAuthException {
            Bundle bundle = (Bundle) zzd.zzn(zza.zza(iBinder).zza(this.a, this.b));
            String string = bundle.getString("Error");
            if (bundle.getBoolean("booleanResult")) {
                return null;
            }
            throw new GoogleAuthException(string);
        }

        public /* synthetic */ Object b(IBinder iBinder) throws RemoteException, IOException, GoogleAuthException {
            return a(iBinder);
        }
    }

    class AnonymousClass3 implements a<List<AccountChangeEvent>> {
        final /* synthetic */ String a;
        final /* synthetic */ int b;

        AnonymousClass3(String str, int i) {
            this.a = str;
            this.b = i;
        }

        public List<AccountChangeEvent> a(IBinder iBinder) throws RemoteException, IOException, GoogleAuthException {
            return ((AccountChangeEventsResponse) zzd.zzn(zza.zza(iBinder).zza(new AccountChangeEventsRequest().setAccountName(this.a).setEventIndex(this.b)))).getEvents();
        }

        public /* synthetic */ Object b(IBinder iBinder) throws RemoteException, IOException, GoogleAuthException {
            return a(iBinder);
        }
    }

    class AnonymousClass4 implements a<Bundle> {
        final /* synthetic */ Account a;

        AnonymousClass4(Account account) {
            this.a = account;
        }

        public Bundle a(IBinder iBinder) throws RemoteException, IOException, GoogleAuthException {
            return (Bundle) zzd.zzn(zza.zza(iBinder).zza(this.a));
        }

        public /* synthetic */ Object b(IBinder iBinder) throws RemoteException, IOException, GoogleAuthException {
            return a(iBinder);
        }
    }

    zzd() {
    }

    public static void clearToken(Context context, String str) throws GooglePlayServicesAvailabilityException, GoogleAuthException, IOException {
        zzaa.zzdd("Calling this from your main thread can lead to deadlock");
        zzaa(context);
        Bundle bundle = new Bundle();
        String str2 = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str2);
        if (!bundle.containsKey(KEY_ANDROID_PACKAGE_NAME)) {
            bundle.putString(KEY_ANDROID_PACKAGE_NAME, str2);
        }
        zza(context, zzaaV, new AnonymousClass2(str, bundle));
    }

    public static List<AccountChangeEvent> getAccountChangeEvents(Context context, int i, String str) throws GoogleAuthException, IOException {
        zzaa.zzh(str, "accountName must be provided");
        zzaa.zzdd("Calling this from your main thread can lead to deadlock");
        zzaa(context);
        return (List) zza(context, zzaaV, new AnonymousClass3(str, i));
    }

    public static String getAccountId(Context context, String str) throws GoogleAuthException, IOException {
        zzaa.zzh(str, "accountName must be provided");
        zzaa.zzdd("Calling this from your main thread can lead to deadlock");
        zzaa(context);
        return getToken(context, str, "^^_account_id_^^", new Bundle());
    }

    public static String getToken(Context context, Account account, String str) throws IOException, UserRecoverableAuthException, GoogleAuthException {
        return getToken(context, account, str, new Bundle());
    }

    public static String getToken(Context context, Account account, String str, Bundle bundle) throws IOException, UserRecoverableAuthException, GoogleAuthException {
        return zzc(context, account, str, bundle).getToken();
    }

    @Deprecated
    public static String getToken(Context context, String str, String str2) throws IOException, UserRecoverableAuthException, GoogleAuthException {
        return getToken(context, new Account(str, "com.google"), str2);
    }

    @Deprecated
    public static String getToken(Context context, String str, String str2, Bundle bundle) throws IOException, UserRecoverableAuthException, GoogleAuthException {
        return getToken(context, new Account(str, "com.google"), str2, bundle);
    }

    @Deprecated
    public static void invalidateToken(Context context, String str) {
        AccountManager.get(context).invalidateAuthToken("com.google", str);
    }

    @TargetApi(23)
    public static Bundle removeAccount(Context context, Account account) throws GoogleAuthException, IOException {
        zzaa.zzz(context);
        zzaa.zzb((Object) account, (Object) "Account cannot be null.");
        zzaa(context);
        return (Bundle) zza(context, zzaaV, new AnonymousClass4(account));
    }

    private static <T> T zza(Context context, ComponentName componentName, a<T> aVar) throws IOException, GoogleAuthException {
        Throwable e;
        ServiceConnection com_google_android_gms_common_zza = new com.google.android.gms.common.zza();
        zzm zzav = zzm.zzav(context);
        if (zzav.zza(componentName, com_google_android_gms_common_zza, "GoogleAuthUtil")) {
            try {
                T b = aVar.b(com_google_android_gms_common_zza.zzqU());
                zzav.zzb(componentName, com_google_android_gms_common_zza, "GoogleAuthUtil");
                return b;
            } catch (RemoteException e2) {
                e = e2;
                try {
                    Log.i("GoogleAuthUtil", "Error on service connection.", e);
                    throw new IOException("Error on service connection.", e);
                } catch (Throwable th) {
                    zzav.zzb(componentName, com_google_android_gms_common_zza, "GoogleAuthUtil");
                }
            } catch (InterruptedException e3) {
                e = e3;
                Log.i("GoogleAuthUtil", "Error on service connection.", e);
                throw new IOException("Error on service connection.", e);
            }
        }
        throw new IOException("Could not bind to service.");
    }

    private static void zzaa(Context context) throws GoogleAuthException {
        try {
            zze.zzaa(context.getApplicationContext());
        } catch (GooglePlayServicesRepairableException e) {
            throw new GooglePlayServicesAvailabilityException(e.getConnectionStatusCode(), e.getMessage(), e.getIntent());
        } catch (GooglePlayServicesNotAvailableException e2) {
            throw new GoogleAuthException(e2.getMessage());
        }
    }

    public static TokenData zzc(Context context, Account account, String str, Bundle bundle) throws IOException, UserRecoverableAuthException, GoogleAuthException {
        zzaa.zzdd("Calling this from your main thread can lead to deadlock");
        zzaa.zzh(str, "Scope cannot be empty or null.");
        zzaa.zzb((Object) account, (Object) "Account cannot be null.");
        zzaa(context);
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        String str2 = context.getApplicationInfo().packageName;
        bundle2.putString("clientPackageName", str2);
        if (TextUtils.isEmpty(bundle2.getString(KEY_ANDROID_PACKAGE_NAME))) {
            bundle2.putString(KEY_ANDROID_PACKAGE_NAME, str2);
        }
        bundle2.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
        return (TokenData) zza(context, zzaaV, new AnonymousClass1(account, str, bundle2));
    }

    static void zzi(Intent intent) {
        if (intent == null) {
            throw new IllegalArgumentException("Callback cannot be null.");
        }
        try {
            Intent.parseUri(intent.toUri(1), 1);
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException("Parameter callback contains invalid data. It must be serializable using toUri() and parseUri().");
        }
    }

    private static <T> T zzn(T t) throws IOException {
        if (t != null) {
            return t;
        }
        Log.w("GoogleAuthUtil", "Binder call returned null.");
        throw new IOException("Service unavailable.");
    }
}
