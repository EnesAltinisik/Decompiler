.class public Lcom/pinarsu/siparis/ui/fragment/DatePickerFragment;
.super Landroid/support/v4/app/DialogFragment;
.source "DatePickerFragment.java"

# interfaces
.implements Landroid/app/DatePickerDialog$OnDateSetListener;


# instance fields
.field private delegate:Lcom/pinarsu/siparis/interfaces/IDatePickerListener;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Landroid/support/v4/app/DialogFragment;-><init>()V

    return-void
.end method

.method public static newInstance(Lcom/pinarsu/siparis/interfaces/IDatePickerListener;III)Lcom/pinarsu/siparis/ui/fragment/DatePickerFragment;
    .locals 3

    .prologue
    .line 25
    new-instance v0, Lcom/pinarsu/siparis/ui/fragment/DatePickerFragment;

    invoke-direct {v0}, Lcom/pinarsu/siparis/ui/fragment/DatePickerFragment;-><init>()V

    .line 26
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 27
    const-string v2, "delegate"

    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 28
    const-string v2, "year"

    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 29
    const-string v2, "month"

    invoke-virtual {v1, v2, p2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 30
    const-string v2, "day"

    invoke-virtual {v1, v2, p3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 31
    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/ui/fragment/DatePickerFragment;->setArguments(Landroid/os/Bundle;)V

    .line 32
    return-object v0
.end method


# virtual methods
.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 6

    .prologue
    .line 38
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/fragment/DatePickerFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    .line 39
    const-string v0, "delegate"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/interfaces/IDatePickerListener;

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/DatePickerFragment;->delegate:Lcom/pinarsu/siparis/interfaces/IDatePickerListener;

    .line 40
    const-string v0, "year"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v3

    .line 41
    const-string v0, "month"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v4

    .line 42
    const-string v0, "day"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v5

    .line 44
    new-instance v0, Landroid/app/DatePickerDialog;

    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/fragment/DatePickerFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    move-object v2, p0

    invoke-direct/range {v0 .. v5}, Landroid/app/DatePickerDialog;-><init>(Landroid/content/Context;Landroid/app/DatePickerDialog$OnDateSetListener;III)V

    return-object v0
.end method

.method public onDateSet(Landroid/widget/DatePicker;III)V
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/DatePickerFragment;->delegate:Lcom/pinarsu/siparis/interfaces/IDatePickerListener;

    invoke-interface {v0, p2, p3, p4}, Lcom/pinarsu/siparis/interfaces/IDatePickerListener;->onDateSet(III)V

    .line 50
    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 59
    return-void
.end method

.method public show(Landroid/support/v7/app/AppCompatActivity;)V
    .locals 2

    .prologue
    .line 53
    invoke-virtual {p1}, Landroid/support/v7/app/AppCompatActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    .line 54
    const-string v1, "Date Picker"

    invoke-virtual {p0, v0, v1}, Lcom/pinarsu/siparis/ui/fragment/DatePickerFragment;->show(Landroid/support/v4/app/FragmentManager;Ljava/lang/String;)V

    .line 55
    return-void
.end method
