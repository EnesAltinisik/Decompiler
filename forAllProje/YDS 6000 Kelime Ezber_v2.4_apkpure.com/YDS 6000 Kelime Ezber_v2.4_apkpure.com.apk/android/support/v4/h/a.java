package android.support.v4.h;

import android.text.SpannableStringBuilder;
import java.util.Locale;

public final class a {
    private static e a = f.c;
    private static final String b = Character.toString('‎');
    private static final String c = Character.toString('‏');
    private static final a d = new a(false, 2, a);
    private static final a e = new a(true, 2, a);
    private final boolean f;
    private final int g;
    private final e h;

    public static final class a {
        private boolean a;
        private int b;
        private e c;

        public a() {
            a(a.b(Locale.getDefault()));
        }

        private void a(boolean z) {
            this.a = z;
            this.c = a.a;
            this.b = 2;
        }

        private static a b(boolean z) {
            return z ? a.e : a.d;
        }

        public a a() {
            return (this.b == 2 && this.c == a.a) ? b(this.a) : new a(this.a, this.b, this.c);
        }
    }

    private static class b {
        private static final byte[] a = new byte[1792];
        private final CharSequence b;
        private final boolean c;
        private final int d;
        private int e;
        private char f;

        static {
            for (int i = 0; i < 1792; i++) {
                a[i] = Character.getDirectionality(i);
            }
        }

        b(CharSequence charSequence, boolean z) {
            this.b = charSequence;
            this.c = z;
            this.d = charSequence.length();
        }

        private static byte a(char c) {
            return c < '܀' ? a[c] : Character.getDirectionality(c);
        }

        private byte e() {
            int i = this.e;
            while (this.e < this.d) {
                CharSequence charSequence = this.b;
                int i2 = this.e;
                this.e = i2 + 1;
                this.f = charSequence.charAt(i2);
                if (this.f == '>') {
                    return (byte) 12;
                }
                if (this.f == '\"' || this.f == '\'') {
                    char c = this.f;
                    while (this.e < this.d) {
                        CharSequence charSequence2 = this.b;
                        int i3 = this.e;
                        this.e = i3 + 1;
                        char charAt = charSequence2.charAt(i3);
                        this.f = charAt;
                        if (charAt == c) {
                            break;
                        }
                    }
                }
            }
            this.e = i;
            this.f = '<';
            return (byte) 13;
        }

        private byte f() {
            int i = this.e;
            while (this.e > 0) {
                CharSequence charSequence = this.b;
                int i2 = this.e - 1;
                this.e = i2;
                this.f = charSequence.charAt(i2);
                if (this.f == '<') {
                    return (byte) 12;
                }
                if (this.f == '>') {
                    break;
                } else if (this.f == '\"' || this.f == '\'') {
                    char c = this.f;
                    while (this.e > 0) {
                        CharSequence charSequence2 = this.b;
                        int i3 = this.e - 1;
                        this.e = i3;
                        char charAt = charSequence2.charAt(i3);
                        this.f = charAt;
                        if (charAt == c) {
                            break;
                        }
                    }
                }
            }
            this.e = i;
            this.f = '>';
            return (byte) 13;
        }

        private byte g() {
            while (this.e < this.d) {
                CharSequence charSequence = this.b;
                int i = this.e;
                this.e = i + 1;
                char charAt = charSequence.charAt(i);
                this.f = charAt;
                if (charAt == ';') {
                    break;
                }
            }
            return (byte) 12;
        }

        private byte h() {
            int i = this.e;
            while (this.e > 0) {
                CharSequence charSequence = this.b;
                int i2 = this.e - 1;
                this.e = i2;
                this.f = charSequence.charAt(i2);
                if (this.f != '&') {
                    if (this.f == ';') {
                        break;
                    }
                }
                return (byte) 12;
            }
            this.e = i;
            this.f = ';';
            return (byte) 13;
        }

