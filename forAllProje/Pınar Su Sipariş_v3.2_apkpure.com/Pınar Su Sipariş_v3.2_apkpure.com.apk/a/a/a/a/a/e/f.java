package a.a.a.a.a.e;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

/* compiled from: NetworkUtils */
public final class f {
    public static final SSLSocketFactory a(g gVar) throws KeyManagementException, NoSuchAlgorithmException {
        SSLContext instance = SSLContext.getInstance("TLS");
        h hVar = new h(new i(gVar.getKeyStoreStream(), gVar.getKeyStorePassword()), gVar);
        instance.init(null, new TrustManager[]{hVar}, null);
        return instance.getSocketFactory();
    }
}
