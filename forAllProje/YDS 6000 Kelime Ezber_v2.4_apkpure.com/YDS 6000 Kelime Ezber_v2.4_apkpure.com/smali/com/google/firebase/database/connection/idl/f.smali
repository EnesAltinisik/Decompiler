.class Lcom/google/firebase/database/connection/idl/f;
.super Lcom/google/android/gms/common/internal/safeparcel/a;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/firebase/database/connection/idl/f;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final a:I

.field final b:Ljava/lang/String;

.field final c:Ljava/lang/String;

.field final d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/firebase/database/connection/idl/g;

    invoke-direct {v0}, Lcom/google/firebase/database/connection/idl/g;-><init>()V

    sput-object v0, Lcom/google/firebase/database/connection/idl/f;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/a;-><init>()V

    iput p1, p0, Lcom/google/firebase/database/connection/idl/f;->a:I

    iput-object p2, p0, Lcom/google/firebase/database/connection/idl/f;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/firebase/database/connection/idl/f;->c:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/google/firebase/database/connection/idl/f;->d:Z

    return-void
.end method

.method public static a(Lcom/google/firebase/database/connection/idl/f;)Lcom/google/android/gms/b/gd;
    .locals 4

    new-instance v0, Lcom/google/android/gms/b/gd;

    iget-object v1, p0, Lcom/google/firebase/database/connection/idl/f;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/firebase/database/connection/idl/f;->c:Ljava/lang/String;

    iget-boolean v3, p0, Lcom/google/firebase/database/connection/idl/f;->d:Z

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/b/gd;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v0
.end method

.method public static a(Lcom/google/android/gms/b/gd;)Lcom/google/firebase/database/connection/idl/f;
    .locals 5

    new-instance v0, Lcom/google/firebase/database/connection/idl/f;

    const/4 v1, 0x1

    invoke-virtual {p0}, Lcom/google/android/gms/b/gd;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/google/android/gms/b/gd;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/google/android/gms/b/gd;->c()Z

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/firebase/database/connection/idl/f;-><init>(ILjava/lang/String;Ljava/lang/String;Z)V

    return-object v0
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/firebase/database/connection/idl/g;->a(Lcom/google/firebase/database/connection/idl/f;Landroid/os/Parcel;I)V

    return-void
.end method
