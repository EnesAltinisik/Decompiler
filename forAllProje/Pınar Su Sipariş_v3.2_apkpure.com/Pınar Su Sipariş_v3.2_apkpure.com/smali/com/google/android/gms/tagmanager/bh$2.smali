.class Lcom/google/android/gms/tagmanager/bh$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/tagmanager/bh$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/tagmanager/bh;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/tagmanager/ci;Lcom/google/android/gms/tagmanager/bh$b;Lcom/google/android/gms/tagmanager/bh$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/tagmanager/bh;


# direct methods
.method constructor <init>(Lcom/google/android/gms/tagmanager/bh;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/bh$2;->a:Lcom/google/android/gms/tagmanager/bh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/tagmanager/ci;)Lcom/google/android/gms/tagmanager/bg;
    .locals 3

    new-instance v0, Lcom/google/android/gms/tagmanager/bg;

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/bh$2;->a:Lcom/google/android/gms/tagmanager/bh;

    invoke-static {v1}, Lcom/google/android/gms/tagmanager/bh;->a(Lcom/google/android/gms/tagmanager/bh;)Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/tagmanager/bh$2;->a:Lcom/google/android/gms/tagmanager/bh;

    invoke-static {v2}, Lcom/google/android/gms/tagmanager/bh;->b(Lcom/google/android/gms/tagmanager/bh;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2, p1}, Lcom/google/android/gms/tagmanager/bg;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/tagmanager/ci;)V

    return-object v0
.end method
