.class Lcom/google/android/gms/b/mo$2;
.super Landroid/content/BroadcastReceiver;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/mo;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/mo;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/mo;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/mo$2;->a:Lcom/google/android/gms/b/mo;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/b/mo$2;->a:Lcom/google/android/gms/b/mo;

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lcom/google/android/gms/b/mo;->a(Lcom/google/android/gms/b/mo;I)V

    return-void
.end method
