package com.google.firebase.storage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

class c {
    private static final c a = new c();
    private final Map<String, WeakReference<StorageTask>> b = new HashMap();
    private final Object c = new Object();

    c() {
    }

    static c a() {
        return a;
    }

    public List<UploadTask> a(StorageReference storageReference) {
        List<UploadTask> unmodifiableList;
        synchronized (this.c) {
            List arrayList = new ArrayList();
            String storageReference2 = storageReference.toString();
            for (Entry entry : this.b.entrySet()) {
                if (((String) entry.getKey()).startsWith(storageReference2)) {
                    StorageTask storageTask = (StorageTask) ((WeakReference) entry.getValue()).get();
                    if (storageTask instanceof UploadTask) {
                        arrayList.add((UploadTask) storageTask);
                    }
                }
            }
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        return unmodifiableList;
    }

    public void a(StorageTask storageTask) {
        synchronized (this.c) {
            this.b.put(storageTask.getStorage().toString(), new WeakReference(storageTask));
        }
    }

    public List<FileDownloadTask> b(StorageReference storageReference) {
        List<FileDownloadTask> unmodifiableList;
        synchronized (this.c) {
            List arrayList = new ArrayList();
            String storageReference2 = storageReference.toString();
            for (Entry entry : this.b.entrySet()) {
                if (((String) entry.getKey()).startsWith(storageReference2)) {
                    StorageTask storageTask = (StorageTask) ((WeakReference) entry.getValue()).get();
                    if (storageTask instanceof FileDownloadTask) {
                        arrayList.add((FileDownloadTask) storageTask);
                    }
                }
            }
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        return unmodifiableList;
    }

    public void b(StorageTask storageTask) {
        synchronized (this.c) {
            String storageReference = storageTask.getStorage().toString();
            WeakReference weakReference = (WeakReference) this.b.get(storageReference);
            StorageTask storageTask2 = weakReference != null ? (StorageTask) weakReference.get() : null;
            if (storageTask2 == null || storageTask2 == storageTask) {
                this.b.remove(storageReference);
            }
        }
    }
}
