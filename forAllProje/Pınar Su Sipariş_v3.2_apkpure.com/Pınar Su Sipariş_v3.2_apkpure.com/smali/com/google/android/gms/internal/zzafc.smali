.class public Lcom/google/android/gms/internal/zzafc;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/zzaej$zza;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/zzafc$a;,
        Lcom/google/android/gms/internal/zzafc$b;
    }
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z


# instance fields
.field private final zzbHm:Lcom/google/android/gms/internal/zzafd;

.field private final zzbKx:Lcom/google/android/gms/internal/zzaej;

.field private final zzbLN:Lcom/google/android/gms/internal/zzair;

.field private zzbLO:Lcom/google/android/gms/internal/zzafg;

.field private zzbLP:Lcom/google/android/gms/internal/zzafh;

.field private zzbLQ:Lcom/google/android/gms/internal/zzagk;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzagk",
            "<",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzafc$a;",
            ">;>;"
        }
    .end annotation
.end field

.field private zzbLR:Z

.field private final zzbLS:Lcom/google/android/gms/internal/zzags;

.field private final zzbLT:Lcom/google/android/gms/internal/zzaeu;

.field private final zzbLU:Lcom/google/android/gms/internal/zzahf;

.field private final zzbLV:Lcom/google/android/gms/internal/zzahf;

.field private final zzbLW:Lcom/google/android/gms/internal/zzahf;

.field public zzbLX:J

.field private zzbLY:J

.field private zzbLZ:Lcom/google/android/gms/internal/zzafj;

.field private zzbMa:Lcom/google/android/gms/internal/zzafj;

.field private zzbMb:Lcom/google/firebase/database/FirebaseDatabase;

.field private zzbMc:Z

