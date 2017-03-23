.class public Lcom/nightonke/boommenu/b/i$a;
.super Lcom/nightonke/boommenu/b/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nightonke/boommenu/b/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/nightonke/boommenu/b/b;-><init>()V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/nightonke/boommenu/b/i$a;->an:I

    return v0
.end method

.method public a(I)Lcom/nightonke/boommenu/b/i$a;
    .locals 0

    iput p1, p0, Lcom/nightonke/boommenu/b/i$a;->a:I

    return-object p0
.end method

.method public a(Lcom/nightonke/boommenu/b/g;)Lcom/nightonke/boommenu/b/i$a;
    .locals 0

    iput-object p1, p0, Lcom/nightonke/boommenu/b/i$a;->b:Lcom/nightonke/boommenu/b/g;

    return-object p0
.end method

.method public b(Landroid/content/Context;)Lcom/nightonke/boommenu/b/i;
    .locals 2

    new-instance v0, Lcom/nightonke/boommenu/b/i;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/nightonke/boommenu/b/i;-><init>(Lcom/nightonke/boommenu/b/i$a;Landroid/content/Context;Lcom/nightonke/boommenu/b/i$1;)V

    return-object v0
.end method
