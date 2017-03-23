package org.b.b;

import a.a.a.a.a.b.a;
import com.adjust.sdk.Constants;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Proxy;
import java.util.List;
import java.util.zip.GZIPInputStream;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: HttpTransportSE */
public class b extends g {
    public b(String str) {
        super(null, str);
    }

    public b(Proxy proxy, String str) {
        super(proxy, str);
    }

    public b(String str, int i) {
        super(str, i);
    }

    public b(Proxy proxy, String str, int i) {
        super(proxy, str, i);
    }

    public b(String str, int i, int i2) {
        super(str, i);
    }

    public b(Proxy proxy, String str, int i, int i2) {
        super(proxy, str, i);
    }

    public void call(String str, org.b.b bVar) throws a, IOException, XmlPullParserException {
        call(str, bVar, null);
    }

    public List call(String str, org.b.b bVar, List list) throws a, IOException, XmlPullParserException {
        return call(str, bVar, list, null);
    }

    public List call(String str, org.b.b bVar, List list, File file) throws a, IOException, XmlPullParserException {
        int i;
        IOException iOException;
        IOException iOException2;
        List list2;
        Object obj;
        if (str == null) {
            str = "\"\"";
        }
        byte[] createRequestData = createRequestData(bVar, Constants.ENCODING);
        this.requestDump = this.debug ? new String(createRequestData) : null;
        this.responseDump = null;
        e serviceConnection = getServiceConnection();
        serviceConnection.a(a.HEADER_USER_AGENT, "ksoap2-android/2.6.0+");
        if (bVar.f != 120) {
            serviceConnection.a("SOAPAction", str);
        }
        if (bVar.f == 120) {
            serviceConnection.a("Content-Type", "application/soap+xml;charset=utf-8");
        } else {
            serviceConnection.a("Content-Type", "text/xml;charset=utf-8");
        }
        serviceConnection.a("Accept-Encoding", "gzip");
        serviceConnection.a("Content-Length", new StringBuffer().append("").append(createRequestData.length).toString());
        serviceConnection.a(createRequestData.length);
        if (list != null) {
            for (i = 0; i < list.size(); i++) {
                org.b.a aVar = (org.b.a) list.get(i);
                serviceConnection.a(aVar.a(), aVar.b());
            }
        }
        serviceConnection.a("POST");
        OutputStream d = serviceConnection.d();
        d.write(createRequestData, 0, createRequestData.length);
        d.flush();
        d.close();
        List list3 = null;
        int i2 = 8192;
        Object obj2 = null;
        Object obj3 = null;
        int c = serviceConnection.c();
        Object obj4;
        InputStream unZippedInputStream;
        InputStream inputStream;
        List list4;
        try {
            list3 = serviceConnection.b();
            int i3 = 0;
            while (i3 < list3.size()) {
                int i4;
                aVar = (org.b.a) list3.get(i3);
                if (aVar.a() == null) {
                    obj4 = obj3;
                    obj3 = obj2;
                    i4 = i2;
                } else {
                    if (aVar.a().equalsIgnoreCase("content-length") && aVar.b() != null) {
                        try {
                            i2 = Integer.parseInt(aVar.b());
                        } catch (NumberFormatException e) {
                            i2 = 8192;
                        }
                    }
                    try {
                        if (aVar.a().equalsIgnoreCase("Content-Type") && aVar.b().contains("xml")) {
                            obj3 = 1;
                        }
                        if (aVar.a().equalsIgnoreCase("Content-Encoding") && aVar.b().equalsIgnoreCase("gzip")) {
                            i4 = i2;
                            obj4 = obj3;
                            i = 1;
                        } else {
                            obj4 = obj3;
                            obj3 = obj2;
                            i4 = i2;
                        }
                    } catch (IOException e2) {
                        iOException = e2;
                        obj4 = obj2;
                        iOException2 = iOException;
                        Object obj5 = obj3;
                        list2 = list3;
                        obj = obj5;
                    }
                }
                i3++;
                i2 = i4;
                obj2 = obj3;
                obj3 = obj4;
            }
            if (c != 200) {
                throw new a(new StringBuffer().append("HTTP request failed, HTTP status: ").append(c).toString(), c);
            }
            if (obj2 != null) {
                unZippedInputStream = getUnZippedInputStream(new BufferedInputStream(serviceConnection.e(), i2));
            } else {
                unZippedInputStream = new BufferedInputStream(serviceConnection.e(), i2);
            }
            inputStream = unZippedInputStream;
            list4 = list3;
            if (this.debug) {
                inputStream = readDebug(inputStream, i2, file);
            }
            parseResponse(bVar, inputStream);
            return list4;
        } catch (IOException e22) {
            iOException = e22;
            obj4 = null;
            iOException2 = iOException;
            list2 = list3;
            obj = null;
            if (obj4 != null) {
                unZippedInputStream = getUnZippedInputStream(new BufferedInputStream(serviceConnection.f(), i2));
            } else {
                unZippedInputStream = new BufferedInputStream(serviceConnection.f(), i2);
            }
            if ((iOException2 instanceof a) && r5 == null) {
                if (this.debug && unZippedInputStream != null) {
                    readDebug(unZippedInputStream, i2, file);
                }
                serviceConnection.a();
                throw iOException2;
            }
            List list5 = list2;
            inputStream = unZippedInputStream;
            list4 = list5;
            if (this.debug) {
                inputStream = readDebug(inputStream, i2, file);
            }
            parseResponse(bVar, inputStream);
            return list4;
        }
    }

    private InputStream readDebug(InputStream inputStream, int i, File file) throws IOException {
        OutputStream fileOutputStream;
        byte[] toByteArray;
        if (file != null) {
            fileOutputStream = new FileOutputStream(file);
        } else {
            if (i <= 0) {
                i = 262144;
            }
            fileOutputStream = new ByteArrayOutputStream(i);
        }
        byte[] bArr = new byte[256];
        while (true) {
            int read = inputStream.read(bArr, 0, 256);
            if (read == -1) {
                break;
            }
            fileOutputStream.write(bArr, 0, read);
        }
        fileOutputStream.flush();
        if (fileOutputStream instanceof ByteArrayOutputStream) {
            toByteArray = ((ByteArrayOutputStream) fileOutputStream).toByteArray();
        } else {
            toByteArray = bArr;
        }
        this.responseDump = new String(toByteArray);
        inputStream.close();
        if (file != null) {
            return new FileInputStream(file);
        }
        return new ByteArrayInputStream(toByteArray);
    }

    private InputStream getUnZippedInputStream(InputStream inputStream) throws IOException {
        try {
            return (GZIPInputStream) inputStream;
        } catch (ClassCastException e) {
            return new GZIPInputStream(inputStream);
        }
    }

    public e getServiceConnection() throws IOException {
        return new f(this.proxy, this.url, this.timeout);
    }
}
