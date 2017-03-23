.class public Lcom/fodlam/yds/utility/b;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/speech/tts/TextToSpeech$OnInitListener;


# static fields
.field static a:Lcom/fodlam/yds/utility/b;


# instance fields
.field b:Landroid/content/Context;

.field private c:Landroid/speech/tts/TextToSpeech;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    sput-object v0, Lcom/fodlam/yds/utility/b;->a:Lcom/fodlam/yds/utility/b;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/fodlam/yds/utility/b;->b:Landroid/content/Context;

    invoke-static {p1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "ttsengine"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Landroid/speech/tts/TextToSpeech;

    invoke-direct {v1, p1, p0, v0}, Landroid/speech/tts/TextToSpeech;-><init>(Landroid/content/Context;Landroid/speech/tts/TextToSpeech$OnInitListener;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/fodlam/yds/utility/b;->c:Landroid/speech/tts/TextToSpeech;

    :goto_0
    return-void

    :cond_0
    new-instance v0, Landroid/speech/tts/TextToSpeech;

    invoke-direct {v0, p1, p0}, Landroid/speech/tts/TextToSpeech;-><init>(Landroid/content/Context;Landroid/speech/tts/TextToSpeech$OnInitListener;)V

    iput-object v0, p0, Lcom/fodlam/yds/utility/b;->c:Landroid/speech/tts/TextToSpeech;

    goto :goto_0
.end method

.method public static declared-synchronized a(Landroid/content/Context;)Lcom/fodlam/yds/utility/b;
    .locals 2

    const-class v1, Lcom/fodlam/yds/utility/b;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/fodlam/yds/utility/b;->a:Lcom/fodlam/yds/utility/b;

    if-nez v0, :cond_0

    if-eqz p0, :cond_0

    new-instance v0, Lcom/fodlam/yds/utility/b;

    invoke-direct {v0, p0}, Lcom/fodlam/yds/utility/b;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/fodlam/yds/utility/b;->a:Lcom/fodlam/yds/utility/b;

    :cond_0
    sget-object v0, Lcom/fodlam/yds/utility/b;->a:Lcom/fodlam/yds/utility/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Landroid/speech/tts/TextToSpeech$EngineInfo;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/fodlam/yds/utility/b;->c:Landroid/speech/tts/TextToSpeech;

    invoke-virtual {v0}, Landroid/speech/tts/TextToSpeech;->getEngines()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/String;)V
    .locals 2

    if-nez p1, :cond_0

    const-string p1, "com.google.android.tts"

    :cond_0
    iget-object v0, p0, Lcom/fodlam/yds/utility/b;->c:Landroid/speech/tts/TextToSpeech;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fodlam/yds/utility/b;->c:Landroid/speech/tts/TextToSpeech;

    invoke-virtual {v0}, Landroid/speech/tts/TextToSpeech;->stop()I

    iget-object v0, p0, Lcom/fodlam/yds/utility/b;->c:Landroid/speech/tts/TextToSpeech;

    invoke-virtual {v0}, Landroid/speech/tts/TextToSpeech;->shutdown()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/fodlam/yds/utility/b;->c:Landroid/speech/tts/TextToSpeech;

    :cond_1
    new-instance v0, Landroid/speech/tts/TextToSpeech;

    iget-object v1, p0, Lcom/fodlam/yds/utility/b;->b:Landroid/content/Context;

    invoke-direct {v0, v1, p0, p1}, Landroid/speech/tts/TextToSpeech;-><init>(Landroid/content/Context;Landroid/speech/tts/TextToSpeech$OnInitListener;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/fodlam/yds/utility/b;->c:Landroid/speech/tts/TextToSpeech;

    return-void
.end method

.method public b()V
    .locals 2

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/fodlam/yds/utility/b;->c:Landroid/speech/tts/TextToSpeech;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fodlam/yds/utility/b;->c:Landroid/speech/tts/TextToSpeech;

    invoke-virtual {v0}, Landroid/speech/tts/TextToSpeech;->shutdown()V

    iput-object v1, p0, Lcom/fodlam/yds/utility/b;->c:Landroid/speech/tts/TextToSpeech;

    sput-object v1, Lcom/fodlam/yds/utility/b;->a:Lcom/fodlam/yds/utility/b;

    :cond_0
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 4

    const/4 v3, 0x0

    const/4 v2, 0x0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lcom/fodlam/yds/utility/b;->c:Landroid/speech/tts/TextToSpeech;

    invoke-virtual {v0, p1, v3, v2, v2}, Landroid/speech/tts/TextToSpeech;->speak(Ljava/lang/CharSequence;ILandroid/os/Bundle;Ljava/lang/String;)I

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/fodlam/yds/utility/b;->c:Landroid/speech/tts/TextToSpeech;

    invoke-virtual {v0, p1, v3, v2}, Landroid/speech/tts/TextToSpeech;->speak(Ljava/lang/String;ILjava/util/HashMap;)I

    goto :goto_0
.end method

.method public onInit(I)V
    .locals 3

    const/4 v1, -0x1

    if-nez p1, :cond_3

    iget-object v0, p0, Lcom/fodlam/yds/utility/b;->c:Landroid/speech/tts/TextToSpeech;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/fodlam/yds/utility/b;->c:Landroid/speech/tts/TextToSpeech;

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v2}, Landroid/speech/tts/TextToSpeech;->isLanguageAvailable(Ljava/util/Locale;)I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/fodlam/yds/utility/b;->c:Landroid/speech/tts/TextToSpeech;

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v2}, Landroid/speech/tts/TextToSpeech;->setLanguage(Ljava/util/Locale;)I

    move-result v0

    :goto_0
    if-eq v0, v1, :cond_0

    const/4 v1, -0x2

    if-ne v0, v1, :cond_2

    :cond_0
    const-string v0, "Oxford"

    const-string v1, "TTS: This Language is not supported"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_1
    return-void

    :cond_1
    iget-object v0, p0, Lcom/fodlam/yds/utility/b;->c:Landroid/speech/tts/TextToSpeech;

    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v0, v2}, Landroid/speech/tts/TextToSpeech;->isLanguageAvailable(Ljava/util/Locale;)I

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/fodlam/yds/utility/b;->c:Landroid/speech/tts/TextToSpeech;

    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v0, v2}, Landroid/speech/tts/TextToSpeech;->setLanguage(Ljava/util/Locale;)I

    move-result v0

    goto :goto_0

    :cond_2
    const-string v0, ""

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/utility/b;->b(Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    const-string v0, "Oxford"

    const-string v1, "TTS: Initilization Failed!"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :cond_4
    move v0, v1

    goto :goto_0
.end method
