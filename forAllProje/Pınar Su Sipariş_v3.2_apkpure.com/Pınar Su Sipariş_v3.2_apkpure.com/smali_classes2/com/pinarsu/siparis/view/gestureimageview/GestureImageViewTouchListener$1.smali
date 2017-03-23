.class Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener$1;
.super Ljava/lang/Object;
.source "GestureImageViewTouchListener.java"

# interfaces
.implements Lcom/pinarsu/siparis/view/gestureimageview/FlingAnimationListener;


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
    .line 116
    iput-object p1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener$1;->this$0:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onComplete()V
    .locals 0

    .prologue
    .line 123
    return-void
.end method

.method public onMove(FF)V
    .locals 3

    .prologue
    .line 119
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener$1;->this$0:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;

    iget-object v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener$1;->this$0:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;

    # getter for: Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->current:Landroid/graphics/PointF;
    invoke-static {v1}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->access$000(Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;)Landroid/graphics/PointF;

    move-result-object v1

    iget v1, v1, Landroid/graphics/PointF;->x:F

    add-float/2addr v1, p1

    iget-object v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener$1;->this$0:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;

    # getter for: Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->current:Landroid/graphics/PointF;
    invoke-static {v2}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->access$000(Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;)Landroid/graphics/PointF;

    move-result-object v2

    iget v2, v2, Landroid/graphics/PointF;->y:F

    add-float/2addr v2, p2

    invoke-virtual {v0, v1, v2}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->handleDrag(FF)Z

    .line 120
    return-void
.end method
