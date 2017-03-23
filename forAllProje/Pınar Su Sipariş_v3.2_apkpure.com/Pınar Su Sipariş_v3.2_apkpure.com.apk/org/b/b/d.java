package org.b.b;

import java.io.IOException;
import java.net.Proxy;

/* compiled from: HttpsTransportSE */
public class d extends b {
    static final String PROTOCOL = "https";
    private static final String PROTOCOL_FULL = "https://";
    protected final String file;
    protected final String host;
    protected final int port;

    public d(String str, int i, String str2, int i2) {
        super(new StringBuffer().append(PROTOCOL_FULL).append(str).append(":").append(i).append(str2).toString(), i2);
        this.host = str;
        this.port = i;
        this.file = str2;
    }

    public d(Proxy proxy, String str, int i, String str2, int i2) {
        super(proxy, new StringBuffer().append(PROTOCOL_FULL).append(str).append(":").append(i).append(str2).toString());
        this.host = str;
        this.port = i;
        this.file = str2;
        this.timeout = i2;
    }

    public e getServiceConnection() throws IOException {
        return new c(this.proxy, this.host, this.port, this.file, this.timeout);
    }
}
