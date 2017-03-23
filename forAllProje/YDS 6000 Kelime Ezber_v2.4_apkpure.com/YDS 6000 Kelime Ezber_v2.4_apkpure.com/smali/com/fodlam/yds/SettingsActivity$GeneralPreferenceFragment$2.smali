.class Lcom/fodlam/yds/SettingsActivity$GeneralPreferenceFragment$2;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/preference/Preference$OnPreferenceChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fodlam/yds/SettingsActivity$GeneralPreferenceFragment;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fodlam/yds/SettingsActivity$GeneralPreferenceFragment;


# direct methods
.method constructor <init>(Lcom/fodlam/yds/SettingsActivity$GeneralPreferenceFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/fodlam/yds/SettingsActivity$GeneralPreferenceFragment$2;->a:Lcom/fodlam/yds/SettingsActivity$GeneralPreferenceFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPreferenceChange(Landroid/preference/Preference;Ljava/lang/Object;)Z
    .locals 3

    check-cast p2, Ljava/lang/Boolean;

    sput-object p2, Lcom/fodlam/yds/OxfordApplication;->k:Ljava/lang/Boolean;

    invoke-virtual {p1}, Landroid/preference/Preference;->getEditor()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "remind_me"

    sget-object v2, Lcom/fodlam/yds/OxfordApplication;->k:Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    iget-object v0, p0, Lcom/fodlam/yds/SettingsActivity$GeneralPreferenceFragment$2;->a:Lcom/fodlam/yds/SettingsActivity$GeneralPreferenceFragment;

    invoke-virtual {v0}, Lcom/fodlam/yds/SettingsActivity$GeneralPreferenceFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/fodlam/yds/alarms/a;->a(Landroid/content/Context;)V

    const/4 v0, 0x1

    return v0
.end method
