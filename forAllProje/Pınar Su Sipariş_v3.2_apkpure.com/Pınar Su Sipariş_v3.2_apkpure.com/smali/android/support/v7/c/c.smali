.class public abstract Landroid/support/v7/c/c;
.super Ljava/lang/Object;
.source "MediaRouteProvider.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/c/c$1;,
        Landroid/support/v7/c/c$b;,
        Landroid/support/v7/c/c$a;,
        Landroid/support/v7/c/c$d;,
        Landroid/support/v7/c/c$c;
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Landroid/support/v7/c/c$c;

.field private final c:Landroid/support/v7/c/c$b;

.field private d:Landroid/support/v7/c/c$a;

.field private e:Landroid/support/v7/c/b;

.field private f:Z

.field private g:Landroid/support/v7/c/d;

.field private h:Z


# direct methods
.method constructor <init>(Landroid/content/Context;Landroid/support/v7/c/c$c;)V
    .locals 3

    .prologue
    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    new-instance v0, Landroid/support/v7/c/c$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Landroid/support/v7/c/c$b;-><init>(Landroid/support/v7/c/c;Landroid/support/v7/c/c$1;)V

    iput-object v0, p0, Landroid/support/v7/c/c;->c:Landroid/support/v7/c/c$b;

    .line 83
    if-nez p1, :cond_0

    .line 84
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "context must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 87
    :cond_0
    iput-object p1, p0, Landroid/support/v7/c/c;->a:Landroid/content/Context;

    .line 88
    if-nez p2, :cond_1

    .line 89
    new-instance v0, Landroid/support/v7/c/c$c;

    new-instance v1, Landroid/content/ComponentName;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-direct {v1, p1, v2}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-direct {v0, v1}, Landroid/support/v7/c/c$c;-><init>(Landroid/content/ComponentName;)V

    iput-object v0, p0, Landroid/support/v7/c/c;->b:Landroid/support/v7/c/c$c;

    .line 93
    :goto_0
    return-void

    .line 91
    :cond_1
    iput-object p2, p0, Landroid/support/v7/c/c;->b:Landroid/support/v7/c/c$c;

    goto :goto_0
.end method

.method static synthetic a(Landroid/support/v7/c/c;)V
    .locals 0

    .prologue
    .line 57
    invoke-direct {p0}, Landroid/support/v7/c/c;->g()V

    return-void
.end method

.method static synthetic b(Landroid/support/v7/c/c;)V
    .locals 0

    .prologue
    .line 57
    invoke-direct {p0}, Landroid/support/v7/c/c;->f()V

    return-void
.end method

.method private f()V
    .locals 1

    .prologue
    .line 163
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v7/c/c;->f:Z

    .line 164
    iget-object v0, p0, Landroid/support/v7/c/c;->e:Landroid/support/v7/c/b;

    invoke-virtual {p0, v0}, Landroid/support/v7/c/c;->b(Landroid/support/v7/c/b;)V

    .line 165
    return-void
.end method

.method private g()V
    .locals 2

    .prologue
    .line 234
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v7/c/c;->h:Z

    .line 236
    iget-object v0, p0, Landroid/support/v7/c/c;->d:Landroid/support/v7/c/c$a;

    if-eqz v0, :cond_0

    .line 237
    iget-object v0, p0, Landroid/support/v7/c/c;->d:Landroid/support/v7/c/c$a;

    iget-object v1, p0, Landroid/support/v7/c/c;->g:Landroid/support/v7/c/d;

    invoke-virtual {v0, p0, v1}, Landroid/support/v7/c/c$a;->a(Landroid/support/v7/c/c;Landroid/support/v7/c/d;)V

    .line 239
    :cond_0
    return-void
.end method


# virtual methods
.method public final a()Landroid/content/Context;
    .locals 1

    .prologue
    .line 99
    iget-object v0, p0, Landroid/support/v7/c/c;->a:Landroid/content/Context;

    return-object v0
.end method

.method public a(Ljava/lang/String;)Landroid/support/v7/c/c$d;
    .locals 1

    .prologue
    .line 254
    const/4 v0, 0x0

    return-object v0
.end method

.method public final a(Landroid/support/v7/c/b;)V
    .locals 2

    .prologue
    .line 148
    invoke-static {}, Landroid/support/v7/c/g;->e()V

    .line 150
    iget-object v0, p0, Landroid/support/v7/c/c;->e:Landroid/support/v7/c/b;

    if-eq v0, p1, :cond_0

    iget-object v0, p0, Landroid/support/v7/c/c;->e:Landroid/support/v7/c/b;

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroid/support/v7/c/c;->e:Landroid/support/v7/c/b;

    invoke-virtual {v0, p1}, Landroid/support/v7/c/b;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 160
    :cond_0
    :goto_0
    return-void

    .line 155
    :cond_1
    iput-object p1, p0, Landroid/support/v7/c/c;->e:Landroid/support/v7/c/b;

    .line 156
    iget-boolean v0, p0, Landroid/support/v7/c/c;->f:Z

    if-nez v0, :cond_0

    .line 157
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/c/c;->f:Z

    .line 158
    iget-object v0, p0, Landroid/support/v7/c/c;->c:Landroid/support/v7/c/c$b;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/support/v7/c/c$b;->sendEmptyMessage(I)Z

    goto :goto_0
.end method

.method public final a(Landroid/support/v7/c/c$a;)V
    .locals 0

    .prologue
    .line 122
    invoke-static {}, Landroid/support/v7/c/g;->e()V

    .line 123
    iput-object p1, p0, Landroid/support/v7/c/c;->d:Landroid/support/v7/c/c$a;

    .line 124
    return-void
.end method

.method public final a(Landroid/support/v7/c/d;)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 222
    invoke-static {}, Landroid/support/v7/c/g;->e()V

    .line 224
    iget-object v0, p0, Landroid/support/v7/c/c;->g:Landroid/support/v7/c/d;

    if-eq v0, p1, :cond_0

    .line 225
    iput-object p1, p0, Landroid/support/v7/c/c;->g:Landroid/support/v7/c/d;

    .line 226
    iget-boolean v0, p0, Landroid/support/v7/c/c;->h:Z

    if-nez v0, :cond_0

    .line 227
    iput-boolean v1, p0, Landroid/support/v7/c/c;->h:Z

    .line 228
    iget-object v0, p0, Landroid/support/v7/c/c;->c:Landroid/support/v7/c/c$b;

    invoke-virtual {v0, v1}, Landroid/support/v7/c/c$b;->sendEmptyMessage(I)Z

    .line 231
    :cond_0
    return-void
.end method

.method public final b()Landroid/os/Handler;
    .locals 1

    .prologue
    .line 106
    iget-object v0, p0, Landroid/support/v7/c/c;->c:Landroid/support/v7/c/c$b;

    return-object v0
.end method

.method public b(Landroid/support/v7/c/b;)V
    .locals 0

    .prologue
    .line 191
    return-void
.end method

.method public final c()Landroid/support/v7/c/c$c;
    .locals 1

    .prologue
    .line 113
    iget-object v0, p0, Landroid/support/v7/c/c;->b:Landroid/support/v7/c/c$c;

    return-object v0
.end method

.method public final d()Landroid/support/v7/c/b;
    .locals 1

    .prologue
    .line 136
    iget-object v0, p0, Landroid/support/v7/c/c;->e:Landroid/support/v7/c/b;

    return-object v0
.end method

.method public final e()Landroid/support/v7/c/d;
    .locals 1

    .prologue
    .line 207
    iget-object v0, p0, Landroid/support/v7/c/c;->g:Landroid/support/v7/c/d;

    return-object v0
.end method
