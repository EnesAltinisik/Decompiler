.class public Lcom/google/android/gms/b/yf;
.super Lcom/google/android/gms/b/zd;

# interfaces
.implements Lcom/google/android/gms/b/ye;


# annotations
.annotation runtime Lcom/google/android/gms/b/vz;
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/b/yu$a;

.field private final b:Landroid/content/Context;

.field private final c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/util/concurrent/Future;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/b/xz;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/b/ya;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Ljava/lang/Object;

.field private final i:Lcom/google/android/gms/b/xo;

.field private final j:J


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/b/yu$a;Lcom/google/android/gms/b/xo;)V
    .locals 6

    sget-object v0, Lcom/google/android/gms/b/pr;->aC:Lcom/google/android/gms/b/pn;

    invoke-virtual {v0}, Lcom/google/android/gms/b/pn;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/b/yf;-><init>(Landroid/content/Context;Lcom/google/android/gms/b/yu$a;Lcom/google/android/gms/b/xo;J)V

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Lcom/google/android/gms/b/yu$a;Lcom/google/android/gms/b/xo;J)V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/b/zd;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/b/yf;->c:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/b/yf;->d:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/b/yf;->e:Ljava/util/HashMap;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/b/yf;->f:Ljava/util/List;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/b/yf;->g:Ljava/util/HashSet;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/b/yf;->h:Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/b/yf;->b:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/b/yf;->a:Lcom/google/android/gms/b/yu$a;

    iput-object p3, p0, Lcom/google/android/gms/b/yf;->i:Lcom/google/android/gms/b/xo;

    iput-wide p4, p0, Lcom/google/android/gms/b/yf;->j:J

    return-void
.end method

.method private static a(I)I
    .locals 1

    packed-switch p0, :pswitch_data_0

    const/4 v0, 0x6

    :goto_0
    return v0

    :pswitch_0
    const/4 v0, 0x0

    goto :goto_0

    :pswitch_1
    const/4 v0, 0x1

    goto :goto_0

    :pswitch_2
    const/4 v0, 0x2

    goto :goto_0

    :pswitch_3
    const/4 v0, 0x3

    goto :goto_0

    :pswitch_4
    const/4 v0, 0x4

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_1
        :pswitch_2
        :pswitch_4
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method

.method static synthetic a(Lcom/google/android/gms/b/yf;)Lcom/google/android/gms/b/xo;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/yf;->i:Lcom/google/android/gms/b/xo;

    return-object v0
.end method

