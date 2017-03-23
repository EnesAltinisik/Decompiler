.class public abstract Lcom/google/android/gms/internal/zzahr;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/zzahu;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/zzahr$zza;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/google/android/gms/internal/zzahr;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/zzahu;"
    }
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z


# instance fields
.field protected final zzbQE:Lcom/google/android/gms/internal/zzahu;

.field private zzbQF:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/google/android/gms/internal/zzahr;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/google/android/gms/internal/zzahr;->$assertionsDisabled:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method constructor <init>(Lcom/google/android/gms/internal/zzahu;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzahr;->zzbQE:Lcom/google/android/gms/internal/zzahu;

    return-void
.end method

.method private static zza(Lcom/google/android/gms/internal/zzahs;Lcom/google/android/gms/internal/zzahm;)I
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzahs;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    long-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzahm;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v1, v0}, Ljava/lang/Double;->compareTo(Ljava/lang/Double;)I

    move-result v0

    return v0
.end method


# virtual methods
.method public synthetic compareTo(Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/zzahu;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzahr;->zzg(Lcom/google/android/gms/internal/zzahu;)I

    move-result v0

    return v0
.end method

.method public getChildCount()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getValue(Z)Ljava/lang/Object;
    .locals 3

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzahr;->zzbQE:Lcom/google/android/gms/internal/zzahu;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzahu;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzahr;->getValue()Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, ".value"

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzahr;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, ".priority"

    iget-object v2, p0, Lcom/google/android/gms/internal/zzahr;->zzbQE:Lcom/google/android/gms/internal/zzahu;

    invoke-interface {v2}, Lcom/google/android/gms/internal/zzahu;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method public isEmpty()Z
    .locals 1

    const/4 v0, 0x0

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
    .locals 3

    const/16 v2, 0x64

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzahr;->getValue(Z)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-gt v1, v2, :cond_0

    :goto_0
    return-object v0

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "..."

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public zzO(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzahu;
    .locals 1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafa;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    return-object p0

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafa;->zzRt()Lcom/google/android/gms/internal/zzahi;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzahi;->zzTl()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p0, p0, Lcom/google/android/gms/internal/zzahr;->zzbQE:Lcom/google/android/gms/internal/zzahu;

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/zzahn;->zzTA()Lcom/google/android/gms/internal/zzahn;

    move-result-object p0

    goto :goto_0
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

.method protected abstract zzTg()Lcom/google/android/gms/internal/zzahr$zza;
.end method

.method public zzTn()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzahr;->zzbQF:Ljava/lang/String;

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/zzahu$zza;->zzbRj:Lcom/google/android/gms/internal/zzahu$zza;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzahr;->zza(Lcom/google/android/gms/internal/zzahu$zza;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/zzaiv;->zzim(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzahr;->zzbQF:Ljava/lang/String;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzahr;->zzbQF:Ljava/lang/String;

    return-object v0
.end method

.method public zzTo()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public zzTp()Lcom/google/android/gms/internal/zzahu;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzahr;->zzbQE:Lcom/google/android/gms/internal/zzahu;

    return-object v0
.end method

.method protected abstract zza(Lcom/google/android/gms/internal/zzahr;)I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)I"
        }
    .end annotation
.end method

.method protected zzb(Lcom/google/android/gms/internal/zzahu$zza;)Ljava/lang/String;
    .locals 4

    sget-object v0, Lcom/google/android/gms/internal/zzahr$1;->a:[I

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzahu$zza;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x16

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Unknown hash version: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzahr;->zzbQE:Lcom/google/android/gms/internal/zzahu;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzahu;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, ""

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzahr;->zzbQE:Lcom/google/android/gms/internal/zzahu;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/zzahu;->zza(Lcom/google/android/gms/internal/zzahu$zza;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0xa

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "priority:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method protected zzc(Lcom/google/android/gms/internal/zzahr;)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzahr",
            "<*>;)I"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzahr;->zzTg()Lcom/google/android/gms/internal/zzahr$zza;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzahr;->zzTg()Lcom/google/android/gms/internal/zzahr$zza;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzahr$zza;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzahr;->zza(Lcom/google/android/gms/internal/zzahr;)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzahr$zza;->compareTo(Ljava/lang/Enum;)I

    move-result v0

    goto :goto_0
.end method

.method public zze(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;
    .locals 2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzahi;->zzTl()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/zzahr;->zzf(Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;

    move-result-object p0

    :cond_0
    :goto_0
    return-object p0

    :cond_1
    invoke-interface {p2}, Lcom/google/android/gms/internal/zzahu;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/zzahn;->zzTA()Lcom/google/android/gms/internal/zzahn;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/zzahn;->zze(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzahr;->zzbQE:Lcom/google/android/gms/internal/zzahu;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzahu;->zzf(Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;

    move-result-object p0

    goto :goto_0
.end method

.method public zzg(Lcom/google/android/gms/internal/zzahu;)I
    .locals 2

    invoke-interface {p1}, Lcom/google/android/gms/internal/zzahu;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    instance-of v0, p1, Lcom/google/android/gms/internal/zzahj;

    if-eqz v0, :cond_1

    const/4 v0, -0x1

    goto :goto_0

    :cond_1
    sget-boolean v0, Lcom/google/android/gms/internal/zzahr;->$assertionsDisabled:Z

    if-nez v0, :cond_2

    invoke-interface {p1}, Lcom/google/android/gms/internal/zzahu;->zzTo()Z

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "Node is not leaf node!"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_2
    instance-of v0, p0, Lcom/google/android/gms/internal/zzahs;

    if-eqz v0, :cond_3

    instance-of v0, p1, Lcom/google/android/gms/internal/zzahm;

    if-eqz v0, :cond_3

    check-cast p0, Lcom/google/android/gms/internal/zzahs;

    check-cast p1, Lcom/google/android/gms/internal/zzahm;

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/zzahr;->zza(Lcom/google/android/gms/internal/zzahs;Lcom/google/android/gms/internal/zzahm;)I

    move-result v0

    goto :goto_0

    :cond_3
    instance-of v0, p0, Lcom/google/android/gms/internal/zzahm;

    if-eqz v0, :cond_4

    instance-of v0, p1, Lcom/google/android/gms/internal/zzahs;

    if-eqz v0, :cond_4

    check-cast p1, Lcom/google/android/gms/internal/zzahs;

    check-cast p0, Lcom/google/android/gms/internal/zzahm;

    invoke-static {p1, p0}, Lcom/google/android/gms/internal/zzahr;->zza(Lcom/google/android/gms/internal/zzahs;Lcom/google/android/gms/internal/zzahm;)I

    move-result v0

    mul-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_4
    check-cast p1, Lcom/google/android/gms/internal/zzahr;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzahr;->zzc(Lcom/google/android/gms/internal/zzahr;)I

    move-result v0

    goto :goto_0
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

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafa;->zzRt()Lcom/google/android/gms/internal/zzahi;

    move-result-object v0

    if-nez v0, :cond_0

    :goto_0
    return-object p2

    :cond_0
    invoke-interface {p2}, Lcom/google/android/gms/internal/zzahu;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzahi;->zzTl()Z

    move-result v1

    if-nez v1, :cond_1

    move-object p2, p0

    goto :goto_0

    :cond_1
    sget-boolean v1, Lcom/google/android/gms/internal/zzahr;->$assertionsDisabled:Z

    if-nez v1, :cond_2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafa;->zzRt()Lcom/google/android/gms/internal/zzahi;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzahi;->zzTl()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafa;->size()I

    move-result v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_2

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/zzahn;->zzTA()Lcom/google/android/gms/internal/zzahn;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafa;->zzRu()Lcom/google/android/gms/internal/zzafa;

    move-result-object v2

    invoke-virtual {v1, v2, p2}, Lcom/google/android/gms/internal/zzahn;->zzl(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/zzahr;->zze(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;

    move-result-object p2

    goto :goto_0
.end method

.method public zzm(Lcom/google/android/gms/internal/zzahi;)Lcom/google/android/gms/internal/zzahu;
    .locals 1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzahi;->zzTl()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzahr;->zzbQE:Lcom/google/android/gms/internal/zzahu;

    :goto_0
    return-object v0

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/zzahn;->zzTA()Lcom/google/android/gms/internal/zzahn;

    move-result-object v0

    goto :goto_0
.end method
