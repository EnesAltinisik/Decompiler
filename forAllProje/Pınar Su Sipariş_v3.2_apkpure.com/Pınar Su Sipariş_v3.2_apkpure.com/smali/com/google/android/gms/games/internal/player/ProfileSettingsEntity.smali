.class public Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;

# interfaces
.implements Lcom/google/android/gms/games/Players$LoadProfileSettingsResult;


# static fields
.field public static final CREATOR:Lcom/google/android/gms/games/internal/player/ProfileSettingsEntityCreator;


# instance fields
.field private final mVersionCode:I

.field private final zzaJJ:Z

.field private final zzaJL:Ljava/lang/String;

.field private final zzaPT:Z

.field private final zzaPU:Z

.field private final zzaPV:Lcom/google/android/gms/games/internal/player/StockProfileImageEntity;

.field private final zzaPW:Z

.field private final zzaPX:Z

.field private final zzaaO:Lcom/google/android/gms/common/api/Status;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntityCreator;

    invoke-direct {v0}, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntityCreator;-><init>()V

    sput-object v0, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;->CREATOR:Lcom/google/android/gms/games/internal/player/ProfileSettingsEntityCreator;

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/common/api/Status;Ljava/lang/String;ZZZLcom/google/android/gms/games/internal/player/StockProfileImageEntity;ZZ)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;->mVersionCode:I

    iput-object p2, p0, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;->zzaaO:Lcom/google/android/gms/common/api/Status;

    iput-object p3, p0, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;->zzaJL:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;->zzaPT:Z

    iput-boolean p5, p0, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;->zzaJJ:Z

    iput-boolean p6, p0, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;->zzaPU:Z

    iput-object p7, p0, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;->zzaPV:Lcom/google/android/gms/games/internal/player/StockProfileImageEntity;

    iput-boolean p8, p0, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;->zzaPW:Z

    iput-boolean p9, p0, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;->zzaPX:Z

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 6

    const/4 v5, 0x0

    const/4 v4, 0x0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    const/4 v0, 0x3

    iput v0, p0, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;->mVersionCode:I

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p1}, Lcom/google/android/gms/common/data/DataHolder;->getStatusCode()I

    move-result v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    iput-object v0, p0, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;->zzaaO:Lcom/google/android/gms/common/api/Status;

    iget-object v0, p0, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;->zzaaO:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->isSuccess()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/common/data/DataHolder;->getCount()I

    move-result v0

    if-lez v0, :cond_1

    invoke-virtual {p1, v4}, Lcom/google/android/gms/common/data/DataHolder;->zzbP(I)I

    move-result v0

    const-string v1, "gamer_tag"

    invoke-virtual {p1, v1, v4, v0}, Lcom/google/android/gms/common/data/DataHolder;->zzd(Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;->zzaJL:Ljava/lang/String;

    const-string v1, "gamer_tag_explicitly_set"

    invoke-virtual {p1, v1, v4, v0}, Lcom/google/android/gms/common/data/DataHolder;->zze(Ljava/lang/String;II)Z

    move-result v1

    iput-boolean v1, p0, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;->zzaPT:Z

    const-string v1, "profile_visible"

    invoke-virtual {p1, v1, v4, v0}, Lcom/google/android/gms/common/data/DataHolder;->zze(Ljava/lang/String;II)Z

    move-result v1

    iput-boolean v1, p0, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;->zzaJJ:Z

    const-string v1, "profile_visibility_explicitly_set"

    invoke-virtual {p1, v1, v4, v0}, Lcom/google/android/gms/common/data/DataHolder;->zze(Ljava/lang/String;II)Z

    move-result v1

    iput-boolean v1, p0, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;->zzaPU:Z

    const-string v1, "stock_avatar_url"

    invoke-virtual {p1, v1, v4, v0}, Lcom/google/android/gms/common/data/DataHolder;->zzd(Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v1

    const-string v2, "stock_avatar_uri"

    invoke-virtual {p1, v2, v4, v0}, Lcom/google/android/gms/common/data/DataHolder;->zzd(Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_0

    new-instance v3, Lcom/google/android/gms/games/internal/player/StockProfileImageEntity;

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v3, v1, v2}, Lcom/google/android/gms/games/internal/player/StockProfileImageEntity;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    iput-object v3, p0, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;->zzaPV:Lcom/google/android/gms/games/internal/player/StockProfileImageEntity;

    :goto_0
    const-string v1, "profile_discoverable"

    invoke-virtual {p1, v1, v4, v0}, Lcom/google/android/gms/common/data/DataHolder;->zze(Ljava/lang/String;II)Z

    move-result v1

    iput-boolean v1, p0, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;->zzaPW:Z

    const-string v1, "auto_sign_in"

    invoke-virtual {p1, v1, v4, v0}, Lcom/google/android/gms/common/data/DataHolder;->zze(Ljava/lang/String;II)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;->zzaPX:Z

    :goto_1
    return-void

    :cond_0
    iput-object v5, p0, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;->zzaPV:Lcom/google/android/gms/games/internal/player/StockProfileImageEntity;

    goto :goto_0

    :cond_1
    iput-object v5, p0, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;->zzaJL:Ljava/lang/String;

    iput-boolean v4, p0, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;->zzaPT:Z

    iput-boolean v4, p0, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;->zzaJJ:Z

    iput-boolean v4, p0, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;->zzaPU:Z

    iput-object v5, p0, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;->zzaPV:Lcom/google/android/gms/games/internal/player/StockProfileImageEntity;

    iput-boolean v4, p0, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;->zzaPW:Z

    iput-boolean v4, p0, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;->zzaPX:Z

    goto :goto_1
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    instance-of v2, p1, Lcom/google/android/gms/games/Players$LoadProfileSettingsResult;

    if-nez v2, :cond_1

    move v0, v1

    :cond_0
    :goto_0
    return v0

    :cond_1
    if-eq p0, p1, :cond_0

    check-cast p1, Lcom/google/android/gms/games/Players$LoadProfileSettingsResult;

    iget-object v2, p0, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;->zzaJL:Ljava/lang/String;

    invoke-interface {p1}, Lcom/google/android/gms/games/Players$LoadProfileSettingsResult;->zzyQ()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/zzz;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-boolean v2, p0, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;->zzaPT:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {p1}, Lcom/google/android/gms/games/Players$LoadProfileSettingsResult;->zzza()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/zzz;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-boolean v2, p0, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;->zzaJJ:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {p1}, Lcom/google/android/gms/games/Players$LoadProfileSettingsResult;->zzyT()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/zzz;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-boolean v2, p0, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;->zzaPU:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {p1}, Lcom/google/android/gms/games/Players$LoadProfileSettingsResult;->zzyY()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/zzz;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;->zzaaO:Lcom/google/android/gms/common/api/Status;

    invoke-interface {p1}, Lcom/google/android/gms/games/Players$LoadProfileSettingsResult;->getStatus()Lcom/google/android/gms/common/api/Status;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/zzz;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;->zzaPV:Lcom/google/android/gms/games/internal/player/StockProfileImageEntity;

    invoke-interface {p1}, Lcom/google/android/gms/games/Players$LoadProfileSettingsResult;->zzyZ()Lcom/google/android/gms/games/internal/player/StockProfileImage;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/zzz;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-boolean v2, p0, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;->zzaPW:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {p1}, Lcom/google/android/gms/games/Players$LoadProfileSettingsResult;->zzzb()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/zzz;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-boolean v2, p0, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;->zzaPX:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {p1}, Lcom/google/android/gms/games/Players$LoadProfileSettingsResult;->zzzc()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/zzz;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    :cond_2
    move v0, v1

    goto/16 :goto_0
.end method

.method public getStatus()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;->zzaaO:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method

.method public getVersionCode()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;->mVersionCode:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    const/16 v0, 0x8

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;->zzaJL:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-boolean v2, p0, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;->zzaPT:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-boolean v2, p0, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;->zzaJJ:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x3

    iget-boolean v2, p0, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;->zzaPU:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;->zzaaO:Lcom/google/android/gms/common/api/Status;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;->zzaPV:Lcom/google/android/gms/games/internal/player/StockProfileImageEntity;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    iget-boolean v2, p0, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;->zzaPW:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x7

    iget-boolean v2, p0, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;->zzaPX:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/zzz;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lcom/google/android/gms/common/internal/zzz;->zzy(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/zzz$zza;

    move-result-object v0

    const-string v1, "GamerTag"

    iget-object v2, p0, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;->zzaJL:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/zzz$zza;->zzg(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/zzz$zza;

    move-result-object v0

    const-string v1, "IsGamerTagExplicitlySet"

    iget-boolean v2, p0, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;->zzaPT:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/zzz$zza;->zzg(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/zzz$zza;

    move-result-object v0

    const-string v1, "IsProfileVisible"

    iget-boolean v2, p0, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;->zzaJJ:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/zzz$zza;->zzg(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/zzz$zza;

    move-result-object v0

    const-string v1, "IsVisibilityExplicitlySet"

    iget-boolean v2, p0, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;->zzaPU:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/zzz$zza;->zzg(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/zzz$zza;

    move-result-object v0

    const-string v1, "Status"

    iget-object v2, p0, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;->zzaaO:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/zzz$zza;->zzg(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/zzz$zza;

    move-result-object v0

    const-string v1, "StockProfileImage"

    iget-object v2, p0, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;->zzaPV:Lcom/google/android/gms/games/internal/player/StockProfileImageEntity;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/zzz$zza;->zzg(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/zzz$zza;

    move-result-object v0

    const-string v1, "IsProfileDiscoverable"

    iget-boolean v2, p0, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;->zzaPW:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/zzz$zza;->zzg(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/zzz$zza;

    move-result-object v0

    const-string v1, "AutoSignIn"

    iget-boolean v2, p0, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;->zzaPX:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/zzz$zza;->zzg(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/zzz$zza;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/zzz$zza;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntityCreator;->zza(Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;Landroid/os/Parcel;I)V

    return-void
.end method

.method public zzyQ()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;->zzaJL:Ljava/lang/String;

    return-object v0
.end method

.method public zzyT()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;->zzaJJ:Z

    return v0
.end method

.method public zzyY()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;->zzaPU:Z

    return v0
.end method

.method public zzyZ()Lcom/google/android/gms/games/internal/player/StockProfileImage;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;->zzaPV:Lcom/google/android/gms/games/internal/player/StockProfileImageEntity;

    return-object v0
.end method

.method public zzza()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;->zzaPT:Z

    return v0
.end method

.method public zzzb()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;->zzaPW:Z

    return v0
.end method

.method public zzzc()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;->zzaPX:Z

    return v0
.end method
