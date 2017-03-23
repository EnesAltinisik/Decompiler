.class Lcom/google/android/gms/internal/zzty$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzty;->dispatch()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/zzty;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzty;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzty$1;->a:Lcom/google/android/gms/internal/zzty;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzty$1;->a:Lcom/google/android/gms/internal/zzty;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzty;->zza(Lcom/google/android/gms/internal/zzty;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzty$1;->a:Lcom/google/android/gms/internal/zzty;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzty;->zzb(Lcom/google/android/gms/internal/zzty;)Lcom/google/android/gms/internal/zzuu;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzuu;->dispatch()V

    :cond_0
    return-void
.end method
