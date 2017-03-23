.class Lcom/google/android/gms/internal/d$a;
.super Lcom/google/android/gms/internal/zzact$zza;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/d;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/d;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/d$a;->a:Lcom/google/android/gms/internal/d;

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzact$zza;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/d;Lcom/google/android/gms/internal/d$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/d$a;-><init>(Lcom/google/android/gms/internal/d;)V

    return-void
.end method


# virtual methods
.method public onFailure(Lcom/google/android/gms/common/api/Status;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/d$a;->a:Lcom/google/android/gms/internal/d;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/d;->a(Lcom/google/android/gms/common/api/Status;)V

    return-void
.end method

.method public zzOu()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/d$a;->a:Lcom/google/android/gms/internal/d;

    iget v0, v0, Lcom/google/android/gms/internal/d;->a:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/d$a;->a:Lcom/google/android/gms/internal/d;

    iget v1, v1, Lcom/google/android/gms/internal/d;->a:I

    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0x24

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Unexpected response type "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/zzaa;->zza(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/d$a;->a:Lcom/google/android/gms/internal/d;

    invoke-static {v0}, Lcom/google/android/gms/internal/d;->a(Lcom/google/android/gms/internal/d;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public zzOv()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/d$a;->a:Lcom/google/android/gms/internal/d;

    iget v0, v0, Lcom/google/android/gms/internal/d;->a:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/d$a;->a:Lcom/google/android/gms/internal/d;

    iget v1, v1, Lcom/google/android/gms/internal/d;->a:I

    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0x24

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Unexpected response type "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/zzaa;->zza(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/d$a;->a:Lcom/google/android/gms/internal/d;

    invoke-static {v0}, Lcom/google/android/gms/internal/d;->a(Lcom/google/android/gms/internal/d;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public zza(Lcom/google/firebase/auth/api/model/CreateAuthUriResponse;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/d$a;->a:Lcom/google/android/gms/internal/d;

    iget v0, v0, Lcom/google/android/gms/internal/d;->a:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/d$a;->a:Lcom/google/android/gms/internal/d;

    iget v1, v1, Lcom/google/android/gms/internal/d;->a:I

    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0x24

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Unexpected response type "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/zzaa;->zza(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/d$a;->a:Lcom/google/android/gms/internal/d;

    iput-object p1, v0, Lcom/google/android/gms/internal/d;->j:Lcom/google/firebase/auth/api/model/CreateAuthUriResponse;

    iget-object v0, p0, Lcom/google/android/gms/internal/d$a;->a:Lcom/google/android/gms/internal/d;

    invoke-static {v0}, Lcom/google/android/gms/internal/d;->a(Lcom/google/android/gms/internal/d;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public zza(Lcom/google/firebase/auth/api/model/GetTokenResponse;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/google/android/gms/internal/d$a;->a:Lcom/google/android/gms/internal/d;

    iget v1, v1, Lcom/google/android/gms/internal/d;->a:I

    if-ne v1, v0, :cond_0

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/d$a;->a:Lcom/google/android/gms/internal/d;

    iget v1, v1, Lcom/google/android/gms/internal/d;->a:I

    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0x25

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Unexpected response type: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/zzaa;->zza(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/d$a;->a:Lcom/google/android/gms/internal/d;

    iput-object p1, v0, Lcom/google/android/gms/internal/d;->h:Lcom/google/firebase/auth/api/model/GetTokenResponse;

    iget-object v0, p0, Lcom/google/android/gms/internal/d$a;->a:Lcom/google/android/gms/internal/d;

    invoke-static {v0}, Lcom/google/android/gms/internal/d;->a(Lcom/google/android/gms/internal/d;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public zza(Lcom/google/firebase/auth/api/model/GetTokenResponse;Lcom/google/firebase/auth/api/model/GetAccountInfoUser;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/d$a;->a:Lcom/google/android/gms/internal/d;

    iget v0, v0, Lcom/google/android/gms/internal/d;->a:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/d$a;->a:Lcom/google/android/gms/internal/d;

    iget v1, v1, Lcom/google/android/gms/internal/d;->a:I

    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0x25

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Unexpected response type: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/zzaa;->zza(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/d$a;->a:Lcom/google/android/gms/internal/d;

    iput-object p1, v0, Lcom/google/android/gms/internal/d;->h:Lcom/google/firebase/auth/api/model/GetTokenResponse;

    iget-object v0, p0, Lcom/google/android/gms/internal/d$a;->a:Lcom/google/android/gms/internal/d;

    iput-object p2, v0, Lcom/google/android/gms/internal/d;->i:Lcom/google/firebase/auth/api/model/GetAccountInfoUser;

    iget-object v0, p0, Lcom/google/android/gms/internal/d$a;->a:Lcom/google/android/gms/internal/d;

    invoke-static {v0}, Lcom/google/android/gms/internal/d;->a(Lcom/google/android/gms/internal/d;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
