.class public final enum Lcom/nightonke/boommenu/a/f;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/nightonke/boommenu/a/f;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/nightonke/boommenu/a/f;

.field public static final enum b:Lcom/nightonke/boommenu/a/f;

.field public static final enum c:Lcom/nightonke/boommenu/a/f;

.field public static final enum d:Lcom/nightonke/boommenu/a/f;

.field private static final synthetic f:[Lcom/nightonke/boommenu/a/f;


# instance fields
.field private final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    new-instance v0, Lcom/nightonke/boommenu/a/f;

    const-string v1, "DEFAULT"

    invoke-direct {v0, v1, v3, v3}, Lcom/nightonke/boommenu/a/f;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/nightonke/boommenu/a/f;->a:Lcom/nightonke/boommenu/a/f;

    new-instance v0, Lcom/nightonke/boommenu/a/f;

    const-string v1, "REVERSE"

    invoke-direct {v0, v1, v4, v4}, Lcom/nightonke/boommenu/a/f;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/nightonke/boommenu/a/f;->b:Lcom/nightonke/boommenu/a/f;

    new-instance v0, Lcom/nightonke/boommenu/a/f;

    const-string v1, "RANDOM"

    invoke-direct {v0, v1, v5, v5}, Lcom/nightonke/boommenu/a/f;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/nightonke/boommenu/a/f;->c:Lcom/nightonke/boommenu/a/f;

    new-instance v0, Lcom/nightonke/boommenu/a/f;

    const-string v1, "Unknown"

    const/4 v2, -0x1

    invoke-direct {v0, v1, v6, v2}, Lcom/nightonke/boommenu/a/f;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/nightonke/boommenu/a/f;->d:Lcom/nightonke/boommenu/a/f;

    const/4 v0, 0x4

    new-array v0, v0, [Lcom/nightonke/boommenu/a/f;

    sget-object v1, Lcom/nightonke/boommenu/a/f;->a:Lcom/nightonke/boommenu/a/f;

    aput-object v1, v0, v3

    sget-object v1, Lcom/nightonke/boommenu/a/f;->b:Lcom/nightonke/boommenu/a/f;

    aput-object v1, v0, v4

    sget-object v1, Lcom/nightonke/boommenu/a/f;->c:Lcom/nightonke/boommenu/a/f;

    aput-object v1, v0, v5

    sget-object v1, Lcom/nightonke/boommenu/a/f;->d:Lcom/nightonke/boommenu/a/f;

    aput-object v1, v0, v6

    sput-object v0, Lcom/nightonke/boommenu/a/f;->f:[Lcom/nightonke/boommenu/a/f;

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

    iput p3, p0, Lcom/nightonke/boommenu/a/f;->e:I

    return-void
.end method

.method public static a(I)Lcom/nightonke/boommenu/a/f;
    .locals 1

    if-ltz p0, :cond_0

    invoke-static {}, Lcom/nightonke/boommenu/a/f;->values()[Lcom/nightonke/boommenu/a/f;

    move-result-object v0

    array-length v0, v0

    if-lt p0, v0, :cond_1

    :cond_0
    sget-object v0, Lcom/nightonke/boommenu/a/f;->d:Lcom/nightonke/boommenu/a/f;

    :goto_0
    return-object v0

    :cond_1
    invoke-static {}, Lcom/nightonke/boommenu/a/f;->values()[Lcom/nightonke/boommenu/a/f;

    move-result-object v0

    aget-object v0, v0, p0

    goto :goto_0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/nightonke/boommenu/a/f;
    .locals 1

    const-class v0, Lcom/nightonke/boommenu/a/f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/nightonke/boommenu/a/f;

    return-object v0
.end method

.method public static values()[Lcom/nightonke/boommenu/a/f;
    .locals 1

    sget-object v0, Lcom/nightonke/boommenu/a/f;->f:[Lcom/nightonke/boommenu/a/f;

    invoke-virtual {v0}, [Lcom/nightonke/boommenu/a/f;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/nightonke/boommenu/a/f;

    return-object v0
.end method
