.class public Lcom/google/android/gms/internal/zzahy;
.super Ljava/lang/Object;


# direct methods
.method public static zzTM()Lcom/google/android/gms/internal/zzahu;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/zzahn;->zzTA()Lcom/google/android/gms/internal/zzahn;

    move-result-object v0

    return-object v0
.end method

.method public static zzar(Ljava/lang/Object;)Lcom/google/android/gms/internal/zzahu;
    .locals 4

    invoke-static {p0}, Lcom/google/android/gms/internal/zzahv;->zzaq(Ljava/lang/Object;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    instance-of v1, v0, Lcom/google/android/gms/internal/zzahs;

    if-eqz v1, :cond_0

    new-instance v1, Lcom/google/android/gms/internal/zzahm;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzahu;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    long-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/zzahy;->zzTM()Lcom/google/android/gms/internal/zzahu;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Lcom/google/android/gms/internal/zzahm;-><init>(Ljava/lang/Double;Lcom/google/android/gms/internal/zzahu;)V

    move-object v0, v1

    :cond_0
    invoke-static {v0}, Lcom/google/android/gms/internal/zzahy;->zzp(Lcom/google/android/gms/internal/zzahu;)Z

    move-result v1

    if-nez v1, :cond_1

    new-instance v0, Lcom/google/firebase/database/DatabaseException;

    const-string v1, "Invalid Firebase Database priority (must be a string, double, ServerValue, or null)"

    invoke-direct {v0, v1}, Lcom/google/firebase/database/DatabaseException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return-object v0
.end method

.method public static zzp(Lcom/google/android/gms/internal/zzahu;)Z
    .locals 1

    invoke-interface {p0}, Lcom/google/android/gms/internal/zzahu;->zzTp()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzahu;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Lcom/google/android/gms/internal/zzahu;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    instance-of v0, p0, Lcom/google/android/gms/internal/zzahm;

    if-nez v0, :cond_0

    instance-of v0, p0, Lcom/google/android/gms/internal/zzaia;

    if-nez v0, :cond_0

    instance-of v0, p0, Lcom/google/android/gms/internal/zzahl;

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
