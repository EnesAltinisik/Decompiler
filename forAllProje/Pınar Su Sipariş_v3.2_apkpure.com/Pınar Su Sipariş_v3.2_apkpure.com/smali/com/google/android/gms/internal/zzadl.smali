.class public Lcom/google/android/gms/internal/zzadl;
.super Ljava/lang/Object;


# instance fields
.field private mContext:Landroid/content/Context;

.field private zzbFd:Lcom/google/android/gms/internal/zzajz;

.field private zzbGn:Ljava/lang/String;

.field private zzbGo:Lcom/google/android/gms/internal/zzakk;

.field private zzwV:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/zzajz;)V
    .locals 4

    const/4 v3, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/zzaa;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/zzaa;->zzdl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzadl;->zzbGn:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzadl;->mContext:Landroid/content/Context;

    const-string v0, "com.google.firebase.auth.api.Store.%s"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzadl;->zzbGn:Ljava/lang/String;

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p3}, Lcom/google/android/gms/common/internal/zzaa;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzajz;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzadl;->zzbFd:Lcom/google/android/gms/internal/zzajz;

    new-instance v0, Lcom/google/android/gms/internal/zzakk;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzakk;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzadl;->zzbGo:Lcom/google/android/gms/internal/zzakk;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadl;->mContext:Landroid/content/Context;

    invoke-virtual {v0, v1, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzadl;->zzwV:Landroid/content/SharedPreferences;

    return-void
.end method


# virtual methods
.method public clear(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadl;->zzwV:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, p1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public get(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadl;->zzwV:Landroid/content/SharedPreferences;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public zzOT()Lcom/google/firebase/auth/FirebaseUser;
    .locals 4

    const/4 v1, 0x0

    const-string v0, "com.google.firebase.auth.FIREBASE_USER"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzadl;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v0, v1

    :goto_0
    return-object v0

    :cond_0
    :try_start_0
    iget-object v2, p0, Lcom/google/android/gms/internal/zzadl;->zzbGo:Lcom/google/android/gms/internal/zzakk;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/zzakk;->zziR(Ljava/lang/String;)Lcom/google/android/gms/internal/zzakf;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzakf;->zzVJ()Lcom/google/android/gms/internal/zzaki;

    move-result-object v0

    const-string v2, "type"

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/zzaki;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v2, "type"

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/zzaki;->zziQ(Ljava/lang/String;)Lcom/google/android/gms/internal/zzakf;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzakf;->zzVA()Ljava/lang/String;

    move-result-object v2

    const-string v3, "com.google.firebase.auth.internal.DefaultFirebaseUser"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzadl;->zzbFd:Lcom/google/android/gms/internal/zzajz;

    const-class v3, Lcom/google/android/gms/internal/zzadh;

    invoke-virtual {v2, v0, v3}, Lcom/google/android/gms/internal/zzajz;->zza(Lcom/google/android/gms/internal/zzakf;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/auth/FirebaseUser;
    :try_end_0
    .catch Lcom/google/android/gms/internal/zzako; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    :cond_1
    move-object v0, v1

    goto :goto_0
.end method

.method public zzOU()V
    .locals 1

    const-string v0, "com.google.firebase.auth.FIREBASE_USER"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzadl;->clear(Ljava/lang/String;)V

    return-void
.end method

.method public zza(Lcom/google/firebase/auth/FirebaseUser;Lcom/google/firebase/auth/api/model/GetTokenResponse;)V
    .locals 4

    invoke-static {p1}, Lcom/google/android/gms/common/internal/zzaa;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/zzaa;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "com.google.firebase.auth.GET_TOKEN_RESPONSE.%s"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {p1}, Lcom/google/firebase/auth/FirebaseUser;->getUid()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/zzadl;->zzp(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public zze(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class",
            "<TT;>;)TT;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzadl;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/zzadl;->zzbFd:Lcom/google/android/gms/internal/zzajz;

    invoke-virtual {v1, v0, p2}, Lcom/google/android/gms/internal/zzajz;->zzf(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0
.end method

.method public zze(Lcom/google/firebase/auth/FirebaseUser;)V
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/common/internal/zzaa;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "com.google.firebase.auth.FIREBASE_USER"

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/internal/zzadl;->zzp(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public zzf(Lcom/google/firebase/auth/FirebaseUser;)Lcom/google/firebase/auth/api/model/GetTokenResponse;
    .locals 4

    invoke-static {p1}, Lcom/google/android/gms/common/internal/zzaa;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "com.google.firebase.auth.GET_TOKEN_RESPONSE.%s"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {p1}, Lcom/google/firebase/auth/FirebaseUser;->getUid()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-class v1, Lcom/google/firebase/auth/api/model/GetTokenResponse;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/zzadl;->zze(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/auth/api/model/GetTokenResponse;

    return-object v0
.end method

.method public zzg(Lcom/google/firebase/auth/FirebaseUser;)V
    .locals 4

    invoke-static {p1}, Lcom/google/android/gms/common/internal/zzaa;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "com.google.firebase.auth.GET_TOKEN_RESPONSE.%s"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {p1}, Lcom/google/firebase/auth/FirebaseUser;->getUid()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzadl;->clear(Ljava/lang/String;)V

    return-void
.end method

.method public zzp(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadl;->zzwV:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzadl;->zzbFd:Lcom/google/android/gms/internal/zzajz;

    invoke-virtual {v1, p2}, Lcom/google/android/gms/internal/zzajz;->zzaH(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method
