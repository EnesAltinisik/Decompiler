.class public final Lcom/google/android/gms/internal/zzun;
.super Ljava/lang/Object;


# static fields
.field static zzbpK:I

.field static zzbsM:Lcom/google/android/gms/internal/zzuo;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/zzua;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzua;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/zzun;->zzbsM:Lcom/google/android/gms/internal/zzuo;

    return-void
.end method

.method public static e(Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/zzun;->zzbsM:Lcom/google/android/gms/internal/zzuo;

    invoke-interface {v0, p0}, Lcom/google/android/gms/internal/zzuo;->e(Ljava/lang/String;)V

    return-void
.end method

.method public static getLogLevel()I
    .locals 1

    sget v0, Lcom/google/android/gms/internal/zzun;->zzbpK:I

    return v0
.end method

.method public static setLogLevel(I)V
    .locals 1

    sput p0, Lcom/google/android/gms/internal/zzun;->zzbpK:I

    sget-object v0, Lcom/google/android/gms/internal/zzun;->zzbsM:Lcom/google/android/gms/internal/zzuo;

    invoke-interface {v0, p0}, Lcom/google/android/gms/internal/zzuo;->setLogLevel(I)V

    return-void
.end method

.method public static v(Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/zzun;->zzbsM:Lcom/google/android/gms/internal/zzuo;

    invoke-interface {v0, p0}, Lcom/google/android/gms/internal/zzuo;->v(Ljava/lang/String;)V

    return-void
.end method

.method public static zzLc()V
    .locals 1

    const/4 v0, 0x5

    invoke-static {v0}, Lcom/google/android/gms/internal/zzun;->setLogLevel(I)V

    return-void
.end method

.method public static zzLd()V
    .locals 1

    const/4 v0, 0x2

    invoke-static {v0}, Lcom/google/android/gms/internal/zzun;->setLogLevel(I)V

    return-void
.end method

.method public static zzaV(Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/zzun;->zzbsM:Lcom/google/android/gms/internal/zzuo;

    invoke-interface {v0, p0}, Lcom/google/android/gms/internal/zzuo;->zzaV(Ljava/lang/String;)V

    return-void
.end method

.method public static zzaW(Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/zzun;->zzbsM:Lcom/google/android/gms/internal/zzuo;

    invoke-interface {v0, p0}, Lcom/google/android/gms/internal/zzuo;->zzaW(Ljava/lang/String;)V

    return-void
.end method

.method public static zzb(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/zzun;->zzbsM:Lcom/google/android/gms/internal/zzuo;

    invoke-interface {v0, p0, p1}, Lcom/google/android/gms/internal/zzuo;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static zzd(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/zzun;->zzbsM:Lcom/google/android/gms/internal/zzuo;

    invoke-interface {v0, p0, p1}, Lcom/google/android/gms/internal/zzuo;->zzd(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
