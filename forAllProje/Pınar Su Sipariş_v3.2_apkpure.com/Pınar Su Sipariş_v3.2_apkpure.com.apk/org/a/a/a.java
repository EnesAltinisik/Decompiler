package org.a.a;

/* compiled from: Base64 */
public class a {
    static final char[] a = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();

    public static String a(byte[] bArr) {
        return a(bArr, 0, bArr.length, null).toString();
    }

    public static StringBuffer a(byte[] bArr, int i, int i2, StringBuffer stringBuffer) {
        if (stringBuffer == null) {
            stringBuffer = new StringBuffer((bArr.length * 3) / 2);
        }
        int i3 = i2 - 3;
        int i4 = 0;
        int i5 = i;
        while (i5 <= i3) {
            int i6 = (((bArr[i5] & 255) << 16) | ((bArr[i5 + 1] & 255) << 8)) | (bArr[i5 + 2] & 255);
            stringBuffer.append(a[(i6 >> 18) & 63]);
            stringBuffer.append(a[(i6 >> 12) & 63]);
            stringBuffer.append(a[(i6 >> 6) & 63]);
            stringBuffer.append(a[i6 & 63]);
            i6 = i5 + 3;
            i5 = i4 + 1;
            if (i4 >= 14) {
                stringBuffer.append("\r\n");
                i5 = 0;
            }
            i4 = i5;
            i5 = i6;
        }
        if (i5 == (i + i2) - 2) {
            i5 = ((bArr[i5 + 1] & 255) << 8) | ((bArr[i5] & 255) << 16);
            stringBuffer.append(a[(i5 >> 18) & 63]);
            stringBuffer.append(a[(i5 >> 12) & 63]);
            stringBuffer.append(a[(i5 >> 6) & 63]);
            stringBuffer.append("=");
        } else if (i5 == (i + i2) - 1) {
            i5 = (bArr[i5] & 255) << 16;
            stringBuffer.append(a[(i5 >> 18) & 63]);
            stringBuffer.append(a[(i5 >> 12) & 63]);
            stringBuffer.append("==");
        }
        return stringBuffer;
    }
}
