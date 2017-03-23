package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.messages.MessageFilter;
import com.google.android.gms.nearby.messages.Strategy;
import com.google.android.gms.nearby.messages.internal.zzf.zza;

public final class SubscribeRequest extends AbstractSafeParcelable {
    public static final Creator<SubscribeRequest> CREATOR = new zzu();
    final int mVersionCode;
    @Deprecated
    public final String zzbiR;
    @Deprecated
    public final boolean zzbiS;
    @Deprecated
    public final String zzbjE;
    public final zzg zzbjI;
    @Deprecated
    public final ClientAppContext zzbjJ;
    public final boolean zzbjk;
    public final Strategy zzbkj;
    @Deprecated
    public final boolean zzbkk;
    public final zzf zzbko;
    public final MessageFilter zzbkp;
    public final PendingIntent zzbkq;
    public final int zzbkr;
    public final byte[] zzbks;
    public final zzk zzbkt;

    public SubscribeRequest(int i, IBinder iBinder, Strategy strategy, IBinder iBinder2, MessageFilter messageFilter, PendingIntent pendingIntent, int i2, String str, String str2, byte[] bArr, boolean z, IBinder iBinder3, boolean z2, ClientAppContext clientAppContext, boolean z3) {
        this.mVersionCode = i;
        this.zzbko = zza.zzdG(iBinder);
        this.zzbkj = strategy;
        this.zzbjI = zzg.zza.zzdH(iBinder2);
        this.zzbkp = messageFilter;
        this.zzbkq = pendingIntent;
        this.zzbkr = i2;
        this.zzbiR = str;
        this.zzbjE = str2;
        this.zzbks = bArr;
        this.zzbkk = z;
        this.zzbkt = iBinder3 == null ? null : zzk.zza.zzdL(iBinder3);
        this.zzbiS = z2;
        this.zzbjJ = ClientAppContext.zza(clientAppContext, str2, str, z2);
        this.zzbjk = z3;
    }

    public SubscribeRequest(IBinder iBinder, Strategy strategy, IBinder iBinder2, MessageFilter messageFilter, PendingIntent pendingIntent, int i, byte[] bArr, IBinder iBinder3, boolean z) {
        this(3, iBinder, strategy, iBinder2, messageFilter, pendingIntent, i, null, null, bArr, false, iBinder3, false, null, z);
    }

    public String toString() {
        String str;
        String valueOf = String.valueOf(this.zzbko);
        String valueOf2 = String.valueOf(this.zzbkj);
        String valueOf3 = String.valueOf(this.zzbjI);
        String valueOf4 = String.valueOf(this.zzbkp);
        String valueOf5 = String.valueOf(this.zzbkq);
        int i = this.zzbkr;
        if (this.zzbks == null) {
            str = null;
        } else {
            str = "<" + this.zzbks.length + " bytes>";
        }
        String valueOf6 = String.valueOf(this.zzbkt);
        boolean z = this.zzbiS;
        String valueOf7 = String.valueOf(this.zzbjJ);
        boolean z2 = this.zzbjk;
        String str2 = this.zzbiR;
        String str3 = this.zzbjE;
        return new StringBuilder((((((((((String.valueOf(valueOf).length() + 295) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()) + String.valueOf(valueOf5).length()) + String.valueOf(str).length()) + String.valueOf(valueOf6).length()) + String.valueOf(valueOf7).length()) + String.valueOf(str2).length()) + String.valueOf(str3).length()).append("SubscribeRequest{messageListener=").append(valueOf).append(", strategy=").append(valueOf2).append(", callback=").append(valueOf3).append(", filter=").append(valueOf4).append(", pendingIntent=").append(valueOf5).append(", messageListenerKey=").append(i).append(", hint=").append(str).append(", subscribeCallback=").append(valueOf6).append(", useRealClientApiKey=").append(z).append(", clientAppContext=").append(valueOf7).append(", isDiscardPendingIntent=").append(z2).append(", zeroPartyPackageName=").append(str2).append(", realClientPackageName=").append(str3).append(", isIgnoreNearbyPermission=").append(this.zzbkk).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzu.zza(this, parcel, i);
    }

    IBinder zzHy() {
        return this.zzbjI == null ? null : this.zzbjI.asBinder();
    }

    IBinder zzIa() {
        return this.zzbko == null ? null : this.zzbko.asBinder();
    }

    IBinder zzIb() {
        return this.zzbkt == null ? null : this.zzbkt.asBinder();
    }
}
