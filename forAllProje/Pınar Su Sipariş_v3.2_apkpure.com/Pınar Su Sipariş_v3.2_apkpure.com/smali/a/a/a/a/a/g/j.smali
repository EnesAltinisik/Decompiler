.class La/a/a/a/a/g/j;
.super Ljava/lang/Object;
.source "DefaultSettingsController.java"

# interfaces
.implements La/a/a/a/a/g/s;


# instance fields
.field private final a:La/a/a/a/a/g/w;

.field private final b:La/a/a/a/a/g/v;

.field private final c:La/a/a/a/a/b/k;

.field private final d:La/a/a/a/a/g/g;

.field private final e:La/a/a/a/a/g/x;

.field private final f:La/a/a/a/i;

.field private final g:La/a/a/a/a/f/c;


# direct methods
.method public constructor <init>(La/a/a/a/i;La/a/a/a/a/g/w;La/a/a/a/a/b/k;La/a/a/a/a/g/v;La/a/a/a/a/g/g;La/a/a/a/a/g/x;)V
    .locals 2

    .prologue
    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    iput-object p1, p0, La/a/a/a/a/g/j;->f:La/a/a/a/i;

    .line 55
    iput-object p2, p0, La/a/a/a/a/g/j;->a:La/a/a/a/a/g/w;

    .line 56
    iput-object p3, p0, La/a/a/a/a/g/j;->c:La/a/a/a/a/b/k;

    .line 57
    iput-object p4, p0, La/a/a/a/a/g/j;->b:La/a/a/a/a/g/v;

    .line 58
    iput-object p5, p0, La/a/a/a/a/g/j;->d:La/a/a/a/a/g/g;

    .line 59
    iput-object p6, p0, La/a/a/a/a/g/j;->e:La/a/a/a/a/g/x;

    .line 60
    new-instance v0, La/a/a/a/a/f/d;

    iget-object v1, p0, La/a/a/a/a/g/j;->f:La/a/a/a/i;

    invoke-direct {v0, v1}, La/a/a/a/a/f/d;-><init>(La/a/a/a/i;)V

    iput-object v0, p0, La/a/a/a/a/g/j;->g:La/a/a/a/a/f/c;

    .line 61
    return-void
.end method

