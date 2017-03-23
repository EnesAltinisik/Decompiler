.class Landroid/support/v4/b/r$d;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/support/v4/b/r$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/b/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "d"
.end annotation


# instance fields
.field final a:Ljava/lang/String;

.field final b:I

.field final c:I

.field final synthetic d:Landroid/support/v4/b/r;


# direct methods
.method constructor <init>(Landroid/support/v4/b/r;Ljava/lang/String;II)V
    .locals 0

    iput-object p1, p0, Landroid/support/v4/b/r$d;->d:Landroid/support/v4/b/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Landroid/support/v4/b/r$d;->a:Ljava/lang/String;

    iput p3, p0, Landroid/support/v4/b/r$d;->b:I

    iput p4, p0, Landroid/support/v4/b/r$d;->c:I

    return-void
.end method


# virtual methods
.method public a(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v4/b/f;",
            ">;",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    iget-object v0, p0, Landroid/support/v4/b/r$d;->d:Landroid/support/v4/b/r;

    iget-object v3, p0, Landroid/support/v4/b/r$d;->a:Ljava/lang/String;

    iget v4, p0, Landroid/support/v4/b/r$d;->b:I

    iget v5, p0, Landroid/support/v4/b/r$d;->c:I

    move-object v1, p1

    move-object v2, p2

    invoke-virtual/range {v0 .. v5}, Landroid/support/v4/b/r;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;II)Z

    move-result v0

    return v0
.end method
