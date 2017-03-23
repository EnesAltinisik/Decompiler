.class Lcom/google/android/gms/b/vp$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/vp;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/yu;

.field final synthetic b:Lcom/google/android/gms/b/vp;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/vp;Lcom/google/android/gms/b/yu;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/vp$1;->b:Lcom/google/android/gms/b/vp;

    iput-object p2, p0, Lcom/google/android/gms/b/vp$1;->a:Lcom/google/android/gms/b/yu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/b/vp$1;->b:Lcom/google/android/gms/b/vp;

    invoke-static {v0}, Lcom/google/android/gms/b/vp;->a(Lcom/google/android/gms/b/vp;)Lcom/google/android/gms/b/vk$a;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/vp$1;->a:Lcom/google/android/gms/b/yu;

    invoke-interface {v0, v1}, Lcom/google/android/gms/b/vk$a;->b(Lcom/google/android/gms/b/yu;)V

    return-void
.end method
