.class public Lcom/google/android/gms/internal/zzadf;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/firebase/auth/UserInfo;


# instance fields
.field private zzVA:Ljava/lang/String;
    .annotation runtime Lcom/google/android/gms/internal/zzaku;
        value = "userId"
    .end annotation
.end field

.field private zzaBl:Ljava/lang/String;
    .annotation runtime Lcom/google/android/gms/internal/zzaku;
        value = "photoUrl"
    .end annotation
.end field

.field private zzacn:Ljava/lang/String;
    .annotation runtime Lcom/google/android/gms/internal/zzaku;
        value = "email"
    .end annotation
.end field

.field private zzaco:Ljava/lang/String;
    .annotation runtime Lcom/google/android/gms/internal/zzaku;
        value = "displayName"
    .end annotation
.end field

.field private zzbFO:Ljava/lang/String;
    .annotation runtime Lcom/google/android/gms/internal/zzaku;
        value = "providerId"
    .end annotation
.end field

.field private zzbFn:Landroid/net/Uri;
    .annotation runtime Lcom/google/android/gms/internal/zzacw;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/firebase/auth/UserInfo;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/zzaa;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, Lcom/google/firebase/auth/UserInfo;->getUid()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/internal/zzaa;->zzdl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzadf;->zzVA:Ljava/lang/String;

    invoke-interface {p1}, Lcom/google/firebase/auth/UserInfo;->getProviderId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/internal/zzaa;->zzdl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzadf;->zzbFO:Ljava/lang/String;

    invoke-interface {p1}, Lcom/google/firebase/auth/UserInfo;->getDisplayName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzadf;->zzaco:Ljava/lang/String;

    invoke-interface {p1}, Lcom/google/firebase/auth/UserInfo;->getPhotoUrl()Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lcom/google/firebase/auth/UserInfo;->getPhotoUrl()Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzadf;->zzbFn:Landroid/net/Uri;

    invoke-interface {p1}, Lcom/google/firebase/auth/UserInfo;->getPhotoUrl()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzadf;->zzaBl:Ljava/lang/String;

    :cond_0
    invoke-interface {p1}, Lcom/google/firebase/auth/UserInfo;->getEmail()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzadf;->zzacn:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/google/firebase/auth/api/model/GetAccountInfoUser;Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/zzaa;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/zzaa;->zzdl(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/firebase/auth/api/model/GetAccountInfoUser;->getLocalId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/internal/zzaa;->zzdl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzadf;->zzVA:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzadf;->zzbFO:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/firebase/auth/api/model/GetAccountInfoUser;->getEmail()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzadf;->zzacn:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/firebase/auth/api/model/GetAccountInfoUser;->getDisplayName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzadf;->zzaco:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/firebase/auth/api/model/GetAccountInfoUser;->getPhotoUri()Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/zzadf;->zzaBl:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzadf;->zzbFn:Landroid/net/Uri;

    :cond_0
    return-void
.end method

.method public constructor <init>(Lcom/google/firebase/auth/api/model/ProviderUserInfo;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/zzaa;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/firebase/auth/api/model/ProviderUserInfo;->zzOK()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/internal/zzaa;->zzdl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzadf;->zzVA:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/firebase/auth/api/model/ProviderUserInfo;->getProviderId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/internal/zzaa;->zzdl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzadf;->zzbFO:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/firebase/auth/api/model/ProviderUserInfo;->getDisplayName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzadf;->zzaco:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/firebase/auth/api/model/ProviderUserInfo;->getPhotoUri()Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/zzadf;->zzaBl:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzadf;->zzbFn:Landroid/net/Uri;

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzadf;->zzacn:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getDisplayName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadf;->zzaco:Ljava/lang/String;

    return-object v0
.end method

.method public getEmail()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadf;->zzacn:Ljava/lang/String;

    return-object v0
.end method

.method public getPhotoUrl()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadf;->zzaBl:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadf;->zzbFn:Landroid/net/Uri;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadf;->zzaBl:Ljava/lang/String;

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzadf;->zzbFn:Landroid/net/Uri;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzadf;->zzbFn:Landroid/net/Uri;

    return-object v0
.end method

.method public getProviderId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadf;->zzbFO:Ljava/lang/String;

    return-object v0
.end method

.method public getUid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadf;->zzVA:Ljava/lang/String;

    return-object v0
.end method
