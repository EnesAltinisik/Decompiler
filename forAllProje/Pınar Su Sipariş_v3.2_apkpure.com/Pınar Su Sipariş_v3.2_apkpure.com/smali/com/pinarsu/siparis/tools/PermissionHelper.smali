.class public Lcom/pinarsu/siparis/tools/PermissionHelper;
.super Ljava/lang/Object;
.source "PermissionHelper.java"


# instance fields
.field private final REQUEST_CODE:I

.field private activity:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    const/16 v0, 0x6f

    iput v0, p0, Lcom/pinarsu/siparis/tools/PermissionHelper;->REQUEST_CODE:I

    .line 20
    iput-object p1, p0, Lcom/pinarsu/siparis/tools/PermissionHelper;->activity:Landroid/app/Activity;

    .line 21
    return-void
.end method


# virtual methods
.method public checkPermissionGranted([Ljava/lang/String;)Z
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 31
    const/4 v2, 0x1

    move v0, v1

    .line 32
    :goto_0
    array-length v3, p1

    if-ge v0, v3, :cond_1

    .line 33
    iget-object v3, p0, Lcom/pinarsu/siparis/tools/PermissionHelper;->activity:Landroid/app/Activity;

    aget-object v4, p1, v0

    invoke-static {v3, v4}, Landroid/support/v4/app/ActivityCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v3

    .line 34
    if-eqz v3, :cond_0

    .line 39
    :goto_1
    return v1

    .line 32
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    move v1, v2

    goto :goto_1
.end method

.method public isAndroidVersion6AndGreater()Z
    .locals 2

    .prologue
    .line 70
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    .line 71
    const/4 v0, 0x1

    .line 73
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)Z
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 53
    const/4 v2, 0x1

    move v0, v1

    .line 54
    :goto_0
    array-length v3, p2

    if-ge v0, v3, :cond_1

    .line 56
    aget v3, p3, v0

    if-eqz v3, :cond_0

    .line 61
    :goto_1
    return v1

    .line 54
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    move v1, v2

    goto :goto_1
.end method

.method public requestPermissions([Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 48
    iget-object v0, p0, Lcom/pinarsu/siparis/tools/PermissionHelper;->activity:Landroid/app/Activity;

    const/16 v1, 0x6f

    invoke-static {v0, p1, v1}, Landroid/support/v4/app/ActivityCompat;->requestPermissions(Landroid/app/Activity;[Ljava/lang/String;I)V

    .line 49
    return-void
.end method
