.class Lcom/google/android/gms/b/gw$1;
.super Lcom/google/android/gms/b/ko;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/gw;->b(Lcom/google/android/gms/b/gq;)Lcom/google/android/gms/b/hc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/jb;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/gw;Lcom/google/android/gms/b/jb;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/b/gw$1;->a:Lcom/google/android/gms/b/jb;

    invoke-direct {p0}, Lcom/google/android/gms/b/ko;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/b/gw$1;->a:Lcom/google/android/gms/b/jb;

    invoke-static {p1}, Lcom/google/android/gms/b/ko;->b(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/b/jb;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
