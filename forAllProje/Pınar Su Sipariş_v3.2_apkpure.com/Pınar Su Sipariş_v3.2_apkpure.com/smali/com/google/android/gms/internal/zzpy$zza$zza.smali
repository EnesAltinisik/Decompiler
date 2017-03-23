.class public Lcom/google/android/gms/internal/zzpy$zza$zza;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/zzpy$zza;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "zza"
.end annotation


# instance fields
.field private zzauB:J

.field private zzauC:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/32 v0, 0xa8c0

    iput-wide v0, p0, Lcom/google/android/gms/internal/zzpy$zza$zza;->zzauB:J

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/zzpy$zza$zza;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/zzpy$zza$zza;->zzauB:J

    return-wide v0
.end method

.method static synthetic zzb(Lcom/google/android/gms/internal/zzpy$zza$zza;)Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzpy$zza$zza;->zzauC:Ljava/util/Map;

    return-object v0
.end method


# virtual methods
.method public zzF(J)Lcom/google/android/gms/internal/zzpy$zza$zza;
    .locals 1

    iput-wide p1, p0, Lcom/google/android/gms/internal/zzpy$zza$zza;->zzauB:J

    return-object p0
.end method

.method public zzF(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/zzpy$zza$zza;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzpy$zza$zza;->zzauC:Ljava/util/Map;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzpy$zza$zza;->zzauC:Ljava/util/Map;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzpy$zza$zza;->zzauC:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public zzvs()Lcom/google/android/gms/internal/zzpy$zza;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/zzpy$zza;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/zzpy$zza;-><init>(Lcom/google/android/gms/internal/zzpy$zza$zza;Lcom/google/android/gms/internal/zzpy$1;)V

    return-object v0
.end method
