.class Lcom/google/android/gms/b/bt$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/bt;->a(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:J

.field final synthetic c:Lcom/google/android/gms/b/bt;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/bt;Ljava/lang/String;J)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/b/bt$1;->c:Lcom/google/android/gms/b/bt;

    iput-object p2, p0, Lcom/google/android/gms/b/bt$1;->a:Ljava/lang/String;

    iput-wide p3, p0, Lcom/google/android/gms/b/bt$1;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/b/bt$1;->c:Lcom/google/android/gms/b/bt;

    iget-object v1, p0, Lcom/google/android/gms/b/bt$1;->a:Ljava/lang/String;

    iget-wide v2, p0, Lcom/google/android/gms/b/bt$1;->b:J

    invoke-static {v0, v1, v2, v3}, Lcom/google/android/gms/b/bt;->a(Lcom/google/android/gms/b/bt;Ljava/lang/String;J)V

    return-void
.end method
