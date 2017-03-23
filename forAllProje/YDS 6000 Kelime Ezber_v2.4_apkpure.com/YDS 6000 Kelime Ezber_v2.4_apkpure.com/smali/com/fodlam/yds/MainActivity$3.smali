.class Lcom/fodlam/yds/MainActivity$3;
.super Lcom/google/android/gms/ads/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fodlam/yds/MainActivity;->l()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fodlam/yds/MainActivity;


# direct methods
.method constructor <init>(Lcom/fodlam/yds/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/fodlam/yds/MainActivity$3;->a:Lcom/fodlam/yds/MainActivity;

    invoke-direct {p0}, Lcom/google/android/gms/ads/a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    invoke-super {p0}, Lcom/google/android/gms/ads/a;->a()V

    iget-object v0, p0, Lcom/fodlam/yds/MainActivity$3;->a:Lcom/fodlam/yds/MainActivity;

    iget-object v0, v0, Lcom/fodlam/yds/MainActivity;->s:Lcom/google/android/gms/ads/AdView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/AdView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fodlam/yds/MainActivity$3;->a:Lcom/fodlam/yds/MainActivity;

    const v1, 0x7f10013e

    invoke-virtual {v0, v1}, Lcom/fodlam/yds/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public a(I)V
    .locals 2

    invoke-super {p0, p1}, Lcom/google/android/gms/ads/a;->a(I)V

    iget-object v0, p0, Lcom/fodlam/yds/MainActivity$3;->a:Lcom/fodlam/yds/MainActivity;

    iget-object v0, v0, Lcom/fodlam/yds/MainActivity;->s:Lcom/google/android/gms/ads/AdView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/AdView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fodlam/yds/MainActivity$3;->a:Lcom/fodlam/yds/MainActivity;

    const v1, 0x7f10013e

    invoke-virtual {v0, v1}, Lcom/fodlam/yds/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
