.class public Lcom/google/android/gms/b/mm;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/b/mn;


# annotations
.annotation runtime Lcom/google/android/gms/b/vz;
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/b/mj;

.field private b:Lcom/google/android/gms/b/sv$c;

.field private c:Z

.field private final d:Lcom/google/android/gms/b/rq;

.field private final e:Lcom/google/android/gms/b/rq;

.field private final f:Lcom/google/android/gms/b/rq;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/b/mj;Lcom/google/android/gms/b/sv;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/b/mm$5;

    invoke-direct {v0, p0}, Lcom/google/android/gms/b/mm$5;-><init>(Lcom/google/android/gms/b/mm;)V

    iput-object v0, p0, Lcom/google/android/gms/b/mm;->d:Lcom/google/android/gms/b/rq;

    new-instance v0, Lcom/google/android/gms/b/mm$6;

    invoke-direct {v0, p0}, Lcom/google/android/gms/b/mm$6;-><init>(Lcom/google/android/gms/b/mm;)V

    iput-object v0, p0, Lcom/google/android/gms/b/mm;->e:Lcom/google/android/gms/b/rq;

    new-instance v0, Lcom/google/android/gms/b/mm$7;

    invoke-direct {v0, p0}, Lcom/google/android/gms/b/mm$7;-><init>(Lcom/google/android/gms/b/mm;)V

    iput-object v0, p0, Lcom/google/android/gms/b/mm;->f:Lcom/google/android/gms/b/rq;

    iput-object p1, p0, Lcom/google/android/gms/b/mm;->a:Lcom/google/android/gms/b/mj;

    invoke-virtual {p2}, Lcom/google/android/gms/b/sv;->a()Lcom/google/android/gms/b/sv$c;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/mm;->b:Lcom/google/android/gms/b/sv$c;

    iget-object v0, p0, Lcom/google/android/gms/b/mm;->b:Lcom/google/android/gms/b/sv$c;

    new-instance v1, Lcom/google/android/gms/b/mm$1;

    invoke-direct {v1, p0}, Lcom/google/android/gms/b/mm$1;-><init>(Lcom/google/android/gms/b/mm;)V

    new-instance v2, Lcom/google/android/gms/b/mm$2;

    invoke-direct {v2, p0}, Lcom/google/android/gms/b/mm$2;-><init>(Lcom/google/android/gms/b/mm;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/b/sv$c;->a(Lcom/google/android/gms/b/aaj$c;Lcom/google/android/gms/b/aaj$a;)V

    const-string v1, "Core JS tracking ad unit: "

    iget-object v0, p0, Lcom/google/android/gms/b/mm;->a:Lcom/google/android/gms/b/mj;

    invoke-virtual {v0}, Lcom/google/android/gms/b/mj;->r()Lcom/google/android/gms/b/mh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/mh;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/b/ze;->b(Ljava/lang/String;)V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_0
.end method

.method static synthetic a(Lcom/google/android/gms/b/mm;)Lcom/google/android/gms/b/mj;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/mm;->a:Lcom/google/android/gms/b/mj;

    return-object v0
.end method

.method static synthetic a(Lcom/google/android/gms/b/mm;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/b/mm;->c:Z

    return p1
.end method


# virtual methods
.method a(Lcom/google/android/gms/b/sw;)V
    .locals 2

    const-string v0, "/updateActiveView"

    iget-object v1, p0, Lcom/google/android/gms/b/mm;->d:Lcom/google/android/gms/b/rq;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/b/sw;->a(Ljava/lang/String;Lcom/google/android/gms/b/rq;)V

    const-string v0, "/untrackActiveViewUnit"

    iget-object v1, p0, Lcom/google/android/gms/b/mm;->e:Lcom/google/android/gms/b/rq;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/b/sw;->a(Ljava/lang/String;Lcom/google/android/gms/b/rq;)V

    const-string v0, "/visibilityChanged"

    iget-object v1, p0, Lcom/google/android/gms/b/mm;->f:Lcom/google/android/gms/b/rq;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/b/sw;->a(Ljava/lang/String;Lcom/google/android/gms/b/rq;)V

    return-void
.end method

.method public a(Lorg/json/JSONObject;Z)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/b/mm;->b:Lcom/google/android/gms/b/sv$c;

    new-instance v1, Lcom/google/android/gms/b/mm$3;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/b/mm$3;-><init>(Lcom/google/android/gms/b/mm;Lorg/json/JSONObject;)V

    new-instance v2, Lcom/google/android/gms/b/aaj$b;

    invoke-direct {v2}, Lcom/google/android/gms/b/aaj$b;-><init>()V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/b/sv$c;->a(Lcom/google/android/gms/b/aaj$c;Lcom/google/android/gms/b/aaj$a;)V

    return-void
.end method

.method public a()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/b/mm;->c:Z

    return v0
.end method

.method public b()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/b/mm;->b:Lcom/google/android/gms/b/sv$c;

    new-instance v1, Lcom/google/android/gms/b/mm$4;

    invoke-direct {v1, p0}, Lcom/google/android/gms/b/mm$4;-><init>(Lcom/google/android/gms/b/mm;)V

    new-instance v2, Lcom/google/android/gms/b/aaj$b;

    invoke-direct {v2}, Lcom/google/android/gms/b/aaj$b;-><init>()V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/b/sv$c;->a(Lcom/google/android/gms/b/aaj$c;Lcom/google/android/gms/b/aaj$a;)V

    iget-object v0, p0, Lcom/google/android/gms/b/mm;->b:Lcom/google/android/gms/b/sv$c;

    invoke-virtual {v0}, Lcom/google/android/gms/b/sv$c;->g_()V

    return-void
.end method

.method b(Lcom/google/android/gms/b/sw;)V
    .locals 2

    const-string v0, "/visibilityChanged"

    iget-object v1, p0, Lcom/google/android/gms/b/mm;->f:Lcom/google/android/gms/b/rq;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/b/sw;->b(Ljava/lang/String;Lcom/google/android/gms/b/rq;)V

    const-string v0, "/untrackActiveViewUnit"

    iget-object v1, p0, Lcom/google/android/gms/b/mm;->e:Lcom/google/android/gms/b/rq;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/b/sw;->b(Ljava/lang/String;Lcom/google/android/gms/b/rq;)V

    const-string v0, "/updateActiveView"

    iget-object v1, p0, Lcom/google/android/gms/b/mm;->d:Lcom/google/android/gms/b/rq;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/b/sw;->b(Ljava/lang/String;Lcom/google/android/gms/b/rq;)V

    return-void
.end method
