.class public Lcom/google/android/gms/config/internal/FetchConfigIpcRequest;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/config/internal/FetchConfigIpcRequest;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final mVersionCode:I

.field private final zzZC:Ljava/lang/String;

.field private final zzauL:J

.field private final zzauM:Lcom/google/android/gms/common/data/DataHolder;

.field private final zzauN:Ljava/lang/String;

.field private final zzauO:Ljava/lang/String;

.field private final zzauP:Ljava/lang/String;

.field private final zzauQ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/config/internal/zze;

    invoke-direct {v0}, Lcom/google/android/gms/config/internal/zze;-><init>()V

    sput-object v0, Lcom/google/android/gms/config/internal/FetchConfigIpcRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILjava/lang/String;JLcom/google/android/gms/common/data/DataHolder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "J",
            "Lcom/google/android/gms/common/data/DataHolder;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/config/internal/FetchConfigIpcRequest;->mVersionCode:I

    iput-object p2, p0, Lcom/google/android/gms/config/internal/FetchConfigIpcRequest;->zzZC:Ljava/lang/String;

    iput-wide p3, p0, Lcom/google/android/gms/config/internal/FetchConfigIpcRequest;->zzauL:J

    iput-object p5, p0, Lcom/google/android/gms/config/internal/FetchConfigIpcRequest;->zzauM:Lcom/google/android/gms/common/data/DataHolder;

    iput-object p6, p0, Lcom/google/android/gms/config/internal/FetchConfigIpcRequest;->zzauN:Ljava/lang/String;

    iput-object p7, p0, Lcom/google/android/gms/config/internal/FetchConfigIpcRequest;->zzauO:Ljava/lang/String;

    iput-object p8, p0, Lcom/google/android/gms/config/internal/FetchConfigIpcRequest;->zzauP:Ljava/lang/String;

    iput-object p9, p0, Lcom/google/android/gms/config/internal/FetchConfigIpcRequest;->zzauQ:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;JLcom/google/android/gms/common/data/DataHolder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 12

    const/4 v2, 0x1

    const/4 v10, 0x0

    move-object v1, p0

    move-object v3, p1

    move-wide v4, p2

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    invoke-direct/range {v1 .. v10}, Lcom/google/android/gms/config/internal/FetchConfigIpcRequest;-><init>(ILjava/lang/String;JLcom/google/android/gms/common/data/DataHolder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public getPackageName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/config/internal/FetchConfigIpcRequest;->zzZC:Ljava/lang/String;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/config/internal/zze;->zza(Lcom/google/android/gms/config/internal/FetchConfigIpcRequest;Landroid/os/Parcel;I)V

    return-void
.end method

.method public zzvu()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/config/internal/FetchConfigIpcRequest;->zzauL:J

    return-wide v0
.end method

.method public zzvv()Lcom/google/android/gms/common/data/DataHolder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/config/internal/FetchConfigIpcRequest;->zzauM:Lcom/google/android/gms/common/data/DataHolder;

    return-object v0
.end method

.method public zzvw()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/config/internal/FetchConfigIpcRequest;->zzauN:Ljava/lang/String;

    return-object v0
.end method

.method public zzvx()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/config/internal/FetchConfigIpcRequest;->zzauO:Ljava/lang/String;

    return-object v0
.end method

.method public zzvy()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/config/internal/FetchConfigIpcRequest;->zzauP:Ljava/lang/String;

    return-object v0
.end method

.method public zzvz()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/config/internal/FetchConfigIpcRequest;->zzauQ:Ljava/util/List;

    return-object v0
.end method
