.class public Lcom/google/android/gms/b/vm;
.super Lcom/google/android/gms/b/zd;


# annotations
.annotation runtime Lcom/google/android/gms/b/vz;
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/b/vk$a;

.field private final b:Lcom/google/android/gms/b/wi;

.field private final c:Lcom/google/android/gms/b/yu$a;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/b/yu$a;Lcom/google/android/gms/b/vk$a;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/b/zd;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/b/vm;->c:Lcom/google/android/gms/b/yu$a;

    iget-object v0, p0, Lcom/google/android/gms/b/vm;->c:Lcom/google/android/gms/b/yu$a;

    iget-object v0, v0, Lcom/google/android/gms/b/yu$a;->b:Lcom/google/android/gms/b/wi;

    iput-object v0, p0, Lcom/google/android/gms/b/vm;->b:Lcom/google/android/gms/b/wi;

    iput-object p2, p0, Lcom/google/android/gms/b/vm;->a:Lcom/google/android/gms/b/vk$a;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/b/vm;)Lcom/google/android/gms/b/vk$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/vm;->a:Lcom/google/android/gms/b/vk$a;

    return-object v0
.end method

.method private a(I)Lcom/google/android/gms/b/yu;
    .locals 39

    new-instance v2, Lcom/google/android/gms/b/yu;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/google/android/gms/b/vm;->c:Lcom/google/android/gms/b/yu$a;

    iget-object v3, v3, Lcom/google/android/gms/b/yu$a;->a:Lcom/google/android/gms/b/wf;

    iget-object v3, v3, Lcom/google/android/gms/b/wf;->c:Lcom/google/android/gms/b/ns;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/b/vm;->b:Lcom/google/android/gms/b/wi;

    iget v9, v6, Lcom/google/android/gms/b/wi;->l:I

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/b/vm;->b:Lcom/google/android/gms/b/wi;

    iget-wide v10, v6, Lcom/google/android/gms/b/wi;->k:J

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/b/vm;->c:Lcom/google/android/gms/b/yu$a;

    iget-object v6, v6, Lcom/google/android/gms/b/yu$a;->a:Lcom/google/android/gms/b/wf;

    iget-object v12, v6, Lcom/google/android/gms/b/wf;->i:Ljava/lang/String;

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/b/vm;->b:Lcom/google/android/gms/b/wi;

    iget-wide v0, v6, Lcom/google/android/gms/b/wi;->i:J

    move-wide/from16 v19, v0

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/b/vm;->c:Lcom/google/android/gms/b/yu$a;

    iget-object v0, v6, Lcom/google/android/gms/b/yu$a;->d:Lcom/google/android/gms/b/nx;

    move-object/from16 v21, v0

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/b/vm;->b:Lcom/google/android/gms/b/wi;

    iget-wide v0, v6, Lcom/google/android/gms/b/wi;->g:J

    move-wide/from16 v22, v0

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/b/vm;->c:Lcom/google/android/gms/b/yu$a;

    iget-wide v0, v6, Lcom/google/android/gms/b/yu$a;->f:J

    move-wide/from16 v24, v0

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/b/vm;->b:Lcom/google/android/gms/b/wi;

    iget-wide v0, v6, Lcom/google/android/gms/b/wi;->n:J

    move-wide/from16 v26, v0

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/b/vm;->b:Lcom/google/android/gms/b/wi;

    iget-object v0, v6, Lcom/google/android/gms/b/wi;->o:Ljava/lang/String;

    move-object/from16 v28, v0

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/b/vm;->c:Lcom/google/android/gms/b/yu$a;

    iget-object v0, v6, Lcom/google/android/gms/b/yu$a;->h:Lorg/json/JSONObject;

    move-object/from16 v29, v0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/b/vm;->c:Lcom/google/android/gms/b/yu$a;

    iget-object v6, v6, Lcom/google/android/gms/b/yu$a;->b:Lcom/google/android/gms/b/wi;

    iget-boolean v0, v6, Lcom/google/android/gms/b/wi;->F:Z

    move/from16 v34, v0

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/b/vm;->c:Lcom/google/android/gms/b/yu$a;

    iget-object v6, v6, Lcom/google/android/gms/b/yu$a;->b:Lcom/google/android/gms/b/wi;

    iget-object v0, v6, Lcom/google/android/gms/b/wi;->G:Lcom/google/android/gms/b/wk;

    move-object/from16 v35, v0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    move/from16 v6, p1

    invoke-direct/range {v2 .. v38}, Lcom/google/android/gms/b/yu;-><init>(Lcom/google/android/gms/b/ns;Lcom/google/android/gms/b/aaq;Ljava/util/List;ILjava/util/List;Ljava/util/List;IJLjava/lang/String;ZLcom/google/android/gms/b/td;Lcom/google/android/gms/b/to;Ljava/lang/String;Lcom/google/android/gms/b/te;Lcom/google/android/gms/b/tg;JLcom/google/android/gms/b/nx;JJJLjava/lang/String;Lorg/json/JSONObject;Lcom/google/android/gms/b/qp$a;Lcom/google/android/gms/b/yj;Ljava/util/List;Ljava/util/List;ZLcom/google/android/gms/b/wk;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    return-object v2
.end method


# virtual methods
.method public a()V
    .locals 3

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/b/vm;->a(I)Lcom/google/android/gms/b/yu;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/b/zi;->a:Landroid/os/Handler;

    new-instance v2, Lcom/google/android/gms/b/vm$1;

    invoke-direct {v2, p0, v0}, Lcom/google/android/gms/b/vm$1;-><init>(Lcom/google/android/gms/b/vm;Lcom/google/android/gms/b/yu;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public b()V
    .locals 0

    return-void
.end method
