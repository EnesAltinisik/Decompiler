.class public Lcom/google/android/gms/internal/zzahp;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable",
        "<",
        "Lcom/google/android/gms/internal/zzaht;",
        ">;"
    }
.end annotation


# static fields
.field private static final zzbQW:Lcom/google/android/gms/internal/zzadu;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzadu",
            "<",
            "Lcom/google/android/gms/internal/zzaht;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final zzbPG:Lcom/google/android/gms/internal/zzaho;

.field private final zzbQX:Lcom/google/android/gms/internal/zzahu;

.field private zzbQY:Lcom/google/android/gms/internal/zzadu;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzadu",
            "<",
            "Lcom/google/android/gms/internal/zzaht;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/zzadu;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/zzadu;-><init>(Ljava/util/List;Ljava/util/Comparator;)V

    sput-object v0, Lcom/google/android/gms/internal/zzahp;->zzbQW:Lcom/google/android/gms/internal/zzadu;

    return-void
.end method

.method private constructor <init>(Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzaho;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/zzahp;->zzbPG:Lcom/google/android/gms/internal/zzaho;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzahp;->zzbQX:Lcom/google/android/gms/internal/zzahu;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzahp;->zzbQY:Lcom/google/android/gms/internal/zzadu;

    return-void
.end method

.method private constructor <init>(Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzaho;Lcom/google/android/gms/internal/zzadu;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzahu;",
            "Lcom/google/android/gms/internal/zzaho;",
            "Lcom/google/android/gms/internal/zzadu",
            "<",
            "Lcom/google/android/gms/internal/zzaht;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/zzahp;->zzbPG:Lcom/google/android/gms/internal/zzaho;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzahp;->zzbQX:Lcom/google/android/gms/internal/zzahu;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzahp;->zzbQY:Lcom/google/android/gms/internal/zzadu;

    return-void
.end method

.method private zzTE()V
    .locals 7

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzahp;->zzbQY:Lcom/google/android/gms/internal/zzadu;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzahp;->zzbPG:Lcom/google/android/gms/internal/zzaho;

    invoke-static {}, Lcom/google/android/gms/internal/zzahq;->zzTH()Lcom/google/android/gms/internal/zzahq;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/google/android/gms/internal/zzahp;->zzbQW:Lcom/google/android/gms/internal/zzadu;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzahp;->zzbQY:Lcom/google/android/gms/internal/zzadu;

    :cond_0
    :goto_0
    return-void

    :cond_1
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzahp;->zzbQX:Lcom/google/android/gms/internal/zzahu;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzahu;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v1, v2

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzaht;

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/zzahp;->zzbPG:Lcom/google/android/gms/internal/zzaho;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaht;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/google/android/gms/internal/zzaho;->zzl(Lcom/google/android/gms/internal/zzahu;)Z

    move-result v1

    if-eqz v1, :cond_3

    :cond_2
    const/4 v1, 0x1

    :goto_2
    new-instance v5, Lcom/google/android/gms/internal/zzaht;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaht;->zzTK()Lcom/google/android/gms/internal/zzahi;

    move-result-object v6

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaht;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-direct {v5, v6, v0}, Lcom/google/android/gms/internal/zzaht;-><init>(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)V

    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    move v1, v2

    goto :goto_2

    :cond_4
    if-eqz v1, :cond_5

    new-instance v0, Lcom/google/android/gms/internal/zzadu;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzahp;->zzbPG:Lcom/google/android/gms/internal/zzaho;

    invoke-direct {v0, v3, v1}, Lcom/google/android/gms/internal/zzadu;-><init>(Ljava/util/List;Ljava/util/Comparator;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzahp;->zzbQY:Lcom/google/android/gms/internal/zzadu;

    goto :goto_0

    :cond_5
    sget-object v0, Lcom/google/android/gms/internal/zzahp;->zzbQW:Lcom/google/android/gms/internal/zzadu;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzahp;->zzbQY:Lcom/google/android/gms/internal/zzadu;

    goto :goto_0
.end method

.method public static zza(Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzaho;)Lcom/google/android/gms/internal/zzahp;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/zzahp;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/zzahp;-><init>(Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzaho;)V

    return-object v0
.end method

.method public static zzm(Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahp;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/zzahp;

    invoke-static {}, Lcom/google/android/gms/internal/zzahx;->zzTL()Lcom/google/android/gms/internal/zzahx;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/zzahp;-><init>(Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzaho;)V

    return-object v0
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<",
            "Lcom/google/android/gms/internal/zzaht;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzahp;->zzTE()V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzahp;->zzbQY:Lcom/google/android/gms/internal/zzadu;

    sget-object v1, Lcom/google/android/gms/internal/zzahp;->zzbQW:Lcom/google/android/gms/internal/zzadu;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzahp;->zzbQX:Lcom/google/android/gms/internal/zzahu;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzahu;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzahp;->zzbQY:Lcom/google/android/gms/internal/zzadu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzadu;->iterator()Ljava/util/Iterator;

    move-result-object v0

    goto :goto_0
.end method

.method public zzPj()Lcom/google/android/gms/internal/zzahu;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzahp;->zzbQX:Lcom/google/android/gms/internal/zzahu;

    return-object v0
.end method

.method public zzPw()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<",
            "Lcom/google/android/gms/internal/zzaht;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzahp;->zzTE()V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzahp;->zzbQY:Lcom/google/android/gms/internal/zzadu;

    sget-object v1, Lcom/google/android/gms/internal/zzahp;->zzbQW:Lcom/google/android/gms/internal/zzadu;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzahp;->zzbQX:Lcom/google/android/gms/internal/zzahu;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzahu;->zzPw()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzahp;->zzbQY:Lcom/google/android/gms/internal/zzadu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzadu;->zzPw()Ljava/util/Iterator;

    move-result-object v0

    goto :goto_0
.end method

.method public zzTF()Lcom/google/android/gms/internal/zzaht;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzahp;->zzbQX:Lcom/google/android/gms/internal/zzahu;

    instance-of v0, v0, Lcom/google/android/gms/internal/zzahj;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/zzahp;->zzTE()V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzahp;->zzbQY:Lcom/google/android/gms/internal/zzadu;

    sget-object v1, Lcom/google/android/gms/internal/zzahp;->zzbQW:Lcom/google/android/gms/internal/zzadu;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzahp;->zzbQX:Lcom/google/android/gms/internal/zzahu;

    check-cast v0, Lcom/google/android/gms/internal/zzahj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzahj;->zzTq()Lcom/google/android/gms/internal/zzahi;

    move-result-object v1

    new-instance v0, Lcom/google/android/gms/internal/zzaht;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzahp;->zzbQX:Lcom/google/android/gms/internal/zzahu;

    invoke-interface {v2, v1}, Lcom/google/android/gms/internal/zzahu;->zzm(Lcom/google/android/gms/internal/zzahi;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/zzaht;-><init>(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/zzahp;->zzbQY:Lcom/google/android/gms/internal/zzadu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzadu;->zzPz()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzaht;

    goto :goto_0
.end method

.method public zzTG()Lcom/google/android/gms/internal/zzaht;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzahp;->zzbQX:Lcom/google/android/gms/internal/zzahu;

    instance-of v0, v0, Lcom/google/android/gms/internal/zzahj;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/zzahp;->zzTE()V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzahp;->zzbQY:Lcom/google/android/gms/internal/zzadu;

    sget-object v1, Lcom/google/android/gms/internal/zzahp;->zzbQW:Lcom/google/android/gms/internal/zzadu;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzahp;->zzbQX:Lcom/google/android/gms/internal/zzahu;

    check-cast v0, Lcom/google/android/gms/internal/zzahj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzahj;->zzTr()Lcom/google/android/gms/internal/zzahi;

    move-result-object v1

    new-instance v0, Lcom/google/android/gms/internal/zzaht;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzahp;->zzbQX:Lcom/google/android/gms/internal/zzahu;

    invoke-interface {v2, v1}, Lcom/google/android/gms/internal/zzahu;->zzm(Lcom/google/android/gms/internal/zzahi;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/zzaht;-><init>(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/zzahp;->zzbQY:Lcom/google/android/gms/internal/zzadu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzadu;->zzPA()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzaht;

    goto :goto_0
.end method

.method public zza(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzaho;)Lcom/google/android/gms/internal/zzahi;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzahp;->zzbPG:Lcom/google/android/gms/internal/zzaho;

    invoke-static {}, Lcom/google/android/gms/internal/zzahq;->zzTH()Lcom/google/android/gms/internal/zzahq;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzahp;->zzbPG:Lcom/google/android/gms/internal/zzaho;

    invoke-virtual {v0, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Index not available in IndexedNode!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/zzahp;->zzTE()V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzahp;->zzbQY:Lcom/google/android/gms/internal/zzadu;

    sget-object v1, Lcom/google/android/gms/internal/zzahp;->zzbQW:Lcom/google/android/gms/internal/zzadu;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzahp;->zzbQX:Lcom/google/android/gms/internal/zzahu;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/zzahu;->zzl(Lcom/google/android/gms/internal/zzahi;)Lcom/google/android/gms/internal/zzahi;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/zzahp;->zzbQY:Lcom/google/android/gms/internal/zzadu;

    new-instance v1, Lcom/google/android/gms/internal/zzaht;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/internal/zzaht;-><init>(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzadu;->zzak(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzaht;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaht;->zzTK()Lcom/google/android/gms/internal/zzahi;

    move-result-object v0

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public zzb(Lcom/google/android/gms/internal/zzaho;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzahp;->zzbPG:Lcom/google/android/gms/internal/zzaho;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public zzh(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahp;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzahp;->zzbQX:Lcom/google/android/gms/internal/zzahu;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/zzahu;->zze(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzahp;->zzbQY:Lcom/google/android/gms/internal/zzadu;

    sget-object v1, Lcom/google/android/gms/internal/zzahp;->zzbQW:Lcom/google/android/gms/internal/zzadu;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzahp;->zzbPG:Lcom/google/android/gms/internal/zzaho;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/zzaho;->zzl(Lcom/google/android/gms/internal/zzahu;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/zzahp;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzahp;->zzbPG:Lcom/google/android/gms/internal/zzaho;

    sget-object v3, Lcom/google/android/gms/internal/zzahp;->zzbQW:Lcom/google/android/gms/internal/zzadu;

    invoke-direct {v0, v2, v1, v3}, Lcom/google/android/gms/internal/zzahp;-><init>(Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzaho;Lcom/google/android/gms/internal/zzadu;)V

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzahp;->zzbQY:Lcom/google/android/gms/internal/zzadu;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzahp;->zzbQY:Lcom/google/android/gms/internal/zzadu;

    sget-object v1, Lcom/google/android/gms/internal/zzahp;->zzbQW:Lcom/google/android/gms/internal/zzadu;

    if-ne v0, v1, :cond_2

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/zzahp;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzahp;->zzbPG:Lcom/google/android/gms/internal/zzaho;

    const/4 v3, 0x0

    invoke-direct {v0, v2, v1, v3}, Lcom/google/android/gms/internal/zzahp;-><init>(Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzaho;Lcom/google/android/gms/internal/zzadu;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/zzahp;->zzbQX:Lcom/google/android/gms/internal/zzahu;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/zzahu;->zzm(Lcom/google/android/gms/internal/zzahi;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzahp;->zzbQY:Lcom/google/android/gms/internal/zzadu;

    new-instance v3, Lcom/google/android/gms/internal/zzaht;

    invoke-direct {v3, p1, v0}, Lcom/google/android/gms/internal/zzaht;-><init>(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)V

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/zzadu;->zzai(Ljava/lang/Object;)Lcom/google/android/gms/internal/zzadu;

    move-result-object v0

    invoke-interface {p2}, Lcom/google/android/gms/internal/zzahu;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    new-instance v1, Lcom/google/android/gms/internal/zzaht;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/internal/zzaht;-><init>(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzadu;->zzaj(Ljava/lang/Object;)Lcom/google/android/gms/internal/zzadu;

    move-result-object v0

    :cond_3
    new-instance v1, Lcom/google/android/gms/internal/zzahp;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzahp;->zzbPG:Lcom/google/android/gms/internal/zzaho;

    invoke-direct {v1, v2, v3, v0}, Lcom/google/android/gms/internal/zzahp;-><init>(Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzaho;Lcom/google/android/gms/internal/zzadu;)V

    move-object v0, v1

    goto :goto_0
.end method

.method public zzn(Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahp;
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/zzahp;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzahp;->zzbQX:Lcom/google/android/gms/internal/zzahu;

    invoke-interface {v1, p1}, Lcom/google/android/gms/internal/zzahu;->zzf(Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzahp;->zzbPG:Lcom/google/android/gms/internal/zzaho;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzahp;->zzbQY:Lcom/google/android/gms/internal/zzadu;

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/internal/zzahp;-><init>(Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzaho;Lcom/google/android/gms/internal/zzadu;)V

    return-object v0
.end method
