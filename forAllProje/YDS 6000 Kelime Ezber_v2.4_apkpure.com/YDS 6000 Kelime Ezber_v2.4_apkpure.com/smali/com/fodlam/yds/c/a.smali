.class public Lcom/fodlam/yds/c/a;
.super Lnet/sqlcipher/database/SQLiteOpenHelper;


# static fields
.field public static final a:[Ljava/lang/String;

.field public static final b:[Ljava/lang/String;

.field private static e:Lcom/fodlam/yds/c/a;


# instance fields
.field c:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/Integer;",
            "Lcom/fodlam/yds/f/e;",
            ">;"
        }
    .end annotation
.end field

.field d:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/fodlam/yds/f/f;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 8

    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    const/16 v0, 0xc

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "id"

    aput-object v1, v0, v3

    const-string v1, "category"

    aput-object v1, v0, v4

    const-string v1, "categoryorder"

    aput-object v1, v0, v5

    const-string v1, "learning"

    aput-object v1, v0, v6

    const-string v1, "chooseword"

    aput-object v1, v0, v7

    const/4 v1, 0x5

    const-string v2, "findword"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string v2, "listen"

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string v2, "listenandchoose"

    aput-object v2, v0, v1

    const/16 v1, 0x8

    const-string v2, "matchword"

    aput-object v2, v0, v1

    const/16 v1, 0x9

    const-string v2, "listenandwrite"

    aput-object v2, v0, v1

    const/16 v1, 0xa

    const-string v2, "writeword"

    aput-object v2, v0, v1

    const/16 v1, 0xb

    const-string v2, "issent"

    aput-object v2, v0, v1

    sput-object v0, Lcom/fodlam/yds/c/a;->a:[Ljava/lang/String;

    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "day"

    aput-object v1, v0, v3

    const-string v1, "duration"

    aput-object v1, v0, v4

    const-string v1, "memocount"

    aput-object v1, v0, v5

    const-string v1, "rightanswer"

    aput-object v1, v0, v6

    const-string v1, "wronganswer"

    aput-object v1, v0, v7

    sput-object v0, Lcom/fodlam/yds/c/a;->b:[Ljava/lang/String;

    const/4 v0, 0x0

    sput-object v0, Lcom/fodlam/yds/c/a;->e:Lcom/fodlam/yds/c/a;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 3

    const/4 v2, 0x0

    const-string v0, "user.sqlite3"

    const/4 v1, 0x1

    invoke-direct {p0, p1, v0, v2, v1}, Lnet/sqlcipher/database/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;I)V

    iput-object v2, p0, Lcom/fodlam/yds/c/a;->c:Ljava/util/HashMap;

    iput-object v2, p0, Lcom/fodlam/yds/c/a;->d:Ljava/util/HashMap;

    invoke-static {p1}, Lnet/sqlcipher/database/SQLiteDatabase;->loadLibs(Landroid/content/Context;)V

    invoke-direct {p0}, Lcom/fodlam/yds/c/a;->k()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/fodlam/yds/c/a;->c:Ljava/util/HashMap;

    invoke-virtual {p0}, Lcom/fodlam/yds/c/a;->d()Ljava/util/HashMap;

    invoke-virtual {p0}, Lcom/fodlam/yds/c/a;->c()Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v0

    const-string v1, "CREATE TABLE if not exists favourite  (\n id Integer NOT NULL,\n PRIMARY KEY(id)\n)"

    invoke-virtual {v0, v1}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    return-void
.end method

.method public static declared-synchronized a(Landroid/content/Context;)Lcom/fodlam/yds/c/a;
    .locals 2

    const-class v1, Lcom/fodlam/yds/c/a;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/fodlam/yds/c/a;->e:Lcom/fodlam/yds/c/a;

    if-nez v0, :cond_0

    new-instance v0, Lcom/fodlam/yds/c/a;

    invoke-direct {v0, p0}, Lcom/fodlam/yds/c/a;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/fodlam/yds/c/a;->e:Lcom/fodlam/yds/c/a;

    :cond_0
    sget-object v0, Lcom/fodlam/yds/c/a;->e:Lcom/fodlam/yds/c/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method private j()Ljava/util/HashMap;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/fodlam/yds/f/f;",
            ">;"
        }
    .end annotation

    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    const-string v0, "SELECT * FROM statistic"

    invoke-virtual {p0}, Lcom/fodlam/yds/c/a;->c()Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lnet/sqlcipher/database/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Lnet/sqlcipher/Cursor;

    move-result-object v7

    invoke-interface {v7}, Lnet/sqlcipher/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    new-instance v0, Lcom/fodlam/yds/f/f;

    const/4 v1, 0x0

    invoke-interface {v7, v1}, Lnet/sqlcipher/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-interface {v7, v2}, Lnet/sqlcipher/Cursor;->getInt(I)I

    move-result v2

    const/4 v3, 0x2

    invoke-interface {v7, v3}, Lnet/sqlcipher/Cursor;->getInt(I)I

    move-result v3

    const/4 v4, 0x3

    invoke-interface {v7, v4}, Lnet/sqlcipher/Cursor;->getInt(I)I

    move-result v4

    const/4 v5, 0x4

    invoke-interface {v7, v5}, Lnet/sqlcipher/Cursor;->getInt(I)I

    move-result v5

    invoke-direct/range {v0 .. v5}, Lcom/fodlam/yds/f/f;-><init>(Ljava/lang/String;IIII)V

    iget-object v1, v0, Lcom/fodlam/yds/f/f;->a:Ljava/lang/String;

    invoke-virtual {v6, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v7}, Lnet/sqlcipher/Cursor;->moveToNext()Z

    move-result v0

    if-nez v0, :cond_0

    :cond_1
    invoke-interface {v7}, Lnet/sqlcipher/Cursor;->close()V

    return-object v6
.end method

.method private k()Ljava/util/HashMap;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/Integer;",
            "Lcom/fodlam/yds/f/e;",
            ">;"
        }
    .end annotation

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const-string v0, "SELECT * FROM score"

    invoke-virtual {p0}, Lcom/fodlam/yds/c/a;->c()Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v0, v3}, Lnet/sqlcipher/database/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Lnet/sqlcipher/Cursor;

    move-result-object v2

    invoke-interface {v2}, Lnet/sqlcipher/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_0
    new-instance v3, Lcom/fodlam/yds/f/e;

    const/4 v0, 0x0

    invoke-interface {v2, v0}, Lnet/sqlcipher/Cursor;->getInt(I)I

    move-result v0

    const/4 v4, 0x1

    invoke-interface {v2, v4}, Lnet/sqlcipher/Cursor;->getInt(I)I

    move-result v4

    const/4 v5, 0x2

    invoke-interface {v2, v5}, Lnet/sqlcipher/Cursor;->getInt(I)I

    move-result v5

    invoke-direct {v3, v0, v4, v5}, Lcom/fodlam/yds/f/e;-><init>(III)V

    const/4 v0, 0x3

    :goto_0
    const/16 v4, 0xb

    if-ge v0, v4, :cond_1

    sget-object v4, Lcom/fodlam/yds/c/a;->a:[Ljava/lang/String;

    aget-object v4, v4, v0

    invoke-interface {v2, v0}, Lnet/sqlcipher/Cursor;->getInt(I)I

    move-result v5

    invoke-virtual {v3, v4, v5}, Lcom/fodlam/yds/f/e;->a(Ljava/lang/String;I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget v0, v3, Lcom/fodlam/yds/f/e;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2}, Lnet/sqlcipher/Cursor;->moveToNext()Z

    move-result v0

    if-nez v0, :cond_0

    :cond_2
    invoke-interface {v2}, Lnet/sqlcipher/Cursor;->close()V

    return-object v1
.end method


# virtual methods
.method public a(Lcom/fodlam/yds/f/e;)I
    .locals 7

    invoke-virtual {p0}, Lcom/fodlam/yds/c/a;->c()Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v2

    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    invoke-virtual {p1}, Lcom/fodlam/yds/f/e;->a()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v3, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    goto :goto_0

    :cond_0
    const-string v0, "score"

    const-string v1, "id = ?"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/String;

    const/4 v5, 0x0

    iget v6, p1, Lcom/fodlam/yds/f/e;->a:I

    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v5

    invoke-virtual {v2, v0, v3, v1, v4}, Lnet/sqlcipher/database/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public a(ILcom/fodlam/yds/f/h$a;)J
    .locals 4

    :try_start_0
    invoke-virtual {p0}, Lcom/fodlam/yds/c/a;->c()Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v0

    new-instance v1, Landroid/content/ContentValues;

    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    const-string v2, "id"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v2, "sent_en"

    iget-object v3, p2, Lcom/fodlam/yds/f/h$a;->b:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "sent_tr"

    iget-object v3, p2, Lcom/fodlam/yds/f/h$a;->a:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "sentence"

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3, v1}, Lnet/sqlcipher/database/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    :goto_0
    return-wide v0

    :catch_0
    move-exception v0

    const-string v1, "Oxford"

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-wide/16 v0, 0x0

    goto :goto_0
