.class public final Lcom/google/android/gms/clearcut/zzb;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/clearcut/zzb$zza;,
        Lcom/google/android/gms/clearcut/zzb$zzc;,
        Lcom/google/android/gms/clearcut/zzb$zzb;
    }
.end annotation


# static fields
.field public static final API:Lcom/google/android/gms/common/api/Api;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/Api",
            "<",
            "Lcom/google/android/gms/common/api/Api$ApiOptions$NoOptions;",
            ">;"
        }
    .end annotation
.end field

.field public static final zzaaA:Lcom/google/android/gms/common/api/Api$zza;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/Api$zza",
            "<",
            "Lcom/google/android/gms/internal/zznm;",
            "Lcom/google/android/gms/common/api/Api$ApiOptions$NoOptions;",
            ">;"
        }
    .end annotation
.end field

.field public static final zzaaz:Lcom/google/android/gms/common/api/Api$zzf;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/Api$zzf",
            "<",
            "Lcom/google/android/gms/internal/zznm;",
            ">;"
        }
    .end annotation
.end field

.field public static final zzajv:Lcom/google/android/gms/clearcut/zzc;


# instance fields
.field private final mContext:Landroid/content/Context;

.field private final zzZC:Ljava/lang/String;

.field private zzajA:Ljava/lang/String;

.field private final zzajB:Z

.field private zzajC:I

.field private final zzajD:Lcom/google/android/gms/clearcut/zzc;

.field private final zzajE:Lcom/google/android/gms/clearcut/zza;

.field private zzajF:Lcom/google/android/gms/clearcut/zzb$zzc;

.field private final zzajw:I

.field private zzajx:Ljava/lang/String;

.field private zzajy:I

.field private zzajz:Ljava/lang/String;

