.class public final enum Lcom/mikepenz/actionitembadge/library/a/b$a;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mikepenz/actionitembadge/library/a/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/mikepenz/actionitembadge/library/a/b$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/mikepenz/actionitembadge/library/a/b$a;

.field public static final enum b:Lcom/mikepenz/actionitembadge/library/a/b$a;

.field private static final synthetic d:[Lcom/mikepenz/actionitembadge/library/a/b$a;


# instance fields
.field private c:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/4 v4, 0x2

    const/4 v3, 0x0

    const/4 v2, 0x1

    new-instance v0, Lcom/mikepenz/actionitembadge/library/a/b$a;

    const-string v1, "DEFAULT"

    invoke-direct {v0, v1, v3, v2}, Lcom/mikepenz/actionitembadge/library/a/b$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/mikepenz/actionitembadge/library/a/b$a;->a:Lcom/mikepenz/actionitembadge/library/a/b$a;

    new-instance v0, Lcom/mikepenz/actionitembadge/library/a/b$a;

    const-string v1, "LARGE"

    invoke-direct {v0, v1, v2, v4}, Lcom/mikepenz/actionitembadge/library/a/b$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/mikepenz/actionitembadge/library/a/b$a;->b:Lcom/mikepenz/actionitembadge/library/a/b$a;

    new-array v0, v4, [Lcom/mikepenz/actionitembadge/library/a/b$a;

    sget-object v1, Lcom/mikepenz/actionitembadge/library/a/b$a;->a:Lcom/mikepenz/actionitembadge/library/a/b$a;

    aput-object v1, v0, v3

    sget-object v1, Lcom/mikepenz/actionitembadge/library/a/b$a;->b:Lcom/mikepenz/actionitembadge/library/a/b$a;

    aput-object v1, v0, v2

    sput-object v0, Lcom/mikepenz/actionitembadge/library/a/b$a;->d:[Lcom/mikepenz/actionitembadge/library/a/b$a;

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

    iput p3, p0, Lcom/mikepenz/actionitembadge/library/a/b$a;->c:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/mikepenz/actionitembadge/library/a/b$a;
    .locals 1

    const-class v0, Lcom/mikepenz/actionitembadge/library/a/b$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/mikepenz/actionitembadge/library/a/b$a;

    return-object v0
.end method

.method public static values()[Lcom/mikepenz/actionitembadge/library/a/b$a;
    .locals 1

    sget-object v0, Lcom/mikepenz/actionitembadge/library/a/b$a;->d:[Lcom/mikepenz/actionitembadge/library/a/b$a;

    invoke-virtual {v0}, [Lcom/mikepenz/actionitembadge/library/a/b$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/mikepenz/actionitembadge/library/a/b$a;

    return-object v0
.end method
