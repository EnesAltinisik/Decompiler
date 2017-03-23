.class public Lcom/fodlam/yds/HelperActivity;
.super Landroid/support/v7/app/e;


# instance fields
.field m:Lcom/fodlam/yds/a/a;

.field n:Landroid/widget/ExpandableListView;

.field o:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field p:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Lcom/fodlam/yds/a/a$a;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/support/v7/app/e;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/fodlam/yds/HelperActivity;Lcom/fodlam/yds/a/a$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/fodlam/yds/HelperActivity;->a(Lcom/fodlam/yds/a/a$a;)V

    return-void
.end method

.method private a(Lcom/fodlam/yds/a/a$a;)V
    .locals 2

    new-instance v0, Lcom/afollestad/materialdialogs/f$a;

    invoke-direct {v0, p0}, Lcom/afollestad/materialdialogs/f$a;-><init>(Landroid/content/Context;)V

    iget-object v1, p1, Lcom/fodlam/yds/a/a$a;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/afollestad/materialdialogs/f$a;->a(Ljava/lang/CharSequence;)Lcom/afollestad/materialdialogs/f$a;

    move-result-object v0

    iget-object v1, p1, Lcom/fodlam/yds/a/a$a;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/afollestad/materialdialogs/f$a;->b(Ljava/lang/CharSequence;)Lcom/afollestad/materialdialogs/f$a;

    move-result-object v0

    const v1, 0x7f09036a

    invoke-virtual {v0, v1}, Lcom/afollestad/materialdialogs/f$a;->f(I)Lcom/afollestad/materialdialogs/f$a;

    move-result-object v0

    sget-object v1, Lcom/afollestad/materialdialogs/h;->a:Lcom/afollestad/materialdialogs/h;

    invoke-virtual {v0, v1}, Lcom/afollestad/materialdialogs/f$a;->a(Lcom/afollestad/materialdialogs/h;)Lcom/afollestad/materialdialogs/f$a;

    move-result-object v0

    const v1, 0x7f0e001e

    invoke-virtual {v0, v1}, Lcom/afollestad/materialdialogs/f$a;->i(I)Lcom/afollestad/materialdialogs/f$a;

    move-result-object v0

    const v1, -0xbbbbbc

    invoke-virtual {v0, v1}, Lcom/afollestad/materialdialogs/f$a;->d(I)Lcom/afollestad/materialdialogs/f$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/afollestad/materialdialogs/f$a;->c()Lcom/afollestad/materialdialogs/f;

    return-void
.end method


