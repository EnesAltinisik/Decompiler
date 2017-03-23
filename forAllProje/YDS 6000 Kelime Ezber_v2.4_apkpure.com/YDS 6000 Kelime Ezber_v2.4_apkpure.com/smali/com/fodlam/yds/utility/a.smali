.class public Lcom/fodlam/yds/utility/a;
.super Ljava/lang/Object;


# static fields
.field static a:Lcom/fodlam/yds/utility/a;


# instance fields
.field b:Landroid/media/AudioManager;

.field c:Landroid/media/SoundPool;

.field d:I

.field e:I

.field f:I

.field g:I

.field h:I

.field i:I

.field j:Landroid/content/Context;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 4

    const/4 v3, 0x3

    const/4 v2, 0x1

    const/4 v1, -0x1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/fodlam/yds/utility/a;->b:Landroid/media/AudioManager;

    iput v1, p0, Lcom/fodlam/yds/utility/a;->d:I

    iput v1, p0, Lcom/fodlam/yds/utility/a;->e:I

    iput v1, p0, Lcom/fodlam/yds/utility/a;->f:I

    iput v1, p0, Lcom/fodlam/yds/utility/a;->g:I

    iput v1, p0, Lcom/fodlam/yds/utility/a;->h:I

    iput v1, p0, Lcom/fodlam/yds/utility/a;->i:I

    iput-object p1, p0, Lcom/fodlam/yds/utility/a;->j:Landroid/content/Context;

    const-string v0, "audio"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/AudioManager;

    iput-object v0, p0, Lcom/fodlam/yds/utility/a;->b:Landroid/media/AudioManager;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-ge v0, v1, :cond_0

    new-instance v0, Landroid/media/SoundPool;

    const/16 v1, 0x64

    invoke-direct {v0, v2, v3, v1}, Landroid/media/SoundPool;-><init>(III)V

    iput-object v0, p0, Lcom/fodlam/yds/utility/a;->c:Landroid/media/SoundPool;

    :goto_0
    iget-object v0, p0, Lcom/fodlam/yds/utility/a;->c:Landroid/media/SoundPool;

    new-instance v1, Lcom/fodlam/yds/utility/a$1;

    invoke-direct {v1, p0}, Lcom/fodlam/yds/utility/a$1;-><init>(Lcom/fodlam/yds/utility/a;)V

    invoke-virtual {v0, v1}, Landroid/media/SoundPool;->setOnLoadCompleteListener(Landroid/media/SoundPool$OnLoadCompleteListener;)V

    const/high16 v0, 0x7f080000

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/utility/a;->a(I)I

    move-result v0

    iput v0, p0, Lcom/fodlam/yds/utility/a;->f:I

    const v0, 0x7f080002

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/utility/a;->a(I)I

    move-result v0

    iput v0, p0, Lcom/fodlam/yds/utility/a;->g:I

    const v0, 0x7f080004

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/utility/a;->a(I)I

    move-result v0

    iput v0, p0, Lcom/fodlam/yds/utility/a;->h:I

    const v0, 0x7f080001

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/utility/a;->a(I)I

    move-result v0

    iput v0, p0, Lcom/fodlam/yds/utility/a;->e:I

    const v0, 0x7f080003

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/utility/a;->a(I)I

    move-result v0

    iput v0, p0, Lcom/fodlam/yds/utility/a;->i:I

    return-void

    :cond_0
    new-instance v0, Landroid/media/AudioAttributes$Builder;

    invoke-direct {v0}, Landroid/media/AudioAttributes$Builder;-><init>()V

    invoke-virtual {v0, v3}, Landroid/media/AudioAttributes$Builder;->setLegacyStreamType(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    move-result-object v0

    new-instance v1, Landroid/media/SoundPool$Builder;

    invoke-direct {v1}, Landroid/media/SoundPool$Builder;-><init>()V

    invoke-virtual {v1, v2}, Landroid/media/SoundPool$Builder;->setMaxStreams(I)Landroid/media/SoundPool$Builder;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/media/SoundPool$Builder;->setAudioAttributes(Landroid/media/AudioAttributes;)Landroid/media/SoundPool$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/SoundPool$Builder;->build()Landroid/media/SoundPool;

    move-result-object v0

    iput-object v0, p0, Lcom/fodlam/yds/utility/a;->c:Landroid/media/SoundPool;

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;)Lcom/fodlam/yds/utility/a;
    .locals 2

    sget-object v0, Lcom/fodlam/yds/utility/a;->a:Lcom/fodlam/yds/utility/a;

    if-nez v0, :cond_0

    new-instance v0, Lcom/fodlam/yds/utility/a;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/fodlam/yds/utility/a;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/fodlam/yds/utility/a;->a:Lcom/fodlam/yds/utility/a;

    :cond_0
    sget-object v0, Lcom/fodlam/yds/utility/a;->a:Lcom/fodlam/yds/utility/a;

    return-object v0
