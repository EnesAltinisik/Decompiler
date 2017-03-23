.class public Lcom/pinarsu/siparis/MyApplication;
.super Landroid/support/b/b;
.source "MyApplication.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pinarsu/siparis/MyApplication$AdjustLifecycleCallbacks;
    }
.end annotation


# static fields
.field public static SCREEN_HEIGHT:I

.field public static SCREEN_WIDTH:I

.field private static instance:Lcom/pinarsu/siparis/MyApplication;

.field public static isBackground:Z


# instance fields
.field private activity:Landroid/support/v7/app/AppCompatActivity;

.field private preferences:Lcom/pinarsu/siparis/Preferences;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 53
    const/4 v0, 0x0

    sput-boolean v0, Lcom/pinarsu/siparis/MyApplication;->isBackground:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 45
    invoke-direct {p0}, Landroid/support/b/b;-><init>()V

    return-void
.end method

.method public static getInstance()Lcom/pinarsu/siparis/MyApplication;
    .locals 1

    .prologue
    .line 50
    sget-object v0, Lcom/pinarsu/siparis/MyApplication;->instance:Lcom/pinarsu/siparis/MyApplication;

    return-object v0
.end method


# virtual methods
.method public getActivity()Landroid/support/v7/app/AppCompatActivity;
    .locals 1

    .prologue
    .line 188
    iget-object v0, p0, Lcom/pinarsu/siparis/MyApplication;->activity:Landroid/support/v7/app/AppCompatActivity;

    return-object v0
.end method

.method public getDeviceId()Ljava/lang/String;
    .locals 2

    .prologue
    .line 323
    invoke-virtual {p0}, Lcom/pinarsu/siparis/MyApplication;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "android_id"

    invoke-static {v0, v1}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getDisplayWidthHeight()V
    .locals 2

    .prologue
    .line 297
    invoke-virtual {p0}, Lcom/pinarsu/siparis/MyApplication;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    .line 298
    new-instance v1, Landroid/graphics/Point;

    invoke-direct {v1}, Landroid/graphics/Point;-><init>()V

    .line 299
    invoke-virtual {v0, v1}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    .line 300
    iget v0, v1, Landroid/graphics/Point;->x:I

    sput v0, Lcom/pinarsu/siparis/MyApplication;->SCREEN_WIDTH:I

    .line 301
    iget v0, v1, Landroid/graphics/Point;->y:I

    sput v0, Lcom/pinarsu/siparis/MyApplication;->SCREEN_HEIGHT:I

    .line 302
    return-void
.end method

.method public getPreferences()Lcom/pinarsu/siparis/Preferences;
    .locals 1

    .prologue
    .line 196
    iget-object v0, p0, Lcom/pinarsu/siparis/MyApplication;->preferences:Lcom/pinarsu/siparis/Preferences;

    return-object v0
.end method

