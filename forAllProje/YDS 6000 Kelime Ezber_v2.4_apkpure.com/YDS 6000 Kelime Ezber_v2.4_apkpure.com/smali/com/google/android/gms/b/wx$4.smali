.class Lcom/google/android/gms/b/wx$4;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/b/zn;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/wx;-><init>(Landroid/content/Context;Lcom/google/android/gms/b/pk;Lcom/google/android/gms/b/ww;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/b/zn",
        "<",
        "Lcom/google/android/gms/b/sr;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/wx;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/b/sr;)V
    .locals 2

    const-string v0, "/log"

    sget-object v1, Lcom/google/android/gms/b/rp;->i:Lcom/google/android/gms/b/rq;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/b/sr;->a(Ljava/lang/String;Lcom/google/android/gms/b/rq;)V

    return-void
.end method

.method public synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/b/sr;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/b/wx$4;->a(Lcom/google/android/gms/b/sr;)V

    return-void
.end method
