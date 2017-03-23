.class public abstract Lcom/google/android/gms/internal/zzadz;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/zzadx;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/zzadx",
        "<TK;TV;>;"
    }
.end annotation


# instance fields
.field private final zzbIt:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TK;"
        }
    .end annotation
.end field

.field private final zzbIu:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TV;"
        }
    .end annotation
.end field

.field private zzbIv:Lcom/google/android/gms/internal/zzadx;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzadx",
            "<TK;TV;>;"
        }
    .end annotation
.end field

.field private final zzbIw:Lcom/google/android/gms/internal/zzadx;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzadx",
            "<TK;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/internal/zzadx;Lcom/google/android/gms/internal/zzadx;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;",
            "Lcom/google/android/gms/internal/zzadx",
            "<TK;TV;>;",
            "Lcom/google/android/gms/internal/zzadx",
            "<TK;TV;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzadz;->zzbIt:Ljava/lang/Object;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzadz;->zzbIu:Ljava/lang/Object;

    if-nez p3, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/zzadw;->zzPD()Lcom/google/android/gms/internal/zzadw;

    move-result-object p3

    :cond_0
    iput-object p3, p0, Lcom/google/android/gms/internal/zzadz;->zzbIv:Lcom/google/android/gms/internal/zzadx;

    if-nez p4, :cond_1

    invoke-static {}, Lcom/google/android/gms/internal/zzadw;->zzPD()Lcom/google/android/gms/internal/zzadw;

    move-result-object p4

    :cond_1
    iput-object p4, p0, Lcom/google/android/gms/internal/zzadz;->zzbIw:Lcom/google/android/gms/internal/zzadx;

    return-void
.end method

.method private zzPJ()Lcom/google/android/gms/internal/zzadx;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/zzadx",
            "<TK;TV;>;"
        }
    .end annotation

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadz;->zzbIv:Lcom/google/android/gms/internal/zzadx;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzadx;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/zzadw;->zzPD()Lcom/google/android/gms/internal/zzadw;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzadz;->zzPE()Lcom/google/android/gms/internal/zzadx;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzadx;->zzPC()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzadz;->zzPE()Lcom/google/android/gms/internal/zzadx;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzadx;->zzPE()Lcom/google/android/gms/internal/zzadx;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzadx;->zzPC()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzadz;->zzPK()Lcom/google/android/gms/internal/zzadz;

    move-result-object p0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/zzadz;->zzbIv:Lcom/google/android/gms/internal/zzadx;

    check-cast v0, Lcom/google/android/gms/internal/zzadz;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzadz;->zzPJ()Lcom/google/android/gms/internal/zzadx;

    move-result-object v0

    invoke-virtual {p0, v1, v1, v0, v1}, Lcom/google/android/gms/internal/zzadz;->zza(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/internal/zzadx;Lcom/google/android/gms/internal/zzadx;)Lcom/google/android/gms/internal/zzadz;

    move-result-object v0

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzadz;->zzPM()Lcom/google/android/gms/internal/zzadz;

    move-result-object v0

    goto :goto_0
.end method

.method private zzPK()Lcom/google/android/gms/internal/zzadz;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/zzadz",
            "<TK;TV;>;"
        }
    .end annotation

    const/4 v2, 0x0

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzadz;->zzPP()Lcom/google/android/gms/internal/zzadz;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzadz;->zzPF()Lcom/google/android/gms/internal/zzadx;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzadx;->zzPE()Lcom/google/android/gms/internal/zzadx;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzadx;->zzPC()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzadz;->zzPF()Lcom/google/android/gms/internal/zzadx;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzadz;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzadz;->zzPO()Lcom/google/android/gms/internal/zzadz;

    move-result-object v0

    invoke-virtual {v1, v2, v2, v2, v0}, Lcom/google/android/gms/internal/zzadz;->zza(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/internal/zzadx;Lcom/google/android/gms/internal/zzadx;)Lcom/google/android/gms/internal/zzadz;

    move-result-object v0

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzadz;->zzPN()Lcom/google/android/gms/internal/zzadz;

    move-result-object v0

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzadz;->zzPP()Lcom/google/android/gms/internal/zzadz;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    move-object v0, v1

    goto :goto_0
