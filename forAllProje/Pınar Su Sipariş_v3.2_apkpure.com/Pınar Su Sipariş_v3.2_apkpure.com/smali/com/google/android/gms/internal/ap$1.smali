.class Lcom/google/android/gms/internal/ap$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/ap;->a(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ao;

.field final synthetic b:J

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Ljava/lang/String;

.field final synthetic f:Ljava/util/Map;

.field final synthetic g:Ljava/lang/String;

.field final synthetic h:Lcom/google/android/gms/internal/ap;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ap;Lcom/google/android/gms/internal/ao;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/ap$1;->h:Lcom/google/android/gms/internal/ap;

    iput-object p2, p0, Lcom/google/android/gms/internal/ap$1;->a:Lcom/google/android/gms/internal/ao;

    iput-wide p3, p0, Lcom/google/android/gms/internal/ap$1;->b:J

    iput-object p5, p0, Lcom/google/android/gms/internal/ap$1;->c:Ljava/lang/String;

    iput-object p6, p0, Lcom/google/android/gms/internal/ap$1;->d:Ljava/lang/String;

    iput-object p7, p0, Lcom/google/android/gms/internal/ap$1;->e:Ljava/lang/String;

    iput-object p8, p0, Lcom/google/android/gms/internal/ap$1;->f:Ljava/util/Map;

    iput-object p9, p0, Lcom/google/android/gms/internal/ap$1;->g:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    iget-object v0, p0, Lcom/google/android/gms/internal/ap$1;->h:Lcom/google/android/gms/internal/ap;

    invoke-static {v0}, Lcom/google/android/gms/internal/ap;->a(Lcom/google/android/gms/internal/ap;)Lcom/google/android/gms/internal/aq;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/zzuz;->a()Lcom/google/android/gms/internal/zzuz;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ap$1;->h:Lcom/google/android/gms/internal/ap;

    invoke-static {v1}, Lcom/google/android/gms/internal/ap;->b(Lcom/google/android/gms/internal/ap;)Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ap$1;->a:Lcom/google/android/gms/internal/ao;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/zzuz;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ao;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ap$1;->h:Lcom/google/android/gms/internal/ap;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzuz;->b()Lcom/google/android/gms/internal/aq;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ap;->a(Lcom/google/android/gms/internal/ap;Lcom/google/android/gms/internal/aq;)Lcom/google/android/gms/internal/aq;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ap$1;->h:Lcom/google/android/gms/internal/ap;

    invoke-static {v0}, Lcom/google/android/gms/internal/ap;->a(Lcom/google/android/gms/internal/ap;)Lcom/google/android/gms/internal/aq;

    move-result-object v1

    iget-wide v2, p0, Lcom/google/android/gms/internal/ap$1;->b:J

    iget-object v4, p0, Lcom/google/android/gms/internal/ap$1;->c:Ljava/lang/String;

    iget-object v5, p0, Lcom/google/android/gms/internal/ap$1;->d:Ljava/lang/String;

    iget-object v6, p0, Lcom/google/android/gms/internal/ap$1;->e:Ljava/lang/String;

    iget-object v7, p0, Lcom/google/android/gms/internal/ap$1;->f:Ljava/util/Map;

    iget-object v8, p0, Lcom/google/android/gms/internal/ap$1;->g:Ljava/lang/String;

    invoke-interface/range {v1 .. v8}, Lcom/google/android/gms/internal/aq;->a(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V

    return-void
.end method
