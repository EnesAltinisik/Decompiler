package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.ParcelFileDescriptor.AutoCloseOutputStream;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.zzo;
import com.google.android.gms.internal.zzig;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

@zzig
public final class LargeParcelTeleporter extends AbstractSafeParcelable {
    public static final Creator<LargeParcelTeleporter> CREATOR = new zzm();
    final int mVersionCode;
    ParcelFileDescriptor zzMq;
    private Parcelable zzMr;
    private boolean zzMs;

    LargeParcelTeleporter(int i, ParcelFileDescriptor parcelFileDescriptor) {
        this.mVersionCode = i;
        this.zzMq = parcelFileDescriptor;
        this.zzMr = null;
        this.zzMs = true;
    }

    public LargeParcelTeleporter(SafeParcelable safeParcelable) {
        this.mVersionCode = 1;
        this.zzMq = null;
        this.zzMr = safeParcelable;
        this.zzMs = false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (this.zzMq == null) {
            Parcel obtain = Parcel.obtain();
            try {
                this.zzMr.writeToParcel(obtain, 0);
                byte[] marshall = obtain.marshall();
                this.zzMq = zzg(marshall);
            } finally {
                obtain.recycle();
            }
        }
        zzm.zza(this, parcel, i);
    }

    public <T extends SafeParcelable> T zza(Creator<T> creator) {
        if (this.zzMs) {
            if (this.zzMq == null) {
                zzb.e("File descriptor is empty, returning null.");
                return null;
            }
            Closeable dataInputStream = new DataInputStream(new AutoCloseInputStream(this.zzMq));
            try {
                byte[] bArr = new byte[dataInputStream.readInt()];
                dataInputStream.readFully(bArr, 0, bArr.length);
                zzo.zzb(dataInputStream);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.unmarshall(bArr, 0, bArr.length);
                    obtain.setDataPosition(0);
                    this.zzMr = (SafeParcelable) creator.createFromParcel(obtain);
                    this.zzMs = false;
                } finally {
                    obtain.recycle();
                }
            } catch (Throwable e) {
                throw new IllegalStateException("Could not read from parcel file descriptor", e);
            } catch (Throwable th) {
                zzo.zzb(dataInputStream);
            }
        }
        return (SafeParcelable) this.zzMr;
    }

    protected <T> ParcelFileDescriptor zzg(final byte[] bArr) {
        Throwable e;
        ParcelFileDescriptor parcelFileDescriptor = null;
        final Closeable autoCloseOutputStream;
        try {
            ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
            autoCloseOutputStream = new AutoCloseOutputStream(createPipe[1]);
            try {
                new Thread(new Runnable(this) {
                    final /* synthetic */ LargeParcelTeleporter c;

                    public void run() {
                        Closeable dataOutputStream;
                        Throwable e;
                        try {
                            dataOutputStream = new DataOutputStream(autoCloseOutputStream);
                            try {
                                dataOutputStream.writeInt(bArr.length);
                                dataOutputStream.write(bArr);
                                zzo.zzb(dataOutputStream);
                            } catch (IOException e2) {
                                e = e2;
                                try {
                                    zzb.zzb("Error transporting the ad response", e);
                                    zzu.zzcn().zzb(e, true);
                                    if (dataOutputStream != null) {
                                        zzo.zzb(autoCloseOutputStream);
                                    } else {
                                        zzo.zzb(dataOutputStream);
                                    }
                                } catch (Throwable th) {
                                    e = th;
                                    if (dataOutputStream != null) {
                                        zzo.zzb(dataOutputStream);
                                    } else {
                                        zzo.zzb(autoCloseOutputStream);
                                    }
                                    throw e;
                                }
                            }
                        } catch (IOException e3) {
                            e = e3;
                            dataOutputStream = null;
                            zzb.zzb("Error transporting the ad response", e);
                            zzu.zzcn().zzb(e, true);
                            if (dataOutputStream != null) {
                                zzo.zzb(dataOutputStream);
                            } else {
                                zzo.zzb(autoCloseOutputStream);
                            }
                        } catch (Throwable th2) {
                            e = th2;
                            dataOutputStream = null;
                            if (dataOutputStream != null) {
                                zzo.zzb(autoCloseOutputStream);
                            } else {
                                zzo.zzb(dataOutputStream);
                            }
                            throw e;
                        }
                    }
                }).start();
                return createPipe[0];
            } catch (IOException e2) {
                e = e2;
            }
        } catch (IOException e3) {
            e = e3;
            autoCloseOutputStream = parcelFileDescriptor;
            zzb.zzb("Error transporting the ad response", e);
            zzu.zzcn().zzb(e, true);
            zzo.zzb(autoCloseOutputStream);
            return parcelFileDescriptor;
        }
    }
}