.end method

.method private zzPL()Lcom/google/android/gms/internal/zzadz;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/zzadz",
            "<TK;TV;>;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzadz;->zzPP()Lcom/google/android/gms/internal/zzadz;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzadz;->zzPE()Lcom/google/android/gms/internal/zzadx;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/internal/zzadx;->zzPE()Lcom/google/android/gms/internal/zzadx;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/internal/zzadx;->zzPC()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzadz;->zzPO()Lcom/google/android/gms/internal/zzadz;

    move-result-object v0

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzadz;->zzPP()Lcom/google/android/gms/internal/zzadz;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method private zzPM()Lcom/google/android/gms/internal/zzadz;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/zzadz",
            "<TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadz;->zzbIw:Lcom/google/android/gms/internal/zzadx;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzadx;->zzPC()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadz;->zzbIv:Lcom/google/android/gms/internal/zzadx;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzadx;->zzPC()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzadz;->zzPN()Lcom/google/android/gms/internal/zzadz;

    move-result-object p0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzadz;->zzbIv:Lcom/google/android/gms/internal/zzadx;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzadx;->zzPC()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadz;->zzbIv:Lcom/google/android/gms/internal/zzadx;

    check-cast v0, Lcom/google/android/gms/internal/zzadz;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzadz;->zzbIv:Lcom/google/android/gms/internal/zzadx;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzadx;->zzPC()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzadz;->zzPO()Lcom/google/android/gms/internal/zzadz;

    move-result-object p0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/zzadz;->zzbIv:Lcom/google/android/gms/internal/zzadx;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzadx;->zzPC()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadz;->zzbIw:Lcom/google/android/gms/internal/zzadx;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzadx;->zzPC()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzadz;->zzPP()Lcom/google/android/gms/internal/zzadz;

    move-result-object p0

    :cond_2
    return-object p0
.end method

.method private zzPN()Lcom/google/android/gms/internal/zzadz;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/zzadz",
            "<TK;TV;>;"
        }
    .end annotation

    const/4 v1, 0x0

    sget-object v3, Lcom/google/android/gms/internal/zzadx$zza;->zzbIq:Lcom/google/android/gms/internal/zzadx$zza;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadz;->zzbIw:Lcom/google/android/gms/internal/zzadx;

    check-cast v0, Lcom/google/android/gms/internal/zzadz;

    iget-object v5, v0, Lcom/google/android/gms/internal/zzadz;->zzbIv:Lcom/google/android/gms/internal/zzadx;

    move-object v0, p0

    move-object v2, v1

    move-object v4, v1

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/zzadz;->zza(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/internal/zzadx$zza;Lcom/google/android/gms/internal/zzadx;Lcom/google/android/gms/internal/zzadx;)Lcom/google/android/gms/internal/zzadx;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/zzadz;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadz;->zzbIw:Lcom/google/android/gms/internal/zzadx;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzadz;->zzPB()Lcom/google/android/gms/internal/zzadx$zza;

    move-result-object v3

    move-object v2, v1

    move-object v5, v1

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/internal/zzadx;->zza(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/internal/zzadx$zza;Lcom/google/android/gms/internal/zzadx;Lcom/google/android/gms/internal/zzadx;)Lcom/google/android/gms/internal/zzadx;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzadz;

    return-object v0
.end method

