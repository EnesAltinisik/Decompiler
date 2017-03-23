package b;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: RealBufferedSink */
final class n implements d {
    public final c a;
    public final r b;
    private boolean c;

    public n(r rVar, c cVar) {
        if (rVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        this.a = cVar;
        this.b = rVar;
    }

    public n(r rVar) {
        this(rVar, new c());
    }

    public c b() {
        return this.a;
    }

    public void write(c cVar, long j) throws IOException {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.write(cVar, j);
        v();
    }

    public d b(f fVar) throws IOException {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.a(fVar);
        return v();
    }

    public d b(String str) throws IOException {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.a(str);
        return v();
    }

    public d c(byte[] bArr) throws IOException {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.b(bArr);
        return v();
    }

    public d c(byte[] bArr, int i, int i2) throws IOException {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.b(bArr, i, i2);
        return v();
    }

    public long a(s sVar) throws IOException {
        if (sVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = 0;
        while (true) {
            long read = sVar.read(this.a, 2048);
            if (read == -1) {
                return j;
            }
            j += read;
            v();
        }
    }

    public d h(int i) throws IOException {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.b(i);
        return v();
    }

    public d g(int i) throws IOException {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.c(i);
        return v();
    }

    public d f(int i) throws IOException {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.d(i);
        return v();
    }

    public d l(long j) throws IOException {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.i(j);
        return v();
    }

    public d k(long j) throws IOException {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.j(j);
        return v();
    }

    public d v() throws IOException {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        long h = this.a.h();
        if (h > 0) {
            this.b.write(this.a, h);
        }
        return this;
    }

    public d e() throws IOException {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        long a = this.a.a();
        if (a > 0) {
            this.b.write(this.a, a);
        }
        return this;
    }

    public OutputStream c() {
        return new OutputStream(this) {
            final /* synthetic */ n a;

            {
                this.a = r1;
            }

            public void write(int i) throws IOException {
                if (this.a.c) {
                    throw new IOException("closed");
                }
                this.a.a.b((byte) i);
                this.a.v();
            }

            public void write(byte[] bArr, int i, int i2) throws IOException {
                if (this.a.c) {
                    throw new IOException("closed");
                }
                this.a.a.b(bArr, i, i2);
                this.a.v();
            }

            public void flush() throws IOException {
                if (!this.a.c) {
                    this.a.flush();
                }
            }

            public void close() throws IOException {
                this.a.close();
            }

            public String toString() {
                return this.a + ".outputStream()";
            }
        };
    }

    public void flush() throws IOException {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        if (this.a.b > 0) {
            this.b.write(this.a, this.a.b);
        }
        this.b.flush();
    }

    public void close() throws IOException {
        if (!this.c) {
            Throwable th = null;
            try {
                if (this.a.b > 0) {
                    this.b.write(this.a, this.a.b);
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.b.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.c = true;
            if (th != null) {
                u.a(th);
            }
        }
    }

    public t timeout() {
        return this.b.timeout();
    }

    public String toString() {
        return "buffer(" + this.b + ")";
    }
}
