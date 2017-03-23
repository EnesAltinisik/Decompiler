.class Lcom/google/android/gms/b/gz$6;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/b/ii$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/gz;->a(Lcom/google/android/gms/b/gx;I)Lcom/google/android/gms/b/gx;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/b/ii$a",
        "<",
        "Ljava/util/List",
        "<",
        "Lcom/google/android/gms/b/gz$a;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/google/android/gms/b/gz;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/gz;I)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/gz$6;->b:Lcom/google/android/gms/b/gz;

    iput p2, p0, Lcom/google/android/gms/b/gz$6;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/b/ii;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/ii",
            "<",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/b/gz$a;",
            ">;>;)Z"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/b/gz$6;->b:Lcom/google/android/gms/b/gz;

    iget v1, p0, Lcom/google/android/gms/b/gz$6;->a:I

    invoke-static {v0, p1, v1}, Lcom/google/android/gms/b/gz;->a(Lcom/google/android/gms/b/gz;Lcom/google/android/gms/b/ii;I)V

    const/4 v0, 0x0

    return v0
.end method
