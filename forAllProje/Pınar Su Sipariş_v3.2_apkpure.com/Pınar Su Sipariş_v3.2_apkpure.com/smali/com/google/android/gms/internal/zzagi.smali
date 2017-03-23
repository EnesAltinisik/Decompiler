.class public Lcom/google/android/gms/internal/zzagi;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/zzagi$zza;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable",
        "<",
        "Ljava/util/Map$Entry",
        "<",
        "Lcom/google/android/gms/internal/zzafa;",
        "TT;>;>;"
    }
.end annotation


# static fields
.field private static final zzbPd:Lcom/google/android/gms/internal/zzads;

.field private static final zzbPe:Lcom/google/android/gms/internal/zzagi;


# instance fields
.field private final zzbIu:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private final zzbPc:Lcom/google/android/gms/internal/zzads;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzads",
            "<",
            "Lcom/google/android/gms/internal/zzahi;",
            "Lcom/google/android/gms/internal/zzagi",
            "<TT;>;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-class v0, Lcom/google/android/gms/internal/zzahi;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzaeb;->zzi(Ljava/lang/Class;)Lcom/google/android/gms/internal/zzaeb;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/zzads$zza;->zza(Ljava/util/Comparator;)Lcom/google/android/gms/internal/zzads;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/zzagi;->zzbPd:Lcom/google/android/gms/internal/zzads;

    new-instance v0, Lcom/google/android/gms/internal/zzagi;

    const/4 v1, 0x0

    sget-object v2, Lcom/google/android/gms/internal/zzagi;->zzbPd:Lcom/google/android/gms/internal/zzads;

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/zzagi;-><init>(Ljava/lang/Object;Lcom/google/android/gms/internal/zzads;)V

    sput-object v0, Lcom/google/android/gms/internal/zzagi;->zzbPe:Lcom/google/android/gms/internal/zzagi;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/zzagi;->zzbPd:Lcom/google/android/gms/internal/zzads;

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/zzagi;-><init>(Ljava/lang/Object;Lcom/google/android/gms/internal/zzads;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Lcom/google/android/gms/internal/zzads;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lcom/google/android/gms/internal/zzads",
            "<",
            "Lcom/google/android/gms/internal/zzahi;",
            "Lcom/google/android/gms/internal/zzagi",
            "<TT;>;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzagi;->zzbIu:Ljava/lang/Object;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzagi;->zzbPc:Lcom/google/android/gms/internal/zzads;

    return-void
.end method

.method public static zzSo()Lcom/google/android/gms/internal/zzagi;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/google/android/gms/internal/zzagi",
            "<TV;>;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/zzagi;->zzbPe:Lcom/google/android/gms/internal/zzagi;

    return-object v0
.end method

.method private zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzagi$zza;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/zzafa;",
            "Lcom/google/android/gms/internal/zzagi$zza",
            "<-TT;TR;>;TR;)TR;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagi;->zzbPc:Lcom/google/android/gms/internal/zzads;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzads;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/zzagi;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzahi;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/zzafa;->zza(Lcom/google/android/gms/internal/zzahi;)Lcom/google/android/gms/internal/zzafa;

    move-result-object v0

    invoke-direct {v1, v0, p2, p3}, Lcom/google/android/gms/internal/zzagi;->zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzagi$zza;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzagi;->zzbIu:Ljava/lang/Object;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagi;->zzbIu:Ljava/lang/Object;

    invoke-interface {p2, p1, v0, p3}, Lcom/google/android/gms/internal/zzagi$zza;->zza(Lcom/google/android/gms/internal/zzafa;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    :cond_1
    return-object p3
.end method


# virtual methods
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
    check-cast p1, Lcom/google/android/gms/internal/zzagi;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzagi;->zzbPc:Lcom/google/android/gms/internal/zzads;

    if-eqz v2, :cond_5

    iget-object v2, p0, Lcom/google/android/gms/internal/zzagi;->zzbPc:Lcom/google/android/gms/internal/zzads;

    iget-object v3, p1, Lcom/google/android/gms/internal/zzagi;->zzbPc:Lcom/google/android/gms/internal/zzads;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/zzads;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    :cond_4
    move v0, v1

    goto :goto_0

    :cond_5
    iget-object v2, p1, Lcom/google/android/gms/internal/zzagi;->zzbPc:Lcom/google/android/gms/internal/zzads;

    if-nez v2, :cond_4

    :cond_6
    iget-object v2, p0, Lcom/google/android/gms/internal/zzagi;->zzbIu:Ljava/lang/Object;

    if-eqz v2, :cond_7

    iget-object v2, p0, Lcom/google/android/gms/internal/zzagi;->zzbIu:Ljava/lang/Object;

    iget-object v3, p1, Lcom/google/android/gms/internal/zzagi;->zzbIu:Ljava/lang/Object;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    :goto_1
    move v0, v1

    goto :goto_0

    :cond_7
    iget-object v2, p1, Lcom/google/android/gms/internal/zzagi;->zzbIu:Ljava/lang/Object;

    if-eqz v2, :cond_0

    goto :goto_1
.end method

.method public getValue()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagi;->zzbIu:Ljava/lang/Object;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagi;->zzbIu:Ljava/lang/Object;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagi;->zzbIu:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/google/android/gms/internal/zzagi;->zzbPc:Lcom/google/android/gms/internal/zzads;

    if-eqz v2, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzagi;->zzbPc:Lcom/google/android/gms/internal/zzads;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzads;->hashCode()I

    move-result v1

    :cond_0
    add-int/2addr v0, v1

    return v0

    :cond_1
    move v0, v1

    goto :goto_0
.end method

.method public isEmpty()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagi;->zzbIu:Ljava/lang/Object;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagi;->zzbPc:Lcom/google/android/gms/internal/zzads;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzads;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<",
            "Ljava/util/Map$Entry",
            "<",
            "Lcom/google/android/gms/internal/zzafa;",
            "TT;>;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/zzagi$2;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/zzagi$2;-><init>(Lcom/google/android/gms/internal/zzagi;Ljava/util/List;)V

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/zzagi;->zza(Lcom/google/android/gms/internal/zzagi$zza;)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "ImmutableTree { value="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzagi;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", children={"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagi;->zzbPc:Lcom/google/android/gms/internal/zzads;

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

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzahi;->asString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "="

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    const-string v0, "} }"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public values()Ljava/util/Collection;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection",
            "<TT;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/zzagi$1;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/zzagi$1;-><init>(Lcom/google/android/gms/internal/zzagi;Ljava/util/ArrayList;)V

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/zzagi;->zza(Lcom/google/android/gms/internal/zzagi$zza;)V

    return-object v0
.end method

.method public zzG(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzafa;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/zzagj;->zzbPh:Lcom/google/android/gms/internal/zzagj;

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/zzagi;->zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzagj;)Lcom/google/android/gms/internal/zzafa;

    move-result-object v0

    return-object v0
.end method

.method public zzH(Lcom/google/android/gms/internal/zzafa;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzafa;",
            ")TT;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/zzagj;->zzbPh:Lcom/google/android/gms/internal/zzagj;

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/zzagi;->zzc(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzagj;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public zzI(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzagi;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzafa;",
            ")",
            "Lcom/google/android/gms/internal/zzagi",
            "<TT;>;"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafa;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    return-object p0

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafa;->zzRt()Lcom/google/android/gms/internal/zzahi;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzagi;->zzbPc:Lcom/google/android/gms/internal/zzads;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zzads;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzagi;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafa;->zzRu()Lcom/google/android/gms/internal/zzafa;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzagi;->zzI(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzagi;

    move-result-object p0

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/zzagi;->zzSo()Lcom/google/android/gms/internal/zzagi;

    move-result-object p0

    goto :goto_0
.end method

.method public zzJ(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzagi;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzafa;",
            ")",
            "Lcom/google/android/gms/internal/zzagi",
            "<TT;>;"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafa;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagi;->zzbPc:Lcom/google/android/gms/internal/zzads;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzads;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/google/android/gms/internal/zzagi;->zzSo()Lcom/google/android/gms/internal/zzagi;

    move-result-object p0

    :cond_0
    :goto_0
    return-object p0

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/zzagi;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/google/android/gms/internal/zzagi;->zzbPc:Lcom/google/android/gms/internal/zzads;

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/zzagi;-><init>(Ljava/lang/Object;Lcom/google/android/gms/internal/zzads;)V

    move-object p0, v0

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafa;->zzRt()Lcom/google/android/gms/internal/zzahi;

    move-result-object v1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagi;->zzbPc:Lcom/google/android/gms/internal/zzads;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzads;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzagi;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafa;->zzRu()Lcom/google/android/gms/internal/zzafa;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/zzagi;->zzJ(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzagi;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagi;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagi;->zzbPc:Lcom/google/android/gms/internal/zzads;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzads;->zzad(Ljava/lang/Object;)Lcom/google/android/gms/internal/zzads;

    move-result-object v0

    :goto_1
    iget-object v1, p0, Lcom/google/android/gms/internal/zzagi;->zzbIu:Ljava/lang/Object;

    if-nez v1, :cond_4

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzads;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {}, Lcom/google/android/gms/internal/zzagi;->zzSo()Lcom/google/android/gms/internal/zzagi;

    move-result-object p0

    goto :goto_0

    :cond_3
    iget-object v2, p0, Lcom/google/android/gms/internal/zzagi;->zzbPc:Lcom/google/android/gms/internal/zzads;

    invoke-virtual {v2, v1, v0}, Lcom/google/android/gms/internal/zzads;->zzj(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/zzads;

    move-result-object v0

    goto :goto_1

    :cond_4
    new-instance v1, Lcom/google/android/gms/internal/zzagi;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzagi;->zzbIu:Ljava/lang/Object;

    invoke-direct {v1, v2, v0}, Lcom/google/android/gms/internal/zzagi;-><init>(Ljava/lang/Object;Lcom/google/android/gms/internal/zzads;)V

    move-object p0, v1

    goto :goto_0
.end method

.method public zzK(Lcom/google/android/gms/internal/zzafa;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzafa;",
            ")TT;"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafa;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagi;->zzbIu:Ljava/lang/Object;

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafa;->zzRt()Lcom/google/android/gms/internal/zzahi;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzagi;->zzbPc:Lcom/google/android/gms/internal/zzads;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zzads;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzagi;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafa;->zzRu()Lcom/google/android/gms/internal/zzafa;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzagi;->zzK(Lcom/google/android/gms/internal/zzafa;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public zzSp()Lcom/google/android/gms/internal/zzads;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/zzads",
            "<",
            "Lcom/google/android/gms/internal/zzahi;",
            "Lcom/google/android/gms/internal/zzagi",
            "<TT;>;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagi;->zzbPc:Lcom/google/android/gms/internal/zzads;

    return-object v0
.end method

.method public zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzagj;)Lcom/google/android/gms/internal/zzafa;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzafa;",
            "Lcom/google/android/gms/internal/zzagj",
            "<-TT;>;)",
            "Lcom/google/android/gms/internal/zzafa;"
        }
    .end annotation

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagi;->zzbIu:Ljava/lang/Object;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagi;->zzbIu:Ljava/lang/Object;

    invoke-interface {p2, v0}, Lcom/google/android/gms/internal/zzagj;->zzap(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/zzafa;->zzRq()Lcom/google/android/gms/internal/zzafa;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafa;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    move-object v0, v1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafa;->zzRt()Lcom/google/android/gms/internal/zzahi;

    move-result-object v2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagi;->zzbPc:Lcom/google/android/gms/internal/zzads;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/zzads;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzagi;

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafa;->zzRu()Lcom/google/android/gms/internal/zzafa;

    move-result-object v3

    invoke-virtual {v0, v3, p2}, Lcom/google/android/gms/internal/zzagi;->zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzagj;)Lcom/google/android/gms/internal/zzafa;

    move-result-object v0

    if-eqz v0, :cond_2

    new-instance v1, Lcom/google/android/gms/internal/zzafa;

    const/4 v3, 0x1

    new-array v3, v3, [Lcom/google/android/gms/internal/zzahi;

    const/4 v4, 0x0

    aput-object v2, v3, v4

    invoke-direct {v1, v3}, Lcom/google/android/gms/internal/zzafa;-><init>([Lcom/google/android/gms/internal/zzahi;)V

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zzafa;->zzh(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzafa;

    move-result-object v0

    goto :goto_0

    :cond_2
    move-object v0, v1

    goto :goto_0

    :cond_3
    move-object v0, v1

    goto :goto_0
.end method

.method public zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzagi;)Lcom/google/android/gms/internal/zzagi;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzafa;",
            "Lcom/google/android/gms/internal/zzagi",
            "<TT;>;)",
            "Lcom/google/android/gms/internal/zzagi",
            "<TT;>;"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafa;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    return-object p2

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafa;->zzRt()Lcom/google/android/gms/internal/zzahi;

    move-result-object v1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagi;->zzbPc:Lcom/google/android/gms/internal/zzads;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzads;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzagi;

    if-nez v0, :cond_1

    invoke-static {}, Lcom/google/android/gms/internal/zzagi;->zzSo()Lcom/google/android/gms/internal/zzagi;

    move-result-object v0

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafa;->zzRu()Lcom/google/android/gms/internal/zzafa;

    move-result-object v2

    invoke-virtual {v0, v2, p2}, Lcom/google/android/gms/internal/zzagi;->zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzagi;)Lcom/google/android/gms/internal/zzagi;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagi;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagi;->zzbPc:Lcom/google/android/gms/internal/zzads;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzads;->zzad(Ljava/lang/Object;)Lcom/google/android/gms/internal/zzads;

    move-result-object v0

    :goto_1
    new-instance p2, Lcom/google/android/gms/internal/zzagi;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzagi;->zzbIu:Ljava/lang/Object;

    invoke-direct {p2, v1, v0}, Lcom/google/android/gms/internal/zzagi;-><init>(Ljava/lang/Object;Lcom/google/android/gms/internal/zzads;)V

    goto :goto_0

    :cond_2
    iget-object v2, p0, Lcom/google/android/gms/internal/zzagi;->zzbPc:Lcom/google/android/gms/internal/zzads;

    invoke-virtual {v2, v1, v0}, Lcom/google/android/gms/internal/zzads;->zzj(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/zzads;

    move-result-object v0

    goto :goto_1
.end method

.method public zza(Lcom/google/android/gms/internal/zzagi$zza;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzagi$zza",
            "<TT;",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    invoke-static {}, Lcom/google/android/gms/internal/zzafa;->zzRq()Lcom/google/android/gms/internal/zzafa;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, v1}, Lcom/google/android/gms/internal/zzagi;->zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzagi$zza;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public zzb(Lcom/google/android/gms/internal/zzafa;Ljava/lang/Object;)Lcom/google/android/gms/internal/zzagi;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzafa;",
            "TT;)",
            "Lcom/google/android/gms/internal/zzagi",
            "<TT;>;"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafa;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/zzagi;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzagi;->zzbPc:Lcom/google/android/gms/internal/zzads;

    invoke-direct {v0, p2, v1}, Lcom/google/android/gms/internal/zzagi;-><init>(Ljava/lang/Object;Lcom/google/android/gms/internal/zzads;)V

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafa;->zzRt()Lcom/google/android/gms/internal/zzahi;

    move-result-object v1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagi;->zzbPc:Lcom/google/android/gms/internal/zzads;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzads;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzagi;

    if-nez v0, :cond_1

    invoke-static {}, Lcom/google/android/gms/internal/zzagi;->zzSo()Lcom/google/android/gms/internal/zzagi;

    move-result-object v0

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafa;->zzRu()Lcom/google/android/gms/internal/zzafa;

    move-result-object v2

    invoke-virtual {v0, v2, p2}, Lcom/google/android/gms/internal/zzagi;->zzb(Lcom/google/android/gms/internal/zzafa;Ljava/lang/Object;)Lcom/google/android/gms/internal/zzagi;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/internal/zzagi;->zzbPc:Lcom/google/android/gms/internal/zzads;

    invoke-virtual {v2, v1, v0}, Lcom/google/android/gms/internal/zzads;->zzj(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/zzads;

    move-result-object v1

    new-instance v0, Lcom/google/android/gms/internal/zzagi;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzagi;->zzbIu:Ljava/lang/Object;

    invoke-direct {v0, v2, v1}, Lcom/google/android/gms/internal/zzagi;-><init>(Ljava/lang/Object;Lcom/google/android/gms/internal/zzads;)V

    goto :goto_0
.end method

.method public zzb(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzagj;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzafa;",
            "Lcom/google/android/gms/internal/zzagj",
            "<-TT;>;)TT;"
        }
    .end annotation

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagi;->zzbIu:Ljava/lang/Object;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagi;->zzbIu:Ljava/lang/Object;

    invoke-interface {p2, v0}, Lcom/google/android/gms/internal/zzagj;->zzap(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagi;->zzbIu:Ljava/lang/Object;

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafa;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzahi;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzagi;->zzbPc:Lcom/google/android/gms/internal/zzads;

    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/zzads;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzagi;

    if-nez v0, :cond_1

    move-object v0, v1

    goto :goto_0

    :cond_1
    iget-object v3, v0, Lcom/google/android/gms/internal/zzagi;->zzbIu:Ljava/lang/Object;

    if-eqz v3, :cond_2

    iget-object v3, v0, Lcom/google/android/gms/internal/zzagi;->zzbIu:Ljava/lang/Object;

    invoke-interface {p2, v3}, Lcom/google/android/gms/internal/zzagj;->zzap(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v0, v0, Lcom/google/android/gms/internal/zzagi;->zzbIu:Ljava/lang/Object;

    goto :goto_0

    :cond_2
    move-object p0, v0

    goto :goto_1

    :cond_3
    move-object v0, v1

    goto :goto_0
.end method

.method public zzb(Ljava/lang/Object;Lcom/google/android/gms/internal/zzagi$zza;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(TR;",
            "Lcom/google/android/gms/internal/zzagi$zza",
            "<-TT;TR;>;)TR;"
        }
    .end annotation

    invoke-static {}, Lcom/google/android/gms/internal/zzafa;->zzRq()Lcom/google/android/gms/internal/zzafa;

    move-result-object v0

    invoke-direct {p0, v0, p2, p1}, Lcom/google/android/gms/internal/zzagi;->zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzagi$zza;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public zzb(Lcom/google/android/gms/internal/zzagj;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzagj",
            "<-TT;>;)Z"
        }
    .end annotation

    const/4 v1, 0x1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagi;->zzbIu:Ljava/lang/Object;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagi;->zzbIu:Ljava/lang/Object;

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/zzagj;->zzap(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzagi;->zzbPc:Lcom/google/android/gms/internal/zzads;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzads;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzagi;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzagi;->zzb(Lcom/google/android/gms/internal/zzagj;)Z

    move-result v0

    if-eqz v0, :cond_1

    move v0, v1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public zzc(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzagj;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzafa;",
            "Lcom/google/android/gms/internal/zzagj",
            "<-TT;>;)TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagi;->zzbIu:Ljava/lang/Object;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagi;->zzbIu:Ljava/lang/Object;

    invoke-interface {p2, v0}, Lcom/google/android/gms/internal/zzagj;->zzap(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagi;->zzbIu:Ljava/lang/Object;

    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafa;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move-object v1, v0

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzahi;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzagi;->zzbPc:Lcom/google/android/gms/internal/zzads;

    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/zzads;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzagi;

    if-nez v0, :cond_2

    :cond_0
    return-object v1

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :cond_2
    iget-object v3, v0, Lcom/google/android/gms/internal/zzagi;->zzbIu:Ljava/lang/Object;

    if-eqz v3, :cond_3

    iget-object v3, v0, Lcom/google/android/gms/internal/zzagi;->zzbIu:Ljava/lang/Object;

    invoke-interface {p2, v3}, Lcom/google/android/gms/internal/zzagj;->zzap(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    iget-object v1, v0, Lcom/google/android/gms/internal/zzagi;->zzbIu:Ljava/lang/Object;

    :cond_3
    move-object p0, v0

    goto :goto_1
.end method

.method public zze(Lcom/google/android/gms/internal/zzahi;)Lcom/google/android/gms/internal/zzagi;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzahi;",
            ")",
            "Lcom/google/android/gms/internal/zzagi",
            "<TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagi;->zzbPc:Lcom/google/android/gms/internal/zzads;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzads;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzagi;

    if-eqz v0, :cond_0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/zzagi;->zzSo()Lcom/google/android/gms/internal/zzagi;

    move-result-object v0

    goto :goto_0
.end method
