.class public final Landroid/support/v4/b/ar;
.super Landroid/support/v4/b/at$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/b/ar$b;,
        Landroid/support/v4/b/ar$d;,
        Landroid/support/v4/b/ar$c;,
        Landroid/support/v4/b/ar$a;
    }
.end annotation


# static fields
.field public static final a:Landroid/support/v4/b/at$a$a;

.field private static final g:Landroid/support/v4/b/ar$a;


# instance fields
.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/CharSequence;

.field private final d:[Ljava/lang/CharSequence;

.field private final e:Z

.field private final f:Landroid/os/Bundle;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x14

    if-lt v0, v1, :cond_0

    new-instance v0, Landroid/support/v4/b/ar$b;

    invoke-direct {v0}, Landroid/support/v4/b/ar$b;-><init>()V

    sput-object v0, Landroid/support/v4/b/ar;->g:Landroid/support/v4/b/ar$a;

    :goto_0
    new-instance v0, Landroid/support/v4/b/ar$1;

    invoke-direct {v0}, Landroid/support/v4/b/ar$1;-><init>()V

    sput-object v0, Landroid/support/v4/b/ar;->a:Landroid/support/v4/b/at$a$a;

    return-void

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_1

    new-instance v0, Landroid/support/v4/b/ar$d;

    invoke-direct {v0}, Landroid/support/v4/b/ar$d;-><init>()V

    sput-object v0, Landroid/support/v4/b/ar;->g:Landroid/support/v4/b/ar$a;

    goto :goto_0

    :cond_1
    new-instance v0, Landroid/support/v4/b/ar$c;

    invoke-direct {v0}, Landroid/support/v4/b/ar$c;-><init>()V

    sput-object v0, Landroid/support/v4/b/ar;->g:Landroid/support/v4/b/ar$a;

    goto :goto_0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Landroid/support/v4/b/ar;->b:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Landroid/support/v4/b/ar;->c:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public c()[Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Landroid/support/v4/b/ar;->d:[Ljava/lang/CharSequence;

    return-object v0
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, Landroid/support/v4/b/ar;->e:Z

    return v0
.end method

.method public e()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Landroid/support/v4/b/ar;->f:Landroid/os/Bundle;

    return-object v0
.end method
