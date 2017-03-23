.class Lcom/google/android/gms/internal/zzacn$g;
.super Lcom/google/android/gms/internal/zzpd;

# interfaces
.implements Lcom/google/android/gms/internal/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/zzacn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ResultT:",
        "Ljava/lang/Object;",
        "CallbackT:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/gms/internal/zzpd",
        "<",
        "Lcom/google/android/gms/internal/zzaco;",
        "TResultT;>;",
        "Lcom/google/android/gms/internal/c",
        "<TResultT;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/zzacn;

.field private b:Lcom/google/android/gms/internal/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/d",
            "<TResultT;TCallbackT;>;"
        }
    .end annotation
.end field

.field private c:Lcom/google/android/gms/tasks/TaskCompletionSource;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/tasks/TaskCompletionSource",
            "<TResultT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzacn;Lcom/google/android/gms/internal/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/d",
            "<TResultT;TCallbackT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/internal/zzacn$g;->a:Lcom/google/android/gms/internal/zzacn;

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzpd;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/zzacn$g;->b:Lcom/google/android/gms/internal/d;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzacn$g;->b:Lcom/google/android/gms/internal/d;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/d;->a(Lcom/google/android/gms/internal/c;)Lcom/google/android/gms/internal/d;

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/internal/zzaco;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzaco;",
            "Lcom/google/android/gms/tasks/TaskCompletionSource",
            "<TResultT;>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iput-object p2, p0, Lcom/google/android/gms/internal/zzacn$g;->c:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzacn$g;->b:Lcom/google/android/gms/internal/d;

    invoke-interface {p1}, Lcom/google/android/gms/internal/zzaco;->zzOs()Lcom/google/android/gms/internal/zzacu;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/d;->a(Lcom/google/android/gms/internal/zzacu;)V

    return-void
.end method

.method public final a(Ljava/lang/Object;Lcom/google/android/gms/common/api/Status;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TResultT;",
            "Lcom/google/android/gms/common/api/Status;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzacn$g;->c:Lcom/google/android/gms/tasks/TaskCompletionSource;

    const-string v1, "doExecute must be called before onComplete"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/zzaa;->zzb(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p2, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzacn$g;->c:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {p2}, Lcom/google/android/gms/internal/zzacq;->zzbN(Lcom/google/android/gms/common/api/Status;)Lcom/google/firebase/FirebaseException;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzacn$g;->c:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    goto :goto_0
.end method

.method protected synthetic zza(Lcom/google/android/gms/common/api/Api$zzb;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    check-cast p1, Lcom/google/android/gms/internal/zzaco;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/zzacn$g;->a(Lcom/google/android/gms/internal/zzaco;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method
