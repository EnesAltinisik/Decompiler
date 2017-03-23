.class final Lcom/google/android/gms/b/wx$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/wx;->a(Landroid/content/Context;Lcom/google/android/gms/b/sv;Lcom/google/android/gms/b/pk;Lcom/google/android/gms/b/ww;Lcom/google/android/gms/b/wf;)Lcom/google/android/gms/b/wi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable",
        "<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/ww;

.field final synthetic b:Landroid/content/Context;

.field final synthetic c:Lcom/google/android/gms/b/wf;

.field final synthetic d:Landroid/os/Bundle;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/ww;Landroid/content/Context;Lcom/google/android/gms/b/wf;Landroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/wx$1;->a:Lcom/google/android/gms/b/ww;

    iput-object p2, p0, Lcom/google/android/gms/b/wx$1;->b:Landroid/content/Context;

    iput-object p3, p0, Lcom/google/android/gms/b/wx$1;->c:Lcom/google/android/gms/b/wf;

    iput-object p4, p0, Lcom/google/android/gms/b/wx$1;->d:Landroid/os/Bundle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Void;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/wx$1;->c:Lcom/google/android/gms/b/wf;

    iget-object v0, v0, Lcom/google/android/gms/b/wf;->g:Landroid/content/pm/PackageInfo;

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    const/4 v0, 0x0

    return-object v0
.end method

.method public synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/b/wx$1;->a()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
