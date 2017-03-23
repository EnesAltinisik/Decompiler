.class Lcom/nightonke/boommenu/b/a$3;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nightonke/boommenu/b/a;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/nightonke/boommenu/b/a;


# direct methods
.method constructor <init>(Lcom/nightonke/boommenu/b/a;)V
    .locals 0

    iput-object p1, p0, Lcom/nightonke/boommenu/b/a$3;->a:Lcom/nightonke/boommenu/b/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Lcom/nightonke/boommenu/b/a$3;->a:Lcom/nightonke/boommenu/b/a;

    iget-object v0, v0, Lcom/nightonke/boommenu/b/a;->c:Lcom/nightonke/boommenu/b/g;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/nightonke/boommenu/b/a$3;->a:Lcom/nightonke/boommenu/b/a;

    iget-object v0, v0, Lcom/nightonke/boommenu/b/a;->c:Lcom/nightonke/boommenu/b/g;

    iget-object v1, p0, Lcom/nightonke/boommenu/b/a$3;->a:Lcom/nightonke/boommenu/b/a;

    iget v1, v1, Lcom/nightonke/boommenu/b/a;->b:I

    iget-object v2, p0, Lcom/nightonke/boommenu/b/a$3;->a:Lcom/nightonke/boommenu/b/a;

    invoke-interface {v0, v1, v2}, Lcom/nightonke/boommenu/b/g;->a(ILcom/nightonke/boommenu/b/a;)V

    :cond_0
    iget-object v0, p0, Lcom/nightonke/boommenu/b/a$3;->a:Lcom/nightonke/boommenu/b/a;

    iget-object v0, v0, Lcom/nightonke/boommenu/b/a;->d:Lcom/nightonke/boommenu/b/h;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/nightonke/boommenu/b/a$3;->a:Lcom/nightonke/boommenu/b/a;

    iget-object v0, v0, Lcom/nightonke/boommenu/b/a;->d:Lcom/nightonke/boommenu/b/h;

    iget-object v1, p0, Lcom/nightonke/boommenu/b/a$3;->a:Lcom/nightonke/boommenu/b/a;

    iget v1, v1, Lcom/nightonke/boommenu/b/a;->b:I

    invoke-interface {v0, v1}, Lcom/nightonke/boommenu/b/h;->a(I)V

    :cond_1
    return-void
.end method
