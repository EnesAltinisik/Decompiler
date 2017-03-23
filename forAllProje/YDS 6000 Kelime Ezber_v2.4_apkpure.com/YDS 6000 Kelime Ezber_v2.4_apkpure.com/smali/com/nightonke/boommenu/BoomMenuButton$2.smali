.class Lcom/nightonke/boommenu/BoomMenuButton$2;
.super Landroid/animation/AnimatorListenerAdapter;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nightonke/boommenu/BoomMenuButton;->c(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/nightonke/boommenu/BoomMenuButton;


# direct methods
.method constructor <init>(Lcom/nightonke/boommenu/BoomMenuButton;)V
    .locals 0

    iput-object p1, p0, Lcom/nightonke/boommenu/BoomMenuButton$2;->a:Lcom/nightonke/boommenu/BoomMenuButton;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton$2;->a:Lcom/nightonke/boommenu/BoomMenuButton;

    sget-object v1, Lcom/nightonke/boommenu/a;->a:Lcom/nightonke/boommenu/a;

    invoke-static {v0, v1}, Lcom/nightonke/boommenu/BoomMenuButton;->a(Lcom/nightonke/boommenu/BoomMenuButton;Lcom/nightonke/boommenu/a;)Lcom/nightonke/boommenu/a;

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton$2;->a:Lcom/nightonke/boommenu/BoomMenuButton;

    invoke-static {v0}, Lcom/nightonke/boommenu/BoomMenuButton;->a(Lcom/nightonke/boommenu/BoomMenuButton;)Lcom/nightonke/boommenu/d;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton$2;->a:Lcom/nightonke/boommenu/BoomMenuButton;

    invoke-static {v0}, Lcom/nightonke/boommenu/BoomMenuButton;->a(Lcom/nightonke/boommenu/BoomMenuButton;)Lcom/nightonke/boommenu/d;

    move-result-object v0

    invoke-interface {v0}, Lcom/nightonke/boommenu/d;->e()V

    :cond_0
    return-void
.end method
