.class public final Landroid/support/v4/b/o$a;
.super Ljava/lang/Object;
.source "SharedPreferencesCompat.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/b/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/b/o$a$a;,
        Landroid/support/v4/b/o$a$b;,
        Landroid/support/v4/b/o$a$c;
    }
.end annotation


# static fields
.field private static a:Landroid/support/v4/b/o$a;


# instance fields
.field private final b:Landroid/support/v4/b/o$a$c;


# direct methods
.method private constructor <init>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x9

    if-lt v0, v1, :cond_0

    .line 53
    new-instance v0, Landroid/support/v4/b/o$a$a;

    invoke-direct {v0, v2}, Landroid/support/v4/b/o$a$a;-><init>(Landroid/support/v4/b/o$1;)V

    iput-object v0, p0, Landroid/support/v4/b/o$a;->b:Landroid/support/v4/b/o$a$c;

    .line 57
    :goto_0
    return-void

    .line 55
    :cond_0
    new-instance v0, Landroid/support/v4/b/o$a$b;

    invoke-direct {v0, v2}, Landroid/support/v4/b/o$a$b;-><init>(Landroid/support/v4/b/o$1;)V

    iput-object v0, p0, Landroid/support/v4/b/o$a;->b:Landroid/support/v4/b/o$a$c;

    goto :goto_0
.end method

.method public static a()Landroid/support/v4/b/o$a;
    .locals 1

    .prologue
    .line 60
    sget-object v0, Landroid/support/v4/b/o$a;->a:Landroid/support/v4/b/o$a;

    if-nez v0, :cond_0

    .line 61
    new-instance v0, Landroid/support/v4/b/o$a;

    invoke-direct {v0}, Landroid/support/v4/b/o$a;-><init>()V

    sput-object v0, Landroid/support/v4/b/o$a;->a:Landroid/support/v4/b/o$a;

    .line 63
    :cond_0
    sget-object v0, Landroid/support/v4/b/o$a;->a:Landroid/support/v4/b/o$a;

    return-object v0
.end method


# virtual methods
.method public a(Landroid/content/SharedPreferences$Editor;)V
    .locals 1

    .prologue
    .line 67
    iget-object v0, p0, Landroid/support/v4/b/o$a;->b:Landroid/support/v4/b/o$a$c;

    invoke-interface {v0, p1}, Landroid/support/v4/b/o$a$c;->a(Landroid/content/SharedPreferences$Editor;)V

    .line 68
    return-void
.end method
