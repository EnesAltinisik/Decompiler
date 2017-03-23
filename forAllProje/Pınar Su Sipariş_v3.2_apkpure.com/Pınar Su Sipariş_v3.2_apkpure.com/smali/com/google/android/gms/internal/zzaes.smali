.class public Lcom/google/android/gms/internal/zzaes;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable",
        "<",
        "Ljava/util/Map$Entry",
        "<",
        "Lcom/google/android/gms/internal/zzafa;",
        "Lcom/google/android/gms/internal/zzahu;",
        ">;>;"
    }
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z

.field private static final zzbLf:Lcom/google/android/gms/internal/zzaes;


# instance fields
.field private final zzbLg:Lcom/google/android/gms/internal/zzagi;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzagi",
            "<",
            "Lcom/google/android/gms/internal/zzahu;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-class v0, Lcom/google/android/gms/internal/zzaes;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/google/android/gms/internal/zzaes;->$assertionsDisabled:Z

    new-instance v0, Lcom/google/android/gms/internal/zzaes;

    new-instance v1, Lcom/google/android/gms/internal/zzagi;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/zzagi;-><init>(Ljava/lang/Object;)V

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/zzaes;-><init>(Lcom/google/android/gms/internal/zzagi;)V

    sput-object v0, Lcom/google/android/gms/internal/zzaes;->zzbLf:Lcom/google/android/gms/internal/zzaes;

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private constructor <init>(Lcom/google/android/gms/internal/zzagi;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzagi",
            "<",
            "Lcom/google/android/gms/internal/zzahu;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzaes;->zzbLg:Lcom/google/android/gms/internal/zzagi;

    return-void
.end method

.method public static zzQN()Lcom/google/android/gms/internal/zzaes;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/zzaes;->zzbLf:Lcom/google/android/gms/internal/zzaes;

    return-object v0
.end method

.method private zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzagi;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzafa;",
            "Lcom/google/android/gms/internal/zzagi",
            "<",
            "Lcom/google/android/gms/internal/zzahu;",
            ">;",
            "Lcom/google/android/gms/internal/zzahu;",
            ")",
            "Lcom/google/android/gms/internal/zzahu;"
        }
    .end annotation

    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzagi;->getValue()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzagi;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzahu;

    invoke-interface {p3, p1, v0}, Lcom/google/android/gms/internal/zzahu;->zzl(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v3

    :cond_0
    :goto_0
    return-object v3

    :cond_1
    const/4 v2, 0x0

    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzagi;->zzSp()Lcom/google/android/gms/internal/zzads;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzads;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move-object v3, p3

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/zzagi;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzahi;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzahi;->zzTl()Z

    move-result v5

    if-eqz v5, :cond_3

    sget-boolean v0, Lcom/google/android/gms/internal/zzaes;->$assertionsDisabled:Z

    if-nez v0, :cond_2

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzagi;->getValue()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "Priority writes must always be leaf nodes"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_2
    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzagi;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzahu;

    move-object v1, v3

    :goto_2
    move-object v2, v0

    move-object v3, v1

    goto :goto_1

    :cond_3
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/zzafa;->zza(Lcom/google/android/gms/internal/zzahi;)Lcom/google/android/gms/internal/zzafa;

    move-result-object v0

    invoke-direct {p0, v0, v1, v3}, Lcom/google/android/gms/internal/zzaes;->zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzagi;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    move-object v1, v0

    move-object v0, v2

    goto :goto_2

    :cond_4
    invoke-interface {v3, p1}, Lcom/google/android/gms/internal/zzahu;->zzO(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzahu;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    if-eqz v2, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/zzahi;->zzTj()Lcom/google/android/gms/internal/zzahi;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/zzafa;->zza(Lcom/google/android/gms/internal/zzahi;)Lcom/google/android/gms/internal/zzafa;

    move-result-object v0

    invoke-interface {v3, v0, v2}, Lcom/google/android/gms/internal/zzahu;->zzl(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v3

    goto :goto_0
.end method

.method public static zzax(Ljava/util/Map;)Lcom/google/android/gms/internal/zzaes;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/google/android/gms/internal/zzaes;"
        }
    .end annotation

    invoke-static {}, Lcom/google/android/gms/internal/zzagi;->zzSo()Lcom/google/android/gms/internal/zzagi;

    move-result-object v0

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move-object v1, v0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    new-instance v3, Lcom/google/android/gms/internal/zzagi;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lcom/google/android/gms/internal/zzahv;->zzaq(Ljava/lang/Object;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v4

    invoke-direct {v3, v4}, Lcom/google/android/gms/internal/zzagi;-><init>(Ljava/lang/Object;)V

    new-instance v4, Lcom/google/android/gms/internal/zzafa;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {v4, v0}, Lcom/google/android/gms/internal/zzafa;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4, v3}, Lcom/google/android/gms/internal/zzagi;->zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzagi;)Lcom/google/android/gms/internal/zzagi;

    move-result-object v0

    move-object v1, v0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/zzaes;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/zzaes;-><init>(Lcom/google/android/gms/internal/zzagi;)V

    return-object v0
.end method

.method public static zzay(Ljava/util/Map;)Lcom/google/android/gms/internal/zzaes;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/internal/zzafa;",
            "Lcom/google/android/gms/internal/zzahu;",
            ">;)",
            "Lcom/google/android/gms/internal/zzaes;"
        }
    .end annotation

    invoke-static {}, Lcom/google/android/gms/internal/zzagi;->zzSo()Lcom/google/android/gms/internal/zzagi;

    move-result-object v0

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move-object v2, v0

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    new-instance v4, Lcom/google/android/gms/internal/zzagi;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/zzahu;

    invoke-direct {v4, v1}, Lcom/google/android/gms/internal/zzagi;-><init>(Ljava/lang/Object;)V

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzafa;

    invoke-virtual {v2, v0, v4}, Lcom/google/android/gms/internal/zzagi;->zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzagi;)Lcom/google/android/gms/internal/zzagi;

    move-result-object v0

    move-object v2, v0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/zzaes;

    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/zzaes;-><init>(Lcom/google/android/gms/internal/zzagi;)V

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    :goto_0
    return v0

    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_2

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :cond_2
    check-cast p1, Lcom/google/android/gms/internal/zzaes;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/zzaes;->zzaQ(Z)Ljava/util/Map;

    move-result-object v1

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzaes;->zzaQ(Z)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzaes;->zzaQ(Z)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->hashCode()I

    move-result v0

    return v0
