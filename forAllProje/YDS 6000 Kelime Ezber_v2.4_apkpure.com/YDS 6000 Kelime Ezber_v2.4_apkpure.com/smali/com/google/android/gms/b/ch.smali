.class public final Lcom/google/android/gms/b/ch;
.super Lcom/google/android/gms/common/internal/safeparcel/a;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/b/ch;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:I

.field public final b:Ljava/lang/String;

.field public final c:Lcom/google/android/gms/b/ce;

.field public final d:Ljava/lang/String;

.field public final e:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/b/ci;

    invoke-direct {v0}, Lcom/google/android/gms/b/ci;-><init>()V

    sput-object v0, Lcom/google/android/gms/b/ch;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILjava/lang/String;Lcom/google/android/gms/b/ce;Ljava/lang/String;J)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/a;-><init>()V

    iput p1, p0, Lcom/google/android/gms/b/ch;->a:I

    iput-object p2, p0, Lcom/google/android/gms/b/ch;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/b/ch;->c:Lcom/google/android/gms/b/ce;

    iput-object p4, p0, Lcom/google/android/gms/b/ch;->d:Ljava/lang/String;

    iput-wide p5, p0, Lcom/google/android/gms/b/ch;->e:J

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/google/android/gms/b/ce;Ljava/lang/String;J)V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/a;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/b/ch;->a:I

    iput-object p1, p0, Lcom/google/android/gms/b/ch;->b:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/b/ch;->c:Lcom/google/android/gms/b/ce;

    iput-object p3, p0, Lcom/google/android/gms/b/ch;->d:Ljava/lang/String;

    iput-wide p4, p0, Lcom/google/android/gms/b/ch;->e:J

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/b/ch;->d:Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/gms/b/ch;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/b/ch;->c:Lcom/google/android/gms/b/ce;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x15

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

    const-string v4, "origin="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ",name="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",params="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/b/ci;->a(Lcom/google/android/gms/b/ch;Landroid/os/Parcel;I)V

    return-void
.end method
