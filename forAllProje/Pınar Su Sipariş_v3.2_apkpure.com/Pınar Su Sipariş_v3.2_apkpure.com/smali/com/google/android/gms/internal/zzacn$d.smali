.class final Lcom/google/android/gms/internal/zzacn$d;
.super Lcom/google/android/gms/internal/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/zzacn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/d",
        "<",
        "Lcom/google/firebase/auth/GetTokenResult;",
        "Lcom/google/android/gms/internal/zzadc;",
        ">;"
    }
.end annotation


# instance fields
.field private final n:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/d;-><init>(I)V

    const-string v0, "refresh token cannot be null"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/zzaa;->zzh(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzacn$d;->n:Ljava/lang/String;

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

    iget-object v0, p0, Lcom/google/android/gms/internal/zzacn$d;->e:Lcom/google/android/gms/internal/zzacu;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzacn$d;->n:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzacn$d;->b:Lcom/google/android/gms/internal/d$a;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/zzacu;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/zzact;)V

    return-void
.end method

.method public b()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzacn$d;->h:Lcom/google/firebase/auth/api/model/GetTokenResponse;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzacn$d;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/firebase/auth/api/model/GetTokenResponse;->zzhH(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzacn$d;->f:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/internal/zzadc;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzacn$d;->h:Lcom/google/firebase/auth/api/model/GetTokenResponse;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzacn$d;->d:Lcom/google/firebase/auth/FirebaseUser;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/zzadc;->zza(Lcom/google/firebase/auth/api/model/GetTokenResponse;Lcom/google/firebase/auth/FirebaseUser;)V

    new-instance v0, Lcom/google/firebase/auth/GetTokenResult;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzacn$d;->h:Lcom/google/firebase/auth/api/model/GetTokenResponse;

    invoke-virtual {v1}, Lcom/google/firebase/auth/api/model/GetTokenResponse;->getAccessToken()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/firebase/auth/GetTokenResult;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzacn$d;->b(Ljava/lang/Object;)V

    return-void
.end method