.method private zzPO()Lcom/google/android/gms/internal/zzadz;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/zzadz",
            "<TK;TV;>;"
        }
    .end annotation

    const/4 v1, 0x0

    sget-object v3, Lcom/google/android/gms/internal/zzadx$zza;->zzbIq:Lcom/google/android/gms/internal/zzadx$zza;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadz;->zzbIv:Lcom/google/android/gms/internal/zzadx;

    check-cast v0, Lcom/google/android/gms/internal/zzadz;

    iget-object v4, v0, Lcom/google/android/gms/internal/zzadz;->zzbIw:Lcom/google/android/gms/internal/zzadx;

    move-object v0, p0

    move-object v2, v1

    move-object v5, v1

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/zzadz;->zza(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/internal/zzadx$zza;Lcom/google/android/gms/internal/zzadx;Lcom/google/android/gms/internal/zzadx;)Lcom/google/android/gms/internal/zzadx;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/zzadz;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadz;->zzbIv:Lcom/google/android/gms/internal/zzadx;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzadz;->zzPB()Lcom/google/android/gms/internal/zzadx$zza;

    move-result-object v3

    move-object v2, v1

    move-object v4, v1

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/internal/zzadx;->zza(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/internal/zzadx$zza;Lcom/google/android/gms/internal/zzadx;Lcom/google/android/gms/internal/zzadx;)Lcom/google/android/gms/internal/zzadx;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzadz;

    return-object v0
.end method

.method private zzPP()Lcom/google/android/gms/internal/zzadz;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/zzadz",
            "<TK;TV;>;"
        }
    .end annotation

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadz;->zzbIv:Lcom/google/android/gms/internal/zzadx;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzadz;->zzbIv:Lcom/google/android/gms/internal/zzadx;

    invoke-static {v2}, Lcom/google/android/gms/internal/zzadz;->zza(Lcom/google/android/gms/internal/zzadx;)Lcom/google/android/gms/internal/zzadx$zza;

    move-result-object v3

    move-object v2, v1

    move-object v4, v1

    move-object v5, v1

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/internal/zzadx;->zza(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/internal/zzadx$zza;Lcom/google/android/gms/internal/zzadx;Lcom/google/android/gms/internal/zzadx;)Lcom/google/android/gms/internal/zzadx;

    move-result-object v6

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadz;->zzbIw:Lcom/google/android/gms/internal/zzadx;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzadz;->zzbIw:Lcom/google/android/gms/internal/zzadx;

    invoke-static {v2}, Lcom/google/android/gms/internal/zzadz;->zza(Lcom/google/android/gms/internal/zzadx;)Lcom/google/android/gms/internal/zzadx$zza;

    move-result-object v3

    move-object v2, v1

    move-object v4, v1

    move-object v5, v1

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/internal/zzadx;->zza(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/internal/zzadx$zza;Lcom/google/android/gms/internal/zzadx;Lcom/google/android/gms/internal/zzadx;)Lcom/google/android/gms/internal/zzadx;

    move-result-object v5

    invoke-static {p0}, Lcom/google/android/gms/internal/zzadz;->zza(Lcom/google/android/gms/internal/zzadx;)Lcom/google/android/gms/internal/zzadx$zza;

    move-result-object v3

    move-object v0, p0

    move-object v2, v1

    move-object v4, v6

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/zzadz;->zza(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/internal/zzadx$zza;Lcom/google/android/gms/internal/zzadx;Lcom/google/android/gms/internal/zzadx;)Lcom/google/android/gms/internal/zzadx;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzadz;

    return-object v0
.end method

.method private static zza(Lcom/google/android/gms/internal/zzadx;)Lcom/google/android/gms/internal/zzadx$zza;
    .locals 1

    invoke-interface {p0}, Lcom/google/android/gms/internal/zzadx;->zzPC()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/zzadx$zza;->zzbIr:Lcom/google/android/gms/internal/zzadx$zza;

    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/zzadx$zza;->zzbIq:Lcom/google/android/gms/internal/zzadx$zza;

    goto :goto_0
.end method


# virtual methods
.method public getKey()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TK;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadz;->zzbIt:Ljava/lang/Object;

    return-object v0
.end method

.method public getValue()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadz;->zzbIu:Ljava/lang/Object;

    return-object v0
.end method

.method public isEmpty()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected abstract zzPB()Lcom/google/android/gms/internal/zzadx$zza;
.end method

