.class final enum Lcom/gigamole/infinitecycleviewpager/a$b;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/gigamole/infinitecycleviewpager/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/gigamole/infinitecycleviewpager/a$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/gigamole/infinitecycleviewpager/a$b;

.field public static final enum b:Lcom/gigamole/infinitecycleviewpager/a$b;

.field public static final enum c:Lcom/gigamole/infinitecycleviewpager/a$b;

.field private static final synthetic d:[Lcom/gigamole/infinitecycleviewpager/a$b;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    new-instance v0, Lcom/gigamole/infinitecycleviewpager/a$b;

    const-string v1, "IDLE"

    invoke-direct {v0, v1, v2}, Lcom/gigamole/infinitecycleviewpager/a$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/gigamole/infinitecycleviewpager/a$b;->a:Lcom/gigamole/infinitecycleviewpager/a$b;

    new-instance v0, Lcom/gigamole/infinitecycleviewpager/a$b;

    const-string v1, "GOING_LEFT"

    invoke-direct {v0, v1, v3}, Lcom/gigamole/infinitecycleviewpager/a$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/gigamole/infinitecycleviewpager/a$b;->b:Lcom/gigamole/infinitecycleviewpager/a$b;

    new-instance v0, Lcom/gigamole/infinitecycleviewpager/a$b;

    const-string v1, "GOING_RIGHT"

    invoke-direct {v0, v1, v4}, Lcom/gigamole/infinitecycleviewpager/a$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/gigamole/infinitecycleviewpager/a$b;->c:Lcom/gigamole/infinitecycleviewpager/a$b;

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/gigamole/infinitecycleviewpager/a$b;

    sget-object v1, Lcom/gigamole/infinitecycleviewpager/a$b;->a:Lcom/gigamole/infinitecycleviewpager/a$b;

    aput-object v1, v0, v2

    sget-object v1, Lcom/gigamole/infinitecycleviewpager/a$b;->b:Lcom/gigamole/infinitecycleviewpager/a$b;

    aput-object v1, v0, v3

    sget-object v1, Lcom/gigamole/infinitecycleviewpager/a$b;->c:Lcom/gigamole/infinitecycleviewpager/a$b;

    aput-object v1, v0, v4

    sput-object v0, Lcom/gigamole/infinitecycleviewpager/a$b;->d:[Lcom/gigamole/infinitecycleviewpager/a$b;

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

.method public static valueOf(Ljava/lang/String;)Lcom/gigamole/infinitecycleviewpager/a$b;
    .locals 1

    const-class v0, Lcom/gigamole/infinitecycleviewpager/a$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/gigamole/infinitecycleviewpager/a$b;

    return-object v0
.end method

.method public static values()[Lcom/gigamole/infinitecycleviewpager/a$b;
    .locals 1

    sget-object v0, Lcom/gigamole/infinitecycleviewpager/a$b;->d:[Lcom/gigamole/infinitecycleviewpager/a$b;

    invoke-virtual {v0}, [Lcom/gigamole/infinitecycleviewpager/a$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/gigamole/infinitecycleviewpager/a$b;

    return-object v0
.end method
