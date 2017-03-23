.class public Lcom/google/android/gms/b/dc;
.super Lcom/google/android/gms/b/cy;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/b/dc$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/b/dc$a;

.field private b:Lcom/google/android/gms/b/ck;

.field private c:Ljava/lang/Boolean;

.field private final d:Lcom/google/android/gms/b/ca;

.field private final e:Lcom/google/android/gms/b/df;

.field private final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Lcom/google/android/gms/b/ca;


# direct methods
.method protected constructor <init>(Lcom/google/android/gms/b/cv;)V
    .locals 2

    invoke-direct {p0, p1}, Lcom/google/android/gms/b/cy;-><init>(Lcom/google/android/gms/b/cv;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/b/dc;->f:Ljava/util/List;

    new-instance v0, Lcom/google/android/gms/b/df;

    invoke-virtual {p1}, Lcom/google/android/gms/b/cv;->t()Lcom/google/android/gms/common/util/c;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/b/df;-><init>(Lcom/google/android/gms/common/util/c;)V

    iput-object v0, p0, Lcom/google/android/gms/b/dc;->e:Lcom/google/android/gms/b/df;

    new-instance v0, Lcom/google/android/gms/b/dc$a;

    invoke-direct {v0, p0}, Lcom/google/android/gms/b/dc$a;-><init>(Lcom/google/android/gms/b/dc;)V

    iput-object v0, p0, Lcom/google/android/gms/b/dc;->a:Lcom/google/android/gms/b/dc$a;

    new-instance v0, Lcom/google/android/gms/b/dc$1;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/b/dc$1;-><init>(Lcom/google/android/gms/b/dc;Lcom/google/android/gms/b/cv;)V

    iput-object v0, p0, Lcom/google/android/gms/b/dc;->d:Lcom/google/android/gms/b/ca;

    new-instance v0, Lcom/google/android/gms/b/dc$2;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/b/dc$2;-><init>(Lcom/google/android/gms/b/dc;Lcom/google/android/gms/b/cv;)V

    iput-object v0, p0, Lcom/google/android/gms/b/dc;->g:Lcom/google/android/gms/b/ca;

    return-void
.end method

.method private D()V
    .locals 4

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->e()V

    iget-object v0, p0, Lcom/google/android/gms/b/dc;->e:Lcom/google/android/gms/b/df;

    invoke-virtual {v0}, Lcom/google/android/gms/b/df;->a()V

    iget-object v0, p0, Lcom/google/android/gms/b/dc;->d:Lcom/google/android/gms/b/ca;

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->w()Lcom/google/android/gms/b/by;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/b/by;->N()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/b/ca;->a(J)V

    return-void
.end method

.method private E()Z
    .locals 4

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->w()Lcom/google/android/gms/b/by;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/by;->R()Z

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->n()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->n()Landroid/content/Context;

    move-result-object v2

    const-string v3, "com.google.android.gms.measurement.AppMeasurementService"

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    const/high16 v2, 0x10000

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private F()V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->e()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->x()Z

    move-result v0

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->u()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->D()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v1, "Inactivity, disconnecting from the service"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->C()V

    goto :goto_0
.end method

.method private G()V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->e()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->A()V

    return-void
.end method

.method private H()V
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->e()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->u()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->D()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v1, "Processing queued up service tasks"

    iget-object v2, p0, Lcom/google/android/gms/b/dc;->f:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/b/dc;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->t()Lcom/google/android/gms/b/cu;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/google/android/gms/b/cu;->a(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/dc;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/google/android/gms/b/dc;->g:Lcom/google/android/gms/b/ca;

    invoke-virtual {v0}, Lcom/google/android/gms/b/ca;->c()V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/b/dc;)Lcom/google/android/gms/b/dc$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/dc;->a:Lcom/google/android/gms/b/dc$a;

    return-object v0
.end method

.method private a(Landroid/content/ComponentName;)V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->e()V

    iget-object v0, p0, Lcom/google/android/gms/b/dc;->b:Lcom/google/android/gms/b/ck;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/b/dc;->b:Lcom/google/android/gms/b/ck;

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->u()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->D()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v1, "Disconnected from device MeasurementService"

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/google/android/gms/b/dc;->G()V

    :cond_0
    return-void
.end method

.method private a(Lcom/google/android/gms/b/ck;)V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->e()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/b/dc;->b:Lcom/google/android/gms/b/ck;

    invoke-direct {p0}, Lcom/google/android/gms/b/dc;->D()V

    invoke-direct {p0}, Lcom/google/android/gms/b/dc;->H()V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/b/dc;Landroid/content/ComponentName;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/b/dc;->a(Landroid/content/ComponentName;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/b/dc;Lcom/google/android/gms/b/ck;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/b/dc;->a(Lcom/google/android/gms/b/ck;)V

    return-void
.end method

.method private a(Ljava/lang/Runnable;)V
    .locals 4

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->e()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->x()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/dc;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->w()Lcom/google/android/gms/b/by;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/by;->Z()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-ltz v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->u()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->x()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v1, "Discarding data. Max runnable queue size reached"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/b/dc;->f:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/b/dc;->g:Lcom/google/android/gms/b/ca;

    const-wide/32 v2, 0xea60

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/b/ca;->a(J)V

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->A()V

    goto :goto_0
.end method

.method static synthetic b(Lcom/google/android/gms/b/dc;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/b/dc;->F()V

    return-void
.end method

.method static synthetic c(Lcom/google/android/gms/b/dc;)Lcom/google/android/gms/b/ck;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/dc;->b:Lcom/google/android/gms/b/ck;

    return-object v0
.end method

.method static synthetic d(Lcom/google/android/gms/b/dc;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/b/dc;->D()V

    return-void
.end method


# virtual methods
.method A()V
    .locals 4

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->e()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->Q()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->x()Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/dc;->c:Ljava/lang/Boolean;

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->v()Lcom/google/android/gms/b/cr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/cr;->B()Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/dc;->c:Ljava/lang/Boolean;

    iget-object v0, p0, Lcom/google/android/gms/b/dc;->c:Ljava/lang/Boolean;

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->u()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->D()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v1, "State of service unknown"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->B()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/dc;->c:Ljava/lang/Boolean;

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->v()Lcom/google/android/gms/b/cr;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/dc;->c:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/cr;->a(Z)V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/b/dc;->c:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->u()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->D()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v1, "Using measurement service"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/b/dc;->a:Lcom/google/android/gms/b/dc$a;

    invoke-virtual {v0}, Lcom/google/android/gms/b/dc$a;->a()V

    goto :goto_0

    :cond_2
    invoke-direct {p0}, Lcom/google/android/gms/b/dc;->E()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->u()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->D()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v1, "Using local app measurement service"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;)V

    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.google.android.gms.measurement.START"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    new-instance v1, Landroid/content/ComponentName;

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->n()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->w()Lcom/google/android/gms/b/by;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/b/by;->R()Z

    const-string v3, "com.google.android.gms.measurement.AppMeasurementService"

    invoke-direct {v1, v2, v3}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    iget-object v1, p0, Lcom/google/android/gms/b/dc;->a:Lcom/google/android/gms/b/dc$a;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/b/dc$a;->a(Landroid/content/Intent;)V

    goto/16 :goto_0

    :cond_3
    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->u()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->x()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v1, "Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;)V

    goto/16 :goto_0
.end method

.method protected B()Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->e()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->Q()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->w()Lcom/google/android/gms/b/by;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/by;->R()Z

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->u()Lcom/google/android/gms/b/co;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/co;->D()Lcom/google/android/gms/b/co$a;

    move-result-object v2

    const-string v3, "Checking service availability"

    invoke-virtual {v2, v3}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/gms/common/k;->b()Lcom/google/android/gms/common/k;

    move-result-object v2

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->n()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/common/k;->a(Landroid/content/Context;)I

    move-result v2

    sparse-switch v2, :sswitch_data_0

    move v0, v1

    :goto_0
    return v0

    :sswitch_0
    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->u()Lcom/google/android/gms/b/co;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/b/co;->D()Lcom/google/android/gms/b/co$a;

    move-result-object v1

    const-string v2, "Service available"

    invoke-virtual {v1, v2}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;)V

    goto :goto_0

    :sswitch_1
    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->u()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->D()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v2, "Service missing"

    invoke-virtual {v0, v2}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;)V

    move v0, v1

    goto :goto_0

    :sswitch_2
    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->u()Lcom/google/android/gms/b/co;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/b/co;->z()Lcom/google/android/gms/b/co$a;

    move-result-object v1

    const-string v2, "Service updating"

    invoke-virtual {v1, v2}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;)V

    goto :goto_0

    :sswitch_3
    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->u()Lcom/google/android/gms/b/co;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/b/co;->C()Lcom/google/android/gms/b/co$a;

    move-result-object v1

    const-string v2, "Service container out of date"

    invoke-virtual {v1, v2}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;)V

    goto :goto_0

    :sswitch_4
    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->u()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->z()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v2, "Service disabled"

    invoke-virtual {v0, v2}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;)V

    move v0, v1

    goto :goto_0

    :sswitch_5
    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->u()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->z()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v2, "Service invalid"

    invoke-virtual {v0, v2}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;)V

    move v0, v1

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
        0x2 -> :sswitch_3
        0x3 -> :sswitch_4
        0x9 -> :sswitch_5
        0x12 -> :sswitch_2
    .end sparse-switch
