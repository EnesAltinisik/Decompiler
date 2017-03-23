.class Lcom/google/android/gms/tagmanager/bk;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/tagmanager/bk$b;,
        Lcom/google/android/gms/tagmanager/bk$a;,
        Lcom/google/android/gms/tagmanager/bk$c;
    }
.end annotation


# static fields
.field private static final a:Lcom/google/android/gms/tagmanager/as;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/tagmanager/as",
            "<",
            "Lcom/google/android/gms/internal/zzag$zza;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Lcom/google/android/gms/internal/zzabt$zzc;

.field private final c:Lcom/google/android/gms/tagmanager/h;

.field private final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/tagmanager/k;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/tagmanager/k;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/tagmanager/k;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Lcom/google/android/gms/tagmanager/ce;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/tagmanager/ce",
            "<",
            "Lcom/google/android/gms/internal/zzabt$zza;",
            "Lcom/google/android/gms/tagmanager/as",
            "<",
            "Lcom/google/android/gms/internal/zzag$zza;",
            ">;>;"
        }
    .end annotation
.end field

.field private final h:Lcom/google/android/gms/tagmanager/ce;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/tagmanager/ce",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/tagmanager/bk$b;",
            ">;"
        }
    .end annotation
.end field

.field private final i:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/internal/zzabt$zze;",
            ">;"
        }
    .end annotation
.end field

.field private final j:Lcom/google/android/gms/tagmanager/DataLayer;

.field private final k:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/tagmanager/bk$c;",
            ">;"
        }
    .end annotation
.end field

.field private volatile l:Ljava/lang/String;

