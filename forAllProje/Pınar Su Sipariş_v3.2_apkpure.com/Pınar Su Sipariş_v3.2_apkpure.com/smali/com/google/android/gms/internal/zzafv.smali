.class public Lcom/google/android/gms/internal/zzafv;
.super Lcom/google/android/gms/internal/zzafw;


# instance fields
.field private final zzbOm:Lcom/google/android/gms/internal/zzaes;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzafx;Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzaes;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/zzafw$zza;->zzbOq:Lcom/google/android/gms/internal/zzafw$zza;

    invoke-direct {p0, v0, p1, p2}, Lcom/google/android/gms/internal/zzafw;-><init>(Lcom/google/android/gms/internal/zzafw$zza;Lcom/google/android/gms/internal/zzafx;Lcom/google/android/gms/internal/zzafa;)V

    iput-object p3, p0, Lcom/google/android/gms/internal/zzafv;->zzbOm:Lcom/google/android/gms/internal/zzaes;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 4

    const-string v0, "Merge { path=%s, source=%s, children=%s }"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzafv;->zzPn()Lcom/google/android/gms/internal/zzafa;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzafv;->zzRZ()Lcom/google/android/gms/internal/zzafx;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/google/android/gms/internal/zzafv;->zzbOm:Lcom/google/android/gms/internal/zzaes;

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public zzRY()Lcom/google/android/gms/internal/zzaes;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafv;->zzbOm:Lcom/google/android/gms/internal/zzaes;

    return-object v0
.end method

.method public zzc(Lcom/google/android/gms/internal/zzahi;)Lcom/google/android/gms/internal/zzafw;
    .locals 5

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafv;->zzbHw:Lcom/google/android/gms/internal/zzafa;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzafa;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafv;->zzbOm:Lcom/google/android/gms/internal/zzaes;

    new-instance v2, Lcom/google/android/gms/internal/zzafa;

    const/4 v3, 0x1

    new-array v3, v3, [Lcom/google/android/gms/internal/zzahi;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/zzafa;-><init>([Lcom/google/android/gms/internal/zzahi;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/zzaes;->zzg(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzaes;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzaes;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    :cond_0
    :goto_0
    return-object v0

    :cond_1
    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzaes;->zzQO()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    if-eqz v0, :cond_2

    new-instance v0, Lcom/google/android/gms/internal/zzafy;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzafv;->zzbOo:Lcom/google/android/gms/internal/zzafx;

    invoke-static {}, Lcom/google/android/gms/internal/zzafa;->zzRq()Lcom/google/android/gms/internal/zzafa;

    move-result-object v3

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzaes;->zzQO()Lcom/google/android/gms/internal/zzahu;

    move-result-object v1

    invoke-direct {v0, v2, v3, v1}, Lcom/google/android/gms/internal/zzafy;-><init>(Lcom/google/android/gms/internal/zzafx;Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;)V

    goto :goto_0

    :cond_2
    new-instance v0, Lcom/google/android/gms/internal/zzafv;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzafv;->zzbOo:Lcom/google/android/gms/internal/zzafx;

    invoke-static {}, Lcom/google/android/gms/internal/zzafa;->zzRq()Lcom/google/android/gms/internal/zzafa;

    move-result-object v3

    invoke-direct {v0, v2, v3, v1}, Lcom/google/android/gms/internal/zzafv;-><init>(Lcom/google/android/gms/internal/zzafx;Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzaes;)V

    goto :goto_0

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/internal/zzafv;->zzbHw:Lcom/google/android/gms/internal/zzafa;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzafa;->zzRt()Lcom/google/android/gms/internal/zzahi;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/zzahi;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/zzafv;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafv;->zzbOo:Lcom/google/android/gms/internal/zzafx;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzafv;->zzbHw:Lcom/google/android/gms/internal/zzafa;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzafa;->zzRu()Lcom/google/android/gms/internal/zzafa;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/zzafv;->zzbOm:Lcom/google/android/gms/internal/zzaes;

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/internal/zzafv;-><init>(Lcom/google/android/gms/internal/zzafx;Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzaes;)V

    goto :goto_0
.end method
