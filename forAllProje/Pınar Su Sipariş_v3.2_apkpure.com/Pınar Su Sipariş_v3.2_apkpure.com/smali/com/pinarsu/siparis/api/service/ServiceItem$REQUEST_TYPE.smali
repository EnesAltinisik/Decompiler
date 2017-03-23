.class public final enum Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;
.super Ljava/lang/Enum;
.source "ServiceItem.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pinarsu/siparis/api/service/ServiceItem;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "REQUEST_TYPE"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

.field public static final enum ALL_ADDRESS:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

.field public static final enum ALL_CAMPAIGNS:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

.field public static final enum ALL_PRODUCTS:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

.field public static final enum ANNOUNCEMENTS_AND_NEWS:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

.field public static final enum CALCULATE_ORDER_TOTAL:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

.field public static final enum CAMPAIGNS_IN_ADDRESS:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

.field public static final enum CITY_LIST:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

.field public static final enum CREATE_ADDRESS:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

.field public static final enum CREATE_CUSTOMER:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

.field public static final enum CUSTOMER_SEARCH:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

.field public static final enum DELETE_ADDRESS:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

.field public static final enum DELETE_ORDER:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

.field public static final enum DISTRICT_LIST:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

.field public static final enum GIVE_ORDER:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

.field public static final enum LAST_10_ORDER:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

.field public static final enum LAST_ORDER:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

.field public static final enum PRODUCTS_IN_ADDRESS:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

.field public static final enum SEND_VERIFICATION_CODE:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

.field public static final enum STREET_LIST:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

.field public static final enum SURVEY_SAVE:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

.field public static final enum SURVEY_SEARCH:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

.field public static final enum TOWN_LIST:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

.field public static final enum UPDATE_ADDRESS:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

.field public static final enum UPDATE_CUSTOMER_PHONE:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

.field public static final enum VERY_VERIFICATION_CODE:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;


# instance fields
.field public clazz:Ljava/lang/Class;

