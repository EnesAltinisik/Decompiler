.class public Lcom/fodlam/yds/MainActivity;
.super Landroid/support/v7/app/e;

# interfaces
.implements Landroid/support/design/widget/NavigationView$a;


# static fields
.field public static m:Lcom/fodlam/yds/MainActivity;

.field private static final u:Ljava/lang/String;


# instance fields
.field n:Landroid/view/MenuItem;

.field o:I

.field p:Landroid/support/v4/widget/DrawerLayout;

.field q:Landroid/view/Menu;

.field r:Landroid/widget/CompoundButton;

.field s:Lcom/google/android/gms/ads/AdView;

.field t:Lcom/b/a/a/a/c;

.field private v:Lcom/nightonke/boommenu/BoomMenuButton;

.field private w:Lat/grabner/circleprogress/CircleProgressView;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/fodlam/yds/MainActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/fodlam/yds/MainActivity;->u:Ljava/lang/String;

    const/4 v0, 0x0

    sput-object v0, Lcom/fodlam/yds/MainActivity;->m:Lcom/fodlam/yds/MainActivity;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Landroid/support/v7/app/e;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/fodlam/yds/MainActivity;->o:I

    iput-object v1, p0, Lcom/fodlam/yds/MainActivity;->q:Landroid/view/Menu;

    iput-object v1, p0, Lcom/fodlam/yds/MainActivity;->s:Lcom/google/android/gms/ads/AdView;

    return-void
.end method

.method static synthetic a(Lcom/fodlam/yds/MainActivity;)Lcom/nightonke/boommenu/BoomMenuButton;
    .locals 1

    iget-object v0, p0, Lcom/fodlam/yds/MainActivity;->v:Lcom/nightonke/boommenu/BoomMenuButton;

    return-object v0
.end method

