.class Lcom/balysv/materialripple/a$5;
.super Landroid/util/Property;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/balysv/materialripple/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/util/Property",
        "<",
        "Lcom/balysv/materialripple/a;",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/balysv/materialripple/a;


# direct methods
.method constructor <init>(Lcom/balysv/materialripple/a;Ljava/lang/Class;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/balysv/materialripple/a$5;->a:Lcom/balysv/materialripple/a;

    invoke-direct {p0, p2, p3}, Landroid/util/Property;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/balysv/materialripple/a;)Ljava/lang/Integer;
    .locals 1

    invoke-virtual {p1}, Lcom/balysv/materialripple/a;->getRippleAlpha()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/balysv/materialripple/a;Ljava/lang/Integer;)V
    .locals 0

    invoke-virtual {p1, p2}, Lcom/balysv/materialripple/a;->setRippleAlpha(Ljava/lang/Integer;)V

    return-void
.end method

.method public synthetic get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lcom/balysv/materialripple/a;

    invoke-virtual {p0, p1}, Lcom/balysv/materialripple/a$5;->a(Lcom/balysv/materialripple/a;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public synthetic set(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/balysv/materialripple/a;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p0, p1, p2}, Lcom/balysv/materialripple/a$5;->a(Lcom/balysv/materialripple/a;Ljava/lang/Integer;)V

    return-void
.end method
