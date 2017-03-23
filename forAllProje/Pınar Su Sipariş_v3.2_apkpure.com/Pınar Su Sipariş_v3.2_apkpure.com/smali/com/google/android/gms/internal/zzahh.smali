.class public Lcom/google/android/gms/internal/zzahh;
.super Lcom/google/android/gms/internal/zzahr;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/zzahr",
        "<",
        "Lcom/google/android/gms/internal/zzahh;",
        ">;"
    }
.end annotation


# instance fields
.field private final value:Z


# direct methods
.method public constructor <init>(Ljava/lang/Boolean;Lcom/google/android/gms/internal/zzahu;)V
    .locals 1

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/zzahr;-><init>(Lcom/google/android/gms/internal/zzahu;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzahh;->value:Z

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    instance-of v1, p1, Lcom/google/android/gms/internal/zzahh;

    if-nez v1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    check-cast p1, Lcom/google/android/gms/internal/zzahh;

    iget-boolean v1, p0, Lcom/google/android/gms/internal/zzahh;->value:Z

    iget-boolean v2, p1, Lcom/google/android/gms/internal/zzahh;->value:Z

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzahh;->zzbQE:Lcom/google/android/gms/internal/zzahu;

    iget-object v2, p1, Lcom/google/android/gms/internal/zzahh;->zzbQE:Lcom/google/android/gms/internal/zzahu;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public getValue()Ljava/lang/Object;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzahh;->value:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzahh;->value:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/zzahh;->zzbQE:Lcom/google/android/gms/internal/zzahu;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected zzTg()Lcom/google/android/gms/internal/zzahr$zza;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/zzahr$zza;->zzbRc:Lcom/google/android/gms/internal/zzahr$zza;

    return-object v0
.end method

.method protected zza(Lcom/google/android/gms/internal/zzahh;)I
    .locals 2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzahh;->value:Z

    iget-boolean v1, p1, Lcom/google/android/gms/internal/zzahh;->value:Z

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzahh;->value:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, -0x1

    goto :goto_0
.end method

.method protected bridge synthetic zza(Lcom/google/android/gms/internal/zzahr;)I
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/zzahh;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzahh;->zza(Lcom/google/android/gms/internal/zzahh;)I

    move-result v0

    return v0
.end method

.method public zza(Lcom/google/android/gms/internal/zzahu$zza;)Ljava/lang/String;
    .locals 4

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzahh;->zzb(Lcom/google/android/gms/internal/zzahu$zza;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-boolean v1, p0, Lcom/google/android/gms/internal/zzahh;->value:Z

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0xd

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "boolean:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public zze(Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahh;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/zzahh;

    iget-boolean v1, p0, Lcom/google/android/gms/internal/zzahh;->value:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lcom/google/android/gms/internal/zzahh;-><init>(Ljava/lang/Boolean;Lcom/google/android/gms/internal/zzahu;)V

    return-object v0
.end method

.method public synthetic zzf(Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzahh;->zze(Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahh;

    move-result-object v0

    return-object v0
.end method
