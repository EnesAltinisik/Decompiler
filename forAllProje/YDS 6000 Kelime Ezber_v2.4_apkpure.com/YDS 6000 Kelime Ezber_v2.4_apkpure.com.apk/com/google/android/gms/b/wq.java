package com.google.android.gms.b;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.ParcelFileDescriptor.AutoCloseOutputStream;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.v;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.util.i;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

@vz
public final class wq extends a {
    public static final Creator<wq> CREATOR = new wr();
    final int a;
    ParcelFileDescriptor b;
    private Parcelable c;
    private boolean d;

    wq(int i, ParcelFileDescriptor parcelFileDescriptor) {
        this.a = i;
        this.b = parcelFileDescriptor;
        this.c = null;
        this.d = true;
    }

    public wq(SafeParcelable safeParcelable) {
        this.a = 1;
        this.b = null;
        this.c = safeParcelable;
        this.d = false;
    }

    protected <T> ParcelFileDescriptor a(final byte[] bArr) {
        Throwable e;
        ParcelFileDescriptor parcelFileDescriptor = null;
        final Closeable autoCloseOutputStream;
        try {
            ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
            autoCloseOutputStream = new AutoCloseOutputStream(createPipe[1]);
            try {
                new Thread(new Runnable(this) {
                    public void run() {
                        Closeable dataOutputStream;
                        Throwable e;
                        try {
                            dataOutputStream = new DataOutputStream(autoCloseOutputStream);
                            try {
                                dataOutputStream.writeInt(bArr.length);
                                dataOutputStream.write(bArr);
                                i.a(dataOutputStream);
                            } catch (IOException e2) {
                                e = e2;
                                try {
                                    zy.b("Error transporting the ad response", e);
                                    v.i().a(e, "LargeParcelTeleporter.pipeData.1");
                                    if (dataOutputStream != null) {
                                        i.a(autoCloseOutputStream);
                                    } else {
                                        i.a(dataOutputStream);
                                    }
                                } catch (Throwable th) {
                                    e = th;
                                    if (dataOutputStream != null) {
                                        i.a(autoCloseOutputStream);
                                    } else {
                                        i.a(dataOutputStream);
                                    }
                                    throw e;
                                }
                            }
                        } catch (IOException e3) {
                            e = e3;
                            dataOutputStream = null;
                            zy.b("Error transporting the ad response", e);
                            v.i().a(e, "LargeParcelTeleporter.pipeData.1");
                            if (dataOutputStream != null) {
                                i.a(dataOutputStream);
                            } else {
                                i.a(autoCloseOutputStream);
                            }
                        } catch (Throwable th2) {
                            e = th2;
                            dataOutputStream = null;
                            if (dataOutputStream != null) {
                                i.a(dataOutputStream);
                            } else {
                                i.a(autoCloseOutputStream);
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
            zy.b("Error transporting the ad response", e);
            v.i().a(e, "LargeParcelTeleporter.pipeData.2");
            i.a(autoCloseOutputStream);
            return parcelFileDescriptor;
        }
    }

    public <T extends SafeParcelable> T a(Creator<T> creator) {
        if (this.d) {
            if (this.b == null) {
                zy.c("File descriptor is empty, returning null.");
                return null;
            }
            Closeable dataInputStream = new DataInputStream(new AutoCloseInputStream(this.b));
            try {
                byte[] bArr = new byte[dataInputStream.readInt()];
                dataInputStream.readFully(bArr, 0, bArr.length);
                i.a(dataInputStream);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.unmarshall(bArr, 0, bArr.length);
                    obtain.setDataPosition(0);
                    this.c = (SafeParcelable) creator.createFromParcel(obtain);
                    this.d = false;
                } finally {
                    obtain.recycle();
                }
            } catch (Throwable e) {
                throw new IllegalStateException("Could not read from parcel file descriptor", e);
            } catch (Throwable th) {
                i.a(dataInputStream);
            }
        }
        return (SafeParcelable) this.c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (this.b == null) {
            Parcel obtain = Parcel.obtain();
            try {
                this.c.writeToParcel(obtain, 0);
                byte[] marshall = obtain.marshall();
                this.b = a(marshall);
            } finally {
                obtain.recycle();
            }
        }
        wr.a(this, parcel, i);
    }
}
