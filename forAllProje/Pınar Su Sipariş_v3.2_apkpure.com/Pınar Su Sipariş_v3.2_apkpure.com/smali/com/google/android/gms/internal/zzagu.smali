.class public Lcom/google/android/gms/internal/zzagu;
.super Ljava/lang/Object;


# instance fields
.field private final zzbHw:Lcom/google/android/gms/internal/zzafa;

.field private final zzbHz:Lcom/google/android/gms/internal/zzagt;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzagt;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzagu;->zzbHw:Lcom/google/android/gms/internal/zzafa;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzagu;->zzbHz:Lcom/google/android/gms/internal/zzagt;

    return-void
.end method

.method public static zzN(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzagu;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/zzagu;

    sget-object v1, Lcom/google/android/gms/internal/zzagt;->zzbPK:Lcom/google/android/gms/internal/zzagt;

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/zzagu;-><init>(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzagt;)V

    return-object v0
.end method

.method public static zzb(Lcom/google/android/gms/internal/zzafa;Ljava/util/Map;)Lcom/google/android/gms/internal/zzagu;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzafa;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/google/android/gms/internal/zzagu;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/internal/zzagt;->zzaA(Ljava/util/Map;)Lcom/google/android/gms/internal/zzagt;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/zzagu;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/zzagu;-><init>(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzagt;)V

    return-object v1
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
    check-cast p1, Lcom/google/android/gms/internal/zzagu;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzagu;->zzbHw:Lcom/google/android/gms/internal/zzafa;

    iget-object v3, p1, Lcom/google/android/gms/internal/zzagu;->zzbHw:Lcom/google/android/gms/internal/zzafa;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/zzafa;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    move v0, v1

    goto :goto_0

    :cond_4
    iget-object v2, p0, Lcom/google/android/gms/internal/zzagu;->zzbHz:Lcom/google/android/gms/internal/zzagt;

    iget-object v3, p1, Lcom/google/android/gms/internal/zzagu;->zzbHz:Lcom/google/android/gms/internal/zzagt;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/zzagt;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    move v0, v1

    goto :goto_0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagu;->zzbHw:Lcom/google/android/gms/internal/zzafa;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzafa;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/google/android/gms/internal/zzagu;->zzbHz:Lcom/google/android/gms/internal/zzagt;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzagt;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public isDefault()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagu;->zzbHz:Lcom/google/android/gms/internal/zzagt;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagt;->isDefault()Z

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagu;->zzbHw:Lcom/google/android/gms/internal/zzafa;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzagu;->zzbHz:Lcom/google/android/gms/internal/zzagt;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ":"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public zzPn()Lcom/google/android/gms/internal/zzafa;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagu;->zzbHw:Lcom/google/android/gms/internal/zzafa;

    return-object v0
.end method

.method public zzSK()Lcom/google/android/gms/internal/zzaho;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagu;->zzbHz:Lcom/google/android/gms/internal/zzagt;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagt;->zzSK()Lcom/google/android/gms/internal/zzaho;

    move-result-object v0

    return-object v0
.end method

.method public zzSO()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagu;->zzbHz:Lcom/google/android/gms/internal/zzagt;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagt;->zzSO()Z

    move-result v0

    return v0
.end method

.method public zzSR()Lcom/google/android/gms/internal/zzagt;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagu;->zzbHz:Lcom/google/android/gms/internal/zzagt;

    return-object v0
.end method
