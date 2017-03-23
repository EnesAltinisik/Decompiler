.class Lcom/nightonke/boommenu/c;
.super Ljava/lang/Object;


# static fields
.field private static a:Lcom/nightonke/boommenu/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/nightonke/boommenu/c;

    invoke-direct {v0}, Lcom/nightonke/boommenu/c;-><init>()V

    sput-object v0, Lcom/nightonke/boommenu/c;->a:Lcom/nightonke/boommenu/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Lcom/nightonke/boommenu/a/b;)V
    .locals 2

    if-eqz p0, :cond_0

    sget-object v0, Lcom/nightonke/boommenu/a/b;->i:Lcom/nightonke/boommenu/a/b;

    if-ne p0, v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Unknown boom-enum!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return-void
.end method

.method private static a(Lcom/nightonke/boommenu/b/d;)V
    .locals 2

    if-eqz p0, :cond_0

    sget-object v0, Lcom/nightonke/boommenu/b/d;->R:Lcom/nightonke/boommenu/b/d;

    if-ne p0, v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Unknown button-place-enum!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return-void
.end method

.method private static a(Lcom/nightonke/boommenu/b;)V
    .locals 2

    if-eqz p0, :cond_0

    sget-object v0, Lcom/nightonke/boommenu/b;->e:Lcom/nightonke/boommenu/b;

    if-ne p0, v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Unknown button-enum!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return-void
.end method

.method private static a(Lcom/nightonke/boommenu/c/d;)V
    .locals 2

    if-eqz p0, :cond_0

    sget-object v0, Lcom/nightonke/boommenu/c/d;->Q:Lcom/nightonke/boommenu/c/d;

    if-ne p0, v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Unknown piece-place-enum!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return-void
.end method

.method static a(Lcom/nightonke/boommenu/c/d;Lcom/nightonke/boommenu/b/d;Lcom/nightonke/boommenu/b;Lcom/nightonke/boommenu/a/b;Ljava/util/ArrayList;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nightonke/boommenu/c/d;",
            "Lcom/nightonke/boommenu/b/d;",
            "Lcom/nightonke/boommenu/b;",
            "Lcom/nightonke/boommenu/a/b;",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/nightonke/boommenu/b/b;",
            ">;)V"
        }
    .end annotation

    invoke-static {p0}, Lcom/nightonke/boommenu/c;->a(Lcom/nightonke/boommenu/c/d;)V

    invoke-static {p1}, Lcom/nightonke/boommenu/c;->a(Lcom/nightonke/boommenu/b/d;)V

    invoke-static {p2}, Lcom/nightonke/boommenu/c;->a(Lcom/nightonke/boommenu/b;)V

    invoke-static {p3}, Lcom/nightonke/boommenu/c;->a(Lcom/nightonke/boommenu/a/b;)V

    invoke-static {p4}, Lcom/nightonke/boommenu/c;->a(Ljava/util/ArrayList;)V

    invoke-virtual {p0}, Lcom/nightonke/boommenu/c/d;->a()I

    move-result v0

    invoke-virtual {p1}, Lcom/nightonke/boommenu/b/d;->a()I

    move-result v1

    invoke-virtual {p4}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, -0x1

    if-ne v0, v3, :cond_4

    sget-object v3, Lcom/nightonke/boommenu/c/d;->P:Lcom/nightonke/boommenu/c/d;

    if-ne v3, p0, :cond_4

    invoke-virtual {p0}, Lcom/nightonke/boommenu/c/d;->b()I

    move-result v3

    invoke-virtual {p0}, Lcom/nightonke/boommenu/c/d;->c()I

    move-result v4

    invoke-virtual {p1}, Lcom/nightonke/boommenu/b/d;->a()I

    move-result v5

    if-lt v5, v3, :cond_0

    invoke-virtual {p1}, Lcom/nightonke/boommenu/b/d;->a()I

    move-result v5

    if-le v5, v4, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ButtonPlaceEnum("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ") is not match for PiecePlaceEnum("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ")!"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    if-lt v2, v3, :cond_2

    if-le v2, v4, :cond_3

    :cond_2
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Number of builders("

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ") is not match for PiecePlaceEnum("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ")!"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    sget-object v3, Lcom/nightonke/boommenu/b;->d:Lcom/nightonke/boommenu/b;

    if-ne p2, v3, :cond_4

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Share style BMB is not support ham-boom-buttons"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    if-eq v0, v1, :cond_5

    sget-object v1, Lcom/nightonke/boommenu/b/d;->P:Lcom/nightonke/boommenu/b/d;

    if-eq p1, v1, :cond_5

    sget-object v1, Lcom/nightonke/boommenu/b/d;->Q:Lcom/nightonke/boommenu/b/d;

    if-eq p1, v1, :cond_5

    sget-object v1, Lcom/nightonke/boommenu/c/d;->P:Lcom/nightonke/boommenu/c/d;

    if-eq p0, v1, :cond_5

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Number of pieces is not equal to buttons\'!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    if-eq v0, v2, :cond_6

    sget-object v0, Lcom/nightonke/boommenu/c/d;->P:Lcom/nightonke/boommenu/c/d;

    if-eq p0, v0, :cond_6

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Number of builders is not equal to buttons\'!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    return-void
.end method

.method private static a(Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/nightonke/boommenu/b/b;",
            ">;)V"
        }
    .end annotation

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Empty builders!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return-void
.end method
