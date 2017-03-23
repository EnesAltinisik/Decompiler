.class Lcom/fodlam/yds/SettingsActivity$GeneralPreferenceFragment$1;
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

    iput-object p1, p0, Lcom/fodlam/yds/SettingsActivity$GeneralPreferenceFragment$1;->a:Lcom/fodlam/yds/SettingsActivity$GeneralPreferenceFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPreferenceChange(Landroid/preference/Preference;Ljava/lang/Object;)Z
    .locals 1

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    sput-boolean v0, Lcom/fodlam/yds/OxfordApplication;->e:Z

    const/4 v0, 0x1

    return v0
.end method
