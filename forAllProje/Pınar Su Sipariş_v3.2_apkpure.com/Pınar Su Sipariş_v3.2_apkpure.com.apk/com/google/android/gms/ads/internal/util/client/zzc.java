package com.google.android.gms.ads.internal.util.client;

import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.client.zza.zza;
import com.google.android.gms.internal.zzig;
import com.google.android.gms.nearby.messages.Strategy;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

@zzig
public class zzc implements zza {
    private final String zzCy;

    public zzc() {
        this(null);
    }

    public zzc(String str) {
        this.zzCy = str;
    }

    public void zzaQ(String str) {
        String valueOf;
        HttpURLConnection httpURLConnection;
        try {
            String str2 = "Pinging URL: ";
            valueOf = String.valueOf(str);
            zzb.zzaU(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            zzm.zzdQ().zza(true, httpURLConnection, this.zzCy);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode < 200 || responseCode >= Strategy.TTL_SECONDS_DEFAULT) {
                zzb.zzaW(new StringBuilder(String.valueOf(str).length() + 65).append("Received non-success response code ").append(responseCode).append(" from pinging URL: ").append(str).toString());
            }
            httpURLConnection.disconnect();
        } catch (IndexOutOfBoundsException e) {
            valueOf = String.valueOf(e.getMessage());
            zzb.zzaW(new StringBuilder((String.valueOf(str).length() + 32) + String.valueOf(valueOf).length()).append("Error while parsing ping URL: ").append(str).append(". ").append(valueOf).toString());
        } catch (IOException e2) {
            valueOf = String.valueOf(e2.getMessage());
            zzb.zzaW(new StringBuilder((String.valueOf(str).length() + 27) + String.valueOf(valueOf).length()).append("Error while pinging URL: ").append(str).append(". ").append(valueOf).toString());
        } catch (RuntimeException e3) {
            valueOf = String.valueOf(e3.getMessage());
            zzb.zzaW(new StringBuilder((String.valueOf(str).length() + 27) + String.valueOf(valueOf).length()).append("Error while pinging URL: ").append(str).append(". ").append(valueOf).toString());
        } catch (Throwable th) {
            httpURLConnection.disconnect();
        }
    }
}
