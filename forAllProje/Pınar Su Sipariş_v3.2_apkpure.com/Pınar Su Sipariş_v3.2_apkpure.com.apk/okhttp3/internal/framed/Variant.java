package okhttp3.internal.framed;

import b.d;
import b.e;
import okhttp3.Protocol;

public interface Variant {
    Protocol getProtocol();

    FrameReader newReader(e eVar, boolean z);

    FrameWriter newWriter(d dVar, boolean z);
}
