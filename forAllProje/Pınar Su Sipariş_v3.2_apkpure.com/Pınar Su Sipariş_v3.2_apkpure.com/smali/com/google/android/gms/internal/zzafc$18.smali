.class Lcom/google/android/gms/internal/zzafc$18;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/zzafh$zzb;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzafc;->zzRD()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Lcom/google/android/gms/internal/zzafc;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzafc;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzafc$18;->b:Lcom/google/android/gms/internal/zzafc;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzafc$18;->a:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public zzf(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc$18;->a:Ljava/util/List;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafc$18;->b:Lcom/google/android/gms/internal/zzafc;

    invoke-static {v1}, Lcom/google/android/gms/internal/zzafc;->zzg(Lcom/google/android/gms/internal/zzafc;)Lcom/google/android/gms/internal/zzafj;

    move-result-object v1

    invoke-virtual {v1, p1, p2}, Lcom/google/android/gms/internal/zzafj;->zzi(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc$18;->b:Lcom/google/android/gms/internal/zzafc;

    const/16 v1, -0x9

    invoke-static {v0, p1, v1}, Lcom/google/android/gms/internal/zzafc;->zza(Lcom/google/android/gms/internal/zzafc;Lcom/google/android/gms/internal/zzafa;I)Lcom/google/android/gms/internal/zzafa;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafc$18;->b:Lcom/google/android/gms/internal/zzafc;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/zzafc;->zzb(Lcom/google/android/gms/internal/zzafc;Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzafa;

    return-void
.end method
