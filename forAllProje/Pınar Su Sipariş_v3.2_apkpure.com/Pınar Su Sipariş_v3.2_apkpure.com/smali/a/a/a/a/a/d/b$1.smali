.class La/a/a/a/a/d/b$1;
.super Ljava/lang/Object;
.source "EventsFilesManager.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/a/a/a/a/d/b;->deleteOldestInRollOverIfOverMax()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<",
        "La/a/a/a/a/d/b$a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:La/a/a/a/a/d/b;


# direct methods
.method constructor <init>(La/a/a/a/a/d/b;)V
    .locals 0

    .prologue
    .line 208
    iput-object p1, p0, La/a/a/a/a/d/b$1;->a:La/a/a/a/a/d/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(La/a/a/a/a/d/b$a;La/a/a/a/a/d/b$a;)I
    .locals 4

    .prologue
    .line 211
    iget-wide v0, p1, La/a/a/a/a/d/b$a;->b:J

    iget-wide v2, p2, La/a/a/a/a/d/b$a;->b:J

    sub-long/2addr v0, v2

    long-to-int v0, v0

    return v0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 208
    check-cast p1, La/a/a/a/a/d/b$a;

    check-cast p2, La/a/a/a/a/d/b$a;

    invoke-virtual {p0, p1, p2}, La/a/a/a/a/d/b$1;->a(La/a/a/a/a/d/b$a;La/a/a/a/a/d/b$a;)I

    move-result v0

    return v0
.end method
