.class abstract Lcom/google/android/gms/auth/api/signin/internal/zzc$a;
.super Lcom/google/android/gms/internal/zznt$zza;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/auth/api/signin/internal/zzc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x402
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R::",
        "Lcom/google/android/gms/common/api/Result;",
        ">",
        "Lcom/google/android/gms/internal/zznt$zza",
        "<TR;",
        "Lcom/google/android/gms/auth/api/signin/internal/zzd;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic c:Lcom/google/android/gms/auth/api/signin/internal/zzc;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/auth/api/signin/internal/zzc;Lcom/google/android/gms/common/api/GoogleApiClient;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/auth/api/signin/internal/zzc$a;->c:Lcom/google/android/gms/auth/api/signin/internal/zzc;

    sget-object v0, Lcom/google/android/gms/auth/api/Auth;->GOOGLE_SIGN_IN_API:Lcom/google/android/gms/common/api/Api;

    invoke-direct {p0, v0, p2}, Lcom/google/android/gms/internal/zznt$zza;-><init>(Lcom/google/android/gms/common/api/Api;Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method
