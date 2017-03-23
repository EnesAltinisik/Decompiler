.class public Lcom/google/firebase/auth/api/model/GetAccountInfoUser;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/firebase/auth/api/model/GetAccountInfoUser;",
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

.field private zzabx:Ljava/lang/String;
    .annotation runtime Lcom/google/android/gms/internal/zzaku;
        value = "passwordHash"
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

.field private zzayv:Ljava/lang/String;
    .annotation runtime Lcom/google/android/gms/internal/zzaku;
        value = "localId"
    .end annotation
.end field

.field private zzbFR:Z
    .annotation runtime Lcom/google/android/gms/internal/zzaku;
        value = "emailVerified"
    .end annotation
.end field

.field private zzbFS:Lcom/google/firebase/auth/api/model/ProviderUserInfoList;
    .annotation runtime Lcom/google/android/gms/internal/zzaku;
        value = "providerUserInfo"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/firebase/auth/api/model/zzb;

    invoke-direct {v0}, Lcom/google/firebase/auth/api/model/zzb;-><init>()V

    sput-object v0, Lcom/google/firebase/auth/api/model/GetAccountInfoUser;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/firebase/auth/api/model/GetAccountInfoUser;->mVersionCode:I

    new-instance v0, Lcom/google/firebase/auth/api/model/ProviderUserInfoList;

    invoke-direct {v0}, Lcom/google/firebase/auth/api/model/ProviderUserInfoList;-><init>()V

    iput-object v0, p0, Lcom/google/firebase/auth/api/model/GetAccountInfoUser;->zzbFS:Lcom/google/firebase/auth/api/model/ProviderUserInfoList;

    return-void
.end method

.method constructor <init>(ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/google/firebase/auth/api/model/ProviderUserInfoList;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/firebase/auth/api/model/GetAccountInfoUser;->mVersionCode:I

    iput-object p2, p0, Lcom/google/firebase/auth/api/model/GetAccountInfoUser;->zzayv:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/firebase/auth/api/model/GetAccountInfoUser;->zzacn:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/google/firebase/auth/api/model/GetAccountInfoUser;->zzbFR:Z

    iput-object p5, p0, Lcom/google/firebase/auth/api/model/GetAccountInfoUser;->zzaco:Ljava/lang/String;

    iput-object p6, p0, Lcom/google/firebase/auth/api/model/GetAccountInfoUser;->zzaBl:Ljava/lang/String;

    if-nez p7, :cond_0

    invoke-static {}, Lcom/google/firebase/auth/api/model/ProviderUserInfoList;->zzOL()Lcom/google/firebase/auth/api/model/ProviderUserInfoList;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lcom/google/firebase/auth/api/model/GetAccountInfoUser;->zzbFS:Lcom/google/firebase/auth/api/model/ProviderUserInfoList;

    iput-object p8, p0, Lcom/google/firebase/auth/api/model/GetAccountInfoUser;->zzabx:Ljava/lang/String;

    return-void

    :cond_0
    invoke-static {p7}, Lcom/google/firebase/auth/api/model/ProviderUserInfoList;->zza(Lcom/google/firebase/auth/api/model/ProviderUserInfoList;)Lcom/google/firebase/auth/api/model/ProviderUserInfoList;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getDisplayName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/api/model/GetAccountInfoUser;->zzaco:Ljava/lang/String;

    return-object v0
.end method

.method public getEmail()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/api/model/GetAccountInfoUser;->zzacn:Ljava/lang/String;

    return-object v0
.end method

.method public getLocalId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/api/model/GetAccountInfoUser;->zzayv:Ljava/lang/String;

    return-object v0
.end method

.method public getPassword()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/api/model/GetAccountInfoUser;->zzabx:Ljava/lang/String;

    return-object v0
.end method

.method public getPhotoUri()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/api/model/GetAccountInfoUser;->zzaBl:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/firebase/auth/api/model/GetAccountInfoUser;->zzaBl:Ljava/lang/String;

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/firebase/auth/api/model/zzb;->zza(Lcom/google/firebase/auth/api/model/GetAccountInfoUser;Landroid/os/Parcel;I)V

    return-void
.end method

.method public zzOC()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/firebase/auth/api/model/GetAccountInfoUser;->zzbFR:Z

    return v0
.end method

.method public zzOD()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/firebase/auth/api/model/ProviderUserInfo;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/auth/api/model/GetAccountInfoUser;->zzbFS:Lcom/google/firebase/auth/api/model/ProviderUserInfoList;

    invoke-virtual {v0}, Lcom/google/firebase/auth/api/model/ProviderUserInfoList;->zzOD()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public zzOE()Lcom/google/firebase/auth/api/model/ProviderUserInfoList;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/api/model/GetAccountInfoUser;->zzbFS:Lcom/google/firebase/auth/api/model/ProviderUserInfoList;

    return-object v0
.end method

.method public zzOo()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/api/model/GetAccountInfoUser;->zzaBl:Ljava/lang/String;

    return-object v0
.end method
