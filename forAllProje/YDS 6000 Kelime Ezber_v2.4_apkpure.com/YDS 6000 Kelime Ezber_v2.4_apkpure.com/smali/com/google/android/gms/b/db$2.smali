.class Lcom/google/android/gms/b/db$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/db;->c(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/db$a;

.field final synthetic b:Lcom/google/android/gms/b/db;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/db;Lcom/google/android/gms/b/db$a;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/db$2;->b:Lcom/google/android/gms/b/db;

    iput-object p2, p0, Lcom/google/android/gms/b/db$2;->a:Lcom/google/android/gms/b/db$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/google/android/gms/b/db$2;->b:Lcom/google/android/gms/b/db;

    iget-object v1, p0, Lcom/google/android/gms/b/db$2;->a:Lcom/google/android/gms/b/db$a;

    invoke-static {v0, v1}, Lcom/google/android/gms/b/db;->a(Lcom/google/android/gms/b/db;Lcom/google/android/gms/b/db$a;)V

    iget-object v0, p0, Lcom/google/android/gms/b/db$2;->b:Lcom/google/android/gms/b/db;

    iput-object v2, v0, Lcom/google/android/gms/b/db;->a:Lcom/google/android/gms/b/db$a;

    iget-object v0, p0, Lcom/google/android/gms/b/db$2;->b:Lcom/google/android/gms/b/db;

    invoke-virtual {v0}, Lcom/google/android/gms/b/db;->k()Lcom/google/android/gms/b/dc;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/google/android/gms/b/dc;->a(Lcom/google/android/gms/measurement/AppMeasurement$f;)V

    return-void
.end method
