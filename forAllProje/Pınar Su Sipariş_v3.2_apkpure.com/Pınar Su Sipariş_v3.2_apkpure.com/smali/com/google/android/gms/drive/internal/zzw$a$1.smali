.class Lcom/google/android/gms/drive/internal/zzw$a$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/zzou$zzb;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/drive/internal/zzw$a;->onProgress(JJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/zzou$zzb",
        "<",
        "Lcom/google/android/gms/drive/DriveFile$DownloadProgressListener;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:J

.field final synthetic c:Lcom/google/android/gms/drive/internal/zzw$a;


# direct methods
.method constructor <init>(Lcom/google/android/gms/drive/internal/zzw$a;JJ)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/drive/internal/zzw$a$1;->c:Lcom/google/android/gms/drive/internal/zzw$a;

    iput-wide p2, p0, Lcom/google/android/gms/drive/internal/zzw$a$1;->a:J

    iput-wide p4, p0, Lcom/google/android/gms/drive/internal/zzw$a$1;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/drive/DriveFile$DownloadProgressListener;)V
    .locals 4

    iget-wide v0, p0, Lcom/google/android/gms/drive/internal/zzw$a$1;->a:J

    iget-wide v2, p0, Lcom/google/android/gms/drive/internal/zzw$a$1;->b:J

    invoke-interface {p1, v0, v1, v2, v3}, Lcom/google/android/gms/drive/DriveFile$DownloadProgressListener;->onProgress(JJ)V

    return-void
.end method

.method public zzrV()V
    .locals 0

    return-void
.end method

.method public synthetic zzt(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/drive/DriveFile$DownloadProgressListener;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/internal/zzw$a$1;->a(Lcom/google/android/gms/drive/DriveFile$DownloadProgressListener;)V

    return-void
.end method
