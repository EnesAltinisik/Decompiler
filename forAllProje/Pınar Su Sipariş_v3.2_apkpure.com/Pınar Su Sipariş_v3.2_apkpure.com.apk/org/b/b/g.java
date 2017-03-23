package org.b.b;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.util.List;
import org.b.b;
import org.c.a.a;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: Transport */
public abstract class g {
    protected static final String CONTENT_TYPE_SOAP_XML_CHARSET_UTF_8 = "application/soap+xml;charset=utf-8";
    protected static final String CONTENT_TYPE_XML_CHARSET_UTF_8 = "text/xml;charset=utf-8";
    protected static final String USER_AGENT = "ksoap2-android/2.6.0+";
    private int bufferLength;
    public boolean debug;
    protected Proxy proxy;
    public String requestDump;
    public String responseDump;
    protected int timeout;
    protected String url;
    private String xmlVersionTag;

    public abstract List call(String str, b bVar, List list) throws IOException, XmlPullParserException;

    public abstract List call(String str, b bVar, List list, File file) throws IOException, XmlPullParserException;

    public abstract e getServiceConnection() throws IOException;

    public g() {
        this.timeout = 20000;
        this.xmlVersionTag = "";
        this.bufferLength = 262144;
    }

    public g(String str) {
        this(null, str);
    }

    public g(String str, int i) {
        this.timeout = 20000;
        this.xmlVersionTag = "";
        this.bufferLength = 262144;
        this.url = str;
        this.timeout = i;
    }

    public g(String str, int i, int i2) {
        this.timeout = 20000;
        this.xmlVersionTag = "";
        this.bufferLength = 262144;
        this.url = str;
        this.timeout = i;
        this.bufferLength = i2;
    }

    public g(Proxy proxy, String str) {
        this.timeout = 20000;
        this.xmlVersionTag = "";
        this.bufferLength = 262144;
        this.proxy = proxy;
        this.url = str;
    }

    public g(Proxy proxy, String str, int i) {
        this.timeout = 20000;
        this.xmlVersionTag = "";
        this.bufferLength = 262144;
        this.proxy = proxy;
        this.url = str;
        this.timeout = i;
    }

    public g(Proxy proxy, String str, int i, int i2) {
        this.timeout = 20000;
        this.xmlVersionTag = "";
        this.bufferLength = 262144;
        this.proxy = proxy;
        this.url = str;
        this.timeout = i;
        this.bufferLength = i2;
    }

    protected void parseResponse(b bVar, InputStream inputStream) throws XmlPullParserException, IOException {
        XmlPullParser aVar = new a();
        aVar.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES, true);
        aVar.setInput(inputStream, null);
        bVar.a(aVar);
        inputStream.close();
    }

    protected byte[] createRequestData(b bVar, String str) throws IOException {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream(this.bufferLength);
        byteArrayOutputStream.write(this.xmlVersionTag.getBytes());
        XmlSerializer bVar2 = new org.c.a.b();
        bVar2.setOutput(byteArrayOutputStream, str);
        bVar.a(bVar2);
        bVar2.flush();
        byteArrayOutputStream.write(13);
        byteArrayOutputStream.write(10);
        byteArrayOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    protected byte[] createRequestData(b bVar) throws IOException {
        return createRequestData(bVar, null);
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setXmlVersionTag(String str) {
        this.xmlVersionTag = str;
    }

    public void reset() {
    }

    public void call(String str, b bVar) throws IOException, XmlPullParserException {
        call(str, bVar, null);
    }

    public String getHost() throws MalformedURLException {
        return new URL(this.url).getHost();
    }

    public int getPort() throws MalformedURLException {
        return new URL(this.url).getPort();
    }

    public String getPath() throws MalformedURLException {
        return new URL(this.url).getPath();
    }
}
