.class public abstract Lcom/google/android/gms/internal/zzahj$zza;
.super Lcom/google/android/gms/internal/zzadx$zzb;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/zzahj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "zza"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/zzadx$zzb",
        "<",
        "Lcom/google/android/gms/internal/zzahi;",
        "Lcom/google/android/gms/internal/zzahu;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzadx$zzb;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract zzb(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)V
.end method

.method public zzf(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/zzahj$zza;->zzb(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)V

    return-void
.end method

.method public synthetic zzk(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/zzahi;

    check-cast p2, Lcom/google/android/gms/internal/zzahu;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/zzahj$zza;->zzf(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)V

    return-void
.end method
