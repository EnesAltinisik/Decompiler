package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.internal.zzi;
import com.google.android.gms.maps.model.internal.zzi.zza;

public final class TileOverlayOptions implements SafeParcelable {
    public static final zzo CREATOR = new zzo();
    private final int mVersionCode;
    private float zzbax;
    private boolean zzbay;
    private zzi zzbbf;
    private TileProvider zzbbg;
    private boolean zzbbh;

    public TileOverlayOptions() {
        this.zzbay = true;
        this.zzbbh = true;
        this.mVersionCode = 1;
    }

    TileOverlayOptions(int i, IBinder iBinder, boolean z, float f, boolean z2) {
        this.zzbay = true;
        this.zzbbh = true;
        this.mVersionCode = i;
        this.zzbbf = zza.zzdu(iBinder);
        this.zzbbg = this.zzbbf == null ? null : new TileProvider(this) {
            final /* synthetic */ TileOverlayOptions a;
            private final zzi b = this.a.zzbbf;

            {
                this.a = r2;
            }

            public Tile getTile(int i, int i2, int i3) {
                try {
                    return this.b.getTile(i, i2, i3);
                } catch (RemoteException e) {
                    return null;
                }
            }
        };
        this.zzbay = z;
        this.zzbax = f;
        this.zzbbh = z2;
    }

    public int describeContents() {
        return 0;
    }

    public TileOverlayOptions fadeIn(boolean z) {
        this.zzbbh = z;
        return this;
    }

    public boolean getFadeIn() {
        return this.zzbbh;
    }

    public TileProvider getTileProvider() {
        return this.zzbbg;
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public float getZIndex() {
        return this.zzbax;
    }

    public boolean isVisible() {
        return this.zzbay;
    }

    public TileOverlayOptions tileProvider(final TileProvider tileProvider) {
        this.zzbbg = tileProvider;
        this.zzbbf = this.zzbbg == null ? null : new zza(this) {
            final /* synthetic */ TileOverlayOptions b;

            public Tile getTile(int i, int i2, int i3) {
                return tileProvider.getTile(i, i2, i3);
            }
        };
        return this;
    }

    public TileOverlayOptions visible(boolean z) {
        this.zzbay = z;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzo.zza(this, parcel, i);
    }

    public TileOverlayOptions zIndex(float f) {
        this.zzbax = f;
        return this;
    }

    IBinder zzDW() {
        return this.zzbbf.asBinder();
    }
}
