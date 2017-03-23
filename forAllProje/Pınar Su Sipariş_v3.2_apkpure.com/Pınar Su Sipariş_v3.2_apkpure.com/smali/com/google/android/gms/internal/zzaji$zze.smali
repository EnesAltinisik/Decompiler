.class public final Lcom/google/android/gms/internal/zzaji$zze;
.super Lcom/google/android/gms/internal/zzamd;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/zzaji;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "zze"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/zzamd",
        "<",
        "Lcom/google/android/gms/internal/zzaji$zze;",
        ">;"
    }
.end annotation


# instance fields
.field public zzbTK:Lcom/google/android/gms/internal/zzaji$zza;

.field public zzbTL:Lcom/google/android/gms/internal/zzaji$zza;

.field public zzbTM:Lcom/google/android/gms/internal/zzaji$zza;

.field public zzbTN:Lcom/google/android/gms/internal/zzaji$zzc;

.field public zzbTO:[Lcom/google/android/gms/internal/zzaji$zzf;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzamd;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzaji$zze;->zzUM()Lcom/google/android/gms/internal/zzaji$zze;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v1, 0x1

    const/4 v0, 0x0

    if-ne p1, p0, :cond_1

    move v0, v1

    :cond_0
    :goto_0
    return v0

    :cond_1
    instance-of v2, p1, Lcom/google/android/gms/internal/zzaji$zze;

    if-eqz v2, :cond_0

    check-cast p1, Lcom/google/android/gms/internal/zzaji$zze;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzbTK:Lcom/google/android/gms/internal/zzaji$zza;

    if-nez v2, :cond_8

    iget-object v2, p1, Lcom/google/android/gms/internal/zzaji$zze;->zzbTK:Lcom/google/android/gms/internal/zzaji$zza;

    if-nez v2, :cond_0

    :cond_2
    iget-object v2, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzbTL:Lcom/google/android/gms/internal/zzaji$zza;

    if-nez v2, :cond_9

    iget-object v2, p1, Lcom/google/android/gms/internal/zzaji$zze;->zzbTL:Lcom/google/android/gms/internal/zzaji$zza;

    if-nez v2, :cond_0

    :cond_3
    iget-object v2, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzbTM:Lcom/google/android/gms/internal/zzaji$zza;

    if-nez v2, :cond_a

    iget-object v2, p1, Lcom/google/android/gms/internal/zzaji$zze;->zzbTM:Lcom/google/android/gms/internal/zzaji$zza;

    if-nez v2, :cond_0

    :cond_4
    iget-object v2, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzbTN:Lcom/google/android/gms/internal/zzaji$zzc;

    if-nez v2, :cond_b

    iget-object v2, p1, Lcom/google/android/gms/internal/zzaji$zze;->zzbTN:Lcom/google/android/gms/internal/zzaji$zzc;

    if-nez v2, :cond_0

    :cond_5
    iget-object v2, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzbTO:[Lcom/google/android/gms/internal/zzaji$zzf;

    iget-object v3, p1, Lcom/google/android/gms/internal/zzaji$zze;->zzbTO:[Lcom/google/android/gms/internal/zzaji$zzf;

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/zzamh;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzcaa:Lcom/google/android/gms/internal/zzamf;

    if-eqz v2, :cond_6

    iget-object v2, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzcaa:Lcom/google/android/gms/internal/zzamf;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzamf;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_c

    :cond_6
    iget-object v2, p1, Lcom/google/android/gms/internal/zzaji$zze;->zzcaa:Lcom/google/android/gms/internal/zzamf;

    if-eqz v2, :cond_7

    iget-object v2, p1, Lcom/google/android/gms/internal/zzaji$zze;->zzcaa:Lcom/google/android/gms/internal/zzamf;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzamf;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    :cond_7
    move v0, v1

    goto :goto_0

    :cond_8
    iget-object v2, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzbTK:Lcom/google/android/gms/internal/zzaji$zza;

    iget-object v3, p1, Lcom/google/android/gms/internal/zzaji$zze;->zzbTK:Lcom/google/android/gms/internal/zzaji$zza;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/zzaji$zza;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_0

    :cond_9
    iget-object v2, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzbTL:Lcom/google/android/gms/internal/zzaji$zza;

    iget-object v3, p1, Lcom/google/android/gms/internal/zzaji$zze;->zzbTL:Lcom/google/android/gms/internal/zzaji$zza;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/zzaji$zza;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_a
    iget-object v2, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzbTM:Lcom/google/android/gms/internal/zzaji$zza;

    iget-object v3, p1, Lcom/google/android/gms/internal/zzaji$zze;->zzbTM:Lcom/google/android/gms/internal/zzaji$zza;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/zzaji$zza;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_0

    :cond_b
    iget-object v2, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzbTN:Lcom/google/android/gms/internal/zzaji$zzc;

    iget-object v3, p1, Lcom/google/android/gms/internal/zzaji$zze;->zzbTN:Lcom/google/android/gms/internal/zzaji$zzc;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/zzaji$zzc;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_0

    :cond_c
    iget-object v0, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzcaa:Lcom/google/android/gms/internal/zzamf;

    iget-object v1, p1, Lcom/google/android/gms/internal/zzaji$zze;->zzcaa:Lcom/google/android/gms/internal/zzamf;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzamf;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 3

    const/4 v1, 0x0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzbTK:Lcom/google/android/gms/internal/zzaji$zza;

    if-nez v0, :cond_1

    move v0, v1

    :goto_0
    add-int/2addr v0, v2

    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzbTL:Lcom/google/android/gms/internal/zzaji$zza;

    if-nez v0, :cond_2

    move v0, v1

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzbTM:Lcom/google/android/gms/internal/zzaji$zza;

    if-nez v0, :cond_3

    move v0, v1

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzbTN:Lcom/google/android/gms/internal/zzaji$zzc;

    if-nez v0, :cond_4

    move v0, v1

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzbTO:[Lcom/google/android/gms/internal/zzaji$zzf;

    invoke-static {v2}, Lcom/google/android/gms/internal/zzamh;->hashCode([Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzcaa:Lcom/google/android/gms/internal/zzamf;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzcaa:Lcom/google/android/gms/internal/zzamf;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzamf;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_5

    :cond_0
    :goto_4
    add-int/2addr v0, v1

    return v0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzbTK:Lcom/google/android/gms/internal/zzaji$zza;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaji$zza;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzbTL:Lcom/google/android/gms/internal/zzaji$zza;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaji$zza;->hashCode()I

    move-result v0

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzbTM:Lcom/google/android/gms/internal/zzaji$zza;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaji$zza;->hashCode()I

    move-result v0

    goto :goto_2

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzbTN:Lcom/google/android/gms/internal/zzaji$zzc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaji$zzc;->hashCode()I

    move-result v0

    goto :goto_3

    :cond_5
    iget-object v1, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzcaa:Lcom/google/android/gms/internal/zzamf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzamf;->hashCode()I

    move-result v1

    goto :goto_4
.end method

.method public synthetic mergeFrom(Lcom/google/android/gms/internal/zzamb;)Lcom/google/android/gms/internal/zzamj;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzaji$zze;->zzT(Lcom/google/android/gms/internal/zzamb;)Lcom/google/android/gms/internal/zzaji$zze;

    move-result-object v0

    return-object v0
.end method

.method public writeTo(Lcom/google/android/gms/internal/zzamc;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzbTK:Lcom/google/android/gms/internal/zzaji$zza;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzbTK:Lcom/google/android/gms/internal/zzaji$zza;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/zzamc;->zza(ILcom/google/android/gms/internal/zzamj;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzbTL:Lcom/google/android/gms/internal/zzaji$zza;

    if-eqz v0, :cond_1

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzbTL:Lcom/google/android/gms/internal/zzaji$zza;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/zzamc;->zza(ILcom/google/android/gms/internal/zzamj;)V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzbTM:Lcom/google/android/gms/internal/zzaji$zza;

    if-eqz v0, :cond_2

    const/4 v0, 0x3

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzbTM:Lcom/google/android/gms/internal/zzaji$zza;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/zzamc;->zza(ILcom/google/android/gms/internal/zzamj;)V

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzbTN:Lcom/google/android/gms/internal/zzaji$zzc;

    if-eqz v0, :cond_3

    const/4 v0, 0x4

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzbTN:Lcom/google/android/gms/internal/zzaji$zzc;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/zzamc;->zza(ILcom/google/android/gms/internal/zzamj;)V

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzbTO:[Lcom/google/android/gms/internal/zzaji$zzf;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzbTO:[Lcom/google/android/gms/internal/zzaji$zzf;

    array-length v0, v0

    if-lez v0, :cond_5

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzbTO:[Lcom/google/android/gms/internal/zzaji$zzf;

    array-length v1, v1

    if-ge v0, v1, :cond_5

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzbTO:[Lcom/google/android/gms/internal/zzaji$zzf;

    aget-object v1, v1, v0

    if-eqz v1, :cond_4

    const/4 v2, 0x5

    invoke-virtual {p1, v2, v1}, Lcom/google/android/gms/internal/zzamc;->zza(ILcom/google/android/gms/internal/zzamj;)V

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_5
    invoke-super {p0, p1}, Lcom/google/android/gms/internal/zzamd;->writeTo(Lcom/google/android/gms/internal/zzamc;)V

    return-void
.end method

.method public zzT(Lcom/google/android/gms/internal/zzamb;)Lcom/google/android/gms/internal/zzaji$zze;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v1, 0x0

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
    iget-object v0, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzbTK:Lcom/google/android/gms/internal/zzaji$zza;

    if-nez v0, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/zzaji$zza;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzaji$zza;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzbTK:Lcom/google/android/gms/internal/zzaji$zza;

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzbTK:Lcom/google/android/gms/internal/zzaji$zza;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/zzamb;->zza(Lcom/google/android/gms/internal/zzamj;)V

    goto :goto_0

    :sswitch_2
    iget-object v0, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzbTL:Lcom/google/android/gms/internal/zzaji$zza;

    if-nez v0, :cond_2

    new-instance v0, Lcom/google/android/gms/internal/zzaji$zza;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzaji$zza;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzbTL:Lcom/google/android/gms/internal/zzaji$zza;

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzbTL:Lcom/google/android/gms/internal/zzaji$zza;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/zzamb;->zza(Lcom/google/android/gms/internal/zzamj;)V

    goto :goto_0

    :sswitch_3
    iget-object v0, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzbTM:Lcom/google/android/gms/internal/zzaji$zza;

    if-nez v0, :cond_3

    new-instance v0, Lcom/google/android/gms/internal/zzaji$zza;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzaji$zza;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzbTM:Lcom/google/android/gms/internal/zzaji$zza;

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzbTM:Lcom/google/android/gms/internal/zzaji$zza;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/zzamb;->zza(Lcom/google/android/gms/internal/zzamj;)V

    goto :goto_0

    :sswitch_4
    iget-object v0, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzbTN:Lcom/google/android/gms/internal/zzaji$zzc;

    if-nez v0, :cond_4

    new-instance v0, Lcom/google/android/gms/internal/zzaji$zzc;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzaji$zzc;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzbTN:Lcom/google/android/gms/internal/zzaji$zzc;

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzbTN:Lcom/google/android/gms/internal/zzaji$zzc;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/zzamb;->zza(Lcom/google/android/gms/internal/zzamj;)V

    goto :goto_0

    :sswitch_5
    const/16 v0, 0x2a

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/zzamm;->zzc(Lcom/google/android/gms/internal/zzamb;I)I

    move-result v2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzbTO:[Lcom/google/android/gms/internal/zzaji$zzf;

    if-nez v0, :cond_6

    move v0, v1

    :goto_1
    add-int/2addr v2, v0

    new-array v2, v2, [Lcom/google/android/gms/internal/zzaji$zzf;

    if-eqz v0, :cond_5

    iget-object v3, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzbTO:[Lcom/google/android/gms/internal/zzaji$zzf;

    invoke-static {v3, v1, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_5
    :goto_2
    array-length v3, v2

    add-int/lit8 v3, v3, -0x1

    if-ge v0, v3, :cond_7

    new-instance v3, Lcom/google/android/gms/internal/zzaji$zzf;

    invoke-direct {v3}, Lcom/google/android/gms/internal/zzaji$zzf;-><init>()V

    aput-object v3, v2, v0

    aget-object v3, v2, v0

    invoke-virtual {p1, v3}, Lcom/google/android/gms/internal/zzamb;->zza(Lcom/google/android/gms/internal/zzamj;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzamb;->zzWC()I

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzbTO:[Lcom/google/android/gms/internal/zzaji$zzf;

    array-length v0, v0

    goto :goto_1

    :cond_7
    new-instance v3, Lcom/google/android/gms/internal/zzaji$zzf;

    invoke-direct {v3}, Lcom/google/android/gms/internal/zzaji$zzf;-><init>()V

    aput-object v3, v2, v0

    aget-object v0, v2, v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/zzamb;->zza(Lcom/google/android/gms/internal/zzamj;)V

    iput-object v2, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzbTO:[Lcom/google/android/gms/internal/zzaji$zzf;

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
        0x12 -> :sswitch_2
        0x1a -> :sswitch_3
        0x22 -> :sswitch_4
        0x2a -> :sswitch_5
    .end sparse-switch
.end method

.method public zzUM()Lcom/google/android/gms/internal/zzaji$zze;
    .locals 2

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzbTK:Lcom/google/android/gms/internal/zzaji$zza;

    iput-object v1, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzbTL:Lcom/google/android/gms/internal/zzaji$zza;

    iput-object v1, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzbTM:Lcom/google/android/gms/internal/zzaji$zza;

    iput-object v1, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzbTN:Lcom/google/android/gms/internal/zzaji$zzc;

    invoke-static {}, Lcom/google/android/gms/internal/zzaji$zzf;->zzUN()[Lcom/google/android/gms/internal/zzaji$zzf;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzbTO:[Lcom/google/android/gms/internal/zzaji$zzf;

    iput-object v1, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzcaa:Lcom/google/android/gms/internal/zzamf;

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzcaj:I

    return-object p0
.end method

.method protected zzy()I
    .locals 5

    invoke-super {p0}, Lcom/google/android/gms/internal/zzamd;->zzy()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzbTK:Lcom/google/android/gms/internal/zzaji$zza;

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzbTK:Lcom/google/android/gms/internal/zzaji$zza;

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/zzamc;->zzc(ILcom/google/android/gms/internal/zzamj;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzbTL:Lcom/google/android/gms/internal/zzaji$zza;

    if-eqz v1, :cond_1

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzbTL:Lcom/google/android/gms/internal/zzaji$zza;

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/zzamc;->zzc(ILcom/google/android/gms/internal/zzamj;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzbTM:Lcom/google/android/gms/internal/zzaji$zza;

    if-eqz v1, :cond_2

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzbTM:Lcom/google/android/gms/internal/zzaji$zza;

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/zzamc;->zzc(ILcom/google/android/gms/internal/zzamj;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzbTN:Lcom/google/android/gms/internal/zzaji$zzc;

    if-eqz v1, :cond_3

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzbTN:Lcom/google/android/gms/internal/zzaji$zzc;

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/zzamc;->zzc(ILcom/google/android/gms/internal/zzamj;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzbTO:[Lcom/google/android/gms/internal/zzaji$zzf;

    if-eqz v1, :cond_6

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzbTO:[Lcom/google/android/gms/internal/zzaji$zzf;

    array-length v1, v1

    if-lez v1, :cond_6

    const/4 v1, 0x0

    move v4, v1

    move v1, v0

    move v0, v4

    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzbTO:[Lcom/google/android/gms/internal/zzaji$zzf;

    array-length v2, v2

    if-ge v0, v2, :cond_5

    iget-object v2, p0, Lcom/google/android/gms/internal/zzaji$zze;->zzbTO:[Lcom/google/android/gms/internal/zzaji$zzf;

    aget-object v2, v2, v0

    if-eqz v2, :cond_4

    const/4 v3, 0x5

    invoke-static {v3, v2}, Lcom/google/android/gms/internal/zzamc;->zzc(ILcom/google/android/gms/internal/zzamj;)I

    move-result v2

    add-int/2addr v1, v2

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_5
    move v0, v1

    :cond_6
    return v0
.end method
