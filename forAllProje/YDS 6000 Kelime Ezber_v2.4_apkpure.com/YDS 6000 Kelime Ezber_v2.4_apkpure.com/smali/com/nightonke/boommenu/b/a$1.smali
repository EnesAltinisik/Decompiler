.class Lcom/nightonke/boommenu/b/a$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nightonke/boommenu/b/a;->a(Landroid/view/ViewGroup;)V
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

    iput-object p1, p0, Lcom/nightonke/boommenu/b/a$1;->a:Lcom/nightonke/boommenu/b/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/nightonke/boommenu/b/a$1;->a:Lcom/nightonke/boommenu/b/a;

    iget-object v0, v0, Lcom/nightonke/boommenu/b/a;->aG:Landroid/widget/TextView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setSelected(Z)V

    return-void
.end method
