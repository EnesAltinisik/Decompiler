.class public Lcom/pinarsu/siparis/model/ViewPagerItem;
.super Ljava/lang/Object;
.source "ViewPagerItem.java"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public imageDrawable:I

.field public imageUrl:Ljava/lang/String;

.field public title:Ljava/lang/String;

.field public type:Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment$IMAGE_TYPE;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ILcom/pinarsu/siparis/ui/fragment/ViewPagerFragment$IMAGE_TYPE;)V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/pinarsu/siparis/model/ViewPagerItem;->title:Ljava/lang/String;

    .line 21
    iput-object p2, p0, Lcom/pinarsu/siparis/model/ViewPagerItem;->imageUrl:Ljava/lang/String;

    .line 22
    iput p3, p0, Lcom/pinarsu/siparis/model/ViewPagerItem;->imageDrawable:I

    .line 23
    iput-object p4, p0, Lcom/pinarsu/siparis/model/ViewPagerItem;->type:Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment$IMAGE_TYPE;

    .line 24
    return-void
.end method