.end method

.method public C()V
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->e()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->Q()V

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/common/a/a;->a()Lcom/google/android/gms/common/a/a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->n()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/b/dc;->a:Lcom/google/android/gms/b/dc$a;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/a/a;->a(Landroid/content/Context;Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    :goto_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/b/dc;->b:Lcom/google/android/gms/b/ck;

    return-void

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_0
.end method

.method protected a()V
    .locals 0

    return-void
.end method

.method protected a(Lcom/google/android/gms/b/ch;Ljava/lang/String;)V
    .locals 6

    const/4 v3, 0x1

    const/4 v0, 0x0

    invoke-static {p1}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->e()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->Q()V

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xb

    if-lt v1, v2, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->w()Lcom/google/android/gms/b/by;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/b/by;->R()Z

    move v2, v3

    :goto_0
    if-eqz v2, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->o()Lcom/google/android/gms/b/cm;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/b/cm;->a(Lcom/google/android/gms/b/ch;)Z

    move-result v1

    if-eqz v1, :cond_1

    :goto_1
    new-instance v0, Lcom/google/android/gms/b/dc$4;

    move-object v1, p0

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/b/dc$4;-><init>(Lcom/google/android/gms/b/dc;ZZLcom/google/android/gms/b/ch;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/b/dc;->a(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    move v2, v0

    goto :goto_0

    :cond_1
    move v3, v0

    goto :goto_1
.end method

.method a(Lcom/google/android/gms/b/ck;Lcom/google/android/gms/common/internal/safeparcel/a;)V
    .locals 10

    const/4 v2, 0x0

    const/16 v5, 0x64

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->e()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->c()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->Q()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->w()Lcom/google/android/gms/b/by;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/by;->R()Z

    const/4 v0, 0x1

    move v1, v0

    :goto_0
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->w()Lcom/google/android/gms/b/by;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/by;->ad()I

    move v4, v2

    move v3, v5

    :goto_1
    const/16 v0, 0x3e9

    if-ge v4, v0, :cond_5

    if-ne v3, v5, :cond_5

    if-eqz v1, :cond_6

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->o()Lcom/google/android/gms/b/cm;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/google/android/gms/b/cm;->a(I)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-interface {v6, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    move v3, v0

    :goto_2
    if-eqz p2, :cond_0

    if-ge v3, v5, :cond_0

    invoke-interface {v6, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/internal/safeparcel/a;

    instance-of v8, v0, Lcom/google/android/gms/b/ch;

    if-eqz v8, :cond_2

    :try_start_0
    check-cast v0, Lcom/google/android/gms/b/ch;

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->i()Lcom/google/android/gms/b/cl;

    move-result-object v8

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->u()Lcom/google/android/gms/b/co;

    move-result-object v9

    invoke-virtual {v9}, Lcom/google/android/gms/b/co;->E()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Lcom/google/android/gms/b/cl;->a(Ljava/lang/String;)Lcom/google/android/gms/b/bv;

    move-result-object v8

    invoke-interface {p1, v0, v8}, Lcom/google/android/gms/b/ck;->a(Lcom/google/android/gms/b/ch;Lcom/google/android/gms/b/bv;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception v0

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->u()Lcom/google/android/gms/b/co;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/android/gms/b/co;->x()Lcom/google/android/gms/b/co$a;

    move-result-object v8

    const-string v9, "Failed to send event to the service"

    invoke-virtual {v8, v9, v0}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    move v1, v2

    goto :goto_0

    :cond_2
    instance-of v8, v0, Lcom/google/android/gms/b/di;

    if-eqz v8, :cond_3

    :try_start_1
    check-cast v0, Lcom/google/android/gms/b/di;

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->i()Lcom/google/android/gms/b/cl;

    move-result-object v8

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->u()Lcom/google/android/gms/b/co;

    move-result-object v9

    invoke-virtual {v9}, Lcom/google/android/gms/b/co;->E()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Lcom/google/android/gms/b/cl;->a(Ljava/lang/String;)Lcom/google/android/gms/b/bv;

    move-result-object v8

    invoke-interface {p1, v0, v8}, Lcom/google/android/gms/b/ck;->a(Lcom/google/android/gms/b/di;Lcom/google/android/gms/b/bv;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :catch_1
    move-exception v0

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->u()Lcom/google/android/gms/b/co;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/android/gms/b/co;->x()Lcom/google/android/gms/b/co$a;

    move-result-object v8

    const-string v9, "Failed to send attribute to the service"

    invoke-virtual {v8, v9, v0}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->u()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->x()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v8, "Discarding data. Unrecognized parcel type."

    invoke-virtual {v0, v8}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;)V

    goto :goto_3

    :cond_4
    add-int/lit8 v0, v4, 0x1

    move v4, v0

    goto/16 :goto_1

    :cond_5
    return-void

    :cond_6
    move v3, v2

    goto :goto_2
.end method

.method protected a(Lcom/google/android/gms/b/di;)V
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->e()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->Q()V

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0xb

    if-lt v2, v3, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->w()Lcom/google/android/gms/b/by;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/by;->R()Z

    move v2, v0

    :goto_0
    if-eqz v2, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->o()Lcom/google/android/gms/b/cm;

    move-result-object v2

    invoke-virtual {v2, p1}, Lcom/google/android/gms/b/cm;->a(Lcom/google/android/gms/b/di;)Z

    move-result v2

    if-eqz v2, :cond_1

    :goto_1
    new-instance v1, Lcom/google/android/gms/b/dc$5;

    invoke-direct {v1, p0, v0, p1}, Lcom/google/android/gms/b/dc$5;-><init>(Lcom/google/android/gms/b/dc;ZLcom/google/android/gms/b/di;)V

    invoke-direct {p0, v1}, Lcom/google/android/gms/b/dc;->a(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    move v2, v1

    goto :goto_0

    :cond_1
    move v0, v1

    goto :goto_1
.end method

.method protected a(Lcom/google/android/gms/measurement/AppMeasurement$f;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->e()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->Q()V

    new-instance v0, Lcom/google/android/gms/b/dc$8;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/b/dc$8;-><init>(Lcom/google/android/gms/b/dc;Lcom/google/android/gms/measurement/AppMeasurement$f;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/b/dc;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public a(Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/atomic/AtomicReference",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->e()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->Q()V

    new-instance v0, Lcom/google/android/gms/b/dc$6;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/b/dc$6;-><init>(Lcom/google/android/gms/b/dc;Ljava/util/concurrent/atomic/AtomicReference;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/b/dc;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public bridge synthetic b()V
    .locals 0

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->b()V

    return-void
.end method

.method public bridge synthetic c()V
    .locals 0

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->c()V

    return-void
.end method

.method public bridge synthetic d()V
    .locals 0

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->d()V

    return-void
.end method

.method public bridge synthetic e()V
    .locals 0

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->e()V

    return-void
.end method

.method public bridge synthetic f()Lcom/google/android/gms/b/bt;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->f()Lcom/google/android/gms/b/bt;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic g()Lcom/google/android/gms/b/bx;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->g()Lcom/google/android/gms/b/bx;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic h()Lcom/google/android/gms/b/da;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->h()Lcom/google/android/gms/b/da;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic i()Lcom/google/android/gms/b/cl;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->i()Lcom/google/android/gms/b/cl;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic j()Lcom/google/android/gms/b/cb;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->j()Lcom/google/android/gms/b/cb;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic k()Lcom/google/android/gms/b/dc;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->k()Lcom/google/android/gms/b/dc;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic l()Lcom/google/android/gms/b/db;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->l()Lcom/google/android/gms/b/db;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic m()Lcom/google/android/gms/common/util/c;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->m()Lcom/google/android/gms/common/util/c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic n()Landroid/content/Context;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->n()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic o()Lcom/google/android/gms/b/cm;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->o()Lcom/google/android/gms/b/cm;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic p()Lcom/google/android/gms/b/bz;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->p()Lcom/google/android/gms/b/bz;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic q()Lcom/google/android/gms/b/dl;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->q()Lcom/google/android/gms/b/dl;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic r()Lcom/google/android/gms/b/ct;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->r()Lcom/google/android/gms/b/ct;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic s()Lcom/google/android/gms/b/de;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->s()Lcom/google/android/gms/b/de;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic t()Lcom/google/android/gms/b/cu;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->t()Lcom/google/android/gms/b/cu;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic u()Lcom/google/android/gms/b/co;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->u()Lcom/google/android/gms/b/co;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic v()Lcom/google/android/gms/b/cr;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->v()Lcom/google/android/gms/b/cr;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic w()Lcom/google/android/gms/b/by;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/b/cy;->w()Lcom/google/android/gms/b/by;

    move-result-object v0

    return-object v0
.end method

.method public x()Z
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->e()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->Q()V

    iget-object v0, p0, Lcom/google/android/gms/b/dc;->b:Lcom/google/android/gms/b/ck;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected y()V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->e()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->Q()V

    new-instance v0, Lcom/google/android/gms/b/dc$3;

    invoke-direct {v0, p0}, Lcom/google/android/gms/b/dc$3;-><init>(Lcom/google/android/gms/b/dc;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/b/dc;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method protected z()V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->e()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/dc;->Q()V

    new-instance v0, Lcom/google/android/gms/b/dc$7;

    invoke-direct {v0, p0}, Lcom/google/android/gms/b/dc$7;-><init>(Lcom/google/android/gms/b/dc;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/b/dc;->a(Ljava/lang/Runnable;)V

    return-void
.end method
