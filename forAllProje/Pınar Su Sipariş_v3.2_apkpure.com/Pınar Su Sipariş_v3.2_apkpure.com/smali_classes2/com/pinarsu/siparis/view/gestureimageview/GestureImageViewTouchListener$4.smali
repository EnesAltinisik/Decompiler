.class Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener$4;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "GestureImageViewTouchListener.java"


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

.field final synthetic val$image:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;


# direct methods
.method constructor <init>(Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;)V
    .locals 0

    .prologue
    .line 151
    iput-object p1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener$4;->this$0:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;

    iput-object p2, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener$4;->val$image:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onDoubleTap(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 154
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener$4;->this$0:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;

    # invokes: Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->startZoom(Landroid/view/MotionEvent;)V
    invoke-static {v0, p1}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->access$400(Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;Landroid/view/MotionEvent;)V

    .line 155
    const/4 v0, 0x1

    return v0
.end method

.method public onSingleTapConfirmed(Landroid/view/MotionEvent;)Z
    .locals 2

    .prologue
    .line 160
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener$4;->this$0:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;

    # getter for: Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->inZoom:Z
    invoke-static {v0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->access$300(Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 161
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener$4;->this$0:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;

    # getter for: Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->onClickListener:Landroid/view/View$OnClickListener;
    invoke-static {v0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->access$500(Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;)Landroid/view/View$OnClickListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 162
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener$4;->this$0:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;

    # getter for: Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->onClickListener:Landroid/view/View$OnClickListener;
    invoke-static {v0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->access$500(Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;)Landroid/view/View$OnClickListener;

    move-result-object v0

    iget-object v1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener$4;->val$image:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;

    invoke-interface {v0, v1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    .line 163
    const/4 v0, 0x1

    .line 167
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
