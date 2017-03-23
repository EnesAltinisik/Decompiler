.class Lcom/google/android/gms/internal/zzafc$22;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/zzaem;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzafc;->zza(Ljava/util/List;Lcom/google/android/gms/internal/zzafa;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/zzafa;

.field final synthetic b:Ljava/util/List;

.field final synthetic c:Lcom/google/android/gms/internal/zzafc;

.field final synthetic d:Lcom/google/android/gms/internal/zzafc;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzafc;Lcom/google/android/gms/internal/zzafa;Ljava/util/List;Lcom/google/android/gms/internal/zzafc;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzafc$22;->d:Lcom/google/android/gms/internal/zzafc;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzafc$22;->a:Lcom/google/android/gms/internal/zzafa;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzafc$22;->b:Ljava/util/List;

    iput-object p4, p0, Lcom/google/android/gms/internal/zzafc$22;->c:Lcom/google/android/gms/internal/zzafc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public zzaj(Ljava/lang/String;Ljava/lang/String;)V
    .locals 10

    const/4 v4, 0x0

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/zzafc;->zzal(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/database/DatabaseError;

    move-result-object v1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc$22;->d:Lcom/google/android/gms/internal/zzafc;

    const-string v2, "Transaction"

    iget-object v3, p0, Lcom/google/android/gms/internal/zzafc$22;->a:Lcom/google/android/gms/internal/zzafa;

    invoke-static {v0, v2, v3, v1}, Lcom/google/android/gms/internal/zzafc;->zza(Lcom/google/android/gms/internal/zzafc;Ljava/lang/String;Lcom/google/android/gms/internal/zzafa;Lcom/google/firebase/database/DatabaseError;)V

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    if-nez v1, :cond_1

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc$22;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzafc$a;

    sget-object v1, Lcom/google/android/gms/internal/zzafc$b;->d:Lcom/google/android/gms/internal/zzafc$b;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/zzafc$a;->a(Lcom/google/android/gms/internal/zzafc$a;Lcom/google/android/gms/internal/zzafc$b;)Lcom/google/android/gms/internal/zzafc$b;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafc$22;->d:Lcom/google/android/gms/internal/zzafc;

    invoke-static {v1}, Lcom/google/android/gms/internal/zzafc;->zzg(Lcom/google/android/gms/internal/zzafc;)Lcom/google/android/gms/internal/zzafj;

    move-result-object v1

    invoke-static {v0}, Lcom/google/android/gms/internal/zzafc$a;->c(Lcom/google/android/gms/internal/zzafc$a;)J

    move-result-wide v2

    iget-object v5, p0, Lcom/google/android/gms/internal/zzafc$22;->d:Lcom/google/android/gms/internal/zzafc;

    invoke-static {v5}, Lcom/google/android/gms/internal/zzafc;->zzh(Lcom/google/android/gms/internal/zzafc;)Lcom/google/android/gms/internal/zzair;

    move-result-object v6

    move v5, v4

    invoke-virtual/range {v1 .. v6}, Lcom/google/android/gms/internal/zzafj;->zza(JZZLcom/google/android/gms/internal/zzain;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v7, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-static {v0}, Lcom/google/android/gms/internal/zzafc$a;->h(Lcom/google/android/gms/internal/zzafc$a;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzafc$22;->c:Lcom/google/android/gms/internal/zzafc;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzafc$a;->f(Lcom/google/android/gms/internal/zzafc$a;)Lcom/google/android/gms/internal/zzafa;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/firebase/database/zza;->zza(Lcom/google/android/gms/internal/zzafc;Lcom/google/android/gms/internal/zzafa;)Lcom/google/firebase/database/DatabaseReference;

    move-result-object v2

    invoke-static {v1}, Lcom/google/android/gms/internal/zzahp;->zzm(Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahp;

    move-result-object v1

    invoke-static {v2, v1}, Lcom/google/firebase/database/zza;->zza(Lcom/google/firebase/database/DatabaseReference;Lcom/google/android/gms/internal/zzahp;)Lcom/google/firebase/database/DataSnapshot;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/zzafc$22$1;

    invoke-direct {v2, p0, v0, v1}, Lcom/google/android/gms/internal/zzafc$22$1;-><init>(Lcom/google/android/gms/internal/zzafc$22;Lcom/google/android/gms/internal/zzafc$a;Lcom/google/firebase/database/DataSnapshot;)V

    invoke-interface {v8, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafc$22;->d:Lcom/google/android/gms/internal/zzafc;

    new-instance v2, Lcom/google/android/gms/internal/zzafp;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzafc$22;->d:Lcom/google/android/gms/internal/zzafc;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzafc$a;->j(Lcom/google/android/gms/internal/zzafc$a;)Lcom/google/firebase/database/ValueEventListener;

    move-result-object v5

    invoke-static {v0}, Lcom/google/android/gms/internal/zzafc$a;->f(Lcom/google/android/gms/internal/zzafc$a;)Lcom/google/android/gms/internal/zzafa;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/zzagu;->zzN(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzagu;

    move-result-object v0

    invoke-direct {v2, v3, v5, v0}, Lcom/google/android/gms/internal/zzafp;-><init>(Lcom/google/android/gms/internal/zzafc;Lcom/google/firebase/database/ValueEventListener;Lcom/google/android/gms/internal/zzagu;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/zzafc;->zze(Lcom/google/android/gms/internal/zzaew;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc$22;->d:Lcom/google/android/gms/internal/zzafc;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafc$22;->d:Lcom/google/android/gms/internal/zzafc;

    invoke-static {v1}, Lcom/google/android/gms/internal/zzafc;->zzi(Lcom/google/android/gms/internal/zzafc;)Lcom/google/android/gms/internal/zzagk;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzafc$22;->a:Lcom/google/android/gms/internal/zzafa;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/zzagk;->zzL(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzagk;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/zzafc;->zzb(Lcom/google/android/gms/internal/zzafc;Lcom/google/android/gms/internal/zzagk;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc$22;->d:Lcom/google/android/gms/internal/zzafc;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzafc;->zzj(Lcom/google/android/gms/internal/zzafc;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc$22;->c:Lcom/google/android/gms/internal/zzafc;

    invoke-static {v0, v7}, Lcom/google/android/gms/internal/zzafc;->zza(Lcom/google/android/gms/internal/zzafc;Ljava/util/List;)V

    :goto_1
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_5

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafc$22;->d:Lcom/google/android/gms/internal/zzafc;

    invoke-interface {v8, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zzafc;->postEvent(Ljava/lang/Runnable;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/google/firebase/database/DatabaseError;->getCode()I

    move-result v0

    const/4 v2, -0x1

    if-ne v0, v2, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc$22;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzafc$a;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzafc$a;->d(Lcom/google/android/gms/internal/zzafc$a;)Lcom/google/android/gms/internal/zzafc$b;

    move-result-object v2

    sget-object v3, Lcom/google/android/gms/internal/zzafc$b;->e:Lcom/google/android/gms/internal/zzafc$b;

    if-ne v2, v3, :cond_2

    sget-object v2, Lcom/google/android/gms/internal/zzafc$b;->f:Lcom/google/android/gms/internal/zzafc$b;

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/zzafc$a;->a(Lcom/google/android/gms/internal/zzafc$a;Lcom/google/android/gms/internal/zzafc$b;)Lcom/google/android/gms/internal/zzafc$b;

    goto :goto_2

    :cond_2
    sget-object v2, Lcom/google/android/gms/internal/zzafc$b;->b:Lcom/google/android/gms/internal/zzafc$b;

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/zzafc$a;->a(Lcom/google/android/gms/internal/zzafc$a;Lcom/google/android/gms/internal/zzafc$b;)Lcom/google/android/gms/internal/zzafc$b;

    goto :goto_2

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc$22;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzafc$a;

    sget-object v3, Lcom/google/android/gms/internal/zzafc$b;->f:Lcom/google/android/gms/internal/zzafc$b;

    invoke-static {v0, v3}, Lcom/google/android/gms/internal/zzafc$a;->a(Lcom/google/android/gms/internal/zzafc$a;Lcom/google/android/gms/internal/zzafc$b;)Lcom/google/android/gms/internal/zzafc$b;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/zzafc$a;->a(Lcom/google/android/gms/internal/zzafc$a;Lcom/google/firebase/database/DatabaseError;)Lcom/google/firebase/database/DatabaseError;

    goto :goto_3

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc$22;->d:Lcom/google/android/gms/internal/zzafc;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafc$22;->a:Lcom/google/android/gms/internal/zzafa;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/zzafc;->zzb(Lcom/google/android/gms/internal/zzafc;Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzafa;

    :cond_5
    return-void
.end method