.method static synthetic b(Lcom/fodlam/yds/MainActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/fodlam/yds/MainActivity;->o()V

    return-void
.end method

.method private l()V
    .locals 2

    sget-boolean v0, Lcom/fodlam/yds/OxfordApplication;->f:Z

    if-eqz v0, :cond_0

    const v0, 0x7f100151

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/ads/AdView;

    iput-object v0, p0, Lcom/fodlam/yds/MainActivity;->s:Lcom/google/android/gms/ads/AdView;

    new-instance v0, Lcom/google/android/gms/ads/c$a;

    invoke-direct {v0}, Lcom/google/android/gms/ads/c$a;-><init>()V

    const-string v1, "C9B31154FD5A55FF4A275F4A3F3BB278"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/c$a;->b(Ljava/lang/String;)Lcom/google/android/gms/ads/c$a;

    move-result-object v0

    const-string v1, "59D066C8530C98987ECD6E439C59A14F"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/c$a;->b(Ljava/lang/String;)Lcom/google/android/gms/ads/c$a;

    move-result-object v0

    const-string v1, "A9D382793880830FCEED935DA3BBFA59"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/c$a;->b(Ljava/lang/String;)Lcom/google/android/gms/ads/c$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/c$a;->a()Lcom/google/android/gms/ads/c;

    move-result-object v0

    iget-object v1, p0, Lcom/fodlam/yds/MainActivity;->s:Lcom/google/android/gms/ads/AdView;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/ads/AdView;->a(Lcom/google/android/gms/ads/c;)V

    iget-object v0, p0, Lcom/fodlam/yds/MainActivity;->s:Lcom/google/android/gms/ads/AdView;

    new-instance v1, Lcom/fodlam/yds/MainActivity$3;

    invoke-direct {v1, p0}, Lcom/fodlam/yds/MainActivity$3;-><init>(Lcom/fodlam/yds/MainActivity;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/AdView;->setAdListener(Lcom/google/android/gms/ads/a;)V

    :cond_0
    return-void
.end method

.method private m()V
    .locals 4

    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "com.fodlam.yds.full"

    const-string v2, "full"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "com.fodlam.yds"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "com.fodlam.yds.noads"

    const-string v2, "full"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.fodlam.yds"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    new-instance v0, Lcom/b/a/a/a/c;

    const-string v1, "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxJvoOSAb8hUKvThiWh0Zc/U7u70eMBMrkrhDIdxvqTftqiOKqHxJJw1cIoOAdYUlBTWgJQnB9tbrZXzRYlPGokXd12L1KanIVc7QuDj2QPHjlfTOGLwD44bKsji1o8NqFmpDrbBieKyVCvffPfs0iCn8KslzwzbodLbaviOfDW0Mi0RGFZwW3WPigmZlHLgcngv9UFHDZuQ6wPNJ8BylsjNBtrwA+mwtkRWSBVkBoZ1p3ts5eWa864fqieqvENRIt2JRa4b+9bM4VX49yVBI1SlGpIAm6CLh6r12TYAIg/pFn7pebnvQxhq7UzG8p15p8lLAXX2EdMC51MNtVRSdpQIDAQAB"

    const-string v2, "13729865083699685309"

    new-instance v3, Lcom/fodlam/yds/MainActivity$4;

    invoke-direct {v3, p0}, Lcom/fodlam/yds/MainActivity$4;-><init>(Lcom/fodlam/yds/MainActivity;)V

    invoke-direct {v0, p0, v1, v2, v3}, Lcom/b/a/a/a/c;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/b/a/a/a/c$b;)V

    iput-object v0, p0, Lcom/fodlam/yds/MainActivity;->t:Lcom/b/a/a/a/c;

    goto :goto_0
.end method

.method private n()V
    .locals 6

    invoke-static {p0}, Lcom/fodlam/yds/utility/b;->a(Landroid/content/Context;)Lcom/fodlam/yds/utility/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fodlam/yds/utility/b;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "dontremindmefortts"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    new-instance v2, Lcom/fodlam/yds/MainActivity$5;

    invoke-direct {v2, p0, v0}, Lcom/fodlam/yds/MainActivity$5;-><init>(Lcom/fodlam/yds/MainActivity;Landroid/content/SharedPreferences;)V

    const-wide/16 v4, 0x3e8

    invoke-virtual {v1, v2, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    const/4 v0, 0x3

    sput v0, Lcom/fodlam/yds/OxfordApplication;->a:I

    :cond_1
    return-void
.end method

.method private o()V
    .locals 4

    const/16 v3, 0x8

    iget-object v0, p0, Lcom/fodlam/yds/MainActivity;->t:Lcom/b/a/a/a/c;

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object v1, p0, Lcom/fodlam/yds/MainActivity;->t:Lcom/b/a/a/a/c;

    const-string v2, "com.fodlam.yds.full"

    invoke-virtual {v1, v2}, Lcom/b/a/a/a/c;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/fodlam/yds/MainActivity;->t:Lcom/b/a/a/a/c;

    const-string v2, "com.fodlam.yds.noads"

    invoke-virtual {v1, v2}, Lcom/b/a/a/a/c;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    const-string v1, "com.fodlam.yds.full"

    const-string v2, "com.fodlam.yds"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    const-string v1, "com.fodlam.yds.noads"

    const-string v2, "com.fodlam.yds"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    invoke-static {p0}, Lcom/fodlam/yds/OxfordApplication;->d(Landroid/content/Context;)V

    :cond_2
    :goto_1
    sget-boolean v0, Lcom/fodlam/yds/OxfordApplication;->f:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fodlam/yds/MainActivity;->s:Lcom/google/android/gms/ads/AdView;

    if-eqz v0, :cond_0

    const v0, 0x7f10013e

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    const v0, 0x7f100151

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    :cond_3
    iget-object v1, p0, Lcom/fodlam/yds/MainActivity;->t:Lcom/b/a/a/a/c;

    const-string v2, "com.fodlam.yds.full"

    invoke-virtual {v1, v2}, Lcom/b/a/a/a/c;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    const-string v1, "com.fodlam.yds.full"

    const-string v2, "com.fodlam.yds"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    invoke-static {p0}, Lcom/fodlam/yds/OxfordApplication;->d(Landroid/content/Context;)V

    goto :goto_1

    :cond_4
    iget-object v1, p0, Lcom/fodlam/yds/MainActivity;->t:Lcom/b/a/a/a/c;

    const-string v2, "com.fodlam.yds.noads"

    invoke-virtual {v1, v2}, Lcom/b/a/a/a/c;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "com.fodlam.yds.noads"

    const-string v2, "com.fodlam.yds"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    invoke-static {p0}, Lcom/fodlam/yds/OxfordApplication;->d(Landroid/content/Context;)V

    goto :goto_1
.end method

.method private p()V
    .locals 4

    const/4 v3, 0x0

    invoke-virtual {p0}, Lcom/fodlam/yds/MainActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "notifyword"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    check-cast v0, Lcom/fodlam/yds/f/h;

    iget v1, v0, Lcom/fodlam/yds/f/h;->e:I

    div-int/lit8 v1, v1, 0xf

    sput v1, Lcom/fodlam/yds/OxfordApplication;->i:I

    iget v1, v0, Lcom/fodlam/yds/f/h;->d:I

    sput v1, Lcom/fodlam/yds/OxfordApplication;->g:I

    sget-object v1, Lcom/fodlam/yds/OxfordApplication$a;->a:Lcom/fodlam/yds/OxfordApplication$a;

    sput-object v1, Lcom/fodlam/yds/OxfordApplication;->h:Lcom/fodlam/yds/OxfordApplication$a;

    new-instance v1, Lcom/afollestad/materialdialogs/f$a;

    invoke-direct {v1, p0}, Lcom/afollestad/materialdialogs/f$a;-><init>(Landroid/content/Context;)V

    const v2, 0x7f09037f

    invoke-virtual {v1, v2}, Lcom/afollestad/materialdialogs/f$a;->a(I)Lcom/afollestad/materialdialogs/f$a;

    move-result-object v1

    const v2, 0x7f090371

    invoke-virtual {v1, v2}, Lcom/afollestad/materialdialogs/f$a;->c(I)Lcom/afollestad/materialdialogs/f$a;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2, v3}, Lcom/afollestad/materialdialogs/f$a;->a(ZI)Lcom/afollestad/materialdialogs/f$a;

    move-result-object v1

    invoke-virtual {v1, v3}, Lcom/afollestad/materialdialogs/f$a;->a(Z)Lcom/afollestad/materialdialogs/f$a;

    move-result-object v1

    invoke-virtual {v1, v3}, Lcom/afollestad/materialdialogs/f$a;->b(Z)Lcom/afollestad/materialdialogs/f$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/afollestad/materialdialogs/f$a;->c()Lcom/afollestad/materialdialogs/f;

    move-result-object v1

    new-instance v2, Landroid/os/Handler;

    invoke-direct {v2}, Landroid/os/Handler;-><init>()V

    new-instance v3, Lcom/fodlam/yds/MainActivity$6;

    invoke-direct {v3, p0, v0, v1}, Lcom/fodlam/yds/MainActivity$6;-><init>(Lcom/fodlam/yds/MainActivity;Lcom/fodlam/yds/f/h;Lcom/afollestad/materialdialogs/f;)V

    const-wide/16 v0, 0x3e8

    invoke-virtual {v2, v3, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    invoke-virtual {p0}, Lcom/fodlam/yds/MainActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "notifyword"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    goto :goto_0
.end method

.method private q()V
    .locals 7

    const/4 v6, 0x1

    const/4 v0, 0x4

    new-array v1, v0, [I

    fill-array-data v1, :array_0

    invoke-static {v6}, Landroid/support/v7/app/g;->a(Z)V

    invoke-static {}, Lcom/fodlam/yds/c/b;->a()Lcom/fodlam/yds/c/b;

    move-result-object v2

    iget-object v0, p0, Lcom/fodlam/yds/MainActivity;->v:Lcom/nightonke/boommenu/BoomMenuButton;

    sget-object v3, Lcom/nightonke/boommenu/b;->d:Lcom/nightonke/boommenu/b;

    invoke-virtual {v0, v3}, Lcom/nightonke/boommenu/BoomMenuButton;->setButtonEnum(Lcom/nightonke/boommenu/b;)V

    iget-object v0, p0, Lcom/fodlam/yds/MainActivity;->v:Lcom/nightonke/boommenu/BoomMenuButton;

    sget-object v3, Lcom/nightonke/boommenu/b/d;->M:Lcom/nightonke/boommenu/b/d;

    invoke-virtual {v0, v3}, Lcom/nightonke/boommenu/BoomMenuButton;->setButtonPlaceEnum(Lcom/nightonke/boommenu/b/d;)V

    iget-object v0, p0, Lcom/fodlam/yds/MainActivity;->v:Lcom/nightonke/boommenu/BoomMenuButton;

    sget-object v3, Lcom/nightonke/boommenu/c/d;->M:Lcom/nightonke/boommenu/c/d;

    invoke-virtual {v0, v3}, Lcom/nightonke/boommenu/BoomMenuButton;->setPiecePlaceEnum(Lcom/nightonke/boommenu/c/d;)V

    const/4 v0, 0x0

    :goto_0
    iget-object v3, p0, Lcom/fodlam/yds/MainActivity;->v:Lcom/nightonke/boommenu/BoomMenuButton;

    invoke-virtual {v3}, Lcom/nightonke/boommenu/BoomMenuButton;->getPiecePlaceEnum()Lcom/nightonke/boommenu/c/d;

    move-result-object v3

    invoke-virtual {v3}, Lcom/nightonke/boommenu/c/d;->a()I

    move-result v3

    if-ge v0, v3, :cond_0

    iget-object v3, p0, Lcom/fodlam/yds/MainActivity;->v:Lcom/nightonke/boommenu/BoomMenuButton;

    new-instance v4, Lcom/nightonke/boommenu/b/f$a;

    invoke-direct {v4}, Lcom/nightonke/boommenu/b/f$a;-><init>()V

    aget v5, v1, v0

    invoke-static {p0, v5}, Landroid/support/v4/c/a;->a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/nightonke/boommenu/b/f$a;->a(Landroid/graphics/drawable/Drawable;)Lcom/nightonke/boommenu/b/f$a;

    move-result-object v4

    invoke-virtual {v2, v0}, Lcom/fodlam/yds/c/b;->c(I)Lcom/fodlam/yds/f/b;

    move-result-object v5

    iget-object v5, v5, Lcom/fodlam/yds/f/b;->a:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lcom/nightonke/boommenu/b/f$a;->a(Ljava/lang/String;)Lcom/nightonke/boommenu/b/f$a;

    move-result-object v4

    const/16 v5, 0x10

    invoke-virtual {v4, v5}, Lcom/nightonke/boommenu/b/f$a;->b(I)Lcom/nightonke/boommenu/b/f$a;

    move-result-object v4

    const v5, 0x7f0e001e

    invoke-virtual {v4, v5}, Lcom/nightonke/boommenu/b/f$a;->c(I)Lcom/nightonke/boommenu/b/f$a;

    move-result-object v4

    sget-object v5, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {v4, v5}, Lcom/nightonke/boommenu/b/f$a;->a(Landroid/graphics/Typeface;)Lcom/nightonke/boommenu/b/f$a;

    move-result-object v4

    const v5, 0x7f0e005c

    invoke-virtual {v4, v5}, Lcom/nightonke/boommenu/b/f$a;->d(I)Lcom/nightonke/boommenu/b/f$a;

    move-result-object v4

    invoke-virtual {v4, v6}, Lcom/nightonke/boommenu/b/f$a;->a(Z)Lcom/nightonke/boommenu/b/f$a;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/nightonke/boommenu/BoomMenuButton;->a(Lcom/nightonke/boommenu/b/b;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/fodlam/yds/MainActivity;->v:Lcom/nightonke/boommenu/BoomMenuButton;

    new-instance v1, Lcom/fodlam/yds/MainActivity$7;

    invoke-direct {v1, p0}, Lcom/fodlam/yds/MainActivity$7;-><init>(Lcom/fodlam/yds/MainActivity;)V

    invoke-virtual {v0, v1}, Lcom/nightonke/boommenu/BoomMenuButton;->setOnBoomListener(Lcom/nightonke/boommenu/d;)V

    return-void

    :array_0
    .array-data 4
        0x7f02007f
        0x7f020080
        0x7f020081
        0x7f020083
    .end array-data
.end method


# virtual methods
.method public a(Landroid/view/MenuItem;)Z
    .locals 6

    const/4 v5, 0x1

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x7f100209

    if-ne v0, v1, :cond_3

    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/fodlam/yds/HelperActivity;

    invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v1}, Lcom/fodlam/yds/MainActivity;->startActivity(Landroid/content/Intent;)V

    :cond_0
    :goto_0
    const v1, 0x7f100205

    if-ne v0, v1, :cond_1

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/fodlam/yds/NewsMessagesActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/MainActivity;->startActivity(Landroid/content/Intent;)V

    :cond_1
    iget-object v0, p0, Lcom/fodlam/yds/MainActivity;->p:Landroid/support/v4/widget/DrawerLayout;

    const v1, 0x800003

    invoke-virtual {v0, v1}, Landroid/support/v4/widget/DrawerLayout;->f(I)V

    :cond_2
    return v5

    :cond_3
    const v1, 0x7f100206

    if-ne v0, v1, :cond_4

    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/fodlam/yds/StatisticActivity;

    invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v1}, Lcom/fodlam/yds/MainActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    :cond_4
    const v1, 0x7f100204

    if-ne v0, v1, :cond_5

    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/fodlam/yds/FodlaBillingActivity;

    invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v1}, Lcom/fodlam/yds/MainActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    :cond_5
    const v1, 0x7f100208

    if-eq v0, v1, :cond_2

    const v1, 0x7f100207

    if-ne v0, v1, :cond_6

    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/fodlam/yds/SettingsActivity;

    invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v1}, Lcom/fodlam/yds/MainActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    :cond_6
    const v1, 0x7f10020b

    if-ne v0, v1, :cond_7

    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.SEND"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/high16 v2, 0x10000000

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    const-string v2, "text/plain"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    const-string v2, "android.intent.extra.TEXT"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Merhabalar, l\u00fctfen bu uygumalay\u0131 indirin!\nhttp://play.google.com/store/apps/details?id="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {p0}, Lcom/fodlam/yds/MainActivity;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "\n"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0, v1}, Lcom/fodlam/yds/MainActivity;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_0

    :cond_7
    const v1, 0x7f10020c

    if-ne v0, v1, :cond_8

    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v2, "market://search?id=Fodla%20Media"

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    invoke-virtual {p0, v1}, Lcom/fodlam/yds/MainActivity;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_0

    :cond_8
    const v1, 0x7f10020a

    if-ne v0, v1, :cond_0

    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "market://details?id="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Lcom/fodlam/yds/MainActivity;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    invoke-virtual {p0, v1}, Lcom/fodlam/yds/MainActivity;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_0
