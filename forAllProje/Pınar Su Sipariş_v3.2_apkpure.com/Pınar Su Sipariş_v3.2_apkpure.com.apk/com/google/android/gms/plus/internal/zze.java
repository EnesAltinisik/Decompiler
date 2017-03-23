package com.google.android.gms.plus.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.common.internal.zzk;
import com.google.android.gms.common.internal.zzr;
import com.google.android.gms.internal.zznt.zzb;
import com.google.android.gms.plus.People.LoadPeopleResult;
import com.google.android.gms.plus.Plus;
import com.google.android.gms.plus.internal.model.people.PersonEntity;
import com.google.android.gms.plus.internal.zzd.zza;
import com.google.android.gms.plus.model.people.Person;
import com.google.android.gms.plus.model.people.PersonBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

public class zze extends zzk<zzd> {
    private Person zzblw;
    private final PlusSession zzblx;

    static final class a implements LoadPeopleResult {
        private final Status a;
        private final String b;
        private final PersonBuffer c;

        public a(Status status, DataHolder dataHolder, String str) {
            this.a = status;
            this.b = str;
            this.c = dataHolder != null ? new PersonBuffer(dataHolder) : null;
        }

        public String getNextPageToken() {
            return this.b;
        }

        public PersonBuffer getPersonBuffer() {
            return this.c;
        }

        public Status getStatus() {
            return this.a;
        }

        public void release() {
            if (this.c != null) {
                this.c.release();
            }
        }
    }

    static final class b extends zza {
        private final zzb<LoadPeopleResult> a;

        public b(zzb<LoadPeopleResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_plus_People_LoadPeopleResult) {
            this.a = com_google_android_gms_internal_zznt_zzb_com_google_android_gms_plus_People_LoadPeopleResult;
        }

        public void zza(DataHolder dataHolder, String str) {
            Status status = new Status(dataHolder.getStatusCode(), null, dataHolder.zzsO() != null ? (PendingIntent) dataHolder.zzsO().getParcelable("pendingIntent") : null);
            if (!(status.isSuccess() || dataHolder == null)) {
                if (!dataHolder.isClosed()) {
                    dataHolder.close();
                }
                dataHolder = null;
            }
            this.a.setResult(new a(status, dataHolder, str));
        }
    }

    static final class c extends zza {
        private final zzb<Status> a;

        public c(zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status) {
            this.a = com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status;
        }

        public void zzk(int i, Bundle bundle) {
            this.a.setResult(new Status(i, null, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
        }
    }

    public zze(Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, PlusSession plusSession, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 2, com_google_android_gms_common_internal_zzg, connectionCallbacks, onConnectionFailedListener);
        this.zzblx = plusSession;
    }

    public static boolean zzd(Set<Scope> set) {
        return (set == null || set.isEmpty()) ? false : (set.size() == 1 && set.contains(new Scope("plus_one_placeholder_scope"))) ? false : true;
    }

    public String getAccountName() {
        zztl();
        try {
            return ((zzd) zztm()).getAccountName();
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    public void zzIk() {
        zztl();
        try {
            this.zzblw = null;
            ((zzd) zztm()).zzIk();
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    public Person zzIm() {
        zztl();
        return this.zzblw;
    }

    public zzr zza(zzb<LoadPeopleResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_plus_People_LoadPeopleResult, int i, String str) {
        zztl();
        Object bVar = new b(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_plus_People_LoadPeopleResult);
        try {
            return ((zzd) zztm()).zza(bVar, 1, i, -1, str);
        } catch (RemoteException e) {
            bVar.zza(DataHolder.zzbQ(8), null);
            return null;
        }
    }

    protected void zza(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (i == 0 && bundle != null && bundle.containsKey("loaded_person")) {
            this.zzblw = PersonEntity.zzx(bundle.getByteArray("loaded_person"));
        }
        super.zza(i, iBinder, bundle, i2);
    }

    public void zza(zzb<LoadPeopleResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_plus_People_LoadPeopleResult, Collection<String> collection) {
        zztl();
        zzb bVar = new b(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_plus_People_LoadPeopleResult);
        try {
            ((zzd) zztm()).zza(bVar, new ArrayList(collection));
        } catch (RemoteException e) {
            bVar.zza(DataHolder.zzbQ(8), null);
        }
    }

    protected /* synthetic */ IInterface zzab(IBinder iBinder) {
        return zzdV(iBinder);
    }

    public void zzd(zzb<LoadPeopleResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_plus_People_LoadPeopleResult, String[] strArr) {
        zza(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_plus_People_LoadPeopleResult, Arrays.asList(strArr));
    }

    protected zzd zzdV(IBinder iBinder) {
        return zza.zzdU(iBinder);
    }

    protected String zzhT() {
        return "com.google.android.gms.plus.service.START";
    }

    protected String zzhU() {
        return "com.google.android.gms.plus.internal.IPlusService";
    }

    protected Bundle zzoO() {
        Bundle zzIw = this.zzblx.zzIw();
        zzIw.putStringArray("request_visible_actions", this.zzblx.zzIq());
        zzIw.putString("auth_package", this.zzblx.zzIs());
        return zzIw;
    }

    public boolean zzpd() {
        return zzd(zztH().zzb(Plus.API));
    }

    public void zzt(zzb<LoadPeopleResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_plus_People_LoadPeopleResult) {
        zztl();
        Object bVar = new b(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_plus_People_LoadPeopleResult);
        try {
            ((zzd) zztm()).zza(bVar, 2, 1, -1, null);
        } catch (RemoteException e) {
            bVar.zza(DataHolder.zzbQ(8), null);
        }
    }

    public zzr zzu(zzb<LoadPeopleResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_plus_People_LoadPeopleResult, String str) {
        return zza(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_plus_People_LoadPeopleResult, 0, str);
    }

    public void zzu(zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status) {
        zztl();
        zzIk();
        Object cVar = new c(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status);
        try {
            ((zzd) zztm()).zzb(cVar);
        } catch (RemoteException e) {
            cVar.zzk(8, null);
        }
    }
}
