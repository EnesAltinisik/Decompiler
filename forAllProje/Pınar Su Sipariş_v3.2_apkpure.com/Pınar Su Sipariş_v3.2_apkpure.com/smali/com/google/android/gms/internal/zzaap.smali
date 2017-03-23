.class public abstract Lcom/google/android/gms/internal/zzaap;
.super Ljava/lang/Object;


# instance fields
.field protected zzbuM:Lcom/google/android/gms/internal/zzaat;

.field protected zzbuN:Lcom/google/android/gms/internal/zzaar;

.field protected zzsd:Lcom/google/android/gms/common/util/zze;

.field private zzwP:I


# direct methods
.method public constructor <init>(ILcom/google/android/gms/internal/zzaat;Lcom/google/android/gms/internal/zzaar;)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/common/util/zzh;->zzuW()Lcom/google/android/gms/common/util/zze;

    move-result-object v0

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/google/android/gms/internal/zzaap;-><init>(ILcom/google/android/gms/internal/zzaat;Lcom/google/android/gms/internal/zzaar;Lcom/google/android/gms/common/util/zze;)V

    return-void
.end method

.method public constructor <init>(ILcom/google/android/gms/internal/zzaat;Lcom/google/android/gms/internal/zzaar;Lcom/google/android/gms/common/util/zze;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzaat;->zzLN()Lcom/google/android/gms/internal/zzaam;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/internal/zzaa;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    iput p1, p0, Lcom/google/android/gms/internal/zzaap;->zzwP:I

    iput-object p2, p0, Lcom/google/android/gms/internal/zzaap;->zzbuM:Lcom/google/android/gms/internal/zzaat;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzaap;->zzbuN:Lcom/google/android/gms/internal/zzaar;

    iput-object p4, p0, Lcom/google/android/gms/internal/zzaap;->zzsd:Lcom/google/android/gms/common/util/zze;

    return-void
.end method


# virtual methods
.method public onFailure(I)V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaap;->zzbuM:Lcom/google/android/gms/internal/zzaat;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaat;->zzLN()Lcom/google/android/gms/internal/zzaam;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaam;->getContainerId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzaap;->zzkX(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x3d

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Failed to fetch the container resource for the container \""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "\": "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/zzun;->v(Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/internal/zzaau;

    sget-object v1, Lcom/google/android/gms/common/api/Status;->zzaly:Lcom/google/android/gms/common/api/Status;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/zzaau;-><init>(Lcom/google/android/gms/common/api/Status;I)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzaap;->zza(Lcom/google/android/gms/internal/zzaau;)V

    return-void
.end method

.method public zzA([B)V
    .locals 7

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzaap;->zzB([B)Lcom/google/android/gms/internal/zzaau;

    move-result-object v6

    if-eqz v6, :cond_0

    invoke-virtual {v6}, Lcom/google/android/gms/internal/zzaau;->getStatus()Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/common/api/Status;->zzalw:Lcom/google/android/gms/common/api/Status;

    if-ne v0, v1, :cond_0

    invoke-virtual {v6}, Lcom/google/android/gms/internal/zzaau;->zzLO()Lcom/google/android/gms/internal/zzaau$zza;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaau$zza;->zzLT()Lcom/google/android/gms/internal/zzabc;

    move-result-object v3

    new-instance v0, Lcom/google/android/gms/internal/zzaau$zza;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaap;->zzbuM:Lcom/google/android/gms/internal/zzaat;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzaat;->zzLN()Lcom/google/android/gms/internal/zzaam;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzaap;->zzsd:Lcom/google/android/gms/common/util/zze;

    invoke-interface {v2}, Lcom/google/android/gms/common/util/zze;->currentTimeMillis()J

    move-result-wide v4

    move-object v2, p1

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/zzaau$zza;-><init>(Lcom/google/android/gms/internal/zzaam;[BLcom/google/android/gms/internal/zzabc;J)V

    invoke-virtual {v6}, Lcom/google/android/gms/internal/zzaau;->zzLP()Lcom/google/android/gms/internal/zzabf;

    move-result-object v2

    new-instance v1, Lcom/google/android/gms/internal/zzaau;

    sget-object v3, Lcom/google/android/gms/common/api/Status;->zzalw:Lcom/google/android/gms/common/api/Status;

    iget v4, p0, Lcom/google/android/gms/internal/zzaap;->zzwP:I

    invoke-direct {v1, v3, v4, v0, v2}, Lcom/google/android/gms/internal/zzaau;-><init>(Lcom/google/android/gms/common/api/Status;ILcom/google/android/gms/internal/zzaau$zza;Lcom/google/android/gms/internal/zzabf;)V

    move-object v0, v1

    :goto_0
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzaap;->zza(Lcom/google/android/gms/internal/zzaau;)V

    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/zzaau;

    sget-object v1, Lcom/google/android/gms/common/api/Status;->zzaly:Lcom/google/android/gms/common/api/Status;

    iget v2, p0, Lcom/google/android/gms/internal/zzaap;->zzwP:I

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/zzaau;-><init>(Lcom/google/android/gms/common/api/Status;I)V

    goto :goto_0
.end method

.method protected zzB([B)Lcom/google/android/gms/internal/zzaau;
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/zzaap;->zzbuN:Lcom/google/android/gms/internal/zzaar;

    invoke-interface {v1, p1}, Lcom/google/android/gms/internal/zzaar;->zzC([B)Lcom/google/android/gms/internal/zzaau;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v1, "Parsed resource from is null"

    invoke-static {v1}, Lcom/google/android/gms/internal/zzun;->zzaV(Ljava/lang/String;)V
    :try_end_0
    .catch Lcom/google/android/gms/internal/zzaan; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-object v0

    :catch_0
    move-exception v1

    const-string v1, "Resource data is corrupted"

    invoke-static {v1}, Lcom/google/android/gms/internal/zzun;->zzaV(Ljava/lang/String;)V

    goto :goto_0
.end method

.method protected abstract zza(Lcom/google/android/gms/internal/zzaau;)V
.end method

.method public zzkX(I)Ljava/lang/String;
    .locals 1

    packed-switch p1, :pswitch_data_0

    const-string v0, "Unknown reason"

    :goto_0
    return-object v0

    :pswitch_0
    const-string v0, "Resource not available"

    goto :goto_0

    :pswitch_1
    const-string v0, "IOError"

    goto :goto_0

    :pswitch_2
    const-string v0, "Server error"

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