.end method

.method public b(I)V
    .locals 2

    invoke-virtual {p0}, Lcom/fodlam/yds/MainActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/fodlam/yds/OxfordApplication;->c(Landroid/content/Context;)V

    invoke-static {}, Lcom/fodlam/yds/c/b;->a()Lcom/fodlam/yds/c/b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/fodlam/yds/c/b;->c(I)Lcom/fodlam/yds/f/b;

    move-result-object v0

    iget-boolean v0, v0, Lcom/fodlam/yds/f/b;->c:Z

    if-eqz v0, :cond_0

    sput p1, Lcom/fodlam/yds/OxfordApplication;->g:I

    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "CurrentCategory"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    const/4 v0, 0x0

    sput v0, Lcom/fodlam/yds/OxfordApplication;->i:I

    invoke-virtual {p0}, Lcom/fodlam/yds/MainActivity;->j()V

    :cond_0
    return-void
.end method

.method public clickLearnedWords(Landroid/view/View;)V
    .locals 2

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/fodlam/yds/WordListActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/MainActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public clickPlayButton(Landroid/view/View;)V
    .locals 2

    invoke-static {}, Lcom/fodlam/yds/c/b;->a()Lcom/fodlam/yds/c/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fodlam/yds/c/b;->g()Lcom/fodlam/yds/f/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fodlam/yds/f/b;->a()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    const v0, 0x7f09003e

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :goto_0
    return-void

    :cond_0
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/fodlam/yds/WordLearningActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/MainActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0
.end method

