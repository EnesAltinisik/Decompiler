package org.c.b;

import java.io.IOException;
import java.util.Vector;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: Node */
public class b {
    protected Vector f;
    protected StringBuffer g;

    public void a(int i, int i2, Object obj) {
        if (obj == null) {
            throw new NullPointerException();
        }
        if (this.f == null) {
            this.f = new Vector();
            this.g = new StringBuffer();
        }
        if (i2 == 2) {
            if (obj instanceof a) {
                ((a) obj).a(this);
            } else {
                throw new RuntimeException("Element obj expected)");
            }
        } else if (!(obj instanceof String)) {
            throw new RuntimeException("String expected");
        }
        this.f.insertElementAt(obj, i);
        this.g.insert(i, (char) i2);
    }

    public void a(int i, Object obj) {
        a(e(), i, obj);
    }

    public a a(String str, String str2) {
        a aVar = new a();
        if (str == null) {
            str = "";
        }
        aVar.a = str;
        aVar.b = str2;
        return aVar;
    }

    public Object f(int i) {
        return this.f.elementAt(i);
    }

    public int e() {
        return this.f == null ? 0 : this.f.size();
    }

    public a g(int i) {
        Object f = f(i);
        return f instanceof a ? (a) f : null;
    }

    public a c(String str, String str2) {
        int a = a(str, str2, 0);
        int a2 = a(str, str2, a + 1);
        if (a != -1 && a2 == -1) {
            return g(a);
        }
        throw new RuntimeException("Element {" + str + "}" + str2 + (a == -1 ? " not found in " : " more than once in ") + this);
    }

    public String h(int i) {
        return j(i) ? (String) f(i) : null;
    }

    public int i(int i) {
        return this.g.charAt(i);
    }

    public int a(String str, String str2, int i) {
        int e = e();
        int i2 = i;
        while (i2 < e) {
            a g = g(i2);
            if (g != null && str2.equals(g.c()) && (str == null || str.equals(g.d()))) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public boolean j(int i) {
        int i2 = i(i);
        return i2 == 4 || i2 == 7 || i2 == 5;
    }

    public void a(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        Object obj = null;
        do {
            int eventType = xmlPullParser.getEventType();
            switch (eventType) {
                case 1:
                case 3:
                    obj = 1;
                    continue;
                case 2:
                    Object a = a(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    a(2, a);
                    a.a(xmlPullParser);
                    continue;
                default:
                    if (xmlPullParser.getText() != null) {
                        if (eventType == 6) {
                            eventType = 4;
                        }
                        a(eventType, xmlPullParser.getText());
                    } else if (eventType == 6 && xmlPullParser.getName() != null) {
                        a(6, xmlPullParser.getName());
                    }
                    xmlPullParser.nextToken();
                    continue;
            }
        } while (obj == null);
    }

    public void a(XmlSerializer xmlSerializer) throws IOException {
        b(xmlSerializer);
        xmlSerializer.flush();
    }

    public void b(XmlSerializer xmlSerializer) throws IOException {
        if (this.f != null) {
            int size = this.f.size();
            for (int i = 0; i < size; i++) {
                int i2 = i(i);
                Object elementAt = this.f.elementAt(i);
                switch (i2) {
                    case 2:
                        ((a) elementAt).a(xmlSerializer);
                        break;
                    case 4:
                        xmlSerializer.text((String) elementAt);
                        break;
                    case 5:
                        xmlSerializer.cdsect((String) elementAt);
                        break;
                    case 6:
                        xmlSerializer.entityRef((String) elementAt);
                        break;
                    case 7:
                        xmlSerializer.ignorableWhitespace((String) elementAt);
                        break;
                    case 8:
                        xmlSerializer.processingInstruction((String) elementAt);
                        break;
                    case 9:
                        xmlSerializer.comment((String) elementAt);
                        break;
                    case 10:
                        xmlSerializer.docdecl((String) elementAt);
                        break;
                    default:
                        throw new RuntimeException("Illegal type: " + i2);
                }
            }
        }
    }
}
