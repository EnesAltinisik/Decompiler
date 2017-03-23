.class public Lcom/google/android/gms/internal/zzacn;
.super Lcom/google/android/gms/common/api/zzc;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/zzacn$g;,
        Lcom/google/android/gms/internal/zzacn$b;,
        Lcom/google/android/gms/internal/zzacn$j;,
        Lcom/google/android/gms/internal/zzacn$q;,
        Lcom/google/android/gms/internal/zzacn$p;,
        Lcom/google/android/gms/internal/zzacn$f;,
        Lcom/google/android/gms/internal/zzacn$e;,
        Lcom/google/android/gms/internal/zzacn$k;,
        Lcom/google/android/gms/internal/zzacn$c;,
        Lcom/google/android/gms/internal/zzacn$i;,
        Lcom/google/android/gms/internal/zzacn$o;,
        Lcom/google/android/gms/internal/zzacn$a;,
        Lcom/google/android/gms/internal/zzacn$s;,
        Lcom/google/android/gms/internal/zzacn$r;,
        Lcom/google/android/gms/internal/zzacn$t;,
        Lcom/google/android/gms/internal/zzacn$l;,
        Lcom/google/android/gms/internal/zzacn$h;,
        Lcom/google/android/gms/internal/zzacn$m;,
        Lcom/google/android/gms/internal/zzacn$n;,
        Lcom/google/android/gms/internal/zzacn$d;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/api/zzc",
        "<",
        "Lcom/google/android/gms/internal/zzacv$zza;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/zzacv$zza;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/zzacv;->zzbFz:Lcom/google/android/gms/common/api/Api;

    invoke-direct {p0, p1, v0, p2}, Lcom/google/android/gms/common/api/zzc;-><init>(Landroid/content/Context;Lcom/google/android/gms/common/api/Api;Lcom/google/android/gms/common/api/Api$ApiOptions;)V

    return-void
.end method

.method private zza(Lcom/google/android/gms/internal/d;)Lcom/google/android/gms/internal/zzacn$g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ResultT:",
            "Ljava/lang/Object;",
            "CallbackT:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/d",
            "<TResultT;TCallbackT;>;)",
            "Lcom/google/android/gms/internal/zzacn$g",
            "<TResultT;TCallbackT;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/zzacn$g;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/zzacn$g;-><init>(Lcom/google/android/gms/internal/zzacn;Lcom/google/android/gms/internal/d;)V

    return-object v0
.end method

.method private static zza(Lcom/google/firebase/FirebaseApp;Lcom/google/firebase/auth/api/model/GetAccountInfoUser;)Lcom/google/android/gms/internal/zzadh;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lcom/google/android/gms/internal/zzacn;->zza(Lcom/google/firebase/FirebaseApp;Lcom/google/firebase/auth/api/model/GetAccountInfoUser;Z)Lcom/google/android/gms/internal/zzadh;

    move-result-object v0

    return-object v0
.end method

.method private static zza(Lcom/google/firebase/FirebaseApp;Lcom/google/firebase/auth/api/model/GetAccountInfoUser;Z)Lcom/google/android/gms/internal/zzadh;
    .locals 5

    invoke-static {p0}, Lcom/google/android/gms/common/internal/zzaa;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lcom/google/android/gms/common/internal/zzaa;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/zzadf;

    const-string v1, "firebase"

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/internal/zzadf;-><init>(Lcom/google/firebase/auth/api/model/GetAccountInfoUser;Ljava/lang/String;)V

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Lcom/google/firebase/auth/api/model/GetAccountInfoUser;->zzOD()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    new-instance v4, Lcom/google/android/gms/internal/zzadf;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/auth/api/model/ProviderUserInfo;

    invoke-direct {v4, v0}, Lcom/google/android/gms/internal/zzadf;-><init>(Lcom/google/firebase/auth/api/model/ProviderUserInfo;)V

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/zzadh;

    invoke-direct {v1, p0, v2}, Lcom/google/android/gms/internal/zzadh;-><init>(Lcom/google/firebase/FirebaseApp;Ljava/util/List;)V

    invoke-virtual {v1, p2}, Lcom/google/android/gms/internal/zzadh;->zzaK(Z)Lcom/google/firebase/auth/FirebaseUser;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzadh;

    invoke-virtual {p1}, Lcom/google/firebase/auth/api/model/GetAccountInfoUser;->getEmail()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lcom/google/firebase/auth/api/model/GetAccountInfoUser;->getPassword()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "password"

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zzadh;->zzhI(Ljava/lang/String;)Lcom/google/firebase/auth/FirebaseUser;

    :cond_1
    return-object v1
