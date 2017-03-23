.class Lcom/google/android/gms/b/jg$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/b/jg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/StringBuilder;

.field private b:Ljava/util/Stack;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Stack",
            "<",
            "Lcom/google/android/gms/b/je;",
            ">;"
        }
    .end annotation
.end field

.field private c:I

.field private d:I

.field private e:Z

.field private final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/b/gx;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Lcom/google/android/gms/b/jg$c;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/b/jg$c;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/b/jg$a;->a:Ljava/lang/StringBuilder;

    new-instance v0, Ljava/util/Stack;

    invoke-direct {v0}, Ljava/util/Stack;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/b/jg$a;->b:Ljava/util/Stack;

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/b/jg$a;->c:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/b/jg$a;->e:Z

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/b/jg$a;->f:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/b/jg$a;->g:Ljava/util/List;

    iput-object p1, p0, Lcom/google/android/gms/b/jg$a;->h:Lcom/google/android/gms/b/jg$c;

    return-void
.end method

.method private a(I)Lcom/google/android/gms/b/gx;
    .locals 3

    new-array v2, p1, [Lcom/google/android/gms/b/je;

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, p1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/jg$a;->b:Ljava/util/Stack;

    invoke-virtual {v0, v1}, Ljava/util/Stack;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/je;

    aput-object v0, v2, v1

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/android/gms/b/gx;

    invoke-direct {v0, v2}, Lcom/google/android/gms/b/gx;-><init>([Lcom/google/android/gms/b/je;)V

    return-object v0
.end method

.method private a(Lcom/google/android/gms/b/je;)V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/b/jg$a;->d()V

    iget-boolean v0, p0, Lcom/google/android/gms/b/jg$a;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/jg$a;->a:Ljava/lang/StringBuilder;

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/jg$a;->a:Ljava/lang/StringBuilder;

    invoke-direct {p0, v0, p1}, Lcom/google/android/gms/b/jg$a;->a(Ljava/lang/StringBuilder;Lcom/google/android/gms/b/je;)V

    iget-object v0, p0, Lcom/google/android/gms/b/jg$a;->a:Ljava/lang/StringBuilder;

    const-string v1, ":("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lcom/google/android/gms/b/jg$a;->d:I

    iget-object v1, p0, Lcom/google/android/gms/b/jg$a;->b:Ljava/util/Stack;

    invoke-virtual {v1}, Ljava/util/Stack;->size()I

    move-result v1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/b/jg$a;->b:Ljava/util/Stack;

    invoke-virtual {v0, p1}, Ljava/util/Stack;->add(Ljava/lang/Object;)Z

    :goto_0
    iget v0, p0, Lcom/google/android/gms/b/jg$a;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/b/jg$a;->d:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/b/jg$a;->e:Z

    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/b/jg$a;->b:Ljava/util/Stack;

    iget v1, p0, Lcom/google/android/gms/b/jg$a;->d:I

    invoke-virtual {v0, v1, p1}, Ljava/util/Stack;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method static synthetic a(Lcom/google/android/gms/b/jg$a;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/b/jg$a;->f()V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/b/jg$a;Lcom/google/android/gms/b/je;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/b/jg$a;->a(Lcom/google/android/gms/b/je;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/b/jg$a;Lcom/google/android/gms/b/jo;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/b/jg$a;->a(Lcom/google/android/gms/b/jo;)V

    return-void
.end method

.method private a(Lcom/google/android/gms/b/jo;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/jo",
            "<*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/b/jg$a;->d()V

    iget v0, p0, Lcom/google/android/gms/b/jg$a;->d:I

    iput v0, p0, Lcom/google/android/gms/b/jg$a;->c:I

    iget-object v0, p0, Lcom/google/android/gms/b/jg$a;->a:Ljava/lang/StringBuilder;

    sget-object v1, Lcom/google/android/gms/b/jr$a;->b:Lcom/google/android/gms/b/jr$a;

    invoke-virtual {p1, v1}, Lcom/google/android/gms/b/jo;->a(Lcom/google/android/gms/b/jr$a;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/b/jg$a;->e:Z

    iget-object v0, p0, Lcom/google/android/gms/b/jg$a;->h:Lcom/google/android/gms/b/jg$c;

    invoke-interface {v0, p0}, Lcom/google/android/gms/b/jg$c;->a(Lcom/google/android/gms/b/jg$a;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/b/jg$a;->g()V

    :cond_0
    return-void
.end method

.method private a(Ljava/lang/StringBuilder;Lcom/google/android/gms/b/je;)V
    .locals 1

    invoke-virtual {p2}, Lcom/google/android/gms/b/je;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/b/kt;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method static synthetic b(Lcom/google/android/gms/b/jg$a;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/jg$a;->f:Ljava/util/List;

    return-object v0
.end method

.method static synthetic c(Lcom/google/android/gms/b/jg$a;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/jg$a;->g:Ljava/util/List;

    return-object v0
.end method

.method private d()V
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/b/jg$a;->a()Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/b/jg$a;->a:Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/google/android/gms/b/jg$a;->a:Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lcom/google/android/gms/b/jg$a;->d:I

    invoke-direct {p0, v0}, Lcom/google/android/gms/b/jg$a;->a(I)Lcom/google/android/gms/b/gx;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/gx;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/je;

    iget-object v2, p0, Lcom/google/android/gms/b/jg$a;->a:Ljava/lang/StringBuilder;

    invoke-direct {p0, v2, v0}, Lcom/google/android/gms/b/jg$a;->a(Ljava/lang/StringBuilder;Lcom/google/android/gms/b/je;)V

    iget-object v0, p0, Lcom/google/android/gms/b/jg$a;->a:Ljava/lang/StringBuilder;

    const-string v2, ":("

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/b/jg$a;->e:Z

    :cond_1
    return-void
.end method

.method static synthetic d(Lcom/google/android/gms/b/jg$a;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/b/jg$a;->e()V

    return-void
.end method

.method private e()V
    .locals 2

    iget v0, p0, Lcom/google/android/gms/b/jg$a;->d:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/google/android/gms/b/jg$a;->d:I

    invoke-virtual {p0}, Lcom/google/android/gms/b/jg$a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/jg$a;->a:Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/b/jg$a;->e:Z

    return-void
.end method

.method private f()V
    .locals 2

    iget v0, p0, Lcom/google/android/gms/b/jg$a;->d:I

    if-nez v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    const-string v1, "Can\'t finish hashing in the middle processing a child"

    invoke-static {v0, v1}, Lcom/google/android/gms/b/kt;->a(ZLjava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/b/jg$a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/b/jg$a;->g()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/jg$a;->g:Ljava/util/List;

    const-string v1, ""

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private g()V
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/b/jg$a;->a()Z

    move-result v0

    const-string v1, "Can\'t end range without starting a range!"

    invoke-static {v0, v1}, Lcom/google/android/gms/b/kt;->a(ZLjava/lang/String;)V

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Lcom/google/android/gms/b/jg$a;->d:I

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/b/jg$a;->a:Ljava/lang/StringBuilder;

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/jg$a;->a:Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lcom/google/android/gms/b/jg$a;->c:I

    invoke-direct {p0, v0}, Lcom/google/android/gms/b/jg$a;->a(I)Lcom/google/android/gms/b/gx;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/jg$a;->a:Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/b/kt;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/b/jg$a;->g:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/google/android/gms/b/jg$a;->f:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/b/jg$a;->a:Ljava/lang/StringBuilder;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/jg$a;->a:Ljava/lang/StringBuilder;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/jg$a;->a:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    return v0
.end method

.method public c()Lcom/google/android/gms/b/gx;
    .locals 1

    iget v0, p0, Lcom/google/android/gms/b/jg$a;->d:I

    invoke-direct {p0, v0}, Lcom/google/android/gms/b/jg$a;->a(I)Lcom/google/android/gms/b/gx;

    move-result-object v0

    return-object v0
.end method
