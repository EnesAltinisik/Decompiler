package org.b;

import java.io.IOException;
import org.c.b.b;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: SoapFault12 */
public class d extends c {
    public b f;
    public b g;
    public b h;
    public b i;
    public b j;

    public d() {
        this.e = 120;
    }

    public d(int i) {
        this.e = i;
    }

    public void a(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        b(xmlPullParser);
        this.a = this.f.c("http://www.w3.org/2003/05/soap-envelope", "Value").h(0);
        this.b = this.g.c("http://www.w3.org/2003/05/soap-envelope", "Text").h(0);
        this.d = this.j;
        this.c = null;
    }

    private void b(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        xmlPullParser.require(2, "http://www.w3.org/2003/05/soap-envelope", "Fault");
        while (xmlPullParser.nextTag() == 2) {
            String name = xmlPullParser.getName();
            xmlPullParser.nextTag();
            if (name.equals("Code")) {
                this.f = new b();
                this.f.a(xmlPullParser);
            } else if (name.equals("Reason")) {
                this.g = new b();
                this.g.a(xmlPullParser);
            } else if (name.equals("Node")) {
                this.h = new b();
                this.h.a(xmlPullParser);
            } else if (name.equals("Role")) {
                this.i = new b();
                this.i.a(xmlPullParser);
            } else if (name.equals("Detail")) {
                this.j = new b();
                this.j.a(xmlPullParser);
            } else {
                throw new RuntimeException(new StringBuffer().append("unexpected tag:").append(name).toString());
            }
            xmlPullParser.require(3, "http://www.w3.org/2003/05/soap-envelope", name);
        }
        xmlPullParser.require(3, "http://www.w3.org/2003/05/soap-envelope", "Fault");
        xmlPullParser.nextTag();
    }

    public String getMessage() {
        return this.g.c("http://www.w3.org/2003/05/soap-envelope", "Text").h(0);
    }

    public String toString() {
        return new StringBuffer().append("Code: ").append(this.f.c("http://www.w3.org/2003/05/soap-envelope", "Value").h(0)).append(", Reason: ").append(this.g.c("http://www.w3.org/2003/05/soap-envelope", "Text").h(0)).toString();
    }
}
