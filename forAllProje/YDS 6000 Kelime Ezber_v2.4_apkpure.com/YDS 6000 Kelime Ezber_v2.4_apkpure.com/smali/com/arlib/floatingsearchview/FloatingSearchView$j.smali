.class Lcom/arlib/floatingsearchview/FloatingSearchView$j;
.super Landroid/view/View$BaseSavedState;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/arlib/floatingsearchview/FloatingSearchView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "j"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/arlib/floatingsearchview/FloatingSearchView$j;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<+",
            "Lcom/arlib/floatingsearchview/a/a/a;",
            ">;"
        }
    .end annotation
.end field

.field private b:Z

.field private c:Ljava/lang/String;

.field private d:I

.field private e:Ljava/lang/String;

.field private f:Z

.field private g:Z

.field private h:Z

.field private i:Z

.field private j:I

.field private k:I

.field private l:I

.field private m:I

.field private n:I

.field private o:I

.field private p:I

.field private q:I

.field private r:I

.field private s:I

.field private t:I

.field private u:I

.field private v:Z

.field private w:J

.field private x:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/arlib/floatingsearchview/FloatingSearchView$j$1;

    invoke-direct {v0}, Lcom/arlib/floatingsearchview/FloatingSearchView$j$1;-><init>()V

    sput-object v0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 6

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->a:Ljava/util/List;

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->a:Ljava/util/List;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {p1, v0, v3}, Landroid/os/Parcel;->readList(Ljava/util/List;Ljava/lang/ClassLoader;)V

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    :goto_0
    iput-boolean v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->b:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->c:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->d:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->e:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_1

    move v0, v1

    :goto_1
    iput-boolean v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->f:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_2

    move v0, v1

    :goto_2
    iput-boolean v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->g:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_3

    move v0, v1

    :goto_3
    iput-boolean v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->h:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_4

    move v0, v1

    :goto_4
    iput-boolean v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->i:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->j:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->k:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->l:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->m:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->n:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->o:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->p:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->q:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->r:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->s:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->t:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->u:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_5

    move v0, v1

    :goto_5
    iput-boolean v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->v:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v4

    iput-wide v4, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->w:J

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_6

    :goto_6
    iput-boolean v1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->x:Z

    return-void

    :cond_0
    move v0, v2

    goto/16 :goto_0

    :cond_1
    move v0, v2

    goto/16 :goto_1

    :cond_2
    move v0, v2

    goto :goto_2

    :cond_3
    move v0, v2

    goto :goto_3

    :cond_4
    move v0, v2

    goto :goto_4

    :cond_5
    move v0, v2

    goto :goto_5

    :cond_6
    move v1, v2

    goto :goto_6
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/arlib/floatingsearchview/FloatingSearchView$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/arlib/floatingsearchview/FloatingSearchView$j;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method constructor <init>(Landroid/os/Parcelable;)V
    .locals 1

    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcelable;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->a:Ljava/util/List;

    return-void
.end method

.method static synthetic a(Lcom/arlib/floatingsearchview/FloatingSearchView$j;I)I
    .locals 0

    iput p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->d:I

    return p1
.end method

