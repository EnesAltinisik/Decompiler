.class Lcom/google/android/gms/b/gz$8;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/gz;->a(Lcom/google/android/gms/b/ii;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/gz$a;

.field final synthetic b:Lcom/google/firebase/database/b;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/gz;Lcom/google/android/gms/b/gz$a;Lcom/google/firebase/database/b;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/b/gz$8;->a:Lcom/google/android/gms/b/gz$a;

    iput-object p3, p0, Lcom/google/android/gms/b/gz$8;->b:Lcom/google/firebase/database/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/b/gz$8;->a:Lcom/google/android/gms/b/gz$a;

    invoke-static {v0}, Lcom/google/android/gms/b/gz$a;->i(Lcom/google/android/gms/b/gz$a;)Lcom/google/firebase/database/l$a;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/gz$8;->b:Lcom/google/firebase/database/b;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-interface {v0, v1, v2, v3}, Lcom/google/firebase/database/l$a;->a(Lcom/google/firebase/database/b;ZLcom/google/firebase/database/a;)V

    return-void
.end method
