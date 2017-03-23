.class Lcom/fodlam/yds/WordLearningActivity$4;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/afollestad/materialdialogs/f$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fodlam/yds/WordLearningActivity;->l()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fodlam/yds/f/h;

.field final synthetic b:Lcom/fodlam/yds/WordLearningActivity;


# direct methods
.method constructor <init>(Lcom/fodlam/yds/WordLearningActivity;Lcom/fodlam/yds/f/h;)V
    .locals 0

    iput-object p1, p0, Lcom/fodlam/yds/WordLearningActivity$4;->b:Lcom/fodlam/yds/WordLearningActivity;

    iput-object p2, p0, Lcom/fodlam/yds/WordLearningActivity$4;->a:Lcom/fodlam/yds/f/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/afollestad/materialdialogs/f;[Ljava/lang/Integer;[Ljava/lang/CharSequence;)Z
    .locals 5

    const/4 v4, 0x1

    if-eqz p2, :cond_1

    array-length v0, p2

    if-lez v0, :cond_1

    iget-object v0, p0, Lcom/fodlam/yds/WordLearningActivity$4;->a:Lcom/fodlam/yds/f/h;

    iget-object v0, v0, Lcom/fodlam/yds/f/h;->l:Lcom/fodlam/yds/f/e;

    invoke-virtual {v0}, Lcom/fodlam/yds/f/e;->c()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lcom/fodlam/yds/f/e;->d()V

    const/4 v1, 0x0

    invoke-static {v1}, Lcom/fodlam/yds/c/a;->a(Landroid/content/Context;)Lcom/fodlam/yds/c/a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/fodlam/yds/c/a;->a(Lcom/fodlam/yds/f/e;)I

    new-instance v1, Lcom/fodlam/yds/f/a;

    invoke-direct {v1}, Lcom/fodlam/yds/f/a;-><init>()V

    array-length v2, p2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_0

    aget-object v3, p2, v0

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    packed-switch v3, :pswitch_data_0

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :pswitch_0
    invoke-virtual {v1, v4}, Lcom/fodlam/yds/f/a;->a(Z)V

    goto :goto_1

    :pswitch_1
    invoke-virtual {v1, v4}, Lcom/fodlam/yds/f/a;->b(Z)V

    goto :goto_1

    :pswitch_2
    invoke-virtual {v1, v4}, Lcom/fodlam/yds/f/a;->c(Z)V

    goto :goto_1

    :pswitch_3
    invoke-virtual {v1, v4}, Lcom/fodlam/yds/f/a;->d(Z)V

    goto :goto_1

    :pswitch_4
    invoke-virtual {v1, v4}, Lcom/fodlam/yds/f/a;->e(Z)V

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/fodlam/yds/WordLearningActivity$4;->b:Lcom/fodlam/yds/WordLearningActivity;

    invoke-static {v0}, Lcom/fodlam/yds/WordLearningActivity;->c(Lcom/fodlam/yds/WordLearningActivity;)Lcom/google/firebase/database/d;

    move-result-object v0

    sget-object v2, Lcom/fodlam/yds/OxfordApplication;->c:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/google/firebase/database/d;->a(Ljava/lang/String;)Lcom/google/firebase/database/d;

    move-result-object v0

    const-string v2, "alert"

    invoke-virtual {v0, v2}, Lcom/google/firebase/database/d;->a(Ljava/lang/String;)Lcom/google/firebase/database/d;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/fodlam/yds/WordLearningActivity$4;->a:Lcom/fodlam/yds/f/h;

    iget v3, v3, Lcom/fodlam/yds/f/h;->c:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/firebase/database/d;->a(Ljava/lang/String;)Lcom/google/firebase/database/d;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/google/firebase/database/d;->a(Ljava/lang/Object;)Lcom/google/android/gms/c/d;

    :cond_1
    invoke-virtual {p1}, Lcom/afollestad/materialdialogs/f;->dismiss()V

    return v4

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method