        int a() {
            this.e = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (this.e < this.d && i == 0) {
                switch (c()) {
                    case (byte) 0:
                        if (i3 != 0) {
                            i = i3;
                            break;
                        }
                        return -1;
                    case (byte) 1:
                    case (byte) 2:
                        if (i3 != 0) {
                            i = i3;
                            break;
                        }
                        return 1;
                    case (byte) 9:
                        break;
                    case (byte) 14:
                    case (byte) 15:
                        i3++;
                        i2 = -1;
                        break;
                    case (byte) 16:
                    case (byte) 17:
                        i3++;
                        i2 = 1;
                        break;
                    case (byte) 18:
                        i3--;
                        i2 = 0;
                        break;
                    default:
                        i = i3;
                        break;
                }
            }
            if (i == 0) {
                return 0;
            }
            if (i2 != 0) {
                return i2;
            }
            while (this.e > 0) {
                switch (d()) {
                    case (byte) 14:
                    case (byte) 15:
                        if (i != i3) {
                            i3--;
                            break;
                        }
                        return -1;
                    case (byte) 16:
                    case (byte) 17:
                        if (i != i3) {
                            i3--;
                            break;
                        }
                        return 1;
                    case (byte) 18:
                        i3++;
                        break;
                    default:
                        break;
                }
            }
            return 0;
        }

        int b() {
            this.e = this.d;
            int i = 0;
            int i2 = 0;
            while (this.e > 0) {
                switch (d()) {
                    case (byte) 0:
                        if (i2 != 0) {
                            if (i != 0) {
                                break;
                            }
                            i = i2;
                            break;
                        }
                        return -1;
                    case (byte) 1:
                    case (byte) 2:
                        if (i2 != 0) {
                            if (i != 0) {
                                break;
                            }
                            i = i2;
                            break;
                        }
                        return 1;
                    case (byte) 9:
                        break;
                    case (byte) 14:
                    case (byte) 15:
                        if (i != i2) {
                            i2--;
                            break;
                        }
                        return -1;
                    case (byte) 16:
                    case (byte) 17:
                        if (i != i2) {
                            i2--;
                            break;
                        }
                        return 1;
                    case (byte) 18:
                        i2++;
                        break;
                    default:
                        if (i != 0) {
                            break;
                        }
                        i = i2;
                        break;
                }
            }
            return 0;
        }

        byte c() {
            this.f = this.b.charAt(this.e);
            if (Character.isHighSurrogate(this.f)) {
                int codePointAt = Character.codePointAt(this.b, this.e);
                this.e += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.e++;
            byte a = a(this.f);
            return this.c ? this.f == '<' ? e() : this.f == '&' ? g() : a : a;
        }

        byte d() {
            this.f = this.b.charAt(this.e - 1);
            if (Character.isLowSurrogate(this.f)) {
                int codePointBefore = Character.codePointBefore(this.b, this.e);
                this.e -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.e--;
            byte a = a(this.f);
            return this.c ? this.f == '>' ? f() : this.f == ';' ? h() : a : a;
        }
    }

    private a(boolean z, int i, e eVar) {
        this.f = z;
        this.g = i;
        this.h = eVar;
    }

    public static a a() {
        return new a().a();
    }

    private String a(CharSequence charSequence, e eVar) {
        boolean a = eVar.a(charSequence, 0, charSequence.length());
        return (this.f || !(a || b(charSequence) == 1)) ? (!this.f || (a && b(charSequence) != -1)) ? "" : c : b;
    }

    private static int b(CharSequence charSequence) {
        return new b(charSequence, false).b();
    }

    private String b(CharSequence charSequence, e eVar) {
        boolean a = eVar.a(charSequence, 0, charSequence.length());
        return (this.f || !(a || c(charSequence) == 1)) ? (!this.f || (a && c(charSequence) != -1)) ? "" : c : b;
    }

    private static boolean b(Locale locale) {
        return g.a(locale) == 1;
    }

    private static int c(CharSequence charSequence) {
        return new b(charSequence, false).a();
    }

    public CharSequence a(CharSequence charSequence) {
        return a(charSequence, this.h, true);
    }

    public CharSequence a(CharSequence charSequence, e eVar, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean a = eVar.a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (b() && z) {
            spannableStringBuilder.append(b(charSequence, a ? f.b : f.a));
        }
        if (a != this.f) {
            spannableStringBuilder.append(a ? '‫' : '‪');
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append('‬');
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            spannableStringBuilder.append(a(charSequence, a ? f.b : f.a));
        }
        return spannableStringBuilder;
    }

    public boolean b() {
        return (this.g & 2) != 0;
    }
}
