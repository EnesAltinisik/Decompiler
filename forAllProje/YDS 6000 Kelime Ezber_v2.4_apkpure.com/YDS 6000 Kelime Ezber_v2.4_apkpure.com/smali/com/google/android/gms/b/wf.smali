.class public final Lcom/google/android/gms/b/wf;
.super Lcom/google/android/gms/common/internal/safeparcel/a;


# annotations
.annotation runtime Lcom/google/android/gms/b/vz;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/b/wf$a;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/b/wf;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final A:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final B:J

.field public final C:Lcom/google/android/gms/b/wm;

.field public final D:Ljava/lang/String;

.field public final E:F

.field public final F:I

.field public final G:I

.field public final H:Z

.field public final I:Z

.field public final J:Ljava/lang/String;

.field public final K:Z

.field public final L:Ljava/lang/String;

.field public final M:Z

.field public final N:I

.field public final O:Landroid/os/Bundle;

.field public final P:Ljava/lang/String;

.field public final a:I

.field public final b:Landroid/os/Bundle;

.field public final c:Lcom/google/android/gms/b/ns;

.field public final d:Lcom/google/android/gms/b/nx;

.field public final e:Ljava/lang/String;

.field public final f:Landroid/content/pm/ApplicationInfo;

.field public final g:Landroid/content/pm/PackageInfo;

.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/String;

.field public final j:Ljava/lang/String;

.field public final k:Lcom/google/android/gms/b/aab;

.field public final l:Landroid/os/Bundle;

.field public final m:I

.field public final n:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final o:Landroid/os/Bundle;

.field public final p:Z

.field public final q:Landroid/os/Messenger;

.field public final r:I

.field public final s:I

.field public final t:F

.field public final u:Ljava/lang/String;

.field public final v:J

.field public final w:Ljava/lang/String;

.field public final x:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final y:Ljava/lang/String;

