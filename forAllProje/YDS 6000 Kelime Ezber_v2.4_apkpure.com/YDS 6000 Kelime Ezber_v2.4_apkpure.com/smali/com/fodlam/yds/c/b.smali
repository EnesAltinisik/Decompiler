.class public Lcom/fodlam/yds/c/b;
.super Ljava/lang/Object;


# static fields
.field public static a:Ljava/lang/String;

.field public static b:Ljava/lang/String;

.field static c:Lcom/fodlam/yds/c/b;

.field private static g:Ljava/lang/String;


# instance fields
.field d:Lnet/sqlcipher/database/SQLiteDatabase;

.field e:Landroid/content/Context;

.field f:[Lcom/fodlam/yds/f/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "applaudme.mp3"

    sput-object v0, Lcom/fodlam/yds/c/b;->a:Ljava/lang/String;

    const-string v0, "applaudme.mp3"

    sput-object v0, Lcom/fodlam/yds/c/b;->b:Ljava/lang/String;

    const/4 v0, 0x0

    sput-object v0, Lcom/fodlam/yds/c/b;->c:Lcom/fodlam/yds/c/b;

    const-string v0, ""

    sput-object v0, Lcom/fodlam/yds/c/b;->g:Ljava/lang/String;

    const-string v0, "/data/data/com.fodlam.yds/databases/"

    sput-object v0, Lcom/fodlam/yds/c/b;->g:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Z)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/fodlam/yds/c/b;->e:Landroid/content/Context;

    invoke-static {p1}, Lnet/sqlcipher/database/SQLiteDatabase;->loadLibs(Landroid/content/Context;)V

    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/fodlam/yds/c/b;->g:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcom/fodlam/yds/c/b;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-direct {p0}, Lcom/fodlam/yds/c/b;->m()V

    :cond_0
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/fodlam/yds/c/b;->g:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcom/fodlam/yds/c/b;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.fodlam.yds"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lnet/sqlcipher/database/SQLiteDatabase;->openDatabase(Ljava/lang/String;Ljava/lang/String;Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;I)Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v0

    iput-object v0, p0, Lcom/fodlam/yds/c/b;->d:Lnet/sqlcipher/database/SQLiteDatabase;

    :cond_1
    if-eqz p2, :cond_2

    :try_start_0
    invoke-direct {p0}, Lcom/fodlam/yds/c/b;->l()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/crash/FirebaseCrash;->a(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public static declared-synchronized a()Lcom/fodlam/yds/c/b;
    .locals 2

    const-class v0, Lcom/fodlam/yds/c/b;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/fodlam/yds/c/b;->c:Lcom/fodlam/yds/c/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static declared-synchronized a(Landroid/content/Context;Z)Lcom/fodlam/yds/c/b;
    .locals 2

    const-class v1, Lcom/fodlam/yds/c/b;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/fodlam/yds/c/b;->c:Lcom/fodlam/yds/c/b;

    if-nez v0, :cond_0

    new-instance v0, Lcom/fodlam/yds/c/b;

    invoke-direct {v0, p0, p1}, Lcom/fodlam/yds/c/b;-><init>(Landroid/content/Context;Z)V

    sput-object v0, Lcom/fodlam/yds/c/b;->c:Lcom/fodlam/yds/c/b;

    :cond_0
    sget-object v0, Lcom/fodlam/yds/c/b;->c:Lcom/fodlam/yds/c/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method private l()V
    .locals 13

    const/4 v0, 0x4

    new-array v0, v0, [Lcom/fodlam/yds/f/b;

    iput-object v0, p0, Lcom/fodlam/yds/c/b;->f:[Lcom/fodlam/yds/f/b;

    iget-object v0, p0, Lcom/fodlam/yds/c/b;->f:[Lcom/fodlam/yds/f/b;

    const/4 v1, 0x0

    new-instance v2, Lcom/fodlam/yds/f/b;

    const-string v3, "Yeni Ba\u015flayan"

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-direct {v2, v3, v4, v5}, Lcom/fodlam/yds/f/b;-><init>(Ljava/lang/String;ZI)V

    aput-object v2, v0, v1

    iget-object v0, p0, Lcom/fodlam/yds/c/b;->f:[Lcom/fodlam/yds/f/b;

    const/4 v1, 0x1

    new-instance v2, Lcom/fodlam/yds/f/b;

    const-string v3, "Orta"

    const/4 v4, 0x1

    const/4 v5, 0x1

    invoke-direct {v2, v3, v4, v5}, Lcom/fodlam/yds/f/b;-><init>(Ljava/lang/String;ZI)V

    aput-object v2, v0, v1

    iget-object v0, p0, Lcom/fodlam/yds/c/b;->f:[Lcom/fodlam/yds/f/b;

    const/4 v1, 0x2

    new-instance v2, Lcom/fodlam/yds/f/b;

    const-string v3, "\u0130leri"

    const/4 v4, 0x1

    const/4 v5, 0x2

    invoke-direct {v2, v3, v4, v5}, Lcom/fodlam/yds/f/b;-><init>(Ljava/lang/String;ZI)V

    aput-object v2, v0, v1

    iget-object v0, p0, Lcom/fodlam/yds/c/b;->f:[Lcom/fodlam/yds/f/b;

    const/4 v1, 0x3

    new-instance v2, Lcom/fodlam/yds/f/c;

    const-string v3, "Favori Kelimeler"

    const/4 v4, 0x1

    const/4 v5, 0x3

    invoke-direct {v2, v3, v4, v5}, Lcom/fodlam/yds/f/c;-><init>(Ljava/lang/String;ZI)V

    aput-object v2, v0, v1

    iget-object v0, p0, Lcom/fodlam/yds/c/b;->e:Landroid/content/Context;

    invoke-static {v0}, Lcom/fodlam/yds/c/a;->a(Landroid/content/Context;)Lcom/fodlam/yds/c/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fodlam/yds/c/a;->e()Ljava/util/HashMap;

    move-result-object v10

    iget-object v0, p0, Lcom/fodlam/yds/c/b;->e:Landroid/content/Context;

    invoke-static {v0}, Lcom/fodlam/yds/c/a;->a(Landroid/content/Context;)Lcom/fodlam/yds/c/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fodlam/yds/c/a;->b()Ljava/util/HashSet;

    move-result-object v11

    const/4 v8, 0x0

    iget-object v0, p0, Lcom/fodlam/yds/c/b;->d:Lnet/sqlcipher/database/SQLiteDatabase;

    const-string v1, "word"

    const/16 v2, 0x8

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    const-string v4, "id"

    aput-object v4, v2, v3

    const/4 v3, 0x1

    const-string v4, "category"

    aput-object v4, v2, v3

    const/4 v3, 0x2

    const-string v4, "categoryorder"

    aput-object v4, v2, v3

    const/4 v3, 0x3

    const-string v4, "word"

    aput-object v4, v2, v3

    const/4 v3, 0x4

    const-string v4, "type"

    aput-object v4, v2, v3

    const/4 v3, 0x5

    const-string v4, "def_en"

    aput-object v4, v2, v3

    const/4 v3, 0x6

    const-string v4, "def_tr"

    aput-object v4, v2, v3

    const/4 v3, 0x7

    const-string v4, "test"

    aput-object v4, v2, v3

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-string v7, "id"

    invoke-virtual/range {v0 .. v7}, Lnet/sqlcipher/database/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnet/sqlcipher/Cursor;

    move-result-object v12

    invoke-interface {v12}, Lnet/sqlcipher/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_5

    move v9, v8

    :goto_0
    new-instance v0, Lcom/fodlam/yds/f/h;

    const/4 v1, 0x0

    invoke-interface {v12, v1}, Lnet/sqlcipher/Cursor;->getInt(I)I

    move-result v1

    const/4 v2, 0x1

    invoke-interface {v12, v2}, Lnet/sqlcipher/Cursor;->getInt(I)I

    move-result v2

    const/4 v3, 0x2

    invoke-interface {v12, v3}, Lnet/sqlcipher/Cursor;->getInt(I)I

    move-result v3

    const/4 v4, 0x3

    invoke-interface {v12, v4}, Lnet/sqlcipher/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    sget-object v5, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v4, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x4

    invoke-interface {v12, v5}, Lnet/sqlcipher/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x5

    invoke-interface {v12, v6}, Lnet/sqlcipher/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x6

    invoke-interface {v12, v7}, Lnet/sqlcipher/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x7

    invoke-interface {v12, v8}, Lnet/sqlcipher/Cursor;->getInt(I)I

    move-result v8

    invoke-direct/range {v0 .. v8}, Lcom/fodlam/yds/f/h;-><init>(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    iget v1, v0, Lcom/fodlam/yds/f/h;->c:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v10, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/fodlam/yds/f/e;

    iput-object v1, v0, Lcom/fodlam/yds/f/h;->l:Lcom/fodlam/yds/f/e;

    iget-object v1, v0, Lcom/fodlam/yds/f/h;->l:Lcom/fodlam/yds/f/e;

    if-nez v1, :cond_4

    new-instance v1, Lcom/fodlam/yds/f/e;

    invoke-direct {v1, v0}, Lcom/fodlam/yds/f/e;-><init>(Lcom/fodlam/yds/f/h;)V

    iput-object v1, v0, Lcom/fodlam/yds/f/h;->l:Lcom/fodlam/yds/f/e;

    iget v1, v0, Lcom/fodlam/yds/f/h;->c:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, v0, Lcom/fodlam/yds/f/h;->l:Lcom/fodlam/yds/f/e;

    invoke-virtual {v10, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x1

    :goto_1
    iget v2, v0, Lcom/fodlam/yds/f/h;->c:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v11, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v0, v2}, Lcom/fodlam/yds/f/h;->b(Z)V

    iget-object v2, p0, Lcom/fodlam/yds/c/b;->f:[Lcom/fodlam/yds/f/b;

    iget v3, v0, Lcom/fodlam/yds/f/h;->d:I

    aget-object v2, v2, v3

    invoke-virtual {v2, v0}, Lcom/fodlam/yds/f/b;->a(Lcom/fodlam/yds/f/h;)V

    invoke-virtual {v0}, Lcom/fodlam/yds/f/h;->a()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v2}, Lcom/fodlam/yds/c/b;->a(Lcom/fodlam/yds/f/h;Z)V

    :cond_0
    invoke-interface {v12}, Lnet/sqlcipher/Cursor;->moveToNext()Z

    move-result v0

    if-nez v0, :cond_3

    :goto_2
    invoke-interface {v12}, Lnet/sqlcipher/Cursor;->close()V

    if-eqz v1, :cond_1

    iget-object v0, p0, Lcom/fodlam/yds/c/b;->e:Landroid/content/Context;

    invoke-static {v0}, Lcom/fodlam/yds/c/a;->a(Landroid/content/Context;)Lcom/fodlam/yds/c/a;

    move-result-object v0

    invoke-virtual {v0, v10}, Lcom/fodlam/yds/c/a;->a(Ljava/util/HashMap;)V

    :cond_1
    const/4 v0, 0x0

    :goto_3
    const/4 v1, 0x3

    if-ge v0, v1, :cond_2

    iget-object v1, p0, Lcom/fodlam/yds/c/b;->f:[Lcom/fodlam/yds/f/b;

    aget-object v1, v1, v0

    invoke-virtual {v1}, Lcom/fodlam/yds/f/b;->g()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_2
    return-void

    :cond_3
    move v9, v1

    goto/16 :goto_0

    :cond_4
    move v1, v9

    goto :goto_1

    :cond_5
    move v1, v8

    goto :goto_2
.end method

.method private m()V
    .locals 3

    :try_start_0
    new-instance v0, Ljava/io/File;

    sget-object v1, Lcom/fodlam/yds/c/b;->g:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/fodlam/yds/c/b;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/fodlam/yds/c/b;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/fodlam/yds/c/b;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    sget-object v2, Lcom/fodlam/yds/c/b;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v1

    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/InputStream;->available()I

    move-result v0

    new-array v0, v0, [B

    invoke-virtual {v1, v0}, Ljava/io/InputStream;->read([B)I

    invoke-virtual {v2, v0}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V

    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "TestDatabase :"

    invoke-virtual {v0}, Ljava/lang/Exception;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method


# virtual methods
.method public a(I)Lcom/fodlam/yds/f/h;
    .locals 2

    iget-object v0, p0, Lcom/fodlam/yds/c/b;->f:[Lcom/fodlam/yds/f/b;

    add-int/lit8 v1, p1, 0x1

    rem-int/lit8 v1, v1, 0x3

    aget-object v0, v0, v1

    invoke-virtual {v0}, Lcom/fodlam/yds/f/b;->d()I

    move-result v1

    invoke-static {v1}, Lcom/fodlam/yds/utility/c;->c(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/fodlam/yds/f/b;->a(I)Lcom/fodlam/yds/f/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fodlam/yds/f/g;->e()Lcom/fodlam/yds/f/h;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/fodlam/yds/f/h;)V
    .locals 2

    iget-object v0, p0, Lcom/fodlam/yds/c/b;->e:Landroid/content/Context;

    invoke-static {v0}, Lcom/fodlam/yds/c/a;->a(Landroid/content/Context;)Lcom/fodlam/yds/c/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/fodlam/yds/c/a;->b(Lcom/fodlam/yds/f/h;)V

    iget-object v0, p0, Lcom/fodlam/yds/c/b;->f:[Lcom/fodlam/yds/f/b;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    check-cast v0, Lcom/fodlam/yds/f/c;

    invoke-virtual {v0, p1}, Lcom/fodlam/yds/f/c;->b(Lcom/fodlam/yds/f/h;)V

    return-void
.end method

.method public a(Lcom/fodlam/yds/f/h;Z)V
    .locals 2

    if-nez p2, :cond_0

    iget-object v0, p0, Lcom/fodlam/yds/c/b;->e:Landroid/content/Context;

    invoke-static {v0}, Lcom/fodlam/yds/c/a;->a(Landroid/content/Context;)Lcom/fodlam/yds/c/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/fodlam/yds/c/a;->a(Lcom/fodlam/yds/f/h;)V

    :cond_0
    iget-object v0, p0, Lcom/fodlam/yds/c/b;->f:[Lcom/fodlam/yds/f/b;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    invoke-virtual {v0, p1}, Lcom/fodlam/yds/f/b;->a(Lcom/fodlam/yds/f/h;)V

    return-void
.end method

.method public a(Ljava/util/Set;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    return-void

    :cond_1
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/fodlam/yds/c/a;->a(Landroid/content/Context;)Lcom/fodlam/yds/c/a;

    move-result-object v2

    invoke-virtual {p0}, Lcom/fodlam/yds/c/b;->c()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fodlam/yds/f/h;

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_3
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v5, "--"

    invoke-virtual {v1, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    iget-object v5, v0, Lcom/fodlam/yds/f/h;->h:Ljava/lang/String;

    const/4 v6, 0x0

    aget-object v6, v1, v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    new-instance v5, Lcom/fodlam/yds/f/h$a;

    const/4 v6, 0x1

    aget-object v6, v1, v6

    array-length v7, v1

    const/4 v8, 0x3

    if-ne v7, v8, :cond_4

    const/4 v7, 0x2

    aget-object v1, v1, v7

    :goto_1
    invoke-direct {v5, v6, v1}, Lcom/fodlam/yds/f/h$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget v1, v0, Lcom/fodlam/yds/f/h;->c:I

    invoke-virtual {v2, v1, v5}, Lcom/fodlam/yds/c/a;->a(ILcom/fodlam/yds/f/h$a;)J

    goto :goto_0

    :cond_4
    const-string v1, ""

    goto :goto_1
.end method

.method public b()Lcom/fodlam/yds/f/g;
    .locals 2

    iget-object v0, p0, Lcom/fodlam/yds/c/b;->f:[Lcom/fodlam/yds/f/b;

    sget v1, Lcom/fodlam/yds/OxfordApplication;->g:I

    aget-object v0, v0, v1

    sget v1, Lcom/fodlam/yds/OxfordApplication;->i:I

    invoke-virtual {v0, v1}, Lcom/fodlam/yds/f/b;->a(I)Lcom/fodlam/yds/f/g;

    move-result-object v0

    return-object v0
.end method

.method public b(I)V
    .locals 2

    iget-object v0, p0, Lcom/fodlam/yds/c/b;->f:[Lcom/fodlam/yds/f/b;

    aget-object v0, v0, p1

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/fodlam/yds/f/b;->c:Z

    iget-object v0, p0, Lcom/fodlam/yds/c/b;->f:[Lcom/fodlam/yds/f/b;

    aget-object v0, v0, p1

    invoke-virtual {v0}, Lcom/fodlam/yds/f/b;->g()V

    return-void
.end method

.method public c(I)Lcom/fodlam/yds/f/b;
    .locals 1

    iget-object v0, p0, Lcom/fodlam/yds/c/b;->f:[Lcom/fodlam/yds/f/b;

    aget-object v0, v0, p1

    return-object v0
.end method

.method public c()Ljava/util/ArrayList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/fodlam/yds/f/h;",
            ">;"
        }
    .end annotation

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v0, 0x0

    :goto_0
    const/4 v2, 0x3

    if-ge v0, v2, :cond_0

    iget-object v2, p0, Lcom/fodlam/yds/c/b;->f:[Lcom/fodlam/yds/f/b;

    aget-object v2, v2, v0

    invoke-virtual {v2}, Lcom/fodlam/yds/f/b;->e()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-static {v1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    return-object v1
.end method

.method public d(I)Ljava/lang/String;
    .locals 10

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v9, 0x0

    const-string v8, ""

    iget-object v0, p0, Lcom/fodlam/yds/c/b;->d:Lnet/sqlcipher/database/SQLiteDatabase;

    const-string v1, "wordnet"

    new-array v2, v4, [Ljava/lang/String;

    const-string v3, "definition"

    aput-object v3, v2, v9

    const-string v3, "id=?"

    new-array v4, v4, [Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, ""

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v9

    move-object v6, v5

    move-object v7, v5

    invoke-virtual/range {v0 .. v7}, Lnet/sqlcipher/database/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnet/sqlcipher/Cursor;

    move-result-object v1

    invoke-interface {v1}, Lnet/sqlcipher/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1, v9}, Lnet/sqlcipher/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-interface {v1}, Lnet/sqlcipher/Cursor;->close()V

    return-object v0

    :cond_0
    move-object v0, v8

    goto :goto_0
.end method

.method public d()Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/fodlam/yds/f/h;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/fodlam/yds/c/b;->f:[Lcom/fodlam/yds/f/b;

    sget v1, Lcom/fodlam/yds/OxfordApplication;->g:I

    aget-object v0, v0, v1

    invoke-virtual {v0}, Lcom/fodlam/yds/f/b;->f()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public e()Lcom/fodlam/yds/f/h;
    .locals 11

    const/4 v2, 0x3

    const/4 v0, 0x0

    new-instance v9, Lcom/fodlam/yds/f/h;

    invoke-direct {v9}, Lcom/fodlam/yds/f/h;-><init>()V

    const-string v1, "Test"

    iput-object v1, v9, Lcom/fodlam/yds/f/h;->h:Ljava/lang/String;

    const-string v1, "Test"

    iput-object v1, v9, Lcom/fodlam/yds/f/h;->k:Ljava/lang/String;

    :try_start_0
    sget v1, Lcom/fodlam/yds/OxfordApplication;->g:I

    if-ne v1, v2, :cond_0

    :goto_0
    sget v1, Lcom/fodlam/yds/OxfordApplication;->j:I

    mul-int/lit8 v1, v1, 0xf

    const/16 v2, 0xf

    invoke-static {v2}, Lcom/fodlam/yds/utility/c;->c(I)I

    move-result v2

    add-int/2addr v1, v2

    const-string v3, "category =? and categoryorder=?"

    const/4 v2, 0x2

    new-array v4, v2, [Ljava/lang/String;

    const/4 v2, 0x0

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, ""

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v4, v2

    const/4 v0, 0x1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, ""

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v4, v0

    iget-object v0, p0, Lcom/fodlam/yds/c/b;->d:Lnet/sqlcipher/database/SQLiteDatabase;

    const-string v1, "word"

    const/16 v2, 0x8

    new-array v2, v2, [Ljava/lang/String;

    const/4 v5, 0x0

    const-string v6, "id"

    aput-object v6, v2, v5

    const/4 v5, 0x1

    const-string v6, "category"

    aput-object v6, v2, v5

    const/4 v5, 0x2

    const-string v6, "categoryorder"

    aput-object v6, v2, v5

    const/4 v5, 0x3

    const-string v6, "word"

    aput-object v6, v2, v5

    const/4 v5, 0x4

    const-string v6, "type"

    aput-object v6, v2, v5

    const/4 v5, 0x5

    const-string v6, "def_en"

    aput-object v6, v2, v5

    const/4 v5, 0x6

    const-string v6, "def_tr"

    aput-object v6, v2, v5

    const/4 v5, 0x7

    const-string v6, "test"

    aput-object v6, v2, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Lnet/sqlcipher/database/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnet/sqlcipher/Cursor;

    move-result-object v10

    invoke-interface {v10}, Lnet/sqlcipher/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lcom/fodlam/yds/f/h;

    const/4 v1, 0x0

    invoke-interface {v10, v1}, Lnet/sqlcipher/Cursor;->getInt(I)I

    move-result v1

    const/4 v2, 0x1

    invoke-interface {v10, v2}, Lnet/sqlcipher/Cursor;->getInt(I)I

    move-result v2

    const/4 v3, 0x2

    invoke-interface {v10, v3}, Lnet/sqlcipher/Cursor;->getInt(I)I

    move-result v3

    const/4 v4, 0x3

    invoke-interface {v10, v4}, Lnet/sqlcipher/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x4

    invoke-interface {v10, v5}, Lnet/sqlcipher/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x5

    invoke-interface {v10, v6}, Lnet/sqlcipher/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x6

    invoke-interface {v10, v7}, Lnet/sqlcipher/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x7

    invoke-interface {v10, v8}, Lnet/sqlcipher/Cursor;->getInt(I)I

    move-result v8

    invoke-direct/range {v0 .. v8}, Lcom/fodlam/yds/f/h;-><init>(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    :try_start_1
    invoke-interface {v10}, Lnet/sqlcipher/Cursor;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :goto_2
    return-object v0

    :cond_0
    :try_start_2
    sget v0, Lcom/fodlam/yds/OxfordApplication;->g:I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto/16 :goto_0

    :catch_0
    move-exception v0

    move-object v0, v9

    goto :goto_2

    :catch_1
    move-exception v1

    goto :goto_2

    :cond_1
    move-object v0, v9

    goto :goto_1
.end method

.method public f()Lcom/fodlam/yds/f/h;
    .locals 13

    const/4 v12, 0x3

    const/4 v11, 0x2

    const/4 v10, 0x1

    const/4 v8, 0x0

    const/4 v5, 0x0

    sget v0, Lcom/fodlam/yds/OxfordApplication;->g:I

    mul-int/lit16 v0, v0, 0x3fc

    sget v1, Lcom/fodlam/yds/OxfordApplication;->j:I

    mul-int/lit8 v1, v1, 0xf

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, 0xf

    const-string v3, "id =?"

    new-array v4, v10, [Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v0}, Lcom/fodlam/yds/utility/c;->c(I)I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v4, v8

    iget-object v0, p0, Lcom/fodlam/yds/c/b;->d:Lnet/sqlcipher/database/SQLiteDatabase;

    const-string v1, "word"

    const/16 v2, 0x8

    new-array v2, v2, [Ljava/lang/String;

    const-string v6, "id"

    aput-object v6, v2, v8

    const-string v6, "category"

    aput-object v6, v2, v10

    const-string v6, "categoryorder"

    aput-object v6, v2, v11

    const-string v6, "word"

    aput-object v6, v2, v12

    const/4 v6, 0x4

    const-string v7, "type"

    aput-object v7, v2, v6

    const/4 v6, 0x5

    const-string v7, "def_en"

    aput-object v7, v2, v6

    const/4 v6, 0x6

    const-string v7, "def_tr"

    aput-object v7, v2, v6

    const/4 v6, 0x7

    const-string v7, "test"

    aput-object v7, v2, v6

    move-object v6, v5

    move-object v7, v5

    invoke-virtual/range {v0 .. v7}, Lnet/sqlcipher/database/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnet/sqlcipher/Cursor;

    move-result-object v9

    invoke-interface {v9}, Lnet/sqlcipher/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/fodlam/yds/f/h;

    invoke-interface {v9, v8}, Lnet/sqlcipher/Cursor;->getInt(I)I

    move-result v1

    invoke-interface {v9, v10}, Lnet/sqlcipher/Cursor;->getInt(I)I

    move-result v2

    invoke-interface {v9, v11}, Lnet/sqlcipher/Cursor;->getInt(I)I

    move-result v3

    invoke-interface {v9, v12}, Lnet/sqlcipher/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x4

    invoke-interface {v9, v5}, Lnet/sqlcipher/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x5

    invoke-interface {v9, v6}, Lnet/sqlcipher/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x6

    invoke-interface {v9, v7}, Lnet/sqlcipher/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x7

    invoke-interface {v9, v8}, Lnet/sqlcipher/Cursor;->getInt(I)I

    move-result v8

    invoke-direct/range {v0 .. v8}, Lcom/fodlam/yds/f/h;-><init>(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    :goto_0
    invoke-interface {v9}, Lnet/sqlcipher/Cursor;->close()V

    return-object v0

    :cond_0
    move-object v0, v5

    goto :goto_0
.end method

.method public g()Lcom/fodlam/yds/f/b;
    .locals 2

    iget-object v0, p0, Lcom/fodlam/yds/c/b;->f:[Lcom/fodlam/yds/f/b;

    sget v1, Lcom/fodlam/yds/OxfordApplication;->g:I

    aget-object v0, v0, v1

    return-object v0
.end method

.method public declared-synchronized h()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    iput-object v0, p0, Lcom/fodlam/yds/c/b;->f:[Lcom/fodlam/yds/f/b;

    const/4 v0, 0x0

    sput-object v0, Lcom/fodlam/yds/c/b;->c:Lcom/fodlam/yds/c/b;

    iget-object v0, p0, Lcom/fodlam/yds/c/b;->d:Lnet/sqlcipher/database/SQLiteDatabase;

    invoke-virtual {v0}, Lnet/sqlcipher/database/SQLiteDatabase;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    :try_start_1
    invoke-static {}, Lnet/sqlcipher/database/SQLiteDatabase;->releaseMemory()I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    monitor-exit p0

    return-void

    :catch_0
    move-exception v0

    goto :goto_1

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :catch_1
    move-exception v0

    goto :goto_0
.end method

.method public i()Ljava/util/ArrayList;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/fodlam/yds/f/d;",
            ">;"
        }
    .end annotation

    const/4 v9, 0x4

    const/4 v2, 0x0

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lcom/fodlam/yds/c/b;->b()Lcom/fodlam/yds/f/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fodlam/yds/f/g;->f()Ljava/util/ArrayList;

    move-result-object v5

    invoke-static {v5}, Ljava/util/Collections;->shuffle(Ljava/util/List;)V

    move v1, v2

    :goto_0
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_5

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    move v0, v2

    :goto_1
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ge v0, v6, :cond_1

    if-eq v0, v1, :cond_0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    invoke-static {v3}, Ljava/util/Collections;->shuffle(Ljava/util/List;)V

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    move v0, v2

    :goto_2
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v7

    invoke-static {v7, v9}, Ljava/lang/Math;->min(II)I

    move-result v7

    if-ge v0, v7, :cond_2

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v0

    move v3, v0

    :goto_3
    if-ge v3, v9, :cond_3

    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fodlam/yds/f/h;

    iget v0, v0, Lcom/fodlam/yds/f/h;->d:I

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/c/b;->a(I)Lcom/fodlam/yds/f/h;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_3

    :cond_3
    invoke-static {v6}, Ljava/util/Collections;->shuffle(Ljava/util/List;)V

    invoke-static {v9}, Lcom/fodlam/yds/utility/c;->c(I)I

    move-result v7

    new-array v8, v9, [Lcom/fodlam/yds/f/h;

    move v3, v2

    :goto_4
    array-length v0, v8

    if-ge v3, v0, :cond_4

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fodlam/yds/f/h;

    aput-object v0, v8, v3

    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_4

    :cond_4
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fodlam/yds/f/h;

    aput-object v0, v8, v7

    new-instance v0, Lcom/fodlam/yds/f/d;

    invoke-direct {v0, v8, v7}, Lcom/fodlam/yds/f/d;-><init>([Lcom/fodlam/yds/f/h;I)V

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto/16 :goto_0

    :cond_5
    sget-boolean v0, Lcom/fodlam/yds/OxfordApplication;->f:Z

    if-eqz v0, :cond_6

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    new-instance v1, Lcom/fodlam/yds/f/d;

    invoke-direct {v1}, Lcom/fodlam/yds/f/d;-><init>()V

    invoke-virtual {v4, v0, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    :cond_6
    return-object v4
.end method

.method public j()V
    .locals 2

    iget-object v0, p0, Lcom/fodlam/yds/c/b;->f:[Lcom/fodlam/yds/f/b;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    check-cast v0, Lcom/fodlam/yds/f/c;

    invoke-virtual {v0}, Lcom/fodlam/yds/f/c;->j()V

    return-void
.end method

.method public k()Ljava/util/ArrayList;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/fodlam/yds/f/h;",
            ">;"
        }
    .end annotation

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lcom/fodlam/yds/c/b;->c()Ljava/util/ArrayList;

    move-result-object v0

    iget-object v2, p0, Lcom/fodlam/yds/c/b;->e:Landroid/content/Context;

    invoke-static {v2}, Lcom/fodlam/yds/c/a;->a(Landroid/content/Context;)Lcom/fodlam/yds/c/a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fodlam/yds/c/a;->i()Ljava/util/HashSet;

    move-result-object v2

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fodlam/yds/f/h;

    iget v4, v0, Lcom/fodlam/yds/f/h;->c:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v1
.end method
