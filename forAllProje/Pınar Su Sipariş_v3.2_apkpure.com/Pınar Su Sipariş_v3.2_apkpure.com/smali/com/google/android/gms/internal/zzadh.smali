.class public Lcom/google/android/gms/internal/zzadh;
.super Lcom/google/firebase/auth/FirebaseUser;


# instance fields
.field private zzbGf:Ljava/lang/String;
    .annotation runtime Lcom/google/android/gms/internal/zzaku;
        value = "cachedTokenState"
    .end annotation
.end field

.field private zzbGg:Lcom/google/android/gms/internal/zzadf;
    .annotation runtime Lcom/google/android/gms/internal/zzaku;
        value = "defaultUserInfo"
    .end annotation
.end field

.field private zzbGh:Ljava/lang/String;
    .annotation runtime Lcom/google/android/gms/internal/zzaku;
        value = "applicationName"
    .end annotation
.end field

.field private zzbGi:Ljava/lang/String;
    .annotation runtime Lcom/google/android/gms/internal/zzaku;
        value = "type"
    .end annotation
.end field

.field private zzbGj:Ljava/util/List;
    .annotation runtime Lcom/google/android/gms/internal/zzaku;
        value = "userInfos"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzadf;",
            ">;"
        }
    .end annotation
.end field

.field private zzbGk:Ljava/util/List;
    .annotation runtime Lcom/google/android/gms/internal/zzaku;
        value = "providers"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private zzbGl:Ljava/util/Map;
    .annotation runtime Lcom/google/android/gms/internal/zzaku;
        value = "providerInfo"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/zzadf;",
            ">;"
        }
    .end annotation
.end field

.field private zzbGm:Z
    .annotation runtime Lcom/google/android/gms/internal/zzaku;
        value = "anonymous"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/firebase/FirebaseApp;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/FirebaseApp;",
            "Ljava/util/List",
            "<+",
            "Lcom/google/firebase/auth/UserInfo;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/firebase/auth/FirebaseUser;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/zzaa;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/firebase/FirebaseApp;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzadh;->zzbGh:Ljava/lang/String;

    const-string v0, "com.google.firebase.auth.internal.DefaultFirebaseUser"

    iput-object v0, p0, Lcom/google/android/gms/internal/zzadh;->zzbGi:Ljava/lang/String;

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/zzadh;->zzN(Ljava/util/List;)Lcom/google/firebase/auth/FirebaseUser;

    return-void
.end method


# virtual methods
.method public getDisplayName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadh;->zzbGg:Lcom/google/android/gms/internal/zzadf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzadf;->getDisplayName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getEmail()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadh;->zzbGg:Lcom/google/android/gms/internal/zzadf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzadf;->getEmail()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getPhotoUrl()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadh;->zzbGg:Lcom/google/android/gms/internal/zzadf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzadf;->getPhotoUrl()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public getProviderData()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<+",
            "Lcom/google/firebase/auth/UserInfo;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadh;->zzbGj:Ljava/util/List;

    return-object v0
.end method

.method public getProviderId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadh;->zzbGg:Lcom/google/android/gms/internal/zzadf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzadf;->getProviderId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getProviders()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadh;->zzbGk:Ljava/util/List;

    return-object v0
.end method

.method public getUid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadh;->zzbGg:Lcom/google/android/gms/internal/zzadf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzadf;->getUid()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public isAnonymous()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzadh;->zzbGm:Z

    return v0
.end method

.method public zzN(Ljava/util/List;)Lcom/google/firebase/auth/FirebaseUser;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<+",
            "Lcom/google/firebase/auth/UserInfo;",
            ">;)",
            "Lcom/google/firebase/auth/FirebaseUser;"
        }
    .end annotation

    const/4 v2, 0x0

    invoke-static {p1}, Lcom/google/android/gms/common/internal/zzaa;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzadh;->zzbGj:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzadh;->zzbGk:Ljava/util/List;

    new-instance v0, Landroid/support/v4/h/a;

    invoke-direct {v0}, Landroid/support/v4/h/a;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzadh;->zzbGl:Ljava/util/Map;

    move v1, v2

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    new-instance v3, Lcom/google/android/gms/internal/zzadf;

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/auth/UserInfo;

    invoke-direct {v3, v0}, Lcom/google/android/gms/internal/zzadf;-><init>(Lcom/google/firebase/auth/UserInfo;)V

    invoke-virtual {v3}, Lcom/google/android/gms/internal/zzadf;->getProviderId()Ljava/lang/String;

    move-result-object v0

    const-string v4, "firebase"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object v3, p0, Lcom/google/android/gms/internal/zzadh;->zzbGg:Lcom/google/android/gms/internal/zzadf;

    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/internal/zzadh;->zzbGj:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadh;->zzbGl:Ljava/util/Map;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/zzadf;->getProviderId()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzadh;->zzbGk:Ljava/util/List;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/zzadf;->getProviderId()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/zzadh;->zzbGg:Lcom/google/android/gms/internal/zzadf;

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadh;->zzbGj:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzadf;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzadh;->zzbGg:Lcom/google/android/gms/internal/zzadf;

    :cond_2
    return-object p0
.end method

.method public zzOl()Lcom/google/firebase/FirebaseApp;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadh;->zzbGh:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/firebase/FirebaseApp;->getInstance(Ljava/lang/String;)Lcom/google/firebase/FirebaseApp;

    move-result-object v0

    return-object v0
.end method

.method public zzOm()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadh;->zzbGf:Ljava/lang/String;

    return-object v0
.end method

.method public synthetic zzaK(Z)Lcom/google/firebase/auth/FirebaseUser;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzadh;->zzaL(Z)Lcom/google/android/gms/internal/zzadh;

    move-result-object v0

    return-object v0
.end method

.method public zzaL(Z)Lcom/google/android/gms/internal/zzadh;
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/zzadh;->zzbGm:Z

    return-object p0
.end method

.method public zzhG(Ljava/lang/String;)V
    .locals 0

    invoke-static {p1}, Lcom/google/android/gms/common/internal/zzaa;->zzdl(Ljava/lang/String;)Ljava/lang/String;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzadh;->zzbGf:Ljava/lang/String;

    return-void
.end method

.method public zzhI(Ljava/lang/String;)Lcom/google/firebase/auth/FirebaseUser;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadh;->zzbGk:Ljava/util/List;

    invoke-static {p1}, Lcom/google/android/gms/common/internal/zzaa;->zzdl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method
