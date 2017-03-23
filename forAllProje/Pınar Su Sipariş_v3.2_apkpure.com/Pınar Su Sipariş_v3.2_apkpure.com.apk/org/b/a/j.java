package org.b.a;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;
import org.b.b;
import org.b.c;
import org.b.d;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: SoapSerializationEnvelope */
public class j extends b {
    static final f k = new c();
    static Class u;
    public Hashtable l = new Hashtable();
    Hashtable m = new Hashtable();
    Vector n;
    public boolean o;
    public boolean p;
    public boolean q;
    protected Hashtable r = new Hashtable();
    protected Hashtable s = new Hashtable();
    protected boolean t = true;

    public j(int i) {
        super(i);
        a(this.h, "Array", g.f);
        k.a(this);
    }

    public void c(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        this.a = null;
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
        while (xmlPullParser.getEventType() == 2) {
            String attributeValue = xmlPullParser.getAttributeValue(this.h, "root");
            Object a = a(xmlPullParser, null, -1, xmlPullParser.getNamespace(), xmlPullParser.getName(), g.g);
            if ("1".equals(attributeValue) || this.a == null) {
                this.a = a;
            }
            xmlPullParser.nextTag();
        }
    }

    protected void a(XmlPullParser xmlPullParser, h hVar) throws IOException, XmlPullParserException {
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            hVar.a(xmlPullParser.getAttributeName(i), (Object) xmlPullParser.getAttributeValue(i));
        }
        a(xmlPullParser, (e) hVar);
    }

    protected void a(XmlPullParser xmlPullParser, e eVar) throws IOException, XmlPullParserException {
        while (xmlPullParser.nextTag() != 3) {
            String name = xmlPullParser.getName();
            if (this.o && (eVar instanceof h)) {
                ((h) eVar).b(xmlPullParser.getName(), a(xmlPullParser, eVar, eVar.a_(), ((h) eVar).c(), name, g.g));
            } else {
                g gVar = new g();
                int a_ = eVar.a_();
                Object obj = null;
                for (int i = 0; i < a_ && obj == null; i++) {
                    gVar.a();
                    eVar.a(i, this.l, gVar);
                    if ((name.equals(gVar.h) && gVar.i == null) || (name.equals(gVar.h) && xmlPullParser.getNamespace().equals(gVar.i))) {
                        eVar.a(i, a(xmlPullParser, eVar, i, null, null, gVar));
                        obj = 1;
                    }
                }
                if (obj != null) {
                    continue;
                } else if (this.q) {
                    while (true) {
                        if (xmlPullParser.next() == 3) {
                            if (name.equals(xmlPullParser.getName())) {
                                break;
                            }
                        }
                    }
                } else {
                    throw new RuntimeException(new StringBuffer().append("Unknown Property: ").append(name).toString());
                }
            }
        }
        xmlPullParser.require(3, null, null);
    }

    protected Object a(XmlPullParser xmlPullParser, String str, String str2) throws IOException, XmlPullParserException {
        String str3;
        Object obj;
        int i = 0;
        String name = xmlPullParser.getName();
        String namespace = xmlPullParser.getNamespace();
        Vector vector = new Vector();
        for (int i2 = 0; i2 < xmlPullParser.getAttributeCount(); i2++) {
            b bVar = new b();
            bVar.a(xmlPullParser.getAttributeName(i2));
            bVar.b((Object) xmlPullParser.getAttributeValue(i2));
            bVar.b(xmlPullParser.getAttributeNamespace(i2));
            bVar.a((Object) xmlPullParser.getAttributeType(i2));
            vector.addElement(bVar);
        }
        xmlPullParser.next();
        int i3;
        if (xmlPullParser.getEventType() == 4) {
            String text = xmlPullParser.getText();
            i iVar = new i(str, str2, text);
            for (i3 = 0; i3 < vector.size(); i3++) {
                iVar.a((b) vector.elementAt(i3));
            }
            xmlPullParser.next();
            str3 = text;
            obj = iVar;
        } else if (xmlPullParser.getEventType() == 3) {
            h hVar = new h(str, str2);
            for (i3 = 0; i3 < vector.size(); i3++) {
                hVar.a((b) vector.elementAt(i3));
            }
            str3 = null;
            h hVar2 = hVar;
        } else {
            str3 = null;
            obj = null;
        }
        if (xmlPullParser.getEventType() == 2) {
            if (str3 == null || str3.trim().length() == 0) {
                obj = new h(str, str2);
                while (i < vector.size()) {
                    obj.a((b) vector.elementAt(i));
                    i++;
                }
                while (xmlPullParser.getEventType() != 3) {
                    obj.b(xmlPullParser.getName(), a(xmlPullParser, obj, obj.a_(), null, null, g.g));
                    xmlPullParser.nextTag();
                }
            } else {
                throw new RuntimeException("Malformed input: Mixed content");
            }
        }
        xmlPullParser.require(3, namespace, name);
        return obj;
    }

    private int a(String str, int i, int i2) {
        return (str != null && str.length() - i >= 3) ? Integer.parseInt(str.substring(i + 1, str.length() - 1)) : i2;
    }

    protected void a(XmlPullParser xmlPullParser, Vector vector, g gVar) throws IOException, XmlPullParserException {
        String substring;
        String namespace;
        int i;
        int i2;
        g gVar2;
        int size = vector.size();
        String attributeValue = xmlPullParser.getAttributeValue(this.h, "arrayType");
        if (attributeValue != null) {
            size = attributeValue.indexOf(58);
            int indexOf = attributeValue.indexOf("[", size);
            substring = attributeValue.substring(size + 1, indexOf);
            namespace = xmlPullParser.getNamespace(size == -1 ? "" : attributeValue.substring(0, size));
            size = a(attributeValue, indexOf, -1);
            if (size != -1) {
                vector.setSize(size);
                i = 0;
                i2 = size;
            } else {
                i = 1;
                i2 = size;
            }
        } else {
            i = 1;
            substring = null;
            namespace = null;
            i2 = size;
        }
        if (gVar == null) {
            gVar2 = g.g;
        } else {
            gVar2 = gVar;
        }
        xmlPullParser.nextTag();
        size = a(xmlPullParser.getAttributeValue(this.h, "offset"), 0, 0);
        while (xmlPullParser.getEventType() != 3) {
            indexOf = a(xmlPullParser.getAttributeValue(this.h, "position"), 0, size);
            if (i != 0 && indexOf >= r1) {
                i2 = indexOf + 1;
                vector.setSize(i2);
            }
            int i3 = i2;
            vector.setElementAt(a(xmlPullParser, vector, indexOf, namespace, substring, gVar2), indexOf);
            size = indexOf + 1;
            xmlPullParser.nextTag();
            i2 = i3;
        }
        xmlPullParser.require(3, null, null);
    }

    public Object a(XmlPullParser xmlPullParser, Object obj, int i, String str, String str2, g gVar) throws IOException, XmlPullParserException {
        Object obj2;
        String name = xmlPullParser.getName();
        String attributeValue = xmlPullParser.getAttributeValue(null, "href");
        if (attributeValue == null) {
            Object a;
            attributeValue = xmlPullParser.getAttributeValue(this.i, "nil");
            String attributeValue2 = xmlPullParser.getAttributeValue(null, "id");
            if (attributeValue == null) {
                attributeValue = xmlPullParser.getAttributeValue(this.i, "null");
            }
            if (attributeValue == null || !b.a(attributeValue)) {
                String attributeValue3 = xmlPullParser.getAttributeValue(this.i, "type");
                if (attributeValue3 != null) {
                    int indexOf = attributeValue3.indexOf(58);
                    str2 = attributeValue3.substring(indexOf + 1);
                    str = xmlPullParser.getNamespace(indexOf == -1 ? "" : attributeValue3.substring(0, indexOf));
                } else if (str2 == null && str == null) {
                    if (xmlPullParser.getAttributeValue(this.h, "arrayType") != null) {
                        str = this.h;
                        str2 = "Array";
                    } else {
                        Object[] a2 = a(gVar.l, null);
                        str2 = (String) a2[1];
                        str = (String) a2[0];
                    }
                }
                if (attributeValue3 == null) {
                    this.o = true;
                }
                a = a(xmlPullParser, str, str2, gVar);
                if (a == null) {
                    a = a(xmlPullParser, str, str2);
                }
            } else {
                xmlPullParser.nextTag();
                xmlPullParser.require(3, null, name);
                a = null;
            }
            if (attributeValue2 != null) {
                obj2 = this.m.get(attributeValue2);
                if (obj2 instanceof d) {
                    d dVar = (d) obj2;
                    while (true) {
                        if (dVar.b instanceof e) {
                            ((e) dVar.b).a(dVar.c, a);
                        } else {
                            ((Vector) dVar.b).setElementAt(a, dVar.c);
                        }
                        d dVar2 = dVar.a;
                        if (dVar2 == null) {
                            break;
                        }
                        dVar = dVar2;
                    }
                } else if (obj2 != null) {
                    throw new RuntimeException("double ID");
                }
                this.m.put(attributeValue2, a);
            }
            obj2 = a;
        } else if (obj == null) {
            throw new RuntimeException("href at root level?!?");
        } else {
            String substring = attributeValue.substring(1);
            obj2 = this.m.get(substring);
            if (obj2 == null || (obj2 instanceof d)) {
                d dVar3 = new d();
                dVar3.a = (d) obj2;
                dVar3.b = obj;
                dVar3.c = i;
                this.m.put(substring, dVar3);
                obj2 = null;
            }
            xmlPullParser.nextTag();
            xmlPullParser.require(3, null, name);
        }
        xmlPullParser.require(3, null, name);
        return obj2;
    }

    public Object a(XmlPullParser xmlPullParser, String str, String str2, g gVar) throws IOException, XmlPullParserException {
        Class cls = this.r.get(new i(str, str2, null));
        if (cls == null) {
            return null;
        }
        if (cls instanceof f) {
            return ((f) cls).a(xmlPullParser, str, str2, gVar);
        }
        Object d;
        if (cls instanceof h) {
            d = ((h) cls).d();
        } else {
            Class b;
            if (u == null) {
                b = b("org.b.a.h");
                u = b;
            } else {
                b = u;
            }
            if (cls == b) {
                d = new h(str, str2);
            } else {
                try {
                    d = cls.newInstance();
                } catch (Exception e) {
                    throw new RuntimeException(e.toString());
                }
            }
        }
        if (d instanceof h) {
            a(xmlPullParser, (h) d);
            return d;
        } else if (d instanceof e) {
            a(xmlPullParser, (e) d);
            return d;
        } else if (d instanceof Vector) {
            a(xmlPullParser, (Vector) d, gVar.n);
            return d;
        } else {
            throw new RuntimeException(new StringBuffer().append("no deserializer for ").append(d.getClass()).toString());
        }
    }

    static Class b(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public Object[] a(Object obj, Object obj2) {
        Class cls;
        if (obj != null) {
            cls = obj;
        } else if ((obj2 instanceof h) || (obj2 instanceof i)) {
            cls = obj2;
        } else {
            cls = obj2.getClass();
        }
        if (cls instanceof h) {
            h hVar = (h) cls;
            return new Object[]{hVar.c(), hVar.b(), null, null};
        } else if (cls instanceof i) {
            i iVar = (i) cls;
            return new Object[]{iVar.b(), iVar.c(), null, k};
        } else {
            if ((cls instanceof Class) && cls != g.a) {
                Object[] objArr = (Object[]) this.s.get(cls.getName());
                if (objArr != null) {
                    return objArr;
                }
            }
            return new Object[]{this.j, "anyType", null, null};
        }
    }

    public void a(String str, String str2, Class cls, f fVar) {
        Object obj;
        Hashtable hashtable = this.r;
        i iVar = new i(str, str2, null);
        if (fVar == null) {
            obj = cls;
        } else {
            f fVar2 = fVar;
        }
        hashtable.put(iVar, obj);
        this.s.put(cls.getName(), new Object[]{str, str2, null, fVar});
    }

    public void a(String str, String str2, Class cls) {
        a(str, str2, cls, null);
    }

    public void c(XmlSerializer xmlSerializer) throws IOException {
        if (this.b != null) {
            this.n = new Vector();
            this.n.addElement(this.b);
            Object[] a = a(null, this.b);
            xmlSerializer.startTag(this.p ? "" : (String) a[0], (String) a[1]);
            if (this.p) {
                xmlSerializer.attribute(null, "xmlns", (String) a[0]);
            }
            if (this.t) {
                xmlSerializer.attribute(null, "id", a[2] == null ? "o0" : (String) a[2]);
                xmlSerializer.attribute(this.h, "root", "1");
            }
            a(xmlSerializer, this.b, null, a[3]);
            xmlSerializer.endTag(this.p ? "" : (String) a[0], (String) a[1]);
        }
    }

    public void a(XmlSerializer xmlSerializer, h hVar) throws IOException {
        int a = hVar.a();
        for (int i = 0; i < a; i++) {
            b bVar = new b();
            hVar.a(i, bVar);
            xmlSerializer.attribute(bVar.c(), bVar.b(), bVar.d().toString());
        }
        a(xmlSerializer, (e) hVar);
    }

    public void a(XmlSerializer xmlSerializer, e eVar) throws IOException {
        int a_ = eVar.a_();
        g gVar = new g();
        for (int i = 0; i < a_; i++) {
            Object a_2 = eVar.a_(i);
            eVar.a(i, this.l, gVar);
            if (a_2 instanceof h) {
                String str;
                String str2;
                h hVar = (h) a_2;
                Object[] a = a(null, (Object) hVar);
                String str3 = (String) a[0];
                str3 = (String) a[1];
                if (gVar.h == null || gVar.h.length() <= 0) {
                    str = (String) a[1];
                } else {
                    str = gVar.h;
                }
                if (gVar.i == null || gVar.i.length() <= 0) {
                    str2 = (String) a[0];
                } else {
                    str2 = gVar.i;
                }
                xmlSerializer.startTag(str2, str);
                if (!this.o) {
                    xmlSerializer.attribute(this.i, "type", new StringBuffer().append(xmlSerializer.getPrefix(str2, true)).append(":").append(str3).toString());
                }
                a(xmlSerializer, hVar);
                xmlSerializer.endTag(str2, str);
            } else if ((gVar.j & 1) == 0) {
                xmlSerializer.startTag(gVar.i, gVar.h);
                a(xmlSerializer, eVar.a_(i), gVar);
                xmlSerializer.endTag(gVar.i, gVar.h);
            }
        }
    }

    protected void a(XmlSerializer xmlSerializer, Object obj, g gVar) throws IOException {
        if (obj == null) {
            String str;
            String str2 = this.i;
            if (this.f >= 120) {
                str = "nil";
            } else {
                str = "null";
            }
            xmlSerializer.attribute(str2, str, "true");
            return;
        }
        Object[] a = a(null, obj);
        if (gVar.m || a[2] != null) {
            int indexOf = this.n.indexOf(obj);
            if (indexOf == -1) {
                indexOf = this.n.size();
                this.n.addElement(obj);
            }
            xmlSerializer.attribute(null, "href", a[2] == null ? new StringBuffer().append("#o").append(indexOf).toString() : new StringBuffer().append("#").append(a[2]).toString());
            return;
        }
        if (!(this.o && obj.getClass() == gVar.l)) {
            xmlSerializer.attribute(this.i, "type", new StringBuffer().append(xmlSerializer.getPrefix((String) a[0], true)).append(":").append(a[1]).toString());
        }
        a(xmlSerializer, obj, gVar, a[3]);
    }

    private void a(XmlSerializer xmlSerializer, Object obj, g gVar, Object obj2) throws IOException {
        if (obj2 != null) {
            ((f) obj2).a(xmlSerializer, obj);
        } else if (obj instanceof h) {
            a(xmlSerializer, (h) obj);
        } else if (obj instanceof e) {
            a(xmlSerializer, (e) obj);
        } else if (obj instanceof Vector) {
            a(xmlSerializer, (Vector) obj, gVar.n);
        } else {
            throw new RuntimeException(new StringBuffer().append("Cannot serialize: ").append(obj).toString());
        }
    }

    protected void a(XmlSerializer xmlSerializer, Vector vector, g gVar) throws IOException {
        String str;
        String str2 = "item";
        if (gVar == null) {
            gVar = g.g;
            str = str2;
            str2 = null;
        } else if (!(gVar instanceof g) || gVar.h == null) {
            str = str2;
            str2 = null;
        } else {
            str = gVar.h;
            str2 = gVar.i;
        }
        int size = vector.size();
        Object[] a = a(gVar.l, null);
        if (!this.o) {
            xmlSerializer.attribute(this.h, "arrayType", new StringBuffer().append(xmlSerializer.getPrefix((String) a[0], false)).append(":").append(a[1]).append("[").append(size).append("]").toString());
        } else if (str2 == null) {
            str2 = (String) a[0];
        }
        boolean z = false;
        for (int i = 0; i < size; i++) {
            if (vector.elementAt(i) == null) {
                z = true;
            } else {
                xmlSerializer.startTag(str2, str);
                if (z) {
                    xmlSerializer.attribute(this.h, "position", new StringBuffer().append("[").append(i).append("]").toString());
                    z = false;
                }
                a(xmlSerializer, vector.elementAt(i), gVar);
                xmlSerializer.endTag(str2, str);
            }
        }
    }
}
