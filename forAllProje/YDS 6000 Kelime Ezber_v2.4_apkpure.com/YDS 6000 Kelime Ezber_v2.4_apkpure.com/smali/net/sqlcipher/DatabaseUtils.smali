.class public Lnet/sqlcipher/DatabaseUtils;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/sqlcipher/DatabaseUtils$InsertHelper;
    }
.end annotation


# static fields
.field private static final DEBUG:Z = false

.field private static final HEX_DIGITS_LOWER:[C

.field private static final LOCAL_LOGV:Z = false

.field private static final TAG:Ljava/lang/String; = "DatabaseUtils"

.field private static final countProjection:[Ljava/lang/String;

.field private static mColl:Ljava/text/Collator;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "count(*)"

    aput-object v2, v0, v1

    sput-object v0, Lnet/sqlcipher/DatabaseUtils;->countProjection:[Ljava/lang/String;

    const/16 v0, 0x10

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, Lnet/sqlcipher/DatabaseUtils;->HEX_DIGITS_LOWER:[C

    const/4 v0, 0x0

    sput-object v0, Lnet/sqlcipher/DatabaseUtils;->mColl:Ljava/text/Collator;

    return-void

    nop

    :array_0
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x61s
        0x62s
        0x63s
        0x64s
        0x65s
        0x66s
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static appendEscapedSQLString(Ljava/lang/StringBuilder;Ljava/lang/String;)V
    .locals 4

    const/16 v3, 0x27

    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_2

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-ne v2, v3, :cond_0

    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method

.method public static final appendValueToSql(Ljava/lang/StringBuilder;Ljava/lang/Object;)V
    .locals 1

    if-nez p1, :cond_0

    const-string v0, "NULL"

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    return-void

    :cond_0
    instance-of v0, p1, Ljava/lang/Boolean;

    if-eqz v0, :cond_2

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0x31

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    const/16 v0, 0x30

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lnet/sqlcipher/DatabaseUtils;->appendEscapedSQLString(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public static bindObjectToProgram(Lnet/sqlcipher/database/SQLiteProgram;ILjava/lang/Object;)V
    .locals 2

    if-nez p2, :cond_0

    invoke-virtual {p0, p1}, Lnet/sqlcipher/database/SQLiteProgram;->bindNull(I)V

    :goto_0
    return-void

    :cond_0
    instance-of v0, p2, Ljava/lang/Double;

    if-nez v0, :cond_1

    instance-of v0, p2, Ljava/lang/Float;

    if-eqz v0, :cond_2

    :cond_1
    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, Lnet/sqlcipher/database/SQLiteProgram;->bindDouble(ID)V

    goto :goto_0

    :cond_2
    instance-of v0, p2, Ljava/lang/Number;

    if-eqz v0, :cond_3

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, Lnet/sqlcipher/database/SQLiteProgram;->bindLong(IJ)V

    goto :goto_0

    :cond_3
    instance-of v0, p2, Ljava/lang/Boolean;

    if-eqz v0, :cond_5

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_4

    const-wide/16 v0, 0x1

    invoke-virtual {p0, p1, v0, v1}, Lnet/sqlcipher/database/SQLiteProgram;->bindLong(IJ)V

    goto :goto_0

    :cond_4
    const-wide/16 v0, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lnet/sqlcipher/database/SQLiteProgram;->bindLong(IJ)V

    goto :goto_0

    :cond_5
    instance-of v0, p2, [B

    if-eqz v0, :cond_6

    check-cast p2, [B

    check-cast p2, [B

    invoke-virtual {p0, p1, p2}, Lnet/sqlcipher/database/SQLiteProgram;->bindBlob(I[B)V

    goto :goto_0

    :cond_6
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lnet/sqlcipher/database/SQLiteProgram;->bindString(ILjava/lang/String;)V

    goto :goto_0
.end method

.method public static concatenateWhere(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    return-object p1

    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    move-object p1, p0

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ") AND ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0
.end method

.method public static cursorDoubleToContentValues(Lnet/sqlcipher/Cursor;Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;)V
    .locals 2

    invoke-interface {p0, p1}, Lnet/sqlcipher/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Lnet/sqlcipher/Cursor;->isNull(I)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {p0, v0}, Lnet/sqlcipher/Cursor;->getDouble(I)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {p2, p3, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Double;)V

    :goto_0
    return-void

    :cond_0
    const/4 v0, 0x0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {p2, p3, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Double;)V

    goto :goto_0
.end method

.method public static cursorDoubleToContentValuesIfPresent(Lnet/sqlcipher/Cursor;Landroid/content/ContentValues;Ljava/lang/String;)V
    .locals 2

    invoke-interface {p0, p2}, Lnet/sqlcipher/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Lnet/sqlcipher/Cursor;->isNull(I)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {p0, v0}, Lnet/sqlcipher/Cursor;->getDouble(I)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Double;)V

    :cond_0
    return-void
.end method

.method public static cursorDoubleToCursorValues(Lnet/sqlcipher/Cursor;Ljava/lang/String;Landroid/content/ContentValues;)V
    .locals 0

    invoke-static {p0, p1, p2, p1}, Lnet/sqlcipher/DatabaseUtils;->cursorDoubleToContentValues(Lnet/sqlcipher/Cursor;Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;)V

    return-void
.end method

.method public static cursorFillWindow(Lnet/sqlcipher/Cursor;ILandroid/database/CursorWindow;)V
    .locals 6

    if-ltz p1, :cond_0

    invoke-interface {p0}, Lnet/sqlcipher/Cursor;->getCount()I

    move-result v0

    if-lt p1, v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-interface {p0}, Lnet/sqlcipher/Cursor;->getPosition()I

    move-result v2

    invoke-interface {p0}, Lnet/sqlcipher/Cursor;->getColumnCount()I

    move-result v3

    invoke-virtual {p2}, Landroid/database/CursorWindow;->clear()V

    invoke-virtual {p2, p1}, Landroid/database/CursorWindow;->setStartPosition(I)V

    invoke-virtual {p2, v3}, Landroid/database/CursorWindow;->setNumColumns(I)Z

    invoke-interface {p0, p1}, Lnet/sqlcipher/Cursor;->moveToPosition(I)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    invoke-virtual {p2}, Landroid/database/CursorWindow;->allocRow()Z

    move-result v0

    if-nez v0, :cond_4

    :cond_3
    :goto_1
    invoke-interface {p0, v2}, Lnet/sqlcipher/Cursor;->moveToPosition(I)Z

    goto :goto_0

    :cond_4
    const/4 v0, 0x0

    move v1, v0

    :goto_2
    if-ge v1, v3, :cond_5

    invoke-interface {p0, v1}, Lnet/sqlcipher/Cursor;->getType(I)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    invoke-interface {p0, v1}, Lnet/sqlcipher/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {p2, v0, p1, v1}, Landroid/database/CursorWindow;->putString(Ljava/lang/String;II)Z

    move-result v0

    :goto_3
    if-nez v0, :cond_8

    invoke-virtual {p2}, Landroid/database/CursorWindow;->freeLastRow()V

    :cond_5
    add-int/lit8 p1, p1, 0x1

    invoke-interface {p0}, Lnet/sqlcipher/Cursor;->moveToNext()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :pswitch_1
    invoke-virtual {p2, p1, v1}, Landroid/database/CursorWindow;->putNull(II)Z

    move-result v0

    goto :goto_3

    :pswitch_2
    invoke-interface {p0, v1}, Lnet/sqlcipher/Cursor;->getLong(I)J

    move-result-wide v4

    invoke-virtual {p2, v4, v5, p1, v1}, Landroid/database/CursorWindow;->putLong(JII)Z

    move-result v0

    goto :goto_3

    :pswitch_3
    invoke-interface {p0, v1}, Lnet/sqlcipher/Cursor;->getDouble(I)D

    move-result-wide v4

    invoke-virtual {p2, v4, v5, p1, v1}, Landroid/database/CursorWindow;->putDouble(DII)Z

    move-result v0

    goto :goto_3

    :pswitch_4
    invoke-interface {p0, v1}, Lnet/sqlcipher/Cursor;->getBlob(I)[B

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {p2, v0, p1, v1}, Landroid/database/CursorWindow;->putBlob([BII)Z

    move-result v0

    goto :goto_3

    :cond_6
    invoke-virtual {p2, p1, v1}, Landroid/database/CursorWindow;->putNull(II)Z

    move-result v0

    goto :goto_3

    :cond_7
    invoke-virtual {p2, p1, v1}, Landroid/database/CursorWindow;->putNull(II)Z

    move-result v0

    goto :goto_3

    :cond_8
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_0
        :pswitch_4
    .end packed-switch
.end method

.method public static cursorFloatToContentValuesIfPresent(Lnet/sqlcipher/Cursor;Landroid/content/ContentValues;Ljava/lang/String;)V
    .locals 2

    invoke-interface {p0, p2}, Lnet/sqlcipher/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Lnet/sqlcipher/Cursor;->isNull(I)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {p0, v0}, Lnet/sqlcipher/Cursor;->getFloat(I)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Float;)V

    :cond_0
    return-void
.end method

.method public static cursorIntToContentValues(Lnet/sqlcipher/Cursor;Ljava/lang/String;Landroid/content/ContentValues;)V
    .locals 0

    invoke-static {p0, p1, p2, p1}, Lnet/sqlcipher/DatabaseUtils;->cursorIntToContentValues(Lnet/sqlcipher/Cursor;Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;)V

    return-void
.end method

.method public static cursorIntToContentValues(Lnet/sqlcipher/Cursor;Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;)V
    .locals 2

    invoke-interface {p0, p1}, Lnet/sqlcipher/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Lnet/sqlcipher/Cursor;->isNull(I)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {p0, v0}, Lnet/sqlcipher/Cursor;->getInt(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p2, p3, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    :goto_0
    return-void

    :cond_0
    const/4 v0, 0x0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {p2, p3, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    goto :goto_0
.end method

.method public static cursorIntToContentValuesIfPresent(Lnet/sqlcipher/Cursor;Landroid/content/ContentValues;Ljava/lang/String;)V
    .locals 2

    invoke-interface {p0, p2}, Lnet/sqlcipher/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Lnet/sqlcipher/Cursor;->isNull(I)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {p0, v0}, Lnet/sqlcipher/Cursor;->getInt(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    :cond_0
    return-void
.end method

.method public static cursorLongToContentValues(Lnet/sqlcipher/Cursor;Ljava/lang/String;Landroid/content/ContentValues;)V
    .locals 0

    invoke-static {p0, p1, p2, p1}, Lnet/sqlcipher/DatabaseUtils;->cursorLongToContentValues(Lnet/sqlcipher/Cursor;Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;)V

    return-void
.end method

.method public static cursorLongToContentValues(Lnet/sqlcipher/Cursor;Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;)V
    .locals 2

    invoke-interface {p0, p1}, Lnet/sqlcipher/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Lnet/sqlcipher/Cursor;->isNull(I)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {p0, v0}, Lnet/sqlcipher/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p2, p3, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    :goto_0
    return-void

    :cond_0
    const/4 v0, 0x0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {p2, p3, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    goto :goto_0
.end method

.method public static cursorLongToContentValuesIfPresent(Lnet/sqlcipher/Cursor;Landroid/content/ContentValues;Ljava/lang/String;)V
    .locals 2

    invoke-interface {p0, p2}, Lnet/sqlcipher/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Lnet/sqlcipher/Cursor;->isNull(I)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {p0, v0}, Lnet/sqlcipher/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    :cond_0
    return-void
.end method

.method public static cursorRowToContentValues(Lnet/sqlcipher/Cursor;Landroid/content/ContentValues;)V
    .locals 6

    instance-of v0, p0, Lnet/sqlcipher/AbstractWindowedCursor;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lnet/sqlcipher/AbstractWindowedCursor;

    :goto_0
    invoke-interface {p0}, Lnet/sqlcipher/Cursor;->getColumnNames()[Ljava/lang/String;

    move-result-object v2

    array-length v3, v2

    const/4 v1, 0x0

    :goto_1
    if-ge v1, v3, :cond_2

    if-eqz v0, :cond_1

    invoke-virtual {v0, v1}, Lnet/sqlcipher/AbstractWindowedCursor;->isBlob(I)Z

    move-result v4

    if-eqz v4, :cond_1

    aget-object v4, v2, v1

    invoke-interface {p0, v1}, Lnet/sqlcipher/Cursor;->getBlob(I)[B

    move-result-object v5

    invoke-virtual {p1, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    aget-object v4, v2, v1

    invoke-interface {p0, v1}, Lnet/sqlcipher/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    return-void
.end method

.method public static cursorShortToContentValuesIfPresent(Lnet/sqlcipher/Cursor;Landroid/content/ContentValues;Ljava/lang/String;)V
    .locals 2

    invoke-interface {p0, p2}, Lnet/sqlcipher/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Lnet/sqlcipher/Cursor;->isNull(I)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {p0, v0}, Lnet/sqlcipher/Cursor;->getShort(I)S

    move-result v0

    invoke-static {v0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Short;)V

    :cond_0
    return-void
.end method

.method public static cursorStringToContentValues(Lnet/sqlcipher/Cursor;Ljava/lang/String;Landroid/content/ContentValues;)V
    .locals 0

    invoke-static {p0, p1, p2, p1}, Lnet/sqlcipher/DatabaseUtils;->cursorStringToContentValues(Lnet/sqlcipher/Cursor;Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;)V

    return-void
.end method

.method public static cursorStringToContentValues(Lnet/sqlcipher/Cursor;Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;)V
    .locals 1

    invoke-interface {p0, p1}, Lnet/sqlcipher/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Lnet/sqlcipher/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, p3, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static cursorStringToContentValuesIfPresent(Lnet/sqlcipher/Cursor;Landroid/content/ContentValues;Ljava/lang/String;)V
    .locals 2

    invoke-interface {p0, p2}, Lnet/sqlcipher/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Lnet/sqlcipher/Cursor;->isNull(I)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {p0, v0}, Lnet/sqlcipher/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static cursorStringToInsertHelper(Lnet/sqlcipher/Cursor;Ljava/lang/String;Lnet/sqlcipher/DatabaseUtils$InsertHelper;I)V
    .locals 1

    invoke-interface {p0, p1}, Lnet/sqlcipher/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Lnet/sqlcipher/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, p3, v0}, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->bind(ILjava/lang/String;)V

    return-void
.end method

.method public static dumpCurrentRow(Lnet/sqlcipher/Cursor;)V
    .locals 1

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-static {p0, v0}, Lnet/sqlcipher/DatabaseUtils;->dumpCurrentRow(Lnet/sqlcipher/Cursor;Ljava/io/PrintStream;)V

    return-void
.end method

.method public static dumpCurrentRow(Lnet/sqlcipher/Cursor;Ljava/io/PrintStream;)V
    .locals 6

    invoke-interface {p0}, Lnet/sqlcipher/Cursor;->getColumnNames()[Ljava/lang/String;

    move-result-object v2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-interface {p0}, Lnet/sqlcipher/Cursor;->getPosition()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " {"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    array-length v3, v2

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v3, :cond_0

    :try_start_0
    invoke-interface {p0, v1}, Lnet/sqlcipher/Cursor;->getString(I)Ljava/lang/String;
    :try_end_0
    .catch Lnet/sqlcipher/database/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_1
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "   "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    aget-object v5, v2, v1

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const/16 v5, 0x3d

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v0, "<unprintable>"

    goto :goto_1

    :cond_0
    const-string v0, "}"

    invoke-virtual {p1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return-void
.end method

.method public static dumpCurrentRow(Lnet/sqlcipher/Cursor;Ljava/lang/StringBuilder;)V
    .locals 6

    invoke-interface {p0}, Lnet/sqlcipher/Cursor;->getColumnNames()[Ljava/lang/String;

    move-result-object v2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-interface {p0}, Lnet/sqlcipher/Cursor;->getPosition()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " {\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length v3, v2

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v3, :cond_0

    :try_start_0
    invoke-interface {p0, v1}, Lnet/sqlcipher/Cursor;->getString(I)Ljava/lang/String;
    :try_end_0
    .catch Lnet/sqlcipher/database/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_1
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "   "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    aget-object v5, v2, v1

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const/16 v5, 0x3d

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, "\n"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v0, "<unprintable>"

    goto :goto_1

    :cond_0
    const-string v0, "}\n"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public static dumpCurrentRowToString(Lnet/sqlcipher/Cursor;)Ljava/lang/String;
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0, v0}, Lnet/sqlcipher/DatabaseUtils;->dumpCurrentRow(Lnet/sqlcipher/Cursor;Ljava/lang/StringBuilder;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static dumpCursor(Lnet/sqlcipher/Cursor;)V
    .locals 1

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-static {p0, v0}, Lnet/sqlcipher/DatabaseUtils;->dumpCursor(Lnet/sqlcipher/Cursor;Ljava/io/PrintStream;)V

    return-void
.end method

.method public static dumpCursor(Lnet/sqlcipher/Cursor;Ljava/io/PrintStream;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ">>>>> Dumping cursor "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    if-eqz p0, :cond_1

    invoke-interface {p0}, Lnet/sqlcipher/Cursor;->getPosition()I

    move-result v0

    const/4 v1, -0x1

    invoke-interface {p0, v1}, Lnet/sqlcipher/Cursor;->moveToPosition(I)Z

    :goto_0
    invoke-interface {p0}, Lnet/sqlcipher/Cursor;->moveToNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p0, p1}, Lnet/sqlcipher/DatabaseUtils;->dumpCurrentRow(Lnet/sqlcipher/Cursor;Ljava/io/PrintStream;)V

    goto :goto_0

    :cond_0
    invoke-interface {p0, v0}, Lnet/sqlcipher/Cursor;->moveToPosition(I)Z

    :cond_1
    const-string v0, "<<<<<"

    invoke-virtual {p1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return-void
.end method

.method public static dumpCursor(Lnet/sqlcipher/Cursor;Ljava/lang/StringBuilder;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ">>>>> Dumping cursor "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p0, :cond_1

    invoke-interface {p0}, Lnet/sqlcipher/Cursor;->getPosition()I

    move-result v0

    const/4 v1, -0x1

    invoke-interface {p0, v1}, Lnet/sqlcipher/Cursor;->moveToPosition(I)Z

    :goto_0
    invoke-interface {p0}, Lnet/sqlcipher/Cursor;->moveToNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p0, p1}, Lnet/sqlcipher/DatabaseUtils;->dumpCurrentRow(Lnet/sqlcipher/Cursor;Ljava/lang/StringBuilder;)V

    goto :goto_0

    :cond_0
    invoke-interface {p0, v0}, Lnet/sqlcipher/Cursor;->moveToPosition(I)Z

    :cond_1
    const-string v0, "<<<<<\n"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public static dumpCursorToString(Lnet/sqlcipher/Cursor;)Ljava/lang/String;
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0, v0}, Lnet/sqlcipher/DatabaseUtils;->dumpCursor(Lnet/sqlcipher/Cursor;Ljava/lang/StringBuilder;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static encodeHex([B[C)[C
    .locals 6

    const/4 v0, 0x0

    array-length v2, p0

    shl-int/lit8 v1, v2, 0x1

    new-array v3, v1, [C

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_0

    add-int/lit8 v4, v0, 0x1

    aget-byte v5, p0, v1

    and-int/lit16 v5, v5, 0xf0

    ushr-int/lit8 v5, v5, 0x4

    aget-char v5, p1, v5

    aput-char v5, v3, v0

    add-int/lit8 v0, v4, 0x1

    aget-byte v5, p0, v1

    and-int/lit8 v5, v5, 0xf

    aget-char v5, p1, v5

    aput-char v5, v3, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v3
.end method

.method public static getCollationKey(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    invoke-static {p0}, Lnet/sqlcipher/DatabaseUtils;->getCollationKeyInBytes(Ljava/lang/String;)[B

    move-result-object v1

    :try_start_0
    new-instance v0, Ljava/lang/String;

    const/4 v2, 0x0

    invoke-static {v1}, Lnet/sqlcipher/DatabaseUtils;->getKeyLen([B)I

    move-result v3

    const-string v4, "ISO8859_1"

    invoke-direct {v0, v1, v2, v3, v4}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v0, ""

    goto :goto_0
.end method

.method private static getCollationKeyInBytes(Ljava/lang/String;)[B
    .locals 2

    sget-object v0, Lnet/sqlcipher/DatabaseUtils;->mColl:Ljava/text/Collator;

    if-nez v0, :cond_0

    invoke-static {}, Ljava/text/Collator;->getInstance()Ljava/text/Collator;

    move-result-object v0

    sput-object v0, Lnet/sqlcipher/DatabaseUtils;->mColl:Ljava/text/Collator;

    sget-object v0, Lnet/sqlcipher/DatabaseUtils;->mColl:Ljava/text/Collator;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/text/Collator;->setStrength(I)V

    :cond_0
    sget-object v0, Lnet/sqlcipher/DatabaseUtils;->mColl:Ljava/text/Collator;

    invoke-virtual {v0, p0}, Ljava/text/Collator;->getCollationKey(Ljava/lang/String;)Ljava/text/CollationKey;

    move-result-object v0

    invoke-virtual {v0}, Ljava/text/CollationKey;->toByteArray()[B

    move-result-object v0

    return-object v0
.end method

.method public static getHexCollationKey(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    invoke-static {p0}, Lnet/sqlcipher/DatabaseUtils;->getCollationKeyInBytes(Ljava/lang/String;)[B

    move-result-object v0

    sget-object v1, Lnet/sqlcipher/DatabaseUtils;->HEX_DIGITS_LOWER:[C

    invoke-static {v0, v1}, Lnet/sqlcipher/DatabaseUtils;->encodeHex([B[C)[C

    move-result-object v1

    new-instance v2, Ljava/lang/String;

    const/4 v3, 0x0

    invoke-static {v0}, Lnet/sqlcipher/DatabaseUtils;->getKeyLen([B)I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    invoke-direct {v2, v1, v3, v0}, Ljava/lang/String;-><init>([CII)V

    return-object v2
.end method

.method private static getKeyLen([B)I
    .locals 1

    array-length v0, p0

    add-int/lit8 v0, v0, -0x1

    aget-byte v0, p0, v0

    if-eqz v0, :cond_0

    array-length v0, p0

    :goto_0
    return v0

    :cond_0
    array-length v0, p0

    add-int/lit8 v0, v0, -0x1

    goto :goto_0
.end method

.method public static getTypeOfObject(Ljava/lang/Object;)I
    .locals 1

    if-nez p0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    instance-of v0, p0, [B

    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_0

    :cond_1
    instance-of v0, p0, Ljava/lang/Float;

    if-nez v0, :cond_2

    instance-of v0, p0, Ljava/lang/Double;

    if-eqz v0, :cond_3

    :cond_2
    const/4 v0, 0x2

    goto :goto_0

    :cond_3
    instance-of v0, p0, Ljava/lang/Long;

    if-nez v0, :cond_4

    instance-of v0, p0, Ljava/lang/Integer;

    if-eqz v0, :cond_5

    :cond_4
    const/4 v0, 0x1

    goto :goto_0

    :cond_5
    const/4 v0, 0x3

    goto :goto_0
.end method

.method public static longForQuery(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;[Ljava/lang/String;)J
    .locals 4

    invoke-virtual {p0, p1}, Lnet/sqlcipher/database/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Lnet/sqlcipher/database/SQLiteStatement;

    move-result-object v0

    :try_start_0
    invoke-static {v0, p2}, Lnet/sqlcipher/DatabaseUtils;->longForQuery(Lnet/sqlcipher/database/SQLiteStatement;[Ljava/lang/String;)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v2

    invoke-virtual {v0}, Lnet/sqlcipher/database/SQLiteStatement;->close()V

    return-wide v2

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Lnet/sqlcipher/database/SQLiteStatement;->close()V

    throw v1
.end method

.method public static longForQuery(Lnet/sqlcipher/database/SQLiteStatement;[Ljava/lang/String;)J
    .locals 4

    if-eqz p1, :cond_0

    array-length v1, p1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_0

    add-int/lit8 v2, v0, 0x1

    aget-object v3, p1, v0

    invoke-static {p0, v2, v3}, Lnet/sqlcipher/DatabaseUtils;->bindObjectToProgram(Lnet/sqlcipher/database/SQLiteProgram;ILjava/lang/Object;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteStatement;->simpleQueryForLong()J

    move-result-wide v0

    return-wide v0
.end method

.method public static queryNumEntries(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)J
    .locals 8

    const/4 v3, 0x0

    sget-object v2, Lnet/sqlcipher/DatabaseUtils;->countProjection:[Ljava/lang/String;

    move-object v0, p0

    move-object v1, p1

    move-object v4, v3

    move-object v5, v3

    move-object v6, v3

    move-object v7, v3

    invoke-virtual/range {v0 .. v7}, Lnet/sqlcipher/database/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnet/sqlcipher/Cursor;

    move-result-object v1

    :try_start_0
    invoke-interface {v1}, Lnet/sqlcipher/Cursor;->moveToFirst()Z

    const/4 v0, 0x0

    invoke-interface {v1, v0}, Lnet/sqlcipher/Cursor;->getLong(I)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v2

    invoke-interface {v1}, Lnet/sqlcipher/Cursor;->close()V

    return-wide v2

    :catchall_0
    move-exception v0

    invoke-interface {v1}, Lnet/sqlcipher/Cursor;->close()V

    throw v0
.end method

.method public static final readExceptionFromParcel(Landroid/os/Parcel;)V
    .locals 2

    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v1, v0}, Lnet/sqlcipher/DatabaseUtils;->readExceptionFromParcel(Landroid/os/Parcel;Ljava/lang/String;I)V

    goto :goto_0
.end method

.method private static final readExceptionFromParcel(Landroid/os/Parcel;Ljava/lang/String;I)V
    .locals 1

    packed-switch p2, :pswitch_data_0

    invoke-virtual {p0, p2, p1}, Landroid/os/Parcel;->readException(ILjava/lang/String;)V

    return-void

    :pswitch_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_2
    new-instance v0, Lnet/sqlcipher/database/SQLiteAbortException;

    invoke-direct {v0, p1}, Lnet/sqlcipher/database/SQLiteAbortException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_3
    new-instance v0, Lnet/sqlcipher/database/SQLiteConstraintException;

    invoke-direct {v0, p1}, Lnet/sqlcipher/database/SQLiteConstraintException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_4
    new-instance v0, Lnet/sqlcipher/database/SQLiteDatabaseCorruptException;

    invoke-direct {v0, p1}, Lnet/sqlcipher/database/SQLiteDatabaseCorruptException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_5
    new-instance v0, Lnet/sqlcipher/database/SQLiteFullException;

    invoke-direct {v0, p1}, Lnet/sqlcipher/database/SQLiteFullException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_6
    new-instance v0, Lnet/sqlcipher/database/SQLiteDiskIOException;

    invoke-direct {v0, p1}, Lnet/sqlcipher/database/SQLiteDiskIOException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_7
    new-instance v0, Lnet/sqlcipher/database/SQLiteException;

    invoke-direct {v0, p1}, Lnet/sqlcipher/database/SQLiteException;-><init>(Ljava/lang/String;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
    .end packed-switch
.end method

.method public static readExceptionWithFileNotFoundExceptionFromParcel(Landroid/os/Parcel;)V
    .locals 3

    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    new-instance v0, Ljava/io/FileNotFoundException;

    invoke-direct {v0, v1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static {p0, v1, v0}, Lnet/sqlcipher/DatabaseUtils;->readExceptionFromParcel(Landroid/os/Parcel;Ljava/lang/String;I)V

    goto :goto_0
.end method

.method public static readExceptionWithOperationApplicationExceptionFromParcel(Landroid/os/Parcel;)V
    .locals 3

    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0xa

    if-ne v0, v2, :cond_1

    new-instance v0, Landroid/content/OperationApplicationException;

    invoke-direct {v0, v1}, Landroid/content/OperationApplicationException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static {p0, v1, v0}, Lnet/sqlcipher/DatabaseUtils;->readExceptionFromParcel(Landroid/os/Parcel;Ljava/lang/String;I)V

    goto :goto_0
.end method

.method public static sqlEscapeString(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v0, p0}, Lnet/sqlcipher/DatabaseUtils;->appendEscapedSQLString(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static stringForQuery(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p0, p1}, Lnet/sqlcipher/database/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Lnet/sqlcipher/database/SQLiteStatement;

    move-result-object v0

    :try_start_0
    invoke-static {v0, p2}, Lnet/sqlcipher/DatabaseUtils;->stringForQuery(Lnet/sqlcipher/database/SQLiteStatement;[Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v1

    invoke-virtual {v0}, Lnet/sqlcipher/database/SQLiteStatement;->close()V

    return-object v1

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Lnet/sqlcipher/database/SQLiteStatement;->close()V

    throw v1
.end method

.method public static stringForQuery(Lnet/sqlcipher/database/SQLiteStatement;[Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    if-eqz p1, :cond_0

    array-length v1, p1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_0

    add-int/lit8 v2, v0, 0x1

    aget-object v3, p1, v0

    invoke-static {p0, v2, v3}, Lnet/sqlcipher/DatabaseUtils;->bindObjectToProgram(Lnet/sqlcipher/database/SQLiteProgram;ILjava/lang/Object;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteStatement;->simpleQueryForString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static final writeExceptionToParcel(Landroid/os/Parcel;Ljava/lang/Exception;)V
    .locals 3

    const/4 v1, 0x1

    instance-of v0, p1, Ljava/io/FileNotFoundException;

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    if-eqz v0, :cond_0

    const-string v0, "DatabaseUtils"

    const-string v1, "Writing exception to parcel"

    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    :goto_1
    return-void

    :cond_1
    instance-of v0, p1, Ljava/lang/IllegalArgumentException;

    if-eqz v0, :cond_2

    const/4 v0, 0x2

    move v2, v1

    move v1, v0

    move v0, v2

    goto :goto_0

    :cond_2
    instance-of v0, p1, Ljava/lang/UnsupportedOperationException;

    if-eqz v0, :cond_3

    const/4 v0, 0x3

    move v2, v1

    move v1, v0

    move v0, v2

    goto :goto_0

    :cond_3
    instance-of v0, p1, Lnet/sqlcipher/database/SQLiteAbortException;

    if-eqz v0, :cond_4

    const/4 v0, 0x4

    move v2, v1

    move v1, v0

    move v0, v2

    goto :goto_0

    :cond_4
    instance-of v0, p1, Lnet/sqlcipher/database/SQLiteConstraintException;

    if-eqz v0, :cond_5

    const/4 v0, 0x5

    move v2, v1

    move v1, v0

    move v0, v2

    goto :goto_0

    :cond_5
    instance-of v0, p1, Lnet/sqlcipher/database/SQLiteDatabaseCorruptException;

    if-eqz v0, :cond_6

    const/4 v0, 0x6

    move v2, v1

    move v1, v0

    move v0, v2

    goto :goto_0

    :cond_6
    instance-of v0, p1, Lnet/sqlcipher/database/SQLiteFullException;

    if-eqz v0, :cond_7

    const/4 v0, 0x7

    move v2, v1

    move v1, v0

    move v0, v2

    goto :goto_0

    :cond_7
    instance-of v0, p1, Lnet/sqlcipher/database/SQLiteDiskIOException;

    if-eqz v0, :cond_8

    const/16 v0, 0x8

    move v2, v1

    move v1, v0

    move v0, v2

    goto :goto_0

    :cond_8
    instance-of v0, p1, Lnet/sqlcipher/database/SQLiteException;

    if-eqz v0, :cond_9

    const/16 v0, 0x9

    move v2, v1

    move v1, v0

    move v0, v2

    goto :goto_0

    :cond_9
    instance-of v0, p1, Landroid/content/OperationApplicationException;

    if-eqz v0, :cond_a

    const/16 v0, 0xa

    move v2, v1

    move v1, v0

    move v0, v2

    goto :goto_0

    :cond_a
    invoke-virtual {p0, p1}, Landroid/os/Parcel;->writeException(Ljava/lang/Exception;)V

    const-string v0, "DatabaseUtils"

    const-string v1, "Writing exception to parcel"

    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1
.end method
