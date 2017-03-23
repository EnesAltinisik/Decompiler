.class public Lcom/google/firebase/database/connection/idl/ConnectionConfig;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Lcom/google/firebase/database/connection/idl/zzb;


# instance fields
.field final versionCode:I

.field final zzbIX:Z

.field final zzbIZ:Ljava/lang/String;

.field final zzbKo:Lcom/google/firebase/database/connection/idl/HostInfoParcelable;

.field final zzbKp:I

.field final zzbKq:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final zzbKr:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/firebase/database/connection/idl/zzb;

    invoke-direct {v0}, Lcom/google/firebase/database/connection/idl/zzb;-><init>()V

    sput-object v0, Lcom/google/firebase/database/connection/idl/ConnectionConfig;->CREATOR:Lcom/google/firebase/database/connection/idl/zzb;

    return-void
.end method

.method public constructor <init>(ILcom/google/firebase/database/connection/idl/HostInfoParcelable;ILjava/util/List;ZLjava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/google/firebase/database/connection/idl/HostInfoParcelable;",
            "I",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/firebase/database/connection/idl/ConnectionConfig;->versionCode:I

    iput-object p2, p0, Lcom/google/firebase/database/connection/idl/ConnectionConfig;->zzbKo:Lcom/google/firebase/database/connection/idl/HostInfoParcelable;

    iput p3, p0, Lcom/google/firebase/database/connection/idl/ConnectionConfig;->zzbKp:I

    iput-object p4, p0, Lcom/google/firebase/database/connection/idl/ConnectionConfig;->zzbKq:Ljava/util/List;

    iput-boolean p5, p0, Lcom/google/firebase/database/connection/idl/ConnectionConfig;->zzbIX:Z

    iput-object p6, p0, Lcom/google/firebase/database/connection/idl/ConnectionConfig;->zzbKr:Ljava/lang/String;

    iput-object p7, p0, Lcom/google/firebase/database/connection/idl/ConnectionConfig;->zzbIZ:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/zzaeh;Lcom/google/android/gms/internal/zzahg$zza;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzaeh;",
            "Lcom/google/android/gms/internal/zzahg$zza;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const/4 v1, 0x1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    sget-object v0, Lcom/google/firebase/database/connection/idl/ConnectionConfig$1;->a:[I

    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzahg$zza;->ordinal()I

    move-result v2

    aget v0, v0, v2

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    :goto_0
    iput v1, p0, Lcom/google/firebase/database/connection/idl/ConnectionConfig;->versionCode:I

    invoke-static {p1}, Lcom/google/firebase/database/connection/idl/HostInfoParcelable;->a(Lcom/google/android/gms/internal/zzaeh;)Lcom/google/firebase/database/connection/idl/HostInfoParcelable;

    move-result-object v1

    iput-object v1, p0, Lcom/google/firebase/database/connection/idl/ConnectionConfig;->zzbKo:Lcom/google/firebase/database/connection/idl/HostInfoParcelable;

    iput v0, p0, Lcom/google/firebase/database/connection/idl/ConnectionConfig;->zzbKp:I

    iput-object p3, p0, Lcom/google/firebase/database/connection/idl/ConnectionConfig;->zzbKq:Ljava/util/List;

    iput-boolean p4, p0, Lcom/google/firebase/database/connection/idl/ConnectionConfig;->zzbIX:Z

    iput-object p5, p0, Lcom/google/firebase/database/connection/idl/ConnectionConfig;->zzbKr:Ljava/lang/String;

    iput-object p6, p0, Lcom/google/firebase/database/connection/idl/ConnectionConfig;->zzbIZ:Ljava/lang/String;

    return-void

    :pswitch_0
    move v0, v1

    goto :goto_0

    :pswitch_1
    const/4 v0, 0x2

    goto :goto_0

    :pswitch_2
    const/4 v0, 0x3

    goto :goto_0

    :pswitch_3
    const/4 v0, 0x4

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/firebase/database/connection/idl/zzb;->zza(Lcom/google/firebase/database/connection/idl/ConnectionConfig;Landroid/os/Parcel;I)V

    return-void
.end method

.method public zzQD()Lcom/google/android/gms/internal/zzahg$zza;
    .locals 1

    iget v0, p0, Lcom/google/firebase/database/connection/idl/ConnectionConfig;->zzbKp:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lcom/google/android/gms/internal/zzahg$zza;->zzbQx:Lcom/google/android/gms/internal/zzahg$zza;

    :goto_0
    return-object v0

    :pswitch_0
    sget-object v0, Lcom/google/android/gms/internal/zzahg$zza;->zzbQx:Lcom/google/android/gms/internal/zzahg$zza;

    goto :goto_0

    :pswitch_1
    sget-object v0, Lcom/google/android/gms/internal/zzahg$zza;->zzbQt:Lcom/google/android/gms/internal/zzahg$zza;

    goto :goto_0

    :pswitch_2
    sget-object v0, Lcom/google/android/gms/internal/zzahg$zza;->zzbQu:Lcom/google/android/gms/internal/zzahg$zza;

    goto :goto_0

    :pswitch_3
    sget-object v0, Lcom/google/android/gms/internal/zzahg$zza;->zzbQv:Lcom/google/android/gms/internal/zzahg$zza;

    goto :goto_0

    :pswitch_4
    sget-object v0, Lcom/google/android/gms/internal/zzahg$zza;->zzbQw:Lcom/google/android/gms/internal/zzahg$zza;

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public zzQE()Ljava/util/List;
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

    iget-object v0, p0, Lcom/google/firebase/database/connection/idl/ConnectionConfig;->zzbKq:Ljava/util/List;

    return-object v0
.end method
