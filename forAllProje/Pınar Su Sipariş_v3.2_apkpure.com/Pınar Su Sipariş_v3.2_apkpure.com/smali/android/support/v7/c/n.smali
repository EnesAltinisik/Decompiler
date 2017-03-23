.class abstract Landroid/support/v7/c/n;
.super Landroid/support/v7/c/c;
.source "SystemMediaRouteProvider.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/c/n$c;,
        Landroid/support/v7/c/n$b;,
        Landroid/support/v7/c/n$a;,
        Landroid/support/v7/c/n$d;,
        Landroid/support/v7/c/n$e;
    }
.end annotation


# direct methods
.method protected constructor <init>(Landroid/content/Context;)V
    .locals 4

    .prologue
    .line 47
    new-instance v0, Landroid/support/v7/c/c$c;

    new-instance v1, Landroid/content/ComponentName;

    const-string v2, "android"

    const-class v3, Landroid/support/v7/c/n;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Landroid/support/v7/c/c$c;-><init>(Landroid/content/ComponentName;)V

    invoke-direct {p0, p1, v0}, Landroid/support/v7/c/c;-><init>(Landroid/content/Context;Landroid/support/v7/c/c$c;)V

    .line 49
    return-void
.end method

.method public static a(Landroid/content/Context;Landroid/support/v7/c/n$e;)Landroid/support/v7/c/n;
    .locals 2

    .prologue
    .line 52
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x12

    if-lt v0, v1, :cond_0

    .line 53
    new-instance v0, Landroid/support/v7/c/n$c;

    invoke-direct {v0, p0, p1}, Landroid/support/v7/c/n$c;-><init>(Landroid/content/Context;Landroid/support/v7/c/n$e;)V

    .line 61
    :goto_0
    return-object v0

    .line 55
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-lt v0, v1, :cond_1

    .line 56
    new-instance v0, Landroid/support/v7/c/n$b;

    invoke-direct {v0, p0, p1}, Landroid/support/v7/c/n$b;-><init>(Landroid/content/Context;Landroid/support/v7/c/n$e;)V

    goto :goto_0

    .line 58
    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_2

    .line 59
    new-instance v0, Landroid/support/v7/c/n$a;

    invoke-direct {v0, p0, p1}, Landroid/support/v7/c/n$a;-><init>(Landroid/content/Context;Landroid/support/v7/c/n$e;)V

    goto :goto_0

    .line 61
    :cond_2
    new-instance v0, Landroid/support/v7/c/n$d;

    invoke-direct {v0, p0}, Landroid/support/v7/c/n$d;-><init>(Landroid/content/Context;)V

    goto :goto_0
.end method


# virtual methods
.method public a(Landroid/support/v7/c/g$f;)V
    .locals 0

    .prologue
    .line 69
    return-void
.end method

.method public b(Landroid/support/v7/c/g$f;)V
    .locals 0

    .prologue
    .line 76
    return-void
.end method

.method public c(Landroid/support/v7/c/g$f;)V
    .locals 0

    .prologue
    .line 83
    return-void
.end method

.method public d(Landroid/support/v7/c/g$f;)V
    .locals 0

    .prologue
    .line 90
    return-void
.end method
