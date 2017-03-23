.class Lcom/gigamole/infinitecycleviewpager/b;
.super Landroid/support/v4/view/aa;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/gigamole/infinitecycleviewpager/b$a;
    }
.end annotation


# instance fields
.field private final a:Landroid/support/v4/view/aa;

.field private b:Lcom/gigamole/infinitecycleviewpager/b$a;


# direct methods
.method public constructor <init>(Landroid/support/v4/view/aa;)V
    .locals 0

    invoke-direct {p0}, Landroid/support/v4/view/aa;-><init>()V

    iput-object p1, p0, Lcom/gigamole/infinitecycleviewpager/b;->a:Landroid/support/v4/view/aa;

    return-void
.end method


# virtual methods
.method protected a(I)I
    .locals 1

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/b;->a:Landroid/support/v4/view/aa;

    invoke-virtual {v0}, Landroid/support/v4/view/aa;->b()I

    move-result v0

    rem-int v0, p1, v0

    return v0
.end method

.method public a(Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/b;->a:Landroid/support/v4/view/aa;

    invoke-virtual {v0, p1}, Landroid/support/v4/view/aa;->a(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public a()Landroid/os/Parcelable;
    .locals 1

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/b;->a:Landroid/support/v4/view/aa;

    invoke-virtual {v0}, Landroid/support/v4/view/aa;->a()Landroid/os/Parcelable;

    move-result-object v0

    return-object v0
.end method

.method public a(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/b;->a:Landroid/support/v4/view/aa;

    invoke-virtual {p0, p2}, Lcom/gigamole/infinitecycleviewpager/b;->a(I)I

    move-result v1

    invoke-virtual {v0, p1, v1}, Landroid/support/v4/view/aa;->a(Landroid/view/ViewGroup;I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public a(Landroid/database/DataSetObserver;)V
    .locals 1

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/b;->a:Landroid/support/v4/view/aa;

    invoke-virtual {v0, p1}, Landroid/support/v4/view/aa;->a(Landroid/database/DataSetObserver;)V

    return-void
.end method

.method public a(Landroid/os/Parcelable;Ljava/lang/ClassLoader;)V
    .locals 1

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/b;->a:Landroid/support/v4/view/aa;

    invoke-virtual {v0, p1, p2}, Landroid/support/v4/view/aa;->a(Landroid/os/Parcelable;Ljava/lang/ClassLoader;)V

    return-void
.end method

.method public a(Landroid/view/ViewGroup;)V
    .locals 1

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/b;->a:Landroid/support/v4/view/aa;

    invoke-virtual {v0, p1}, Landroid/support/v4/view/aa;->a(Landroid/view/ViewGroup;)V

    return-void
.end method

.method public a(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/b;->a:Landroid/support/v4/view/aa;

    invoke-virtual {p0, p2}, Lcom/gigamole/infinitecycleviewpager/b;->a(I)I

    move-result v1

    invoke-virtual {v0, p1, v1, p3}, Landroid/support/v4/view/aa;->a(Landroid/view/ViewGroup;ILjava/lang/Object;)V

    return-void
.end method

.method public a(Lcom/gigamole/infinitecycleviewpager/b$a;)V
    .locals 0

    iput-object p1, p0, Lcom/gigamole/infinitecycleviewpager/b;->b:Lcom/gigamole/infinitecycleviewpager/b$a;

    return-void
.end method

.method public a(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/b;->a:Landroid/support/v4/view/aa;

    invoke-virtual {v0, p1, p2}, Landroid/support/v4/view/aa;->a(Landroid/view/View;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public b()I
    .locals 1

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/b;->a:Landroid/support/v4/view/aa;

    invoke-virtual {v0}, Landroid/support/v4/view/aa;->b()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    const v0, 0x989680

    goto :goto_0
.end method

.method public b(Landroid/database/DataSetObserver;)V
    .locals 1

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/b;->a:Landroid/support/v4/view/aa;

    invoke-virtual {v0, p1}, Landroid/support/v4/view/aa;->b(Landroid/database/DataSetObserver;)V

    return-void
.end method

.method public b(Landroid/view/ViewGroup;)V
    .locals 1

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/b;->a:Landroid/support/v4/view/aa;

    invoke-virtual {v0, p1}, Landroid/support/v4/view/aa;->b(Landroid/view/ViewGroup;)V

    return-void
.end method

.method public b(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/b;->a:Landroid/support/v4/view/aa;

    invoke-virtual {v0, p1, p2, p3}, Landroid/support/v4/view/aa;->b(Landroid/view/ViewGroup;ILjava/lang/Object;)V

    return-void
.end method

.method public c()Landroid/support/v4/view/aa;
    .locals 1

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/b;->a:Landroid/support/v4/view/aa;

    return-object v0
.end method

.method public c(I)Ljava/lang/CharSequence;
    .locals 2

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/b;->a:Landroid/support/v4/view/aa;

    invoke-virtual {p0, p1}, Lcom/gigamole/infinitecycleviewpager/b;->a(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/support/v4/view/aa;->c(I)Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public d(I)F
    .locals 2

    iget-object v0, p0, Lcom/gigamole/infinitecycleviewpager/b;->a:Landroid/support/v4/view/aa;

    invoke-virtual {p0, p1}, Lcom/gigamole/infinitecycleviewpager/b;->a(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/support/v4/view/aa;->d(I)F

    move-result v0

    return v0
.end method
