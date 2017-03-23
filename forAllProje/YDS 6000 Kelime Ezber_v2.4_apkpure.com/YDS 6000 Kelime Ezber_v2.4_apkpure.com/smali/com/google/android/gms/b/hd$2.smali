.class final Lcom/google/android/gms/b/hd$2;
.super Lcom/google/android/gms/b/jf$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/hd;->a(Lcom/google/android/gms/b/jr;Ljava/util/Map;)Lcom/google/android/gms/b/jr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/Map;

.field final synthetic b:Lcom/google/android/gms/b/he;


# direct methods
.method constructor <init>(Ljava/util/Map;Lcom/google/android/gms/b/he;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/hd$2;->a:Ljava/util/Map;

    iput-object p2, p0, Lcom/google/android/gms/b/hd$2;->b:Lcom/google/android/gms/b/he;

    invoke-direct {p0}, Lcom/google/android/gms/b/jf$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/b/je;Lcom/google/android/gms/b/jr;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/b/hd$2;->a:Ljava/util/Map;

    invoke-static {p2, v0}, Lcom/google/android/gms/b/hd;->a(Lcom/google/android/gms/b/jr;Ljava/util/Map;)Lcom/google/android/gms/b/jr;

    move-result-object v0

    if-eq v0, p2, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/b/hd$2;->b:Lcom/google/android/gms/b/he;

    new-instance v2, Lcom/google/android/gms/b/gx;

    invoke-virtual {p1}, Lcom/google/android/gms/b/je;->d()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/google/android/gms/b/gx;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/b/he;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;)V

    :cond_0
    return-void
.end method
