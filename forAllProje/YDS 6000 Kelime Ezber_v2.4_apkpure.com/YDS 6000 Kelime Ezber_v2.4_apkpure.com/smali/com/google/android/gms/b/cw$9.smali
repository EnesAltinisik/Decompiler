.class Lcom/google/android/gms/b/cw$9;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/cw;->a(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:J

.field final synthetic e:Lcom/google/android/gms/b/cw;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/cw;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/b/cw$9;->e:Lcom/google/android/gms/b/cw;

    iput-object p2, p0, Lcom/google/android/gms/b/cw$9;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/b/cw$9;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/b/cw$9;->c:Ljava/lang/String;

    iput-wide p5, p0, Lcom/google/android/gms/b/cw$9;->d:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/b/cw$9;->a:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/cw$9;->e:Lcom/google/android/gms/b/cw;

    invoke-static {v0}, Lcom/google/android/gms/b/cw;->a(Lcom/google/android/gms/b/cw;)Lcom/google/android/gms/b/cv;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/cv;->u()Lcom/google/android/gms/b/db;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/cw$9;->b:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/b/db;->a(Ljava/lang/String;Lcom/google/android/gms/measurement/AppMeasurement$f;)V

    :goto_0
    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/measurement/AppMeasurement$f;

    invoke-direct {v0}, Lcom/google/android/gms/measurement/AppMeasurement$f;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/b/cw$9;->c:Ljava/lang/String;

    iput-object v1, v0, Lcom/google/android/gms/measurement/AppMeasurement$f;->b:Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/gms/b/cw$9;->a:Ljava/lang/String;

    iput-object v1, v0, Lcom/google/android/gms/measurement/AppMeasurement$f;->c:Ljava/lang/String;

    iget-wide v2, p0, Lcom/google/android/gms/b/cw$9;->d:J

    iput-wide v2, v0, Lcom/google/android/gms/measurement/AppMeasurement$f;->d:J

    iget-object v1, p0, Lcom/google/android/gms/b/cw$9;->e:Lcom/google/android/gms/b/cw;

    invoke-static {v1}, Lcom/google/android/gms/b/cw;->a(Lcom/google/android/gms/b/cw;)Lcom/google/android/gms/b/cv;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/b/cv;->u()Lcom/google/android/gms/b/db;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/b/cw$9;->b:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/b/db;->a(Ljava/lang/String;Lcom/google/android/gms/measurement/AppMeasurement$f;)V

    goto :goto_0
.end method
