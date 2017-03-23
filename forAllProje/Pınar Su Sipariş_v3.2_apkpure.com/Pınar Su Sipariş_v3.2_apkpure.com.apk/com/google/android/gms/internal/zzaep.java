package com.google.android.gms.internal;

import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.List;

public class zzaep extends Reader {
    private List<String> zzbKV;
    private boolean zzbKW;
    private int zzbKX;
    private int zzbKY;
    private int zzbKZ;
    private int zzbLa;
    private boolean zzbLb;

    public zzaep() {
        this.zzbKV = null;
        this.zzbKW = false;
        this.zzbKZ = this.zzbKX;
        this.zzbLa = this.zzbKY;
        this.zzbLb = false;
        this.zzbKV = new ArrayList();
    }

    private String zzQI() {
        return this.zzbKY < this.zzbKV.size() ? (String) this.zzbKV.get(this.zzbKY) : null;
    }

    private int zzQJ() {
        String zzQI = zzQI();
        return zzQI == null ? 0 : zzQI.length() - this.zzbKX;
    }

    private void zzQK() throws IOException {
        if (this.zzbKW) {
            throw new IOException("Stream already closed");
        } else if (!this.zzbLb) {
            throw new IOException("Reader needs to be frozen before read operations can be called");
        }
    }

    private long zzaD(long j) {
        long j2 = 0;
        while (this.zzbKY < this.zzbKV.size() && j2 < j) {
            int zzQJ = zzQJ();
            long j3 = j - j2;
            if (j3 < ((long) zzQJ)) {
                this.zzbKX = (int) (((long) this.zzbKX) + j3);
                j2 += j3;
            } else {
                j2 += (long) zzQJ;
                this.zzbKX = 0;
                this.zzbKY++;
            }
        }
        return j2;
    }

    public void close() throws IOException {
        zzQK();
        this.zzbKW = true;
    }

    public void mark(int i) throws IOException {
        zzQK();
        this.zzbKZ = this.zzbKX;
        this.zzbLa = this.zzbKY;
    }

    public boolean markSupported() {
        return true;
    }

    public int read() throws IOException {
        zzQK();
        String zzQI = zzQI();
        if (zzQI == null) {
            return -1;
        }
        char charAt = zzQI.charAt(this.zzbKX);
        zzaD(1);
        return charAt;
    }

    public int read(CharBuffer charBuffer) throws IOException {
        zzQK();
        int remaining = charBuffer.remaining();
        int i = 0;
        String zzQI = zzQI();
        while (remaining > 0 && zzQI != null) {
            int min = Math.min(zzQI.length() - this.zzbKX, remaining);
            charBuffer.put((String) this.zzbKV.get(this.zzbKY), this.zzbKX, this.zzbKX + min);
            remaining -= min;
            i += min;
            zzaD((long) min);
            zzQI = zzQI();
        }
        return (i > 0 || zzQI != null) ? i : -1;
    }

    public int read(char[] cArr, int i, int i2) throws IOException {
        zzQK();
        int i3 = 0;
        String zzQI = zzQI();
        while (zzQI != null && i3 < i2) {
            int min = Math.min(zzQJ(), i2 - i3);
            zzQI.getChars(this.zzbKX, this.zzbKX + min, cArr, i + i3);
            int i4 = i3 + min;
            zzaD((long) min);
            i3 = i4;
            zzQI = zzQI();
        }
        return (i3 > 0 || zzQI != null) ? i3 : -1;
    }

    public boolean ready() throws IOException {
        zzQK();
        return true;
    }

    public void reset() throws IOException {
        this.zzbKX = this.zzbKZ;
        this.zzbKY = this.zzbLa;
    }

    public long skip(long j) throws IOException {
        zzQK();
        return zzaD(j);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String append : this.zzbKV) {
            stringBuilder.append(append);
        }
        return stringBuilder.toString();
    }

    public void zzQH() {
        if (this.zzbLb) {
            throw new IllegalStateException("Trying to freeze frozen StringListReader");
        }
        this.zzbLb = true;
    }

    public void zzia(String str) {
        if (this.zzbLb) {
            throw new IllegalStateException("Trying to add string after reading");
        } else if (str.length() > 0) {
            this.zzbKV.add(str);
        }
    }
}
