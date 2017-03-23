.class final Lcom/gigamole/infinitecycleviewpager/e$f$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/support/v4/g/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/gigamole/infinitecycleviewpager/e$f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/support/v4/g/e",
        "<",
        "Lcom/gigamole/infinitecycleviewpager/e$f;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Lcom/gigamole/infinitecycleviewpager/e$f;
    .locals 1

    new-instance v0, Lcom/gigamole/infinitecycleviewpager/e$f;

    invoke-direct {v0, p1, p2}, Lcom/gigamole/infinitecycleviewpager/e$f;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0
.end method

.method public a(I)[Lcom/gigamole/infinitecycleviewpager/e$f;
    .locals 1

    new-array v0, p1, [Lcom/gigamole/infinitecycleviewpager/e$f;

    return-object v0
.end method

.method public synthetic b(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1, p2}, Lcom/gigamole/infinitecycleviewpager/e$f$1;->a(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Lcom/gigamole/infinitecycleviewpager/e$f;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b(I)[Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/gigamole/infinitecycleviewpager/e$f$1;->a(I)[Lcom/gigamole/infinitecycleviewpager/e$f;

    move-result-object v0

    return-object v0
.end method
