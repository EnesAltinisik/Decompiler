.class public final Lcom/google/android/gms/internal/zzqc;
.super Lcom/google/android/gms/internal/zzamd;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/zzamd",
        "<",
        "Lcom/google/android/gms/internal/zzqc;",
        ">;"
    }
.end annotation


# instance fields
.field public zzazb:J

.field public zzaze:J


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzamd;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzqc;->zzwG()Lcom/google/android/gms/internal/zzqc;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v1, 0x1

    const/4 v0, 0x0

    if-ne p1, p0, :cond_1

    move v0, v1

    :cond_0
    :goto_0
    return v0

    :cond_1
    instance-of v2, p1, Lcom/google/android/gms/internal/zzqc;

    if-eqz v2, :cond_0

    check-cast p1, Lcom/google/android/gms/internal/zzqc;

    iget-wide v2, p0, Lcom/google/android/gms/internal/zzqc;->zzaze:J

    iget-wide v4, p1, Lcom/google/android/gms/internal/zzqc;->zzaze:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_0

    iget-wide v2, p0, Lcom/google/android/gms/internal/zzqc;->zzazb:J

    iget-wide v4, p1, Lcom/google/android/gms/internal/zzqc;->zzazb:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/zzqc;->zzcaa:Lcom/google/android/gms/internal/zzamf;

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/google/android/gms/internal/zzqc;->zzcaa:Lcom/google/android/gms/internal/zzamf;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzamf;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_4

    :cond_2
    iget-object v2, p1, Lcom/google/android/gms/internal/zzqc;->zzcaa:Lcom/google/android/gms/internal/zzamf;

    if-eqz v2, :cond_3

    iget-object v2, p1, Lcom/google/android/gms/internal/zzqc;->zzcaa:Lcom/google/android/gms/internal/zzamf;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzamf;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    :cond_3
    move v0, v1

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/zzqc;->zzcaa:Lcom/google/android/gms/internal/zzamf;

    iget-object v1, p1, Lcom/google/android/gms/internal/zzqc;->zzcaa:Lcom/google/android/gms/internal/zzamf;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzamf;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 7

    const/16 v6, 0x20

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v2, p0, Lcom/google/android/gms/internal/zzqc;->zzaze:J

    iget-wide v4, p0, Lcom/google/android/gms/internal/zzqc;->zzaze:J

    ushr-long/2addr v4, v6

    xor-long/2addr v2, v4

    long-to-int v1, v2

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v2, p0, Lcom/google/android/gms/internal/zzqc;->zzazb:J

    iget-wide v4, p0, Lcom/google/android/gms/internal/zzqc;->zzazb:J

    ushr-long/2addr v4, v6

    xor-long/2addr v2, v4

    long-to-int v1, v2

    add-int/2addr v0, v1

    mul-int/lit8 v1, v0, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/zzqc;->zzcaa:Lcom/google/android/gms/internal/zzamf;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzqc;->zzcaa:Lcom/google/android/gms/internal/zzamf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzamf;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    add-int/2addr v0, v1

    return v0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/zzqc;->zzcaa:Lcom/google/android/gms/internal/zzamf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzamf;->hashCode()I

    move-result v0

    goto :goto_0
.end method

.method public synthetic mergeFrom(Lcom/google/android/gms/internal/zzamb;)Lcom/google/android/gms/internal/zzamj;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzqc;->zzn(Lcom/google/android/gms/internal/zzamb;)Lcom/google/android/gms/internal/zzqc;

    move-result-object v0

    return-object v0
.end method

.method public writeTo(Lcom/google/android/gms/internal/zzamc;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    iget-wide v2, p0, Lcom/google/android/gms/internal/zzqc;->zzaze:J

    invoke-virtual {p1, v0, v2, v3}, Lcom/google/android/gms/internal/zzamc;->zzd(IJ)V

    const/4 v0, 0x2

    iget-wide v2, p0, Lcom/google/android/gms/internal/zzqc;->zzazb:J

    invoke-virtual {p1, v0, v2, v3}, Lcom/google/android/gms/internal/zzamc;->zzd(IJ)V

    invoke-super {p0, p1}, Lcom/google/android/gms/internal/zzamd;->writeTo(Lcom/google/android/gms/internal/zzamc;)V

    return-void
.end method

.method public zzn(Lcom/google/android/gms/internal/zzamb;)Lcom/google/android/gms/internal/zzqc;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzamb;->zzWC()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    invoke-super {p0, p1, v0}, Lcom/google/android/gms/internal/zzamd;->zza(Lcom/google/android/gms/internal/zzamb;I)Z

    move-result v0

    if-nez v0, :cond_0

    :sswitch_0
    return-object p0

    :sswitch_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzamb;->zzWK()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/zzqc;->zzaze:J

    goto :goto_0

    :sswitch_2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzamb;->zzWK()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/zzqc;->zzazb:J

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_1
        0x10 -> :sswitch_2
    .end sparse-switch
.end method

.method public zzwG()Lcom/google/android/gms/internal/zzqc;
    .locals 2

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/google/android/gms/internal/zzqc;->zzaze:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/zzqc;->zzazb:J

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzqc;->zzcaa:Lcom/google/android/gms/internal/zzamf;

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/zzqc;->zzcaj:I

    return-object p0
.end method

.method protected zzy()I
    .locals 4

    invoke-super {p0}, Lcom/google/android/gms/internal/zzamd;->zzy()I

    move-result v0

    const/4 v1, 0x1

    iget-wide v2, p0, Lcom/google/android/gms/internal/zzqc;->zzaze:J

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/internal/zzamc;->zzg(IJ)I

    move-result v1

    add-int/2addr v0, v1

    const/4 v1, 0x2

    iget-wide v2, p0, Lcom/google/android/gms/internal/zzqc;->zzazb:J

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/internal/zzamc;->zzg(IJ)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
