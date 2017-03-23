package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.events.ChangeEvent;
import com.google.android.gms.drive.events.ChangesAvailableEvent;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.drive.events.DriveEvent;
import com.google.android.gms.drive.events.QueryResultEventParcelable;
import com.google.android.gms.drive.events.TransferProgressEvent;
import com.google.android.gms.drive.events.TransferStateEvent;

public class OnEventResponse extends AbstractSafeParcelable {
    public static final Creator<OnEventResponse> CREATOR = new zzax();
    final int mVersionCode;
    final int zzatd;
    final ChangeEvent zzayG;
    final CompletionEvent zzayH;
    final QueryResultEventParcelable zzayI;
    final ChangesAvailableEvent zzayJ;
    final TransferStateEvent zzayK;
    final TransferProgressEvent zzayL;

    OnEventResponse(int i, int i2, ChangeEvent changeEvent, CompletionEvent completionEvent, QueryResultEventParcelable queryResultEventParcelable, ChangesAvailableEvent changesAvailableEvent, TransferStateEvent transferStateEvent, TransferProgressEvent transferProgressEvent) {
        this.mVersionCode = i;
        this.zzatd = i2;
        this.zzayG = changeEvent;
        this.zzayH = completionEvent;
        this.zzayI = queryResultEventParcelable;
        this.zzayJ = changesAvailableEvent;
        this.zzayK = transferStateEvent;
        this.zzayL = transferProgressEvent;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzax.zza(this, parcel, i);
    }

    public DriveEvent zzwy() {
        switch (this.zzatd) {
            case 1:
                return this.zzayG;
            case 2:
                return this.zzayH;
            case 3:
                return this.zzayI;
            case 4:
                return this.zzayJ;
            case 7:
                return this.zzayK;
            case 8:
                return this.zzayL;
            default:
                throw new IllegalStateException("Unexpected event type " + this.zzatd);
        }
    }
}
