.class Lcom/google/android/gms/b/ue$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/ue;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/ue;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/ue;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/ue$1;->a:Lcom/google/android/gms/b/ue;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/b/ue$1;->a:Lcom/google/android/gms/b/ue;

    invoke-virtual {v0}, Lcom/google/android/gms/b/ue;->b()Landroid/content/Intent;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/ads/internal/v;->e()Lcom/google/android/gms/b/zi;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/b/ue$1;->a:Lcom/google/android/gms/b/ue;

    invoke-static {v2}, Lcom/google/android/gms/b/ue;->a(Lcom/google/android/gms/b/ue;)Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/b/zi;->a(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method
