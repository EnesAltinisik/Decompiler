.class Lcom/google/android/gms/b/aar$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/aar;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/aar;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/aar;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/aar$1;->a:Lcom/google/android/gms/b/aar;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/aar$1;->a:Lcom/google/android/gms/b/aar;

    iget-object v0, v0, Lcom/google/android/gms/b/aar;->b:Lcom/google/android/gms/b/yo;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/aar$1;->a:Lcom/google/android/gms/b/aar;

    iget-object v0, v0, Lcom/google/android/gms/b/aar;->b:Lcom/google/android/gms/b/yo;

    iget-object v0, p0, Lcom/google/android/gms/b/aar$1;->a:Lcom/google/android/gms/b/aar;

    iget-object v0, v0, Lcom/google/android/gms/b/aar;->a:Lcom/google/android/gms/b/aaq;

    :cond_0
    return-void
.end method
