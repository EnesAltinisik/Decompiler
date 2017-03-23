.class public Lcom/google/android/gms/b/wv;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/b/vz;
.end annotation


# instance fields
.field public a:Landroid/os/Bundle;

.field public b:Landroid/os/Bundle;

.field public c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public d:Landroid/location/Location;

.field public e:Lcom/google/android/gms/b/xi$a;

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:Lcom/google/android/gms/b/wf;

.field public i:Lcom/google/android/gms/b/xe;

.field public j:Lorg/json/JSONObject;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/b/wv;->j:Lorg/json/JSONObject;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/b/wv;->c:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a(Landroid/location/Location;)Lcom/google/android/gms/b/wv;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/wv;->d:Landroid/location/Location;

    return-object p0
.end method

.method public a(Landroid/os/Bundle;)Lcom/google/android/gms/b/wv;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/wv;->b:Landroid/os/Bundle;

    return-object p0
.end method

.method public a(Lcom/google/android/gms/b/wf;)Lcom/google/android/gms/b/wv;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/wv;->h:Lcom/google/android/gms/b/wf;

    return-object p0
.end method

.method public a(Lcom/google/android/gms/b/xe;)Lcom/google/android/gms/b/wv;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/wv;->i:Lcom/google/android/gms/b/xe;

    return-object p0
.end method

.method public a(Lcom/google/android/gms/b/xi$a;)Lcom/google/android/gms/b/wv;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/wv;->e:Lcom/google/android/gms/b/xi$a;

    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/google/android/gms/b/wv;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/wv;->g:Ljava/lang/String;

    return-object p0
.end method

.method public a(Ljava/util/List;)Lcom/google/android/gms/b/wv;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/google/android/gms/b/wv;"
        }
    .end annotation

    if-nez p1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/wv;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/b/wv;->c:Ljava/util/List;

    return-object p0
.end method

.method public a(Lorg/json/JSONObject;)Lcom/google/android/gms/b/wv;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/wv;->j:Lorg/json/JSONObject;

    return-object p0
.end method

.method public b(Landroid/os/Bundle;)Lcom/google/android/gms/b/wv;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/wv;->a:Landroid/os/Bundle;

    return-object p0
.end method

.method public b(Ljava/lang/String;)Lcom/google/android/gms/b/wv;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/wv;->f:Ljava/lang/String;

    return-object p0
.end method
