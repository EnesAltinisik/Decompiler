.class Lcom/google/android/gms/internal/zzafc$9$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzafc$9;->zza(Lcom/google/android/gms/internal/zzagu;Lcom/google/android/gms/internal/zzafk;Lcom/google/android/gms/internal/zzaei;Lcom/google/android/gms/internal/zzafj$zza;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/zzagu;

.field final synthetic b:Lcom/google/android/gms/internal/zzafj$zza;

.field final synthetic c:Lcom/google/android/gms/internal/zzafc$9;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzafc$9;Lcom/google/android/gms/internal/zzagu;Lcom/google/android/gms/internal/zzafj$zza;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzafc$9$1;->c:Lcom/google/android/gms/internal/zzafc$9;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzafc$9$1;->a:Lcom/google/android/gms/internal/zzagu;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzafc$9$1;->b:Lcom/google/android/gms/internal/zzafj$zza;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc$9$1;->c:Lcom/google/android/gms/internal/zzafc$9;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzafc$9;->a:Lcom/google/android/gms/internal/zzafc;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzafc;->zzd(Lcom/google/android/gms/internal/zzafc;)Lcom/google/android/gms/internal/zzafg;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafc$9$1;->a:Lcom/google/android/gms/internal/zzagu;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzagu;->zzPn()Lcom/google/android/gms/internal/zzafa;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzafg;->zzq(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzahu;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafc$9$1;->c:Lcom/google/android/gms/internal/zzafc$9;

    iget-object v1, v1, Lcom/google/android/gms/internal/zzafc$9;->a:Lcom/google/android/gms/internal/zzafc;

    invoke-static {v1}, Lcom/google/android/gms/internal/zzafc;->zze(Lcom/google/android/gms/internal/zzafc;)Lcom/google/android/gms/internal/zzafj;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzafc$9$1;->a:Lcom/google/android/gms/internal/zzagu;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzagu;->zzPn()Lcom/google/android/gms/internal/zzafa;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/zzafj;->zzi(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafc$9$1;->c:Lcom/google/android/gms/internal/zzafc$9;

    iget-object v1, v1, Lcom/google/android/gms/internal/zzafc$9;->a:Lcom/google/android/gms/internal/zzafc;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/zzafc;->zza(Lcom/google/android/gms/internal/zzafc;Ljava/util/List;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc$9$1;->b:Lcom/google/android/gms/internal/zzafj$zza;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzafj$zza;->zzb(Lcom/google/firebase/database/DatabaseError;)Ljava/util/List;

    :cond_0
    return-void
.end method
