.class final enum Lcom/nightonke/boommenu/a;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/nightonke/boommenu/a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/nightonke/boommenu/a;

.field public static final enum b:Lcom/nightonke/boommenu/a;

.field public static final enum c:Lcom/nightonke/boommenu/a;

.field public static final enum d:Lcom/nightonke/boommenu/a;

.field private static final synthetic e:[Lcom/nightonke/boommenu/a;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    new-instance v0, Lcom/nightonke/boommenu/a;

    const-string v1, "DidShow"

    invoke-direct {v0, v1, v2}, Lcom/nightonke/boommenu/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/nightonke/boommenu/a;->a:Lcom/nightonke/boommenu/a;

    new-instance v0, Lcom/nightonke/boommenu/a;

    const-string v1, "WillShow"

    invoke-direct {v0, v1, v3}, Lcom/nightonke/boommenu/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/nightonke/boommenu/a;->b:Lcom/nightonke/boommenu/a;

    new-instance v0, Lcom/nightonke/boommenu/a;

    const-string v1, "DidHide"

    invoke-direct {v0, v1, v4}, Lcom/nightonke/boommenu/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/nightonke/boommenu/a;->c:Lcom/nightonke/boommenu/a;

    new-instance v0, Lcom/nightonke/boommenu/a;

    const-string v1, "WillHide"

    invoke-direct {v0, v1, v5}, Lcom/nightonke/boommenu/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/nightonke/boommenu/a;->d:Lcom/nightonke/boommenu/a;

    const/4 v0, 0x4

    new-array v0, v0, [Lcom/nightonke/boommenu/a;

    sget-object v1, Lcom/nightonke/boommenu/a;->a:Lcom/nightonke/boommenu/a;

    aput-object v1, v0, v2

    sget-object v1, Lcom/nightonke/boommenu/a;->b:Lcom/nightonke/boommenu/a;

    aput-object v1, v0, v3

    sget-object v1, Lcom/nightonke/boommenu/a;->c:Lcom/nightonke/boommenu/a;

    aput-object v1, v0, v4

    sget-object v1, Lcom/nightonke/boommenu/a;->d:Lcom/nightonke/boommenu/a;

    aput-object v1, v0, v5

    sput-object v0, Lcom/nightonke/boommenu/a;->e:[Lcom/nightonke/boommenu/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/nightonke/boommenu/a;
    .locals 1

    const-class v0, Lcom/nightonke/boommenu/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/nightonke/boommenu/a;

    return-object v0
.end method

.method public static values()[Lcom/nightonke/boommenu/a;
    .locals 1

    sget-object v0, Lcom/nightonke/boommenu/a;->e:[Lcom/nightonke/boommenu/a;

    invoke-virtual {v0}, [Lcom/nightonke/boommenu/a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/nightonke/boommenu/a;

    return-object v0
.end method
