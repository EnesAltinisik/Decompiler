.class public final enum Lcom/fodlam/yds/OxfordApplication$a;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fodlam/yds/OxfordApplication;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/fodlam/yds/OxfordApplication$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/fodlam/yds/OxfordApplication$a;

.field public static final enum b:Lcom/fodlam/yds/OxfordApplication$a;

.field public static final enum c:Lcom/fodlam/yds/OxfordApplication$a;

.field public static final enum d:Lcom/fodlam/yds/OxfordApplication$a;

.field public static final enum e:Lcom/fodlam/yds/OxfordApplication$a;

.field public static final enum f:Lcom/fodlam/yds/OxfordApplication$a;

.field public static final enum g:Lcom/fodlam/yds/OxfordApplication$a;

.field public static final enum h:Lcom/fodlam/yds/OxfordApplication$a;

.field private static final synthetic l:[Lcom/fodlam/yds/OxfordApplication$a;


# instance fields
.field public i:Ljava/lang/Class;

.field private j:Ljava/lang/String;

.field private k:I


# direct methods
.method static constructor <clinit>()V
    .locals 13

    const/4 v12, 0x4

    const/4 v11, 0x3

    const/4 v10, 0x2

    const/4 v9, 0x1

    const/4 v2, 0x0

    new-instance v0, Lcom/fodlam/yds/OxfordApplication$a;

    const-string v1, "LEARNING"

    const-string v3, "Kelime \u00d6\u011frenme"

    const v4, 0x7f02008d

    const-class v5, Lcom/fodlam/yds/WordLearningActivity;

    invoke-direct/range {v0 .. v5}, Lcom/fodlam/yds/OxfordApplication$a;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Class;)V

    sput-object v0, Lcom/fodlam/yds/OxfordApplication$a;->a:Lcom/fodlam/yds/OxfordApplication$a;

    new-instance v3, Lcom/fodlam/yds/OxfordApplication$a;

    const-string v4, "CHOOSEWORD"

    const-string v6, "Kelime Se\u00e7me"

    const v7, 0x7f02009c

    const-class v8, Lcom/fodlam/yds/MultipleChoiceActivity;

    move v5, v9

    invoke-direct/range {v3 .. v8}, Lcom/fodlam/yds/OxfordApplication$a;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Class;)V

    sput-object v3, Lcom/fodlam/yds/OxfordApplication$a;->b:Lcom/fodlam/yds/OxfordApplication$a;

    new-instance v3, Lcom/fodlam/yds/OxfordApplication$a;

    const-string v4, "FINDWORD"

    const-string v6, "Kelime Bulma"

    const v7, 0x7f02009c

    const-class v8, Lcom/fodlam/yds/MultipleChoiceActivity;

    move v5, v10

    invoke-direct/range {v3 .. v8}, Lcom/fodlam/yds/OxfordApplication$a;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Class;)V

    sput-object v3, Lcom/fodlam/yds/OxfordApplication$a;->c:Lcom/fodlam/yds/OxfordApplication$a;

    new-instance v3, Lcom/fodlam/yds/OxfordApplication$a;

    const-string v4, "LISTEN"

    const-string v6, "Dinleme ve Bulma"

    const v7, 0x7f02008e

    const-class v8, Lcom/fodlam/yds/MultipleChoiceActivity;

    move v5, v11

    invoke-direct/range {v3 .. v8}, Lcom/fodlam/yds/OxfordApplication$a;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Class;)V

    sput-object v3, Lcom/fodlam/yds/OxfordApplication$a;->d:Lcom/fodlam/yds/OxfordApplication$a;

    new-instance v3, Lcom/fodlam/yds/OxfordApplication$a;

    const-string v4, "LISTENANDCHOOSE"

    const-string v6, "Dinleme ve Se\u00e7me"

    const v7, 0x7f02008e

    const-class v8, Lcom/fodlam/yds/MultipleChoiceActivity;

    move v5, v12

    invoke-direct/range {v3 .. v8}, Lcom/fodlam/yds/OxfordApplication$a;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Class;)V

    sput-object v3, Lcom/fodlam/yds/OxfordApplication$a;->e:Lcom/fodlam/yds/OxfordApplication$a;

    new-instance v3, Lcom/fodlam/yds/OxfordApplication$a;

    const-string v4, "MATCHWORD"

    const/4 v5, 0x5

    const-string v6, "Kelime E\u015fle\u015ftirme"

    const v7, 0x7f020091

    const-class v8, Lcom/fodlam/yds/MatchWordActivity;

    invoke-direct/range {v3 .. v8}, Lcom/fodlam/yds/OxfordApplication$a;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Class;)V

    sput-object v3, Lcom/fodlam/yds/OxfordApplication$a;->f:Lcom/fodlam/yds/OxfordApplication$a;

    new-instance v3, Lcom/fodlam/yds/OxfordApplication$a;

    const-string v4, "LISTENANDWRITE"

    const/4 v5, 0x6

    const-string v6, "Dinleme ve Yazma I"

    const v7, 0x7f0200ae

    const-class v8, Lcom/fodlam/yds/WriteWordActivity;

    invoke-direct/range {v3 .. v8}, Lcom/fodlam/yds/OxfordApplication$a;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Class;)V

    sput-object v3, Lcom/fodlam/yds/OxfordApplication$a;->g:Lcom/fodlam/yds/OxfordApplication$a;

    new-instance v3, Lcom/fodlam/yds/OxfordApplication$a;

    const-string v4, "WRITEWORD"

    const/4 v5, 0x7

    const-string v6, "Dinleme ve Yazma II"

    const v7, 0x7f0200ae

    const-class v8, Lcom/fodlam/yds/WriteWordActivity;

    invoke-direct/range {v3 .. v8}, Lcom/fodlam/yds/OxfordApplication$a;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Class;)V

    sput-object v3, Lcom/fodlam/yds/OxfordApplication$a;->h:Lcom/fodlam/yds/OxfordApplication$a;

    const/16 v0, 0x8

    new-array v0, v0, [Lcom/fodlam/yds/OxfordApplication$a;

    sget-object v1, Lcom/fodlam/yds/OxfordApplication$a;->a:Lcom/fodlam/yds/OxfordApplication$a;

    aput-object v1, v0, v2

    sget-object v1, Lcom/fodlam/yds/OxfordApplication$a;->b:Lcom/fodlam/yds/OxfordApplication$a;

    aput-object v1, v0, v9

    sget-object v1, Lcom/fodlam/yds/OxfordApplication$a;->c:Lcom/fodlam/yds/OxfordApplication$a;

    aput-object v1, v0, v10

    sget-object v1, Lcom/fodlam/yds/OxfordApplication$a;->d:Lcom/fodlam/yds/OxfordApplication$a;

    aput-object v1, v0, v11

    sget-object v1, Lcom/fodlam/yds/OxfordApplication$a;->e:Lcom/fodlam/yds/OxfordApplication$a;

    aput-object v1, v0, v12

    const/4 v1, 0x5

    sget-object v2, Lcom/fodlam/yds/OxfordApplication$a;->f:Lcom/fodlam/yds/OxfordApplication$a;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/fodlam/yds/OxfordApplication$a;->g:Lcom/fodlam/yds/OxfordApplication$a;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lcom/fodlam/yds/OxfordApplication$a;->h:Lcom/fodlam/yds/OxfordApplication$a;

    aput-object v2, v0, v1

    sput-object v0, Lcom/fodlam/yds/OxfordApplication$a;->l:[Lcom/fodlam/yds/OxfordApplication$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/Class;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/fodlam/yds/OxfordApplication$a;->j:Ljava/lang/String;

    iput p4, p0, Lcom/fodlam/yds/OxfordApplication$a;->k:I

    iput-object p5, p0, Lcom/fodlam/yds/OxfordApplication$a;->i:Ljava/lang/Class;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/fodlam/yds/OxfordApplication$a;
    .locals 1

    const-class v0, Lcom/fodlam/yds/OxfordApplication$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/fodlam/yds/OxfordApplication$a;

    return-object v0
.end method

.method public static values()[Lcom/fodlam/yds/OxfordApplication$a;
    .locals 1

    sget-object v0, Lcom/fodlam/yds/OxfordApplication$a;->l:[Lcom/fodlam/yds/OxfordApplication$a;

    invoke-virtual {v0}, [Lcom/fodlam/yds/OxfordApplication$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/fodlam/yds/OxfordApplication$a;

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/fodlam/yds/OxfordApplication$a;->j:Ljava/lang/String;

    return-object v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lcom/fodlam/yds/OxfordApplication$a;->k:I

    return v0
.end method

.method public c()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lcom/fodlam/yds/OxfordApplication$a;->name()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
