.class Lcom/fodlam/yds/SettingsActivity$GeneralPreferenceFragment$4;
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
.field final synthetic a:Landroid/preference/ListPreference;

.field final synthetic b:Lcom/fodlam/yds/SettingsActivity$GeneralPreferenceFragment;


# direct methods
.method constructor <init>(Lcom/fodlam/yds/SettingsActivity$GeneralPreferenceFragment;Landroid/preference/ListPreference;)V
    .locals 0

    iput-object p1, p0, Lcom/fodlam/yds/SettingsActivity$GeneralPreferenceFragment$4;->b:Lcom/fodlam/yds/SettingsActivity$GeneralPreferenceFragment;

    iput-object p2, p0, Lcom/fodlam/yds/SettingsActivity$GeneralPreferenceFragment$4;->a:Landroid/preference/ListPreference;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPreferenceChange(Landroid/preference/Preference;Ljava/lang/Object;)Z
    .locals 2

    iget-object v0, p0, Lcom/fodlam/yds/SettingsActivity$GeneralPreferenceFragment$4;->b:Lcom/fodlam/yds/SettingsActivity$GeneralPreferenceFragment;

    const-string v1, "ttsengine"

    invoke-virtual {v0, v1}, Lcom/fodlam/yds/SettingsActivity$GeneralPreferenceFragment;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    invoke-static {v0}, Lcom/fodlam/yds/SettingsActivity;->a(Landroid/preference/Preference;)V

    iget-object v1, p0, Lcom/fodlam/yds/SettingsActivity$GeneralPreferenceFragment$4;->a:Landroid/preference/ListPreference;

    move-object v0, p2

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v0}, Landroid/preference/ListPreference;->findIndexOfValue(Ljava/lang/String;)I

    move-result v0

    if-ltz v0, :cond_0

    iget-object v1, p0, Lcom/fodlam/yds/SettingsActivity$GeneralPreferenceFragment$4;->a:Landroid/preference/ListPreference;

    invoke-virtual {v1}, Landroid/preference/ListPreference;->getEntries()[Ljava/lang/CharSequence;

    move-result-object v1

    aget-object v0, v1, v0

    :goto_0
    invoke-virtual {p1, v0}, Landroid/preference/Preference;->setSummary(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fodlam/yds/SettingsActivity$GeneralPreferenceFragment$4;->b:Lcom/fodlam/yds/SettingsActivity$GeneralPreferenceFragment;

    invoke-virtual {v0}, Lcom/fodlam/yds/SettingsActivity$GeneralPreferenceFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/fodlam/yds/utility/b;->a(Landroid/content/Context;)Lcom/fodlam/yds/utility/b;

    move-result-object v0

    check-cast p2, Ljava/lang/String;

    invoke-virtual {v0, p2}, Lcom/fodlam/yds/utility/b;->a(Ljava/lang/String;)V

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
