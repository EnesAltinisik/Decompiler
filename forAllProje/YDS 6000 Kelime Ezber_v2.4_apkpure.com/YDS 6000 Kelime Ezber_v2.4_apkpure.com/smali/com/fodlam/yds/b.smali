.class public Lcom/fodlam/yds/b;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# static fields
.field static a:I

.field static b:I

.field static c:I

.field static d:I


# instance fields
.field e:Lcom/afollestad/materialdialogs/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    sput v0, Lcom/fodlam/yds/b;->a:I

    sput v0, Lcom/fodlam/yds/b;->b:I

    sput v0, Lcom/fodlam/yds/b;->c:I

    sput v0, Lcom/fodlam/yds/b;->d:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/fodlam/yds/b;->e:Lcom/afollestad/materialdialogs/f;

    return-void
.end method

.method public static a()Z
    .locals 2

    sget v0, Lcom/fodlam/yds/b;->a:I

    sget v1, Lcom/fodlam/yds/b;->c:I

    if-le v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 1

    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/fodlam/yds/OxfordApplication;->a(Landroid/content/Context;)V

    sget v0, Lcom/fodlam/yds/b;->b:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lcom/fodlam/yds/b;->b:I

    return-void
.end method

.method public onActivityDestroyed(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 1

    sget v0, Lcom/fodlam/yds/b;->c:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lcom/fodlam/yds/b;->c:I

    return-void
.end method

.method public onActivityResumed(Landroid/app/Activity;)V
    .locals 1

    sget v0, Lcom/fodlam/yds/b;->a:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lcom/fodlam/yds/b;->a:I

    return-void
.end method

.method public onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public onActivityStarted(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 1

    sget v0, Lcom/fodlam/yds/b;->d:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lcom/fodlam/yds/b;->d:I

    return-void
.end method
