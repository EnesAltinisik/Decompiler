.class Lcom/nightonke/boommenu/BoomMenuButton$4;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nightonke/boommenu/BoomMenuButton;->a(Lcom/nightonke/boommenu/c/a;Lcom/nightonke/boommenu/b/a;Landroid/graphics/Point;Landroid/graphics/Point;IZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/nightonke/boommenu/c/a;

.field final synthetic b:Lcom/nightonke/boommenu/b/a;

.field final synthetic c:Landroid/graphics/Point;

.field final synthetic d:Landroid/graphics/Point;

.field final synthetic e:I

.field final synthetic f:Z

.field final synthetic g:Lcom/nightonke/boommenu/BoomMenuButton;


# direct methods
.method constructor <init>(Lcom/nightonke/boommenu/BoomMenuButton;Lcom/nightonke/boommenu/c/a;Lcom/nightonke/boommenu/b/a;Landroid/graphics/Point;Landroid/graphics/Point;IZ)V
    .locals 0

    iput-object p1, p0, Lcom/nightonke/boommenu/BoomMenuButton$4;->g:Lcom/nightonke/boommenu/BoomMenuButton;

    iput-object p2, p0, Lcom/nightonke/boommenu/BoomMenuButton$4;->a:Lcom/nightonke/boommenu/c/a;

    iput-object p3, p0, Lcom/nightonke/boommenu/BoomMenuButton$4;->b:Lcom/nightonke/boommenu/b/a;

    iput-object p4, p0, Lcom/nightonke/boommenu/BoomMenuButton$4;->c:Landroid/graphics/Point;

    iput-object p5, p0, Lcom/nightonke/boommenu/BoomMenuButton$4;->d:Landroid/graphics/Point;

    iput p6, p0, Lcom/nightonke/boommenu/BoomMenuButton$4;->e:I

    iput-boolean p7, p0, Lcom/nightonke/boommenu/BoomMenuButton$4;->f:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    iget-object v0, p0, Lcom/nightonke/boommenu/BoomMenuButton$4;->g:Lcom/nightonke/boommenu/BoomMenuButton;

    iget-object v1, p0, Lcom/nightonke/boommenu/BoomMenuButton$4;->a:Lcom/nightonke/boommenu/c/a;

    iget-object v2, p0, Lcom/nightonke/boommenu/BoomMenuButton$4;->b:Lcom/nightonke/boommenu/b/a;

    iget-object v3, p0, Lcom/nightonke/boommenu/BoomMenuButton$4;->c:Landroid/graphics/Point;

    iget-object v4, p0, Lcom/nightonke/boommenu/BoomMenuButton$4;->d:Landroid/graphics/Point;

    iget v5, p0, Lcom/nightonke/boommenu/BoomMenuButton$4;->e:I

    iget-boolean v6, p0, Lcom/nightonke/boommenu/BoomMenuButton$4;->f:Z

    invoke-static/range {v0 .. v6}, Lcom/nightonke/boommenu/BoomMenuButton;->a(Lcom/nightonke/boommenu/BoomMenuButton;Lcom/nightonke/boommenu/c/a;Lcom/nightonke/boommenu/b/a;Landroid/graphics/Point;Landroid/graphics/Point;IZ)V

    return-void
.end method
