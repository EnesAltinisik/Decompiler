.class public final Lcom/google/android/gms/games/internal/GamesLog;
.super Ljava/lang/Object;


# static fields
.field private static final zzaMD:Lcom/google/android/gms/common/internal/zzp;

.field private static final zzaME:Lcom/google/android/gms/internal/zzpg;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzpg",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/common/internal/zzp;

    const-string v1, "Games"

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/internal/zzp;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/games/internal/GamesLog;->zzaMD:Lcom/google/android/gms/common/internal/zzp;

    const-string v0, "games.play_games_dogfood"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/zzpg;->zzl(Ljava/lang/String;Z)Lcom/google/android/gms/internal/zzpg;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/games/internal/GamesLog;->zzaME:Lcom/google/android/gms/internal/zzpg;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static zzD(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/games/internal/GamesLog;->zzaMD:Lcom/google/android/gms/common/internal/zzp;

    invoke-virtual {v0, p0, p1}, Lcom/google/android/gms/common/internal/zzp;->zzD(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static zzE(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/games/internal/GamesLog;->zzaMD:Lcom/google/android/gms/common/internal/zzp;

    invoke-virtual {v0, p0, p1}, Lcom/google/android/gms/common/internal/zzp;->zzE(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static zza(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/games/internal/GamesLog;->zzaMD:Lcom/google/android/gms/common/internal/zzp;

    invoke-virtual {v0, p0, p1, p2}, Lcom/google/android/gms/common/internal/zzp;->zza(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static zzb(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/games/internal/GamesLog;->zzaMD:Lcom/google/android/gms/common/internal/zzp;

    invoke-virtual {v0, p0, p1, p2}, Lcom/google/android/gms/common/internal/zzp;->zzb(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
