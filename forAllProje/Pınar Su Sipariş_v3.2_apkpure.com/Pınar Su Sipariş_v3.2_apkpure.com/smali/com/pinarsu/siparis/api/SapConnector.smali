.class public Lcom/pinarsu/siparis/api/SapConnector;
.super Ljava/lang/Object;
.source "SapConnector.java"


# static fields
.field static final isTest:Z


# instance fields
.field private final NO_INTERNET_CONNECTION:Ljava/lang/String;

.field private final SERVICE_ERROR:Ljava/lang/String;

.field private USERNAME:Ljava/lang/String;

.field private USERPASS:Ljava/lang/String;

.field private file:Ljava/lang/String;

.field private host:Ljava/lang/String;

.field private port:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    const-string v0, "P\u0131nar Su servislerine ula\u015f\u0131lamad\u0131. L\u00fctfen daha sonra tekrar deneyiniz."

    iput-object v0, p0, Lcom/pinarsu/siparis/api/SapConnector;->SERVICE_ERROR:Ljava/lang/String;

    .line 37
    const-string v0, "Ba\u011flant\u0131 yap\u0131lamad\u0131. L\u00fctfen internet ba\u011flant\u0131n\u0131z\u0131 kontrol ediniz."

    iput-object v0, p0, Lcom/pinarsu/siparis/api/SapConnector;->NO_INTERNET_CONNECTION:Ljava/lang/String;

    return-void
.end method

