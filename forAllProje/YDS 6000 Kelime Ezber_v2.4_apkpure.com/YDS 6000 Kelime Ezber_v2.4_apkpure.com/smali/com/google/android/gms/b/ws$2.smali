.class Lcom/google/android/gms/b/ws$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/ws;->a(Lcom/google/android/gms/b/wf;)Lcom/google/android/gms/b/wi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lorg/json/JSONObject;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/google/android/gms/b/ws;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/ws;Lorg/json/JSONObject;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/ws$2;->c:Lcom/google/android/gms/b/ws;

    iput-object p2, p0, Lcom/google/android/gms/b/ws$2;->a:Lorg/json/JSONObject;

    iput-object p3, p0, Lcom/google/android/gms/b/ws$2;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/b/ws$2;->c:Lcom/google/android/gms/b/ws;

    invoke-static {}, Lcom/google/android/gms/b/ws;->f()Lcom/google/android/gms/b/sv;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/b/sv;->a()Lcom/google/android/gms/b/sv$c;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/b/ws;->a(Lcom/google/android/gms/b/ws;Lcom/google/android/gms/b/sv$c;)Lcom/google/android/gms/b/sv$c;

    iget-object v0, p0, Lcom/google/android/gms/b/ws$2;->c:Lcom/google/android/gms/b/ws;

    invoke-static {v0}, Lcom/google/android/gms/b/ws;->b(Lcom/google/android/gms/b/ws;)Lcom/google/android/gms/b/sv$c;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/b/ws$2$1;

    invoke-direct {v1, p0}, Lcom/google/android/gms/b/ws$2$1;-><init>(Lcom/google/android/gms/b/ws$2;)V

    new-instance v2, Lcom/google/android/gms/b/ws$2$2;

    invoke-direct {v2, p0}, Lcom/google/android/gms/b/ws$2$2;-><init>(Lcom/google/android/gms/b/ws$2;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/b/sv$c;->a(Lcom/google/android/gms/b/aaj$c;Lcom/google/android/gms/b/aaj$a;)V

    return-void
.end method
