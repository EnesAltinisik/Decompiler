.class public Lcom/google/android/gms/b/cv;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/b/cv$a;
    }
.end annotation


# static fields
.field private static volatile a:Lcom/google/android/gms/b/cv;


# instance fields
.field private A:Ljava/lang/Boolean;

.field private B:J

.field private C:Ljava/nio/channels/FileLock;

.field private D:Ljava/nio/channels/FileChannel;

.field private E:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private F:I

.field private G:I

.field private H:J

.field private final b:Landroid/content/Context;

.field private final c:Lcom/google/android/gms/b/by;

.field private final d:Lcom/google/android/gms/b/cr;

.field private final e:Lcom/google/android/gms/b/co;

.field private final f:Lcom/google/android/gms/b/cu;

.field private final g:Lcom/google/android/gms/b/de;

.field private final h:Lcom/google/android/gms/b/ct;

.field private final i:Lcom/google/android/gms/measurement/AppMeasurement;

.field private final j:Lcom/google/firebase/a/a;

.field private final k:Lcom/google/android/gms/b/dl;

.field private final l:Lcom/google/android/gms/b/bz;

.field private final m:Lcom/google/android/gms/b/cm;

.field private final n:Lcom/google/android/gms/b/cp;

.field private final o:Lcom/google/android/gms/common/util/c;

.field private final p:Lcom/google/android/gms/b/db;

.field private final q:Lcom/google/android/gms/b/dc;

.field private final r:Lcom/google/android/gms/b/cb;

.field private final s:Lcom/google/android/gms/b/da;

.field private final t:Lcom/google/android/gms/b/cl;

.field private final u:Lcom/google/android/gms/b/cq;

.field private final v:Lcom/google/android/gms/b/dh;

.field private final w:Lcom/google/android/gms/b/bx;

.field private final x:Lcom/google/android/gms/b/bt;

.field private final y:Z

.field private z:Z


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/cz;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lcom/google/android/gms/b/cz;->a:Landroid/content/Context;

    iput-object v0, p0, Lcom/google/android/gms/b/cv;->b:Landroid/content/Context;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/google/android/gms/b/cv;->H:J

    invoke-virtual {p1, p0}, Lcom/google/android/gms/b/cz;->n(Lcom/google/android/gms/b/cv;)Lcom/google/android/gms/common/util/c;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/cv;->o:Lcom/google/android/gms/common/util/c;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/b/cz;->a(Lcom/google/android/gms/b/cv;)Lcom/google/android/gms/b/by;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/cv;->c:Lcom/google/android/gms/b/by;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/b/cz;->b(Lcom/google/android/gms/b/cv;)Lcom/google/android/gms/b/cr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/cr;->R()V

    iput-object v0, p0, Lcom/google/android/gms/b/cv;->d:Lcom/google/android/gms/b/cr;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/b/cz;->c(Lcom/google/android/gms/b/cv;)Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->R()V

    iput-object v0, p0, Lcom/google/android/gms/b/cv;->e:Lcom/google/android/gms/b/co;

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->B()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v1, "App measurement is starting up, version"

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->d()Lcom/google/android/gms/b/by;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/by;->Q()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->B()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v1, "To enable debug logging run: adb shell setprop log.tag.FA VERBOSE"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->C()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v1, "Debug-level message logging enabled"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->C()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v1, "AppMeasurement singleton hash"

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p1, p0}, Lcom/google/android/gms/b/cz;->j(Lcom/google/android/gms/b/cv;)Lcom/google/android/gms/b/dl;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/dl;->R()V

    iput-object v0, p0, Lcom/google/android/gms/b/cv;->k:Lcom/google/android/gms/b/dl;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/b/cz;->q(Lcom/google/android/gms/b/cv;)Lcom/google/android/gms/b/cb;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/cb;->R()V

    iput-object v0, p0, Lcom/google/android/gms/b/cv;->r:Lcom/google/android/gms/b/cb;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/b/cz;->r(Lcom/google/android/gms/b/cv;)Lcom/google/android/gms/b/cl;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/cl;->R()V

    iput-object v0, p0, Lcom/google/android/gms/b/cv;->t:Lcom/google/android/gms/b/cl;

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->d()Lcom/google/android/gms/b/by;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/b/by;->R()Z

    invoke-virtual {v0}, Lcom/google/android/gms/b/cl;->x()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->o()Lcom/google/android/gms/b/dl;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/b/dl;->k(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->B()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v1, "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none."

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;)V

    :goto_0
    invoke-virtual {p1, p0}, Lcom/google/android/gms/b/cz;->k(Lcom/google/android/gms/b/cv;)Lcom/google/android/gms/b/bz;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/bz;->R()V

    iput-object v0, p0, Lcom/google/android/gms/b/cv;->l:Lcom/google/android/gms/b/bz;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/b/cz;->l(Lcom/google/android/gms/b/cv;)Lcom/google/android/gms/b/cm;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/cm;->R()V

    iput-object v0, p0, Lcom/google/android/gms/b/cv;->m:Lcom/google/android/gms/b/cm;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/b/cz;->u(Lcom/google/android/gms/b/cv;)Lcom/google/android/gms/b/bx;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/bx;->R()V

    iput-object v0, p0, Lcom/google/android/gms/b/cv;->w:Lcom/google/android/gms/b/bx;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/b/cz;->v(Lcom/google/android/gms/b/cv;)Lcom/google/android/gms/b/bt;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/cv;->x:Lcom/google/android/gms/b/bt;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/b/cz;->m(Lcom/google/android/gms/b/cv;)Lcom/google/android/gms/b/cp;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/cp;->R()V

    iput-object v0, p0, Lcom/google/android/gms/b/cv;->n:Lcom/google/android/gms/b/cp;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/b/cz;->o(Lcom/google/android/gms/b/cv;)Lcom/google/android/gms/b/db;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/db;->R()V

    iput-object v0, p0, Lcom/google/android/gms/b/cv;->p:Lcom/google/android/gms/b/db;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/b/cz;->p(Lcom/google/android/gms/b/cv;)Lcom/google/android/gms/b/dc;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/dc;->R()V

    iput-object v0, p0, Lcom/google/android/gms/b/cv;->q:Lcom/google/android/gms/b/dc;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/b/cz;->i(Lcom/google/android/gms/b/cv;)Lcom/google/android/gms/b/da;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/da;->R()V

    iput-object v0, p0, Lcom/google/android/gms/b/cv;->s:Lcom/google/android/gms/b/da;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/b/cz;->t(Lcom/google/android/gms/b/cv;)Lcom/google/android/gms/b/dh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/dh;->R()V

    iput-object v0, p0, Lcom/google/android/gms/b/cv;->v:Lcom/google/android/gms/b/dh;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/b/cz;->s(Lcom/google/android/gms/b/cv;)Lcom/google/android/gms/b/cq;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/cv;->u:Lcom/google/android/gms/b/cq;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/b/cz;->h(Lcom/google/android/gms/b/cv;)Lcom/google/android/gms/measurement/AppMeasurement;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/cv;->i:Lcom/google/android/gms/measurement/AppMeasurement;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/b/cz;->g(Lcom/google/android/gms/b/cv;)Lcom/google/firebase/a/a;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/cv;->j:Lcom/google/firebase/a/a;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/b/cz;->e(Lcom/google/android/gms/b/cv;)Lcom/google/android/gms/b/de;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/de;->R()V

    iput-object v0, p0, Lcom/google/android/gms/b/cv;->g:Lcom/google/android/gms/b/de;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/b/cz;->f(Lcom/google/android/gms/b/cv;)Lcom/google/android/gms/b/ct;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/ct;->R()V

    iput-object v0, p0, Lcom/google/android/gms/b/cv;->h:Lcom/google/android/gms/b/ct;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/b/cz;->d(Lcom/google/android/gms/b/cv;)Lcom/google/android/gms/b/cu;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/cu;->R()V

    iput-object v0, p0, Lcom/google/android/gms/b/cv;->f:Lcom/google/android/gms/b/cu;

    iget v0, p0, Lcom/google/android/gms/b/cv;->F:I

    iget v1, p0, Lcom/google/android/gms/b/cv;->G:I

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->x()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v1, "Not all components initialized"

    iget v2, p0, Lcom/google/android/gms/b/cv;->F:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p0, Lcom/google/android/gms/b/cv;->G:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/b/cv;->y:Z

    iget-object v0, p0, Lcom/google/android/gms/b/cv;->c:Lcom/google/android/gms/b/by;

    invoke-virtual {v0}, Lcom/google/android/gms/b/by;->R()Z

    iget-object v0, p0, Lcom/google/android/gms/b/cv;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    instance-of v0, v0, Landroid/app/Application;

    if-eqz v0, :cond_4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_3

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->l()Lcom/google/android/gms/b/da;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/da;->x()V

    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/b/cv;->f:Lcom/google/android/gms/b/cu;

    new-instance v1, Lcom/google/android/gms/b/cv$1;

    invoke-direct {v1, p0}, Lcom/google/android/gms/b/cv$1;-><init>(Lcom/google/android/gms/b/cv;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/cu;->a(Ljava/lang/Runnable;)V

    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/b/co;->B()Lcom/google/android/gms/b/co$a;

    move-result-object v1

    const-string v2, "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app "

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_2
    invoke-virtual {v1, v0}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_2
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :cond_3
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->C()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v1, "Not tracking deep linking pre-ICS"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->z()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v1, "Application context is not an Application"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;)V

    goto :goto_1
.end method

.method private P()Z
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->C()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->a()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/bz;->I()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/bz;->C()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private Q()V
    .locals 10

    const-wide/16 v8, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->C()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->a()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->O()Z

    move-result v0

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/google/android/gms/b/cv;->P()Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->y()Lcom/google/android/gms/b/cq;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/cq;->b()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->z()Lcom/google/android/gms/b/dh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/dh;->x()V

    goto :goto_0

    :cond_2
    invoke-direct {p0}, Lcom/google/android/gms/b/cv;->R()J

    move-result-wide v0

    cmp-long v2, v0, v8

    if-nez v2, :cond_3

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->y()Lcom/google/android/gms/b/cq;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/cq;->b()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->z()Lcom/google/android/gms/b/dh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/dh;->x()V

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->r()Lcom/google/android/gms/b/cp;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/cp;->x()Z

    move-result v2

    if-nez v2, :cond_4

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->y()Lcom/google/android/gms/b/cq;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/cq;->a()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->z()Lcom/google/android/gms/b/dh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/dh;->x()V

    goto :goto_0

    :cond_4
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->e()Lcom/google/android/gms/b/cr;

    move-result-object v2

    iget-object v2, v2, Lcom/google/android/gms/b/cr;->e:Lcom/google/android/gms/b/cr$b;

    invoke-virtual {v2}, Lcom/google/android/gms/b/cr$b;->a()J

    move-result-wide v2

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->d()Lcom/google/android/gms/b/by;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/b/by;->ag()J

    move-result-wide v4

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->o()Lcom/google/android/gms/b/dl;

    move-result-object v6

    invoke-virtual {v6, v2, v3, v4, v5}, Lcom/google/android/gms/b/dl;->a(JJ)Z

    move-result v6

    if-nez v6, :cond_5

    add-long/2addr v2, v4

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    :cond_5
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->y()Lcom/google/android/gms/b/cq;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/cq;->b()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->t()Lcom/google/android/gms/common/util/c;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/common/util/c;->a()J

    move-result-wide v2

    sub-long/2addr v0, v2

    cmp-long v2, v0, v8

    if-gtz v2, :cond_6

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->d()Lcom/google/android/gms/b/by;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/by;->aj()J

    move-result-wide v0

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->e()Lcom/google/android/gms/b/cr;

    move-result-object v2

    iget-object v2, v2, Lcom/google/android/gms/b/cr;->c:Lcom/google/android/gms/b/cr$b;

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->t()Lcom/google/android/gms/common/util/c;

    move-result-object v3

    invoke-interface {v3}, Lcom/google/android/gms/common/util/c;->a()J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Lcom/google/android/gms/b/cr$b;->a(J)V

    :cond_6
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/co;->D()Lcom/google/android/gms/b/co$a;

    move-result-object v2

    const-string v3, "Upload scheduled in approximately ms"

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->z()Lcom/google/android/gms/b/dh;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, Lcom/google/android/gms/b/dh;->a(J)V

    goto/16 :goto_0
.end method

.method private R()J
    .locals 16

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->t()Lcom/google/android/gms/common/util/c;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/c;->a()J

    move-result-wide v2

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->d()Lcom/google/android/gms/b/by;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/by;->am()J

    move-result-wide v6

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/bz;->J()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/bz;->D()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_0
    const/4 v0, 0x1

    move v4, v0

    :goto_0
    if-eqz v4, :cond_3

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->d()Lcom/google/android/gms/b/by;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/by;->ai()J

    move-result-wide v0

    :goto_1
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->e()Lcom/google/android/gms/b/cr;

    move-result-object v5

    iget-object v5, v5, Lcom/google/android/gms/b/cr;->c:Lcom/google/android/gms/b/cr$b;

    invoke-virtual {v5}, Lcom/google/android/gms/b/cr$b;->a()J

    move-result-wide v8

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->e()Lcom/google/android/gms/b/cr;

    move-result-object v5

    iget-object v5, v5, Lcom/google/android/gms/b/cr;->d:Lcom/google/android/gms/b/cr$b;

    invoke-virtual {v5}, Lcom/google/android/gms/b/cr$b;->a()J

    move-result-wide v10

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/b/bz;->G()J

    move-result-wide v12

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/b/bz;->H()J

    move-result-wide v14

    invoke-static {v12, v13, v14, v15}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v12

    const-wide/16 v14, 0x0

    cmp-long v5, v12, v14

    if-nez v5, :cond_4

    const-wide/16 v2, 0x0

    :cond_1
    :goto_2
    return-wide v2

    :cond_2
    const/4 v0, 0x0

    move v4, v0

    goto :goto_0

    :cond_3
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->d()Lcom/google/android/gms/b/by;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/by;->ah()J

    move-result-wide v0

    goto :goto_1

    :cond_4
    sub-long/2addr v12, v2

    invoke-static {v12, v13}, Ljava/lang/Math;->abs(J)J

    move-result-wide v12

    sub-long v12, v2, v12

    sub-long/2addr v8, v2

    invoke-static {v8, v9}, Ljava/lang/Math;->abs(J)J

    move-result-wide v8

    sub-long v8, v2, v8

    sub-long/2addr v10, v2

    invoke-static {v10, v11}, Ljava/lang/Math;->abs(J)J

    move-result-wide v10

    sub-long v10, v2, v10

    invoke-static {v8, v9, v10, v11}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v8

    add-long v2, v12, v6

    if-eqz v4, :cond_5

    const-wide/16 v4, 0x0

    cmp-long v4, v8, v4

    if-lez v4, :cond_5

    invoke-static {v12, v13, v8, v9}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    add-long/2addr v2, v0

    :cond_5
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->o()Lcom/google/android/gms/b/dl;

    move-result-object v4

    invoke-virtual {v4, v8, v9, v0, v1}, Lcom/google/android/gms/b/dl;->a(JJ)Z

    move-result v4

    if-nez v4, :cond_6

    add-long v2, v8, v0

    :cond_6
    const-wide/16 v0, 0x0

    cmp-long v0, v10, v0

    if-eqz v0, :cond_1

    cmp-long v0, v10, v12

    if-ltz v0, :cond_1

    const/4 v0, 0x0

    :goto_3
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->d()Lcom/google/android/gms/b/by;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/b/by;->ao()I

    move-result v1

    if-ge v0, v1, :cond_7

    const/4 v1, 0x1

    shl-int/2addr v1, v0

    int-to-long v4, v1

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->d()Lcom/google/android/gms/b/by;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/b/by;->an()J

    move-result-wide v6

    mul-long/2addr v4, v6

    add-long/2addr v2, v4

    cmp-long v1, v2, v10

    if-gtz v1, :cond_1

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_7
    const-wide/16 v2, 0x0

    goto :goto_2
.end method

.method public static a(Landroid/content/Context;)Lcom/google/android/gms/b/cv;
    .locals 2

    invoke-static {p0}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/b/cv;->a:Lcom/google/android/gms/b/cv;

    if-nez v0, :cond_1

    const-class v1, Lcom/google/android/gms/b/cv;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/android/gms/b/cv;->a:Lcom/google/android/gms/b/cv;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/b/cz;

    invoke-direct {v0, p0}, Lcom/google/android/gms/b/cz;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/google/android/gms/b/cz;->a()Lcom/google/android/gms/b/cv;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/b/cv;->a:Lcom/google/android/gms/b/cv;

    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    sget-object v0, Lcom/google/android/gms/b/cv;->a:Lcom/google/android/gms/b/cv;

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private a(Lcom/google/android/gms/b/cx;)V
    .locals 2

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Component not created"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    return-void
.end method

