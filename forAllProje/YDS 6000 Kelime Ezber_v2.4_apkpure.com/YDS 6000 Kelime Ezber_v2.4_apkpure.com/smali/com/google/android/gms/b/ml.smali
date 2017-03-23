.class public Lcom/google/android/gms/b/ml;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/b/mn;


# annotations
.annotation runtime Lcom/google/android/gms/b/vz;
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/b/mj;

.field private final b:Lcom/google/android/gms/b/sw;

.field private final c:Lcom/google/android/gms/b/rq;

.field private final d:Lcom/google/android/gms/b/rq;

.field private final e:Lcom/google/android/gms/b/rq;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/b/mj;Lcom/google/android/gms/b/sw;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/b/ml$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/b/ml$1;-><init>(Lcom/google/android/gms/b/ml;)V

    iput-object v0, p0, Lcom/google/android/gms/b/ml;->c:Lcom/google/android/gms/b/rq;

    new-instance v0, Lcom/google/android/gms/b/ml$2;

    invoke-direct {v0, p0}, Lcom/google/android/gms/b/ml$2;-><init>(Lcom/google/android/gms/b/ml;)V

    iput-object v0, p0, Lcom/google/android/gms/b/ml;->d:Lcom/google/android/gms/b/rq;

    new-instance v0, Lcom/google/android/gms/b/ml$3;

    invoke-direct {v0, p0}, Lcom/google/android/gms/b/ml$3;-><init>(Lcom/google/android/gms/b/ml;)V

    iput-object v0, p0, Lcom/google/android/gms/b/ml;->e:Lcom/google/android/gms/b/rq;

    iput-object p1, p0, Lcom/google/android/gms/b/ml;->a:Lcom/google/android/gms/b/mj;

    iput-object p2, p0, Lcom/google/android/gms/b/ml;->b:Lcom/google/android/gms/b/sw;

    iget-object v0, p0, Lcom/google/android/gms/b/ml;->b:Lcom/google/android/gms/b/sw;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/b/ml;->a(Lcom/google/android/gms/b/sw;)V

    const-string v1, "Custom JS tracking ad unit: "

    iget-object v0, p0, Lcom/google/android/gms/b/ml;->a:Lcom/google/android/gms/b/mj;

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

.method static synthetic a(Lcom/google/android/gms/b/ml;)Lcom/google/android/gms/b/mj;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/ml;->a:Lcom/google/android/gms/b/mj;

    return-object v0
.end method


# virtual methods
.method a(Lcom/google/android/gms/b/sw;)V
    .locals 2

    const-string v0, "/updateActiveView"

    iget-object v1, p0, Lcom/google/android/gms/b/ml;->c:Lcom/google/android/gms/b/rq;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/b/sw;->a(Ljava/lang/String;Lcom/google/android/gms/b/rq;)V

    const-string v0, "/untrackActiveViewUnit"

    iget-object v1, p0, Lcom/google/android/gms/b/ml;->d:Lcom/google/android/gms/b/rq;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/b/sw;->a(Ljava/lang/String;Lcom/google/android/gms/b/rq;)V

    const-string v0, "/visibilityChanged"

    iget-object v1, p0, Lcom/google/android/gms/b/ml;->e:Lcom/google/android/gms/b/rq;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/b/sw;->a(Ljava/lang/String;Lcom/google/android/gms/b/rq;)V

    return-void
.end method

.method public a(Lorg/json/JSONObject;Z)V
    .locals 2

    if-nez p2, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/ml;->b:Lcom/google/android/gms/b/sw;

    const-string v1, "AFMA_updateActiveView"

    invoke-interface {v0, v1, p1}, Lcom/google/android/gms/b/sw;->a(Ljava/lang/String;Lorg/json/JSONObject;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/ml;->a:Lcom/google/android/gms/b/mj;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/b/mj;->b(Lcom/google/android/gms/b/mn;)V

    goto :goto_0
.end method

.method public a()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/ml;->b:Lcom/google/android/gms/b/sw;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/b/ml;->b(Lcom/google/android/gms/b/sw;)V

    return-void
.end method

.method b(Lcom/google/android/gms/b/sw;)V
    .locals 2

    const-string v0, "/visibilityChanged"

    iget-object v1, p0, Lcom/google/android/gms/b/ml;->e:Lcom/google/android/gms/b/rq;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/b/sw;->b(Ljava/lang/String;Lcom/google/android/gms/b/rq;)V

    const-string v0, "/untrackActiveViewUnit"

    iget-object v1, p0, Lcom/google/android/gms/b/ml;->d:Lcom/google/android/gms/b/rq;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/b/sw;->b(Ljava/lang/String;Lcom/google/android/gms/b/rq;)V

    const-string v0, "/updateActiveView"

    iget-object v1, p0, Lcom/google/android/gms/b/ml;->c:Lcom/google/android/gms/b/rq;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/b/sw;->b(Ljava/lang/String;Lcom/google/android/gms/b/rq;)V

    return-void
.end method