.end method

.method private zza(Lcom/google/firebase/FirebaseApp;Lcom/google/firebase/auth/AuthCredential;Lcom/google/firebase/auth/FirebaseUser;Lcom/google/android/gms/internal/zzadc;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/FirebaseApp;",
            "Lcom/google/firebase/auth/AuthCredential;",
            "Lcom/google/firebase/auth/FirebaseUser;",
            "Lcom/google/android/gms/internal/zzadc;",
            ")",
            "Lcom/google/android/gms/tasks/Task",
            "<",
            "Lcom/google/firebase/auth/AuthResult;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/common/internal/zzaa;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/zzaa;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, Lcom/google/android/gms/common/internal/zzaa;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p4}, Lcom/google/android/gms/common/internal/zzaa;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p3}, Lcom/google/firebase/auth/FirebaseUser;->getProviders()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lcom/google/firebase/auth/AuthCredential;->getProvider()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const/16 v1, 0x4277

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-static {v0}, Lcom/google/android/gms/internal/zzacq;->zzbN(Lcom/google/android/gms/common/api/Status;)Lcom/google/firebase/FirebaseException;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/zzacn$f;

    invoke-direct {v0, p2}, Lcom/google/android/gms/internal/zzacn$f;-><init>(Lcom/google/firebase/auth/AuthCredential;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzacn$f;->a(Lcom/google/firebase/FirebaseApp;)Lcom/google/android/gms/internal/d;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/google/android/gms/internal/d;->a(Lcom/google/firebase/auth/FirebaseUser;)Lcom/google/android/gms/internal/d;

    move-result-object v0

    invoke-virtual {v0, p4}, Lcom/google/android/gms/internal/d;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/d;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzacn;->zza(Lcom/google/android/gms/internal/d;)Lcom/google/android/gms/internal/zzacn$g;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzacn;->zzb(Lcom/google/android/gms/internal/zzpd;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    goto :goto_0
.end method

.method private zza(Lcom/google/firebase/FirebaseApp;Lcom/google/firebase/auth/EmailAuthCredential;Lcom/google/firebase/auth/FirebaseUser;Lcom/google/android/gms/internal/zzadc;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/FirebaseApp;",
            "Lcom/google/firebase/auth/EmailAuthCredential;",
            "Lcom/google/firebase/auth/FirebaseUser;",
            "Lcom/google/android/gms/internal/zzadc;",
            ")",
            "Lcom/google/android/gms/tasks/Task",
            "<",
            "Lcom/google/firebase/auth/AuthResult;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/zzacn$e;

    invoke-direct {v0, p2}, Lcom/google/android/gms/internal/zzacn$e;-><init>(Lcom/google/firebase/auth/EmailAuthCredential;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzacn$e;->a(Lcom/google/firebase/FirebaseApp;)Lcom/google/android/gms/internal/d;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/google/android/gms/internal/d;->a(Lcom/google/firebase/auth/FirebaseUser;)Lcom/google/android/gms/internal/d;

    move-result-object v0

    invoke-virtual {v0, p4}, Lcom/google/android/gms/internal/d;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/d;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzacn;->zza(Lcom/google/android/gms/internal/d;)Lcom/google/android/gms/internal/zzacn$g;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzacn;->zzb(Lcom/google/android/gms/internal/zzpd;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method private zza(Lcom/google/firebase/FirebaseApp;Lcom/google/firebase/auth/FirebaseUser;Lcom/google/android/gms/internal/zzadc;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/FirebaseApp;",
            "Lcom/google/firebase/auth/FirebaseUser;",
            "Lcom/google/android/gms/internal/zzadc;",
            ")",
            "Lcom/google/android/gms/tasks/Task",
            "<",
            "Lcom/google/firebase/auth/AuthResult;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/zzacn$p;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzacn$p;-><init>()V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzacn$p;->a(Lcom/google/firebase/FirebaseApp;)Lcom/google/android/gms/internal/d;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/d;->a(Lcom/google/firebase/auth/FirebaseUser;)Lcom/google/android/gms/internal/d;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/google/android/gms/internal/d;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/d;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzacn;->zza(Lcom/google/android/gms/internal/d;)Lcom/google/android/gms/internal/zzacn$g;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzacn;->zzb(Lcom/google/android/gms/internal/zzpd;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method private zza(Lcom/google/firebase/FirebaseApp;Ljava/lang/String;Lcom/google/firebase/auth/FirebaseUser;Lcom/google/android/gms/internal/zzadc;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/FirebaseApp;",
            "Ljava/lang/String;",
            "Lcom/google/firebase/auth/FirebaseUser;",
            "Lcom/google/android/gms/internal/zzadc;",
            ")",
            "Lcom/google/android/gms/tasks/Task",
            "<",
            "Lcom/google/firebase/auth/AuthResult;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/zzacn$q;

    invoke-direct {v0, p2}, Lcom/google/android/gms/internal/zzacn$q;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzacn$q;->a(Lcom/google/firebase/FirebaseApp;)Lcom/google/android/gms/internal/d;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/google/android/gms/internal/d;->a(Lcom/google/firebase/auth/FirebaseUser;)Lcom/google/android/gms/internal/d;

    move-result-object v0

    invoke-virtual {v0, p4}, Lcom/google/android/gms/internal/d;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/d;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzacn;->zza(Lcom/google/android/gms/internal/d;)Lcom/google/android/gms/internal/zzacn$g;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzacn;->zzb(Lcom/google/android/gms/internal/zzpd;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method static synthetic zzb(Lcom/google/firebase/FirebaseApp;Lcom/google/firebase/auth/api/model/GetAccountInfoUser;)Lcom/google/android/gms/internal/zzadh;
    .locals 1

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/zzacn;->zza(Lcom/google/firebase/FirebaseApp;Lcom/google/firebase/auth/api/model/GetAccountInfoUser;)Lcom/google/android/gms/internal/zzadh;

    move-result-object v0

    return-object v0
.end method

.method static synthetic zzb(Lcom/google/firebase/FirebaseApp;Lcom/google/firebase/auth/api/model/GetAccountInfoUser;Z)Lcom/google/android/gms/internal/zzadh;
    .locals 1

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/zzacn;->zza(Lcom/google/firebase/FirebaseApp;Lcom/google/firebase/auth/api/model/GetAccountInfoUser;Z)Lcom/google/android/gms/internal/zzadh;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public zza(Lcom/google/firebase/FirebaseApp;Lcom/google/android/gms/internal/zzadc;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/FirebaseApp;",
            "Lcom/google/android/gms/internal/zzadc;",
            ")",
            "Lcom/google/android/gms/tasks/Task",
            "<",
            "Lcom/google/firebase/auth/AuthResult;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/zzacn$l;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzacn$l;-><init>()V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzacn$l;->a(Lcom/google/firebase/FirebaseApp;)Lcom/google/android/gms/internal/d;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/d;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/d;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzacn;->zza(Lcom/google/android/gms/internal/d;)Lcom/google/android/gms/internal/zzacn$g;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzacn;->zzb(Lcom/google/android/gms/internal/zzpd;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public zza(Lcom/google/firebase/FirebaseApp;Lcom/google/firebase/auth/AuthCredential;Lcom/google/android/gms/internal/zzadc;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/FirebaseApp;",
            "Lcom/google/firebase/auth/AuthCredential;",
            "Lcom/google/android/gms/internal/zzadc;",
            ")",
            "Lcom/google/android/gms/tasks/Task",
            "<",
            "Lcom/google/firebase/auth/AuthResult;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/zzacn$m;

    invoke-direct {v0, p2}, Lcom/google/android/gms/internal/zzacn$m;-><init>(Lcom/google/firebase/auth/AuthCredential;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzacn$m;->a(Lcom/google/firebase/FirebaseApp;)Lcom/google/android/gms/internal/d;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/google/android/gms/internal/d;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/d;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzacn;->zza(Lcom/google/android/gms/internal/d;)Lcom/google/android/gms/internal/zzacn$g;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzacn;->zzb(Lcom/google/android/gms/internal/zzpd;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public zza(Lcom/google/firebase/FirebaseApp;Lcom/google/firebase/auth/FirebaseUser;Lcom/google/firebase/auth/AuthCredential;Lcom/google/android/gms/internal/zzadc;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/FirebaseApp;",
            "Lcom/google/firebase/auth/FirebaseUser;",
            "Lcom/google/firebase/auth/AuthCredential;",
            "Lcom/google/android/gms/internal/zzadc;",
            ")",
            "Lcom/google/android/gms/tasks/Task",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/zzacn$h;

    invoke-direct {v0, p3}, Lcom/google/android/gms/internal/zzacn$h;-><init>(Lcom/google/firebase/auth/AuthCredential;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzacn$h;->a(Lcom/google/firebase/FirebaseApp;)Lcom/google/android/gms/internal/d;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/d;->a(Lcom/google/firebase/auth/FirebaseUser;)Lcom/google/android/gms/internal/d;

    move-result-object v0

    invoke-virtual {v0, p4}, Lcom/google/android/gms/internal/d;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/d;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzacn;->zza(Lcom/google/android/gms/internal/d;)Lcom/google/android/gms/internal/zzacn$g;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzacn;->zzb(Lcom/google/android/gms/internal/zzpd;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public zza(Lcom/google/firebase/FirebaseApp;Lcom/google/firebase/auth/FirebaseUser;Lcom/google/firebase/auth/UserProfileChangeRequest;Lcom/google/android/gms/internal/zzadc;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/FirebaseApp;",
            "Lcom/google/firebase/auth/FirebaseUser;",
            "Lcom/google/firebase/auth/UserProfileChangeRequest;",
            "Lcom/google/android/gms/internal/zzadc;",
            ")",
            "Lcom/google/android/gms/tasks/Task",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/zzacn$t;

    invoke-direct {v0, p3}, Lcom/google/android/gms/internal/zzacn$t;-><init>(Lcom/google/firebase/auth/UserProfileChangeRequest;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzacn$t;->a(Lcom/google/firebase/FirebaseApp;)Lcom/google/android/gms/internal/d;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/d;->a(Lcom/google/firebase/auth/FirebaseUser;)Lcom/google/android/gms/internal/d;

    move-result-object v0

    invoke-virtual {v0, p4}, Lcom/google/android/gms/internal/d;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/d;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzacn;->zza(Lcom/google/android/gms/internal/d;)Lcom/google/android/gms/internal/zzacn$g;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzacn;->zzb(Lcom/google/android/gms/internal/zzpd;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public zza(Lcom/google/firebase/FirebaseApp;Lcom/google/firebase/auth/FirebaseUser;Ljava/lang/String;Lcom/google/android/gms/internal/zzadc;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/FirebaseApp;",
            "Lcom/google/firebase/auth/FirebaseUser;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/zzadc;",
            ")",
            "Lcom/google/android/gms/tasks/Task",
            "<",
            "Lcom/google/firebase/auth/GetTokenResult;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/zzacn$d;

    invoke-direct {v0, p3}, Lcom/google/android/gms/internal/zzacn$d;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzacn$d;->a(Lcom/google/firebase/FirebaseApp;)Lcom/google/android/gms/internal/d;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/d;->a(Lcom/google/firebase/auth/FirebaseUser;)Lcom/google/android/gms/internal/d;

    move-result-object v0

    invoke-virtual {v0, p4}, Lcom/google/android/gms/internal/d;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/d;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzacn;->zza(Lcom/google/android/gms/internal/d;)Lcom/google/android/gms/internal/zzacn$g;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzacn;->zza(Lcom/google/android/gms/internal/zzpd;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public zza(Lcom/google/firebase/FirebaseApp;Lcom/google/firebase/auth/FirebaseUser;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/zzadc;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/FirebaseApp;",
            "Lcom/google/firebase/auth/FirebaseUser;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/zzadc;",
            ")",
            "Lcom/google/android/gms/tasks/Task",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/zzacn$i;

    invoke-direct {v0, p3, p4}, Lcom/google/android/gms/internal/zzacn$i;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzacn$i;->a(Lcom/google/firebase/FirebaseApp;)Lcom/google/android/gms/internal/d;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/d;->a(Lcom/google/firebase/auth/FirebaseUser;)Lcom/google/android/gms/internal/d;

    move-result-object v0

    invoke-virtual {v0, p5}, Lcom/google/android/gms/internal/d;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/d;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzacn;->zza(Lcom/google/android/gms/internal/d;)Lcom/google/android/gms/internal/zzacn$g;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzacn;->zzb(Lcom/google/android/gms/internal/zzpd;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public zza(Lcom/google/firebase/FirebaseApp;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/FirebaseApp;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/tasks/Task",
            "<",
            "Lcom/google/firebase/auth/ProviderQueryResult;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/zzacn$c;

    invoke-direct {v0, p2}, Lcom/google/android/gms/internal/zzacn$c;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzacn$c;->a(Lcom/google/firebase/FirebaseApp;)Lcom/google/android/gms/internal/d;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzacn;->zza(Lcom/google/android/gms/internal/d;)Lcom/google/android/gms/internal/zzacn$g;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzacn;->zza(Lcom/google/android/gms/internal/zzpd;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public zza(Lcom/google/firebase/FirebaseApp;Ljava/lang/String;Lcom/google/android/gms/internal/zzadc;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/FirebaseApp;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/zzadc;",
            ")",
            "Lcom/google/android/gms/tasks/Task",
            "<",
            "Lcom/google/firebase/auth/AuthResult;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/zzacn$n;

    invoke-direct {v0, p2}, Lcom/google/android/gms/internal/zzacn$n;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzacn$n;->a(Lcom/google/firebase/FirebaseApp;)Lcom/google/android/gms/internal/d;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/google/android/gms/internal/d;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/d;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzacn;->zza(Lcom/google/android/gms/internal/d;)Lcom/google/android/gms/internal/zzacn$g;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzacn;->zzb(Lcom/google/android/gms/internal/zzpd;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public zza(Lcom/google/firebase/FirebaseApp;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/zzadc;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/FirebaseApp;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/zzadc;",
            ")",
            "Lcom/google/android/gms/tasks/Task",
            "<",
            "Lcom/google/firebase/auth/AuthResult;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/zzacn$a;

    invoke-direct {v0, p2, p3}, Lcom/google/android/gms/internal/zzacn$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzacn$a;->a(Lcom/google/firebase/FirebaseApp;)Lcom/google/android/gms/internal/d;

    move-result-object v0

    invoke-virtual {v0, p4}, Lcom/google/android/gms/internal/d;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/d;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzacn;->zza(Lcom/google/android/gms/internal/d;)Lcom/google/android/gms/internal/zzacn$g;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzacn;->zzb(Lcom/google/android/gms/internal/zzpd;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public zza(Lcom/google/firebase/auth/FirebaseUser;Lcom/google/android/gms/internal/zzadk;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/auth/FirebaseUser;",
            "Lcom/google/android/gms/internal/zzadk;",
            ")",
            "Lcom/google/android/gms/tasks/Task",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/zzacn$b;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzacn$b;-><init>()V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzacn$b;->a(Lcom/google/firebase/auth/FirebaseUser;)Lcom/google/android/gms/internal/d;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/d;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/d;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzacn;->zza(Lcom/google/android/gms/internal/d;)Lcom/google/android/gms/internal/zzacn$g;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzacn;->zzb(Lcom/google/android/gms/internal/zzpd;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public zzb(Lcom/google/firebase/FirebaseApp;Lcom/google/firebase/auth/FirebaseUser;Lcom/google/android/gms/internal/zzadc;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/FirebaseApp;",
            "Lcom/google/firebase/auth/FirebaseUser;",
            "Lcom/google/android/gms/internal/zzadc;",
            ")",
            "Lcom/google/android/gms/tasks/Task",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/zzacn$j;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzacn$j;-><init>()V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzacn$j;->a(Lcom/google/firebase/FirebaseApp;)Lcom/google/android/gms/internal/d;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/d;->a(Lcom/google/firebase/auth/FirebaseUser;)Lcom/google/android/gms/internal/d;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/google/android/gms/internal/d;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/d;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzacn;->zza(Lcom/google/android/gms/internal/d;)Lcom/google/android/gms/internal/zzacn$g;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzacn;->zza(Lcom/google/android/gms/internal/zzpd;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public zzb(Lcom/google/firebase/FirebaseApp;Lcom/google/firebase/auth/FirebaseUser;Lcom/google/firebase/auth/AuthCredential;Lcom/google/android/gms/internal/zzadc;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/FirebaseApp;",
            "Lcom/google/firebase/auth/FirebaseUser;",
            "Lcom/google/firebase/auth/AuthCredential;",
            "Lcom/google/android/gms/internal/zzadc;",
            ")",
            "Lcom/google/android/gms/tasks/Task",
            "<",
            "Lcom/google/firebase/auth/AuthResult;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/common/internal/zzaa;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, Lcom/google/android/gms/common/internal/zzaa;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/zzaa;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p4}, Lcom/google/android/gms/common/internal/zzaa;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    const-class v0, Lcom/google/firebase/auth/EmailAuthCredential;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_0

    check-cast p3, Lcom/google/firebase/auth/EmailAuthCredential;

    invoke-direct {p0, p1, p3, p2, p4}, Lcom/google/android/gms/internal/zzacn;->zza(Lcom/google/firebase/FirebaseApp;Lcom/google/firebase/auth/EmailAuthCredential;Lcom/google/firebase/auth/FirebaseUser;Lcom/google/android/gms/internal/zzadc;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-direct {p0, p1, p3, p2, p4}, Lcom/google/android/gms/internal/zzacn;->zza(Lcom/google/firebase/FirebaseApp;Lcom/google/firebase/auth/AuthCredential;Lcom/google/firebase/auth/FirebaseUser;Lcom/google/android/gms/internal/zzadc;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    goto :goto_0
.end method

.method public zzb(Lcom/google/firebase/FirebaseApp;Lcom/google/firebase/auth/FirebaseUser;Ljava/lang/String;Lcom/google/android/gms/internal/zzadc;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/FirebaseApp;",
            "Lcom/google/firebase/auth/FirebaseUser;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/zzadc;",
            ")",
            "Lcom/google/android/gms/tasks/Task",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/zzacn$r;

    invoke-direct {v0, p3}, Lcom/google/android/gms/internal/zzacn$r;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzacn$r;->a(Lcom/google/firebase/FirebaseApp;)Lcom/google/android/gms/internal/d;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/d;->a(Lcom/google/firebase/auth/FirebaseUser;)Lcom/google/android/gms/internal/d;

    move-result-object v0

    invoke-virtual {v0, p4}, Lcom/google/android/gms/internal/d;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/d;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzacn;->zza(Lcom/google/android/gms/internal/d;)Lcom/google/android/gms/internal/zzacn$g;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzacn;->zzb(Lcom/google/android/gms/internal/zzpd;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public zzb(Lcom/google/firebase/FirebaseApp;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/FirebaseApp;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/tasks/Task",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/zzacn$k;

    invoke-direct {v0, p2}, Lcom/google/android/gms/internal/zzacn$k;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzacn$k;->a(Lcom/google/firebase/FirebaseApp;)Lcom/google/android/gms/internal/d;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzacn;->zza(Lcom/google/android/gms/internal/d;)Lcom/google/android/gms/internal/zzacn$g;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzacn;->zzb(Lcom/google/android/gms/internal/zzpd;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public zzb(Lcom/google/firebase/FirebaseApp;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/zzadc;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/FirebaseApp;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/zzadc;",
            ")",
            "Lcom/google/android/gms/tasks/Task",
            "<",
            "Lcom/google/firebase/auth/AuthResult;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/zzacn$o;

    invoke-direct {v0, p2, p3}, Lcom/google/android/gms/internal/zzacn$o;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzacn$o;->a(Lcom/google/firebase/FirebaseApp;)Lcom/google/android/gms/internal/d;

    move-result-object v0

    invoke-virtual {v0, p4}, Lcom/google/android/gms/internal/d;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/d;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzacn;->zza(Lcom/google/android/gms/internal/d;)Lcom/google/android/gms/internal/zzacn$g;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzacn;->zzb(Lcom/google/android/gms/internal/zzpd;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public zzc(Lcom/google/firebase/FirebaseApp;Lcom/google/firebase/auth/FirebaseUser;Ljava/lang/String;Lcom/google/android/gms/internal/zzadc;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/FirebaseApp;",
            "Lcom/google/firebase/auth/FirebaseUser;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/zzadc;",
            ")",
            "Lcom/google/android/gms/tasks/Task",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/zzacn$s;

    invoke-direct {v0, p3}, Lcom/google/android/gms/internal/zzacn$s;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzacn$s;->a(Lcom/google/firebase/FirebaseApp;)Lcom/google/android/gms/internal/d;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/d;->a(Lcom/google/firebase/auth/FirebaseUser;)Lcom/google/android/gms/internal/d;

    move-result-object v0

    invoke-virtual {v0, p4}, Lcom/google/android/gms/internal/d;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/d;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzacn;->zza(Lcom/google/android/gms/internal/d;)Lcom/google/android/gms/internal/zzacn$g;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzacn;->zzb(Lcom/google/android/gms/internal/zzpd;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public zzd(Lcom/google/firebase/FirebaseApp;Lcom/google/firebase/auth/FirebaseUser;Ljava/lang/String;Lcom/google/android/gms/internal/zzadc;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/FirebaseApp;",
            "Lcom/google/firebase/auth/FirebaseUser;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/zzadc;",
            ")",
            "Lcom/google/android/gms/tasks/Task",
            "<",
            "Lcom/google/firebase/auth/AuthResult;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/common/internal/zzaa;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, Lcom/google/android/gms/common/internal/zzaa;->zzdl(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/zzaa;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p4}, Lcom/google/android/gms/common/internal/zzaa;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2}, Lcom/google/firebase/auth/FirebaseUser;->getProviders()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {p2}, Lcom/google/firebase/auth/FirebaseUser;->isAnonymous()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const/16 v1, 0x4278

    invoke-direct {v0, v1, p3}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/zzacq;->zzbN(Lcom/google/android/gms/common/api/Status;)Lcom/google/firebase/FirebaseException;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_2
    const/4 v0, -0x1

    invoke-virtual {p3}, Ljava/lang/String;->hashCode()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    :cond_3
    :goto_1
    packed-switch v0, :pswitch_data_1

    invoke-direct {p0, p1, p3, p2, p4}, Lcom/google/android/gms/internal/zzacn;->zza(Lcom/google/firebase/FirebaseApp;Ljava/lang/String;Lcom/google/firebase/auth/FirebaseUser;Lcom/google/android/gms/internal/zzadc;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    goto :goto_0

    :pswitch_0
    const-string v1, "password"

    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v0, 0x0

    goto :goto_1

    :pswitch_1
    invoke-direct {p0, p1, p2, p4}, Lcom/google/android/gms/internal/zzacn;->zza(Lcom/google/firebase/FirebaseApp;Lcom/google/firebase/auth/FirebaseUser;Lcom/google/android/gms/internal/zzadc;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x4889ba9b
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch
.end method
