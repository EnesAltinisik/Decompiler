.class Lcom/gigamole/infinitecycleviewpager/a$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/gigamole/infinitecycleviewpager/a;->m()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/gigamole/infinitecycleviewpager/a;


# direct methods
.method constructor <init>(Lcom/gigamole/infinitecycleviewpager/a;)V
    .locals 0

    iput-object p1, p0, Lcom/gigamole/infinitecycleviewpager/a$2;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a$2;->a:Lcom/gigamole/infinitecycleviewpager/a;

    invoke-virtual {v0}, Lcom/gigamole/infinitecycleviewpager/a;->l()V

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/a$2;->a:Lcom/gigamole/infinitecycleviewpager/a;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/gigamole/infinitecycleviewpager/a;->a(Lcom/gigamole/infinitecycleviewpager/a;Z)Z

    return-void
.end method
