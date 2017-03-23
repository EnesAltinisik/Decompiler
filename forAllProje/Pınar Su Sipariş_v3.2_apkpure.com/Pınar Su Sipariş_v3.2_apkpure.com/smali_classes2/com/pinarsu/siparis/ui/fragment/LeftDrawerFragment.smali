.class public Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;
.super Landroid/support/v4/app/Fragment;
.source "LeftDrawerFragment.java"

# interfaces
.implements Lcom/pinarsu/siparis/interfaces/IRequestPermissionsResult;


# static fields
.field static final PINAR_CUSTOMER_PHONE_NUMBER:Ljava/lang/String; = "4449900"

.field private static drawableIds:[Ljava/lang/Integer;


# instance fields
.field private activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

.field private adapter:Lcom/pinarsu/siparis/adapter/LeftNavigationBaseAdapter;

.field lv:Landroid/widget/ListView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00b5
    .end annotation
.end field

.field public mDrawerLayout:Landroid/support/v4/widget/DrawerLayout;

.field private mDrawerToggle:Landroid/support/v7/app/ActionBarDrawerToggle;

.field private permissionHelper:Lcom/pinarsu/siparis/tools/PermissionHelper;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 56
    const/4 v0, 0x7

    new-array v0, v0, [Ljava/lang/Integer;

    const/4 v1, 0x0

    const v2, 0x7f0200b0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const v2, 0x7f0200f8

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const v2, 0x7f0200a7

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const v2, 0x7f0200da

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const v2, 0x7f0200c8

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x5

    const v2, 0x7f02004f

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const v2, 0x7f0200c5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    sput-object v0, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;->drawableIds:[Ljava/lang/Integer;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 45
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 47
    return-void
.end method

.method static synthetic access$000(Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;)Landroid/support/v7/app/ActionBarDrawerToggle;
    .locals 1

    .prologue
    .line 44
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;->mDrawerToggle:Landroid/support/v7/app/ActionBarDrawerToggle;

    return-object v0
.end method

.method public static getData()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/pinarsu/siparis/model/NavDrawerItem;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    const/4 v5, 0x1

    .line 93
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 96
    sget-object v0, Lcom/pinarsu/siparis/Preferences;->PHONE_NUMBER:Ljava/lang/String;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/pinarsu/siparis/Preferences;->PHONE_NUMBER:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 97
    sput-boolean v1, Lcom/pinarsu/siparis/ui/activity/MainActivity;->TRY_APP:Z

    :goto_0
    move v0, v1

    .line 102
    :goto_1
    sget-object v2, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;->drawableIds:[Ljava/lang/Integer;

    array-length v2, v2

    if-ge v0, v2, :cond_4

    .line 103
    sget-boolean v2, Lcom/pinarsu/siparis/ui/activity/MainActivity;->TRY_APP:Z

    if-nez v2, :cond_1

    .line 104
    new-instance v2, Lcom/pinarsu/siparis/model/NavDrawerItem;

    sget-object v4, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;->drawableIds:[Ljava/lang/Integer;

    aget-object v4, v4, v0

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-direct {v2, v4, v5}, Lcom/pinarsu/siparis/model/NavDrawerItem;-><init>(IZ)V

    .line 111
    :goto_2
    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 102
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 99
    :cond_0
    sput-boolean v5, Lcom/pinarsu/siparis/ui/activity/MainActivity;->TRY_APP:Z

    goto :goto_0

    .line 106
    :cond_1
    if-eq v0, v5, :cond_2

    const/4 v2, 0x3

    if-ne v0, v2, :cond_3

    .line 107
    :cond_2
    new-instance v2, Lcom/pinarsu/siparis/model/NavDrawerItem;

    sget-object v4, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;->drawableIds:[Ljava/lang/Integer;

    aget-object v4, v4, v0

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-direct {v2, v4, v1}, Lcom/pinarsu/siparis/model/NavDrawerItem;-><init>(IZ)V

    goto :goto_2

    .line 109
    :cond_3
    new-instance v2, Lcom/pinarsu/siparis/model/NavDrawerItem;

    sget-object v4, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;->drawableIds:[Ljava/lang/Integer;

    aget-object v4, v4, v0

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-direct {v2, v4, v5}, Lcom/pinarsu/siparis/model/NavDrawerItem;-><init>(IZ)V

    goto :goto_2

    .line 113
    :cond_4
    return-object v3
.end method


# virtual methods
.method clickCall()V
    .locals 3
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f0d010a
        }
    .end annotation

    .prologue
    .line 136
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    invoke-virtual {v0, p0}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->setRequestPermissionsDelegate(Lcom/pinarsu/siparis/interfaces/IRequestPermissionsResult;)V

    .line 137
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "android.permission.CALL_PHONE"

    aput-object v2, v0, v1

    .line 138
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;->permissionHelper:Lcom/pinarsu/siparis/tools/PermissionHelper;

    invoke-virtual {v1}, Lcom/pinarsu/siparis/tools/PermissionHelper;->isAndroidVersion6AndGreater()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 139
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;->permissionHelper:Lcom/pinarsu/siparis/tools/PermissionHelper;

    invoke-virtual {v1, v0}, Lcom/pinarsu/siparis/tools/PermissionHelper;->checkPermissionGranted([Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 140
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;->permissionHelper:Lcom/pinarsu/siparis/tools/PermissionHelper;

    invoke-virtual {v1, v0}, Lcom/pinarsu/siparis/tools/PermissionHelper;->requestPermissions([Ljava/lang/String;)V

    .line 145
    :goto_0
    return-void

    .line 142
    :cond_0
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    const-string v1, "4449900"

    invoke-static {v0, v1}, Lcom/pinarsu/siparis/tools/Tools;->callNumber(Landroid/support/v7/app/AppCompatActivity;Ljava/lang/String;)V

    goto :goto_0

    .line 144
    :cond_1
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    const-string v1, "4449900"

    invoke-static {v0, v1}, Lcom/pinarsu/siparis/tools/Tools;->callNumber(Landroid/support/v7/app/AppCompatActivity;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public closeLeftDrawer()V
    .locals 2

    .prologue
    .line 75
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;->mDrawerLayout:Landroid/support/v4/widget/DrawerLayout;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/support/v4/widget/DrawerLayout;->f(I)V

    .line 76
    return-void
.end method

.method public isDrawerOpen()Z
    .locals 2

    .prologue
    .line 84
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;->mDrawerLayout:Landroid/support/v4/widget/DrawerLayout;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/support/v4/widget/DrawerLayout;->g(I)Z

    move-result v0

    return v0
.end method

.method itemClick(Landroid/view/View;I)V
    .locals 3
    .annotation build Lbutterknife/OnItemClick;
        value = {
            0x7f0d00b5
        }
    .end annotation

    .prologue
    .line 191
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;->adapter:Lcom/pinarsu/siparis/adapter/LeftNavigationBaseAdapter;

    invoke-virtual {v0, p2}, Lcom/pinarsu/siparis/adapter/LeftNavigationBaseAdapter;->getItem(I)Lcom/pinarsu/siparis/model/NavDrawerItem;

    move-result-object v0

    iget-boolean v0, v0, Lcom/pinarsu/siparis/model/NavDrawerItem;->isActive:Z

    if-eqz v0, :cond_0

    .line 192
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    invoke-virtual {v0, p1, p2}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->onItemClick(Landroid/view/View;I)V

    .line 194
    :cond_0
    const-string v0, "MNTTAG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "position : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 195
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .prologue
    .line 120
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/ui/activity/MainActivity;

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    .line 121
    new-instance v0, Lcom/pinarsu/siparis/tools/PermissionHelper;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    invoke-direct {v0, v1}, Lcom/pinarsu/siparis/tools/PermissionHelper;-><init>(Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;->permissionHelper:Lcom/pinarsu/siparis/tools/PermissionHelper;

    .line 122
    const v0, 0x7f030044

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    .line 123
    return-object v0
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 2

    .prologue
    .line 150
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;->permissionHelper:Lcom/pinarsu/siparis/tools/PermissionHelper;

    invoke-virtual {v0, p1, p2, p3}, Lcom/pinarsu/siparis/tools/PermissionHelper;->onRequestPermissionsResult(I[Ljava/lang/String;[I)Z

    move-result v0

    .line 151
    if-eqz v0, :cond_0

    .line 152
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    const-string v1, "4449900"

    invoke-static {v0, v1}, Lcom/pinarsu/siparis/tools/Tools;->callNumber(Landroid/support/v7/app/AppCompatActivity;Ljava/lang/String;)V

    .line 154
    :cond_0
    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 128
    invoke-super {p0, p1, p2}, Landroid/support/v4/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 129
    invoke-static {p0, p1}, Lbutterknife/ButterKnife;->inject(Ljava/lang/Object;Landroid/view/View;)V

    .line 130
    new-instance v0, Lcom/pinarsu/siparis/adapter/LeftNavigationBaseAdapter;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    invoke-static {}, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;->getData()Ljava/util/List;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/pinarsu/siparis/adapter/LeftNavigationBaseAdapter;-><init>(Landroid/app/Activity;Ljava/util/List;)V

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;->adapter:Lcom/pinarsu/siparis/adapter/LeftNavigationBaseAdapter;

    .line 131
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;->lv:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;->adapter:Lcom/pinarsu/siparis/adapter/LeftNavigationBaseAdapter;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 132
    return-void
.end method

.method public openLeftDrawer()V
    .locals 2

    .prologue
    .line 66
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;->mDrawerLayout:Landroid/support/v4/widget/DrawerLayout;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/support/v4/widget/DrawerLayout;->e(I)V

    .line 67
    return-void
.end method

.method public remove(I)V
    .locals 1

    .prologue
    .line 198
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;->adapter:Lcom/pinarsu/siparis/adapter/LeftNavigationBaseAdapter;

    invoke-virtual {v0, p1}, Lcom/pinarsu/siparis/adapter/LeftNavigationBaseAdapter;->remove(I)V

    .line 199
    return-void
.end method

.method public setItemVisibility(IZ)V
    .locals 1

    .prologue
    .line 208
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;->adapter:Lcom/pinarsu/siparis/adapter/LeftNavigationBaseAdapter;

    invoke-virtual {v0, p1, p2}, Lcom/pinarsu/siparis/adapter/LeftNavigationBaseAdapter;->setItemVisibility(IZ)V

    .line 209
    return-void
.end method

.method public setUp(ILandroid/support/v4/widget/DrawerLayout;Landroid/support/v7/widget/Toolbar;)V
    .locals 7

    .prologue
    .line 158
    iput-object p2, p0, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;->mDrawerLayout:Landroid/support/v4/widget/DrawerLayout;

    .line 159
    new-instance v0, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment$1;

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    const v5, 0x7f060072

    const v6, 0x7f060071

    move-object v1, p0

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v6}, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment$1;-><init>(Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;Landroid/app/Activity;Landroid/support/v4/widget/DrawerLayout;Landroid/support/v7/widget/Toolbar;II)V

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;->mDrawerToggle:Landroid/support/v7/app/ActionBarDrawerToggle;

    .line 178
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;->mDrawerToggle:Landroid/support/v7/app/ActionBarDrawerToggle;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBarDrawerToggle;->setDrawerIndicatorEnabled(Z)V

    .line 179
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;->mDrawerLayout:Landroid/support/v4/widget/DrawerLayout;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;->mDrawerToggle:Landroid/support/v7/app/ActionBarDrawerToggle;

    invoke-virtual {v0, v1}, Landroid/support/v4/widget/DrawerLayout;->setDrawerListener(Landroid/support/v4/widget/DrawerLayout$f;)V

    .line 180
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;->mDrawerLayout:Landroid/support/v4/widget/DrawerLayout;

    new-instance v1, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment$2;

    invoke-direct {v1, p0}, Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment$2;-><init>(Lcom/pinarsu/siparis/ui/fragment/LeftDrawerFragment;)V

    invoke-virtual {v0, v1}, Landroid/support/v4/widget/DrawerLayout;->post(Ljava/lang/Runnable;)Z

    .line 187
    return-void
.end method
