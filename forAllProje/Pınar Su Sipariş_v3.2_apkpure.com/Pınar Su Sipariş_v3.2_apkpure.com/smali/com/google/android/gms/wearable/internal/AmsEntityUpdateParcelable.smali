.class public Lcom/google/android/gms/wearable/internal/AmsEntityUpdateParcelable;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;

# interfaces
.implements Lcom/google/android/gms/wearable/zzb;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/wearable/internal/AmsEntityUpdateParcelable;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final mValue:Ljava/lang/String;

.field final mVersionCode:I

.field private zzbCm:B

.field private final zzbCn:B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/wearable/internal/zzf;

    invoke-direct {v0}, Lcom/google/android/gms/wearable/internal/zzf;-><init>()V

    sput-object v0, Lcom/google/android/gms/wearable/internal/AmsEntityUpdateParcelable;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(IBBLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput-byte p2, p0, Lcom/google/android/gms/wearable/internal/AmsEntityUpdateParcelable;->zzbCm:B

    iput p1, p0, Lcom/google/android/gms/wearable/internal/AmsEntityUpdateParcelable;->mVersionCode:I

    iput-byte p3, p0, Lcom/google/android/gms/wearable/internal/AmsEntityUpdateParcelable;->zzbCn:B

    iput-object p4, p0, Lcom/google/android/gms/wearable/internal/AmsEntityUpdateParcelable;->mValue:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p0, p1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_3

    :cond_2
    move v0, v1

    goto :goto_0

    :cond_3
    check-cast p1, Lcom/google/android/gms/wearable/internal/AmsEntityUpdateParcelable;

    iget-byte v2, p0, Lcom/google/android/gms/wearable/internal/AmsEntityUpdateParcelable;->zzbCm:B

    iget-byte v3, p1, Lcom/google/android/gms/wearable/internal/AmsEntityUpdateParcelable;->zzbCm:B

    if-eq v2, v3, :cond_4

    move v0, v1

    goto :goto_0

    :cond_4
    iget v2, p0, Lcom/google/android/gms/wearable/internal/AmsEntityUpdateParcelable;->mVersionCode:I

    iget v3, p1, Lcom/google/android/gms/wearable/internal/AmsEntityUpdateParcelable;->mVersionCode:I

    if-eq v2, v3, :cond_5

    move v0, v1

    goto :goto_0

    :cond_5
    iget-byte v2, p0, Lcom/google/android/gms/wearable/internal/AmsEntityUpdateParcelable;->zzbCn:B

    iget-byte v3, p1, Lcom/google/android/gms/wearable/internal/AmsEntityUpdateParcelable;->zzbCn:B

    if-eq v2, v3, :cond_6

    move v0, v1

    goto :goto_0

    :cond_6
    iget-object v2, p0, Lcom/google/android/gms/wearable/internal/AmsEntityUpdateParcelable;->mValue:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/wearable/internal/AmsEntityUpdateParcelable;->mValue:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    move v0, v1

    goto :goto_0
.end method

.method public getValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/AmsEntityUpdateParcelable;->mValue:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/google/android/gms/wearable/internal/AmsEntityUpdateParcelable;->mVersionCode:I

    mul-int/lit8 v0, v0, 0x1f

    iget-byte v1, p0, Lcom/google/android/gms/wearable/internal/AmsEntityUpdateParcelable;->zzbCm:B

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-byte v1, p0, Lcom/google/android/gms/wearable/internal/AmsEntityUpdateParcelable;->zzbCn:B

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/google/android/gms/wearable/internal/AmsEntityUpdateParcelable;->mValue:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget v0, p0, Lcom/google/android/gms/wearable/internal/AmsEntityUpdateParcelable;->mVersionCode:I

    iget-byte v1, p0, Lcom/google/android/gms/wearable/internal/AmsEntityUpdateParcelable;->zzbCm:B

    iget-byte v2, p0, Lcom/google/android/gms/wearable/internal/AmsEntityUpdateParcelable;->zzbCn:B

    iget-object v3, p0, Lcom/google/android/gms/wearable/internal/AmsEntityUpdateParcelable;->mValue:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/lit8 v5, v5, 0x61

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v5, "AmsEntityUpdateParcelable{mVersionCode="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, ", mEntityId="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mAttributeId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mValue=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/wearable/internal/zzf;->zza(Lcom/google/android/gms/wearable/internal/AmsEntityUpdateParcelable;Landroid/os/Parcel;I)V

    return-void
.end method

.method public zzNu()B
    .locals 1

    iget-byte v0, p0, Lcom/google/android/gms/wearable/internal/AmsEntityUpdateParcelable;->zzbCm:B

    return v0
.end method

.method public zzNv()B
    .locals 1

    iget-byte v0, p0, Lcom/google/android/gms/wearable/internal/AmsEntityUpdateParcelable;->zzbCn:B

    return v0
.end method
