.class Lcom/google/android/gms/b/mj$1;
.super Landroid/content/BroadcastReceiver;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/mj;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/mj;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/mj;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/mj$1;->a:Lcom/google/android/gms/b/mj;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/b/mj$1;->a:Lcom/google/android/gms/b/mj;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/mj;->a(I)V

    return-void
.end method
