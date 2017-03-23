package com.google.android.gms.internal;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.SocketTimeoutException;

class k {
    private DataInputStream a = null;
    private zzaie b = null;
    private zzaif c = null;
    private byte[] d = new byte[112];
    private b e;
    private volatile boolean f = false;

    k(zzaie com_google_android_gms_internal_zzaie) {
        this.b = com_google_android_gms_internal_zzaie;
    }

    private int a(byte[] bArr, int i, int i2) throws IOException {
        this.a.readFully(bArr, i, i2);
        return i2;
    }

    private long a(byte[] bArr, int i) {
        return (((((((((long) bArr[i + 0]) << 56) + (((long) (bArr[i + 1] & 255)) << 48)) + (((long) (bArr[i + 2] & 255)) << 40)) + (((long) (bArr[i + 3] & 255)) << 32)) + (((long) (bArr[i + 4] & 255)) << 24)) + ((long) ((bArr[i + 5] & 255) << 16))) + ((long) ((bArr[i + 6] & 255) << 8))) + ((long) ((bArr[i + 7] & 255) << 0));
    }

    private void a(zzaig com_google_android_gms_internal_zzaig) {
        b();
        this.b.zzb(com_google_android_gms_internal_zzaig);
    }

    private void a(boolean z, byte b, byte[] bArr) {
        if (b == (byte) 9) {
            if (z) {
                a(bArr);
                return;
            }
            throw new zzaig("PING must not fragment across frames");
        } else if (this.e != null && b != (byte) 0) {
            throw new zzaig("Failed to continue outstanding frame");
        } else if (this.e == null && b == (byte) 0) {
            throw new zzaig("Received continuing frame, but there's nothing to continue");
        } else {
            if (this.e == null) {
                this.e = i.a(b);
            }
            if (!this.e.a(bArr)) {
                throw new zzaig("Failed to decode frame");
            } else if (z) {
                zzaii a = this.e.a();
                this.e = null;
                if (a == null) {
                    throw new zzaig("Failed to decode whole message");
                }
                this.c.zza(a);
            }
        }
    }

    private void a(byte[] bArr) {
        if (bArr.length <= 125) {
            this.b.zzK(bArr);
            return;
        }
        throw new zzaig("PING frame too long");
    }

    void a() {
        this.c = this.b.zzTS();
        while (!this.f) {
            try {
                int a = a(this.d, 0, 1) + 0;
                boolean z = (this.d[0] & 128) != 0;
                if (((this.d[0] & 112) != 0 ? 1 : null) != null) {
                    throw new zzaig("Invalid frame received");
                }
                byte b = (byte) (this.d[0] & 15);
                int a2 = a + a(this.d, a, 1);
                byte b2 = this.d[1];
                long j = 0;
                if (b2 < (byte) 126) {
                    j = (long) b2;
                } else if (b2 == (byte) 126) {
                    int a3 = a(this.d, a2, 2) + a2;
                    j = (long) (((this.d[2] & 255) << 8) | (this.d[3] & 255));
                } else if (b2 == Byte.MAX_VALUE) {
                    j = a(this.d, (a(this.d, a2, 8) + a2) - 8);
                }
                byte[] bArr = new byte[((int) j)];
                a(bArr, 0, (int) j);
                if (b == (byte) 8) {
                    this.b.zzTT();
                } else if (b == (byte) 10) {
                    continue;
                } else if (b == (byte) 1 || b == (byte) 2 || b == (byte) 9 || b == (byte) 0) {
                    a(z, b, bArr);
                } else {
                    throw new zzaig("Unsupported opcode: " + b);
                }
            } catch (SocketTimeoutException e) {
            } catch (Throwable e2) {
                a(new zzaig("IO Error", e2));
            } catch (zzaig e3) {
                a(e3);
            }
        }
    }

    void a(DataInputStream dataInputStream) {
        this.a = dataInputStream;
    }

    void b() {
        this.f = true;
    }
}
