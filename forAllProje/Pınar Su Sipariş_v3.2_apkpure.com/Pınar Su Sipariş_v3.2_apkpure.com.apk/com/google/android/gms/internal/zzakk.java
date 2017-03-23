package com.google.android.gms.internal;

import java.io.Reader;
import java.io.StringReader;

public final class zzakk {
    public zzakf zza(Reader reader) throws zzakg, zzako {
        try {
            zzalw com_google_android_gms_internal_zzalw = new zzalw(reader);
            zzakf zzh = zzh(com_google_android_gms_internal_zzalw);
            if (zzh.zzVI() || com_google_android_gms_internal_zzalw.zzWa() == zzalx.END_DOCUMENT) {
                return zzh;
            }
            throw new zzako("Did not consume the entire document.");
        } catch (Throwable e) {
            throw new zzako(e);
        } catch (Throwable e2) {
            throw new zzakg(e2);
        } catch (Throwable e22) {
            throw new zzako(e22);
        }
    }

    public zzakf zzh(zzalw com_google_android_gms_internal_zzalw) throws zzakg, zzako {
        String valueOf;
        boolean isLenient = com_google_android_gms_internal_zzalw.isLenient();
        com_google_android_gms_internal_zzalw.setLenient(true);
        try {
            zzakf zzh = zzalg.zzh(com_google_android_gms_internal_zzalw);
            com_google_android_gms_internal_zzalw.setLenient(isLenient);
            return zzh;
        } catch (Throwable e) {
            valueOf = String.valueOf(com_google_android_gms_internal_zzalw);
            throw new zzakj(new StringBuilder(String.valueOf(valueOf).length() + 36).append("Failed parsing JSON source: ").append(valueOf).append(" to Json").toString(), e);
        } catch (Throwable e2) {
            valueOf = String.valueOf(com_google_android_gms_internal_zzalw);
            throw new zzakj(new StringBuilder(String.valueOf(valueOf).length() + 36).append("Failed parsing JSON source: ").append(valueOf).append(" to Json").toString(), e2);
        } catch (Throwable th) {
            com_google_android_gms_internal_zzalw.setLenient(isLenient);
        }
    }

    public zzakf zziR(String str) throws zzako {
        return zza(new StringReader(str));
    }
}
