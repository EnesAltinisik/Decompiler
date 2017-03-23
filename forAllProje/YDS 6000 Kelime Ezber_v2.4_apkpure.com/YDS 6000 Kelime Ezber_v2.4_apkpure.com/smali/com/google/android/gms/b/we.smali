.class public Lcom/google/android/gms/b/we;
.super Lcom/google/android/gms/common/internal/o;


# annotations
.annotation runtime Lcom/google/android/gms/b/vz;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/internal/o",
        "<",
        "Lcom/google/android/gms/b/wo;",
        ">;"
    }
.end annotation


# instance fields
.field final e:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/o$b;Lcom/google/android/gms/common/internal/o$c;I)V
    .locals 7

    const/16 v3, 0x8

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/common/internal/o;-><init>(Landroid/content/Context;Landroid/os/Looper;ILcom/google/android/gms/common/internal/o$b;Lcom/google/android/gms/common/internal/o$c;Ljava/lang/String;)V

    iput p5, p0, Lcom/google/android/gms/b/we;->e:I

    return-void
.end method


# virtual methods
.method protected synthetic a(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/b/we;->b(Landroid/os/IBinder;)Lcom/google/android/gms/b/wo;

    move-result-object v0

    return-object v0
.end method

.method protected b(Landroid/os/IBinder;)Lcom/google/android/gms/b/wo;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/b/wo$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/b/wo;

    move-result-object v0

    return-object v0
.end method

.method protected i()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.ads.service.START"

    return-object v0
.end method

.method protected j()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.ads.internal.request.IAdRequestService"

    return-object v0
.end method

.method public k()Lcom/google/android/gms/b/wo;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/common/internal/o;->u()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/wo;

    return-object v0
.end method
