.class Lcom/google/android/gms/b/dc$2;
.super Lcom/google/android/gms/b/ca;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/dc;-><init>(Lcom/google/android/gms/b/cv;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/dc;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/dc;Lcom/google/android/gms/b/cv;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/dc$2;->a:Lcom/google/android/gms/b/dc;

    invoke-direct {p0, p2}, Lcom/google/android/gms/b/ca;-><init>(Lcom/google/android/gms/b/cv;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/b/dc$2;->a:Lcom/google/android/gms/b/dc;

    invoke-virtual {v0}, Lcom/google/android/gms/b/dc;->u()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->z()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v1, "Tasks have been queued for a long time"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;)V

    return-void
.end method
