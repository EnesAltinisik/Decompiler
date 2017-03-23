.class public Lcom/google/firebase/auth/api/model/CreateAuthUriResponse;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/firebase/auth/api/model/CreateAuthUriResponse;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final mVersionCode:I
    .annotation runtime Lcom/google/android/gms/internal/zzacw;
    .end annotation
.end field

.field private zzYQ:Z
    .annotation runtime Lcom/google/android/gms/internal/zzaku;
        value = "registered"
    .end annotation
.end field

.field private zzbFN:Ljava/lang/String;
    .annotation runtime Lcom/google/android/gms/internal/zzaku;
        value = "authUri"
    .end annotation
.end field

.field private zzbFO:Ljava/lang/String;
    .annotation runtime Lcom/google/android/gms/internal/zzaku;
        value = "providerId"
    .end annotation
.end field

.field private zzbFP:Z
    .annotation runtime Lcom/google/android/gms/internal/zzaku;
        value = "forExistingProvider"
    .end annotation
.end field

.field private zzbFQ:Lcom/google/firebase/auth/api/model/StringList;
    .annotation runtime Lcom/google/android/gms/internal/zzaku;
        value = "allProviders"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/firebase/auth/api/model/zza;

    invoke-direct {v0}, Lcom/google/firebase/auth/api/model/zza;-><init>()V

    sput-object v0, Lcom/google/firebase/auth/api/model/CreateAuthUriResponse;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/firebase/auth/api/model/CreateAuthUriResponse;->mVersionCode:I

    return-void
.end method

.method constructor <init>(ILjava/lang/String;ZLjava/lang/String;ZLcom/google/firebase/auth/api/model/StringList;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/firebase/auth/api/model/CreateAuthUriResponse;->mVersionCode:I

    iput-object p2, p0, Lcom/google/firebase/auth/api/model/CreateAuthUriResponse;->zzbFN:Ljava/lang/String;

    iput-boolean p3, p0, Lcom/google/firebase/auth/api/model/CreateAuthUriResponse;->zzYQ:Z

    iput-object p4, p0, Lcom/google/firebase/auth/api/model/CreateAuthUriResponse;->zzbFO:Ljava/lang/String;

    iput-boolean p5, p0, Lcom/google/firebase/auth/api/model/CreateAuthUriResponse;->zzbFP:Z

    if-nez p6, :cond_0

    invoke-static {}, Lcom/google/firebase/auth/api/model/StringList;->zzON()Lcom/google/firebase/auth/api/model/StringList;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lcom/google/firebase/auth/api/model/CreateAuthUriResponse;->zzbFQ:Lcom/google/firebase/auth/api/model/StringList;

    return-void

    :cond_0
    invoke-static {p6}, Lcom/google/firebase/auth/api/model/StringList;->zza(Lcom/google/firebase/auth/api/model/StringList;)Lcom/google/firebase/auth/api/model/StringList;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public getAllProviders()Ljava/util/List;
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

    iget-object v0, p0, Lcom/google/firebase/auth/api/model/CreateAuthUriResponse;->zzbFQ:Lcom/google/firebase/auth/api/model/StringList;

    invoke-virtual {v0}, Lcom/google/firebase/auth/api/model/StringList;->zzOM()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getProviderId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/api/model/CreateAuthUriResponse;->zzbFO:Ljava/lang/String;

    return-object v0
.end method

.method public isRegistered()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/firebase/auth/api/model/CreateAuthUriResponse;->zzYQ:Z

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/firebase/auth/api/model/zza;->zza(Lcom/google/firebase/auth/api/model/CreateAuthUriResponse;Landroid/os/Parcel;I)V

    return-void
.end method

.method public zzOA()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/firebase/auth/api/model/CreateAuthUriResponse;->zzbFP:Z

    return v0
.end method

.method public zzOB()Lcom/google/firebase/auth/api/model/StringList;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/api/model/CreateAuthUriResponse;->zzbFQ:Lcom/google/firebase/auth/api/model/StringList;

    return-object v0
.end method

.method public zzOz()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/api/model/CreateAuthUriResponse;->zzbFN:Ljava/lang/String;

    return-object v0
.end method
