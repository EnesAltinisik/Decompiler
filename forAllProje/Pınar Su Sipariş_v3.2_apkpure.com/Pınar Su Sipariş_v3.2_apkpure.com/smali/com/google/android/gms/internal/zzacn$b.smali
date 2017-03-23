.class final Lcom/google/android/gms/internal/zzacn$b;
.super Lcom/google/android/gms/internal/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/zzacn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/d",
        "<",
        "Ljava/lang/Void;",
        "Lcom/google/android/gms/internal/zzadk;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x5

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/d;-><init>(I)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzacn$b;->e:Lcom/google/android/gms/internal/zzacu;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzacn$b;->d:Lcom/google/firebase/auth/FirebaseUser;

    invoke-virtual {v1}, Lcom/google/firebase/auth/FirebaseUser;->zzOm()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzacn$b;->b:Lcom/google/android/gms/internal/d$a;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/zzacu;->zzg(Ljava/lang/String;Lcom/google/android/gms/internal/zzact;)V

    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzacn$b;->f:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/internal/zzadk;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzadk;->zzOk()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzacn$b;->b(Ljava/lang/Object;)V

    return-void
.end method
