.class final Lcom/google/android/gms/internal/zzacn$o;
.super Lcom/google/android/gms/internal/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/zzacn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "o"
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
.field private n:Ljava/lang/String;

.field private o:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/d;-><init>(I)V

    const-string v0, "email cannot be null or empty"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/zzaa;->zzh(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzacn$o;->n:Ljava/lang/String;

    const-string v0, "password cannot be null or empty"

    invoke-static {p2, v0}, Lcom/google/android/gms/common/internal/zzaa;->zzh(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzacn$o;->o:Ljava/lang/String;

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

    iget-object v0, p0, Lcom/google/android/gms/internal/zzacn$o;->e:Lcom/google/android/gms/internal/zzacu;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzacn$o;->n:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzacn$o;->o:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzacn$o;->b:Lcom/google/android/gms/internal/d$a;

    invoke-interface {v0, v1, v2, v3}, Lcom/google/android/gms/internal/zzacu;->zzd(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/zzact;)V

    return-void
.end method

.method public b()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzacn$o;->c:Lcom/google/firebase/FirebaseApp;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzacn$o;->i:Lcom/google/firebase/auth/api/model/GetAccountInfoUser;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/zzacn;->zzb(Lcom/google/firebase/FirebaseApp;Lcom/google/firebase/auth/api/model/GetAccountInfoUser;)Lcom/google/android/gms/internal/zzadh;

    move-result-object v1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzacn$o;->f:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/internal/zzadc;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzacn$o;->h:Lcom/google/firebase/auth/api/model/GetTokenResponse;

    invoke-interface {v0, v2, v1}, Lcom/google/android/gms/internal/zzadc;->zza(Lcom/google/firebase/auth/api/model/GetTokenResponse;Lcom/google/firebase/auth/FirebaseUser;)V

    new-instance v0, Lcom/google/android/gms/internal/zzade;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/zzade;-><init>(Lcom/google/android/gms/internal/zzadh;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzacn$o;->b(Ljava/lang/Object;)V

    return-void
.end method
