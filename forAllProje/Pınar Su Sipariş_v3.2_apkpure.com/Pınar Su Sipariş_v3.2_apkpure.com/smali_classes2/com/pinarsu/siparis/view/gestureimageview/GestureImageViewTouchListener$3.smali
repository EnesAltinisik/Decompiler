.class Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener$3;
.super Ljava/lang/Object;
.source "GestureImageViewTouchListener.java"

# interfaces
.implements Lcom/pinarsu/siparis/view/gestureimageview/MoveAnimationListener;


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
    .line 142
    iput-object p1, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener$3;->this$0:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener;

    iput-object p2, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener$3;->val$image:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMove(FF)V
    .locals 1

    .prologue
    .line 146
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener$3;->val$image:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;

    invoke-virtual {v0, p1, p2}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->setPosition(FF)V

    .line 147
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageViewTouchListener$3;->val$image:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->redraw()V

    .line 148
    return-void
.end method
