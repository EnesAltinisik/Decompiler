.class public Lcom/b/a/a/a/e;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/b/a/a/a/e;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Lcom/b/a/a/a/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/b/a/a/a/e$1;

    invoke-direct {v0}, Lcom/b/a/a/a/e$1;-><init>()V

    sput-object v0, Lcom/b/a/a/a/e;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/b/a/a/a/e;->a:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/b/a/a/a/e;->b:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/b/a/a/a/e;->a()Lcom/b/a/a/a/d;

    move-result-object v0

    iput-object v0, p0, Lcom/b/a/a/a/e;->c:Lcom/b/a/a/a/d;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/b/a/a/a/e;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/b/a/a/a/e;->b:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/b/a/a/a/e;->a()Lcom/b/a/a/a/d;

    move-result-object v0

    iput-object v0, p0, Lcom/b/a/a/a/e;->c:Lcom/b/a/a/a/d;

    return-void
.end method


# virtual methods
.method public a()Lcom/b/a/a/a/d;
    .locals 8
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-wide/16 v6, 0x0

    const/4 v1, 0x0

    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    iget-object v0, p0, Lcom/b/a/a/a/e;->a:Ljava/lang/String;

    invoke-direct {v3, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    new-instance v0, Lcom/b/a/a/a/d;

    invoke-direct {v0}, Lcom/b/a/a/a/d;-><init>()V

    const-string v2, "orderId"

    invoke-virtual {v3, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/b/a/a/a/d;->a:Ljava/lang/String;

    const-string v2, "packageName"

    invoke-virtual {v3, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/b/a/a/a/d;->b:Ljava/lang/String;

    const-string v2, "productId"

    invoke-virtual {v3, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/b/a/a/a/d;->c:Ljava/lang/String;

    const-string v2, "purchaseTime"

    const-wide/16 v4, 0x0

    invoke-virtual {v3, v2, v4, v5}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v4

    cmp-long v2, v4, v6

    if-eqz v2, :cond_0

    new-instance v2, Ljava/util/Date;

    invoke-direct {v2, v4, v5}, Ljava/util/Date;-><init>(J)V

    :goto_0
    iput-object v2, v0, Lcom/b/a/a/a/d;->d:Ljava/util/Date;

    invoke-static {}, Lcom/b/a/a/a/f;->values()[Lcom/b/a/a/a/f;

    move-result-object v2

    const-string v4, "purchaseState"

    const/4 v5, 0x1

    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v4

    aget-object v2, v2, v4

    iput-object v2, v0, Lcom/b/a/a/a/d;->e:Lcom/b/a/a/a/f;

    const-string v2, "developerPayload"

    invoke-virtual {v3, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/b/a/a/a/d;->f:Ljava/lang/String;

    const-string v2, "purchaseToken"

    invoke-virtual {v3, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/b/a/a/a/d;->g:Ljava/lang/String;

    const-string v2, "autoRenewing"

    invoke-virtual {v3, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v2

    iput-boolean v2, v0, Lcom/b/a/a/a/d;->h:Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    return-object v0

    :cond_0
    move-object v2, v1

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v2, "iabv3.purchaseInfo"

    const-string v3, "Failed to parse response data"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    move-object v0, v1

    goto :goto_1
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    iget-object v0, p0, Lcom/b/a/a/a/e;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/b/a/a/a/e;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
