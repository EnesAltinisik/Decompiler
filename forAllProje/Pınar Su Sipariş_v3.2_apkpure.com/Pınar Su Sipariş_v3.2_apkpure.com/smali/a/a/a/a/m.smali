.class La/a/a/a/m;
.super La/a/a/a/i;
.source "Onboarding.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/a/a/a/i",
        "<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:La/a/a/a/a/e/e;

.field private b:Landroid/content/pm/PackageManager;

.field private c:Ljava/lang/String;

.field private d:Landroid/content/pm/PackageInfo;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private final j:Ljava/util/concurrent/Future;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Future",
            "<",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "La/a/a/a/k;",
            ">;>;"
        }
    .end annotation
.end field

.field private final k:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection",
            "<",
            "La/a/a/a/i;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Future;Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Future",
            "<",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "La/a/a/a/k;",
            ">;>;",
            "Ljava/util/Collection",
            "<",
            "La/a/a/a/i;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 61
    invoke-direct {p0}, La/a/a/a/i;-><init>()V

    .line 62
    new-instance v0, La/a/a/a/a/e/b;

    invoke-direct {v0}, La/a/a/a/a/e/b;-><init>()V

    iput-object v0, p0, La/a/a/a/m;->a:La/a/a/a/a/e/e;

    .line 63
    iput-object p1, p0, La/a/a/a/m;->j:Ljava/util/concurrent/Future;

    .line 64
    iput-object p2, p0, La/a/a/a/m;->k:Ljava/util/Collection;

    .line 65
    return-void
.end method

