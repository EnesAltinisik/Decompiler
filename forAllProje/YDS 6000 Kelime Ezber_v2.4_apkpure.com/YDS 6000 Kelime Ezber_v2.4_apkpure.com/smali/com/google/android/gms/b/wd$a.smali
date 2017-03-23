.class public final Lcom/google/android/gms/b/wd$a;
.super Lcom/google/android/gms/b/wd;


# annotations
.annotation runtime Lcom/google/android/gms/b/vz;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/b/wd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/b/aaj;Lcom/google/android/gms/b/wc$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/google/android/gms/b/aaj",
            "<",
            "Lcom/google/android/gms/b/wf;",
            ">;",
            "Lcom/google/android/gms/b/wc$a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/b/wd;-><init>(Lcom/google/android/gms/b/aaj;Lcom/google/android/gms/b/wc$a;)V

    iput-object p1, p0, Lcom/google/android/gms/b/wd$a;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public b()Lcom/google/android/gms/b/wo;
    .locals 3

    new-instance v1, Lcom/google/android/gms/b/pk;

    sget-object v0, Lcom/google/android/gms/b/pr;->b:Lcom/google/android/gms/b/pn;

    invoke-virtual {v0}, Lcom/google/android/gms/b/pn;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {v1, v0}, Lcom/google/android/gms/b/pk;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/b/wd$a;->a:Landroid/content/Context;

    invoke-static {}, Lcom/google/android/gms/b/ww;->a()Lcom/google/android/gms/b/ww;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/b/wx;->a(Landroid/content/Context;Lcom/google/android/gms/b/pk;Lcom/google/android/gms/b/ww;)Lcom/google/android/gms/b/wx;

    move-result-object v0

    return-object v0
.end method

.method public synthetic e()Ljava/lang/Object;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/b/wd;->c()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
