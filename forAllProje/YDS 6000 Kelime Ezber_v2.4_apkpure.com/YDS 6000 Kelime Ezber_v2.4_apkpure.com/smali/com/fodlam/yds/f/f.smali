.class public Lcom/fodlam/yds/f/f;
.super Ljava/lang/Object;


# instance fields
.field public a:Ljava/lang/String;

.field public b:I

.field public c:I

.field public d:I

.field public e:I


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/fodlam/yds/f/f;->a:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/fodlam/yds/f/f;->a()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IIII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/fodlam/yds/f/f;->a:Ljava/lang/String;

    iput p2, p0, Lcom/fodlam/yds/f/f;->b:I

    iput p3, p0, Lcom/fodlam/yds/f/f;->c:I

    iput p4, p0, Lcom/fodlam/yds/f/f;->d:I

    iput p5, p0, Lcom/fodlam/yds/f/f;->e:I

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/fodlam/yds/f/f;->b:I

    iput v0, p0, Lcom/fodlam/yds/f/f;->c:I

    iput v0, p0, Lcom/fodlam/yds/f/f;->d:I

    iput v0, p0, Lcom/fodlam/yds/f/f;->e:I

    return-void
.end method
