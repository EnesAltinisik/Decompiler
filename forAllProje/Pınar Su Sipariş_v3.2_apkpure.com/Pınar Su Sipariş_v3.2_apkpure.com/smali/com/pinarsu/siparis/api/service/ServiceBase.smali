.class public Lcom/pinarsu/siparis/api/service/ServiceBase;
.super Ljava/lang/Object;
.source "ServiceBase.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pinarsu/siparis/api/service/ServiceBase$Retrieve2;
    }
.end annotation


# static fields
.field private static final PINAR_SERVICE_ERROR:Ljava/lang/String; = "P\u0131nar Su servislerine ula\u015f\u0131lamad\u0131. L\u00fctfen daha sonra tekrar deneyiniz."


# instance fields
.field private NAMESPACE:Ljava/lang/String;

.field private delegate:Lcom/pinarsu/siparis/interfaces/IServiceResponse;


# direct methods
.method public constructor <init>(Lcom/pinarsu/siparis/interfaces/IServiceResponse;)V
    .locals 1

    .prologue
    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Lcom/pinarsu/siparis/api/service/ServiceBase;->delegate:Lcom/pinarsu/siparis/interfaces/IServiceResponse;

    .line 42
    invoke-static {}, Lcom/pinarsu/siparis/MyApplication;->getInstance()Lcom/pinarsu/siparis/MyApplication;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pinarsu/siparis/MyApplication;->getServiceNamespace()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/pinarsu/siparis/api/service/ServiceBase;->NAMESPACE:Ljava/lang/String;

    .line 43
    return-void
.end method

.method static synthetic access$000(Lcom/pinarsu/siparis/api/service/ServiceBase;Lorg/b/a/h;Lcom/pinarsu/siparis/api/service/ServiceItem;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 32
    invoke-direct {p0, p1, p2}, Lcom/pinarsu/siparis/api/service/ServiceBase;->parse(Lorg/b/a/h;Lcom/pinarsu/siparis/api/service/ServiceItem;)V

    return-void
.end method

.method static synthetic access$100(Lcom/pinarsu/siparis/api/service/ServiceBase;Lcom/pinarsu/siparis/api/service/ServiceItem;)V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0, p1}, Lcom/pinarsu/siparis/api/service/ServiceBase;->request(Lcom/pinarsu/siparis/api/service/ServiceItem;)V

    return-void
.end method

.method static synthetic access$200(Lcom/pinarsu/siparis/api/service/ServiceBase;)Lcom/pinarsu/siparis/interfaces/IServiceResponse;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/pinarsu/siparis/api/service/ServiceBase;->delegate:Lcom/pinarsu/siparis/interfaces/IServiceResponse;

    return-object v0
.end method

