.class public Lcom/google/android/gms/b/pf;
.super Lcom/google/android/gms/b/nx;


# annotations
.annotation runtime Lcom/google/android/gms/b/vz;
.end annotation


# direct methods
.method public constructor <init>(Lcom/google/android/gms/b/nx;)V
    .locals 12

    iget v1, p1, Lcom/google/android/gms/b/nx;->a:I

    iget-object v2, p1, Lcom/google/android/gms/b/nx;->b:Ljava/lang/String;

    iget v3, p1, Lcom/google/android/gms/b/nx;->c:I

    iget v4, p1, Lcom/google/android/gms/b/nx;->d:I

    iget-boolean v5, p1, Lcom/google/android/gms/b/nx;->e:Z

    iget v6, p1, Lcom/google/android/gms/b/nx;->f:I

    iget v7, p1, Lcom/google/android/gms/b/nx;->g:I

    iget-object v8, p1, Lcom/google/android/gms/b/nx;->h:[Lcom/google/android/gms/b/nx;

    iget-boolean v9, p1, Lcom/google/android/gms/b/nx;->i:Z

    iget-boolean v10, p1, Lcom/google/android/gms/b/nx;->j:Z

    iget-boolean v11, p1, Lcom/google/android/gms/b/nx;->k:Z

    move-object v0, p0

    invoke-direct/range {v0 .. v11}, Lcom/google/android/gms/b/nx;-><init>(ILjava/lang/String;IIZII[Lcom/google/android/gms/b/nx;ZZZ)V

    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/c;->a(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x1

    iget v2, p0, Lcom/google/android/gms/b/pf;->a:I

    invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/c;->a(Landroid/os/Parcel;II)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/google/android/gms/b/pf;->b:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/c;->a(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v1, 0x3

    iget v2, p0, Lcom/google/android/gms/b/pf;->c:I

    invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/c;->a(Landroid/os/Parcel;II)V

    const/4 v1, 0x6

    iget v2, p0, Lcom/google/android/gms/b/pf;->f:I

    invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/c;->a(Landroid/os/Parcel;II)V

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/c;->a(Landroid/os/Parcel;I)V

    return-void
.end method
