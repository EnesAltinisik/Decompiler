.class Lcom/google/android/gms/b/db$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/db;->a(Landroid/app/Activity;Lcom/google/android/gms/b/db$a;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lcom/google/android/gms/b/db$a;

.field final synthetic c:Lcom/google/android/gms/b/db;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/db;ZLcom/google/android/gms/b/db$a;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/db$1;->c:Lcom/google/android/gms/b/db;

    iput-boolean p2, p0, Lcom/google/android/gms/b/db$1;->a:Z

    iput-object p3, p0, Lcom/google/android/gms/b/db$1;->b:Lcom/google/android/gms/b/db$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-boolean v0, p0, Lcom/google/android/gms/b/db$1;->a:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/db$1;->c:Lcom/google/android/gms/b/db;

    iget-object v0, v0, Lcom/google/android/gms/b/db;->a:Lcom/google/android/gms/b/db$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/db$1;->c:Lcom/google/android/gms/b/db;

    iget-object v1, p0, Lcom/google/android/gms/b/db$1;->c:Lcom/google/android/gms/b/db;

    iget-object v1, v1, Lcom/google/android/gms/b/db;->a:Lcom/google/android/gms/b/db$a;

    invoke-static {v0, v1}, Lcom/google/android/gms/b/db;->a(Lcom/google/android/gms/b/db;Lcom/google/android/gms/b/db$a;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/db$1;->c:Lcom/google/android/gms/b/db;

    iget-object v1, p0, Lcom/google/android/gms/b/db$1;->b:Lcom/google/android/gms/b/db$a;

    iput-object v1, v0, Lcom/google/android/gms/b/db;->a:Lcom/google/android/gms/b/db$a;

    iget-object v0, p0, Lcom/google/android/gms/b/db$1;->c:Lcom/google/android/gms/b/db;

    invoke-virtual {v0}, Lcom/google/android/gms/b/db;->k()Lcom/google/android/gms/b/dc;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/db$1;->b:Lcom/google/android/gms/b/db$a;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/dc;->a(Lcom/google/android/gms/measurement/AppMeasurement$f;)V

    return-void
.end method
