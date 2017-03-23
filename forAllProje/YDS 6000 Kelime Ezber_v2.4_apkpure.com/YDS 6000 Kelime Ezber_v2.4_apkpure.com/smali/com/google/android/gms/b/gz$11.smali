.class Lcom/google/android/gms/b/gz$11;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/b/gi;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/gz;->a(Lcom/google/android/gms/b/ib;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/hl;

.field final synthetic b:Lcom/google/android/gms/b/gz;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/gz;Lcom/google/android/gms/b/hl;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/gz$11;->b:Lcom/google/android/gms/b/gz;

    iput-object p2, p0, Lcom/google/android/gms/b/gz$11;->a:Lcom/google/android/gms/b/hl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    invoke-static {p1, p2}, Lcom/google/android/gms/b/gz;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/database/b;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/gz$11;->b:Lcom/google/android/gms/b/gz;

    const-string v2, "Persisted write"

    iget-object v3, p0, Lcom/google/android/gms/b/gz$11;->a:Lcom/google/android/gms/b/hl;

    invoke-virtual {v3}, Lcom/google/android/gms/b/hl;->b()Lcom/google/android/gms/b/gx;

    move-result-object v3

    invoke-static {v1, v2, v3, v0}, Lcom/google/android/gms/b/gz;->a(Lcom/google/android/gms/b/gz;Ljava/lang/String;Lcom/google/android/gms/b/gx;Lcom/google/firebase/database/b;)V

    iget-object v1, p0, Lcom/google/android/gms/b/gz$11;->b:Lcom/google/android/gms/b/gz;

    iget-object v2, p0, Lcom/google/android/gms/b/gz$11;->a:Lcom/google/android/gms/b/hl;

    invoke-virtual {v2}, Lcom/google/android/gms/b/hl;->a()J

    move-result-wide v2

    iget-object v4, p0, Lcom/google/android/gms/b/gz$11;->a:Lcom/google/android/gms/b/hl;

    invoke-virtual {v4}, Lcom/google/android/gms/b/hl;->b()Lcom/google/android/gms/b/gx;

    move-result-object v4

    invoke-static {v1, v2, v3, v4, v0}, Lcom/google/android/gms/b/gz;->a(Lcom/google/android/gms/b/gz;JLcom/google/android/gms/b/gx;Lcom/google/firebase/database/b;)V

    return-void
.end method
