.class public Lcom/google/android/gms/internal/zzahw;
.super Lcom/google/android/gms/internal/zzaho;


# instance fields
.field private final zzbRm:Lcom/google/android/gms/internal/zzafa;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzafa;)V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzaho;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafa;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafa;->zzRt()Lcom/google/android/gms/internal/zzahi;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzahi;->zzTl()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t create PathIndex with \'.priority\' as key. Please use PriorityIndex instead!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/internal/zzahw;->zzbRm:Lcom/google/android/gms/internal/zzafa;

    return-void
.end method


# virtual methods
.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/zzaht;

    check-cast p2, Lcom/google/android/gms/internal/zzaht;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/zzahw;->zza(Lcom/google/android/gms/internal/zzaht;Lcom/google/android/gms/internal/zzaht;)I

    move-result v0

    return v0
.end method

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
    check-cast p1, Lcom/google/android/gms/internal/zzahw;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzahw;->zzbRm:Lcom/google/android/gms/internal/zzafa;

    iget-object v3, p1, Lcom/google/android/gms/internal/zzahw;->zzbRm:Lcom/google/android/gms/internal/zzafa;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/zzafa;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    move v0, v1

    goto :goto_0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzahw;->zzbRm:Lcom/google/android/gms/internal/zzafa;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzafa;->hashCode()I

    move-result v0

    return v0
.end method

.method public zzTC()Lcom/google/android/gms/internal/zzaht;
    .locals 3

    invoke-static {}, Lcom/google/android/gms/internal/zzahn;->zzTA()Lcom/google/android/gms/internal/zzahn;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzahw;->zzbRm:Lcom/google/android/gms/internal/zzafa;

    sget-object v2, Lcom/google/android/gms/internal/zzahu;->zzbRi:Lcom/google/android/gms/internal/zzahj;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/zzahn;->zzl(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/zzaht;

    invoke-static {}, Lcom/google/android/gms/internal/zzahi;->zzTi()Lcom/google/android/gms/internal/zzahi;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lcom/google/android/gms/internal/zzaht;-><init>(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)V

    return-object v1
.end method

.method public zzTD()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzahw;->zzbRm:Lcom/google/android/gms/internal/zzafa;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzafa;->zzRr()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public zza(Lcom/google/android/gms/internal/zzaht;Lcom/google/android/gms/internal/zzaht;)I
    .locals 3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzaht;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzahw;->zzbRm:Lcom/google/android/gms/internal/zzafa;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzahu;->zzO(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzaht;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzahw;->zzbRm:Lcom/google/android/gms/internal/zzafa;

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/zzahu;->zzO(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzahu;->compareTo(Ljava/lang/Object;)I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzaht;->zzTK()Lcom/google/android/gms/internal/zzahi;

    move-result-object v0

    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzaht;->zzTK()Lcom/google/android/gms/internal/zzahi;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzahi;->zzi(Lcom/google/android/gms/internal/zzahi;)I

    move-result v0

    :cond_0
    return v0
.end method

.method public zzg(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzaht;
    .locals 2

    invoke-static {}, Lcom/google/android/gms/internal/zzahn;->zzTA()Lcom/google/android/gms/internal/zzahn;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzahw;->zzbRm:Lcom/google/android/gms/internal/zzafa;

    invoke-virtual {v0, v1, p2}, Lcom/google/android/gms/internal/zzahn;->zzl(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/zzaht;

    invoke-direct {v1, p1, v0}, Lcom/google/android/gms/internal/zzaht;-><init>(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)V

    return-object v1
.end method

.method public zzl(Lcom/google/android/gms/internal/zzahu;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzahw;->zzbRm:Lcom/google/android/gms/internal/zzafa;

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/zzahu;->zzO(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzahu;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
