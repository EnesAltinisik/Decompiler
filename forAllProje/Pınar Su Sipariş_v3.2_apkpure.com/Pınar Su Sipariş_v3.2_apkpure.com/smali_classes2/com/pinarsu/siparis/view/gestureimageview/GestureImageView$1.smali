.class Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView$1;
.super Ljava/lang/Object;
.source "GestureImageView.java"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->setupCanvas(III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;


# direct methods
.method constructor <init>(Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;)V
    .locals 0

    .prologue
    .line 218
    iput-object p1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView$1;->this$0:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 221
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView$1;->this$0:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;

    # getter for: Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->customOnTouchListener:Landroid/view/View$OnTouchListener;
    invoke-static {v0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->access$000(Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;)Landroid/view/View$OnTouchListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 222
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView$1;->this$0:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;

    # getter for: Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->customOnTouchListener:Landroid/view/View$OnTouchListener;
    invoke-static {v0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->access$000(Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;)Landroid/view/View$OnTouchListener;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Landroid/view/View$OnTouchListener;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z

    .line 224
    :cond_0
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView$1;->this$0:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;

    # getter for: Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->gestureImageViewTouchListener:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;
    invoke-static {v0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->access$100(Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;)Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method
