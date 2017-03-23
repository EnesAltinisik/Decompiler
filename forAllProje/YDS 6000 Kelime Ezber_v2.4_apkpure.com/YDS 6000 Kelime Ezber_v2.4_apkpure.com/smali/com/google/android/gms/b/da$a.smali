.class Lcom/google/android/gms/b/da$a;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0xe
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/b/da;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/da;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/b/da;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/da$a;->a:Lcom/google/android/gms/b/da;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/b/da;Lcom/google/android/gms/b/da$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/b/da$a;-><init>(Lcom/google/android/gms/b/da;)V

    return-void
.end method

.method private a(Ljava/lang/String;)Z
    .locals 3

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/da$a;->a:Lcom/google/android/gms/b/da;

    const-string v1, "auto"

    const-string v2, "_ldl"

    invoke-virtual {v0, v1, v2, p1}, Lcom/google/android/gms/b/da;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 5

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/b/da$a;->a:Lcom/google/android/gms/b/da;

    invoke-virtual {v0}, Lcom/google/android/gms/b/da;->u()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->D()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v1, "onActivityCreated"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Landroid/net/Uri;->isHierarchical()Z

    move-result v2

    if-eqz v2, :cond_4

    if-nez p2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/b/da$a;->a:Lcom/google/android/gms/b/da;

    invoke-virtual {v2}, Lcom/google/android/gms/b/da;->q()Lcom/google/android/gms/b/dl;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/b/dl;->a(Landroid/net/Uri;)Landroid/os/Bundle;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/b/da$a;->a:Lcom/google/android/gms/b/da;

    invoke-virtual {v3}, Lcom/google/android/gms/b/da;->q()Lcom/google/android/gms/b/dl;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/google/android/gms/b/dl;->a(Landroid/content/Intent;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "gs"

    :goto_0
    if-eqz v2, :cond_0

    iget-object v3, p0, Lcom/google/android/gms/b/da$a;->a:Lcom/google/android/gms/b/da;

    const-string v4, "_cmp"

    invoke-virtual {v3, v0, v4, v2}, Lcom/google/android/gms/b/da;->a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_0
    const-string v0, "referrer"

    invoke-virtual {v1, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    :goto_1
    return-void

    :cond_1
    const-string v0, "auto"

    goto :goto_0

    :cond_2
    const-string v0, "gclid"

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v0, "utm_campaign"

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "utm_source"

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "utm_medium"

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "utm_term"

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "utm_content"

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_3
    const/4 v0, 0x1

    :goto_2
    if-nez v0, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/b/da$a;->a:Lcom/google/android/gms/b/da;

    invoke-virtual {v0}, Lcom/google/android/gms/b/da;->u()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->C()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v1, "Activity created with data \'referrer\' param without gclid and at least one utm field"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/b/da$a;->a:Lcom/google/android/gms/b/da;

    invoke-virtual {v1}, Lcom/google/android/gms/b/da;->u()Lcom/google/android/gms/b/co;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/b/co;->x()Lcom/google/android/gms/b/co$a;

    move-result-object v1

    const-string v2, "Throwable caught in onActivityCreated"

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_4
    :goto_3
    iget-object v0, p0, Lcom/google/android/gms/b/da$a;->a:Lcom/google/android/gms/b/da;

    invoke-virtual {v0}, Lcom/google/android/gms/b/da;->l()Lcom/google/android/gms/b/db;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/b/db;->a(Landroid/app/Activity;Landroid/os/Bundle;)V

    goto :goto_1

    :cond_5
    const/4 v0, 0x0

    goto :goto_2

    :cond_6
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/b/da$a;->a:Lcom/google/android/gms/b/da;

    invoke-virtual {v0}, Lcom/google/android/gms/b/da;->u()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->C()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v2, "Activity created with referrer"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0, v1}, Lcom/google/android/gms/b/da$a;->a(Ljava/lang/String;)Z
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3
.end method

.method public onActivityDestroyed(Landroid/app/Activity;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/da$a;->a:Lcom/google/android/gms/b/da;

    invoke-virtual {v0}, Lcom/google/android/gms/b/da;->l()Lcom/google/android/gms/b/db;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/b/db;->d(Landroid/app/Activity;)V

    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/da$a;->a:Lcom/google/android/gms/b/da;

    invoke-virtual {v0}, Lcom/google/android/gms/b/da;->l()Lcom/google/android/gms/b/db;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/b/db;->c(Landroid/app/Activity;)V

    iget-object v0, p0, Lcom/google/android/gms/b/da$a;->a:Lcom/google/android/gms/b/da;

    invoke-virtual {v0}, Lcom/google/android/gms/b/da;->s()Lcom/google/android/gms/b/de;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/de;->y()V

    return-void
.end method

.method public onActivityResumed(Landroid/app/Activity;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/da$a;->a:Lcom/google/android/gms/b/da;

    invoke-virtual {v0}, Lcom/google/android/gms/b/da;->l()Lcom/google/android/gms/b/db;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/b/db;->b(Landroid/app/Activity;)V

    iget-object v0, p0, Lcom/google/android/gms/b/da$a;->a:Lcom/google/android/gms/b/da;

    invoke-virtual {v0}, Lcom/google/android/gms/b/da;->s()Lcom/google/android/gms/b/de;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/de;->x()V

    return-void
.end method

.method public onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/da$a;->a:Lcom/google/android/gms/b/da;

    invoke-virtual {v0}, Lcom/google/android/gms/b/da;->l()Lcom/google/android/gms/b/db;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/b/db;->b(Landroid/app/Activity;Landroid/os/Bundle;)V

    return-void
.end method

.method public onActivityStarted(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method
