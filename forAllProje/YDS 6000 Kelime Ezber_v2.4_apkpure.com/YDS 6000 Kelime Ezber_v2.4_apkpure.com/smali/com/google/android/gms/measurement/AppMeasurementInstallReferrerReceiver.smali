.class public final Lcom/google/android/gms/measurement/AppMeasurementInstallReferrerReceiver;
.super Landroid/content/BroadcastReceiver;

# interfaces
.implements Lcom/google/android/gms/b/cs$a;


# instance fields
.field private a:Lcom/google/android/gms/b/cs;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method private a()Lcom/google/android/gms/b/cs;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/AppMeasurementInstallReferrerReceiver;->a:Lcom/google/android/gms/b/cs;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/b/cs;

    invoke-direct {v0, p0}, Lcom/google/android/gms/b/cs;-><init>(Lcom/google/android/gms/b/cs$a;)V

    iput-object v0, p0, Lcom/google/android/gms/measurement/AppMeasurementInstallReferrerReceiver;->a:Lcom/google/android/gms/b/cs;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/AppMeasurementInstallReferrerReceiver;->a:Lcom/google/android/gms/b/cs;

    return-object v0
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    return-void
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/measurement/AppMeasurementInstallReferrerReceiver;->a()Lcom/google/android/gms/b/cs;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/b/cs;->a(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method