.field private m:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/android/gms/tagmanager/as;

    invoke-static {}, Lcom/google/android/gms/tagmanager/zzdl;->zzKT()Lcom/google/android/gms/internal/zzag$zza;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/tagmanager/as;-><init>(Ljava/lang/Object;Z)V

    sput-object v0, Lcom/google/android/gms/tagmanager/bk;->a:Lcom/google/android/gms/tagmanager/as;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/zzabt$zzc;Lcom/google/android/gms/tagmanager/DataLayer;Lcom/google/android/gms/tagmanager/zzt$zza;Lcom/google/android/gms/tagmanager/zzt$zza;Lcom/google/android/gms/tagmanager/h;)V
    .locals 8

    const/high16 v2, 0x100000

    const/4 v4, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p2, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "resource cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iput-object p2, p0, Lcom/google/android/gms/tagmanager/bk;->b:Lcom/google/android/gms/internal/zzabt$zzc;

    new-instance v0, Ljava/util/HashSet;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzabt$zzc;->zzLW()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/bk;->i:Ljava/util/Set;

    iput-object p3, p0, Lcom/google/android/gms/tagmanager/bk;->j:Lcom/google/android/gms/tagmanager/DataLayer;

    iput-object p6, p0, Lcom/google/android/gms/tagmanager/bk;->c:Lcom/google/android/gms/tagmanager/h;

    new-instance v0, Lcom/google/android/gms/tagmanager/bk$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/tagmanager/bk$1;-><init>(Lcom/google/android/gms/tagmanager/bk;)V

    new-instance v1, Lcom/google/android/gms/tagmanager/zzm;

    invoke-direct {v1}, Lcom/google/android/gms/tagmanager/zzm;-><init>()V

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/tagmanager/zzm;->a(ILcom/google/android/gms/tagmanager/zzm$zza;)Lcom/google/android/gms/tagmanager/ce;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/bk;->g:Lcom/google/android/gms/tagmanager/ce;

    new-instance v0, Lcom/google/android/gms/tagmanager/bk$2;

    invoke-direct {v0, p0}, Lcom/google/android/gms/tagmanager/bk$2;-><init>(Lcom/google/android/gms/tagmanager/bk;)V

    new-instance v1, Lcom/google/android/gms/tagmanager/zzm;

    invoke-direct {v1}, Lcom/google/android/gms/tagmanager/zzm;-><init>()V

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/tagmanager/zzm;->a(ILcom/google/android/gms/tagmanager/zzm$zza;)Lcom/google/android/gms/tagmanager/ce;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/bk;->h:Lcom/google/android/gms/tagmanager/ce;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/bk;->d:Ljava/util/Map;

    new-instance v0, Lcom/google/android/gms/tagmanager/zzj;

    invoke-direct {v0, p1}, Lcom/google/android/gms/tagmanager/zzj;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/bk;->b(Lcom/google/android/gms/tagmanager/k;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/zzt;

    invoke-direct {v0, p5}, Lcom/google/android/gms/tagmanager/zzt;-><init>(Lcom/google/android/gms/tagmanager/zzt$zza;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/bk;->b(Lcom/google/android/gms/tagmanager/k;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/cm;

    invoke-direct {v0, p3}, Lcom/google/android/gms/tagmanager/cm;-><init>(Lcom/google/android/gms/tagmanager/DataLayer;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/bk;->b(Lcom/google/android/gms/tagmanager/k;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/zzdm;

    invoke-direct {v0, p1, p3}, Lcom/google/android/gms/tagmanager/zzdm;-><init>(Landroid/content/Context;Lcom/google/android/gms/tagmanager/DataLayer;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/bk;->b(Lcom/google/android/gms/tagmanager/k;)V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/bk;->e:Ljava/util/Map;

    new-instance v0, Lcom/google/android/gms/tagmanager/ch;

    invoke-direct {v0}, Lcom/google/android/gms/tagmanager/ch;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/bk;->c(Lcom/google/android/gms/tagmanager/k;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/f;

    invoke-direct {v0}, Lcom/google/android/gms/tagmanager/f;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/bk;->c(Lcom/google/android/gms/tagmanager/k;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/zzag;

    invoke-direct {v0}, Lcom/google/android/gms/tagmanager/zzag;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/bk;->c(Lcom/google/android/gms/tagmanager/k;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/m;

    invoke-direct {v0}, Lcom/google/android/gms/tagmanager/m;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/bk;->c(Lcom/google/android/gms/tagmanager/k;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/n;

    invoke-direct {v0}, Lcom/google/android/gms/tagmanager/n;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/bk;->c(Lcom/google/android/gms/tagmanager/k;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/aa;

    invoke-direct {v0}, Lcom/google/android/gms/tagmanager/aa;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/bk;->c(Lcom/google/android/gms/tagmanager/k;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/ab;

    invoke-direct {v0}, Lcom/google/android/gms/tagmanager/ab;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/bk;->c(Lcom/google/android/gms/tagmanager/k;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/ba;

    invoke-direct {v0}, Lcom/google/android/gms/tagmanager/ba;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/bk;->c(Lcom/google/android/gms/tagmanager/k;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/br;

    invoke-direct {v0}, Lcom/google/android/gms/tagmanager/br;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/bk;->c(Lcom/google/android/gms/tagmanager/k;)V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/bk;->f:Ljava/util/Map;

    new-instance v0, Lcom/google/android/gms/tagmanager/v;

    invoke-direct {v0, p1}, Lcom/google/android/gms/tagmanager/v;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/bk;->a(Lcom/google/android/gms/tagmanager/k;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/ao;

    invoke-direct {v0, p1}, Lcom/google/android/gms/tagmanager/ao;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/bk;->a(Lcom/google/android/gms/tagmanager/k;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/bz;

    invoke-direct {v0, p1}, Lcom/google/android/gms/tagmanager/bz;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/bk;->a(Lcom/google/android/gms/tagmanager/k;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/ca;

    invoke-direct {v0, p1}, Lcom/google/android/gms/tagmanager/ca;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/bk;->a(Lcom/google/android/gms/tagmanager/k;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/cb;

    invoke-direct {v0, p1}, Lcom/google/android/gms/tagmanager/cb;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/bk;->a(Lcom/google/android/gms/tagmanager/k;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/cc;

    invoke-direct {v0, p1}, Lcom/google/android/gms/tagmanager/cc;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/bk;->a(Lcom/google/android/gms/tagmanager/k;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/cd;

    invoke-direct {v0, p1}, Lcom/google/android/gms/tagmanager/cd;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/bk;->a(Lcom/google/android/gms/tagmanager/k;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/cf;

    invoke-direct {v0}, Lcom/google/android/gms/tagmanager/cf;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/bk;->a(Lcom/google/android/gms/tagmanager/k;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/cg;

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/bk;->b:Lcom/google/android/gms/internal/zzabt$zzc;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzabt$zzc;->getVersion()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/tagmanager/cg;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/bk;->a(Lcom/google/android/gms/tagmanager/k;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/zzt;

    invoke-direct {v0, p4}, Lcom/google/android/gms/tagmanager/zzt;-><init>(Lcom/google/android/gms/tagmanager/zzt$zza;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/bk;->a(Lcom/google/android/gms/tagmanager/k;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/ck;

    invoke-direct {v0, p3}, Lcom/google/android/gms/tagmanager/ck;-><init>(Lcom/google/android/gms/tagmanager/DataLayer;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/bk;->a(Lcom/google/android/gms/tagmanager/k;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/a;

    invoke-direct {v0, p1}, Lcom/google/android/gms/tagmanager/a;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/bk;->a(Lcom/google/android/gms/tagmanager/k;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/b;

    invoke-direct {v0}, Lcom/google/android/gms/tagmanager/b;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/bk;->a(Lcom/google/android/gms/tagmanager/k;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/e;

    invoke-direct {v0}, Lcom/google/android/gms/tagmanager/e;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/bk;->a(Lcom/google/android/gms/tagmanager/k;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/i;

    invoke-direct {v0, p0}, Lcom/google/android/gms/tagmanager/i;-><init>(Lcom/google/android/gms/tagmanager/bk;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/bk;->a(Lcom/google/android/gms/tagmanager/k;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/o;

    invoke-direct {v0}, Lcom/google/android/gms/tagmanager/o;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/bk;->a(Lcom/google/android/gms/tagmanager/k;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/p;

    invoke-direct {v0}, Lcom/google/android/gms/tagmanager/p;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/bk;->a(Lcom/google/android/gms/tagmanager/k;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/w;

    invoke-direct {v0, p1}, Lcom/google/android/gms/tagmanager/w;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/bk;->a(Lcom/google/android/gms/tagmanager/k;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/x;

    invoke-direct {v0}, Lcom/google/android/gms/tagmanager/x;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/bk;->a(Lcom/google/android/gms/tagmanager/k;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/zzbi;

    invoke-direct {v0}, Lcom/google/android/gms/tagmanager/zzbi;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/bk;->a(Lcom/google/android/gms/tagmanager/k;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/ae;

    invoke-direct {v0}, Lcom/google/android/gms/tagmanager/ae;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/bk;->a(Lcom/google/android/gms/tagmanager/k;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/ag;

    invoke-direct {v0, p1}, Lcom/google/android/gms/tagmanager/ag;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/bk;->a(Lcom/google/android/gms/tagmanager/k;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/at;

    invoke-direct {v0}, Lcom/google/android/gms/tagmanager/at;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/bk;->a(Lcom/google/android/gms/tagmanager/k;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/av;

    invoke-direct {v0}, Lcom/google/android/gms/tagmanager/av;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/bk;->a(Lcom/google/android/gms/tagmanager/k;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/ax;

    invoke-direct {v0}, Lcom/google/android/gms/tagmanager/ax;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/bk;->a(Lcom/google/android/gms/tagmanager/k;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/az;

    invoke-direct {v0}, Lcom/google/android/gms/tagmanager/az;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/bk;->a(Lcom/google/android/gms/tagmanager/k;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/bb;

    invoke-direct {v0, p1}, Lcom/google/android/gms/tagmanager/bb;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/bk;->a(Lcom/google/android/gms/tagmanager/k;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/bl;

    invoke-direct {v0}, Lcom/google/android/gms/tagmanager/bl;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/bk;->a(Lcom/google/android/gms/tagmanager/k;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/bm;

    invoke-direct {v0}, Lcom/google/android/gms/tagmanager/bm;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/bk;->a(Lcom/google/android/gms/tagmanager/k;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/bt;

    invoke-direct {v0}, Lcom/google/android/gms/tagmanager/bt;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/bk;->a(Lcom/google/android/gms/tagmanager/k;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/bw;

    invoke-direct {v0}, Lcom/google/android/gms/tagmanager/bw;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/bk;->a(Lcom/google/android/gms/tagmanager/k;)V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/bk;->k:Ljava/util/Map;

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/bk;->i:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzabt$zze;

    invoke-interface {p6}, Lcom/google/android/gms/tagmanager/h;->a()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzabt$zze;->zzMF()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzabt$zze;->zzMG()Ljava/util/List;

    move-result-object v2

    const-string v3, "add macro"

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/tagmanager/bk;->a(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzabt$zze;->zzMK()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzabt$zze;->zzMH()Ljava/util/List;

    move-result-object v2

    const-string v3, "remove macro"

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/tagmanager/bk;->a(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzabt$zze;->zzMc()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzabt$zze;->zzMI()Ljava/util/List;

    move-result-object v2

    const-string v3, "add tag"

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/tagmanager/bk;->a(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzabt$zze;->zzMd()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzabt$zze;->zzMJ()Ljava/util/List;

    move-result-object v2

    const-string v3, "remove tag"

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/tagmanager/bk;->a(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V

    :cond_2
    move v3, v4

    :goto_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzabt$zze;->zzMF()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v3, v1, :cond_4

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzabt$zze;->zzMF()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/zzabt$zza;

    const-string v2, "Unknown"

    invoke-interface {p6}, Lcom/google/android/gms/tagmanager/h;->a()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzabt$zze;->zzMG()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-ge v3, v6, :cond_3

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzabt$zze;->zzMG()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    :cond_3
    iget-object v6, p0, Lcom/google/android/gms/tagmanager/bk;->k:Ljava/util/Map;

    invoke-static {v1}, Lcom/google/android/gms/tagmanager/bk;->a(Lcom/google/android/gms/internal/zzabt$zza;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/google/android/gms/tagmanager/bk;->a(Ljava/util/Map;Ljava/lang/String;)Lcom/google/android/gms/tagmanager/bk$c;

    move-result-object v6

    invoke-virtual {v6, v0}, Lcom/google/android/gms/tagmanager/bk$c;->a(Lcom/google/android/gms/internal/zzabt$zze;)V

    invoke-virtual {v6, v0, v1}, Lcom/google/android/gms/tagmanager/bk$c;->a(Lcom/google/android/gms/internal/zzabt$zze;Lcom/google/android/gms/internal/zzabt$zza;)V

    invoke-virtual {v6, v0, v2}, Lcom/google/android/gms/tagmanager/bk$c;->a(Lcom/google/android/gms/internal/zzabt$zze;Ljava/lang/String;)V

    add-int/lit8 v1, v3, 0x1

    move v3, v1

    goto :goto_0

    :cond_4
    move v3, v4

    :goto_1
    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzabt$zze;->zzMK()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v3, v1, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzabt$zze;->zzMK()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/zzabt$zza;

    const-string v2, "Unknown"

    invoke-interface {p6}, Lcom/google/android/gms/tagmanager/h;->a()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzabt$zze;->zzMH()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-ge v3, v6, :cond_5

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzabt$zze;->zzMH()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    :cond_5
    iget-object v6, p0, Lcom/google/android/gms/tagmanager/bk;->k:Ljava/util/Map;

    invoke-static {v1}, Lcom/google/android/gms/tagmanager/bk;->a(Lcom/google/android/gms/internal/zzabt$zza;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/google/android/gms/tagmanager/bk;->a(Ljava/util/Map;Ljava/lang/String;)Lcom/google/android/gms/tagmanager/bk$c;

    move-result-object v6

    invoke-virtual {v6, v0}, Lcom/google/android/gms/tagmanager/bk$c;->a(Lcom/google/android/gms/internal/zzabt$zze;)V

    invoke-virtual {v6, v0, v1}, Lcom/google/android/gms/tagmanager/bk$c;->b(Lcom/google/android/gms/internal/zzabt$zze;Lcom/google/android/gms/internal/zzabt$zza;)V

    invoke-virtual {v6, v0, v2}, Lcom/google/android/gms/tagmanager/bk$c;->b(Lcom/google/android/gms/internal/zzabt$zze;Ljava/lang/String;)V

    add-int/lit8 v1, v3, 0x1

    move v3, v1

    goto :goto_1

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/bk;->b:Lcom/google/android/gms/internal/zzabt$zzc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzabt$zzc;->zzMC()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_8
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/zzabt$zza;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzabt$zza;->zzLY()Ljava/util/Map;

    move-result-object v2

    sget-object v5, Lcom/google/android/gms/internal/zzae;->zzgD:Lcom/google/android/gms/internal/zzae;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/zzae;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/zzag$zza;

    invoke-static {v2}, Lcom/google/android/gms/tagmanager/zzdl;->zzk(Lcom/google/android/gms/internal/zzag$zza;)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_8

    iget-object v5, p0, Lcom/google/android/gms/tagmanager/bk;->k:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v5, v2}, Lcom/google/android/gms/tagmanager/bk;->a(Ljava/util/Map;Ljava/lang/String;)Lcom/google/android/gms/tagmanager/bk$c;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/tagmanager/bk$c;->a(Lcom/google/android/gms/internal/zzabt$zza;)V

    goto :goto_2

    :cond_9
    return-void
.end method

.method private a(Lcom/google/android/gms/internal/zzag$zza;Ljava/util/Set;Lcom/google/android/gms/tagmanager/bx;)Lcom/google/android/gms/tagmanager/as;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzag$zza;",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/android/gms/tagmanager/bx;",
            ")",
            "Lcom/google/android/gms/tagmanager/as",
            "<",
            "Lcom/google/android/gms/internal/zzag$zza;",
            ">;"
        }
    .end annotation

    const/4 v2, 0x0

    iget-boolean v0, p1, Lcom/google/android/gms/internal/zzag$zza;->zzjT:Z

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/tagmanager/as;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/tagmanager/as;-><init>(Ljava/lang/Object;Z)V

    :goto_0
    return-object v0

    :cond_0
    iget v0, p1, Lcom/google/android/gms/internal/zzag$zza;->type:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    iget v0, p1, Lcom/google/android/gms/internal/zzag$zza;->type:I

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x19

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Unknown type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/zzbn;->e(Ljava/lang/String;)V

    sget-object v0, Lcom/google/android/gms/tagmanager/bk;->a:Lcom/google/android/gms/tagmanager/as;

    goto :goto_0

    :pswitch_1
    invoke-static {p1}, Lcom/google/android/gms/internal/zzabt;->zzo(Lcom/google/android/gms/internal/zzag$zza;)Lcom/google/android/gms/internal/zzag$zza;

    move-result-object v3

    iget-object v0, p1, Lcom/google/android/gms/internal/zzag$zza;->zzjK:[Lcom/google/android/gms/internal/zzag$zza;

    array-length v0, v0

    new-array v0, v0, [Lcom/google/android/gms/internal/zzag$zza;

    iput-object v0, v3, Lcom/google/android/gms/internal/zzag$zza;->zzjK:[Lcom/google/android/gms/internal/zzag$zza;

    move v1, v2

    :goto_1
    iget-object v0, p1, Lcom/google/android/gms/internal/zzag$zza;->zzjK:[Lcom/google/android/gms/internal/zzag$zza;

    array-length v0, v0

    if-ge v1, v0, :cond_2

    iget-object v0, p1, Lcom/google/android/gms/internal/zzag$zza;->zzjK:[Lcom/google/android/gms/internal/zzag$zza;

    aget-object v0, v0, v1

    invoke-interface {p3, v1}, Lcom/google/android/gms/tagmanager/bx;->a(I)Lcom/google/android/gms/tagmanager/bx;

    move-result-object v4

    invoke-direct {p0, v0, p2, v4}, Lcom/google/android/gms/tagmanager/bk;->a(Lcom/google/android/gms/internal/zzag$zza;Ljava/util/Set;Lcom/google/android/gms/tagmanager/bx;)Lcom/google/android/gms/tagmanager/as;

    move-result-object v0

    sget-object v4, Lcom/google/android/gms/tagmanager/bk;->a:Lcom/google/android/gms/tagmanager/as;

    if-ne v0, v4, :cond_1

    sget-object v0, Lcom/google/android/gms/tagmanager/bk;->a:Lcom/google/android/gms/tagmanager/as;

    goto :goto_0

    :cond_1
    iget-object v4, v3, Lcom/google/android/gms/internal/zzag$zza;->zzjK:[Lcom/google/android/gms/internal/zzag$zza;

    invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/as;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzag$zza;

    aput-object v0, v4, v1

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    :cond_2
    new-instance v0, Lcom/google/android/gms/tagmanager/as;

    invoke-direct {v0, v3, v2}, Lcom/google/android/gms/tagmanager/as;-><init>(Ljava/lang/Object;Z)V

    goto :goto_0

    :pswitch_2
    invoke-static {p1}, Lcom/google/android/gms/internal/zzabt;->zzo(Lcom/google/android/gms/internal/zzag$zza;)Lcom/google/android/gms/internal/zzag$zza;

    move-result-object v3

    iget-object v0, p1, Lcom/google/android/gms/internal/zzag$zza;->zzjL:[Lcom/google/android/gms/internal/zzag$zza;

    array-length v0, v0

    iget-object v1, p1, Lcom/google/android/gms/internal/zzag$zza;->zzjM:[Lcom/google/android/gms/internal/zzag$zza;

    array-length v1, v1

    if-eq v0, v1, :cond_4

    const-string v1, "Invalid serving value: "

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzag$zza;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_2
    invoke-static {v0}, Lcom/google/android/gms/tagmanager/zzbn;->e(Ljava/lang/String;)V

    sget-object v0, Lcom/google/android/gms/tagmanager/bk;->a:Lcom/google/android/gms/tagmanager/as;

    goto :goto_0

    :cond_3
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :cond_4
    iget-object v0, p1, Lcom/google/android/gms/internal/zzag$zza;->zzjL:[Lcom/google/android/gms/internal/zzag$zza;

    array-length v0, v0

    new-array v0, v0, [Lcom/google/android/gms/internal/zzag$zza;

    iput-object v0, v3, Lcom/google/android/gms/internal/zzag$zza;->zzjL:[Lcom/google/android/gms/internal/zzag$zza;

    iget-object v0, p1, Lcom/google/android/gms/internal/zzag$zza;->zzjL:[Lcom/google/android/gms/internal/zzag$zza;

    array-length v0, v0

    new-array v0, v0, [Lcom/google/android/gms/internal/zzag$zza;

    iput-object v0, v3, Lcom/google/android/gms/internal/zzag$zza;->zzjM:[Lcom/google/android/gms/internal/zzag$zza;

    move v1, v2

    :goto_3
    iget-object v0, p1, Lcom/google/android/gms/internal/zzag$zza;->zzjL:[Lcom/google/android/gms/internal/zzag$zza;

    array-length v0, v0

    if-ge v1, v0, :cond_7

    iget-object v0, p1, Lcom/google/android/gms/internal/zzag$zza;->zzjL:[Lcom/google/android/gms/internal/zzag$zza;

    aget-object v0, v0, v1

    invoke-interface {p3, v1}, Lcom/google/android/gms/tagmanager/bx;->b(I)Lcom/google/android/gms/tagmanager/bx;

    move-result-object v4

    invoke-direct {p0, v0, p2, v4}, Lcom/google/android/gms/tagmanager/bk;->a(Lcom/google/android/gms/internal/zzag$zza;Ljava/util/Set;Lcom/google/android/gms/tagmanager/bx;)Lcom/google/android/gms/tagmanager/as;

    move-result-object v0

    iget-object v4, p1, Lcom/google/android/gms/internal/zzag$zza;->zzjM:[Lcom/google/android/gms/internal/zzag$zza;

    aget-object v4, v4, v1

    invoke-interface {p3, v1}, Lcom/google/android/gms/tagmanager/bx;->c(I)Lcom/google/android/gms/tagmanager/bx;

    move-result-object v5

    invoke-direct {p0, v4, p2, v5}, Lcom/google/android/gms/tagmanager/bk;->a(Lcom/google/android/gms/internal/zzag$zza;Ljava/util/Set;Lcom/google/android/gms/tagmanager/bx;)Lcom/google/android/gms/tagmanager/as;

    move-result-object v4

    sget-object v5, Lcom/google/android/gms/tagmanager/bk;->a:Lcom/google/android/gms/tagmanager/as;

    if-eq v0, v5, :cond_5

    sget-object v5, Lcom/google/android/gms/tagmanager/bk;->a:Lcom/google/android/gms/tagmanager/as;

    if-ne v4, v5, :cond_6

    :cond_5
    sget-object v0, Lcom/google/android/gms/tagmanager/bk;->a:Lcom/google/android/gms/tagmanager/as;

    goto/16 :goto_0

    :cond_6
    iget-object v5, v3, Lcom/google/android/gms/internal/zzag$zza;->zzjL:[Lcom/google/android/gms/internal/zzag$zza;

    invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/as;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzag$zza;

    aput-object v0, v5, v1

    iget-object v5, v3, Lcom/google/android/gms/internal/zzag$zza;->zzjM:[Lcom/google/android/gms/internal/zzag$zza;

    invoke-virtual {v4}, Lcom/google/android/gms/tagmanager/as;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzag$zza;

    aput-object v0, v5, v1

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_3

    :cond_7
    new-instance v0, Lcom/google/android/gms/tagmanager/as;

    invoke-direct {v0, v3, v2}, Lcom/google/android/gms/tagmanager/as;-><init>(Ljava/lang/Object;Z)V

    goto/16 :goto_0

    :pswitch_3
    iget-object v0, p1, Lcom/google/android/gms/internal/zzag$zza;->zzjN:Ljava/lang/String;

    invoke-interface {p2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, p1, Lcom/google/android/gms/internal/zzag$zza;->zzjN:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x4f

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Macro cycle detected.  Current macro reference: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ".  Previous macro references: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/zzbn;->e(Ljava/lang/String;)V

    sget-object v0, Lcom/google/android/gms/tagmanager/bk;->a:Lcom/google/android/gms/tagmanager/as;

    goto/16 :goto_0

    :cond_8
    iget-object v0, p1, Lcom/google/android/gms/internal/zzag$zza;->zzjN:Ljava/lang/String;

    invoke-interface {p2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v0, p1, Lcom/google/android/gms/internal/zzag$zza;->zzjN:Ljava/lang/String;

    invoke-interface {p3}, Lcom/google/android/gms/tagmanager/bx;->a()Lcom/google/android/gms/tagmanager/af;

    move-result-object v1

    invoke-direct {p0, v0, p2, v1}, Lcom/google/android/gms/tagmanager/bk;->a(Ljava/lang/String;Ljava/util/Set;Lcom/google/android/gms/tagmanager/af;)Lcom/google/android/gms/tagmanager/as;

    move-result-object v0

    iget-object v1, p1, Lcom/google/android/gms/internal/zzag$zza;->zzjS:[I

    invoke-static {v0, v1}, Lcom/google/android/gms/tagmanager/by;->a(Lcom/google/android/gms/tagmanager/as;[I)Lcom/google/android/gms/tagmanager/as;

    move-result-object v0

    iget-object v1, p1, Lcom/google/android/gms/internal/zzag$zza;->zzjN:Ljava/lang/String;

    invoke-interface {p2, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_4
    invoke-static {p1}, Lcom/google/android/gms/internal/zzabt;->zzo(Lcom/google/android/gms/internal/zzag$zza;)Lcom/google/android/gms/internal/zzag$zza;

    move-result-object v3

    iget-object v0, p1, Lcom/google/android/gms/internal/zzag$zza;->zzjR:[Lcom/google/android/gms/internal/zzag$zza;

    array-length v0, v0

    new-array v0, v0, [Lcom/google/android/gms/internal/zzag$zza;

    iput-object v0, v3, Lcom/google/android/gms/internal/zzag$zza;->zzjR:[Lcom/google/android/gms/internal/zzag$zza;

    move v1, v2

    :goto_4
    iget-object v0, p1, Lcom/google/android/gms/internal/zzag$zza;->zzjR:[Lcom/google/android/gms/internal/zzag$zza;

    array-length v0, v0

    if-ge v1, v0, :cond_a

    iget-object v0, p1, Lcom/google/android/gms/internal/zzag$zza;->zzjR:[Lcom/google/android/gms/internal/zzag$zza;

    aget-object v0, v0, v1

    invoke-interface {p3, v1}, Lcom/google/android/gms/tagmanager/bx;->d(I)Lcom/google/android/gms/tagmanager/bx;

    move-result-object v4

    invoke-direct {p0, v0, p2, v4}, Lcom/google/android/gms/tagmanager/bk;->a(Lcom/google/android/gms/internal/zzag$zza;Ljava/util/Set;Lcom/google/android/gms/tagmanager/bx;)Lcom/google/android/gms/tagmanager/as;

    move-result-object v0

    sget-object v4, Lcom/google/android/gms/tagmanager/bk;->a:Lcom/google/android/gms/tagmanager/as;

    if-ne v0, v4, :cond_9

    sget-object v0, Lcom/google/android/gms/tagmanager/bk;->a:Lcom/google/android/gms/tagmanager/as;

    goto/16 :goto_0

    :cond_9
    iget-object v4, v3, Lcom/google/android/gms/internal/zzag$zza;->zzjR:[Lcom/google/android/gms/internal/zzag$zza;

    invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/as;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzag$zza;

    aput-object v0, v4, v1

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_4

    :cond_a
    new-instance v0, Lcom/google/android/gms/tagmanager/as;

    invoke-direct {v0, v3, v2}, Lcom/google/android/gms/tagmanager/as;-><init>(Ljava/lang/Object;Z)V

    goto/16 :goto_0

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_4
    .end packed-switch
.end method

.method private a(Ljava/lang/String;Ljava/util/Set;Lcom/google/android/gms/tagmanager/af;)Lcom/google/android/gms/tagmanager/as;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/android/gms/tagmanager/af;",
            ")",
            "Lcom/google/android/gms/tagmanager/as",
            "<",
            "Lcom/google/android/gms/internal/zzag$zza;",
            ">;"
        }
    .end annotation

    const/4 v10, 0x1

    iget v0, p0, Lcom/google/android/gms/tagmanager/bk;->m:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/tagmanager/bk;->m:I

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/bk;->h:Lcom/google/android/gms/tagmanager/ce;

    invoke-interface {v0, p1}, Lcom/google/android/gms/tagmanager/ce;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/tagmanager/bk$b;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/bk;->c:Lcom/google/android/gms/tagmanager/h;

    invoke-interface {v1}, Lcom/google/android/gms/tagmanager/h;->a()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/bk$b;->b()Lcom/google/android/gms/internal/zzag$zza;

    move-result-object v1

    invoke-direct {p0, v1, p2}, Lcom/google/android/gms/tagmanager/bk;->a(Lcom/google/android/gms/internal/zzag$zza;Ljava/util/Set;)V

    iget v1, p0, Lcom/google/android/gms/tagmanager/bk;->m:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lcom/google/android/gms/tagmanager/bk;->m:I

    invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/bk$b;->a()Lcom/google/android/gms/tagmanager/as;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/bk;->k:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/google/android/gms/tagmanager/bk$c;

    if-nez v9, :cond_1

    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/bk;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0xf

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v2, v3

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "Invalid macro: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/zzbn;->e(Ljava/lang/String;)V

    iget v0, p0, Lcom/google/android/gms/tagmanager/bk;->m:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/google/android/gms/tagmanager/bk;->m:I

    sget-object v0, Lcom/google/android/gms/tagmanager/bk;->a:Lcom/google/android/gms/tagmanager/as;

    goto :goto_0

    :cond_1
    invoke-virtual {v9}, Lcom/google/android/gms/tagmanager/bk$c;->a()Ljava/util/Set;

    move-result-object v2

    invoke-virtual {v9}, Lcom/google/android/gms/tagmanager/bk$c;->b()Ljava/util/Map;

    move-result-object v3

    invoke-virtual {v9}, Lcom/google/android/gms/tagmanager/bk$c;->c()Ljava/util/Map;

    move-result-object v4

    invoke-virtual {v9}, Lcom/google/android/gms/tagmanager/bk$c;->e()Ljava/util/Map;

    move-result-object v5

    invoke-virtual {v9}, Lcom/google/android/gms/tagmanager/bk$c;->d()Ljava/util/Map;

    move-result-object v6

    invoke-interface {p3}, Lcom/google/android/gms/tagmanager/af;->b()Lcom/google/android/gms/tagmanager/bj;

    move-result-object v8

    move-object v0, p0

    move-object v1, p1

    move-object v7, p2

    invoke-virtual/range {v0 .. v8}, Lcom/google/android/gms/tagmanager/bk;->a(Ljava/lang/String;Ljava/util/Set;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;Lcom/google/android/gms/tagmanager/bj;)Lcom/google/android/gms/tagmanager/as;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/tagmanager/as;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v9}, Lcom/google/android/gms/tagmanager/bk$c;->f()Lcom/google/android/gms/internal/zzabt$zza;

    move-result-object v0

    move-object v3, v0

    :goto_1
    if-nez v3, :cond_4

    iget v0, p0, Lcom/google/android/gms/tagmanager/bk;->m:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/google/android/gms/tagmanager/bk;->m:I

    sget-object v0, Lcom/google/android/gms/tagmanager/bk;->a:Lcom/google/android/gms/tagmanager/as;

    goto/16 :goto_0

    :cond_2
    invoke-virtual {v1}, Lcom/google/android/gms/tagmanager/as;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    if-le v0, v10, :cond_3

    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/bk;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x25

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "Multiple macros active for macroName "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/zzbn;->zzaW(Ljava/lang/String;)V

    :cond_3
    invoke-virtual {v1}, Lcom/google/android/gms/tagmanager/as;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzabt$zza;

    move-object v3, v0

    goto :goto_1

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/bk;->f:Ljava/util/Map;

    invoke-interface {p3}, Lcom/google/android/gms/tagmanager/af;->a()Lcom/google/android/gms/tagmanager/bc;

    move-result-object v2

    invoke-direct {p0, v0, v3, p2, v2}, Lcom/google/android/gms/tagmanager/bk;->a(Ljava/util/Map;Lcom/google/android/gms/internal/zzabt$zza;Ljava/util/Set;Lcom/google/android/gms/tagmanager/bc;)Lcom/google/android/gms/tagmanager/as;

    move-result-object v4

    invoke-virtual {v1}, Lcom/google/android/gms/tagmanager/as;->b()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {v4}, Lcom/google/android/gms/tagmanager/as;->b()Z

    move-result v0

    if-eqz v0, :cond_6

    move v1, v10

    :goto_2
    sget-object v0, Lcom/google/android/gms/tagmanager/bk;->a:Lcom/google/android/gms/tagmanager/as;

    if-ne v4, v0, :cond_7

    sget-object v0, Lcom/google/android/gms/tagmanager/bk;->a:Lcom/google/android/gms/tagmanager/as;

    :goto_3
    invoke-virtual {v3}, Lcom/google/android/gms/internal/zzabt$zza;->zzKu()Lcom/google/android/gms/internal/zzag$zza;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/as;->b()Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v2, p0, Lcom/google/android/gms/tagmanager/bk;->h:Lcom/google/android/gms/tagmanager/ce;

    new-instance v3, Lcom/google/android/gms/tagmanager/bk$b;

    invoke-direct {v3, v0, v1}, Lcom/google/android/gms/tagmanager/bk$b;-><init>(Lcom/google/android/gms/tagmanager/as;Lcom/google/android/gms/internal/zzag$zza;)V

    invoke-interface {v2, p1, v3}, Lcom/google/android/gms/tagmanager/ce;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_5
    invoke-direct {p0, v1, p2}, Lcom/google/android/gms/tagmanager/bk;->a(Lcom/google/android/gms/internal/zzag$zza;Ljava/util/Set;)V

    iget v1, p0, Lcom/google/android/gms/tagmanager/bk;->m:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lcom/google/android/gms/tagmanager/bk;->m:I

    goto/16 :goto_0

    :cond_6
    const/4 v0, 0x0

    move v1, v0

    goto :goto_2

    :cond_7
    new-instance v2, Lcom/google/android/gms/tagmanager/as;

    invoke-virtual {v4}, Lcom/google/android/gms/tagmanager/as;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzag$zza;

    invoke-direct {v2, v0, v1}, Lcom/google/android/gms/tagmanager/as;-><init>(Ljava/lang/Object;Z)V

    move-object v0, v2

    goto :goto_3
.end method

.method private a(Ljava/util/Map;Lcom/google/android/gms/internal/zzabt$zza;Ljava/util/Set;Lcom/google/android/gms/tagmanager/bc;)Lcom/google/android/gms/tagmanager/as;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/tagmanager/k;",
            ">;",
            "Lcom/google/android/gms/internal/zzabt$zza;",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/android/gms/tagmanager/bc;",
            ")",
            "Lcom/google/android/gms/tagmanager/as",
            "<",
            "Lcom/google/android/gms/internal/zzag$zza;",
            ">;"
        }
    .end annotation

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzabt$zza;->zzLY()Ljava/util/Map;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/zzae;->zzfN:Lcom/google/android/gms/internal/zzae;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzae;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzag$zza;

    if-nez v0, :cond_1

    const-string v0, "No function id in properties"

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/zzbn;->e(Ljava/lang/String;)V

    sget-object v1, Lcom/google/android/gms/tagmanager/bk;->a:Lcom/google/android/gms/tagmanager/as;

    :cond_0
    :goto_0
    return-object v1

    :cond_1
    iget-object v7, v0, Lcom/google/android/gms/internal/zzag$zza;->zzjO:Ljava/lang/String;

    invoke-interface {p1, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/tagmanager/k;

    if-nez v0, :cond_2

    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, " has no backing implementation."

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/zzbn;->e(Ljava/lang/String;)V

    sget-object v1, Lcom/google/android/gms/tagmanager/bk;->a:Lcom/google/android/gms/tagmanager/as;

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/tagmanager/bk;->g:Lcom/google/android/gms/tagmanager/ce;

    invoke-interface {v1, p2}, Lcom/google/android/gms/tagmanager/ce;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/tagmanager/as;

    if-eqz v1, :cond_3

    iget-object v2, p0, Lcom/google/android/gms/tagmanager/bk;->c:Lcom/google/android/gms/tagmanager/h;

    invoke-interface {v2}, Lcom/google/android/gms/tagmanager/h;->a()Z

    move-result v2

    if-eqz v2, :cond_0

    :cond_3
    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzabt$zza;->zzLY()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    move v4, v5

    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {p4, v2}, Lcom/google/android/gms/tagmanager/bc;->a(Ljava/lang/String;)Lcom/google/android/gms/tagmanager/be;

    move-result-object v10

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/zzag$zza;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/zzag$zza;

    invoke-interface {v10, v3}, Lcom/google/android/gms/tagmanager/be;->a(Lcom/google/android/gms/internal/zzag$zza;)Lcom/google/android/gms/tagmanager/bx;

    move-result-object v3

    invoke-direct {p0, v2, p3, v3}, Lcom/google/android/gms/tagmanager/bk;->a(Lcom/google/android/gms/internal/zzag$zza;Ljava/util/Set;Lcom/google/android/gms/tagmanager/bx;)Lcom/google/android/gms/tagmanager/as;

    move-result-object v10

    sget-object v2, Lcom/google/android/gms/tagmanager/bk;->a:Lcom/google/android/gms/tagmanager/as;

    if-ne v10, v2, :cond_4

    sget-object v1, Lcom/google/android/gms/tagmanager/bk;->a:Lcom/google/android/gms/tagmanager/as;

    goto :goto_0

    :cond_4
    invoke-virtual {v10}, Lcom/google/android/gms/tagmanager/as;->b()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v10}, Lcom/google/android/gms/tagmanager/as;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/zzag$zza;

    invoke-virtual {p2, v2, v3}, Lcom/google/android/gms/internal/zzabt$zza;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/zzag$zza;)V

    move v3, v4

    :goto_2
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v10}, Lcom/google/android/gms/tagmanager/as;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/zzag$zza;

    invoke-interface {v8, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move v4, v3

    goto :goto_1

    :cond_5
    move v3, v6

    goto :goto_2

    :cond_6
    invoke-interface {v8}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tagmanager/k;->zze(Ljava/util/Set;)Z

    move-result v1

    if-nez v1, :cond_7

    invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/k;->zzJP()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v8}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x2b

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Incorrect keys for function "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " required "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " had "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/zzbn;->e(Ljava/lang/String;)V

    sget-object v1, Lcom/google/android/gms/tagmanager/bk;->a:Lcom/google/android/gms/tagmanager/as;

    goto/16 :goto_0

    :cond_7
    if-eqz v4, :cond_9

    invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/k;->zzJf()Z

    move-result v1

    if-eqz v1, :cond_9

    :goto_3
    new-instance v1, Lcom/google/android/gms/tagmanager/as;

    invoke-virtual {v0, v8}, Lcom/google/android/gms/tagmanager/k;->zzV(Ljava/util/Map;)Lcom/google/android/gms/internal/zzag$zza;

    move-result-object v0

    invoke-direct {v1, v0, v5}, Lcom/google/android/gms/tagmanager/as;-><init>(Ljava/lang/Object;Z)V

    if-eqz v5, :cond_8

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/bk;->g:Lcom/google/android/gms/tagmanager/ce;

    invoke-interface {v0, p2, v1}, Lcom/google/android/gms/tagmanager/ce;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_8
    invoke-virtual {v1}, Lcom/google/android/gms/tagmanager/as;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzag$zza;

    invoke-interface {p4, v0}, Lcom/google/android/gms/tagmanager/bc;->a(Lcom/google/android/gms/internal/zzag$zza;)V

    goto/16 :goto_0

    :cond_9
    move v5, v6

    goto :goto_3
.end method

.method private a(Ljava/util/Set;Ljava/util/Set;Lcom/google/android/gms/tagmanager/bk$a;Lcom/google/android/gms/tagmanager/bj;)Lcom/google/android/gms/tagmanager/as;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/internal/zzabt$zze;",
            ">;",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/android/gms/tagmanager/bk$a;",
            "Lcom/google/android/gms/tagmanager/bj;",
            ")",
            "Lcom/google/android/gms/tagmanager/as",
            "<",
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/internal/zzabt$zza;",
            ">;>;"
        }
    .end annotation

    const/4 v3, 0x1

    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    new-instance v5, Ljava/util/HashSet;

    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move v2, v3

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzabt$zze;

    invoke-interface {p4}, Lcom/google/android/gms/tagmanager/bj;->a()Lcom/google/android/gms/tagmanager/bf;

    move-result-object v7

    invoke-virtual {p0, v0, p2, v7}, Lcom/google/android/gms/tagmanager/bk;->a(Lcom/google/android/gms/internal/zzabt$zze;Ljava/util/Set;Lcom/google/android/gms/tagmanager/bf;)Lcom/google/android/gms/tagmanager/as;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/android/gms/tagmanager/as;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p3, v0, v4, v5, v7}, Lcom/google/android/gms/tagmanager/bk$a;->a(Lcom/google/android/gms/internal/zzabt$zze;Ljava/util/Set;Ljava/util/Set;Lcom/google/android/gms/tagmanager/bf;)V

    :cond_0
    if-eqz v2, :cond_1

    invoke-virtual {v8}, Lcom/google/android/gms/tagmanager/as;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    move v0, v3

    :goto_1
    move v2, v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    invoke-interface {v4, v5}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    invoke-interface {p4, v4}, Lcom/google/android/gms/tagmanager/bj;->a(Ljava/util/Set;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/as;

    invoke-direct {v0, v4, v2}, Lcom/google/android/gms/tagmanager/as;-><init>(Ljava/lang/Object;Z)V

    return-object v0
.end method

.method private static a(Ljava/util/Map;Ljava/lang/String;)Lcom/google/android/gms/tagmanager/bk$c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/tagmanager/bk$c;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/tagmanager/bk$c;"
        }
    .end annotation

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/tagmanager/bk$c;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/tagmanager/bk$c;

    invoke-direct {v0}, Lcom/google/android/gms/tagmanager/bk$c;-><init>()V

    invoke-interface {p0, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method private static a(Lcom/google/android/gms/internal/zzabt$zza;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzabt$zza;->zzLY()Ljava/util/Map;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/zzae;->zzfY:Lcom/google/android/gms/internal/zzae;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzae;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzag$zza;

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/zzdl;->zzg(Lcom/google/android/gms/internal/zzag$zza;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/google/android/gms/internal/zzag$zza;Ljava/util/Set;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzag$zza;",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    new-instance v0, Lcom/google/android/gms/tagmanager/aq;

    invoke-direct {v0}, Lcom/google/android/gms/tagmanager/aq;-><init>()V

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/tagmanager/bk;->a(Lcom/google/android/gms/internal/zzag$zza;Ljava/util/Set;Lcom/google/android/gms/tagmanager/bx;)Lcom/google/android/gms/tagmanager/as;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/tagmanager/bk;->a:Lcom/google/android/gms/tagmanager/as;

    if-eq v0, v1, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/as;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzag$zza;

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/zzdl;->zzl(Lcom/google/android/gms/internal/zzag$zza;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/util/Map;

    if-eqz v1, :cond_2

    check-cast v0, Ljava/util/Map;

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/bk;->j:Lcom/google/android/gms/tagmanager/DataLayer;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/tagmanager/DataLayer;->push(Ljava/util/Map;)V

    goto :goto_0

    :cond_2
    instance-of v1, v0, Ljava/util/List;

    if-eqz v1, :cond_4

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Ljava/util/Map;

    if-eqz v2, :cond_3

    check-cast v0, Ljava/util/Map;

    iget-object v2, p0, Lcom/google/android/gms/tagmanager/bk;->j:Lcom/google/android/gms/tagmanager/DataLayer;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/tagmanager/DataLayer;->push(Ljava/util/Map;)V

    goto :goto_1

    :cond_3
    const-string v0, "pushAfterEvaluate: value not a Map"

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/zzbn;->zzaW(Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    const-string v0, "pushAfterEvaluate: value not a Map or List"

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/zzbn;->zzaW(Ljava/lang/String;)V

    goto :goto_0
.end method

.method private static a(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzabt$zza;",
            ">;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x66

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "Invalid resource: imbalance of rule names of functions for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " operation. Using default rule name instead"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/zzbn;->zzaV(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private static a(Ljava/util/Map;Lcom/google/android/gms/tagmanager/k;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/tagmanager/k;",
            ">;",
            "Lcom/google/android/gms/tagmanager/k;",
            ")V"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/tagmanager/k;->zzJO()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Duplicate function type name: "

    invoke-virtual {p1}, Lcom/google/android/gms/tagmanager/k;->zzJO()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/tagmanager/k;->zzJO()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private b()Ljava/lang/String;
    .locals 3

    iget v0, p0, Lcom/google/android/gms/tagmanager/bk;->m:I

    const/4 v1, 0x1

    if-gt v0, v1, :cond_0

    const-string v0, ""

    :goto_0
    return-object v0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v0, p0, Lcom/google/android/gms/tagmanager/bk;->m:I

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x2

    :goto_1
    iget v2, p0, Lcom/google/android/gms/tagmanager/bk;->m:I

    if-ge v0, v2, :cond_1

    const/16 v2, 0x20

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    const-string v0, ": "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method a(Lcom/google/android/gms/internal/zzabt$zza;Ljava/util/Set;Lcom/google/android/gms/tagmanager/bc;)Lcom/google/android/gms/tagmanager/as;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzabt$zza;",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/android/gms/tagmanager/bc;",
            ")",
            "Lcom/google/android/gms/tagmanager/as",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/bk;->e:Ljava/util/Map;

    invoke-direct {p0, v0, p1, p2, p3}, Lcom/google/android/gms/tagmanager/bk;->a(Ljava/util/Map;Lcom/google/android/gms/internal/zzabt$zza;Ljava/util/Set;Lcom/google/android/gms/tagmanager/bc;)Lcom/google/android/gms/tagmanager/as;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/tagmanager/as;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzag$zza;

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/zzdl;->zzk(Lcom/google/android/gms/internal/zzag$zza;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/zzdl;->zzQ(Ljava/lang/Object;)Lcom/google/android/gms/internal/zzag$zza;

    move-result-object v2

    invoke-interface {p3, v2}, Lcom/google/android/gms/tagmanager/bc;->a(Lcom/google/android/gms/internal/zzag$zza;)V

    new-instance v2, Lcom/google/android/gms/tagmanager/as;

    invoke-virtual {v1}, Lcom/google/android/gms/tagmanager/as;->b()Z

    move-result v1

    invoke-direct {v2, v0, v1}, Lcom/google/android/gms/tagmanager/as;-><init>(Ljava/lang/Object;Z)V

    return-object v2
.end method

.method a(Lcom/google/android/gms/internal/zzabt$zze;Ljava/util/Set;Lcom/google/android/gms/tagmanager/bf;)Lcom/google/android/gms/tagmanager/as;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzabt$zze;",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/android/gms/tagmanager/bf;",
            ")",
            "Lcom/google/android/gms/tagmanager/as",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzabt$zze;->zzMb()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v1, v2

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzabt$zza;

    invoke-interface {p3}, Lcom/google/android/gms/tagmanager/bf;->a()Lcom/google/android/gms/tagmanager/bc;

    move-result-object v5

    invoke-virtual {p0, v0, p2, v5}, Lcom/google/android/gms/tagmanager/bk;->a(Lcom/google/android/gms/internal/zzabt$zza;Ljava/util/Set;Lcom/google/android/gms/tagmanager/bc;)Lcom/google/android/gms/tagmanager/as;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/tagmanager/as;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/zzdl;->zzQ(Ljava/lang/Object;)Lcom/google/android/gms/internal/zzag$zza;

    move-result-object v0

    invoke-interface {p3, v0}, Lcom/google/android/gms/tagmanager/bf;->a(Lcom/google/android/gms/internal/zzag$zza;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/as;

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v5}, Lcom/google/android/gms/tagmanager/as;->b()Z

    move-result v2

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/tagmanager/as;-><init>(Ljava/lang/Object;Z)V

    :goto_1
    return-object v0

    :cond_0
    if-eqz v1, :cond_1

    invoke-virtual {v5}, Lcom/google/android/gms/tagmanager/as;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    move v0, v2

    :goto_2
    move v1, v0

    goto :goto_0

    :cond_1
    move v0, v3

    goto :goto_2

    :cond_2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzabt$zze;->zzMa()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzabt$zza;

    invoke-interface {p3}, Lcom/google/android/gms/tagmanager/bf;->b()Lcom/google/android/gms/tagmanager/bc;

    move-result-object v5

    invoke-virtual {p0, v0, p2, v5}, Lcom/google/android/gms/tagmanager/bk;->a(Lcom/google/android/gms/internal/zzabt$zza;Ljava/util/Set;Lcom/google/android/gms/tagmanager/bc;)Lcom/google/android/gms/tagmanager/as;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/tagmanager/as;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/zzdl;->zzQ(Ljava/lang/Object;)Lcom/google/android/gms/internal/zzag$zza;

    move-result-object v0

    invoke-interface {p3, v0}, Lcom/google/android/gms/tagmanager/bf;->a(Lcom/google/android/gms/internal/zzag$zza;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/as;

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v5}, Lcom/google/android/gms/tagmanager/as;->b()Z

    move-result v2

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/tagmanager/as;-><init>(Ljava/lang/Object;Z)V

    goto :goto_1

    :cond_3
    if-eqz v1, :cond_4

    invoke-virtual {v5}, Lcom/google/android/gms/tagmanager/as;->b()Z

    move-result v0

    if-eqz v0, :cond_4

    move v1, v2

    goto :goto_3

    :cond_4
    move v1, v3

    goto :goto_3

    :cond_5
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/zzdl;->zzQ(Ljava/lang/Object;)Lcom/google/android/gms/internal/zzag$zza;

    move-result-object v0

    invoke-interface {p3, v0}, Lcom/google/android/gms/tagmanager/bf;->a(Lcom/google/android/gms/internal/zzag$zza;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/as;

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-direct {v0, v2, v1}, Lcom/google/android/gms/tagmanager/as;-><init>(Ljava/lang/Object;Z)V

    goto :goto_1
.end method

.method a(Ljava/lang/String;Ljava/util/Set;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;Lcom/google/android/gms/tagmanager/bj;)Lcom/google/android/gms/tagmanager/as;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/internal/zzabt$zze;",
            ">;",
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/internal/zzabt$zze;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzabt$zza;",
            ">;>;",
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/internal/zzabt$zze;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;>;",
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/internal/zzabt$zze;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzabt$zza;",
            ">;>;",
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/internal/zzabt$zze;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;>;",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/android/gms/tagmanager/bj;",
            ")",
            "Lcom/google/android/gms/tagmanager/as",
            "<",
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/internal/zzabt$zza;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/tagmanager/bk$3;

    move-object v1, p0

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object v5, p6

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/tagmanager/bk$3;-><init>(Lcom/google/android/gms/tagmanager/bk;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V

    invoke-direct {p0, p2, p7, v0, p8}, Lcom/google/android/gms/tagmanager/bk;->a(Ljava/util/Set;Ljava/util/Set;Lcom/google/android/gms/tagmanager/bk$a;Lcom/google/android/gms/tagmanager/bj;)Lcom/google/android/gms/tagmanager/as;

    move-result-object v0

    return-object v0
.end method

.method a(Ljava/util/Set;Lcom/google/android/gms/tagmanager/bj;)Lcom/google/android/gms/tagmanager/as;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/internal/zzabt$zze;",
            ">;",
            "Lcom/google/android/gms/tagmanager/bj;",
            ")",
            "Lcom/google/android/gms/tagmanager/as",
            "<",
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/internal/zzabt$zza;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    new-instance v1, Lcom/google/android/gms/tagmanager/bk$4;

    invoke-direct {v1, p0}, Lcom/google/android/gms/tagmanager/bk$4;-><init>(Lcom/google/android/gms/tagmanager/bk;)V

    invoke-direct {p0, p1, v0, v1, p2}, Lcom/google/android/gms/tagmanager/bk;->a(Ljava/util/Set;Ljava/util/Set;Lcom/google/android/gms/tagmanager/bk$a;Lcom/google/android/gms/tagmanager/bj;)Lcom/google/android/gms/tagmanager/as;

    move-result-object v0

    return-object v0
.end method

.method declared-synchronized a()Ljava/lang/String;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/bk;->l:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method a(Lcom/google/android/gms/tagmanager/k;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/bk;->f:Ljava/util/Map;

    invoke-static {v0, p1}, Lcom/google/android/gms/tagmanager/bk;->a(Ljava/util/Map;Lcom/google/android/gms/tagmanager/k;)V

    return-void
.end method

.method public declared-synchronized a(Ljava/lang/String;)V
    .locals 7

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0, p1}, Lcom/google/android/gms/tagmanager/bk;->c(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/bk;->c:Lcom/google/android/gms/tagmanager/h;

    invoke-interface {v0, p1}, Lcom/google/android/gms/tagmanager/h;->b(Ljava/lang/String;)Lcom/google/android/gms/tagmanager/g;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/tagmanager/g;->b()Lcom/google/android/gms/tagmanager/cj;

    move-result-object v2

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/bk;->i:Ljava/util/Set;

    invoke-interface {v2}, Lcom/google/android/gms/tagmanager/cj;->b()Lcom/google/android/gms/tagmanager/bj;

    move-result-object v3

    invoke-virtual {p0, v0, v3}, Lcom/google/android/gms/tagmanager/bk;->a(Ljava/util/Set;Lcom/google/android/gms/tagmanager/bj;)Lcom/google/android/gms/tagmanager/as;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/as;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzabt$zza;

    iget-object v4, p0, Lcom/google/android/gms/tagmanager/bk;->d:Ljava/util/Map;

    new-instance v5, Ljava/util/HashSet;

    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    invoke-interface {v2}, Lcom/google/android/gms/tagmanager/cj;->a()Lcom/google/android/gms/tagmanager/bc;

    move-result-object v6

    invoke-direct {p0, v4, v0, v5, v6}, Lcom/google/android/gms/tagmanager/bk;->a(Ljava/util/Map;Lcom/google/android/gms/internal/zzabt$zza;Ljava/util/Set;Lcom/google/android/gms/tagmanager/bc;)Lcom/google/android/gms/tagmanager/as;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_0
    :try_start_1
    invoke-interface {v1}, Lcom/google/android/gms/tagmanager/g;->c()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/bk;->c(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void
.end method

.method public declared-synchronized a(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzaf$zzi;",
            ">;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzaf$zzi;

    iget-object v2, v0, Lcom/google/android/gms/internal/zzaf$zzi;->name:Ljava/lang/String;

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/google/android/gms/internal/zzaf$zzi;->name:Ljava/lang/String;

    const-string v3, "gaExperiment:"

    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    :cond_0
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x16

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Ignored supplemental: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/zzbn;->v(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_1
    :try_start_1
    iget-object v2, p0, Lcom/google/android/gms/tagmanager/bk;->j:Lcom/google/android/gms/tagmanager/DataLayer;

    invoke-static {v2, v0}, Lcom/google/android/gms/tagmanager/j;->a(Lcom/google/android/gms/tagmanager/DataLayer;Lcom/google/android/gms/internal/zzaf$zzi;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :cond_2
    monitor-exit p0

    return-void
.end method

.method public b(Ljava/lang/String;)Lcom/google/android/gms/tagmanager/as;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/tagmanager/as",
            "<",
            "Lcom/google/android/gms/internal/zzag$zza;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/tagmanager/bk;->m:I

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/bk;->c:Lcom/google/android/gms/tagmanager/h;

    invoke-interface {v0, p1}, Lcom/google/android/gms/tagmanager/h;->a(Ljava/lang/String;)Lcom/google/android/gms/tagmanager/g;

    move-result-object v0

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    invoke-interface {v0}, Lcom/google/android/gms/tagmanager/g;->a()Lcom/google/android/gms/tagmanager/af;

    move-result-object v2

    invoke-direct {p0, p1, v1, v2}, Lcom/google/android/gms/tagmanager/bk;->a(Ljava/lang/String;Ljava/util/Set;Lcom/google/android/gms/tagmanager/af;)Lcom/google/android/gms/tagmanager/as;

    move-result-object v1

    invoke-interface {v0}, Lcom/google/android/gms/tagmanager/g;->c()V

    return-object v1
.end method

.method b(Lcom/google/android/gms/tagmanager/k;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/bk;->d:Ljava/util/Map;

    invoke-static {v0, p1}, Lcom/google/android/gms/tagmanager/bk;->a(Ljava/util/Map;Lcom/google/android/gms/tagmanager/k;)V

    return-void
.end method

.method c(Lcom/google/android/gms/tagmanager/k;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/bk;->e:Ljava/util/Map;

    invoke-static {v0, p1}, Lcom/google/android/gms/tagmanager/bk;->a(Ljava/util/Map;Lcom/google/android/gms/tagmanager/k;)V

    return-void
.end method

.method declared-synchronized c(Ljava/lang/String;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/tagmanager/bk;->l:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