.method public zzPE()Lcom/google/android/gms/internal/zzadx;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/zzadx",
            "<TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadz;->zzbIv:Lcom/google/android/gms/internal/zzadx;

    return-object v0
.end method

.method public zzPF()Lcom/google/android/gms/internal/zzadx;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/zzadx",
            "<TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadz;->zzbIw:Lcom/google/android/gms/internal/zzadx;

    return-object v0
.end method

.method public zzPG()Lcom/google/android/gms/internal/zzadx;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/zzadx",
            "<TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadz;->zzbIv:Lcom/google/android/gms/internal/zzadx;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzadx;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    return-object p0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzadz;->zzbIv:Lcom/google/android/gms/internal/zzadx;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzadx;->zzPG()Lcom/google/android/gms/internal/zzadx;

    move-result-object p0

    goto :goto_0
.end method

.method public zzPH()Lcom/google/android/gms/internal/zzadx;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/zzadx",
            "<TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadz;->zzbIw:Lcom/google/android/gms/internal/zzadx;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzadx;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    return-object p0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzadz;->zzbIw:Lcom/google/android/gms/internal/zzadx;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzadx;->zzPH()Lcom/google/android/gms/internal/zzadx;

    move-result-object p0

    goto :goto_0
.end method

.method public zzPI()I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadz;->zzbIv:Lcom/google/android/gms/internal/zzadx;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzadx;->zzPI()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lcom/google/android/gms/internal/zzadz;->zzbIw:Lcom/google/android/gms/internal/zzadx;

    invoke-interface {v1}, Lcom/google/android/gms/internal/zzadx;->zzPI()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public synthetic zza(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/internal/zzadx$zza;Lcom/google/android/gms/internal/zzadx;Lcom/google/android/gms/internal/zzadx;)Lcom/google/android/gms/internal/zzadx;
    .locals 1

    invoke-virtual/range {p0 .. p5}, Lcom/google/android/gms/internal/zzadz;->zzb(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/internal/zzadx$zza;Lcom/google/android/gms/internal/zzadx;Lcom/google/android/gms/internal/zzadx;)Lcom/google/android/gms/internal/zzadz;

    move-result-object v0

    return-object v0
.end method

