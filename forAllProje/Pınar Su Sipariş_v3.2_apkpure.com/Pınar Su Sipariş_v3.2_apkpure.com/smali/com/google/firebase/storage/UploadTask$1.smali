.class Lcom/google/firebase/storage/UploadTask$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/firebase/storage/UploadTask;->onCanceled()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/zzajt;

.field final synthetic b:Lcom/google/firebase/storage/UploadTask;


# direct methods
.method constructor <init>(Lcom/google/firebase/storage/UploadTask;Lcom/google/android/gms/internal/zzajt;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/storage/UploadTask$1;->b:Lcom/google/firebase/storage/UploadTask;

    iput-object p2, p0, Lcom/google/firebase/storage/UploadTask$1;->a:Lcom/google/android/gms/internal/zzajt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/google/firebase/storage/UploadTask$1;->a:Lcom/google/android/gms/internal/zzajt;

    iget-object v1, p0, Lcom/google/firebase/storage/UploadTask$1;->b:Lcom/google/firebase/storage/UploadTask;

    invoke-static {v1}, Lcom/google/firebase/storage/UploadTask;->zza(Lcom/google/firebase/storage/UploadTask;)Lcom/google/firebase/storage/StorageReference;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/firebase/storage/StorageReference;->getApp()Lcom/google/firebase/FirebaseApp;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/zzajp;->zzh(Lcom/google/firebase/FirebaseApp;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/firebase/storage/UploadTask$1;->b:Lcom/google/firebase/storage/UploadTask;

    invoke-static {v2}, Lcom/google/firebase/storage/UploadTask;->zza(Lcom/google/firebase/storage/UploadTask;)Lcom/google/firebase/storage/StorageReference;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/firebase/storage/StorageReference;->getApp()Lcom/google/firebase/FirebaseApp;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/firebase/FirebaseApp;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/zzajt;->zza(Ljava/lang/String;Landroid/content/Context;)V

    return-void
.end method
