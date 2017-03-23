.class public Lcom/google/android/gms/internal/zzagr;
.super Ljava/lang/Object;


# instance fields
.field private final zzbPF:Lcom/google/android/gms/internal/zzagu;

.field private final zzbPG:Lcom/google/android/gms/internal/zzaho;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzagu;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzagr;->zzbPF:Lcom/google/android/gms/internal/zzagu;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagu;->zzSK()Lcom/google/android/gms/internal/zzaho;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzagr;->zzbPG:Lcom/google/android/gms/internal/zzaho;

    return-void
.end method

.method private zzSB()Ljava/util/Comparator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Comparator",
            "<",
            "Lcom/google/android/gms/internal/zzago;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/zzagr$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/zzagr$1;-><init>(Lcom/google/android/gms/internal/zzagr;)V

    return-object v0
.end method

.method private zza(Lcom/google/android/gms/internal/zzago;Lcom/google/android/gms/internal/zzaew;Lcom/google/android/gms/internal/zzahp;)Lcom/google/android/gms/internal/zzagp;
    .locals 3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzago;->zzSw()Lcom/google/android/gms/internal/zzagq$zza;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/zzagq$zza;->zzbPD:Lcom/google/android/gms/internal/zzagq$zza;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzagq$zza;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzago;->zzSw()Lcom/google/android/gms/internal/zzagq$zza;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/zzagq$zza;->zzbPz:Lcom/google/android/gms/internal/zzagq$zza;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzagq$zza;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzagr;->zzbPF:Lcom/google/android/gms/internal/zzagu;

    invoke-virtual {p2, p1, v0}, Lcom/google/android/gms/internal/zzaew;->zza(Lcom/google/android/gms/internal/zzago;Lcom/google/android/gms/internal/zzagu;)Lcom/google/android/gms/internal/zzagp;

    move-result-object v0

    return-object v0

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzago;->zzSv()Lcom/google/android/gms/internal/zzahi;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzago;->zzSt()Lcom/google/android/gms/internal/zzahp;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzahp;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzagr;->zzbPG:Lcom/google/android/gms/internal/zzaho;

    invoke-virtual {p3, v0, v1, v2}, Lcom/google/android/gms/internal/zzahp;->zza(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzaho;)Lcom/google/android/gms/internal/zzahi;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/zzago;->zzg(Lcom/google/android/gms/internal/zzahi;)Lcom/google/android/gms/internal/zzago;

    move-result-object p1

    goto :goto_0
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/zzagr;)Lcom/google/android/gms/internal/zzaho;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagr;->zzbPG:Lcom/google/android/gms/internal/zzaho;

    return-object v0
.end method

.method private zza(Ljava/util/List;Lcom/google/android/gms/internal/zzagq$zza;Ljava/util/List;Ljava/util/List;Lcom/google/android/gms/internal/zzahp;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzagp;",
            ">;",
            "Lcom/google/android/gms/internal/zzagq$zza;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzago;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzaew;",
            ">;",
            "Lcom/google/android/gms/internal/zzahp;",
            ")V"
        }
    .end annotation

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzago;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzago;->zzSw()Lcom/google/android/gms/internal/zzagq$zza;

    move-result-object v3

    invoke-virtual {v3, p2}, Lcom/google/android/gms/internal/zzagq$zza;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lcom/google/android/gms/internal/zzagr;->zzSB()Ljava/util/Comparator;

    move-result-object v0

    invoke-static {v1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzago;

    invoke-interface {p4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_3
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/zzaew;

    invoke-virtual {v1, p2}, Lcom/google/android/gms/internal/zzaew;->zza(Lcom/google/android/gms/internal/zzagq$zza;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-direct {p0, v0, v1, p5}, Lcom/google/android/gms/internal/zzagr;->zza(Lcom/google/android/gms/internal/zzago;Lcom/google/android/gms/internal/zzaew;Lcom/google/android/gms/internal/zzahp;)Lcom/google/android/gms/internal/zzagp;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    return-void
.end method


# virtual methods
.method public zza(Ljava/util/List;Lcom/google/android/gms/internal/zzahp;Ljava/util/List;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzago;",
            ">;",
            "Lcom/google/android/gms/internal/zzahp;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzaew;",
            ">;)",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzagp;",
            ">;"
        }
    .end annotation

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzago;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzago;->zzSw()Lcom/google/android/gms/internal/zzagq$zza;

    move-result-object v3

    sget-object v4, Lcom/google/android/gms/internal/zzagq$zza;->zzbPC:Lcom/google/android/gms/internal/zzagq$zza;

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/zzagq$zza;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v3, p0, Lcom/google/android/gms/internal/zzagr;->zzbPG:Lcom/google/android/gms/internal/zzaho;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzago;->zzSy()Lcom/google/android/gms/internal/zzahp;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/internal/zzahp;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v4

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzago;->zzSt()Lcom/google/android/gms/internal/zzahp;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/internal/zzahp;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/internal/zzaho;->zza(Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzahu;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzago;->zzSv()Lcom/google/android/gms/internal/zzahi;

    move-result-object v3

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzago;->zzSt()Lcom/google/android/gms/internal/zzahp;

    move-result-object v0

    invoke-static {v3, v0}, Lcom/google/android/gms/internal/zzago;->zzc(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahp;)Lcom/google/android/gms/internal/zzago;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    sget-object v2, Lcom/google/android/gms/internal/zzagq$zza;->zzbPz:Lcom/google/android/gms/internal/zzagq$zza;

    move-object v0, p0

    move-object v3, p1

    move-object v4, p3

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/zzagr;->zza(Ljava/util/List;Lcom/google/android/gms/internal/zzagq$zza;Ljava/util/List;Ljava/util/List;Lcom/google/android/gms/internal/zzahp;)V

    sget-object v2, Lcom/google/android/gms/internal/zzagq$zza;->zzbPA:Lcom/google/android/gms/internal/zzagq$zza;

    move-object v0, p0

    move-object v3, p1

    move-object v4, p3

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/zzagr;->zza(Ljava/util/List;Lcom/google/android/gms/internal/zzagq$zza;Ljava/util/List;Ljava/util/List;Lcom/google/android/gms/internal/zzahp;)V

    sget-object v2, Lcom/google/android/gms/internal/zzagq$zza;->zzbPB:Lcom/google/android/gms/internal/zzagq$zza;

    move-object v0, p0

    move-object v3, v6

    move-object v4, p3

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/zzagr;->zza(Ljava/util/List;Lcom/google/android/gms/internal/zzagq$zza;Ljava/util/List;Ljava/util/List;Lcom/google/android/gms/internal/zzahp;)V

    sget-object v2, Lcom/google/android/gms/internal/zzagq$zza;->zzbPC:Lcom/google/android/gms/internal/zzagq$zza;

    move-object v0, p0

    move-object v3, p1

    move-object v4, p3

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/zzagr;->zza(Ljava/util/List;Lcom/google/android/gms/internal/zzagq$zza;Ljava/util/List;Ljava/util/List;Lcom/google/android/gms/internal/zzahp;)V

    sget-object v2, Lcom/google/android/gms/internal/zzagq$zza;->zzbPD:Lcom/google/android/gms/internal/zzagq$zza;

    move-object v0, p0

    move-object v3, p1

    move-object v4, p3

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/zzagr;->zza(Ljava/util/List;Lcom/google/android/gms/internal/zzagq$zza;Ljava/util/List;Ljava/util/List;Lcom/google/android/gms/internal/zzahp;)V

    return-object v1
.end method
