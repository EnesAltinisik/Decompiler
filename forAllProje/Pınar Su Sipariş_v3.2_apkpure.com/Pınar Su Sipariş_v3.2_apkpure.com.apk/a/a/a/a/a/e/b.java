package a.a.a.a.a.e;

import a.a.a.a.l;
import com.adjust.sdk.Constants;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: DefaultHttpRequestFactory */
public class b implements e {
    private final l a;
    private g b;
    private SSLSocketFactory c;
    private boolean d;

    public b() {
        this(new a.a.a.a.b());
    }

    public b(l lVar) {
        this.a = lVar;
    }

    public void a(g gVar) {
        if (this.b != gVar) {
            this.b = gVar;
            a();
        }
    }

    private synchronized void a() {
        this.d = false;
        this.c = null;
    }

    public d a(c cVar, String str) {
        return a(cVar, str, Collections.emptyMap());
    }

    public d a(c cVar, String str, Map<String, String> map) {
        d a;
        switch (cVar) {
            case GET:
                a = d.a((CharSequence) str, (Map) map, true);
                break;
            case POST:
                a = d.b((CharSequence) str, (Map) map, true);
                break;
            case PUT:
                a = d.d((CharSequence) str);
                break;
            case DELETE:
                a = d.e((CharSequence) str);
                break;
            default:
                throw new IllegalArgumentException("Unsupported HTTP method!");
        }
        if (a(str) && this.b != null) {
            SSLSocketFactory b = b();
            if (b != null) {
                ((HttpsURLConnection) a.a()).setSSLSocketFactory(b);
            }
        }
        return a;
    }

    private boolean a(String str) {
        return str != null && str.toLowerCase(Locale.US).startsWith(Constants.SCHEME);
    }

    private synchronized SSLSocketFactory b() {
        if (this.c == null && !this.d) {
            this.c = c();
        }
        return this.c;
    }

    private synchronized SSLSocketFactory c() {
        SSLSocketFactory a;
        this.d = true;
        try {
            a = f.a(this.b);
            this.a.a("Fabric", "Custom SSL pinning enabled");
        } catch (Throwable e) {
            this.a.e("Fabric", "Exception while validating pinned certs", e);
            a = null;
        }
        return a;
    }
}
