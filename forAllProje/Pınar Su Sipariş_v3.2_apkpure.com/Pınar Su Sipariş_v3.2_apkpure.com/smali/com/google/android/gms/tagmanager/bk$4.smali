.class Lcom/google/android/gms/tagmanager/bk$4;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/tagmanager/bk$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/tagmanager/bk;->a(Ljava/util/Set;Lcom/google/android/gms/tagmanager/bj;)Lcom/google/android/gms/tagmanager/as;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/tagmanager/bk;


# direct methods
.method constructor <init>(Lcom/google/android/gms/tagmanager/bk;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/bk$4;->a:Lcom/google/android/gms/tagmanager/bk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/zzabt$zze;Ljava/util/Set;Ljava/util/Set;Lcom/google/android/gms/tagmanager/bf;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzabt$zze;",
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/internal/zzabt$zza;",
            ">;",
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/internal/zzabt$zza;",
            ">;",
            "Lcom/google/android/gms/tagmanager/bf;",
            ")V"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzabt$zze;->zzMc()Ljava/util/List;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzabt$zze;->zzMd()Ljava/util/List;

    move-result-object v0

    invoke-interface {p3, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    invoke-interface {p4}, Lcom/google/android/gms/tagmanager/bf;->e()Lcom/google/android/gms/tagmanager/bd;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzabt$zze;->zzMc()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzabt$zze;->zzMI()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/tagmanager/bd;->zzc(Ljava/util/List;Ljava/util/List;)V

    invoke-interface {p4}, Lcom/google/android/gms/tagmanager/bf;->f()Lcom/google/android/gms/tagmanager/bd;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzabt$zze;->zzMd()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzabt$zze;->zzMJ()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/tagmanager/bd;->zzc(Ljava/util/List;Ljava/util/List;)V

    return-void
.end method
