.class Lcom/google/firebase/database/connection/idl/e$1;
.super Lcom/google/firebase/database/connection/idl/j$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/firebase/database/connection/idl/e;->a(Ljava/util/List;Ljava/util/Map;Lcom/google/android/gms/b/ge;Ljava/lang/Long;Lcom/google/android/gms/b/gi;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/ge;


# direct methods
.method constructor <init>(Lcom/google/firebase/database/connection/idl/e;Lcom/google/android/gms/b/ge;)V
    .locals 0

    iput-object p2, p0, Lcom/google/firebase/database/connection/idl/e$1;->a:Lcom/google/android/gms/b/ge;

    invoke-direct {p0}, Lcom/google/firebase/database/connection/idl/j$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/database/connection/idl/e$1;->a:Lcom/google/android/gms/b/ge;

    invoke-interface {v0}, Lcom/google/android/gms/b/ge;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b()Z
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/database/connection/idl/e$1;->a:Lcom/google/android/gms/b/ge;

    invoke-interface {v0}, Lcom/google/android/gms/b/ge;->b()Z

    move-result v0

    return v0
.end method

.method public c()Lcom/google/firebase/database/connection/idl/a;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/database/connection/idl/e$1;->a:Lcom/google/android/gms/b/ge;

    invoke-interface {v0}, Lcom/google/android/gms/b/ge;->c()Lcom/google/android/gms/b/fy;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/database/connection/idl/a;->a(Lcom/google/android/gms/b/fy;)Lcom/google/firebase/database/connection/idl/a;

    move-result-object v0

    return-object v0
.end method
