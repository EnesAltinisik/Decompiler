package org.c.b;

import java.io.IOException;
import java.util.Vector;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: Element */
public class a extends b {
    protected String a;
    protected String b;
    protected Vector c;
    protected b d;
    protected Vector e;

    public void a() {
    }

    public a a(String str, String str2) {
        return this.d == null ? super.a(str, str2) : this.d.a(str, str2);
    }

    public int b() {
        return this.c == null ? 0 : this.c.size();
    }

    public String a(int i) {
        return ((String[]) this.c.elementAt(i))[0];
    }

    public String b(int i) {
        return ((String[]) this.c.elementAt(i))[1];
    }

    public String c(int i) {
        return ((String[]) this.c.elementAt(i))[2];
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.a;
    }

    public String d(int i) {
        return ((String[]) this.e.elementAt(i))[0];
    }

    public String e(int i) {
        return ((String[]) this.e.elementAt(i))[1];
    }

    public void a(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        int namespaceCount;
        for (namespaceCount = xmlPullParser.getNamespaceCount(xmlPullParser.getDepth() - 1); namespaceCount < xmlPullParser.getNamespaceCount(xmlPullParser.getDepth()); namespaceCount++) {
            b(xmlPullParser.getNamespacePrefix(namespaceCount), xmlPullParser.getNamespaceUri(namespaceCount));
        }
        for (namespaceCount = 0; namespaceCount < xmlPullParser.getAttributeCount(); namespaceCount++) {
            a(xmlPullParser.getAttributeNamespace(namespaceCount), xmlPullParser.getAttributeName(namespaceCount), xmlPullParser.getAttributeValue(namespaceCount));
        }
        a();
        if (xmlPullParser.isEmptyElementTag()) {
            xmlPullParser.nextToken();
        } else {
            xmlPullParser.nextToken();
            super.a(xmlPullParser);
            if (e() == 0) {
                a(7, (Object) "");
            }
        }
        xmlPullParser.require(3, d(), c());
        xmlPullParser.nextToken();
    }

    public void a(String str, String str2, String str3) {
        if (this.c == null) {
            this.c = new Vector();
        }
        if (str == null) {
            str = "";
        }
        int size = this.c.size() - 1;
        while (size >= 0) {
            String[] strArr = (String[]) this.c.elementAt(size);
            if (!strArr[0].equals(str) || !strArr[1].equals(str2)) {
                size--;
            } else if (str3 == null) {
                this.c.removeElementAt(size);
                return;
            } else {
                strArr[2] = str3;
                return;
            }
        }
        this.c.addElement(new String[]{str, str2, str3});
    }

    public void b(String str, String str2) {
        if (this.e == null) {
            this.e = new Vector();
        }
        this.e.addElement(new String[]{str, str2});
    }

    protected void a(b bVar) {
        this.d = bVar;
    }

    public void a(XmlSerializer xmlSerializer) throws IOException {
        int i;
        int i2 = 0;
        if (this.e != null) {
            for (i = 0; i < this.e.size(); i++) {
                xmlSerializer.setPrefix(d(i), e(i));
            }
        }
        xmlSerializer.startTag(d(), c());
        i = b();
        while (i2 < i) {
            xmlSerializer.attribute(a(i2), b(i2), c(i2));
            i2++;
        }
        b(xmlSerializer);
        xmlSerializer.endTag(d(), c());
    }
}
