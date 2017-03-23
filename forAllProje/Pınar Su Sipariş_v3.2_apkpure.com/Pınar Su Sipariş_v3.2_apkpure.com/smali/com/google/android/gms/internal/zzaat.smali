.class public Lcom/google/android/gms/internal/zzaat;
.super Ljava/lang/Object;


# instance fields
.field private zzbuY:Lcom/google/android/gms/internal/zzaam;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaat;->zzbuY:Lcom/google/android/gms/internal/zzaam;

    if-nez v0, :cond_0

    const-string v0, ""

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzaat;->zzbuY:Lcom/google/android/gms/internal/zzaam;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaam;->getContainerId()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public zzLN()Lcom/google/android/gms/internal/zzaam;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaat;->zzbuY:Lcom/google/android/gms/internal/zzaam;

    return-object v0
.end method

.method public zza(Lcom/google/android/gms/internal/zzaam;)Lcom/google/android/gms/internal/zzaat;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/common/internal/zzaa;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzaat;->zzbuY:Lcom/google/android/gms/internal/zzaam;

    return-object p0
.end method