.method private a(Lcom/google/android/gms/b/cc;)Z
    .locals 11

    const/4 v10, 0x1

    const/4 v5, 0x0

    iget-object v0, p1, Lcom/google/android/gms/b/cc;->f:Lcom/google/android/gms/b/ce;

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return v5

    :cond_1
    iget-object v0, p1, Lcom/google/android/gms/b/cc;->f:Lcom/google/android/gms/b/ce;

    invoke-virtual {v0}, Lcom/google/android/gms/b/ce;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v2, "_r"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    move v5, v10

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->j()Lcom/google/android/gms/b/ct;

    move-result-object v0

    iget-object v1, p1, Lcom/google/android/gms/b/cc;->a:Ljava/lang/String;

    iget-object v2, p1, Lcom/google/android/gms/b/cc;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/b/ct;->c(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->H()J

    move-result-wide v2

    iget-object v4, p1, Lcom/google/android/gms/b/cc;->a:Ljava/lang/String;

    move v6, v5

    move v7, v5

    move v8, v5

    move v9, v5

    invoke-virtual/range {v1 .. v9}, Lcom/google/android/gms/b/bz;->a(JLjava/lang/String;ZZZZZ)Lcom/google/android/gms/b/bz$a;

    move-result-object v1

    if-eqz v0, :cond_0

    iget-wide v0, v1, Lcom/google/android/gms/b/bz$a;->e:J

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->d()Lcom/google/android/gms/b/by;

    move-result-object v2

    iget-object v3, p1, Lcom/google/android/gms/b/cc;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/b/by;->c(Ljava/lang/String;)I

    move-result v2

    int-to-long v2, v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    move v5, v10

    goto :goto_0
.end method

.method private a(Ljava/lang/String;J)Z
    .locals 22

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/bz;->x()V

    :try_start_0
    new-instance v8, Lcom/google/android/gms/b/cv$a;

    const/4 v2, 0x0

    move-object/from16 v0, p0

    invoke-direct {v8, v0, v2}, Lcom/google/android/gms/b/cv$a;-><init>(Lcom/google/android/gms/b/cv;Lcom/google/android/gms/b/cv$1;)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v2

    move-object/from16 v0, p0

    iget-wide v6, v0, Lcom/google/android/gms/b/cv;->H:J

    move-object/from16 v3, p1

    move-wide/from16 v4, p2

    invoke-virtual/range {v2 .. v8}, Lcom/google/android/gms/b/bz;->a(Ljava/lang/String;JJLcom/google/android/gms/b/bz$b;)V

    invoke-virtual {v8}, Lcom/google/android/gms/b/cv$a;->a()Z

    move-result v2

    if-nez v2, :cond_20

    const/4 v5, 0x0

    iget-object v0, v8, Lcom/google/android/gms/b/cv$a;->a:Lcom/google/android/gms/b/do$e;

    move-object/from16 v19, v0

    iget-object v2, v8, Lcom/google/android/gms/b/cv$a;->c:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    new-array v2, v2, [Lcom/google/android/gms/b/do$b;

    move-object/from16 v0, v19

    iput-object v2, v0, Lcom/google/android/gms/b/do$e;->b:[Lcom/google/android/gms/b/do$b;

    const/4 v6, 0x0

    const/4 v2, 0x0

    move/from16 v18, v2

    :goto_0
    iget-object v2, v8, Lcom/google/android/gms/b/cv$a;->c:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    move/from16 v0, v18

    if-ge v0, v2, :cond_13

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->j()Lcom/google/android/gms/b/ct;

    move-result-object v3

    iget-object v2, v8, Lcom/google/android/gms/b/cv$a;->a:Lcom/google/android/gms/b/do$e;

    iget-object v4, v2, Lcom/google/android/gms/b/do$e;->o:Ljava/lang/String;

    iget-object v2, v8, Lcom/google/android/gms/b/cv$a;->c:Ljava/util/List;

    move/from16 v0, v18

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/b/do$b;

    iget-object v2, v2, Lcom/google/android/gms/b/do$b;->b:Ljava/lang/String;

    invoke-virtual {v3, v4, v2}, Lcom/google/android/gms/b/ct;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/co;->z()Lcom/google/android/gms/b/co$a;

    move-result-object v3

    const-string v4, "Dropping blacklisted raw event. appId"

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/b/co;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    iget-object v2, v8, Lcom/google/android/gms/b/cv$a;->c:Ljava/util/List;

    move/from16 v0, v18

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/b/do$b;

    iget-object v2, v2, Lcom/google/android/gms/b/do$b;->b:Ljava/lang/String;

    invoke-virtual {v3, v4, v7, v2}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->o()Lcom/google/android/gms/b/dl;

    move-result-object v2

    iget-object v3, v8, Lcom/google/android/gms/b/cv$a;->a:Lcom/google/android/gms/b/do$e;

    iget-object v3, v3, Lcom/google/android/gms/b/do$e;->o:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/b/dl;->m(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->o()Lcom/google/android/gms/b/dl;

    move-result-object v2

    iget-object v3, v8, Lcom/google/android/gms/b/cv$a;->a:Lcom/google/android/gms/b/do$e;

    iget-object v3, v3, Lcom/google/android/gms/b/do$e;->o:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/b/dl;->n(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    :cond_0
    const/4 v2, 0x1

    :goto_1
    if-nez v2, :cond_26

    const-string v3, "_err"

    iget-object v2, v8, Lcom/google/android/gms/b/cv$a;->c:Ljava/util/List;

    move/from16 v0, v18

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/b/do$b;

    iget-object v2, v2, Lcom/google/android/gms/b/do$b;->b:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_26

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->o()Lcom/google/android/gms/b/dl;

    move-result-object v3

    const/16 v4, 0xb

    const-string v7, "_ev"

    iget-object v2, v8, Lcom/google/android/gms/b/cv$a;->c:Ljava/util/List;

    move/from16 v0, v18

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/b/do$b;

    iget-object v2, v2, Lcom/google/android/gms/b/do$b;->b:Ljava/lang/String;

    const/4 v9, 0x0

    invoke-virtual {v3, v4, v7, v2, v9}, Lcom/google/android/gms/b/dl;->a(ILjava/lang/String;Ljava/lang/String;I)V

    move v2, v6

    move v3, v5

    :goto_2
    add-int/lit8 v4, v18, 0x1

    move/from16 v18, v4

    move v6, v2

    move v5, v3

    goto/16 :goto_0

    :cond_1
    const/4 v2, 0x0

    goto :goto_1

    :cond_2
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->j()Lcom/google/android/gms/b/ct;

    move-result-object v3

    iget-object v2, v8, Lcom/google/android/gms/b/cv$a;->a:Lcom/google/android/gms/b/do$e;

    iget-object v4, v2, Lcom/google/android/gms/b/do$e;->o:Ljava/lang/String;

    iget-object v2, v8, Lcom/google/android/gms/b/cv$a;->c:Ljava/util/List;

    move/from16 v0, v18

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/b/do$b;

    iget-object v2, v2, Lcom/google/android/gms/b/do$b;->b:Ljava/lang/String;

    invoke-virtual {v3, v4, v2}, Lcom/google/android/gms/b/ct;->c(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_25

    const/4 v3, 0x0

    const/4 v4, 0x0

    iget-object v2, v8, Lcom/google/android/gms/b/cv$a;->c:Ljava/util/List;

    move/from16 v0, v18

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/b/do$b;

    iget-object v2, v2, Lcom/google/android/gms/b/do$b;->a:[Lcom/google/android/gms/b/do$c;

    if-nez v2, :cond_3

    iget-object v2, v8, Lcom/google/android/gms/b/cv$a;->c:Ljava/util/List;

    move/from16 v0, v18

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/b/do$b;

    const/4 v7, 0x0

    new-array v7, v7, [Lcom/google/android/gms/b/do$c;

    iput-object v7, v2, Lcom/google/android/gms/b/do$b;->a:[Lcom/google/android/gms/b/do$c;

    :cond_3
    iget-object v2, v8, Lcom/google/android/gms/b/cv$a;->c:Ljava/util/List;

    move/from16 v0, v18

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/b/do$b;

    iget-object v9, v2, Lcom/google/android/gms/b/do$b;->a:[Lcom/google/android/gms/b/do$c;

    array-length v10, v9

    const/4 v2, 0x0

    move v7, v2

    :goto_3
    if-ge v7, v10, :cond_5

    aget-object v2, v9, v7

    const-string v11, "_c"

    iget-object v12, v2, Lcom/google/android/gms/b/do$c;->a:Ljava/lang/String;

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_4

    const-wide/16 v12, 0x1

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    iput-object v3, v2, Lcom/google/android/gms/b/do$c;->c:Ljava/lang/Long;

    const/4 v2, 0x1

    move v3, v2

    move v2, v4

    :goto_4
    add-int/lit8 v4, v7, 0x1

    move v7, v4

    move v4, v2

    goto :goto_3

    :cond_4
    const-string v11, "_r"

    iget-object v12, v2, Lcom/google/android/gms/b/do$c;->a:Ljava/lang/String;

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_24

    const-wide/16 v12, 0x1

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    iput-object v4, v2, Lcom/google/android/gms/b/do$c;->c:Ljava/lang/Long;

    const/4 v2, 0x1

    goto :goto_4

    :cond_5
    if-nez v3, :cond_6

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/co;->D()Lcom/google/android/gms/b/co$a;

    move-result-object v3

    const-string v7, "Marking event as conversion"

    iget-object v2, v8, Lcom/google/android/gms/b/cv$a;->c:Ljava/util/List;

    move/from16 v0, v18

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/b/do$b;

    iget-object v2, v2, Lcom/google/android/gms/b/do$b;->b:Ljava/lang/String;

    invoke-virtual {v3, v7, v2}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v2, v8, Lcom/google/android/gms/b/cv$a;->c:Ljava/util/List;

    move/from16 v0, v18

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/b/do$b;

    iget-object v3, v2, Lcom/google/android/gms/b/do$b;->a:[Lcom/google/android/gms/b/do$c;

    iget-object v2, v8, Lcom/google/android/gms/b/cv$a;->c:Ljava/util/List;

    move/from16 v0, v18

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/b/do$b;

    iget-object v2, v2, Lcom/google/android/gms/b/do$b;->a:[Lcom/google/android/gms/b/do$c;

    array-length v2, v2

    add-int/lit8 v2, v2, 0x1

    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Lcom/google/android/gms/b/do$c;

    new-instance v3, Lcom/google/android/gms/b/do$c;

    invoke-direct {v3}, Lcom/google/android/gms/b/do$c;-><init>()V

    const-string v7, "_c"

    iput-object v7, v3, Lcom/google/android/gms/b/do$c;->a:Ljava/lang/String;

    const-wide/16 v10, 0x1

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    iput-object v7, v3, Lcom/google/android/gms/b/do$c;->c:Ljava/lang/Long;

    array-length v7, v2

    add-int/lit8 v7, v7, -0x1

    aput-object v3, v2, v7

    iget-object v3, v8, Lcom/google/android/gms/b/cv$a;->c:Ljava/util/List;

    move/from16 v0, v18

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/b/do$b;

    iput-object v2, v3, Lcom/google/android/gms/b/do$b;->a:[Lcom/google/android/gms/b/do$c;

    :cond_6
    if-nez v4, :cond_7

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/co;->D()Lcom/google/android/gms/b/co$a;

    move-result-object v3

    const-string v4, "Marking event as real-time"

    iget-object v2, v8, Lcom/google/android/gms/b/cv$a;->c:Ljava/util/List;

    move/from16 v0, v18

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/b/do$b;

    iget-object v2, v2, Lcom/google/android/gms/b/do$b;->b:Ljava/lang/String;

    invoke-virtual {v3, v4, v2}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v2, v8, Lcom/google/android/gms/b/cv$a;->c:Ljava/util/List;

    move/from16 v0, v18

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/b/do$b;

    iget-object v3, v2, Lcom/google/android/gms/b/do$b;->a:[Lcom/google/android/gms/b/do$c;

    iget-object v2, v8, Lcom/google/android/gms/b/cv$a;->c:Ljava/util/List;

    move/from16 v0, v18

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/b/do$b;

    iget-object v2, v2, Lcom/google/android/gms/b/do$b;->a:[Lcom/google/android/gms/b/do$c;

    array-length v2, v2

    add-int/lit8 v2, v2, 0x1

    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Lcom/google/android/gms/b/do$c;

    new-instance v3, Lcom/google/android/gms/b/do$c;

    invoke-direct {v3}, Lcom/google/android/gms/b/do$c;-><init>()V

    const-string v4, "_r"

    iput-object v4, v3, Lcom/google/android/gms/b/do$c;->a:Ljava/lang/String;

    const-wide/16 v10, 0x1

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    iput-object v4, v3, Lcom/google/android/gms/b/do$c;->c:Ljava/lang/Long;

    array-length v4, v2

    add-int/lit8 v4, v4, -0x1

    aput-object v3, v2, v4

    iget-object v3, v8, Lcom/google/android/gms/b/cv$a;->c:Ljava/util/List;

    move/from16 v0, v18

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/b/do$b;

    iput-object v2, v3, Lcom/google/android/gms/b/do$b;->a:[Lcom/google/android/gms/b/do$c;

    :cond_7
    const/4 v7, 0x1

    iget-object v2, v8, Lcom/google/android/gms/b/cv$a;->c:Ljava/util/List;

    move/from16 v0, v18

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/b/do$b;

    iget-object v2, v2, Lcom/google/android/gms/b/do$b;->b:Ljava/lang/String;

    invoke-static {v2}, Lcom/google/android/gms/b/dl;->a(Ljava/lang/String;)Z

    move-result v4

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->H()J

    move-result-wide v10

    iget-object v2, v8, Lcom/google/android/gms/b/cv$a;->a:Lcom/google/android/gms/b/do$e;

    iget-object v12, v2, Lcom/google/android/gms/b/do$e;->o:Ljava/lang/String;

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x1

    invoke-virtual/range {v9 .. v17}, Lcom/google/android/gms/b/bz;->a(JLjava/lang/String;ZZZZZ)Lcom/google/android/gms/b/bz$a;

    move-result-object v2

    iget-wide v2, v2, Lcom/google/android/gms/b/bz$a;->e:J

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->d()Lcom/google/android/gms/b/by;

    move-result-object v9

    iget-object v10, v8, Lcom/google/android/gms/b/cv$a;->a:Lcom/google/android/gms/b/do$e;

    iget-object v10, v10, Lcom/google/android/gms/b/do$e;->o:Ljava/lang/String;

    invoke-virtual {v9, v10}, Lcom/google/android/gms/b/by;->c(Ljava/lang/String;)I

    move-result v9

    int-to-long v10, v9

    cmp-long v2, v2, v10

    if-lez v2, :cond_b

    iget-object v2, v8, Lcom/google/android/gms/b/cv$a;->c:Ljava/util/List;

    move/from16 v0, v18

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/b/do$b;

    const/4 v3, 0x0

    :goto_5
    iget-object v7, v2, Lcom/google/android/gms/b/do$b;->a:[Lcom/google/android/gms/b/do$c;

    array-length v7, v7

    if-ge v3, v7, :cond_a

    const-string v7, "_r"

    iget-object v9, v2, Lcom/google/android/gms/b/do$b;->a:[Lcom/google/android/gms/b/do$c;

    aget-object v9, v9, v3

    iget-object v9, v9, Lcom/google/android/gms/b/do$c;->a:Ljava/lang/String;

    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_c

    iget-object v7, v2, Lcom/google/android/gms/b/do$b;->a:[Lcom/google/android/gms/b/do$c;

    array-length v7, v7

    add-int/lit8 v7, v7, -0x1

    new-array v7, v7, [Lcom/google/android/gms/b/do$c;

    if-lez v3, :cond_8

    iget-object v9, v2, Lcom/google/android/gms/b/do$b;->a:[Lcom/google/android/gms/b/do$c;

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static {v9, v10, v7, v11, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_8
    array-length v9, v7

    if-ge v3, v9, :cond_9

    iget-object v9, v2, Lcom/google/android/gms/b/do$b;->a:[Lcom/google/android/gms/b/do$c;

    add-int/lit8 v10, v3, 0x1

    array-length v11, v7

    sub-int/2addr v11, v3

    invoke-static {v9, v10, v7, v3, v11}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_9
    iput-object v7, v2, Lcom/google/android/gms/b/do$b;->a:[Lcom/google/android/gms/b/do$c;

    :cond_a
    move v7, v5

    :cond_b
    if-eqz v4, :cond_12

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->H()J

    move-result-wide v10

    iget-object v2, v8, Lcom/google/android/gms/b/cv$a;->a:Lcom/google/android/gms/b/do$e;

    iget-object v12, v2, Lcom/google/android/gms/b/do$e;->o:Ljava/lang/String;

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x1

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-virtual/range {v9 .. v17}, Lcom/google/android/gms/b/bz;->a(JLjava/lang/String;ZZZZZ)Lcom/google/android/gms/b/bz$a;

    move-result-object v2

    iget-wide v2, v2, Lcom/google/android/gms/b/bz$a;->c:J

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->d()Lcom/google/android/gms/b/by;

    move-result-object v4

    iget-object v5, v8, Lcom/google/android/gms/b/cv$a;->a:Lcom/google/android/gms/b/do$e;

    iget-object v5, v5, Lcom/google/android/gms/b/do$e;->o:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lcom/google/android/gms/b/by;->b(Ljava/lang/String;)I

    move-result v4

    int-to-long v4, v4

    cmp-long v2, v2, v4

    if-lez v2, :cond_12

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/co;->z()Lcom/google/android/gms/b/co$a;

    move-result-object v2

    const-string v3, "Too many conversions. Not logging as conversion. appId"

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/b/co;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v2, v8, Lcom/google/android/gms/b/cv$a;->c:Ljava/util/List;

    move/from16 v0, v18

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/b/do$b;

    const/4 v5, 0x0

    const/4 v4, 0x0

    iget-object v10, v2, Lcom/google/android/gms/b/do$b;->a:[Lcom/google/android/gms/b/do$c;

    array-length v11, v10

    const/4 v3, 0x0

    move v9, v3

    :goto_6
    if-ge v9, v11, :cond_e

    aget-object v3, v10, v9

    const-string v12, "_c"

    iget-object v13, v3, Lcom/google/android/gms/b/do$c;->a:Ljava/lang/String;

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_d

    move v4, v5

    :goto_7
    add-int/lit8 v5, v9, 0x1

    move v9, v5

    move v5, v4

    move-object v4, v3

    goto :goto_6

    :cond_c
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_5

    :cond_d
    const-string v12, "_err"

    iget-object v3, v3, Lcom/google/android/gms/b/do$c;->a:Ljava/lang/String;

    invoke-virtual {v12, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_23

    const/4 v3, 0x1

    move-object/from16 v20, v4

    move v4, v3

    move-object/from16 v3, v20

    goto :goto_7

    :cond_e
    if-eqz v5, :cond_10

    if-eqz v4, :cond_10

    iget-object v3, v2, Lcom/google/android/gms/b/do$b;->a:[Lcom/google/android/gms/b/do$c;

    array-length v3, v3

    add-int/lit8 v3, v3, -0x1

    new-array v10, v3, [Lcom/google/android/gms/b/do$c;

    const/4 v5, 0x0

    iget-object v11, v2, Lcom/google/android/gms/b/do$b;->a:[Lcom/google/android/gms/b/do$c;

    array-length v12, v11

    const/4 v3, 0x0

    move v9, v3

    :goto_8
    if-ge v9, v12, :cond_f

    aget-object v13, v11, v9

    if-eq v13, v4, :cond_22

    add-int/lit8 v3, v5, 0x1

    aput-object v13, v10, v5

    :goto_9
    add-int/lit8 v5, v9, 0x1

    move v9, v5

    move v5, v3

    goto :goto_8

    :cond_f
    iput-object v10, v2, Lcom/google/android/gms/b/do$b;->a:[Lcom/google/android/gms/b/do$c;

    move v4, v7

    :goto_a
    move-object/from16 v0, v19

    iget-object v5, v0, Lcom/google/android/gms/b/do$e;->b:[Lcom/google/android/gms/b/do$b;

    add-int/lit8 v3, v6, 0x1

    iget-object v2, v8, Lcom/google/android/gms/b/cv$a;->c:Ljava/util/List;

    move/from16 v0, v18

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/b/do$b;

    aput-object v2, v5, v6

    move v2, v3

    move v3, v4

    goto/16 :goto_2

    :cond_10
    if-eqz v4, :cond_11

    const-string v2, "_err"

    iput-object v2, v4, Lcom/google/android/gms/b/do$c;->a:Ljava/lang/String;

    const-wide/16 v2, 0xa

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    iput-object v2, v4, Lcom/google/android/gms/b/do$c;->c:Ljava/lang/Long;

    move v4, v7

    goto :goto_a

    :cond_11
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/co;->x()Lcom/google/android/gms/b/co$a;

    move-result-object v2

    const-string v3, "Did not find conversion parameter. appId"

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/b/co;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_12
    move v4, v7

    goto :goto_a

    :cond_13
    iget-object v2, v8, Lcom/google/android/gms/b/cv$a;->c:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v6, v2, :cond_14

    move-object/from16 v0, v19

    iget-object v2, v0, Lcom/google/android/gms/b/do$e;->b:[Lcom/google/android/gms/b/do$b;

    invoke-static {v2, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Lcom/google/android/gms/b/do$b;

    move-object/from16 v0, v19

    iput-object v2, v0, Lcom/google/android/gms/b/do$e;->b:[Lcom/google/android/gms/b/do$b;

    :cond_14
    iget-object v2, v8, Lcom/google/android/gms/b/cv$a;->a:Lcom/google/android/gms/b/do$e;

    iget-object v2, v2, Lcom/google/android/gms/b/do$e;->o:Ljava/lang/String;

    iget-object v3, v8, Lcom/google/android/gms/b/cv$a;->a:Lcom/google/android/gms/b/do$e;

    iget-object v3, v3, Lcom/google/android/gms/b/do$e;->c:[Lcom/google/android/gms/b/do$g;

    move-object/from16 v0, v19

    iget-object v4, v0, Lcom/google/android/gms/b/do$e;->b:[Lcom/google/android/gms/b/do$b;

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v3, v4}, Lcom/google/android/gms/b/cv;->a(Ljava/lang/String;[Lcom/google/android/gms/b/do$g;[Lcom/google/android/gms/b/do$b;)[Lcom/google/android/gms/b/do$a;

    move-result-object v2

    move-object/from16 v0, v19

    iput-object v2, v0, Lcom/google/android/gms/b/do$e;->A:[Lcom/google/android/gms/b/do$a;

    const-wide v2, 0x7fffffffffffffffL

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    move-object/from16 v0, v19

    iput-object v2, v0, Lcom/google/android/gms/b/do$e;->e:Ljava/lang/Long;

    const-wide/high16 v2, -0x8000000000000000L

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    move-object/from16 v0, v19

    iput-object v2, v0, Lcom/google/android/gms/b/do$e;->f:Ljava/lang/Long;

    const/4 v2, 0x0

    :goto_b
    move-object/from16 v0, v19

    iget-object v3, v0, Lcom/google/android/gms/b/do$e;->b:[Lcom/google/android/gms/b/do$b;

    array-length v3, v3

    if-ge v2, v3, :cond_17

    move-object/from16 v0, v19

    iget-object v3, v0, Lcom/google/android/gms/b/do$e;->b:[Lcom/google/android/gms/b/do$b;

    aget-object v3, v3, v2

    iget-object v4, v3, Lcom/google/android/gms/b/do$b;->c:Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    move-object/from16 v0, v19

    iget-object v4, v0, Lcom/google/android/gms/b/do$e;->e:Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    cmp-long v4, v6, v10

    if-gez v4, :cond_15

    iget-object v4, v3, Lcom/google/android/gms/b/do$b;->c:Ljava/lang/Long;

    move-object/from16 v0, v19

    iput-object v4, v0, Lcom/google/android/gms/b/do$e;->e:Ljava/lang/Long;

    :cond_15
    iget-object v4, v3, Lcom/google/android/gms/b/do$b;->c:Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    move-object/from16 v0, v19

    iget-object v4, v0, Lcom/google/android/gms/b/do$e;->f:Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    cmp-long v4, v6, v10

    if-lez v4, :cond_16

    iget-object v3, v3, Lcom/google/android/gms/b/do$b;->c:Ljava/lang/Long;

    move-object/from16 v0, v19

    iput-object v3, v0, Lcom/google/android/gms/b/do$e;->f:Ljava/lang/Long;

    :cond_16
    add-int/lit8 v2, v2, 0x1

    goto :goto_b

    :cond_17
    iget-object v2, v8, Lcom/google/android/gms/b/cv$a;->a:Lcom/google/android/gms/b/do$e;

    iget-object v9, v2, Lcom/google/android/gms/b/do$e;->o:Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v2

    invoke-virtual {v2, v9}, Lcom/google/android/gms/b/bz;->b(Ljava/lang/String;)Lcom/google/android/gms/b/bu;

    move-result-object v10

    if-nez v10, :cond_1b

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/co;->x()Lcom/google/android/gms/b/co$a;

    move-result-object v2

    const-string v3, "Bundling raw events w/o app info. appId"

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/b/co;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_18
    :goto_c
    move-object/from16 v0, v19

    iget-object v2, v0, Lcom/google/android/gms/b/do$e;->b:[Lcom/google/android/gms/b/do$b;

    array-length v2, v2

    if-lez v2, :cond_1a

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->d()Lcom/google/android/gms/b/by;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/by;->R()Z

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->j()Lcom/google/android/gms/b/ct;

    move-result-object v2

    iget-object v3, v8, Lcom/google/android/gms/b/cv$a;->a:Lcom/google/android/gms/b/do$e;

    iget-object v3, v3, Lcom/google/android/gms/b/do$e;->o:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/b/ct;->a(Ljava/lang/String;)Lcom/google/android/gms/b/dn$b;

    move-result-object v2

    if-eqz v2, :cond_19

    iget-object v3, v2, Lcom/google/android/gms/b/dn$b;->a:Ljava/lang/Long;

    if-nez v3, :cond_1e

    :cond_19
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/co;->z()Lcom/google/android/gms/b/co$a;

    move-result-object v2

    const-string v3, "Did not find measurement config or missing version info. appId"

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/b/co;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_d
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v2

    move-object/from16 v0, v19

    invoke-virtual {v2, v0, v5}, Lcom/google/android/gms/b/bz;->a(Lcom/google/android/gms/b/do$e;Z)V

    :cond_1a
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v2

    iget-object v3, v8, Lcom/google/android/gms/b/cv$a;->b:Ljava/util/List;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/b/bz;->a(Ljava/util/List;)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v2

    invoke-virtual {v2, v9}, Lcom/google/android/gms/b/bz;->i(Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/bz;->y()V

    move-object/from16 v0, v19

    iget-object v2, v0, Lcom/google/android/gms/b/do$e;->b:[Lcom/google/android/gms/b/do$b;

    array-length v2, v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-lez v2, :cond_1f

    const/4 v2, 0x1

    :goto_e
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/b/bz;->z()V

    :goto_f
    return v2

    :cond_1b
    :try_start_1
    move-object/from16 v0, v19

    iget-object v2, v0, Lcom/google/android/gms/b/do$e;->b:[Lcom/google/android/gms/b/do$b;

    array-length v2, v2

    if-lez v2, :cond_18

    invoke-virtual {v10}, Lcom/google/android/gms/b/bu;->h()J

    move-result-wide v2

    const-wide/16 v6, 0x0

    cmp-long v4, v2, v6

    if-eqz v4, :cond_1c

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    :goto_10
    move-object/from16 v0, v19

    iput-object v4, v0, Lcom/google/android/gms/b/do$e;->h:Ljava/lang/Long;

    invoke-virtual {v10}, Lcom/google/android/gms/b/bu;->g()J

    move-result-wide v6

    const-wide/16 v12, 0x0

    cmp-long v4, v6, v12

    if-nez v4, :cond_21

    :goto_11
    const-wide/16 v6, 0x0

    cmp-long v4, v2, v6

    if-eqz v4, :cond_1d

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    :goto_12
    move-object/from16 v0, v19

    iput-object v2, v0, Lcom/google/android/gms/b/do$e;->g:Ljava/lang/Long;

    invoke-virtual {v10}, Lcom/google/android/gms/b/bu;->r()V

    invoke-virtual {v10}, Lcom/google/android/gms/b/bu;->o()J

    move-result-wide v2

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object/from16 v0, v19

    iput-object v2, v0, Lcom/google/android/gms/b/do$e;->w:Ljava/lang/Integer;

    move-object/from16 v0, v19

    iget-object v2, v0, Lcom/google/android/gms/b/do$e;->e:Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {v10, v2, v3}, Lcom/google/android/gms/b/bu;->a(J)V

    move-object/from16 v0, v19

    iget-object v2, v0, Lcom/google/android/gms/b/do$e;->f:Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {v10, v2, v3}, Lcom/google/android/gms/b/bu;->b(J)V

    invoke-virtual {v10}, Lcom/google/android/gms/b/bu;->z()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, v19

    iput-object v2, v0, Lcom/google/android/gms/b/do$e;->x:Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v2

    invoke-virtual {v2, v10}, Lcom/google/android/gms/b/bz;->a(Lcom/google/android/gms/b/bu;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_c

    :catchall_0
    move-exception v2

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/b/bz;->z()V

    throw v2

    :cond_1c
    const/4 v4, 0x0

    goto :goto_10

    :cond_1d
    const/4 v2, 0x0

    goto :goto_12

    :cond_1e
    :try_start_2
    iget-object v2, v2, Lcom/google/android/gms/b/dn$b;->a:Ljava/lang/Long;

    move-object/from16 v0, v19

    iput-object v2, v0, Lcom/google/android/gms/b/do$e;->G:Ljava/lang/Long;

    goto/16 :goto_d

    :cond_1f
    const/4 v2, 0x0

    goto/16 :goto_e

    :cond_20
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/bz;->y()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/bz;->z()V

    const/4 v2, 0x0

    goto/16 :goto_f

    :cond_21
    move-wide v2, v6

    goto :goto_11

    :cond_22
    move v3, v5

    goto/16 :goto_9

    :cond_23
    move-object v3, v4

    move v4, v5

    goto/16 :goto_7

    :cond_24
    move v2, v4

    goto/16 :goto_4

    :cond_25
    move v4, v5

    goto/16 :goto_a

    :cond_26
    move v2, v6

    move v3, v5

    goto/16 :goto_2
.end method

.method private a(Ljava/lang/String;[Lcom/google/android/gms/b/do$g;[Lcom/google/android/gms/b/do$b;)[Lcom/google/android/gms/b/do$a;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->A()Lcom/google/android/gms/b/bx;

    move-result-object v0

    invoke-virtual {v0, p1, p3, p2}, Lcom/google/android/gms/b/bx;->a(Ljava/lang/String;[Lcom/google/android/gms/b/do$b;[Lcom/google/android/gms/b/do$g;)[Lcom/google/android/gms/b/do$a;

    move-result-object v0

    return-object v0
.end method

.method private b(Lcom/google/android/gms/b/cy;)V
    .locals 2

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Component not created"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/b/cy;->P()Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Component not initialized"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return-void
.end method

.method private c(Lcom/google/android/gms/b/bv;)V
    .locals 8

    const/4 v1, 0x1

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->C()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->a()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lcom/google/android/gms/b/bv;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v0

    iget-object v2, p1, Lcom/google/android/gms/b/bv;->b:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/b/bz;->b(Ljava/lang/String;)Lcom/google/android/gms/b/bu;

    move-result-object v2

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->e()Lcom/google/android/gms/b/cr;

    move-result-object v0

    iget-object v3, p1, Lcom/google/android/gms/b/bv;->b:Ljava/lang/String;

    invoke-virtual {v0, v3}, Lcom/google/android/gms/b/cr;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v0, 0x0

    if-nez v2, :cond_b

    new-instance v0, Lcom/google/android/gms/b/bu;

    iget-object v2, p1, Lcom/google/android/gms/b/bv;->b:Ljava/lang/String;

    invoke-direct {v0, p0, v2}, Lcom/google/android/gms/b/bu;-><init>(Lcom/google/android/gms/b/cv;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->e()Lcom/google/android/gms/b/cr;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/cr;->x()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/b/bu;->a(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Lcom/google/android/gms/b/bu;->c(Ljava/lang/String;)V

    move-object v2, v0

    move v0, v1

    :cond_0
    :goto_0
    iget-object v3, p1, Lcom/google/android/gms/b/bv;->c:Ljava/lang/String;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1

    iget-object v3, p1, Lcom/google/android/gms/b/bv;->c:Ljava/lang/String;

    invoke-virtual {v2}, Lcom/google/android/gms/b/bu;->d()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    iget-object v0, p1, Lcom/google/android/gms/b/bv;->c:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/b/bu;->b(Ljava/lang/String;)V

    move v0, v1

    :cond_1
    iget-object v3, p1, Lcom/google/android/gms/b/bv;->l:Ljava/lang/String;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_2

    iget-object v3, p1, Lcom/google/android/gms/b/bv;->l:Ljava/lang/String;

    invoke-virtual {v2}, Lcom/google/android/gms/b/bu;->f()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    iget-object v0, p1, Lcom/google/android/gms/b/bv;->l:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/b/bu;->d(Ljava/lang/String;)V

    move v0, v1

    :cond_2
    iget-wide v4, p1, Lcom/google/android/gms/b/bv;->f:J

    const-wide/16 v6, 0x0

    cmp-long v3, v4, v6

    if-eqz v3, :cond_3

    iget-wide v4, p1, Lcom/google/android/gms/b/bv;->f:J

    invoke-virtual {v2}, Lcom/google/android/gms/b/bu;->l()J

    move-result-wide v6

    cmp-long v3, v4, v6

    if-eqz v3, :cond_3

    iget-wide v4, p1, Lcom/google/android/gms/b/bv;->f:J

    invoke-virtual {v2, v4, v5}, Lcom/google/android/gms/b/bu;->d(J)V

    move v0, v1

    :cond_3
    iget-object v3, p1, Lcom/google/android/gms/b/bv;->d:Ljava/lang/String;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_4

    iget-object v3, p1, Lcom/google/android/gms/b/bv;->d:Ljava/lang/String;

    invoke-virtual {v2}, Lcom/google/android/gms/b/bu;->i()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    iget-object v0, p1, Lcom/google/android/gms/b/bv;->d:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/b/bu;->e(Ljava/lang/String;)V

    move v0, v1

    :cond_4
    iget-wide v4, p1, Lcom/google/android/gms/b/bv;->k:J

    invoke-virtual {v2}, Lcom/google/android/gms/b/bu;->j()J

    move-result-wide v6

    cmp-long v3, v4, v6

    if-eqz v3, :cond_5

    iget-wide v4, p1, Lcom/google/android/gms/b/bv;->k:J

    invoke-virtual {v2, v4, v5}, Lcom/google/android/gms/b/bu;->c(J)V

    move v0, v1

    :cond_5
    iget-object v3, p1, Lcom/google/android/gms/b/bv;->e:Ljava/lang/String;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_6

    iget-object v3, p1, Lcom/google/android/gms/b/bv;->e:Ljava/lang/String;

    invoke-virtual {v2}, Lcom/google/android/gms/b/bu;->k()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    iget-object v0, p1, Lcom/google/android/gms/b/bv;->e:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/b/bu;->f(Ljava/lang/String;)V

    move v0, v1

    :cond_6
    iget-wide v4, p1, Lcom/google/android/gms/b/bv;->g:J

    invoke-virtual {v2}, Lcom/google/android/gms/b/bu;->m()J

    move-result-wide v6

    cmp-long v3, v4, v6

    if-eqz v3, :cond_7

    iget-wide v4, p1, Lcom/google/android/gms/b/bv;->g:J

    invoke-virtual {v2, v4, v5}, Lcom/google/android/gms/b/bu;->e(J)V

    move v0, v1

    :cond_7
    iget-boolean v3, p1, Lcom/google/android/gms/b/bv;->i:Z

    invoke-virtual {v2}, Lcom/google/android/gms/b/bu;->n()Z

    move-result v4

    if-eq v3, v4, :cond_8

    iget-boolean v0, p1, Lcom/google/android/gms/b/bv;->i:Z

    invoke-virtual {v2, v0}, Lcom/google/android/gms/b/bu;->a(Z)V

    move v0, v1

    :cond_8
    iget-object v3, p1, Lcom/google/android/gms/b/bv;->h:Ljava/lang/String;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_9

    iget-object v3, p1, Lcom/google/android/gms/b/bv;->h:Ljava/lang/String;

    invoke-virtual {v2}, Lcom/google/android/gms/b/bu;->y()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_9

    iget-object v0, p1, Lcom/google/android/gms/b/bv;->h:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/b/bu;->g(Ljava/lang/String;)V

    move v0, v1

    :cond_9
    if-eqz v0, :cond_a

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/google/android/gms/b/bz;->a(Lcom/google/android/gms/b/bu;)V

    :cond_a
    return-void

    :cond_b
    invoke-virtual {v2}, Lcom/google/android/gms/b/bu;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-virtual {v2, v3}, Lcom/google/android/gms/b/bu;->c(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->e()Lcom/google/android/gms/b/cr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/cr;->x()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/google/android/gms/b/bu;->a(Ljava/lang/String;)V

    move v0, v1

    goto/16 :goto_0
.end method


# virtual methods
.method public A()Lcom/google/android/gms/b/bx;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/cv;->w:Lcom/google/android/gms/b/bx;

    invoke-direct {p0, v0}, Lcom/google/android/gms/b/cv;->b(Lcom/google/android/gms/b/cy;)V

    iget-object v0, p0, Lcom/google/android/gms/b/cv;->w:Lcom/google/android/gms/b/bx;

    return-object v0
.end method

.method public B()Lcom/google/android/gms/b/bt;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/cv;->x:Lcom/google/android/gms/b/bt;

    invoke-direct {p0, v0}, Lcom/google/android/gms/b/cv;->a(Lcom/google/android/gms/b/cx;)V

    iget-object v0, p0, Lcom/google/android/gms/b/cv;->x:Lcom/google/android/gms/b/bt;

    return-object v0
.end method

.method public C()V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->h()Lcom/google/android/gms/b/cu;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/cu;->e()V

    return-void
.end method

.method D()Ljava/nio/channels/FileChannel;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/cv;->D:Ljava/nio/channels/FileChannel;

    return-object v0
.end method

.method E()V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->C()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->a()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->O()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->F()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->D()Ljava/nio/channels/FileChannel;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/b/cv;->a(Ljava/nio/channels/FileChannel;)I

    move-result v0

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->x()Lcom/google/android/gms/b/cl;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/b/cl;->A()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/b/cv;->a(II)Z

    :cond_0
    return-void
.end method

.method F()Z
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->C()V

    iget-object v0, p0, Lcom/google/android/gms/b/cv;->l:Lcom/google/android/gms/b/bz;

    invoke-virtual {v0}, Lcom/google/android/gms/b/bz;->B()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->s()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    :try_start_0
    new-instance v0, Ljava/io/RandomAccessFile;

    const-string v1, "rw"

    invoke-direct {v0, v2, v1}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/cv;->D:Ljava/nio/channels/FileChannel;

    iget-object v0, p0, Lcom/google/android/gms/b/cv;->D:Ljava/nio/channels/FileChannel;

    invoke-virtual {v0}, Ljava/nio/channels/FileChannel;->tryLock()Ljava/nio/channels/FileLock;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/cv;->C:Ljava/nio/channels/FileLock;

    iget-object v0, p0, Lcom/google/android/gms/b/cv;->C:Ljava/nio/channels/FileLock;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->D()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v1, "Storage concurrent access okay"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;)V

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->x()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v1, "Storage concurrent data access panic"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    :goto_1
    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/b/co;->x()Lcom/google/android/gms/b/co$a;

    move-result-object v1

    const-string v2, "Failed to acquire storage lock"

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1

    :catch_1
    move-exception v0

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/b/co;->x()Lcom/google/android/gms/b/co$a;

    move-result-object v1

    const-string v2, "Failed to access storage lock file"

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1
.end method

.method public G()Z
    .locals 2

    const/4 v0, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->C()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->a()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->d()Lcom/google/android/gms/b/by;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/b/by;->T()Z

    move-result v1

    if-eqz v1, :cond_0

    :goto_0
    return v0

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->d()Lcom/google/android/gms/b/by;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/b/by;->U()Ljava/lang/Boolean;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    :cond_1
    :goto_1
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->e()Lcom/google/android/gms/b/cr;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/b/cr;->c(Z)Z

    move-result v0

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->d()Lcom/google/android/gms/b/by;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/b/by;->V()Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v0, 0x1

    goto :goto_1
.end method

.method H()J
    .locals 6

    const-wide/16 v4, 0x3c

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->t()Lcom/google/android/gms/common/util/c;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/c;->a()J

    move-result-wide v0

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->e()Lcom/google/android/gms/b/cr;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/cr;->z()J

    move-result-wide v2

    add-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    div-long/2addr v0, v4

    div-long/2addr v0, v4

    const-wide/16 v2, 0x18

    div-long/2addr v0, v2

    return-wide v0
.end method

.method I()V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->d()Lcom/google/android/gms/b/by;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/by;->R()Z

    return-void
.end method

.method J()V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->d()Lcom/google/android/gms/b/by;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/by;->R()Z

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unexpected call on client side"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected K()Z
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->C()V

    iget-object v0, p0, Lcom/google/android/gms/b/cv;->E:Ljava/util/List;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public L()V
    .locals 12

    const-wide/16 v10, -0x1

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->C()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->a()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->d()Lcom/google/android/gms/b/by;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/by;->R()Z

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->e()Lcom/google/android/gms/b/cr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/cr;->B()Ljava/lang/Boolean;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->z()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v1, "Upload data called on the client side before use of service was decided"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->x()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v1, "Upload called in the client side when service should be used"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->K()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->z()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v1, "Uploading requested multiple times"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->r()Lcom/google/android/gms/b/cp;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/cp;->x()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->z()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v1, "Network not connected, ignoring upload request"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/google/android/gms/b/cv;->Q()V

    goto :goto_0

    :cond_4
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->t()Lcom/google/android/gms/common/util/c;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/c;->a()J

    move-result-wide v8

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->d()Lcom/google/android/gms/b/by;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/by;->af()J

    move-result-wide v0

    sub-long v0, v8, v0

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/b/cv;->a(J)Z

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->e()Lcom/google/android/gms/b/cr;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/b/cr;->c:Lcom/google/android/gms/b/cr$b;

    invoke-virtual {v0}, Lcom/google/android/gms/b/cr$b;->a()J

    move-result-wide v0

    const-wide/16 v6, 0x0

    cmp-long v2, v0, v6

    if-eqz v2, :cond_5

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/co;->C()Lcom/google/android/gms/b/co$a;

    move-result-object v2

    const-string v4, "Uploading events. Elapsed time since last upload attempt (ms)"

    sub-long v0, v8, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v2, v4, v0}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_5
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/bz;->C()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_c

    iget-wide v6, p0, Lcom/google/android/gms/b/cv;->H:J

    cmp-long v0, v6, v10

    if-nez v0, :cond_6

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/bz;->K()J

    move-result-wide v6

    iput-wide v6, p0, Lcom/google/android/gms/b/cv;->H:J

    :cond_6
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->d()Lcom/google/android/gms/b/by;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/by;->h(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->d()Lcom/google/android/gms/b/by;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/b/by;->i(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v4

    invoke-virtual {v4, v1, v0, v2}, Lcom/google/android/gms/b/bz;->a(Ljava/lang/String;II)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Pair;

    iget-object v0, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/b/do$e;

    iget-object v6, v0, Lcom/google/android/gms/b/do$e;->s:Ljava/lang/String;

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_7

    iget-object v0, v0, Lcom/google/android/gms/b/do$e;->s:Ljava/lang/String;

    move-object v6, v0

    :goto_1
    if-eqz v6, :cond_e

    move v2, v3

    :goto_2
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_e

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Pair;

    iget-object v0, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/b/do$e;

    iget-object v7, v0, Lcom/google/android/gms/b/do$e;->s:Ljava/lang/String;

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_9

    :cond_8
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_2

    :cond_9
    iget-object v0, v0, Lcom/google/android/gms/b/do$e;->s:Ljava/lang/String;

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    invoke-interface {v4, v3, v2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    move-object v2, v0

    :goto_3
    new-instance v6, Lcom/google/android/gms/b/do$d;

    invoke-direct {v6}, Lcom/google/android/gms/b/do$d;-><init>()V

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Lcom/google/android/gms/b/do$e;

    iput-object v0, v6, Lcom/google/android/gms/b/do$d;->a:[Lcom/google/android/gms/b/do$e;

    new-instance v4, Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {v4, v0}, Ljava/util/ArrayList;-><init>(I)V

    :goto_4
    iget-object v0, v6, Lcom/google/android/gms/b/do$d;->a:[Lcom/google/android/gms/b/do$e;

    array-length v0, v0

    if-ge v3, v0, :cond_a

    iget-object v7, v6, Lcom/google/android/gms/b/do$d;->a:[Lcom/google/android/gms/b/do$e;

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Pair;

    iget-object v0, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/b/do$e;

    aput-object v0, v7, v3

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Pair;

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, v6, Lcom/google/android/gms/b/do$d;->a:[Lcom/google/android/gms/b/do$e;

    aget-object v0, v0, v3

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->d()Lcom/google/android/gms/b/by;

    move-result-object v7

    invoke-virtual {v7}, Lcom/google/android/gms/b/by;->Q()J

    move-result-wide v10

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    iput-object v7, v0, Lcom/google/android/gms/b/do$e;->r:Ljava/lang/Long;

    iget-object v0, v6, Lcom/google/android/gms/b/do$d;->a:[Lcom/google/android/gms/b/do$e;

    aget-object v0, v0, v3

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    iput-object v7, v0, Lcom/google/android/gms/b/do$e;->d:Ljava/lang/Long;

    iget-object v0, v6, Lcom/google/android/gms/b/do$d;->a:[Lcom/google/android/gms/b/do$e;

    aget-object v0, v0, v3

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->d()Lcom/google/android/gms/b/by;

    move-result-object v7

    invoke-virtual {v7}, Lcom/google/android/gms/b/by;->R()Z

    move-result v7

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    iput-object v7, v0, Lcom/google/android/gms/b/do$e;->z:Ljava/lang/Boolean;

    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_a
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v0

    const/4 v2, 0x2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/b/co;->a(I)Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-static {v6}, Lcom/google/android/gms/b/dl;->b(Lcom/google/android/gms/b/do$d;)Ljava/lang/String;

    move-result-object v0

    :goto_5
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->o()Lcom/google/android/gms/b/dl;

    move-result-object v2

    invoke-virtual {v2, v6}, Lcom/google/android/gms/b/dl;->a(Lcom/google/android/gms/b/do$d;)[B

    move-result-object v3

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->d()Lcom/google/android/gms/b/by;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/by;->ae()Ljava/lang/String;

    move-result-object v7

    :try_start_0
    new-instance v2, Ljava/net/URL;

    invoke-direct {v2, v7}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v4}, Lcom/google/android/gms/b/cv;->a(Ljava/util/List;)V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->e()Lcom/google/android/gms/b/cr;

    move-result-object v4

    iget-object v4, v4, Lcom/google/android/gms/b/cr;->d:Lcom/google/android/gms/b/cr$b;

    invoke-virtual {v4, v8, v9}, Lcom/google/android/gms/b/cr$b;->a(J)V

    const-string v4, "?"

    iget-object v5, v6, Lcom/google/android/gms/b/do$d;->a:[Lcom/google/android/gms/b/do$e;

    array-length v5, v5

    if-lez v5, :cond_b

    iget-object v4, v6, Lcom/google/android/gms/b/do$d;->a:[Lcom/google/android/gms/b/do$e;

    const/4 v5, 0x0

    aget-object v4, v4, v5

    iget-object v4, v4, Lcom/google/android/gms/b/do$e;->o:Ljava/lang/String;

    :cond_b
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/b/co;->D()Lcom/google/android/gms/b/co$a;

    move-result-object v5

    const-string v6, "Uploading data. app, uncompressed size, data"

    array-length v8, v3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v5, v6, v4, v8, v0}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->r()Lcom/google/android/gms/b/cp;

    move-result-object v0

    const/4 v4, 0x0

    new-instance v5, Lcom/google/android/gms/b/cv$4;

    invoke-direct {v5, p0}, Lcom/google/android/gms/b/cv$4;-><init>(Lcom/google/android/gms/b/cv;)V

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/b/cp;->a(Ljava/lang/String;Ljava/net/URL;[BLjava/util/Map;Lcom/google/android/gms/b/cp$a;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->x()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v2, "Failed to parse upload URL. Not uploading. appId"

    invoke-static {v1}, Lcom/google/android/gms/b/co;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v2, v1, v7}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_c
    iput-wide v10, p0, Lcom/google/android/gms/b/cv;->H:J

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->d()Lcom/google/android/gms/b/by;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/b/by;->af()J

    move-result-wide v2

    sub-long v2, v8, v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/b/bz;->b(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/b/bz;->b(Ljava/lang/String;)Lcom/google/android/gms/b/bu;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/b/cv;->a(Lcom/google/android/gms/b/bu;)V

    goto/16 :goto_0

    :cond_d
    move-object v0, v5

    goto/16 :goto_5

    :cond_e
    move-object v2, v4

    goto/16 :goto_3

    :cond_f
    move-object v6, v5

    goto/16 :goto_1
.end method

.method M()V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/b/cv;->G:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/b/cv;->G:I

    return-void
.end method

.method N()V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->C()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->a()V

    iget-boolean v0, p0, Lcom/google/android/gms/b/cv;->z:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->B()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v1, "This instance being marked as an uploader"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->E()V

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/b/cv;->z:Z

    return-void
.end method

.method O()Z
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->C()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->a()V

    iget-boolean v0, p0, Lcom/google/android/gms/b/cv;->z:Z

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method a(Ljava/nio/channels/FileChannel;)I
    .locals 5

    const/4 v4, 0x4

    const/4 v0, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->C()V

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/nio/channels/FileChannel;->isOpen()Z

    move-result v1

    if-nez v1, :cond_2

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/b/co;->x()Lcom/google/android/gms/b/co$a;

    move-result-object v1

    const-string v2, "Bad chanel to read from"

    invoke-virtual {v1, v2}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return v0

    :cond_2
    invoke-static {v4}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    const-wide/16 v2, 0x0

    :try_start_0
    invoke-virtual {p1, v2, v3}, Ljava/nio/channels/FileChannel;->position(J)Ljava/nio/channels/FileChannel;

    invoke-virtual {p1, v1}, Ljava/nio/channels/FileChannel;->read(Ljava/nio/ByteBuffer;)I

    move-result v2

    if-eq v2, v4, :cond_3

    const/4 v1, -0x1

    if-eq v2, v1, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/b/co;->z()Lcom/google/android/gms/b/co$a;

    move-result-object v1

    const-string v3, "Unexpected data length. Bytes read"

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/co;->x()Lcom/google/android/gms/b/co$a;

    move-result-object v2

    const-string v3, "Failed to read from channel"

    invoke-virtual {v2, v3, v1}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    :try_start_1
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    move-result v0

    goto :goto_0
.end method

.method public a(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->h()Lcom/google/android/gms/b/cu;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/b/cv$2;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/b/cv$2;-><init>(Lcom/google/android/gms/b/cv;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/cu;->a(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0

    const-wide/16 v2, 0x7530

    :try_start_0
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v2, v3, v1}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    :goto_1
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/b/co;->x()Lcom/google/android/gms/b/co$a;

    move-result-object v1

    const-string v2, "Failed to get app instance id. appId"

    invoke-static {p1}, Lcom/google/android/gms/b/co;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v2, v3, v0}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_1

    :catch_2
    move-exception v0

    goto :goto_1
.end method

.method a()V
    .locals 2

    iget-boolean v0, p0, Lcom/google/android/gms/b/cv;->y:Z

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "AppMeasurement is not initialized"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    return-void
.end method

.method protected a(ILjava/lang/Throwable;[B)V
    .locals 6

    const/4 v0, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->C()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->a()V

    if-nez p3, :cond_0

    new-array p3, v0, [B

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/b/cv;->E:Ljava/util/List;

    const/4 v2, 0x0

    iput-object v2, p0, Lcom/google/android/gms/b/cv;->E:Ljava/util/List;

    const/16 v2, 0xc8

    if-eq p1, v2, :cond_1

    const/16 v2, 0xcc

    if-ne p1, v2, :cond_4

    :cond_1
    if-nez p2, :cond_4

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->e()Lcom/google/android/gms/b/cr;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/b/cr;->c:Lcom/google/android/gms/b/cr$b;

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->t()Lcom/google/android/gms/common/util/c;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/common/util/c;->a()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/b/cr$b;->a(J)V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->e()Lcom/google/android/gms/b/cr;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/b/cr;->d:Lcom/google/android/gms/b/cr$b;

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/b/cr$b;->a(J)V

    invoke-direct {p0}, Lcom/google/android/gms/b/cv;->Q()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->D()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v2, "Successful upload. Got network response. code, size"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    array-length v4, p3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v2, v3, v4}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/bz;->x()V

    :try_start_0
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Lcom/google/android/gms/b/bz;->a(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/b/bz;->z()V

    throw v0

    :cond_2
    :try_start_1
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/bz;->y()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/bz;->z()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->r()Lcom/google/android/gms/b/cp;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/cp;->x()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-direct {p0}, Lcom/google/android/gms/b/cv;->P()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->L()V

    :goto_1
    return-void

    :cond_3
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/google/android/gms/b/cv;->H:J

    invoke-direct {p0}, Lcom/google/android/gms/b/cv;->Q()V

    goto :goto_1

    :cond_4
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/b/co;->D()Lcom/google/android/gms/b/co$a;

    move-result-object v1

    const-string v2, "Network upload failed. Will retry later. code, error"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3, p2}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->e()Lcom/google/android/gms/b/cr;

    move-result-object v1

    iget-object v1, v1, Lcom/google/android/gms/b/cr;->d:Lcom/google/android/gms/b/cr$b;

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->t()Lcom/google/android/gms/common/util/c;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/common/util/c;->a()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/b/cr$b;->a(J)V

    const/16 v1, 0x1f7

    if-eq p1, v1, :cond_5

    const/16 v1, 0x1ad

    if-ne p1, v1, :cond_6

    :cond_5
    const/4 v0, 0x1

    :cond_6
    if-eqz v0, :cond_7

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->e()Lcom/google/android/gms/b/cr;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/b/cr;->e:Lcom/google/android/gms/b/cr$b;

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->t()Lcom/google/android/gms/common/util/c;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/common/util/c;->a()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/b/cr$b;->a(J)V

    :cond_7
    invoke-direct {p0}, Lcom/google/android/gms/b/cv;->Q()V

    goto :goto_1
.end method

.method a(Lcom/google/android/gms/b/bu;)V
    .locals 6

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->d()Lcom/google/android/gms/b/by;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/b/bu;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/b/bu;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/b/by;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :try_start_0
    new-instance v2, Ljava/net/URL;

    invoke-direct {v2, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->D()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v3, "Fetching remote configuration"

    invoke-virtual {p1}, Lcom/google/android/gms/b/bu;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->j()Lcom/google/android/gms/b/ct;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/b/bu;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/google/android/gms/b/ct;->a(Ljava/lang/String;)Lcom/google/android/gms/b/dn$b;

    move-result-object v3

    const/4 v0, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->j()Lcom/google/android/gms/b/ct;

    move-result-object v4

    invoke-virtual {p1}, Lcom/google/android/gms/b/bu;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/google/android/gms/b/ct;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v3, :cond_0

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_0

    new-instance v0, Landroid/support/v4/i/a;

    invoke-direct {v0}, Landroid/support/v4/i/a;-><init>()V

    const-string v3, "If-Modified-Since"

    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->r()Lcom/google/android/gms/b/cp;

    move-result-object v3

    invoke-virtual {p1}, Lcom/google/android/gms/b/bu;->b()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lcom/google/android/gms/b/cv$5;

    invoke-direct {v5, p0}, Lcom/google/android/gms/b/cv$5;-><init>(Lcom/google/android/gms/b/cv;)V

    invoke-virtual {v3, v4, v2, v0, v5}, Lcom/google/android/gms/b/cp;->a(Ljava/lang/String;Ljava/net/URL;Ljava/util/Map;Lcom/google/android/gms/b/cp$a;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->x()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v2, "Failed to parse config URL. Not fetching. appId"

    invoke-virtual {p1}, Lcom/google/android/gms/b/bu;->b()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/google/android/gms/b/co;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v2, v3, v1}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0
.end method

.method a(Lcom/google/android/gms/b/bv;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->C()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->a()V

    iget-object v0, p1, Lcom/google/android/gms/b/bv;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/String;)Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/google/android/gms/b/cv;->c(Lcom/google/android/gms/b/bv;)V

    return-void
.end method

.method a(Lcom/google/android/gms/b/bv;J)V
    .locals 6

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v0

    iget-object v1, p1, Lcom/google/android/gms/b/bv;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/bz;->b(Ljava/lang/String;)Lcom/google/android/gms/b/bu;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/b/bu;->d()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/b/bu;->d()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p1, Lcom/google/android/gms/b/bv;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/b/co;->z()Lcom/google/android/gms/b/co$a;

    move-result-object v1

    const-string v2, "New GMP App Id passed in. Removing cached database data. appId"

    invoke-virtual {v0}, Lcom/google/android/gms/b/bu;->b()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/google/android/gms/b/co;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/android/gms/b/bu;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/b/bz;->g(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/b/bu;->i()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/b/bu;->i()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p1, Lcom/google/android/gms/b/bv;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    const-string v1, "_pv"

    invoke-virtual {v0}, Lcom/google/android/gms/b/bu;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/b/ch;

    const-string v1, "_au"

    new-instance v2, Lcom/google/android/gms/b/ce;

    invoke-direct {v2, v3}, Lcom/google/android/gms/b/ce;-><init>(Landroid/os/Bundle;)V

    const-string v3, "auto"

    move-wide v4, p2

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/b/ch;-><init>(Ljava/lang/String;Lcom/google/android/gms/b/ce;Ljava/lang/String;J)V

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/b/cv;->a(Lcom/google/android/gms/b/ch;Lcom/google/android/gms/b/bv;)V

    :cond_1
    return-void
.end method

.method a(Lcom/google/android/gms/b/cc;Lcom/google/android/gms/b/bv;)V
    .locals 8

    const-wide/16 v6, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->C()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->a()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lcom/google/android/gms/b/cc;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p1, Lcom/google/android/gms/b/cc;->a:Ljava/lang/String;

    iget-object v2, p2, Lcom/google/android/gms/b/bv;->b:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/common/internal/c;->b(Z)V

    new-instance v2, Lcom/google/android/gms/b/do$e;

    invoke-direct {v2}, Lcom/google/android/gms/b/do$e;-><init>()V

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, v2, Lcom/google/android/gms/b/do$e;->a:Ljava/lang/Integer;

    const-string v0, "android"

    iput-object v0, v2, Lcom/google/android/gms/b/do$e;->i:Ljava/lang/String;

    iget-object v0, p2, Lcom/google/android/gms/b/bv;->b:Ljava/lang/String;

    iput-object v0, v2, Lcom/google/android/gms/b/do$e;->o:Ljava/lang/String;

    iget-object v0, p2, Lcom/google/android/gms/b/bv;->e:Ljava/lang/String;

    iput-object v0, v2, Lcom/google/android/gms/b/do$e;->n:Ljava/lang/String;

    iget-object v0, p2, Lcom/google/android/gms/b/bv;->d:Ljava/lang/String;

    iput-object v0, v2, Lcom/google/android/gms/b/do$e;->p:Ljava/lang/String;

    iget-wide v4, p2, Lcom/google/android/gms/b/bv;->k:J

    long-to-int v0, v4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, v2, Lcom/google/android/gms/b/do$e;->C:Ljava/lang/Integer;

    iget-wide v4, p2, Lcom/google/android/gms/b/bv;->f:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, v2, Lcom/google/android/gms/b/do$e;->q:Ljava/lang/Long;

    iget-object v0, p2, Lcom/google/android/gms/b/bv;->c:Ljava/lang/String;

    iput-object v0, v2, Lcom/google/android/gms/b/do$e;->y:Ljava/lang/String;

    iget-wide v4, p2, Lcom/google/android/gms/b/bv;->g:J

    cmp-long v0, v4, v6

    if-nez v0, :cond_2

    move-object v0, v1

    :goto_0
    iput-object v0, v2, Lcom/google/android/gms/b/do$e;->v:Ljava/lang/Long;

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->e()Lcom/google/android/gms/b/cr;

    move-result-object v0

    iget-object v3, p2, Lcom/google/android/gms/b/bv;->b:Ljava/lang/String;

    invoke-virtual {v0, v3}, Lcom/google/android/gms/b/cr;->a(Ljava/lang/String;)Landroid/util/Pair;

    move-result-object v3

    iget-object v0, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iput-object v0, v2, Lcom/google/android/gms/b/do$e;->s:Ljava/lang/String;

    iget-object v0, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Boolean;

    iput-object v0, v2, Lcom/google/android/gms/b/do$e;->t:Ljava/lang/Boolean;

    :cond_0
    :goto_1
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->w()Lcom/google/android/gms/b/cb;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/cb;->x()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Lcom/google/android/gms/b/do$e;->k:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->w()Lcom/google/android/gms/b/cb;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/cb;->y()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Lcom/google/android/gms/b/do$e;->j:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->w()Lcom/google/android/gms/b/cb;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/cb;->z()J

    move-result-wide v4

    long-to-int v0, v4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, v2, Lcom/google/android/gms/b/do$e;->m:Ljava/lang/Integer;

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->w()Lcom/google/android/gms/b/cb;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/cb;->A()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Lcom/google/android/gms/b/do$e;->l:Ljava/lang/String;

    iput-object v1, v2, Lcom/google/android/gms/b/do$e;->r:Ljava/lang/Long;

    iput-object v1, v2, Lcom/google/android/gms/b/do$e;->d:Ljava/lang/Long;

    iput-object v1, v2, Lcom/google/android/gms/b/do$e;->e:Ljava/lang/Long;

    iput-object v1, v2, Lcom/google/android/gms/b/do$e;->f:Ljava/lang/Long;

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v0

    iget-object v1, p2, Lcom/google/android/gms/b/bv;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/bz;->b(Ljava/lang/String;)Lcom/google/android/gms/b/bu;

    move-result-object v0

    if-nez v0, :cond_1

    new-instance v0, Lcom/google/android/gms/b/bu;

    iget-object v1, p2, Lcom/google/android/gms/b/bv;->b:Ljava/lang/String;

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/b/bu;-><init>(Lcom/google/android/gms/b/cv;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->e()Lcom/google/android/gms/b/cr;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/b/cr;->x()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/bu;->a(Ljava/lang/String;)V

    iget-object v1, p2, Lcom/google/android/gms/b/bv;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/bu;->d(Ljava/lang/String;)V

    iget-object v1, p2, Lcom/google/android/gms/b/bv;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/bu;->b(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->e()Lcom/google/android/gms/b/cr;

    move-result-object v1

    iget-object v3, p2, Lcom/google/android/gms/b/bv;->b:Ljava/lang/String;

    invoke-virtual {v1, v3}, Lcom/google/android/gms/b/cr;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/bu;->c(Ljava/lang/String;)V

    invoke-virtual {v0, v6, v7}, Lcom/google/android/gms/b/bu;->f(J)V

    invoke-virtual {v0, v6, v7}, Lcom/google/android/gms/b/bu;->a(J)V

    invoke-virtual {v0, v6, v7}, Lcom/google/android/gms/b/bu;->b(J)V

    iget-object v1, p2, Lcom/google/android/gms/b/bv;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/bu;->e(Ljava/lang/String;)V

    iget-wide v4, p2, Lcom/google/android/gms/b/bv;->k:J

    invoke-virtual {v0, v4, v5}, Lcom/google/android/gms/b/bu;->c(J)V

    iget-object v1, p2, Lcom/google/android/gms/b/bv;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/bu;->f(Ljava/lang/String;)V

    iget-wide v4, p2, Lcom/google/android/gms/b/bv;->f:J

    invoke-virtual {v0, v4, v5}, Lcom/google/android/gms/b/bu;->d(J)V

    iget-wide v4, p2, Lcom/google/android/gms/b/bv;->g:J

    invoke-virtual {v0, v4, v5}, Lcom/google/android/gms/b/bu;->e(J)V

    iget-boolean v1, p2, Lcom/google/android/gms/b/bv;->i:Z

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/bu;->a(Z)V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/b/bz;->a(Lcom/google/android/gms/b/bu;)V

    :cond_1
    invoke-virtual {v0}, Lcom/google/android/gms/b/bu;->c()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v2, Lcom/google/android/gms/b/do$e;->u:Ljava/lang/String;

    invoke-virtual {v0}, Lcom/google/android/gms/b/bu;->f()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Lcom/google/android/gms/b/do$e;->B:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v0

    iget-object v1, p2, Lcom/google/android/gms/b/bv;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/bz;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Lcom/google/android/gms/b/do$g;

    iput-object v0, v2, Lcom/google/android/gms/b/do$e;->c:[Lcom/google/android/gms/b/do$g;

    const/4 v0, 0x0

    move v1, v0

    :goto_2
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_6

    new-instance v4, Lcom/google/android/gms/b/do$g;

    invoke-direct {v4}, Lcom/google/android/gms/b/do$g;-><init>()V

    iget-object v0, v2, Lcom/google/android/gms/b/do$e;->c:[Lcom/google/android/gms/b/do$g;

    aput-object v4, v0, v1

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/dk;

    iget-object v0, v0, Lcom/google/android/gms/b/dk;->b:Ljava/lang/String;

    iput-object v0, v4, Lcom/google/android/gms/b/do$g;->b:Ljava/lang/String;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/dk;

    iget-wide v6, v0, Lcom/google/android/gms/b/dk;->c:J

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, v4, Lcom/google/android/gms/b/do$g;->a:Ljava/lang/Long;

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->o()Lcom/google/android/gms/b/dl;

    move-result-object v5

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/dk;

    iget-object v0, v0, Lcom/google/android/gms/b/dk;->d:Ljava/lang/Object;

    invoke-virtual {v5, v4, v0}, Lcom/google/android/gms/b/dl;->a(Lcom/google/android/gms/b/do$g;Ljava/lang/Object;)V

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_2

    :cond_2
    iget-wide v4, p2, Lcom/google/android/gms/b/bv;->g:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto/16 :goto_0

    :cond_3
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->w()Lcom/google/android/gms/b/cb;

    move-result-object v0

    iget-object v3, p0, Lcom/google/android/gms/b/cv;->b:Landroid/content/Context;

    invoke-virtual {v0, v3}, Lcom/google/android/gms/b/cb;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/cv;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v3, "android_id"

    invoke-static {v0, v3}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_5

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->z()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v3, "null secure ID. appId"

    iget-object v4, v2, Lcom/google/android/gms/b/do$e;->o:Ljava/lang/String;

    invoke-static {v4}, Lcom/google/android/gms/b/co;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "null"

    :cond_4
    :goto_3
    iput-object v0, v2, Lcom/google/android/gms/b/do$e;->F:Ljava/lang/String;

    goto/16 :goto_1

    :cond_5
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/b/co;->z()Lcom/google/android/gms/b/co$a;

    move-result-object v3

    const-string v4, "empty secure ID. appId"

    iget-object v5, v2, Lcom/google/android/gms/b/do$e;->o:Ljava/lang/String;

    invoke-static {v5}, Lcom/google/android/gms/b/co;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_3

    :cond_6
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/google/android/gms/b/bz;->a(Lcom/google/android/gms/b/do$e;)J
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v2

    invoke-direct {p0, p1}, Lcom/google/android/gms/b/cv;->a(Lcom/google/android/gms/b/cc;)Z

    move-result v3

    invoke-virtual {v2, p1, v0, v1, v3}, Lcom/google/android/gms/b/bz;->a(Lcom/google/android/gms/b/cc;JZ)V

    :goto_4
    return-void

    :catch_0
    move-exception v0

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/b/co;->x()Lcom/google/android/gms/b/co$a;

    move-result-object v1

    const-string v3, "Data loss. Failed to insert raw event metadata. appId"

    iget-object v2, v2, Lcom/google/android/gms/b/do$e;->o:Ljava/lang/String;

    invoke-static {v2}, Lcom/google/android/gms/b/co;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v3, v2, v0}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_4
.end method

.method a(Lcom/google/android/gms/b/ch;Lcom/google/android/gms/b/bv;)V
    .locals 18

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v16

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->C()V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->a()V

    move-object/from16 v0, p2

    iget-object v4, v0, Lcom/google/android/gms/b/bv;->b:Ljava/lang/String;

    invoke-static {v4}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/String;)Ljava/lang/String;

    invoke-static/range {p1 .. p2}, Lcom/google/android/gms/b/dl;->a(Lcom/google/android/gms/b/ch;Lcom/google/android/gms/b/bv;)Z

    move-result v2

    if-nez v2, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    move-object/from16 v0, p2

    iget-boolean v2, v0, Lcom/google/android/gms/b/bv;->i:Z

    if-nez v2, :cond_2

    const-string v2, "_in"

    move-object/from16 v0, p1

    iget-object v3, v0, Lcom/google/android/gms/b/ch;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct {v0, v1}, Lcom/google/android/gms/b/cv;->c(Lcom/google/android/gms/b/bv;)V

    goto :goto_0

    :cond_2
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->j()Lcom/google/android/gms/b/ct;

    move-result-object v2

    move-object/from16 v0, p1

    iget-object v3, v0, Lcom/google/android/gms/b/ch;->b:Ljava/lang/String;

    invoke-virtual {v2, v4, v3}, Lcom/google/android/gms/b/ct;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/co;->z()Lcom/google/android/gms/b/co$a;

    move-result-object v2

    const-string v3, "Dropping blacklisted event. appId"

    invoke-static {v4}, Lcom/google/android/gms/b/co;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v0, p1

    iget-object v6, v0, Lcom/google/android/gms/b/ch;->b:Ljava/lang/String;

    invoke-virtual {v2, v3, v5, v6}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->o()Lcom/google/android/gms/b/dl;

    move-result-object v2

    invoke-virtual {v2, v4}, Lcom/google/android/gms/b/dl;->m(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_3

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->o()Lcom/google/android/gms/b/dl;

    move-result-object v2

    invoke-virtual {v2, v4}, Lcom/google/android/gms/b/dl;->n(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    :cond_3
    const/4 v2, 0x1

    :goto_1
    if-nez v2, :cond_4

    const-string v3, "_err"

    move-object/from16 v0, p1

    iget-object v5, v0, Lcom/google/android/gms/b/ch;->b:Ljava/lang/String;

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->o()Lcom/google/android/gms/b/dl;

    move-result-object v3

    const/16 v5, 0xb

    const-string v6, "_ev"

    move-object/from16 v0, p1

    iget-object v7, v0, Lcom/google/android/gms/b/ch;->b:Ljava/lang/String;

    const/4 v8, 0x0

    invoke-virtual {v3, v5, v6, v7, v8}, Lcom/google/android/gms/b/dl;->a(ILjava/lang/String;Ljava/lang/String;I)V

    :cond_4
    if-eqz v2, :cond_0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v2

    invoke-virtual {v2, v4}, Lcom/google/android/gms/b/bz;->b(Ljava/lang/String;)Lcom/google/android/gms/b/bu;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/google/android/gms/b/bu;->q()J

    move-result-wide v4

    invoke-virtual {v2}, Lcom/google/android/gms/b/bu;->p()J

    move-result-wide v6

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->t()Lcom/google/android/gms/common/util/c;

    move-result-object v3

    invoke-interface {v3}, Lcom/google/android/gms/common/util/c;->a()J

    move-result-wide v6

    sub-long v4, v6, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->abs(J)J

    move-result-wide v4

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->d()Lcom/google/android/gms/b/by;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/b/by;->Y()J

    move-result-wide v6

    cmp-long v3, v4, v6

    if-lez v3, :cond_0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/b/co;->C()Lcom/google/android/gms/b/co$a;

    move-result-object v3

    const-string v4, "Fetching config for blacklisted app"

    invoke-virtual {v3, v4}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;)V

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/google/android/gms/b/cv;->a(Lcom/google/android/gms/b/bu;)V

    goto/16 :goto_0

    :cond_5
    const/4 v2, 0x0

    goto :goto_1

    :cond_6
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v2

    const/4 v3, 0x2

    invoke-virtual {v2, v3}, Lcom/google/android/gms/b/co;->a(I)Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/co;->D()Lcom/google/android/gms/b/co$a;

    move-result-object v2

    const-string v3, "Logging event"

    move-object/from16 v0, p1

    invoke-virtual {v2, v3, v0}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_7
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/bz;->x()V

    :try_start_0
    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/google/android/gms/b/ch;->c:Lcom/google/android/gms/b/ce;

    invoke-virtual {v2}, Lcom/google/android/gms/b/ce;->b()Landroid/os/Bundle;

    move-result-object v14

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct {v0, v1}, Lcom/google/android/gms/b/cv;->c(Lcom/google/android/gms/b/bv;)V

    const-string v2, "_iap"

    move-object/from16 v0, p1

    iget-object v3, v0, Lcom/google/android/gms/b/ch;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    const-string v2, "ecommerce_purchase"

    move-object/from16 v0, p1

    iget-object v3, v0, Lcom/google/android/gms/b/ch;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    :cond_8
    const-string v2, "currency"

    invoke-virtual {v14, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v2, "ecommerce_purchase"

    move-object/from16 v0, p1

    iget-object v3, v0, Lcom/google/android/gms/b/ch;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_e

    const-string v2, "value"

    invoke-virtual {v14, v2}, Landroid/os/Bundle;->getDouble(Ljava/lang/String;)D

    move-result-wide v2

    const-wide v6, 0x412e848000000000L    # 1000000.0

    mul-double/2addr v2, v6

    const-wide/16 v6, 0x0

    cmpl-double v6, v2, v6

    if-nez v6, :cond_9

    const-string v2, "value"

    invoke-virtual {v14, v2}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v2

    long-to-double v2, v2

    const-wide v6, 0x412e848000000000L    # 1000000.0

    mul-double/2addr v2, v6

    :cond_9
    const-wide/high16 v6, 0x43e0000000000000L    # 9.223372036854776E18

    cmpg-double v6, v2, v6

    if-gtz v6, :cond_d

    const-wide/high16 v6, -0x3c20000000000000L    # -9.223372036854776E18

    cmpl-double v6, v2, v6

    if-ltz v6, :cond_d

    invoke-static {v2, v3}, Ljava/lang/Math;->round(D)J

    move-result-wide v2

    move-wide v8, v2

    :goto_2
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_b

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v5, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "[A-Z]{3}"

    invoke-virtual {v2, v3}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_b

    const-string v3, "_ltv_"

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    if-eqz v5, :cond_f

    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    :goto_3
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v2

    invoke-virtual {v2, v4, v5}, Lcom/google/android/gms/b/bz;->c(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/b/dk;

    move-result-object v2

    if-eqz v2, :cond_a

    iget-object v3, v2, Lcom/google/android/gms/b/dk;->d:Ljava/lang/Object;

    instance-of v3, v3, Ljava/lang/Long;

    if-nez v3, :cond_10

    :cond_a
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->d()Lcom/google/android/gms/b/by;

    move-result-object v3

    invoke-virtual {v3, v4}, Lcom/google/android/gms/b/by;->e(Ljava/lang/String;)I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    invoke-virtual {v2, v4, v3}, Lcom/google/android/gms/b/bz;->a(Ljava/lang/String;I)V

    new-instance v3, Lcom/google/android/gms/b/dk;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->t()Lcom/google/android/gms/common/util/c;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/common/util/c;->a()J

    move-result-wide v6

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-direct/range {v3 .. v8}, Lcom/google/android/gms/b/dk;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    :goto_4
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v2

    invoke-virtual {v2, v3}, Lcom/google/android/gms/b/bz;->a(Lcom/google/android/gms/b/dk;)Z

    move-result v2

    if-nez v2, :cond_b

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/co;->x()Lcom/google/android/gms/b/co$a;

    move-result-object v2

    const-string v5, "Too many unique user properties are set. Ignoring user property. appId"

    invoke-static {v4}, Lcom/google/android/gms/b/co;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    iget-object v7, v3, Lcom/google/android/gms/b/dk;->b:Ljava/lang/String;

    iget-object v3, v3, Lcom/google/android/gms/b/dk;->d:Ljava/lang/Object;

    invoke-virtual {v2, v5, v6, v7, v3}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->o()Lcom/google/android/gms/b/dl;

    move-result-object v2

    const/16 v3, 0x9

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual {v2, v3, v5, v6, v7}, Lcom/google/android/gms/b/dl;->a(ILjava/lang/String;Ljava/lang/String;I)V

    :cond_b
    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/google/android/gms/b/ch;->b:Ljava/lang/String;

    invoke-static {v2}, Lcom/google/android/gms/b/dl;->a(Ljava/lang/String;)Z

    move-result v10

    const-string v2, "_err"

    move-object/from16 v0, p1

    iget-object v3, v0, Lcom/google/android/gms/b/ch;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->H()J

    move-result-wide v6

    const/4 v9, 0x1

    const/4 v11, 0x0

    const/4 v13, 0x0

    move-object v8, v4

    invoke-virtual/range {v5 .. v13}, Lcom/google/android/gms/b/bz;->a(JLjava/lang/String;ZZZZZ)Lcom/google/android/gms/b/bz$a;

    move-result-object v2

    iget-wide v6, v2, Lcom/google/android/gms/b/bz$a;->b:J

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->d()Lcom/google/android/gms/b/by;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/b/by;->G()J

    move-result-wide v8

    sub-long/2addr v6, v8

    const-wide/16 v8, 0x0

    cmp-long v3, v6, v8

    if-lez v3, :cond_11

    const-wide/16 v8, 0x3e8

    rem-long/2addr v6, v8

    const-wide/16 v8, 0x1

    cmp-long v3, v6, v8

    if-nez v3, :cond_c

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/b/co;->x()Lcom/google/android/gms/b/co$a;

    move-result-object v3

    const-string v5, "Data loss. Too many events logged. appId, count"

    invoke-static {v4}, Lcom/google/android/gms/b/co;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    iget-wide v6, v2, Lcom/google/android/gms/b/bz$a;->b:J

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v3, v5, v4, v2}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_c
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->o()Lcom/google/android/gms/b/dl;

    move-result-object v2

    const/16 v3, 0x10

    const-string v4, "_ev"

    move-object/from16 v0, p1

    iget-object v5, v0, Lcom/google/android/gms/b/ch;->b:Ljava/lang/String;

    const/4 v6, 0x0

    invoke-virtual {v2, v3, v4, v5, v6}, Lcom/google/android/gms/b/dl;->a(ILjava/lang/String;Ljava/lang/String;I)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/bz;->y()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/bz;->z()V

    goto/16 :goto_0

    :cond_d
    :try_start_1
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/b/co;->z()Lcom/google/android/gms/b/co$a;

    move-result-object v5

    const-string v6, "Data lost. Currency value is too big. appId"

    invoke-static {v4}, Lcom/google/android/gms/b/co;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v5, v6, v4, v2}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/bz;->y()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/bz;->z()V

    goto/16 :goto_0

    :cond_e
    :try_start_2
    const-string v2, "value"

    invoke-virtual {v14, v2}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v2

    move-wide v8, v2

    goto/16 :goto_2

    :cond_f
    new-instance v5, Ljava/lang/String;

    invoke-direct {v5, v3}, Ljava/lang/String;-><init>(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto/16 :goto_3

    :catchall_0
    move-exception v2

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/b/bz;->z()V

    throw v2

    :cond_10
    :try_start_3
    iget-object v2, v2, Lcom/google/android/gms/b/dk;->d:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    new-instance v3, Lcom/google/android/gms/b/dk;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->t()Lcom/google/android/gms/common/util/c;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/common/util/c;->a()J

    move-result-wide v6

    add-long/2addr v8, v10

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-direct/range {v3 .. v8}, Lcom/google/android/gms/b/dk;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    goto/16 :goto_4

    :cond_11
    if-eqz v10, :cond_13

    iget-wide v6, v2, Lcom/google/android/gms/b/bz$a;->a:J

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->d()Lcom/google/android/gms/b/by;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/b/by;->H()J

    move-result-wide v8

    sub-long/2addr v6, v8

    const-wide/16 v8, 0x0

    cmp-long v3, v6, v8

    if-lez v3, :cond_13

    const-wide/16 v8, 0x3e8

    rem-long/2addr v6, v8

    const-wide/16 v8, 0x1

    cmp-long v3, v6, v8

    if-nez v3, :cond_12

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/b/co;->x()Lcom/google/android/gms/b/co$a;

    move-result-object v3

    const-string v5, "Data loss. Too many public events logged. appId, count"

    invoke-static {v4}, Lcom/google/android/gms/b/co;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    iget-wide v6, v2, Lcom/google/android/gms/b/bz$a;->a:J

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v3, v5, v4, v2}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_12
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->o()Lcom/google/android/gms/b/dl;

    move-result-object v2

    const/16 v3, 0x10

    const-string v4, "_ev"

    move-object/from16 v0, p1

    iget-object v5, v0, Lcom/google/android/gms/b/ch;->b:Ljava/lang/String;

    const/4 v6, 0x0

    invoke-virtual {v2, v3, v4, v5, v6}, Lcom/google/android/gms/b/dl;->a(ILjava/lang/String;Ljava/lang/String;I)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/bz;->y()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/bz;->z()V

    goto/16 :goto_0

    :cond_13
    if-eqz v12, :cond_15

    :try_start_4
    iget-wide v6, v2, Lcom/google/android/gms/b/bz$a;->d:J

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->d()Lcom/google/android/gms/b/by;

    move-result-object v3

    move-object/from16 v0, p2

    iget-object v5, v0, Lcom/google/android/gms/b/bv;->b:Ljava/lang/String;

    invoke-virtual {v3, v5}, Lcom/google/android/gms/b/by;->a(Ljava/lang/String;)I

    move-result v3

    int-to-long v8, v3

    sub-long/2addr v6, v8

    const-wide/16 v8, 0x0

    cmp-long v3, v6, v8

    if-lez v3, :cond_15

    const-wide/16 v8, 0x1

    cmp-long v3, v6, v8

    if-nez v3, :cond_14

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/b/co;->x()Lcom/google/android/gms/b/co$a;

    move-result-object v3

    const-string v5, "Too many error events logged. appId, count"

    invoke-static {v4}, Lcom/google/android/gms/b/co;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    iget-wide v6, v2, Lcom/google/android/gms/b/bz$a;->d:J

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v3, v5, v4, v2}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_14
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/bz;->y()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/bz;->z()V

    goto/16 :goto_0

    :cond_15
    :try_start_5
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->o()Lcom/google/android/gms/b/dl;

    move-result-object v2

    const-string v3, "_o"

    move-object/from16 v0, p1

    iget-object v5, v0, Lcom/google/android/gms/b/ch;->d:Ljava/lang/String;

    invoke-virtual {v2, v14, v3, v5}, Lcom/google/android/gms/b/dl;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->o()Lcom/google/android/gms/b/dl;

    move-result-object v2

    invoke-virtual {v2, v4}, Lcom/google/android/gms/b/dl;->k(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_16

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->o()Lcom/google/android/gms/b/dl;

    move-result-object v2

    const-string v3, "_dbg"

    const-wide/16 v6, 0x1

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v2, v14, v3, v5}, Lcom/google/android/gms/b/dl;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->o()Lcom/google/android/gms/b/dl;

    move-result-object v2

    const-string v3, "_r"

    const-wide/16 v6, 0x1

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v2, v14, v3, v5}, Lcom/google/android/gms/b/dl;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_16
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v2

    invoke-virtual {v2, v4}, Lcom/google/android/gms/b/bz;->c(Ljava/lang/String;)J

    move-result-wide v2

    const-wide/16 v6, 0x0

    cmp-long v5, v2, v6

    if-lez v5, :cond_17

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/b/co;->z()Lcom/google/android/gms/b/co$a;

    move-result-object v5

    const-string v6, "Data lost. Too many events stored on disk, deleted. appId"

    invoke-static {v4}, Lcom/google/android/gms/b/co;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v5, v6, v7, v2}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_17
    new-instance v5, Lcom/google/android/gms/b/cc;

    move-object/from16 v0, p1

    iget-object v7, v0, Lcom/google/android/gms/b/ch;->d:Ljava/lang/String;

    move-object/from16 v0, p1

    iget-object v9, v0, Lcom/google/android/gms/b/ch;->b:Ljava/lang/String;

    move-object/from16 v0, p1

    iget-wide v10, v0, Lcom/google/android/gms/b/ch;->e:J

    const-wide/16 v12, 0x0

    move-object/from16 v6, p0

    move-object v8, v4

    invoke-direct/range {v5 .. v14}, Lcom/google/android/gms/b/cc;-><init>(Lcom/google/android/gms/b/cv;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLandroid/os/Bundle;)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v2

    iget-object v3, v5, Lcom/google/android/gms/b/cc;->b:Ljava/lang/String;

    invoke-virtual {v2, v4, v3}, Lcom/google/android/gms/b/bz;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/b/cd;

    move-result-object v2

    if-nez v2, :cond_1a

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v2

    invoke-virtual {v2, v4}, Lcom/google/android/gms/b/bz;->j(Ljava/lang/String;)J

    move-result-wide v2

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->d()Lcom/google/android/gms/b/by;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/b/by;->F()I

    const-wide/16 v6, 0x1f4

    cmp-long v2, v2, v6

    if-ltz v2, :cond_18

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/co;->x()Lcom/google/android/gms/b/co$a;

    move-result-object v2

    const-string v3, "Too many event names used, ignoring event. appId, name, supported count"

    invoke-static {v4}, Lcom/google/android/gms/b/co;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    iget-object v5, v5, Lcom/google/android/gms/b/cc;->b:Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->d()Lcom/google/android/gms/b/by;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/b/by;->F()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v2, v3, v4, v5, v6}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->o()Lcom/google/android/gms/b/dl;

    move-result-object v2

    const/16 v3, 0x8

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual {v2, v3, v4, v5, v6}, Lcom/google/android/gms/b/dl;->a(ILjava/lang/String;Ljava/lang/String;I)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/bz;->z()V

    goto/16 :goto_0

    :cond_18
    :try_start_6
    new-instance v7, Lcom/google/android/gms/b/cd;

    iget-object v9, v5, Lcom/google/android/gms/b/cc;->b:Ljava/lang/String;

    const-wide/16 v10, 0x0

    const-wide/16 v12, 0x0

    iget-wide v14, v5, Lcom/google/android/gms/b/cc;->d:J

    move-object v8, v4

    invoke-direct/range {v7 .. v15}, Lcom/google/android/gms/b/cd;-><init>(Ljava/lang/String;Ljava/lang/String;JJJ)V

    :goto_5
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v2

    invoke-virtual {v2, v7}, Lcom/google/android/gms/b/bz;->a(Lcom/google/android/gms/b/cd;)V

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-virtual {v0, v5, v1}, Lcom/google/android/gms/b/cv;->a(Lcom/google/android/gms/b/cc;Lcom/google/android/gms/b/bv;)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/bz;->y()V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v2

    const/4 v3, 0x2

    invoke-virtual {v2, v3}, Lcom/google/android/gms/b/co;->a(I)Z

    move-result v2

    if-eqz v2, :cond_19

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/co;->D()Lcom/google/android/gms/b/co$a;

    move-result-object v2

    const-string v3, "Event recorded"

    invoke-virtual {v2, v3, v5}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :cond_19
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/bz;->z()V

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->Q()V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/co;->D()Lcom/google/android/gms/b/co$a;

    move-result-object v2

    const-string v3, "Background event processing time, ms"

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v4

    sub-long v4, v4, v16

    const-wide/32 v6, 0x7a120

    add-long/2addr v4, v6

    const-wide/32 v6, 0xf4240

    div-long/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_1a
    :try_start_7
    iget-wide v6, v2, Lcom/google/android/gms/b/cd;->e:J

    move-object/from16 v0, p0

    invoke-virtual {v5, v0, v6, v7}, Lcom/google/android/gms/b/cc;->a(Lcom/google/android/gms/b/cv;J)Lcom/google/android/gms/b/cc;

    move-result-object v5

    iget-wide v6, v5, Lcom/google/android/gms/b/cc;->d:J

    invoke-virtual {v2, v6, v7}, Lcom/google/android/gms/b/cd;->a(J)Lcom/google/android/gms/b/cd;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    move-result-object v7

    goto :goto_5
.end method

.method a(Lcom/google/android/gms/b/ch;Ljava/lang/String;)V
    .locals 18

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v2

    move-object/from16 v0, p2

    invoke-virtual {v2, v0}, Lcom/google/android/gms/b/bz;->b(Ljava/lang/String;)Lcom/google/android/gms/b/bu;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/google/android/gms/b/bu;->i()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_1

    :cond_0
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/co;->C()Lcom/google/android/gms/b/co$a;

    move-result-object v2

    const-string v3, "No app data available; dropping event"

    move-object/from16 v0, p2

    invoke-virtual {v2, v3, v0}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_0
    return-void

    :cond_1
    :try_start_0
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->s()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lcom/google/android/gms/b/at;->b(Landroid/content/Context;)Lcom/google/android/gms/b/as;

    move-result-object v3

    const/4 v4, 0x0

    move-object/from16 v0, p2

    invoke-virtual {v3, v0, v4}, Lcom/google/android/gms/b/as;->b(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v3

    iget-object v3, v3, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    invoke-virtual {v2}, Lcom/google/android/gms/b/bu;->i()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-virtual {v2}, Lcom/google/android/gms/b/bu;->i()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/b/co;->z()Lcom/google/android/gms/b/co$a;

    move-result-object v3

    const-string v4, "App version does not match; dropping event. appId"

    invoke-static/range {p2 .. p2}, Lcom/google/android/gms/b/co;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v3

    const-string v3, "_ui"

    move-object/from16 v0, p1

    iget-object v4, v0, Lcom/google/android/gms/b/ch;->b:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/b/co;->z()Lcom/google/android/gms/b/co$a;

    move-result-object v3

    const-string v4, "Could not find package. appId"

    invoke-static/range {p2 .. p2}, Lcom/google/android/gms/b/co;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_2
    new-instance v3, Lcom/google/android/gms/b/bv;

    invoke-virtual {v2}, Lcom/google/android/gms/b/bu;->d()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, Lcom/google/android/gms/b/bu;->i()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2}, Lcom/google/android/gms/b/bu;->j()J

    move-result-wide v7

    invoke-virtual {v2}, Lcom/google/android/gms/b/bu;->k()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v2}, Lcom/google/android/gms/b/bu;->l()J

    move-result-wide v10

    invoke-virtual {v2}, Lcom/google/android/gms/b/bu;->m()J

    move-result-wide v12

    const/4 v14, 0x0

    invoke-virtual {v2}, Lcom/google/android/gms/b/bu;->n()Z

    move-result v15

    const/16 v16, 0x0

    invoke-virtual {v2}, Lcom/google/android/gms/b/bu;->f()Ljava/lang/String;

    move-result-object v17

    move-object/from16 v4, p2

    invoke-direct/range {v3 .. v17}, Lcom/google/android/gms/b/bv;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JJLjava/lang/String;ZZLjava/lang/String;)V

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual {v0, v1, v3}, Lcom/google/android/gms/b/cv;->a(Lcom/google/android/gms/b/ch;Lcom/google/android/gms/b/bv;)V

    goto/16 :goto_0
.end method

.method a(Lcom/google/android/gms/b/cy;)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/b/cv;->F:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/b/cv;->F:I

    return-void
.end method

.method a(Lcom/google/android/gms/b/di;Lcom/google/android/gms/b/bv;)V
    .locals 7

    const/4 v5, 0x1

    const/4 v0, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->C()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->a()V

    iget-object v1, p2, Lcom/google/android/gms/b/bv;->c:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-boolean v1, p2, Lcom/google/android/gms/b/bv;->i:Z

    if-nez v1, :cond_2

    invoke-direct {p0, p2}, Lcom/google/android/gms/b/cv;->c(Lcom/google/android/gms/b/bv;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->o()Lcom/google/android/gms/b/dl;

    move-result-object v1

    iget-object v2, p1, Lcom/google/android/gms/b/di;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/b/dl;->c(Ljava/lang/String;)I

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->o()Lcom/google/android/gms/b/dl;

    move-result-object v2

    iget-object v3, p1, Lcom/google/android/gms/b/di;->b:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->d()Lcom/google/android/gms/b/by;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/b/by;->z()I

    move-result v4

    invoke-virtual {v2, v3, v4, v5}, Lcom/google/android/gms/b/dl;->a(Ljava/lang/String;IZ)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p1, Lcom/google/android/gms/b/di;->b:Ljava/lang/String;

    if-eqz v3, :cond_3

    iget-object v0, p1, Lcom/google/android/gms/b/di;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    :cond_3
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->o()Lcom/google/android/gms/b/dl;

    move-result-object v3

    const-string v4, "_ev"

    invoke-virtual {v3, v1, v4, v2, v0}, Lcom/google/android/gms/b/dl;->a(ILjava/lang/String;Ljava/lang/String;I)V

    goto :goto_0

    :cond_4
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->o()Lcom/google/android/gms/b/dl;

    move-result-object v1

    iget-object v2, p1, Lcom/google/android/gms/b/di;->b:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/android/gms/b/di;->a()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/b/dl;->c(Ljava/lang/String;Ljava/lang/Object;)I

    move-result v1

    if-eqz v1, :cond_7

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->o()Lcom/google/android/gms/b/dl;

    move-result-object v2

    iget-object v3, p1, Lcom/google/android/gms/b/di;->b:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->d()Lcom/google/android/gms/b/by;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/b/by;->z()I

    move-result v4

    invoke-virtual {v2, v3, v4, v5}, Lcom/google/android/gms/b/dl;->a(Ljava/lang/String;IZ)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/android/gms/b/di;->a()Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_6

    instance-of v4, v3, Ljava/lang/String;

    if-nez v4, :cond_5

    instance-of v4, v3, Ljava/lang/CharSequence;

    if-eqz v4, :cond_6

    :cond_5
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    :cond_6
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->o()Lcom/google/android/gms/b/dl;

    move-result-object v3

    const-string v4, "_ev"

    invoke-virtual {v3, v1, v4, v2, v0}, Lcom/google/android/gms/b/dl;->a(ILjava/lang/String;Ljava/lang/String;I)V

    goto :goto_0

    :cond_7
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->o()Lcom/google/android/gms/b/dl;

    move-result-object v0

    iget-object v1, p1, Lcom/google/android/gms/b/di;->b:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/android/gms/b/di;->a()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/b/dl;->d(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_0

    new-instance v1, Lcom/google/android/gms/b/dk;

    iget-object v2, p2, Lcom/google/android/gms/b/bv;->b:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/b/di;->b:Ljava/lang/String;

    iget-wide v4, p1, Lcom/google/android/gms/b/di;->c:J

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/b/dk;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->C()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v2, "Setting user property"

    iget-object v3, v1, Lcom/google/android/gms/b/dk;->b:Ljava/lang/String;

    invoke-virtual {v0, v2, v3, v6}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/bz;->x()V

    :try_start_0
    invoke-direct {p0, p2}, Lcom/google/android/gms/b/cv;->c(Lcom/google/android/gms/b/bv;)V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/bz;->a(Lcom/google/android/gms/b/dk;)Z

    move-result v0

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/bz;->y()V

    if-eqz v0, :cond_8

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->C()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v2, "User property set"

    iget-object v3, v1, Lcom/google/android/gms/b/dk;->b:Ljava/lang/String;

    iget-object v1, v1, Lcom/google/android/gms/b/dk;->d:Ljava/lang/Object;

    invoke-virtual {v0, v2, v3, v1}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/bz;->z()V

    goto/16 :goto_0

    :cond_8
    :try_start_1
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->x()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v2, "Too many unique user properties are set. Ignoring user property"

    iget-object v3, v1, Lcom/google/android/gms/b/dk;->b:Ljava/lang/String;

    iget-object v1, v1, Lcom/google/android/gms/b/dk;->d:Ljava/lang/Object;

    invoke-virtual {v0, v2, v3, v1}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->o()Lcom/google/android/gms/b/dl;

    move-result-object v0

    const/16 v1, 0x9

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/google/android/gms/b/dl;->a(ILjava/lang/String;Ljava/lang/String;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/b/bz;->z()V

    throw v0
.end method

.method a(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/Throwable;",
            "[B",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    const/16 v6, 0x130

    const/4 v1, 0x1

    const/16 v5, 0x194

    const/4 v2, 0x0

    const/4 v0, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->C()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->a()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/String;)Ljava/lang/String;

    if-nez p4, :cond_0

    new-array p4, v0, [B

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/b/bz;->x()V

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v3

    invoke-virtual {v3, p1}, Lcom/google/android/gms/b/bz;->b(Ljava/lang/String;)Lcom/google/android/gms/b/bu;

    move-result-object v4

    const/16 v3, 0xc8

    if-eq p2, v3, :cond_1

    const/16 v3, 0xcc

    if-eq p2, v3, :cond_1

    if-ne p2, v6, :cond_2

    :cond_1
    if-nez p3, :cond_2

    move v3, v1

    :goto_0
    if-nez v4, :cond_3

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->z()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v1, "App does not exist in onConfigFetched. appId"

    invoke-static {p1}, Lcom/google/android/gms/b/co;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_1
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/bz;->y()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/bz;->z()V

    :goto_2
    return-void

    :cond_2
    move v3, v0

    goto :goto_0

    :cond_3
    if-nez v3, :cond_4

    if-ne p2, v5, :cond_c

    :cond_4
    if-eqz p5, :cond_6

    :try_start_1
    const-string v0, "Last-Modified"

    invoke-interface {p5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    :goto_3
    if-eqz v0, :cond_7

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_7

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    :goto_4
    if-eq p2, v5, :cond_5

    if-ne p2, v6, :cond_8

    :cond_5
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->j()Lcom/google/android/gms/b/ct;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/b/ct;->a(Ljava/lang/String;)Lcom/google/android/gms/b/dn$b;

    move-result-object v0

    if-nez v0, :cond_9

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->j()Lcom/google/android/gms/b/ct;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2}, Lcom/google/android/gms/b/ct;->a(Ljava/lang/String;[BLjava/lang/String;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    if-nez v0, :cond_9

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/bz;->z()V

    goto :goto_2

    :cond_6
    move-object v0, v2

    goto :goto_3

    :cond_7
    move-object v0, v2

    goto :goto_4

    :cond_8
    :try_start_2
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->j()Lcom/google/android/gms/b/ct;

    move-result-object v1

    invoke-virtual {v1, p1, p4, v0}, Lcom/google/android/gms/b/ct;->a(Ljava/lang/String;[BLjava/lang/String;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result v0

    if-nez v0, :cond_9

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/bz;->z()V

    goto :goto_2

    :cond_9
    :try_start_3
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->t()Lcom/google/android/gms/common/util/c;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/c;->a()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/google/android/gms/b/bu;->g(J)V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/google/android/gms/b/bz;->a(Lcom/google/android/gms/b/bu;)V

    if-ne p2, v5, :cond_a

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->z()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v1, "Config not found. Using empty config. appId"

    invoke-static {p1}, Lcom/google/android/gms/b/co;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_5
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->r()Lcom/google/android/gms/b/cp;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/cp;->x()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-direct {p0}, Lcom/google/android/gms/b/cv;->P()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->L()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto/16 :goto_1

    :catchall_0
    move-exception v0

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/b/bz;->z()V

    throw v0

    :cond_a
    :try_start_4
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->D()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v1, "Successfully fetched config. Got network response. code, size"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    array-length v3, p4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_5

    :cond_b
    invoke-direct {p0}, Lcom/google/android/gms/b/cv;->Q()V

    goto/16 :goto_1

    :cond_c
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->t()Lcom/google/android/gms/common/util/c;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/common/util/c;->a()J

    move-result-wide v2

    invoke-virtual {v4, v2, v3}, Lcom/google/android/gms/b/bu;->h(J)V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v2

    invoke-virtual {v2, v4}, Lcom/google/android/gms/b/bz;->a(Lcom/google/android/gms/b/bu;)V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/co;->D()Lcom/google/android/gms/b/co$a;

    move-result-object v2

    const-string v3, "Fetching config failed. code, error"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v3, v4, p3}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->j()Lcom/google/android/gms/b/ct;

    move-result-object v2

    invoke-virtual {v2, p1}, Lcom/google/android/gms/b/ct;->c(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->e()Lcom/google/android/gms/b/cr;

    move-result-object v2

    iget-object v2, v2, Lcom/google/android/gms/b/cr;->d:Lcom/google/android/gms/b/cr$b;

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->t()Lcom/google/android/gms/common/util/c;

    move-result-object v3

    invoke-interface {v3}, Lcom/google/android/gms/common/util/c;->a()J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Lcom/google/android/gms/b/cr$b;->a(J)V

    const/16 v2, 0x1f7

    if-eq p2, v2, :cond_d

    const/16 v2, 0x1ad

    if-ne p2, v2, :cond_e

    :cond_d
    move v0, v1

    :cond_e
    if-eqz v0, :cond_f

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->e()Lcom/google/android/gms/b/cr;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/b/cr;->e:Lcom/google/android/gms/b/cr$b;

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->t()Lcom/google/android/gms/common/util/c;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/common/util/c;->a()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/b/cr$b;->a(J)V

    :cond_f
    invoke-direct {p0}, Lcom/google/android/gms/b/cv;->Q()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto/16 :goto_1
.end method

.method protected a(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/c;->b(Z)V

    iget-object v0, p0, Lcom/google/android/gms/b/cv;->E:Ljava/util/List;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->x()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v1, "Set uploading progress before finishing the previous upload"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;)V

    :goto_1
    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/google/android/gms/b/cv;->E:Ljava/util/List;

    goto :goto_1
.end method

.method public a(Z)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/b/cv;->Q()V

    return-void
.end method

.method a(II)Z
    .locals 5

    const/4 v0, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->C()V

    if-le p1, p2, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/b/co;->x()Lcom/google/android/gms/b/co$a;

    move-result-object v1

    const-string v2, "Panic: can\'t downgrade version. Previous, current version"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1, v2, v3, v4}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_0
    return v0

    :cond_0
    if-ge p1, p2, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->D()Ljava/nio/channels/FileChannel;

    move-result-object v1

    invoke-virtual {p0, p2, v1}, Lcom/google/android/gms/b/cv;->a(ILjava/nio/channels/FileChannel;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->D()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v1, "Storage version upgraded. Previous, current version"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/b/co;->x()Lcom/google/android/gms/b/co$a;

    move-result-object v1

    const-string v2, "Storage version upgrade failed. Previous, current version"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1, v2, v3, v4}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0
.end method

.method a(ILjava/nio/channels/FileChannel;)Z
    .locals 6

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->C()V

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/nio/channels/FileChannel;->isOpen()Z

    move-result v2

    if-nez v2, :cond_2

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->x()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v2, "Bad chanel to read from"

    invoke-virtual {v0, v2}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;)V

    move v0, v1

    :cond_1
    :goto_0
    return v0

    :cond_2
    const/4 v2, 0x4

    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    const-wide/16 v4, 0x0

    :try_start_0
    invoke-virtual {p2, v4, v5}, Ljava/nio/channels/FileChannel;->truncate(J)Ljava/nio/channels/FileChannel;

    invoke-virtual {p2, v2}, Ljava/nio/channels/FileChannel;->write(Ljava/nio/ByteBuffer;)I

    const/4 v2, 0x1

    invoke-virtual {p2, v2}, Ljava/nio/channels/FileChannel;->force(Z)V

    invoke-virtual {p2}, Ljava/nio/channels/FileChannel;->size()J

    move-result-wide v2

    const-wide/16 v4, 0x4

    cmp-long v2, v2, v4

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/co;->x()Lcom/google/android/gms/b/co$a;

    move-result-object v2

    const-string v3, "Error writing to channel. Bytes written"

    invoke-virtual {p2}, Ljava/nio/channels/FileChannel;->size()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/co;->x()Lcom/google/android/gms/b/co$a;

    move-result-object v2

    const-string v3, "Failed to write to channel"

    invoke-virtual {v2, v3, v0}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    move v0, v1

    goto :goto_0
.end method

.method a(J)Z
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1, p2}, Lcom/google/android/gms/b/cv;->a(Ljava/lang/String;J)Z

    move-result v0

    return v0
.end method

.method public b(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->J()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->h()Lcom/google/android/gms/b/cu;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/b/cv$3;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/b/cv$3;-><init>(Lcom/google/android/gms/b/cv;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/cu;->b(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0

    const-wide/16 v2, 0x7530

    :try_start_0
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v2, v3, v1}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    :goto_1
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/b/co;->x()Lcom/google/android/gms/b/co$a;

    move-result-object v1

    const-string v2, "Failed to get gmp app id. appId"

    invoke-static {p1}, Lcom/google/android/gms/b/co;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v2, v3, v0}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_1

    :catch_2
    move-exception v0

    goto :goto_1
.end method

.method public b(Lcom/google/android/gms/b/bv;)V
    .locals 8

    const-wide/32 v6, 0x36ee80

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->C()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->a()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lcom/google/android/gms/b/bv;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p1, Lcom/google/android/gms/b/bv;->c:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-boolean v0, p1, Lcom/google/android/gms/b/bv;->i:Z

    if-nez v0, :cond_1

    invoke-direct {p0, p1}, Lcom/google/android/gms/b/cv;->c(Lcom/google/android/gms/b/bv;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->t()Lcom/google/android/gms/common/util/c;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/c;->a()J

    move-result-wide v2

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/bz;->x()V

    :try_start_0
    invoke-virtual {p0, p1, v2, v3}, Lcom/google/android/gms/b/cv;->a(Lcom/google/android/gms/b/bv;J)V

    invoke-direct {p0, p1}, Lcom/google/android/gms/b/cv;->c(Lcom/google/android/gms/b/bv;)V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v0

    iget-object v1, p1, Lcom/google/android/gms/b/bv;->b:Ljava/lang/String;

    const-string v4, "_f"

    invoke-virtual {v0, v1, v4}, Lcom/google/android/gms/b/bz;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/b/cd;

    move-result-object v0

    if-nez v0, :cond_3

    const-wide/16 v0, 0x1

    const-wide/32 v4, 0x36ee80

    div-long v4, v2, v4

    add-long/2addr v0, v4

    mul-long v4, v0, v6

    new-instance v0, Lcom/google/android/gms/b/di;

    const-string v1, "_fot"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    const-string v5, "auto"

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/b/di;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/b/cv;->a(Lcom/google/android/gms/b/di;Lcom/google/android/gms/b/bv;)V

    invoke-virtual {p0, p1, v2, v3}, Lcom/google/android/gms/b/cv;->b(Lcom/google/android/gms/b/bv;J)V

    invoke-virtual {p0, p1, v2, v3}, Lcom/google/android/gms/b/cv;->c(Lcom/google/android/gms/b/bv;J)V

    :cond_2
    :goto_1
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/bz;->y()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/bz;->z()V

    goto :goto_0

    :cond_3
    :try_start_1
    iget-boolean v0, p1, Lcom/google/android/gms/b/bv;->j:Z

    if-eqz v0, :cond_2

    invoke-virtual {p0, p1, v2, v3}, Lcom/google/android/gms/b/cv;->d(Lcom/google/android/gms/b/bv;J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/b/bz;->z()V

    throw v0
.end method

.method b(Lcom/google/android/gms/b/bv;J)V
    .locals 12

    const/4 v1, 0x0

    const-wide/16 v10, 0x1

    const-wide/16 v8, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->C()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->a()V

    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    const-string v0, "_c"

    invoke-virtual {v3, v0, v10, v11}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    const-string v0, "_r"

    invoke-virtual {v3, v0, v10, v11}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    const-string v0, "_uwa"

    invoke-virtual {v3, v0, v8, v9}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    const-string v0, "_pfo"

    invoke-virtual {v3, v0, v8, v9}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    const-string v0, "_sys"

    invoke-virtual {v3, v0, v8, v9}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    const-string v0, "_sysu"

    invoke-virtual {v3, v0, v8, v9}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->s()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->x()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v1, "PackageManager is null, first open report might be inaccurate. appId"

    iget-object v2, p1, Lcom/google/android/gms/b/bv;->b:Ljava/lang/String;

    invoke-static {v2}, Lcom/google/android/gms/b/co;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v0

    iget-object v1, p1, Lcom/google/android/gms/b/bv;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/bz;->h(Ljava/lang/String;)J

    move-result-wide v0

    cmp-long v2, v0, v8

    if-ltz v2, :cond_1

    const-string v2, "_pfo"

    invoke-virtual {v3, v2, v0, v1}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    :cond_1
    new-instance v0, Lcom/google/android/gms/b/ch;

    const-string v1, "_f"

    new-instance v2, Lcom/google/android/gms/b/ce;

    invoke-direct {v2, v3}, Lcom/google/android/gms/b/ce;-><init>(Landroid/os/Bundle;)V

    const-string v3, "auto"

    move-wide v4, p2

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/b/ch;-><init>(Ljava/lang/String;Lcom/google/android/gms/b/ce;Ljava/lang/String;J)V

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/b/cv;->a(Lcom/google/android/gms/b/ch;Lcom/google/android/gms/b/bv;)V

    return-void

    :cond_2
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->s()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/b/at;->b(Landroid/content/Context;)Lcom/google/android/gms/b/as;

    move-result-object v0

    iget-object v2, p1, Lcom/google/android/gms/b/bv;->b:Ljava/lang/String;

    const/4 v4, 0x0

    invoke-virtual {v0, v2, v4}, Lcom/google/android/gms/b/as;->b(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_1
    if-eqz v0, :cond_3

    iget-wide v4, v0, Landroid/content/pm/PackageInfo;->firstInstallTime:J

    cmp-long v2, v4, v8

    if-eqz v2, :cond_3

    iget-wide v4, v0, Landroid/content/pm/PackageInfo;->firstInstallTime:J

    iget-wide v6, v0, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    cmp-long v0, v4, v6

    if-eqz v0, :cond_3

    const-string v0, "_uwa"

    invoke-virtual {v3, v0, v10, v11}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    :cond_3
    :try_start_1
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->s()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/b/at;->b(Landroid/content/Context;)Lcom/google/android/gms/b/as;

    move-result-object v0

    iget-object v2, p1, Lcom/google/android/gms/b/bv;->b:Ljava/lang/String;

    const/4 v4, 0x0

    invoke-virtual {v0, v2, v4}, Lcom/google/android/gms/b/as;->a(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    :goto_2
    if-eqz v0, :cond_0

    iget v1, v0, Landroid/content/pm/ApplicationInfo;->flags:I

    and-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_4

    const-string v1, "_sys"

    invoke-virtual {v3, v1, v10, v11}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    :cond_4
    iget v0, v0, Landroid/content/pm/ApplicationInfo;->flags:I

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_0

    const-string v0, "_sysu"

    invoke-virtual {v3, v0, v10, v11}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/co;->x()Lcom/google/android/gms/b/co$a;

    move-result-object v2

    const-string v4, "Package info is null, first open report might be inaccurate. appId"

    iget-object v5, p1, Lcom/google/android/gms/b/bv;->b:Ljava/lang/String;

    invoke-static {v5}, Lcom/google/android/gms/b/co;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v2, v4, v5, v0}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v0, v1

    goto :goto_1

    :catch_1
    move-exception v0

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/co;->x()Lcom/google/android/gms/b/co$a;

    move-result-object v2

    const-string v4, "Application info is null, first open report might be inaccurate. appId"

    iget-object v5, p1, Lcom/google/android/gms/b/bv;->b:Ljava/lang/String;

    invoke-static {v5}, Lcom/google/android/gms/b/co;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v2, v4, v5, v0}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v0, v1

    goto :goto_2
.end method

.method b(Lcom/google/android/gms/b/di;Lcom/google/android/gms/b/bv;)V
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->C()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->a()V

    iget-object v0, p2, Lcom/google/android/gms/b/bv;->c:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-boolean v0, p2, Lcom/google/android/gms/b/bv;->i:Z

    if-nez v0, :cond_1

    invoke-direct {p0, p2}, Lcom/google/android/gms/b/cv;->c(Lcom/google/android/gms/b/bv;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->C()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v1, "Removing user property"

    iget-object v2, p1, Lcom/google/android/gms/b/di;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/bz;->x()V

    :try_start_0
    invoke-direct {p0, p2}, Lcom/google/android/gms/b/cv;->c(Lcom/google/android/gms/b/bv;)V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v0

    iget-object v1, p2, Lcom/google/android/gms/b/bv;->b:Ljava/lang/String;

    iget-object v2, p1, Lcom/google/android/gms/b/di;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/b/bz;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/bz;->y()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->C()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v1, "User property removed"

    iget-object v2, p1, Lcom/google/android/gms/b/di;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/bz;->z()V

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/b/bz;->z()V

    throw v0
.end method

.method protected b()Z
    .locals 6

    const/4 v0, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->a()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->C()V

    iget-object v1, p0, Lcom/google/android/gms/b/cv;->A:Ljava/lang/Boolean;

    if-eqz v1, :cond_0

    iget-wide v2, p0, Lcom/google/android/gms/b/cv;->B:J

    const-wide/16 v4, 0x0

    cmp-long v1, v2, v4

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/b/cv;->A:Ljava/lang/Boolean;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/b/cv;->A:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->t()Lcom/google/android/gms/common/util/c;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/common/util/c;->b()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/google/android/gms/b/cv;->B:J

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    cmp-long v1, v2, v4

    if-lez v1, :cond_2

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->t()Lcom/google/android/gms/common/util/c;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/common/util/c;->b()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/google/android/gms/b/cv;->B:J

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->d()Lcom/google/android/gms/b/by;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/b/by;->R()Z

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->o()Lcom/google/android/gms/b/dl;

    move-result-object v1

    const-string v2, "android.permission.INTERNET"

    invoke-virtual {v1, v2}, Lcom/google/android/gms/b/dl;->i(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->o()Lcom/google/android/gms/b/dl;

    move-result-object v1

    const-string v2, "android.permission.ACCESS_NETWORK_STATE"

    invoke-virtual {v1, v2}, Lcom/google/android/gms/b/dl;->i(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->s()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/b/at;->b(Landroid/content/Context;)Lcom/google/android/gms/b/as;

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->s()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/google/android/gms/b/cs;->a(Landroid/content/Context;Z)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->s()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/google/android/gms/b/dd;->a(Landroid/content/Context;Z)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x1

    :cond_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/cv;->A:Ljava/lang/Boolean;

    iget-object v0, p0, Lcom/google/android/gms/b/cv;->A:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->o()Lcom/google/android/gms/b/dl;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->x()Lcom/google/android/gms/b/cl;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/b/cl;->y()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/dl;->f(Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/cv;->A:Ljava/lang/Boolean;

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/b/cv;->A:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public b(Lcom/google/android/gms/b/ch;Ljava/lang/String;)[B
    .locals 18

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->a()V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->C()V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->J()V

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static/range {p2 .. p2}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/String;)Ljava/lang/String;

    new-instance v13, Lcom/google/android/gms/b/do$d;

    invoke-direct {v13}, Lcom/google/android/gms/b/do$d;-><init>()V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/bz;->x()V

    :try_start_0
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v2

    move-object/from16 v0, p2

    invoke-virtual {v2, v0}, Lcom/google/android/gms/b/bz;->b(Ljava/lang/String;)Lcom/google/android/gms/b/bu;

    move-result-object v16

    if-nez v16, :cond_0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/co;->C()Lcom/google/android/gms/b/co$a;

    move-result-object v2

    const-string v3, "Log and bundle not available. package_name"

    move-object/from16 v0, p2

    invoke-virtual {v2, v3, v0}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v2, 0x0

    new-array v2, v2, [B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/b/bz;->z()V

    :goto_0
    return-object v2

    :cond_0
    :try_start_1
    invoke-virtual/range {v16 .. v16}, Lcom/google/android/gms/b/bu;->n()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/co;->C()Lcom/google/android/gms/b/co$a;

    move-result-object v2

    const-string v3, "Log and bundle disabled. package_name"

    move-object/from16 v0, p2

    invoke-virtual {v2, v3, v0}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v2, 0x0

    new-array v2, v2, [B
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/b/bz;->z()V

    goto :goto_0

    :cond_1
    :try_start_2
    new-instance v17, Lcom/google/android/gms/b/do$e;

    invoke-direct/range {v17 .. v17}, Lcom/google/android/gms/b/do$e;-><init>()V

    const/4 v2, 0x1

    new-array v2, v2, [Lcom/google/android/gms/b/do$e;

    const/4 v3, 0x0

    aput-object v17, v2, v3

    iput-object v2, v13, Lcom/google/android/gms/b/do$d;->a:[Lcom/google/android/gms/b/do$e;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object/from16 v0, v17

    iput-object v2, v0, Lcom/google/android/gms/b/do$e;->a:Ljava/lang/Integer;

    const-string v2, "android"

    move-object/from16 v0, v17

    iput-object v2, v0, Lcom/google/android/gms/b/do$e;->i:Ljava/lang/String;

    invoke-virtual/range {v16 .. v16}, Lcom/google/android/gms/b/bu;->b()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, v17

    iput-object v2, v0, Lcom/google/android/gms/b/do$e;->o:Ljava/lang/String;

    invoke-virtual/range {v16 .. v16}, Lcom/google/android/gms/b/bu;->k()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, v17

    iput-object v2, v0, Lcom/google/android/gms/b/do$e;->n:Ljava/lang/String;

    invoke-virtual/range {v16 .. v16}, Lcom/google/android/gms/b/bu;->i()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, v17

    iput-object v2, v0, Lcom/google/android/gms/b/do$e;->p:Ljava/lang/String;

    invoke-virtual/range {v16 .. v16}, Lcom/google/android/gms/b/bu;->j()J

    move-result-wide v2

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object/from16 v0, v17

    iput-object v2, v0, Lcom/google/android/gms/b/do$e;->C:Ljava/lang/Integer;

    invoke-virtual/range {v16 .. v16}, Lcom/google/android/gms/b/bu;->l()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    move-object/from16 v0, v17

    iput-object v2, v0, Lcom/google/android/gms/b/do$e;->q:Ljava/lang/Long;

    invoke-virtual/range {v16 .. v16}, Lcom/google/android/gms/b/bu;->d()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, v17

    iput-object v2, v0, Lcom/google/android/gms/b/do$e;->y:Ljava/lang/String;

    invoke-virtual/range {v16 .. v16}, Lcom/google/android/gms/b/bu;->m()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    move-object/from16 v0, v17

    iput-object v2, v0, Lcom/google/android/gms/b/do$e;->v:Ljava/lang/Long;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->e()Lcom/google/android/gms/b/cr;

    move-result-object v2

    invoke-virtual/range {v16 .. v16}, Lcom/google/android/gms/b/bu;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/b/cr;->a(Ljava/lang/String;)Landroid/util/Pair;

    move-result-object v3

    iget-object v2, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    iget-object v2, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    move-object/from16 v0, v17

    iput-object v2, v0, Lcom/google/android/gms/b/do$e;->s:Ljava/lang/String;

    iget-object v2, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Boolean;

    move-object/from16 v0, v17

    iput-object v2, v0, Lcom/google/android/gms/b/do$e;->t:Ljava/lang/Boolean;

    :cond_2
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->w()Lcom/google/android/gms/b/cb;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/cb;->x()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, v17

    iput-object v2, v0, Lcom/google/android/gms/b/do$e;->k:Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->w()Lcom/google/android/gms/b/cb;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/cb;->y()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, v17

    iput-object v2, v0, Lcom/google/android/gms/b/do$e;->j:Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->w()Lcom/google/android/gms/b/cb;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/cb;->z()J

    move-result-wide v2

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object/from16 v0, v17

    iput-object v2, v0, Lcom/google/android/gms/b/do$e;->m:Ljava/lang/Integer;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->w()Lcom/google/android/gms/b/cb;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/cb;->A()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, v17

    iput-object v2, v0, Lcom/google/android/gms/b/do$e;->l:Ljava/lang/String;

    invoke-virtual/range {v16 .. v16}, Lcom/google/android/gms/b/bu;->c()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, v17

    iput-object v2, v0, Lcom/google/android/gms/b/do$e;->u:Ljava/lang/String;

    invoke-virtual/range {v16 .. v16}, Lcom/google/android/gms/b/bu;->f()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, v17

    iput-object v2, v0, Lcom/google/android/gms/b/do$e;->B:Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v2

    invoke-virtual/range {v16 .. v16}, Lcom/google/android/gms/b/bu;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/b/bz;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v2

    new-array v2, v2, [Lcom/google/android/gms/b/do$g;

    move-object/from16 v0, v17

    iput-object v2, v0, Lcom/google/android/gms/b/do$e;->c:[Lcom/google/android/gms/b/do$g;

    const/4 v2, 0x0

    move v3, v2

    :goto_1
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v2

    if-ge v3, v2, :cond_3

    new-instance v5, Lcom/google/android/gms/b/do$g;

    invoke-direct {v5}, Lcom/google/android/gms/b/do$g;-><init>()V

    move-object/from16 v0, v17

    iget-object v2, v0, Lcom/google/android/gms/b/do$e;->c:[Lcom/google/android/gms/b/do$g;

    aput-object v5, v2, v3

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/b/dk;

    iget-object v2, v2, Lcom/google/android/gms/b/dk;->b:Ljava/lang/String;

    iput-object v2, v5, Lcom/google/android/gms/b/do$g;->b:Ljava/lang/String;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/b/dk;

    iget-wide v6, v2, Lcom/google/android/gms/b/dk;->c:J

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    iput-object v2, v5, Lcom/google/android/gms/b/do$g;->a:Ljava/lang/Long;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->o()Lcom/google/android/gms/b/dl;

    move-result-object v6

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/b/dk;

    iget-object v2, v2, Lcom/google/android/gms/b/dk;->d:Ljava/lang/Object;

    invoke-virtual {v6, v5, v2}, Lcom/google/android/gms/b/dl;->a(Lcom/google/android/gms/b/do$g;Ljava/lang/Object;)V

    add-int/lit8 v2, v3, 0x1

    move v3, v2

    goto :goto_1

    :cond_3
    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/google/android/gms/b/ch;->c:Lcom/google/android/gms/b/ce;

    invoke-virtual {v2}, Lcom/google/android/gms/b/ce;->b()Landroid/os/Bundle;

    move-result-object v12

    const-string v2, "_iap"

    move-object/from16 v0, p1

    iget-object v3, v0, Lcom/google/android/gms/b/ch;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const-string v2, "_c"

    const-wide/16 v4, 0x1

    invoke-virtual {v12, v2, v4, v5}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/co;->C()Lcom/google/android/gms/b/co$a;

    move-result-object v2

    const-string v3, "Marking in-app purchase as real-time"

    invoke-virtual {v2, v3}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;)V

    const-string v2, "_r"

    const-wide/16 v4, 0x1

    invoke-virtual {v12, v2, v4, v5}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    :cond_4
    const-string v2, "_o"

    move-object/from16 v0, p1

    iget-object v3, v0, Lcom/google/android/gms/b/ch;->d:Ljava/lang/String;

    invoke-virtual {v12, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->o()Lcom/google/android/gms/b/dl;

    move-result-object v2

    move-object/from16 v0, v17

    iget-object v3, v0, Lcom/google/android/gms/b/do$e;->o:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/b/dl;->k(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->o()Lcom/google/android/gms/b/dl;

    move-result-object v2

    const-string v3, "_dbg"

    const-wide/16 v4, 0x1

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v2, v12, v3, v4}, Lcom/google/android/gms/b/dl;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->o()Lcom/google/android/gms/b/dl;

    move-result-object v2

    const-string v3, "_r"

    const-wide/16 v4, 0x1

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v2, v12, v3, v4}, Lcom/google/android/gms/b/dl;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_5
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v2

    move-object/from16 v0, p1

    iget-object v3, v0, Lcom/google/android/gms/b/ch;->b:Ljava/lang/String;

    move-object/from16 v0, p2

    invoke-virtual {v2, v0, v3}, Lcom/google/android/gms/b/bz;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/b/cd;

    move-result-object v2

    if-nez v2, :cond_6

    const-wide/16 v14, 0x0

    new-instance v3, Lcom/google/android/gms/b/cd;

    move-object/from16 v0, p1

    iget-object v5, v0, Lcom/google/android/gms/b/ch;->b:Ljava/lang/String;

    const-wide/16 v6, 0x1

    const-wide/16 v8, 0x0

    move-object/from16 v0, p1

    iget-wide v10, v0, Lcom/google/android/gms/b/ch;->e:J

    move-object/from16 v4, p2

    invoke-direct/range {v3 .. v11}, Lcom/google/android/gms/b/cd;-><init>(Ljava/lang/String;Ljava/lang/String;JJJ)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v2

    invoke-virtual {v2, v3}, Lcom/google/android/gms/b/bz;->a(Lcom/google/android/gms/b/cd;)V

    move-wide v10, v14

    :goto_2
    new-instance v3, Lcom/google/android/gms/b/cc;

    move-object/from16 v0, p1

    iget-object v5, v0, Lcom/google/android/gms/b/ch;->d:Ljava/lang/String;

    move-object/from16 v0, p1

    iget-object v7, v0, Lcom/google/android/gms/b/ch;->b:Ljava/lang/String;

    move-object/from16 v0, p1

    iget-wide v8, v0, Lcom/google/android/gms/b/ch;->e:J

    move-object/from16 v4, p0

    move-object/from16 v6, p2

    invoke-direct/range {v3 .. v12}, Lcom/google/android/gms/b/cc;-><init>(Lcom/google/android/gms/b/cv;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLandroid/os/Bundle;)V

    new-instance v6, Lcom/google/android/gms/b/do$b;

    invoke-direct {v6}, Lcom/google/android/gms/b/do$b;-><init>()V

    const/4 v2, 0x1

    new-array v2, v2, [Lcom/google/android/gms/b/do$b;

    const/4 v4, 0x0

    aput-object v6, v2, v4

    move-object/from16 v0, v17

    iput-object v2, v0, Lcom/google/android/gms/b/do$e;->b:[Lcom/google/android/gms/b/do$b;

    iget-wide v4, v3, Lcom/google/android/gms/b/cc;->d:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    iput-object v2, v6, Lcom/google/android/gms/b/do$b;->c:Ljava/lang/Long;

    iget-object v2, v3, Lcom/google/android/gms/b/cc;->b:Ljava/lang/String;

    iput-object v2, v6, Lcom/google/android/gms/b/do$b;->b:Ljava/lang/String;

    iget-wide v4, v3, Lcom/google/android/gms/b/cc;->e:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    iput-object v2, v6, Lcom/google/android/gms/b/do$b;->d:Ljava/lang/Long;

    iget-object v2, v3, Lcom/google/android/gms/b/cc;->f:Lcom/google/android/gms/b/ce;

    invoke-virtual {v2}, Lcom/google/android/gms/b/ce;->a()I

    move-result v2

    new-array v2, v2, [Lcom/google/android/gms/b/do$c;

    iput-object v2, v6, Lcom/google/android/gms/b/do$b;->a:[Lcom/google/android/gms/b/do$c;

    const/4 v2, 0x0

    iget-object v4, v3, Lcom/google/android/gms/b/cc;->f:Lcom/google/android/gms/b/ce;

    invoke-virtual {v4}, Lcom/google/android/gms/b/ce;->iterator()Ljava/util/Iterator;

    move-result-object v7

    move v4, v2

    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    new-instance v8, Lcom/google/android/gms/b/do$c;

    invoke-direct {v8}, Lcom/google/android/gms/b/do$c;-><init>()V

    iget-object v9, v6, Lcom/google/android/gms/b/do$b;->a:[Lcom/google/android/gms/b/do$c;

    add-int/lit8 v5, v4, 0x1

    aput-object v8, v9, v4

    iput-object v2, v8, Lcom/google/android/gms/b/do$c;->a:Ljava/lang/String;

    iget-object v4, v3, Lcom/google/android/gms/b/cc;->f:Lcom/google/android/gms/b/ce;

    invoke-virtual {v4, v2}, Lcom/google/android/gms/b/ce;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->o()Lcom/google/android/gms/b/dl;

    move-result-object v4

    invoke-virtual {v4, v8, v2}, Lcom/google/android/gms/b/dl;->a(Lcom/google/android/gms/b/do$c;Ljava/lang/Object;)V

    move v4, v5

    goto :goto_3

    :cond_6
    iget-wide v10, v2, Lcom/google/android/gms/b/cd;->e:J

    move-object/from16 v0, p1

    iget-wide v4, v0, Lcom/google/android/gms/b/ch;->e:J

    invoke-virtual {v2, v4, v5}, Lcom/google/android/gms/b/cd;->a(J)Lcom/google/android/gms/b/cd;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/cd;->a()Lcom/google/android/gms/b/cd;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/google/android/gms/b/bz;->a(Lcom/google/android/gms/b/cd;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto/16 :goto_2

    :catchall_0
    move-exception v2

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/b/bz;->z()V

    throw v2

    :cond_7
    :try_start_3
    invoke-virtual/range {v16 .. v16}, Lcom/google/android/gms/b/bu;->b()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, v17

    iget-object v3, v0, Lcom/google/android/gms/b/do$e;->c:[Lcom/google/android/gms/b/do$g;

    move-object/from16 v0, v17

    iget-object v4, v0, Lcom/google/android/gms/b/do$e;->b:[Lcom/google/android/gms/b/do$b;

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v3, v4}, Lcom/google/android/gms/b/cv;->a(Ljava/lang/String;[Lcom/google/android/gms/b/do$g;[Lcom/google/android/gms/b/do$b;)[Lcom/google/android/gms/b/do$a;

    move-result-object v2

    move-object/from16 v0, v17

    iput-object v2, v0, Lcom/google/android/gms/b/do$e;->A:[Lcom/google/android/gms/b/do$a;

    iget-object v2, v6, Lcom/google/android/gms/b/do$b;->c:Ljava/lang/Long;

    move-object/from16 v0, v17

    iput-object v2, v0, Lcom/google/android/gms/b/do$e;->e:Ljava/lang/Long;

    iget-object v2, v6, Lcom/google/android/gms/b/do$b;->c:Ljava/lang/Long;

    move-object/from16 v0, v17

    iput-object v2, v0, Lcom/google/android/gms/b/do$e;->f:Ljava/lang/Long;

    invoke-virtual/range {v16 .. v16}, Lcom/google/android/gms/b/bu;->h()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v4, v2, v4

    if-eqz v4, :cond_8

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    :goto_4
    move-object/from16 v0, v17

    iput-object v4, v0, Lcom/google/android/gms/b/do$e;->h:Ljava/lang/Long;

    invoke-virtual/range {v16 .. v16}, Lcom/google/android/gms/b/bu;->g()J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long v6, v4, v6

    if-nez v6, :cond_a

    :goto_5
    const-wide/16 v4, 0x0

    cmp-long v4, v2, v4

    if-eqz v4, :cond_9

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    :goto_6
    move-object/from16 v0, v17

    iput-object v2, v0, Lcom/google/android/gms/b/do$e;->g:Ljava/lang/Long;

    invoke-virtual/range {v16 .. v16}, Lcom/google/android/gms/b/bu;->r()V

    invoke-virtual/range {v16 .. v16}, Lcom/google/android/gms/b/bu;->o()J

    move-result-wide v2

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object/from16 v0, v17

    iput-object v2, v0, Lcom/google/android/gms/b/do$e;->w:Ljava/lang/Integer;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->d()Lcom/google/android/gms/b/by;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/by;->Q()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    move-object/from16 v0, v17

    iput-object v2, v0, Lcom/google/android/gms/b/do$e;->r:Ljava/lang/Long;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->t()Lcom/google/android/gms/common/util/c;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/common/util/c;->a()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    move-object/from16 v0, v17

    iput-object v2, v0, Lcom/google/android/gms/b/do$e;->d:Ljava/lang/Long;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    move-object/from16 v0, v17

    iput-object v2, v0, Lcom/google/android/gms/b/do$e;->z:Ljava/lang/Boolean;

    move-object/from16 v0, v17

    iget-object v2, v0, Lcom/google/android/gms/b/do$e;->e:Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    move-object/from16 v0, v16

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/b/bu;->a(J)V

    move-object/from16 v0, v17

    iget-object v2, v0, Lcom/google/android/gms/b/do$e;->f:Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    move-object/from16 v0, v16

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/b/bu;->b(J)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v2

    move-object/from16 v0, v16

    invoke-virtual {v2, v0}, Lcom/google/android/gms/b/bz;->a(Lcom/google/android/gms/b/bu;)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/bz;->y()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/bz;->z()V

    :try_start_4
    invoke-virtual {v13}, Lcom/google/android/gms/b/do$d;->f()I

    move-result v2

    new-array v2, v2, [B

    invoke-static {v2}, Lcom/google/android/gms/b/lg;->a([B)Lcom/google/android/gms/b/lg;

    move-result-object v3

    invoke-virtual {v13, v3}, Lcom/google/android/gms/b/do$d;->a(Lcom/google/android/gms/b/lg;)V

    invoke-virtual {v3}, Lcom/google/android/gms/b/lg;->b()V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->o()Lcom/google/android/gms/b/dl;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/google/android/gms/b/dl;->a([B)[B
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    move-result-object v2

    goto/16 :goto_0

    :cond_8
    const/4 v4, 0x0

    goto/16 :goto_4

    :cond_9
    const/4 v2, 0x0

    goto/16 :goto_6

    :catch_0
    move-exception v2

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/b/co;->x()Lcom/google/android/gms/b/co$a;

    move-result-object v3

    const-string v4, "Data loss. Failed to bundle and serialize. appId"

    invoke-static/range {p2 .. p2}, Lcom/google/android/gms/b/co;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v3, v4, v5, v2}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v2, 0x0

    goto/16 :goto_0

    :cond_a
    move-wide v2, v4

    goto/16 :goto_5
.end method

.method protected c()V
    .locals 5

    const/4 v4, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->C()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->p()Lcom/google/android/gms/b/bz;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/bz;->E()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->e()Lcom/google/android/gms/b/cr;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/b/cr;->c:Lcom/google/android/gms/b/cr$b;

    invoke-virtual {v0}, Lcom/google/android/gms/b/cr$b;->a()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->e()Lcom/google/android/gms/b/cr;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/b/cr;->c:Lcom/google/android/gms/b/cr$b;

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->t()Lcom/google/android/gms/common/util/c;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/common/util/c;->a()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/b/cr$b;->a(J)V

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->b()Z

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->G()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->o()Lcom/google/android/gms/b/dl;

    move-result-object v0

    const-string v1, "android.permission.INTERNET"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/dl;->i(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->x()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v1, "App is missing INTERNET permission"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;)V

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->o()Lcom/google/android/gms/b/dl;

    move-result-object v0

    const-string v1, "android.permission.ACCESS_NETWORK_STATE"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/dl;->i(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->x()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v1, "App is missing ACCESS_NETWORK_STATE permission"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->d()Lcom/google/android/gms/b/by;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/by;->R()Z

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->s()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/b/at;->b(Landroid/content/Context;)Lcom/google/android/gms/b/as;

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->s()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v4}, Lcom/google/android/gms/b/cs;->a(Landroid/content/Context;Z)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->x()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v1, "AppMeasurementReceiver not registered/enabled"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;)V

    :cond_3
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->s()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v4}, Lcom/google/android/gms/b/dd;->a(Landroid/content/Context;Z)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->x()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v1, "AppMeasurementService not registered/enabled"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;)V

    :cond_4
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->x()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v1, "Uploading is not possible. App measurement disabled"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;)V

    :cond_5
    :goto_0
    invoke-direct {p0}, Lcom/google/android/gms/b/cv;->Q()V

    return-void

    :cond_6
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->d()Lcom/google/android/gms/b/by;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/by;->R()Z

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->x()Lcom/google/android/gms/b/cl;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/cl;->y()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->e()Lcom/google/android/gms/b/cr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/cr;->A()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_8

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->e()Lcom/google/android/gms/b/cr;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->x()Lcom/google/android/gms/b/cl;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/b/cl;->y()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/cr;->c(Ljava/lang/String;)V

    :cond_7
    :goto_1
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->d()Lcom/google/android/gms/b/by;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/by;->R()Z

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->x()Lcom/google/android/gms/b/cl;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/cl;->y()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->l()Lcom/google/android/gms/b/da;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/da;->y()V

    goto :goto_0

    :cond_8
    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->x()Lcom/google/android/gms/b/cl;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/b/cl;->y()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->f()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->B()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v1, "Rechecking which service to use due to a GMP App Id change"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->e()Lcom/google/android/gms/b/cr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/cr;->C()V

    iget-object v0, p0, Lcom/google/android/gms/b/cv;->q:Lcom/google/android/gms/b/dc;

    invoke-virtual {v0}, Lcom/google/android/gms/b/dc;->C()V

    iget-object v0, p0, Lcom/google/android/gms/b/cv;->q:Lcom/google/android/gms/b/dc;

    invoke-virtual {v0}, Lcom/google/android/gms/b/dc;->A()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->e()Lcom/google/android/gms/b/cr;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/b/cv;->x()Lcom/google/android/gms/b/cl;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/b/cl;->y()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/cr;->c(Ljava/lang/String;)V

    goto :goto_1
.end method

.method c(Lcom/google/android/gms/b/bv;J)V
    .locals 6

    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    const-string v0, "_et"

    const-wide/16 v4, 0x1

    invoke-virtual {v3, v0, v4, v5}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    new-instance v0, Lcom/google/android/gms/b/ch;

    const-string v1, "_e"

    new-instance v2, Lcom/google/android/gms/b/ce;

    invoke-direct {v2, v3}, Lcom/google/android/gms/b/ce;-><init>(Landroid/os/Bundle;)V

    const-string v3, "auto"

    move-wide v4, p2

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/b/ch;-><init>(Ljava/lang/String;Lcom/google/android/gms/b/ce;Ljava/lang/String;J)V

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/b/cv;->a(Lcom/google/android/gms/b/ch;Lcom/google/android/gms/b/bv;)V

    return-void
.end method

.method public d()Lcom/google/android/gms/b/by;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/cv;->c:Lcom/google/android/gms/b/by;

    return-object v0
.end method

.method d(Lcom/google/android/gms/b/bv;J)V
    .locals 6

    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    new-instance v0, Lcom/google/android/gms/b/ch;

    const-string v1, "_cd"

    new-instance v2, Lcom/google/android/gms/b/ce;

    invoke-direct {v2, v3}, Lcom/google/android/gms/b/ce;-><init>(Landroid/os/Bundle;)V

    const-string v3, "auto"

    move-wide v4, p2

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/b/ch;-><init>(Ljava/lang/String;Lcom/google/android/gms/b/ce;Ljava/lang/String;J)V

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/b/cv;->a(Lcom/google/android/gms/b/ch;Lcom/google/android/gms/b/bv;)V

    return-void
.end method

.method public e()Lcom/google/android/gms/b/cr;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/cv;->d:Lcom/google/android/gms/b/cr;

    invoke-direct {p0, v0}, Lcom/google/android/gms/b/cv;->a(Lcom/google/android/gms/b/cx;)V

    iget-object v0, p0, Lcom/google/android/gms/b/cv;->d:Lcom/google/android/gms/b/cr;

    return-object v0
.end method

.method public f()Lcom/google/android/gms/b/co;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/cv;->e:Lcom/google/android/gms/b/co;

    invoke-direct {p0, v0}, Lcom/google/android/gms/b/cv;->b(Lcom/google/android/gms/b/cy;)V

    iget-object v0, p0, Lcom/google/android/gms/b/cv;->e:Lcom/google/android/gms/b/co;

    return-object v0
.end method

.method public g()Lcom/google/android/gms/b/co;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/cv;->e:Lcom/google/android/gms/b/co;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/cv;->e:Lcom/google/android/gms/b/co;

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->P()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/cv;->e:Lcom/google/android/gms/b/co;

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public h()Lcom/google/android/gms/b/cu;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/cv;->f:Lcom/google/android/gms/b/cu;

    invoke-direct {p0, v0}, Lcom/google/android/gms/b/cv;->b(Lcom/google/android/gms/b/cy;)V

    iget-object v0, p0, Lcom/google/android/gms/b/cv;->f:Lcom/google/android/gms/b/cu;

    return-object v0
.end method

.method public i()Lcom/google/android/gms/b/de;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/cv;->g:Lcom/google/android/gms/b/de;

    invoke-direct {p0, v0}, Lcom/google/android/gms/b/cv;->b(Lcom/google/android/gms/b/cy;)V

    iget-object v0, p0, Lcom/google/android/gms/b/cv;->g:Lcom/google/android/gms/b/de;

    return-object v0
.end method

.method public j()Lcom/google/android/gms/b/ct;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/cv;->h:Lcom/google/android/gms/b/ct;

    invoke-direct {p0, v0}, Lcom/google/android/gms/b/cv;->b(Lcom/google/android/gms/b/cy;)V

    iget-object v0, p0, Lcom/google/android/gms/b/cv;->h:Lcom/google/android/gms/b/ct;

    return-object v0
.end method

.method k()Lcom/google/android/gms/b/cu;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/cv;->f:Lcom/google/android/gms/b/cu;

    return-object v0
.end method

.method public l()Lcom/google/android/gms/b/da;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/cv;->s:Lcom/google/android/gms/b/da;

    invoke-direct {p0, v0}, Lcom/google/android/gms/b/cv;->b(Lcom/google/android/gms/b/cy;)V

    iget-object v0, p0, Lcom/google/android/gms/b/cv;->s:Lcom/google/android/gms/b/da;

    return-object v0
.end method

.method public m()Lcom/google/android/gms/measurement/AppMeasurement;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/cv;->i:Lcom/google/android/gms/measurement/AppMeasurement;

    return-object v0
.end method

.method public n()Lcom/google/firebase/a/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/cv;->j:Lcom/google/firebase/a/a;

    return-object v0
.end method

.method public o()Lcom/google/android/gms/b/dl;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/cv;->k:Lcom/google/android/gms/b/dl;

    invoke-direct {p0, v0}, Lcom/google/android/gms/b/cv;->a(Lcom/google/android/gms/b/cx;)V

    iget-object v0, p0, Lcom/google/android/gms/b/cv;->k:Lcom/google/android/gms/b/dl;

    return-object v0
.end method

.method public p()Lcom/google/android/gms/b/bz;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/cv;->l:Lcom/google/android/gms/b/bz;

    invoke-direct {p0, v0}, Lcom/google/android/gms/b/cv;->b(Lcom/google/android/gms/b/cy;)V

    iget-object v0, p0, Lcom/google/android/gms/b/cv;->l:Lcom/google/android/gms/b/bz;

    return-object v0
.end method

.method public q()Lcom/google/android/gms/b/cm;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/cv;->m:Lcom/google/android/gms/b/cm;

    invoke-direct {p0, v0}, Lcom/google/android/gms/b/cv;->b(Lcom/google/android/gms/b/cy;)V

    iget-object v0, p0, Lcom/google/android/gms/b/cv;->m:Lcom/google/android/gms/b/cm;

    return-object v0
.end method

.method public r()Lcom/google/android/gms/b/cp;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/cv;->n:Lcom/google/android/gms/b/cp;

    invoke-direct {p0, v0}, Lcom/google/android/gms/b/cv;->b(Lcom/google/android/gms/b/cy;)V

    iget-object v0, p0, Lcom/google/android/gms/b/cv;->n:Lcom/google/android/gms/b/cp;

    return-object v0
.end method

.method public s()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/cv;->b:Landroid/content/Context;

    return-object v0
.end method

.method public t()Lcom/google/android/gms/common/util/c;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/cv;->o:Lcom/google/android/gms/common/util/c;

    return-object v0
.end method

.method public u()Lcom/google/android/gms/b/db;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/cv;->p:Lcom/google/android/gms/b/db;

    invoke-direct {p0, v0}, Lcom/google/android/gms/b/cv;->b(Lcom/google/android/gms/b/cy;)V

    iget-object v0, p0, Lcom/google/android/gms/b/cv;->p:Lcom/google/android/gms/b/db;

    return-object v0
.end method

.method public v()Lcom/google/android/gms/b/dc;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/cv;->q:Lcom/google/android/gms/b/dc;

    invoke-direct {p0, v0}, Lcom/google/android/gms/b/cv;->b(Lcom/google/android/gms/b/cy;)V

    iget-object v0, p0, Lcom/google/android/gms/b/cv;->q:Lcom/google/android/gms/b/dc;

    return-object v0
.end method

.method public w()Lcom/google/android/gms/b/cb;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/cv;->r:Lcom/google/android/gms/b/cb;

    invoke-direct {p0, v0}, Lcom/google/android/gms/b/cv;->b(Lcom/google/android/gms/b/cy;)V

    iget-object v0, p0, Lcom/google/android/gms/b/cv;->r:Lcom/google/android/gms/b/cb;

    return-object v0
.end method

.method public x()Lcom/google/android/gms/b/cl;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/cv;->t:Lcom/google/android/gms/b/cl;

    invoke-direct {p0, v0}, Lcom/google/android/gms/b/cv;->b(Lcom/google/android/gms/b/cy;)V

    iget-object v0, p0, Lcom/google/android/gms/b/cv;->t:Lcom/google/android/gms/b/cl;

    return-object v0
.end method

.method public y()Lcom/google/android/gms/b/cq;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/b/cv;->u:Lcom/google/android/gms/b/cq;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Network broadcast receiver not created"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/cv;->u:Lcom/google/android/gms/b/cq;

    return-object v0
.end method

.method public z()Lcom/google/android/gms/b/dh;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/cv;->v:Lcom/google/android/gms/b/dh;

    invoke-direct {p0, v0}, Lcom/google/android/gms/b/cv;->b(Lcom/google/android/gms/b/cy;)V

    iget-object v0, p0, Lcom/google/android/gms/b/cv;->v:Lcom/google/android/gms/b/dh;

    return-object v0
.end method
