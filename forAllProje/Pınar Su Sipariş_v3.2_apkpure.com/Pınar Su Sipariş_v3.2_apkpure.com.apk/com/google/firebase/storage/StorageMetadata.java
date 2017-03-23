package com.google.firebase.storage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zzajl;
import com.google.android.gms.internal.zzajp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class StorageMetadata {
    private String mPath;
    private String zzafr;
    private StorageReference zzbTR;
    private FirebaseStorage zzbUi;
    private String zzbUj;
    private String zzbUk;
    private String zzbUl;
    private String zzbUm;
    private String zzbUn;
    private long zzbUo;
    private String zzbUp;
    private String zzbUq;
    private String zzbUr;
    private String zzbUs;
    private String zzbUt;
    private Map<String, String> zzbUu;
    private String[] zzbUv;

    public static class Builder {
        StorageMetadata zzbUw;
        boolean zzbUx;

        public Builder() {
            this.zzbUw = new StorageMetadata();
        }

        public Builder(StorageMetadata storageMetadata) {
            this.zzbUw = new StorageMetadata(false);
        }

        Builder(JSONObject jSONObject) throws JSONException {
            this.zzbUw = new StorageMetadata();
            if (jSONObject != null) {
                zzn(jSONObject);
                this.zzbUx = true;
            }
        }

        Builder(JSONObject jSONObject, StorageReference storageReference) throws JSONException {
            this(jSONObject);
            this.zzbUw.zzbTR = storageReference;
        }

        private void zzn(JSONObject jSONObject) throws JSONException {
            this.zzbUw.zzbUk = jSONObject.optString("generation");
            this.zzbUw.mPath = jSONObject.optString("name");
            this.zzbUw.zzbUj = jSONObject.optString("bucket");
            this.zzbUw.zzbUl = jSONObject.optString("metageneration");
            this.zzbUw.zzbUm = jSONObject.optString("timeCreated");
            this.zzbUw.zzbUn = jSONObject.optString("updated");
            this.zzbUw.zzbUo = jSONObject.optLong("size");
            this.zzbUw.zzbUp = jSONObject.optString("md5Hash");
            this.zzbUw.zziG(jSONObject.optString("downloadTokens"));
            setContentType(jSONObject.optString("contentType"));
            if (jSONObject.has("metadata")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("metadata");
                Iterator keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String str = (String) keys.next();
                    setCustomMetadata(str, jSONObject2.getString(str));
                }
            }
            setCacheControl(jSONObject.optString("cacheControl"));
            setContentDisposition(jSONObject.optString("contentDisposition"));
            setContentEncoding(jSONObject.optString("'contentEncoding"));
            setContentLanguage(jSONObject.optString("'contentLanguage"));
        }

        public StorageMetadata build() {
            return new StorageMetadata(this.zzbUx);
        }

        public Builder setCacheControl(String str) {
            this.zzbUw.zzbUq = str;
            return this;
        }

        public Builder setContentDisposition(String str) {
            this.zzbUw.zzbUr = str;
            return this;
        }

        public Builder setContentEncoding(String str) {
            this.zzbUw.zzbUs = str;
            return this;
        }

        public Builder setContentLanguage(String str) {
            this.zzbUw.zzbUt = str;
            return this;
        }

        public Builder setContentType(String str) {
            this.zzbUw.zzafr = str;
            return this;
        }

        public Builder setCustomMetadata(String str, String str2) {
            if (this.zzbUw.zzbUu == null) {
                this.zzbUw.zzbUu = new HashMap();
            }
            this.zzbUw.zzbUu.put(str, str2);
            return this;
        }
    }

    public StorageMetadata() {
        this.mPath = null;
        this.zzbUi = null;
        this.zzbTR = null;
        this.zzbUj = null;
        this.zzbUk = null;
        this.zzafr = null;
        this.zzbUl = null;
        this.zzbUm = null;
        this.zzbUn = null;
        this.zzbUp = null;
        this.zzbUq = null;
        this.zzbUr = null;
        this.zzbUs = null;
        this.zzbUt = null;
        this.zzbUu = null;
        this.zzbUv = null;
    }

    private StorageMetadata(StorageMetadata storageMetadata, boolean z) {
        this.mPath = null;
        this.zzbUi = null;
        this.zzbTR = null;
        this.zzbUj = null;
        this.zzbUk = null;
        this.zzafr = null;
        this.zzbUl = null;
        this.zzbUm = null;
        this.zzbUn = null;
        this.zzbUp = null;
        this.zzbUq = null;
        this.zzbUr = null;
        this.zzbUs = null;
        this.zzbUt = null;
        this.zzbUu = null;
        this.zzbUv = null;
        zzaa.zzz(storageMetadata);
        this.mPath = storageMetadata.mPath;
        this.zzbUi = storageMetadata.zzbUi;
        this.zzbTR = storageMetadata.zzbTR;
        this.zzbUj = storageMetadata.zzbUj;
        this.zzafr = storageMetadata.zzafr;
        this.zzbUq = storageMetadata.zzbUq;
        this.zzbUr = storageMetadata.zzbUr;
        this.zzbUs = storageMetadata.zzbUs;
        this.zzbUt = storageMetadata.zzbUt;
        if (storageMetadata.zzbUu != null) {
            this.zzbUu = new HashMap(storageMetadata.zzbUu);
        }
        this.zzbUv = storageMetadata.zzbUv;
        if (z) {
            this.zzbUp = storageMetadata.zzbUp;
            this.zzbUo = storageMetadata.zzbUo;
            this.zzbUn = storageMetadata.zzbUn;
            this.zzbUm = storageMetadata.zzbUm;
            this.zzbUl = storageMetadata.zzbUl;
            this.zzbUk = storageMetadata.zzbUk;
        }
    }

    private void zziG(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.zzbUv = str.split(",");
        }
    }

    public String getBucket() {
        return this.zzbUj;
    }

    public String getCacheControl() {
        return this.zzbUq;
    }

    public String getContentDisposition() {
        return this.zzbUr;
    }

    public String getContentEncoding() {
        return this.zzbUs;
    }

    public String getContentLanguage() {
        return this.zzbUt;
    }

    public String getContentType() {
        return this.zzafr;
    }

    public long getCreationTimeMillis() {
        return zzajp.zziK(this.zzbUm);
    }

    public String getCustomMetadata(String str) {
        return (this.zzbUu == null || TextUtils.isEmpty(str)) ? null : (String) this.zzbUu.get(str);
    }

    public Set<String> getCustomMetadataKeys() {
        return this.zzbUu == null ? Collections.emptySet() : this.zzbUu.keySet();
    }

    public Uri getDownloadUrl() {
        List downloadUrls = getDownloadUrls();
        return (downloadUrls == null || downloadUrls.size() <= 0) ? null : (Uri) downloadUrls.get(0);
    }

    public List<Uri> getDownloadUrls() {
        List arrayList = new ArrayList();
        if (!(this.zzbUv == null || this.zzbTR == null)) {
            try {
                Object zzw = this.zzbTR.zzUT().zzw(this.zzbTR.zzUU());
                if (!TextUtils.isEmpty(zzw)) {
                    for (Object obj : this.zzbUv) {
                        if (!TextUtils.isEmpty(obj)) {
                            arrayList.add(Uri.parse(new StringBuilder((String.valueOf(zzw).length() + 17) + String.valueOf(obj).length()).append(zzw).append("?alt=media&token=").append(obj).toString()));
                        }
                    }
                }
            } catch (Throwable e) {
                Log.e("StorageMetadata", "Unexpected error getting DownloadUrls.", e);
            }
        }
        return arrayList;
    }

    public String getGeneration() {
        return this.zzbUk;
    }

    public String getMd5Hash() {
        return this.zzbUp;
    }

    public String getMetadataGeneration() {
        return this.zzbUl;
    }

    public String getName() {
        String path = getPath();
        if (TextUtils.isEmpty(path)) {
            return null;
        }
        int lastIndexOf = path.lastIndexOf(47);
        return lastIndexOf != -1 ? path.substring(lastIndexOf + 1) : path;
    }

    public String getPath() {
        return this.mPath != null ? this.mPath : "";
    }

    public StorageReference getReference() {
        if (this.zzbTR != null || this.zzbUi == null) {
            return this.zzbTR;
        }
        String bucket = getBucket();
        String path = getPath();
        if (TextUtils.isEmpty(bucket) || TextUtils.isEmpty(path)) {
            return null;
        }
        try {
            return new StorageReference(new android.net.Uri.Builder().scheme("gs").authority(bucket).encodedPath(zzajl.zziH(path)).build(), this.zzbUi);
        } catch (Throwable e) {
            Log.e("StorageMetadata", new StringBuilder((String.valueOf(bucket).length() + 38) + String.valueOf(path).length()).append("Unable to create a valid default Uri. ").append(bucket).append(path).toString(), e);
            throw new IllegalStateException(e);
        }
    }

    public long getSizeBytes() {
        return this.zzbUo;
    }

    public long getUpdatedTimeMillis() {
        return zzajp.zziK(this.zzbUn);
    }

    JSONObject zzUS() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (getContentType() != null) {
            jSONObject.put("contentType", getContentType());
        }
        if (this.zzbUu != null) {
            jSONObject.put("metadata", new JSONObject(this.zzbUu));
        }
        if (getCacheControl() != null) {
            jSONObject.put("cacheControl", getCacheControl());
        }
        if (getContentDisposition() != null) {
            jSONObject.put("contentDisposition", getContentDisposition());
        }
        if (getContentEncoding() != null) {
            jSONObject.put("'contentEncoding", getContentEncoding());
        }
        if (getContentLanguage() != null) {
            jSONObject.put("'contentLanguage", getContentLanguage());
        }
        return jSONObject;
    }
}
