package com.google.android.gms.security;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.zzc;
import com.google.android.gms.common.zze;
import java.lang.reflect.Method;

public class ProviderInstaller {
    public static final String PROVIDER_NAME = "GmsCore_OpenSSL";
    private static final zzc zzbnb = zzc.zzqV();
    private static Method zzbnc = null;
    private static final Object zzrs = new Object();

    class AnonymousClass1 extends AsyncTask<Void, Void, Integer> {
        final /* synthetic */ Context a;
        final /* synthetic */ ProviderInstallListener b;

        AnonymousClass1(Context context, ProviderInstallListener providerInstallListener) {
            this.a = context;
            this.b = providerInstallListener;
        }

        protected Integer a(Void... voidArr) {
            try {
                ProviderInstaller.installIfNeeded(this.a);
                return Integer.valueOf(0);
            } catch (GooglePlayServicesRepairableException e) {
                return Integer.valueOf(e.getConnectionStatusCode());
            } catch (GooglePlayServicesNotAvailableException e2) {
                return Integer.valueOf(e2.errorCode);
            }
        }

        protected void a(Integer num) {
            if (num.intValue() == 0) {
                this.b.onProviderInstalled();
                return;
            }
            this.b.onProviderInstallFailed(num.intValue(), ProviderInstaller.zzbnb.zza(this.a, num.intValue(), "pi"));
        }

        protected /* synthetic */ Object doInBackground(Object[] objArr) {
            return a((Void[]) objArr);
        }

        protected /* synthetic */ void onPostExecute(Object obj) {
            a((Integer) obj);
        }
    }

    public interface ProviderInstallListener {
        void onProviderInstallFailed(int i, Intent intent);

        void onProviderInstalled();
    }

    public static void installIfNeeded(Context context) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        zzaa.zzb((Object) context, (Object) "Context must not be null");
        zzbnb.zzaf(context);
        Context remoteContext = zze.getRemoteContext(context);
        if (remoteContext == null) {
            Log.e("ProviderInstaller", "Failed to get remote context");
            throw new GooglePlayServicesNotAvailableException(8);
        }
        synchronized (zzrs) {
            try {
                if (zzbnc == null) {
                    zzbf(remoteContext);
                }
                zzbnc.invoke(null, new Object[]{remoteContext});
            } catch (Exception e) {
                String str = "ProviderInstaller";
                String str2 = "Failed to install provider: ";
                String valueOf = String.valueOf(e.getMessage());
                Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                throw new GooglePlayServicesNotAvailableException(8);
            }
        }
    }

    public static void installIfNeededAsync(Context context, ProviderInstallListener providerInstallListener) {
        zzaa.zzb((Object) context, (Object) "Context must not be null");
        zzaa.zzb((Object) providerInstallListener, (Object) "Listener must not be null");
        zzaa.zzdc("Must be called on the UI thread");
        new AnonymousClass1(context, providerInstallListener).execute(new Void[0]);
    }

    private static void zzbf(Context context) throws ClassNotFoundException, NoSuchMethodException {
        zzbnc = context.getClassLoader().loadClass("com.google.android.gms.common.security.ProviderInstallerImpl").getMethod("insertProvider", new Class[]{Context.class});
    }
}
