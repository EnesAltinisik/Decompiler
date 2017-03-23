.class Lcom/google/android/gms/b/cq$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/cq;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lcom/google/android/gms/b/cq;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/cq;Z)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/cq$1;->b:Lcom/google/android/gms/b/cq;

    iput-boolean p2, p0, Lcom/google/android/gms/b/cq$1;->a:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/b/cq$1;->b:Lcom/google/android/gms/b/cq;

    invoke-static {v0}, Lcom/google/android/gms/b/cq;->a(Lcom/google/android/gms/b/cq;)Lcom/google/android/gms/b/cv;

    move-result-object v0

    iget-boolean v1, p0, Lcom/google/android/gms/b/cq$1;->a:Z

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/cv;->a(Z)V

    return-void
.end method
