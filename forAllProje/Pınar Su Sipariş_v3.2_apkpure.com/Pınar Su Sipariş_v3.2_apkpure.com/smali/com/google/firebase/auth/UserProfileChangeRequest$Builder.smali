.class public Lcom/google/firebase/auth/UserProfileChangeRequest$Builder;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/auth/UserProfileChangeRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private zzaco:Ljava/lang/String;

.field private zzbFl:Z

.field private zzbFm:Z

.field private zzbFn:Landroid/net/Uri;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lcom/google/firebase/auth/UserProfileChangeRequest;
    .locals 6

    new-instance v0, Lcom/google/firebase/auth/UserProfileChangeRequest;

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/google/firebase/auth/UserProfileChangeRequest$Builder;->zzaco:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/firebase/auth/UserProfileChangeRequest$Builder;->zzbFn:Landroid/net/Uri;

    if-nez v3, :cond_0

    const/4 v3, 0x0

    :goto_0
    iget-boolean v4, p0, Lcom/google/firebase/auth/UserProfileChangeRequest$Builder;->zzbFl:Z

    iget-boolean v5, p0, Lcom/google/firebase/auth/UserProfileChangeRequest$Builder;->zzbFm:Z

    invoke-direct/range {v0 .. v5}, Lcom/google/firebase/auth/UserProfileChangeRequest;-><init>(ILjava/lang/String;Ljava/lang/String;ZZ)V

    return-object v0

    :cond_0
    iget-object v3, p0, Lcom/google/firebase/auth/UserProfileChangeRequest$Builder;->zzbFn:Landroid/net/Uri;

    invoke-virtual {v3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_0
.end method

.method public setDisplayName(Ljava/lang/String;)Lcom/google/firebase/auth/UserProfileChangeRequest$Builder;
    .locals 1

    if-nez p1, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/firebase/auth/UserProfileChangeRequest$Builder;->zzbFl:Z

    :goto_0
    return-object p0

    :cond_0
    iput-object p1, p0, Lcom/google/firebase/auth/UserProfileChangeRequest$Builder;->zzaco:Ljava/lang/String;

    goto :goto_0
.end method

.method public setPhotoUri(Landroid/net/Uri;)Lcom/google/firebase/auth/UserProfileChangeRequest$Builder;
    .locals 1

    if-nez p1, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/firebase/auth/UserProfileChangeRequest$Builder;->zzbFm:Z

    :goto_0
    return-object p0

    :cond_0
    iput-object p1, p0, Lcom/google/firebase/auth/UserProfileChangeRequest$Builder;->zzbFn:Landroid/net/Uri;

    goto :goto_0
.end method
