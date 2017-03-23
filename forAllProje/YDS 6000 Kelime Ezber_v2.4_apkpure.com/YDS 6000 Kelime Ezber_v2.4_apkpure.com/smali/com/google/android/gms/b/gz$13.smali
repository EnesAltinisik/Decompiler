.class Lcom/google/android/gms/b/gz$13;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/b/gi;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/gz;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;Lcom/google/firebase/database/d$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/gx;

.field final synthetic b:J

.field final synthetic c:Lcom/google/firebase/database/d$a;

.field final synthetic d:Lcom/google/android/gms/b/gz;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/gz;Lcom/google/android/gms/b/gx;JLcom/google/firebase/database/d$a;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/b/gz$13;->d:Lcom/google/android/gms/b/gz;

    iput-object p2, p0, Lcom/google/android/gms/b/gz$13;->a:Lcom/google/android/gms/b/gx;

    iput-wide p3, p0, Lcom/google/android/gms/b/gz$13;->b:J

    iput-object p5, p0, Lcom/google/android/gms/b/gz$13;->c:Lcom/google/firebase/database/d$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    invoke-static {p1, p2}, Lcom/google/android/gms/b/gz;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/database/b;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/gz$13;->d:Lcom/google/android/gms/b/gz;

    const-string v2, "setValue"

    iget-object v3, p0, Lcom/google/android/gms/b/gz$13;->a:Lcom/google/android/gms/b/gx;

    invoke-static {v1, v2, v3, v0}, Lcom/google/android/gms/b/gz;->a(Lcom/google/android/gms/b/gz;Ljava/lang/String;Lcom/google/android/gms/b/gx;Lcom/google/firebase/database/b;)V

    iget-object v1, p0, Lcom/google/android/gms/b/gz$13;->d:Lcom/google/android/gms/b/gz;

    iget-wide v2, p0, Lcom/google/android/gms/b/gz$13;->b:J

    iget-object v4, p0, Lcom/google/android/gms/b/gz$13;->a:Lcom/google/android/gms/b/gx;

    invoke-static {v1, v2, v3, v4, v0}, Lcom/google/android/gms/b/gz;->a(Lcom/google/android/gms/b/gz;JLcom/google/android/gms/b/gx;Lcom/google/firebase/database/b;)V

    iget-object v1, p0, Lcom/google/android/gms/b/gz$13;->d:Lcom/google/android/gms/b/gz;

    iget-object v2, p0, Lcom/google/android/gms/b/gz$13;->c:Lcom/google/firebase/database/d$a;

    iget-object v3, p0, Lcom/google/android/gms/b/gz$13;->a:Lcom/google/android/gms/b/gx;

    invoke-virtual {v1, v2, v0, v3}, Lcom/google/android/gms/b/gz;->a(Lcom/google/firebase/database/d$a;Lcom/google/firebase/database/b;Lcom/google/android/gms/b/gx;)V

    return-void
.end method
