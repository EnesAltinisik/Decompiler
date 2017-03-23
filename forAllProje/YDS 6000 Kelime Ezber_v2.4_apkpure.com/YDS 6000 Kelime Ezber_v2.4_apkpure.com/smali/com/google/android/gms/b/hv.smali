.class public Lcom/google/android/gms/b/hv;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/b/hv$a;
    }
.end annotation


# static fields
.field public static final a:Lcom/google/android/gms/b/hv;

.field public static final b:Lcom/google/android/gms/b/hv;

.field static final synthetic c:Z


# instance fields
.field private final d:Lcom/google/android/gms/b/hv$a;

.field private final e:Lcom/google/android/gms/b/is;

.field private final f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v3, 0x0

    const/4 v1, 0x0

    const-class v0, Lcom/google/android/gms/b/hv;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/google/android/gms/b/hv;->c:Z

    new-instance v0, Lcom/google/android/gms/b/hv;

    sget-object v2, Lcom/google/android/gms/b/hv$a;->a:Lcom/google/android/gms/b/hv$a;

    invoke-direct {v0, v2, v3, v1}, Lcom/google/android/gms/b/hv;-><init>(Lcom/google/android/gms/b/hv$a;Lcom/google/android/gms/b/is;Z)V

    sput-object v0, Lcom/google/android/gms/b/hv;->a:Lcom/google/android/gms/b/hv;

    new-instance v0, Lcom/google/android/gms/b/hv;

    sget-object v2, Lcom/google/android/gms/b/hv$a;->b:Lcom/google/android/gms/b/hv$a;

    invoke-direct {v0, v2, v3, v1}, Lcom/google/android/gms/b/hv;-><init>(Lcom/google/android/gms/b/hv$a;Lcom/google/android/gms/b/is;Z)V

    sput-object v0, Lcom/google/android/gms/b/hv;->b:Lcom/google/android/gms/b/hv;

    return-void

    :cond_0
    move v0, v1

    goto :goto_0
.end method

.method public constructor <init>(Lcom/google/android/gms/b/hv$a;Lcom/google/android/gms/b/is;Z)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/b/hv;->d:Lcom/google/android/gms/b/hv$a;

    iput-object p2, p0, Lcom/google/android/gms/b/hv;->e:Lcom/google/android/gms/b/is;

    iput-boolean p3, p0, Lcom/google/android/gms/b/hv;->f:Z

    sget-boolean v0, Lcom/google/android/gms/b/hv;->c:Z

    if-nez v0, :cond_0

    if-eqz p3, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/b/hv;->b()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_0
    return-void
.end method

.method public static a(Lcom/google/android/gms/b/is;)Lcom/google/android/gms/b/hv;
    .locals 3

    new-instance v0, Lcom/google/android/gms/b/hv;

    sget-object v1, Lcom/google/android/gms/b/hv$a;->b:Lcom/google/android/gms/b/hv$a;

    const/4 v2, 0x1

    invoke-direct {v0, v1, p0, v2}, Lcom/google/android/gms/b/hv;-><init>(Lcom/google/android/gms/b/hv$a;Lcom/google/android/gms/b/is;Z)V

    return-object v0
.end method


# virtual methods
.method public a()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/b/hv;->d:Lcom/google/android/gms/b/hv$a;

    sget-object v1, Lcom/google/android/gms/b/hv$a;->a:Lcom/google/android/gms/b/hv$a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/b/hv;->d:Lcom/google/android/gms/b/hv$a;

    sget-object v1, Lcom/google/android/gms/b/hv$a;->b:Lcom/google/android/gms/b/hv$a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/b/hv;->f:Z

    return v0
.end method

.method public d()Lcom/google/android/gms/b/is;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/hv;->e:Lcom/google/android/gms/b/is;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/b/hv;->d:Lcom/google/android/gms/b/hv$a;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/hv;->e:Lcom/google/android/gms/b/is;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iget-boolean v2, p0, Lcom/google/android/gms/b/hv;->f:Z

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x34

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v4, v5

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "OperationSource{source="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ", queryParams="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", tagged="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
