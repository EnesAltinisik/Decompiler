.class public abstract Landroid/support/v4/media/d;
.super Ljava/lang/Object;
.source "VolumeProviderCompat.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/media/d$a;
    }
.end annotation


# instance fields
.field private final a:I

.field private final b:I

.field private c:I

.field private d:Landroid/support/v4/media/d$a;

.field private e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(III)V
    .locals 0

    .prologue
    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 78
    iput p1, p0, Landroid/support/v4/media/d;->a:I

    .line 79
    iput p2, p0, Landroid/support/v4/media/d;->b:I

    .line 80
    iput p3, p0, Landroid/support/v4/media/d;->c:I

    .line 81
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 4

    .prologue
    .line 163
    iget-object v0, p0, Landroid/support/v4/media/d;->e:Ljava/lang/Object;

    if-nez v0, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-ge v0, v1, :cond_1

    .line 164
    :cond_0
    iget-object v0, p0, Landroid/support/v4/media/d;->e:Ljava/lang/Object;

    .line 180
    :goto_0
    return-object v0

    .line 167
    :cond_1
    iget v0, p0, Landroid/support/v4/media/d;->a:I

    iget v1, p0, Landroid/support/v4/media/d;->b:I

    iget v2, p0, Landroid/support/v4/media/d;->c:I

    new-instance v3, Landroid/support/v4/media/d$1;

    invoke-direct {v3, p0}, Landroid/support/v4/media/d$1;-><init>(Landroid/support/v4/media/d;)V

    invoke-static {v0, v1, v2, v3}, Landroid/support/v4/media/e;->a(IIILandroid/support/v4/media/e$a;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/media/d;->e:Ljava/lang/Object;

    .line 180
    iget-object v0, p0, Landroid/support/v4/media/d;->e:Ljava/lang/Object;

    goto :goto_0
.end method

.method public final a(I)V
    .locals 1

    .prologue
    .line 118
    iput p1, p0, Landroid/support/v4/media/d;->c:I

    .line 119
    invoke-virtual {p0}, Landroid/support/v4/media/d;->a()Ljava/lang/Object;

    move-result-object v0

    .line 120
    if-eqz v0, :cond_0

    .line 121
    invoke-static {v0, p1}, Landroid/support/v4/media/e;->a(Ljava/lang/Object;I)V

    .line 123
    :cond_0
    iget-object v0, p0, Landroid/support/v4/media/d;->d:Landroid/support/v4/media/d$a;

    if-eqz v0, :cond_1

    .line 124
    iget-object v0, p0, Landroid/support/v4/media/d;->d:Landroid/support/v4/media/d$a;

    invoke-virtual {v0, p0}, Landroid/support/v4/media/d$a;->a(Landroid/support/v4/media/d;)V

    .line 126
    :cond_1
    return-void
.end method

.method public b(I)V
    .locals 0

    .prologue
    .line 134
    return-void
.end method

.method public c(I)V
    .locals 0

    .prologue
    .line 142
    return-void
.end method