.end method

.method public isEmpty()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaes;->zzbLg:Lcom/google/android/gms/internal/zzagi;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagi;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<",
            "Ljava/util/Map$Entry",
            "<",
            "Lcom/google/android/gms/internal/zzafa;",
            "Lcom/google/android/gms/internal/zzahu;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaes;->zzbLg:Lcom/google/android/gms/internal/zzagi;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagi;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzaes;->zzaQ(Z)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0xf

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "CompoundWrite{"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public zzQO()Lcom/google/android/gms/internal/zzahu;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaes;->zzbLg:Lcom/google/android/gms/internal/zzagi;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagi;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzahu;

    return-object v0
.end method

.method public zzQP()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzaht;",
            ">;"
        }
    .end annotation

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaes;->zzbLg:Lcom/google/android/gms/internal/zzagi;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagi;->getValue()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaes;->zzbLg:Lcom/google/android/gms/internal/zzagi;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagi;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzahu;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzahu;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzaht;

    new-instance v3, Lcom/google/android/gms/internal/zzaht;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaht;->zzTK()Lcom/google/android/gms/internal/zzahi;

    move-result-object v4

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaht;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-direct {v3, v4, v0}, Lcom/google/android/gms/internal/zzaht;-><init>(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzaes;->zzbLg:Lcom/google/android/gms/internal/zzagi;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagi;->zzSp()Lcom/google/android/gms/internal/zzads;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzads;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/zzagi;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzagi;->getValue()Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_1

    new-instance v4, Lcom/google/android/gms/internal/zzaht;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzahi;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzagi;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/zzahu;

    invoke-direct {v4, v0, v1}, Lcom/google/android/gms/internal/zzaht;-><init>(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)V

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    return-object v2
.end method

.method public zzQQ()Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/internal/zzahi;",
            "Lcom/google/android/gms/internal/zzaes;",
            ">;"
        }
    .end annotation

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaes;->zzbLg:Lcom/google/android/gms/internal/zzagi;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagi;->zzSp()Lcom/google/android/gms/internal/zzads;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzads;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/zzahi;

    new-instance v4, Lcom/google/android/gms/internal/zzaes;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzagi;

    invoke-direct {v4, v0}, Lcom/google/android/gms/internal/zzaes;-><init>(Lcom/google/android/gms/internal/zzagi;)V

    invoke-interface {v2, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v2
.end method

.method public zza(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzaes;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/zzafa;

    const/4 v1, 0x1

    new-array v1, v1, [Lcom/google/android/gms/internal/zzahi;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/zzafa;-><init>([Lcom/google/android/gms/internal/zzahi;)V

    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/zzaes;->zze(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzaes;

    move-result-object v0

    return-object v0
.end method

.method public zzaQ(Z)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaes;->zzbLg:Lcom/google/android/gms/internal/zzagi;

    new-instance v2, Lcom/google/android/gms/internal/zzaes$2;

    invoke-direct {v2, p0, v0, p1}, Lcom/google/android/gms/internal/zzaes$2;-><init>(Lcom/google/android/gms/internal/zzaes;Ljava/util/Map;Z)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/zzagi;->zza(Lcom/google/android/gms/internal/zzagi$zza;)V

    return-object v0
.end method

.method public zzb(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzaes;)Lcom/google/android/gms/internal/zzaes;
    .locals 2

    iget-object v0, p2, Lcom/google/android/gms/internal/zzaes;->zzbLg:Lcom/google/android/gms/internal/zzagi;

    new-instance v1, Lcom/google/android/gms/internal/zzaes$1;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/zzaes$1;-><init>(Lcom/google/android/gms/internal/zzaes;Lcom/google/android/gms/internal/zzafa;)V

    invoke-virtual {v0, p0, v1}, Lcom/google/android/gms/internal/zzagi;->zzb(Ljava/lang/Object;Lcom/google/android/gms/internal/zzagi$zza;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzaes;

    return-object v0
.end method

.method public zzb(Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;
    .locals 2

    invoke-static {}, Lcom/google/android/gms/internal/zzafa;->zzRq()Lcom/google/android/gms/internal/zzafa;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaes;->zzbLg:Lcom/google/android/gms/internal/zzagi;

    invoke-direct {p0, v0, v1, p1}, Lcom/google/android/gms/internal/zzaes;->zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzagi;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    return-object v0
.end method

.method public zzd(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzaes;
    .locals 2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafa;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/zzaes;->zzbLf:Lcom/google/android/gms/internal/zzaes;

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzaes;->zzbLg:Lcom/google/android/gms/internal/zzagi;

    invoke-static {}, Lcom/google/android/gms/internal/zzagi;->zzSo()Lcom/google/android/gms/internal/zzagi;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/zzagi;->zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzagi;)Lcom/google/android/gms/internal/zzagi;

    move-result-object v1

    new-instance v0, Lcom/google/android/gms/internal/zzaes;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/zzaes;-><init>(Lcom/google/android/gms/internal/zzagi;)V

    goto :goto_0
.end method

.method public zze(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzaes;
    .locals 4

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafa;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance p0, Lcom/google/android/gms/internal/zzaes;

    new-instance v0, Lcom/google/android/gms/internal/zzagi;

    invoke-direct {v0, p2}, Lcom/google/android/gms/internal/zzagi;-><init>(Ljava/lang/Object;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzaes;-><init>(Lcom/google/android/gms/internal/zzagi;)V

    :cond_0
    :goto_0
    return-object p0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/zzaes;->zzbLg:Lcom/google/android/gms/internal/zzagi;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzagi;->zzG(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzafa;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-static {v1, p1}, Lcom/google/android/gms/internal/zzafa;->zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzafa;

    move-result-object v2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaes;->zzbLg:Lcom/google/android/gms/internal/zzagi;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzagi;->zzK(Lcom/google/android/gms/internal/zzafa;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzahu;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzafa;->zzRw()Lcom/google/android/gms/internal/zzahi;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Lcom/google/android/gms/internal/zzahi;->zzTl()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzafa;->zzRv()Lcom/google/android/gms/internal/zzafa;

    move-result-object v3

    invoke-interface {v0, v3}, Lcom/google/android/gms/internal/zzahu;->zzO(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v3

    invoke-interface {v3}, Lcom/google/android/gms/internal/zzahu;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_0

    :cond_2
    invoke-interface {v0, v2, p2}, Lcom/google/android/gms/internal/zzahu;->zzl(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v2

    new-instance v0, Lcom/google/android/gms/internal/zzaes;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzaes;->zzbLg:Lcom/google/android/gms/internal/zzagi;

    invoke-virtual {v3, v1, v2}, Lcom/google/android/gms/internal/zzagi;->zzb(Lcom/google/android/gms/internal/zzafa;Ljava/lang/Object;)Lcom/google/android/gms/internal/zzagi;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/zzaes;-><init>(Lcom/google/android/gms/internal/zzagi;)V

    move-object p0, v0

    goto :goto_0

    :cond_3
    new-instance v0, Lcom/google/android/gms/internal/zzagi;

    invoke-direct {v0, p2}, Lcom/google/android/gms/internal/zzagi;-><init>(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaes;->zzbLg:Lcom/google/android/gms/internal/zzagi;

    invoke-virtual {v1, p1, v0}, Lcom/google/android/gms/internal/zzagi;->zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzagi;)Lcom/google/android/gms/internal/zzagi;

    move-result-object v0

    new-instance p0, Lcom/google/android/gms/internal/zzaes;

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzaes;-><init>(Lcom/google/android/gms/internal/zzagi;)V

    goto :goto_0
.end method

.method public zze(Lcom/google/android/gms/internal/zzafa;)Z
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzaes;->zzf(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public zzf(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzahu;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaes;->zzbLg:Lcom/google/android/gms/internal/zzagi;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzagi;->zzG(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzafa;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaes;->zzbLg:Lcom/google/android/gms/internal/zzagi;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzagi;->zzK(Lcom/google/android/gms/internal/zzafa;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzahu;

    invoke-static {v1, p1}, Lcom/google/android/gms/internal/zzafa;->zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzafa;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzahu;->zzO(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public zzg(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzaes;
    .locals 2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafa;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    return-object p0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzaes;->zzf(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    if-eqz v0, :cond_1

    new-instance p0, Lcom/google/android/gms/internal/zzaes;

    new-instance v1, Lcom/google/android/gms/internal/zzagi;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/zzagi;-><init>(Ljava/lang/Object;)V

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/zzaes;-><init>(Lcom/google/android/gms/internal/zzagi;)V

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/zzaes;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaes;->zzbLg:Lcom/google/android/gms/internal/zzagi;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/zzagi;->zzI(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzagi;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/zzaes;-><init>(Lcom/google/android/gms/internal/zzagi;)V

    move-object p0, v0

    goto :goto_0
.end method
