.class public Lcom/google/firebase/database/j;
.super Ljava/lang/Object;


# static fields
.field static final synthetic d:Z


# instance fields
.field protected final a:Lcom/google/android/gms/b/gz;

.field protected final b:Lcom/google/android/gms/b/gx;

.field protected final c:Lcom/google/android/gms/b/is;

.field private final e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/google/firebase/database/j;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/google/firebase/database/j;->d:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method constructor <init>(Lcom/google/android/gms/b/gz;Lcom/google/android/gms/b/gx;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/database/j;->a:Lcom/google/android/gms/b/gz;

    iput-object p2, p0, Lcom/google/firebase/database/j;->b:Lcom/google/android/gms/b/gx;

    sget-object v0, Lcom/google/android/gms/b/is;->a:Lcom/google/android/gms/b/is;

    iput-object v0, p0, Lcom/google/firebase/database/j;->c:Lcom/google/android/gms/b/is;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/firebase/database/j;->e:Z

    return-void
.end method


# virtual methods
.method public c()Lcom/google/android/gms/b/gx;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/database/j;->b:Lcom/google/android/gms/b/gx;

    return-object v0
.end method
