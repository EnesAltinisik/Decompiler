.class public Lcom/google/android/gms/internal/zzafr;
.super Ljava/lang/Object;


# instance fields
.field private final zzbOg:Lcom/google/android/gms/internal/zzafa;

.field private final zzbOh:Lcom/google/android/gms/internal/zzafq;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzafq;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzafr;->zzbOg:Lcom/google/android/gms/internal/zzafa;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzafr;->zzbOh:Lcom/google/android/gms/internal/zzafq;

    return-void
.end method


# virtual methods
.method public zza(Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzaht;ZLcom/google/android/gms/internal/zzaho;)Lcom/google/android/gms/internal/zzaht;
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafr;->zzbOh:Lcom/google/android/gms/internal/zzafq;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafr;->zzbOg:Lcom/google/android/gms/internal/zzafa;

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/zzafq;->zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzaht;ZLcom/google/android/gms/internal/zzaho;)Lcom/google/android/gms/internal/zzaht;

    move-result-object v0

    return-object v0
.end method

.method public zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafr;->zzbOh:Lcom/google/android/gms/internal/zzafq;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafr;->zzbOg:Lcom/google/android/gms/internal/zzafa;

    invoke-virtual {v0, v1, p1, p2, p3}, Lcom/google/android/gms/internal/zzafq;->zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    return-object v0
.end method

.method public zza(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzagm;)Lcom/google/android/gms/internal/zzahu;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafr;->zzbOh:Lcom/google/android/gms/internal/zzafq;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafr;->zzbOg:Lcom/google/android/gms/internal/zzafa;

    invoke-virtual {v0, v1, p1, p2}, Lcom/google/android/gms/internal/zzafq;->zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzagm;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    return-object v0
.end method

.method public zza(Lcom/google/android/gms/internal/zzahu;Ljava/util/List;)Lcom/google/android/gms/internal/zzahu;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzahu;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Long;",
            ">;)",
            "Lcom/google/android/gms/internal/zzahu;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/google/android/gms/internal/zzafr;->zza(Lcom/google/android/gms/internal/zzahu;Ljava/util/List;Z)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    return-object v0
.end method

.method public zza(Lcom/google/android/gms/internal/zzahu;Ljava/util/List;Z)Lcom/google/android/gms/internal/zzahu;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzahu;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Long;",
            ">;Z)",
            "Lcom/google/android/gms/internal/zzahu;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafr;->zzbOh:Lcom/google/android/gms/internal/zzafq;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafr;->zzbOg:Lcom/google/android/gms/internal/zzafa;

    invoke-virtual {v0, v1, p1, p2, p3}, Lcom/google/android/gms/internal/zzafq;->zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;Ljava/util/List;Z)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    return-object v0
.end method

.method public zzb(Lcom/google/android/gms/internal/zzahi;)Lcom/google/android/gms/internal/zzafr;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/zzafr;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafr;->zzbOg:Lcom/google/android/gms/internal/zzafa;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/zzafa;->zza(Lcom/google/android/gms/internal/zzahi;)Lcom/google/android/gms/internal/zzafa;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzafr;->zzbOh:Lcom/google/android/gms/internal/zzafq;

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/zzafr;-><init>(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzafq;)V

    return-object v0
.end method

.method public zzc(Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;
    .locals 1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/zzafr;->zza(Lcom/google/android/gms/internal/zzahu;Ljava/util/List;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    return-object v0
.end method

.method public zzd(Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafr;->zzbOh:Lcom/google/android/gms/internal/zzafq;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafr;->zzbOg:Lcom/google/android/gms/internal/zzafa;

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/zzafq;->zzj(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    return-object v0
.end method

.method public zzv(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzahu;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafr;->zzbOh:Lcom/google/android/gms/internal/zzafq;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafr;->zzbOg:Lcom/google/android/gms/internal/zzafa;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/zzafa;->zzh(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzafa;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzafq;->zzv(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    return-object v0
.end method