.method public clickTests(Landroid/view/View;)V
    .locals 2

    invoke-static {}, Lcom/fodlam/yds/c/b;->a()Lcom/fodlam/yds/c/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fodlam/yds/c/b;->g()Lcom/fodlam/yds/f/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fodlam/yds/f/b;->a()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    const v0, 0x7f09003e

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :goto_0
    return-void

    :cond_0
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/fodlam/yds/TestLevelActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/MainActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0
.end method

.method j()V
    .locals 3

    invoke-static {}, Lcom/fodlam/yds/c/b;->a()Lcom/fodlam/yds/c/b;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lcom/fodlam/yds/c/b;->a(Landroid/content/Context;Z)Lcom/fodlam/yds/c/b;

    :cond_0
    invoke-static {}, Lcom/fodlam/yds/c/b;->a()Lcom/fodlam/yds/c/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fodlam/yds/c/b;->g()Lcom/fodlam/yds/f/b;

    move-result-object v1

    iget-object v0, p0, Lcom/fodlam/yds/MainActivity;->n:Landroid/view/MenuItem;

    invoke-virtual {v1}, Lcom/fodlam/yds/f/b;->b()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Landroid/view/MenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    const v0, 0x7f100147

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v1}, Lcom/fodlam/yds/f/b;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f100148

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v1}, Lcom/fodlam/yds/f/b;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fodlam/yds/MainActivity;->w:Lat/grabner/circleprogress/CircleProgressView;

    invoke-virtual {v0}, Lat/grabner/circleprogress/CircleProgressView;->d()V

    iget-object v0, p0, Lcom/fodlam/yds/MainActivity;->w:Lat/grabner/circleprogress/CircleProgressView;

    invoke-virtual {v0}, Lat/grabner/circleprogress/CircleProgressView;->c()V

    const/4 v0, 0x0

    invoke-virtual {v1}, Lcom/fodlam/yds/f/b;->a()I

    move-result v2

    if-eqz v2, :cond_1

    const/high16 v0, 0x42c80000    # 100.0f

    invoke-virtual {v1}, Lcom/fodlam/yds/f/b;->h()I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v0, v2

    invoke-virtual {v1}, Lcom/fodlam/yds/f/b;->a()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    :cond_1
    iget-object v1, p0, Lcom/fodlam/yds/MainActivity;->w:Lat/grabner/circleprogress/CircleProgressView;

    invoke-virtual {v1, v0}, Lat/grabner/circleprogress/CircleProgressView;->setValueAnimated(F)V

    return-void