.field public final z:Lcom/google/android/gms/b/qr;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/b/wg;

    invoke-direct {v0}, Lcom/google/android/gms/b/wg;-><init>()V

    sput-object v0, Lcom/google/android/gms/b/wf;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILandroid/os/Bundle;Lcom/google/android/gms/b/ns;Lcom/google/android/gms/b/nx;Ljava/lang/String;Landroid/content/pm/ApplicationInfo;Landroid/content/pm/PackageInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/b/aab;Landroid/os/Bundle;ILjava/util/List;Landroid/os/Bundle;ZLandroid/os/Messenger;IIFLjava/lang/String;JLjava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/google/android/gms/b/qr;Ljava/util/List;JLcom/google/android/gms/b/wm;Ljava/lang/String;FZIIZZLjava/lang/String;Ljava/lang/String;ZILandroid/os/Bundle;Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroid/os/Bundle;",
            "Lcom/google/android/gms/b/ns;",
            "Lcom/google/android/gms/b/nx;",
            "Ljava/lang/String;",
            "Landroid/content/pm/ApplicationInfo;",
            "Landroid/content/pm/PackageInfo;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/b/aab;",
            "Landroid/os/Bundle;",
            "I",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Landroid/os/Bundle;",
            "Z",
            "Landroid/os/Messenger;",
            "IIF",
            "Ljava/lang/String;",
            "J",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/b/qr;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;J",
            "Lcom/google/android/gms/b/wm;",
            "Ljava/lang/String;",
            "FZIIZZ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "ZI",
            "Landroid/os/Bundle;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/a;-><init>()V

    iput p1, p0, Lcom/google/android/gms/b/wf;->a:I

    iput-object p2, p0, Lcom/google/android/gms/b/wf;->b:Landroid/os/Bundle;

    iput-object p3, p0, Lcom/google/android/gms/b/wf;->c:Lcom/google/android/gms/b/ns;

    iput-object p4, p0, Lcom/google/android/gms/b/wf;->d:Lcom/google/android/gms/b/nx;

    iput-object p5, p0, Lcom/google/android/gms/b/wf;->e:Ljava/lang/String;

    iput-object p6, p0, Lcom/google/android/gms/b/wf;->f:Landroid/content/pm/ApplicationInfo;

    iput-object p7, p0, Lcom/google/android/gms/b/wf;->g:Landroid/content/pm/PackageInfo;

    iput-object p8, p0, Lcom/google/android/gms/b/wf;->h:Ljava/lang/String;

    iput-object p9, p0, Lcom/google/android/gms/b/wf;->i:Ljava/lang/String;

    iput-object p10, p0, Lcom/google/android/gms/b/wf;->j:Ljava/lang/String;

    iput-object p11, p0, Lcom/google/android/gms/b/wf;->k:Lcom/google/android/gms/b/aab;

    iput-object p12, p0, Lcom/google/android/gms/b/wf;->l:Landroid/os/Bundle;

    move/from16 v0, p13

    iput v0, p0, Lcom/google/android/gms/b/wf;->m:I

    move-object/from16 v0, p14

    iput-object v0, p0, Lcom/google/android/gms/b/wf;->n:Ljava/util/List;

    if-nez p28, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v2

    :goto_0
    iput-object v2, p0, Lcom/google/android/gms/b/wf;->A:Ljava/util/List;

    move-object/from16 v0, p15

    iput-object v0, p0, Lcom/google/android/gms/b/wf;->o:Landroid/os/Bundle;

    move/from16 v0, p16

    iput-boolean v0, p0, Lcom/google/android/gms/b/wf;->p:Z

    move-object/from16 v0, p17

    iput-object v0, p0, Lcom/google/android/gms/b/wf;->q:Landroid/os/Messenger;

    move/from16 v0, p18

    iput v0, p0, Lcom/google/android/gms/b/wf;->r:I

    move/from16 v0, p19

    iput v0, p0, Lcom/google/android/gms/b/wf;->s:I

    move/from16 v0, p20

    iput v0, p0, Lcom/google/android/gms/b/wf;->t:F

    move-object/from16 v0, p21

    iput-object v0, p0, Lcom/google/android/gms/b/wf;->u:Ljava/lang/String;

    move-wide/from16 v0, p22

    iput-wide v0, p0, Lcom/google/android/gms/b/wf;->v:J

    move-object/from16 v0, p24

    iput-object v0, p0, Lcom/google/android/gms/b/wf;->w:Ljava/lang/String;

    if-nez p25, :cond_1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v2

    :goto_1
    iput-object v2, p0, Lcom/google/android/gms/b/wf;->x:Ljava/util/List;

    move-object/from16 v0, p26

    iput-object v0, p0, Lcom/google/android/gms/b/wf;->y:Ljava/lang/String;

    move-object/from16 v0, p27

    iput-object v0, p0, Lcom/google/android/gms/b/wf;->z:Lcom/google/android/gms/b/qr;

    move-wide/from16 v0, p29

    iput-wide v0, p0, Lcom/google/android/gms/b/wf;->B:J

    move-object/from16 v0, p31

    iput-object v0, p0, Lcom/google/android/gms/b/wf;->C:Lcom/google/android/gms/b/wm;

    move-object/from16 v0, p32

    iput-object v0, p0, Lcom/google/android/gms/b/wf;->D:Ljava/lang/String;

    move/from16 v0, p33

    iput v0, p0, Lcom/google/android/gms/b/wf;->E:F

    move/from16 v0, p34

    iput-boolean v0, p0, Lcom/google/android/gms/b/wf;->K:Z

    move/from16 v0, p35

    iput v0, p0, Lcom/google/android/gms/b/wf;->F:I

    move/from16 v0, p36

    iput v0, p0, Lcom/google/android/gms/b/wf;->G:I

    move/from16 v0, p37

    iput-boolean v0, p0, Lcom/google/android/gms/b/wf;->H:Z

    move/from16 v0, p38

    iput-boolean v0, p0, Lcom/google/android/gms/b/wf;->I:Z

    move-object/from16 v0, p39

    iput-object v0, p0, Lcom/google/android/gms/b/wf;->J:Ljava/lang/String;

    move-object/from16 v0, p40

    iput-object v0, p0, Lcom/google/android/gms/b/wf;->L:Ljava/lang/String;

    move/from16 v0, p41

    iput-boolean v0, p0, Lcom/google/android/gms/b/wf;->M:Z

    move/from16 v0, p42

    iput v0, p0, Lcom/google/android/gms/b/wf;->N:I

    move-object/from16 v0, p43

    iput-object v0, p0, Lcom/google/android/gms/b/wf;->O:Landroid/os/Bundle;

    move-object/from16 v0, p44

    iput-object v0, p0, Lcom/google/android/gms/b/wf;->P:Ljava/lang/String;

    return-void

    :cond_0
    invoke-static/range {p28 .. p28}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    goto :goto_0

    :cond_1
    invoke-static/range {p25 .. p25}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    goto :goto_1
