.class Lcom/google/android/gms/b/de$4;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/de;->y()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:Lcom/google/android/gms/b/de;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/de;J)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/de$4;->b:Lcom/google/android/gms/b/de;

    iput-wide p2, p0, Lcom/google/android/gms/b/de$4;->a:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/b/de$4;->b:Lcom/google/android/gms/b/de;

    iget-wide v2, p0, Lcom/google/android/gms/b/de$4;->a:J

    invoke-static {v0, v2, v3}, Lcom/google/android/gms/b/de;->b(Lcom/google/android/gms/b/de;J)V

    return-void
.end method
