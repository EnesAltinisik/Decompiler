.class Lcom/gigamole/infinitecycleviewpager/e$e;
.super Landroid/database/DataSetObserver;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/gigamole/infinitecycleviewpager/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "e"
.end annotation


# instance fields
.field final synthetic a:Lcom/gigamole/infinitecycleviewpager/e;


# direct methods
.method private constructor <init>(Lcom/gigamole/infinitecycleviewpager/e;)V
    .locals 0

    iput-object p1, p0, Lcom/gigamole/infinitecycleviewpager/e$e;->a:Lcom/gigamole/infinitecycleviewpager/e;

    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/gigamole/infinitecycleviewpager/e;Lcom/gigamole/infinitecycleviewpager/e$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/gigamole/infinitecycleviewpager/e$e;-><init>(Lcom/gigamole/infinitecycleviewpager/e;)V

    return-void
.end method


# virtual methods
.method public onChanged()V
    .locals 1

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/e$e;->a:Lcom/gigamole/infinitecycleviewpager/e;

    invoke-virtual {v0}, Lcom/gigamole/infinitecycleviewpager/e;->a()V

    return-void
.end method

.method public onInvalidated()V
    .locals 1

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/e$e;->a:Lcom/gigamole/infinitecycleviewpager/e;

    invoke-virtual {v0}, Lcom/gigamole/infinitecycleviewpager/e;->a()V

    return-void
.end method