.method private a(Lorg/json/JSONObject;Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 143
    invoke-static {}, La/a/a/a/c;->h()La/a/a/a/l;

    move-result-object v0

    const-string v1, "Fabric"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, La/a/a/a/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    return-void
.end method

.method private b(La/a/a/a/a/g/r;)La/a/a/a/a/g/t;
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 105
    .line 108
    :try_start_0
    sget-object v1, La/a/a/a/a/g/r;->b:La/a/a/a/a/g/r;

    invoke-virtual {v1, p1}, La/a/a/a/a/g/r;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 109
    iget-object v1, p0, La/a/a/a/a/g/j;->d:La/a/a/a/a/g/g;

    invoke-interface {v1}, La/a/a/a/a/g/g;->a()Lorg/json/JSONObject;

    move-result-object v2

    .line 111
    if-eqz v2, :cond_4

    .line 112
    iget-object v1, p0, La/a/a/a/a/g/j;->b:La/a/a/a/a/g/v;

    iget-object v3, p0, La/a/a/a/a/g/j;->c:La/a/a/a/a/b/k;

    invoke-interface {v1, v3, v2}, La/a/a/a/a/g/v;->a(La/a/a/a/a/b/k;Lorg/json/JSONObject;)La/a/a/a/a/g/t;

    move-result-object v1

    .line 115
    if-eqz v1, :cond_3

    .line 116
    const-string v3, "Loaded cached settings: "

    invoke-direct {p0, v2, v3}, La/a/a/a/a/g/j;->a(Lorg/json/JSONObject;Ljava/lang/String;)V

    .line 118
    iget-object v2, p0, La/a/a/a/a/g/j;->c:La/a/a/a/a/b/k;

    invoke-interface {v2}, La/a/a/a/a/b/k;->a()J

    move-result-wide v2

    .line 120
    sget-object v4, La/a/a/a/a/g/r;->c:La/a/a/a/a/g/r;

    invoke-virtual {v4, p1}, La/a/a/a/a/g/r;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-virtual {v1, v2, v3}, La/a/a/a/a/g/t;->a(J)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v2

    if-nez v2, :cond_2

    .line 123
    :cond_0
    :try_start_1
    invoke-static {}, La/a/a/a/c;->h()La/a/a/a/l;

    move-result-object v0

    const-string v2, "Fabric"

    const-string v3, "Returning cached settings."

    invoke-interface {v0, v2, v3}, La/a/a/a/l;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-object v0, v1

    .line 139
    :cond_1
    :goto_0
    return-object v0

    .line 125
    :cond_2
    :try_start_2
    invoke-static {}, La/a/a/a/c;->h()La/a/a/a/l;

    move-result-object v1

    const-string v2, "Fabric"

    const-string v3, "Cached settings have expired."

    invoke-interface {v1, v2, v3}, La/a/a/a/l;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    .line 135
    :catch_0
    move-exception v1

    .line 136
    :goto_1
    invoke-static {}, La/a/a/a/c;->h()La/a/a/a/l;

    move-result-object v2

    const-string v3, "Fabric"

    const-string v4, "Failed to get cached settings"

    invoke-interface {v2, v3, v4, v1}, La/a/a/a/l;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 128
    :cond_3
    :try_start_3
    invoke-static {}, La/a/a/a/c;->h()La/a/a/a/l;

    move-result-object v1

    const-string v2, "Fabric"

    const-string v3, "Failed to transform cached settings data."

    const/4 v4, 0x0

    invoke-interface {v1, v2, v3, v4}, La/a/a/a/l;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 132
    :cond_4
    invoke-static {}, La/a/a/a/c;->h()La/a/a/a/l;

    move-result-object v1

    const-string v2, "Fabric"

    const-string v3, "No cached settings data found."

    invoke-interface {v1, v2, v3}, La/a/a/a/l;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_0

    .line 135
    :catch_1
    move-exception v0

    move-object v5, v0

    move-object v0, v1

    move-object v1, v5

    goto :goto_1
.end method


# virtual methods
.method public a()La/a/a/a/a/g/t;
    .locals 1

    .prologue
    .line 64
    sget-object v0, La/a/a/a/a/g/r;->a:La/a/a/a/a/g/r;

    invoke-virtual {p0, v0}, La/a/a/a/a/g/j;->a(La/a/a/a/a/g/r;)La/a/a/a/a/g/t;

    move-result-object v0

    return-object v0
.end method

.method public a(La/a/a/a/a/g/r;)La/a/a/a/a/g/t;
    .locals 7

    .prologue
    .line 68
    const/4 v1, 0x0

    .line 75
    :try_start_0
    invoke-static {}, La/a/a/a/c;->i()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, La/a/a/a/a/g/j;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 76
    invoke-direct {p0, p1}, La/a/a/a/a/g/j;->b(La/a/a/a/a/g/r;)La/a/a/a/a/g/t;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 79
    :cond_0
    if-nez v1, :cond_1

    .line 80
    :try_start_1
    iget-object v0, p0, La/a/a/a/a/g/j;->e:La/a/a/a/a/g/x;

    iget-object v2, p0, La/a/a/a/a/g/j;->a:La/a/a/a/a/g/w;

    invoke-interface {v0, v2}, La/a/a/a/a/g/x;->a(La/a/a/a/a/g/w;)Lorg/json/JSONObject;

    move-result-object v0

    .line 82
    if-eqz v0, :cond_1

    .line 83
    iget-object v2, p0, La/a/a/a/a/g/j;->b:La/a/a/a/a/g/v;

    iget-object v3, p0, La/a/a/a/a/g/j;->c:La/a/a/a/a/b/k;

    invoke-interface {v2, v3, v0}, La/a/a/a/a/g/v;->a(La/a/a/a/a/b/k;Lorg/json/JSONObject;)La/a/a/a/a/g/t;

    move-result-object v1

    .line 85
    iget-object v2, p0, La/a/a/a/a/g/j;->d:La/a/a/a/a/g/g;

    iget-wide v4, v1, La/a/a/a/a/g/t;->g:J

    invoke-interface {v2, v4, v5, v0}, La/a/a/a/a/g/g;->a(JLorg/json/JSONObject;)V

    .line 86
    const-string v2, "Loaded settings: "

    invoke-direct {p0, v0, v2}, La/a/a/a/a/g/j;->a(Lorg/json/JSONObject;Ljava/lang/String;)V

    .line 89
    invoke-virtual {p0}, La/a/a/a/a/g/j;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, La/a/a/a/a/g/j;->a(Ljava/lang/String;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :cond_1
    move-object v0, v1

    .line 94
    if-nez v0, :cond_2

    .line 95
    :try_start_2
    sget-object v1, La/a/a/a/a/g/r;->c:La/a/a/a/a/g/r;

    invoke-direct {p0, v1}, La/a/a/a/a/g/j;->b(La/a/a/a/a/g/r;)La/a/a/a/a/g/t;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    move-result-object v0

    .line 101
    :cond_2
    :goto_0
    return-object v0

    .line 98
    :catch_0
    move-exception v0

    move-object v6, v0

    move-object v0, v1

    move-object v1, v6

    .line 99
    :goto_1
    invoke-static {}, La/a/a/a/c;->h()La/a/a/a/l;

    move-result-object v2

    const-string v3, "Fabric"

    const-string v4, "Unknown error while loading Crashlytics settings. Crashes will be cached until settings can be retrieved."

    invoke-interface {v2, v3, v4, v1}, La/a/a/a/l;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 98
    :catch_1
    move-exception v0

    move-object v6, v0

    move-object v0, v1

    move-object v1, v6

    goto :goto_1

    :catch_2
    move-exception v1

    goto :goto_1
.end method

.method a(Ljava/lang/String;)Z
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "CommitPrefEdits"
        }
    .end annotation

    .prologue
    .line 157
    iget-object v0, p0, La/a/a/a/a/g/j;->g:La/a/a/a/a/f/c;

    invoke-interface {v0}, La/a/a/a/a/f/c;->b()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 158
    const-string v1, "existing_instance_identifier"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 159
    iget-object v1, p0, La/a/a/a/a/g/j;->g:La/a/a/a/a/f/c;

    invoke-interface {v1, v0}, La/a/a/a/a/f/c;->a(Landroid/content/SharedPreferences$Editor;)Z

    move-result v0

    return v0
.end method

.method b()Ljava/lang/String;
    .locals 3

    .prologue
    .line 147
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    iget-object v2, p0, La/a/a/a/a/g/j;->f:La/a/a/a/i;

    invoke-virtual {v2}, La/a/a/a/i;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, La/a/a/a/a/b/i;->m(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, La/a/a/a/a/b/i;->a([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method c()Ljava/lang/String;
    .locals 3

    .prologue
    .line 151
    iget-object v0, p0, La/a/a/a/a/g/j;->g:La/a/a/a/a/f/c;

    invoke-interface {v0}, La/a/a/a/a/f/c;->a()Landroid/content/SharedPreferences;

    move-result-object v0

    .line 152
    const-string v1, "existing_instance_identifier"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method d()Z
    .locals 2

    .prologue
    .line 163
    invoke-virtual {p0}, La/a/a/a/a/g/j;->c()Ljava/lang/String;

    move-result-object v0

    .line 164
    invoke-virtual {p0}, La/a/a/a/a/g/j;->b()Ljava/lang/String;

    move-result-object v1

    .line 165
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
