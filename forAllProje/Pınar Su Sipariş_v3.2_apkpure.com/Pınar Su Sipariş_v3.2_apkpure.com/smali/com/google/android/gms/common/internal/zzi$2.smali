.class final Lcom/google/android/gms/common/internal/zzi$2;
.super Lcom/google/android/gms/common/internal/zzi;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/common/internal/zzi;->zza(Landroid/support/v4/app/Fragment;Landroid/content/Intent;I)Lcom/google/android/gms/common/internal/zzi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/support/v4/app/Fragment;

.field final synthetic b:Landroid/content/Intent;

.field final synthetic c:I


# direct methods
.method constructor <init>(Landroid/support/v4/app/Fragment;Landroid/content/Intent;I)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/common/internal/zzi$2;->a:Landroid/support/v4/app/Fragment;

    iput-object p2, p0, Lcom/google/android/gms/common/internal/zzi$2;->b:Landroid/content/Intent;

    iput p3, p0, Lcom/google/android/gms/common/internal/zzi$2;->c:I

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/zzi;-><init>()V

    return-void
.end method


# virtual methods
.method public zztD()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/common/internal/zzi$2;->a:Landroid/support/v4/app/Fragment;

    iget-object v1, p0, Lcom/google/android/gms/common/internal/zzi$2;->b:Landroid/content/Intent;

    iget v2, p0, Lcom/google/android/gms/common/internal/zzi$2;->c:I

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method
