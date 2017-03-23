.class Lcom/google/android/gms/b/cw$3;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/cw;->a(Lcom/google/android/gms/b/ch;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/ch;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/google/android/gms/b/cw;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/cw;Lcom/google/android/gms/b/ch;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/cw$3;->c:Lcom/google/android/gms/b/cw;

    iput-object p2, p0, Lcom/google/android/gms/b/cw$3;->a:Lcom/google/android/gms/b/ch;

    iput-object p3, p0, Lcom/google/android/gms/b/cw$3;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/b/cw$3;->c:Lcom/google/android/gms/b/cw;

    invoke-static {v0}, Lcom/google/android/gms/b/cw;->a(Lcom/google/android/gms/b/cw;)Lcom/google/android/gms/b/cv;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/cv;->N()V

    iget-object v0, p0, Lcom/google/android/gms/b/cw$3;->c:Lcom/google/android/gms/b/cw;

    invoke-static {v0}, Lcom/google/android/gms/b/cw;->a(Lcom/google/android/gms/b/cw;)Lcom/google/android/gms/b/cv;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/cw$3;->a:Lcom/google/android/gms/b/ch;

    iget-object v2, p0, Lcom/google/android/gms/b/cw$3;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/b/cv;->a(Lcom/google/android/gms/b/ch;Ljava/lang/String;)V

    return-void
.end method
