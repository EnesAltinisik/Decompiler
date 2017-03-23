package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class zzf {
    public static final zzf zzaqS = zza((CharSequence) "\t\n\u000b\f\r     　 ᠎ ").zza(zza(' ', ' '));
    public static final zzf zzaqT = zza((CharSequence) "\t\n\u000b\f\r     　").zza(zza(' ', ' ')).zza(zza(' ', ' '));
    public static final zzf zzaqU = zza('\u0000', '');
    public static final zzf zzaqV;
    public static final zzf zzaqW = zza('\t', '\r').zza(zza('\u001c', ' ')).zza(zzc(' ')).zza(zzc('᠎')).zza(zza(' ', ' ')).zza(zza(' ', '​')).zza(zza(' ', ' ')).zza(zzc(' ')).zza(zzc('　'));
    public static final zzf zzaqX = new zzf() {
        public boolean zzd(char c) {
            return Character.isDigit(c);
        }
    };
    public static final zzf zzaqY = new zzf() {
        public boolean zzd(char c) {
            return Character.isLetter(c);
        }
    };
    public static final zzf zzaqZ = new zzf() {
        public boolean zzd(char c) {
            return Character.isLetterOrDigit(c);
        }
    };
    public static final zzf zzara = new zzf() {
        public boolean zzd(char c) {
            return Character.isUpperCase(c);
        }
    };
    public static final zzf zzarb = new zzf() {
        public boolean zzd(char c) {
            return Character.isLowerCase(c);
        }
    };
    public static final zzf zzarc = zza('\u0000', '\u001f').zza(zza('', ''));
    public static final zzf zzard = zza('\u0000', ' ').zza(zza('', ' ')).zza(zzc('­')).zza(zza('؀', '؃')).zza(zza((CharSequence) "۝܏ ឴឵᠎")).zza(zza(' ', '‏')).zza(zza(' ', ' ')).zza(zza(' ', '⁤')).zza(zza('⁪', '⁯')).zza(zzc('　')).zza(zza('?', '')).zza(zza((CharSequence) "﻿￹￺￻"));
    public static final zzf zzare = zza('\u0000', 'ӹ').zza(zzc('־')).zza(zza('א', 'ת')).zza(zzc('׳')).zza(zzc('״')).zza(zza('؀', 'ۿ')).zza(zza('ݐ', 'ݿ')).zza(zza('฀', '๿')).zza(zza('Ḁ', '₯')).zza(zza('℀', '℺')).zza(zza('ﭐ', '﷿')).zza(zza('ﹰ', '﻿')).zza(zza('｡', 'ￜ'));
    public static final zzf zzarf = new zzf() {
        public zzf zza(zzf com_google_android_gms_common_internal_zzf) {
            zzaa.zzz(com_google_android_gms_common_internal_zzf);
            return this;
        }

        public boolean zzb(CharSequence charSequence) {
            zzaa.zzz(charSequence);
            return true;
        }

        public boolean zzd(char c) {
            return true;
        }
    };
    public static final zzf zzarg = new zzf() {
        public zzf zza(zzf com_google_android_gms_common_internal_zzf) {
            return (zzf) zzaa.zzz(com_google_android_gms_common_internal_zzf);
        }

        public boolean zzb(CharSequence charSequence) {
            return charSequence.length() == 0;
        }

        public boolean zzd(char c) {
            return false;
        }
    };

    class AnonymousClass3 extends zzf {
        final /* synthetic */ char a;

        AnonymousClass3(char c) {
            this.a = c;
        }

        public zzf zza(zzf com_google_android_gms_common_internal_zzf) {
            return com_google_android_gms_common_internal_zzf.zzd(this.a) ? com_google_android_gms_common_internal_zzf : super.zza(com_google_android_gms_common_internal_zzf);
        }

        public boolean zzd(char c) {
            return c == this.a;
        }
    }

    class AnonymousClass4 extends zzf {
        final /* synthetic */ char a;
        final /* synthetic */ char b;

        AnonymousClass4(char c, char c2) {
            this.a = c;
            this.b = c2;
        }

        public boolean zzd(char c) {
            return c == this.a || c == this.b;
        }
    }

    class AnonymousClass5 extends zzf {
        final /* synthetic */ char[] a;

        AnonymousClass5(char[] cArr) {
            this.a = cArr;
        }

        public boolean zzd(char c) {
            return Arrays.binarySearch(this.a, c) >= 0;
        }
    }

    class AnonymousClass6 extends zzf {
        final /* synthetic */ char a;
        final /* synthetic */ char b;

        AnonymousClass6(char c, char c2) {
            this.a = c;
            this.b = c2;
        }

        public boolean zzd(char c) {
            return this.a <= c && c <= this.b;
        }
    }

    private static class a extends zzf {
        List<zzf> a;

        a(List<zzf> list) {
            this.a = list;
        }

        public zzf zza(zzf com_google_android_gms_common_internal_zzf) {
            List arrayList = new ArrayList(this.a);
            arrayList.add((zzf) zzaa.zzz(com_google_android_gms_common_internal_zzf));
            return new a(arrayList);
        }

        public boolean zzd(char c) {
            for (zzf zzd : this.a) {
                if (zzd.zzd(c)) {
                    return true;
                }
            }
            return false;
        }
    }

    static {
        zzf zza = zza('0', '9');
        zzf com_google_android_gms_common_internal_zzf = zza;
        for (char c : "٠۰߀०০੦૦୦௦౦೦൦๐໐༠၀႐០᠐᥆᧐᭐᮰᱀᱐꘠꣐꤀꩐０".toCharArray()) {
            com_google_android_gms_common_internal_zzf = com_google_android_gms_common_internal_zzf.zza(zza(c, (char) (c + 9)));
        }
        zzaqV = com_google_android_gms_common_internal_zzf;
    }

    public static zzf zza(char c, char c2) {
        zzaa.zzaj(c2 >= c);
        return new AnonymousClass6(c, c2);
    }

    public static zzf zza(CharSequence charSequence) {
        switch (charSequence.length()) {
            case 0:
                return zzarg;
            case 1:
                return zzc(charSequence.charAt(0));
            case 2:
                return new AnonymousClass4(charSequence.charAt(0), charSequence.charAt(1));
            default:
                char[] toCharArray = charSequence.toString().toCharArray();
                Arrays.sort(toCharArray);
                return new AnonymousClass5(toCharArray);
        }
    }

    public static zzf zzc(char c) {
        return new AnonymousClass3(c);
    }

    public zzf zza(zzf com_google_android_gms_common_internal_zzf) {
        return new a(Arrays.asList(new zzf[]{this, (zzf) zzaa.zzz(com_google_android_gms_common_internal_zzf)}));
    }

    public boolean zzb(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!zzd(charSequence.charAt(length))) {
                return false;
            }
        }
        return true;
    }

    public abstract boolean zzd(char c);
}