.method private a(ILjava/lang/String;Lcom/google/android/gms/b/td;)Lcom/google/android/gms/b/yu;
    .locals 39

    new-instance v2, Lcom/google/android/gms/b/yu;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/google/android/gms/b/yf;->a:Lcom/google/android/gms/b/yu$a;

    iget-object v3, v3, Lcom/google/android/gms/b/yu$a;->a:Lcom/google/android/gms/b/wf;

    iget-object v3, v3, Lcom/google/android/gms/b/wf;->c:Lcom/google/android/gms/b/ns;

    const/4 v4, 0x0

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/google/android/gms/b/yf;->a:Lcom/google/android/gms/b/yu$a;

    iget-object v5, v5, Lcom/google/android/gms/b/yu$a;->b:Lcom/google/android/gms/b/wi;

    iget-object v5, v5, Lcom/google/android/gms/b/wi;->d:Ljava/util/List;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/b/yf;->a:Lcom/google/android/gms/b/yu$a;

    iget-object v6, v6, Lcom/google/android/gms/b/yu$a;->b:Lcom/google/android/gms/b/wi;

    iget-object v7, v6, Lcom/google/android/gms/b/wi;->f:Ljava/util/List;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/b/yf;->a:Lcom/google/android/gms/b/yu$a;

    iget-object v6, v6, Lcom/google/android/gms/b/yu$a;->b:Lcom/google/android/gms/b/wi;

    iget-object v8, v6, Lcom/google/android/gms/b/wi;->j:Ljava/util/List;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/b/yf;->a:Lcom/google/android/gms/b/yu$a;

    iget-object v6, v6, Lcom/google/android/gms/b/yu$a;->b:Lcom/google/android/gms/b/wi;

    iget v9, v6, Lcom/google/android/gms/b/wi;->l:I

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/b/yf;->a:Lcom/google/android/gms/b/yu$a;

    iget-object v6, v6, Lcom/google/android/gms/b/yu$a;->b:Lcom/google/android/gms/b/wi;

    iget-wide v10, v6, Lcom/google/android/gms/b/wi;->k:J

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/b/yf;->a:Lcom/google/android/gms/b/yu$a;

    iget-object v6, v6, Lcom/google/android/gms/b/yu$a;->a:Lcom/google/android/gms/b/wf;

    iget-object v12, v6, Lcom/google/android/gms/b/wf;->i:Ljava/lang/String;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/b/yf;->a:Lcom/google/android/gms/b/yu$a;

    iget-object v6, v6, Lcom/google/android/gms/b/yu$a;->b:Lcom/google/android/gms/b/wi;

    iget-boolean v13, v6, Lcom/google/android/gms/b/wi;->h:Z

    const/4 v15, 0x0

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/b/yf;->a:Lcom/google/android/gms/b/yu$a;

    iget-object v0, v6, Lcom/google/android/gms/b/yu$a;->c:Lcom/google/android/gms/b/te;

    move-object/from16 v17, v0

    const/16 v18, 0x0

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/b/yf;->a:Lcom/google/android/gms/b/yu$a;

    iget-object v6, v6, Lcom/google/android/gms/b/yu$a;->b:Lcom/google/android/gms/b/wi;

    iget-wide v0, v6, Lcom/google/android/gms/b/wi;->i:J

    move-wide/from16 v19, v0

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/b/yf;->a:Lcom/google/android/gms/b/yu$a;

    iget-object v0, v6, Lcom/google/android/gms/b/yu$a;->d:Lcom/google/android/gms/b/nx;

    move-object/from16 v21, v0

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/b/yf;->a:Lcom/google/android/gms/b/yu$a;

    iget-object v6, v6, Lcom/google/android/gms/b/yu$a;->b:Lcom/google/android/gms/b/wi;

    iget-wide v0, v6, Lcom/google/android/gms/b/wi;->g:J

    move-wide/from16 v22, v0

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/b/yf;->a:Lcom/google/android/gms/b/yu$a;

    iget-wide v0, v6, Lcom/google/android/gms/b/yu$a;->f:J

    move-wide/from16 v24, v0

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/b/yf;->a:Lcom/google/android/gms/b/yu$a;

    iget-object v6, v6, Lcom/google/android/gms/b/yu$a;->b:Lcom/google/android/gms/b/wi;

    iget-wide v0, v6, Lcom/google/android/gms/b/wi;->n:J

    move-wide/from16 v26, v0

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/b/yf;->a:Lcom/google/android/gms/b/yu$a;

    iget-object v6, v6, Lcom/google/android/gms/b/yu$a;->b:Lcom/google/android/gms/b/wi;

    iget-object v0, v6, Lcom/google/android/gms/b/wi;->o:Ljava/lang/String;

    move-object/from16 v28, v0

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/b/yf;->a:Lcom/google/android/gms/b/yu$a;

    iget-object v0, v6, Lcom/google/android/gms/b/yu$a;->h:Lorg/json/JSONObject;

    move-object/from16 v29, v0

    const/16 v30, 0x0

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/b/yf;->a:Lcom/google/android/gms/b/yu$a;

    iget-object v6, v6, Lcom/google/android/gms/b/yu$a;->b:Lcom/google/android/gms/b/wi;

    iget-object v0, v6, Lcom/google/android/gms/b/wi;->C:Lcom/google/android/gms/b/yj;

    move-object/from16 v31, v0

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/b/yf;->a:Lcom/google/android/gms/b/yu$a;

    iget-object v6, v6, Lcom/google/android/gms/b/yu$a;->b:Lcom/google/android/gms/b/wi;

    iget-object v0, v6, Lcom/google/android/gms/b/wi;->D:Ljava/util/List;

    move-object/from16 v32, v0

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/b/yf;->a:Lcom/google/android/gms/b/yu$a;

    iget-object v6, v6, Lcom/google/android/gms/b/yu$a;->b:Lcom/google/android/gms/b/wi;

    iget-object v0, v6, Lcom/google/android/gms/b/wi;->E:Ljava/util/List;

    move-object/from16 v33, v0

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/b/yf;->a:Lcom/google/android/gms/b/yu$a;

    iget-object v6, v6, Lcom/google/android/gms/b/yu$a;->b:Lcom/google/android/gms/b/wi;

    iget-boolean v0, v6, Lcom/google/android/gms/b/wi;->F:Z

    move/from16 v34, v0

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/b/yf;->a:Lcom/google/android/gms/b/yu$a;

    iget-object v6, v6, Lcom/google/android/gms/b/yu$a;->b:Lcom/google/android/gms/b/wi;

    iget-object v0, v6, Lcom/google/android/gms/b/wi;->G:Lcom/google/android/gms/b/wk;

    move-object/from16 v35, v0

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/b/yf;->f()Ljava/lang/String;

    move-result-object v36

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/b/yf;->a:Lcom/google/android/gms/b/yu$a;

    iget-object v6, v6, Lcom/google/android/gms/b/yu$a;->b:Lcom/google/android/gms/b/wi;

    iget-object v0, v6, Lcom/google/android/gms/b/wi;->J:Ljava/util/List;

    move-object/from16 v37, v0

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/b/yf;->a:Lcom/google/android/gms/b/yu$a;

    iget-object v6, v6, Lcom/google/android/gms/b/yu$a;->b:Lcom/google/android/gms/b/wi;

    iget-object v0, v6, Lcom/google/android/gms/b/wi;->N:Ljava/lang/String;

    move-object/from16 v38, v0

    move/from16 v6, p1

    move-object/from16 v14, p3

    move-object/from16 v16, p2

    invoke-direct/range {v2 .. v38}, Lcom/google/android/gms/b/yu;-><init>(Lcom/google/android/gms/b/ns;Lcom/google/android/gms/b/aaq;Ljava/util/List;ILjava/util/List;Ljava/util/List;IJLjava/lang/String;ZLcom/google/android/gms/b/td;Lcom/google/android/gms/b/to;Ljava/lang/String;Lcom/google/android/gms/b/te;Lcom/google/android/gms/b/tg;JLcom/google/android/gms/b/nx;JJJLjava/lang/String;Lorg/json/JSONObject;Lcom/google/android/gms/b/qp$a;Lcom/google/android/gms/b/yj;Ljava/util/List;Ljava/util/List;ZLcom/google/android/gms/b/wk;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    return-object v2
.end method

.method private a(Ljava/lang/String;Lcom/google/android/gms/b/td;)Lcom/google/android/gms/b/yu;
    .locals 1

    const/4 v0, -0x2

    invoke-direct {p0, v0, p1, p2}, Lcom/google/android/gms/b/yf;->a(ILjava/lang/String;Lcom/google/android/gms/b/td;)Lcom/google/android/gms/b/yu;

    move-result-object v0

    return-object v0
.end method

.method private static a(Lcom/google/android/gms/b/ya;)Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/b/ya;->b:Ljava/lang/String;

    iget v1, p0, Lcom/google/android/gms/b/ya;->c:I

    invoke-static {v1}, Lcom/google/android/gms/b/yf;->a(I)I

    move-result v1

    iget-wide v2, p0, Lcom/google/android/gms/b/ya;->d:J

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/lit8 v5, v5, 0x21

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, "."

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/b/td;)V
    .locals 6

    iget-object v1, p0, Lcom/google/android/gms/b/yf;->h:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/b/yf;->i:Lcom/google/android/gms/b/xo;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/b/xo;->c(Ljava/lang/String;)Lcom/google/android/gms/b/yg;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/b/yg;->b()Lcom/google/android/gms/b/yd;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/b/yg;->a()Lcom/google/android/gms/b/to;

    move-result-object v2

    if-nez v2, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/yf;->f:Ljava/util/List;

    new-instance v2, Lcom/google/android/gms/b/ya$a;

    invoke-direct {v2}, Lcom/google/android/gms/b/ya$a;-><init>()V

    iget-object v3, p3, Lcom/google/android/gms/b/td;->d:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/b/ya$a;->b(Ljava/lang/String;)Lcom/google/android/gms/b/ya$a;

    move-result-object v2

    invoke-virtual {v2, p1}, Lcom/google/android/gms/b/ya$a;->a(Ljava/lang/String;)Lcom/google/android/gms/b/ya$a;

    move-result-object v2

    const-wide/16 v4, 0x0

    invoke-virtual {v2, v4, v5}, Lcom/google/android/gms/b/ya$a;->a(J)Lcom/google/android/gms/b/ya$a;

    move-result-object v2

    const/4 v3, 0x7

    invoke-virtual {v2, v3}, Lcom/google/android/gms/b/ya$a;->a(I)Lcom/google/android/gms/b/ya$a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/b/ya$a;->a()Lcom/google/android/gms/b/ya;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    monitor-exit v1

    :goto_0
    return-void

    :cond_1
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/google/android/gms/b/yf;->a(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/b/td;Lcom/google/android/gms/b/yg;)Lcom/google/android/gms/b/xz;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/b/yf;->c:Ljava/util/ArrayList;

    invoke-virtual {v2}, Lcom/google/android/gms/b/zd;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/Future;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/b/yf;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/b/yf;->e:Ljava/util/HashMap;

    invoke-virtual {v0, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private c()Lcom/google/android/gms/b/yu;
    .locals 2

    const/4 v1, 0x0

    const/4 v0, 0x3

    invoke-direct {p0, v0, v1, v1}, Lcom/google/android/gms/b/yf;->a(ILjava/lang/String;Lcom/google/android/gms/b/td;)Lcom/google/android/gms/b/yu;

    move-result-object v0

    return-object v0
.end method

.method private f()Ljava/lang/String;
    .locals 5

    const/4 v4, 0x0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v0, ""

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/b/yf;->f:Ljava/util/List;

    if-nez v0, :cond_0

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/yf;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/ya;

    if-eqz v0, :cond_1

    iget-object v3, v0, Lcom/google/android/gms/b/ya;->b:Ljava/lang/String;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-static {v0}, Lcom/google/android/gms/b/yf;->a(Lcom/google/android/gms/b/ya;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "_"

    invoke-virtual {v0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-static {v4, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual {v1, v4, v0}, Ljava/lang/StringBuilder;->substring(II)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method protected a(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/b/td;Lcom/google/android/gms/b/yg;)Lcom/google/android/gms/b/xz;
    .locals 10

    new-instance v0, Lcom/google/android/gms/b/xz;

    iget-object v1, p0, Lcom/google/android/gms/b/yf;->b:Landroid/content/Context;

    iget-object v5, p0, Lcom/google/android/gms/b/yf;->a:Lcom/google/android/gms/b/yu$a;

    iget-wide v8, p0, Lcom/google/android/gms/b/yf;->j:J

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v6, p4

    move-object v7, p0

    invoke-direct/range {v0 .. v9}, Lcom/google/android/gms/b/xz;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/b/td;Lcom/google/android/gms/b/yu$a;Lcom/google/android/gms/b/yg;Lcom/google/android/gms/b/ye;J)V

    return-object v0
.end method

.method public a()V
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/b/yf;->a:Lcom/google/android/gms/b/yu$a;

    iget-object v0, v0, Lcom/google/android/gms/b/yu$a;->c:Lcom/google/android/gms/b/te;

    iget-object v0, v0, Lcom/google/android/gms/b/te;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/td;

    iget-object v3, v0, Lcom/google/android/gms/b/td;->i:Ljava/lang/String;

    iget-object v1, v0, Lcom/google/android/gms/b/td;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v5, "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter"

    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    const-string v5, "com.google.ads.mediation.customevent.CustomEventAdapter"

    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    :cond_1
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v5, "class_name"

    invoke-virtual {v1, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    :cond_2
    invoke-direct {p0, v1, v3, v0}, Lcom/google/android/gms/b/yf;->a(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/b/td;)V

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v5, "Unable to determine custom event class name, skipping..."

    invoke-static {v5, v1}, Lcom/google/android/gms/b/ze;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    move v1, v0

    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/b/yf;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_6

    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/b/yf;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/Future;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    iget-object v2, p0, Lcom/google/android/gms/b/yf;->h:Ljava/lang/Object;

    monitor-enter v2

    :try_start_2
    iget-object v0, p0, Lcom/google/android/gms/b/yf;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_4

    iget-object v3, p0, Lcom/google/android/gms/b/yf;->e:Ljava/util/HashMap;

    invoke-virtual {v3, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/xz;

    if-eqz v0, :cond_4

    iget-object v3, p0, Lcom/google/android/gms/b/yf;->f:Ljava/util/List;

    invoke-virtual {v0}, Lcom/google/android/gms/b/xz;->c()Lcom/google/android/gms/b/ya;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object v2, p0, Lcom/google/android/gms/b/yf;->h:Ljava/lang/Object;

    monitor-enter v2

    :try_start_3
    iget-object v0, p0, Lcom/google/android/gms/b/yf;->g:Ljava/util/HashSet;

    iget-object v3, p0, Lcom/google/android/gms/b/yf;->d:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    iget-object v0, p0, Lcom/google/android/gms/b/yf;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/gms/b/yf;->e:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_9

    iget-object v1, p0, Lcom/google/android/gms/b/yf;->e:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/b/xz;

    invoke-virtual {v1}, Lcom/google/android/gms/b/xz;->f()Lcom/google/android/gms/b/td;

    move-result-object v1

    :goto_2
    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/b/yf;->a(Ljava/lang/String;Lcom/google/android/gms/b/td;)Lcom/google/android/gms/b/yu;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/b/zx;->a:Landroid/os/Handler;

    new-instance v3, Lcom/google/android/gms/b/yf$1;

    invoke-direct {v3, p0, v0}, Lcom/google/android/gms/b/yf$1;-><init>(Lcom/google/android/gms/b/yf;Lcom/google/android/gms/b/yu;)V

    invoke-virtual {v1, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_5

    :goto_3
    return-void

    :catchall_0
    move-exception v0

    :try_start_4
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v0

    :catch_1
    move-exception v0

    :try_start_5
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    iget-object v2, p0, Lcom/google/android/gms/b/yf;->h:Ljava/lang/Object;

    monitor-enter v2

    :try_start_6
    iget-object v0, p0, Lcom/google/android/gms/b/yf;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_5

    iget-object v1, p0, Lcom/google/android/gms/b/yf;->e:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/xz;

    if-eqz v0, :cond_5

    iget-object v1, p0, Lcom/google/android/gms/b/yf;->f:Ljava/util/List;

    invoke-virtual {v0}, Lcom/google/android/gms/b/xz;->c()Lcom/google/android/gms/b/ya;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_5
    monitor-exit v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :cond_6
    invoke-direct {p0}, Lcom/google/android/gms/b/yf;->c()Lcom/google/android/gms/b/yu;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/b/zx;->a:Landroid/os/Handler;

    new-instance v2, Lcom/google/android/gms/b/yf$2;

    invoke-direct {v2, p0, v0}, Lcom/google/android/gms/b/yf$2;-><init>(Lcom/google/android/gms/b/yf;Lcom/google/android/gms/b/yu;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_3

    :catchall_1
    move-exception v0

    :try_start_7
    monitor-exit v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    throw v0

    :catch_2
    move-exception v0

    :try_start_8
    const-string v2, "Unable to resolve rewarded adapter."

    invoke-static {v2, v0}, Lcom/google/android/gms/b/ze;->c(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    iget-object v2, p0, Lcom/google/android/gms/b/yf;->h:Ljava/lang/Object;

    monitor-enter v2

    :try_start_9
    iget-object v0, p0, Lcom/google/android/gms/b/yf;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_7

    iget-object v3, p0, Lcom/google/android/gms/b/yf;->e:Ljava/util/HashMap;

    invoke-virtual {v3, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/xz;

    if-eqz v0, :cond_7

    iget-object v3, p0, Lcom/google/android/gms/b/yf;->f:Ljava/util/List;

    invoke-virtual {v0}, Lcom/google/android/gms/b/xz;->c()Lcom/google/android/gms/b/ya;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_7
    monitor-exit v2

    :goto_4
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto/16 :goto_1

    :catchall_2
    move-exception v0

    monitor-exit v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    throw v0

    :catchall_3
    move-exception v0

    move-object v2, v0

    iget-object v3, p0, Lcom/google/android/gms/b/yf;->h:Ljava/lang/Object;

    monitor-enter v3

    :try_start_a
    iget-object v0, p0, Lcom/google/android/gms/b/yf;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_8

    iget-object v1, p0, Lcom/google/android/gms/b/yf;->e:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/xz;

    if-eqz v0, :cond_8

    iget-object v1, p0, Lcom/google/android/gms/b/yf;->f:Ljava/util/List;

    invoke-virtual {v0}, Lcom/google/android/gms/b/xz;->c()Lcom/google/android/gms/b/ya;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_8
    monitor-exit v3
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    throw v2

    :catchall_4
    move-exception v0

    :try_start_b
    monitor-exit v3
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    throw v0

    :cond_9
    const/4 v1, 0x0

    goto/16 :goto_2

    :cond_a
    :try_start_c
    monitor-exit v2

    goto :goto_4

    :catchall_5
    move-exception v0

    monitor-exit v2
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    throw v0
.end method

.method public a(Ljava/lang/String;)V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/b/yf;->h:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/b/yf;->g:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public a(Ljava/lang/String;I)V
    .locals 0

    return-void
.end method

.method public b()V
    .locals 0

    return-void
.end method
