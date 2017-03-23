.class Lcom/google/android/gms/b/dd$1$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/dd$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/dd$1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/dd$1;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/dd$1$1;->a:Lcom/google/android/gms/b/dd$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/b/dd$1$1;->a:Lcom/google/android/gms/b/dd$1;

    iget-object v0, v0, Lcom/google/android/gms/b/dd$1;->d:Lcom/google/android/gms/b/dd;

    invoke-static {v0}, Lcom/google/android/gms/b/dd;->a(Lcom/google/android/gms/b/dd;)Lcom/google/android/gms/b/dd$a;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/dd$1$1;->a:Lcom/google/android/gms/b/dd$1;

    iget v1, v1, Lcom/google/android/gms/b/dd$1;->b:I

    invoke-interface {v0, v1}, Lcom/google/android/gms/b/dd$a;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/dd$1$1;->a:Lcom/google/android/gms/b/dd$1;

    iget-object v0, v0, Lcom/google/android/gms/b/dd$1;->a:Lcom/google/android/gms/b/cv;

    invoke-virtual {v0}, Lcom/google/android/gms/b/cv;->d()Lcom/google/android/gms/b/by;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/by;->R()Z

    iget-object v0, p0, Lcom/google/android/gms/b/dd$1$1;->a:Lcom/google/android/gms/b/dd$1;

    iget-object v0, v0, Lcom/google/android/gms/b/dd$1;->c:Lcom/google/android/gms/b/co;

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->D()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v1, "Local AppMeasurementService processed last upload request"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