.field private final zzsd:Lcom/google/android/gms/common/util/zze;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/common/api/Api$zzf;

    invoke-direct {v0}, Lcom/google/android/gms/common/api/Api$zzf;-><init>()V

    sput-object v0, Lcom/google/android/gms/clearcut/zzb;->zzaaz:Lcom/google/android/gms/common/api/Api$zzf;

    new-instance v0, Lcom/google/android/gms/clearcut/zzb$1;

    invoke-direct {v0}, Lcom/google/android/gms/clearcut/zzb$1;-><init>()V

    sput-object v0, Lcom/google/android/gms/clearcut/zzb;->zzaaA:Lcom/google/android/gms/common/api/Api$zza;

    new-instance v0, Lcom/google/android/gms/common/api/Api;

    const-string v1, "ClearcutLogger.API"

    sget-object v2, Lcom/google/android/gms/clearcut/zzb;->zzaaA:Lcom/google/android/gms/common/api/Api$zza;

    sget-object v3, Lcom/google/android/gms/clearcut/zzb;->zzaaz:Lcom/google/android/gms/common/api/Api$zzf;

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/common/api/Api;-><init>(Ljava/lang/String;Lcom/google/android/gms/common/api/Api$zza;Lcom/google/android/gms/common/api/Api$zzf;)V

    sput-object v0, Lcom/google/android/gms/clearcut/zzb;->API:Lcom/google/android/gms/common/api/Api;

    new-instance v0, Lcom/google/android/gms/internal/zznl;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zznl;-><init>()V

    sput-object v0, Lcom/google/android/gms/clearcut/zzb;->zzajv:Lcom/google/android/gms/clearcut/zzc;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/google/android/gms/clearcut/zzc;Lcom/google/android/gms/common/util/zze;Lcom/google/android/gms/clearcut/zzb$zzc;Lcom/google/android/gms/clearcut/zza;)V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/clearcut/zzb;->zzajy:I

    iput v1, p0, Lcom/google/android/gms/clearcut/zzb;->zzajC:I

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_1

    :goto_0
    iput-object v0, p0, Lcom/google/android/gms/clearcut/zzb;->mContext:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/clearcut/zzb;->zzZC:Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/google/android/gms/clearcut/zzb;->zzad(Landroid/content/Context;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/clearcut/zzb;->zzajw:I

    iput p2, p0, Lcom/google/android/gms/clearcut/zzb;->zzajy:I

    iput-object p3, p0, Lcom/google/android/gms/clearcut/zzb;->zzajx:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/clearcut/zzb;->zzajz:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/clearcut/zzb;->zzajA:Ljava/lang/String;

    iput-boolean p6, p0, Lcom/google/android/gms/clearcut/zzb;->zzajB:Z

    iput-object p7, p0, Lcom/google/android/gms/clearcut/zzb;->zzajD:Lcom/google/android/gms/clearcut/zzc;

    iput-object p8, p0, Lcom/google/android/gms/clearcut/zzb;->zzsd:Lcom/google/android/gms/common/util/zze;

    if-eqz p9, :cond_2

    :goto_1
    iput-object p9, p0, Lcom/google/android/gms/clearcut/zzb;->zzajF:Lcom/google/android/gms/clearcut/zzb$zzc;

    iput-object p10, p0, Lcom/google/android/gms/clearcut/zzb;->zzajE:Lcom/google/android/gms/clearcut/zza;

    iput v1, p0, Lcom/google/android/gms/clearcut/zzb;->zzajC:I

    iget-boolean v0, p0, Lcom/google/android/gms/clearcut/zzb;->zzajB:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/clearcut/zzb;->zzajz:Ljava/lang/String;

    if-nez v0, :cond_3

    const/4 v0, 0x1

    :goto_2
    const-string v1, "can\'t be anonymous with an upload account"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/zzaa;->zzb(ZLjava/lang/Object;)V

    :cond_0
    return-void

    :cond_1
    move-object v0, p1

    goto :goto_0

    :cond_2
    new-instance p9, Lcom/google/android/gms/clearcut/zzb$zzc;

    invoke-direct {p9}, Lcom/google/android/gms/clearcut/zzb$zzc;-><init>()V

    goto :goto_1

    :cond_3
    move v0, v1

    goto :goto_2
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 11

    const/4 v5, 0x0

    const/4 v2, -0x1

    const/4 v6, 0x0

    sget-object v7, Lcom/google/android/gms/clearcut/zzb;->zzajv:Lcom/google/android/gms/clearcut/zzc;

    invoke-static {}, Lcom/google/android/gms/common/util/zzh;->zzuW()Lcom/google/android/gms/common/util/zze;

    move-result-object v8

    sget-object v10, Lcom/google/android/gms/clearcut/zza;->zzaju:Lcom/google/android/gms/clearcut/zza;

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move-object v4, p3

    move-object v9, v5

    invoke-direct/range {v0 .. v10}, Lcom/google/android/gms/clearcut/zzb;-><init>(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/google/android/gms/clearcut/zzc;Lcom/google/android/gms/common/util/zze;Lcom/google/android/gms/clearcut/zzb$zzc;Lcom/google/android/gms/clearcut/zza;)V

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/clearcut/zzb;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/clearcut/zzb;->zzajy:I

    return v0
.end method

.method private zzad(Landroid/content/Context;)I
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    iget v0, v1, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return v0

    :catch_0
    move-exception v1

    const-string v1, "ClearcutLogger"

    const-string v2, "This can\'t happen."

    invoke-static {v1, v2}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method static synthetic zzb(Lcom/google/android/gms/clearcut/zzb;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/clearcut/zzb;->zzajx:Ljava/lang/String;

    return-object v0
.end method

.method private static zzb(Ljava/util/ArrayList;)[I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Integer;",
            ">;)[I"
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v2, v0, [I

    const/4 v0, 0x0

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v1, v0

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    add-int/lit8 v0, v1, 0x1

    aput v4, v2, v1

    move v1, v0

    goto :goto_1

    :cond_1
    move-object v0, v2

    goto :goto_0
.end method

.method static synthetic zzc(Lcom/google/android/gms/clearcut/zzb;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/clearcut/zzb;->zzajz:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic zzc(Ljava/util/ArrayList;)[I
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/clearcut/zzb;->zzb(Ljava/util/ArrayList;)[I

    move-result-object v0

    return-object v0
.end method

.method static synthetic zzd(Lcom/google/android/gms/clearcut/zzb;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/clearcut/zzb;->zzajA:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic zze(Lcom/google/android/gms/clearcut/zzb;)I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method static synthetic zzf(Lcom/google/android/gms/clearcut/zzb;)Lcom/google/android/gms/common/util/zze;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/clearcut/zzb;->zzsd:Lcom/google/android/gms/common/util/zze;

    return-object v0
.end method

.method static synthetic zzg(Lcom/google/android/gms/clearcut/zzb;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/clearcut/zzb;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic zzh(Lcom/google/android/gms/clearcut/zzb;)Lcom/google/android/gms/clearcut/zza;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/clearcut/zzb;->zzajE:Lcom/google/android/gms/clearcut/zza;

    return-object v0
.end method

.method static synthetic zzi(Lcom/google/android/gms/clearcut/zzb;)Lcom/google/android/gms/clearcut/zzb$zzc;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/clearcut/zzb;->zzajF:Lcom/google/android/gms/clearcut/zzb$zzc;

    return-object v0
.end method

.method static synthetic zzj(Lcom/google/android/gms/clearcut/zzb;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/clearcut/zzb;->zzajB:Z

    return v0
.end method

.method static synthetic zzk(Lcom/google/android/gms/clearcut/zzb;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/clearcut/zzb;->zzZC:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic zzl(Lcom/google/android/gms/clearcut/zzb;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/clearcut/zzb;->zzajw:I

    return v0
.end method

.method static synthetic zzm(Lcom/google/android/gms/clearcut/zzb;)Lcom/google/android/gms/clearcut/zzc;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/clearcut/zzb;->zzajD:Lcom/google/android/gms/clearcut/zzc;

    return-object v0
.end method


# virtual methods
.method public zzj([B)Lcom/google/android/gms/clearcut/zzb$zza;
    .locals 2

    new-instance v0, Lcom/google/android/gms/clearcut/zzb$zza;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/google/android/gms/clearcut/zzb$zza;-><init>(Lcom/google/android/gms/clearcut/zzb;[BLcom/google/android/gms/clearcut/zzb$1;)V

    return-object v0
.end method
