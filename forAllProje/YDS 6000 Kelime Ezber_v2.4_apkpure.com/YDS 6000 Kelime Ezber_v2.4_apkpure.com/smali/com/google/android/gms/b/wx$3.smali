.class final Lcom/google/android/gms/b/wx$3;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/wx;->a(Landroid/content/Context;Lcom/google/android/gms/b/sv;Lcom/google/android/gms/b/pk;Lcom/google/android/gms/b/ww;Lcom/google/android/gms/b/wf;)Lcom/google/android/gms/b/wi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/ww;

.field final synthetic b:Landroid/content/Context;

.field final synthetic c:Lcom/google/android/gms/b/xa;

.field final synthetic d:Lcom/google/android/gms/b/wf;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/ww;Landroid/content/Context;Lcom/google/android/gms/b/xa;Lcom/google/android/gms/b/wf;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/wx$3;->a:Lcom/google/android/gms/b/ww;

    iput-object p2, p0, Lcom/google/android/gms/b/wx$3;->b:Landroid/content/Context;

    iput-object p3, p0, Lcom/google/android/gms/b/wx$3;->c:Lcom/google/android/gms/b/xa;

    iput-object p4, p0, Lcom/google/android/gms/b/wx$3;->d:Lcom/google/android/gms/b/wf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/b/wx$3;->a:Lcom/google/android/gms/b/ww;

    iget-object v0, v0, Lcom/google/android/gms/b/ww;->e:Lcom/google/android/gms/b/xg;

    iget-object v1, p0, Lcom/google/android/gms/b/wx$3;->b:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/b/wx$3;->c:Lcom/google/android/gms/b/xa;

    iget-object v3, p0, Lcom/google/android/gms/b/wx$3;->d:Lcom/google/android/gms/b/wf;

    iget-object v3, v3, Lcom/google/android/gms/b/wf;->k:Lcom/google/android/gms/b/aab;

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/b/xg;->a(Landroid/content/Context;Lcom/google/android/gms/b/xa;Lcom/google/android/gms/b/aab;)V

    return-void
.end method
