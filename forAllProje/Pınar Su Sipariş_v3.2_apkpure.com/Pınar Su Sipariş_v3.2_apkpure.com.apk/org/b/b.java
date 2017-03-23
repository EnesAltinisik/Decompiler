package org.b;

import java.io.IOException;
import org.c.b.a;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: SoapEnvelope */
public class b {
    public Object a;
    public Object b;
    public a[] c;
    public a[] d;
    public String e;
    public int f;
    public String g;
    public String h;
    public String i;
    public String j;

    public static boolean a(String str) {
        if (str == null) {
            return false;
        }
        String toLowerCase = str.trim().toLowerCase();
        if (toLowerCase.equals("1") || toLowerCase.equals("true")) {
            return true;
        }
        return false;
    }

    public b(int i) {
        this.f = i;
        if (i == 100) {
            this.i = "http://www.w3.org/1999/XMLSchema-instance";
            this.j = "http://www.w3.org/1999/XMLSchema";
        } else {
            this.i = "http://www.w3.org/2001/XMLSchema-instance";
            this.j = "http://www.w3.org/2001/XMLSchema";
        }
        if (i < 120) {
            this.h = "http://schemas.xmlsoap.org/soap/encoding/";
            this.g = "http://schemas.xmlsoap.org/soap/envelope/";
            return;
        }
        this.h = "http://www.w3.org/2003/05/soap-encoding";
        this.g = "http://www.w3.org/2003/05/soap-envelope";
    }

    public void a(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        xmlPullParser.nextTag();
        xmlPullParser.require(2, this.g, "Envelope");
        this.e = xmlPullParser.getAttributeValue(this.g, "encodingStyle");
        xmlPullParser.nextTag();
        if (xmlPullParser.getEventType() == 2 && xmlPullParser.getNamespace().equals(this.g) && xmlPullParser.getName().equals("Header")) {
            b(xmlPullParser);
            xmlPullParser.require(3, this.g, "Header");
            xmlPullParser.nextTag();
        }
        xmlPullParser.require(2, this.g, "Body");
        this.e = xmlPullParser.getAttributeValue(this.g, "encodingStyle");
        c(xmlPullParser);
        xmlPullParser.require(3, this.g, "Body");
        xmlPullParser.nextTag();
        xmlPullParser.require(3, this.g, "Envelope");
    }

    public void b(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        int i;
        int i2 = 0;
        xmlPullParser.nextTag();
        org.c.b.b bVar = new org.c.b.b();
        bVar.a(xmlPullParser);
        int i3 = 0;
        for (i = 0; i < bVar.e(); i++) {
            if (bVar.g(i) != null) {
                i3++;
            }
        }
        this.c = new a[i3];
        i = 0;
        while (i2 < bVar.e()) {
            a g = bVar.g(i2);
            if (g != null) {
                i3 = i + 1;
                this.c[i] = g;
                i = i3;
            }
            i2++;
        }
    }

    public void c(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        xmlPullParser.nextTag();
        if (xmlPullParser.getEventType() == 2 && xmlPullParser.getNamespace().equals(this.g) && xmlPullParser.getName().equals("Fault")) {
            c cVar;
            if (this.f < 120) {
                cVar = new c(this.f);
            } else {
                cVar = new d(this.f);
            }
            cVar.a(xmlPullParser);
            this.a = cVar;
            return;
        }
        org.c.b.b bVar = this.a instanceof org.c.b.b ? (org.c.b.b) this.a : new org.c.b.b();
        bVar.a(xmlPullParser);
        this.a = bVar;
    }

    public void a(XmlSerializer xmlSerializer) throws IOException {
        xmlSerializer.setPrefix("i", this.i);
        xmlSerializer.setPrefix("d", this.j);
        xmlSerializer.setPrefix("c", this.h);
        xmlSerializer.setPrefix("v", this.g);
        xmlSerializer.startTag(this.g, "Envelope");
        xmlSerializer.startTag(this.g, "Header");
        b(xmlSerializer);
        xmlSerializer.endTag(this.g, "Header");
        xmlSerializer.startTag(this.g, "Body");
        c(xmlSerializer);
        xmlSerializer.endTag(this.g, "Body");
        xmlSerializer.endTag(this.g, "Envelope");
    }

    public void b(XmlSerializer xmlSerializer) throws IOException {
        if (this.d != null) {
            for (a a : this.d) {
                a.a(xmlSerializer);
            }
        }
    }

    public void c(XmlSerializer xmlSerializer) throws IOException {
        if (this.e != null) {
            xmlSerializer.attribute(this.g, "encodingStyle", this.e);
        }
        ((org.c.b.b) this.b).a(xmlSerializer);
    }

    public void a(Object obj) {
        this.b = obj;
    }
}
