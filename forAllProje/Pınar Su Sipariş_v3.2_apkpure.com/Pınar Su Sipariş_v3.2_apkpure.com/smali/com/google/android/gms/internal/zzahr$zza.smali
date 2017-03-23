.class public final enum Lcom/google/android/gms/internal/zzahr$zza;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/zzahr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401c
    name = "zza"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/google/android/gms/internal/zzahr$zza;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum zzbRb:Lcom/google/android/gms/internal/zzahr$zza;

.field public static final enum zzbRc:Lcom/google/android/gms/internal/zzahr$zza;

.field public static final enum zzbRd:Lcom/google/android/gms/internal/zzahr$zza;

.field public static final enum zzbRe:Lcom/google/android/gms/internal/zzahr$zza;

.field private static final synthetic zzbRf:[Lcom/google/android/gms/internal/zzahr$zza;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    new-instance v0, Lcom/google/android/gms/internal/zzahr$zza;

    const-string v1, "DeferredValue"

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/zzahr$zza;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/zzahr$zza;->zzbRb:Lcom/google/android/gms/internal/zzahr$zza;

    new-instance v0, Lcom/google/android/gms/internal/zzahr$zza;

    const-string v1, "Boolean"

    invoke-direct {v0, v1, v3}, Lcom/google/android/gms/internal/zzahr$zza;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/zzahr$zza;->zzbRc:Lcom/google/android/gms/internal/zzahr$zza;

    new-instance v0, Lcom/google/android/gms/internal/zzahr$zza;

    const-string v1, "Number"

    invoke-direct {v0, v1, v4}, Lcom/google/android/gms/internal/zzahr$zza;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/zzahr$zza;->zzbRd:Lcom/google/android/gms/internal/zzahr$zza;

    new-instance v0, Lcom/google/android/gms/internal/zzahr$zza;

    const-string v1, "String"

    invoke-direct {v0, v1, v5}, Lcom/google/android/gms/internal/zzahr$zza;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/zzahr$zza;->zzbRe:Lcom/google/android/gms/internal/zzahr$zza;

    const/4 v0, 0x4

    new-array v0, v0, [Lcom/google/android/gms/internal/zzahr$zza;

    sget-object v1, Lcom/google/android/gms/internal/zzahr$zza;->zzbRb:Lcom/google/android/gms/internal/zzahr$zza;

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/android/gms/internal/zzahr$zza;->zzbRc:Lcom/google/android/gms/internal/zzahr$zza;

    aput-object v1, v0, v3

    sget-object v1, Lcom/google/android/gms/internal/zzahr$zza;->zzbRd:Lcom/google/android/gms/internal/zzahr$zza;

    aput-object v1, v0, v4

    sget-object v1, Lcom/google/android/gms/internal/zzahr$zza;->zzbRe:Lcom/google/android/gms/internal/zzahr$zza;

    aput-object v1, v0, v5

    sput-object v0, Lcom/google/android/gms/internal/zzahr$zza;->zzbRf:[Lcom/google/android/gms/internal/zzahr$zza;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static values()[Lcom/google/android/gms/internal/zzahr$zza;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/zzahr$zza;->zzbRf:[Lcom/google/android/gms/internal/zzahr$zza;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/zzahr$zza;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/zzahr$zza;

    return-object v0
.end method
