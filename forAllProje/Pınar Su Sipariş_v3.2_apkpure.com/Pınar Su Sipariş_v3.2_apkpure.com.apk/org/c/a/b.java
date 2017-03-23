package org.c.a;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: KXmlSerializer */
public class b implements XmlSerializer {
    private Writer a;
    private boolean b;
    private int c;
    private int d;
    private String[] e = new String[12];
    private int[] f = new int[4];
    private String[] g = new String[8];
    private boolean[] h = new boolean[4];
    private boolean i;
    private String j;

    private final void a(boolean z) throws IOException {
        if (this.b) {
            Object obj;
            this.d++;
            this.b = false;
            if (this.h.length <= this.d) {
                obj = new boolean[(this.d + 4)];
                System.arraycopy(this.h, 0, obj, 0, this.d);
                this.h = obj;
            }
            this.h[this.d] = this.h[this.d - 1];
            int i = this.f[this.d - 1];
            while (i < this.f[this.d]) {
                this.a.write(32);
                this.a.write("xmlns");
                if (!"".equals(this.g[i * 2])) {
                    this.a.write(58);
                    this.a.write(this.g[i * 2]);
                } else if ("".equals(getNamespace()) && !"".equals(this.g[(i * 2) + 1])) {
                    throw new IllegalStateException("Cannot set default namespace for elements in no namespace");
                }
                this.a.write("=\"");
                a(this.g[(i * 2) + 1], 34);
                this.a.write(34);
                i++;
            }
            if (this.f.length <= this.d + 1) {
                obj = new int[(this.d + 8)];
                System.arraycopy(this.f, 0, obj, 0, this.d + 1);
                this.f = obj;
            }
            this.f[this.d + 1] = this.f[this.d];
            this.a.write(z ? " />" : ">");
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(java.lang.String r6, int r7) throws java.io.IOException {
        /*
        r5 = this;
        r0 = 0;
    L_0x0001:
        r1 = r6.length();
        if (r0 >= r1) goto L_0x0096;
    L_0x0007:
        r1 = r6.charAt(r0);
        switch(r1) {
            case 9: goto L_0x0026;
            case 10: goto L_0x0026;
            case 13: goto L_0x0026;
            case 34: goto L_0x0066;
            case 38: goto L_0x004e;
            case 39: goto L_0x0066;
            case 60: goto L_0x005e;
            case 62: goto L_0x0056;
            default: goto L_0x000e;
        };
    L_0x000e:
        r2 = 32;
        if (r1 < r2) goto L_0x0077;
    L_0x0012:
        r2 = 64;
        if (r1 == r2) goto L_0x0077;
    L_0x0016:
        r2 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        if (r1 < r2) goto L_0x001e;
    L_0x001a:
        r2 = r5.i;
        if (r2 == 0) goto L_0x0077;
    L_0x001e:
        r2 = r5.a;
        r2.write(r1);
    L_0x0023:
        r0 = r0 + 1;
        goto L_0x0001;
    L_0x0026:
        r2 = -1;
        if (r7 != r2) goto L_0x002f;
    L_0x0029:
        r2 = r5.a;
        r2.write(r1);
        goto L_0x0023;
    L_0x002f:
        r2 = r5.a;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "&#";
        r3 = r3.append(r4);
        r1 = r3.append(r1);
        r3 = 59;
        r1 = r1.append(r3);
        r1 = r1.toString();
        r2.write(r1);
        goto L_0x0023;
    L_0x004e:
        r1 = r5.a;
        r2 = "&amp;";
        r1.write(r2);
        goto L_0x0023;
    L_0x0056:
        r1 = r5.a;
        r2 = "&gt;";
        r1.write(r2);
        goto L_0x0023;
    L_0x005e:
        r1 = r5.a;
        r2 = "&lt;";
        r1.write(r2);
        goto L_0x0023;
    L_0x0066:
        if (r1 != r7) goto L_0x000e;
    L_0x0068:
        r2 = r5.a;
        r3 = 34;
        if (r1 != r3) goto L_0x0074;
    L_0x006e:
        r1 = "&quot;";
    L_0x0070:
        r2.write(r1);
        goto L_0x0023;
    L_0x0074:
        r1 = "&apos;";
        goto L_0x0070;
    L_0x0077:
        r2 = r5.a;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "&#";
        r3 = r3.append(r4);
        r1 = r3.append(r1);
        r3 = ";";
        r1 = r1.append(r3);
        r1 = r1.toString();
        r2.write(r1);
        goto L_0x0023;
    L_0x0096:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.c.a.b.a(java.lang.String, int):void");
    }

    public void docdecl(String str) throws IOException {
        this.a.write("<!DOCTYPE");
        this.a.write(str);
        this.a.write(">");
    }

    public void endDocument() throws IOException {
        while (this.d > 0) {
            endTag(this.e[(this.d * 3) - 3], this.e[(this.d * 3) - 1]);
        }
        flush();
    }

    public void entityRef(String str) throws IOException {
        a(false);
        this.a.write(38);
        this.a.write(str);
        this.a.write(59);
    }

    public boolean getFeature(String str) {
        return "http://xmlpull.org/v1/doc/features.html#indent-output".equals(str) ? this.h[this.d] : false;
    }

    public String getPrefix(String str, boolean z) {
        try {
            return a(str, false, z);
        } catch (IOException e) {
            throw new RuntimeException(e.toString());
        }
    }

    private final String a(String str, boolean z, boolean z2) throws IOException {
        String str2;
        int i = (this.f[this.d + 1] * 2) - 2;
        while (i >= 0) {
            if (this.g[i + 1].equals(str) && (z || !this.g[i].equals(""))) {
                String str3 = this.g[i];
                for (int i2 = i + 2; i2 < this.f[this.d + 1] * 2; i2++) {
                    if (this.g[i2].equals(str3)) {
                        str2 = null;
                        break;
                    }
                }
                str2 = str3;
                if (str2 != null) {
                    return str2;
                }
            }
            i -= 2;
        }
        if (!z2) {
            return null;
        }
        if ("".equals(str)) {
            str2 = "";
        } else {
            do {
                StringBuilder append = new StringBuilder().append("n");
                int i3 = this.c;
                this.c = i3 + 1;
                str2 = append.append(i3).toString();
                for (i3 = (this.f[this.d + 1] * 2) - 2; i3 >= 0; i3 -= 2) {
                    if (str2.equals(this.g[i3])) {
                        str2 = null;
                        continue;
                        break;
                    }
                }
            } while (str2 == null);
        }
        boolean z3 = this.b;
        this.b = false;
        setPrefix(str2, str);
        this.b = z3;
        return str2;
    }

    public Object getProperty(String str) {
        throw new RuntimeException("Unsupported property");
    }

    public void ignorableWhitespace(String str) throws IOException {
        text(str);
    }

    public void setFeature(String str, boolean z) {
        if ("http://xmlpull.org/v1/doc/features.html#indent-output".equals(str)) {
            this.h[this.d] = z;
            return;
        }
        throw new RuntimeException("Unsupported Feature");
    }

    public void setProperty(String str, Object obj) {
        throw new RuntimeException("Unsupported Property:" + obj);
    }

    public void setPrefix(String str, String str2) throws IOException {
        a(false);
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        if (!str.equals(a(str2, true, false))) {
            int[] iArr = this.f;
            int i = this.d + 1;
            int i2 = iArr[i];
            iArr[i] = i2 + 1;
            int i3 = i2 << 1;
            if (this.g.length < i3 + 1) {
                Object obj = new String[(this.g.length + 16)];
                System.arraycopy(this.g, 0, obj, 0, i3);
                this.g = obj;
            }
            i2 = i3 + 1;
            this.g[i3] = str;
            this.g[i2] = str2;
        }
    }

    public void setOutput(Writer writer) {
        this.a = writer;
        this.f[0] = 2;
        this.f[1] = 2;
        this.g[0] = "";
        this.g[1] = "";
        this.g[2] = "xml";
        this.g[3] = "http://www.w3.org/XML/1998/namespace";
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.i = false;
    }

    public void setOutput(OutputStream outputStream, String str) throws IOException {
        if (outputStream == null) {
            throw new IllegalArgumentException();
        }
        setOutput(str == null ? new OutputStreamWriter(outputStream) : new OutputStreamWriter(outputStream, str));
        this.j = str;
        if (str != null && str.toLowerCase().startsWith("utf")) {
            this.i = true;
        }
    }

    public void startDocument(String str, Boolean bool) throws IOException {
        this.a.write("<?xml version='1.0' ");
        if (str != null) {
            this.j = str;
            if (str.toLowerCase().startsWith("utf")) {
                this.i = true;
            }
        }
        if (this.j != null) {
            this.a.write("encoding='");
            this.a.write(this.j);
            this.a.write("' ");
        }
        if (bool != null) {
            this.a.write("standalone='");
            this.a.write(bool.booleanValue() ? "yes" : "no");
            this.a.write("' ");
        }
        this.a.write("?>");
    }

    public XmlSerializer startTag(String str, String str2) throws IOException {
        a(false);
        if (this.h[this.d]) {
            this.a.write("\r\n");
            for (int i = 0; i < this.d; i++) {
                this.a.write("  ");
            }
        }
        int i2 = this.d * 3;
        if (this.e.length < i2 + 3) {
            Object obj = new String[(this.e.length + 12)];
            System.arraycopy(this.e, 0, obj, 0, i2);
            this.e = obj;
        }
        String a = str == null ? "" : a(str, true, true);
        if ("".equals(str)) {
            int i3 = this.f[this.d];
            while (i3 < this.f[this.d + 1]) {
                if (!"".equals(this.g[i3 * 2]) || "".equals(this.g[(i3 * 2) + 1])) {
                    i3++;
                } else {
                    throw new IllegalStateException("Cannot set default namespace for elements in no namespace");
                }
            }
        }
        int i4 = i2 + 1;
        this.e[i2] = str;
        i2 = i4 + 1;
        this.e[i4] = a;
        this.e[i2] = str2;
        this.a.write(60);
        if (!"".equals(a)) {
            this.a.write(a);
            this.a.write(58);
        }
        this.a.write(str2);
        this.b = true;
        return this;
    }

    public XmlSerializer attribute(String str, String str2, String str3) throws IOException {
        if (this.b) {
            String str4;
            if (str == null) {
                str = "";
            }
            if ("".equals(str)) {
                str4 = "";
            } else {
                str4 = a(str, false, true);
            }
            this.a.write(32);
            if (!"".equals(str4)) {
                this.a.write(str4);
                this.a.write(58);
            }
            this.a.write(str2);
            this.a.write(61);
            int i = str3.indexOf(34) == -1 ? 34 : 39;
            this.a.write(i);
            a(str3, i);
            this.a.write(i);
            return this;
        }
        throw new IllegalStateException("illegal position for attribute");
    }

    public void flush() throws IOException {
        a(false);
        this.a.flush();
    }

    public XmlSerializer endTag(String str, String str2) throws IOException {
        if (!this.b) {
            this.d--;
        }
        if ((str != null || this.e[this.d * 3] == null) && ((str == null || str.equals(this.e[this.d * 3])) && this.e[(this.d * 3) + 2].equals(str2))) {
            if (this.b) {
                a(true);
                this.d--;
            } else {
                if (this.h[this.d + 1]) {
                    this.a.write("\r\n");
                    for (int i = 0; i < this.d; i++) {
                        this.a.write("  ");
                    }
                }
                this.a.write("</");
                String str3 = this.e[(this.d * 3) + 1];
                if (!"".equals(str3)) {
                    this.a.write(str3);
                    this.a.write(58);
                }
                this.a.write(str2);
                this.a.write(62);
            }
            this.f[this.d + 1] = this.f[this.d];
            return this;
        }
        throw new IllegalArgumentException("</{" + str + "}" + str2 + "> does not match start");
    }

    public String getNamespace() {
        return getDepth() == 0 ? null : this.e[(getDepth() * 3) - 3];
    }

    public String getName() {
        return getDepth() == 0 ? null : this.e[(getDepth() * 3) - 1];
    }

    public int getDepth() {
        return this.b ? this.d + 1 : this.d;
    }

    public XmlSerializer text(String str) throws IOException {
        a(false);
        this.h[this.d] = false;
        a(str, -1);
        return this;
    }

    public XmlSerializer text(char[] cArr, int i, int i2) throws IOException {
        text(new String(cArr, i, i2));
        return this;
    }

    public void cdsect(String str) throws IOException {
        a(false);
        this.a.write("<![CDATA[");
        this.a.write(str);
        this.a.write("]]>");
    }

    public void comment(String str) throws IOException {
        a(false);
        this.a.write("<!--");
        this.a.write(str);
        this.a.write("-->");
    }

    public void processingInstruction(String str) throws IOException {
        a(false);
        this.a.write("<?");
        this.a.write(str);
        this.a.write("?>");
    }
}
