.class Lcom/google/android/gms/b/da$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/b/da;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lcom/google/android/gms/b/da;


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/b/da$1;->b:Lcom/google/android/gms/b/da;

    iget-boolean v1, p0, Lcom/google/android/gms/b/da$1;->a:Z

    invoke-static {v0, v1}, Lcom/google/android/gms/b/da;->a(Lcom/google/android/gms/b/da;Z)V

    return-void
.end method
