.class public Lcom/google/android/gms/internal/zzaer;
.super Lcom/google/android/gms/internal/zzaew;


# instance fields
.field private final zzbHo:Lcom/google/android/gms/internal/zzafc;

.field private final zzbLc:Lcom/google/firebase/database/ChildEventListener;

.field private final zzbLd:Lcom/google/android/gms/internal/zzagu;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzafc;Lcom/google/firebase/database/ChildEventListener;Lcom/google/android/gms/internal/zzagu;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzaew;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzaer;->zzbHo:Lcom/google/android/gms/internal/zzafc;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzaer;->zzbLc:Lcom/google/firebase/database/ChildEventListener;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzaer;->zzbLd:Lcom/google/android/gms/internal/zzagu;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lcom/google/android/gms/internal/zzaer;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/zzaer;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzaer;->zzbLc:Lcom/google/firebase/database/ChildEventListener;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaer;->zzbLc:Lcom/google/firebase/database/ChildEventListener;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/zzaer;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzaer;->zzbHo:Lcom/google/android/gms/internal/zzafc;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaer;->zzbHo:Lcom/google/android/gms/internal/zzafc;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    check-cast p1, Lcom/google/android/gms/internal/zzaer;

    iget-object v0, p1, Lcom/google/android/gms/internal/zzaer;->zzbLd:Lcom/google/android/gms/internal/zzagu;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaer;->zzbLd:Lcom/google/android/gms/internal/zzagu;

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

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaer;->zzbLc:Lcom/google/firebase/database/ChildEventListener;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaer;->zzbHo:Lcom/google/android/gms/internal/zzafc;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaer;->zzbLd:Lcom/google/android/gms/internal/zzagu;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzagu;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "ChildEventRegistration"

    return-object v0
.end method

.method public zzQM()Lcom/google/android/gms/internal/zzagu;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaer;->zzbLd:Lcom/google/android/gms/internal/zzagu;

    return-object v0
.end method

.method public zza(Lcom/google/android/gms/internal/zzagu;)Lcom/google/android/gms/internal/zzaew;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/zzaer;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaer;->zzbHo:Lcom/google/android/gms/internal/zzafc;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzaer;->zzbLc:Lcom/google/firebase/database/ChildEventListener;

    invoke-direct {v0, v1, v2, p1}, Lcom/google/android/gms/internal/zzaer;-><init>(Lcom/google/android/gms/internal/zzafc;Lcom/google/firebase/database/ChildEventListener;Lcom/google/android/gms/internal/zzagu;)V

    return-object v0
.end method

.method public zza(Lcom/google/android/gms/internal/zzago;Lcom/google/android/gms/internal/zzagu;)Lcom/google/android/gms/internal/zzagp;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaer;->zzbHo:Lcom/google/android/gms/internal/zzafc;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzagu;->zzPn()Lcom/google/android/gms/internal/zzafa;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzago;->zzSv()Lcom/google/android/gms/internal/zzahi;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/zzafa;->zza(Lcom/google/android/gms/internal/zzahi;)Lcom/google/android/gms/internal/zzafa;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/firebase/database/zza;->zza(Lcom/google/android/gms/internal/zzafc;Lcom/google/android/gms/internal/zzafa;)Lcom/google/firebase/database/DatabaseReference;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzago;->zzSt()Lcom/google/android/gms/internal/zzahp;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/firebase/database/zza;->zza(Lcom/google/firebase/database/DatabaseReference;Lcom/google/android/gms/internal/zzahp;)Lcom/google/firebase/database/DataSnapshot;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzago;->zzSx()Lcom/google/android/gms/internal/zzahi;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzago;->zzSx()Lcom/google/android/gms/internal/zzahi;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzahi;->asString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    new-instance v2, Lcom/google/android/gms/internal/zzagp;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzago;->zzSw()Lcom/google/android/gms/internal/zzagq$zza;

    move-result-object v3

    invoke-direct {v2, v3, p0, v1, v0}, Lcom/google/android/gms/internal/zzagp;-><init>(Lcom/google/android/gms/internal/zzagq$zza;Lcom/google/android/gms/internal/zzaew;Lcom/google/firebase/database/DataSnapshot;Ljava/lang/String;)V

    return-object v2

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public zza(Lcom/google/android/gms/internal/zzagp;)V
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzaer;->zzRm()Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    return-void

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/zzaer$1;->a:[I

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagp;->zzSw()Lcom/google/android/gms/internal/zzagq$zza;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzagq$zza;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzaer;->zzbLc:Lcom/google/firebase/database/ChildEventListener;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagp;->zzSz()Lcom/google/firebase/database/DataSnapshot;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagp;->zzSA()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/google/firebase/database/ChildEventListener;->onChildAdded(Lcom/google/firebase/database/DataSnapshot;Ljava/lang/String;)V

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Lcom/google/android/gms/internal/zzaer;->zzbLc:Lcom/google/firebase/database/ChildEventListener;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagp;->zzSz()Lcom/google/firebase/database/DataSnapshot;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagp;->zzSA()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/google/firebase/database/ChildEventListener;->onChildChanged(Lcom/google/firebase/database/DataSnapshot;Ljava/lang/String;)V

    goto :goto_0

    :pswitch_2
    iget-object v0, p0, Lcom/google/android/gms/internal/zzaer;->zzbLc:Lcom/google/firebase/database/ChildEventListener;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagp;->zzSz()Lcom/google/firebase/database/DataSnapshot;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagp;->zzSA()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/google/firebase/database/ChildEventListener;->onChildMoved(Lcom/google/firebase/database/DataSnapshot;Ljava/lang/String;)V

    goto :goto_0

    :pswitch_3
    iget-object v0, p0, Lcom/google/android/gms/internal/zzaer;->zzbLc:Lcom/google/firebase/database/ChildEventListener;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagp;->zzSz()Lcom/google/firebase/database/DataSnapshot;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/firebase/database/ChildEventListener;->onChildRemoved(Lcom/google/firebase/database/DataSnapshot;)V

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

.method public zza(Lcom/google/firebase/database/DatabaseError;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaer;->zzbLc:Lcom/google/firebase/database/ChildEventListener;

    invoke-interface {v0, p1}, Lcom/google/firebase/database/ChildEventListener;->onCancelled(Lcom/google/firebase/database/DatabaseError;)V

    return-void
.end method

.method public zza(Lcom/google/android/gms/internal/zzagq$zza;)Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/zzagq$zza;->zzbPD:Lcom/google/android/gms/internal/zzagq$zza;

    if-eq p1, v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public zzc(Lcom/google/android/gms/internal/zzaew;)Z
    .locals 2

    instance-of v0, p1, Lcom/google/android/gms/internal/zzaer;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/google/android/gms/internal/zzaer;

    iget-object v0, p1, Lcom/google/android/gms/internal/zzaer;->zzbLc:Lcom/google/firebase/database/ChildEventListener;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaer;->zzbLc:Lcom/google/firebase/database/ChildEventListener;

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
