package org.b.a;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Vector;

/* compiled from: PropertyInfo */
public class g implements Serializable {
    public static final Class a = new Object().getClass();
    public static final Class b = "".getClass();
    public static final Class c = new Integer(0).getClass();
    public static final Class d = new Long(0).getClass();
    public static final Class e = new Boolean(true).getClass();
    public static final Class f = new Vector().getClass();
    public static final g g = new g();
    public String h;
    public String i;
    public int j;
    protected Object k;
    public Object l = a;
    public boolean m;
    public g n;

    public void a() {
        this.l = a;
        this.j = 0;
        this.h = null;
        this.i = null;
    }

    public String b() {
        return this.h;
    }

    public void a(String str) {
        this.h = str;
    }

    public String c() {
        return this.i;
    }

    public void b(String str) {
        this.i = str;
    }

    public void a(Object obj) {
        this.l = obj;
    }

    public Object d() {
        return this.k;
    }

    public void b(Object obj) {
        this.k = obj;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.h);
        stringBuffer.append(" : ");
        if (this.k != null) {
            stringBuffer.append(this.k);
        } else {
            stringBuffer.append("(not set)");
        }
        return stringBuffer.toString();
    }

    public Object clone() {
        Object obj = null;
        try {
            OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);
            objectOutputStream.flush();
            objectOutputStream.close();
            obj = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray())).readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NotSerializableException e2) {
            e2.printStackTrace();
        } catch (IOException e3) {
            e3.printStackTrace();
        }
        return obj;
    }
}
