.class public Lcom/google/android/gms/internal/zzahk;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/zzahk$a;,
        Lcom/google/android/gms/internal/zzahk$b;,
        Lcom/google/android/gms/internal/zzahk$zzc;
    }
.end annotation


# instance fields
.field private final zzbIH:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzafa;",
            ">;"
        }
    .end annotation
.end field

.field private final zzbII:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Ljava/util/List;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzafa;",
            ">;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Number of posts need to be n-1 for n hashes in CompoundHash"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/internal/zzahk;->zzbIH:Ljava/util/List;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzahk;->zzbII:Ljava/util/List;

    return-void
.end method

.method public static zza(Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzahk$zzc;)Lcom/google/android/gms/internal/zzahk;
    .locals 3

    invoke-interface {p0}, Lcom/google/android/gms/internal/zzahu;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/zzahk;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    const-string v2, ""

    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/zzahk;-><init>(Ljava/util/List;Ljava/util/List;)V

    :goto_0
    return-object v0

    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/zzahk$a;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/zzahk$a;-><init>(Lcom/google/android/gms/internal/zzahk$zzc;)V

    invoke-static {p0, v1}, Lcom/google/android/gms/internal/zzahk;->zza(Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzahk$a;)V

    invoke-static {v1}, Lcom/google/android/gms/internal/zzahk$a;->a(Lcom/google/android/gms/internal/zzahk$a;)V

    new-instance v0, Lcom/google/android/gms/internal/zzahk;

    invoke-static {v1}, Lcom/google/android/gms/internal/zzahk$a;->b(Lcom/google/android/gms/internal/zzahk$a;)Ljava/util/List;

    move-result-object v2

    invoke-static {v1}, Lcom/google/android/gms/internal/zzahk$a;->c(Lcom/google/android/gms/internal/zzahk$a;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Lcom/google/android/gms/internal/zzahk;-><init>(Ljava/util/List;Ljava/util/List;)V

    goto :goto_0
.end method

.method private static zza(Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzahk$a;)V
    .locals 4

    invoke-interface {p0}, Lcom/google/android/gms/internal/zzahu;->zzTo()Z

    move-result v0

    if-eqz v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/zzahr;

    invoke-static {p1, p0}, Lcom/google/android/gms/internal/zzahk$a;->a(Lcom/google/android/gms/internal/zzahk$a;Lcom/google/android/gms/internal/zzahr;)V

    :goto_0
    return-void

    :cond_0
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzahu;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t calculate hash on empty node!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    instance-of v0, p0, Lcom/google/android/gms/internal/zzahj;

    if-nez v0, :cond_2

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x21

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Expected children node, but got: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    check-cast p0, Lcom/google/android/gms/internal/zzahj;

    new-instance v0, Lcom/google/android/gms/internal/zzahk$1;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/zzahk$1;-><init>(Lcom/google/android/gms/internal/zzahk$a;)V

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/zzahj;->zza(Lcom/google/android/gms/internal/zzahj$zza;Z)V

    goto :goto_0
.end method

.method static synthetic zzb(Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzahk$a;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/zzahk;->zza(Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzahk$a;)V

    return-void
.end method

.method public static zzh(Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahk;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/zzahk$b;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/zzahk$b;-><init>(Lcom/google/android/gms/internal/zzahu;)V

    invoke-static {p0, v0}, Lcom/google/android/gms/internal/zzahk;->zza(Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzahk$zzc;)Lcom/google/android/gms/internal/zzahk;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public zzPR()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzafa;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzahk;->zzbIH:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public zzPS()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzahk;->zzbII:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
