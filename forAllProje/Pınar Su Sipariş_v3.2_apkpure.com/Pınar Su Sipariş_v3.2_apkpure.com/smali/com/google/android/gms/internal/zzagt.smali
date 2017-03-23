.class public Lcom/google/android/gms/internal/zzagt;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/zzagt$a;
    }
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z

.field public static final zzbPK:Lcom/google/android/gms/internal/zzagt;


# instance fields
.field private zzbPG:Lcom/google/android/gms/internal/zzaho;

.field private zzbPL:Ljava/lang/Integer;

.field private zzbPM:Lcom/google/android/gms/internal/zzagt$a;

.field private zzbPN:Lcom/google/android/gms/internal/zzahu;

.field private zzbPO:Lcom/google/android/gms/internal/zzahi;

.field private zzbPP:Lcom/google/android/gms/internal/zzahu;

.field private zzbPQ:Lcom/google/android/gms/internal/zzahi;

.field private zzbPR:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/google/android/gms/internal/zzagt;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/google/android/gms/internal/zzagt;->$assertionsDisabled:Z

    new-instance v0, Lcom/google/android/gms/internal/zzagt;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzagt;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/zzagt;->zzbPK:Lcom/google/android/gms/internal/zzagt;

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Lcom/google/android/gms/internal/zzagt;->zzbPN:Lcom/google/android/gms/internal/zzahu;

    iput-object v1, p0, Lcom/google/android/gms/internal/zzagt;->zzbPO:Lcom/google/android/gms/internal/zzahi;

    iput-object v1, p0, Lcom/google/android/gms/internal/zzagt;->zzbPP:Lcom/google/android/gms/internal/zzahu;

    iput-object v1, p0, Lcom/google/android/gms/internal/zzagt;->zzbPQ:Lcom/google/android/gms/internal/zzahi;

    invoke-static {}, Lcom/google/android/gms/internal/zzahx;->zzTL()Lcom/google/android/gms/internal/zzahx;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzagt;->zzbPG:Lcom/google/android/gms/internal/zzaho;

    iput-object v1, p0, Lcom/google/android/gms/internal/zzagt;->zzbPR:Ljava/lang/String;

    return-void
.end method

.method private zzSL()Lcom/google/android/gms/internal/zzagt;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/zzagt;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzagt;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/zzagt;->zzbPL:Ljava/lang/Integer;

    iput-object v1, v0, Lcom/google/android/gms/internal/zzagt;->zzbPL:Ljava/lang/Integer;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzagt;->zzbPN:Lcom/google/android/gms/internal/zzahu;

    iput-object v1, v0, Lcom/google/android/gms/internal/zzagt;->zzbPN:Lcom/google/android/gms/internal/zzahu;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzagt;->zzbPO:Lcom/google/android/gms/internal/zzahi;

    iput-object v1, v0, Lcom/google/android/gms/internal/zzagt;->zzbPO:Lcom/google/android/gms/internal/zzahi;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzagt;->zzbPP:Lcom/google/android/gms/internal/zzahu;

    iput-object v1, v0, Lcom/google/android/gms/internal/zzagt;->zzbPP:Lcom/google/android/gms/internal/zzahu;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzagt;->zzbPQ:Lcom/google/android/gms/internal/zzahi;

    iput-object v1, v0, Lcom/google/android/gms/internal/zzagt;->zzbPQ:Lcom/google/android/gms/internal/zzahi;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzagt;->zzbPM:Lcom/google/android/gms/internal/zzagt$a;

    iput-object v1, v0, Lcom/google/android/gms/internal/zzagt;->zzbPM:Lcom/google/android/gms/internal/zzagt$a;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzagt;->zzbPG:Lcom/google/android/gms/internal/zzaho;

    iput-object v1, v0, Lcom/google/android/gms/internal/zzagt;->zzbPG:Lcom/google/android/gms/internal/zzaho;

    return-object v0
.end method

