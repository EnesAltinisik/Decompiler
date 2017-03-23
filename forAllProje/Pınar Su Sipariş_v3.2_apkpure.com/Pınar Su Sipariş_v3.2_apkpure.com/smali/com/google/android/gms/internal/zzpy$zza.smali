.class public Lcom/google/android/gms/internal/zzpy$zza;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/zzpy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "zza"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/zzpy$zza$zza;
    }
.end annotation


# instance fields
.field private final zzauB:J

.field private final zzauC:Ljava/util/Map;
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
.method private constructor <init>(Lcom/google/android/gms/internal/zzpy$zza$zza;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/zzpy$zza$zza;->zza(Lcom/google/android/gms/internal/zzpy$zza$zza;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/zzpy$zza;->zzauB:J

    invoke-static {p1}, Lcom/google/android/gms/internal/zzpy$zza$zza;->zzb(Lcom/google/android/gms/internal/zzpy$zza$zza;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzpy$zza;->zzauC:Ljava/util/Map;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/zzpy$zza$zza;Lcom/google/android/gms/internal/zzpy$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzpy$zza;-><init>(Lcom/google/android/gms/internal/zzpy$zza$zza;)V

    return-void
.end method


# virtual methods
.method public zzvq()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/zzpy$zza;->zzauB:J

    return-wide v0
.end method

.method public zzvr()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzpy$zza;->zzauC:Ljava/util/Map;

    if-nez v0, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzpy$zza;->zzauC:Ljava/util/Map;

    goto :goto_0
.end method
