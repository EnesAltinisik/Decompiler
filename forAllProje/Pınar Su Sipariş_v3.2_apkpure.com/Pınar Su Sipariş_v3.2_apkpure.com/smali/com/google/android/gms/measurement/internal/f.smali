.class Lcom/google/android/gms/measurement/internal/f;
.super Lcom/google/android/gms/measurement/internal/b;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/zzx;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/measurement/internal/b;-><init>(Lcom/google/android/gms/measurement/internal/zzx;)V

    return-void
.end method

.method private a(Lcom/google/android/gms/internal/zzsn$zzb;Lcom/google/android/gms/internal/zzsp$zzb;J)Ljava/lang/Boolean;
    .locals 11

    iget-object v0, p1, Lcom/google/android/gms/internal/zzsn$zzb;->zzbgq:Lcom/google/android/gms/internal/zzsn$zzd;

    if-eqz v0, :cond_1

    new-instance v0, Lcom/google/android/gms/measurement/internal/j;

    iget-object v1, p1, Lcom/google/android/gms/internal/zzsn$zzb;->zzbgq:Lcom/google/android/gms/internal/zzsn$zzd;

    invoke-direct {v0, v1}, Lcom/google/android/gms/measurement/internal/j;-><init>(Lcom/google/android/gms/internal/zzsn$zzd;)V

    invoke-virtual {v0, p3, p4}, Lcom/google/android/gms/measurement/internal/j;->a(J)Ljava/lang/Boolean;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iget-object v2, p1, Lcom/google/android/gms/internal/zzsn$zzb;->zzbgo:[Lcom/google/android/gms/internal/zzsn$zzc;

    array-length v3, v2

    const/4 v0, 0x0

    :goto_1
    if-ge v0, v3, :cond_3

    aget-object v4, v2, v0

    iget-object v5, v4, Lcom/google/android/gms/internal/zzsn$zzc;->zzbgv:Ljava/lang/String;

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/f;->zzFm()Lcom/google/android/gms/measurement/internal/zzp;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzp;->zzFG()Lcom/google/android/gms/measurement/internal/zzp$zza;

    move-result-object v0

    const-string v1, "null or empty param name in filter. event"

    iget-object v2, p2, Lcom/google/android/gms/internal/zzsp$zzb;->name:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/zzp$zza;->zzj(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v0, 0x0

    goto :goto_0

    :cond_2
    iget-object v4, v4, Lcom/google/android/gms/internal/zzsn$zzc;->zzbgv:Ljava/lang/String;

    invoke-interface {v1, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    new-instance v2, Landroid/support/v4/h/a;

    invoke-direct {v2}, Landroid/support/v4/h/a;-><init>()V

    iget-object v3, p2, Lcom/google/android/gms/internal/zzsp$zzb;->zzbgW:[Lcom/google/android/gms/internal/zzsp$zzc;

    array-length v4, v3

    const/4 v0, 0x0

    :goto_2
    if-ge v0, v4, :cond_8

    aget-object v5, v3, v0

    iget-object v6, v5, Lcom/google/android/gms/internal/zzsp$zzc;->name:Ljava/lang/String;

    invoke-interface {v1, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    iget-object v6, v5, Lcom/google/android/gms/internal/zzsp$zzc;->zzbha:Ljava/lang/Long;

    if-eqz v6, :cond_5

    iget-object v6, v5, Lcom/google/android/gms/internal/zzsp$zzc;->name:Ljava/lang/String;

    iget-object v5, v5, Lcom/google/android/gms/internal/zzsp$zzc;->zzbha:Ljava/lang/Long;

    invoke-interface {v2, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    :goto_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_5
    iget-object v6, v5, Lcom/google/android/gms/internal/zzsp$zzc;->zzbgf:Ljava/lang/Double;

    if-eqz v6, :cond_6

    iget-object v6, v5, Lcom/google/android/gms/internal/zzsp$zzc;->name:Ljava/lang/String;

    iget-object v5, v5, Lcom/google/android/gms/internal/zzsp$zzc;->zzbgf:Ljava/lang/Double;

    invoke-interface {v2, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_6
    iget-object v6, v5, Lcom/google/android/gms/internal/zzsp$zzc;->zzasH:Ljava/lang/String;

    if-eqz v6, :cond_7

    iget-object v6, v5, Lcom/google/android/gms/internal/zzsp$zzc;->name:Ljava/lang/String;

    iget-object v5, v5, Lcom/google/android/gms/internal/zzsp$zzc;->zzasH:Ljava/lang/String;

    invoke-interface {v2, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_7
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/f;->zzFm()Lcom/google/android/gms/measurement/internal/zzp;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzp;->zzFG()Lcom/google/android/gms/measurement/internal/zzp$zza;

    move-result-object v0

    const-string v1, "Unknown value for param. event, param"

    iget-object v2, p2, Lcom/google/android/gms/internal/zzsp$zzb;->name:Ljava/lang/String;

    iget-object v3, v5, Lcom/google/android/gms/internal/zzsp$zzc;->name:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/measurement/internal/zzp$zza;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x0

    goto/16 :goto_0

    :cond_8
    iget-object v3, p1, Lcom/google/android/gms/internal/zzsn$zzb;->zzbgo:[Lcom/google/android/gms/internal/zzsn$zzc;

    array-length v4, v3

    const/4 v0, 0x0

    move v1, v0

    :goto_4
    if-ge v1, v4, :cond_18

    aget-object v5, v3, v1

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iget-object v6, v5, Lcom/google/android/gms/internal/zzsn$zzc;->zzbgu:Ljava/lang/Boolean;

    invoke-virtual {v0, v6}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v6

    iget-object v7, v5, Lcom/google/android/gms/internal/zzsn$zzc;->zzbgv:Ljava/lang/String;

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/f;->zzFm()Lcom/google/android/gms/measurement/internal/zzp;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzp;->zzFG()Lcom/google/android/gms/measurement/internal/zzp$zza;

    move-result-object v0

    const-string v1, "Event has empty param name. event"

    iget-object v2, p2, Lcom/google/android/gms/internal/zzsp$zzb;->name:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/zzp$zza;->zzj(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v0, 0x0

    goto/16 :goto_0

    :cond_9
    invoke-interface {v2, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v8, v0, Ljava/lang/Long;

    if-eqz v8, :cond_d

    iget-object v8, v5, Lcom/google/android/gms/internal/zzsn$zzc;->zzbgt:Lcom/google/android/gms/internal/zzsn$zzd;

    if-nez v8, :cond_a

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/f;->zzFm()Lcom/google/android/gms/measurement/internal/zzp;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzp;->zzFG()Lcom/google/android/gms/measurement/internal/zzp$zza;

    move-result-object v0

    const-string v1, "No number filter for long param. event, param"

    iget-object v2, p2, Lcom/google/android/gms/internal/zzsp$zzb;->name:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v7}, Lcom/google/android/gms/measurement/internal/zzp$zza;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x0

    goto/16 :goto_0

    :cond_a
    new-instance v7, Lcom/google/android/gms/measurement/internal/j;

    iget-object v5, v5, Lcom/google/android/gms/internal/zzsn$zzc;->zzbgt:Lcom/google/android/gms/internal/zzsn$zzd;

    invoke-direct {v7, v5}, Lcom/google/android/gms/measurement/internal/j;-><init>(Lcom/google/android/gms/internal/zzsn$zzd;)V

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    invoke-virtual {v7, v8, v9}, Lcom/google/android/gms/measurement/internal/j;->a(J)Ljava/lang/Boolean;

    move-result-object v0

    if-nez v0, :cond_b

    const/4 v0, 0x0

    goto/16 :goto_0

    :cond_b
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_c

    const/4 v0, 0x1

    :goto_5
    xor-int/2addr v0, v6

    if-eqz v0, :cond_17

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto/16 :goto_0

    :cond_c
    const/4 v0, 0x0

    goto :goto_5

    :cond_d
    instance-of v8, v0, Ljava/lang/Double;

    if-eqz v8, :cond_11

    iget-object v8, v5, Lcom/google/android/gms/internal/zzsn$zzc;->zzbgt:Lcom/google/android/gms/internal/zzsn$zzd;

    if-nez v8, :cond_e

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/f;->zzFm()Lcom/google/android/gms/measurement/internal/zzp;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzp;->zzFG()Lcom/google/android/gms/measurement/internal/zzp$zza;

    move-result-object v0

    const-string v1, "No number filter for double param. event, param"

    iget-object v2, p2, Lcom/google/android/gms/internal/zzsp$zzb;->name:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v7}, Lcom/google/android/gms/measurement/internal/zzp$zza;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x0

    goto/16 :goto_0

    :cond_e
    new-instance v7, Lcom/google/android/gms/measurement/internal/j;

    iget-object v5, v5, Lcom/google/android/gms/internal/zzsn$zzc;->zzbgt:Lcom/google/android/gms/internal/zzsn$zzd;

    invoke-direct {v7, v5}, Lcom/google/android/gms/measurement/internal/j;-><init>(Lcom/google/android/gms/internal/zzsn$zzd;)V

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v8

    invoke-virtual {v7, v8, v9}, Lcom/google/android/gms/measurement/internal/j;->a(D)Ljava/lang/Boolean;

    move-result-object v0

    if-nez v0, :cond_f

    const/4 v0, 0x0

    goto/16 :goto_0

    :cond_f
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_10

    const/4 v0, 0x1

    :goto_6
    xor-int/2addr v0, v6

    if-eqz v0, :cond_17

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto/16 :goto_0

    :cond_10
    const/4 v0, 0x0

    goto :goto_6

    :cond_11
    instance-of v8, v0, Ljava/lang/String;

    if-eqz v8, :cond_15

    iget-object v8, v5, Lcom/google/android/gms/internal/zzsn$zzc;->zzbgs:Lcom/google/android/gms/internal/zzsn$zzf;

    if-nez v8, :cond_12

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/f;->zzFm()Lcom/google/android/gms/measurement/internal/zzp;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzp;->zzFG()Lcom/google/android/gms/measurement/internal/zzp$zza;

    move-result-object v0

    const-string v1, "No string filter for String param. event, param"

    iget-object v2, p2, Lcom/google/android/gms/internal/zzsp$zzb;->name:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v7}, Lcom/google/android/gms/measurement/internal/zzp$zza;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x0

    goto/16 :goto_0

    :cond_12
    new-instance v7, Lcom/google/android/gms/measurement/internal/c;

    iget-object v5, v5, Lcom/google/android/gms/internal/zzsn$zzc;->zzbgs:Lcom/google/android/gms/internal/zzsn$zzf;

    invoke-direct {v7, v5}, Lcom/google/android/gms/measurement/internal/c;-><init>(Lcom/google/android/gms/internal/zzsn$zzf;)V

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v7, v0}, Lcom/google/android/gms/measurement/internal/c;->a(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    if-nez v0, :cond_13

    const/4 v0, 0x0

    goto/16 :goto_0

    :cond_13
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_14

    const/4 v0, 0x1

    :goto_7
    xor-int/2addr v0, v6

    if-eqz v0, :cond_17

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto/16 :goto_0

    :cond_14
    const/4 v0, 0x0

    goto :goto_7

    :cond_15
    if-nez v0, :cond_16

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/f;->zzFm()Lcom/google/android/gms/measurement/internal/zzp;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzp;->zzFL()Lcom/google/android/gms/measurement/internal/zzp$zza;

    move-result-object v0

    const-string v1, "Missing param for filter. event, param"

    iget-object v2, p2, Lcom/google/android/gms/internal/zzsp$zzb;->name:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v7}, Lcom/google/android/gms/measurement/internal/zzp$zza;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto/16 :goto_0

    :cond_16
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/f;->zzFm()Lcom/google/android/gms/measurement/internal/zzp;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzp;->zzFG()Lcom/google/android/gms/measurement/internal/zzp$zza;

    move-result-object v0

    const-string v1, "Unknown param type. event, param"

    iget-object v2, p2, Lcom/google/android/gms/internal/zzsp$zzb;->name:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v7}, Lcom/google/android/gms/measurement/internal/zzp$zza;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x0

    goto/16 :goto_0

    :cond_17
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto/16 :goto_4

    :cond_18
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto/16 :goto_0
.end method

.method private a(Lcom/google/android/gms/internal/zzsn$zze;Lcom/google/android/gms/internal/zzsp$zzg;)Ljava/lang/Boolean;
    .locals 6

    const/4 v0, 0x0

    iget-object v1, p1, Lcom/google/android/gms/internal/zzsn$zze;->zzbgD:Lcom/google/android/gms/internal/zzsn$zzc;

    if-nez v1, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/f;->zzFm()Lcom/google/android/gms/measurement/internal/zzp;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzp;->zzFG()Lcom/google/android/gms/measurement/internal/zzp$zza;

    move-result-object v1

    const-string v2, "Missing property filter. property"

    iget-object v3, p2, Lcom/google/android/gms/internal/zzsp$zzg;->name:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/measurement/internal/zzp$zza;->zzj(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_0
    return-object v0

    :cond_0
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iget-object v3, v1, Lcom/google/android/gms/internal/zzsn$zzc;->zzbgu:Ljava/lang/Boolean;

    invoke-virtual {v2, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v2

    iget-object v3, p2, Lcom/google/android/gms/internal/zzsp$zzg;->zzbha:Ljava/lang/Long;

    if-eqz v3, :cond_2

    iget-object v3, v1, Lcom/google/android/gms/internal/zzsn$zzc;->zzbgt:Lcom/google/android/gms/internal/zzsn$zzd;

    if-nez v3, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/f;->zzFm()Lcom/google/android/gms/measurement/internal/zzp;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzp;->zzFG()Lcom/google/android/gms/measurement/internal/zzp$zza;

    move-result-object v1

    const-string v2, "No number filter for long property. property"

    iget-object v3, p2, Lcom/google/android/gms/internal/zzsp$zzg;->name:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/measurement/internal/zzp$zza;->zzj(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/google/android/gms/measurement/internal/j;

    iget-object v1, v1, Lcom/google/android/gms/internal/zzsn$zzc;->zzbgt:Lcom/google/android/gms/internal/zzsn$zzd;

    invoke-direct {v0, v1}, Lcom/google/android/gms/measurement/internal/j;-><init>(Lcom/google/android/gms/internal/zzsn$zzd;)V

    iget-object v1, p2, Lcom/google/android/gms/internal/zzsp$zzg;->zzbha:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Lcom/google/android/gms/measurement/internal/j;->a(J)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0, v2}, Lcom/google/android/gms/measurement/internal/f;->a(Ljava/lang/Boolean;Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0

    :cond_2
    iget-object v3, p2, Lcom/google/android/gms/internal/zzsp$zzg;->zzbgf:Ljava/lang/Double;

    if-eqz v3, :cond_4

    iget-object v3, v1, Lcom/google/android/gms/internal/zzsn$zzc;->zzbgt:Lcom/google/android/gms/internal/zzsn$zzd;

    if-nez v3, :cond_3

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/f;->zzFm()Lcom/google/android/gms/measurement/internal/zzp;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzp;->zzFG()Lcom/google/android/gms/measurement/internal/zzp$zza;

    move-result-object v1

    const-string v2, "No number filter for double property. property"

    iget-object v3, p2, Lcom/google/android/gms/internal/zzsp$zzg;->name:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/measurement/internal/zzp$zza;->zzj(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    new-instance v0, Lcom/google/android/gms/measurement/internal/j;

    iget-object v1, v1, Lcom/google/android/gms/internal/zzsn$zzc;->zzbgt:Lcom/google/android/gms/internal/zzsn$zzd;

    invoke-direct {v0, v1}, Lcom/google/android/gms/measurement/internal/j;-><init>(Lcom/google/android/gms/internal/zzsn$zzd;)V

    iget-object v1, p2, Lcom/google/android/gms/internal/zzsp$zzg;->zzbgf:Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Lcom/google/android/gms/measurement/internal/j;->a(D)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0, v2}, Lcom/google/android/gms/measurement/internal/f;->a(Ljava/lang/Boolean;Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0

    :cond_4
    iget-object v3, p2, Lcom/google/android/gms/internal/zzsp$zzg;->zzasH:Ljava/lang/String;

    if-eqz v3, :cond_c

    iget-object v3, v1, Lcom/google/android/gms/internal/zzsn$zzc;->zzbgs:Lcom/google/android/gms/internal/zzsn$zzf;

    if-nez v3, :cond_b

    iget-object v3, v1, Lcom/google/android/gms/internal/zzsn$zzc;->zzbgt:Lcom/google/android/gms/internal/zzsn$zzd;

    if-nez v3, :cond_5

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/f;->zzFm()Lcom/google/android/gms/measurement/internal/zzp;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzp;->zzFG()Lcom/google/android/gms/measurement/internal/zzp$zza;

    move-result-object v1

    const-string v2, "No string or number filter defined. property"

    iget-object v3, p2, Lcom/google/android/gms/internal/zzsp$zzg;->name:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/measurement/internal/zzp$zza;->zzj(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_5
    new-instance v3, Lcom/google/android/gms/measurement/internal/j;

    iget-object v4, v1, Lcom/google/android/gms/internal/zzsn$zzc;->zzbgt:Lcom/google/android/gms/internal/zzsn$zzd;

    invoke-direct {v3, v4}, Lcom/google/android/gms/measurement/internal/j;-><init>(Lcom/google/android/gms/internal/zzsn$zzd;)V

    iget-object v4, v1, Lcom/google/android/gms/internal/zzsn$zzc;->zzbgt:Lcom/google/android/gms/internal/zzsn$zzd;

    iget-object v4, v4, Lcom/google/android/gms/internal/zzsn$zzd;->zzbgx:Ljava/lang/Boolean;

    if-eqz v4, :cond_6

    iget-object v1, v1, Lcom/google/android/gms/internal/zzsn$zzc;->zzbgt:Lcom/google/android/gms/internal/zzsn$zzd;

    iget-object v1, v1, Lcom/google/android/gms/internal/zzsn$zzd;->zzbgx:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_8

    :cond_6
    iget-object v1, p2, Lcom/google/android/gms/internal/zzsp$zzg;->zzasH:Ljava/lang/String;

    invoke-virtual {p0, v1}, Lcom/google/android/gms/measurement/internal/f;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_7

    :try_start_0
    iget-object v1, p2, Lcom/google/android/gms/internal/zzsp$zzg;->zzasH:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/measurement/internal/j;->a(J)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v1, v2}, Lcom/google/android/gms/measurement/internal/f;->a(Ljava/lang/Boolean;Z)Ljava/lang/Boolean;
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto/16 :goto_0

    :catch_0
    move-exception v1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/f;->zzFm()Lcom/google/android/gms/measurement/internal/zzp;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzp;->zzFG()Lcom/google/android/gms/measurement/internal/zzp$zza;

    move-result-object v1

    const-string v2, "User property value exceeded Long value range. property, value"

    iget-object v3, p2, Lcom/google/android/gms/internal/zzsp$zzg;->name:Ljava/lang/String;

    iget-object v4, p2, Lcom/google/android/gms/internal/zzsp$zzg;->zzasH:Ljava/lang/String;

    invoke-virtual {v1, v2, v3, v4}, Lcom/google/android/gms/measurement/internal/zzp$zza;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_7
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/f;->zzFm()Lcom/google/android/gms/measurement/internal/zzp;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzp;->zzFG()Lcom/google/android/gms/measurement/internal/zzp$zza;

    move-result-object v1

    const-string v2, "Invalid user property value for Long number filter. property, value"

    iget-object v3, p2, Lcom/google/android/gms/internal/zzsp$zzg;->name:Ljava/lang/String;

    iget-object v4, p2, Lcom/google/android/gms/internal/zzsp$zzg;->zzasH:Ljava/lang/String;

    invoke-virtual {v1, v2, v3, v4}, Lcom/google/android/gms/measurement/internal/zzp$zza;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_8
    iget-object v1, p2, Lcom/google/android/gms/internal/zzsp$zzg;->zzasH:Ljava/lang/String;

    invoke-virtual {p0, v1}, Lcom/google/android/gms/measurement/internal/f;->b(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_a

    :try_start_1
    iget-object v1, p2, Lcom/google/android/gms/internal/zzsp$zzg;->zzasH:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v1

    if-nez v1, :cond_9

    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/measurement/internal/j;->a(D)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v1, v2}, Lcom/google/android/gms/measurement/internal/f;->a(Ljava/lang/Boolean;Z)Ljava/lang/Boolean;

    move-result-object v0

    goto/16 :goto_0

    :cond_9
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/f;->zzFm()Lcom/google/android/gms/measurement/internal/zzp;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzp;->zzFG()Lcom/google/android/gms/measurement/internal/zzp$zza;

    move-result-object v1

    const-string v2, "User property value exceeded Double value range. property, value"

    iget-object v3, p2, Lcom/google/android/gms/internal/zzsp$zzg;->name:Ljava/lang/String;

    iget-object v4, p2, Lcom/google/android/gms/internal/zzsp$zzg;->zzasH:Ljava/lang/String;

    invoke-virtual {v1, v2, v3, v4}, Lcom/google/android/gms/measurement/internal/zzp$zza;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    goto/16 :goto_0

    :catch_1
    move-exception v1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/f;->zzFm()Lcom/google/android/gms/measurement/internal/zzp;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzp;->zzFG()Lcom/google/android/gms/measurement/internal/zzp$zza;

    move-result-object v1

    const-string v2, "User property value exceeded Double value range. property, value"

    iget-object v3, p2, Lcom/google/android/gms/internal/zzsp$zzg;->name:Ljava/lang/String;

    iget-object v4, p2, Lcom/google/android/gms/internal/zzsp$zzg;->zzasH:Ljava/lang/String;

    invoke-virtual {v1, v2, v3, v4}, Lcom/google/android/gms/measurement/internal/zzp$zza;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_a
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/f;->zzFm()Lcom/google/android/gms/measurement/internal/zzp;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzp;->zzFG()Lcom/google/android/gms/measurement/internal/zzp$zza;

    move-result-object v1

    const-string v2, "Invalid user property value for Double number filter. property, value"

    iget-object v3, p2, Lcom/google/android/gms/internal/zzsp$zzg;->name:Ljava/lang/String;

    iget-object v4, p2, Lcom/google/android/gms/internal/zzsp$zzg;->zzasH:Ljava/lang/String;

    invoke-virtual {v1, v2, v3, v4}, Lcom/google/android/gms/measurement/internal/zzp$zza;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_b
    new-instance v0, Lcom/google/android/gms/measurement/internal/c;

    iget-object v1, v1, Lcom/google/android/gms/internal/zzsn$zzc;->zzbgs:Lcom/google/android/gms/internal/zzsn$zzf;

    invoke-direct {v0, v1}, Lcom/google/android/gms/measurement/internal/c;-><init>(Lcom/google/android/gms/internal/zzsn$zzf;)V

    iget-object v1, p2, Lcom/google/android/gms/internal/zzsp$zzg;->zzasH:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/c;->a(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0, v2}, Lcom/google/android/gms/measurement/internal/f;->a(Ljava/lang/Boolean;Z)Ljava/lang/Boolean;

    move-result-object v0

    goto/16 :goto_0

    :cond_c
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/f;->zzFm()Lcom/google/android/gms/measurement/internal/zzp;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzp;->zzFG()Lcom/google/android/gms/measurement/internal/zzp$zza;

    move-result-object v1

    const-string v2, "User property has no value, property"

    iget-object v3, p2, Lcom/google/android/gms/internal/zzsp$zzg;->name:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/measurement/internal/zzp$zza;->zzj(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_0
.end method

.method static a(Ljava/lang/Boolean;Z)Ljava/lang/Boolean;
    .locals 1

    if-nez p0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    xor-int/2addr v0, p1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method a(Ljava/lang/String;[Lcom/google/android/gms/internal/zzsn$zza;)V
    .locals 13

    const/4 v2, 0x0

    invoke-static {p2}, Lcom/google/android/gms/common/internal/zzaa;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    array-length v5, p2

    move v4, v2

    :goto_0
    if-ge v4, v5, :cond_6

    aget-object v6, p2, v4

    iget-object v7, v6, Lcom/google/android/gms/internal/zzsn$zza;->zzbgk:[Lcom/google/android/gms/internal/zzsn$zzb;

    array-length v8, v7

    move v3, v2

    :goto_1
    if-ge v3, v8, :cond_3

    aget-object v1, v7, v3

    sget-object v0, Lcom/google/android/gms/measurement/AppMeasurement$zza;->zzbbm:Ljava/util/Map;

    iget-object v9, v1, Lcom/google/android/gms/internal/zzsn$zzb;->zzbgn:Ljava/lang/String;

    invoke-interface {v0, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_0

    iput-object v0, v1, Lcom/google/android/gms/internal/zzsn$zzb;->zzbgn:Ljava/lang/String;

    :cond_0
    iget-object v9, v1, Lcom/google/android/gms/internal/zzsn$zzb;->zzbgo:[Lcom/google/android/gms/internal/zzsn$zzc;

    array-length v10, v9

    move v1, v2

    :goto_2
    if-ge v1, v10, :cond_2

    aget-object v11, v9, v1

    sget-object v0, Lcom/google/android/gms/measurement/AppMeasurement$zzd;->zzbbn:Ljava/util/Map;

    iget-object v12, v11, Lcom/google/android/gms/internal/zzsn$zzc;->zzbgv:Ljava/lang/String;

    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_1

    iput-object v0, v11, Lcom/google/android/gms/internal/zzsn$zzc;->zzbgv:Ljava/lang/String;

    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_2

    :cond_2
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_1

    :cond_3
    iget-object v3, v6, Lcom/google/android/gms/internal/zzsn$zza;->zzbgj:[Lcom/google/android/gms/internal/zzsn$zze;

    array-length v6, v3

    move v1, v2

    :goto_3
    if-ge v1, v6, :cond_5

    aget-object v7, v3, v1

    sget-object v0, Lcom/google/android/gms/measurement/AppMeasurement$zze;->zzbbo:Ljava/util/Map;

    iget-object v8, v7, Lcom/google/android/gms/internal/zzsn$zze;->zzbgC:Ljava/lang/String;

    invoke-interface {v0, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_4

    iput-object v0, v7, Lcom/google/android/gms/internal/zzsn$zze;->zzbgC:Ljava/lang/String;

    :cond_4
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_3

    :cond_5
    add-int/lit8 v0, v4, 0x1

    move v4, v0

    goto :goto_0

    :cond_6
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/f;->zzFh()Lcom/google/android/gms/measurement/internal/zze;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/measurement/internal/zze;->a(Ljava/lang/String;[Lcom/google/android/gms/internal/zzsn$zza;)V

    return-void
.end method

.method a(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "[+-]?[0-9]+"

    invoke-static {v0, p1}, Ljava/util/regex/Pattern;->matches(Ljava/lang/String;Ljava/lang/CharSequence;)Z

    move-result v0

    return v0
.end method

.method a(Ljava/lang/String;[Lcom/google/android/gms/internal/zzsp$zzb;[Lcom/google/android/gms/internal/zzsp$zzg;)[Lcom/google/android/gms/internal/zzsp$zza;
    .locals 26

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/common/internal/zzaa;->zzdl(Ljava/lang/String;)Ljava/lang/String;

    new-instance v15, Ljava/util/HashSet;

    invoke-direct {v15}, Ljava/util/HashSet;-><init>()V

    new-instance v16, Landroid/support/v4/h/a;

    invoke-direct/range {v16 .. v16}, Landroid/support/v4/h/a;-><init>()V

    new-instance v17, Landroid/support/v4/h/a;

    invoke-direct/range {v17 .. v17}, Landroid/support/v4/h/a;-><init>()V

    new-instance v18, Landroid/support/v4/h/a;

    invoke-direct/range {v18 .. v18}, Landroid/support/v4/h/a;-><init>()V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/f;->zzFh()Lcom/google/android/gms/measurement/internal/zze;

    move-result-object v4

    move-object/from16 v0, p1

    invoke-virtual {v4, v0}, Lcom/google/android/gms/measurement/internal/zze;->f(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v8

    if-eqz v8, :cond_3

    invoke-interface {v8}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v8, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/zzsp$zzf;

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    move-object/from16 v0, v17

    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/BitSet;

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    move-object/from16 v0, v18

    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/BitSet;

    if-nez v5, :cond_0

    new-instance v5, Ljava/util/BitSet;

    invoke-direct {v5}, Ljava/util/BitSet;-><init>()V

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    move-object/from16 v0, v17

    invoke-interface {v0, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v6, Ljava/util/BitSet;

    invoke-direct {v6}, Ljava/util/BitSet;-><init>()V

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    move-object/from16 v0, v18

    invoke-interface {v0, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    const/4 v7, 0x0

    :goto_1
    iget-object v11, v4, Lcom/google/android/gms/internal/zzsp$zzf;->zzbhC:[J

    array-length v11, v11

    mul-int/lit8 v11, v11, 0x40

    if-ge v7, v11, :cond_2

    iget-object v11, v4, Lcom/google/android/gms/internal/zzsp$zzf;->zzbhC:[J

    invoke-static {v11, v7}, Lcom/google/android/gms/measurement/internal/zzal;->zza([JI)Z

    move-result v11

    if-eqz v11, :cond_1

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/f;->zzFm()Lcom/google/android/gms/measurement/internal/zzp;

    move-result-object v11

    invoke-virtual {v11}, Lcom/google/android/gms/measurement/internal/zzp;->zzFL()Lcom/google/android/gms/measurement/internal/zzp$zza;

    move-result-object v11

    const-string v12, "Filter already evaluated. audience ID, filter ID"

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-virtual {v11, v12, v13, v14}, Lcom/google/android/gms/measurement/internal/zzp$zza;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v6, v7}, Ljava/util/BitSet;->set(I)V

    iget-object v11, v4, Lcom/google/android/gms/internal/zzsp$zzf;->zzbhD:[J

    invoke-static {v11, v7}, Lcom/google/android/gms/measurement/internal/zzal;->zza([JI)Z

    move-result v11

    if-eqz v11, :cond_1

    invoke-virtual {v5, v7}, Ljava/util/BitSet;->set(I)V

    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_2
    new-instance v7, Lcom/google/android/gms/internal/zzsp$zza;

    invoke-direct {v7}, Lcom/google/android/gms/internal/zzsp$zza;-><init>()V

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    move-object/from16 v0, v16

    invoke-interface {v0, v10, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v10, 0x0

    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    iput-object v10, v7, Lcom/google/android/gms/internal/zzsp$zza;->zzbgU:Ljava/lang/Boolean;

    iput-object v4, v7, Lcom/google/android/gms/internal/zzsp$zza;->zzbgT:Lcom/google/android/gms/internal/zzsp$zzf;

    new-instance v4, Lcom/google/android/gms/internal/zzsp$zzf;

    invoke-direct {v4}, Lcom/google/android/gms/internal/zzsp$zzf;-><init>()V

    iput-object v4, v7, Lcom/google/android/gms/internal/zzsp$zza;->zzbgS:Lcom/google/android/gms/internal/zzsp$zzf;

    iget-object v4, v7, Lcom/google/android/gms/internal/zzsp$zza;->zzbgS:Lcom/google/android/gms/internal/zzsp$zzf;

    invoke-static {v5}, Lcom/google/android/gms/measurement/internal/zzal;->zza(Ljava/util/BitSet;)[J

    move-result-object v5

    iput-object v5, v4, Lcom/google/android/gms/internal/zzsp$zzf;->zzbhD:[J

    iget-object v4, v7, Lcom/google/android/gms/internal/zzsp$zza;->zzbgS:Lcom/google/android/gms/internal/zzsp$zzf;

    invoke-static {v6}, Lcom/google/android/gms/measurement/internal/zzal;->zza(Ljava/util/BitSet;)[J

    move-result-object v5

    iput-object v5, v4, Lcom/google/android/gms/internal/zzsp$zzf;->zzbhC:[J

    goto/16 :goto_0

    :cond_3
    if-eqz p2, :cond_11

    new-instance v19, Landroid/support/v4/h/a;

    invoke-direct/range {v19 .. v19}, Landroid/support/v4/h/a;-><init>()V

    move-object/from16 v0, p2

    array-length v0, v0

    move/from16 v20, v0

    const/4 v4, 0x0

    move v14, v4

    :goto_2
    move/from16 v0, v20

    if-ge v14, v0, :cond_11

    aget-object v21, p2, v14

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/f;->zzFh()Lcom/google/android/gms/measurement/internal/zze;

    move-result-object v4

    move-object/from16 v0, v21

    iget-object v5, v0, Lcom/google/android/gms/internal/zzsp$zzb;->name:Ljava/lang/String;

    move-object/from16 v0, p1

    invoke-virtual {v4, v0, v5}, Lcom/google/android/gms/measurement/internal/zze;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/h;

    move-result-object v4

    if-nez v4, :cond_6

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/f;->zzFm()Lcom/google/android/gms/measurement/internal/zzp;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/zzp;->zzFG()Lcom/google/android/gms/measurement/internal/zzp$zza;

    move-result-object v4

    const-string v5, "Event aggregate wasn\'t created during raw event logging. event"

    move-object/from16 v0, v21

    iget-object v6, v0, Lcom/google/android/gms/internal/zzsp$zzb;->name:Ljava/lang/String;

    invoke-virtual {v4, v5, v6}, Lcom/google/android/gms/measurement/internal/zzp$zza;->zzj(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v5, Lcom/google/android/gms/measurement/internal/h;

    move-object/from16 v0, v21

    iget-object v7, v0, Lcom/google/android/gms/internal/zzsp$zzb;->name:Ljava/lang/String;

    const-wide/16 v8, 0x1

    const-wide/16 v10, 0x1

    move-object/from16 v0, v21

    iget-object v4, v0, Lcom/google/android/gms/internal/zzsp$zzb;->zzbgX:Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    move-object/from16 v6, p1

    invoke-direct/range {v5 .. v13}, Lcom/google/android/gms/measurement/internal/h;-><init>(Ljava/lang/String;Ljava/lang/String;JJJ)V

    :goto_3
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/f;->zzFh()Lcom/google/android/gms/measurement/internal/zze;

    move-result-object v4

    invoke-virtual {v4, v5}, Lcom/google/android/gms/measurement/internal/zze;->a(Lcom/google/android/gms/measurement/internal/h;)V

    iget-wide v10, v5, Lcom/google/android/gms/measurement/internal/h;->c:J

    move-object/from16 v0, v21

    iget-object v4, v0, Lcom/google/android/gms/internal/zzsp$zzb;->name:Ljava/lang/String;

    move-object/from16 v0, v19

    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map;

    if-nez v4, :cond_23

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/f;->zzFh()Lcom/google/android/gms/measurement/internal/zze;

    move-result-object v4

    move-object/from16 v0, v21

    iget-object v5, v0, Lcom/google/android/gms/internal/zzsp$zzb;->name:Ljava/lang/String;

    move-object/from16 v0, p1

    invoke-virtual {v4, v0, v5}, Lcom/google/android/gms/measurement/internal/zze;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v4

    if-nez v4, :cond_4

    new-instance v4, Landroid/support/v4/h/a;

    invoke-direct {v4}, Landroid/support/v4/h/a;-><init>()V

    :cond_4
    move-object/from16 v0, v21

    iget-object v5, v0, Lcom/google/android/gms/internal/zzsp$zzb;->name:Ljava/lang/String;

    move-object/from16 v0, v19

    invoke-interface {v0, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v7, v4

    :goto_4
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/f;->zzFm()Lcom/google/android/gms/measurement/internal/zzp;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/zzp;->zzFL()Lcom/google/android/gms/measurement/internal/zzp$zza;

    move-result-object v4

    const-string v5, "event, affected audience count"

    move-object/from16 v0, v21

    iget-object v6, v0, Lcom/google/android/gms/internal/zzsp$zzb;->name:Ljava/lang/String;

    invoke-interface {v7}, Ljava/util/Map;->size()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v4, v5, v6, v8}, Lcom/google/android/gms/measurement/internal/zzp$zza;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v7}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :cond_5
    :goto_5
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_10

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v13

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v15, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/f;->zzFm()Lcom/google/android/gms/measurement/internal/zzp;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/zzp;->zzFL()Lcom/google/android/gms/measurement/internal/zzp$zza;

    move-result-object v4

    const-string v5, "Skipping failed audience ID"

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Lcom/google/android/gms/measurement/internal/zzp$zza;->zzj(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_5

    :cond_6
    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/h;->a()Lcom/google/android/gms/measurement/internal/h;

    move-result-object v5

    goto/16 :goto_3

    :cond_7
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    move-object/from16 v0, v16

    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/zzsp$zza;

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    move-object/from16 v0, v17

    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/BitSet;

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    move-object/from16 v0, v18

    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/BitSet;

    if-nez v4, :cond_8

    new-instance v4, Lcom/google/android/gms/internal/zzsp$zza;

    invoke-direct {v4}, Lcom/google/android/gms/internal/zzsp$zza;-><init>()V

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    move-object/from16 v0, v16

    invoke-interface {v0, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v5, 0x1

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    iput-object v5, v4, Lcom/google/android/gms/internal/zzsp$zza;->zzbgU:Ljava/lang/Boolean;

    new-instance v5, Ljava/util/BitSet;

    invoke-direct {v5}, Ljava/util/BitSet;-><init>()V

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    move-object/from16 v0, v17

    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v6, Ljava/util/BitSet;

    invoke-direct {v6}, Ljava/util/BitSet;-><init>()V

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    move-object/from16 v0, v18

    invoke-interface {v0, v4, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_8
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v7, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v22

    :cond_9
    :goto_6
    invoke-interface/range {v22 .. v22}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface/range {v22 .. v22}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/zzsn$zzb;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/f;->zzFm()Lcom/google/android/gms/measurement/internal/zzp;

    move-result-object v8

    const/4 v9, 0x2

    invoke-virtual {v8, v9}, Lcom/google/android/gms/measurement/internal/zzp;->zzX(I)Z

    move-result v8

    if-eqz v8, :cond_a

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/f;->zzFm()Lcom/google/android/gms/measurement/internal/zzp;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/zzp;->zzFL()Lcom/google/android/gms/measurement/internal/zzp$zza;

    move-result-object v8

    const-string v9, "Evaluating filter. audience, filter, event"

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v23

    iget-object v0, v4, Lcom/google/android/gms/internal/zzsn$zzb;->zzbgm:Ljava/lang/Integer;

    move-object/from16 v24, v0

    iget-object v0, v4, Lcom/google/android/gms/internal/zzsn$zzb;->zzbgn:Ljava/lang/String;

    move-object/from16 v25, v0

    move-object/from16 v0, v23

    move-object/from16 v1, v24

    move-object/from16 v2, v25

    invoke-virtual {v8, v9, v0, v1, v2}, Lcom/google/android/gms/measurement/internal/zzp$zza;->zzd(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/f;->zzFm()Lcom/google/android/gms/measurement/internal/zzp;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/zzp;->zzFL()Lcom/google/android/gms/measurement/internal/zzp$zza;

    move-result-object v8

    const-string v9, "Filter definition"

    invoke-static {v4}, Lcom/google/android/gms/measurement/internal/zzal;->zza(Lcom/google/android/gms/internal/zzsn$zzb;)Ljava/lang/String;

    move-result-object v23

    move-object/from16 v0, v23

    invoke-virtual {v8, v9, v0}, Lcom/google/android/gms/measurement/internal/zzp$zza;->zzj(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_a
    iget-object v8, v4, Lcom/google/android/gms/internal/zzsn$zzb;->zzbgm:Ljava/lang/Integer;

    if-eqz v8, :cond_b

    iget-object v8, v4, Lcom/google/android/gms/internal/zzsn$zzb;->zzbgm:Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    const/16 v9, 0x100

    if-le v8, v9, :cond_c

    :cond_b
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/f;->zzFm()Lcom/google/android/gms/measurement/internal/zzp;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/zzp;->zzFG()Lcom/google/android/gms/measurement/internal/zzp$zza;

    move-result-object v8

    const-string v9, "Invalid event filter ID. id"

    iget-object v4, v4, Lcom/google/android/gms/internal/zzsn$zzb;->zzbgm:Ljava/lang/Integer;

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v8, v9, v4}, Lcom/google/android/gms/measurement/internal/zzp$zza;->zzj(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_6

    :cond_c
    iget-object v8, v4, Lcom/google/android/gms/internal/zzsn$zzb;->zzbgm:Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-virtual {v5, v8}, Ljava/util/BitSet;->get(I)Z

    move-result v8

    if-eqz v8, :cond_d

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/f;->zzFm()Lcom/google/android/gms/measurement/internal/zzp;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/zzp;->zzFL()Lcom/google/android/gms/measurement/internal/zzp$zza;

    move-result-object v8

    const-string v9, "Event filter already evaluated true. audience ID, filter ID"

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v23

    iget-object v4, v4, Lcom/google/android/gms/internal/zzsn$zzb;->zzbgm:Ljava/lang/Integer;

    move-object/from16 v0, v23

    invoke-virtual {v8, v9, v0, v4}, Lcom/google/android/gms/measurement/internal/zzp$zza;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_d
    move-object/from16 v0, p0

    move-object/from16 v1, v21

    invoke-direct {v0, v4, v1, v10, v11}, Lcom/google/android/gms/measurement/internal/f;->a(Lcom/google/android/gms/internal/zzsn$zzb;Lcom/google/android/gms/internal/zzsp$zzb;J)Ljava/lang/Boolean;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/f;->zzFm()Lcom/google/android/gms/measurement/internal/zzp;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/zzp;->zzFL()Lcom/google/android/gms/measurement/internal/zzp$zza;

    move-result-object v23

    const-string v24, "Event filter result"

    if-nez v9, :cond_e

    const-string v8, "null"

    :goto_7
    move-object/from16 v0, v23

    move-object/from16 v1, v24

    invoke-virtual {v0, v1, v8}, Lcom/google/android/gms/measurement/internal/zzp$zza;->zzj(Ljava/lang/String;Ljava/lang/Object;)V

    if-nez v9, :cond_f

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v15, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto/16 :goto_6

    :cond_e
    move-object v8, v9

    goto :goto_7

    :cond_f
    iget-object v8, v4, Lcom/google/android/gms/internal/zzsn$zzb;->zzbgm:Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-virtual {v6, v8}, Ljava/util/BitSet;->set(I)V

    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    if-eqz v8, :cond_9

    iget-object v4, v4, Lcom/google/android/gms/internal/zzsn$zzb;->zzbgm:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-virtual {v5, v4}, Ljava/util/BitSet;->set(I)V

    goto/16 :goto_6

    :cond_10
    add-int/lit8 v4, v14, 0x1

    move v14, v4

    goto/16 :goto_2

    :cond_11
    if-eqz p3, :cond_1e

    new-instance v11, Landroid/support/v4/h/a;

    invoke-direct {v11}, Landroid/support/v4/h/a;-><init>()V

    move-object/from16 v0, p3

    array-length v12, v0

    const/4 v4, 0x0

    move v10, v4

    :goto_8
    if-ge v10, v12, :cond_1e

    aget-object v13, p3, v10

    iget-object v4, v13, Lcom/google/android/gms/internal/zzsp$zzg;->name:Ljava/lang/String;

    invoke-interface {v11, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map;

    if-nez v4, :cond_22

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/f;->zzFh()Lcom/google/android/gms/measurement/internal/zze;

    move-result-object v4

    iget-object v5, v13, Lcom/google/android/gms/internal/zzsp$zzg;->name:Ljava/lang/String;

    move-object/from16 v0, p1

    invoke-virtual {v4, v0, v5}, Lcom/google/android/gms/measurement/internal/zze;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v4

    if-nez v4, :cond_12

    new-instance v4, Landroid/support/v4/h/a;

    invoke-direct {v4}, Landroid/support/v4/h/a;-><init>()V

    :cond_12
    iget-object v5, v13, Lcom/google/android/gms/internal/zzsp$zzg;->name:Ljava/lang/String;

    invoke-interface {v11, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v7, v4

    :goto_9
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/f;->zzFm()Lcom/google/android/gms/measurement/internal/zzp;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/zzp;->zzFL()Lcom/google/android/gms/measurement/internal/zzp$zza;

    move-result-object v4

    const-string v5, "property, affected audience count"

    iget-object v6, v13, Lcom/google/android/gms/internal/zzsp$zzg;->name:Ljava/lang/String;

    invoke-interface {v7}, Ljava/util/Map;->size()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v4, v5, v6, v8}, Lcom/google/android/gms/measurement/internal/zzp$zza;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v7}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :cond_13
    :goto_a
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1d

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v19

    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v15, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_14

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/f;->zzFm()Lcom/google/android/gms/measurement/internal/zzp;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/zzp;->zzFL()Lcom/google/android/gms/measurement/internal/zzp$zza;

    move-result-object v4

    const-string v5, "Skipping failed audience ID"

    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Lcom/google/android/gms/measurement/internal/zzp$zza;->zzj(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_a

    :cond_14
    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    move-object/from16 v0, v16

    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/zzsp$zza;

    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    move-object/from16 v0, v17

    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/BitSet;

    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    move-object/from16 v0, v18

    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/BitSet;

    if-nez v4, :cond_15

    new-instance v4, Lcom/google/android/gms/internal/zzsp$zza;

    invoke-direct {v4}, Lcom/google/android/gms/internal/zzsp$zza;-><init>()V

    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    move-object/from16 v0, v16

    invoke-interface {v0, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v5, 0x1

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    iput-object v5, v4, Lcom/google/android/gms/internal/zzsp$zza;->zzbgU:Ljava/lang/Boolean;

    new-instance v5, Ljava/util/BitSet;

    invoke-direct {v5}, Ljava/util/BitSet;-><init>()V

    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    move-object/from16 v0, v17

    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v6, Ljava/util/BitSet;

    invoke-direct {v6}, Ljava/util/BitSet;-><init>()V

    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    move-object/from16 v0, v18

    invoke-interface {v0, v4, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_15
    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v7, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v20

    :cond_16
    :goto_b
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_13

    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/zzsn$zze;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/f;->zzFm()Lcom/google/android/gms/measurement/internal/zzp;

    move-result-object v8

    const/4 v9, 0x2

    invoke-virtual {v8, v9}, Lcom/google/android/gms/measurement/internal/zzp;->zzX(I)Z

    move-result v8

    if-eqz v8, :cond_17

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/f;->zzFm()Lcom/google/android/gms/measurement/internal/zzp;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/zzp;->zzFL()Lcom/google/android/gms/measurement/internal/zzp$zza;

    move-result-object v8

    const-string v9, "Evaluating filter. audience, filter, property"

    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v21

    iget-object v0, v4, Lcom/google/android/gms/internal/zzsn$zze;->zzbgm:Ljava/lang/Integer;

    move-object/from16 v22, v0

    iget-object v0, v4, Lcom/google/android/gms/internal/zzsn$zze;->zzbgC:Ljava/lang/String;

    move-object/from16 v23, v0

    move-object/from16 v0, v21

    move-object/from16 v1, v22

    move-object/from16 v2, v23

    invoke-virtual {v8, v9, v0, v1, v2}, Lcom/google/android/gms/measurement/internal/zzp$zza;->zzd(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/f;->zzFm()Lcom/google/android/gms/measurement/internal/zzp;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/zzp;->zzFL()Lcom/google/android/gms/measurement/internal/zzp$zza;

    move-result-object v8

    const-string v9, "Filter definition"

    invoke-static {v4}, Lcom/google/android/gms/measurement/internal/zzal;->zza(Lcom/google/android/gms/internal/zzsn$zze;)Ljava/lang/String;

    move-result-object v21

    move-object/from16 v0, v21

    invoke-virtual {v8, v9, v0}, Lcom/google/android/gms/measurement/internal/zzp$zza;->zzj(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_17
    iget-object v8, v4, Lcom/google/android/gms/internal/zzsn$zze;->zzbgm:Ljava/lang/Integer;

    if-eqz v8, :cond_18

    iget-object v8, v4, Lcom/google/android/gms/internal/zzsn$zze;->zzbgm:Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    const/16 v9, 0x100

    if-le v8, v9, :cond_19

    :cond_18
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/f;->zzFm()Lcom/google/android/gms/measurement/internal/zzp;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/zzp;->zzFG()Lcom/google/android/gms/measurement/internal/zzp$zza;

    move-result-object v5

    const-string v6, "Invalid property filter ID. id"

    iget-object v4, v4, Lcom/google/android/gms/internal/zzsn$zze;->zzbgm:Ljava/lang/Integer;

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v6, v4}, Lcom/google/android/gms/measurement/internal/zzp$zza;->zzj(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v15, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto/16 :goto_a

    :cond_19
    iget-object v8, v4, Lcom/google/android/gms/internal/zzsn$zze;->zzbgm:Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-virtual {v5, v8}, Ljava/util/BitSet;->get(I)Z

    move-result v8

    if-eqz v8, :cond_1a

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/f;->zzFm()Lcom/google/android/gms/measurement/internal/zzp;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/zzp;->zzFL()Lcom/google/android/gms/measurement/internal/zzp$zza;

    move-result-object v8

    const-string v9, "Property filter already evaluated true. audience ID, filter ID"

    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v21

    iget-object v4, v4, Lcom/google/android/gms/internal/zzsn$zze;->zzbgm:Ljava/lang/Integer;

    move-object/from16 v0, v21

    invoke-virtual {v8, v9, v0, v4}, Lcom/google/android/gms/measurement/internal/zzp$zza;->zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_b

    :cond_1a
    move-object/from16 v0, p0

    invoke-direct {v0, v4, v13}, Lcom/google/android/gms/measurement/internal/f;->a(Lcom/google/android/gms/internal/zzsn$zze;Lcom/google/android/gms/internal/zzsp$zzg;)Ljava/lang/Boolean;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/f;->zzFm()Lcom/google/android/gms/measurement/internal/zzp;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/zzp;->zzFL()Lcom/google/android/gms/measurement/internal/zzp$zza;

    move-result-object v21

    const-string v22, "Property filter result"

    if-nez v9, :cond_1b

    const-string v8, "null"

    :goto_c
    move-object/from16 v0, v21

    move-object/from16 v1, v22

    invoke-virtual {v0, v1, v8}, Lcom/google/android/gms/measurement/internal/zzp$zza;->zzj(Ljava/lang/String;Ljava/lang/Object;)V

    if-nez v9, :cond_1c

    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v15, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto/16 :goto_b

    :cond_1b
    move-object v8, v9

    goto :goto_c

    :cond_1c
    iget-object v8, v4, Lcom/google/android/gms/internal/zzsn$zze;->zzbgm:Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-virtual {v6, v8}, Ljava/util/BitSet;->set(I)V

    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    if-eqz v8, :cond_16

    iget-object v4, v4, Lcom/google/android/gms/internal/zzsn$zze;->zzbgm:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-virtual {v5, v4}, Ljava/util/BitSet;->set(I)V

    goto/16 :goto_b

    :cond_1d
    add-int/lit8 v4, v10, 0x1

    move v10, v4

    goto/16 :goto_8

    :cond_1e
    invoke-interface/range {v17 .. v17}, Ljava/util/Map;->size()I

    move-result v4

    new-array v8, v4, [Lcom/google/android/gms/internal/zzsp$zza;

    const/4 v4, 0x0

    invoke-interface/range {v17 .. v17}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    move v5, v4

    :cond_1f
    :goto_d
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_20

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v15, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1f

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    move-object/from16 v0, v16

    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/zzsp$zza;

    if-nez v4, :cond_21

    new-instance v4, Lcom/google/android/gms/internal/zzsp$zza;

    invoke-direct {v4}, Lcom/google/android/gms/internal/zzsp$zza;-><init>()V

    move-object v7, v4

    :goto_e
    add-int/lit8 v6, v5, 0x1

    aput-object v7, v8, v5

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iput-object v4, v7, Lcom/google/android/gms/internal/zzsp$zza;->zzbgi:Ljava/lang/Integer;

    new-instance v4, Lcom/google/android/gms/internal/zzsp$zzf;

    invoke-direct {v4}, Lcom/google/android/gms/internal/zzsp$zzf;-><init>()V

    iput-object v4, v7, Lcom/google/android/gms/internal/zzsp$zza;->zzbgS:Lcom/google/android/gms/internal/zzsp$zzf;

    iget-object v5, v7, Lcom/google/android/gms/internal/zzsp$zza;->zzbgS:Lcom/google/android/gms/internal/zzsp$zzf;

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    move-object/from16 v0, v17

    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/BitSet;

    invoke-static {v4}, Lcom/google/android/gms/measurement/internal/zzal;->zza(Ljava/util/BitSet;)[J

    move-result-object v4

    iput-object v4, v5, Lcom/google/android/gms/internal/zzsp$zzf;->zzbhD:[J

    iget-object v5, v7, Lcom/google/android/gms/internal/zzsp$zza;->zzbgS:Lcom/google/android/gms/internal/zzsp$zzf;

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    move-object/from16 v0, v18

    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/BitSet;

    invoke-static {v4}, Lcom/google/android/gms/measurement/internal/zzal;->zza(Ljava/util/BitSet;)[J

    move-result-object v4

    iput-object v4, v5, Lcom/google/android/gms/internal/zzsp$zzf;->zzbhC:[J

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/f;->zzFh()Lcom/google/android/gms/measurement/internal/zze;

    move-result-object v4

    iget-object v5, v7, Lcom/google/android/gms/internal/zzsp$zza;->zzbgS:Lcom/google/android/gms/internal/zzsp$zzf;

    move-object/from16 v0, p1

    invoke-virtual {v4, v0, v10, v5}, Lcom/google/android/gms/measurement/internal/zze;->a(Ljava/lang/String;ILcom/google/android/gms/internal/zzsp$zzf;)V

    move v5, v6

    goto :goto_d

    :cond_20
    invoke-static {v8, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [Lcom/google/android/gms/internal/zzsp$zza;

    return-object v4

    :cond_21
    move-object v7, v4

    goto :goto_e

    :cond_22
    move-object v7, v4

    goto/16 :goto_9

    :cond_23
    move-object v7, v4

    goto/16 :goto_4
.end method

.method b(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "[+-]?(([0-9]+\\.?)|([0-9]*\\.[0-9]+))"

    invoke-static {v0, p1}, Ljava/util/regex/Pattern;->matches(Ljava/lang/String;Ljava/lang/CharSequence;)Z

    move-result v0

    return v0
.end method

.method protected zzkO()V
    .locals 0

    return-void
.end method
