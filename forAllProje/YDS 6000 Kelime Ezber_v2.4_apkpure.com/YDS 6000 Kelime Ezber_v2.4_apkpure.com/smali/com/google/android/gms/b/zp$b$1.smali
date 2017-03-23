.class Lcom/google/android/gms/b/zp$b$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/b/vx$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/zp$b;-><init>(Ljava/lang/String;Lcom/google/android/gms/b/zp$a;Lcom/google/android/gms/b/vx$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/vx$b;

.field final synthetic b:Lcom/google/android/gms/b/zp$a;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/vx$b;Lcom/google/android/gms/b/zp$a;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/zp$b$1;->a:Lcom/google/android/gms/b/vx$b;

    iput-object p2, p0, Lcom/google/android/gms/b/zp$b$1;->b:Lcom/google/android/gms/b/zp$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/b/abb;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/b/zp$b$1;->a:Lcom/google/android/gms/b/vx$b;

    iget-object v1, p0, Lcom/google/android/gms/b/zp$b$1;->b:Lcom/google/android/gms/b/zp$a;

    invoke-interface {v1}, Lcom/google/android/gms/b/zp$a;->b()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/b/vx$b;->a(Ljava/lang/Object;)V

    return-void
.end method
