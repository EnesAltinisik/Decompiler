.class public Lcom/google/firebase/auth/FacebookAuthCredential;
.super Lcom/google/firebase/auth/AuthCredential;


# instance fields
.field private final zzbmS:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/firebase/auth/AuthCredential;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/zzaa;->zzdl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/auth/FacebookAuthCredential;->zzbmS:Ljava/lang/String;

    return-void
.end method

.method public static zza(Lcom/google/firebase/auth/FacebookAuthCredential;)Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;
    .locals 6

    const/4 v1, 0x0

    invoke-static {p0}, Lcom/google/android/gms/common/internal/zzaa;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;

    invoke-virtual {p0}, Lcom/google/firebase/auth/FacebookAuthCredential;->getAccessToken()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/google/firebase/auth/FacebookAuthCredential;->getProvider()Ljava/lang/String;

    move-result-object v3

    move-object v4, v1

    move-object v5, v1

    invoke-direct/range {v0 .. v5}, Lcom/google/firebase/auth/api/model/VerifyAssertionRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public getAccessToken()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/FacebookAuthCredential;->zzbmS:Ljava/lang/String;

    return-object v0
.end method

.method public getProvider()Ljava/lang/String;
    .locals 1

    const-string v0, "facebook.com"

    return-object v0
.end method
