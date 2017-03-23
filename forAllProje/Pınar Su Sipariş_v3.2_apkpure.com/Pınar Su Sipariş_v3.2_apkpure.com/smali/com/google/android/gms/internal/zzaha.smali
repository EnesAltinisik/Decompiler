.class public Lcom/google/android/gms/internal/zzaha;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/zzahb;


# static fields
.field static final synthetic $assertionsDisabled:Z


# instance fields
.field private final zzbPG:Lcom/google/android/gms/internal/zzaho;

.field private final zzbQk:Lcom/google/android/gms/internal/zzahc;

.field private final zzbQl:I

.field private final zzbQm:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/google/android/gms/internal/zzaha;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/google/android/gms/internal/zzaha;->$assertionsDisabled:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/zzagt;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/zzahc;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/zzahc;-><init>(Lcom/google/android/gms/internal/zzagt;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzaha;->zzbQk:Lcom/google/android/gms/internal/zzahc;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagt;->zzSK()Lcom/google/android/gms/internal/zzaho;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzaha;->zzbPG:Lcom/google/android/gms/internal/zzaho;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagt;->getLimit()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/zzaha;->zzbQl:I

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagt;->zzSM()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzaha;->zzbQm:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private zza(Lcom/google/android/gms/internal/zzahp;Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzahb$zza;Lcom/google/android/gms/internal/zzagy;)Lcom/google/android/gms/internal/zzahp;
    .locals 8

    const/4 v2, 0x0

    const/4 v1, 0x1

    sget-boolean v0, Lcom/google/android/gms/internal/zzaha;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzahp;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzahu;->getChildCount()I

    move-result v0

    iget v3, p0, Lcom/google/android/gms/internal/zzaha;->zzbQl:I

    if-eq v0, v3, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_0
    new-instance v4, Lcom/google/android/gms/internal/zzaht;

    invoke-direct {v4, p2, p3}, Lcom/google/android/gms/internal/zzaht;-><init>(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzaha;->zzbQm:Z

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzahp;->zzTF()Lcom/google/android/gms/internal/zzaht;

    move-result-object v0

    :goto_0
    iget-object v3, p0, Lcom/google/android/gms/internal/zzaha;->zzbQk:Lcom/google/android/gms/internal/zzahc;

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/zzahc;->zza(Lcom/google/android/gms/internal/zzaht;)Z

    move-result v5

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzahp;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v3

    invoke-interface {v3, p2}, Lcom/google/android/gms/internal/zzahu;->zzk(Lcom/google/android/gms/internal/zzahi;)Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzahp;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v3

    invoke-interface {v3, p2}, Lcom/google/android/gms/internal/zzahu;->zzm(Lcom/google/android/gms/internal/zzahi;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v6

    iget-object v3, p0, Lcom/google/android/gms/internal/zzaha;->zzbPG:Lcom/google/android/gms/internal/zzaho;

    iget-boolean v7, p0, Lcom/google/android/gms/internal/zzaha;->zzbQm:Z

    invoke-interface {p4, v3, v0, v7}, Lcom/google/android/gms/internal/zzahb$zza;->zza(Lcom/google/android/gms/internal/zzaho;Lcom/google/android/gms/internal/zzaht;Z)Lcom/google/android/gms/internal/zzaht;

    move-result-object v0

    move-object v3, v0

    :goto_1
    if-eqz v3, :cond_3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/zzaht;->zzTK()Lcom/google/android/gms/internal/zzahi;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/zzahi;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzahp;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-virtual {v3}, Lcom/google/android/gms/internal/zzaht;->zzTK()Lcom/google/android/gms/internal/zzahi;

    move-result-object v7

    invoke-interface {v0, v7}, Lcom/google/android/gms/internal/zzahu;->zzk(Lcom/google/android/gms/internal/zzahi;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/zzaha;->zzbPG:Lcom/google/android/gms/internal/zzaho;

    iget-boolean v7, p0, Lcom/google/android/gms/internal/zzaha;->zzbQm:Z

    invoke-interface {p4, v0, v3, v7}, Lcom/google/android/gms/internal/zzahb$zza;->zza(Lcom/google/android/gms/internal/zzaho;Lcom/google/android/gms/internal/zzaht;Z)Lcom/google/android/gms/internal/zzaht;

    move-result-object v0

    move-object v3, v0

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzahp;->zzTG()Lcom/google/android/gms/internal/zzaht;

    move-result-object v0

    goto :goto_0

    :cond_3
    if-nez v3, :cond_6

    move v0, v1

    :goto_2
    if-eqz v5, :cond_7

    invoke-interface {p3}, Lcom/google/android/gms/internal/zzahu;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_7

    if-ltz v0, :cond_7

    move v0, v1

    :goto_3
    if-eqz v0, :cond_8

    if-eqz p5, :cond_4

    invoke-static {p2, p3, v6}, Lcom/google/android/gms/internal/zzago;->zza(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzago;

    move-result-object v0

    invoke-virtual {p5, v0}, Lcom/google/android/gms/internal/zzagy;->zza(Lcom/google/android/gms/internal/zzago;)V

    :cond_4
    invoke-virtual {p1, p2, p3}, Lcom/google/android/gms/internal/zzahp;->zzh(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahp;

    move-result-object p1

    :cond_5
    :goto_4
    return-object p1

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/zzaha;->zzbPG:Lcom/google/android/gms/internal/zzaho;

    iget-boolean v7, p0, Lcom/google/android/gms/internal/zzaha;->zzbQm:Z

    invoke-virtual {v0, v3, v4, v7}, Lcom/google/android/gms/internal/zzaho;->zza(Lcom/google/android/gms/internal/zzaht;Lcom/google/android/gms/internal/zzaht;Z)I

    move-result v0

    goto :goto_2

    :cond_7
    move v0, v2

    goto :goto_3

    :cond_8
    if-eqz p5, :cond_9

    invoke-static {p2, v6}, Lcom/google/android/gms/internal/zzago;->zzd(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzago;

    move-result-object v0

    invoke-virtual {p5, v0}, Lcom/google/android/gms/internal/zzagy;->zza(Lcom/google/android/gms/internal/zzago;)V

    :cond_9
    invoke-static {}, Lcom/google/android/gms/internal/zzahn;->zzTA()Lcom/google/android/gms/internal/zzahn;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lcom/google/android/gms/internal/zzahp;->zzh(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahp;

    move-result-object p1

    if-eqz v3, :cond_b

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaha;->zzbQk:Lcom/google/android/gms/internal/zzahc;

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/zzahc;->zza(Lcom/google/android/gms/internal/zzaht;)Z

    move-result v0

    if-eqz v0, :cond_b

    move v0, v1

    :goto_5
    if-eqz v0, :cond_5

    if-eqz p5, :cond_a

    invoke-virtual {v3}, Lcom/google/android/gms/internal/zzaht;->zzTK()Lcom/google/android/gms/internal/zzahi;

    move-result-object v0

    invoke-virtual {v3}, Lcom/google/android/gms/internal/zzaht;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/zzago;->zzc(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzago;

    move-result-object v0

    invoke-virtual {p5, v0}, Lcom/google/android/gms/internal/zzagy;->zza(Lcom/google/android/gms/internal/zzago;)V

    :cond_a
    invoke-virtual {v3}, Lcom/google/android/gms/internal/zzaht;->zzTK()Lcom/google/android/gms/internal/zzahi;

    move-result-object v0

    invoke-virtual {v3}, Lcom/google/android/gms/internal/zzaht;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/zzahp;->zzh(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahp;

    move-result-object p1

    goto :goto_4

    :cond_b
    move v0, v2

    goto :goto_5

    :cond_c
    invoke-interface {p3}, Lcom/google/android/gms/internal/zzahu;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_5

    if-eqz v5, :cond_5

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaha;->zzbPG:Lcom/google/android/gms/internal/zzaho;

    iget-boolean v2, p0, Lcom/google/android/gms/internal/zzaha;->zzbQm:Z

    invoke-virtual {v1, v0, v4, v2}, Lcom/google/android/gms/internal/zzaho;->zza(Lcom/google/android/gms/internal/zzaht;Lcom/google/android/gms/internal/zzaht;Z)I

    move-result v1

    if-ltz v1, :cond_5

    if-eqz p5, :cond_d

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaht;->zzTK()Lcom/google/android/gms/internal/zzahi;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaht;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/zzago;->zzd(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzago;

    move-result-object v1

    invoke-virtual {p5, v1}, Lcom/google/android/gms/internal/zzagy;->zza(Lcom/google/android/gms/internal/zzago;)V

    invoke-static {p2, p3}, Lcom/google/android/gms/internal/zzago;->zzc(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzago;

    move-result-object v1

    invoke-virtual {p5, v1}, Lcom/google/android/gms/internal/zzagy;->zza(Lcom/google/android/gms/internal/zzago;)V

    :cond_d
    invoke-virtual {p1, p2, p3}, Lcom/google/android/gms/internal/zzahp;->zzh(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahp;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaht;->zzTK()Lcom/google/android/gms/internal/zzahi;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/zzahn;->zzTA()Lcom/google/android/gms/internal/zzahn;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/zzahp;->zzh(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahp;

    move-result-object p1

    goto/16 :goto_4
.end method


# virtual methods
.method public zzSK()Lcom/google/android/gms/internal/zzaho;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaha;->zzbPG:Lcom/google/android/gms/internal/zzaho;

    return-object v0
.end method

.method public zzTa()Lcom/google/android/gms/internal/zzahb;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaha;->zzbQk:Lcom/google/android/gms/internal/zzahc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzahc;->zzTa()Lcom/google/android/gms/internal/zzahb;

    move-result-object v0

    return-object v0
.end method

.method public zzTb()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public zza(Lcom/google/android/gms/internal/zzahp;Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahb$zza;Lcom/google/android/gms/internal/zzagy;)Lcom/google/android/gms/internal/zzahp;
    .locals 7

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaha;->zzbQk:Lcom/google/android/gms/internal/zzahc;

    new-instance v1, Lcom/google/android/gms/internal/zzaht;

    invoke-direct {v1, p2, p3}, Lcom/google/android/gms/internal/zzaht;-><init>(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzahc;->zza(Lcom/google/android/gms/internal/zzaht;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {}, Lcom/google/android/gms/internal/zzahn;->zzTA()Lcom/google/android/gms/internal/zzahn;

    move-result-object v3

    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzahp;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-interface {v0, p2}, Lcom/google/android/gms/internal/zzahu;->zzm(Lcom/google/android/gms/internal/zzahi;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_1
    return-object p1

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzahp;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzahu;->getChildCount()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/zzaha;->zzbQl:I

    if-ge v0, v1, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaha;->zzbQk:Lcom/google/android/gms/internal/zzahc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzahc;->zzTa()Lcom/google/android/gms/internal/zzahb;

    move-result-object v0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-interface/range {v0 .. v6}, Lcom/google/android/gms/internal/zzahb;->zza(Lcom/google/android/gms/internal/zzahp;Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahb$zza;Lcom/google/android/gms/internal/zzagy;)Lcom/google/android/gms/internal/zzahp;

    move-result-object p1

    goto :goto_1

    :cond_1
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p5

    move-object v5, p6

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/zzaha;->zza(Lcom/google/android/gms/internal/zzahp;Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzahb$zza;Lcom/google/android/gms/internal/zzagy;)Lcom/google/android/gms/internal/zzahp;

    move-result-object p1

    goto :goto_1

    :cond_2
    move-object v3, p3

    goto :goto_0
.end method

.method public zza(Lcom/google/android/gms/internal/zzahp;Lcom/google/android/gms/internal/zzahp;Lcom/google/android/gms/internal/zzagy;)Lcom/google/android/gms/internal/zzahp;
    .locals 11

    const/4 v2, 0x1

    const/4 v7, 0x0

    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzahp;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzahu;->zzTo()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzahp;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzahu;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/zzahn;->zzTA()Lcom/google/android/gms/internal/zzahn;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaha;->zzbPG:Lcom/google/android/gms/internal/zzaho;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/zzahp;->zza(Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzaho;)Lcom/google/android/gms/internal/zzahp;

    move-result-object v9

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/zzaha;->zzbQk:Lcom/google/android/gms/internal/zzahc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzahc;->zzTa()Lcom/google/android/gms/internal/zzahb;

    move-result-object v0

    invoke-interface {v0, p1, v9, p3}, Lcom/google/android/gms/internal/zzahb;->zza(Lcom/google/android/gms/internal/zzahp;Lcom/google/android/gms/internal/zzahp;Lcom/google/android/gms/internal/zzagy;)Lcom/google/android/gms/internal/zzahp;

    move-result-object v0

    return-object v0

    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/zzahy;->zzTM()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/zzahp;->zzn(Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahp;

    move-result-object v6

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzaha;->zzbQm:Z

    if-eqz v0, :cond_4

    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzahp;->zzPw()Ljava/util/Iterator;

    move-result-object v1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaha;->zzbQk:Lcom/google/android/gms/internal/zzahc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzahc;->zzTd()Lcom/google/android/gms/internal/zzaht;

    move-result-object v4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaha;->zzbQk:Lcom/google/android/gms/internal/zzahc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzahc;->zzTc()Lcom/google/android/gms/internal/zzaht;

    move-result-object v3

    const/4 v0, -0x1

    move-object v5, v4

    move-object v4, v3

    move-object v3, v1

    move v1, v0

    :goto_0
    move v8, v7

    move-object v9, v6

    move v6, v7

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzaht;

    if-nez v6, :cond_3

    iget-object v10, p0, Lcom/google/android/gms/internal/zzaha;->zzbPG:Lcom/google/android/gms/internal/zzaho;

    invoke-virtual {v10, v5, v0}, Lcom/google/android/gms/internal/zzaho;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v10

    mul-int/2addr v10, v1

    if-gtz v10, :cond_3

    move v6, v2

    :cond_3
    if-eqz v6, :cond_5

    iget v10, p0, Lcom/google/android/gms/internal/zzaha;->zzbQl:I

    if-ge v8, v10, :cond_5

    iget-object v10, p0, Lcom/google/android/gms/internal/zzaha;->zzbPG:Lcom/google/android/gms/internal/zzaho;

    invoke-virtual {v10, v0, v4}, Lcom/google/android/gms/internal/zzaho;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v10

    mul-int/2addr v10, v1

    if-gtz v10, :cond_5

    move v10, v2

    :goto_2
    if-eqz v10, :cond_6

    add-int/lit8 v0, v8, 0x1

    move-object v8, v9

    :goto_3
    move-object v9, v8

    move v8, v0

    goto :goto_1

    :cond_4
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzahp;->iterator()Ljava/util/Iterator;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaha;->zzbQk:Lcom/google/android/gms/internal/zzahc;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzahc;->zzTc()Lcom/google/android/gms/internal/zzaht;

    move-result-object v3

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaha;->zzbQk:Lcom/google/android/gms/internal/zzahc;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzahc;->zzTd()Lcom/google/android/gms/internal/zzaht;

    move-result-object v1

    move-object v4, v1

    move-object v5, v3

    move v1, v2

    move-object v3, v0

    goto :goto_0

    :cond_5
    move v10, v7

    goto :goto_2

    :cond_6
    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaht;->zzTK()Lcom/google/android/gms/internal/zzahi;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/zzahn;->zzTA()Lcom/google/android/gms/internal/zzahn;

    move-result-object v10

    invoke-virtual {v9, v0, v10}, Lcom/google/android/gms/internal/zzahp;->zzh(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahp;

    move-result-object v9

    move v0, v8

    move-object v8, v9

    goto :goto_3
.end method

.method public zza(Lcom/google/android/gms/internal/zzahp;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahp;
    .locals 0

    return-object p1
.end method
