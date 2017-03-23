.class Lcom/google/android/gms/internal/s$7;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/s;->a(Lcom/google/android/gms/internal/t;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/s$a;

.field final synthetic b:Lcom/google/android/gms/internal/t;

.field final synthetic c:Lcom/google/android/gms/internal/s;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/s;Lcom/google/android/gms/internal/s$a;Lcom/google/android/gms/internal/t;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/s$7;->c:Lcom/google/android/gms/internal/s;

    iput-object p2, p0, Lcom/google/android/gms/internal/s$7;->a:Lcom/google/android/gms/internal/s$a;

    iput-object p3, p0, Lcom/google/android/gms/internal/s$7;->b:Lcom/google/android/gms/internal/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/s$7;->a:Lcom/google/android/gms/internal/s$a;

    iget-object v1, p0, Lcom/google/android/gms/internal/s$7;->b:Lcom/google/android/gms/internal/t;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/s$a;->a(Lcom/google/android/gms/internal/t;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Could not propagate interstitial ad event."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/zzjw;->zzd(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method
