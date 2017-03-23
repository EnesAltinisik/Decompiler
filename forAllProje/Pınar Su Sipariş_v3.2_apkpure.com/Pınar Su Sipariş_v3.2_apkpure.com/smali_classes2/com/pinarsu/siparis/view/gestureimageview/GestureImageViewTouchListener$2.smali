.class Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener$2;
.super Ljava/lang/Object;
.source "GestureImageViewTouchListener.java"

# interfaces
.implements Lcom/pinarsu/siparis/view/gestureimageview/ZoomAnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;-><init>(Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;


# direct methods
.method constructor <init>(Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;)V
    .locals 0

    .prologue
    .line 127
    iput-object p1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener$2;->this$0:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onComplete()V
    .locals 2

    .prologue
    .line 137
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener$2;->this$0:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;

    const/4 v1, 0x0

    # setter for: Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->inZoom:Z
    invoke-static {v0, v1}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->access$302(Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;Z)Z

    .line 138
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener$2;->this$0:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->handleUp()V

    .line 139
    return-void
.end method

.method public onZoom(FFF)V
    .locals 1

    .prologue
    .line 130
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener$2;->this$0:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;

    # getter for: Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->maxScale:F
    invoke-static {v0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->access$100(Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;)F

    move-result v0

    cmpg-float v0, p1, v0

    if-gtz v0, :cond_0

    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener$2;->this$0:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;

    # getter for: Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->minScale:F
    invoke-static {v0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->access$200(Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;)F

    move-result v0

    cmpl-float v0, p1, v0

    if-ltz v0, :cond_0

    .line 131
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener$2;->this$0:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;

    invoke-virtual {v0, p1, p2, p3}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->handleScale(FFF)V

    .line 133
    :cond_0
    return-void
.end method