.method public zza(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lcom/google/android/gms/internal/zzadx;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;",
            "Ljava/util/Comparator",
            "<TK;>;)",
            "Lcom/google/android/gms/internal/zzadx",
            "<TK;TV;>;"
        }
    .end annotation

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadz;->zzbIt:Ljava/lang/Object;

    invoke-interface {p3, p1, v0}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    if-gez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadz;->zzbIv:Lcom/google/android/gms/internal/zzadx;

    invoke-interface {v0, p1, p2, p3}, Lcom/google/android/gms/internal/zzadx;->zza(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lcom/google/android/gms/internal/zzadx;

    move-result-object v0

    invoke-virtual {p0, v1, v1, v0, v1}, Lcom/google/android/gms/internal/zzadz;->zza(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/internal/zzadx;Lcom/google/android/gms/internal/zzadx;)Lcom/google/android/gms/internal/zzadz;

    move-result-object v0

    :goto_0
    invoke-direct {v0}, Lcom/google/android/gms/internal/zzadz;->zzPM()Lcom/google/android/gms/internal/zzadz;

    move-result-object v0

    return-object v0

    :cond_0
    if-nez v0, :cond_1

    invoke-virtual {p0, p1, p2, v1, v1}, Lcom/google/android/gms/internal/zzadz;->zza(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/internal/zzadx;Lcom/google/android/gms/internal/zzadx;)Lcom/google/android/gms/internal/zzadz;

    move-result-object v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/zzadz;->zzbIw:Lcom/google/android/gms/internal/zzadx;

    invoke-interface {v0, p1, p2, p3}, Lcom/google/android/gms/internal/zzadx;->zza(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lcom/google/android/gms/internal/zzadx;

    move-result-object v0

    invoke-virtual {p0, v1, v1, v1, v0}, Lcom/google/android/gms/internal/zzadz;->zza(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/internal/zzadx;Lcom/google/android/gms/internal/zzadx;)Lcom/google/android/gms/internal/zzadz;

    move-result-object v0

    goto :goto_0
.end method

.method public zza(Ljava/lang/Object;Ljava/util/Comparator;)Lcom/google/android/gms/internal/zzadx;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Ljava/util/Comparator",
            "<TK;>;)",
            "Lcom/google/android/gms/internal/zzadx",
            "<TK;TV;>;"
        }
    .end annotation

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadz;->zzbIt:Ljava/lang/Object;

    invoke-interface {p2, p1, v0}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    if-gez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadz;->zzbIv:Lcom/google/android/gms/internal/zzadx;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzadx;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadz;->zzbIv:Lcom/google/android/gms/internal/zzadx;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzadx;->zzPC()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadz;->zzbIv:Lcom/google/android/gms/internal/zzadx;

    check-cast v0, Lcom/google/android/gms/internal/zzadz;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzadz;->zzbIv:Lcom/google/android/gms/internal/zzadx;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzadx;->zzPC()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzadz;->zzPK()Lcom/google/android/gms/internal/zzadz;

    move-result-object p0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzadz;->zzbIv:Lcom/google/android/gms/internal/zzadx;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/zzadx;->zza(Ljava/lang/Object;Ljava/util/Comparator;)Lcom/google/android/gms/internal/zzadx;

    move-result-object v0

    invoke-virtual {p0, v3, v3, v0, v3}, Lcom/google/android/gms/internal/zzadz;->zza(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/internal/zzadx;Lcom/google/android/gms/internal/zzadx;)Lcom/google/android/gms/internal/zzadz;

    move-result-object v0

    :goto_0
    invoke-direct {v0}, Lcom/google/android/gms/internal/zzadz;->zzPM()Lcom/google/android/gms/internal/zzadz;

    move-result-object v0

    :goto_1
    return-object v0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/zzadz;->zzbIv:Lcom/google/android/gms/internal/zzadx;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzadx;->zzPC()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzadz;->zzPO()Lcom/google/android/gms/internal/zzadz;

    move-result-object p0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/zzadz;->zzbIw:Lcom/google/android/gms/internal/zzadx;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzadx;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadz;->zzbIw:Lcom/google/android/gms/internal/zzadx;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzadx;->zzPC()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadz;->zzbIw:Lcom/google/android/gms/internal/zzadx;

    check-cast v0, Lcom/google/android/gms/internal/zzadz;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzadz;->zzbIv:Lcom/google/android/gms/internal/zzadx;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzadx;->zzPC()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzadz;->zzPL()Lcom/google/android/gms/internal/zzadz;

    move-result-object p0

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/zzadz;->zzbIt:Ljava/lang/Object;

    invoke-interface {p2, p1, v0}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadz;->zzbIw:Lcom/google/android/gms/internal/zzadx;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzadx;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, Lcom/google/android/gms/internal/zzadw;->zzPD()Lcom/google/android/gms/internal/zzadw;

    move-result-object v0

    goto :goto_1

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/zzadz;->zzbIw:Lcom/google/android/gms/internal/zzadx;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzadx;->zzPG()Lcom/google/android/gms/internal/zzadx;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzadx;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzadx;->getValue()Ljava/lang/Object;

    move-result-object v2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadz;->zzbIw:Lcom/google/android/gms/internal/zzadx;

    check-cast v0, Lcom/google/android/gms/internal/zzadz;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzadz;->zzPJ()Lcom/google/android/gms/internal/zzadx;

    move-result-object v0

    invoke-virtual {p0, v1, v2, v3, v0}, Lcom/google/android/gms/internal/zzadz;->zza(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/internal/zzadx;Lcom/google/android/gms/internal/zzadx;)Lcom/google/android/gms/internal/zzadz;

    move-result-object p0

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/zzadz;->zzbIw:Lcom/google/android/gms/internal/zzadx;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/zzadx;->zza(Ljava/lang/Object;Ljava/util/Comparator;)Lcom/google/android/gms/internal/zzadx;

    move-result-object v0

    invoke-virtual {p0, v3, v3, v3, v0}, Lcom/google/android/gms/internal/zzadz;->zza(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/internal/zzadx;Lcom/google/android/gms/internal/zzadx;)Lcom/google/android/gms/internal/zzadz;

    move-result-object v0

    goto :goto_0
.end method

.method protected abstract zza(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/internal/zzadx;Lcom/google/android/gms/internal/zzadx;)Lcom/google/android/gms/internal/zzadz;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;",
            "Lcom/google/android/gms/internal/zzadx",
            "<TK;TV;>;",
            "Lcom/google/android/gms/internal/zzadx",
            "<TK;TV;>;)",
            "Lcom/google/android/gms/internal/zzadz",
            "<TK;TV;>;"
        }
    .end annotation
