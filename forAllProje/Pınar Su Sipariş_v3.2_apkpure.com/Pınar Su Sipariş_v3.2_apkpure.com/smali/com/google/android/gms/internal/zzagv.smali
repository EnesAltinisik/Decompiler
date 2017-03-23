.class public Lcom/google/android/gms/internal/zzagv;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/zzagv$zza;
    }
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z


# instance fields
.field private final zzbPF:Lcom/google/android/gms/internal/zzagu;

.field private final zzbPW:Lcom/google/android/gms/internal/zzagx;

.field private zzbPX:Lcom/google/android/gms/internal/zzagw;

.field private final zzbPY:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzaew;",
            ">;"
        }
    .end annotation
.end field

.field private final zzbPZ:Lcom/google/android/gms/internal/zzagr;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/google/android/gms/internal/zzagv;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/google/android/gms/internal/zzagv;->$assertionsDisabled:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/zzagu;Lcom/google/android/gms/internal/zzagw;)V
    .locals 8

    const/4 v7, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzagv;->zzbPF:Lcom/google/android/gms/internal/zzagu;

    new-instance v0, Lcom/google/android/gms/internal/zzagz;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagu;->zzSK()Lcom/google/android/gms/internal/zzaho;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/zzagz;-><init>(Lcom/google/android/gms/internal/zzaho;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagu;->zzSR()Lcom/google/android/gms/internal/zzagt;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzagt;->zzSQ()Lcom/google/android/gms/internal/zzahb;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/zzagx;

    invoke-direct {v2, v1}, Lcom/google/android/gms/internal/zzagx;-><init>(Lcom/google/android/gms/internal/zzahb;)V

    iput-object v2, p0, Lcom/google/android/gms/internal/zzagv;->zzbPW:Lcom/google/android/gms/internal/zzagx;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzagw;->zzSX()Lcom/google/android/gms/internal/zzagm;

    move-result-object v2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzagw;->zzSV()Lcom/google/android/gms/internal/zzagm;

    move-result-object v3

    invoke-static {}, Lcom/google/android/gms/internal/zzahn;->zzTA()Lcom/google/android/gms/internal/zzahn;

    move-result-object v4

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagu;->zzSK()Lcom/google/android/gms/internal/zzaho;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/google/android/gms/internal/zzahp;->zza(Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzaho;)Lcom/google/android/gms/internal/zzahp;

    move-result-object v4

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzagm;->zzSt()Lcom/google/android/gms/internal/zzahp;

    move-result-object v5

    invoke-virtual {v0, v4, v5, v7}, Lcom/google/android/gms/internal/zzagz;->zza(Lcom/google/android/gms/internal/zzahp;Lcom/google/android/gms/internal/zzahp;Lcom/google/android/gms/internal/zzagy;)Lcom/google/android/gms/internal/zzahp;

    move-result-object v5

    invoke-virtual {v3}, Lcom/google/android/gms/internal/zzagm;->zzSt()Lcom/google/android/gms/internal/zzahp;

    move-result-object v6

    invoke-interface {v1, v4, v6, v7}, Lcom/google/android/gms/internal/zzahb;->zza(Lcom/google/android/gms/internal/zzahp;Lcom/google/android/gms/internal/zzahp;Lcom/google/android/gms/internal/zzagy;)Lcom/google/android/gms/internal/zzahp;

    move-result-object v4

    new-instance v6, Lcom/google/android/gms/internal/zzagm;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzagm;->zzSr()Z

    move-result v2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagz;->zzTb()Z

    move-result v0

    invoke-direct {v6, v5, v2, v0}, Lcom/google/android/gms/internal/zzagm;-><init>(Lcom/google/android/gms/internal/zzahp;ZZ)V

    new-instance v0, Lcom/google/android/gms/internal/zzagm;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/zzagm;->zzSr()Z

    move-result v2

    invoke-interface {v1}, Lcom/google/android/gms/internal/zzahb;->zzTb()Z

    move-result v1

    invoke-direct {v0, v4, v2, v1}, Lcom/google/android/gms/internal/zzagm;-><init>(Lcom/google/android/gms/internal/zzahp;ZZ)V

    new-instance v1, Lcom/google/android/gms/internal/zzagw;

    invoke-direct {v1, v0, v6}, Lcom/google/android/gms/internal/zzagw;-><init>(Lcom/google/android/gms/internal/zzagm;Lcom/google/android/gms/internal/zzagm;)V

    iput-object v1, p0, Lcom/google/android/gms/internal/zzagv;->zzbPX:Lcom/google/android/gms/internal/zzagw;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzagv;->zzbPY:Ljava/util/List;

    new-instance v0, Lcom/google/android/gms/internal/zzagr;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/zzagr;-><init>(Lcom/google/android/gms/internal/zzagu;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzagv;->zzbPZ:Lcom/google/android/gms/internal/zzagr;

    return-void
.end method

.method private zza(Ljava/util/List;Lcom/google/android/gms/internal/zzahp;Lcom/google/android/gms/internal/zzaew;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzago;",
            ">;",
            "Lcom/google/android/gms/internal/zzahp;",
            "Lcom/google/android/gms/internal/zzaew;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzagp;",
            ">;"
        }
    .end annotation

    if-nez p3, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagv;->zzbPY:Ljava/util/List;

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/zzagv;->zzbPZ:Lcom/google/android/gms/internal/zzagr;

    invoke-virtual {v1, p1, p2, v0}, Lcom/google/android/gms/internal/zzagr;->zza(Ljava/util/List;Lcom/google/android/gms/internal/zzahp;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x1

    new-array v0, v0, [Lcom/google/android/gms/internal/zzaew;

    const/4 v1, 0x0

    aput-object p3, v0, v1

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public isEmpty()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagv;->zzbPY:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public zzSS()Lcom/google/android/gms/internal/zzagu;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagv;->zzbPF:Lcom/google/android/gms/internal/zzagu;

    return-object v0
.end method

.method public zzST()Lcom/google/android/gms/internal/zzahu;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagv;->zzbPX:Lcom/google/android/gms/internal/zzagw;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagw;->zzSX()Lcom/google/android/gms/internal/zzagm;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagm;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    return-object v0
.end method

.method public zzSU()Lcom/google/android/gms/internal/zzahu;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagv;->zzbPX:Lcom/google/android/gms/internal/zzagw;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagw;->zzSV()Lcom/google/android/gms/internal/zzagm;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagm;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    return-object v0
.end method

.method public zza(Lcom/google/android/gms/internal/zzaew;Lcom/google/firebase/database/DatabaseError;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzaew;",
            "Lcom/google/firebase/database/DatabaseError;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzagq;",
            ">;"
        }
    .end annotation

    const/4 v3, -0x1

    if-eqz p2, :cond_3

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    sget-boolean v0, Lcom/google/android/gms/internal/zzagv;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    if-eqz p1, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "A cancel should cancel all event registrations"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzagv;->zzbPF:Lcom/google/android/gms/internal/zzagu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagu;->zzPn()Lcom/google/android/gms/internal/zzafa;

    move-result-object v2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagv;->zzbPY:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzaew;

    new-instance v5, Lcom/google/android/gms/internal/zzagn;

    invoke-direct {v5, v0, p2, v2}, Lcom/google/android/gms/internal/zzagn;-><init>(Lcom/google/android/gms/internal/zzaew;Lcom/google/firebase/database/DatabaseError;Lcom/google/android/gms/internal/zzafa;)V

    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    move-object v4, v1

    :goto_1
    if-eqz p1, :cond_6

    const/4 v0, 0x0

    move v1, v0

    move v2, v3

    :goto_2
    iget-object v0, p0, Lcom/google/android/gms/internal/zzagv;->zzbPY:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_8

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagv;->zzbPY:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzaew;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzaew;->zzc(Lcom/google/android/gms/internal/zzaew;)Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaew;->zzRm()Z

    move-result v0

    if-eqz v0, :cond_4

    :goto_3
    if-eq v1, v3, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagv;->zzbPY:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzaew;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzagv;->zzbPY:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaew;->zzRl()V

    :cond_2
    :goto_4
    return-object v4

    :cond_3
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    move-object v4, v0

    goto :goto_1

    :cond_4
    move v2, v1

    :cond_5
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_2

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/zzagv;->zzbPY:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzaew;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaew;->zzRl()V

    goto :goto_5

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/zzagv;->zzbPY:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    goto :goto_4

    :cond_8
    move v1, v2

    goto :goto_3
.end method

.method public zzb(Lcom/google/android/gms/internal/zzafw;Lcom/google/android/gms/internal/zzafr;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzagv$zza;
    .locals 4

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafw;->zzSa()Lcom/google/android/gms/internal/zzafw$zza;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/zzafw$zza;->zzbOq:Lcom/google/android/gms/internal/zzafw$zza;

    if-ne v0, v1, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafw;->zzRZ()Lcom/google/android/gms/internal/zzafx;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzafx;->zzSe()Lcom/google/android/gms/internal/zzagt;

    move-result-object v0

    if-eqz v0, :cond_1

    sget-boolean v0, Lcom/google/android/gms/internal/zzagv;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagv;->zzbPX:Lcom/google/android/gms/internal/zzagw;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagw;->zzSY()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "We should always have a full cache before handling merges"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_0
    sget-boolean v0, Lcom/google/android/gms/internal/zzagv;->$assertionsDisabled:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagv;->zzbPX:Lcom/google/android/gms/internal/zzagw;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagw;->zzSW()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "Missing event cache, even though we have a server cache"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/zzagv;->zzbPX:Lcom/google/android/gms/internal/zzagw;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzagv;->zzbPW:Lcom/google/android/gms/internal/zzagx;

    invoke-virtual {v1, v0, p1, p2, p3}, Lcom/google/android/gms/internal/zzagx;->zza(Lcom/google/android/gms/internal/zzagw;Lcom/google/android/gms/internal/zzafw;Lcom/google/android/gms/internal/zzafr;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzagx$zza;

    move-result-object v1

    sget-boolean v2, Lcom/google/android/gms/internal/zzagv;->$assertionsDisabled:Z

    if-nez v2, :cond_2

    iget-object v2, v1, Lcom/google/android/gms/internal/zzagx$zza;->zzbPX:Lcom/google/android/gms/internal/zzagw;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzagw;->zzSX()Lcom/google/android/gms/internal/zzagm;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzagm;->zzSr()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagw;->zzSX()Lcom/google/android/gms/internal/zzagm;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagm;->zzSr()Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "Once a server snap is complete, it should never go back"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_2
    iget-object v0, v1, Lcom/google/android/gms/internal/zzagx$zza;->zzbPX:Lcom/google/android/gms/internal/zzagw;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzagv;->zzbPX:Lcom/google/android/gms/internal/zzagw;

    iget-object v0, v1, Lcom/google/android/gms/internal/zzagx$zza;->zzbQb:Ljava/util/List;

    iget-object v2, v1, Lcom/google/android/gms/internal/zzagx$zza;->zzbPX:Lcom/google/android/gms/internal/zzagw;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzagw;->zzSV()Lcom/google/android/gms/internal/zzagm;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzagm;->zzSt()Lcom/google/android/gms/internal/zzahp;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {p0, v0, v2, v3}, Lcom/google/android/gms/internal/zzagv;->zza(Ljava/util/List;Lcom/google/android/gms/internal/zzahp;Lcom/google/android/gms/internal/zzaew;)Ljava/util/List;

    move-result-object v0

    new-instance v2, Lcom/google/android/gms/internal/zzagv$zza;

    iget-object v1, v1, Lcom/google/android/gms/internal/zzagx$zza;->zzbQb:Ljava/util/List;

    invoke-direct {v2, v0, v1}, Lcom/google/android/gms/internal/zzagv$zza;-><init>(Ljava/util/List;Ljava/util/List;)V

    return-object v2
.end method

.method public zzb(Lcom/google/android/gms/internal/zzaew;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagv;->zzbPY:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public zzl(Lcom/google/android/gms/internal/zzaew;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzaew;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzagp;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagv;->zzbPX:Lcom/google/android/gms/internal/zzagw;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagw;->zzSV()Lcom/google/android/gms/internal/zzagm;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzagm;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzahu;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzaht;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaht;->zzTK()Lcom/google/android/gms/internal/zzahi;

    move-result-object v4

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaht;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-static {v4, v0}, Lcom/google/android/gms/internal/zzago;->zzc(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzago;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzagm;->zzSr()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzagm;->zzSt()Lcom/google/android/gms/internal/zzahp;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/zzago;->zza(Lcom/google/android/gms/internal/zzahp;)Lcom/google/android/gms/internal/zzago;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzagm;->zzSt()Lcom/google/android/gms/internal/zzahp;

    move-result-object v0

    invoke-direct {p0, v2, v0, p1}, Lcom/google/android/gms/internal/zzagv;->zza(Ljava/util/List;Lcom/google/android/gms/internal/zzahp;Lcom/google/android/gms/internal/zzaew;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public zzs(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzahu;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagv;->zzbPX:Lcom/google/android/gms/internal/zzagw;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagw;->zzSY()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/zzagv;->zzbPF:Lcom/google/android/gms/internal/zzagu;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzagu;->zzSO()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafa;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafa;->zzRt()Lcom/google/android/gms/internal/zzahi;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzahu;->zzm(Lcom/google/android/gms/internal/zzahi;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/internal/zzahu;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/zzahu;->zzO(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
