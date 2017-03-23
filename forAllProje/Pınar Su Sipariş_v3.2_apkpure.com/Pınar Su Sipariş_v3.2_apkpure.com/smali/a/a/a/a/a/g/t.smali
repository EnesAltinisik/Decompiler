.class public La/a/a/a/a/g/t;
.super Ljava/lang/Object;
.source "SettingsData.java"


# instance fields
.field public final a:La/a/a/a/a/g/e;

.field public final b:La/a/a/a/a/g/p;

.field public final c:La/a/a/a/a/g/o;

.field public final d:La/a/a/a/a/g/m;

.field public final e:La/a/a/a/a/g/b;

.field public final f:La/a/a/a/a/g/f;

.field public final g:J

.field public final h:I

.field public final i:I


# direct methods
.method public constructor <init>(JLa/a/a/a/a/g/e;La/a/a/a/a/g/p;La/a/a/a/a/g/o;La/a/a/a/a/g/m;La/a/a/a/a/g/b;La/a/a/a/a/g/f;II)V
    .locals 1

    .prologue
    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-wide p1, p0, La/a/a/a/a/g/t;->g:J

    .line 41
    iput-object p3, p0, La/a/a/a/a/g/t;->a:La/a/a/a/a/g/e;

    .line 42
    iput-object p4, p0, La/a/a/a/a/g/t;->b:La/a/a/a/a/g/p;

    .line 43
    iput-object p5, p0, La/a/a/a/a/g/t;->c:La/a/a/a/a/g/o;

    .line 44
    iput-object p6, p0, La/a/a/a/a/g/t;->d:La/a/a/a/a/g/m;

    .line 45
    iput p9, p0, La/a/a/a/a/g/t;->h:I

    .line 46
    iput p10, p0, La/a/a/a/a/g/t;->i:I

    .line 47
    iput-object p7, p0, La/a/a/a/a/g/t;->e:La/a/a/a/a/g/b;

    .line 48
    iput-object p8, p0, La/a/a/a/a/g/t;->f:La/a/a/a/a/g/f;

    .line 49
    return-void
.end method


# virtual methods
.method public a(J)Z
    .locals 3

    .prologue
    .line 52
    iget-wide v0, p0, La/a/a/a/a/g/t;->g:J

    cmp-long v0, v0, p1

    if-gez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
