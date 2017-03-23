.class Lcom/pinarsu/siparis/view/AnimatedExpandableListView$GroupInfo;
.super Ljava/lang/Object;
.source "AnimatedExpandableListView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pinarsu/siparis/view/AnimatedExpandableListView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "GroupInfo"
.end annotation


# instance fields
.field animating:Z

.field dummyHeight:I

.field expanding:Z

.field firstChildPosition:I


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 247
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 248
    iput-boolean v0, p0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$GroupInfo;->animating:Z

    .line 249
    iput-boolean v0, p0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$GroupInfo;->expanding:Z

    .line 258
    const/4 v0, -0x1

    iput v0, p0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$GroupInfo;->dummyHeight:I

    return-void
.end method

.method synthetic constructor <init>(Lcom/pinarsu/siparis/view/AnimatedExpandableListView$1;)V
    .locals 0

    .prologue
    .line 247
    invoke-direct {p0}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$GroupInfo;-><init>()V

    return-void
.end method
