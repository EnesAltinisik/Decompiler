package com.google.android.gms.internal;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;

public class zzalw implements Closeable {
    private static final char[] zzbZl = ")]}'\n".toCharArray();
    private final Reader in;
    private int pos = 0;
    private int zzbQl = 0;
    private boolean zzbZm = false;
    private final char[] zzbZn = new char[1024];
    private int zzbZo = 0;
    private int zzbZp = 0;
    private int zzbZq = 0;
    private long zzbZr;
    private int zzbZs;
    private String zzbZt;
    private int[] zzbZu = new int[32];
    private int zzbZv = 0;
    private String[] zzbZw;
    private int[] zzbZx;

    static {
        zzalb.zzbXe = new zzalb() {
            public void zzi(zzalw com_google_android_gms_internal_zzalw) throws IOException {
                if (com_google_android_gms_internal_zzalw instanceof zzalm) {
                    ((zzalm) com_google_android_gms_internal_zzalw).zzWd();
                    return;
                }
                int zzG = com_google_android_gms_internal_zzalw.zzbZq;
                if (zzG == 0) {
                    zzG = com_google_android_gms_internal_zzalw.zzWn();
                }
                if (zzG == 13) {
                    com_google_android_gms_internal_zzalw.zzbZq = 9;
                } else if (zzG == 12) {
                    com_google_android_gms_internal_zzalw.zzbZq = 8;
                } else if (zzG == 14) {
                    com_google_android_gms_internal_zzalw.zzbZq = 10;
                } else {
                    String valueOf = String.valueOf(com_google_android_gms_internal_zzalw.zzWa());
                    int zzI = com_google_android_gms_internal_zzalw.getLineNumber();
                    int zzJ = com_google_android_gms_internal_zzalw.getColumnNumber();
                    String path = com_google_android_gms_internal_zzalw.getPath();
                    throw new IllegalStateException(new StringBuilder((String.valueOf(valueOf).length() + 70) + String.valueOf(path).length()).append("Expected a name but was ").append(valueOf).append(" ").append(" at line ").append(zzI).append(" column ").append(zzJ).append(" path ").append(path).toString());
                }
            }
        };
    }

    public zzalw(Reader reader) {
        int[] iArr = this.zzbZu;
        int i = this.zzbZv;
        this.zzbZv = i + 1;
        iArr[i] = 6;
        this.zzbZw = new String[32];
        this.zzbZx = new int[32];
        if (reader == null) {
            throw new NullPointerException("in == null");
        }
        this.in = reader;
    }

    private int getColumnNumber() {
        return (this.pos - this.zzbZp) + 1;
    }

    private int getLineNumber() {
        return this.zzbZo + 1;
    }

