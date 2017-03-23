.class public Lcom/google/android/gms/internal/zzade;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/firebase/auth/AuthResult;


# instance fields
.field private zzbGe:Lcom/google/android/gms/internal/zzadh;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzadh;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/zzaa;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzadh;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzade;->zzbGe:Lcom/google/android/gms/internal/zzadh;

    return-void
.end method


# virtual methods
.method public getUser()Lcom/google/firebase/auth/FirebaseUser;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzade;->zzbGe:Lcom/google/android/gms/internal/zzadh;

    return-object v0
.end method
