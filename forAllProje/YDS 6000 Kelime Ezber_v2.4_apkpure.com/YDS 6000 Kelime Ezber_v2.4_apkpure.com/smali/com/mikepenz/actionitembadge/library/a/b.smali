.class public Lcom/mikepenz/actionitembadge/library/a/b;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mikepenz/actionitembadge/library/a/b$a;
    }
.end annotation


# instance fields
.field private a:Lcom/mikepenz/actionitembadge/library/a/b$a;

.field private b:I

.field private c:I

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private h:I


# direct methods
.method public constructor <init>(Lcom/mikepenz/actionitembadge/library/a/b$a;IIII)V
    .locals 1

    const/4 v0, -0x1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput v0, p0, Lcom/mikepenz/actionitembadge/library/a/b;->e:I

    iput v0, p0, Lcom/mikepenz/actionitembadge/library/a/b;->f:I

    iput v0, p0, Lcom/mikepenz/actionitembadge/library/a/b;->g:I

    const/high16 v0, -0x10000

    iput v0, p0, Lcom/mikepenz/actionitembadge/library/a/b;->h:I

    iput-object p1, p0, Lcom/mikepenz/actionitembadge/library/a/b;->a:Lcom/mikepenz/actionitembadge/library/a/b$a;

    iput p2, p0, Lcom/mikepenz/actionitembadge/library/a/b;->b:I

    iput p3, p0, Lcom/mikepenz/actionitembadge/library/a/b;->c:I

    iput p4, p0, Lcom/mikepenz/actionitembadge/library/a/b;->d:I

    iput p5, p0, Lcom/mikepenz/actionitembadge/library/a/b;->e:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/mikepenz/actionitembadge/library/a/b;->b:I

    return v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lcom/mikepenz/actionitembadge/library/a/b;->c:I

    return v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lcom/mikepenz/actionitembadge/library/a/b;->d:I

    return v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lcom/mikepenz/actionitembadge/library/a/b;->e:I

    return v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lcom/mikepenz/actionitembadge/library/a/b;->f:I

    return v0
.end method

.method public f()I
    .locals 1

    iget v0, p0, Lcom/mikepenz/actionitembadge/library/a/b;->g:I

    return v0
.end method

.method public g()I
    .locals 1

    iget v0, p0, Lcom/mikepenz/actionitembadge/library/a/b;->h:I

    return v0
.end method
