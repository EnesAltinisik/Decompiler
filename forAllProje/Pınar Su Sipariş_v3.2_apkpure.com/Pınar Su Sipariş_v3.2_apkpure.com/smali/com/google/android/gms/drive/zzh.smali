.class public Lcom/google/android/gms/drive/zzh;
.super Lcom/google/android/gms/drive/ExecutionOptions;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/drive/zzh$zza;
    }
.end annotation


# instance fields
.field private zzavy:Ljava/lang/String;

.field private zzavz:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p5}, Lcom/google/android/gms/drive/ExecutionOptions;-><init>(Ljava/lang/String;ZI)V

    iput-object p3, p0, Lcom/google/android/gms/drive/zzh;->zzavy:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/drive/zzh;->zzavz:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ILcom/google/android/gms/drive/zzh$1;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/google/android/gms/drive/zzh;-><init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method public static zza(Lcom/google/android/gms/drive/ExecutionOptions;)Lcom/google/android/gms/drive/zzh;
    .locals 2

    new-instance v1, Lcom/google/android/gms/drive/zzh$zza;

    invoke-direct {v1}, Lcom/google/android/gms/drive/zzh$zza;-><init>()V

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/drive/ExecutionOptions;->zzvM()I

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "May not set a conflict strategy for new file creation."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/drive/ExecutionOptions;->zzvK()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/drive/zzh$zza;->setTrackingTag(Ljava/lang/String;)Lcom/google/android/gms/drive/ExecutionOptions$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/drive/zzh$zza;

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/drive/ExecutionOptions;->zzvL()Z

    move-result v0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/drive/zzh$zza;->setNotifyOnCompletion(Z)Lcom/google/android/gms/drive/ExecutionOptions$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/drive/zzh$zza;

    :cond_2
    invoke-virtual {v1}, Lcom/google/android/gms/drive/zzh$zza;->build()Lcom/google/android/gms/drive/ExecutionOptions;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/drive/zzh;

    return-object v0
.end method


# virtual methods
.method public zzvO()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/drive/zzh;->zzavy:Ljava/lang/String;

    return-object v0
.end method

.method public zzvP()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/drive/zzh;->zzavz:Ljava/lang/String;

    return-object v0
.end method