.end method

.method public zza(Lcom/google/android/gms/internal/zzadx$zzb;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzadx$zzb",
            "<TK;TV;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadz;->zzbIv:Lcom/google/android/gms/internal/zzadx;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/zzadx;->zza(Lcom/google/android/gms/internal/zzadx$zzb;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadz;->zzbIt:Ljava/lang/Object;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzadz;->zzbIu:Ljava/lang/Object;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/zzadx$zzb;->zzk(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadz;->zzbIw:Lcom/google/android/gms/internal/zzadx;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/zzadx;->zza(Lcom/google/android/gms/internal/zzadx$zzb;)V

    return-void
.end method

.method public zzb(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/internal/zzadx$zza;Lcom/google/android/gms/internal/zzadx;Lcom/google/android/gms/internal/zzadx;)Lcom/google/android/gms/internal/zzadz;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;",
            "Lcom/google/android/gms/internal/zzadx$zza;",
            "Lcom/google/android/gms/internal/zzadx",
            "<TK;TV;>;",
            "Lcom/google/android/gms/internal/zzadx",
            "<TK;TV;>;)",
            "Lcom/google/android/gms/internal/zzadz",
            "<TK;TV;>;"
        }
    .end annotation

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/zzadz;->zzbIt:Ljava/lang/Object;

    :cond_0
    if-nez p2, :cond_1

    iget-object p2, p0, Lcom/google/android/gms/internal/zzadz;->zzbIu:Ljava/lang/Object;

    :cond_1
    if-nez p4, :cond_2

    iget-object p4, p0, Lcom/google/android/gms/internal/zzadz;->zzbIv:Lcom/google/android/gms/internal/zzadx;

    :cond_2
    if-nez p5, :cond_3

    iget-object p5, p0, Lcom/google/android/gms/internal/zzadz;->zzbIw:Lcom/google/android/gms/internal/zzadx;

    :cond_3
    sget-object v0, Lcom/google/android/gms/internal/zzadx$zza;->zzbIq:Lcom/google/android/gms/internal/zzadx$zza;

    if-ne p3, v0, :cond_4

    new-instance v0, Lcom/google/android/gms/internal/zzady;

    invoke-direct {v0, p1, p2, p4, p5}, Lcom/google/android/gms/internal/zzady;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/internal/zzadx;Lcom/google/android/gms/internal/zzadx;)V

    :goto_0
    return-object v0

    :cond_4
    new-instance v0, Lcom/google/android/gms/internal/zzadv;

    invoke-direct {v0, p1, p2, p4, p5}, Lcom/google/android/gms/internal/zzadv;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/internal/zzadx;Lcom/google/android/gms/internal/zzadx;)V

    goto :goto_0
.end method

.method zzb(Lcom/google/android/gms/internal/zzadx;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzadx",
            "<TK;TV;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/internal/zzadz;->zzbIv:Lcom/google/android/gms/internal/zzadx;

    return-void
.end method
