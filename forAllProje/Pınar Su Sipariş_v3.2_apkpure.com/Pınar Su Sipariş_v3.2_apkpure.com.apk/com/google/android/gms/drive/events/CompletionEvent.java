package com.google.android.gms.drive.events;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.zzo;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.internal.zzap.zza;
import com.google.android.gms.drive.internal.zzz;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.zzqd;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class CompletionEvent extends AbstractSafeParcelable implements ResourceEvent {
    public static final Creator<CompletionEvent> CREATOR = new zze();
    public static final int STATUS_CANCELED = 3;
    public static final int STATUS_CONFLICT = 2;
    public static final int STATUS_FAILURE = 1;
    public static final int STATUS_SUCCESS = 0;
    final int mVersionCode;
    final int zzDO;
    final String zzaaR;
    final DriveId zzauZ;
    final ParcelFileDescriptor zzawd;
    final ParcelFileDescriptor zzawe;
    final MetadataBundle zzawf;
    final List<String> zzawg;
    final IBinder zzawh;
    private boolean zzawi = false;
    private boolean zzawj = false;
    private boolean zzawk = false;

    CompletionEvent(int i, DriveId driveId, String str, ParcelFileDescriptor parcelFileDescriptor, ParcelFileDescriptor parcelFileDescriptor2, MetadataBundle metadataBundle, List<String> list, int i2, IBinder iBinder) {
        this.mVersionCode = i;
        this.zzauZ = driveId;
        this.zzaaR = str;
        this.zzawd = parcelFileDescriptor;
        this.zzawe = parcelFileDescriptor2;
        this.zzawf = metadataBundle;
        this.zzawg = list;
        this.zzDO = i2;
        this.zzawh = iBinder;
    }

    private void zzwd() {
        if (this.zzawk) {
            throw new IllegalStateException("Event has already been dismissed or snoozed.");
        }
    }

    private void zzx(boolean z) {
        zzwd();
        this.zzawk = true;
        zzo.zza(this.zzawd);
        zzo.zza(this.zzawe);
        if (this.zzawf != null && this.zzawf.zzc(zzqd.zzaAa)) {
            ((BitmapTeleporter) this.zzawf.zza(zzqd.zzaAa)).release();
        }
        if (this.zzawh == null) {
            String str = "CompletionEvent";
            String str2 = "No callback on ";
            String valueOf = String.valueOf(z ? "snooze" : "dismiss");
            zzz.zzE(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            return;
        }
        try {
            zza.zzbk(this.zzawh).zzx(z);
        } catch (RemoteException e) {
            RemoteException remoteException = e;
            str2 = "CompletionEvent";
            valueOf = z ? "snooze" : "dismiss";
            str = String.valueOf(remoteException);
            zzz.zzE(str2, new StringBuilder((String.valueOf(valueOf).length() + 21) + String.valueOf(str).length()).append("RemoteException on ").append(valueOf).append(": ").append(str).toString());
        }
    }

    public void dismiss() {
        zzx(false);
    }

    public String getAccountName() {
        zzwd();
        return this.zzaaR;
    }

    public InputStream getBaseContentsInputStream() {
        zzwd();
        if (this.zzawd == null) {
            return null;
        }
        if (this.zzawi) {
            throw new IllegalStateException("getBaseInputStream() can only be called once per CompletionEvent instance.");
        }
        this.zzawi = true;
        return new FileInputStream(this.zzawd.getFileDescriptor());
    }

    public DriveId getDriveId() {
        zzwd();
        return this.zzauZ;
    }

    public InputStream getModifiedContentsInputStream() {
        zzwd();
        if (this.zzawe == null) {
            return null;
        }
        if (this.zzawj) {
            throw new IllegalStateException("getModifiedInputStream() can only be called once per CompletionEvent instance.");
        }
        this.zzawj = true;
        return new FileInputStream(this.zzawe.getFileDescriptor());
    }

    public MetadataChangeSet getModifiedMetadataChangeSet() {
        zzwd();
        return this.zzawf != null ? new MetadataChangeSet(this.zzawf) : null;
    }

    public int getStatus() {
        zzwd();
        return this.zzDO;
    }

    public List<String> getTrackingTags() {
        zzwd();
        return new ArrayList(this.zzawg);
    }

    public int getType() {
        return 2;
    }

    public void snooze() {
        zzx(true);
    }

    public String toString() {
        String str;
        if (this.zzawg == null) {
            str = "<null>";
        } else {
            str = String.valueOf(TextUtils.join("','", this.zzawg));
            str = new StringBuilder(String.valueOf(str).length() + 2).append("'").append(str).append("'").toString();
        }
        return String.format(Locale.US, "CompletionEvent [id=%s, status=%s, trackingTag=%s]", new Object[]{this.zzauZ, Integer.valueOf(this.zzDO), str});
    }

    public void writeToParcel(Parcel parcel, int i) {
        zze.zza(this, parcel, i | 1);
    }
}
