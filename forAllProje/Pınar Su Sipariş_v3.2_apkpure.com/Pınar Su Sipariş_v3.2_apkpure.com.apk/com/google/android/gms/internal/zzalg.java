package com.google.android.gms.internal;

import java.io.IOException;
import java.io.Writer;

public final class zzalg {

    private static final class a extends Writer {
        private final Appendable a;
        private final a b;

        static class a implements CharSequence {
            char[] a;

            a() {
            }

            public char charAt(int i) {
                return this.a[i];
            }

            public int length() {
                return this.a.length;
            }

            public CharSequence subSequence(int i, int i2) {
                return new String(this.a, i, i2 - i);
            }
        }

        private a(Appendable appendable) {
            this.b = new a();
            this.a = appendable;
        }

        public void close() {
        }

        public void flush() {
        }

        public void write(int i) throws IOException {
            this.a.append((char) i);
        }

        public void write(char[] cArr, int i, int i2) throws IOException {
            this.b.a = cArr;
            this.a.append(this.b, i, i + i2);
        }
    }

    public static Writer zza(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new a(appendable);
    }

    public static void zzb(zzakf com_google_android_gms_internal_zzakf, zzaly com_google_android_gms_internal_zzaly) throws IOException {
        zzalu.zzbYV.zza(com_google_android_gms_internal_zzaly, com_google_android_gms_internal_zzakf);
    }

    public static zzakf zzh(zzalw com_google_android_gms_internal_zzalw) throws zzakj {
        Object obj = 1;
        try {
            com_google_android_gms_internal_zzalw.zzWa();
            obj = null;
            return (zzakf) zzalu.zzbYV.zzb(com_google_android_gms_internal_zzalw);
        } catch (Throwable e) {
            if (obj != null) {
                return zzakh.zzbWr;
            }
            throw new zzako(e);
        } catch (Throwable e2) {
            throw new zzako(e2);
        } catch (Throwable e22) {
            throw new zzakg(e22);
        } catch (Throwable e222) {
            throw new zzako(e222);
        }
    }
}
