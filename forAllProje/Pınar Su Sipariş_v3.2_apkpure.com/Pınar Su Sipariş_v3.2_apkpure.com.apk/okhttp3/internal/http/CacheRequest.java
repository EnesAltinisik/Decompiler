package okhttp3.internal.http;

import b.r;
import java.io.IOException;

public interface CacheRequest {
    void abort();

    r body() throws IOException;
}
