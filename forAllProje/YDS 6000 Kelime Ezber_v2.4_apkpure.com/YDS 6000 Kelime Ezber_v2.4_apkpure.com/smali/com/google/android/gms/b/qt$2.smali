.class Lcom/google/android/gms/b/qt$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/b/qn;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/qt;->b(Lcom/google/android/gms/b/qq;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/view/View;

.field final synthetic b:Lcom/google/android/gms/b/qt;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/qt;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/qt$2;->b:Lcom/google/android/gms/b/qt;

    iput-object p2, p0, Lcom/google/android/gms/b/qt$2;->a:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/b/qt$2;->b:Lcom/google/android/gms/b/qt;

    iget-object v1, p0, Lcom/google/android/gms/b/qt$2;->a:Landroid/view/View;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/qt;->onClick(Landroid/view/View;)V

    return-void
.end method

.method public a(Landroid/view/MotionEvent;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/b/qt$2;->b:Lcom/google/android/gms/b/qt;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/b/qt;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z

    return-void
.end method
