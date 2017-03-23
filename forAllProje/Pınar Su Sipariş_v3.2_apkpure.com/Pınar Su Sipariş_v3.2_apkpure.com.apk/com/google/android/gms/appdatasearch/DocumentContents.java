package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class DocumentContents extends AbstractSafeParcelable {
    public static final zzb CREATOR = new zzb();
    public final Account account;
    final int mVersionCode;
    final DocumentSection[] zzZv;
    public final String zzZw;
    public final boolean zzZx;

    public static class zza {
        private boolean zzZA;
        private Account zzZB;
        private List<DocumentSection> zzZy;
        private String zzZz;

        public zza zzT(boolean z) {
            this.zzZA = z;
            return this;
        }

        public zza zza(DocumentSection documentSection) {
            if (this.zzZy == null && documentSection != null) {
                this.zzZy = new ArrayList();
            }
            if (documentSection != null) {
                this.zzZy.add(documentSection);
            }
            return this;
        }

        public zza zzb(Account account) {
            this.zzZB = account;
            return this;
        }

        public zza zzcd(String str) {
            this.zzZz = str;
            return this;
        }

        public DocumentContents zzoH() {
            return new DocumentContents(this.zzZz, this.zzZA, this.zzZB, this.zzZy != null ? (DocumentSection[]) this.zzZy.toArray(new DocumentSection[this.zzZy.size()]) : null);
        }
    }

    DocumentContents(int i, DocumentSection[] documentSectionArr, String str, boolean z, Account account) {
        this.mVersionCode = i;
        this.zzZv = documentSectionArr;
        this.zzZw = str;
        this.zzZx = z;
        this.account = account;
    }

    DocumentContents(String str, boolean z, Account account, DocumentSection... documentSectionArr) {
        this(1, documentSectionArr, str, z, account);
        if (documentSectionArr != null) {
            BitSet bitSet = new BitSet(zzh.zzoJ());
            for (DocumentSection documentSection : documentSectionArr) {
                int i = documentSection.zzZJ;
                if (i != -1) {
                    if (bitSet.get(i)) {
                        String str2 = "Duplicate global search section type ";
                        String valueOf = String.valueOf(zzh.zzaC(i));
                        throw new IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                    }
                    bitSet.set(i);
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DocumentContents)) {
            return false;
        }
        DocumentContents documentContents = (DocumentContents) obj;
        return zzz.equal(this.zzZw, documentContents.zzZw) && zzz.equal(Boolean.valueOf(this.zzZx), Boolean.valueOf(documentContents.zzZx)) && zzz.equal(this.account, documentContents.account) && Arrays.equals(zzoG(), documentContents.zzoG());
    }

    public int hashCode() {
        return zzz.hashCode(this.zzZw, Boolean.valueOf(this.zzZx), this.account, Integer.valueOf(Arrays.hashCode(this.zzZv)));
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzb com_google_android_gms_appdatasearch_zzb = CREATOR;
        zzb.zza(this, parcel, i);
    }

    public DocumentSection[] zzoG() {
        return this.zzZv;
    }
}
