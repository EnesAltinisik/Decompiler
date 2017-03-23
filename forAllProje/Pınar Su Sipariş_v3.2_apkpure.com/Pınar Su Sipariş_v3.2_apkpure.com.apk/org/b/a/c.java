package org.b.a;

import com.adjust.sdk.Constants;
import java.io.IOException;
import org.b.b;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: DM */
class c implements f {
    c() {
    }

    public Object a(XmlPullParser xmlPullParser, String str, String str2, g gVar) throws IOException, XmlPullParserException {
        String nextText = xmlPullParser.nextText();
        switch (str2.charAt(0)) {
            case 'b':
                return new Boolean(b.a(nextText));
            case 'i':
                return new Integer(Integer.parseInt(nextText));
            case 'l':
                return new Long(Long.parseLong(nextText));
            case 's':
                return nextText;
            default:
                throw new RuntimeException();
        }
    }

    public void a(XmlSerializer xmlSerializer, Object obj) throws IOException {
        if (obj instanceof a) {
            a aVar = (a) obj;
            int a = aVar.a();
            for (int i = 0; i < a; i++) {
                b bVar = new b();
                aVar.a(i, bVar);
                xmlSerializer.attribute(bVar.c(), bVar.b(), bVar.d().toString());
            }
        }
        xmlSerializer.text(obj.toString());
    }

    public void a(j jVar) {
        jVar.a(jVar.j, "int", g.c, (f) this);
        jVar.a(jVar.j, Constants.LONG, g.d, (f) this);
        jVar.a(jVar.j, "string", g.b, (f) this);
        jVar.a(jVar.j, "boolean", g.e, (f) this);
    }
}