.method public getServiceLiveURLFile()Ljava/lang/String;
    .locals 1

    .prologue
    .line 264
    const v0, 0x7f06009f

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/MyApplication;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getServiceLiveURLHost()Ljava/lang/String;
    .locals 1

    .prologue
    .line 246
    const v0, 0x7f0600a0

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/MyApplication;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getServiceLiveURLPort()Ljava/lang/String;
    .locals 1

    .prologue
    .line 255
    const v0, 0x7f0600a1

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/MyApplication;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getServiceLiveUserName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 281
    const v0, 0x7f0600a2

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/MyApplication;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getServiceLiveUserPass()Ljava/lang/String;
    .locals 1

    .prologue
    .line 285
    const v0, 0x7f0600a3

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/MyApplication;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getServiceNamespace()Ljava/lang/String;
    .locals 1

    .prologue
    .line 209
    const v0, 0x7f0600a4

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/MyApplication;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getServiceTestURLFile()Ljava/lang/String;
    .locals 1

    .prologue
    .line 237
    const v0, 0x7f0600a5

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/MyApplication;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getServiceTestURLHost()Ljava/lang/String;
    .locals 1

    .prologue
    .line 219
    const v0, 0x7f0600a6

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/MyApplication;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getServiceTestURLPort()Ljava/lang/String;
    .locals 1

    .prologue
    .line 228
    const v0, 0x7f0600a7

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/MyApplication;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getServiceTestUserName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 273
    const v0, 0x7f0600a8

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/MyApplication;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getServiceTestUserPass()Ljava/lang/String;
    .locals 1

    .prologue
    .line 277
    const v0, 0x7f0600a9

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/MyApplication;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public isConnected()Z
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 308
    const-string v0, "connectivity"

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/MyApplication;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    .line 309
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    .line 310
    if-nez v0, :cond_0

    move v0, v1

    .line 316
    :goto_0
    return v0

    .line 312
    :cond_0
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v2

    if-nez v2, :cond_1

    move v0, v1

    .line 313
    goto :goto_0

    .line 314
    :cond_1
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isAvailable()Z

    move-result v0

    if-nez v0, :cond_2

    move v0, v1

    .line 315
    goto :goto_0

    .line 316
    :cond_2
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public onCreate()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    const/4 v3, 0x1

    .line 62
    invoke-super {p0}, Landroid/support/b/b;->onCreate()V

    .line 63
    sput-object p0, Lcom/pinarsu/siparis/MyApplication;->instance:Lcom/pinarsu/siparis/MyApplication;

    .line 64
    new-instance v0, La/a/a/a/c$a;

    invoke-direct {v0, p0}, La/a/a/a/c$a;-><init>(Landroid/content/Context;)V

    new-array v1, v3, [La/a/a/a/i;

    new-instance v2, Lcom/crashlytics/android/Crashlytics;

    invoke-direct {v2}, Lcom/crashlytics/android/Crashlytics;-><init>()V

    aput-object v2, v1, v4

    .line 65
    invoke-virtual {v0, v1}, La/a/a/a/c$a;->a([La/a/a/a/i;)La/a/a/a/c$a;

    move-result-object v0

    .line 66
    invoke-virtual {v0, v3}, La/a/a/a/c$a;->a(Z)La/a/a/a/c$a;

    move-result-object v0

    .line 67
    invoke-virtual {v0}, La/a/a/a/c$a;->a()La/a/a/a/c;

    move-result-object v0

    .line 68
    invoke-static {v0}, La/a/a/a/c;->a(La/a/a/a/c;)La/a/a/a/c;

    .line 70
    const-string v0, "u0bnc59dltkw"

    .line 73
    const-string v0, "production"

    .line 74
    new-instance v1, Lcom/adjust/sdk/AdjustConfig;

    const-string v2, "u0bnc59dltkw"

    invoke-direct {v1, p0, v2, v0}, Lcom/adjust/sdk/AdjustConfig;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    sget-object v0, Lcom/adjust/sdk/LogLevel;->VERBOSE:Lcom/adjust/sdk/LogLevel;

    invoke-virtual {v1, v0}, Lcom/adjust/sdk/AdjustConfig;->setLogLevel(Lcom/adjust/sdk/LogLevel;)V

    .line 85
    new-instance v0, Lcom/pinarsu/siparis/MyApplication$1;

    invoke-direct {v0, p0}, Lcom/pinarsu/siparis/MyApplication$1;-><init>(Lcom/pinarsu/siparis/MyApplication;)V

    invoke-virtual {v1, v0}, Lcom/adjust/sdk/AdjustConfig;->setOnAttributionChangedListener(Lcom/adjust/sdk/OnAttributionChangedListener;)V

    .line 93
    new-instance v0, Lcom/pinarsu/siparis/MyApplication$2;

    invoke-direct {v0, p0}, Lcom/pinarsu/siparis/MyApplication$2;-><init>(Lcom/pinarsu/siparis/MyApplication;)V

    invoke-virtual {v1, v0}, Lcom/adjust/sdk/AdjustConfig;->setOnEventTrackingSucceededListener(Lcom/adjust/sdk/OnEventTrackingSucceededListener;)V

    .line 101
    new-instance v0, Lcom/pinarsu/siparis/MyApplication$3;

    invoke-direct {v0, p0}, Lcom/pinarsu/siparis/MyApplication$3;-><init>(Lcom/pinarsu/siparis/MyApplication;)V

    invoke-virtual {v1, v0}, Lcom/adjust/sdk/AdjustConfig;->setOnEventTrackingFailedListener(Lcom/adjust/sdk/OnEventTrackingFailedListener;)V

    .line 109
    new-instance v0, Lcom/pinarsu/siparis/MyApplication$4;

    invoke-direct {v0, p0}, Lcom/pinarsu/siparis/MyApplication$4;-><init>(Lcom/pinarsu/siparis/MyApplication;)V

    invoke-virtual {v1, v0}, Lcom/adjust/sdk/AdjustConfig;->setOnSessionTrackingSucceededListener(Lcom/adjust/sdk/OnSessionTrackingSucceededListener;)V

    .line 117
    new-instance v0, Lcom/pinarsu/siparis/MyApplication$5;

    invoke-direct {v0, p0}, Lcom/pinarsu/siparis/MyApplication$5;-><init>(Lcom/pinarsu/siparis/MyApplication;)V

    invoke-virtual {v1, v0}, Lcom/adjust/sdk/AdjustConfig;->setOnSessionTrackingFailedListener(Lcom/adjust/sdk/OnSessionTrackingFailedListener;)V

    .line 125
    new-instance v0, Lcom/pinarsu/siparis/MyApplication$6;

    invoke-direct {v0, p0}, Lcom/pinarsu/siparis/MyApplication$6;-><init>(Lcom/pinarsu/siparis/MyApplication;)V

    invoke-virtual {v1, v0}, Lcom/adjust/sdk/AdjustConfig;->setOnDeeplinkResponseListener(Lcom/adjust/sdk/OnDeeplinkResponseListener;)V

    .line 134
    invoke-virtual {v1, v3}, Lcom/adjust/sdk/AdjustConfig;->setSendInBackground(Z)V

    .line 138
    invoke-static {v1}, Lcom/adjust/sdk/Adjust;->onCreate(Lcom/adjust/sdk/AdjustConfig;)V

    .line 140
    new-instance v0, Lcom/pinarsu/siparis/MyApplication$AdjustLifecycleCallbacks;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/pinarsu/siparis/MyApplication$AdjustLifecycleCallbacks;-><init>(Lcom/pinarsu/siparis/MyApplication$1;)V

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/MyApplication;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 141
    invoke-static {v3}, Lcom/adjust/sdk/Adjust;->setEnabled(Z)V

    .line 143
    new-instance v0, Lcom/pinarsu/siparis/Preferences;

    invoke-direct {v0, p0}, Lcom/pinarsu/siparis/Preferences;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/pinarsu/siparis/MyApplication;->preferences:Lcom/pinarsu/siparis/Preferences;

    .line 144
    iget-object v0, p0, Lcom/pinarsu/siparis/MyApplication;->preferences:Lcom/pinarsu/siparis/Preferences;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/Preferences;->read()V

    .line 145
    invoke-virtual {p0}, Lcom/pinarsu/siparis/MyApplication;->getDisplayWidthHeight()V

    .line 146
    sput-boolean v4, Lcom/pinarsu/siparis/adapter/TutorialViewPagerAdapter;->isFromMain:Z

    .line 147
    return-void
.end method

.method public setActivity(Landroid/support/v7/app/AppCompatActivity;)V
    .locals 0

    .prologue
    .line 192
    iput-object p1, p0, Lcom/pinarsu/siparis/MyApplication;->activity:Landroid/support/v7/app/AppCompatActivity;

    .line 193
    return-void
.end method

.method public setPreferences(Lcom/pinarsu/siparis/Preferences;)V
    .locals 0

    .prologue
    .line 289
    iput-object p1, p0, Lcom/pinarsu/siparis/MyApplication;->preferences:Lcom/pinarsu/siparis/Preferences;

    .line 290
    return-void
.end method
