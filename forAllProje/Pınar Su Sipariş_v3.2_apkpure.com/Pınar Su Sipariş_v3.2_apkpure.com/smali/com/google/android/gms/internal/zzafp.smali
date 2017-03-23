.class public Lcom/google/android/gms/internal/zzafp;
.super Lcom/google/android/gms/internal/zzaew;


# instance fields
.field private final zzbHo:Lcom/google/android/gms/internal/zzafc;

.field private final zzbLd:Lcom/google/android/gms/internal/zzagu;

.field private final zzbNX:Lcom/google/firebase/database/ValueEventListener;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzafc;Lcom/google/firebase/database/ValueEventListener;Lcom/google/android/gms/internal/zzagu;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzaew;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzafp;->zzbHo:Lcom/google/android/gms/internal/zzafc;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzafp;->zzbNX:Lcom/google/firebase/database/ValueEventListener;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzafp;->zzbLd:Lcom/google/android/gms/internal/zzagu;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lcom/google/android/gms/internal/zzafp;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/zzafp;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzafp;->zzbNX:Lcom/google/firebase/database/ValueEventListener;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafp;->zzbNX:Lcom/google/firebase/database/ValueEventListener;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/zzafp;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzafp;->zzbHo:Lcom/google/android/gms/internal/zzafc;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafp;->zzbHo:Lcom/google/android/gms/internal/zzafc;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    check-cast p1, Lcom/google/android/gms/internal/zzafp;

    iget-object v0, p1, Lcom/google/android/gms/internal/zzafp;->zzbLd:Lcom/google/android/gms/internal/zzagu;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafp;->zzbLd:Lcom/google/android/gms/internal/zzagu;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzagu;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafp;->zzbNX:Lcom/google/firebase/database/ValueEventListener;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafp;->zzbHo:Lcom/google/android/gms/internal/zzafc;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafp;->zzbLd:Lcom/google/android/gms/internal/zzagu;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzagu;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "ValueEventRegistration"

    return-object v0
.end method

.method public zzQM()Lcom/google/android/gms/internal/zzagu;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafp;->zzbLd:Lcom/google/android/gms/internal/zzagu;

    return-object v0
.end method

.method public zza(Lcom/google/android/gms/internal/zzagu;)Lcom/google/android/gms/internal/zzaew;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/zzafp;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafp;->zzbHo:Lcom/google/android/gms/internal/zzafc;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzafp;->zzbNX:Lcom/google/firebase/database/ValueEventListener;

    invoke-direct {v0, v1, v2, p1}, Lcom/google/android/gms/internal/zzafp;-><init>(Lcom/google/android/gms/internal/zzafc;Lcom/google/firebase/database/ValueEventListener;Lcom/google/android/gms/internal/zzagu;)V

    return-object v0
.end method

.method public zza(Lcom/google/android/gms/internal/zzago;Lcom/google/android/gms/internal/zzagu;)Lcom/google/android/gms/internal/zzagp;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafp;->zzbHo:Lcom/google/android/gms/internal/zzafc;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzagu;->zzPn()Lcom/google/android/gms/internal/zzafa;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/firebase/database/zza;->zza(Lcom/google/android/gms/internal/zzafc;Lcom/google/android/gms/internal/zzafa;)Lcom/google/firebase/database/DatabaseReference;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzago;->zzSt()Lcom/google/android/gms/internal/zzahp;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/firebase/database/zza;->zza(Lcom/google/firebase/database/DatabaseReference;Lcom/google/android/gms/internal/zzahp;)Lcom/google/firebase/database/DataSnapshot;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/zzagp;

    sget-object v2, Lcom/google/android/gms/internal/zzagq$zza;->zzbPD:Lcom/google/android/gms/internal/zzagq$zza;

    const/4 v3, 0x0

    invoke-direct {v1, v2, p0, v0, v3}, Lcom/google/android/gms/internal/zzagp;-><init>(Lcom/google/android/gms/internal/zzagq$zza;Lcom/google/android/gms/internal/zzaew;Lcom/google/firebase/database/DataSnapshot;Ljava/lang/String;)V

    return-object v1
.end method

.method public zza(Lcom/google/android/gms/internal/zzagp;)V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzafp;->zzRm()Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzafp;->zzbNX:Lcom/google/firebase/database/ValueEventListener;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagp;->zzSz()Lcom/google/firebase/database/DataSnapshot;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/firebase/database/ValueEventListener;->onDataChange(Lcom/google/firebase/database/DataSnapshot;)V

    goto :goto_0
.end method

.method public zza(Lcom/google/firebase/database/DatabaseError;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafp;->zzbNX:Lcom/google/firebase/database/ValueEventListener;

    invoke-interface {v0, p1}, Lcom/google/firebase/database/ValueEventListener;->onCancelled(Lcom/google/firebase/database/DatabaseError;)V

    return-void
.end method

.method public zza(Lcom/google/android/gms/internal/zzagq$zza;)Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/zzagq$zza;->zzbPD:Lcom/google/android/gms/internal/zzagq$zza;

    if-ne p1, v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public zzc(Lcom/google/android/gms/internal/zzaew;)Z
    .locals 2

    instance-of v0, p1, Lcom/google/android/gms/internal/zzafp;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/google/android/gms/internal/zzafp;

    iget-object v0, p1, Lcom/google/android/gms/internal/zzafp;->zzbNX:Lcom/google/firebase/database/ValueEventListener;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafp;->zzbNX:Lcom/google/firebase/database/ValueEventListener;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
