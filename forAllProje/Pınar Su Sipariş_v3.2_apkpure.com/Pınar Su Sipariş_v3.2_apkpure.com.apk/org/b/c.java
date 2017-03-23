package org.b;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import java.io.IOException;
import org.c.b.b;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: SoapFault */
public class c extends IOException {
    public String a;
    public String b;
    public String c;
    public b d;
    public int e;

    public c() {
        this.e = 110;
    }

    public c(int i) {
        this.e = i;
    }

    public void a(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        xmlPullParser.require(2, "http://schemas.xmlsoap.org/soap/envelope/", "Fault");
        while (xmlPullParser.nextTag() == 2) {
            String name = xmlPullParser.getName();
            if (name.equals(ProductAction.ACTION_DETAIL)) {
                this.d = new b();
                this.d.a(xmlPullParser);
                if (xmlPullParser.getNamespace().equals("http://schemas.xmlsoap.org/soap/envelope/") && xmlPullParser.getName().equals("Fault")) {
                    break;
                }
            }
            if (name.equals("faultcode")) {
                this.a = xmlPullParser.nextText();
            } else if (name.equals("faultstring")) {
                this.b = xmlPullParser.nextText();
            } else if (name.equals("faultactor")) {
                this.c = xmlPullParser.nextText();
            } else {
                throw new RuntimeException(new StringBuffer().append("unexpected tag:").append(name).toString());
            }
            xmlPullParser.require(3, null, name);
        }
        xmlPullParser.require(3, "http://schemas.xmlsoap.org/soap/envelope/", "Fault");
        xmlPullParser.nextTag();
    }

    public String getMessage() {
        return this.b;
    }

    public String toString() {
        return new StringBuffer().append("SoapFault - faultcode: '").append(this.a).append("' faultstring: '").append(this.b).append("' faultactor: '").append(this.c).append("' detail: ").append(this.d).toString();
    }
}
