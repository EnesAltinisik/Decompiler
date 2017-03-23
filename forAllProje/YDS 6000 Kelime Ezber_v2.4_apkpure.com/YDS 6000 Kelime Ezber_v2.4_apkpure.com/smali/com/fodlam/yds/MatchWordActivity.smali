.class public Lcom/fodlam/yds/MatchWordActivity;
.super Lcom/fodlam/yds/c;

# interfaces
.implements Landroid/view/View$OnDragListener;
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field m:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/fodlam/yds/f/h;",
            ">;"
        }
    .end annotation
.end field

.field n:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/fodlam/yds/f/h;",
            ">;"
        }
    .end annotation
.end field

.field o:[Landroid/widget/TextView;

.field p:Lcom/badoualy/stepperindicator/StepperIndicator;

.field q:I

.field r:Landroid/view/View;

.field private y:Z

.field private z:I


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Lcom/fodlam/yds/c;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/fodlam/yds/MatchWordActivity;->m:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/fodlam/yds/MatchWordActivity;->n:Ljava/util/ArrayList;

    iput v1, p0, Lcom/fodlam/yds/MatchWordActivity;->q:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/fodlam/yds/MatchWordActivity;->r:Landroid/view/View;

    iput-boolean v1, p0, Lcom/fodlam/yds/MatchWordActivity;->y:Z

    const/4 v0, 0x4

    iput v0, p0, Lcom/fodlam/yds/MatchWordActivity;->z:I

    return-void
.end method

.method private a(Landroid/os/Bundle;)V
    .locals 9

    const/4 v1, 0x4

    const/4 v3, 0x0

    if-eqz p1, :cond_2

    const-string v0, "TARGET_COUNT"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/fodlam/yds/MatchWordActivity;->z:I

    :goto_0
    iget v0, p0, Lcom/fodlam/yds/MatchWordActivity;->z:I

    iget v2, p0, Lcom/fodlam/yds/MatchWordActivity;->q:I

    iget v4, p0, Lcom/fodlam/yds/MatchWordActivity;->z:I

    rem-int/2addr v2, v4

    sub-int/2addr v0, v2

    new-array v4, v0, [Lcom/fodlam/yds/f/h;

    iget-object v0, p0, Lcom/fodlam/yds/MatchWordActivity;->m:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    array-length v0, v4

    iget-object v2, p0, Lcom/fodlam/yds/MatchWordActivity;->m:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-le v0, v2, :cond_1

    :cond_0
    invoke-virtual {p0}, Lcom/fodlam/yds/MatchWordActivity;->finish()V

    :cond_1
    move v2, v3

    :goto_1
    array-length v0, v4

    if-ge v2, v0, :cond_4

    iget-object v0, p0, Lcom/fodlam/yds/MatchWordActivity;->m:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fodlam/yds/f/h;

    aput-object v0, v4, v2

    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/fodlam/yds/MatchWordActivity;->m:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt v0, v1, :cond_3

    move v0, v1

    :goto_2
    iput v0, p0, Lcom/fodlam/yds/MatchWordActivity;->z:I

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/fodlam/yds/MatchWordActivity;->m:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    goto :goto_2

    :cond_4
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    move v0, v3

    :goto_3
    array-length v2, v4

    mul-int/lit8 v2, v2, 0x2

    if-ge v0, v2, :cond_5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_5
    invoke-static {v5}, Ljava/util/Collections;->shuffle(Ljava/util/List;)V

    move v2, v3

    :goto_4
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_7

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    array-length v6, v4

    if-ge v2, v6, :cond_6

    iget-object v6, p0, Lcom/fodlam/yds/MatchWordActivity;->o:[Landroid/widget/TextView;

    aget-object v6, v6, v0

    aget-object v7, v4, v2

    iget-object v7, v7, Lcom/fodlam/yds/f/h;->h:Ljava/lang/String;

    sget-object v8, Landroid/widget/TextView$BufferType;->SPANNABLE:Landroid/widget/TextView$BufferType;

    invoke-virtual {v6, v7, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V

    iget-object v6, p0, Lcom/fodlam/yds/MatchWordActivity;->o:[Landroid/widget/TextView;

    aget-object v6, v6, v0

    aget-object v7, v4, v2

    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    :goto_5
    iget-object v6, p0, Lcom/fodlam/yds/MatchWordActivity;->o:[Landroid/widget/TextView;

    aget-object v6, v6, v0

    invoke-virtual {v6, p0}, Landroid/widget/TextView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    iget-object v6, p0, Lcom/fodlam/yds/MatchWordActivity;->o:[Landroid/widget/TextView;

    aget-object v6, v6, v0

    invoke-virtual {v6, p0}, Landroid/widget/TextView;->setOnDragListener(Landroid/view/View$OnDragListener;)V

    iget-object v6, p0, Lcom/fodlam/yds/MatchWordActivity;->o:[Landroid/widget/TextView;

    aget-object v0, v6, v0

    invoke-virtual {v0}, Landroid/widget/TextView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_4

    :cond_6
    iget-object v6, p0, Lcom/fodlam/yds/MatchWordActivity;->o:[Landroid/widget/TextView;

    aget-object v6, v6, v0

    array-length v7, v4

    sub-int v7, v2, v7

    aget-object v7, v4, v7

    iget-object v7, v7, Lcom/fodlam/yds/f/h;->k:Ljava/lang/String;

    sget-object v8, Landroid/widget/TextView$BufferType;->SPANNABLE:Landroid/widget/TextView$BufferType;

    invoke-virtual {v6, v7, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V

    iget-object v6, p0, Lcom/fodlam/yds/MatchWordActivity;->o:[Landroid/widget/TextView;

    aget-object v6, v6, v0

    array-length v7, v4

    sub-int v7, v2, v7

    aget-object v7, v4, v7

    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    goto :goto_5

    :cond_7
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    move v2, v0

    :goto_6
    const/16 v0, 0x8

    if-ge v2, v0, :cond_8

    iget-object v0, p0, Lcom/fodlam/yds/MatchWordActivity;->o:[Landroid/widget/TextView;

    aget-object v0, v0, v2

    invoke-virtual {v0}, Landroid/widget/TextView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_6

    :cond_8
    return-void
.end method

.method private l()V
    .locals 1

    iget-boolean v0, p0, Lcom/fodlam/yds/MatchWordActivity;->y:Z

    if-eqz v0, :cond_0

    :goto_0
    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fodlam/yds/MatchWordActivity;->y:Z

    invoke-virtual {p0}, Lcom/fodlam/yds/MatchWordActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/fodlam/yds/utility/a;->a(Landroid/content/Context;)Lcom/fodlam/yds/utility/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fodlam/yds/utility/a;->c()V

    invoke-virtual {p0}, Lcom/fodlam/yds/MatchWordActivity;->j()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/MatchWordActivity;->c(I)V

    goto :goto_0
.end method


# virtual methods
.method public j()I
    .locals 4

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/fodlam/yds/MatchWordActivity;->n:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v1, v0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fodlam/yds/f/h;

    iget-object v0, v0, Lcom/fodlam/yds/f/h;->l:Lcom/fodlam/yds/f/e;

    sget-object v3, Lcom/fodlam/yds/OxfordApplication;->h:Lcom/fodlam/yds/OxfordApplication$a;

    invoke-virtual {v3}, Lcom/fodlam/yds/OxfordApplication$a;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/fodlam/yds/f/e;->a(Ljava/lang/String;)I

    move-result v0

    add-int/2addr v0, v1

    move v1, v0

    goto :goto_0

    :cond_0
    return v1
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 4

    const/4 v1, 0x2

    invoke-super {p0, p1}, Lcom/fodlam/yds/c;->onCreate(Landroid/os/Bundle;)V

    const v0, 0x7f040022

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/MatchWordActivity;->setContentView(I)V

    const v0, 0x7f100127

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/MatchWordActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/Toolbar;

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/MatchWordActivity;->a(Landroid/support/v7/widget/Toolbar;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/fodlam/yds/OxfordApplication;->h:Lcom/fodlam/yds/OxfordApplication$a;

    invoke-virtual {v2}, Lcom/fodlam/yds/OxfordApplication$a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " - "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget v2, Lcom/fodlam/yds/OxfordApplication;->i:I

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ". Test"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/MatchWordActivity;->setTitle(Ljava/lang/CharSequence;)V

    const/16 v0, 0x8

    new-array v0, v0, [Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fodlam/yds/MatchWordActivity;->o:[Landroid/widget/TextView;

    iget-object v2, p0, Lcom/fodlam/yds/MatchWordActivity;->o:[Landroid/widget/TextView;

    const/4 v3, 0x0

    const v0, 0x7f100155

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/MatchWordActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    aput-object v0, v2, v3

    iget-object v2, p0, Lcom/fodlam/yds/MatchWordActivity;->o:[Landroid/widget/TextView;

    const/4 v3, 0x1

    const v0, 0x7f100157

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/MatchWordActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    aput-object v0, v2, v3

    iget-object v2, p0, Lcom/fodlam/yds/MatchWordActivity;->o:[Landroid/widget/TextView;

    const v0, 0x7f10015a

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/MatchWordActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    aput-object v0, v2, v1

    iget-object v2, p0, Lcom/fodlam/yds/MatchWordActivity;->o:[Landroid/widget/TextView;

    const/4 v3, 0x3

    const v0, 0x7f10015c

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/MatchWordActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    aput-object v0, v2, v3

    iget-object v2, p0, Lcom/fodlam/yds/MatchWordActivity;->o:[Landroid/widget/TextView;

    const/4 v3, 0x4

    const v0, 0x7f10015f

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/MatchWordActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    aput-object v0, v2, v3

    iget-object v2, p0, Lcom/fodlam/yds/MatchWordActivity;->o:[Landroid/widget/TextView;

    const/4 v3, 0x5

    const v0, 0x7f100161

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/MatchWordActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    aput-object v0, v2, v3

    iget-object v2, p0, Lcom/fodlam/yds/MatchWordActivity;->o:[Landroid/widget/TextView;

    const/4 v3, 0x6

    const v0, 0x7f100164

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/MatchWordActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    aput-object v0, v2, v3

    iget-object v2, p0, Lcom/fodlam/yds/MatchWordActivity;->o:[Landroid/widget/TextView;

    const/4 v3, 0x7

    const v0, 0x7f100166

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/MatchWordActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    aput-object v0, v2, v3

    const v0, 0x7f100129

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/MatchWordActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/badoualy/stepperindicator/StepperIndicator;

    iput-object v0, p0, Lcom/fodlam/yds/MatchWordActivity;->p:Lcom/badoualy/stepperindicator/StepperIndicator;

    if-eqz p1, :cond_0

    const-string v0, "matchtestlistorigin"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    iput-object v0, p0, Lcom/fodlam/yds/MatchWordActivity;->n:Ljava/util/ArrayList;

    const-string v0, "matchtestlist"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    iput-object v0, p0, Lcom/fodlam/yds/MatchWordActivity;->m:Ljava/util/ArrayList;

    const-string v0, "stepCount"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/fodlam/yds/MatchWordActivity;->q:I

    :goto_0
    iget-object v2, p0, Lcom/fodlam/yds/MatchWordActivity;->p:Lcom/badoualy/stepperindicator/StepperIndicator;

    iget-object v0, p0, Lcom/fodlam/yds/MatchWordActivity;->n:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    div-int/lit8 v0, v0, 0x3

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Lcom/fodlam/yds/MatchWordActivity;->n:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    div-int/lit8 v0, v0, 0x3

    :goto_1
    invoke-virtual {v2, v0}, Lcom/badoualy/stepperindicator/StepperIndicator;->setStepCount(I)V

    iget-object v0, p0, Lcom/fodlam/yds/MatchWordActivity;->p:Lcom/badoualy/stepperindicator/StepperIndicator;

    iget v1, p0, Lcom/fodlam/yds/MatchWordActivity;->q:I

    div-int/lit8 v1, v1, 0x3

    invoke-virtual {v0, v1}, Lcom/badoualy/stepperindicator/StepperIndicator;->setCurrentStep(I)V

    invoke-direct {p0, p1}, Lcom/fodlam/yds/MatchWordActivity;->a(Landroid/os/Bundle;)V

    return-void

    :cond_0
    invoke-static {}, Lcom/fodlam/yds/c/b;->a()Lcom/fodlam/yds/c/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fodlam/yds/c/b;->b()Lcom/fodlam/yds/f/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fodlam/yds/f/g;->f()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/fodlam/yds/MatchWordActivity;->n:Ljava/util/ArrayList;

    iget-object v0, p0, Lcom/fodlam/yds/MatchWordActivity;->m:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/fodlam/yds/MatchWordActivity;->n:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v0, p0, Lcom/fodlam/yds/MatchWordActivity;->m:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/util/Collections;->shuffle(Ljava/util/List;)V

    goto :goto_0

    :cond_1
    move v0, v1

    goto :goto_1
.end method

.method protected onDestroy()V
    .locals 1

    const/4 v0, 0x0

    invoke-super {p0}, Lcom/fodlam/yds/c;->onDestroy()V

    iput-object v0, p0, Lcom/fodlam/yds/MatchWordActivity;->m:Ljava/util/ArrayList;

    iput-object v0, p0, Lcom/fodlam/yds/MatchWordActivity;->n:Ljava/util/ArrayList;

    iput-object v0, p0, Lcom/fodlam/yds/MatchWordActivity;->o:[Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fodlam/yds/MatchWordActivity;->p:Lcom/badoualy/stepperindicator/StepperIndicator;

    iput-object v0, p0, Lcom/fodlam/yds/MatchWordActivity;->r:Landroid/view/View;

    return-void
.end method

.method public onDrag(Landroid/view/View;Landroid/view/DragEvent;)Z
    .locals 7

    const/4 v6, 0x4

    const/4 v0, 0x0

    const/4 v4, -0x1

    const/4 v5, 0x0

    const/4 v2, 0x1

    invoke-virtual {p0}, Lcom/fodlam/yds/MatchWordActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/fodlam/yds/c/a;->a(Landroid/content/Context;)Lcom/fodlam/yds/c/a;

    move-result-object v1

    invoke-virtual {p2}, Landroid/view/DragEvent;->getAction()I

    move-result v3

    packed-switch v3, :pswitch_data_0

    :cond_0
    :goto_0
    return v0

    :pswitch_0
    invoke-virtual {p2}, Landroid/view/DragEvent;->getClipDescription()Landroid/content/ClipDescription;

    move-result-object v1

    const-string v3, "text/plain"

    invoke-virtual {v1, v3}, Landroid/content/ClipDescription;->hasMimeType(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    move v0, v2

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Lcom/fodlam/yds/MatchWordActivity;->r:Landroid/view/View;

    if-eq p1, v0, :cond_1

    const v0, -0xff0100

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    :cond_1
    move v0, v2

    goto :goto_0

    :pswitch_2
    move v0, v2

    goto :goto_0

    :pswitch_3
    invoke-virtual {p1, v4}, Landroid/view/View;->setBackgroundColor(I)V

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    move v0, v2

    goto :goto_0

    :pswitch_4
    invoke-virtual {p1, v4}, Landroid/view/View;->setBackgroundColor(I)V

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    iget-object v0, p0, Lcom/fodlam/yds/MatchWordActivity;->r:Landroid/view/View;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/fodlam/yds/MatchWordActivity;->r:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v3

    if-ne v0, v3, :cond_5

    iget-object v0, p0, Lcom/fodlam/yds/MatchWordActivity;->r:Landroid/view/View;

    if-eq v0, p1, :cond_5

    iget-object v0, p0, Lcom/fodlam/yds/MatchWordActivity;->r:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fodlam/yds/f/h;

    iget-object v3, v0, Lcom/fodlam/yds/f/h;->l:Lcom/fodlam/yds/f/e;

    sget-object v4, Lcom/fodlam/yds/OxfordApplication;->h:Lcom/fodlam/yds/OxfordApplication$a;

    invoke-virtual {v4}, Lcom/fodlam/yds/OxfordApplication$a;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4, v2}, Lcom/fodlam/yds/f/e;->b(Ljava/lang/String;I)V

    iget-object v0, v0, Lcom/fodlam/yds/f/h;->l:Lcom/fodlam/yds/f/e;

    invoke-virtual {v1, v0}, Lcom/fodlam/yds/c/a;->a(Lcom/fodlam/yds/f/e;)I

    invoke-virtual {v1}, Lcom/fodlam/yds/c/a;->f()Lcom/fodlam/yds/f/f;

    move-result-object v0

    iget v3, v0, Lcom/fodlam/yds/f/f;->d:I

    add-int/lit8 v3, v3, 0x1

    iput v3, v0, Lcom/fodlam/yds/f/f;->d:I

    invoke-virtual {v1, v0}, Lcom/fodlam/yds/c/a;->b(Lcom/fodlam/yds/f/f;)I

    iget-object v0, p0, Lcom/fodlam/yds/MatchWordActivity;->r:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/fodlam/yds/MatchWordActivity;->m:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/fodlam/yds/MatchWordActivity;->r:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lcom/fodlam/yds/MatchWordActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/fodlam/yds/utility/a;->a(Landroid/content/Context;)Lcom/fodlam/yds/utility/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fodlam/yds/utility/a;->a()V

    iget-object v0, p0, Lcom/fodlam/yds/MatchWordActivity;->r:Landroid/view/View;

    invoke-virtual {v0, v5}, Landroid/view/View;->setOnDragListener(Landroid/view/View$OnDragListener;)V

    invoke-virtual {p1, v5}, Landroid/view/View;->setOnDragListener(Landroid/view/View$OnDragListener;)V

    iget-object v0, p0, Lcom/fodlam/yds/MatchWordActivity;->r:Landroid/view/View;

    invoke-virtual {v0, v5}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    invoke-virtual {p1, v5}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    iget v0, p0, Lcom/fodlam/yds/MatchWordActivity;->q:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/fodlam/yds/MatchWordActivity;->q:I

    iget-object v0, p0, Lcom/fodlam/yds/MatchWordActivity;->p:Lcom/badoualy/stepperindicator/StepperIndicator;

    iget v1, p0, Lcom/fodlam/yds/MatchWordActivity;->q:I

    div-int/lit8 v1, v1, 0x3

    invoke-virtual {v0, v1}, Lcom/badoualy/stepperindicator/StepperIndicator;->setCurrentStep(I)V

    iget-object v0, p0, Lcom/fodlam/yds/MatchWordActivity;->m:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/fodlam/yds/MatchWordActivity;->r:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/fodlam/yds/MatchWordActivity;->r:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->removeView(Landroid/view/View;)V

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->removeView(Landroid/view/View;)V

    :cond_2
    iget v0, p0, Lcom/fodlam/yds/MatchWordActivity;->q:I

    iget v1, p0, Lcom/fodlam/yds/MatchWordActivity;->z:I

    rem-int/2addr v0, v1

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/fodlam/yds/MatchWordActivity;->m:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-direct {p0}, Lcom/fodlam/yds/MatchWordActivity;->l()V

    :cond_3
    :goto_1
    iput-object v5, p0, Lcom/fodlam/yds/MatchWordActivity;->r:Landroid/view/View;

    move v0, v2

    goto/16 :goto_0

    :cond_4
    invoke-direct {p0, v5}, Lcom/fodlam/yds/MatchWordActivity;->a(Landroid/os/Bundle;)V

    goto :goto_1

    :cond_5
    iget-object v0, p0, Lcom/fodlam/yds/MatchWordActivity;->r:Landroid/view/View;

    if-eq v0, p1, :cond_3

    invoke-virtual {p0}, Lcom/fodlam/yds/MatchWordActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/fodlam/yds/utility/a;->a(Landroid/content/Context;)Lcom/fodlam/yds/utility/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fodlam/yds/utility/a;->b()V

    invoke-virtual {v1}, Lcom/fodlam/yds/c/a;->f()Lcom/fodlam/yds/f/f;

    move-result-object v0

    iget v3, v0, Lcom/fodlam/yds/f/f;->e:I

    add-int/lit8 v3, v3, 0x1

    iput v3, v0, Lcom/fodlam/yds/f/f;->e:I

    invoke-virtual {v1, v0}, Lcom/fodlam/yds/c/a;->b(Lcom/fodlam/yds/f/f;)I

    goto :goto_1

    :pswitch_5
    invoke-virtual {p1, v4}, Landroid/view/View;->setBackgroundColor(I)V

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    move v0, v2

    goto/16 :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_2
        :pswitch_4
        :pswitch_5
        :pswitch_1
        :pswitch_3
    .end packed-switch
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    const-string v0, "matchtestlistorigin"

    iget-object v1, p0, Lcom/fodlam/yds/MatchWordActivity;->n:Ljava/util/ArrayList;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    const-string v0, "matchtestlist"

    iget-object v1, p0, Lcom/fodlam/yds/MatchWordActivity;->m:Ljava/util/ArrayList;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    const-string v0, "stepCount"

    iget v1, p0, Lcom/fodlam/yds/MatchWordActivity;->q:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "TARGET_COUNT"

    iget v1, p0, Lcom/fodlam/yds/MatchWordActivity;->z:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    return-void
.end method

.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 6

    const/4 v5, 0x0

    const/4 v4, 0x0

    const-string v0, ""

    const-string v1, ""

    invoke-static {v0, v1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    move-result-object v1

    new-instance v2, Landroid/view/View$DragShadowBuilder;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/CardView;

    invoke-direct {v2, v0}, Landroid/view/View$DragShadowBuilder;-><init>(Landroid/view/View;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x18

    if-lt v0, v3, :cond_0

    invoke-virtual {p1, v1, v2, v5, v4}, Landroid/view/View;->startDragAndDrop(Landroid/content/ClipData;Landroid/view/View$DragShadowBuilder;Ljava/lang/Object;I)Z

    :goto_0
    iput-object p1, p0, Lcom/fodlam/yds/MatchWordActivity;->r:Landroid/view/View;

    return v4

    :cond_0
    invoke-virtual {p1, v1, v2, v5, v4}, Landroid/view/View;->startDrag(Landroid/content/ClipData;Landroid/view/View$DragShadowBuilder;Ljava/lang/Object;I)Z

    goto :goto_0
.end method
