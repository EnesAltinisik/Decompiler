.class Lcom/google/android/gms/b/rr$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/rr;->a(Lcom/google/android/gms/b/aaq;Ljava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/Map;

.field final synthetic b:Lcom/google/android/gms/b/aaq;

.field final synthetic c:Lcom/google/android/gms/b/rr;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/rr;Ljava/util/Map;Lcom/google/android/gms/b/aaq;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/rr$1;->c:Lcom/google/android/gms/b/rr;

    iput-object p2, p0, Lcom/google/android/gms/b/rr$1;->a:Ljava/util/Map;

    iput-object p3, p0, Lcom/google/android/gms/b/rr$1;->b:Lcom/google/android/gms/b/aaq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    const-string v0, "Received Http request."

    invoke-static {v0}, Lcom/google/android/gms/b/ze;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/b/rr$1;->a:Ljava/util/Map;

    const-string v1, "http_request"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/gms/b/rr$1;->c:Lcom/google/android/gms/b/rr;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/b/rr;->a(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "Response should not be null."

    invoke-static {v0}, Lcom/google/android/gms/b/ze;->c(Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    sget-object v1, Lcom/google/android/gms/b/zi;->a:Landroid/os/Handler;

    new-instance v2, Lcom/google/android/gms/b/rr$1$1;

    invoke-direct {v2, p0, v0}, Lcom/google/android/gms/b/rr$1$1;-><init>(Lcom/google/android/gms/b/rr$1;Lorg/json/JSONObject;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method
