.class Landroid/support/v7/c/n$d;
.super Landroid/support/v7/c/n;
.source "SystemMediaRouteProvider.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/c/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/c/n$d$b;,
        Landroid/support/v7/c/n$d$a;
    }
.end annotation


# static fields
.field private static final a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/content/IntentFilter;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Landroid/media/AudioManager;

.field private final c:Landroid/support/v7/c/n$d$b;

.field private d:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 107
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 108
    const-string v1, "android.media.intent.category.LIVE_AUDIO"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addCategory(Ljava/lang/String;)V

    .line 109
    const-string v1, "android.media.intent.category.LIVE_VIDEO"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addCategory(Ljava/lang/String;)V

    .line 111
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    sput-object v1, Landroid/support/v7/c/n$d;->a:Ljava/util/ArrayList;

    .line 112
    sget-object v1, Landroid/support/v7/c/n$d;->a:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 113
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 120
    invoke-direct {p0, p1}, Landroid/support/v7/c/n;-><init>(Landroid/content/Context;)V

    .line 117
    const/4 v0, -0x1

    iput v0, p0, Landroid/support/v7/c/n$d;->d:I

    .line 121
    const-string v0, "audio"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/AudioManager;

    iput-object v0, p0, Landroid/support/v7/c/n$d;->b:Landroid/media/AudioManager;

    .line 122
    new-instance v0, Landroid/support/v7/c/n$d$b;

    invoke-direct {v0, p0}, Landroid/support/v7/c/n$d$b;-><init>(Landroid/support/v7/c/n$d;)V

    iput-object v0, p0, Landroid/support/v7/c/n$d;->c:Landroid/support/v7/c/n$d$b;

    .line 124
    iget-object v0, p0, Landroid/support/v7/c/n$d;->c:Landroid/support/v7/c/n$d$b;

    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "android.media.VOLUME_CHANGED_ACTION"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 126
    invoke-direct {p0}, Landroid/support/v7/c/n$d;->f()V

    .line 127
    return-void
.end method

.method static synthetic a(Landroid/support/v7/c/n$d;)Landroid/media/AudioManager;
    .locals 1

    .prologue
    .line 102
    iget-object v0, p0, Landroid/support/v7/c/n$d;->b:Landroid/media/AudioManager;

    return-object v0
.end method

.method static synthetic b(Landroid/support/v7/c/n$d;)V
    .locals 0

    .prologue
    .line 102
    invoke-direct {p0}, Landroid/support/v7/c/n$d;->f()V

    return-void
.end method

.method static synthetic c(Landroid/support/v7/c/n$d;)I
    .locals 1

    .prologue
    .line 102
    iget v0, p0, Landroid/support/v7/c/n$d;->d:I

    return v0
.end method

.method private f()V
    .locals 6

    .prologue
    const/4 v5, 0x3

    .line 130
    invoke-virtual {p0}, Landroid/support/v7/c/n$d;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 131
    iget-object v1, p0, Landroid/support/v7/c/n$d;->b:Landroid/media/AudioManager;

    invoke-virtual {v1, v5}, Landroid/media/AudioManager;->getStreamMaxVolume(I)I

    move-result v1

    .line 132
    iget-object v2, p0, Landroid/support/v7/c/n$d;->b:Landroid/media/AudioManager;

    invoke-virtual {v2, v5}, Landroid/media/AudioManager;->getStreamVolume(I)I

    move-result v2

    iput v2, p0, Landroid/support/v7/c/n$d;->d:I

    .line 133
    new-instance v2, Landroid/support/v7/c/a$a;

    const-string v3, "DEFAULT_ROUTE"

    sget v4, Landroid/support/v7/d/a$d;->mr_system_route_name:I

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v3, v0}, Landroid/support/v7/c/a$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Landroid/support/v7/c/n$d;->a:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Landroid/support/v7/c/a$a;->a(Ljava/util/Collection;)Landroid/support/v7/c/a$a;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/support/v7/c/a$a;->b(I)Landroid/support/v7/c/a$a;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/support/v7/c/a$a;->a(I)Landroid/support/v7/c/a$a;

    move-result-object v0

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Landroid/support/v7/c/a$a;->e(I)Landroid/support/v7/c/a$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/support/v7/c/a$a;->d(I)Landroid/support/v7/c/a$a;

    move-result-object v0

    iget v1, p0, Landroid/support/v7/c/n$d;->d:I

    invoke-virtual {v0, v1}, Landroid/support/v7/c/a$a;->c(I)Landroid/support/v7/c/a$a;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/c/a$a;->a()Landroid/support/v7/c/a;

    move-result-object v0

    .line 143
    new-instance v1, Landroid/support/v7/c/d$a;

    invoke-direct {v1}, Landroid/support/v7/c/d$a;-><init>()V

    invoke-virtual {v1, v0}, Landroid/support/v7/c/d$a;->a(Landroid/support/v7/c/a;)Landroid/support/v7/c/d$a;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/c/d$a;->a()Landroid/support/v7/c/d;

    move-result-object v0

    .line 147
    invoke-virtual {p0, v0}, Landroid/support/v7/c/n$d;->a(Landroid/support/v7/c/d;)V

    .line 148
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Landroid/support/v7/c/c$d;
    .locals 1

    .prologue
    .line 152
    const-string v0, "DEFAULT_ROUTE"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 153
    new-instance v0, Landroid/support/v7/c/n$d$a;

    invoke-direct {v0, p0}, Landroid/support/v7/c/n$d$a;-><init>(Landroid/support/v7/c/n$d;)V

    .line 155
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
