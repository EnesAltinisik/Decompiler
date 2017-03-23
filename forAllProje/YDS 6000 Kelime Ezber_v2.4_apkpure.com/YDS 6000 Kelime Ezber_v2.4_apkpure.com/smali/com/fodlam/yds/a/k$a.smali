.class public Lcom/fodlam/yds/a/k$a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fodlam/yds/a/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:Z

.field b:[C

.field c:I

.field d:I

.field e:Lcom/fodlam/yds/f/h;


# direct methods
.method public constructor <init>(Lcom/fodlam/yds/f/h;)V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean v1, p0, Lcom/fodlam/yds/a/k$a;->a:Z

    const/4 v0, -0x1

    iput v0, p0, Lcom/fodlam/yds/a/k$a;->c:I

    iput v1, p0, Lcom/fodlam/yds/a/k$a;->d:I

    iput-object p1, p0, Lcom/fodlam/yds/a/k$a;->e:Lcom/fodlam/yds/f/h;

    return-void
.end method
