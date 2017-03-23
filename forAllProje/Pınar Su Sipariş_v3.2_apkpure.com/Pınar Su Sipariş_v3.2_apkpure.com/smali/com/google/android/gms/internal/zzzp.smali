.class public Lcom/google/android/gms/internal/zzzp;
.super Lcom/google/android/gms/internal/zzvj;


# instance fields
.field private final mContext:Landroid/content/Context;

.field private final zzbuu:Lcom/google/android/gms/internal/zzuu$zzc;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/zzuu$zzc;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzvj;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzzp;->mContext:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzzp;->zzbuu:Lcom/google/android/gms/internal/zzuu$zzc;

    return-void
.end method


# virtual methods
.method protected varargs zza(Lcom/google/android/gms/internal/zzuw;[Lcom/google/android/gms/internal/zzabh;)Lcom/google/android/gms/internal/zzabh;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzuw;",
            "[",
            "Lcom/google/android/gms/internal/zzabh",
            "<*>;)",
            "Lcom/google/android/gms/internal/zzabh",
            "<*>;"
        }
    .end annotation

    const/4 v2, 0x0

    const/4 v1, 0x1

    if-eqz p2, :cond_1

    move v0, v1

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/zzaa;->zzaj(Z)V

    array-length v0, p2

    if-lt v0, v1, :cond_2

    move v0, v1

    :goto_1
    invoke-static {v0}, Lcom/google/android/gms/common/internal/zzaa;->zzaj(Z)V

    aget-object v0, p2, v2

    invoke-static {v0}, Lcom/google/android/gms/internal/zzvi;->zzd(Lcom/google/android/gms/internal/zzabh;)Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/internal/zzzp;->zzbuu:Lcom/google/android/gms/internal/zzuu$zzc;

    invoke-interface {v2}, Lcom/google/android/gms/internal/zzuu$zzc;->zzLr()Lcom/google/android/gms/internal/zzud;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzud;->zzJJ()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    array-length v2, p2

    if-le v2, v1, :cond_0

    aget-object v0, p2, v1

    :cond_0
    invoke-static {v0}, Lcom/google/android/gms/internal/zzabq;->zzY(Ljava/lang/Object;)Lcom/google/android/gms/internal/zzabh;

    move-result-object v0

    return-object v0

    :cond_1
    move v0, v2

    goto :goto_0

    :cond_2
    move v0, v2

    goto :goto_1
.end method
