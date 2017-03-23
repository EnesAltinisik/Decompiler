.class public Lcom/google/android/gms/internal/zzagx$zza;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/zzagx;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "zza"
.end annotation


# instance fields
.field public final zzbPX:Lcom/google/android/gms/internal/zzagw;

.field public final zzbQb:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzago;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzagw;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzagw;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzago;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzagx$zza;->zzbPX:Lcom/google/android/gms/internal/zzagw;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzagx$zza;->zzbQb:Ljava/util/List;

    return-void
.end method
