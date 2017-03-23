.class public final enum Lcom/nightonke/boommenu/b;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/nightonke/boommenu/b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/nightonke/boommenu/b;

.field public static final enum b:Lcom/nightonke/boommenu/b;

.field public static final enum c:Lcom/nightonke/boommenu/b;

.field public static final enum d:Lcom/nightonke/boommenu/b;

.field public static final enum e:Lcom/nightonke/boommenu/b;

.field private static final synthetic g:[Lcom/nightonke/boommenu/b;


# instance fields
.field private final f:I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    new-instance v0, Lcom/nightonke/boommenu/b;

    const-string v1, "SimpleCircle"

    invoke-direct {v0, v1, v3, v3}, Lcom/nightonke/boommenu/b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/nightonke/boommenu/b;->a:Lcom/nightonke/boommenu/b;

    new-instance v0, Lcom/nightonke/boommenu/b;

    const-string v1, "TextInsideCircle"

    invoke-direct {v0, v1, v4, v4}, Lcom/nightonke/boommenu/b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/nightonke/boommenu/b;->b:Lcom/nightonke/boommenu/b;

    new-instance v0, Lcom/nightonke/boommenu/b;

    const-string v1, "TextOutsideCircle"

    invoke-direct {v0, v1, v5, v5}, Lcom/nightonke/boommenu/b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/nightonke/boommenu/b;->c:Lcom/nightonke/boommenu/b;

    new-instance v0, Lcom/nightonke/boommenu/b;

    const-string v1, "Ham"

    invoke-direct {v0, v1, v6, v6}, Lcom/nightonke/boommenu/b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/nightonke/boommenu/b;->d:Lcom/nightonke/boommenu/b;

    new-instance v0, Lcom/nightonke/boommenu/b;

    const-string v1, "Unknown"

    const/4 v2, -0x1

    invoke-direct {v0, v1, v7, v2}, Lcom/nightonke/boommenu/b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/nightonke/boommenu/b;->e:Lcom/nightonke/boommenu/b;

    const/4 v0, 0x5

    new-array v0, v0, [Lcom/nightonke/boommenu/b;

    sget-object v1, Lcom/nightonke/boommenu/b;->a:Lcom/nightonke/boommenu/b;

    aput-object v1, v0, v3

    sget-object v1, Lcom/nightonke/boommenu/b;->b:Lcom/nightonke/boommenu/b;

    aput-object v1, v0, v4

    sget-object v1, Lcom/nightonke/boommenu/b;->c:Lcom/nightonke/boommenu/b;

    aput-object v1, v0, v5

    sget-object v1, Lcom/nightonke/boommenu/b;->d:Lcom/nightonke/boommenu/b;

    aput-object v1, v0, v6

    sget-object v1, Lcom/nightonke/boommenu/b;->e:Lcom/nightonke/boommenu/b;

    aput-object v1, v0, v7

    sput-object v0, Lcom/nightonke/boommenu/b;->g:[Lcom/nightonke/boommenu/b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/nightonke/boommenu/b;->f:I

    return-void
.end method

.method public static a(I)Lcom/nightonke/boommenu/b;
    .locals 1

    if-ltz p0, :cond_0

    invoke-static {}, Lcom/nightonke/boommenu/b;->values()[Lcom/nightonke/boommenu/b;

    move-result-object v0

    array-length v0, v0

    if-le p0, v0, :cond_1

    :cond_0
    sget-object v0, Lcom/nightonke/boommenu/b;->e:Lcom/nightonke/boommenu/b;

    :goto_0
    return-object v0

    :cond_1
    invoke-static {}, Lcom/nightonke/boommenu/b;->values()[Lcom/nightonke/boommenu/b;

    move-result-object v0

    aget-object v0, v0, p0

    goto :goto_0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/nightonke/boommenu/b;
    .locals 1

    const-class v0, Lcom/nightonke/boommenu/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/nightonke/boommenu/b;

    return-object v0
.end method

.method public static values()[Lcom/nightonke/boommenu/b;
    .locals 1

    sget-object v0, Lcom/nightonke/boommenu/b;->g:[Lcom/nightonke/boommenu/b;

    invoke-virtual {v0}, [Lcom/nightonke/boommenu/b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/nightonke/boommenu/b;

    return-object v0
.end method
