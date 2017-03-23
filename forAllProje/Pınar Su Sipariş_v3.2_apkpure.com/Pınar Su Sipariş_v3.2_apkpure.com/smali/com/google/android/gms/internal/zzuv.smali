.class public Lcom/google/android/gms/internal/zzuv;
.super Ljava/lang/Object;


# instance fields
.field private final mContext:Landroid/content/Context;

.field private final zzbnR:Ljava/lang/String;

.field private final zzbsk:Lcom/google/android/gms/tagmanager/zzba;

.field private final zzbsq:Lcom/google/android/gms/tagmanager/zzax;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/tagmanager/zzba;Lcom/google/android/gms/tagmanager/zzax;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzuv;->mContext:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzuv;->zzbsk:Lcom/google/android/gms/tagmanager/zzba;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzuv;->zzbsq:Lcom/google/android/gms/tagmanager/zzax;

    iput-object p4, p0, Lcom/google/android/gms/internal/zzuv;->zzbnR:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public zza(Lcom/google/android/gms/internal/zzabc;Lcom/google/android/gms/internal/zzabf;)Lcom/google/android/gms/internal/zzuu;
    .locals 7

    new-instance v0, Lcom/google/android/gms/internal/zzuu;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzuv;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzuv;->zzbnR:Ljava/lang/String;

    iget-object v5, p0, Lcom/google/android/gms/internal/zzuv;->zzbsk:Lcom/google/android/gms/tagmanager/zzba;

    iget-object v6, p0, Lcom/google/android/gms/internal/zzuv;->zzbsq:Lcom/google/android/gms/tagmanager/zzax;

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/zzuu;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/zzabc;Lcom/google/android/gms/internal/zzabf;Lcom/google/android/gms/tagmanager/zzba;Lcom/google/android/gms/tagmanager/zzax;)V

    return-object v0
.end method