.end method

.method public k()V
    .locals 4

    const v3, 0x7f10020e

    iget-object v0, p0, Lcom/fodlam/yds/MainActivity;->q:Landroid/view/Menu;

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "news_messages"

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getStringSet(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    if-lez v0, :cond_1

    iget-object v1, p0, Lcom/fodlam/yds/MainActivity;->q:Landroid/view/Menu;

    invoke-interface {v1, v3}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v1

    sget-object v2, Lcom/mikepenz/fontawesome_typeface_library/FontAwesome$a;->cQ:Lcom/mikepenz/fontawesome_typeface_library/FontAwesome$a;

    sget-object v3, Lcom/mikepenz/actionitembadge/library/a$b;->c:Lcom/mikepenz/actionitembadge/library/a$b;

    invoke-static {p0, v1, v2, v3, v0}, Lcom/mikepenz/actionitembadge/library/a;->a(Landroid/app/Activity;Landroid/view/MenuItem;Lcom/mikepenz/iconics/a/a;Lcom/mikepenz/actionitembadge/library/a$b;I)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/fodlam/yds/MainActivity;->q:Landroid/view/Menu;

    invoke-interface {v0, v3}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    invoke-static {v0}, Lcom/mikepenz/actionitembadge/library/a;->a(Landroid/view/MenuItem;)V

    goto :goto_0
.end method

.method public onAttachedToWindow()V
    .locals 0

    invoke-super {p0}, Landroid/support/v7/app/e;->onAttachedToWindow()V

    return-void
.end method

.method public onBackPressed()V
    .locals 3

    const v2, 0x800003

    const v0, 0x7f10012e

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v4/widget/DrawerLayout;

    invoke-virtual {v0, v2}, Landroid/support/v4/widget/DrawerLayout;->g(I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, v2}, Landroid/support/v4/widget/DrawerLayout;->f(I)V

    :goto_0
    return-void

    :cond_0
    iget v0, p0, Lcom/fodlam/yds/MainActivity;->o:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/fodlam/yds/MainActivity;->o:I

    iget v0, p0, Lcom/fodlam/yds/MainActivity;->o:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Lcom/fodlam/yds/MainActivity;->finish()V

    goto :goto_0

    :cond_1
    const v0, 0x7f090378

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 9

    const v8, 0x7f100203

    const/4 v7, 0x1

    const v6, 0x3e99999a    # 0.3f

    invoke-super {p0, p1}, Landroid/support/v7/app/e;->onCreate(Landroid/os/Bundle;)V

    const v0, 0x7f040021

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/MainActivity;->setContentView(I)V

    const v0, 0x7f100127

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/support/v7/widget/Toolbar;

    invoke-virtual {p0, v3}, Lcom/fodlam/yds/MainActivity;->a(Landroid/support/v7/widget/Toolbar;)V

    const v0, 0x7f090046

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/MainActivity;->setTitle(Ljava/lang/CharSequence;)V

    const v0, 0x7f10012e

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v4/widget/DrawerLayout;

    iput-object v0, p0, Lcom/fodlam/yds/MainActivity;->p:Landroid/support/v4/widget/DrawerLayout;

    new-instance v0, Landroid/support/v7/app/b;

    iget-object v2, p0, Lcom/fodlam/yds/MainActivity;->p:Landroid/support/v4/widget/DrawerLayout;

    const v4, 0x7f090362

    const v5, 0x7f090361

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Landroid/support/v7/app/b;-><init>(Landroid/app/Activity;Landroid/support/v4/widget/DrawerLayout;Landroid/support/v7/widget/Toolbar;II)V

    iget-object v1, p0, Lcom/fodlam/yds/MainActivity;->p:Landroid/support/v4/widget/DrawerLayout;

    invoke-virtual {v1, v0}, Landroid/support/v4/widget/DrawerLayout;->a(Landroid/support/v4/widget/DrawerLayout$f;)V

    invoke-virtual {v0}, Landroid/support/v7/app/b;->a()V

    const v0, 0x7f10012f

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/design/widget/NavigationView;

    invoke-virtual {v0, p0}, Landroid/support/design/widget/NavigationView;->setNavigationItemSelectedListener(Landroid/support/design/widget/NavigationView$a;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/design/widget/NavigationView;->setItemIconTintList(Landroid/content/res/ColorStateList;)V

    invoke-virtual {v0}, Landroid/support/design/widget/NavigationView;->getMenu()Landroid/view/Menu;

    move-result-object v1

    const v2, 0x7f100208

    invoke-interface {v1, v2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v1

    invoke-static {v1}, Landroid/support/v4/view/q;->a(Landroid/view/MenuItem;)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/CompoundButton;

    iput-object v1, p0, Lcom/fodlam/yds/MainActivity;->r:Landroid/widget/CompoundButton;

    iget-object v1, p0, Lcom/fodlam/yds/MainActivity;->r:Landroid/widget/CompoundButton;

    new-instance v2, Lcom/fodlam/yds/MainActivity$1;

    invoke-direct {v2, p0}, Lcom/fodlam/yds/MainActivity$1;-><init>(Lcom/fodlam/yds/MainActivity;)V

    invoke-virtual {v1, v2}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    iget-object v1, p0, Lcom/fodlam/yds/MainActivity;->r:Landroid/widget/CompoundButton;

    sget-boolean v2, Lcom/fodlam/yds/OxfordApplication;->d:Z

    invoke-virtual {v1, v2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    invoke-virtual {v0}, Landroid/support/design/widget/NavigationView;->getMenu()Landroid/view/Menu;

    move-result-object v1

    invoke-interface {v1, v8}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v1

    iput-object v1, p0, Lcom/fodlam/yds/MainActivity;->n:Landroid/view/MenuItem;

    invoke-virtual {v0}, Landroid/support/design/widget/NavigationView;->getMenu()Landroid/view/Menu;

    move-result-object v0

    invoke-interface {v0, v8}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v4/view/q;->a(Landroid/view/MenuItem;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/nightonke/boommenu/BoomMenuButton;

    iput-object v0, p0, Lcom/fodlam/yds/MainActivity;->v:Lcom/nightonke/boommenu/BoomMenuButton;

    invoke-direct {p0}, Lcom/fodlam/yds/MainActivity;->q()V

    const v0, 0x7f100149

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lat/grabner/circleprogress/CircleProgressView;

    iput-object v0, p0, Lcom/fodlam/yds/MainActivity;->w:Lat/grabner/circleprogress/CircleProgressView;

    iget-object v0, p0, Lcom/fodlam/yds/MainActivity;->w:Lat/grabner/circleprogress/CircleProgressView;

    const/high16 v1, 0x40a00000    # 5.0f

    invoke-virtual {v0, v1}, Lat/grabner/circleprogress/CircleProgressView;->setSpinSpeed(F)V

    const v0, 0x7f100145

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/fodlam/yds/MainActivity$2;

    invoke-direct {v1, p0}, Lcom/fodlam/yds/MainActivity$2;-><init>(Lcom/fodlam/yds/MainActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f10014d

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lcom/balysv/materialripple/a;->a(Landroid/view/View;)Lcom/balysv/materialripple/a$c;

    move-result-object v0

    const-string v1, "#BBDEFB"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/balysv/materialripple/a$c;->a(I)Lcom/balysv/materialripple/a$c;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/balysv/materialripple/a$c;->a(F)Lcom/balysv/materialripple/a$c;

    move-result-object v0

    invoke-virtual {v0, v7}, Lcom/balysv/materialripple/a$c;->b(Z)Lcom/balysv/materialripple/a$c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/balysv/materialripple/a$c;->a()Lcom/balysv/materialripple/a;

    const v0, 0x7f10014b

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lcom/balysv/materialripple/a;->a(Landroid/view/View;)Lcom/balysv/materialripple/a$c;

    move-result-object v0

    const-string v1, "#BBDEFB"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/balysv/materialripple/a$c;->a(I)Lcom/balysv/materialripple/a$c;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/balysv/materialripple/a$c;->a(F)Lcom/balysv/materialripple/a$c;

    move-result-object v0

    invoke-virtual {v0, v7}, Lcom/balysv/materialripple/a$c;->b(Z)Lcom/balysv/materialripple/a$c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/balysv/materialripple/a$c;->a()Lcom/balysv/materialripple/a;

    const v0, 0x7f10014f

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lcom/balysv/materialripple/a;->a(Landroid/view/View;)Lcom/balysv/materialripple/a$c;

    move-result-object v0

    const-string v1, "#BBDEFB"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/balysv/materialripple/a$c;->a(I)Lcom/balysv/materialripple/a$c;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/balysv/materialripple/a$c;->a(F)Lcom/balysv/materialripple/a$c;

    move-result-object v0

    invoke-virtual {v0, v7}, Lcom/balysv/materialripple/a$c;->b(Z)Lcom/balysv/materialripple/a$c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/balysv/materialripple/a$c;->a()Lcom/balysv/materialripple/a;

    invoke-static {}, Lcom/google/firebase/messaging/a;->a()Lcom/google/firebase/messaging/a;

    move-result-object v0

    const-string v1, "ydstest"

    invoke-virtual {v0, v1}, Lcom/google/firebase/messaging/a;->a(Ljava/lang/String;)V

    sput-object p0, Lcom/fodlam/yds/MainActivity;->m:Lcom/fodlam/yds/MainActivity;

    invoke-virtual {p0}, Lcom/fodlam/yds/MainActivity;->j()V

    invoke-direct {p0}, Lcom/fodlam/yds/MainActivity;->m()V

    invoke-direct {p0}, Lcom/fodlam/yds/MainActivity;->l()V

    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    invoke-virtual {p0}, Lcom/fodlam/yds/MainActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    const v1, 0x7f110001

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    iput-object p1, p0, Lcom/fodlam/yds/MainActivity;->q:Landroid/view/Menu;

    invoke-virtual {p0}, Lcom/fodlam/yds/MainActivity;->k()V

    const/4 v0, 0x1

    return v0
.end method

.method protected onDestroy()V
    .locals 1

    const/4 v0, 0x0

    invoke-super {p0}, Landroid/support/v7/app/e;->onDestroy()V

    invoke-static {}, Lcom/fodlam/yds/OxfordApplication;->b()V

    iput-object v0, p0, Lcom/fodlam/yds/MainActivity;->v:Lcom/nightonke/boommenu/BoomMenuButton;

    iput-object v0, p0, Lcom/fodlam/yds/MainActivity;->w:Lat/grabner/circleprogress/CircleProgressView;

    iput-object v0, p0, Lcom/fodlam/yds/MainActivity;->n:Landroid/view/MenuItem;

    iput-object v0, p0, Lcom/fodlam/yds/MainActivity;->p:Landroid/support/v4/widget/DrawerLayout;

    iput-object v0, p0, Lcom/fodlam/yds/MainActivity;->r:Landroid/widget/CompoundButton;

    iget-object v0, p0, Lcom/fodlam/yds/MainActivity;->t:Lcom/b/a/a/a/c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fodlam/yds/MainActivity;->t:Lcom/b/a/a/a/c;

    invoke-virtual {v0}, Lcom/b/a/a/a/c;->c()V

    :cond_0
    invoke-virtual {p0}, Lcom/fodlam/yds/MainActivity;->finishAffinity()V

    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 3

    const/4 v0, 0x1

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v1

    const v2, 0x7f10020e

    if-ne v1, v2, :cond_0

    const/4 v1, 0x0

    invoke-static {p1, v1}, Lcom/mikepenz/actionitembadge/library/a;->a(Landroid/view/MenuItem;I)V

    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/fodlam/yds/NewsMessagesActivity;

    invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v1}, Lcom/fodlam/yds/MainActivity;->startActivity(Landroid/content/Intent;)V

    :goto_0
    return v0

    :cond_0
    const v2, 0x7f10020d

    if-ne v1, v2, :cond_1

    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/fodlam/yds/SearchResultsActivity;

    invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v1}, Lcom/fodlam/yds/MainActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    :cond_1
    invoke-super {p0, p1}, Landroid/support/v7/app/e;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    goto :goto_0
.end method

.method protected onResume()V
    .locals 3

    const/16 v2, 0x8

    invoke-virtual {p0}, Lcom/fodlam/yds/MainActivity;->j()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/fodlam/yds/MainActivity;->o:I

    invoke-virtual {p0}, Lcom/fodlam/yds/MainActivity;->k()V

    iget-object v0, p0, Lcom/fodlam/yds/MainActivity;->r:Landroid/widget/CompoundButton;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fodlam/yds/MainActivity;->r:Landroid/widget/CompoundButton;

    sget-boolean v1, Lcom/fodlam/yds/OxfordApplication;->d:Z

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    :cond_0
    invoke-direct {p0}, Lcom/fodlam/yds/MainActivity;->p()V

    sget-boolean v0, Lcom/fodlam/yds/OxfordApplication;->f:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/fodlam/yds/MainActivity;->s:Lcom/google/android/gms/ads/AdView;

    if-eqz v0, :cond_1

    const v0, 0x7f10013e

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    const v0, 0x7f100151

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    invoke-super {p0}, Landroid/support/v7/app/e;->onResume()V

    invoke-direct {p0}, Lcom/fodlam/yds/MainActivity;->n()V

    return-void
.end method

.method public setClickBanner(Landroid/view/View;)V
    .locals 2

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/fodlam/yds/FodlaBillingActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/MainActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method
