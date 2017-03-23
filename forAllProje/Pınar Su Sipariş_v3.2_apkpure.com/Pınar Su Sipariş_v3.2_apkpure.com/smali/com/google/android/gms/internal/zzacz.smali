.class public Lcom/google/android/gms/internal/zzacz;
.super Lcom/google/android/gms/internal/zzakr;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/zzakr",
        "<",
        "Lcom/google/firebase/auth/api/model/ProviderUserInfoList;",
        ">;"
    }
.end annotation


# instance fields
.field private zzbFd:Lcom/google/android/gms/internal/zzajz;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzakr;-><init>()V

    return-void
.end method


# virtual methods
.method public zza(Lcom/google/android/gms/internal/zzajz;)V
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/common/internal/zzaa;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzajz;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzacz;->zzbFd:Lcom/google/android/gms/internal/zzajz;

    return-void
.end method

.method public zza(Lcom/google/android/gms/internal/zzaly;Lcom/google/firebase/auth/api/model/ProviderUserInfoList;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v2, 0x0

    if-nez p2, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzaly;->zzWk()Lcom/google/android/gms/internal/zzaly;

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzacz;->zzbFd:Lcom/google/android/gms/internal/zzajz;

    const-class v1, Lcom/google/firebase/auth/api/model/ProviderUserInfo;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzajz;->zzk(Ljava/lang/Class;)Lcom/google/android/gms/internal/zzakr;

    move-result-object v3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzaly;->zzWg()Lcom/google/android/gms/internal/zzaly;

    invoke-virtual {p2}, Lcom/google/firebase/auth/api/model/ProviderUserInfoList;->zzOD()Ljava/util/List;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    move v1, v0

    :goto_1
    if-ge v2, v1, :cond_2

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/auth/api/model/ProviderUserInfo;

    invoke-virtual {v3, p1, v0}, Lcom/google/android/gms/internal/zzakr;->zza(Lcom/google/android/gms/internal/zzaly;Ljava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    move v1, v2

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzaly;->zzWh()Lcom/google/android/gms/internal/zzaly;

    goto :goto_0
.end method

.method public bridge synthetic zza(Lcom/google/android/gms/internal/zzaly;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    check-cast p2, Lcom/google/firebase/auth/api/model/ProviderUserInfoList;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/zzacz;->zza(Lcom/google/android/gms/internal/zzaly;Lcom/google/firebase/auth/api/model/ProviderUserInfoList;)V

    return-void
.end method

.method public synthetic zzb(Lcom/google/android/gms/internal/zzalw;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzacz;->zzc(Lcom/google/android/gms/internal/zzalw;)Lcom/google/firebase/auth/api/model/ProviderUserInfoList;

    move-result-object v0

    return-object v0
.end method

.method public zzc(Lcom/google/android/gms/internal/zzalw;)Lcom/google/firebase/auth/api/model/ProviderUserInfoList;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzalw;->zzWa()Lcom/google/android/gms/internal/zzalx;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/zzalx;->zzbZG:Lcom/google/android/gms/internal/zzalx;

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzalw;->nextNull()V

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    new-instance v1, Lcom/google/firebase/auth/api/model/ProviderUserInfoList;

    invoke-direct {v1}, Lcom/google/firebase/auth/api/model/ProviderUserInfoList;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzacz;->zzbFd:Lcom/google/android/gms/internal/zzajz;

    const-class v2, Lcom/google/firebase/auth/api/model/ProviderUserInfo;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/zzajz;->zzk(Ljava/lang/Class;)Lcom/google/android/gms/internal/zzakr;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzalw;->beginArray()V

    :goto_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzalw;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/zzakr;->zzb(Lcom/google/android/gms/internal/zzalw;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/auth/api/model/ProviderUserInfo;

    invoke-virtual {v1}, Lcom/google/firebase/auth/api/model/ProviderUserInfoList;->zzOD()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzalw;->endArray()V

    move-object v0, v1

    goto :goto_0
.end method
