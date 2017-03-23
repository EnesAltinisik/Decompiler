.class public Lcom/google/android/gms/internal/zzacs;
.super Ljava/lang/Object;


# direct methods
.method public static zzOt()Lcom/google/android/gms/internal/zzajz;
    .locals 7

    new-instance v0, Lcom/google/android/gms/internal/zzacr;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzacr;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/zzada;

    invoke-direct {v1}, Lcom/google/android/gms/internal/zzada;-><init>()V

    new-instance v2, Lcom/google/android/gms/internal/zzacz;

    invoke-direct {v2}, Lcom/google/android/gms/internal/zzacz;-><init>()V

    new-instance v3, Lcom/google/android/gms/internal/zzaka;

    invoke-direct {v3}, Lcom/google/android/gms/internal/zzaka;-><init>()V

    const/4 v4, 0x3

    new-array v4, v4, [I

    fill-array-data v4, :array_0

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/zzaka;->zzc([I)Lcom/google/android/gms/internal/zzaka;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/zzaka;->zzVx()Lcom/google/android/gms/internal/zzaka;

    move-result-object v3

    const/4 v4, 0x1

    new-array v4, v4, [Lcom/google/android/gms/internal/zzajv;

    const/4 v5, 0x0

    new-instance v6, Lcom/google/android/gms/internal/zzacm;

    invoke-direct {v6}, Lcom/google/android/gms/internal/zzacm;-><init>()V

    aput-object v6, v4, v5

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/zzaka;->zza([Lcom/google/android/gms/internal/zzajv;)Lcom/google/android/gms/internal/zzaka;

    move-result-object v3

    const-class v4, Lcom/google/firebase/auth/api/model/GetAccountInfoUserList;

    invoke-virtual {v3, v4, v0}, Lcom/google/android/gms/internal/zzaka;->zza(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lcom/google/android/gms/internal/zzaka;

    move-result-object v3

    const-class v4, Lcom/google/firebase/auth/api/model/StringList;

    invoke-virtual {v3, v4, v1}, Lcom/google/android/gms/internal/zzaka;->zza(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lcom/google/android/gms/internal/zzaka;

    move-result-object v3

    const-class v4, Lcom/google/firebase/auth/api/model/ProviderUserInfoList;

    invoke-virtual {v3, v4, v2}, Lcom/google/android/gms/internal/zzaka;->zza(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lcom/google/android/gms/internal/zzaka;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/zzaka;->zzVy()Lcom/google/android/gms/internal/zzajz;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/zzacr;->zza(Lcom/google/android/gms/internal/zzajz;)V

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/zzada;->zza(Lcom/google/android/gms/internal/zzajz;)V

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/zzacz;->zza(Lcom/google/android/gms/internal/zzajz;)V

    return-object v3

    nop

    :array_0
    .array-data 4
        0x8
        0x80
        0x40
    .end array-data
.end method
