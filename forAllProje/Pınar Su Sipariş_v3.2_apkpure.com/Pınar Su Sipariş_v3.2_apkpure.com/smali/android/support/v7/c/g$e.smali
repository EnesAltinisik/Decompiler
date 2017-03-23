.class public final Landroid/support/v7/c/g$e;
.super Ljava/lang/Object;
.source "MediaRouter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/c/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# instance fields
.field private final a:Landroid/support/v7/c/c;

.field private final b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v7/c/g$f;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Landroid/support/v7/c/c$c;

.field private d:Landroid/support/v7/c/d;


# direct methods
.method constructor <init>(Landroid/support/v7/c/c;)V
    .locals 1

    .prologue
    .line 1364
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1357
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v7/c/g$e;->b:Ljava/util/ArrayList;

    .line 1365
    iput-object p1, p0, Landroid/support/v7/c/g$e;->a:Landroid/support/v7/c/c;

    .line 1366
    invoke-virtual {p1}, Landroid/support/v7/c/c;->c()Landroid/support/v7/c/c$c;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/c/g$e;->c:Landroid/support/v7/c/c$c;

    .line 1367
    return-void
.end method

.method static synthetic a(Landroid/support/v7/c/g$e;)Landroid/support/v7/c/c;
    .locals 1

    .prologue
    .line 1355
    iget-object v0, p0, Landroid/support/v7/c/g$e;->a:Landroid/support/v7/c/c;

    return-object v0
.end method

.method static synthetic b(Landroid/support/v7/c/g$e;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 1355
    iget-object v0, p0, Landroid/support/v7/c/g$e;->b:Ljava/util/ArrayList;

    return-object v0
.end method


# virtual methods
.method a(Ljava/lang/String;)I
    .locals 3

    .prologue
    .line 1423
    iget-object v0, p0, Landroid/support/v7/c/g$e;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 1424
    const/4 v1, 0x0

    :goto_0
    if-ge v1, v2, :cond_1

    .line 1425
    iget-object v0, p0, Landroid/support/v7/c/g$e;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/c/g$f;

    invoke-static {v0}, Landroid/support/v7/c/g$f;->a(Landroid/support/v7/c/g$f;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    .line 1429
    :goto_1
    return v0

    .line 1424
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 1429
    :cond_1
    const/4 v0, -0x1

    goto :goto_1
.end method

.method public a()Landroid/support/v7/c/c;
    .locals 1

    .prologue
    .line 1373
    invoke-static {}, Landroid/support/v7/c/g;->e()V

    .line 1374
    iget-object v0, p0, Landroid/support/v7/c/g$e;->a:Landroid/support/v7/c/c;

    return-object v0
.end method

.method a(Landroid/support/v7/c/d;)Z
    .locals 1

    .prologue
    .line 1415
    iget-object v0, p0, Landroid/support/v7/c/g$e;->d:Landroid/support/v7/c/d;

    if-eq v0, p1, :cond_0

    .line 1416
    iput-object p1, p0, Landroid/support/v7/c/g$e;->d:Landroid/support/v7/c/d;

    .line 1417
    const/4 v0, 0x1

    .line 1419
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1381
    iget-object v0, p0, Landroid/support/v7/c/g$e;->c:Landroid/support/v7/c/c$c;

    invoke-virtual {v0}, Landroid/support/v7/c/c$c;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public c()Landroid/content/ComponentName;
    .locals 1

    .prologue
    .line 1388
    iget-object v0, p0, Landroid/support/v7/c/g$e;->c:Landroid/support/v7/c/c$c;

    invoke-virtual {v0}, Landroid/support/v7/c/c$c;->b()Landroid/content/ComponentName;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 1434
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "MediaRouter.RouteProviderInfo{ packageName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Landroid/support/v7/c/g$e;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " }"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
