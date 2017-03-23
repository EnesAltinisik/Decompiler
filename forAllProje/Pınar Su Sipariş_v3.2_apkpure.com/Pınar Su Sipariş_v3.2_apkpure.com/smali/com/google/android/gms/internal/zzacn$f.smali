.class final Lcom/google/android/gms/internal/zzacn$f;
.super Lcom/google/android/gms/internal/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/zzacn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/d",
        "<",
        "Lcom/google/firebase/auth/AuthResult;",
        "Lcom/google/android/gms/internal/zzadc;",
        ">;"
    }
.end annotation


# instance fields
.field private final n:Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;


# direct methods
.method public constructor <init>(Lcom/google/firebase/auth/AuthCredential;)V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/d;-><init>(I)V

    const-string v0, "credential cannot be null"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/zzaa;->zzb(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lcom/google/android/gms/internal/zzadd;->zza(Lcom/google/firebase/auth/AuthCredential;)Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzacn$f;->n:Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzacn$f;->e:Lcom/google/android/gms/internal/zzacu;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzacn$f;->d:Lcom/google/firebase/auth/FirebaseUser;

    invoke-virtual {v1}, Lcom/google/firebase/auth/FirebaseUser;->zzOm()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzacn$f;->n:Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzacn$f;->b:Lcom/google/android/gms/internal/d$a;

    invoke-interface {v0, v1, v2, v3}, Lcom/google/android/gms/internal/zzacu;->zza(Ljava/lang/String;Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;Lcom/google/android/gms/internal/zzact;)V

    return-void
.end method

.method public b()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzacn$f;->c:Lcom/google/firebase/FirebaseApp;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzacn$f;->i:Lcom/google/firebase/auth/api/model/GetAccountInfoUser;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/zzacn;->zzb(Lcom/google/firebase/FirebaseApp;Lcom/google/firebase/auth/api/model/GetAccountInfoUser;)Lcom/google/android/gms/internal/zzadh;

    move-result-object v1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzacn$f;->f:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/internal/zzadc;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzacn$f;->h:Lcom/google/firebase/auth/api/model/GetTokenResponse;

    invoke-interface {v0, v2, v1}, Lcom/google/android/gms/internal/zzadc;->zza(Lcom/google/firebase/auth/api/model/GetTokenResponse;Lcom/google/firebase/auth/FirebaseUser;)V

    new-instance v0, Lcom/google/android/gms/internal/zzade;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/zzade;-><init>(Lcom/google/android/gms/internal/zzadh;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzacn$f;->b(Ljava/lang/Object;)V

    return-void
.end method
