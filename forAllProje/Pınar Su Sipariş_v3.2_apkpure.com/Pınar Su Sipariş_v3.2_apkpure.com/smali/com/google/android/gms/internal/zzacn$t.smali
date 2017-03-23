.class final Lcom/google/android/gms/internal/zzacn$t;
.super Lcom/google/android/gms/internal/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/zzacn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "t"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/d",
        "<",
        "Ljava/lang/Void;",
        "Lcom/google/android/gms/internal/zzadc;",
        ">;"
    }
.end annotation


# instance fields
.field private final n:Lcom/google/firebase/auth/UserProfileChangeRequest;


# direct methods
.method public constructor <init>(Lcom/google/firebase/auth/UserProfileChangeRequest;)V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/d;-><init>(I)V

    const-string v0, "request cannot be null"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/zzaa;->zzb(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/auth/UserProfileChangeRequest;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzacn$t;->n:Lcom/google/firebase/auth/UserProfileChangeRequest;

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

    iget-object v0, p0, Lcom/google/android/gms/internal/zzacn$t;->e:Lcom/google/android/gms/internal/zzacu;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzacn$t;->d:Lcom/google/firebase/auth/FirebaseUser;

    invoke-virtual {v1}, Lcom/google/firebase/auth/FirebaseUser;->zzOm()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzacn$t;->n:Lcom/google/firebase/auth/UserProfileChangeRequest;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzacn$t;->b:Lcom/google/android/gms/internal/d$a;

    invoke-interface {v0, v1, v2, v3}, Lcom/google/android/gms/internal/zzacu;->zza(Ljava/lang/String;Lcom/google/firebase/auth/UserProfileChangeRequest;Lcom/google/android/gms/internal/zzact;)V

    return-void
.end method

.method public b()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzacn$t;->f:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/internal/zzadc;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzacn$t;->h:Lcom/google/firebase/auth/api/model/GetTokenResponse;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzacn$t;->c:Lcom/google/firebase/FirebaseApp;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzacn$t;->i:Lcom/google/firebase/auth/api/model/GetAccountInfoUser;

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/zzacn;->zzb(Lcom/google/firebase/FirebaseApp;Lcom/google/firebase/auth/api/model/GetAccountInfoUser;)Lcom/google/android/gms/internal/zzadh;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/zzadc;->zza(Lcom/google/firebase/auth/api/model/GetTokenResponse;Lcom/google/firebase/auth/FirebaseUser;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzacn$t;->c()V

    return-void
.end method
