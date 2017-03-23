.class Lcom/google/android/gms/b/dc$a$4;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/dc$a;->a(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/dc$a;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/dc$a;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/dc$a$4;->a:Lcom/google/android/gms/b/dc$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/b/dc$a$4;->a:Lcom/google/android/gms/b/dc$a;

    iget-object v0, v0, Lcom/google/android/gms/b/dc$a;->a:Lcom/google/android/gms/b/dc;

    new-instance v1, Landroid/content/ComponentName;

    iget-object v2, p0, Lcom/google/android/gms/b/dc$a$4;->a:Lcom/google/android/gms/b/dc$a;

    iget-object v2, v2, Lcom/google/android/gms/b/dc$a;->a:Lcom/google/android/gms/b/dc;

    invoke-virtual {v2}, Lcom/google/android/gms/b/dc;->n()Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/b/dc$a$4;->a:Lcom/google/android/gms/b/dc$a;

    iget-object v3, v3, Lcom/google/android/gms/b/dc$a;->a:Lcom/google/android/gms/b/dc;

    invoke-virtual {v3}, Lcom/google/android/gms/b/dc;->w()Lcom/google/android/gms/b/by;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/b/by;->R()Z

    const-string v3, "com.google.android.gms.measurement.AppMeasurementService"

    invoke-direct {v1, v2, v3}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/google/android/gms/b/dc;->a(Lcom/google/android/gms/b/dc;Landroid/content/ComponentName;)V

    return-void
.end method
