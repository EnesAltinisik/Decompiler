.class public final Lcom/google/android/gms/internal/zzacv$zza$zza;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/zzacv$zza;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "zza"
.end annotation


# instance fields
.field private zzaoh:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/zzaa;->zzdl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzacv$zza$zza;->zzaoh:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public zzOw()Lcom/google/android/gms/internal/zzacv$zza;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/zzacv$zza;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzacv$zza$zza;->zzaoh:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/zzacv$zza;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/zzacv$1;)V

    return-object v0
.end method
