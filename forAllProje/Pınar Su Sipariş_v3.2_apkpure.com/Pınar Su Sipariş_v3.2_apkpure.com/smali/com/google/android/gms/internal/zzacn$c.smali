.class final Lcom/google/android/gms/internal/zzacn$c;
.super Lcom/google/android/gms/internal/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/zzacn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/d",
        "<",
        "Lcom/google/firebase/auth/ProviderQueryResult;",
        "Lcom/google/android/gms/internal/zzadc;",
        ">;"
    }
.end annotation


# instance fields
.field private final n:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/d;-><init>(I)V

    const-string v0, "email cannot be null or empty"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/zzaa;->zzh(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzacn$c;->n:Ljava/lang/String;

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

    iget-object v0, p0, Lcom/google/android/gms/internal/zzacn$c;->e:Lcom/google/android/gms/internal/zzacu;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzacn$c;->n:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzacn$c;->b:Lcom/google/android/gms/internal/d$a;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/zzacu;->zzc(Ljava/lang/String;Lcom/google/android/gms/internal/zzact;)V

    return-void
.end method

.method public b()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/zzadi;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzacn$c;->j:Lcom/google/firebase/auth/api/model/CreateAuthUriResponse;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/zzadi;-><init>(Lcom/google/firebase/auth/api/model/CreateAuthUriResponse;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzacn$c;->b(Ljava/lang/Object;)V

    return-void
.end method
