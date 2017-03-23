.class Lcom/google/android/gms/internal/zzmg$e$1;
.super Lcom/google/android/gms/internal/zzmg$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzmg$e;->a(Lcom/google/android/gms/internal/zzmh;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/zzmg$e;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzmg$e;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzmg$e$1;->a:Lcom/google/android/gms/internal/zzmg$e;

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzmg$a;-><init>()V

    return-void
.end method


# virtual methods
.method public zza(Lcom/google/android/gms/common/api/Status;Landroid/content/Intent;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzmg$e$1;->a:Lcom/google/android/gms/internal/zzmg$e;

    new-instance v1, Lcom/google/android/gms/internal/zzmi;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/internal/zzmi;-><init>(Lcom/google/android/gms/common/api/Status;Landroid/content/Intent;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzmg$e;->zzb(Lcom/google/android/gms/common/api/Result;)V

    invoke-static {p2}, Lcom/google/android/gms/appinvite/AppInviteReferral;->hasReferral(Landroid/content/Intent;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzmg$e$1;->a:Lcom/google/android/gms/internal/zzmg$e;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzmg$e;->a(Lcom/google/android/gms/internal/zzmg$e;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzmg$e$1;->a:Lcom/google/android/gms/internal/zzmg$e;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzmg$e;->b(Lcom/google/android/gms/internal/zzmg$e;)Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzmg$e$1;->a:Lcom/google/android/gms/internal/zzmg$e;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzmg$e;->b(Lcom/google/android/gms/internal/zzmg$e;)Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    :cond_0
    return-void
.end method