.end method

.method public a(Ljava/lang/String;)Lcom/fodlam/yds/f/f;
    .locals 7

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/fodlam/yds/c/a;->d:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Lcom/fodlam/yds/c/a;->d:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fodlam/yds/f/f;

    :goto_0
    return-object v0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SELECT * FROM statistic where day=\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\';"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/fodlam/yds/c/a;->c()Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v2

    invoke-virtual {v2, v1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Lnet/sqlcipher/Cursor;

    move-result-object v6

    invoke-interface {v6}, Lnet/sqlcipher/Cursor;->moveToFirst()Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v0, Lcom/fodlam/yds/f/f;

    const/4 v1, 0x0

    invoke-interface {v6, v1}, Lnet/sqlcipher/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-interface {v6, v2}, Lnet/sqlcipher/Cursor;->getInt(I)I

    move-result v2

    const/4 v3, 0x2

    invoke-interface {v6, v3}, Lnet/sqlcipher/Cursor;->getInt(I)I

    move-result v3

    const/4 v4, 0x3

    invoke-interface {v6, v4}, Lnet/sqlcipher/Cursor;->getInt(I)I

    move-result v4

    const/4 v5, 0x4

    invoke-interface {v6, v5}, Lnet/sqlcipher/Cursor;->getInt(I)I

    move-result v5

    invoke-direct/range {v0 .. v5}, Lcom/fodlam/yds/f/f;-><init>(Ljava/lang/String;IIII)V

    :cond_1
    invoke-interface {v6}, Lnet/sqlcipher/Cursor;->close()V

    goto :goto_0
.end method

.method public a()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/fodlam/yds/c/a;->c:Ljava/util/HashMap;

    iput-object v0, p0, Lcom/fodlam/yds/c/a;->d:Ljava/util/HashMap;

    invoke-virtual {p0}, Lcom/fodlam/yds/c/a;->close()V

    invoke-static {}, Lnet/sqlcipher/database/SQLiteDatabase;->releaseMemory()I

    sput-object v0, Lcom/fodlam/yds/c/a;->e:Lcom/fodlam/yds/c/a;

    return-void
.end method

.method public a(Lcom/fodlam/yds/f/f;)V
    .locals 4

    invoke-virtual {p0}, Lcom/fodlam/yds/c/a;->c()Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v0

    new-instance v1, Landroid/content/ContentValues;

    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    const-string v2, "day"

    iget-object v3, p1, Lcom/fodlam/yds/f/f;->a:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v2, Lcom/fodlam/yds/c/a;->b:[Ljava/lang/String;

    const/4 v3, 0x1

    aget-object v2, v2, v3

    iget v3, p1, Lcom/fodlam/yds/f/f;->b:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    sget-object v2, Lcom/fodlam/yds/c/a;->b:[Ljava/lang/String;

    const/4 v3, 0x2

    aget-object v2, v2, v3

    iget v3, p1, Lcom/fodlam/yds/f/f;->c:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    sget-object v2, Lcom/fodlam/yds/c/a;->b:[Ljava/lang/String;

    const/4 v3, 0x3

    aget-object v2, v2, v3

    iget v3, p1, Lcom/fodlam/yds/f/f;->d:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    sget-object v2, Lcom/fodlam/yds/c/a;->b:[Ljava/lang/String;

    const/4 v3, 0x4

    aget-object v2, v2, v3

    iget v3, p1, Lcom/fodlam/yds/f/f;->e:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v2, "statistic"

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3, v1}, Lnet/sqlcipher/database/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    invoke-virtual {v0}, Lnet/sqlcipher/database/SQLiteDatabase;->close()V

    iget-object v0, p0, Lcom/fodlam/yds/c/a;->d:Ljava/util/HashMap;

    iget-object v1, p1, Lcom/fodlam/yds/f/f;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public a(Lcom/fodlam/yds/f/h;)V
    .locals 4

    invoke-virtual {p0}, Lcom/fodlam/yds/c/a;->c()Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v0

    new-instance v1, Landroid/content/ContentValues;

    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    const-string v2, "id"

    iget v3, p1, Lcom/fodlam/yds/f/h;->c:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v2, "favourite"

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3, v1}, Lnet/sqlcipher/database/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/fodlam/yds/f/h;->a(Z)V

    return-void
.end method

.method public a(Ljava/util/HashMap;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/Integer;",
            "Lcom/fodlam/yds/f/e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/fodlam/yds/c/a;->c:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-virtual {p0}, Lcom/fodlam/yds/c/a;->c()Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v2

    invoke-virtual {v2}, Lnet/sqlcipher/database/SQLiteDatabase;->beginTransaction()V

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fodlam/yds/f/e;

    new-instance v4, Landroid/content/ContentValues;

    invoke-direct {v4}, Landroid/content/ContentValues;-><init>()V

    const-string v1, "id"

    iget v5, v0, Lcom/fodlam/yds/f/e;->a:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v4, v1, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v1, "category"

    iget v5, v0, Lcom/fodlam/yds/f/e;->b:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v4, v1, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v1, "categoryOrder"

    iget v5, v0, Lcom/fodlam/yds/f/e;->c:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v4, v1, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    invoke-virtual {v0}, Lcom/fodlam/yds/f/e;->a()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v4, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    goto :goto_1

    :cond_0
    const-string v0, "score"

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1, v4}, Lnet/sqlcipher/database/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Lnet/sqlcipher/database/SQLiteDatabase;->setTransactionSuccessful()V

    invoke-virtual {v2}, Lnet/sqlcipher/database/SQLiteDatabase;->endTransaction()V

    return-void
.end method

.method public a(I)[F
    .locals 6

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    new-array v3, p1, [F

    neg-int v0, p1

    add-int/lit8 v0, v0, 0x1

    :goto_0
    if-gtz v0, :cond_1

    invoke-virtual {v2, v1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    const/4 v4, 0x5

    invoke-virtual {v2, v4, v0}, Ljava/util/Calendar;->add(II)V

    invoke-virtual {v2}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v4

    invoke-static {v4}, Lcom/fodlam/yds/utility/c;->a(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v4}, Lcom/fodlam/yds/c/a;->a(Ljava/lang/String;)Lcom/fodlam/yds/f/f;

    move-result-object v4

    if-eqz v4, :cond_0

    neg-int v5, v0

    iget v4, v4, Lcom/fodlam/yds/f/f;->c:I

    int-to-float v4, v4

    aput v4, v3, v5

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-object v3
.end method

.method public b(Ljava/lang/String;)F
    .locals 4

    invoke-virtual {p0, p1}, Lcom/fodlam/yds/c/a;->a(Ljava/lang/String;)Lcom/fodlam/yds/f/f;

    move-result-object v0

    if-eqz v0, :cond_0

    iget v1, v0, Lcom/fodlam/yds/f/f;->d:I

    iget v2, v0, Lcom/fodlam/yds/f/f;->e:I

    add-int/2addr v1, v2

    if-nez v1, :cond_1

    :cond_0
    const/high16 v0, -0x40800000    # -1.0f

    :goto_0
    return v0

    :cond_1
    iget v1, v0, Lcom/fodlam/yds/f/f;->d:I

    int-to-float v1, v1

    const/high16 v2, 0x3f800000    # 1.0f

    iget v3, v0, Lcom/fodlam/yds/f/f;->d:I

    int-to-float v3, v3

    mul-float/2addr v2, v3

    iget v0, v0, Lcom/fodlam/yds/f/f;->e:I

    int-to-float v0, v0

    add-float/2addr v0, v2

    div-float v0, v1, v0

    goto :goto_0
.end method

.method public b(Lcom/fodlam/yds/f/f;)I
    .locals 7

    const/4 v4, 0x1

    invoke-virtual {p0}, Lcom/fodlam/yds/c/a;->c()Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v0

    new-instance v1, Landroid/content/ContentValues;

    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    sget-object v2, Lcom/fodlam/yds/c/a;->b:[Ljava/lang/String;

    aget-object v2, v2, v4

    iget v3, p1, Lcom/fodlam/yds/f/f;->b:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    sget-object v2, Lcom/fodlam/yds/c/a;->b:[Ljava/lang/String;

    const/4 v3, 0x2

    aget-object v2, v2, v3

    iget v3, p1, Lcom/fodlam/yds/f/f;->c:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    sget-object v2, Lcom/fodlam/yds/c/a;->b:[Ljava/lang/String;

    const/4 v3, 0x3

    aget-object v2, v2, v3

    iget v3, p1, Lcom/fodlam/yds/f/f;->d:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    sget-object v2, Lcom/fodlam/yds/c/a;->b:[Ljava/lang/String;

    const/4 v3, 0x4

    aget-object v2, v2, v3

    iget v3, p1, Lcom/fodlam/yds/f/f;->e:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v2, "statistic"

    const-string v3, "day = ?"

    new-array v4, v4, [Ljava/lang/String;

    const/4 v5, 0x0

    iget-object v6, p1, Lcom/fodlam/yds/f/f;->a:Ljava/lang/String;

    aput-object v6, v4, v5

    invoke-virtual {v0, v2, v1, v3, v4}, Lnet/sqlcipher/database/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public b()Ljava/util/HashSet;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashSet",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    const-string v1, "SELECT id FROM favourite"

    invoke-virtual {p0}, Lcom/fodlam/yds/c/a;->c()Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v1, v3}, Lnet/sqlcipher/database/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Lnet/sqlcipher/Cursor;

    move-result-object v1

    invoke-interface {v1}, Lnet/sqlcipher/Cursor;->moveToFirst()Z

    move-result v2

    if-eqz v2, :cond_1

    :cond_0
    const/4 v2, 0x0

    invoke-interface {v1, v2}, Lnet/sqlcipher/Cursor;->getInt(I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    invoke-interface {v1}, Lnet/sqlcipher/Cursor;->moveToNext()Z

    move-result v2

    if-nez v2, :cond_0

    :cond_1
    invoke-interface {v1}, Lnet/sqlcipher/Cursor;->close()V

    return-object v0
.end method

.method public b(Lcom/fodlam/yds/f/h;)V
    .locals 7

    const/4 v6, 0x0

    invoke-virtual {p0}, Lcom/fodlam/yds/c/a;->c()Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v0

    const-string v1, "favourite"

    const-string v2, "id=?"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, ""

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget v5, p1, Lcom/fodlam/yds/f/h;->c:I

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v6

    invoke-virtual {v0, v1, v2, v3}, Lnet/sqlcipher/database/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    invoke-virtual {p1, v6}, Lcom/fodlam/yds/f/h;->a(Z)V

    return-void
.end method

.method public b(I)[F
    .locals 7

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    new-array v3, p1, [F

    neg-int v0, p1

    add-int/lit8 v0, v0, 0x1

    :goto_0
    if-gtz v0, :cond_1

    invoke-virtual {v2, v1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    const/4 v4, 0x5

    invoke-virtual {v2, v4, v0}, Ljava/util/Calendar;->add(II)V

    invoke-virtual {v2}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v4

    invoke-static {v4}, Lcom/fodlam/yds/utility/c;->a(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v4}, Lcom/fodlam/yds/c/a;->a(Ljava/lang/String;)Lcom/fodlam/yds/f/f;

    move-result-object v4

    if-eqz v4, :cond_0

    neg-int v5, v0

    iget v4, v4, Lcom/fodlam/yds/f/f;->b:I

    int-to-float v4, v4

    const/high16 v6, 0x42700000    # 60.0f

    div-float/2addr v4, v6

    aput v4, v3, v5

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-object v3
.end method

.method public declared-synchronized c()Lnet/sqlcipher/database/SQLiteDatabase;
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "com.fodlam.yds"

    invoke-super {p0, v0}, Lnet/sqlcipher/database/SQLiteOpenHelper;->getWritableDatabase(Ljava/lang/String;)Lnet/sqlcipher/database/SQLiteDatabase;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public d()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/fodlam/yds/f/f;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/fodlam/yds/c/a;->d:Ljava/util/HashMap;

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/fodlam/yds/c/a;->j()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/fodlam/yds/c/a;->d:Ljava/util/HashMap;

    :cond_0
    iget-object v0, p0, Lcom/fodlam/yds/c/a;->d:Ljava/util/HashMap;

    return-object v0
.end method

.method public e()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/Integer;",
            "Lcom/fodlam/yds/f/e;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/fodlam/yds/c/a;->c:Ljava/util/HashMap;

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/fodlam/yds/c/a;->k()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/fodlam/yds/c/a;->c:Ljava/util/HashMap;

    :cond_0
    iget-object v0, p0, Lcom/fodlam/yds/c/a;->c:Ljava/util/HashMap;

    return-object v0
.end method

.method public f()Lcom/fodlam/yds/f/f;
    .locals 2

    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-static {v0}, Lcom/fodlam/yds/utility/c;->a(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/fodlam/yds/c/a;->a(Ljava/lang/String;)Lcom/fodlam/yds/f/f;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/fodlam/yds/f/f;

    invoke-direct {v0, v1}, Lcom/fodlam/yds/f/f;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/c/a;->a(Lcom/fodlam/yds/f/f;)V

    :cond_0
    return-object v0
.end method

.method public g()[F
    .locals 7

    const/4 v1, 0x0

    const/4 v6, 0x3

    const/4 v0, 0x4

    new-array v2, v0, [F

    invoke-virtual {p0}, Lcom/fodlam/yds/c/a;->f()Lcom/fodlam/yds/f/f;

    move-result-object v0

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    int-to-float v0, v0

    aput v0, v2, v1

    iget-object v0, p0, Lcom/fodlam/yds/c/a;->d:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fodlam/yds/f/f;

    aget v4, v2, v6

    iget v5, v0, Lcom/fodlam/yds/f/f;->b:I

    int-to-float v5, v5

    add-float/2addr v4, v5

    aput v4, v2, v6

    const/4 v4, 0x2

    aget v5, v2, v4

    iget v0, v0, Lcom/fodlam/yds/f/f;->c:I

    int-to-float v0, v0

    add-float/2addr v0, v5

    aput v0, v2, v4

    goto :goto_1

    :cond_0
    iget v0, v0, Lcom/fodlam/yds/f/f;->c:I

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    aget v3, v2, v6

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    int-to-float v1, v1

    div-float v1, v3, v1

    const/high16 v3, 0x42700000    # 60.0f

    div-float/2addr v1, v3

    aput v1, v2, v0

    aget v0, v2, v6

    const/high16 v1, 0x45610000    # 3600.0f

    div-float/2addr v0, v1

    aput v0, v2, v6

    return-object v2
.end method

.method public h()[F
    .locals 15

    const/4 v14, 0x3

    const/4 v13, 0x2

    const/4 v12, 0x1

    const/4 v1, 0x0

    const/4 v0, 0x4

    new-array v2, v0, [F

    iget-object v0, p0, Lcom/fodlam/yds/c/a;->c:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fodlam/yds/f/e;

    sget-object v4, Lcom/fodlam/yds/OxfordApplication$a;->a:Lcom/fodlam/yds/OxfordApplication$a;

    invoke-virtual {v4}, Lcom/fodlam/yds/OxfordApplication$a;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/fodlam/yds/f/e;->a(Ljava/lang/String;)I

    move-result v4

    sget-object v5, Lcom/fodlam/yds/OxfordApplication$a;->d:Lcom/fodlam/yds/OxfordApplication$a;

    invoke-virtual {v5}, Lcom/fodlam/yds/OxfordApplication$a;->c()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Lcom/fodlam/yds/f/e;->a(Ljava/lang/String;)I

    move-result v5

    sget-object v6, Lcom/fodlam/yds/OxfordApplication$a;->e:Lcom/fodlam/yds/OxfordApplication$a;

    invoke-virtual {v6}, Lcom/fodlam/yds/OxfordApplication$a;->c()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Lcom/fodlam/yds/f/e;->a(Ljava/lang/String;)I

    move-result v6

    sget-object v7, Lcom/fodlam/yds/OxfordApplication$a;->b:Lcom/fodlam/yds/OxfordApplication$a;

    invoke-virtual {v7}, Lcom/fodlam/yds/OxfordApplication$a;->c()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v7}, Lcom/fodlam/yds/f/e;->a(Ljava/lang/String;)I

    move-result v7

    sget-object v8, Lcom/fodlam/yds/OxfordApplication$a;->c:Lcom/fodlam/yds/OxfordApplication$a;

    invoke-virtual {v8}, Lcom/fodlam/yds/OxfordApplication$a;->c()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Lcom/fodlam/yds/f/e;->a(Ljava/lang/String;)I

    move-result v8

    sget-object v9, Lcom/fodlam/yds/OxfordApplication$a;->f:Lcom/fodlam/yds/OxfordApplication$a;

    invoke-virtual {v9}, Lcom/fodlam/yds/OxfordApplication$a;->c()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0, v9}, Lcom/fodlam/yds/f/e;->a(Ljava/lang/String;)I

    move-result v9

    sget-object v10, Lcom/fodlam/yds/OxfordApplication$a;->h:Lcom/fodlam/yds/OxfordApplication$a;

    invoke-virtual {v10}, Lcom/fodlam/yds/OxfordApplication$a;->c()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0, v10}, Lcom/fodlam/yds/f/e;->a(Ljava/lang/String;)I

    move-result v10

    sget-object v11, Lcom/fodlam/yds/OxfordApplication$a;->g:Lcom/fodlam/yds/OxfordApplication$a;

    invoke-virtual {v11}, Lcom/fodlam/yds/OxfordApplication$a;->c()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0, v11}, Lcom/fodlam/yds/f/e;->a(Ljava/lang/String;)I

    move-result v0

    aget v11, v2, v1

    int-to-float v4, v4

    add-float/2addr v4, v11

    aput v4, v2, v1

    aget v4, v2, v12

    add-int/2addr v5, v6

    add-int/2addr v5, v0

    int-to-float v5, v5

    add-float/2addr v4, v5

    aput v4, v2, v12

    aget v4, v2, v13

    add-int v5, v7, v8

    add-int/2addr v5, v9

    int-to-float v5, v5

    add-float/2addr v4, v5

    aput v4, v2, v13

    aget v4, v2, v14

    add-int/2addr v0, v10

    int-to-float v0, v0

    add-float/2addr v0, v4

    aput v0, v2, v14

    goto :goto_0

    :cond_0
    aget v0, v2, v1

    iget-object v3, p0, Lcom/fodlam/yds/c/a;->c:Ljava/util/HashMap;

    invoke-virtual {v3}, Ljava/util/HashMap;->size()I

    move-result v3

    mul-int/lit8 v3, v3, 0x1

    int-to-float v3, v3

    div-float/2addr v0, v3

    aput v0, v2, v1

    aget v0, v2, v12

    iget-object v3, p0, Lcom/fodlam/yds/c/a;->c:Ljava/util/HashMap;

    invoke-virtual {v3}, Ljava/util/HashMap;->size()I

    move-result v3

    mul-int/lit8 v3, v3, 0x3

    int-to-float v3, v3

    div-float/2addr v0, v3

    aput v0, v2, v12

    aget v0, v2, v13

    iget-object v3, p0, Lcom/fodlam/yds/c/a;->c:Ljava/util/HashMap;

    invoke-virtual {v3}, Ljava/util/HashMap;->size()I

    move-result v3

    mul-int/lit8 v3, v3, 0x3

    int-to-float v3, v3

    div-float/2addr v0, v3

    aput v0, v2, v13

    aget v0, v2, v14

    iget-object v3, p0, Lcom/fodlam/yds/c/a;->c:Ljava/util/HashMap;

    invoke-virtual {v3}, Ljava/util/HashMap;->size()I

    move-result v3

    mul-int/lit8 v3, v3, 0x2

    int-to-float v3, v3

    div-float/2addr v0, v3

    aput v0, v2, v14

    move v0, v1

    :goto_1
    array-length v1, v2

    if-ge v0, v1, :cond_1

    aget v1, v2, v0

    const/high16 v3, 0x42c80000    # 100.0f

    mul-float/2addr v1, v3

    aput v1, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    return-object v2
.end method

.method public i()Ljava/util/HashSet;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashSet",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    const/4 v9, 0x0

    const/4 v3, 0x0

    new-instance v8, Ljava/util/HashSet;

    invoke-direct {v8}, Ljava/util/HashSet;-><init>()V

    invoke-virtual {p0}, Lcom/fodlam/yds/c/a;->c()Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v0

    const-string v1, "sentence"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const-string v4, "id"

    aput-object v4, v2, v9

    move-object v4, v3

    move-object v5, v3

    move-object v6, v3

    move-object v7, v3

    invoke-virtual/range {v0 .. v7}, Lnet/sqlcipher/database/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnet/sqlcipher/Cursor;

    move-result-object v0

    invoke-interface {v0}, Lnet/sqlcipher/Cursor;->moveToFirst()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    invoke-interface {v0, v9}, Lnet/sqlcipher/Cursor;->getInt(I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v8, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    invoke-interface {v0}, Lnet/sqlcipher/Cursor;->moveToNext()Z

    move-result v1

    if-nez v1, :cond_0

    :cond_1
    invoke-interface {v0}, Lnet/sqlcipher/Cursor;->close()V

    return-object v8
.end method

.method public onCreate(Lnet/sqlcipher/database/SQLiteDatabase;)V
    .locals 1

    const-string v0, "CREATE TABLE score (\n id INTEGER NOT NULL,\n category INTEGER NOT NULL,\n categoryorder INTEGER NOT NULL,\n learning INTEGER,\n chooseword INTEGER,\n findword INTEGER,\n listen INTEGER,\n listenandchoose INTEGER,\n matchword INTEGER,\n listenandwrite INTEGER,\n writeword INTEGER,\n issent INTEGER,\n PRIMARY KEY(id)\n)"

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v0, "CREATE TABLE statistic  (\n day TEXT NOT NULL,\n duration INTEGER,\n memocount INTEGER,\n rightanswer INTEGER,\n wronganswer INTEGER,\n PRIMARY KEY(day)\n)"

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v0, "CREATE TABLE sentence  (\n id Integer NOT NULL,\n sent_en TEXT NOT NULL,\n sent_tr TEXT, \n PRIMARY KEY(id, sent_en)\n)"

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v0, "CREATE TABLE teststate  (\n id Integer NOT NULL,\n category Integer NOT NULL,\n memocount Integer, \n isactive Integer, \n PRIMARY KEY(id, category)\n)"

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v0, "CREATE TABLE favourite  (\n id Integer NOT NULL,\n PRIMARY KEY(id)\n)"

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    return-void
.end method

.method public onUpgrade(Lnet/sqlcipher/database/SQLiteDatabase;II)V
    .locals 1

    const-string v0, "DROP TABLE IF EXISTS score"

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v0, "DROP TABLE IF EXISTS statistic"

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v0, "DROP TABLE IF EXISTS sentence"

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v0, "DROP TABLE IF EXISTS teststate"

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v0, "DROP TABLE IF EXISTS favourite"

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/fodlam/yds/c/a;->onCreate(Lnet/sqlcipher/database/SQLiteDatabase;)V

    return-void
.end method
