.class Lcom/google/android/gms/b/db$a;
.super Lcom/google/android/gms/measurement/AppMeasurement$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/b/db;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field public a:Z


# direct methods
.method public constructor <init>(Lcom/google/android/gms/b/db$a;)V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/measurement/AppMeasurement$f;-><init>()V

    iget-object v0, p1, Lcom/google/android/gms/b/db$a;->b:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/b/db$a;->b:Ljava/lang/String;

    iget-object v0, p1, Lcom/google/android/gms/b/db$a;->c:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/b/db$a;->c:Ljava/lang/String;

    iget-wide v0, p1, Lcom/google/android/gms/b/db$a;->d:J

    iput-wide v0, p0, Lcom/google/android/gms/b/db$a;->d:J

    iget-boolean v0, p1, Lcom/google/android/gms/b/db$a;->a:Z

    iput-boolean v0, p0, Lcom/google/android/gms/b/db$a;->a:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;J)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/measurement/AppMeasurement$f;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/b/db$a;->b:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/b/db$a;->c:Ljava/lang/String;

    iput-wide p3, p0, Lcom/google/android/gms/b/db$a;->d:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/b/db$a;->a:Z

    return-void
.end method
