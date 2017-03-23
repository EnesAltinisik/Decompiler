.class Lcom/google/android/gms/internal/zzvb$6;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/ComponentCallbacks2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzvb;->zzKH()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/zzvb;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzvb;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzvb$6;->a:Lcom/google/android/gms/internal/zzvb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    return-void
.end method

.method public onLowMemory()V
    .locals 0

    return-void
.end method

.method public onTrimMemory(I)V
    .locals 1

    const/16 v0, 0x14

    if-ne p1, v0, :cond_0

    const-string v0, "App\'s UI deactivated. Dispatching hits."

    invoke-static {v0}, Lcom/google/android/gms/internal/zzun;->v(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzvb$6;->a:Lcom/google/android/gms/internal/zzvb;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzvb;->zzb(Lcom/google/android/gms/internal/zzvb;)Lcom/google/android/gms/internal/zzve;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzve;->dispatch()V

    :cond_0
    return-void
.end method
