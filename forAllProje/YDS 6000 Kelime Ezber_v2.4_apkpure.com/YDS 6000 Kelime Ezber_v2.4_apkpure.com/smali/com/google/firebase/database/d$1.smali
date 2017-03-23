.class Lcom/google/firebase/database/d$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/firebase/database/d;->a(Ljava/lang/Object;Lcom/google/android/gms/b/jr;Lcom/google/firebase/database/d$a;)Lcom/google/android/gms/c/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/jr;

.field final synthetic b:Lcom/google/android/gms/b/kr;

.field final synthetic c:Lcom/google/firebase/database/d;


# direct methods
.method constructor <init>(Lcom/google/firebase/database/d;Lcom/google/android/gms/b/jr;Lcom/google/android/gms/b/kr;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/database/d$1;->c:Lcom/google/firebase/database/d;

    iput-object p2, p0, Lcom/google/firebase/database/d$1;->a:Lcom/google/android/gms/b/jr;

    iput-object p3, p0, Lcom/google/firebase/database/d$1;->b:Lcom/google/android/gms/b/kr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/google/firebase/database/d$1;->c:Lcom/google/firebase/database/d;

    iget-object v1, v0, Lcom/google/firebase/database/d;->a:Lcom/google/android/gms/b/gz;

    iget-object v0, p0, Lcom/google/firebase/database/d$1;->c:Lcom/google/firebase/database/d;

    invoke-virtual {v0}, Lcom/google/firebase/database/d;->c()Lcom/google/android/gms/b/gx;

    move-result-object v2

    iget-object v3, p0, Lcom/google/firebase/database/d$1;->a:Lcom/google/android/gms/b/jr;

    iget-object v0, p0, Lcom/google/firebase/database/d$1;->b:Lcom/google/android/gms/b/kr;

    invoke-virtual {v0}, Lcom/google/android/gms/b/kr;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/database/d$a;

    invoke-virtual {v1, v2, v3, v0}, Lcom/google/android/gms/b/gz;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;Lcom/google/firebase/database/d$a;)V

    return-void
.end method