.method static synthetic a(Lcom/arlib/floatingsearchview/FloatingSearchView$j;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->c:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic a(Lcom/arlib/floatingsearchview/FloatingSearchView$j;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->a:Ljava/util/List;

    return-object p1
.end method

.method static synthetic a(Lcom/arlib/floatingsearchview/FloatingSearchView$j;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->b:Z

    return v0
.end method

.method static synthetic a(Lcom/arlib/floatingsearchview/FloatingSearchView$j;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->b:Z

    return p1
.end method

.method static synthetic b(Lcom/arlib/floatingsearchview/FloatingSearchView$j;I)I
    .locals 0

    iput p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->j:I

    return p1
.end method

.method static synthetic b(Lcom/arlib/floatingsearchview/FloatingSearchView$j;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->e:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic b(Lcom/arlib/floatingsearchview/FloatingSearchView$j;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->i:Z

    return v0
.end method

.method static synthetic b(Lcom/arlib/floatingsearchview/FloatingSearchView$j;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->f:Z

    return p1
.end method

.method static synthetic c(Lcom/arlib/floatingsearchview/FloatingSearchView$j;)I
    .locals 1

    iget v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->t:I

    return v0
.end method

.method static synthetic c(Lcom/arlib/floatingsearchview/FloatingSearchView$j;I)I
    .locals 0

    iput p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->k:I

    return p1
.end method

.method static synthetic c(Lcom/arlib/floatingsearchview/FloatingSearchView$j;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->g:Z

    return p1
.end method

.method static synthetic d(Lcom/arlib/floatingsearchview/FloatingSearchView$j;I)I
    .locals 0

    iput p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->l:I

    return p1
.end method

.method static synthetic d(Lcom/arlib/floatingsearchview/FloatingSearchView$j;)J
    .locals 2

    iget-wide v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->w:J

    return-wide v0
.end method

.method static synthetic d(Lcom/arlib/floatingsearchview/FloatingSearchView$j;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->h:Z

    return p1
.end method

.method static synthetic e(Lcom/arlib/floatingsearchview/FloatingSearchView$j;)I
    .locals 1

    iget v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->d:I

    return v0
.end method

.method static synthetic e(Lcom/arlib/floatingsearchview/FloatingSearchView$j;I)I
    .locals 0

    iput p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->m:I

    return p1
.end method

.method static synthetic e(Lcom/arlib/floatingsearchview/FloatingSearchView$j;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->i:Z

    return p1
.end method

.method static synthetic f(Lcom/arlib/floatingsearchview/FloatingSearchView$j;I)I
    .locals 0

    iput p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->n:I

    return p1
.end method

.method static synthetic f(Lcom/arlib/floatingsearchview/FloatingSearchView$j;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->f:Z

    return v0
.end method

.method static synthetic f(Lcom/arlib/floatingsearchview/FloatingSearchView$j;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->v:Z

    return p1
.end method

.method static synthetic g(Lcom/arlib/floatingsearchview/FloatingSearchView$j;I)I
    .locals 0

    iput p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->o:I

    return p1
.end method

.method static synthetic g(Lcom/arlib/floatingsearchview/FloatingSearchView$j;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->g:Z

    return v0
.end method

.method static synthetic g(Lcom/arlib/floatingsearchview/FloatingSearchView$j;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->x:Z

    return p1
.end method

.method static synthetic h(Lcom/arlib/floatingsearchview/FloatingSearchView$j;I)I
    .locals 0

    iput p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->p:I

    return p1
.end method

.method static synthetic h(Lcom/arlib/floatingsearchview/FloatingSearchView$j;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->h:Z

    return v0
.end method

.method static synthetic i(Lcom/arlib/floatingsearchview/FloatingSearchView$j;I)I
    .locals 0

    iput p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->q:I

    return p1
.end method

.method static synthetic i(Lcom/arlib/floatingsearchview/FloatingSearchView$j;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->e:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic j(Lcom/arlib/floatingsearchview/FloatingSearchView$j;)I
    .locals 1

    iget v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->j:I

    return v0
.end method

.method static synthetic j(Lcom/arlib/floatingsearchview/FloatingSearchView$j;I)I
    .locals 0

    iput p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->r:I

    return p1
.end method

.method static synthetic k(Lcom/arlib/floatingsearchview/FloatingSearchView$j;)I
    .locals 1

    iget v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->k:I

    return v0
.end method

.method static synthetic k(Lcom/arlib/floatingsearchview/FloatingSearchView$j;I)I
    .locals 0

    iput p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->s:I

    return p1
.end method

.method static synthetic l(Lcom/arlib/floatingsearchview/FloatingSearchView$j;)I
    .locals 1

    iget v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->l:I

    return v0
.end method

.method static synthetic l(Lcom/arlib/floatingsearchview/FloatingSearchView$j;I)I
    .locals 0

    iput p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->t:I

    return p1
.end method

.method static synthetic m(Lcom/arlib/floatingsearchview/FloatingSearchView$j;)I
    .locals 1

    iget v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->m:I

    return v0
.end method

.method static synthetic m(Lcom/arlib/floatingsearchview/FloatingSearchView$j;I)I
    .locals 0

    iput p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->u:I

    return p1
.end method

.method static synthetic n(Lcom/arlib/floatingsearchview/FloatingSearchView$j;)I
    .locals 1

    iget v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->n:I

    return v0
.end method

.method static synthetic o(Lcom/arlib/floatingsearchview/FloatingSearchView$j;)I
    .locals 1

    iget v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->o:I

    return v0
.end method

.method static synthetic p(Lcom/arlib/floatingsearchview/FloatingSearchView$j;)I
    .locals 1

    iget v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->p:I

    return v0
.end method

.method static synthetic q(Lcom/arlib/floatingsearchview/FloatingSearchView$j;)I
    .locals 1

    iget v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->q:I

    return v0
.end method

.method static synthetic r(Lcom/arlib/floatingsearchview/FloatingSearchView$j;)I
    .locals 1

    iget v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->r:I

    return v0
.end method

.method static synthetic s(Lcom/arlib/floatingsearchview/FloatingSearchView$j;)I
    .locals 1

    iget v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->s:I

    return v0
.end method

.method static synthetic t(Lcom/arlib/floatingsearchview/FloatingSearchView$j;)I
    .locals 1

    iget v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->u:I

    return v0
.end method

.method static synthetic u(Lcom/arlib/floatingsearchview/FloatingSearchView$j;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->v:Z

    return v0
.end method

.method static synthetic v(Lcom/arlib/floatingsearchview/FloatingSearchView$j;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->x:Z

    return v0
.end method

.method static synthetic w(Lcom/arlib/floatingsearchview/FloatingSearchView$j;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->a:Ljava/util/List;

    return-object v0
.end method

.method static synthetic x(Lcom/arlib/floatingsearchview/FloatingSearchView$j;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->c:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 6

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-super {p0, p1, p2}, Landroid/view/View$BaseSavedState;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->a:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    iget-boolean v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->b:Z

    if-eqz v0, :cond_0

    move v0, v1

    :goto_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->d:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->e:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->f:Z

    if-eqz v0, :cond_1

    move v0, v1

    :goto_1
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->g:Z

    if-eqz v0, :cond_2

    move v0, v1

    :goto_2
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->h:Z

    if-eqz v0, :cond_3

    move v0, v1

    :goto_3
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->i:Z

    if-eqz v0, :cond_4

    move v0, v1

    :goto_4
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->j:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->k:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->l:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->m:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->n:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->o:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->p:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->q:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->r:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->s:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->t:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->u:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->v:Z

    if-eqz v0, :cond_5

    move v0, v1

    :goto_5
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-wide v4, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->w:J

    invoke-virtual {p1, v4, v5}, Landroid/os/Parcel;->writeLong(J)V

    iget-boolean v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$j;->x:Z

    if-eqz v0, :cond_6

    :goto_6
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    return-void

    :cond_0
    move v0, v2

    goto/16 :goto_0

    :cond_1
    move v0, v2

    goto :goto_1

    :cond_2
    move v0, v2

    goto :goto_2

    :cond_3
    move v0, v2

    goto :goto_3

    :cond_4
    move v0, v2

    goto :goto_4

    :cond_5
    move v0, v2

    goto :goto_5

    :cond_6
    move v1, v2

    goto :goto_6
.end method
