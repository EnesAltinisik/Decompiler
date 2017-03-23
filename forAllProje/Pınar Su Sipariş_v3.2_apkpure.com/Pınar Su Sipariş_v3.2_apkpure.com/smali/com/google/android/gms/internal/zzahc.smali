.class public Lcom/google/android/gms/internal/zzahc;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/zzahb;


# instance fields
.field private final zzbPG:Lcom/google/android/gms/internal/zzaho;

.field private final zzbQn:Lcom/google/android/gms/internal/zzagz;

.field private final zzbQo:Lcom/google/android/gms/internal/zzaht;

.field private final zzbQp:Lcom/google/android/gms/internal/zzaht;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzagt;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/zzagz;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagt;->zzSK()Lcom/google/android/gms/internal/zzaho;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/zzagz;-><init>(Lcom/google/android/gms/internal/zzaho;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzahc;->zzbQn:Lcom/google/android/gms/internal/zzagz;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagt;->zzSK()Lcom/google/android/gms/internal/zzaho;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzahc;->zzbPG:Lcom/google/android/gms/internal/zzaho;

    invoke-static {p1}, Lcom/google/android/gms/internal/zzahc;->zzd(Lcom/google/android/gms/internal/zzagt;)Lcom/google/android/gms/internal/zzaht;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzahc;->zzbQo:Lcom/google/android/gms/internal/zzaht;

    invoke-static {p1}, Lcom/google/android/gms/internal/zzahc;->zze(Lcom/google/android/gms/internal/zzagt;)Lcom/google/android/gms/internal/zzaht;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzahc;->zzbQp:Lcom/google/android/gms/internal/zzaht;

    return-void
.end method

.method private static zzd(Lcom/google/android/gms/internal/zzagt;)Lcom/google/android/gms/internal/zzaht;
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzagt;->zzSC()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzagt;->zzSE()Lcom/google/android/gms/internal/zzahi;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzagt;->zzSK()Lcom/google/android/gms/internal/zzaho;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzagt;->zzSD()Lcom/google/android/gms/internal/zzahu;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/zzaho;->zzg(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzaht;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzagt;->zzSK()Lcom/google/android/gms/internal/zzaho;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaho;->zzTB()Lcom/google/android/gms/internal/zzaht;

    move-result-object v0

    goto :goto_0
.end method

.method private static zze(Lcom/google/android/gms/internal/zzagt;)Lcom/google/android/gms/internal/zzaht;
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzagt;->zzSF()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzagt;->zzSH()Lcom/google/android/gms/internal/zzahi;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzagt;->zzSK()Lcom/google/android/gms/internal/zzaho;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzagt;->zzSG()Lcom/google/android/gms/internal/zzahu;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/zzaho;->zzg(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzaht;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzagt;->zzSK()Lcom/google/android/gms/internal/zzaho;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaho;->zzTC()Lcom/google/android/gms/internal/zzaht;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public zzSK()Lcom/google/android/gms/internal/zzaho;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzahc;->zzbPG:Lcom/google/android/gms/internal/zzaho;

    return-object v0
.end method

.method public zzTa()Lcom/google/android/gms/internal/zzahb;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzahc;->zzbQn:Lcom/google/android/gms/internal/zzagz;

    return-object v0
.end method

.method public zzTb()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public zzTc()Lcom/google/android/gms/internal/zzaht;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzahc;->zzbQo:Lcom/google/android/gms/internal/zzaht;

    return-object v0
.end method

.method public zzTd()Lcom/google/android/gms/internal/zzaht;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzahc;->zzbQp:Lcom/google/android/gms/internal/zzaht;

    return-object v0
.end method

.method public zza(Lcom/google/android/gms/internal/zzahp;Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahb$zza;Lcom/google/android/gms/internal/zzagy;)Lcom/google/android/gms/internal/zzahp;
    .locals 7

    new-instance v0, Lcom/google/android/gms/internal/zzaht;

    invoke-direct {v0, p2, p3}, Lcom/google/android/gms/internal/zzaht;-><init>(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzahc;->zza(Lcom/google/android/gms/internal/zzaht;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/zzahn;->zzTA()Lcom/google/android/gms/internal/zzahn;

    move-result-object v3

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzahc;->zzbQn:Lcom/google/android/gms/internal/zzagz;

    move-object v1, p1

    move-object v2, p2

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/zzagz;->zza(Lcom/google/android/gms/internal/zzahp;Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahb$zza;Lcom/google/android/gms/internal/zzagy;)Lcom/google/android/gms/internal/zzahp;

    move-result-object v0

    return-object v0

    :cond_0
    move-object v3, p3

    goto :goto_0
.end method

.method public zza(Lcom/google/android/gms/internal/zzahp;Lcom/google/android/gms/internal/zzahp;Lcom/google/android/gms/internal/zzagy;)Lcom/google/android/gms/internal/zzahp;
    .locals 4

    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzahp;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzahu;->zzTo()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/google/android/gms/internal/zzahn;->zzTA()Lcom/google/android/gms/internal/zzahn;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzahc;->zzbPG:Lcom/google/android/gms/internal/zzaho;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/zzahp;->zza(Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzaho;)Lcom/google/android/gms/internal/zzahp;

    move-result-object v1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzahc;->zzbQn:Lcom/google/android/gms/internal/zzagz;

    invoke-virtual {v0, p1, v1, p3}, Lcom/google/android/gms/internal/zzagz;->zza(Lcom/google/android/gms/internal/zzahp;Lcom/google/android/gms/internal/zzahp;Lcom/google/android/gms/internal/zzagy;)Lcom/google/android/gms/internal/zzahp;

    move-result-object v0

    return-object v0

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/zzahy;->zzTM()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/zzahp;->zzn(Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahp;

    move-result-object v0

    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzahp;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move-object v1, v0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzaht;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzahc;->zza(Lcom/google/android/gms/internal/zzaht;)Z

    move-result v3

    if-nez v3, :cond_2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaht;->zzTK()Lcom/google/android/gms/internal/zzahi;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/zzahn;->zzTA()Lcom/google/android/gms/internal/zzahn;

    move-result-object v3

    invoke-virtual {v1, v0, v3}, Lcom/google/android/gms/internal/zzahp;->zzh(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahp;

    move-result-object v0

    :goto_1
    move-object v1, v0

    goto :goto_0

    :cond_2
    move-object v0, v1

    goto :goto_1
.end method

.method public zza(Lcom/google/android/gms/internal/zzahp;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahp;
    .locals 0

    return-object p1
.end method

.method public zza(Lcom/google/android/gms/internal/zzaht;)Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzahc;->zzbPG:Lcom/google/android/gms/internal/zzaho;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzahc;->zzTc()Lcom/google/android/gms/internal/zzaht;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/zzaho;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    if-gtz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzahc;->zzbPG:Lcom/google/android/gms/internal/zzaho;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzahc;->zzTd()Lcom/google/android/gms/internal/zzaht;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/zzaho;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
