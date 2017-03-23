package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzt.zza;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class zzd<T extends IInterface> {
    public static final String[] zzaqJ = new String[]{"service_esmobile", "service_googleme"};
    private final Context mContext;
    final Handler mHandler;
    private final Looper zzakW;
    private final com.google.android.gms.common.zzc zzamE;
    private T zzaqA;
    private final ArrayList<zze<?>> zzaqB;
    private zzh zzaqC;
    private int zzaqD;
    private final zzb zzaqE;
    private final zzc zzaqF;
    private final int zzaqG;
    private final String zzaqH;
    protected AtomicInteger zzaqI;
    private int zzaqr;
    private long zzaqs;
    private long zzaqt;
    private int zzaqu;
    private long zzaqv;
    private final zzm zzaqw;
    private final Object zzaqx;
    private zzu zzaqy;
    private zzf zzaqz;
    private final Object zzpp;

    public interface zzb {
        void onConnected(Bundle bundle);

        void onConnectionSuspended(int i);
    }

    public interface zzc {
        void onConnectionFailed(ConnectionResult connectionResult);
    }

    protected abstract class zze<TListener> {
        private TListener mListener;
        final /* synthetic */ zzd zzaqL;
        private boolean zzaqM = false;

        public zze(zzd com_google_android_gms_common_internal_zzd, TListener tListener) {
            this.zzaqL = com_google_android_gms_common_internal_zzd;
            this.mListener = tListener;
        }

        public void unregister() {
            zzts();
            synchronized (this.zzaqL.zzaqB) {
                this.zzaqL.zzaqB.remove(this);
            }
        }

        protected abstract void zztq();

        public void zztr() {
            synchronized (this) {
                Object obj = this.mListener;
                if (this.zzaqM) {
                    String valueOf = String.valueOf(this);
                    Log.w("GmsClient", new StringBuilder(String.valueOf(valueOf).length() + 47).append("Callback proxy ").append(valueOf).append(" being reused. This is not safe.").toString());
                }
            }
            if (obj != null) {
                try {
                    zzw(obj);
                } catch (RuntimeException e) {
                    zztq();
                    throw e;
                }
            }
            zztq();
            synchronized (this) {
                this.zzaqM = true;
            }
            unregister();
        }

        public void zzts() {
            synchronized (this) {
                this.mListener = null;
            }
        }

        protected abstract void zzw(TListener tListener);
    }

    private abstract class a extends zze<Boolean> {
        public final int statusCode;
        public final Bundle zzaqK;
        final /* synthetic */ zzd zzaqL;

        protected a(zzd com_google_android_gms_common_internal_zzd, int i, Bundle bundle) {
            this.zzaqL = com_google_android_gms_common_internal_zzd;
            super(com_google_android_gms_common_internal_zzd, Boolean.valueOf(true));
            this.statusCode = i;
            this.zzaqK = bundle;
        }

        protected void zzc(Boolean bool) {
            PendingIntent pendingIntent = null;
            if (bool == null) {
                this.zzaqL.zzb(1, null);
                return;
            }
            switch (this.statusCode) {
                case 0:
                    if (!zztp()) {
                        this.zzaqL.zzb(1, null);
                        zzl(new ConnectionResult(8, null));
                        return;
                    }
                    return;
                case 10:
                    this.zzaqL.zzb(1, null);
                    throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
                default:
                    this.zzaqL.zzb(1, null);
                    if (this.zzaqK != null) {
                        pendingIntent = (PendingIntent) this.zzaqK.getParcelable("pendingIntent");
                    }
                    zzl(new ConnectionResult(this.statusCode, pendingIntent));
                    return;
            }
        }

        protected abstract void zzl(ConnectionResult connectionResult);

        protected abstract boolean zztp();

        protected void zztq() {
        }

        protected /* synthetic */ void zzw(Object obj) {
            zzc((Boolean) obj);
        }
    }

    final class b extends Handler {
        final /* synthetic */ zzd a;

        public b(zzd com_google_android_gms_common_internal_zzd, Looper looper) {
            this.a = com_google_android_gms_common_internal_zzd;
            super(looper);
        }

        private void a(Message message) {
            zze com_google_android_gms_common_internal_zzd_zze = (zze) message.obj;
            com_google_android_gms_common_internal_zzd_zze.zztq();
            com_google_android_gms_common_internal_zzd_zze.unregister();
        }

        private boolean b(Message message) {
            return message.what == 2 || message.what == 1 || message.what == 5;
        }

        public void handleMessage(Message message) {
            PendingIntent pendingIntent = null;
            if (this.a.zzaqI.get() != message.arg1) {
                if (b(message)) {
                    a(message);
                }
            } else if ((message.what == 1 || message.what == 5) && !this.a.isConnecting()) {
                a(message);
            } else if (message.what == 3) {
                if (message.obj instanceof PendingIntent) {
                    pendingIntent = (PendingIntent) message.obj;
                }
                ConnectionResult connectionResult = new ConnectionResult(message.arg2, pendingIntent);
                this.a.zzaqz.zzh(connectionResult);
                this.a.onConnectionFailed(connectionResult);
            } else if (message.what == 4) {
                this.a.zzb(4, null);
                if (this.a.zzaqE != null) {
                    this.a.zzaqE.onConnectionSuspended(message.arg2);
                }
                this.a.onConnectionSuspended(message.arg2);
                this.a.zza(4, 1, null);
            } else if (message.what == 2 && !this.a.isConnected()) {
                a(message);
            } else if (b(message)) {
                ((zze) message.obj).zztr();
            } else {
                Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
            }
        }
    }

    public interface zzf {
        void zzh(ConnectionResult connectionResult);
    }

    public static final class zzg extends zza {
        private zzd zzaqN;
        private final int zzaqO;

        public zzg(zzd com_google_android_gms_common_internal_zzd, int i) {
            this.zzaqN = com_google_android_gms_common_internal_zzd;
            this.zzaqO = i;
        }

        private void zztt() {
            this.zzaqN = null;
        }

        public void zza(int i, IBinder iBinder, Bundle bundle) {
            zzaa.zzb(this.zzaqN, (Object) "onPostInitComplete can be called only once per call to getRemoteService");
            this.zzaqN.zza(i, iBinder, bundle, this.zzaqO);
            zztt();
        }

        public void zzb(int i, Bundle bundle) {
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        }
    }

    public final class zzh implements ServiceConnection {
        final /* synthetic */ zzd zzaqL;
        private final int zzaqO;

        public zzh(zzd com_google_android_gms_common_internal_zzd, int i) {
            this.zzaqL = com_google_android_gms_common_internal_zzd;
            this.zzaqO = i;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            zzaa.zzb((Object) iBinder, (Object) "Expecting a valid IBinder");
            synchronized (this.zzaqL.zzaqx) {
                this.zzaqL.zzaqy = zzu.zza.zzaW(iBinder);
            }
            this.zzaqL.zza(0, null, this.zzaqO);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            synchronized (this.zzaqL.zzaqx) {
                this.zzaqL.zzaqy = null;
            }
            this.zzaqL.mHandler.sendMessage(this.zzaqL.mHandler.obtainMessage(4, this.zzaqO, 1));
        }
    }

    protected class zzi implements zzf {
        final /* synthetic */ zzd zzaqL;

        public zzi(zzd com_google_android_gms_common_internal_zzd) {
            this.zzaqL = com_google_android_gms_common_internal_zzd;
        }

        public void zzh(ConnectionResult connectionResult) {
            if (connectionResult.isSuccess()) {
                this.zzaqL.zza(null, this.zzaqL.zzto());
            } else if (this.zzaqL.zzaqF != null) {
                this.zzaqL.zzaqF.onConnectionFailed(connectionResult);
            }
        }
    }

    protected final class zzj extends a {
        final /* synthetic */ zzd zzaqL;
        public final IBinder zzaqP;

        public zzj(zzd com_google_android_gms_common_internal_zzd, int i, IBinder iBinder, Bundle bundle) {
            this.zzaqL = com_google_android_gms_common_internal_zzd;
            super(com_google_android_gms_common_internal_zzd, i, bundle);
            this.zzaqP = iBinder;
        }

        protected void zzl(ConnectionResult connectionResult) {
            if (this.zzaqL.zzaqF != null) {
                this.zzaqL.zzaqF.onConnectionFailed(connectionResult);
            }
            this.zzaqL.onConnectionFailed(connectionResult);
        }

        protected boolean zztp() {
            try {
                String interfaceDescriptor = this.zzaqP.getInterfaceDescriptor();
                if (this.zzaqL.zzhU().equals(interfaceDescriptor)) {
                    IInterface zzab = this.zzaqL.zzab(this.zzaqP);
                    if (zzab == null || !this.zzaqL.zza(2, 3, zzab)) {
                        return false;
                    }
                    Bundle zzqr = this.zzaqL.zzqr();
                    if (this.zzaqL.zzaqE != null) {
                        this.zzaqL.zzaqE.onConnected(zzqr);
                    }
                    return true;
                }
                String valueOf = String.valueOf(this.zzaqL.zzhU());
                Log.e("GmsClient", new StringBuilder((String.valueOf(valueOf).length() + 34) + String.valueOf(interfaceDescriptor).length()).append("service descriptor mismatch: ").append(valueOf).append(" vs. ").append(interfaceDescriptor).toString());
                return false;
            } catch (RemoteException e) {
                Log.w("GmsClient", "service probably died");
                return false;
            }
        }
    }

    protected final class zzk extends a {
        final /* synthetic */ zzd zzaqL;

        public zzk(zzd com_google_android_gms_common_internal_zzd, int i, Bundle bundle) {
            this.zzaqL = com_google_android_gms_common_internal_zzd;
            super(com_google_android_gms_common_internal_zzd, i, bundle);
        }

        protected void zzl(ConnectionResult connectionResult) {
            this.zzaqL.zzaqz.zzh(connectionResult);
            this.zzaqL.onConnectionFailed(connectionResult);
        }

        protected boolean zztp() {
            this.zzaqL.zzaqz.zzh(ConnectionResult.zzakj);
            return true;
        }
    }

    protected zzd(Context context, Looper looper, int i, zzb com_google_android_gms_common_internal_zzd_zzb, zzc com_google_android_gms_common_internal_zzd_zzc, String str) {
        this(context, looper, zzm.zzav(context), com.google.android.gms.common.zzc.zzqV(), i, (zzb) zzaa.zzz(com_google_android_gms_common_internal_zzd_zzb), (zzc) zzaa.zzz(com_google_android_gms_common_internal_zzd_zzc), str);
    }

    protected zzd(Context context, Looper looper, zzm com_google_android_gms_common_internal_zzm, com.google.android.gms.common.zzc com_google_android_gms_common_zzc, int i, zzb com_google_android_gms_common_internal_zzd_zzb, zzc com_google_android_gms_common_internal_zzd_zzc, String str) {
        this.zzpp = new Object();
        this.zzaqx = new Object();
        this.zzaqB = new ArrayList();
        this.zzaqD = 1;
        this.zzaqI = new AtomicInteger(0);
        this.mContext = (Context) zzaa.zzb((Object) context, (Object) "Context must not be null");
        this.zzakW = (Looper) zzaa.zzb((Object) looper, (Object) "Looper must not be null");
        this.zzaqw = (zzm) zzaa.zzb((Object) com_google_android_gms_common_internal_zzm, (Object) "Supervisor must not be null");
        this.zzamE = (com.google.android.gms.common.zzc) zzaa.zzb((Object) com_google_android_gms_common_zzc, (Object) "API availability must not be null");
        this.mHandler = new b(this, looper);
        this.zzaqG = i;
        this.zzaqE = com_google_android_gms_common_internal_zzd_zzb;
        this.zzaqF = com_google_android_gms_common_internal_zzd_zzc;
        this.zzaqH = str;
    }

    private boolean zza(int i, int i2, T t) {
        boolean z;
        synchronized (this.zzpp) {
            if (this.zzaqD != i) {
                z = false;
            } else {
                zzb(i2, t);
                z = true;
            }
        }
        return z;
    }

    private void zzb(int i, T t) {
        boolean z = true;
        if ((i == 3) != (t != null)) {
            z = false;
        }
        zzaa.zzaj(z);
        synchronized (this.zzpp) {
            this.zzaqD = i;
            this.zzaqA = t;
            zzc(i, t);
            switch (i) {
                case 1:
                    zzti();
                    break;
                case 2:
                    zzth();
                    break;
                case 3:
                    zza((IInterface) t);
                    break;
            }
        }
    }

    private void zzth() {
        if (this.zzaqC != null) {
            String valueOf = String.valueOf(zzhT());
            String valueOf2 = String.valueOf(zztf());
            Log.e("GmsClient", new StringBuilder((String.valueOf(valueOf).length() + 70) + String.valueOf(valueOf2).length()).append("Calling connect() while still connected, missing disconnect() for ").append(valueOf).append(" on ").append(valueOf2).toString());
            this.zzaqw.zzb(zzhT(), zztf(), this.zzaqC, zztg());
            this.zzaqI.incrementAndGet();
        }
        this.zzaqC = new zzh(this, this.zzaqI.get());
        if (!this.zzaqw.zza(zzhT(), zztf(), this.zzaqC, zztg())) {
            valueOf = String.valueOf(zzhT());
            valueOf2 = String.valueOf(zztf());
            Log.e("GmsClient", new StringBuilder((String.valueOf(valueOf).length() + 34) + String.valueOf(valueOf2).length()).append("unable to connect to service: ").append(valueOf).append(" on ").append(valueOf2).toString());
            zza(16, null, this.zzaqI.get());
        }
    }

    private void zzti() {
        if (this.zzaqC != null) {
            this.zzaqw.zzb(zzhT(), zztf(), this.zzaqC, zztg());
            this.zzaqC = null;
        }
    }

    public void disconnect() {
        this.zzaqI.incrementAndGet();
        synchronized (this.zzaqB) {
            int size = this.zzaqB.size();
            for (int i = 0; i < size; i++) {
                ((zze) this.zzaqB.get(i)).zzts();
            }
            this.zzaqB.clear();
        }
        synchronized (this.zzaqx) {
            this.zzaqy = null;
        }
        zzb(1, null);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        synchronized (this.zzpp) {
            int i = this.zzaqD;
            IInterface iInterface = this.zzaqA;
        }
        printWriter.append(str).append("mConnectState=");
        switch (i) {
            case 1:
                printWriter.print("DISCONNECTED");
                break;
            case 2:
                printWriter.print("CONNECTING");
                break;
            case 3:
                printWriter.print("CONNECTED");
                break;
            case 4:
                printWriter.print("DISCONNECTING");
                break;
            default:
                printWriter.print("UNKNOWN");
                break;
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.println("null");
        } else {
            printWriter.append(zzhU()).append("@").println(Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.zzaqt > 0) {
            PrintWriter append = printWriter.append(str).append("lastConnectedTime=");
            long j = this.zzaqt;
            String valueOf = String.valueOf(simpleDateFormat.format(new Date(this.zzaqt)));
            append.println(new StringBuilder(String.valueOf(valueOf).length() + 21).append(j).append(" ").append(valueOf).toString());
        }
        if (this.zzaqs > 0) {
            printWriter.append(str).append("lastSuspendedCause=");
            switch (this.zzaqr) {
                case 1:
                    printWriter.append("CAUSE_SERVICE_DISCONNECTED");
                    break;
                case 2:
                    printWriter.append("CAUSE_NETWORK_LOST");
                    break;
                default:
                    printWriter.append(String.valueOf(this.zzaqr));
                    break;
            }
            append = printWriter.append(" lastSuspendedTime=");
            j = this.zzaqs;
            valueOf = String.valueOf(simpleDateFormat.format(new Date(this.zzaqs)));
            append.println(new StringBuilder(String.valueOf(valueOf).length() + 21).append(j).append(" ").append(valueOf).toString());
        }
        if (this.zzaqv > 0) {
            printWriter.append(str).append("lastFailedStatus=").append(CommonStatusCodes.getStatusCodeString(this.zzaqu));
            append = printWriter.append(" lastFailedTime=");
            j = this.zzaqv;
            String valueOf2 = String.valueOf(simpleDateFormat.format(new Date(this.zzaqv)));
            append.println(new StringBuilder(String.valueOf(valueOf2).length() + 21).append(j).append(" ").append(valueOf2).toString());
        }
    }

    public Account getAccount() {
        return null;
    }

    public final Context getContext() {
        return this.mContext;
    }

    public final Looper getLooper() {
        return this.zzakW;
    }

    public boolean isConnected() {
        boolean z;
        synchronized (this.zzpp) {
            z = this.zzaqD == 3;
        }
        return z;
    }

    public boolean isConnecting() {
        boolean z;
        synchronized (this.zzpp) {
            z = this.zzaqD == 2;
        }
        return z;
    }

    protected void onConnectionFailed(ConnectionResult connectionResult) {
        this.zzaqu = connectionResult.getErrorCode();
        this.zzaqv = System.currentTimeMillis();
    }

    protected void onConnectionSuspended(int i) {
        this.zzaqr = i;
        this.zzaqs = System.currentTimeMillis();
    }

    protected void zza(int i, Bundle bundle, int i2) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(5, i2, -1, new zzk(this, i, bundle)));
    }

    protected void zza(int i, IBinder iBinder, Bundle bundle, int i2) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(1, i2, -1, new zzj(this, i, iBinder, bundle)));
    }

    protected void zza(T t) {
        this.zzaqt = System.currentTimeMillis();
    }

    public void zza(zzf com_google_android_gms_common_internal_zzd_zzf) {
        this.zzaqz = (zzf) zzaa.zzb((Object) com_google_android_gms_common_internal_zzd_zzf, (Object) "Connection progress callbacks cannot be null.");
        zzb(2, null);
    }

    public void zza(zzq com_google_android_gms_common_internal_zzq, Set<Scope> set) {
        try {
            GetServiceRequest zzl = new GetServiceRequest(this.zzaqG).zzdf(this.mContext.getPackageName()).zzl(zzoO());
            if (set != null) {
                zzl.zzd(set);
            }
            if (zzpd()) {
                zzl.zzc(zztk()).zzb(com_google_android_gms_common_internal_zzq);
            } else if (zztn()) {
                zzl.zzc(getAccount());
            }
            synchronized (this.zzaqx) {
                if (this.zzaqy != null) {
                    this.zzaqy.zza(new zzg(this, this.zzaqI.get()), zzl);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "service died");
            zzbZ(1);
        } catch (Throwable e2) {
            Log.w("GmsClient", "Remote exception occurred", e2);
        }
    }

    protected abstract T zzab(IBinder iBinder);

    public void zzbZ(int i) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(4, this.zzaqI.get(), i));
    }

    void zzc(int i, T t) {
    }

    protected abstract String zzhT();

    protected abstract String zzhU();

    protected Bundle zzoO() {
        return new Bundle();
    }

    public boolean zzpd() {
        return false;
    }

    public boolean zzps() {
        return false;
    }

    public Intent zzpt() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public Bundle zzqr() {
        return null;
    }

    public boolean zzrg() {
        return true;
    }

    public IBinder zzrh() {
        IBinder iBinder;
        synchronized (this.zzaqx) {
            if (this.zzaqy == null) {
                iBinder = null;
            } else {
                iBinder = this.zzaqy.asBinder();
            }
        }
        return iBinder;
    }

    protected String zztf() {
        return "com.google.android.gms";
    }

    protected final String zztg() {
        return this.zzaqH == null ? this.mContext.getClass().getName() : this.zzaqH;
    }

    public void zztj() {
        int isGooglePlayServicesAvailable = this.zzamE.isGooglePlayServicesAvailable(this.mContext);
        if (isGooglePlayServicesAvailable != 0) {
            zzb(1, null);
            this.zzaqz = new zzi(this);
            this.mHandler.sendMessage(this.mHandler.obtainMessage(3, this.zzaqI.get(), isGooglePlayServicesAvailable));
            return;
        }
        zza(new zzi(this));
    }

    public final Account zztk() {
        return getAccount() != null ? getAccount() : new Account("<<default account>>", "com.google");
    }

    protected final void zztl() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public final T zztm() throws DeadObjectException {
        T t;
        synchronized (this.zzpp) {
            if (this.zzaqD == 4) {
                throw new DeadObjectException();
            }
            zztl();
            zzaa.zza(this.zzaqA != null, (Object) "Client is connected but service is null");
            t = this.zzaqA;
        }
        return t;
    }

    public boolean zztn() {
        return false;
    }

    protected Set<Scope> zzto() {
        return Collections.EMPTY_SET;
    }
}
