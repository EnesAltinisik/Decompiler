.class public Lcom/google/android/gms/internal/zzys;
.super Lcom/google/android/gms/internal/zzvj;


# instance fields
.field private final zzbtj:Lcom/google/android/gms/internal/zzuu$zzc;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/zzuu$zzc;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzvj;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/zzys;->zzbtj:Lcom/google/android/gms/internal/zzuu$zzc;

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

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz p2, :cond_0

    move v0, v1

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/zzaa;->zzaj(Z)V

    array-length v0, p2

    if-nez v0, :cond_1

    :goto_1
    invoke-static {v1}, Lcom/google/android/gms/common/internal/zzaa;->zzaj(Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzys;->zzbtj:Lcom/google/android/gms/internal/zzuu$zzc;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzuu$zzc;->zzLr()Lcom/google/android/gms/internal/zzud;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/zzud;->zzaG(Z)V

    sget-object v0, Lcom/google/android/gms/internal/zzabl;->zzbvN:Lcom/google/android/gms/internal/zzabl;

    return-object v0

    :cond_0
    move v0, v2

    goto :goto_0

    :cond_1
    move v1, v2

    goto :goto_1
.end method