.end method

.method public constructor <init>(Landroid/os/Bundle;Lcom/google/android/gms/b/ns;Lcom/google/android/gms/b/nx;Ljava/lang/String;Landroid/content/pm/ApplicationInfo;Landroid/content/pm/PackageInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/b/aab;Landroid/os/Bundle;ILjava/util/List;Ljava/util/List;Landroid/os/Bundle;ZLandroid/os/Messenger;IIFLjava/lang/String;JLjava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/google/android/gms/b/qr;JLcom/google/android/gms/b/wm;Ljava/lang/String;FZIIZZLjava/lang/String;Ljava/lang/String;ZILandroid/os/Bundle;Ljava/lang/String;)V
    .locals 46
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Bundle;",
            "Lcom/google/android/gms/b/ns;",
            "Lcom/google/android/gms/b/nx;",
            "Ljava/lang/String;",
            "Landroid/content/pm/ApplicationInfo;",
            "Landroid/content/pm/PackageInfo;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/b/aab;",
            "Landroid/os/Bundle;",
            "I",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Landroid/os/Bundle;",
            "Z",
            "Landroid/os/Messenger;",
            "IIF",
            "Ljava/lang/String;",
            "J",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/b/qr;",
            "J",
            "Lcom/google/android/gms/b/wm;",
            "Ljava/lang/String;",
            "FZIIZZ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "ZI",
            "Landroid/os/Bundle;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const/16 v1, 0x13

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p15

    move/from16 v16, p16

    move-object/from16 v17, p17

    move/from16 v18, p18

    move/from16 v19, p19

    move/from16 v20, p20

    move-object/from16 v21, p21

    move-wide/from16 v22, p22

    move-object/from16 v24, p24

    move-object/from16 v25, p25

    move-object/from16 v26, p26

    move-object/from16 v27, p27

    move-object/from16 v28, p14

    move-wide/from16 v29, p28

    move-object/from16 v31, p30

    move-object/from16 v32, p31

    move/from16 v33, p32

    move/from16 v34, p33

    move/from16 v35, p34

    move/from16 v36, p35

    move/from16 v37, p36

    move/from16 v38, p37

    move-object/from16 v39, p38

    move-object/from16 v40, p39

    move/from16 v41, p40

    move/from16 v42, p41

    move-object/from16 v43, p42

    move-object/from16 v44, p43

    invoke-direct/range {v0 .. v44}, Lcom/google/android/gms/b/wf;-><init>(ILandroid/os/Bundle;Lcom/google/android/gms/b/ns;Lcom/google/android/gms/b/nx;Ljava/lang/String;Landroid/content/pm/ApplicationInfo;Landroid/content/pm/PackageInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/b/aab;Landroid/os/Bundle;ILjava/util/List;Landroid/os/Bundle;ZLandroid/os/Messenger;IIFLjava/lang/String;JLjava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/google/android/gms/b/qr;Ljava/util/List;JLcom/google/android/gms/b/wm;Ljava/lang/String;FZIIZZLjava/lang/String;Ljava/lang/String;ZILandroid/os/Bundle;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/b/wf$a;Ljava/lang/String;J)V
    .locals 47

    move-object/from16 v0, p1

    iget-object v3, v0, Lcom/google/android/gms/b/wf$a;->a:Landroid/os/Bundle;

    move-object/from16 v0, p1

    iget-object v4, v0, Lcom/google/android/gms/b/wf$a;->b:Lcom/google/android/gms/b/ns;

    move-object/from16 v0, p1

    iget-object v5, v0, Lcom/google/android/gms/b/wf$a;->c:Lcom/google/android/gms/b/nx;

    move-object/from16 v0, p1

    iget-object v6, v0, Lcom/google/android/gms/b/wf$a;->d:Ljava/lang/String;

    move-object/from16 v0, p1

    iget-object v7, v0, Lcom/google/android/gms/b/wf$a;->e:Landroid/content/pm/ApplicationInfo;

    move-object/from16 v0, p1

    iget-object v8, v0, Lcom/google/android/gms/b/wf$a;->f:Landroid/content/pm/PackageInfo;

    move-object/from16 v0, p1

    iget-object v10, v0, Lcom/google/android/gms/b/wf$a;->g:Ljava/lang/String;

    move-object/from16 v0, p1

    iget-object v11, v0, Lcom/google/android/gms/b/wf$a;->h:Ljava/lang/String;

    move-object/from16 v0, p1

    iget-object v12, v0, Lcom/google/android/gms/b/wf$a;->j:Lcom/google/android/gms/b/aab;

    move-object/from16 v0, p1

    iget-object v13, v0, Lcom/google/android/gms/b/wf$a;->i:Landroid/os/Bundle;

    move-object/from16 v0, p1

    iget v14, v0, Lcom/google/android/gms/b/wf$a;->k:I

    move-object/from16 v0, p1

    iget-object v15, v0, Lcom/google/android/gms/b/wf$a;->l:Ljava/util/List;

    move-object/from16 v0, p1

    iget-object v0, v0, Lcom/google/android/gms/b/wf$a;->m:Ljava/util/List;

    move-object/from16 v16, v0

    move-object/from16 v0, p1

    iget-object v0, v0, Lcom/google/android/gms/b/wf$a;->n:Landroid/os/Bundle;

    move-object/from16 v17, v0

    move-object/from16 v0, p1

    iget-boolean v0, v0, Lcom/google/android/gms/b/wf$a;->o:Z

    move/from16 v18, v0

    move-object/from16 v0, p1

    iget-object v0, v0, Lcom/google/android/gms/b/wf$a;->p:Landroid/os/Messenger;

    move-object/from16 v19, v0

    move-object/from16 v0, p1

    iget v0, v0, Lcom/google/android/gms/b/wf$a;->q:I

    move/from16 v20, v0

    move-object/from16 v0, p1

    iget v0, v0, Lcom/google/android/gms/b/wf$a;->r:I

    move/from16 v21, v0

    move-object/from16 v0, p1

    iget v0, v0, Lcom/google/android/gms/b/wf$a;->s:F

    move/from16 v22, v0

    move-object/from16 v0, p1

    iget-object v0, v0, Lcom/google/android/gms/b/wf$a;->t:Ljava/lang/String;

    move-object/from16 v23, v0

    move-object/from16 v0, p1

    iget-wide v0, v0, Lcom/google/android/gms/b/wf$a;->u:J

    move-wide/from16 v24, v0

    move-object/from16 v0, p1

    iget-object v0, v0, Lcom/google/android/gms/b/wf$a;->v:Ljava/lang/String;

    move-object/from16 v26, v0

    move-object/from16 v0, p1

    iget-object v0, v0, Lcom/google/android/gms/b/wf$a;->w:Ljava/util/List;

    move-object/from16 v27, v0

    move-object/from16 v0, p1

    iget-object v0, v0, Lcom/google/android/gms/b/wf$a;->x:Ljava/lang/String;

    move-object/from16 v28, v0

    move-object/from16 v0, p1

    iget-object v0, v0, Lcom/google/android/gms/b/wf$a;->y:Lcom/google/android/gms/b/qr;

    move-object/from16 v29, v0

    move-object/from16 v0, p1

    iget-object v0, v0, Lcom/google/android/gms/b/wf$a;->z:Lcom/google/android/gms/b/wm;

    move-object/from16 v32, v0

    move-object/from16 v0, p1

    iget-object v0, v0, Lcom/google/android/gms/b/wf$a;->A:Ljava/lang/String;

    move-object/from16 v33, v0

    move-object/from16 v0, p1

    iget v0, v0, Lcom/google/android/gms/b/wf$a;->B:F

    move/from16 v34, v0

    move-object/from16 v0, p1

    iget-boolean v0, v0, Lcom/google/android/gms/b/wf$a;->C:Z

    move/from16 v35, v0

    move-object/from16 v0, p1

    iget v0, v0, Lcom/google/android/gms/b/wf$a;->D:I

    move/from16 v36, v0

    move-object/from16 v0, p1

    iget v0, v0, Lcom/google/android/gms/b/wf$a;->E:I

    move/from16 v37, v0

    move-object/from16 v0, p1

    iget-boolean v0, v0, Lcom/google/android/gms/b/wf$a;->F:Z

    move/from16 v38, v0

    move-object/from16 v0, p1

    iget-boolean v0, v0, Lcom/google/android/gms/b/wf$a;->G:Z

    move/from16 v39, v0

    move-object/from16 v0, p1

    iget-object v0, v0, Lcom/google/android/gms/b/wf$a;->H:Ljava/lang/String;

    move-object/from16 v40, v0

    move-object/from16 v0, p1

    iget-object v0, v0, Lcom/google/android/gms/b/wf$a;->I:Ljava/lang/String;

    move-object/from16 v41, v0

    move-object/from16 v0, p1

    iget-boolean v0, v0, Lcom/google/android/gms/b/wf$a;->J:Z

    move/from16 v42, v0

    move-object/from16 v0, p1

    iget v0, v0, Lcom/google/android/gms/b/wf$a;->K:I

    move/from16 v43, v0

    move-object/from16 v0, p1

    iget-object v0, v0, Lcom/google/android/gms/b/wf$a;->L:Landroid/os/Bundle;

    move-object/from16 v44, v0

    move-object/from16 v0, p1

    iget-object v0, v0, Lcom/google/android/gms/b/wf$a;->M:Ljava/lang/String;

    move-object/from16 v45, v0

    move-object/from16 v2, p0

    move-object/from16 v9, p2

    move-wide/from16 v30, p3

    invoke-direct/range {v2 .. v45}, Lcom/google/android/gms/b/wf;-><init>(Landroid/os/Bundle;Lcom/google/android/gms/b/ns;Lcom/google/android/gms/b/nx;Ljava/lang/String;Landroid/content/pm/ApplicationInfo;Landroid/content/pm/PackageInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/b/aab;Landroid/os/Bundle;ILjava/util/List;Ljava/util/List;Landroid/os/Bundle;ZLandroid/os/Messenger;IIFLjava/lang/String;JLjava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/google/android/gms/b/qr;JLcom/google/android/gms/b/wm;Ljava/lang/String;FZIIZZLjava/lang/String;Ljava/lang/String;ZILandroid/os/Bundle;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/b/wg;->a(Lcom/google/android/gms/b/wf;Landroid/os/Parcel;I)V

    return-void
.end method
