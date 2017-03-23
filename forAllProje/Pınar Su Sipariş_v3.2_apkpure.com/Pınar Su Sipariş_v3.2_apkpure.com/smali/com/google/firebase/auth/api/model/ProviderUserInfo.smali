.class public Lcom/google/firebase/auth/api/model/ProviderUserInfo;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/firebase/auth/api/model/ProviderUserInfo;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final mVersionCode:I
    .annotation runtime Lcom/google/android/gms/internal/zzacw;
    .end annotation
.end field

.field private zzaBl:Ljava/lang/String;
    .annotation runtime Lcom/google/android/gms/internal/zzaku;
        value = "photoUrl"
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

.field private zzbFX:Ljava/lang/String;
    .annotation runtime Lcom/google/android/gms/internal/zzaku;
        value = "federatedId"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/firebase/auth/api/model/zze;

    invoke-direct {v0}, Lcom/google/firebase/auth/api/model/zze;-><init>()V

    sput-object v0, Lcom/google/firebase/auth/api/model/ProviderUserInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/firebase/auth/api/model/ProviderUserInfo;->mVersionCode:I

    return-void
.end method

.method constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/firebase/auth/api/model/ProviderUserInfo;->mVersionCode:I

    iput-object p2, p0, Lcom/google/firebase/auth/api/model/ProviderUserInfo;->zzbFX:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/firebase/auth/api/model/ProviderUserInfo;->zzaco:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/firebase/auth/api/model/ProviderUserInfo;->zzaBl:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/firebase/auth/api/model/ProviderUserInfo;->zzbFO:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getDisplayName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/api/model/ProviderUserInfo;->zzaco:Ljava/lang/String;

    return-object v0
.end method

.method public getPhotoUri()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/api/model/ProviderUserInfo;->zzaBl:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/firebase/auth/api/model/ProviderUserInfo;->zzaBl:Ljava/lang/String;

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getProviderId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/api/model/ProviderUserInfo;->zzbFO:Ljava/lang/String;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/firebase/auth/api/model/zze;->zza(Lcom/google/firebase/auth/api/model/ProviderUserInfo;Landroid/os/Parcel;I)V

    return-void
.end method

.method public zzOK()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/api/model/ProviderUserInfo;->zzbFX:Ljava/lang/String;

    return-object v0
.end method

.method public zzOo()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/api/model/ProviderUserInfo;->zzaBl:Ljava/lang/String;

    return-object v0
.end method