.method private getSoapErrorMessage(Lorg/b/c;)Lcom/pinarsu/siparis/api/service/ServiceErrorItem;
    .locals 6

    .prologue
    .line 135
    new-instance v2, Lcom/pinarsu/siparis/api/service/ServiceErrorItem;

    invoke-direct {v2}, Lcom/pinarsu/siparis/api/service/ServiceErrorItem;-><init>()V

    .line 137
    :try_start_0
    iget-object v0, p1, Lorg/b/c;->d:Lorg/c/b/b;

    .line 138
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lorg/c/b/b;->f(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/c/b/a;

    .line 139
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lorg/c/b/a;->f(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/c/b/a;

    .line 140
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lorg/c/b/a;->f(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/c/b/a;

    .line 142
    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Lorg/c/b/a;->h(I)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v2, Lcom/pinarsu/siparis/api/service/ServiceErrorItem;->title:Ljava/lang/String;

    .line 143
    const-string v3, "MNTTAG"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "textTitleElement : "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v1, v5}, Lorg/c/b/a;->h(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 144
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lorg/c/b/a;->f(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/c/b/a;

    .line 145
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lorg/c/b/a;->h(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Lcom/pinarsu/siparis/api/service/ServiceErrorItem;->detail:Ljava/lang/String;

    .line 146
    const/4 v0, 0x0

    iput-boolean v0, v2, Lcom/pinarsu/siparis/api/service/ServiceErrorItem;->isCrashed:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 150
    :goto_0
    return-object v2

    .line 147
    :catch_0
    move-exception v0

    .line 148
    iget-object v0, p1, Lorg/b/c;->b:Ljava/lang/String;

    iput-object v0, v2, Lcom/pinarsu/siparis/api/service/ServiceErrorItem;->detail:Ljava/lang/String;

    goto :goto_0
.end method


# virtual methods
.method public connect(Lorg/b/a/h;Lcom/pinarsu/siparis/interfaces/ISapResponseListener;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 59
    invoke-static {}, Lcom/pinarsu/siparis/MyApplication;->getInstance()Lcom/pinarsu/siparis/MyApplication;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pinarsu/siparis/MyApplication;->getServiceLiveUserName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/pinarsu/siparis/api/SapConnector;->USERNAME:Ljava/lang/String;

    .line 60
    invoke-static {}, Lcom/pinarsu/siparis/MyApplication;->getInstance()Lcom/pinarsu/siparis/MyApplication;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pinarsu/siparis/MyApplication;->getServiceLiveUserPass()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/pinarsu/siparis/api/SapConnector;->USERPASS:Ljava/lang/String;

    .line 61
    invoke-static {}, Lcom/pinarsu/siparis/MyApplication;->getInstance()Lcom/pinarsu/siparis/MyApplication;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pinarsu/siparis/MyApplication;->getServiceLiveURLHost()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/pinarsu/siparis/api/SapConnector;->host:Ljava/lang/String;

    .line 62
    invoke-static {}, Lcom/pinarsu/siparis/MyApplication;->getInstance()Lcom/pinarsu/siparis/MyApplication;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pinarsu/siparis/MyApplication;->getServiceLiveURLPort()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/pinarsu/siparis/api/SapConnector;->port:I

    .line 63
    invoke-static {}, Lcom/pinarsu/siparis/MyApplication;->getInstance()Lcom/pinarsu/siparis/MyApplication;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pinarsu/siparis/MyApplication;->getServiceLiveURLFile()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/pinarsu/siparis/api/SapConnector;->file:Ljava/lang/String;

    .line 65
    const/4 v0, 0x0

    .line 67
    :try_start_0
    new-instance v2, Lorg/b/a/j;

    const/16 v1, 0x6e

    invoke-direct {v2, v1}, Lorg/b/a/j;-><init>(I)V

    .line 68
    const/4 v1, 0x0

    iput-boolean v1, v2, Lorg/b/a/j;->p:Z

    .line 69
    const-string v1, "http://schemas.xmlsoap.org/soap/envelope/"

    iput-object v1, v2, Lorg/b/a/j;->e:Ljava/lang/String;

    .line 71
    iput-object p1, v2, Lorg/b/a/j;->b:Ljava/lang/Object;

    .line 72
    const/4 v1, 0x1

    iput-boolean v1, v2, Lorg/b/a/j;->o:Z

    .line 74
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 75
    new-instance v1, Lorg/b/a;

    const-string v4, "Connection"

    const-string v5, "close"

    invoke-direct {v1, v4, v5}, Lorg/b/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 76
    new-instance v1, Lorg/b/a;

    const-string v4, "Authorization"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Basic "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v7, p0, Lcom/pinarsu/siparis/api/SapConnector;->USERNAME:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, ":"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget-object v7, p0, Lcom/pinarsu/siparis/api/SapConnector;->USERPASS:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->getBytes()[B

    move-result-object v6

    invoke-static {v6}, Lorg/a/a/a;->a([B)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v1, v4, v5}, Lorg/b/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    invoke-virtual {v2, p1}, Lorg/b/a/j;->a(Ljava/lang/Object;)V

    .line 79
    invoke-static {}, Lcom/pinarsu/siparis/api/TrustManagerManipulator;->allowAllSSL()V

    .line 81
    new-instance v1, Lcom/pinarsu/siparis/api/AuthTransportSE;

    iget-object v4, p0, Lcom/pinarsu/siparis/api/SapConnector;->host:Ljava/lang/String;

    iget v5, p0, Lcom/pinarsu/siparis/api/SapConnector;->port:I

    iget-object v6, p0, Lcom/pinarsu/siparis/api/SapConnector;->file:Ljava/lang/String;

    const v7, 0x1d4c0

    invoke-direct {v1, v4, v5, v6, v7}, Lcom/pinarsu/siparis/api/AuthTransportSE;-><init>(Ljava/lang/String;ILjava/lang/String;I)V
    :try_end_0
    .catch Lorg/b/c; {:try_start_0 .. :try_end_0} :catch_9
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    const/4 v0, 0x1

    :try_start_1
    iput-boolean v0, v1, Lcom/pinarsu/siparis/api/AuthTransportSE;->debug:Z

    .line 84
    const-string v0, "<?xml version=\"1.0\" encoding=\"utf-8\"?>"

    invoke-virtual {v1, v0}, Lcom/pinarsu/siparis/api/AuthTransportSE;->setXmlVersionTag(Ljava/lang/String;)V

    .line 86
    const-string v0, ""

    invoke-virtual {v1, v0, v2, v3}, Lcom/pinarsu/siparis/api/AuthTransportSE;->call(Ljava/lang/String;Lorg/b/b;Ljava/util/List;)Ljava/util/List;

    .line 87
    const-string v0, "MNTTAG"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "aht.requestDump : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, v1, Lcom/pinarsu/siparis/api/AuthTransportSE;->requestDump:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 88
    iget-object v0, v2, Lorg/b/a/j;->a:Ljava/lang/Object;

    instance-of v0, v0, Lorg/b/a/h;

    if-eqz v0, :cond_0

    .line 89
    iget-object v0, v2, Lorg/b/a/j;->a:Ljava/lang/Object;

    check-cast v0, Lorg/b/a/h;

    invoke-interface {p2, v0}, Lcom/pinarsu/siparis/interfaces/ISapResponseListener;->onSuccessfullResult(Lorg/b/a/h;)V
    :try_end_1
    .catch Lorg/b/c; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_8
    .catch Ljava/net/UnknownHostException; {:try_start_1 .. :try_end_1} :catch_7
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_6
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_5
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 106
    :goto_0
    invoke-virtual {v1}, Lcom/pinarsu/siparis/api/AuthTransportSE;->reset()V

    .line 108
    :goto_1
    return-void

    .line 91
    :cond_0
    :try_start_2
    iget-object v0, v2, Lorg/b/a/j;->a:Ljava/lang/Object;

    check-cast v0, Lorg/b/c;

    .line 92
    invoke-direct {p0, v0}, Lcom/pinarsu/siparis/api/SapConnector;->getSoapErrorMessage(Lorg/b/c;)Lcom/pinarsu/siparis/api/service/ServiceErrorItem;

    move-result-object v0

    invoke-interface {p2, v0}, Lcom/pinarsu/siparis/interfaces/ISapResponseListener;->onUnsuccessfullResult(Lcom/pinarsu/siparis/api/service/ServiceErrorItem;)V
    :try_end_2
    .catch Lorg/b/c; {:try_start_2 .. :try_end_2} :catch_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_2 .. :try_end_2} :catch_8
    .catch Ljava/net/UnknownHostException; {:try_start_2 .. :try_end_2} :catch_7
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_6
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_5
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    .line 94
    :catch_0
    move-exception v0

    move-object v0, v1

    .line 96
    :goto_2
    :try_start_3
    new-instance v1, Lcom/pinarsu/siparis/api/service/ServiceErrorItem;

    const-string v2, ""

    const-string v3, "P\u0131nar Su servislerine ula\u015f\u0131lamad\u0131. L\u00fctfen daha sonra tekrar deneyiniz."

    invoke-direct {v1, v2, v3}, Lcom/pinarsu/siparis/api/service/ServiceErrorItem;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p2, v1}, Lcom/pinarsu/siparis/interfaces/ISapResponseListener;->onUnsuccessfullResult(Lcom/pinarsu/siparis/api/service/ServiceErrorItem;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 106
    invoke-virtual {v0}, Lcom/pinarsu/siparis/api/AuthTransportSE;->reset()V

    goto :goto_1

    .line 97
    :catch_1
    move-exception v1

    .line 98
    :goto_3
    :try_start_4
    new-instance v1, Lcom/pinarsu/siparis/api/service/ServiceErrorItem;

    const-string v2, ""

    const-string v3, "P\u0131nar Su servislerine ula\u015f\u0131lamad\u0131. L\u00fctfen daha sonra tekrar deneyiniz."

    invoke-direct {v1, v2, v3}, Lcom/pinarsu/siparis/api/service/ServiceErrorItem;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p2, v1}, Lcom/pinarsu/siparis/interfaces/ISapResponseListener;->onUnsuccessfullResult(Lcom/pinarsu/siparis/api/service/ServiceErrorItem;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 106
    invoke-virtual {v0}, Lcom/pinarsu/siparis/api/AuthTransportSE;->reset()V

    goto :goto_1

    .line 99
    :catch_2
    move-exception v1

    .line 100
    :goto_4
    :try_start_5
    new-instance v1, Lcom/pinarsu/siparis/api/service/ServiceErrorItem;

    const-string v2, ""

    const-string v3, "Ba\u011flant\u0131 yap\u0131lamad\u0131. L\u00fctfen internet ba\u011flant\u0131n\u0131z\u0131 kontrol ediniz."

    invoke-direct {v1, v2, v3}, Lcom/pinarsu/siparis/api/service/ServiceErrorItem;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p2, v1}, Lcom/pinarsu/siparis/interfaces/ISapResponseListener;->onUnsuccessfullResult(Lcom/pinarsu/siparis/api/service/ServiceErrorItem;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 106
    invoke-virtual {v0}, Lcom/pinarsu/siparis/api/AuthTransportSE;->reset()V

    goto :goto_1

    .line 101
    :catch_3
    move-exception v1

    .line 102
    :goto_5
    :try_start_6
    new-instance v1, Lcom/pinarsu/siparis/api/service/ServiceErrorItem;

    const-string v2, ""

    const-string v3, "P\u0131nar Su servislerine ula\u015f\u0131lamad\u0131. L\u00fctfen daha sonra tekrar deneyiniz."

    invoke-direct {v1, v2, v3}, Lcom/pinarsu/siparis/api/service/ServiceErrorItem;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p2, v1}, Lcom/pinarsu/siparis/interfaces/ISapResponseListener;->onUnsuccessfullResult(Lcom/pinarsu/siparis/api/service/ServiceErrorItem;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 106
    invoke-virtual {v0}, Lcom/pinarsu/siparis/api/AuthTransportSE;->reset()V

    goto :goto_1

    .line 103
    :catch_4
    move-exception v1

    .line 104
    :goto_6
    :try_start_7
    new-instance v1, Lcom/pinarsu/siparis/api/service/ServiceErrorItem;

    const-string v2, ""

    const-string v3, "P\u0131nar Su servislerine ula\u015f\u0131lamad\u0131. L\u00fctfen daha sonra tekrar deneyiniz."

    invoke-direct {v1, v2, v3}, Lcom/pinarsu/siparis/api/service/ServiceErrorItem;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p2, v1}, Lcom/pinarsu/siparis/interfaces/ISapResponseListener;->onUnsuccessfullResult(Lcom/pinarsu/siparis/api/service/ServiceErrorItem;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 106
    invoke-virtual {v0}, Lcom/pinarsu/siparis/api/AuthTransportSE;->reset()V

    goto :goto_1

    :catchall_0
    move-exception v1

    move-object v8, v1

    move-object v1, v0

    move-object v0, v8

    :goto_7
    invoke-virtual {v1}, Lcom/pinarsu/siparis/api/AuthTransportSE;->reset()V

    throw v0

    :catchall_1
    move-exception v0

    goto :goto_7

    :catchall_2
    move-exception v1

    move-object v8, v1

    move-object v1, v0

    move-object v0, v8

    goto :goto_7

    .line 103
    :catch_5
    move-exception v0

    move-object v0, v1

    goto :goto_6

    .line 101
    :catch_6
    move-exception v0

    move-object v0, v1

    goto :goto_5

    .line 99
    :catch_7
    move-exception v0

    move-object v0, v1

    goto :goto_4

    .line 97
    :catch_8
    move-exception v0

    move-object v0, v1

    goto :goto_3

    .line 94
    :catch_9
    move-exception v1

    goto :goto_2
.end method
