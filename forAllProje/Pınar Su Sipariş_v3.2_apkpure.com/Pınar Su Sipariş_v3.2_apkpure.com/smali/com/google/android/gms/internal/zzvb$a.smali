.class Lcom/google/android/gms/internal/zzvb$a;
.super Lcom/google/android/gms/internal/zzul$zza;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/zzvb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/zzvb;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/zzvb;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzvb$a;->a:Lcom/google/android/gms/internal/zzvb;

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzul$zza;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/zzvb;Lcom/google/android/gms/internal/zzvb$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzvb$a;-><init>(Lcom/google/android/gms/internal/zzvb;)V

    return-void
.end method


# virtual methods
.method public zza(ZLjava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzvb$a;->a:Lcom/google/android/gms/internal/zzvb;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzvb;->zze(Lcom/google/android/gms/internal/zzvb;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/zzvb$a$1;

    invoke-direct {v1, p0, p1, p2}, Lcom/google/android/gms/internal/zzvb$a$1;-><init>(Lcom/google/android/gms/internal/zzvb$a;ZLjava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void
.end method
