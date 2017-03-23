package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

public final class PasswordSpecification extends AbstractSafeParcelable {
    public static final zzf CREATOR = new zzf();
    public static final PasswordSpecification zzabL = new zza().zzj(12, 16).zzck("abcdefghijkmnopqrstxyzABCDEFGHJKLMNPQRSTXY3456789").zze("abcdefghijkmnopqrstxyz", 1).zze("ABCDEFGHJKLMNPQRSTXY", 1).zze("3456789", 1).zzoZ();
    public static final PasswordSpecification zzabM = new zza().zzj(12, 16).zzck("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890").zze("abcdefghijklmnopqrstuvwxyz", 1).zze("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 1).zze("1234567890", 1).zzoZ();
    final int mVersionCode;
    final String zzabN;
    final List<String> zzabO;
    final List<Integer> zzabP;
    final int zzabQ;
    final int zzabR;
    private final int[] zzabS = zzoY();
    private final Random zzvQ = new SecureRandom();

    public static class zza {
        private final List<String> zzabO = new ArrayList();
        private final List<Integer> zzabP = new ArrayList();
        private int zzabQ = 12;
        private int zzabR = 16;
        private final TreeSet<Character> zzabT = new TreeSet();

        private void zzpa() {
            int i = 0;
            for (Integer intValue : this.zzabP) {
                i = intValue.intValue() + i;
            }
            if (i > this.zzabR) {
                throw new zzb("required character count cannot be greater than the max password size");
            }
        }

        private void zzpb() {
            boolean[] zArr = new boolean[95];
            for (String toCharArray : this.zzabO) {
                for (char c : toCharArray.toCharArray()) {
                    if (zArr[c - 32]) {
                        throw new zzb("character " + c + " occurs in more than one required character set");
                    }
                    zArr[c - 32] = true;
                }
            }
        }

        private TreeSet<Character> zzu(String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                throw new zzb(String.valueOf(str2).concat(" cannot be null or empty"));
            }
            TreeSet<Character> treeSet = new TreeSet();
            for (char c : str.toCharArray()) {
                if (PasswordSpecification.zzb(c, 32, 126)) {
                    throw new zzb(String.valueOf(str2).concat(" must only contain ASCII printable characters"));
                }
                treeSet.add(Character.valueOf(c));
            }
            return treeSet;
        }

        public zza zzck(String str) {
            this.zzabT.addAll(zzu(str, "allowedChars"));
            return this;
        }

        public zza zze(String str, int i) {
            if (i < 1) {
                throw new zzb("count must be at least 1");
            }
            this.zzabO.add(PasswordSpecification.zzb(zzu(str, "requiredChars")));
            this.zzabP.add(Integer.valueOf(i));
            return this;
        }

        public zza zzj(int i, int i2) {
            if (i < 1) {
                throw new zzb("minimumSize must be at least 1");
            } else if (i > i2) {
                throw new zzb("maximumSize must be greater than or equal to minimumSize");
            } else {
                this.zzabQ = i;
                this.zzabR = i2;
                return this;
            }
        }

        public PasswordSpecification zzoZ() {
            if (this.zzabT.isEmpty()) {
                throw new zzb("no allowed characters specified");
            }
            zzpa();
            zzpb();
            return new PasswordSpecification(1, PasswordSpecification.zzb(this.zzabT), this.zzabO, this.zzabP, this.zzabQ, this.zzabR);
        }
    }

    public static class zzb extends Error {
        public zzb(String str) {
            super(str);
        }
    }

    PasswordSpecification(int i, String str, List<String> list, List<Integer> list2, int i2, int i3) {
        this.mVersionCode = i;
        this.zzabN = str;
        this.zzabO = Collections.unmodifiableList(list);
        this.zzabP = Collections.unmodifiableList(list2);
        this.zzabQ = i2;
        this.zzabR = i3;
    }

    private int zza(char c) {
        return c - 32;
    }

    private static String zzb(Collection<Character> collection) {
        char[] cArr = new char[collection.size()];
        int i = 0;
        for (Character charValue : collection) {
            int i2 = i + 1;
            cArr[i] = charValue.charValue();
            i = i2;
        }
        return new String(cArr);
    }

    private static boolean zzb(int i, int i2, int i3) {
        return i < i2 || i > i3;
    }

    private int[] zzoY() {
        int[] iArr = new int[95];
        Arrays.fill(iArr, -1);
        int i = 0;
        for (String toCharArray : this.zzabO) {
            for (char zza : toCharArray.toCharArray()) {
                iArr[zza(zza)] = i;
            }
            i++;
        }
        return iArr;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzf.zza(this, parcel, i);
    }
}