.method private a(La/a/a/a/a/g/n;Ljava/util/Collection;)La/a/a/a/a/g/d;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La/a/a/a/a/g/n;",
            "Ljava/util/Collection",
            "<",
            "La/a/a/a/k;",
            ">;)",
            "La/a/a/a/a/g/d;"
        }
    .end annotation

    .prologue
    .line 208
    invoke-virtual {p0}, La/a/a/a/m;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 209
    new-instance v1, La/a/a/a/a/b/g;

    invoke-direct {v1}, La/a/a/a/a/b/g;-><init>()V

    invoke-virtual {v1, v0}, La/a/a/a/a/b/g;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    .line 210
    invoke-static {v0}, La/a/a/a/a/b/i;->m(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 212
    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    invoke-static {v2}, La/a/a/a/a/b/i;->a([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 213
    iget-object v0, p0, La/a/a/a/m;->g:Ljava/lang/String;

    invoke-static {v0}, La/a/a/a/a/b/l;->a(Ljava/lang/String;)La/a/a/a/a/b/l;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/a/a/b/l;->a()I

    move-result v7

    .line 214
    invoke-virtual {p0}, La/a/a/a/m;->getIdManager()La/a/a/a/a/b/o;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/a/a/b/o;->c()Ljava/lang/String;

    move-result-object v2

    .line 216
    new-instance v0, La/a/a/a/a/g/d;

    iget-object v3, p0, La/a/a/a/m;->f:Ljava/lang/String;

    iget-object v4, p0, La/a/a/a/m;->e:Ljava/lang/String;

    iget-object v6, p0, La/a/a/a/m;->h:Ljava/lang/String;

    iget-object v8, p0, La/a/a/a/m;->i:Ljava/lang/String;

    const-string v9, "0"

    move-object v10, p1

    move-object v11, p2

    invoke-direct/range {v0 .. v11}, La/a/a/a/a/g/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;La/a/a/a/a/g/n;Ljava/util/Collection;)V

    return-object v0
.end method

.method private a(La/a/a/a/a/g/e;La/a/a/a/a/g/n;Ljava/util/Collection;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La/a/a/a/a/g/e;",
            "La/a/a/a/a/g/n;",
            "Ljava/util/Collection",
            "<",
            "La/a/a/a/k;",
            ">;)Z"
        }
    .end annotation

    .prologue
    .line 202
    invoke-direct {p0, p2, p3}, La/a/a/a/m;->a(La/a/a/a/a/g/n;Ljava/util/Collection;)La/a/a/a/a/g/d;

    move-result-object v0

    .line 203
    new-instance v1, La/a/a/a/a/g/y;

    invoke-virtual {p0}, La/a/a/a/m;->b()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p1, La/a/a/a/a/g/e;->c:Ljava/lang/String;

    iget-object v4, p0, La/a/a/a/m;->a:La/a/a/a/a/e/e;

    invoke-direct {v1, p0, v2, v3, v4}, La/a/a/a/a/g/y;-><init>(La/a/a/a/i;Ljava/lang/String;Ljava/lang/String;La/a/a/a/a/e/e;)V

    invoke-virtual {v1, v0}, La/a/a/a/a/g/y;->a(La/a/a/a/a/g/d;)Z

    move-result v0

    return v0
.end method

.method private a(Ljava/lang/String;La/a/a/a/a/g/e;Ljava/util/Collection;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "La/a/a/a/a/g/e;",
            "Ljava/util/Collection",
            "<",
            "La/a/a/a/k;",
            ">;)Z"
        }
    .end annotation

    .prologue
    .line 153
    const/4 v0, 0x1

    .line 155
    const-string v1, "new"

    iget-object v2, p2, La/a/a/a/a/g/e;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 157
    invoke-direct {p0, p1, p2, p3}, La/a/a/a/m;->b(Ljava/lang/String;La/a/a/a/a/g/e;Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 160
    invoke-static {}, La/a/a/a/a/g/q;->a()La/a/a/a/a/g/q;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/a/a/g/q;->d()Z

    move-result v0

    .line 178
    :cond_0
    :goto_0
    return v0

    .line 163
    :cond_1
    invoke-static {}, La/a/a/a/c;->h()La/a/a/a/l;

    move-result-object v0

    const-string v1, "Fabric"

    const-string v2, "Failed to create app with Crashlytics service."

    const/4 v3, 0x0

    invoke-interface {v0, v1, v2, v3}, La/a/a/a/l;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 165
    const/4 v0, 0x0

    goto :goto_0

    .line 167
    :cond_2
    const-string v1, "configured"

    iget-object v2, p2, La/a/a/a/a/g/e;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 169
    invoke-static {}, La/a/a/a/a/g/q;->a()La/a/a/a/a/g/q;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/a/a/g/q;->d()Z

    move-result v0

    goto :goto_0

    .line 170
    :cond_3
    iget-boolean v1, p2, La/a/a/a/a/g/e;->e:Z

    if-eqz v1, :cond_0

    .line 173
    invoke-static {}, La/a/a/a/c;->h()La/a/a/a/l;

    move-result-object v1

    const-string v2, "Fabric"

    const-string v3, "Server says an update is required - forcing a full App update."

    invoke-interface {v1, v2, v3}, La/a/a/a/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 175
    invoke-direct {p0, p1, p2, p3}, La/a/a/a/m;->c(Ljava/lang/String;La/a/a/a/a/g/e;Ljava/util/Collection;)Z

    goto :goto_0
.end method

.method private b(Ljava/lang/String;La/a/a/a/a/g/e;Ljava/util/Collection;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "La/a/a/a/a/g/e;",
            "Ljava/util/Collection",
            "<",
            "La/a/a/a/k;",
            ">;)Z"
        }
    .end annotation

    .prologue
    .line 183
    invoke-virtual {p0}, La/a/a/a/m;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, La/a/a/a/a/g/n;->a(Landroid/content/Context;Ljava/lang/String;)La/a/a/a/a/g/n;

    move-result-object v0

    invoke-direct {p0, v0, p3}, La/a/a/a/m;->a(La/a/a/a/a/g/n;Ljava/util/Collection;)La/a/a/a/a/g/d;

    move-result-object v0

    .line 185
    new-instance v1, La/a/a/a/a/g/h;

    invoke-virtual {p0}, La/a/a/a/m;->b()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p2, La/a/a/a/a/g/e;->c:Ljava/lang/String;

    iget-object v4, p0, La/a/a/a/m;->a:La/a/a/a/a/e/e;

    invoke-direct {v1, p0, v2, v3, v4}, La/a/a/a/a/g/h;-><init>(La/a/a/a/i;Ljava/lang/String;Ljava/lang/String;La/a/a/a/a/e/e;)V

    invoke-virtual {v1, v0}, La/a/a/a/a/g/h;->a(La/a/a/a/a/g/d;)Z

    move-result v0

    return v0
.end method

.method private c()La/a/a/a/a/g/t;
    .locals 7

    .prologue
    .line 123
    :try_start_0
    invoke-static {}, La/a/a/a/a/g/q;->a()La/a/a/a/a/g/q;

    move-result-object v0

    iget-object v2, p0, La/a/a/a/m;->idManager:La/a/a/a/a/b/o;

    iget-object v3, p0, La/a/a/a/m;->a:La/a/a/a/a/e/e;

    iget-object v4, p0, La/a/a/a/m;->e:Ljava/lang/String;

    iget-object v5, p0, La/a/a/a/m;->f:Ljava/lang/String;

    invoke-virtual {p0}, La/a/a/a/m;->b()Ljava/lang/String;

    move-result-object v6

    move-object v1, p0

    invoke-virtual/range {v0 .. v6}, La/a/a/a/a/g/q;->a(La/a/a/a/i;La/a/a/a/a/b/o;La/a/a/a/a/e/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)La/a/a/a/a/g/q;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/a/a/g/q;->c()Z

    .line 128
    invoke-static {}, La/a/a/a/a/g/q;->a()La/a/a/a/a/g/q;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/a/a/g/q;->b()La/a/a/a/a/g/t;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 131
    :goto_0
    return-object v0

    .line 129
    :catch_0
    move-exception v0

    .line 130
    invoke-static {}, La/a/a/a/c;->h()La/a/a/a/l;

    move-result-object v1

    const-string v2, "Fabric"

    const-string v3, "Error dealing with settings"

    invoke-interface {v1, v2, v3, v0}, La/a/a/a/l;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 131
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private c(Ljava/lang/String;La/a/a/a/a/g/e;Ljava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "La/a/a/a/a/g/e;",
            "Ljava/util/Collection",
            "<",
            "La/a/a/a/k;",
            ">;)Z"
        }
    .end annotation

    .prologue
    .line 194
    invoke-virtual {p0}, La/a/a/a/m;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, La/a/a/a/a/g/n;->a(Landroid/content/Context;Ljava/lang/String;)La/a/a/a/a/g/n;

    move-result-object v0

    invoke-direct {p0, p2, v0, p3}, La/a/a/a/m;->a(La/a/a/a/a/g/e;La/a/a/a/a/g/n;Ljava/util/Collection;)Z

    move-result v0

    return v0
.end method


# virtual methods
.method protected a()Ljava/lang/Boolean;
    .locals 5

    .prologue
    .line 97
    invoke-virtual {p0}, La/a/a/a/m;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, La/a/a/a/a/b/i;->k(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    .line 98
    const/4 v1, 0x0

    .line 99
    invoke-direct {p0}, La/a/a/a/m;->c()La/a/a/a/a/g/t;

    move-result-object v3

    .line 101
    if-eqz v3, :cond_1

    .line 104
    :try_start_0
    iget-object v0, p0, La/a/a/a/m;->j:Ljava/util/concurrent/Future;

    if-eqz v0, :cond_0

    .line 105
    iget-object v0, p0, La/a/a/a/m;->j:Ljava/util/concurrent/Future;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    .line 111
    :goto_0
    iget-object v4, p0, La/a/a/a/m;->k:Ljava/util/Collection;

    invoke-virtual {p0, v0, v4}, La/a/a/a/m;->a(Ljava/util/Map;Ljava/util/Collection;)Ljava/util/Map;

    move-result-object v0

    .line 112
    iget-object v3, v3, La/a/a/a/a/g/t;->a:La/a/a/a/a/g/e;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-direct {p0, v2, v3, v0}, La/a/a/a/m;->a(Ljava/lang/String;La/a/a/a/a/g/e;Ljava/util/Collection;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 118
    :goto_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 107
    :cond_0
    :try_start_1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    .line 114
    :catch_0
    move-exception v0

    .line 115
    invoke-static {}, La/a/a/a/c;->h()La/a/a/a/l;

    move-result-object v2

    const-string v3, "Fabric"

    const-string v4, "Error performing auto configuration."

    invoke-interface {v2, v3, v4, v0}, La/a/a/a/l;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    move v0, v1

    goto :goto_1
.end method

.method a(Ljava/util/Map;Ljava/util/Collection;)Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "La/a/a/a/k;",
            ">;",
            "Ljava/util/Collection",
            "<",
            "La/a/a/a/i;",
            ">;)",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "La/a/a/a/k;",
            ">;"
        }
    .end annotation

    .prologue
    .line 137
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/a/a/a/i;

    .line 138
    invoke-virtual {v0}, La/a/a/a/i;->getIdentifier()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 139
    invoke-virtual {v0}, La/a/a/a/i;->getIdentifier()Ljava/lang/String;

    move-result-object v2

    new-instance v3, La/a/a/a/k;

    invoke-virtual {v0}, La/a/a/a/i;->getIdentifier()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, La/a/a/a/i;->getVersion()Ljava/lang/String;

    move-result-object v0

    const-string v5, "binary"

    invoke-direct {v3, v4, v0, v5}, La/a/a/a/k;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 143
    :cond_1
    return-object p1
.end method

.method b()Ljava/lang/String;
    .locals 2

    .prologue
    .line 221
    invoke-virtual {p0}, La/a/a/a/m;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "com.crashlytics.ApiEndpoint"

    invoke-static {v0, v1}, La/a/a/a/a/b/i;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic doInBackground()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 45
    invoke-virtual {p0}, La/a/a/a/m;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public getIdentifier()Ljava/lang/String;
    .locals 1

    .prologue
    .line 148
    const-string v0, "io.fabric.sdk.android:fabric"

    return-object v0
.end method

.method public getVersion()Ljava/lang/String;
    .locals 1

    .prologue
    .line 69
    const-string v0, "1.3.10.97"

    return-object v0
.end method

.method protected onPreExecute()Z
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 75
    :try_start_0
    invoke-virtual {p0}, La/a/a/a/m;->getIdManager()La/a/a/a/a/b/o;

    move-result-object v1

    invoke-virtual {v1}, La/a/a/a/a/b/o;->j()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, La/a/a/a/m;->g:Ljava/lang/String;

    .line 76
    invoke-virtual {p0}, La/a/a/a/m;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    iput-object v1, p0, La/a/a/a/m;->b:Landroid/content/pm/PackageManager;

    .line 77
    invoke-virtual {p0}, La/a/a/a/m;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, La/a/a/a/m;->c:Ljava/lang/String;

    .line 78
    iget-object v1, p0, La/a/a/a/m;->b:Landroid/content/pm/PackageManager;

    iget-object v2, p0, La/a/a/a/m;->c:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    iput-object v1, p0, La/a/a/a/m;->d:Landroid/content/pm/PackageInfo;

    .line 79
    iget-object v1, p0, La/a/a/a/m;->d:Landroid/content/pm/PackageInfo;

    iget v1, v1, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, La/a/a/a/m;->e:Ljava/lang/String;

    .line 80
    iget-object v1, p0, La/a/a/a/m;->d:Landroid/content/pm/PackageInfo;

    iget-object v1, v1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    if-nez v1, :cond_0

    const-string v1, "0.0"

    :goto_0
    iput-object v1, p0, La/a/a/a/m;->f:Ljava/lang/String;

    .line 82
    iget-object v1, p0, La/a/a/a/m;->b:Landroid/content/pm/PackageManager;

    invoke-virtual {p0}, La/a/a/a/m;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, La/a/a/a/m;->h:Ljava/lang/String;

    .line 85
    invoke-virtual {p0}, La/a/a/a/m;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    iget v1, v1, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, La/a/a/a/m;->i:Ljava/lang/String;

    .line 88
    const/4 v0, 0x1

    .line 92
    :goto_1
    return v0

    .line 80
    :cond_0
    iget-object v1, p0, La/a/a/a/m;->d:Landroid/content/pm/PackageInfo;

    iget-object v1, v1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 89
    :catch_0
    move-exception v1

    .line 90
    invoke-static {}, La/a/a/a/c;->h()La/a/a/a/l;

    move-result-object v2

    const-string v3, "Fabric"

    const-string v4, "Failed init"

    invoke-interface {v2, v3, v4, v1}, La/a/a/a/l;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method
