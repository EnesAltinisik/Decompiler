.class Lcom/google/android/gms/internal/s$4$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/s$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/s$4;->zza(Lcom/google/android/gms/internal/zzdf;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/zzdf;

.field final synthetic b:Lcom/google/android/gms/internal/s$4;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/s$4;Lcom/google/android/gms/internal/zzdf;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/s$4$1;->b:Lcom/google/android/gms/internal/s$4;

    iput-object p2, p0, Lcom/google/android/gms/internal/s$4$1;->a:Lcom/google/android/gms/internal/zzdf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/t;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p1, Lcom/google/android/gms/internal/t;->d:Lcom/google/android/gms/internal/zzdg;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/google/android/gms/internal/t;->d:Lcom/google/android/gms/internal/zzdg;

    iget-object v1, p0, Lcom/google/android/gms/internal/s$4$1;->a:Lcom/google/android/gms/internal/zzdf;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzdg;->zza(Lcom/google/android/gms/internal/zzdf;)V

    :cond_0
    return-void
.end method
