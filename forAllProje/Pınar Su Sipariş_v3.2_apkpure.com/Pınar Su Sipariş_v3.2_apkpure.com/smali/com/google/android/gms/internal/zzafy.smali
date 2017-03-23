.class public Lcom/google/android/gms/internal/zzafy;
.super Lcom/google/android/gms/internal/zzafw;


# instance fields
.field private final zzbOC:Lcom/google/android/gms/internal/zzahu;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzafx;Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/zzafw$zza;->zzbOp:Lcom/google/android/gms/internal/zzafw$zza;

    invoke-direct {p0, v0, p1, p2}, Lcom/google/android/gms/internal/zzafw;-><init>(Lcom/google/android/gms/internal/zzafw$zza;Lcom/google/android/gms/internal/zzafx;Lcom/google/android/gms/internal/zzafa;)V

    iput-object p3, p0, Lcom/google/android/gms/internal/zzafy;->zzbOC:Lcom/google/android/gms/internal/zzahu;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 4

    const-string v0, "Overwrite { path=%s, source=%s, snapshot=%s }"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzafy;->zzPn()Lcom/google/android/gms/internal/zzafa;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzafy;->zzRZ()Lcom/google/android/gms/internal/zzafx;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/google/android/gms/internal/zzafy;->zzbOC:Lcom/google/android/gms/internal/zzahu;

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public zzSf()Lcom/google/android/gms/internal/zzahu;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafy;->zzbOC:Lcom/google/android/gms/internal/zzahu;

    return-object v0
.end method

.method public zzc(Lcom/google/android/gms/internal/zzahi;)Lcom/google/android/gms/internal/zzafw;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafy;->zzbHw:Lcom/google/android/gms/internal/zzafa;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzafa;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/zzafy;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafy;->zzbOo:Lcom/google/android/gms/internal/zzafx;

    invoke-static {}, Lcom/google/android/gms/internal/zzafa;->zzRq()Lcom/google/android/gms/internal/zzafa;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/zzafy;->zzbOC:Lcom/google/android/gms/internal/zzahu;

    invoke-interface {v3, p1}, Lcom/google/android/gms/internal/zzahu;->zzm(Lcom/google/android/gms/internal/zzahi;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/internal/zzafy;-><init>(Lcom/google/android/gms/internal/zzafx;Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;)V

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/zzafy;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafy;->zzbOo:Lcom/google/android/gms/internal/zzafx;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzafy;->zzbHw:Lcom/google/android/gms/internal/zzafa;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzafa;->zzRu()Lcom/google/android/gms/internal/zzafa;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/zzafy;->zzbOC:Lcom/google/android/gms/internal/zzahu;

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/internal/zzafy;-><init>(Lcom/google/android/gms/internal/zzafx;Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;)V

    goto :goto_0
.end method