# virtual methods
.method public j()Ljava/util/HashMap;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Lcom/fodlam/yds/a/a$a;",
            ">;>;"
        }
    .end annotation

    const v9, 0x7f090383

    const v8, 0x7f090382

    const v7, 0x7f090381

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Lcom/fodlam/yds/a/a$a;

    const v3, 0x7f090309

    invoke-virtual {p0, v3}, Lcom/fodlam/yds/HelperActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x7f09031d

    invoke-virtual {p0, v4}, Lcom/fodlam/yds/HelperActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/fodlam/yds/a/a$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v2, Lcom/fodlam/yds/a/a$a;

    const v3, 0x7f090312

    invoke-virtual {p0, v3}, Lcom/fodlam/yds/HelperActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x7f090326

    invoke-virtual {p0, v4}, Lcom/fodlam/yds/HelperActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/fodlam/yds/a/a$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v2, Lcom/fodlam/yds/a/a$a;

    const v3, 0x7f090313

    invoke-virtual {p0, v3}, Lcom/fodlam/yds/HelperActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x7f090327

    invoke-virtual {p0, v4}, Lcom/fodlam/yds/HelperActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/fodlam/yds/a/a$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v2, Lcom/fodlam/yds/a/a$a;

    const v3, 0x7f090314

    invoke-virtual {p0, v3}, Lcom/fodlam/yds/HelperActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x7f090328

    invoke-virtual {p0, v4}, Lcom/fodlam/yds/HelperActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/fodlam/yds/a/a$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v2, Lcom/fodlam/yds/a/a$a;

    const v3, 0x7f090315

    invoke-virtual {p0, v3}, Lcom/fodlam/yds/HelperActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x7f090329

    invoke-virtual {p0, v4}, Lcom/fodlam/yds/HelperActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/fodlam/yds/a/a$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v2, Lcom/fodlam/yds/a/a$a;

    const v3, 0x7f090316

    invoke-virtual {p0, v3}, Lcom/fodlam/yds/HelperActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x7f09032a

    invoke-virtual {p0, v4}, Lcom/fodlam/yds/HelperActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/fodlam/yds/a/a$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    new-instance v3, Lcom/fodlam/yds/a/a$a;

    const v4, 0x7f090318

    invoke-virtual {p0, v4}, Lcom/fodlam/yds/HelperActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    const v5, 0x7f09032c

    invoke-virtual {p0, v5}, Lcom/fodlam/yds/HelperActivity;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Lcom/fodlam/yds/a/a$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v3, Lcom/fodlam/yds/a/a$a;

    const v4, 0x7f090317

    invoke-virtual {p0, v4}, Lcom/fodlam/yds/HelperActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    const v5, 0x7f09032b

    invoke-virtual {p0, v5}, Lcom/fodlam/yds/HelperActivity;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Lcom/fodlam/yds/a/a$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v3, Lcom/fodlam/yds/a/a$a;

    const v4, 0x7f090319

    invoke-virtual {p0, v4}, Lcom/fodlam/yds/HelperActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    const v5, 0x7f09032d

    invoke-virtual {p0, v5}, Lcom/fodlam/yds/HelperActivity;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Lcom/fodlam/yds/a/a$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v3, Lcom/fodlam/yds/a/a$a;

    const v4, 0x7f09031a

    invoke-virtual {p0, v4}, Lcom/fodlam/yds/HelperActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    const v5, 0x7f09032e

    invoke-virtual {p0, v5}, Lcom/fodlam/yds/HelperActivity;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Lcom/fodlam/yds/a/a$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v3, Lcom/fodlam/yds/a/a$a;

    const v4, 0x7f09031b

    invoke-virtual {p0, v4}, Lcom/fodlam/yds/HelperActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    const v5, 0x7f09032f

    invoke-virtual {p0, v5}, Lcom/fodlam/yds/HelperActivity;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Lcom/fodlam/yds/a/a$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v3, Lcom/fodlam/yds/a/a$a;

    const v4, 0x7f09030a

    invoke-virtual {p0, v4}, Lcom/fodlam/yds/HelperActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    const v5, 0x7f09031e

    invoke-virtual {p0, v5}, Lcom/fodlam/yds/HelperActivity;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Lcom/fodlam/yds/a/a$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    new-instance v4, Lcom/fodlam/yds/a/a$a;

    const v5, 0x7f09030b

    invoke-virtual {p0, v5}, Lcom/fodlam/yds/HelperActivity;->getString(I)Ljava/lang/String;

    move-result-object v5

    const v6, 0x7f09031f

    invoke-virtual {p0, v6}, Lcom/fodlam/yds/HelperActivity;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v4, v5, v6}, Lcom/fodlam/yds/a/a$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v4, Lcom/fodlam/yds/a/a$a;

    const v5, 0x7f09030c

    invoke-virtual {p0, v5}, Lcom/fodlam/yds/HelperActivity;->getString(I)Ljava/lang/String;

    move-result-object v5

    const v6, 0x7f090320

    invoke-virtual {p0, v6}, Lcom/fodlam/yds/HelperActivity;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v4, v5, v6}, Lcom/fodlam/yds/a/a$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v4, Lcom/fodlam/yds/a/a$a;

    const v5, 0x7f09030d

    invoke-virtual {p0, v5}, Lcom/fodlam/yds/HelperActivity;->getString(I)Ljava/lang/String;

    move-result-object v5

    const v6, 0x7f090321

    invoke-virtual {p0, v6}, Lcom/fodlam/yds/HelperActivity;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v4, v5, v6}, Lcom/fodlam/yds/a/a$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v4, Lcom/fodlam/yds/a/a$a;

    const v5, 0x7f09030e

    invoke-virtual {p0, v5}, Lcom/fodlam/yds/HelperActivity;->getString(I)Ljava/lang/String;

    move-result-object v5

    const v6, 0x7f090322

    invoke-virtual {p0, v6}, Lcom/fodlam/yds/HelperActivity;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v4, v5, v6}, Lcom/fodlam/yds/a/a$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v4, Lcom/fodlam/yds/a/a$a;

    const v5, 0x7f09030f

    invoke-virtual {p0, v5}, Lcom/fodlam/yds/HelperActivity;->getString(I)Ljava/lang/String;

    move-result-object v5

    const v6, 0x7f090323

    invoke-virtual {p0, v6}, Lcom/fodlam/yds/HelperActivity;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v4, v5, v6}, Lcom/fodlam/yds/a/a$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v4, Lcom/fodlam/yds/a/a$a;

    const v5, 0x7f090310

    invoke-virtual {p0, v5}, Lcom/fodlam/yds/HelperActivity;->getString(I)Ljava/lang/String;

    move-result-object v5

    const v6, 0x7f090324

    invoke-virtual {p0, v6}, Lcom/fodlam/yds/HelperActivity;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v4, v5, v6}, Lcom/fodlam/yds/a/a$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v4, Lcom/fodlam/yds/a/a$a;

    const v5, 0x7f090311

    invoke-virtual {p0, v5}, Lcom/fodlam/yds/HelperActivity;->getString(I)Ljava/lang/String;

    move-result-object v5

    const v6, 0x7f090325

    invoke-virtual {p0, v6}, Lcom/fodlam/yds/HelperActivity;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v4, v5, v6}, Lcom/fodlam/yds/a/a$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, v9}, Lcom/fodlam/yds/HelperActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v7}, Lcom/fodlam/yds/HelperActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v8}, Lcom/fodlam/yds/HelperActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/fodlam/yds/HelperActivity;->o:Ljava/util/List;

    invoke-virtual {p0, v8}, Lcom/fodlam/yds/HelperActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/fodlam/yds/HelperActivity;->o:Ljava/util/List;

    invoke-virtual {p0, v7}, Lcom/fodlam/yds/HelperActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/fodlam/yds/HelperActivity;->o:Ljava/util/List;

    invoke-virtual {p0, v9}, Lcom/fodlam/yds/HelperActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Landroid/support/v7/app/e;->onCreate(Landroid/os/Bundle;)V

    const v0, 0x7f04001d

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/HelperActivity;->setContentView(I)V

    const v0, 0x7f100127

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/HelperActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/Toolbar;

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/HelperActivity;->a(Landroid/support/v7/widget/Toolbar;)V

    const v0, 0x7f09031c

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/HelperActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/HelperActivity;->setTitle(Ljava/lang/CharSequence;)V

    const v0, 0x7f100128

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/HelperActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ExpandableListView;

    iput-object v0, p0, Lcom/fodlam/yds/HelperActivity;->n:Landroid/widget/ExpandableListView;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/fodlam/yds/HelperActivity;->o:Ljava/util/List;

    invoke-virtual {p0}, Lcom/fodlam/yds/HelperActivity;->j()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/fodlam/yds/HelperActivity;->p:Ljava/util/HashMap;

    new-instance v0, Lcom/fodlam/yds/a/a;

    iget-object v1, p0, Lcom/fodlam/yds/HelperActivity;->o:Ljava/util/List;

    iget-object v2, p0, Lcom/fodlam/yds/HelperActivity;->p:Ljava/util/HashMap;

    invoke-direct {v0, p0, v1, v2}, Lcom/fodlam/yds/a/a;-><init>(Landroid/content/Context;Ljava/util/List;Ljava/util/HashMap;)V

    iput-object v0, p0, Lcom/fodlam/yds/HelperActivity;->m:Lcom/fodlam/yds/a/a;

    iget-object v0, p0, Lcom/fodlam/yds/HelperActivity;->n:Landroid/widget/ExpandableListView;

    iget-object v1, p0, Lcom/fodlam/yds/HelperActivity;->m:Lcom/fodlam/yds/a/a;

    invoke-virtual {v0, v1}, Landroid/widget/ExpandableListView;->setAdapter(Landroid/widget/ExpandableListAdapter;)V

    iget-object v0, p0, Lcom/fodlam/yds/HelperActivity;->n:Landroid/widget/ExpandableListView;

    new-instance v1, Lcom/fodlam/yds/HelperActivity$1;

    invoke-direct {v1, p0}, Lcom/fodlam/yds/HelperActivity$1;-><init>(Lcom/fodlam/yds/HelperActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ExpandableListView;->setOnChildClickListener(Landroid/widget/ExpandableListView$OnChildClickListener;)V

    iget-object v0, p0, Lcom/fodlam/yds/HelperActivity;->n:Landroid/widget/ExpandableListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ExpandableListView;->expandGroup(I)Z

    iget-object v0, p0, Lcom/fodlam/yds/HelperActivity;->n:Landroid/widget/ExpandableListView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/ExpandableListView;->expandGroup(I)Z

    return-void
.end method

.method protected onDestroy()V
    .locals 1

    const/4 v0, 0x0

    invoke-super {p0}, Landroid/support/v7/app/e;->onDestroy()V

    iput-object v0, p0, Lcom/fodlam/yds/HelperActivity;->m:Lcom/fodlam/yds/a/a;

    iput-object v0, p0, Lcom/fodlam/yds/HelperActivity;->n:Landroid/widget/ExpandableListView;

    iput-object v0, p0, Lcom/fodlam/yds/HelperActivity;->o:Ljava/util/List;

    iput-object v0, p0, Lcom/fodlam/yds/HelperActivity;->p:Ljava/util/HashMap;

    return-void
.end method
