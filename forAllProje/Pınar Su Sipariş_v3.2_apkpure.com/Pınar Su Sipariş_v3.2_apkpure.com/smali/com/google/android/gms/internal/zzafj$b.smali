.class Lcom/google/android/gms/internal/zzafj$b;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/zzaei;
.implements Lcom/google/android/gms/internal/zzafj$zza;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/zzafj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/zzafj;

.field private final b:Lcom/google/android/gms/internal/zzagv;

.field private final c:Lcom/google/android/gms/internal/zzafk;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzafj;Lcom/google/android/gms/internal/zzagv;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/zzafj$b;->a:Lcom/google/android/gms/internal/zzafj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/zzafj$b;->b:Lcom/google/android/gms/internal/zzagv;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzagv;->zzSS()Lcom/google/android/gms/internal/zzagu;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/zzafj;->zza(Lcom/google/android/gms/internal/zzafj;Lcom/google/android/gms/internal/zzagu;)Lcom/google/android/gms/internal/zzafk;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzafj$b;->c:Lcom/google/android/gms/internal/zzafk;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/zzafj$b;)Lcom/google/android/gms/internal/zzafk;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafj$b;->c:Lcom/google/android/gms/internal/zzafk;

    return-object v0
.end method


# virtual methods
.method public zzPY()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafj$b;->b:Lcom/google/android/gms/internal/zzagv;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagv;->zzST()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzahu;->zzTn()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public zzPZ()Z
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafj$b;->b:Lcom/google/android/gms/internal/zzagv;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagv;->zzST()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/zzaiq;->zzs(Lcom/google/android/gms/internal/zzahu;)J

    move-result-wide v0

    const-wide/16 v2, 0x400

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public zzQa()Lcom/google/android/gms/internal/zzaec;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafj$b;->b:Lcom/google/android/gms/internal/zzagv;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagv;->zzST()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/zzahk;->zzh(Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahk;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzahk;->zzPR()Ljava/util/List;

    move-result-object v0

    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzafa;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzafa;->zzRs()Ljava/util/List;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/zzaec;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzahk;->zzPS()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Lcom/google/android/gms/internal/zzaec;-><init>(Ljava/util/List;Ljava/util/List;)V

    return-object v0
.end method

.method public zzb(Lcom/google/firebase/database/DatabaseError;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/database/DatabaseError;",
            ")",
            "Ljava/util/List",
            "<+",
            "Lcom/google/android/gms/internal/zzagq;",
            ">;"
        }
    .end annotation

    if-nez p1, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafj$b;->b:Lcom/google/android/gms/internal/zzagv;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagv;->zzSS()Lcom/google/android/gms/internal/zzagu;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafj$b;->c:Lcom/google/android/gms/internal/zzafk;

    if-eqz v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafj$b;->a:Lcom/google/android/gms/internal/zzafj;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafj$b;->c:Lcom/google/android/gms/internal/zzafk;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzafj;->zza(Lcom/google/android/gms/internal/zzafk;)Ljava/util/List;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/zzafj$b;->a:Lcom/google/android/gms/internal/zzafj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagu;->zzPn()Lcom/google/android/gms/internal/zzafa;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zzafj;->zzt(Lcom/google/android/gms/internal/zzafa;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/zzafj$b;->a:Lcom/google/android/gms/internal/zzafj;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzafj;->zza(Lcom/google/android/gms/internal/zzafj;)Lcom/google/android/gms/internal/zzahf;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafj$b;->b:Lcom/google/android/gms/internal/zzagv;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzagv;->zzSS()Lcom/google/android/gms/internal/zzagu;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzagu;->zzPn()Lcom/google/android/gms/internal/zzafa;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/firebase/database/DatabaseError;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x13

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v4, v5

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "Listen at "

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

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafj$b;->a:Lcom/google/android/gms/internal/zzafj;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafj$b;->b:Lcom/google/android/gms/internal/zzagv;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzagv;->zzSS()Lcom/google/android/gms/internal/zzagu;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/zzafj;->zza(Lcom/google/android/gms/internal/zzagu;Lcom/google/firebase/database/DatabaseError;)Ljava/util/List;

    move-result-object v0

    goto :goto_0
.end method
