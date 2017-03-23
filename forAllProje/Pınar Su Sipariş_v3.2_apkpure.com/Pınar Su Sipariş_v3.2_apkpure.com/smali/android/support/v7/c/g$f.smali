.class public final Landroid/support/v7/c/g$f;
.super Ljava/lang/Object;
.source "MediaRouter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/c/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation


# instance fields
.field private final a:Landroid/support/v7/c/g$e;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Z

.field private g:Z

.field private h:Z

.field private final i:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/content/IntentFilter;",
            ">;"
        }
    .end annotation
.end field

.field private j:I

.field private k:I

.field private l:I

.field private m:I

.field private n:I

.field private o:Landroid/view/Display;

.field private p:I

.field private q:Landroid/os/Bundle;

.field private r:Landroid/content/IntentSender;

.field private s:Landroid/support/v7/c/a;


# direct methods
.method constructor <init>(Landroid/support/v7/c/g$e;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 835
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 774
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v7/c/g$f;->i:Ljava/util/ArrayList;

    .line 781
    const/4 v0, -0x1

    iput v0, p0, Landroid/support/v7/c/g$f;->p:I

    .line 836
    iput-object p1, p0, Landroid/support/v7/c/g$f;->a:Landroid/support/v7/c/g$e;

    .line 837
    iput-object p2, p0, Landroid/support/v7/c/g$f;->b:Ljava/lang/String;

    .line 838
    iput-object p3, p0, Landroid/support/v7/c/g$f;->c:Ljava/lang/String;

    .line 839
    return-void
.end method

.method static synthetic a(Landroid/support/v7/c/g$f;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 765
    iget-object v0, p0, Landroid/support/v7/c/g$f;->b:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic b(Landroid/support/v7/c/g$f;)Z
    .locals 1

    .prologue
    .line 765
    iget-boolean v0, p0, Landroid/support/v7/c/g$f;->f:Z

    return v0
.end method

.method static synthetic c(Landroid/support/v7/c/g$f;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 765
    iget-object v0, p0, Landroid/support/v7/c/g$f;->c:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic d(Landroid/support/v7/c/g$f;)Landroid/support/v7/c/a;
    .locals 1

    .prologue
    .line 765
    iget-object v0, p0, Landroid/support/v7/c/g$f;->s:Landroid/support/v7/c/a;

    return-object v0
.end method


# virtual methods
.method a(Landroid/support/v7/c/a;)I
    .locals 3

    .prologue
    .line 1272
    const/4 v0, 0x0

    .line 1273
    iget-object v1, p0, Landroid/support/v7/c/g$f;->s:Landroid/support/v7/c/a;

    if-eq v1, p1, :cond_d

    .line 1274
    iput-object p1, p0, Landroid/support/v7/c/g$f;->s:Landroid/support/v7/c/a;

    .line 1275
    if-eqz p1, :cond_d

    .line 1276
    iget-object v1, p0, Landroid/support/v7/c/g$f;->d:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/support/v7/c/a;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/support/v7/c/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 1277
    invoke-virtual {p1}, Landroid/support/v7/c/a;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/c/g$f;->d:Ljava/lang/String;

    .line 1278
    const/4 v0, 0x1

    .line 1280
    :cond_0
    iget-object v1, p0, Landroid/support/v7/c/g$f;->e:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/support/v7/c/a;->c()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/support/v7/c/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 1281
    invoke-virtual {p1}, Landroid/support/v7/c/a;->c()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Landroid/support/v7/c/g$f;->e:Ljava/lang/String;

    .line 1282
    or-int/lit8 v0, v0, 0x1

    .line 1284
    :cond_1
    iget-boolean v1, p0, Landroid/support/v7/c/g$f;->f:Z

    invoke-virtual {p1}, Landroid/support/v7/c/a;->d()Z

    move-result v2

    if-eq v1, v2, :cond_2

    .line 1285
    invoke-virtual {p1}, Landroid/support/v7/c/a;->d()Z

    move-result v1

    iput-boolean v1, p0, Landroid/support/v7/c/g$f;->f:Z

    .line 1286
    or-int/lit8 v0, v0, 0x1

    .line 1288
    :cond_2
    iget-boolean v1, p0, Landroid/support/v7/c/g$f;->g:Z

    invoke-virtual {p1}, Landroid/support/v7/c/a;->e()Z

    move-result v2

    if-eq v1, v2, :cond_3

    .line 1289
    invoke-virtual {p1}, Landroid/support/v7/c/a;->e()Z

    move-result v1

    iput-boolean v1, p0, Landroid/support/v7/c/g$f;->g:Z

    .line 1290
    or-int/lit8 v0, v0, 0x1

    .line 1292
    :cond_3
    iget-object v1, p0, Landroid/support/v7/c/g$f;->i:Ljava/util/ArrayList;

    invoke-virtual {p1}, Landroid/support/v7/c/a;->h()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 1293
    iget-object v1, p0, Landroid/support/v7/c/g$f;->i:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 1294
    iget-object v1, p0, Landroid/support/v7/c/g$f;->i:Ljava/util/ArrayList;

    invoke-virtual {p1}, Landroid/support/v7/c/a;->h()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 1295
    or-int/lit8 v0, v0, 0x1

    .line 1297
    :cond_4
    iget v1, p0, Landroid/support/v7/c/g$f;->j:I

    invoke-virtual {p1}, Landroid/support/v7/c/a;->i()I

    move-result v2

    if-eq v1, v2, :cond_5

    .line 1298
    invoke-virtual {p1}, Landroid/support/v7/c/a;->i()I

    move-result v1

    iput v1, p0, Landroid/support/v7/c/g$f;->j:I

    .line 1299
    or-int/lit8 v0, v0, 0x1

    .line 1301
    :cond_5
    iget v1, p0, Landroid/support/v7/c/g$f;->k:I

    invoke-virtual {p1}, Landroid/support/v7/c/a;->j()I

    move-result v2

    if-eq v1, v2, :cond_6

    .line 1302
    invoke-virtual {p1}, Landroid/support/v7/c/a;->j()I

    move-result v1

    iput v1, p0, Landroid/support/v7/c/g$f;->k:I

    .line 1303
    or-int/lit8 v0, v0, 0x1

    .line 1305
    :cond_6
    iget v1, p0, Landroid/support/v7/c/g$f;->l:I

    invoke-virtual {p1}, Landroid/support/v7/c/a;->m()I

    move-result v2

    if-eq v1, v2, :cond_7

    .line 1306
    invoke-virtual {p1}, Landroid/support/v7/c/a;->m()I

    move-result v1

    iput v1, p0, Landroid/support/v7/c/g$f;->l:I

    .line 1307
    or-int/lit8 v0, v0, 0x3

    .line 1309
    :cond_7
    iget v1, p0, Landroid/support/v7/c/g$f;->m:I

    invoke-virtual {p1}, Landroid/support/v7/c/a;->k()I

    move-result v2

    if-eq v1, v2, :cond_8

    .line 1310
    invoke-virtual {p1}, Landroid/support/v7/c/a;->k()I

    move-result v1

    iput v1, p0, Landroid/support/v7/c/g$f;->m:I

    .line 1311
    or-int/lit8 v0, v0, 0x3

    .line 1313
    :cond_8
    iget v1, p0, Landroid/support/v7/c/g$f;->n:I

    invoke-virtual {p1}, Landroid/support/v7/c/a;->l()I

    move-result v2

    if-eq v1, v2, :cond_9

    .line 1314
    invoke-virtual {p1}, Landroid/support/v7/c/a;->l()I

    move-result v1

    iput v1, p0, Landroid/support/v7/c/g$f;->n:I

    .line 1315
    or-int/lit8 v0, v0, 0x3

    .line 1317
    :cond_9
    iget v1, p0, Landroid/support/v7/c/g$f;->p:I

    invoke-virtual {p1}, Landroid/support/v7/c/a;->n()I

    move-result v2

    if-eq v1, v2, :cond_a

    .line 1318
    invoke-virtual {p1}, Landroid/support/v7/c/a;->n()I

    move-result v1

    iput v1, p0, Landroid/support/v7/c/g$f;->p:I

    .line 1319
    const/4 v1, 0x0

    iput-object v1, p0, Landroid/support/v7/c/g$f;->o:Landroid/view/Display;

    .line 1320
    or-int/lit8 v0, v0, 0x5

    .line 1322
    :cond_a
    iget-object v1, p0, Landroid/support/v7/c/g$f;->q:Landroid/os/Bundle;

    invoke-virtual {p1}, Landroid/support/v7/c/a;->o()Landroid/os/Bundle;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/support/v7/c/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    .line 1323
    invoke-virtual {p1}, Landroid/support/v7/c/a;->o()Landroid/os/Bundle;

    move-result-object v1

    iput-object v1, p0, Landroid/support/v7/c/g$f;->q:Landroid/os/Bundle;

    .line 1324
    or-int/lit8 v0, v0, 0x1

    .line 1326
    :cond_b
    iget-object v1, p0, Landroid/support/v7/c/g$f;->r:Landroid/content/IntentSender;

    invoke-virtual {p1}, Landroid/support/v7/c/a;->g()Landroid/content/IntentSender;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/support/v7/c/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    .line 1327
    invoke-virtual {p1}, Landroid/support/v7/c/a;->g()Landroid/content/IntentSender;

    move-result-object v1

    iput-object v1, p0, Landroid/support/v7/c/g$f;->r:Landroid/content/IntentSender;

    .line 1328
    or-int/lit8 v0, v0, 0x1

    .line 1330
    :cond_c
    iget-boolean v1, p0, Landroid/support/v7/c/g$f;->h:Z

    invoke-virtual {p1}, Landroid/support/v7/c/a;->f()Z

    move-result v2

    if-eq v1, v2, :cond_d

    .line 1331
    invoke-virtual {p1}, Landroid/support/v7/c/a;->f()Z

    move-result v1

    iput-boolean v1, p0, Landroid/support/v7/c/g$f;->h:Z

    .line 1332
    or-int/lit8 v0, v0, 0x5

    .line 1336
    :cond_d
    return v0
.end method

.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 874
    iget-object v0, p0, Landroid/support/v7/c/g$f;->d:Ljava/lang/String;

    return-object v0
.end method

.method public a(I)V
    .locals 3

    .prologue
    .line 1167
    invoke-static {}, Landroid/support/v7/c/g;->e()V

    .line 1168
    sget-object v0, Landroid/support/v7/c/g;->a:Landroid/support/v7/c/g$d;

    iget v1, p0, Landroid/support/v7/c/g$f;->n:I

    const/4 v2, 0x0

    invoke-static {v2, p1}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-virtual {v0, p0, v1}, Landroid/support/v7/c/g$d;->a(Landroid/support/v7/c/g$f;I)V

    .line 1169
    return-void
.end method

.method public a(Landroid/support/v7/c/f;)Z
    .locals 2

    .prologue
    .line 959
    if-nez p1, :cond_0

    .line 960
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "selector must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 962
    :cond_0
    invoke-static {}, Landroid/support/v7/c/g;->e()V

    .line 963
    iget-object v0, p0, Landroid/support/v7/c/g$f;->i:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Landroid/support/v7/c/f;->a(Ljava/util/List;)Z

    move-result v0

    return v0
.end method

.method public a(Ljava/lang/String;)Z
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 985
    if-nez p1, :cond_0

    .line 986
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "category must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 988
    :cond_0
    invoke-static {}, Landroid/support/v7/c/g;->e()V

    .line 990
    iget-object v0, p0, Landroid/support/v7/c/g$f;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    move v2, v1

    .line 991
    :goto_0
    if-ge v2, v3, :cond_2

    .line 992
    iget-object v0, p0, Landroid/support/v7/c/g$f;->i:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/IntentFilter;

    invoke-virtual {v0, p1}, Landroid/content/IntentFilter;->hasCategory(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 993
    const/4 v0, 0x1

    .line 996
    :goto_1
    return v0

    .line 991
    :cond_1
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    :cond_2
    move v0, v1

    .line 996
    goto :goto_1
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 888
    iget-object v0, p0, Landroid/support/v7/c/g$f;->e:Ljava/lang/String;

    return-object v0
.end method

.method public b(I)V
    .locals 1

    .prologue
    .line 1181
    invoke-static {}, Landroid/support/v7/c/g;->e()V

    .line 1182
    if-eqz p1, :cond_0

    .line 1183
    sget-object v0, Landroid/support/v7/c/g;->a:Landroid/support/v7/c/g$d;

    invoke-virtual {v0, p0, p1}, Landroid/support/v7/c/g$d;->b(Landroid/support/v7/c/g$f;I)V

    .line 1185
    :cond_0
    return-void
.end method

.method public c()Z
    .locals 1

    .prologue
    .line 897
    iget-boolean v0, p0, Landroid/support/v7/c/g$f;->f:Z

    return v0
.end method

.method public d()Z
    .locals 1

    .prologue
    .line 907
    iget-boolean v0, p0, Landroid/support/v7/c/g$f;->g:Z

    return v0
.end method

.method public e()Z
    .locals 1

    .prologue
    .line 918
    invoke-static {}, Landroid/support/v7/c/g;->e()V

    .line 919
    sget-object v0, Landroid/support/v7/c/g;->a:Landroid/support/v7/c/g$d;

    invoke-virtual {v0}, Landroid/support/v7/c/g$d;->d()Landroid/support/v7/c/g$f;

    move-result-object v0

    if-ne v0, p0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public f()Z
    .locals 1

    .prologue
    .line 930
    invoke-static {}, Landroid/support/v7/c/g;->e()V

    .line 931
    sget-object v0, Landroid/support/v7/c/g;->a:Landroid/support/v7/c/g$d;

    invoke-virtual {v0}, Landroid/support/v7/c/g$d;->c()Landroid/support/v7/c/g$f;

    move-result-object v0

    if-ne v0, p0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public g()I
    .locals 1

    .prologue
    .line 1103
    iget v0, p0, Landroid/support/v7/c/g$f;->j:I

    return v0
.end method

.method public h()I
    .locals 1

    .prologue
    .line 1112
    iget v0, p0, Landroid/support/v7/c/g$f;->k:I

    return v0
.end method

.method public i()I
    .locals 1

    .prologue
    .line 1123
    iget v0, p0, Landroid/support/v7/c/g$f;->l:I

    return v0
.end method

.method public j()I
    .locals 1

    .prologue
    .line 1133
    iget v0, p0, Landroid/support/v7/c/g$f;->m:I

    return v0
.end method

.method public k()I
    .locals 1

    .prologue
    .line 1143
    iget v0, p0, Landroid/support/v7/c/g$f;->n:I

    return v0
.end method

.method public l()Z
    .locals 1

    .prologue
    .line 1154
    iget-boolean v0, p0, Landroid/support/v7/c/g$f;->h:Z

    return v0
.end method

.method public m()Landroid/os/Bundle;
    .locals 1

    .prologue
    .line 1231
    iget-object v0, p0, Landroid/support/v7/c/g$f;->q:Landroid/os/Bundle;

    return-object v0
.end method

.method public n()Landroid/content/IntentSender;
    .locals 1

    .prologue
    .line 1240
    iget-object v0, p0, Landroid/support/v7/c/g$f;->r:Landroid/content/IntentSender;

    return-object v0
.end method

.method public o()V
    .locals 1

    .prologue
    .line 1247
    invoke-static {}, Landroid/support/v7/c/g;->e()V

    .line 1248
    sget-object v0, Landroid/support/v7/c/g;->a:Landroid/support/v7/c/g$d;

    invoke-virtual {v0, p0}, Landroid/support/v7/c/g$d;->a(Landroid/support/v7/c/g$f;)V

    .line 1249
    return-void
.end method

.method p()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1340
    iget-object v0, p0, Landroid/support/v7/c/g$f;->b:Ljava/lang/String;

    return-object v0
.end method

.method q()Landroid/support/v7/c/c;
    .locals 1

    .prologue
    .line 1344
    iget-object v0, p0, Landroid/support/v7/c/g$f;->a:Landroid/support/v7/c/g$e;

    invoke-virtual {v0}, Landroid/support/v7/c/g$e;->a()Landroid/support/v7/c/c;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 1253
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "MediaRouter.RouteInfo{ uniqueId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v7/c/g$f;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v7/c/g$f;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", description="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v7/c/g$f;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", enabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Landroid/support/v7/c/g$f;->f:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", connecting="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Landroid/support/v7/c/g$f;->g:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", canDisconnect="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Landroid/support/v7/c/g$f;->h:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", playbackType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Landroid/support/v7/c/g$f;->j:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", playbackStream="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Landroid/support/v7/c/g$f;->k:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", volumeHandling="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Landroid/support/v7/c/g$f;->l:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", volume="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Landroid/support/v7/c/g$f;->m:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", volumeMax="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Landroid/support/v7/c/g$f;->n:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", presentationDisplayId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Landroid/support/v7/c/g$f;->p:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", extras="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v7/c/g$f;->q:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", settingsIntent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v7/c/g$f;->r:Landroid/content/IntentSender;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", providerPackageName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v7/c/g$f;->a:Landroid/support/v7/c/g$e;

    invoke-virtual {v1}, Landroid/support/v7/c/g$e;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " }"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
