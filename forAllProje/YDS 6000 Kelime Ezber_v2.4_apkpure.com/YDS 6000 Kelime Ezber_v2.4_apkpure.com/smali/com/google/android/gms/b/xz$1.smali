.class Lcom/google/android/gms/b/xz$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/xz;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/ns;

.field final synthetic b:Lcom/google/android/gms/b/to;

.field final synthetic c:Lcom/google/android/gms/b/xz;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/xz;Lcom/google/android/gms/b/ns;Lcom/google/android/gms/b/to;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/xz$1;->c:Lcom/google/android/gms/b/xz;

    iput-object p2, p0, Lcom/google/android/gms/b/xz$1;->a:Lcom/google/android/gms/b/ns;

    iput-object p3, p0, Lcom/google/android/gms/b/xz$1;->b:Lcom/google/android/gms/b/to;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/b/xz$1;->c:Lcom/google/android/gms/b/xz;

    iget-object v1, p0, Lcom/google/android/gms/b/xz$1;->a:Lcom/google/android/gms/b/ns;

    iget-object v2, p0, Lcom/google/android/gms/b/xz$1;->b:Lcom/google/android/gms/b/to;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/b/xz;->a(Lcom/google/android/gms/b/xz;Lcom/google/android/gms/b/ns;Lcom/google/android/gms/b/to;)V

    return-void
.end method
