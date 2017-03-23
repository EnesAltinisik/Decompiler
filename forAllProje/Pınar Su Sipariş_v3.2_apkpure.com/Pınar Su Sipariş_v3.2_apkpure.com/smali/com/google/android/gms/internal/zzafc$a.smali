.class Lcom/google/android/gms/internal/zzafc$a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/zzafc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable",
        "<",
        "Lcom/google/android/gms/internal/zzafc$a;",
        ">;"
    }
.end annotation


# instance fields
.field private a:Lcom/google/android/gms/internal/zzafa;

.field private b:Lcom/google/firebase/database/Transaction$Handler;

.field private c:Lcom/google/firebase/database/ValueEventListener;

.field private d:Lcom/google/android/gms/internal/zzafc$b;

.field private e:J

.field private f:Z

.field private g:I

.field private h:Lcom/google/firebase/database/DatabaseError;

.field private i:J

.field private j:Lcom/google/android/gms/internal/zzahu;

.field private k:Lcom/google/android/gms/internal/zzahu;

.field private l:Lcom/google/android/gms/internal/zzahu;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/zzafa;Lcom/google/firebase/database/Transaction$Handler;Lcom/google/firebase/database/ValueEventListener;Lcom/google/android/gms/internal/zzafc$b;ZJ)V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzafc$a;->a:Lcom/google/android/gms/internal/zzafa;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzafc$a;->b:Lcom/google/firebase/database/Transaction$Handler;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzafc$a;->c:Lcom/google/firebase/database/ValueEventListener;

    iput-object p4, p0, Lcom/google/android/gms/internal/zzafc$a;->d:Lcom/google/android/gms/internal/zzafc$b;

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/zzafc$a;->g:I

    iput-boolean p5, p0, Lcom/google/android/gms/internal/zzafc$a;->f:Z

    iput-wide p6, p0, Lcom/google/android/gms/internal/zzafc$a;->e:J

    iput-object v1, p0, Lcom/google/android/gms/internal/zzafc$a;->h:Lcom/google/firebase/database/DatabaseError;

    iput-object v1, p0, Lcom/google/android/gms/internal/zzafc$a;->j:Lcom/google/android/gms/internal/zzahu;

    iput-object v1, p0, Lcom/google/android/gms/internal/zzafc$a;->k:Lcom/google/android/gms/internal/zzahu;

    iput-object v1, p0, Lcom/google/android/gms/internal/zzafc$a;->l:Lcom/google/android/gms/internal/zzahu;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/zzafa;Lcom/google/firebase/database/Transaction$Handler;Lcom/google/firebase/database/ValueEventListener;Lcom/google/android/gms/internal/zzafc$b;ZJLcom/google/android/gms/internal/zzafc$1;)V
    .locals 0

    invoke-direct/range {p0 .. p7}, Lcom/google/android/gms/internal/zzafc$a;-><init>(Lcom/google/android/gms/internal/zzafa;Lcom/google/firebase/database/Transaction$Handler;Lcom/google/firebase/database/ValueEventListener;Lcom/google/android/gms/internal/zzafc$b;ZJ)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/zzafc$a;J)J
    .locals 1

    iput-wide p1, p0, Lcom/google/android/gms/internal/zzafc$a;->i:J

    return-wide p1
.end method

.method static synthetic a(Lcom/google/android/gms/internal/zzafc$a;Lcom/google/android/gms/internal/zzafc$b;)Lcom/google/android/gms/internal/zzafc$b;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzafc$a;->d:Lcom/google/android/gms/internal/zzafc$b;

    return-object p1
.end method

.method static synthetic a(Lcom/google/android/gms/internal/zzafc$a;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzafc$a;->j:Lcom/google/android/gms/internal/zzahu;

    return-object p1
.end method

.method static synthetic a(Lcom/google/android/gms/internal/zzafc$a;Lcom/google/firebase/database/DatabaseError;)Lcom/google/firebase/database/DatabaseError;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzafc$a;->h:Lcom/google/firebase/database/DatabaseError;

    return-object p1
.end method

.method static synthetic b(Lcom/google/android/gms/internal/zzafc$a;)Lcom/google/android/gms/internal/zzahu;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc$a;->j:Lcom/google/android/gms/internal/zzahu;

    return-object v0
.end method

.method static synthetic b(Lcom/google/android/gms/internal/zzafc$a;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzafc$a;->k:Lcom/google/android/gms/internal/zzahu;

    return-object p1
.end method

.method static synthetic c(Lcom/google/android/gms/internal/zzafc$a;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/zzafc$a;->i:J

    return-wide v0
.end method

.method static synthetic c(Lcom/google/android/gms/internal/zzafc$a;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzafc$a;->l:Lcom/google/android/gms/internal/zzahu;

    return-object p1
.end method

.method static synthetic d(Lcom/google/android/gms/internal/zzafc$a;)Lcom/google/android/gms/internal/zzafc$b;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc$a;->d:Lcom/google/android/gms/internal/zzafc$b;

    return-object v0
.end method

.method static synthetic e(Lcom/google/android/gms/internal/zzafc$a;)I
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/zzafc$a;->g:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/google/android/gms/internal/zzafc$a;->g:I

    return v0
.end method

.method static synthetic f(Lcom/google/android/gms/internal/zzafc$a;)Lcom/google/android/gms/internal/zzafa;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc$a;->a:Lcom/google/android/gms/internal/zzafa;

    return-object v0
.end method

.method static synthetic g(Lcom/google/android/gms/internal/zzafc$a;)Lcom/google/android/gms/internal/zzahu;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc$a;->k:Lcom/google/android/gms/internal/zzahu;

    return-object v0
.end method

.method static synthetic h(Lcom/google/android/gms/internal/zzafc$a;)Lcom/google/android/gms/internal/zzahu;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc$a;->l:Lcom/google/android/gms/internal/zzahu;

    return-object v0
.end method

.method static synthetic i(Lcom/google/android/gms/internal/zzafc$a;)Lcom/google/firebase/database/Transaction$Handler;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc$a;->b:Lcom/google/firebase/database/Transaction$Handler;

    return-object v0
.end method

.method static synthetic j(Lcom/google/android/gms/internal/zzafc$a;)Lcom/google/firebase/database/ValueEventListener;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc$a;->c:Lcom/google/firebase/database/ValueEventListener;

    return-object v0
.end method

.method static synthetic k(Lcom/google/android/gms/internal/zzafc$a;)Lcom/google/firebase/database/DatabaseError;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc$a;->h:Lcom/google/firebase/database/DatabaseError;

    return-object v0
.end method

.method static synthetic l(Lcom/google/android/gms/internal/zzafc$a;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/zzafc$a;->g:I

    return v0
.end method

.method static synthetic m(Lcom/google/android/gms/internal/zzafc$a;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzafc$a;->f:Z

    return v0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/zzafc$a;)I
    .locals 4

    iget-wide v0, p0, Lcom/google/android/gms/internal/zzafc$a;->e:J

    iget-wide v2, p1, Lcom/google/android/gms/internal/zzafc$a;->e:J

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    const/4 v0, -0x1

    :goto_0
    return v0

    :cond_0
    iget-wide v0, p0, Lcom/google/android/gms/internal/zzafc$a;->e:J

    iget-wide v2, p1, Lcom/google/android/gms/internal/zzafc$a;->e:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public synthetic compareTo(Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/zzafc$a;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzafc$a;->a(Lcom/google/android/gms/internal/zzafc$a;)I

    move-result v0

    return v0
.end method
