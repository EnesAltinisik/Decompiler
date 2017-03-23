.class public Lcom/pinarsu/siparis/ui/activity/ImageViewerActivity;
.super Landroid/support/v7/app/AppCompatActivity;
.source "ImageViewerActivity.java"


# instance fields
.field im:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00d4
    .end annotation
.end field

.field private url:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Landroid/support/v7/app/AppCompatActivity;-><init>()V

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 26
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 28
    const v0, 0x7f030020

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/ui/activity/ImageViewerActivity;->setContentView(I)V

    .line 29
    invoke-static {p0}, Lbutterknife/ButterKnife;->inject(Landroid/app/Activity;)V

    .line 30
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/ImageViewerActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    .line 31
    const-string v1, "url"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, " "

    const-string v2, "%20"

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/ImageViewerActivity;->url:Ljava/lang/String;

    .line 32
    invoke-static {p0}, Lcom/squareup/picasso/Picasso;->with(Landroid/content/Context;)Lcom/squareup/picasso/Picasso;

    move-result-object v0

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/ImageViewerActivity;->url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/squareup/picasso/Picasso;->load(Ljava/lang/String;)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/ImageViewerActivity;->im:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;

    invoke-virtual {v0, v1}, Lcom/squareup/picasso/RequestCreator;->into(Landroid/widget/ImageView;)V

    .line 33
    return-void
.end method
