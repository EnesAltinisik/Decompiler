.class public final enum Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;
.super Ljava/lang/Enum;
.source "DateTimeTool.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pinarsu/siparis/tools/DateTimeTool;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "DATETIMEFORMAT"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

.field public static final enum AROX:Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

.field public static final enum AROX2:Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

.field public static final enum DATESLASH:Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

.field public static final enum DATETIME:Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

.field public static final enum EKMOB:Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

.field public static final enum ONLYDATE:Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

.field public static final enum ONLYDATE_INT:Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

.field public static final enum ONLYTIME:Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

.field public static final enum ONLYTIME_WITHOUT_SECOND:Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

.field public static final enum TIMEDATE:Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

.field public static final enum TIMEDATESLASH:Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

.field public static final enum TIMEDATESLASH_AM_PM:Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

.field public static final enum TIMEDATE_SHORT:Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;


# instance fields
.field public value:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .prologue
    const/4 v8, 0x4

    const/4 v7, 0x3

    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 22
    new-instance v0, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

    const-string v1, "ONLYDATE"

    const-string v2, "dd.MM.yyyy"

    invoke-direct {v0, v1, v4, v2}, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;->ONLYDATE:Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

    new-instance v0, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

    const-string v1, "ONLYTIME"

    const-string v2, "HH:mm:ss"

    invoke-direct {v0, v1, v5, v2}, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;->ONLYTIME:Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

    new-instance v0, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

    const-string v1, "DATETIME"

    const-string v2, "dd.MM.yyyy HH:mm:ss"

    invoke-direct {v0, v1, v6, v2}, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;->DATETIME:Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

    .line 23
    new-instance v0, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

    const-string v1, "TIMEDATE"

    const-string v2, "HH:mm:ss dd.MM.yyyy"

    invoke-direct {v0, v1, v7, v2}, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;->TIMEDATE:Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

    new-instance v0, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

    const-string v1, "TIMEDATE_SHORT"

    const-string v2, "HH:mm - dd.MM.yyyy"

    invoke-direct {v0, v1, v8, v2}, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;->TIMEDATE_SHORT:Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

    new-instance v0, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

    const-string v1, "TIMEDATESLASH"

    const/4 v2, 0x5

    const-string v3, "HH:mm:ss MM/dd/yyyy"

    invoke-direct {v0, v1, v2, v3}, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;->TIMEDATESLASH:Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

    new-instance v0, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

    const-string v1, "DATESLASH"

    const/4 v2, 0x6

    const-string v3, "dd/MM/yyyy"

    invoke-direct {v0, v1, v2, v3}, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;->DATESLASH:Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

    .line 24
    new-instance v0, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

    const-string v1, "TIMEDATESLASH_AM_PM"

    const/4 v2, 0x7

    const-string v3, "hh:mm:ss MM/dd/yyyy a"

    invoke-direct {v0, v1, v2, v3}, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;->TIMEDATESLASH_AM_PM:Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

    new-instance v0, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

    const-string v1, "ONLYDATE_INT"

    const/16 v2, 0x8

    const-string v3, "yyyyMMdd"

    invoke-direct {v0, v1, v2, v3}, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;->ONLYDATE_INT:Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

    new-instance v0, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

    const-string v1, "EKMOB"

    const/16 v2, 0x9

    const-string v3, "yyyy-MM-dd\'T\'HH:mm:ss.SSS"

    invoke-direct {v0, v1, v2, v3}, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;->EKMOB:Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

    new-instance v0, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

    const-string v1, "AROX"

    const/16 v2, 0xa

    const-string v3, "yyyy-MM-dd"

    invoke-direct {v0, v1, v2, v3}, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;->AROX:Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

    new-instance v0, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

    const-string v1, "AROX2"

    const/16 v2, 0xb

    const-string v3, "dd-MM-yyyy"

    invoke-direct {v0, v1, v2, v3}, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;->AROX2:Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

    new-instance v0, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

    const-string v1, "ONLYTIME_WITHOUT_SECOND"

    const/16 v2, 0xc

    const-string v3, "HH:mm"

    invoke-direct {v0, v1, v2, v3}, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;->ONLYTIME_WITHOUT_SECOND:Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

    .line 21
    const/16 v0, 0xd

    new-array v0, v0, [Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

    sget-object v1, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;->ONLYDATE:Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

    aput-object v1, v0, v4

    sget-object v1, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;->ONLYTIME:Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

    aput-object v1, v0, v5

    sget-object v1, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;->DATETIME:Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

    aput-object v1, v0, v6

    sget-object v1, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;->TIMEDATE:Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

    aput-object v1, v0, v7

    sget-object v1, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;->TIMEDATE_SHORT:Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

    aput-object v1, v0, v8

    const/4 v1, 0x5

    sget-object v2, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;->TIMEDATESLASH:Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;->DATESLASH:Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;->TIMEDATESLASH_AM_PM:Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;->ONLYDATE_INT:Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;->EKMOB:Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;->AROX:Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    sget-object v2, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;->AROX2:Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

    aput-object v2, v0, v1

    const/16 v1, 0xc

    sget-object v2, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;->ONLYTIME_WITHOUT_SECOND:Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

    aput-object v2, v0, v1

    sput-object v0, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;->$VALUES:[Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 28
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 29
    iput-object p3, p0, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;->value:Ljava/lang/String;

    .line 30
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;
    .locals 1

    .prologue
    .line 21
    const-class v0, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

    return-object v0
.end method

.method public static values()[Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;
    .locals 1

    .prologue
    .line 21
    sget-object v0, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;->$VALUES:[Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

    invoke-virtual {v0}, [Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

    return-object v0
.end method