.field public method:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .prologue
    const/4 v9, 0x3

    const/4 v8, 0x2

    const/4 v7, 0x1

    const/4 v6, 0x0

    const/4 v5, 0x0

    .line 44
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    const-string v1, "LAST_10_ORDER"

    const-class v2, Lcom/pinarsu/siparis/model/data/SIPARISLER_PARENT;

    const-string v3, "Z_SDB_RFC_MUSTERI_SON_ON_SIP"

    invoke-direct {v0, v1, v6, v2, v3}, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->LAST_10_ORDER:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    .line 45
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    const-string v1, "CUSTOMER_SEARCH"

    const-class v2, Lcom/pinarsu/siparis/model/data/MUSTERI_ARAMA_ADRES;

    const-string v3, "Z_SDB_RFC_MUSTERI_ARAMA"

    invoke-direct {v0, v1, v7, v2, v3}, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->CUSTOMER_SEARCH:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    .line 46
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    const-string v1, "LAST_ORDER"

    const-class v2, Lcom/pinarsu/siparis/model/data/SON_SIPARIS_PARENT;

    const-string v3, "Z_SDB_RFC_MUSTERI_SON_SIPARIS"

    invoke-direct {v0, v1, v8, v2, v3}, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->LAST_ORDER:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    .line 47
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    const-string v1, "SURVEY_SEARCH"

    const-class v2, Lcom/pinarsu/siparis/model/data/ANKET_ARAMA_PARENT;

    const-string v3, "Z_SDB_RFC_ANKET_ARAMA"

    invoke-direct {v0, v1, v9, v2, v3}, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->SURVEY_SEARCH:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    .line 48
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    const-string v1, "SURVEY_SAVE"

    const/4 v2, 0x4

    const-string v3, "Z_SDB_RFC_ANKET_KAYDETME"

    invoke-direct {v0, v1, v2, v5, v3}, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->SURVEY_SAVE:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    .line 49
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    const-string v1, "CITY_LIST"

    const/4 v2, 0x5

    const-class v3, Lcom/pinarsu/siparis/model/data/ILLER_PARENT;

    const-string v4, "Z_SDB_RFC_IL_LISTESI"

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->CITY_LIST:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    .line 50
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    const-string v1, "TOWN_LIST"

    const/4 v2, 0x6

    const-class v3, Lcom/pinarsu/siparis/model/data/ILCELER_PARENT;

    const-string v4, "Z_SDB_RFC_ILCE_LISTESI"

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->TOWN_LIST:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    .line 51
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    const-string v1, "DISTRICT_LIST"

    const/4 v2, 0x7

    const-class v3, Lcom/pinarsu/siparis/model/data/MAHALLELER_PARENT;

    const-string v4, "Z_SDB_RFC_MAHALLE_LISTESI"

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->DISTRICT_LIST:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    .line 52
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    const-string v1, "STREET_LIST"

    const/16 v2, 0x8

    const-class v3, Lcom/pinarsu/siparis/model/data/SOKAKLAR_PARENT;

    const-string v4, "Z_SDB_RFC_SOKAK_LISTESI"

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->STREET_LIST:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    .line 53
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    const-string v1, "CREATE_ADDRESS"

    const/16 v2, 0x9

    const-string v3, "Z_SDB_RFC_MUSTERI_ADRES_KAYDET"

    invoke-direct {v0, v1, v2, v5, v3}, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->CREATE_ADDRESS:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    .line 54
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    const-string v1, "ALL_ADDRESS"

    const/16 v2, 0xa

    const-class v3, Lcom/pinarsu/siparis/model/data/ADRESLER_PARENT;

    const-string v4, "Z_SDB_RFC_MUSTERI_TUM_ADRESLER"

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->ALL_ADDRESS:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    .line 55
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    const-string v1, "ALL_PRODUCTS"

    const/16 v2, 0xb

    const-class v3, Lcom/pinarsu/siparis/model/data/TUM_MALZEMELER_PARENT;

    const-string v4, "Z_SDB_RFC_PINARSU_TUM_URUNLERI"

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->ALL_PRODUCTS:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    .line 56
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    const-string v1, "SEND_VERIFICATION_CODE"

    const/16 v2, 0xc

    const-string v3, "Z_SDB_RFC_DOGRULAMA_KOD_GONDER"

    invoke-direct {v0, v1, v2, v5, v3}, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->SEND_VERIFICATION_CODE:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    .line 57
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    const-string v1, "VERY_VERIFICATION_CODE"

    const/16 v2, 0xd

    const-class v3, Lcom/pinarsu/siparis/model/data/SONUC_PARENT;

    const-string v4, "Z_SDB_RFC_KOD_DOGRULA"

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->VERY_VERIFICATION_CODE:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    .line 58
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    const-string v1, "GIVE_ORDER"

    const/16 v2, 0xe

    const-class v3, Lcom/pinarsu/siparis/model/data/SONUC_PARENT;

    const-string v4, "Z_SDB_RFC_MOBIL_SIPARIS_KAYDET"

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->GIVE_ORDER:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    .line 59
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    const-string v1, "PRODUCTS_IN_ADDRESS"

    const/16 v2, 0xf

    const-class v3, Lcom/pinarsu/siparis/model/data/MALZEMELER_PARENT;

    const-string v4, "Z_SDB_RFC_ADRESTE_SAT_URUNLER"

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->PRODUCTS_IN_ADDRESS:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    .line 60
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    const-string v1, "ANNOUNCEMENTS_AND_NEWS"

    const/16 v2, 0x10

    const-class v3, Lcom/pinarsu/siparis/model/data/DUYURULAR_PARENT;

    const-string v4, "Z_SDB_RFC_PINAR_DUYURU_HABER"

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->ANNOUNCEMENTS_AND_NEWS:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    .line 61
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    const-string v1, "UPDATE_ADDRESS"

    const/16 v2, 0x11

    const-string v3, "Z_SDB_RFC_MUSTERI_ADRES_GUNC"

    invoke-direct {v0, v1, v2, v5, v3}, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->UPDATE_ADDRESS:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    .line 62
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    const-string v1, "DELETE_ADDRESS"

    const/16 v2, 0x12

    const-string v3, "Z_SDB_RFC_MUSTERI_ADRES_SIL"

    invoke-direct {v0, v1, v2, v5, v3}, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->DELETE_ADDRESS:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    .line 63
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    const-string v1, "CALCULATE_ORDER_TOTAL"

    const/16 v2, 0x13

    const-class v3, Lcom/pinarsu/siparis/model/data/SIPARIS_TUTARI_PARENT;

    const-string v4, "Z_SDB_RFC_SIPARIS_TUTARI_HESAP"

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->CALCULATE_ORDER_TOTAL:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    .line 64
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    const-string v1, "CAMPAIGNS_IN_ADDRESS"

    const/16 v2, 0x14

    const-class v3, Lcom/pinarsu/siparis/model/data/KAMPANYALAR_PARENT;

    const-string v4, "Z_SDB_RFC_MUSTERI_KAMPANYALARI"

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->CAMPAIGNS_IN_ADDRESS:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    .line 65
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    const-string v1, "ALL_CAMPAIGNS"

    const/16 v2, 0x15

    const-class v3, Lcom/pinarsu/siparis/model/data/KAMPANYALAR_PARENT;

    const-string v4, "Z_SDB_RFC_MUSTERI_KAMPANYALARI"

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->ALL_CAMPAIGNS:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    .line 66
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    const-string v1, "CREATE_CUSTOMER"

    const/16 v2, 0x16

    const-string v3, "Z_SDB_RFC_MB_MUSTERI_YARAT"

    invoke-direct {v0, v1, v2, v5, v3}, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->CREATE_CUSTOMER:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    .line 67
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    const-string v1, "UPDATE_CUSTOMER_PHONE"

    const/16 v2, 0x17

    const-string v3, "Z_SDB_RFC_MUSTERI_TELEFON_GUNC"

    invoke-direct {v0, v1, v2, v5, v3}, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->UPDATE_CUSTOMER_PHONE:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    .line 68
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    const-string v1, "DELETE_ORDER"

    const/16 v2, 0x18

    const-string v3, "Z_SDB_RFC_ILERI_TRH_SIP_IPTAL"

    invoke-direct {v0, v1, v2, v5, v3}, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->DELETE_ORDER:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    .line 42
    const/16 v0, 0x19

    new-array v0, v0, [Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    sget-object v1, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->LAST_10_ORDER:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    aput-object v1, v0, v6

    sget-object v1, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->CUSTOMER_SEARCH:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    aput-object v1, v0, v7

    sget-object v1, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->LAST_ORDER:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    aput-object v1, v0, v8

    sget-object v1, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->SURVEY_SEARCH:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    aput-object v1, v0, v9

    const/4 v1, 0x4

    sget-object v2, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->SURVEY_SAVE:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->CITY_LIST:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->TOWN_LIST:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->DISTRICT_LIST:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->STREET_LIST:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->CREATE_ADDRESS:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->ALL_ADDRESS:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    sget-object v2, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->ALL_PRODUCTS:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    aput-object v2, v0, v1

    const/16 v1, 0xc

    sget-object v2, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->SEND_VERIFICATION_CODE:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    aput-object v2, v0, v1

    const/16 v1, 0xd

    sget-object v2, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->VERY_VERIFICATION_CODE:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    aput-object v2, v0, v1

    const/16 v1, 0xe

    sget-object v2, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->GIVE_ORDER:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    aput-object v2, v0, v1

    const/16 v1, 0xf

    sget-object v2, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->PRODUCTS_IN_ADDRESS:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    aput-object v2, v0, v1

    const/16 v1, 0x10

    sget-object v2, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->ANNOUNCEMENTS_AND_NEWS:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    aput-object v2, v0, v1

    const/16 v1, 0x11

    sget-object v2, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->UPDATE_ADDRESS:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    aput-object v2, v0, v1

    const/16 v1, 0x12

    sget-object v2, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->DELETE_ADDRESS:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    aput-object v2, v0, v1

    const/16 v1, 0x13

    sget-object v2, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->CALCULATE_ORDER_TOTAL:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    aput-object v2, v0, v1

    const/16 v1, 0x14

    sget-object v2, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->CAMPAIGNS_IN_ADDRESS:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    aput-object v2, v0, v1

    const/16 v1, 0x15

    sget-object v2, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->ALL_CAMPAIGNS:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    aput-object v2, v0, v1

    const/16 v1, 0x16

    sget-object v2, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->CREATE_CUSTOMER:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    aput-object v2, v0, v1

    const/16 v1, 0x17

    sget-object v2, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->UPDATE_CUSTOMER_PHONE:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    aput-object v2, v0, v1

    const/16 v1, 0x18

    sget-object v2, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->DELETE_ORDER:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    aput-object v2, v0, v1

    sput-object v0, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->$VALUES:[Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 73
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 74
    iput-object p3, p0, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->clazz:Ljava/lang/Class;

    .line 75
    iput-object p4, p0, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->method:Ljava/lang/String;

    .line 76
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;
    .locals 1

    .prologue
    .line 42
    const-class v0, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    return-object v0
.end method

.method public static values()[Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;
    .locals 1

    .prologue
    .line 42
    sget-object v0, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->$VALUES:[Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    invoke-virtual {v0}, [Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    return-object v0
.end method
