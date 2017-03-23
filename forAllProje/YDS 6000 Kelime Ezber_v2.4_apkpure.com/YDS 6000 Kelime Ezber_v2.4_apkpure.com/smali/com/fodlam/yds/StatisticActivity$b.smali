.class public Lcom/fodlam/yds/StatisticActivity$b;
.super Landroid/support/v4/b/u;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fodlam/yds/StatisticActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lcom/fodlam/yds/StatisticActivity;


# direct methods
.method public constructor <init>(Lcom/fodlam/yds/StatisticActivity;Landroid/support/v4/b/q;)V
    .locals 0

    iput-object p1, p0, Lcom/fodlam/yds/StatisticActivity$b;->a:Lcom/fodlam/yds/StatisticActivity;

    invoke-direct {p0, p2}, Landroid/support/v4/b/u;-><init>(Landroid/support/v4/b/q;)V

    return-void
.end method


# virtual methods
.method public a(I)Landroid/support/v4/b/l;
    .locals 1

    add-int/lit8 v0, p1, 0x1

    invoke-static {v0}, Lcom/fodlam/yds/StatisticActivity$a;->d(I)Lcom/fodlam/yds/StatisticActivity$a;

    move-result-object v0

    return-object v0
.end method

.method public b()I
    .locals 1

    const/4 v0, 0x3

    return v0
.end method

.method public c(I)Ljava/lang/CharSequence;
    .locals 2

    packed-switch p1, :pswitch_data_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :pswitch_0
    iget-object v0, p0, Lcom/fodlam/yds/StatisticActivity$b;->a:Lcom/fodlam/yds/StatisticActivity;

    const v1, 0x7f090303

    invoke-virtual {v0, v1}, Lcom/fodlam/yds/StatisticActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Lcom/fodlam/yds/StatisticActivity$b;->a:Lcom/fodlam/yds/StatisticActivity;

    const v1, 0x7f090300

    invoke-virtual {v0, v1}, Lcom/fodlam/yds/StatisticActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :pswitch_2
    iget-object v0, p0, Lcom/fodlam/yds/StatisticActivity$b;->a:Lcom/fodlam/yds/StatisticActivity;

    const v1, 0x7f090396

    invoke-virtual {v0, v1}, Lcom/fodlam/yds/StatisticActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
