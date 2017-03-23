.class Lcom/google/android/gms/internal/zzaaq$a;
.super Lcom/google/android/gms/internal/zzaap;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/zzaaq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/zzaaq;

.field private final b:Lcom/google/android/gms/internal/zzaaq$zza;

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final d:I


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzaaq;ILcom/google/android/gms/internal/zzaat;Lcom/google/android/gms/internal/zzaar;Ljava/util/List;ILcom/google/android/gms/internal/zzaaq$zza;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/google/android/gms/internal/zzaat;",
            "Lcom/google/android/gms/internal/zzaar;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Integer;",
            ">;I",
            "Lcom/google/android/gms/internal/zzaaq$zza;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/internal/zzaaq$a;->a:Lcom/google/android/gms/internal/zzaaq;

    invoke-direct {p0, p2, p3, p4}, Lcom/google/android/gms/internal/zzaap;-><init>(ILcom/google/android/gms/internal/zzaat;Lcom/google/android/gms/internal/zzaar;)V

    iput-object p7, p0, Lcom/google/android/gms/internal/zzaaq$a;->b:Lcom/google/android/gms/internal/zzaaq$zza;

    iput-object p5, p0, Lcom/google/android/gms/internal/zzaaq$a;->c:Ljava/util/List;

    iput p6, p0, Lcom/google/android/gms/internal/zzaaq$a;->d:I

    return-void
.end method


# virtual methods
.method protected zza(Lcom/google/android/gms/internal/zzaau;)V
    .locals 5

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzaau;->getStatus()Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    sget-object v3, Lcom/google/android/gms/common/api/Status;->zzalw:Lcom/google/android/gms/common/api/Status;

    if-ne v0, v3, :cond_7

    const-string v3, "Container resource successfully loaded from "

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzaau;->zzLQ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/internal/zzun;->v(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzaau;->getSource()I

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzaau;->zzLO()Lcom/google/android/gms/internal/zzaau$zza;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaau$zza;->zzLS()Lcom/google/android/gms/internal/zzaam;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/zzaam;->zzLJ()Z

    move-result v3

    if-eqz v3, :cond_1

    move v0, v1

    :goto_1
    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaaq$a;->b:Lcom/google/android/gms/internal/zzaaq$zza;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/zzaaq$zza;->zza(Lcom/google/android/gms/internal/zzaau;)V

    :goto_2
    return-void

    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v3}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-object v3, p0, Lcom/google/android/gms/internal/zzaaq$a;->a:Lcom/google/android/gms/internal/zzaaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzaau;->getStatus()Lcom/google/android/gms/common/api/Status;

    move-result-object v4

    invoke-virtual {v3, v4, v0}, Lcom/google/android/gms/internal/zzaaq;->zza(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/internal/zzaau$zza;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaau$zza;->zzLR()[B

    move-result-object v3

    if-eqz v3, :cond_7

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaau$zza;->zzLR()[B

    move-result-object v3

    array-length v3, v3

    if-lez v3, :cond_7

    iget-object v2, p0, Lcom/google/android/gms/internal/zzaaq$a;->a:Lcom/google/android/gms/internal/zzaaq;

    invoke-static {v2}, Lcom/google/android/gms/internal/zzaaq;->zza(Lcom/google/android/gms/internal/zzaaq;)Lcom/google/android/gms/internal/zzaav;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaau$zza;->zzLS()Lcom/google/android/gms/internal/zzaam;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/zzaam;->zzLI()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaau$zza;->zzLR()[B

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Lcom/google/android/gms/internal/zzaav;->zzg(Ljava/lang/String;[B)V

    move v0, v1

    goto :goto_1

    :cond_2
    move v0, v1

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzaau;->zzLQ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzaau;->getStatus()Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->isSuccess()Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v0, "SUCCESS"

    :goto_3
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x36

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Cannot fetch a valid resource from "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ". Response status: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/zzun;->v(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzaau;->getStatus()Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->isSuccess()Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v1, "Response source: "

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzaau;->zzLQ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_6

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_4
    invoke-static {v0}, Lcom/google/android/gms/internal/zzun;->v(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzaau;->zzLO()Lcom/google/android/gms/internal/zzaau$zza;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaau$zza;->zzLR()[B

    move-result-object v0

    array-length v0, v0

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x1a

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Response size: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/zzun;->v(Ljava/lang/String;)V

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/zzaaq$a;->a:Lcom/google/android/gms/internal/zzaaq;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaaq$a;->zzbuM:Lcom/google/android/gms/internal/zzaat;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzaaq$a;->c:Ljava/util/List;

    iget v3, p0, Lcom/google/android/gms/internal/zzaaq$a;->d:I

    add-int/lit8 v3, v3, 0x1

    iget-object v4, p0, Lcom/google/android/gms/internal/zzaaq$a;->b:Lcom/google/android/gms/internal/zzaaq$zza;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/google/android/gms/internal/zzaaq;->zza(Lcom/google/android/gms/internal/zzaat;Ljava/util/List;ILcom/google/android/gms/internal/zzaaq$zza;)V

    goto/16 :goto_2

    :cond_5
    const-string v0, "FAILURE"

    goto/16 :goto_3

    :cond_6
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_4

    :cond_7
    move v0, v2

    goto/16 :goto_1
.end method