.field private zzbMd:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/google/android/gms/internal/zzafc;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/google/android/gms/internal/zzafc;->$assertionsDisabled:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method constructor <init>(Lcom/google/android/gms/internal/zzafd;Lcom/google/android/gms/internal/zzaeu;Lcom/google/firebase/database/FirebaseDatabase;)V
    .locals 5

    const/4 v4, 0x0

    const-wide/16 v2, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/zzair;

    new-instance v1, Lcom/google/android/gms/internal/zzaio;

    invoke-direct {v1}, Lcom/google/android/gms/internal/zzaio;-><init>()V

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/internal/zzair;-><init>(Lcom/google/android/gms/internal/zzain;J)V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbLN:Lcom/google/android/gms/internal/zzair;

    iput-boolean v4, p0, Lcom/google/android/gms/internal/zzafc;->zzbLR:Z

    iput-wide v2, p0, Lcom/google/android/gms/internal/zzafc;->zzbLX:J

    const-wide/16 v0, 0x1

    iput-wide v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbLY:J

    iput-boolean v4, p0, Lcom/google/android/gms/internal/zzafc;->zzbMc:Z

    iput-wide v2, p0, Lcom/google/android/gms/internal/zzafc;->zzbMd:J

    iput-object p1, p0, Lcom/google/android/gms/internal/zzafc;->zzbHm:Lcom/google/android/gms/internal/zzafd;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzafc;->zzbLT:Lcom/google/android/gms/internal/zzaeu;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzafc;->zzbMb:Lcom/google/firebase/database/FirebaseDatabase;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbLT:Lcom/google/android/gms/internal/zzaeu;

    const-string v1, "RepoOperation"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzaeu;->zzib(Ljava/lang/String;)Lcom/google/android/gms/internal/zzahf;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbLU:Lcom/google/android/gms/internal/zzahf;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbLT:Lcom/google/android/gms/internal/zzaeu;

    const-string v1, "Transaction"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzaeu;->zzib(Ljava/lang/String;)Lcom/google/android/gms/internal/zzahf;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbLV:Lcom/google/android/gms/internal/zzahf;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbLT:Lcom/google/android/gms/internal/zzaeu;

    const-string v1, "DataOperation"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzaeu;->zzib(Ljava/lang/String;)Lcom/google/android/gms/internal/zzahf;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbLW:Lcom/google/android/gms/internal/zzahf;

    new-instance v0, Lcom/google/android/gms/internal/zzags;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafc;->zzbLT:Lcom/google/android/gms/internal/zzaeu;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/zzags;-><init>(Lcom/google/android/gms/internal/zzaeu;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbLS:Lcom/google/android/gms/internal/zzags;

    new-instance v0, Lcom/google/android/gms/internal/zzaeh;

    iget-object v1, p1, Lcom/google/android/gms/internal/zzafd;->zzbJa:Ljava/lang/String;

    iget-object v2, p1, Lcom/google/android/gms/internal/zzafd;->zzasB:Ljava/lang/String;

    iget-boolean v3, p1, Lcom/google/android/gms/internal/zzafd;->zzbJb:Z

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/internal/zzaeh;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {p2, v0, p0}, Lcom/google/android/gms/internal/zzaeu;->zza(Lcom/google/android/gms/internal/zzaeh;Lcom/google/android/gms/internal/zzaej$zza;)Lcom/google/android/gms/internal/zzaej;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbKx:Lcom/google/android/gms/internal/zzaej;

    new-instance v0, Lcom/google/android/gms/internal/zzafc$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/zzafc$1;-><init>(Lcom/google/android/gms/internal/zzafc;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzafc;->scheduleNow(Ljava/lang/Runnable;)V

    return-void
.end method

.method private zzRC()J
    .locals 4

    iget-wide v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbLY:J

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    iput-wide v2, p0, Lcom/google/android/gms/internal/zzafc;->zzbLY:J

    return-wide v0
.end method

.method private zzRD()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbLN:Lcom/google/android/gms/internal/zzair;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzaff;->zza(Lcom/google/android/gms/internal/zzain;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafc;->zzbLP:Lcom/google/android/gms/internal/zzafh;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/zzaff;->zza(Lcom/google/android/gms/internal/zzafh;Ljava/util/Map;)Lcom/google/android/gms/internal/zzafh;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/zzafa;->zzRq()Lcom/google/android/gms/internal/zzafa;

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/internal/zzafc$18;

    invoke-direct {v3, p0, v1}, Lcom/google/android/gms/internal/zzafc$18;-><init>(Lcom/google/android/gms/internal/zzafc;Ljava/util/List;)V

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/zzafh;->a(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzafh$zzb;)V

    new-instance v0, Lcom/google/android/gms/internal/zzafh;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzafh;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbLP:Lcom/google/android/gms/internal/zzafh;

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/zzafc;->zzS(Ljava/util/List;)V

    return-void
.end method

.method private zzRE()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbLQ:Lcom/google/android/gms/internal/zzagk;

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzafc;->zzb(Lcom/google/android/gms/internal/zzagk;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzafc;->zza(Lcom/google/android/gms/internal/zzagk;)V

    return-void
.end method

.method private zzRF()J
    .locals 4

    iget-wide v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbMd:J

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    iput-wide v2, p0, Lcom/google/android/gms/internal/zzafc;->zzbMd:J

    return-wide v0
.end method

.method private zzRy()V
    .locals 6

    const/4 v5, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbLT:Lcom/google/android/gms/internal/zzaeu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaeu;->zzRe()Lcom/google/android/gms/internal/zzaeq;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/zzafc$4;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/zzafc$4;-><init>(Lcom/google/android/gms/internal/zzafc;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzaeq;->zza(Lcom/google/android/gms/internal/zzaeq$zzb;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbKx:Lcom/google/android/gms/internal/zzaej;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzaej;->initialize()V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbLT:Lcom/google/android/gms/internal/zzaeu;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafc;->zzbHm:Lcom/google/android/gms/internal/zzafd;

    iget-object v1, v1, Lcom/google/android/gms/internal/zzafd;->zzbJa:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzaeu;->zzic(Ljava/lang/String;)Lcom/google/android/gms/internal/zzagd;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/zzafg;

    invoke-direct {v1}, Lcom/google/android/gms/internal/zzafg;-><init>()V

    iput-object v1, p0, Lcom/google/android/gms/internal/zzafc;->zzbLO:Lcom/google/android/gms/internal/zzafg;

    new-instance v1, Lcom/google/android/gms/internal/zzafh;

    invoke-direct {v1}, Lcom/google/android/gms/internal/zzafh;-><init>()V

    iput-object v1, p0, Lcom/google/android/gms/internal/zzafc;->zzbLP:Lcom/google/android/gms/internal/zzafh;

    new-instance v1, Lcom/google/android/gms/internal/zzagk;

    invoke-direct {v1}, Lcom/google/android/gms/internal/zzagk;-><init>()V

    iput-object v1, p0, Lcom/google/android/gms/internal/zzafc;->zzbLQ:Lcom/google/android/gms/internal/zzagk;

    new-instance v1, Lcom/google/android/gms/internal/zzafj;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzafc;->zzbLT:Lcom/google/android/gms/internal/zzaeu;

    new-instance v3, Lcom/google/android/gms/internal/zzagc;

    invoke-direct {v3}, Lcom/google/android/gms/internal/zzagc;-><init>()V

    new-instance v4, Lcom/google/android/gms/internal/zzafc$9;

    invoke-direct {v4, p0}, Lcom/google/android/gms/internal/zzafc$9;-><init>(Lcom/google/android/gms/internal/zzafc;)V

    invoke-direct {v1, v2, v3, v4}, Lcom/google/android/gms/internal/zzafj;-><init>(Lcom/google/android/gms/internal/zzaeu;Lcom/google/android/gms/internal/zzagd;Lcom/google/android/gms/internal/zzafj$zzd;)V

    iput-object v1, p0, Lcom/google/android/gms/internal/zzafc;->zzbLZ:Lcom/google/android/gms/internal/zzafj;

    new-instance v1, Lcom/google/android/gms/internal/zzafj;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzafc;->zzbLT:Lcom/google/android/gms/internal/zzaeu;

    new-instance v3, Lcom/google/android/gms/internal/zzafc$10;

    invoke-direct {v3, p0}, Lcom/google/android/gms/internal/zzafc$10;-><init>(Lcom/google/android/gms/internal/zzafc;)V

    invoke-direct {v1, v2, v0, v3}, Lcom/google/android/gms/internal/zzafj;-><init>(Lcom/google/android/gms/internal/zzaeu;Lcom/google/android/gms/internal/zzagd;Lcom/google/android/gms/internal/zzafj$zzd;)V

    iput-object v1, p0, Lcom/google/android/gms/internal/zzafc;->zzbMa:Lcom/google/android/gms/internal/zzafj;

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzafc;->zza(Lcom/google/android/gms/internal/zzagd;)V

    sget-object v0, Lcom/google/android/gms/internal/zzaet;->zzbLn:Lcom/google/android/gms/internal/zzahi;

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/zzafc;->zzb(Lcom/google/android/gms/internal/zzahi;Ljava/lang/Object;)V

    sget-object v0, Lcom/google/android/gms/internal/zzaet;->zzbLo:Lcom/google/android/gms/internal/zzahi;

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/zzafc;->zzb(Lcom/google/android/gms/internal/zzahi;Ljava/lang/Object;)V

    return-void
.end method

.method private zzS(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<+",
            "Lcom/google/android/gms/internal/zzagq;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbLS:Lcom/google/android/gms/internal/zzags;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzags;->zzU(Ljava/util/List;)V

    :cond_0
    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/zzafc;Lcom/google/android/gms/internal/zzafa;I)Lcom/google/android/gms/internal/zzafa;
    .locals 1

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/zzafc;->zzb(Lcom/google/android/gms/internal/zzafa;I)Lcom/google/android/gms/internal/zzafa;

    move-result-object v0

    return-object v0
.end method

.method private zza(Lcom/google/android/gms/internal/zzafa;Ljava/util/List;)Lcom/google/android/gms/internal/zzahu;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzafa;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Long;",
            ">;)",
            "Lcom/google/android/gms/internal/zzahu;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbMa:Lcom/google/android/gms/internal/zzafj;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/zzafj;->zzc(Lcom/google/android/gms/internal/zzafa;Ljava/util/List;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/zzahn;->zzTA()Lcom/google/android/gms/internal/zzahn;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method private zza(JLcom/google/android/gms/internal/zzafa;Lcom/google/firebase/database/DatabaseError;)V
    .locals 7

    const/4 v2, 0x0

    const/4 v5, 0x1

    if-eqz p4, :cond_0

    invoke-virtual {p4}, Lcom/google/firebase/database/DatabaseError;->getCode()I

    move-result v0

    const/16 v1, -0x19

    if-ne v0, v1, :cond_0

    :goto_0
    return-void

    :cond_0
    if-nez p4, :cond_2

    move v0, v5

    :goto_1
    iget-object v1, p0, Lcom/google/android/gms/internal/zzafc;->zzbMa:Lcom/google/android/gms/internal/zzafj;

    if-nez v0, :cond_3

    move v4, v5

    :goto_2
    iget-object v6, p0, Lcom/google/android/gms/internal/zzafc;->zzbLN:Lcom/google/android/gms/internal/zzair;

    move-wide v2, p1

    invoke-virtual/range {v1 .. v6}, Lcom/google/android/gms/internal/zzafj;->zza(JZZLcom/google/android/gms/internal/zzain;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_1

    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/zzafc;->zzo(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzafa;

    :cond_1
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzafc;->zzS(Ljava/util/List;)V

    goto :goto_0

    :cond_2
    move v0, v2

    goto :goto_1

    :cond_3
    move v4, v2

    goto :goto_2
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/zzafc;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzafc;->zzRy()V

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/zzafc;JLcom/google/android/gms/internal/zzafa;Lcom/google/firebase/database/DatabaseError;)V
    .locals 1

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/zzafc;->zza(JLcom/google/android/gms/internal/zzafa;Lcom/google/firebase/database/DatabaseError;)V

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/zzafc;Lcom/google/android/gms/internal/zzagk;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzafc;->zza(Lcom/google/android/gms/internal/zzagk;)V

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/zzafc;Lcom/google/android/gms/internal/zzagk;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/zzafc;->zza(Lcom/google/android/gms/internal/zzagk;I)V

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/zzafc;Ljava/lang/String;Lcom/google/android/gms/internal/zzafa;Lcom/google/firebase/database/DatabaseError;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/zzafc;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/zzafa;Lcom/google/firebase/database/DatabaseError;)V

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/zzafc;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzafc;->zzS(Ljava/util/List;)V

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/zzafc;Ljava/util/List;Lcom/google/android/gms/internal/zzagk;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/zzafc;->zza(Ljava/util/List;Lcom/google/android/gms/internal/zzagk;)V

    return-void
.end method

.method private zza(Lcom/google/android/gms/internal/zzagd;)V
    .locals 12

    invoke-interface {p1}, Lcom/google/android/gms/internal/zzagd;->zzPp()Ljava/util/List;

    move-result-object v2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbLN:Lcom/google/android/gms/internal/zzair;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzaff;->zza(Lcom/google/android/gms/internal/zzain;)Ljava/util/Map;

    move-result-object v10

    const-wide/high16 v0, -0x8000000000000000L

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    move-wide v2, v0

    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/google/android/gms/internal/zzafn;

    new-instance v0, Lcom/google/android/gms/internal/zzafc$11;

    invoke-direct {v0, p0, v4}, Lcom/google/android/gms/internal/zzafc$11;-><init>(Lcom/google/android/gms/internal/zzafc;Lcom/google/android/gms/internal/zzafn;)V

    invoke-virtual {v4}, Lcom/google/android/gms/internal/zzafn;->zzRN()J

    move-result-wide v6

    cmp-long v1, v2, v6

    if-ltz v1, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Write ids were not in order."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {v4}, Lcom/google/android/gms/internal/zzafn;->zzRN()J

    move-result-wide v8

    invoke-virtual {v4}, Lcom/google/android/gms/internal/zzafn;->zzRN()J

    move-result-wide v2

    const-wide/16 v6, 0x1

    add-long/2addr v2, v6

    iput-wide v2, p0, Lcom/google/android/gms/internal/zzafc;->zzbLY:J

    invoke-virtual {v4}, Lcom/google/android/gms/internal/zzafn;->zzRQ()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafc;->zzbLU:Lcom/google/android/gms/internal/zzahf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzahf;->zzTe()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafc;->zzbLU:Lcom/google/android/gms/internal/zzahf;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/zzafn;->zzRN()J

    move-result-wide v2

    new-instance v5, Ljava/lang/StringBuilder;

    const/16 v6, 0x30

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v6, "Restoring overwrite with id "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/zzahf;->zzh(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/zzafc;->zzbKx:Lcom/google/android/gms/internal/zzaej;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/zzafn;->zzPn()Lcom/google/android/gms/internal/zzafa;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzafa;->zzRs()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v4}, Lcom/google/android/gms/internal/zzafn;->zzRO()Lcom/google/android/gms/internal/zzahu;

    move-result-object v3

    const/4 v5, 0x1

    invoke-interface {v3, v5}, Lcom/google/android/gms/internal/zzahu;->getValue(Z)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v1, v2, v3, v0}, Lcom/google/android/gms/internal/zzaej;->zza(Ljava/util/List;Ljava/lang/Object;Lcom/google/android/gms/internal/zzaem;)V

    invoke-virtual {v4}, Lcom/google/android/gms/internal/zzafn;->zzRO()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-static {v0, v10}, Lcom/google/android/gms/internal/zzaff;->zza(Lcom/google/android/gms/internal/zzahu;Ljava/util/Map;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbMa:Lcom/google/android/gms/internal/zzafj;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/zzafn;->zzPn()Lcom/google/android/gms/internal/zzafa;

    move-result-object v1

    invoke-virtual {v4}, Lcom/google/android/gms/internal/zzafn;->zzRO()Lcom/google/android/gms/internal/zzahu;

    move-result-object v2

    invoke-virtual {v4}, Lcom/google/android/gms/internal/zzafn;->zzRN()J

    move-result-wide v4

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Lcom/google/android/gms/internal/zzafj;->zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzahu;JZZ)Ljava/util/List;

    :goto_1
    move-wide v2, v8

    goto/16 :goto_0

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/zzafc;->zzbLU:Lcom/google/android/gms/internal/zzahf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzahf;->zzTe()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafc;->zzbLU:Lcom/google/android/gms/internal/zzahf;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/zzafn;->zzRN()J

    move-result-wide v2

    new-instance v5, Ljava/lang/StringBuilder;

    const/16 v6, 0x2c

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v6, "Restoring merge with id "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/zzahf;->zzh(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/internal/zzafc;->zzbKx:Lcom/google/android/gms/internal/zzaej;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/zzafn;->zzPn()Lcom/google/android/gms/internal/zzafa;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzafa;->zzRs()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v4}, Lcom/google/android/gms/internal/zzafn;->zzRP()Lcom/google/android/gms/internal/zzaes;

    move-result-object v3

    const/4 v5, 0x1

    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/zzaes;->zzaQ(Z)Ljava/util/Map;

    move-result-object v3

    invoke-interface {v1, v2, v3, v0}, Lcom/google/android/gms/internal/zzaej;->zza(Ljava/util/List;Ljava/util/Map;Lcom/google/android/gms/internal/zzaem;)V

    invoke-virtual {v4}, Lcom/google/android/gms/internal/zzafn;->zzRP()Lcom/google/android/gms/internal/zzaes;

    move-result-object v0

    invoke-static {v0, v10}, Lcom/google/android/gms/internal/zzaff;->zza(Lcom/google/android/gms/internal/zzaes;Ljava/util/Map;)Lcom/google/android/gms/internal/zzaes;

    move-result-object v3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbMa:Lcom/google/android/gms/internal/zzafj;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/zzafn;->zzPn()Lcom/google/android/gms/internal/zzafa;

    move-result-object v1

    invoke-virtual {v4}, Lcom/google/android/gms/internal/zzafn;->zzRP()Lcom/google/android/gms/internal/zzaes;

    move-result-object v2

    invoke-virtual {v4}, Lcom/google/android/gms/internal/zzafn;->zzRN()J

    move-result-wide v4

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/zzafj;->zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzaes;Lcom/google/android/gms/internal/zzaes;JZ)Ljava/util/List;

    goto :goto_1

    :cond_4
    return-void
.end method

.method private zza(Lcom/google/android/gms/internal/zzagk;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzagk",
            "<",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzafc$a;",
            ">;>;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagk;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_3

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzafc;->zzc(Lcom/google/android/gms/internal/zzagk;)Ljava/util/List;

    move-result-object v2

    sget-boolean v0, Lcom/google/android/gms/internal/zzafc;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_0
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzafc$a;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzafc$a;->d(Lcom/google/android/gms/internal/zzafc$a;)Lcom/google/android/gms/internal/zzafc$b;

    move-result-object v0

    sget-object v4, Lcom/google/android/gms/internal/zzafc$b;->b:Lcom/google/android/gms/internal/zzafc$b;

    if-eq v0, v4, :cond_1

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    :goto_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagk;->zzPn()Lcom/google/android/gms/internal/zzafa;

    move-result-object v0

    invoke-direct {p0, v2, v0}, Lcom/google/android/gms/internal/zzafc;->zza(Ljava/util/List;Lcom/google/android/gms/internal/zzafa;)V

    :cond_2
    :goto_1
    return-void

    :cond_3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagk;->hasChildren()Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Lcom/google/android/gms/internal/zzafc$21;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/zzafc$21;-><init>(Lcom/google/android/gms/internal/zzafc;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/zzagk;->zzb(Lcom/google/android/gms/internal/zzagk$zzb;)V

    goto :goto_1

    :cond_4
    move-object v0, v1

    goto :goto_0
.end method

.method private zza(Lcom/google/android/gms/internal/zzagk;I)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzagk",
            "<",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzafc$a;",
            ">;>;I)V"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagk;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    if-eqz v0, :cond_a

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    const/16 v1, -0x9

    if-ne p2, v1, :cond_0

    const-string v1, "overriddenBySet"

    invoke-static {v1}, Lcom/google/firebase/database/DatabaseError;->zzhL(Ljava/lang/String;)Lcom/google/firebase/database/DatabaseError;

    move-result-object v1

    move-object v8, v1

    :goto_0
    const/4 v2, -0x1

    const/4 v1, 0x0

    move v9, v1

    move v10, v2

    :goto_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-ge v9, v1, :cond_8

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lcom/google/android/gms/internal/zzafc$a;

    invoke-static {v7}, Lcom/google/android/gms/internal/zzafc$a;->d(Lcom/google/android/gms/internal/zzafc$a;)Lcom/google/android/gms/internal/zzafc$b;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/zzafc$b;->e:Lcom/google/android/gms/internal/zzafc$b;

    if-ne v1, v2, :cond_2

    move v2, v10

    :goto_2
    add-int/lit8 v1, v9, 0x1

    move v9, v1

    move v10, v2

    goto :goto_1

    :cond_0
    const/16 v1, -0x19

    if-ne p2, v1, :cond_1

    const/4 v1, 0x1

    :goto_3
    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0x2d

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Unknown transaction abort reason: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/zzaiv;->zzb(ZLjava/lang/String;)V

    const/16 v1, -0x19

    invoke-static {v1}, Lcom/google/firebase/database/DatabaseError;->zznw(I)Lcom/google/firebase/database/DatabaseError;

    move-result-object v1

    move-object v8, v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    goto :goto_3

    :cond_2
    invoke-static {v7}, Lcom/google/android/gms/internal/zzafc$a;->d(Lcom/google/android/gms/internal/zzafc$a;)Lcom/google/android/gms/internal/zzafc$b;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/zzafc$b;->c:Lcom/google/android/gms/internal/zzafc$b;

    if-ne v1, v2, :cond_4

    sget-boolean v1, Lcom/google/android/gms/internal/zzafc;->$assertionsDisabled:Z

    if-nez v1, :cond_3

    add-int/lit8 v1, v9, -0x1

    if-eq v10, v1, :cond_3

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_3
    sget-object v1, Lcom/google/android/gms/internal/zzafc$b;->e:Lcom/google/android/gms/internal/zzafc$b;

    invoke-static {v7, v1}, Lcom/google/android/gms/internal/zzafc$a;->a(Lcom/google/android/gms/internal/zzafc$a;Lcom/google/android/gms/internal/zzafc$b;)Lcom/google/android/gms/internal/zzafc$b;

    invoke-static {v7, v8}, Lcom/google/android/gms/internal/zzafc$a;->a(Lcom/google/android/gms/internal/zzafc$a;Lcom/google/firebase/database/DatabaseError;)Lcom/google/firebase/database/DatabaseError;

    move v2, v9

    goto :goto_2

    :cond_4
    sget-boolean v1, Lcom/google/android/gms/internal/zzafc;->$assertionsDisabled:Z

    if-nez v1, :cond_5

    invoke-static {v7}, Lcom/google/android/gms/internal/zzafc$a;->d(Lcom/google/android/gms/internal/zzafc$a;)Lcom/google/android/gms/internal/zzafc$b;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/zzafc$b;->b:Lcom/google/android/gms/internal/zzafc$b;

    if-eq v1, v2, :cond_5

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_5
    new-instance v1, Lcom/google/android/gms/internal/zzafp;

    invoke-static {v7}, Lcom/google/android/gms/internal/zzafc$a;->j(Lcom/google/android/gms/internal/zzafc$a;)Lcom/google/firebase/database/ValueEventListener;

    move-result-object v2

    invoke-static {v7}, Lcom/google/android/gms/internal/zzafc$a;->f(Lcom/google/android/gms/internal/zzafc$a;)Lcom/google/android/gms/internal/zzafa;

    move-result-object v3

    invoke-static {v3}, Lcom/google/android/gms/internal/zzagu;->zzN(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzagu;

    move-result-object v3

    invoke-direct {v1, p0, v2, v3}, Lcom/google/android/gms/internal/zzafp;-><init>(Lcom/google/android/gms/internal/zzafc;Lcom/google/firebase/database/ValueEventListener;Lcom/google/android/gms/internal/zzagu;)V

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/zzafc;->zze(Lcom/google/android/gms/internal/zzaew;)V

    const/16 v1, -0x9

    if-ne p2, v1, :cond_6

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafc;->zzbMa:Lcom/google/android/gms/internal/zzafj;

    invoke-static {v7}, Lcom/google/android/gms/internal/zzafc$a;->c(Lcom/google/android/gms/internal/zzafc$a;)J

    move-result-wide v2

    const/4 v4, 0x1

    const/4 v5, 0x0

    iget-object v6, p0, Lcom/google/android/gms/internal/zzafc;->zzbLN:Lcom/google/android/gms/internal/zzair;

    invoke-virtual/range {v1 .. v6}, Lcom/google/android/gms/internal/zzafj;->zza(JZZLcom/google/android/gms/internal/zzain;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v11, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :goto_4
    new-instance v1, Lcom/google/android/gms/internal/zzafc$8;

    invoke-direct {v1, p0, v7, v8}, Lcom/google/android/gms/internal/zzafc$8;-><init>(Lcom/google/android/gms/internal/zzafc;Lcom/google/android/gms/internal/zzafc$a;Lcom/google/firebase/database/DatabaseError;)V

    invoke-interface {v12, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v2, v10

    goto/16 :goto_2

    :cond_6
    const/16 v1, -0x19

    if-ne p2, v1, :cond_7

    const/4 v1, 0x1

    :goto_5
    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0x2d

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Unknown transaction abort reason: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/zzaiv;->zzb(ZLjava/lang/String;)V

    goto :goto_4

    :cond_7
    const/4 v1, 0x0

    goto :goto_5

    :cond_8
    const/4 v1, -0x1

    if-ne v10, v1, :cond_9

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/zzagk;->setValue(Ljava/lang/Object;)V

    :goto_6
    invoke-direct {p0, v11}, Lcom/google/android/gms/internal/zzafc;->zzS(Ljava/util/List;)V

    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzafc;->postEvent(Ljava/lang/Runnable;)V

    goto :goto_7

    :cond_9
    const/4 v1, 0x0

    add-int/lit8 v2, v10, 0x1

    invoke-interface {v0, v1, v2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/zzagk;->setValue(Ljava/lang/Object;)V

    goto :goto_6

    :cond_a
    return-void
.end method

.method private zza(Ljava/lang/String;Lcom/google/android/gms/internal/zzafa;Lcom/google/firebase/database/DatabaseError;)V
    .locals 6

    if-eqz p3, :cond_0

    invoke-virtual {p3}, Lcom/google/firebase/database/DatabaseError;->getCode()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    invoke-virtual {p3}, Lcom/google/firebase/database/DatabaseError;->getCode()I

    move-result v0

    const/16 v1, -0x19

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbLU:Lcom/google/android/gms/internal/zzahf;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzafa;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3}, Lcom/google/firebase/database/DatabaseError;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0xd

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v4, v5

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v4, v5

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " at "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, " failed: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzahf;->warn(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private zza(Ljava/util/List;Lcom/google/android/gms/internal/zzafa;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzafc$a;",
            ">;",
            "Lcom/google/android/gms/internal/zzafa;",
            ")V"
        }
    .end annotation

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzafc$a;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzafc$a;->c(Lcom/google/android/gms/internal/zzafc$a;)J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-direct {p0, p2, v1}, Lcom/google/android/gms/internal/zzafc;->zza(Lcom/google/android/gms/internal/zzafa;Ljava/util/List;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v2

    const-string v0, "badhash"

    invoke-interface {v2}, Lcom/google/android/gms/internal/zzahu;->zzTn()Ljava/lang/String;

    move-result-object v0

    move-object v1, v0

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzafc$a;

    sget-boolean v4, Lcom/google/android/gms/internal/zzafc;->$assertionsDisabled:Z

    if-nez v4, :cond_1

    invoke-static {v0}, Lcom/google/android/gms/internal/zzafc$a;->d(Lcom/google/android/gms/internal/zzafc$a;)Lcom/google/android/gms/internal/zzafc$b;

    move-result-object v4

    sget-object v5, Lcom/google/android/gms/internal/zzafc$b;->b:Lcom/google/android/gms/internal/zzafc$b;

    if-eq v4, v5, :cond_1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_1
    sget-object v4, Lcom/google/android/gms/internal/zzafc$b;->c:Lcom/google/android/gms/internal/zzafc$b;

    invoke-static {v0, v4}, Lcom/google/android/gms/internal/zzafc$a;->a(Lcom/google/android/gms/internal/zzafc$a;Lcom/google/android/gms/internal/zzafc$b;)Lcom/google/android/gms/internal/zzafc$b;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzafc$a;->e(Lcom/google/android/gms/internal/zzafc$a;)I

    invoke-static {v0}, Lcom/google/android/gms/internal/zzafc$a;->f(Lcom/google/android/gms/internal/zzafc$a;)Lcom/google/android/gms/internal/zzafa;

    move-result-object v4

    invoke-static {p2, v4}, Lcom/google/android/gms/internal/zzafa;->zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzafa;

    move-result-object v4

    invoke-static {v0}, Lcom/google/android/gms/internal/zzafc$a;->g(Lcom/google/android/gms/internal/zzafc$a;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-interface {v2, v4, v0}, Lcom/google/android/gms/internal/zzahu;->zzl(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    move-object v2, v0

    goto :goto_1

    :cond_2
    const/4 v0, 0x1

    invoke-interface {v2, v0}, Lcom/google/android/gms/internal/zzahu;->getValue(Z)Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzafc;->zzRC()J

    iget-object v2, p0, Lcom/google/android/gms/internal/zzafc;->zzbKx:Lcom/google/android/gms/internal/zzaej;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzafa;->zzRs()Ljava/util/List;

    move-result-object v3

    new-instance v4, Lcom/google/android/gms/internal/zzafc$22;

    invoke-direct {v4, p0, p2, p1, p0}, Lcom/google/android/gms/internal/zzafc$22;-><init>(Lcom/google/android/gms/internal/zzafc;Lcom/google/android/gms/internal/zzafa;Ljava/util/List;Lcom/google/android/gms/internal/zzafc;)V

    invoke-interface {v2, v3, v0, v1, v4}, Lcom/google/android/gms/internal/zzaej;->zza(Ljava/util/List;Ljava/lang/Object;Ljava/lang/String;Lcom/google/android/gms/internal/zzaem;)V

    return-void
.end method

.method private zza(Ljava/util/List;Lcom/google/android/gms/internal/zzagk;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzafc$a;",
            ">;",
            "Lcom/google/android/gms/internal/zzagk",
            "<",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzafc$a;",
            ">;>;)V"
        }
    .end annotation

    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzagk;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {p1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/zzafc$5;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/zzafc$5;-><init>(Lcom/google/android/gms/internal/zzafc;Ljava/util/List;)V

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/zzagk;->zzb(Lcom/google/android/gms/internal/zzagk$zzb;)V

    return-void
.end method

.method private static zzak(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/database/DatabaseError;
    .locals 1

    if-eqz p0, :cond_0

    invoke-static {p0, p1}, Lcom/google/firebase/database/DatabaseError;->zzah(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/database/DatabaseError;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic zzal(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/database/DatabaseError;
    .locals 1

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/zzafc;->zzak(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/database/DatabaseError;

    move-result-object v0

    return-object v0
.end method

.method private zzb(Lcom/google/android/gms/internal/zzafa;I)Lcom/google/android/gms/internal/zzafa;
    .locals 7

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzafc;->zzp(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzagk;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagk;->zzPn()Lcom/google/android/gms/internal/zzafa;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafc;->zzbLV:Lcom/google/android/gms/internal/zzahf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzahf;->zzTe()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafc;->zzbLU:Lcom/google/android/gms/internal/zzahf;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/lit8 v5, v5, 0x2c

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    add-int/2addr v5, v6

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v5, "Aborting transactions for path: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, ". Affected: "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/zzahf;->zzh(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/zzafc;->zzbLQ:Lcom/google/android/gms/internal/zzagk;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/zzagk;->zzL(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzagk;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/zzafc$6;

    invoke-direct {v2, p0, p2}, Lcom/google/android/gms/internal/zzafc$6;-><init>(Lcom/google/android/gms/internal/zzafc;I)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/zzagk;->zza(Lcom/google/android/gms/internal/zzagk$zza;)Z

    invoke-direct {p0, v1, p2}, Lcom/google/android/gms/internal/zzafc;->zza(Lcom/google/android/gms/internal/zzagk;I)V

    new-instance v2, Lcom/google/android/gms/internal/zzafc$7;

    invoke-direct {v2, p0, p2}, Lcom/google/android/gms/internal/zzafc$7;-><init>(Lcom/google/android/gms/internal/zzafc;I)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/zzagk;->zza(Lcom/google/android/gms/internal/zzagk$zzb;)V

    return-object v0
.end method

.method static synthetic zzb(Lcom/google/android/gms/internal/zzafc;Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzafa;
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzafc;->zzo(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzafa;

    move-result-object v0

    return-object v0
.end method

.method static synthetic zzb(Lcom/google/android/gms/internal/zzafc;)Lcom/google/android/gms/internal/zzahf;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbLU:Lcom/google/android/gms/internal/zzahf;

    return-object v0
.end method

.method static synthetic zzb(Lcom/google/android/gms/internal/zzafc;Lcom/google/android/gms/internal/zzagk;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzafc;->zzb(Lcom/google/android/gms/internal/zzagk;)V

    return-void
.end method

.method private zzb(Lcom/google/android/gms/internal/zzagk;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzagk",
            "<",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzafc$a;",
            ">;>;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagk;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_2

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-ge v2, v1, :cond_1

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/zzafc$a;

    invoke-static {v1}, Lcom/google/android/gms/internal/zzafc$a;->d(Lcom/google/android/gms/internal/zzafc$a;)Lcom/google/android/gms/internal/zzafc$b;

    move-result-object v1

    sget-object v3, Lcom/google/android/gms/internal/zzafc$b;->d:Lcom/google/android/gms/internal/zzafc$b;

    if-ne v1, v3, :cond_0

    invoke-interface {v0, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move v1, v2

    :goto_1
    move v2, v1

    goto :goto_0

    :cond_0
    add-int/lit8 v1, v2, 0x1

    goto :goto_1

    :cond_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_3

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/zzagk;->setValue(Ljava/lang/Object;)V

    :cond_2
    :goto_2
    new-instance v0, Lcom/google/android/gms/internal/zzafc$23;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/zzafc$23;-><init>(Lcom/google/android/gms/internal/zzafc;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/zzagk;->zzb(Lcom/google/android/gms/internal/zzagk$zzb;)V

    return-void

    :cond_3
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/zzagk;->setValue(Ljava/lang/Object;)V

    goto :goto_2
.end method

.method private zzb(Lcom/google/android/gms/internal/zzahi;Ljava/lang/Object;)V
    .locals 4

    sget-object v0, Lcom/google/android/gms/internal/zzaet;->zzbLm:Lcom/google/android/gms/internal/zzahi;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/zzahi;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafc;->zzbLN:Lcom/google/android/gms/internal/zzair;

    move-object v0, p2

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/zzair;->zzaI(J)V

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/zzafa;

    const/4 v1, 0x2

    new-array v1, v1, [Lcom/google/android/gms/internal/zzahi;

    const/4 v2, 0x0

    sget-object v3, Lcom/google/android/gms/internal/zzaet;->zzbLl:Lcom/google/android/gms/internal/zzahi;

    aput-object v3, v1, v2

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/zzafa;-><init>([Lcom/google/android/gms/internal/zzahi;)V

    :try_start_0
    invoke-static {p2}, Lcom/google/android/gms/internal/zzahv;->zzaq(Ljava/lang/Object;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzafc;->zzbLO:Lcom/google/android/gms/internal/zzafg;

    invoke-virtual {v2, v0, v1}, Lcom/google/android/gms/internal/zzafg;->zzg(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/zzafc;->zzbLZ:Lcom/google/android/gms/internal/zzafj;

    invoke-virtual {v2, v0, v1}, Lcom/google/android/gms/internal/zzafj;->zzi(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzafc;->zzS(Ljava/util/List;)V
    :try_end_0
    .catch Lcom/google/firebase/database/DatabaseException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafc;->zzbLU:Lcom/google/android/gms/internal/zzahf;

    const-string v2, "Failed to parse info update"

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/zzahf;->zze(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method private zzb(Ljava/util/List;Lcom/google/android/gms/internal/zzafa;)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzafc$a;",
            ">;",
            "Lcom/google/android/gms/internal/zzafa;",
            ")V"
        }
    .end annotation

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    :goto_0
    return-void

    :cond_0
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/zzafc$a;

    invoke-static {v2}, Lcom/google/android/gms/internal/zzafc$a;->c(Lcom/google/android/gms/internal/zzafc$a;)J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v14, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :cond_2
    :goto_2
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Lcom/google/android/gms/internal/zzafc$a;

    invoke-static {v10}, Lcom/google/android/gms/internal/zzafc$a;->f(Lcom/google/android/gms/internal/zzafc$a;)Lcom/google/android/gms/internal/zzafa;

    move-result-object v2

    move-object/from16 v0, p2

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/zzafa;->zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzafa;

    move-result-object v2

    const/4 v12, 0x0

    const/4 v11, 0x0

    new-instance v16, Ljava/util/ArrayList;

    invoke-direct/range {v16 .. v16}, Ljava/util/ArrayList;-><init>()V

    sget-boolean v3, Lcom/google/android/gms/internal/zzafc;->$assertionsDisabled:Z

    if-nez v3, :cond_3

    if-nez v2, :cond_3

    new-instance v2, Ljava/lang/AssertionError;

    invoke-direct {v2}, Ljava/lang/AssertionError;-><init>()V

    throw v2

    :cond_3
    invoke-static {v10}, Lcom/google/android/gms/internal/zzafc$a;->d(Lcom/google/android/gms/internal/zzafc$a;)Lcom/google/android/gms/internal/zzafc$b;

    move-result-object v2

    sget-object v3, Lcom/google/android/gms/internal/zzafc$b;->f:Lcom/google/android/gms/internal/zzafc$b;

    if-ne v2, v3, :cond_5

    const/4 v2, 0x1

    invoke-static {v10}, Lcom/google/android/gms/internal/zzafc$a;->k(Lcom/google/android/gms/internal/zzafc$a;)Lcom/google/firebase/database/DatabaseError;

    move-result-object v9

    invoke-virtual {v9}, Lcom/google/firebase/database/DatabaseError;->getCode()I

    move-result v3

    const/16 v4, -0x19

    if-eq v3, v4, :cond_4

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/google/android/gms/internal/zzafc;->zzbMa:Lcom/google/android/gms/internal/zzafj;

    invoke-static {v10}, Lcom/google/android/gms/internal/zzafc$a;->c(Lcom/google/android/gms/internal/zzafc$a;)J

    move-result-wide v4

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/google/android/gms/internal/zzafc;->zzbLN:Lcom/google/android/gms/internal/zzair;

    invoke-virtual/range {v3 .. v8}, Lcom/google/android/gms/internal/zzafj;->zza(JZZLcom/google/android/gms/internal/zzain;)Ljava/util/List;

    move-result-object v3

    move-object/from16 v0, v16

    invoke-interface {v0, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_4
    :goto_3
    move-object/from16 v0, p0

    move-object/from16 v1, v16

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/zzafc;->zzS(Ljava/util/List;)V

    if-eqz v2, :cond_2

    sget-object v2, Lcom/google/android/gms/internal/zzafc$b;->d:Lcom/google/android/gms/internal/zzafc$b;

    invoke-static {v10, v2}, Lcom/google/android/gms/internal/zzafc$a;->a(Lcom/google/android/gms/internal/zzafc$a;Lcom/google/android/gms/internal/zzafc$b;)Lcom/google/android/gms/internal/zzafc$b;

    invoke-static {v10}, Lcom/google/android/gms/internal/zzafc$a;->f(Lcom/google/android/gms/internal/zzafc$a;)Lcom/google/android/gms/internal/zzafa;

    move-result-object v2

    move-object/from16 v0, p0

    invoke-static {v0, v2}, Lcom/google/firebase/database/zza;->zza(Lcom/google/android/gms/internal/zzafc;Lcom/google/android/gms/internal/zzafa;)Lcom/google/firebase/database/DatabaseReference;

    move-result-object v2

    invoke-static {v10}, Lcom/google/android/gms/internal/zzafc$a;->b(Lcom/google/android/gms/internal/zzafc$a;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v3

    invoke-static {v3}, Lcom/google/android/gms/internal/zzahp;->zzm(Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahp;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/firebase/database/zza;->zza(Lcom/google/firebase/database/DatabaseReference;Lcom/google/android/gms/internal/zzahp;)Lcom/google/firebase/database/DataSnapshot;

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/internal/zzafc$2;

    move-object/from16 v0, p0

    invoke-direct {v3, v0, v10}, Lcom/google/android/gms/internal/zzafc$2;-><init>(Lcom/google/android/gms/internal/zzafc;Lcom/google/android/gms/internal/zzafc$a;)V

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/zzafc;->scheduleNow(Ljava/lang/Runnable;)V

    new-instance v3, Lcom/google/android/gms/internal/zzafc$3;

    move-object/from16 v0, p0

    invoke-direct {v3, v0, v10, v9, v2}, Lcom/google/android/gms/internal/zzafc$3;-><init>(Lcom/google/android/gms/internal/zzafc;Lcom/google/android/gms/internal/zzafc$a;Lcom/google/firebase/database/DatabaseError;Lcom/google/firebase/database/DataSnapshot;)V

    invoke-interface {v13, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_2

    :cond_5
    invoke-static {v10}, Lcom/google/android/gms/internal/zzafc$a;->d(Lcom/google/android/gms/internal/zzafc$a;)Lcom/google/android/gms/internal/zzafc$b;

    move-result-object v2

    sget-object v3, Lcom/google/android/gms/internal/zzafc$b;->b:Lcom/google/android/gms/internal/zzafc$b;

    if-ne v2, v3, :cond_a

    invoke-static {v10}, Lcom/google/android/gms/internal/zzafc$a;->l(Lcom/google/android/gms/internal/zzafc$a;)I

    move-result v2

    const/16 v3, 0x19

    if-lt v2, v3, :cond_6

    const/4 v2, 0x1

    const-string v3, "maxretries"

    invoke-static {v3}, Lcom/google/firebase/database/DatabaseError;->zzhL(Ljava/lang/String;)Lcom/google/firebase/database/DatabaseError;

    move-result-object v9

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/google/android/gms/internal/zzafc;->zzbMa:Lcom/google/android/gms/internal/zzafj;

    invoke-static {v10}, Lcom/google/android/gms/internal/zzafc$a;->c(Lcom/google/android/gms/internal/zzafc$a;)J

    move-result-wide v4

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/google/android/gms/internal/zzafc;->zzbLN:Lcom/google/android/gms/internal/zzair;

    invoke-virtual/range {v3 .. v8}, Lcom/google/android/gms/internal/zzafj;->zza(JZZLcom/google/android/gms/internal/zzain;)Ljava/util/List;

    move-result-object v3

    move-object/from16 v0, v16

    invoke-interface {v0, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_3

    :cond_6
    invoke-static {v10}, Lcom/google/android/gms/internal/zzafc$a;->f(Lcom/google/android/gms/internal/zzafc$a;)Lcom/google/android/gms/internal/zzafa;

    move-result-object v2

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v14}, Lcom/google/android/gms/internal/zzafc;->zza(Lcom/google/android/gms/internal/zzafa;Ljava/util/List;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v2

    invoke-static {v10, v2}, Lcom/google/android/gms/internal/zzafc$a;->a(Lcom/google/android/gms/internal/zzafc$a;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;

    invoke-static {v2}, Lcom/google/firebase/database/zza;->zza(Lcom/google/android/gms/internal/zzahu;)Lcom/google/firebase/database/MutableData;

    move-result-object v2

    const/4 v3, 0x0

    :try_start_0
    invoke-static {v10}, Lcom/google/android/gms/internal/zzafc$a;->i(Lcom/google/android/gms/internal/zzafc$a;)Lcom/google/firebase/database/Transaction$Handler;

    move-result-object v4

    invoke-interface {v4, v2}, Lcom/google/firebase/database/Transaction$Handler;->doTransaction(Lcom/google/firebase/database/MutableData;)Lcom/google/firebase/database/Transaction$Result;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    move-object v9, v3

    :goto_4
    invoke-virtual {v2}, Lcom/google/firebase/database/Transaction$Result;->isSuccess()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-static {v10}, Lcom/google/android/gms/internal/zzafc$a;->c(Lcom/google/android/gms/internal/zzafc$a;)J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v17

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/google/android/gms/internal/zzafc;->zzbLN:Lcom/google/android/gms/internal/zzair;

    invoke-static {v3}, Lcom/google/android/gms/internal/zzaff;->zza(Lcom/google/android/gms/internal/zzain;)Ljava/util/Map;

    move-result-object v3

    invoke-virtual {v2}, Lcom/google/firebase/database/Transaction$Result;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v4

    invoke-static {v4, v3}, Lcom/google/android/gms/internal/zzaff;->zza(Lcom/google/android/gms/internal/zzahu;Ljava/util/Map;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v5

    invoke-static {v10, v4}, Lcom/google/android/gms/internal/zzafc$a;->b(Lcom/google/android/gms/internal/zzafc$a;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;

    invoke-static {v10, v5}, Lcom/google/android/gms/internal/zzafc$a;->c(Lcom/google/android/gms/internal/zzafc$a;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/zzafc;->zzRC()J

    move-result-wide v2

    invoke-static {v10, v2, v3}, Lcom/google/android/gms/internal/zzafc$a;->a(Lcom/google/android/gms/internal/zzafc$a;J)J

    move-object/from16 v0, v17

    invoke-interface {v14, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/internal/zzafc;->zzbMa:Lcom/google/android/gms/internal/zzafj;

    invoke-static {v10}, Lcom/google/android/gms/internal/zzafc$a;->f(Lcom/google/android/gms/internal/zzafc$a;)Lcom/google/android/gms/internal/zzafa;

    move-result-object v3

    invoke-static {v10}, Lcom/google/android/gms/internal/zzafc$a;->c(Lcom/google/android/gms/internal/zzafc$a;)J

    move-result-wide v6

    invoke-static {v10}, Lcom/google/android/gms/internal/zzafc$a;->m(Lcom/google/android/gms/internal/zzafc$a;)Z

    move-result v8

    const/4 v9, 0x0

    invoke-virtual/range {v2 .. v9}, Lcom/google/android/gms/internal/zzafj;->zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzahu;JZZ)Ljava/util/List;

    move-result-object v2

    move-object/from16 v0, v16

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/google/android/gms/internal/zzafc;->zzbMa:Lcom/google/android/gms/internal/zzafj;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/google/android/gms/internal/zzafc;->zzbLN:Lcom/google/android/gms/internal/zzair;

    invoke-virtual/range {v3 .. v8}, Lcom/google/android/gms/internal/zzafj;->zza(JZZLcom/google/android/gms/internal/zzain;)Ljava/util/List;

    move-result-object v2

    move-object/from16 v0, v16

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    move-object v9, v11

    move v2, v12

    goto/16 :goto_3

    :catch_0
    move-exception v2

    invoke-static {v2}, Lcom/google/firebase/database/DatabaseError;->fromException(Ljava/lang/Throwable;)Lcom/google/firebase/database/DatabaseError;

    move-result-object v3

    invoke-static {}, Lcom/google/firebase/database/Transaction;->abort()Lcom/google/firebase/database/Transaction$Result;

    move-result-object v2

    move-object v9, v3

    goto :goto_4

    :cond_7
    const/4 v2, 0x1

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/google/android/gms/internal/zzafc;->zzbMa:Lcom/google/android/gms/internal/zzafj;

    invoke-static {v10}, Lcom/google/android/gms/internal/zzafc$a;->c(Lcom/google/android/gms/internal/zzafc$a;)J

    move-result-wide v4

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/google/android/gms/internal/zzafc;->zzbLN:Lcom/google/android/gms/internal/zzair;

    invoke-virtual/range {v3 .. v8}, Lcom/google/android/gms/internal/zzafj;->zza(JZZLcom/google/android/gms/internal/zzain;)Ljava/util/List;

    move-result-object v3

    move-object/from16 v0, v16

    invoke-interface {v0, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto/16 :goto_3

    :cond_8
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/internal/zzafc;->zzbLQ:Lcom/google/android/gms/internal/zzagk;

    move-object/from16 v0, p0

    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/zzafc;->zzb(Lcom/google/android/gms/internal/zzagk;)V

    const/4 v2, 0x0

    move v3, v2

    :goto_5
    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v2

    if-ge v3, v2, :cond_9

    invoke-interface {v13, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Runnable;

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/zzafc;->postEvent(Ljava/lang/Runnable;)V

    add-int/lit8 v2, v3, 0x1

    move v3, v2

    goto :goto_5

    :cond_9
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/zzafc;->zzRE()V

    goto/16 :goto_0

    :cond_a
    move-object v9, v11

    move v2, v12

    goto/16 :goto_3
.end method

.method static synthetic zzc(Lcom/google/android/gms/internal/zzafc;)Lcom/google/android/gms/internal/zzaej;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbKx:Lcom/google/android/gms/internal/zzaej;

    return-object v0
.end method

.method private zzc(Lcom/google/android/gms/internal/zzagk;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzagk",
            "<",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzafc$a;",
            ">;>;)",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzafc$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {p0, v0, p1}, Lcom/google/android/gms/internal/zzafc;->zza(Ljava/util/List;Lcom/google/android/gms/internal/zzagk;)V

    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    return-object v0
.end method

.method static synthetic zzd(Lcom/google/android/gms/internal/zzafc;)Lcom/google/android/gms/internal/zzafg;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbLO:Lcom/google/android/gms/internal/zzafg;

    return-object v0
.end method

.method static synthetic zze(Lcom/google/android/gms/internal/zzafc;)Lcom/google/android/gms/internal/zzafj;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbLZ:Lcom/google/android/gms/internal/zzafj;

    return-object v0
.end method

.method static synthetic zzf(Lcom/google/android/gms/internal/zzafc;)Lcom/google/android/gms/internal/zzafh;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbLP:Lcom/google/android/gms/internal/zzafh;

    return-object v0
.end method

.method static synthetic zzg(Lcom/google/android/gms/internal/zzafc;)Lcom/google/android/gms/internal/zzafj;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbMa:Lcom/google/android/gms/internal/zzafj;

    return-object v0
.end method

.method static synthetic zzh(Lcom/google/android/gms/internal/zzafc;)Lcom/google/android/gms/internal/zzair;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbLN:Lcom/google/android/gms/internal/zzair;

    return-object v0
.end method

.method static synthetic zzi(Lcom/google/android/gms/internal/zzafc;)Lcom/google/android/gms/internal/zzagk;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbLQ:Lcom/google/android/gms/internal/zzagk;

    return-object v0
.end method

.method static synthetic zzj(Lcom/google/android/gms/internal/zzafc;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzafc;->zzRE()V

    return-void
.end method

.method private zzn(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzahu;
    .locals 1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/zzafc;->zza(Lcom/google/android/gms/internal/zzafa;Ljava/util/List;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    return-object v0
.end method

.method private zzo(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzafa;
    .locals 2

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzafc;->zzp(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzagk;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagk;->zzPn()Lcom/google/android/gms/internal/zzafa;

    move-result-object v1

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzafc;->zzc(Lcom/google/android/gms/internal/zzagk;)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/zzafc;->zzb(Ljava/util/List;Lcom/google/android/gms/internal/zzafa;)V

    return-object v1
.end method

.method private zzp(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzagk;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzafa;",
            ")",
            "Lcom/google/android/gms/internal/zzagk",
            "<",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzafc$a;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbLQ:Lcom/google/android/gms/internal/zzagk;

    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafa;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagk;->getValue()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance v1, Lcom/google/android/gms/internal/zzafa;

    const/4 v2, 0x1

    new-array v2, v2, [Lcom/google/android/gms/internal/zzahi;

    const/4 v3, 0x0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafa;->zzRt()Lcom/google/android/gms/internal/zzahi;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/zzafa;-><init>([Lcom/google/android/gms/internal/zzahi;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzagk;->zzL(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzagk;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafa;->zzRu()Lcom/google/android/gms/internal/zzafa;

    move-result-object p1

    goto :goto_0

    :cond_0
    return-object v0
.end method


# virtual methods
.method public getDatabase()Lcom/google/firebase/database/FirebaseDatabase;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbMb:Lcom/google/firebase/database/FirebaseDatabase;

    return-object v0
.end method

.method interrupt()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbKx:Lcom/google/android/gms/internal/zzaej;

    const-string v1, "repo_interrupt"

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzaej;->interrupt(Ljava/lang/String;)V

    return-void
.end method

.method public onDisconnect()V
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/zzaet;->zzbLo:Lcom/google/android/gms/internal/zzahi;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/zzafc;->zza(Lcom/google/android/gms/internal/zzahi;Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzafc;->zzRD()V

    return-void
.end method

.method public postEvent(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbLT:Lcom/google/android/gms/internal/zzaeu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaeu;->zzQU()V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbLT:Lcom/google/android/gms/internal/zzaeu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaeu;->zzRb()Lcom/google/firebase/database/EventTarget;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/google/firebase/database/EventTarget;->postEvent(Ljava/lang/Runnable;)V

    return-void
.end method

.method public purgeOutstandingWrites()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbLU:Lcom/google/android/gms/internal/zzahf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzahf;->zzTe()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbLU:Lcom/google/android/gms/internal/zzahf;

    const-string v1, "Purging writes"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/zzahf;->zzh(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbMa:Lcom/google/android/gms/internal/zzafj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzafj;->zzRK()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzafc;->zzS(Ljava/util/List;)V

    invoke-static {}, Lcom/google/android/gms/internal/zzafa;->zzRq()Lcom/google/android/gms/internal/zzafa;

    move-result-object v0

    const/16 v1, -0x19

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/zzafc;->zzb(Lcom/google/android/gms/internal/zzafa;I)Lcom/google/android/gms/internal/zzafa;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbKx:Lcom/google/android/gms/internal/zzaej;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzaej;->purgeOutstandingWrites()V

    return-void
.end method

.method resume()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbKx:Lcom/google/android/gms/internal/zzaej;

    const-string v1, "repo_interrupt"

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzaej;->resume(Ljava/lang/String;)V

    return-void
.end method

.method public scheduleNow(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbLT:Lcom/google/android/gms/internal/zzaeu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaeu;->zzQU()V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbLT:Lcom/google/android/gms/internal/zzaeu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaeu;->zzRc()Lcom/google/firebase/database/RunLoop;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/google/firebase/database/RunLoop;->scheduleNow(Ljava/lang/Runnable;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbHm:Lcom/google/android/gms/internal/zzafd;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzafd;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public zzQb()V
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/zzaet;->zzbLo:Lcom/google/android/gms/internal/zzahi;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/zzafc;->zza(Lcom/google/android/gms/internal/zzahi;Ljava/lang/Object;)V

    return-void
.end method

.method public zzRA()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbLN:Lcom/google/android/gms/internal/zzair;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzair;->zzUi()J

    move-result-wide v0

    return-wide v0
.end method

.method zzRB()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbLZ:Lcom/google/android/gms/internal/zzafj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzafj;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbMa:Lcom/google/android/gms/internal/zzafj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzafj;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public zzRz()Lcom/google/android/gms/internal/zzafd;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbHm:Lcom/google/android/gms/internal/zzafd;

    return-object v0
.end method

.method public zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzaes;Lcom/google/firebase/database/DatabaseReference$CompletionListener;Ljava/util/Map;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzafa;",
            "Lcom/google/android/gms/internal/zzaes;",
            "Lcom/google/firebase/database/DatabaseReference$CompletionListener;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const/4 v6, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbLU:Lcom/google/android/gms/internal/zzahf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzahf;->zzTe()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbLU:Lcom/google/android/gms/internal/zzahf;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x8

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "update: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v2, v6, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/zzahf;->zzh(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbLW:Lcom/google/android/gms/internal/zzahf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzahf;->zzTe()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbLW:Lcom/google/android/gms/internal/zzahf;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x9

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v4, v5

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "update: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, " "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v2, v6, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/zzahf;->zzh(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzaes;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbLU:Lcom/google/android/gms/internal/zzahf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzahf;->zzTe()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbLU:Lcom/google/android/gms/internal/zzahf;

    const-string v1, "update called with no changes. No-op"

    new-array v2, v6, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/zzahf;->zzh(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    const/4 v0, 0x0

    invoke-virtual {p0, p3, v0, p1}, Lcom/google/android/gms/internal/zzafc;->zza(Lcom/google/firebase/database/DatabaseReference$CompletionListener;Lcom/google/firebase/database/DatabaseError;Lcom/google/android/gms/internal/zzafa;)V

    :goto_0
    return-void

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbLN:Lcom/google/android/gms/internal/zzair;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzaff;->zza(Lcom/google/android/gms/internal/zzain;)Ljava/util/Map;

    move-result-object v0

    invoke-static {p2, v0}, Lcom/google/android/gms/internal/zzaff;->zza(Lcom/google/android/gms/internal/zzaes;Ljava/util/Map;)Lcom/google/android/gms/internal/zzaes;

    move-result-object v3

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzafc;->zzRC()J

    move-result-wide v4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbMa:Lcom/google/android/gms/internal/zzafj;

    const/4 v6, 0x1

    move-object v1, p1

    move-object v2, p2

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/zzafj;->zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzaes;Lcom/google/android/gms/internal/zzaes;JZ)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzafc;->zzS(Ljava/util/List;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbKx:Lcom/google/android/gms/internal/zzaej;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafa;->zzRs()Ljava/util/List;

    move-result-object v7

    new-instance v1, Lcom/google/android/gms/internal/zzafc$15;

    move-object v2, p0

    move-object v3, p1

    move-object v6, p3

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/zzafc$15;-><init>(Lcom/google/android/gms/internal/zzafc;Lcom/google/android/gms/internal/zzafa;JLcom/google/firebase/database/DatabaseReference$CompletionListener;)V

    invoke-interface {v0, v7, p4, v1}, Lcom/google/android/gms/internal/zzaej;->zza(Ljava/util/List;Ljava/util/Map;Lcom/google/android/gms/internal/zzaem;)V

    const/16 v0, -0x9

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/zzafc;->zzb(Lcom/google/android/gms/internal/zzafa;I)Lcom/google/android/gms/internal/zzafa;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzafc;->zzo(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzafa;

    goto :goto_0
.end method

.method public zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;Lcom/google/firebase/database/DatabaseReference$CompletionListener;)V
    .locals 9

    const/4 v7, 0x0

    const/4 v6, 0x1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbLU:Lcom/google/android/gms/internal/zzahf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzahf;->zzTe()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbLU:Lcom/google/android/gms/internal/zzahf;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x5

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "set: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v2, v7, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/zzahf;->zzh(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbLW:Lcom/google/android/gms/internal/zzahf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzahf;->zzTe()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbLW:Lcom/google/android/gms/internal/zzahf;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x6

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v4, v5

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "set: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, " "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v2, v7, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/zzahf;->zzh(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbLN:Lcom/google/android/gms/internal/zzair;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzaff;->zza(Lcom/google/android/gms/internal/zzain;)Ljava/util/Map;

    move-result-object v0

    invoke-static {p2, v0}, Lcom/google/android/gms/internal/zzaff;->zza(Lcom/google/android/gms/internal/zzahu;Ljava/util/Map;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v3

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzafc;->zzRC()J

    move-result-wide v4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbMa:Lcom/google/android/gms/internal/zzafj;

    move-object v1, p1

    move-object v2, p2

    move v7, v6

    invoke-virtual/range {v0 .. v7}, Lcom/google/android/gms/internal/zzafj;->zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzahu;JZZ)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzafc;->zzS(Ljava/util/List;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbKx:Lcom/google/android/gms/internal/zzaej;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafa;->zzRs()Ljava/util/List;

    move-result-object v7

    invoke-interface {p2, v6}, Lcom/google/android/gms/internal/zzahu;->getValue(Z)Ljava/lang/Object;

    move-result-object v8

    new-instance v1, Lcom/google/android/gms/internal/zzafc$14;

    move-object v2, p0

    move-object v3, p1

    move-object v6, p3

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/zzafc$14;-><init>(Lcom/google/android/gms/internal/zzafc;Lcom/google/android/gms/internal/zzafa;JLcom/google/firebase/database/DatabaseReference$CompletionListener;)V

    invoke-interface {v0, v7, v8, v1}, Lcom/google/android/gms/internal/zzaej;->zza(Ljava/util/List;Ljava/lang/Object;Lcom/google/android/gms/internal/zzaem;)V

    const/16 v0, -0x9

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/zzafc;->zzb(Lcom/google/android/gms/internal/zzafa;I)Lcom/google/android/gms/internal/zzafa;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzafc;->zzo(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzafa;

    return-void
.end method

.method public zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/firebase/database/DatabaseReference$CompletionListener;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbKx:Lcom/google/android/gms/internal/zzaej;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafa;->zzRs()Ljava/util/List;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/zzafc$17;

    invoke-direct {v2, p0, p1, p2}, Lcom/google/android/gms/internal/zzafc$17;-><init>(Lcom/google/android/gms/internal/zzafc;Lcom/google/android/gms/internal/zzafa;Lcom/google/firebase/database/DatabaseReference$CompletionListener;)V

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/zzaej;->zza(Ljava/util/List;Lcom/google/android/gms/internal/zzaem;)V

    return-void
.end method

.method public zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/firebase/database/Transaction$Handler;Z)V
    .locals 12

    const/4 v10, 0x0

    const/4 v8, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbLU:Lcom/google/android/gms/internal/zzahf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzahf;->zzTe()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbLU:Lcom/google/android/gms/internal/zzahf;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0xd

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "transaction: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v2, v10, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/zzahf;->zzh(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbLW:Lcom/google/android/gms/internal/zzahf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzahf;->zzTe()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbLU:Lcom/google/android/gms/internal/zzahf;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0xd

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "transaction: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v2, v10, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/zzahf;->zzh(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbLT:Lcom/google/android/gms/internal/zzaeu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaeu;->zzPW()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbMc:Z

    if-nez v0, :cond_2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbMc:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbLV:Lcom/google/android/gms/internal/zzahf;

    const-string v1, "runTransaction() usage detected while persistence is enabled. Please be aware that transactions *will not* be persisted across database restarts.  See https://www.firebase.com/docs/android/guide/offline-capabilities.html#section-handling-transactions-offline for more details."

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzahf;->info(Ljava/lang/String;)V

    :cond_2
    invoke-static {p0, p1}, Lcom/google/firebase/database/zza;->zza(Lcom/google/android/gms/internal/zzafc;Lcom/google/android/gms/internal/zzafa;)Lcom/google/firebase/database/DatabaseReference;

    move-result-object v9

    new-instance v3, Lcom/google/android/gms/internal/zzafc$19;

    invoke-direct {v3, p0}, Lcom/google/android/gms/internal/zzafc$19;-><init>(Lcom/google/android/gms/internal/zzafc;)V

    new-instance v0, Lcom/google/android/gms/internal/zzafp;

    invoke-virtual {v9}, Lcom/google/firebase/database/DatabaseReference;->zzPo()Lcom/google/android/gms/internal/zzagu;

    move-result-object v1

    invoke-direct {v0, p0, v3, v1}, Lcom/google/android/gms/internal/zzafp;-><init>(Lcom/google/android/gms/internal/zzafc;Lcom/google/firebase/database/ValueEventListener;Lcom/google/android/gms/internal/zzagu;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzafc;->zzf(Lcom/google/android/gms/internal/zzaew;)V

    new-instance v0, Lcom/google/android/gms/internal/zzafc$a;

    sget-object v4, Lcom/google/android/gms/internal/zzafc$b;->a:Lcom/google/android/gms/internal/zzafc$b;

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzafc;->zzRF()J

    move-result-wide v6

    move-object v1, p1

    move-object v2, p2

    move v5, p3

    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/internal/zzafc$a;-><init>(Lcom/google/android/gms/internal/zzafa;Lcom/google/firebase/database/Transaction$Handler;Lcom/google/firebase/database/ValueEventListener;Lcom/google/android/gms/internal/zzafc$b;ZJLcom/google/android/gms/internal/zzafc$1;)V

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzafc;->zzn(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/zzafc$a;->a(Lcom/google/android/gms/internal/zzafc$a;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;

    invoke-static {v1}, Lcom/google/firebase/database/zza;->zza(Lcom/google/android/gms/internal/zzahu;)Lcom/google/firebase/database/MutableData;

    move-result-object v1

    :try_start_0
    invoke-interface {p2, v1}, Lcom/google/firebase/database/Transaction$Handler;->doTransaction(Lcom/google/firebase/database/MutableData;)Lcom/google/firebase/database/Transaction$Result;

    move-result-object v1

    if-nez v1, :cond_3

    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "Transaction returned null as result"

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v1

    invoke-static {v1}, Lcom/google/firebase/database/DatabaseError;->fromException(Ljava/lang/Throwable;)Lcom/google/firebase/database/DatabaseError;

    move-result-object v2

    invoke-static {}, Lcom/google/firebase/database/Transaction;->abort()Lcom/google/firebase/database/Transaction$Result;

    move-result-object v1

    move-object v11, v1

    move-object v1, v2

    move-object v2, v11

    :goto_0
    invoke-virtual {v2}, Lcom/google/firebase/database/Transaction$Result;->isSuccess()Z

    move-result v3

    if-nez v3, :cond_4

    invoke-static {v0, v8}, Lcom/google/android/gms/internal/zzafc$a;->b(Lcom/google/android/gms/internal/zzafc$a;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;

    invoke-static {v0, v8}, Lcom/google/android/gms/internal/zzafc$a;->c(Lcom/google/android/gms/internal/zzafc$a;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzafc$a;->b(Lcom/google/android/gms/internal/zzafc$a;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/zzahp;->zzm(Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahp;

    move-result-object v0

    invoke-static {v9, v0}, Lcom/google/firebase/database/zza;->zza(Lcom/google/firebase/database/DatabaseReference;Lcom/google/android/gms/internal/zzahp;)Lcom/google/firebase/database/DataSnapshot;

    move-result-object v0

    new-instance v2, Lcom/google/android/gms/internal/zzafc$20;

    invoke-direct {v2, p0, p2, v1, v0}, Lcom/google/android/gms/internal/zzafc$20;-><init>(Lcom/google/android/gms/internal/zzafc;Lcom/google/firebase/database/Transaction$Handler;Lcom/google/firebase/database/DatabaseError;Lcom/google/firebase/database/DataSnapshot;)V

    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/zzafc;->postEvent(Ljava/lang/Runnable;)V

    :goto_1
    return-void

    :cond_3
    move-object v2, v1

    move-object v1, v8

    goto :goto_0

    :cond_4
    sget-object v1, Lcom/google/android/gms/internal/zzafc$b;->b:Lcom/google/android/gms/internal/zzafc$b;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/zzafc$a;->a(Lcom/google/android/gms/internal/zzafc$a;Lcom/google/android/gms/internal/zzafc$b;)Lcom/google/android/gms/internal/zzafc$b;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafc;->zzbLQ:Lcom/google/android/gms/internal/zzagk;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/zzagk;->zzL(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzagk;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/zzagk;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-nez v1, :cond_5

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :cond_5
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/zzagk;->setValue(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafc;->zzbLN:Lcom/google/android/gms/internal/zzair;

    invoke-static {v1}, Lcom/google/android/gms/internal/zzaff;->zza(Lcom/google/android/gms/internal/zzain;)Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v2}, Lcom/google/firebase/database/Transaction$Result;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v2

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/zzaff;->zza(Lcom/google/android/gms/internal/zzahu;Ljava/util/Map;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v3

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/zzafc$a;->b(Lcom/google/android/gms/internal/zzafc$a;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;

    invoke-static {v0, v3}, Lcom/google/android/gms/internal/zzafc$a;->c(Lcom/google/android/gms/internal/zzafc$a;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzafc;->zzRC()J

    move-result-wide v4

    invoke-static {v0, v4, v5}, Lcom/google/android/gms/internal/zzafc$a;->a(Lcom/google/android/gms/internal/zzafc$a;J)J

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafc;->zzbMa:Lcom/google/android/gms/internal/zzafj;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzafc$a;->c(Lcom/google/android/gms/internal/zzafc$a;)J

    move-result-wide v4

    move-object v0, v1

    move-object v1, p1

    move v6, p3

    move v7, v10

    invoke-virtual/range {v0 .. v7}, Lcom/google/android/gms/internal/zzafj;->zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzahu;JZZ)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzafc;->zzS(Ljava/util/List;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzafc;->zzRE()V

    goto :goto_1
.end method

.method public zza(Lcom/google/android/gms/internal/zzafa;Ljava/util/Map;Lcom/google/firebase/database/DatabaseReference$CompletionListener;Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzafa;",
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/internal/zzafa;",
            "Lcom/google/android/gms/internal/zzahu;",
            ">;",
            "Lcom/google/firebase/database/DatabaseReference$CompletionListener;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbKx:Lcom/google/android/gms/internal/zzaej;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafa;->zzRs()Ljava/util/List;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/zzafc$12;

    invoke-direct {v2, p0, p1, p2, p3}, Lcom/google/android/gms/internal/zzafc$12;-><init>(Lcom/google/android/gms/internal/zzafc;Lcom/google/android/gms/internal/zzafa;Ljava/util/Map;Lcom/google/firebase/database/DatabaseReference$CompletionListener;)V

    invoke-interface {v0, v1, p4, v2}, Lcom/google/android/gms/internal/zzaej;->zzb(Ljava/util/List;Ljava/util/Map;Lcom/google/android/gms/internal/zzaem;)V

    return-void
.end method

.method public zza(Lcom/google/android/gms/internal/zzagu;Z)V
    .locals 2

    sget-boolean v0, Lcom/google/android/gms/internal/zzafc;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagu;->zzPn()Lcom/google/android/gms/internal/zzafa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzafa;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzagu;->zzPn()Lcom/google/android/gms/internal/zzafa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzafa;->zzRt()Lcom/google/android/gms/internal/zzahi;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/zzaet;->zzbLl:Lcom/google/android/gms/internal/zzahi;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzahi;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbMa:Lcom/google/android/gms/internal/zzafj;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/zzafj;->zza(Lcom/google/android/gms/internal/zzagu;Z)V

    return-void
.end method

.method public zza(Lcom/google/android/gms/internal/zzahi;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/zzafc;->zzb(Lcom/google/android/gms/internal/zzahi;Ljava/lang/Object;)V

    return-void
.end method

.method zza(Lcom/google/firebase/database/DatabaseReference$CompletionListener;Lcom/google/firebase/database/DatabaseError;Lcom/google/android/gms/internal/zzafa;)V
    .locals 2

    if-eqz p1, :cond_0

    invoke-virtual {p3}, Lcom/google/android/gms/internal/zzafa;->zzRw()Lcom/google/android/gms/internal/zzahi;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzahi;->zzTl()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p3}, Lcom/google/android/gms/internal/zzafa;->zzRv()Lcom/google/android/gms/internal/zzafa;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/google/firebase/database/zza;->zza(Lcom/google/android/gms/internal/zzafc;Lcom/google/android/gms/internal/zzafa;)Lcom/google/firebase/database/DatabaseReference;

    move-result-object v0

    :goto_0
    new-instance v1, Lcom/google/android/gms/internal/zzafc$13;

    invoke-direct {v1, p0, p1, p2, v0}, Lcom/google/android/gms/internal/zzafc$13;-><init>(Lcom/google/android/gms/internal/zzafc;Lcom/google/firebase/database/DatabaseReference$CompletionListener;Lcom/google/firebase/database/DatabaseError;Lcom/google/firebase/database/DatabaseReference;)V

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/zzafc;->postEvent(Ljava/lang/Runnable;)V

    :cond_0
    return-void

    :cond_1
    invoke-static {p0, p3}, Lcom/google/firebase/database/zza;->zza(Lcom/google/android/gms/internal/zzafc;Lcom/google/android/gms/internal/zzafa;)Lcom/google/firebase/database/DatabaseReference;

    move-result-object v0

    goto :goto_0
.end method

.method public zza(Ljava/util/List;Ljava/lang/Object;ZLjava/lang/Long;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Object;",
            "Z",
            "Ljava/lang/Long;",
            ")V"
        }
    .end annotation

    const/4 v7, 0x0

    new-instance v1, Lcom/google/android/gms/internal/zzafa;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/zzafa;-><init>(Ljava/util/List;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbLU:Lcom/google/android/gms/internal/zzahf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzahf;->zzTe()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbLU:Lcom/google/android/gms/internal/zzahf;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0xe

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "onDataUpdate: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v3, v7, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/zzahf;->zzh(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbLW:Lcom/google/android/gms/internal/zzahf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzahf;->zzTe()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbLU:Lcom/google/android/gms/internal/zzahf;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/lit8 v5, v5, 0xf

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    add-int/2addr v5, v6

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v5, "onDataUpdate: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, " "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v3, v7, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/zzahf;->zzh(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    iget-wide v2, p0, Lcom/google/android/gms/internal/zzafc;->zzbLX:J

    const-wide/16 v4, 0x1

    add-long/2addr v2, v4

    iput-wide v2, p0, Lcom/google/android/gms/internal/zzafc;->zzbLX:J

    if-eqz p4, :cond_5

    :try_start_0
    new-instance v2, Lcom/google/android/gms/internal/zzafk;

    invoke-virtual {p4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-direct {v2, v4, v5}, Lcom/google/android/gms/internal/zzafk;-><init>(J)V

    if-eqz p3, :cond_4

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    check-cast p2, Ljava/util/Map;

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Lcom/google/android/gms/internal/zzahv;->zzaq(Ljava/lang/Object;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v5

    new-instance v6, Lcom/google/android/gms/internal/zzafa;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {v6, v0}, Lcom/google/android/gms/internal/zzafa;-><init>(Ljava/lang/String;)V

    invoke-interface {v3, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Lcom/google/firebase/database/DatabaseException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafc;->zzbLU:Lcom/google/android/gms/internal/zzahf;

    const-string v2, "FIREBASE INTERNAL ERROR"

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/zzahf;->zze(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    return-void

    :cond_2
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbMa:Lcom/google/android/gms/internal/zzafj;

    invoke-virtual {v0, v1, v3, v2}, Lcom/google/android/gms/internal/zzafj;->zza(Lcom/google/android/gms/internal/zzafa;Ljava/util/Map;Lcom/google/android/gms/internal/zzafk;)Ljava/util/List;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_3

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/zzafc;->zzo(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzafa;

    :cond_3
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzafc;->zzS(Ljava/util/List;)V

    goto :goto_1

    :cond_4
    invoke-static {p2}, Lcom/google/android/gms/internal/zzahv;->zzaq(Ljava/lang/Object;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    iget-object v3, p0, Lcom/google/android/gms/internal/zzafc;->zzbMa:Lcom/google/android/gms/internal/zzafj;

    invoke-virtual {v3, v1, v0, v2}, Lcom/google/android/gms/internal/zzafj;->zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzafk;)Ljava/util/List;

    move-result-object v0

    goto :goto_2

    :cond_5
    if-eqz p3, :cond_7

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    check-cast p2, Ljava/util/Map;

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lcom/google/android/gms/internal/zzahv;->zzaq(Ljava/lang/Object;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v4

    new-instance v5, Lcom/google/android/gms/internal/zzafa;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {v5, v0}, Lcom/google/android/gms/internal/zzafa;-><init>(Ljava/lang/String;)V

    invoke-interface {v2, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbMa:Lcom/google/android/gms/internal/zzafj;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/zzafj;->zza(Lcom/google/android/gms/internal/zzafa;Ljava/util/Map;)Ljava/util/List;

    move-result-object v0

    goto :goto_2

    :cond_7
    invoke-static {p2}, Lcom/google/android/gms/internal/zzahv;->zzaq(Ljava/lang/Object;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/internal/zzafc;->zzbMa:Lcom/google/android/gms/internal/zzafj;

    invoke-virtual {v2, v1, v0}, Lcom/google/android/gms/internal/zzafj;->zzi(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;)Ljava/util/List;
    :try_end_1
    .catch Lcom/google/firebase/database/DatabaseException; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v0

    goto :goto_2
.end method

.method public zza(Ljava/util/List;Ljava/util/List;Ljava/lang/Long;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzael;",
            ">;",
            "Ljava/lang/Long;",
            ")V"
        }
    .end annotation

    const/4 v7, 0x0

    new-instance v1, Lcom/google/android/gms/internal/zzafa;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/zzafa;-><init>(Ljava/util/List;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbLU:Lcom/google/android/gms/internal/zzahf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzahf;->zzTe()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbLU:Lcom/google/android/gms/internal/zzahf;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x14

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "onRangeMergeUpdate: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v3, v7, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/zzahf;->zzh(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbLW:Lcom/google/android/gms/internal/zzahf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzahf;->zzTe()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbLU:Lcom/google/android/gms/internal/zzahf;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/lit8 v5, v5, 0x15

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    add-int/2addr v5, v6

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v5, "onRangeMergeUpdate: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, " "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v3, v7, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/zzahf;->zzh(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    iget-wide v2, p0, Lcom/google/android/gms/internal/zzafc;->zzbLX:J

    const-wide/16 v4, 0x1

    add-long/2addr v2, v4

    iput-wide v2, p0, Lcom/google/android/gms/internal/zzafc;->zzbLX:J

    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzael;

    new-instance v4, Lcom/google/android/gms/internal/zzahz;

    invoke-direct {v4, v0}, Lcom/google/android/gms/internal/zzahz;-><init>(Lcom/google/android/gms/internal/zzael;)V

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    if-eqz p3, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbMa:Lcom/google/android/gms/internal/zzafj;

    new-instance v3, Lcom/google/android/gms/internal/zzafk;

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-direct {v3, v4, v5}, Lcom/google/android/gms/internal/zzafk;-><init>(J)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/zzafj;->zza(Lcom/google/android/gms/internal/zzafa;Ljava/util/List;Lcom/google/android/gms/internal/zzafk;)Ljava/util/List;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_3

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/zzafc;->zzo(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzafa;

    :cond_3
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzafc;->zzS(Ljava/util/List;)V

    return-void

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbMa:Lcom/google/android/gms/internal/zzafj;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/zzafj;->zzb(Lcom/google/android/gms/internal/zzafa;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    goto :goto_1
.end method

.method public zzaO(Z)V
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/zzaet;->zzbLn:Lcom/google/android/gms/internal/zzahi;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/zzafc;->zza(Lcom/google/android/gms/internal/zzahi;Ljava/lang/Object;)V

    return-void
.end method

.method public zzat(Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Lcom/google/android/gms/internal/zzahi;->zzig(Ljava/lang/String;)Lcom/google/android/gms/internal/zzahi;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lcom/google/android/gms/internal/zzafc;->zzb(Lcom/google/android/gms/internal/zzahi;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public zzb(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;Lcom/google/firebase/database/DatabaseReference$CompletionListener;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbKx:Lcom/google/android/gms/internal/zzaej;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafa;->zzRs()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x1

    invoke-interface {p2, v2}, Lcom/google/android/gms/internal/zzahu;->getValue(Z)Ljava/lang/Object;

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/internal/zzafc$16;

    invoke-direct {v3, p0, p1, p2, p3}, Lcom/google/android/gms/internal/zzafc$16;-><init>(Lcom/google/android/gms/internal/zzafc;Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;Lcom/google/firebase/database/DatabaseReference$CompletionListener;)V

    invoke-interface {v0, v1, v2, v3}, Lcom/google/android/gms/internal/zzaej;->zzb(Ljava/util/List;Ljava/lang/Object;Lcom/google/android/gms/internal/zzaem;)V

    return-void
.end method

.method public zze(Lcom/google/android/gms/internal/zzaew;)V
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/zzaet;->zzbLl:Lcom/google/android/gms/internal/zzahi;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzaew;->zzQM()Lcom/google/android/gms/internal/zzagu;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzagu;->zzPn()Lcom/google/android/gms/internal/zzafa;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzafa;->zzRt()Lcom/google/android/gms/internal/zzahi;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzahi;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbLZ:Lcom/google/android/gms/internal/zzafj;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzafj;->zzh(Lcom/google/android/gms/internal/zzaew;)Ljava/util/List;

    move-result-object v0

    :goto_0
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzafc;->zzS(Ljava/util/List;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbMa:Lcom/google/android/gms/internal/zzafj;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzafj;->zzh(Lcom/google/android/gms/internal/zzaew;)Ljava/util/List;

    move-result-object v0

    goto :goto_0
.end method

.method public zzf(Lcom/google/android/gms/internal/zzaew;)V
    .locals 2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzaew;->zzQM()Lcom/google/android/gms/internal/zzagu;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagu;->zzPn()Lcom/google/android/gms/internal/zzafa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzafa;->zzRt()Lcom/google/android/gms/internal/zzahi;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v1, Lcom/google/android/gms/internal/zzaet;->zzbLl:Lcom/google/android/gms/internal/zzahi;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzahi;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbLZ:Lcom/google/android/gms/internal/zzafj;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzafj;->zzg(Lcom/google/android/gms/internal/zzaew;)Ljava/util/List;

    move-result-object v0

    :goto_0
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzafc;->zzS(Ljava/util/List;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc;->zzbMa:Lcom/google/android/gms/internal/zzafj;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzafj;->zzg(Lcom/google/android/gms/internal/zzaew;)Ljava/util/List;

    move-result-object v0

    goto :goto_0
.end method
