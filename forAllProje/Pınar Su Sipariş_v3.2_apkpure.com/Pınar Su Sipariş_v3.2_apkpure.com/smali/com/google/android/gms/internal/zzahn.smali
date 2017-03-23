.class public Lcom/google/android/gms/internal/zzahn;
.super Lcom/google/android/gms/internal/zzahj;

# interfaces
.implements Lcom/google/android/gms/internal/zzahu;


# static fields
.field private static final zzbQV:Lcom/google/android/gms/internal/zzahn;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/zzahn;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzahn;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/zzahn;->zzbQV:Lcom/google/android/gms/internal/zzahn;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzahj;-><init>()V

    return-void
.end method

.method public static zzTA()Lcom/google/android/gms/internal/zzahn;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/zzahn;->zzbQV:Lcom/google/android/gms/internal/zzahn;

    return-object v0
.end method


# virtual methods
.method public synthetic compareTo(Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/zzahu;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzahn;->zzg(Lcom/google/android/gms/internal/zzahu;)I

    move-result v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v1, 0x1

    instance-of v0, p1, Lcom/google/android/gms/internal/zzahn;

    if-eqz v0, :cond_0

    :goto_0
    return v1

    :cond_0
    instance-of v0, p1, Lcom/google/android/gms/internal/zzahu;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/zzahu;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzahu;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzahn;->zzTp()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    check-cast p1, Lcom/google/android/gms/internal/zzahu;

    invoke-interface {p1}, Lcom/google/android/gms/internal/zzahu;->zzTp()Lcom/google/android/gms/internal/zzahu;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    move v0, v1

    :goto_1
    move v1, v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public getChildCount()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getValue()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getValue(Z)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isEmpty()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<",
            "Lcom/google/android/gms/internal/zzaht;",
            ">;"
        }
    .end annotation

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "<Empty Node>"

    return-object v0
.end method

.method public zzO(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzahu;
    .locals 0

    return-object p0
.end method

.method public zzPw()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<",
            "Lcom/google/android/gms/internal/zzaht;",
            ">;"
        }
    .end annotation

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public zzTn()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method

.method public zzTo()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public zzTp()Lcom/google/android/gms/internal/zzahu;
    .locals 0

    return-object p0
.end method

.method public zza(Lcom/google/android/gms/internal/zzahu$zza;)Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method

.method public zze(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;
    .locals 1

    invoke-interface {p2}, Lcom/google/android/gms/internal/zzahu;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-object p0

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzahi;->zzTl()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/zzahj;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzahj;-><init>()V

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/zzahj;->zze(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;

    move-result-object p0

    goto :goto_0
.end method

.method public synthetic zzf(Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzahn;->zzk(Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahn;

    move-result-object v0

    return-object v0
.end method

.method public zzg(Lcom/google/android/gms/internal/zzahu;)I
    .locals 1

    invoke-interface {p1}, Lcom/google/android/gms/internal/zzahu;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    const/4 v0, -0x1

    goto :goto_0
.end method

.method public zzk(Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahn;
    .locals 0

    return-object p0
.end method

.method public zzk(Lcom/google/android/gms/internal/zzahi;)Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public zzl(Lcom/google/android/gms/internal/zzahi;)Lcom/google/android/gms/internal/zzahi;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public zzl(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;
    .locals 3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafa;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    return-object p2

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafa;->zzRt()Lcom/google/android/gms/internal/zzahi;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzahn;->zzm(Lcom/google/android/gms/internal/zzahi;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafa;->zzRu()Lcom/google/android/gms/internal/zzafa;

    move-result-object v2

    invoke-interface {v1, v2, p2}, Lcom/google/android/gms/internal/zzahu;->zzl(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/zzahn;->zze(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;

    move-result-object p2

    goto :goto_0
.end method

.method public zzm(Lcom/google/android/gms/internal/zzahi;)Lcom/google/android/gms/internal/zzahu;
    .locals 0

    return-object p0
.end method
