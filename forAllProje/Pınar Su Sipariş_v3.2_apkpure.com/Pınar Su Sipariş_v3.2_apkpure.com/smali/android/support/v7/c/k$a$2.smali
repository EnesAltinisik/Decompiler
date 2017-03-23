.class Landroid/support/v7/c/k$a$2;
.super Ljava/lang/Object;
.source "RegisteredMediaRouteProvider.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/support/v7/c/k$a;->binderDied()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/support/v7/c/k$a;


# direct methods
.method constructor <init>(Landroid/support/v7/c/k$a;)V
    .locals 0

    .prologue
    .line 506
    iput-object p1, p0, Landroid/support/v7/c/k$a$2;->a:Landroid/support/v7/c/k$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 509
    iget-object v0, p0, Landroid/support/v7/c/k$a$2;->a:Landroid/support/v7/c/k$a;

    iget-object v0, v0, Landroid/support/v7/c/k$a;->a:Landroid/support/v7/c/k;

    iget-object v1, p0, Landroid/support/v7/c/k$a$2;->a:Landroid/support/v7/c/k$a;

    invoke-static {v0, v1}, Landroid/support/v7/c/k;->b(Landroid/support/v7/c/k;Landroid/support/v7/c/k$a;)V

    .line 510
    return-void
.end method
