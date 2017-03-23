.class public final Lcom/google/firebase/crash/internal/config/flag/Flags;
.super Ljava/lang/Object;


# annotations
.annotation build Landroid/support/annotation/Keep;
.end annotation


# static fields
.field public static final zzbGA:Lcom/google/android/gms/internal/zzsd;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzsd",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final zzbGB:Lcom/google/android/gms/internal/zzsd;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzsd",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final zzbGC:Lcom/google/android/gms/internal/zzsd;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzsd",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final zzbGD:Lcom/google/android/gms/internal/zzsd;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzsd",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final zzbGE:Lcom/google/android/gms/internal/zzsd;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzsd",
            "<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field public static final zzbGF:Lcom/google/android/gms/internal/zzsd;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzsd",
            "<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field public static final zzbGG:Lcom/google/android/gms/internal/zzsd;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzsd",
            "<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field public static final zzbGH:Lcom/google/android/gms/internal/zzsd;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzsd",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final zzbGI:Lcom/google/android/gms/internal/zzsd;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzsd",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final zzbGJ:Lcom/google/android/gms/internal/zzsd;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzsd",
            "<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field public static final zzbGz:Lcom/google/android/gms/internal/zzsd;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzsd",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const/4 v5, 0x5

    const/4 v4, 0x0

    const-string v0, "crash:enabled"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v4, v0, v1}, Lcom/google/android/gms/internal/zzsd;->zzb(ILjava/lang/String;Ljava/lang/Boolean;)Lcom/google/android/gms/internal/zzsd$zza;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/crash/internal/config/flag/Flags;->zzbGz:Lcom/google/android/gms/internal/zzsd;

    const-string v0, "crash:gateway_url"

    const-string v1, "https://mobilecrashreporting.googleapis.com/v1/crashes:batchCreate?key="

    invoke-static {v4, v0, v1}, Lcom/google/android/gms/internal/zzsd;->zzc(ILjava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/zzsd$zzd;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/crash/internal/config/flag/Flags;->zzbGA:Lcom/google/android/gms/internal/zzsd;

    const-string v0, "crash:log_buffer_capacity"

    const/16 v1, 0x64

    invoke-static {v4, v0, v1}, Lcom/google/android/gms/internal/zzsd;->zzb(ILjava/lang/String;I)Lcom/google/android/gms/internal/zzsd$zzb;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/crash/internal/config/flag/Flags;->zzbGB:Lcom/google/android/gms/internal/zzsd;

    const-string v0, "crash:log_buffer_max_total_size"

    const v1, 0x8000

    invoke-static {v4, v0, v1}, Lcom/google/android/gms/internal/zzsd;->zzb(ILjava/lang/String;I)Lcom/google/android/gms/internal/zzsd$zzb;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/crash/internal/config/flag/Flags;->zzbGC:Lcom/google/android/gms/internal/zzsd;

    const-string v0, "crash:crash_backlog_capacity"

    invoke-static {v4, v0, v5}, Lcom/google/android/gms/internal/zzsd;->zzb(ILjava/lang/String;I)Lcom/google/android/gms/internal/zzsd$zzb;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/crash/internal/config/flag/Flags;->zzbGD:Lcom/google/android/gms/internal/zzsd;

    const-string v0, "crash:crash_backlog_max_age"

    const-wide/32 v2, 0x240c8400

    invoke-static {v4, v0, v2, v3}, Lcom/google/android/gms/internal/zzsd;->zzb(ILjava/lang/String;J)Lcom/google/android/gms/internal/zzsd$zzc;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/crash/internal/config/flag/Flags;->zzbGE:Lcom/google/android/gms/internal/zzsd;

    const-string v0, "crash:starting_backoff"

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x1

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v2

    invoke-static {v4, v0, v2, v3}, Lcom/google/android/gms/internal/zzsd;->zzb(ILjava/lang/String;J)Lcom/google/android/gms/internal/zzsd$zzc;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/crash/internal/config/flag/Flags;->zzbGF:Lcom/google/android/gms/internal/zzsd;

    const-string v0, "crash:backoff_limit"

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x3c

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v2

    invoke-static {v4, v0, v2, v3}, Lcom/google/android/gms/internal/zzsd;->zzb(ILjava/lang/String;J)Lcom/google/android/gms/internal/zzsd$zzc;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/crash/internal/config/flag/Flags;->zzbGG:Lcom/google/android/gms/internal/zzsd;

    const-string v0, "crash:retry_num_attempts"

    const/16 v1, 0xc

    invoke-static {v4, v0, v1}, Lcom/google/android/gms/internal/zzsd;->zzb(ILjava/lang/String;I)Lcom/google/android/gms/internal/zzsd$zzb;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/crash/internal/config/flag/Flags;->zzbGH:Lcom/google/android/gms/internal/zzsd;

    const-string v0, "crash:batch_size"

    invoke-static {v4, v0, v5}, Lcom/google/android/gms/internal/zzsd;->zzb(ILjava/lang/String;I)Lcom/google/android/gms/internal/zzsd$zzb;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/crash/internal/config/flag/Flags;->zzbGI:Lcom/google/android/gms/internal/zzsd;

    const-string v0, "crash:batch_throttle"

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x5

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v2

    invoke-static {v4, v0, v2, v3}, Lcom/google/android/gms/internal/zzsd;->zzb(ILjava/lang/String;J)Lcom/google/android/gms/internal/zzsd$zzc;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/crash/internal/config/flag/Flags;->zzbGJ:Lcom/google/android/gms/internal/zzsd;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final initialize(Landroid/content/Context;)V
    .locals 0

    invoke-static {}, Lcom/google/android/gms/internal/zzsh;->zzyE()Lcom/google/android/gms/internal/zzse;

    invoke-static {p0}, Lcom/google/android/gms/internal/zzse;->initialize(Landroid/content/Context;)V

    return-void
.end method
