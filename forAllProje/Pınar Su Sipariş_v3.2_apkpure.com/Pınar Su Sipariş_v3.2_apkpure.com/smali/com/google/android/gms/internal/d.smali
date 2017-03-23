.class abstract Lcom/google/android/gms/internal/d;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/d$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<SuccessT:",
        "Ljava/lang/Object;",
        "CallbackT:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field protected final a:I

.field protected final b:Lcom/google/android/gms/internal/d$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/d$a;"
        }
    .end annotation
.end field

.field protected c:Lcom/google/firebase/FirebaseApp;

.field protected d:Lcom/google/firebase/auth/FirebaseUser;

.field protected e:Lcom/google/android/gms/internal/zzacu;

.field protected f:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TCallbackT;"
        }
    .end annotation
.end field

.field protected g:Lcom/google/android/gms/internal/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/c",
            "<TSuccessT;>;"
        }
    .end annotation
.end field

.field protected h:Lcom/google/firebase/auth/api/model/GetTokenResponse;

.field protected i:Lcom/google/firebase/auth/api/model/GetAccountInfoUser;

.field protected j:Lcom/google/firebase/auth/api/model/CreateAuthUriResponse;

.field k:Z

.field l:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TSuccessT;"
        }
    .end annotation
.end field

.field m:Lcom/google/android/gms/common/api/Status;

.field private n:Z


# direct methods
.method public constructor <init>(I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/d$a;-><init>(Lcom/google/android/gms/internal/d;Lcom/google/android/gms/internal/d$1;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/d;->b:Lcom/google/android/gms/internal/d$a;

    iput p1, p0, Lcom/google/android/gms/internal/d;->a:I

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/d;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/d;->d()V

    return-void
.end method

.method private d()V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/d;->b()V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/d;->n:Z

    const-string v1, "no success or failure set on method implementation"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/zzaa;->zza(ZLjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/c;)Lcom/google/android/gms/internal/d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/c",
            "<TSuccessT;>;)",
            "Lcom/google/android/gms/internal/d",
            "<TSuccessT;TCallbackT;>;"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/internal/d;->g:Lcom/google/android/gms/internal/c;

    return-object p0
.end method

.method public a(Lcom/google/firebase/FirebaseApp;)Lcom/google/android/gms/internal/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/FirebaseApp;",
            ")",
            "Lcom/google/android/gms/internal/d",
            "<TSuccessT;TCallbackT;>;"
        }
    .end annotation

    const-string v0, "firebaseApp cannot be null"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/zzaa;->zzb(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/FirebaseApp;

    iput-object v0, p0, Lcom/google/android/gms/internal/d;->c:Lcom/google/firebase/FirebaseApp;

    return-object p0
.end method

.method public a(Lcom/google/firebase/auth/FirebaseUser;)Lcom/google/android/gms/internal/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/auth/FirebaseUser;",
            ")",
            "Lcom/google/android/gms/internal/d",
            "<TSuccessT;TCallbackT;>;"
        }
    .end annotation

    const-string v0, "firebaseUser cannot be null"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/zzaa;->zzb(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/auth/FirebaseUser;

    iput-object v0, p0, Lcom/google/android/gms/internal/d;->d:Lcom/google/firebase/auth/FirebaseUser;

    return-object p0
.end method

.method public a(Ljava/lang/Object;)Lcom/google/android/gms/internal/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TCallbackT;)",
            "Lcom/google/android/gms/internal/d",
            "<TSuccessT;TCallbackT;>;"
        }
    .end annotation

    const-string v0, "external callback cannot be null"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/zzaa;->zzb(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/d;->f:Ljava/lang/Object;

    return-object p0
.end method

.method protected abstract a()V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method

.method public a(Lcom/google/android/gms/common/api/Status;)V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/d;->n:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/d;->k:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/d;->m:Lcom/google/android/gms/common/api/Status;

    iget-object v0, p0, Lcom/google/android/gms/internal/d;->g:Lcom/google/android/gms/internal/c;

    const/4 v1, 0x0

    invoke-interface {v0, v1, p1}, Lcom/google/android/gms/internal/c;->a(Ljava/lang/Object;Lcom/google/android/gms/common/api/Status;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/zzacu;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/internal/d;->e:Lcom/google/android/gms/internal/zzacu;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/d;->a()V

    return-void
.end method

.method public abstract b()V
.end method

.method public b(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TSuccessT;)V"
        }
    .end annotation

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/d;->n:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/d;->k:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/d;->l:Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/d;->g:Lcom/google/android/gms/internal/c;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Lcom/google/android/gms/internal/c;->a(Ljava/lang/Object;Lcom/google/android/gms/common/api/Status;)V

    return-void
.end method

.method public c()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/d;->b(Ljava/lang/Object;)V

    return-void
.end method