.method public static zzaA(Ljava/util/Map;)Lcom/google/android/gms/internal/zzagt;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/google/android/gms/internal/zzagt;"
        }
    .end annotation

    new-instance v1, Lcom/google/android/gms/internal/zzagt;

    invoke-direct {v1}, Lcom/google/android/gms/internal/zzagt;-><init>()V

    const-string v0, "l"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    iput-object v0, v1, Lcom/google/android/gms/internal/zzagt;->zzbPL:Ljava/lang/Integer;

    const-string v0, "sp"

    invoke-interface {p0, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "sp"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/zzahv;->zzaq(Ljava/lang/Object;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    iput-object v0, v1, Lcom/google/android/gms/internal/zzagt;->zzbPN:Lcom/google/android/gms/internal/zzahu;

    const-string v0, "sn"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/google/android/gms/internal/zzahi;->zzig(Ljava/lang/String;)Lcom/google/android/gms/internal/zzahi;

    move-result-object v0

    iput-object v0, v1, Lcom/google/android/gms/internal/zzagt;->zzbPO:Lcom/google/android/gms/internal/zzahi;

    :cond_0
    const-string v0, "ep"

    invoke-interface {p0, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "ep"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/zzahv;->zzaq(Ljava/lang/Object;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    iput-object v0, v1, Lcom/google/android/gms/internal/zzagt;->zzbPP:Lcom/google/android/gms/internal/zzahu;

    const-string v0, "en"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-static {v0}, Lcom/google/android/gms/internal/zzahi;->zzig(Ljava/lang/String;)Lcom/google/android/gms/internal/zzahi;

    move-result-object v0

    iput-object v0, v1, Lcom/google/android/gms/internal/zzagt;->zzbPQ:Lcom/google/android/gms/internal/zzahi;

    :cond_1
    const-string v0, "vf"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_2

    const-string v2, "l"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Lcom/google/android/gms/internal/zzagt$a;->a:Lcom/google/android/gms/internal/zzagt$a;

    :goto_0
    iput-object v0, v1, Lcom/google/android/gms/internal/zzagt;->zzbPM:Lcom/google/android/gms/internal/zzagt$a;

    :cond_2
    const-string v0, "i"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_3

    invoke-static {v0}, Lcom/google/android/gms/internal/zzaho;->zzih(Ljava/lang/String;)Lcom/google/android/gms/internal/zzaho;

    move-result-object v0

    iput-object v0, v1, Lcom/google/android/gms/internal/zzagt;->zzbPG:Lcom/google/android/gms/internal/zzaho;

    :cond_3
    return-object v1

    :cond_4
    sget-object v0, Lcom/google/android/gms/internal/zzagt$a;->b:Lcom/google/android/gms/internal/zzagt$a;

    goto :goto_0
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
    check-cast p1, Lcom/google/android/gms/internal/zzagt;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzagt;->zzbPL:Ljava/lang/Integer;

    if-eqz v2, :cond_5

    iget-object v2, p0, Lcom/google/android/gms/internal/zzagt;->zzbPL:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/google/android/gms/internal/zzagt;->zzbPL:Ljava/lang/Integer;

    invoke-virtual {v2, v3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    :cond_4
    move v0, v1

    goto :goto_0

    :cond_5
    iget-object v2, p1, Lcom/google/android/gms/internal/zzagt;->zzbPL:Ljava/lang/Integer;

    if-nez v2, :cond_4

    :cond_6
    iget-object v2, p0, Lcom/google/android/gms/internal/zzagt;->zzbPG:Lcom/google/android/gms/internal/zzaho;

    if-eqz v2, :cond_8

    iget-object v2, p0, Lcom/google/android/gms/internal/zzagt;->zzbPG:Lcom/google/android/gms/internal/zzaho;

    iget-object v3, p1, Lcom/google/android/gms/internal/zzagt;->zzbPG:Lcom/google/android/gms/internal/zzaho;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    :cond_7
    move v0, v1

    goto :goto_0

    :cond_8
    iget-object v2, p1, Lcom/google/android/gms/internal/zzagt;->zzbPG:Lcom/google/android/gms/internal/zzaho;

    if-nez v2, :cond_7

    :cond_9
    iget-object v2, p0, Lcom/google/android/gms/internal/zzagt;->zzbPQ:Lcom/google/android/gms/internal/zzahi;

    if-eqz v2, :cond_b

    iget-object v2, p0, Lcom/google/android/gms/internal/zzagt;->zzbPQ:Lcom/google/android/gms/internal/zzahi;

    iget-object v3, p1, Lcom/google/android/gms/internal/zzagt;->zzbPQ:Lcom/google/android/gms/internal/zzahi;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/zzahi;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_c

    :cond_a
    move v0, v1

    goto :goto_0

    :cond_b
    iget-object v2, p1, Lcom/google/android/gms/internal/zzagt;->zzbPQ:Lcom/google/android/gms/internal/zzahi;

    if-nez v2, :cond_a

    :cond_c
    iget-object v2, p0, Lcom/google/android/gms/internal/zzagt;->zzbPP:Lcom/google/android/gms/internal/zzahu;

    if-eqz v2, :cond_e

    iget-object v2, p0, Lcom/google/android/gms/internal/zzagt;->zzbPP:Lcom/google/android/gms/internal/zzahu;

    iget-object v3, p1, Lcom/google/android/gms/internal/zzagt;->zzbPP:Lcom/google/android/gms/internal/zzahu;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_f

    :cond_d
    move v0, v1

    goto :goto_0

    :cond_e
    iget-object v2, p1, Lcom/google/android/gms/internal/zzagt;->zzbPP:Lcom/google/android/gms/internal/zzahu;

    if-nez v2, :cond_d

    :cond_f
    iget-object v2, p0, Lcom/google/android/gms/internal/zzagt;->zzbPO:Lcom/google/android/gms/internal/zzahi;

    if-eqz v2, :cond_11

    iget-object v2, p0, Lcom/google/android/gms/internal/zzagt;->zzbPO:Lcom/google/android/gms/internal/zzahi;

    iget-object v3, p1, Lcom/google/android/gms/internal/zzagt;->zzbPO:Lcom/google/android/gms/internal/zzahi;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/zzahi;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_12

    :cond_10
    move v0, v1

    goto :goto_0

    :cond_11
    iget-object v2, p1, Lcom/google/android/gms/internal/zzagt;->zzbPO:Lcom/google/android/gms/internal/zzahi;

    if-nez v2, :cond_10

    :cond_12
    iget-object v2, p0, Lcom/google/android/gms/internal/zzagt;->zzbPN:Lcom/google/android/gms/internal/zzahu;

    if-eqz v2, :cond_14

    iget-object v2, p0, Lcom/google/android/gms/internal/zzagt;->zzbPN:Lcom/google/android/gms/internal/zzahu;

    iget-object v3, p1, Lcom/google/android/gms/internal/zzagt;->zzbPN:Lcom/google/android/gms/internal/zzahu;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_15

    :cond_13
    move v0, v1

    goto/16 :goto_0

    :cond_14
    iget-object v2, p1, Lcom/google/android/gms/internal/zzagt;->zzbPN:Lcom/google/android/gms/internal/zzahu;

    if-nez v2, :cond_13

    :cond_15
    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzagt;->zzSM()Z

    move-result v2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagt;->zzSM()Z

    move-result v3

    if-eq v2, v3, :cond_0

    move v0, v1

    goto/16 :goto_0
.end method

.method public getLimit()I
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzagt;->zzSI()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot get limit if limit has not been set"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzagt;->zzbPL:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public hashCode()I
    .locals 3

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagt;->zzbPL:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagt;->zzbPL:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    :goto_0
    mul-int/lit8 v2, v0, 0x1f

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzagt;->zzSM()Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v0, 0x4cf

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagt;->zzbPN:Lcom/google/android/gms/internal/zzahu;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagt;->zzbPN:Lcom/google/android/gms/internal/zzahu;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagt;->zzbPO:Lcom/google/android/gms/internal/zzahi;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagt;->zzbPO:Lcom/google/android/gms/internal/zzahi;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzahi;->hashCode()I

    move-result v0

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagt;->zzbPP:Lcom/google/android/gms/internal/zzahu;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagt;->zzbPP:Lcom/google/android/gms/internal/zzahu;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagt;->zzbPQ:Lcom/google/android/gms/internal/zzahi;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagt;->zzbPQ:Lcom/google/android/gms/internal/zzahi;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzahi;->hashCode()I

    move-result v0

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/google/android/gms/internal/zzagt;->zzbPG:Lcom/google/android/gms/internal/zzaho;

    if-eqz v2, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzagt;->zzbPG:Lcom/google/android/gms/internal/zzaho;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :cond_0
    add-int/2addr v0, v1

    return v0

    :cond_1
    move v0, v1

    goto :goto_0

    :cond_2
    const/16 v0, 0x4d5

    goto :goto_1

    :cond_3
    move v0, v1

    goto :goto_2

    :cond_4
    move v0, v1

    goto :goto_3

    :cond_5
    move v0, v1

    goto :goto_4

    :cond_6
    move v0, v1

    goto :goto_5
.end method

.method public isDefault()Z
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzagt;->zzSO()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagt;->zzbPG:Lcom/google/android/gms/internal/zzaho;

    invoke-static {}, Lcom/google/android/gms/internal/zzahx;->zzTL()Lcom/google/android/gms/internal/zzahx;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isValid()Z
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzagt;->zzSC()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzagt;->zzSF()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzagt;->zzSI()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzagt;->zzSJ()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzagt;->zzSN()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public zzSC()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagt;->zzbPN:Lcom/google/android/gms/internal/zzahu;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public zzSD()Lcom/google/android/gms/internal/zzahu;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzagt;->zzSC()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot get index start value if start has not been set"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzagt;->zzbPN:Lcom/google/android/gms/internal/zzahu;

    return-object v0
.end method

.method public zzSE()Lcom/google/android/gms/internal/zzahi;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzagt;->zzSC()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot get index start name if start has not been set"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzagt;->zzbPO:Lcom/google/android/gms/internal/zzahi;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagt;->zzbPO:Lcom/google/android/gms/internal/zzahi;

    :goto_0
    return-object v0

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/zzahi;->zzTh()Lcom/google/android/gms/internal/zzahi;

    move-result-object v0

    goto :goto_0
.end method

.method public zzSF()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagt;->zzbPP:Lcom/google/android/gms/internal/zzahu;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public zzSG()Lcom/google/android/gms/internal/zzahu;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzagt;->zzSF()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot get index end value if start has not been set"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzagt;->zzbPP:Lcom/google/android/gms/internal/zzahu;

    return-object v0
.end method

.method public zzSH()Lcom/google/android/gms/internal/zzahi;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzagt;->zzSF()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot get index end name if start has not been set"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzagt;->zzbPQ:Lcom/google/android/gms/internal/zzahi;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagt;->zzbPQ:Lcom/google/android/gms/internal/zzahi;

    :goto_0
    return-object v0

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/zzahi;->zzTi()Lcom/google/android/gms/internal/zzahi;

    move-result-object v0

    goto :goto_0
.end method

.method public zzSI()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagt;->zzbPL:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public zzSJ()Z
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzagt;->zzSI()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagt;->zzbPM:Lcom/google/android/gms/internal/zzagt$a;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public zzSK()Lcom/google/android/gms/internal/zzaho;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagt;->zzbPG:Lcom/google/android/gms/internal/zzaho;

    return-object v0
.end method

.method public zzSM()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagt;->zzbPM:Lcom/google/android/gms/internal/zzagt$a;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagt;->zzbPM:Lcom/google/android/gms/internal/zzagt$a;

    sget-object v1, Lcom/google/android/gms/internal/zzagt$a;->a:Lcom/google/android/gms/internal/zzagt$a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzagt;->zzSC()Z

    move-result v0

    goto :goto_0
.end method

.method public zzSN()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzagt;->zzSC()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "sp"

    iget-object v2, p0, Lcom/google/android/gms/internal/zzagt;->zzbPN:Lcom/google/android/gms/internal/zzahu;

    invoke-interface {v2}, Lcom/google/android/gms/internal/zzahu;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagt;->zzbPO:Lcom/google/android/gms/internal/zzahi;

    if-eqz v0, :cond_0

    const-string v0, "sn"

    iget-object v2, p0, Lcom/google/android/gms/internal/zzagt;->zzbPO:Lcom/google/android/gms/internal/zzahi;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzahi;->asString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzagt;->zzSF()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "ep"

    iget-object v2, p0, Lcom/google/android/gms/internal/zzagt;->zzbPP:Lcom/google/android/gms/internal/zzahu;

    invoke-interface {v2}, Lcom/google/android/gms/internal/zzahu;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagt;->zzbPQ:Lcom/google/android/gms/internal/zzahi;

    if-eqz v0, :cond_1

    const-string v0, "en"

    iget-object v2, p0, Lcom/google/android/gms/internal/zzagt;->zzbPQ:Lcom/google/android/gms/internal/zzahi;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzahi;->asString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/zzagt;->zzbPL:Ljava/lang/Integer;

    if-eqz v0, :cond_3

    const-string v0, "l"

    iget-object v2, p0, Lcom/google/android/gms/internal/zzagt;->zzbPL:Ljava/lang/Integer;

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagt;->zzbPM:Lcom/google/android/gms/internal/zzagt$a;

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzagt;->zzSC()Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v0, Lcom/google/android/gms/internal/zzagt$a;->a:Lcom/google/android/gms/internal/zzagt$a;

    :cond_2
    :goto_0
    sget-object v2, Lcom/google/android/gms/internal/zzagt$1;->a:[I

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagt$a;->ordinal()I

    move-result v0

    aget v0, v2, v0

    packed-switch v0, :pswitch_data_0

    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/internal/zzagt;->zzbPG:Lcom/google/android/gms/internal/zzaho;

    invoke-static {}, Lcom/google/android/gms/internal/zzahx;->zzTL()Lcom/google/android/gms/internal/zzahx;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "i"

    iget-object v2, p0, Lcom/google/android/gms/internal/zzagt;->zzbPG:Lcom/google/android/gms/internal/zzaho;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzaho;->zzTD()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    return-object v1

    :cond_5
    sget-object v0, Lcom/google/android/gms/internal/zzagt$a;->b:Lcom/google/android/gms/internal/zzagt$a;

    goto :goto_0

    :pswitch_0
    const-string v0, "vf"

    const-string v2, "l"

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :pswitch_1
    const-string v0, "vf"

    const-string v2, "r"

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public zzSO()Z
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzagt;->zzSC()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzagt;->zzSF()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzagt;->zzSI()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public zzSP()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagt;->zzbPR:Ljava/lang/String;

    if-nez v0, :cond_0

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzagt;->zzSN()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/zzaim;->zzaB(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzagt;->zzbPR:Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzagt;->zzbPR:Ljava/lang/String;

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public zzSQ()Lcom/google/android/gms/internal/zzahb;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzagt;->zzSO()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/zzagz;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzagt;->zzSK()Lcom/google/android/gms/internal/zzaho;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/zzagz;-><init>(Lcom/google/android/gms/internal/zzaho;)V

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzagt;->zzSI()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/zzaha;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/zzaha;-><init>(Lcom/google/android/gms/internal/zzagt;)V

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/zzahc;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/zzahc;-><init>(Lcom/google/android/gms/internal/zzagt;)V

    goto :goto_0
.end method

.method public zza(Lcom/google/android/gms/internal/zzaho;)Lcom/google/android/gms/internal/zzagt;
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzagt;->zzSL()Lcom/google/android/gms/internal/zzagt;

    move-result-object v0

    iput-object p1, v0, Lcom/google/android/gms/internal/zzagt;->zzbPG:Lcom/google/android/gms/internal/zzaho;

    return-object v0
.end method

.method public zza(Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzahi;)Lcom/google/android/gms/internal/zzagt;
    .locals 1

    sget-boolean v0, Lcom/google/android/gms/internal/zzagt;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    invoke-interface {p1}, Lcom/google/android/gms/internal/zzahu;->zzTo()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1}, Lcom/google/android/gms/internal/zzahu;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/zzagt;->zzSL()Lcom/google/android/gms/internal/zzagt;

    move-result-object v0

    iput-object p1, v0, Lcom/google/android/gms/internal/zzagt;->zzbPN:Lcom/google/android/gms/internal/zzahu;

    iput-object p2, v0, Lcom/google/android/gms/internal/zzagt;->zzbPO:Lcom/google/android/gms/internal/zzahi;

    return-object v0
.end method

.method public zzb(Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzahi;)Lcom/google/android/gms/internal/zzagt;
    .locals 1

    sget-boolean v0, Lcom/google/android/gms/internal/zzagt;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    invoke-interface {p1}, Lcom/google/android/gms/internal/zzahu;->zzTo()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1}, Lcom/google/android/gms/internal/zzahu;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/zzagt;->zzSL()Lcom/google/android/gms/internal/zzagt;

    move-result-object v0

    iput-object p1, v0, Lcom/google/android/gms/internal/zzagt;->zzbPP:Lcom/google/android/gms/internal/zzahu;

    iput-object p2, v0, Lcom/google/android/gms/internal/zzagt;->zzbPQ:Lcom/google/android/gms/internal/zzahi;

    return-object v0
.end method

.method public zznC(I)Lcom/google/android/gms/internal/zzagt;
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzagt;->zzSL()Lcom/google/android/gms/internal/zzagt;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/internal/zzagt;->zzbPL:Ljava/lang/Integer;

    sget-object v1, Lcom/google/android/gms/internal/zzagt$a;->a:Lcom/google/android/gms/internal/zzagt$a;

    iput-object v1, v0, Lcom/google/android/gms/internal/zzagt;->zzbPM:Lcom/google/android/gms/internal/zzagt$a;

    return-object v0
.end method

.method public zznD(I)Lcom/google/android/gms/internal/zzagt;
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzagt;->zzSL()Lcom/google/android/gms/internal/zzagt;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/internal/zzagt;->zzbPL:Ljava/lang/Integer;

    sget-object v1, Lcom/google/android/gms/internal/zzagt$a;->b:Lcom/google/android/gms/internal/zzagt$a;

    iput-object v1, v0, Lcom/google/android/gms/internal/zzagt;->zzbPM:Lcom/google/android/gms/internal/zzagt$a;

    return-object v0
.end method
