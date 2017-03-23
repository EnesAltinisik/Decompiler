package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.zzaau.zza;
import org.json.JSONException;

public final class zzaas {
    public static zzaar zzbuW = new zzaar() {
        public zzaau zzC(byte[] bArr) throws zzaan {
            if (bArr == null) {
                throw new zzaan("Cannot parse a null byte[]");
            } else if (bArr.length == 0) {
                throw new zzaan("Cannot parse a 0 length byte[]");
            } else {
                try {
                    zzabc zzhg = zzaao.zzhg(new String(bArr));
                    if (zzhg != null) {
                        zzun.v("The container was successfully parsed from the resource");
                    }
                    return new zzaau(Status.zzalw, 0, new zza(zzhg), zzaas.zzbuX.zzC(bArr).zzLP());
                } catch (JSONException e) {
                    throw new zzaan("The resource data is corrupted. The container cannot be extracted from the JSON data");
                } catch (zzaan e2) {
                    throw new zzaan("The resource data is invalid. The container cannot be extracted from the JSON data");
                }
            }
        }
    };
    public static zzaar zzbuX = new zzaar() {
        public zzaau zzC(byte[] bArr) throws zzaan {
            if (bArr == null) {
                throw new zzaan("Cannot parse a null byte[]");
            } else if (bArr.length == 0) {
                throw new zzaan("Cannot parse a 0 length byte[]");
            } else {
                try {
                    zzabf zzhh = zzaao.zzhh(new String(bArr));
                    if (zzhh != null) {
                        zzun.v("The runtime configuration was successfully parsed from the resource");
                    }
                    return new zzaau(Status.zzalw, 0, null, zzhh);
                } catch (JSONException e) {
                    throw new zzaan("The resource data is corrupted. The runtime configuration cannot be extracted from the JSON data");
                } catch (zzaan e2) {
                    throw new zzaan("The resource data is invalid. The runtime  configuration cannot be extracted from the JSON data");
                }
            }
        }
    };
}
