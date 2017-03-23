.class Lcom/google/android/gms/b/if$5;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/b/ig$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/if;->a(Lcom/google/android/gms/b/gx;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/b/ig$a",
        "<",
        "Ljava/util/Map",
        "<",
        "Lcom/google/android/gms/b/is;",
        "Lcom/google/android/gms/b/ie;",
        ">;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/if;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/if;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/if$5;->a:Lcom/google/android/gms/b/if;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/google/android/gms/b/gx;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p2, Ljava/util/Map;

    check-cast p3, Ljava/lang/Void;

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/gms/b/if$5;->a(Lcom/google/android/gms/b/gx;Ljava/util/Map;Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/b/gx;Ljava/util/Map;Ljava/lang/Void;)Ljava/lang/Void;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/gx;",
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/b/is;",
            "Lcom/google/android/gms/b/ie;",
            ">;",
            "Ljava/lang/Void;",
            ")",
            "Ljava/lang/Void;"
        }
    .end annotation

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/ie;

    iget-boolean v2, v0, Lcom/google/android/gms/b/ie;->d:Z

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/b/if$5;->a:Lcom/google/android/gms/b/if;

    invoke-virtual {v0}, Lcom/google/android/gms/b/ie;->a()Lcom/google/android/gms/b/ie;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/google/android/gms/b/if;->a(Lcom/google/android/gms/b/if;Lcom/google/android/gms/b/ie;)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method
