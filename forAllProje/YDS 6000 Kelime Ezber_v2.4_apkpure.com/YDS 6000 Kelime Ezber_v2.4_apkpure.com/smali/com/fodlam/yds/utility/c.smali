.class public final Lcom/fodlam/yds/utility/c;
.super Ljava/lang/Object;


# static fields
.field static a:Ljava/text/SimpleDateFormat;

.field static b:Ljava/util/Random;

.field static c:Ljava/text/DecimalFormat;

.field private static d:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "dd.MM.yyyy"

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/fodlam/yds/utility/c;->a:Ljava/text/SimpleDateFormat;

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    sput-object v0, Lcom/fodlam/yds/utility/c;->b:Ljava/util/Random;

    new-instance v0, Ljava/text/DecimalFormat;

    const-string v1, "#.##"

    invoke-direct {v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/fodlam/yds/utility/c;->c:Ljava/text/DecimalFormat;

    const/16 v0, 0x11

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "#F44336"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "#E91E63"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "#9C27B0"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "#2196F3"

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-string v2, "#03A9F4"

    aput-object v2, v0, v1

    const/4 v1, 0x5

    const-string v2, "#00BCD4"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string v2, "#009688"

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string v2, "#4CAF50"

    aput-object v2, v0, v1

    const/16 v1, 0x8

    const-string v2, "#8BC34A"

    aput-object v2, v0, v1

    const/16 v1, 0x9

    const-string v2, "#CDDC39"

    aput-object v2, v0, v1

    const/16 v1, 0xa

    const-string v2, "#FFEB3B"

    aput-object v2, v0, v1

    const/16 v1, 0xb

    const-string v2, "#FFC107"

    aput-object v2, v0, v1

    const/16 v1, 0xc

    const-string v2, "#FF9800"

    aput-object v2, v0, v1

    const/16 v1, 0xd

    const-string v2, "#FF5722"

    aput-object v2, v0, v1

    const/16 v1, 0xe

    const-string v2, "#795548"

    aput-object v2, v0, v1

    const/16 v1, 0xf

    const-string v2, "#9E9E9E"

    aput-object v2, v0, v1

    const/16 v1, 0x10

    const-string v2, "#607D8B"

    aput-object v2, v0, v1

    sput-object v0, Lcom/fodlam/yds/utility/c;->d:[Ljava/lang/String;

    return-void
.end method

.method public static a()I
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    if-eqz v0, :cond_1

    const v0, 0x7f02009d

    :goto_1
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    const/high16 v0, 0x7f030000

    goto :goto_1
.end method

.method public static a(I)I
    .locals 2

    const/4 v0, 0x1

    const/16 v1, 0xa

    if-le p0, v1, :cond_1

    const/4 v0, 0x3

    :cond_0
    :goto_0
    return v0

    :cond_1
    const/4 v1, 0x5

    if-le p0, v1, :cond_0

    const/4 v0, 0x2

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;Landroid/view/ViewGroup;II)Lcom/google/android/gms/ads/i;
    .locals 3

    sget-boolean v0, Lcom/fodlam/yds/OxfordApplication;->f:Z

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/ads/i;

    invoke-direct {v0, p0}, Lcom/google/android/gms/ads/i;-><init>(Landroid/content/Context;)V

    new-instance v1, Lcom/google/android/gms/ads/d;

    invoke-direct {v1, p2, p3}, Lcom/google/android/gms/ads/d;-><init>(II)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/i;->setAdSize(Lcom/google/android/gms/ads/d;)V

    const v1, 0x7f09004a

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/i;->setAdUnitId(Ljava/lang/String;)V

    new-instance v1, Lcom/google/android/gms/ads/c$a;

    invoke-direct {v1}, Lcom/google/android/gms/ads/c$a;-><init>()V

    sget-object v2, Lcom/google/android/gms/ads/c;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/ads/c$a;->b(Ljava/lang/String;)Lcom/google/android/gms/ads/c$a;

    const-string v2, "C9B31154FD5A55FF4A275F4A3F3BB278"

    invoke-virtual {v1, v2}, Lcom/google/android/gms/ads/c$a;->b(Ljava/lang/String;)Lcom/google/android/gms/ads/c$a;

    const-string v2, "59D066C8530C98987ECD6E439C59A14F"

    invoke-virtual {v1, v2}, Lcom/google/android/gms/ads/c$a;->b(Ljava/lang/String;)Lcom/google/android/gms/ads/c$a;

    const-string v2, "A9D382793880830FCEED935DA3BBFA59"

    invoke-virtual {v1, v2}, Lcom/google/android/gms/ads/c$a;->b(Ljava/lang/String;)Lcom/google/android/gms/ads/c$a;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v1}, Lcom/google/android/gms/ads/c$a;->a()Lcom/google/android/gms/ads/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/i;->a(Lcom/google/android/gms/ads/c;)V

    new-instance v1, Lcom/fodlam/yds/utility/c$1;

    invoke-direct {v1, p1, v0}, Lcom/fodlam/yds/utility/c$1;-><init>(Landroid/view/ViewGroup;Lcom/google/android/gms/ads/i;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/i;->setAdListener(Lcom/google/android/gms/ads/a;)V

    const v1, 0x7f10013e

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    new-instance v2, Lcom/fodlam/yds/utility/c$2;

    invoke-direct {v2, p0}, Lcom/fodlam/yds/utility/c$2;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a(F)Ljava/lang/String;
    .locals 4

    sget-object v0, Lcom/fodlam/yds/utility/c;->c:Ljava/text/DecimalFormat;

    float-to-double v2, p0

    invoke-virtual {v0, v2, v3}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/util/Date;)Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/fodlam/yds/utility/c;->a:Ljava/text/SimpleDateFormat;

    invoke-virtual {v0, p0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/content/Context;)V
    .locals 4

    if-nez p0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    sget-boolean v0, Lcom/fodlam/yds/OxfordApplication;->e:Z

    if-eqz v0, :cond_0

    const-string v0, "vibrator"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Vibrator;

    invoke-virtual {v0}, Landroid/os/Vibrator;->hasVibrator()Z

    move-result v1

    if-eqz v1, :cond_0

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v2, v3}, Landroid/os/Vibrator;->vibrate(J)V

    goto :goto_0
.end method

.method public static b(I)Ljava/lang/String;
    .locals 1

    packed-switch p0, :pswitch_data_0

    const-string v0, "M\u00dcKEMMEL!"

    :goto_0
    return-object v0

    :pswitch_0
    const-string v0, "\u0130Y\u0130!"

    goto :goto_0

    :pswitch_1
    const-string v0, "HAR\u0130KA!"

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public static c(I)I
    .locals 1

    sget-object v0, Lcom/fodlam/yds/utility/c;->b:Ljava/util/Random;

    invoke-virtual {v0, p0}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    return v0
.end method