.method private parse(Lorg/b/a/h;Lcom/pinarsu/siparis/api/service/ServiceItem;)V
    .locals 20
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 132
    invoke-virtual/range {p1 .. p1}, Lorg/b/a/h;->a_()I

    move-result v1

    if-nez v1, :cond_0

    .line 234
    :goto_0
    return-void

    .line 135
    :cond_0
    move-object/from16 v0, p2

    iget-object v1, v0, Lcom/pinarsu/siparis/api/service/ServiceItem;->type:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    iget-object v8, v1, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->clazz:Ljava/lang/Class;

    .line 136
    new-instance v9, Lcom/google/gson/Gson;

    invoke-direct {v9}, Lcom/google/gson/Gson;-><init>()V

    .line 138
    new-instance v10, Lorg/json/JSONObject;

    invoke-direct {v10}, Lorg/json/JSONObject;-><init>()V

    .line 139
    new-instance v11, Lorg/json/JSONObject;

    invoke-direct {v11}, Lorg/json/JSONObject;-><init>()V

    .line 140
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 143
    const/4 v1, 0x0

    move v5, v1

    :goto_1
    invoke-virtual/range {p1 .. p1}, Lorg/b/a/h;->a_()I

    move-result v1

    if-ge v5, v1, :cond_c

    .line 144
    move-object/from16 v0, p1

    invoke-virtual {v0, v5}, Lorg/b/a/h;->a_(I)Ljava/lang/Object;

    move-result-object v2

    .line 146
    new-instance v12, Lorg/b/a/g;

    invoke-direct {v12}, Lorg/b/a/g;-><init>()V

    .line 147
    move-object/from16 v0, p1

    invoke-virtual {v0, v5, v12}, Lorg/b/a/h;->a(ILorg/b/a/g;)V

    .line 149
    instance-of v1, v2, Lorg/b/a/h;

    if-eqz v1, :cond_a

    move-object v1, v2

    check-cast v1, Lorg/b/a/h;

    invoke-virtual {v1}, Lorg/b/a/h;->a_()I

    move-result v1

    if-lez v1, :cond_a

    .line 151
    new-instance v13, Lorg/json/JSONArray;

    invoke-direct {v13}, Lorg/json/JSONArray;-><init>()V

    .line 153
    check-cast v2, Lorg/b/a/h;

    .line 154
    const/4 v1, 0x0

    move v6, v1

    :goto_2
    invoke-virtual {v2}, Lorg/b/a/h;->a_()I

    move-result v1

    if-ge v6, v1, :cond_8

    .line 156
    invoke-virtual {v2, v6}, Lorg/b/a/h;->a_(I)Ljava/lang/Object;

    move-result-object v3

    .line 157
    instance-of v1, v3, Lorg/b/a/h;

    if-eqz v1, :cond_5

    move-object v1, v3

    check-cast v1, Lorg/b/a/h;

    invoke-virtual {v1}, Lorg/b/a/h;->a_()I

    move-result v1

    if-lez v1, :cond_5

    .line 158
    check-cast v3, Lorg/b/a/h;

    .line 159
    new-instance v14, Lorg/json/JSONObject;

    invoke-direct {v14}, Lorg/json/JSONObject;-><init>()V

    .line 160
    const/4 v1, 0x0

    move v7, v1

    :goto_3
    invoke-virtual {v3}, Lorg/b/a/h;->a_()I

    move-result v1

    if-ge v7, v1, :cond_4

    .line 161
    invoke-virtual {v3, v7}, Lorg/b/a/h;->a_(I)Ljava/lang/Object;

    move-result-object v4

    .line 164
    instance-of v1, v4, Lorg/b/a/h;

    if-eqz v1, :cond_2

    move-object v1, v4

    check-cast v1, Lorg/b/a/h;

    invoke-virtual {v1}, Lorg/b/a/h;->a_()I

    move-result v1

    if-lez v1, :cond_2

    .line 165
    new-instance v15, Lorg/b/a/g;

    invoke-direct {v15}, Lorg/b/a/g;-><init>()V

    .line 166
    invoke-virtual {v3, v7, v15}, Lorg/b/a/h;->a(ILorg/b/a/g;)V

    .line 168
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 169
    check-cast v4, Lorg/b/a/h;

    .line 170
    new-instance v16, Lorg/json/JSONArray;

    invoke-direct/range {v16 .. v16}, Lorg/json/JSONArray;-><init>()V

    .line 171
    const/4 v1, 0x0

    :goto_4
    invoke-virtual {v4}, Lorg/b/a/h;->a_()I

    move-result v17

    move/from16 v0, v17

    if-ge v1, v0, :cond_1

    .line 179
    new-instance v17, Lorg/b/a/g;

    invoke-direct/range {v17 .. v17}, Lorg/b/a/g;-><init>()V

    .line 180
    move-object/from16 v0, v17

    invoke-virtual {v4, v1, v0}, Lorg/b/a/h;->a(ILorg/b/a/g;)V

    .line 181
    invoke-virtual/range {v17 .. v17}, Lorg/b/a/g;->d()Ljava/lang/Object;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v17

    const-string v18, "anyType{}"

    const-string v19, ""

    invoke-virtual/range {v17 .. v19}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v17

    invoke-virtual/range {v16 .. v17}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 171
    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    .line 186
    :cond_1
    invoke-virtual {v15}, Lorg/b/a/g;->b()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v0, v16

    invoke-virtual {v14, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 160
    :goto_5
    add-int/lit8 v1, v7, 0x1

    move v7, v1

    goto :goto_3

    .line 190
    :cond_2
    new-instance v1, Lorg/b/a/g;

    invoke-direct {v1}, Lorg/b/a/g;-><init>()V

    .line 191
    invoke-virtual {v3, v7, v1}, Lorg/b/a/h;->a(ILorg/b/a/g;)V

    .line 192
    invoke-virtual {v1}, Lorg/b/a/g;->d()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v15, "anyType{}"

    invoke-virtual {v4, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 193
    invoke-virtual {v1}, Lorg/b/a/g;->b()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-virtual {v14, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_5

    .line 195
    :cond_3
    invoke-virtual {v1}, Lorg/b/a/g;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lorg/b/a/g;->d()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v14, v4, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_5

    .line 198
    :cond_4
    invoke-virtual {v13, v14}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 154
    :goto_6
    add-int/lit8 v1, v6, 0x1

    move v6, v1

    goto/16 :goto_2

    .line 200
    :cond_5
    new-instance v1, Lorg/b/a/g;

    invoke-direct {v1}, Lorg/b/a/g;-><init>()V

    .line 201
    invoke-virtual {v2, v6, v1}, Lorg/b/a/h;->a(ILorg/b/a/g;)V

    .line 202
    invoke-virtual {v1}, Lorg/b/a/g;->b()Ljava/lang/String;

    move-result-object v3

    const-string v4, "item"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 203
    invoke-virtual {v1}, Lorg/b/a/g;->d()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v13, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_6

    .line 206
    :cond_6
    invoke-virtual {v1}, Lorg/b/a/g;->d()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "anyType{}"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 207
    invoke-virtual {v1}, Lorg/b/a/g;->b()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    invoke-virtual {v11, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_6

    .line 209
    :cond_7
    invoke-virtual {v1}, Lorg/b/a/g;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lorg/b/a/g;->d()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v11, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_6

    .line 216
    :cond_8
    if-eqz v13, :cond_9

    invoke-virtual {v13}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-lez v1, :cond_9

    .line 217
    invoke-virtual {v12}, Lorg/b/a/g;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v1, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 143
    :goto_7
    add-int/lit8 v1, v5, 0x1

    move v5, v1

    goto/16 :goto_1

    .line 219
    :cond_9
    invoke-virtual {v12}, Lorg/b/a/g;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v1, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_7

    .line 221
    :cond_a
    new-instance v1, Lorg/b/a/g;

    invoke-direct {v1}, Lorg/b/a/g;-><init>()V

    .line 222
    move-object/from16 v0, p1

    invoke-virtual {v0, v5, v1}, Lorg/b/a/h;->a(ILorg/b/a/g;)V

    .line 223
    invoke-virtual {v1}, Lorg/b/a/g;->d()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "anyType{}"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    .line 224
    invoke-virtual {v1}, Lorg/b/a/g;->b()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v10, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_7

    .line 226
    :cond_b
    invoke-virtual {v1}, Lorg/b/a/g;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lorg/b/a/g;->d()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_7

    .line 230
    :cond_c
    :try_start_0
    invoke-virtual {v10}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v1, v8}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v0, p2

    iput-object v1, v0, Lcom/pinarsu/siparis/api/service/ServiceItem;->object:Ljava/lang/Object;
    :try_end_0
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    .line 231
    :catch_0
    move-exception v1

    .line 232
    const/4 v1, 0x0

    move-object/from16 v0, p2

    iput-object v1, v0, Lcom/pinarsu/siparis/api/service/ServiceItem;->object:Ljava/lang/Object;

    goto/16 :goto_0
.end method

.method private prepare(Lcom/pinarsu/siparis/api/service/ServiceItem;)Lorg/b/a/h;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 101
    new-instance v1, Lorg/b/a/h;

    iget-object v0, p0, Lcom/pinarsu/siparis/api/service/ServiceBase;->NAMESPACE:Ljava/lang/String;

    iget-object v2, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->type:Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;

    iget-object v2, v2, Lcom/pinarsu/siparis/api/service/ServiceItem$REQUEST_TYPE;->method:Ljava/lang/String;

    invoke-direct {v1, v0, v2}, Lorg/b/a/h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->parameterList:Ljava/util/List;

    .line 108
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;

    .line 110
    iget-object v3, v0, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;->soapObject:Lorg/b/a/h;

    if-eqz v3, :cond_0

    .line 111
    iget-object v0, v0, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;->soapObject:Lorg/b/a/h;

    invoke-virtual {v1, v0}, Lorg/b/a/h;->a(Lorg/b/a/h;)Lorg/b/a/h;

    goto :goto_0

    .line 113
    :cond_0
    iget-object v3, v0, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;->paramName:Ljava/lang/String;

    iget-object v0, v0, Lcom/pinarsu/siparis/api/service/ServiceItemRequestParameter;->paramValue:Ljava/lang/String;

    invoke-virtual {v1, v3, v0}, Lorg/b/a/h;->b(Ljava/lang/String;Ljava/lang/Object;)Lorg/b/a/h;

    goto :goto_0

    .line 118
    :cond_1
    const-string v0, "VERSIYON_NO"

    const-string v2, "4"

    invoke-virtual {v1, v0, v2}, Lorg/b/a/h;->b(Ljava/lang/String;Ljava/lang/Object;)Lorg/b/a/h;

    .line 120
    return-object v1
.end method

.method private request(Lcom/pinarsu/siparis/api/service/ServiceItem;)V
    .locals 3

    .prologue
    .line 59
    new-instance v0, Lcom/pinarsu/siparis/api/SapConnector;

    invoke-direct {v0}, Lcom/pinarsu/siparis/api/SapConnector;-><init>()V

    .line 62
    :try_start_0
    invoke-direct {p0, p1}, Lcom/pinarsu/siparis/api/service/ServiceBase;->prepare(Lcom/pinarsu/siparis/api/service/ServiceItem;)Lorg/b/a/h;

    move-result-object v1

    .line 63
    new-instance v2, Lcom/pinarsu/siparis/api/service/ServiceBase$1;

    invoke-direct {v2, p0, p1}, Lcom/pinarsu/siparis/api/service/ServiceBase$1;-><init>(Lcom/pinarsu/siparis/api/service/ServiceBase;Lcom/pinarsu/siparis/api/service/ServiceItem;)V

    invoke-virtual {v0, v1, v2}, Lcom/pinarsu/siparis/api/SapConnector;->connect(Lorg/b/a/h;Lcom/pinarsu/siparis/interfaces/ISapResponseListener;)V
    :try_end_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 93
    :goto_0
    return-void

    .line 81
    :catch_0
    move-exception v0

    .line 82
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceErrorItem;

    invoke-direct {v0}, Lcom/pinarsu/siparis/api/service/ServiceErrorItem;-><init>()V

    iput-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->serviceErrorItem:Lcom/pinarsu/siparis/api/service/ServiceErrorItem;

    .line 83
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->serviceErrorItem:Lcom/pinarsu/siparis/api/service/ServiceErrorItem;

    const-string v1, "P\u0131nar Su servislerine ula\u015f\u0131lamad\u0131. L\u00fctfen daha sonra tekrar deneyiniz."

    iput-object v1, v0, Lcom/pinarsu/siparis/api/service/ServiceErrorItem;->detail:Ljava/lang/String;

    goto :goto_0

    .line 85
    :catch_1
    move-exception v0

    .line 86
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceErrorItem;

    invoke-direct {v0}, Lcom/pinarsu/siparis/api/service/ServiceErrorItem;-><init>()V

    iput-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->serviceErrorItem:Lcom/pinarsu/siparis/api/service/ServiceErrorItem;

    .line 87
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->serviceErrorItem:Lcom/pinarsu/siparis/api/service/ServiceErrorItem;

    const-string v1, "P\u0131nar Su servislerine ula\u015f\u0131lamad\u0131. L\u00fctfen daha sonra tekrar deneyiniz."

    iput-object v1, v0, Lcom/pinarsu/siparis/api/service/ServiceErrorItem;->detail:Ljava/lang/String;

    goto :goto_0

    .line 88
    :catch_2
    move-exception v0

    .line 89
    new-instance v0, Lcom/pinarsu/siparis/api/service/ServiceErrorItem;

    invoke-direct {v0}, Lcom/pinarsu/siparis/api/service/ServiceErrorItem;-><init>()V

    iput-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->serviceErrorItem:Lcom/pinarsu/siparis/api/service/ServiceErrorItem;

    .line 90
    iget-object v0, p1, Lcom/pinarsu/siparis/api/service/ServiceItem;->serviceErrorItem:Lcom/pinarsu/siparis/api/service/ServiceErrorItem;

    const-string v1, "P\u0131nar Su servislerine ula\u015f\u0131lamad\u0131. L\u00fctfen daha sonra tekrar deneyiniz."

    iput-object v1, v0, Lcom/pinarsu/siparis/api/service/ServiceErrorItem;->detail:Ljava/lang/String;

    goto :goto_0
.end method