    private int zzWn() throws IOException {
        int zzaY;
        int i = this.zzbZu[this.zzbZv - 1];
        if (i == 1) {
            this.zzbZu[this.zzbZv - 1] = 2;
        } else if (i == 2) {
            switch (zzaY(true)) {
                case 44:
                    break;
                case 59:
                    zzWs();
                    break;
                case 93:
                    this.zzbZq = 4;
                    return 4;
                default:
                    throw zziW("Unterminated array");
            }
        } else if (i == 3 || i == 5) {
            this.zzbZu[this.zzbZv - 1] = 4;
            if (i == 5) {
                switch (zzaY(true)) {
                    case 44:
                        break;
                    case 59:
                        zzWs();
                        break;
                    case 125:
                        this.zzbZq = 2;
                        return 2;
                    default:
                        throw zziW("Unterminated object");
                }
            }
            zzaY = zzaY(true);
            switch (zzaY) {
                case 34:
                    this.zzbZq = 13;
                    return 13;
                case 39:
                    zzWs();
                    this.zzbZq = 12;
                    return 12;
                case 125:
                    if (i != 5) {
                        this.zzbZq = 2;
                        return 2;
                    }
                    throw zziW("Expected name");
                default:
                    zzWs();
                    this.pos--;
                    if (zze((char) zzaY)) {
                        this.zzbZq = 14;
                        return 14;
                    }
                    throw zziW("Expected name");
            }
        } else if (i == 4) {
            this.zzbZu[this.zzbZv - 1] = 5;
            switch (zzaY(true)) {
                case 58:
                    break;
                case 61:
                    zzWs();
                    if ((this.pos < this.zzbQl || zznR(1)) && this.zzbZn[this.pos] == '>') {
                        this.pos++;
                        break;
                    }
                default:
                    throw zziW("Expected ':'");
            }
        } else if (i == 6) {
            if (this.zzbZm) {
                zzWv();
            }
            this.zzbZu[this.zzbZv - 1] = 7;
        } else if (i == 7) {
            if (zzaY(false) == -1) {
                this.zzbZq = 17;
                return 17;
            }
            zzWs();
            this.pos--;
        } else if (i == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        switch (zzaY(true)) {
            case 34:
                if (this.zzbZv == 1) {
                    zzWs();
                }
                this.zzbZq = 9;
                return 9;
            case 39:
                zzWs();
                this.zzbZq = 8;
                return 8;
            case 44:
            case 59:
                break;
            case 91:
                this.zzbZq = 3;
                return 3;
            case 93:
                if (i == 1) {
                    this.zzbZq = 4;
                    return 4;
                }
                break;
            case 123:
                this.zzbZq = 1;
                return 1;
            default:
                this.pos--;
                if (this.zzbZv == 1) {
                    zzWs();
                }
                zzaY = zzWo();
                if (zzaY != 0) {
                    return zzaY;
                }
                zzaY = zzWp();
                if (zzaY != 0) {
                    return zzaY;
                }
                if (zze(this.zzbZn[this.pos])) {
                    zzWs();
                    this.zzbZq = 10;
                    return 10;
                }
                throw zziW("Expected value");
        }
        if (i == 1 || i == 2) {
            zzWs();
            this.pos--;
            this.zzbZq = 7;
            return 7;
        }
        throw zziW("Unexpected value");
    }

    private int zzWo() throws IOException {
        String str;
        int i;
        char c = this.zzbZn[this.pos];
        String str2;
        if (c == 't' || c == 'T') {
            str = "true";
            str2 = "TRUE";
            i = 5;
        } else if (c == 'f' || c == 'F') {
            str = "false";
            str2 = "FALSE";
            i = 6;
        } else if (c != 'n' && c != 'N') {
            return 0;
        } else {
            str = "null";
            str2 = "NULL";
            i = 7;
        }
        int length = str.length();
        int i2 = 1;
        while (i2 < length) {
            if (this.pos + i2 >= this.zzbQl && !zznR(i2 + 1)) {
                return 0;
            }
            char c2 = this.zzbZn[this.pos + i2];
            if (c2 != str.charAt(i2) && c2 != r1.charAt(i2)) {
                return 0;
            }
            i2++;
        }
        if ((this.pos + length < this.zzbQl || zznR(length + 1)) && zze(this.zzbZn[this.pos + length])) {
            return 0;
        }
        this.pos += length;
        this.zzbZq = i;
        return i;
    }

    private int zzWp() throws IOException {
        char[] cArr = this.zzbZn;
        int i = this.pos;
        long j = 0;
        Object obj = null;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        int i5 = this.zzbQl;
        int i6 = i;
        while (true) {
            Object obj2;
            if (i6 + i4 == i5) {
                if (i4 == cArr.length) {
                    return 0;
                }
                if (zznR(i4 + 1)) {
                    i6 = this.pos;
                    i5 = this.zzbQl;
                } else if (i3 != 2 && i2 != 0 && (j != Long.MIN_VALUE || obj != null)) {
                    if (obj == null) {
                        j = -j;
                    }
                    this.zzbZr = j;
                    this.pos += i4;
                    this.zzbZq = 15;
                    return 15;
                } else if (i3 == 2 && i3 != 4 && i3 != 7) {
                    return 0;
                } else {
                    this.zzbZs = i4;
                    this.zzbZq = 16;
                    return 16;
                }
            }
            char c = cArr[i6 + i4];
            int i7;
            switch (c) {
                case '+':
                    if (i3 != 5) {
                        return 0;
                    }
                    i = 6;
                    i3 = i2;
                    obj2 = obj;
                    continue;
                case '-':
                    if (i3 == 0) {
                        i = 1;
                        i7 = i2;
                        obj2 = 1;
                        i3 = i7;
                        continue;
                    } else if (i3 == 5) {
                        i = 6;
                        i3 = i2;
                        obj2 = obj;
                        break;
                    } else {
                        return 0;
                    }
                case '.':
                    if (i3 != 2) {
                        return 0;
                    }
                    i = 3;
                    i3 = i2;
                    obj2 = obj;
                    continue;
                case 'E':
                case 'e':
                    if (i3 != 2 && i3 != 4) {
                        return 0;
                    }
                    i = 5;
                    i3 = i2;
                    obj2 = obj;
                    continue;
                default:
                    if (c >= '0' && c <= '9') {
                        if (i3 != 1 && i3 != 0) {
                            if (i3 != 2) {
                                if (i3 != 3) {
                                    if (i3 != 5 && i3 != 6) {
                                        i = i3;
                                        i3 = i2;
                                        obj2 = obj;
                                        break;
                                    }
                                    i = 7;
                                    i3 = i2;
                                    obj2 = obj;
                                    break;
                                }
                                i = 4;
                                i3 = i2;
                                obj2 = obj;
                                break;
                            } else if (j != 0) {
                                long j2 = (10 * j) - ((long) (c - 48));
                                i = (j > -922337203685477580L || (j == -922337203685477580L && j2 < j)) ? 1 : 0;
                                i &= i2;
                                obj2 = obj;
                                j = j2;
                                i7 = i3;
                                i3 = i;
                                i = i7;
                                break;
                            } else {
                                return 0;
                            }
                        }
                        j = (long) (-(c - 48));
                        i = 2;
                        i3 = i2;
                        obj2 = obj;
                        continue;
                    } else if (zze(c)) {
                        return 0;
                    }
                    break;
            }
            if (i3 != 2) {
            }
            if (i3 == 2) {
            }
            this.zzbZs = i4;
            this.zzbZq = 16;
            return 16;
            i4++;
            obj = obj2;
            i2 = i3;
            i3 = i;
        }
    }

    private String zzWq() throws IOException {
        StringBuilder stringBuilder = null;
        int i = 0;
        while (true) {
            String str;
            if (this.pos + i < this.zzbQl) {
                switch (this.zzbZn[this.pos + i]) {
                    case '\t':
                    case '\n':
                    case '\f':
                    case '\r':
                    case ' ':
                    case ',':
                    case ':':
                    case '[':
                    case ']':
                    case '{':
                    case '}':
                        break;
                    case '#':
                    case '/':
                    case ';':
                    case '=':
                    case '\\':
                        zzWs();
                        break;
                    default:
                        i++;
                        continue;
                }
            } else if (i >= this.zzbZn.length) {
                if (stringBuilder == null) {
                    stringBuilder = new StringBuilder();
                }
                stringBuilder.append(this.zzbZn, this.pos, i);
                this.pos = i + this.pos;
                i = !zznR(1) ? 0 : 0;
            } else if (zznR(i + 1)) {
            }
            if (stringBuilder == null) {
                str = new String(this.zzbZn, this.pos, i);
            } else {
                stringBuilder.append(this.zzbZn, this.pos, i);
                str = stringBuilder.toString();
            }
            this.pos = i + this.pos;
            return str;
        }
    }

    private void zzWr() throws IOException {
        do {
            int i = 0;
            while (this.pos + i < this.zzbQl) {
                switch (this.zzbZn[this.pos + i]) {
                    case '\t':
                    case '\n':
                    case '\f':
                    case '\r':
                    case ' ':
                    case ',':
                    case ':':
                    case '[':
                    case ']':
                    case '{':
                    case '}':
                        break;
                    case '#':
                    case '/':
                    case ';':
                    case '=':
                    case '\\':
                        zzWs();
                        break;
                    default:
                        i++;
                }
                this.pos = i + this.pos;
                return;
            }
            this.pos = i + this.pos;
        } while (zznR(1));
    }

    private void zzWs() throws IOException {
        if (!this.zzbZm) {
            throw zziW("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void zzWt() throws IOException {
        char c;
        do {
            if (this.pos < this.zzbQl || zznR(1)) {
                char[] cArr = this.zzbZn;
                int i = this.pos;
                this.pos = i + 1;
                c = cArr[i];
                if (c == '\n') {
                    this.zzbZo++;
                    this.zzbZp = this.pos;
                    return;
                }
            } else {
                return;
            }
        } while (c != '\r');
    }

    private char zzWu() throws IOException {
        if (this.pos != this.zzbQl || zznR(1)) {
            char[] cArr = this.zzbZn;
            int i = this.pos;
            this.pos = i + 1;
            char c = cArr[i];
            switch (c) {
                case '\n':
                    this.zzbZo++;
                    this.zzbZp = this.pos;
                    return c;
                case 'b':
                    return '\b';
                case 'f':
                    return '\f';
                case 'n':
                    return '\n';
                case 'r':
                    return '\r';
                case 't':
                    return '\t';
                case 'u':
                    if (this.pos + 4 <= this.zzbQl || zznR(4)) {
                        int i2 = this.pos;
                        int i3 = i2 + 4;
                        int i4 = i2;
                        c = '\u0000';
                        for (i = i4; i < i3; i++) {
                            char c2 = this.zzbZn[i];
                            c = (char) (c << 4);
                            if (c2 >= '0' && c2 <= '9') {
                                c = (char) (c + (c2 - 48));
                            } else if (c2 >= 'a' && c2 <= 'f') {
                                c = (char) (c + ((c2 - 97) + 10));
                            } else if (c2 < 'A' || c2 > 'F') {
                                String str = "\\u";
                                String valueOf = String.valueOf(new String(this.zzbZn, this.pos, 4));
                                throw new NumberFormatException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                            } else {
                                c = (char) (c + ((c2 - 65) + 10));
                            }
                        }
                        this.pos += 4;
                        return c;
                    }
                    throw zziW("Unterminated escape sequence");
                default:
                    return c;
            }
        }
        throw zziW("Unterminated escape sequence");
    }

    private void zzWv() throws IOException {
        zzaY(true);
        this.pos--;
        if (this.pos + zzbZl.length <= this.zzbQl || zznR(zzbZl.length)) {
            int i = 0;
            while (i < zzbZl.length) {
                if (this.zzbZn[this.pos + i] == zzbZl[i]) {
                    i++;
                } else {
                    return;
                }
            }
            this.pos += zzbZl.length;
        }
    }

    private int zzaY(boolean z) throws IOException {
        char[] cArr = this.zzbZn;
        int i = this.pos;
        int i2 = this.zzbQl;
        while (true) {
            int lineNumber;
            if (i == i2) {
                this.pos = i;
                if (zznR(1)) {
                    i = this.pos;
                    i2 = this.zzbQl;
                } else if (!z) {
                    return -1;
                } else {
                    String valueOf = String.valueOf("End of input at line ");
                    lineNumber = getLineNumber();
                    throw new EOFException(new StringBuilder(String.valueOf(valueOf).length() + 30).append(valueOf).append(lineNumber).append(" column ").append(getColumnNumber()).toString());
                }
            }
            lineNumber = i + 1;
            char c = cArr[i];
            if (c == '\n') {
                this.zzbZo++;
                this.zzbZp = lineNumber;
                i = lineNumber;
            } else if (c == ' ' || c == '\r') {
                i = lineNumber;
            } else if (c == '\t') {
                i = lineNumber;
            } else if (c == '/') {
                this.pos = lineNumber;
                if (lineNumber == i2) {
                    this.pos--;
                    boolean zznR = zznR(2);
                    this.pos++;
                    if (!zznR) {
                        return c;
                    }
                }
                zzWs();
                switch (cArr[this.pos]) {
                    case '*':
                        this.pos++;
                        if (zziV("*/")) {
                            i = this.pos + 2;
                            i2 = this.zzbQl;
                            break;
                        }
                        throw zziW("Unterminated comment");
                    case '/':
                        this.pos++;
                        zzWt();
                        i = this.pos;
                        i2 = this.zzbQl;
                        break;
                    default:
                        return c;
                }
            } else if (c == '#') {
                this.pos = lineNumber;
                zzWs();
                zzWt();
                i = this.pos;
                i2 = this.zzbQl;
            } else {
                this.pos = lineNumber;
                return c;
            }
        }
    }

    private boolean zze(char c) throws IOException {
        switch (c) {
            case '\t':
            case '\n':
            case '\f':
            case '\r':
            case ' ':
            case ',':
            case ':':
            case '[':
            case ']':
            case '{':
            case '}':
                break;
            case '#':
            case '/':
            case ';':
            case '=':
            case '\\':
                zzWs();
                break;
            default:
                return true;
        }
        return false;
    }

    private String zzf(char c) throws IOException {
        char[] cArr = this.zzbZn;
        StringBuilder stringBuilder = new StringBuilder();
        do {
            int i = this.pos;
            int i2 = this.zzbQl;
            int i3 = i;
            while (i3 < i2) {
                int i4 = i3 + 1;
                char c2 = cArr[i3];
                if (c2 == c) {
                    this.pos = i4;
                    stringBuilder.append(cArr, i, (i4 - i) - 1);
                    return stringBuilder.toString();
                }
                if (c2 == '\\') {
                    this.pos = i4;
                    stringBuilder.append(cArr, i, (i4 - i) - 1);
                    stringBuilder.append(zzWu());
                    i = this.pos;
                    i2 = this.zzbQl;
                    i4 = i;
                } else if (c2 == '\n') {
                    this.zzbZo++;
                    this.zzbZp = i4;
                }
                i3 = i4;
            }
            stringBuilder.append(cArr, i, i3 - i);
            this.pos = i3;
        } while (zznR(1));
        throw zziW("Unterminated string");
    }

    private void zzg(char c) throws IOException {
        char[] cArr = this.zzbZn;
        do {
            int i = this.pos;
            int i2 = this.zzbQl;
            int i3 = i;
            while (i3 < i2) {
                i = i3 + 1;
                char c2 = cArr[i3];
                if (c2 == c) {
                    this.pos = i;
                    return;
                }
                if (c2 == '\\') {
                    this.pos = i;
                    zzWu();
                    i = this.pos;
                    i2 = this.zzbQl;
                } else if (c2 == '\n') {
                    this.zzbZo++;
                    this.zzbZp = i;
                }
                i3 = i;
            }
            this.pos = i3;
        } while (zznR(1));
        throw zziW("Unterminated string");
    }

    private boolean zziV(String str) throws IOException {
        while (true) {
            if (this.pos + str.length() > this.zzbQl && !zznR(str.length())) {
                return false;
            }
            if (this.zzbZn[this.pos] == '\n') {
                this.zzbZo++;
                this.zzbZp = this.pos + 1;
            } else {
                int i = 0;
                while (i < str.length()) {
                    if (this.zzbZn[this.pos + i] == str.charAt(i)) {
                        i++;
                    }
                }
                return true;
            }
            this.pos++;
        }
    }

    private IOException zziW(String str) throws IOException {
        int lineNumber = getLineNumber();
        int columnNumber = getColumnNumber();
        String path = getPath();
        throw new zzalz(new StringBuilder((String.valueOf(str).length() + 45) + String.valueOf(path).length()).append(str).append(" at line ").append(lineNumber).append(" column ").append(columnNumber).append(" path ").append(path).toString());
    }

    private void zznQ(int i) {
        if (this.zzbZv == this.zzbZu.length) {
            Object obj = new int[(this.zzbZv * 2)];
            Object obj2 = new int[(this.zzbZv * 2)];
            Object obj3 = new String[(this.zzbZv * 2)];
            System.arraycopy(this.zzbZu, 0, obj, 0, this.zzbZv);
            System.arraycopy(this.zzbZx, 0, obj2, 0, this.zzbZv);
            System.arraycopy(this.zzbZw, 0, obj3, 0, this.zzbZv);
            this.zzbZu = obj;
            this.zzbZx = obj2;
            this.zzbZw = obj3;
        }
        int[] iArr = this.zzbZu;
        int i2 = this.zzbZv;
        this.zzbZv = i2 + 1;
        iArr[i2] = i;
    }

    private boolean zznR(int i) throws IOException {
        Object obj = this.zzbZn;
        this.zzbZp -= this.pos;
        if (this.zzbQl != this.pos) {
            this.zzbQl -= this.pos;
            System.arraycopy(obj, this.pos, obj, 0, this.zzbQl);
        } else {
            this.zzbQl = 0;
        }
        this.pos = 0;
        do {
            int read = this.in.read(obj, this.zzbQl, obj.length - this.zzbQl);
            if (read == -1) {
                return false;
            }
            this.zzbQl = read + this.zzbQl;
            if (this.zzbZo == 0 && this.zzbZp == 0 && this.zzbQl > 0 && obj[0] == '﻿') {
                this.pos++;
                this.zzbZp++;
                i++;
            }
        } while (this.zzbQl < i);
        return true;
    }

    public void beginArray() throws IOException {
        int i = this.zzbZq;
        if (i == 0) {
            i = zzWn();
        }
        if (i == 3) {
            zznQ(1);
            this.zzbZx[this.zzbZv - 1] = 0;
            this.zzbZq = 0;
            return;
        }
        String valueOf = String.valueOf(zzWa());
        int lineNumber = getLineNumber();
        int columnNumber = getColumnNumber();
        String path = getPath();
        throw new IllegalStateException(new StringBuilder((String.valueOf(valueOf).length() + 74) + String.valueOf(path).length()).append("Expected BEGIN_ARRAY but was ").append(valueOf).append(" at line ").append(lineNumber).append(" column ").append(columnNumber).append(" path ").append(path).toString());
    }

    public void beginObject() throws IOException {
        int i = this.zzbZq;
        if (i == 0) {
            i = zzWn();
        }
        if (i == 1) {
            zznQ(3);
            this.zzbZq = 0;
            return;
        }
        String valueOf = String.valueOf(zzWa());
        int lineNumber = getLineNumber();
        int columnNumber = getColumnNumber();
        String path = getPath();
        throw new IllegalStateException(new StringBuilder((String.valueOf(valueOf).length() + 75) + String.valueOf(path).length()).append("Expected BEGIN_OBJECT but was ").append(valueOf).append(" at line ").append(lineNumber).append(" column ").append(columnNumber).append(" path ").append(path).toString());
    }

    public void close() throws IOException {
        this.zzbZq = 0;
        this.zzbZu[0] = 8;
        this.zzbZv = 1;
        this.in.close();
    }

    public void endArray() throws IOException {
        int i = this.zzbZq;
        if (i == 0) {
            i = zzWn();
        }
        if (i == 4) {
            this.zzbZv--;
            int[] iArr = this.zzbZx;
            int i2 = this.zzbZv - 1;
            iArr[i2] = iArr[i2] + 1;
            this.zzbZq = 0;
            return;
        }
        String valueOf = String.valueOf(zzWa());
        int lineNumber = getLineNumber();
        int columnNumber = getColumnNumber();
        String path = getPath();
        throw new IllegalStateException(new StringBuilder((String.valueOf(valueOf).length() + 72) + String.valueOf(path).length()).append("Expected END_ARRAY but was ").append(valueOf).append(" at line ").append(lineNumber).append(" column ").append(columnNumber).append(" path ").append(path).toString());
    }

    public void endObject() throws IOException {
        int i = this.zzbZq;
        if (i == 0) {
            i = zzWn();
        }
        if (i == 2) {
            this.zzbZv--;
            this.zzbZw[this.zzbZv] = null;
            int[] iArr = this.zzbZx;
            int i2 = this.zzbZv - 1;
            iArr[i2] = iArr[i2] + 1;
            this.zzbZq = 0;
            return;
        }
        String valueOf = String.valueOf(zzWa());
        int lineNumber = getLineNumber();
        int columnNumber = getColumnNumber();
        String path = getPath();
        throw new IllegalStateException(new StringBuilder((String.valueOf(valueOf).length() + 73) + String.valueOf(path).length()).append("Expected END_OBJECT but was ").append(valueOf).append(" at line ").append(lineNumber).append(" column ").append(columnNumber).append(" path ").append(path).toString());
    }

    public String getPath() {
        StringBuilder append = new StringBuilder().append('$');
        int i = this.zzbZv;
        for (int i2 = 0; i2 < i; i2++) {
            switch (this.zzbZu[i2]) {
                case 1:
                case 2:
                    append.append('[').append(this.zzbZx[i2]).append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    append.append('.');
                    if (this.zzbZw[i2] == null) {
                        break;
                    }
                    append.append(this.zzbZw[i2]);
                    break;
                default:
                    break;
            }
        }
        return append.toString();
    }

    public boolean hasNext() throws IOException {
        int i = this.zzbZq;
        if (i == 0) {
            i = zzWn();
        }
        return (i == 2 || i == 4) ? false : true;
    }

    public final boolean isLenient() {
        return this.zzbZm;
    }

    public boolean nextBoolean() throws IOException {
        int i = this.zzbZq;
        if (i == 0) {
            i = zzWn();
        }
        if (i == 5) {
            this.zzbZq = 0;
            int[] iArr = this.zzbZx;
            i = this.zzbZv - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        } else if (i == 6) {
            this.zzbZq = 0;
            int[] iArr2 = this.zzbZx;
            r2 = this.zzbZv - 1;
            iArr2[r2] = iArr2[r2] + 1;
            return false;
        } else {
            String valueOf = String.valueOf(zzWa());
            r2 = getLineNumber();
            int columnNumber = getColumnNumber();
            String path = getPath();
            throw new IllegalStateException(new StringBuilder((String.valueOf(valueOf).length() + 72) + String.valueOf(path).length()).append("Expected a boolean but was ").append(valueOf).append(" at line ").append(r2).append(" column ").append(columnNumber).append(" path ").append(path).toString());
        }
    }

    public double nextDouble() throws IOException {
        int i = this.zzbZq;
        if (i == 0) {
            i = zzWn();
        }
        if (i == 15) {
            this.zzbZq = 0;
            int[] iArr = this.zzbZx;
            int i2 = this.zzbZv - 1;
            iArr[i2] = iArr[i2] + 1;
            return (double) this.zzbZr;
        }
        if (i == 16) {
            this.zzbZt = new String(this.zzbZn, this.pos, this.zzbZs);
            this.pos += this.zzbZs;
        } else if (i == 8 || i == 9) {
            this.zzbZt = zzf(i == 8 ? '\'' : '\"');
        } else if (i == 10) {
            this.zzbZt = zzWq();
        } else if (i != 11) {
            String valueOf = String.valueOf(zzWa());
            int lineNumber = getLineNumber();
            int columnNumber = getColumnNumber();
            String path = getPath();
            throw new IllegalStateException(new StringBuilder((String.valueOf(valueOf).length() + 71) + String.valueOf(path).length()).append("Expected a double but was ").append(valueOf).append(" at line ").append(lineNumber).append(" column ").append(columnNumber).append(" path ").append(path).toString());
        }
        this.zzbZq = 11;
        double parseDouble = Double.parseDouble(this.zzbZt);
        if (this.zzbZm || !(Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            this.zzbZt = null;
            this.zzbZq = 0;
            int[] iArr2 = this.zzbZx;
            columnNumber = this.zzbZv - 1;
            iArr2[columnNumber] = iArr2[columnNumber] + 1;
            return parseDouble;
        }
        columnNumber = getLineNumber();
        int columnNumber2 = getColumnNumber();
        String path2 = getPath();
        throw new zzalz(new StringBuilder(String.valueOf(path2).length() + 102).append("JSON forbids NaN and infinities: ").append(parseDouble).append(" at line ").append(columnNumber).append(" column ").append(columnNumber2).append(" path ").append(path2).toString());
    }

    public int nextInt() throws IOException {
        int i = this.zzbZq;
        if (i == 0) {
            i = zzWn();
        }
        int[] iArr;
        int i2;
        if (i == 15) {
            i = (int) this.zzbZr;
            if (this.zzbZr != ((long) i)) {
                long j = this.zzbZr;
                int lineNumber = getLineNumber();
                int columnNumber = getColumnNumber();
                String path = getPath();
                throw new NumberFormatException(new StringBuilder(String.valueOf(path).length() + 89).append("Expected an int but was ").append(j).append(" at line ").append(lineNumber).append(" column ").append(columnNumber).append(" path ").append(path).toString());
            }
            this.zzbZq = 0;
            iArr = this.zzbZx;
            i2 = this.zzbZv - 1;
            iArr[i2] = iArr[i2] + 1;
        } else {
            String valueOf;
            int columnNumber2;
            String path2;
            if (i == 16) {
                this.zzbZt = new String(this.zzbZn, this.pos, this.zzbZs);
                this.pos += this.zzbZs;
            } else if (i == 8 || i == 9) {
                this.zzbZt = zzf(i == 8 ? '\'' : '\"');
                try {
                    i = Integer.parseInt(this.zzbZt);
                    this.zzbZq = 0;
                    iArr = this.zzbZx;
                    i2 = this.zzbZv - 1;
                    iArr[i2] = iArr[i2] + 1;
                } catch (NumberFormatException e) {
                }
            } else {
                valueOf = String.valueOf(zzWa());
                i2 = getLineNumber();
                columnNumber2 = getColumnNumber();
                path2 = getPath();
                throw new IllegalStateException(new StringBuilder((String.valueOf(valueOf).length() + 69) + String.valueOf(path2).length()).append("Expected an int but was ").append(valueOf).append(" at line ").append(i2).append(" column ").append(columnNumber2).append(" path ").append(path2).toString());
            }
            this.zzbZq = 11;
            double parseDouble = Double.parseDouble(this.zzbZt);
            i = (int) parseDouble;
            if (((double) i) != parseDouble) {
                valueOf = this.zzbZt;
                i2 = getLineNumber();
                columnNumber2 = getColumnNumber();
                path2 = getPath();
                throw new NumberFormatException(new StringBuilder((String.valueOf(valueOf).length() + 69) + String.valueOf(path2).length()).append("Expected an int but was ").append(valueOf).append(" at line ").append(i2).append(" column ").append(columnNumber2).append(" path ").append(path2).toString());
            }
            this.zzbZt = null;
            this.zzbZq = 0;
            iArr = this.zzbZx;
            i2 = this.zzbZv - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return i;
    }

    public long nextLong() throws IOException {
        int i = this.zzbZq;
        if (i == 0) {
            i = zzWn();
        }
        if (i == 15) {
            this.zzbZq = 0;
            int[] iArr = this.zzbZx;
            int i2 = this.zzbZv - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.zzbZr;
        }
        long parseLong;
        int i3;
        if (i == 16) {
            this.zzbZt = new String(this.zzbZn, this.pos, this.zzbZs);
            this.pos += this.zzbZs;
        } else if (i == 8 || i == 9) {
            this.zzbZt = zzf(i == 8 ? '\'' : '\"');
            try {
                parseLong = Long.parseLong(this.zzbZt);
                this.zzbZq = 0;
                int[] iArr2 = this.zzbZx;
                i3 = this.zzbZv - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException e) {
            }
        } else {
            String valueOf = String.valueOf(zzWa());
            int lineNumber = getLineNumber();
            i3 = getColumnNumber();
            String path = getPath();
            throw new IllegalStateException(new StringBuilder((String.valueOf(valueOf).length() + 69) + String.valueOf(path).length()).append("Expected a long but was ").append(valueOf).append(" at line ").append(lineNumber).append(" column ").append(i3).append(" path ").append(path).toString());
        }
        this.zzbZq = 11;
        double parseDouble = Double.parseDouble(this.zzbZt);
        parseLong = (long) parseDouble;
        if (((double) parseLong) != parseDouble) {
            valueOf = this.zzbZt;
            lineNumber = getLineNumber();
            i3 = getColumnNumber();
            path = getPath();
            throw new NumberFormatException(new StringBuilder((String.valueOf(valueOf).length() + 69) + String.valueOf(path).length()).append("Expected a long but was ").append(valueOf).append(" at line ").append(lineNumber).append(" column ").append(i3).append(" path ").append(path).toString());
        }
        this.zzbZt = null;
        this.zzbZq = 0;
        iArr2 = this.zzbZx;
        i3 = this.zzbZv - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return parseLong;
    }

    public String nextName() throws IOException {
        String zzWq;
        int i = this.zzbZq;
        if (i == 0) {
            i = zzWn();
        }
        if (i == 14) {
            zzWq = zzWq();
        } else if (i == 12) {
            zzWq = zzf('\'');
        } else if (i == 13) {
            zzWq = zzf('\"');
        } else {
            String valueOf = String.valueOf(zzWa());
            int lineNumber = getLineNumber();
            int columnNumber = getColumnNumber();
            String path = getPath();
            throw new IllegalStateException(new StringBuilder((String.valueOf(valueOf).length() + 69) + String.valueOf(path).length()).append("Expected a name but was ").append(valueOf).append(" at line ").append(lineNumber).append(" column ").append(columnNumber).append(" path ").append(path).toString());
        }
        this.zzbZq = 0;
        this.zzbZw[this.zzbZv - 1] = zzWq;
        return zzWq;
    }

    public void nextNull() throws IOException {
        int i = this.zzbZq;
        if (i == 0) {
            i = zzWn();
        }
        if (i == 7) {
            this.zzbZq = 0;
            int[] iArr = this.zzbZx;
            int i2 = this.zzbZv - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        String valueOf = String.valueOf(zzWa());
        int lineNumber = getLineNumber();
        int columnNumber = getColumnNumber();
        String path = getPath();
        throw new IllegalStateException(new StringBuilder((String.valueOf(valueOf).length() + 67) + String.valueOf(path).length()).append("Expected null but was ").append(valueOf).append(" at line ").append(lineNumber).append(" column ").append(columnNumber).append(" path ").append(path).toString());
    }

    public String nextString() throws IOException {
        String zzWq;
        int lineNumber;
        int i = this.zzbZq;
        if (i == 0) {
            i = zzWn();
        }
        if (i == 10) {
            zzWq = zzWq();
        } else if (i == 8) {
            zzWq = zzf('\'');
        } else if (i == 9) {
            zzWq = zzf('\"');
        } else if (i == 11) {
            zzWq = this.zzbZt;
            this.zzbZt = null;
        } else if (i == 15) {
            zzWq = Long.toString(this.zzbZr);
        } else if (i == 16) {
            zzWq = new String(this.zzbZn, this.pos, this.zzbZs);
            this.pos += this.zzbZs;
        } else {
            String valueOf = String.valueOf(zzWa());
            lineNumber = getLineNumber();
            int columnNumber = getColumnNumber();
            String path = getPath();
            throw new IllegalStateException(new StringBuilder((String.valueOf(valueOf).length() + 71) + String.valueOf(path).length()).append("Expected a string but was ").append(valueOf).append(" at line ").append(lineNumber).append(" column ").append(columnNumber).append(" path ").append(path).toString());
        }
        this.zzbZq = 0;
        int[] iArr = this.zzbZx;
        lineNumber = this.zzbZv - 1;
        iArr[lineNumber] = iArr[lineNumber] + 1;
        return zzWq;
    }

    public final void setLenient(boolean z) {
        this.zzbZm = z;
    }

    public void skipValue() throws IOException {
        int i = 0;
        do {
            int i2 = this.zzbZq;
            if (i2 == 0) {
                i2 = zzWn();
            }
            if (i2 == 3) {
                zznQ(1);
                i++;
            } else if (i2 == 1) {
                zznQ(3);
                i++;
            } else if (i2 == 4) {
                this.zzbZv--;
                i--;
            } else if (i2 == 2) {
                this.zzbZv--;
                i--;
            } else if (i2 == 14 || i2 == 10) {
                zzWr();
            } else if (i2 == 8 || i2 == 12) {
                zzg('\'');
            } else if (i2 == 9 || i2 == 13) {
                zzg('\"');
            } else if (i2 == 16) {
                this.pos += this.zzbZs;
            }
            this.zzbZq = 0;
        } while (i != 0);
        int[] iArr = this.zzbZx;
        int i3 = this.zzbZv - 1;
        iArr[i3] = iArr[i3] + 1;
        this.zzbZw[this.zzbZv - 1] = "null";
    }

    public String toString() {
        String valueOf = String.valueOf(getClass().getSimpleName());
        int lineNumber = getLineNumber();
        return new StringBuilder(String.valueOf(valueOf).length() + 39).append(valueOf).append(" at line ").append(lineNumber).append(" column ").append(getColumnNumber()).toString();
    }

    public zzalx zzWa() throws IOException {
        int i = this.zzbZq;
        if (i == 0) {
            i = zzWn();
        }
        switch (i) {
            case 1:
                return zzalx.BEGIN_OBJECT;
            case 2:
                return zzalx.END_OBJECT;
            case 3:
                return zzalx.BEGIN_ARRAY;
            case 4:
                return zzalx.END_ARRAY;
            case 5:
            case 6:
                return zzalx.BOOLEAN;
            case 7:
                return zzalx.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return zzalx.STRING;
            case 12:
            case 13:
            case 14:
                return zzalx.NAME;
            case 15:
            case 16:
                return zzalx.NUMBER;
            case 17:
                return zzalx.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }
}