.end method

.method private b(I)V
    .locals 7

    const/4 v2, 0x3

    const/high16 v6, 0x3f800000    # 1.0f

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/fodlam/yds/utility/a;->b:Landroid/media/AudioManager;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fodlam/yds/utility/a;->b:Landroid/media/AudioManager;

    invoke-virtual {v0, v2}, Landroid/media/AudioManager;->getStreamVolume(I)I

    move-result v0

    int-to-float v0, v0

    iget-object v1, p0, Lcom/fodlam/yds/utility/a;->b:Landroid/media/AudioManager;

    invoke-virtual {v1, v2}, Landroid/media/AudioManager;->getStreamMaxVolume(I)I

    move-result v1

    int-to-float v1, v1

    div-float v2, v0, v1

    :goto_1
    invoke-virtual {p0}, Lcom/fodlam/yds/utility/a;->e()V

    iget-object v0, p0, Lcom/fodlam/yds/utility/a;->c:Landroid/media/SoundPool;

    const/4 v4, 0x1

    const/4 v5, 0x0

    move v1, p1

    move v3, v2

    invoke-virtual/range {v0 .. v6}, Landroid/media/SoundPool;->play(IFFIIF)I

    move-result v0

    iput v0, p0, Lcom/fodlam/yds/utility/a;->d:I

    goto :goto_0

    :cond_1
    move v2, v6

    goto :goto_1
.end method


# virtual methods
.method public a(I)I
    .locals 3

    if-gtz p1, :cond_0

    const/4 v0, -0x1

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/fodlam/yds/utility/a;->c:Landroid/media/SoundPool;

    iget-object v1, p0, Lcom/fodlam/yds/utility/a;->j:Landroid/content/Context;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p1, v2}, Landroid/media/SoundPool;->load(Landroid/content/Context;II)I

    move-result v0

    goto :goto_0
.end method

.method public a()V
    .locals 1

    sget-boolean v0, Lcom/fodlam/yds/OxfordApplication;->d:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/fodlam/yds/utility/a;->g:I

    invoke-direct {p0, v0}, Lcom/fodlam/yds/utility/a;->b(I)V

    :cond_0
    return-void
.end method

.method public b()V
    .locals 1

    sget-boolean v0, Lcom/fodlam/yds/OxfordApplication;->d:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/fodlam/yds/utility/a;->h:I

    invoke-direct {p0, v0}, Lcom/fodlam/yds/utility/a;->b(I)V

    :cond_0
    iget-object v0, p0, Lcom/fodlam/yds/utility/a;->j:Landroid/content/Context;

    invoke-static {v0}, Lcom/fodlam/yds/utility/c;->a(Landroid/content/Context;)V

    return-void
.end method

.method public c()V
    .locals 1

    sget-boolean v0, Lcom/fodlam/yds/OxfordApplication;->d:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/fodlam/yds/utility/a;->e:I

    invoke-direct {p0, v0}, Lcom/fodlam/yds/utility/a;->b(I)V

    :cond_0
    return-void
.end method

.method public d()V
    .locals 1

    sget-boolean v0, Lcom/fodlam/yds/OxfordApplication;->d:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/fodlam/yds/utility/a;->i:I

    invoke-direct {p0, v0}, Lcom/fodlam/yds/utility/a;->b(I)V

    :cond_0
    return-void
.end method

.method public e()V
    .locals 3

    const/4 v2, -0x1

    iget v0, p0, Lcom/fodlam/yds/utility/a;->d:I

    if-eq v0, v2, :cond_0

    iget-object v0, p0, Lcom/fodlam/yds/utility/a;->c:Landroid/media/SoundPool;

    iget v1, p0, Lcom/fodlam/yds/utility/a;->d:I

    invoke-virtual {v0, v1}, Landroid/media/SoundPool;->stop(I)V

    iput v2, p0, Lcom/fodlam/yds/utility/a;->d:I

    :cond_0
    return-void
.end method

.method public f()V
    .locals 2

    const/4 v1, 0x0

    :try_start_0
    iget-object v0, p0, Lcom/fodlam/yds/utility/a;->c:Landroid/media/SoundPool;

    invoke-virtual {v0}, Landroid/media/SoundPool;->release()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    sput-object v1, Lcom/fodlam/yds/utility/a;->a:Lcom/fodlam/yds/utility/a;

    iput-object v1, p0, Lcom/fodlam/yds/utility/a;->c:Landroid/media/SoundPool;

    iput-object v1, p0, Lcom/fodlam/yds/utility/a;->b:Landroid/media/AudioManager;

    iput-object v1, p0, Lcom/fodlam/yds/utility/a;->j:Landroid/content/Context;

    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method
