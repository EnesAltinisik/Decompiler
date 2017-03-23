.class public final Lcom/google/android/gms/internal/zzabl;
.super Lcom/google/android/gms/internal/zzabh;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/zzabh",
        "<",
        "Lcom/google/android/gms/internal/zzabh",
        "<*>;>;"
    }
.end annotation


# static fields
.field public static final zzbvK:Lcom/google/android/gms/internal/zzabl;

.field public static final zzbvL:Lcom/google/android/gms/internal/zzabl;

.field public static final zzbvM:Lcom/google/android/gms/internal/zzabl;

.field public static final zzbvN:Lcom/google/android/gms/internal/zzabl;


# instance fields
.field private final mName:Ljava/lang/String;

.field private final zzbvO:Z

.field private final zzbvP:Lcom/google/android/gms/internal/zzabh;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzabh",
            "<*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/zzabl;

    const-string v1, "BREAK"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/zzabl;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/zzabl;->zzbvK:Lcom/google/android/gms/internal/zzabl;

    new-instance v0, Lcom/google/android/gms/internal/zzabl;

    const-string v1, "CONTINUE"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/zzabl;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/zzabl;->zzbvL:Lcom/google/android/gms/internal/zzabl;

    new-instance v0, Lcom/google/android/gms/internal/zzabl;

    const-string v1, "NULL"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/zzabl;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/zzabl;->zzbvM:Lcom/google/android/gms/internal/zzabl;

    new-instance v0, Lcom/google/android/gms/internal/zzabl;

    const-string v1, "UNDEFINED"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/zzabl;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/zzabl;->zzbvN:Lcom/google/android/gms/internal/zzabl;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/zzabh;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzabh",
            "<*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzabh;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/zzaa;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "RETURN"

    iput-object v0, p0, Lcom/google/android/gms/internal/zzabl;->mName:Ljava/lang/String;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzabl;->zzbvO:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/zzabl;->zzbvP:Lcom/google/android/gms/internal/zzabh;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzabh;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzabl;->mName:Ljava/lang/String;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzabl;->zzbvO:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzabl;->zzbvP:Lcom/google/android/gms/internal/zzabh;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzabl;->mName:Ljava/lang/String;

    return-object v0
.end method

.method public synthetic zzMk()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzabl;->zzMq()Lcom/google/android/gms/internal/zzabh;

    move-result-object v0

    return-object v0
.end method

.method public zzMq()Lcom/google/android/gms/internal/zzabh;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzabl;->zzbvP:Lcom/google/android/gms/internal/zzabh;

    return-object v0
.end method

.method public zzMr()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzabl;->zzbvO:Z

    return v0
.end method
