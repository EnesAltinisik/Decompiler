.class Lcom/google/android/gms/drive/internal/a;
.super Lcom/google/android/gms/drive/internal/zzd;


# instance fields
.field private final a:Lcom/google/android/gms/internal/zznt$zzb;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zznt$zzb",
            "<",
            "Lcom/google/android/gms/drive/DriveApi$DriveContentsResult;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lcom/google/android/gms/drive/DriveFile$DownloadProgressListener;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zznt$zzb;Lcom/google/android/gms/drive/DriveFile$DownloadProgressListener;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zznt$zzb",
            "<",
            "Lcom/google/android/gms/drive/DriveApi$DriveContentsResult;",
            ">;",
            "Lcom/google/android/gms/drive/DriveFile$DownloadProgressListener;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/drive/internal/zzd;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/drive/internal/a;->a:Lcom/google/android/gms/internal/zznt$zzb;

    iput-object p2, p0, Lcom/google/android/gms/drive/internal/a;->b:Lcom/google/android/gms/drive/DriveFile$DownloadProgressListener;

    return-void
.end method


# virtual methods
.method public onError(Lcom/google/android/gms/common/api/Status;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/a;->a:Lcom/google/android/gms/internal/zznt$zzb;

    new-instance v1, Lcom/google/android/gms/drive/internal/zzs$b;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lcom/google/android/gms/drive/internal/zzs$b;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/drive/DriveContents;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zznt$zzb;->setResult(Ljava/lang/Object;)V

    return-void
.end method

.method public zza(Lcom/google/android/gms/drive/internal/OnContentsResponse;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/drive/internal/OnContentsResponse;->zzwu()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const/4 v1, -0x1

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/drive/internal/a;->a:Lcom/google/android/gms/internal/zznt$zzb;

    new-instance v2, Lcom/google/android/gms/drive/internal/zzs$b;

    new-instance v3, Lcom/google/android/gms/drive/internal/zzv;

    invoke-virtual {p1}, Lcom/google/android/gms/drive/internal/OnContentsResponse;->zzwt()Lcom/google/android/gms/drive/Contents;

    move-result-object v4

    invoke-direct {v3, v4}, Lcom/google/android/gms/drive/internal/zzv;-><init>(Lcom/google/android/gms/drive/Contents;)V

    invoke-direct {v2, v0, v3}, Lcom/google/android/gms/drive/internal/zzs$b;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/drive/DriveContents;)V

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/zznt$zzb;->setResult(Ljava/lang/Object;)V

    return-void

    :cond_0
    sget-object v0, Lcom/google/android/gms/common/api/Status;->zzalw:Lcom/google/android/gms/common/api/Status;

    goto :goto_0
.end method

.method public zza(Lcom/google/android/gms/drive/internal/OnDownloadProgressResponse;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/a;->b:Lcom/google/android/gms/drive/DriveFile$DownloadProgressListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/a;->b:Lcom/google/android/gms/drive/DriveFile$DownloadProgressListener;

    invoke-virtual {p1}, Lcom/google/android/gms/drive/internal/OnDownloadProgressResponse;->zzww()J

    move-result-wide v2

    invoke-virtual {p1}, Lcom/google/android/gms/drive/internal/OnDownloadProgressResponse;->zzwx()J

    move-result-wide v4

    invoke-interface {v0, v2, v3, v4, v5}, Lcom/google/android/gms/drive/DriveFile$DownloadProgressListener;->onProgress(JJ)V

    :cond_0
    return-void
.end method
