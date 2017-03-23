.class public Lcom/pinarsu/siparis/view/AnimatedExpandableListView;
.super Landroid/widget/ExpandableListView;
.source "AnimatedExpandableListView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pinarsu/siparis/view/AnimatedExpandableListView$ExpandAnimation;,
        Lcom/pinarsu/siparis/view/AnimatedExpandableListView$DummyView;,
        Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;,
        Lcom/pinarsu/siparis/view/AnimatedExpandableListView$GroupInfo;
    }
.end annotation


# static fields
.field private static final ANIMATION_DURATION:I = 0x12c

.field private static final TAG:Ljava/lang/String;


# instance fields
.field private adapter:Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 109
    const-class v0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;

    .line 110
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView;->TAG:Ljava/lang/String;

    .line 109
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 120
    invoke-direct {p0, p1}, Landroid/widget/ExpandableListView;-><init>(Landroid/content/Context;)V

    .line 121
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .prologue
    .line 124
    invoke-direct {p0, p1, p2}, Landroid/widget/ExpandableListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 125
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .prologue
    .line 129
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ExpandableListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 130
    return-void
.end method

.method static synthetic access$500(Lcom/pinarsu/siparis/view/AnimatedExpandableListView;)I
    .locals 1

    .prologue
    .line 42
    invoke-direct {p0}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView;->getAnimationDuration()I

    move-result v0

    return v0
.end method

.method private getAnimationDuration()I
    .locals 1

    .prologue
    .line 241
    const/16 v0, 0x12c

    return v0
.end method


# virtual methods
.method public collapseGroupWithAnimation(I)Z
    .locals 5

    .prologue
    const/4 v4, -0x1

    .line 199
    invoke-static {p1}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView;->getPackedPositionForGroup(I)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView;->getFlatListPosition(J)I

    move-result v0

    .line 200
    if-eq v0, v4, :cond_1

    .line 201
    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView;->getFirstVisiblePosition()I

    move-result v1

    sub-int/2addr v0, v1

    .line 202
    if-ltz v0, :cond_0

    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 204
    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 205
    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    move-result v0

    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView;->getBottom()I

    move-result v1

    if-lt v0, v1, :cond_1

    .line 210
    invoke-virtual {p0, p1}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView;->collapseGroup(I)Z

    move-result v0

    .line 237
    :goto_0
    return v0

    .line 215
    :cond_0
    invoke-virtual {p0, p1}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView;->collapseGroup(I)Z

    move-result v0

    goto :goto_0

    .line 220
    :cond_1
    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView;->getFirstVisiblePosition()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView;->getExpandableListPosition(I)J

    move-result-wide v2

    .line 221
    invoke-static {v2, v3}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView;->getPackedPositionChild(J)I

    move-result v0

    .line 222
    invoke-static {v2, v3}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView;->getPackedPositionGroup(J)I

    move-result v1

    .line 228
    if-eq v0, v4, :cond_2

    if-eq v1, p1, :cond_3

    :cond_2
    const/4 v0, 0x0

    .line 233
    :cond_3
    iget-object v1, p0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView;->adapter:Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;

    # invokes: Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;->startCollapseAnimation(II)V
    invoke-static {v1, p1, v0}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;->access$200(Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;II)V

    .line 236
    iget-object v0, p0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView;->adapter:Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;->notifyDataSetChanged()V

    .line 237
    invoke-virtual {p0, p1}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView;->isGroupExpanded(I)Z

    move-result v0

    goto :goto_0
.end method

.method public expandGroupWithAnimation(I)Z
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 157
    iget-object v0, p0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView;->adapter:Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;->getGroupCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_0

    move v0, v1

    .line 158
    :goto_0
    if-eqz v0, :cond_1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0xe

    if-lt v0, v3, :cond_1

    if-lez p1, :cond_1

    .line 161
    invoke-virtual {p0, p1, v1}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView;->expandGroup(IZ)Z

    move-result v0

    .line 188
    :goto_1
    return v0

    :cond_0
    move v0, v2

    .line 157
    goto :goto_0

    .line 164
    :cond_1
    invoke-static {p1}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView;->getPackedPositionForGroup(I)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView;->getFlatListPosition(J)I

    move-result v0

    .line 165
    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    .line 166
    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView;->getFirstVisiblePosition()I

    move-result v1

    sub-int/2addr v0, v1

    .line 167
    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 169
    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 170
    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    move-result v0

    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView;->getBottom()I

    move-result v1

    if-lt v0, v1, :cond_2

    .line 178
    iget-object v0, p0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView;->adapter:Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;

    invoke-virtual {v0, p1}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;->notifyGroupExpanded(I)V

    .line 179
    invoke-virtual {p0, p1}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView;->expandGroup(I)Z

    move-result v0

    goto :goto_1

    .line 185
    :cond_2
    iget-object v0, p0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView;->adapter:Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;

    # invokes: Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;->startExpandAnimation(II)V
    invoke-static {v0, p1, v2}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;->access$100(Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;II)V

    .line 188
    invoke-virtual {p0, p1}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView;->expandGroup(I)Z

    move-result v0

    goto :goto_1
.end method

.method public setAdapter(Landroid/widget/ExpandableListAdapter;)V
    .locals 3

    .prologue
    .line 136
    invoke-super {p0, p1}, Landroid/widget/ExpandableListView;->setAdapter(Landroid/widget/ExpandableListAdapter;)V

    .line 139
    instance-of v0, p1, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;

    if-eqz v0, :cond_0

    .line 140
    check-cast p1, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;

    iput-object p1, p0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView;->adapter:Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;

    .line 141
    iget-object v0, p0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView;->adapter:Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;

    # invokes: Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;->setParent(Lcom/pinarsu/siparis/view/AnimatedExpandableListView;)V
    invoke-static {v0, p0}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;->access$000(Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;Lcom/pinarsu/siparis/view/AnimatedExpandableListView;)V

    .line 146
    return-void

    .line 143
    :cond_0
    new-instance v0, Ljava/lang/ClassCastException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " must implement AnimatedExpandableListAdapter"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
