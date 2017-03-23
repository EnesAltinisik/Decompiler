package com.google.android.gms.internal;

import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzx;
import java.util.ArrayList;
import java.util.List;

public class zzvi {
    private static final Double zzbuo = Double.valueOf(1.0E-5d);

    public static double zza(zzabh<?> com_google_android_gms_internal_zzabh_, zzabh<?> com_google_android_gms_internal_zzabh_2) {
        boolean z = true;
        zzaa.zzaj(com_google_android_gms_internal_zzabh_ != null);
        if (com_google_android_gms_internal_zzabh_2 == null) {
            z = false;
        }
        zzaa.zzaj(z);
        double zzb = zzb(com_google_android_gms_internal_zzabh_);
        double zzb2 = zzb(com_google_android_gms_internal_zzabh_2);
        return (Double.isNaN(zzb) || Double.isNaN(zzb2)) ? Double.NaN : ((zzb == MediaQueueItem.DEFAULT_PLAYBACK_DURATION && zzb2 == Double.NEGATIVE_INFINITY) || (zzb == Double.NEGATIVE_INFINITY && zzb2 == MediaQueueItem.DEFAULT_PLAYBACK_DURATION)) ? Double.NaN : (!Double.isInfinite(zzb) || Double.isInfinite(zzb2)) ? (Double.isInfinite(zzb) || !Double.isInfinite(zzb2)) ? zzb + zzb2 : zzb2 : zzb;
    }

    public static boolean zza(zzabh<?> com_google_android_gms_internal_zzabh_) {
        zzaa.zzaj(com_google_android_gms_internal_zzabh_ != null);
        if (com_google_android_gms_internal_zzabh_ == zzabl.zzbvN || com_google_android_gms_internal_zzabh_ == zzabl.zzbvM) {
            return false;
        }
        if (com_google_android_gms_internal_zzabh_ instanceof zzabi) {
            return ((Boolean) ((zzabi) com_google_android_gms_internal_zzabh_).zzMk()).booleanValue();
        }
        if (com_google_android_gms_internal_zzabh_ instanceof zzabj) {
            if (((Double) ((zzabj) com_google_android_gms_internal_zzabh_).zzMk()).doubleValue() == 0.0d || ((Double) ((zzabj) com_google_android_gms_internal_zzabh_).zzMk()).doubleValue() == -0.0d || Double.isNaN(((Double) ((zzabj) com_google_android_gms_internal_zzabh_).zzMk()).doubleValue())) {
                return false;
            }
        } else if (com_google_android_gms_internal_zzabh_ instanceof zzabp) {
            if (((String) ((zzabp) com_google_android_gms_internal_zzabh_).zzMk()).isEmpty()) {
                return false;
            }
        } else if (zzf(com_google_android_gms_internal_zzabh_)) {
            String valueOf = String.valueOf(com_google_android_gms_internal_zzabh_.toString());
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 33).append("Illegal type given to isTruthy: ").append(valueOf).append(".").toString());
        }
        return true;
    }

    public static double zzb(zzabh<?> com_google_android_gms_internal_zzabh_) {
        zzaa.zzaj(com_google_android_gms_internal_zzabh_ != null);
        if (com_google_android_gms_internal_zzabh_ == zzabl.zzbvN) {
            return Double.NaN;
        }
        if (com_google_android_gms_internal_zzabh_ == zzabl.zzbvM) {
            return 0.0d;
        }
        if (com_google_android_gms_internal_zzabh_ instanceof zzabi) {
            return ((Boolean) ((zzabi) com_google_android_gms_internal_zzabh_).zzMk()).booleanValue() ? 1.0d : 0.0d;
        } else {
            if (com_google_android_gms_internal_zzabh_ instanceof zzabj) {
                return ((Double) ((zzabj) com_google_android_gms_internal_zzabh_).zzMk()).doubleValue();
            }
            if (com_google_android_gms_internal_zzabh_ instanceof zzabm) {
                zzabm com_google_android_gms_internal_zzabm = (zzabm) com_google_android_gms_internal_zzabh_;
                if (((List) com_google_android_gms_internal_zzabm.zzMk()).isEmpty()) {
                    return 0.0d;
                }
                if (((List) com_google_android_gms_internal_zzabm.zzMk()).size() == 1) {
                    return zzb(new zzabp(zzd(com_google_android_gms_internal_zzabm.zzkZ(0))));
                }
            } else if (com_google_android_gms_internal_zzabh_ instanceof zzabp) {
                zzabp com_google_android_gms_internal_zzabp = (zzabp) com_google_android_gms_internal_zzabh_;
                if (((String) com_google_android_gms_internal_zzabp.zzMk()).isEmpty()) {
                    return 0.0d;
                }
                try {
                    return Double.parseDouble((String) com_google_android_gms_internal_zzabp.zzMk());
                } catch (NumberFormatException e) {
                    return Double.NaN;
                }
            }
            if (!zzf(com_google_android_gms_internal_zzabh_)) {
                return Double.NaN;
            }
            String valueOf = String.valueOf(com_google_android_gms_internal_zzabh_.toString());
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 41).append("Illegal type given to numberEquivalent: ").append(valueOf).append(".").toString());
        }
    }

    public static boolean zzb(zzabh<?> com_google_android_gms_internal_zzabh_, zzabh<?> com_google_android_gms_internal_zzabh_2) {
        zzaa.zzaj(com_google_android_gms_internal_zzabh_ != null);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_2 != null);
        String valueOf;
        if (zzf(com_google_android_gms_internal_zzabh_)) {
            valueOf = String.valueOf(com_google_android_gms_internal_zzabh_.toString());
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 50).append("Illegal type given to abstractRelationalCompare: ").append(valueOf).append(".").toString());
        } else if (zzf(com_google_android_gms_internal_zzabh_2)) {
            valueOf = String.valueOf(com_google_android_gms_internal_zzabh_2.toString());
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 50).append("Illegal type given to abstractRelationalCompare: ").append(valueOf).append(".").toString());
        } else {
            zzabh com_google_android_gms_internal_zzabp;
            zzabh com_google_android_gms_internal_zzabp2;
            if ((com_google_android_gms_internal_zzabh_ instanceof zzabn) || (com_google_android_gms_internal_zzabh_ instanceof zzabm) || (com_google_android_gms_internal_zzabh_ instanceof zzabk)) {
                com_google_android_gms_internal_zzabp = new zzabp(zzd(com_google_android_gms_internal_zzabh_));
            } else {
                zzabh<?> com_google_android_gms_internal_zzabh_3 = com_google_android_gms_internal_zzabh_;
            }
            if ((com_google_android_gms_internal_zzabh_2 instanceof zzabn) || (com_google_android_gms_internal_zzabh_2 instanceof zzabm) || (com_google_android_gms_internal_zzabh_2 instanceof zzabk)) {
                com_google_android_gms_internal_zzabp2 = new zzabp(zzd(com_google_android_gms_internal_zzabh_2));
            } else {
                zzabh<?> com_google_android_gms_internal_zzabh_4 = com_google_android_gms_internal_zzabh_2;
            }
            if ((com_google_android_gms_internal_zzabp instanceof zzabp) && (com_google_android_gms_internal_zzabp2 instanceof zzabp)) {
                return ((String) ((zzabp) com_google_android_gms_internal_zzabp).zzMk()).compareTo((String) ((zzabp) com_google_android_gms_internal_zzabp2).zzMk()) < 0;
            } else {
                double zzb = zzb(com_google_android_gms_internal_zzabp);
                double zzb2 = zzb(com_google_android_gms_internal_zzabp2);
                return (Double.isNaN(zzb) || Double.isNaN(zzb2)) ? false : (zzb == 0.0d && zzb2 == -0.0d) ? false : ((zzb == -0.0d && zzb2 == 0.0d) || zzb == MediaQueueItem.DEFAULT_PLAYBACK_DURATION) ? false : zzb2 == MediaQueueItem.DEFAULT_PLAYBACK_DURATION ? true : zzb2 != Double.NEGATIVE_INFINITY ? zzb == Double.NEGATIVE_INFINITY ? true : Double.compare(zzb, zzb2) < 0 : false;
            }
        }
    }

    public static double zzc(zzabh<?> com_google_android_gms_internal_zzabh_) {
        double zzb = zzb(com_google_android_gms_internal_zzabh_);
        return Double.isNaN(zzb) ? 0.0d : (zzb == 0.0d || zzb == -0.0d || Double.isInfinite(zzb)) ? zzb : Math.signum(zzb) * Math.floor(Math.abs(zzb));
    }

    public static boolean zzc(zzabh<?> com_google_android_gms_internal_zzabh_, zzabh<?> com_google_android_gms_internal_zzabh_2) {
        zzaa.zzaj(com_google_android_gms_internal_zzabh_ != null);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_2 != null);
        String valueOf;
        if (zzf(com_google_android_gms_internal_zzabh_)) {
            valueOf = String.valueOf(com_google_android_gms_internal_zzabh_.toString());
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 48).append("Illegal type given to abstractEqualityCompare: ").append(valueOf).append(".").toString());
        } else if (zzf(com_google_android_gms_internal_zzabh_2)) {
            valueOf = String.valueOf(com_google_android_gms_internal_zzabh_2.toString());
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 48).append("Illegal type given to abstractEqualityCompare: ").append(valueOf).append(".").toString());
        } else {
            valueOf = zze(com_google_android_gms_internal_zzabh_);
            String zze = zze(com_google_android_gms_internal_zzabh_2);
            if (!valueOf.equals(zze)) {
                return ((com_google_android_gms_internal_zzabh_ == zzabl.zzbvN || com_google_android_gms_internal_zzabh_ == zzabl.zzbvM) && (com_google_android_gms_internal_zzabh_2 == zzabl.zzbvN || com_google_android_gms_internal_zzabh_2 == zzabl.zzbvM)) ? true : (valueOf.equals("Number") && zze.equals("String")) ? zzc(com_google_android_gms_internal_zzabh_, new zzabj(Double.valueOf(zzb(com_google_android_gms_internal_zzabh_2)))) : (valueOf.equals("String") && zze.equals("Number")) ? zzc(new zzabj(Double.valueOf(zzb(com_google_android_gms_internal_zzabh_))), com_google_android_gms_internal_zzabh_2) : valueOf.equals("Boolean") ? zzc(new zzabj(Double.valueOf(zzb(com_google_android_gms_internal_zzabh_))), com_google_android_gms_internal_zzabh_2) : zze.equals("Boolean") ? zzc(com_google_android_gms_internal_zzabh_, new zzabj(Double.valueOf(zzb(com_google_android_gms_internal_zzabh_2)))) : ((valueOf.equals("String") || valueOf.equals("Number")) && zze.equals("Object")) ? zzc(com_google_android_gms_internal_zzabh_, new zzabp(zzd(com_google_android_gms_internal_zzabh_2))) : (valueOf.equals("Object") && (zze.equals("String") || zze.equals("Number"))) ? zzc(new zzabp(zzd(com_google_android_gms_internal_zzabh_)), com_google_android_gms_internal_zzabh_2) : false;
            } else {
                boolean z = true;
                switch (valueOf.hashCode()) {
                    case -1950496919:
                        if (valueOf.equals("Number")) {
                            z = true;
                            break;
                        }
                        break;
                    case -1939501217:
                        if (valueOf.equals("Object")) {
                            z = true;
                            break;
                        }
                        break;
                    case -1808118735:
                        if (valueOf.equals("String")) {
                            z = true;
                            break;
                        }
                        break;
                    case 2439591:
                        if (valueOf.equals("Null")) {
                            z = true;
                            break;
                        }
                        break;
                    case 965837104:
                        if (valueOf.equals("Undefined")) {
                            z = false;
                            break;
                        }
                        break;
                    case 1729365000:
                        if (valueOf.equals("Boolean")) {
                            z = true;
                            break;
                        }
                        break;
                }
                switch (z) {
                    case false:
                    case true:
                        return true;
                    case true:
                        double doubleValue = ((Double) ((zzabj) com_google_android_gms_internal_zzabh_).zzMk()).doubleValue();
                        double doubleValue2 = ((Double) ((zzabj) com_google_android_gms_internal_zzabh_2).zzMk()).doubleValue();
                        return (Double.isNaN(doubleValue) || Double.isNaN(doubleValue2)) ? false : doubleValue == doubleValue2;
                    case true:
                        return ((String) ((zzabp) com_google_android_gms_internal_zzabh_).zzMk()).equals((String) ((zzabp) com_google_android_gms_internal_zzabh_2).zzMk());
                    case true:
                        return ((Boolean) ((zzabi) com_google_android_gms_internal_zzabh_).zzMk()) == ((Boolean) ((zzabi) com_google_android_gms_internal_zzabh_2).zzMk());
                    case true:
                        return com_google_android_gms_internal_zzabh_ == com_google_android_gms_internal_zzabh_2;
                    default:
                        return false;
                }
            }
        }
    }

    public static String zzd(zzabh<?> com_google_android_gms_internal_zzabh_) {
        zzaa.zzaj(com_google_android_gms_internal_zzabh_ != null);
        if (com_google_android_gms_internal_zzabh_ == zzabl.zzbvN) {
            return "undefined";
        }
        if (com_google_android_gms_internal_zzabh_ == zzabl.zzbvM) {
            return "null";
        }
        if (com_google_android_gms_internal_zzabh_ instanceof zzabi) {
            return ((Boolean) ((zzabi) com_google_android_gms_internal_zzabh_).zzMk()).booleanValue() ? "true" : "false";
        } else {
            if (com_google_android_gms_internal_zzabh_ instanceof zzabj) {
                double doubleValue = ((Double) ((zzabj) com_google_android_gms_internal_zzabh_).zzMk()).doubleValue();
                return (doubleValue != Math.floor(doubleValue) || Double.isInfinite(doubleValue)) ? Double.toString(((Double) ((zzabj) com_google_android_gms_internal_zzabh_).zzMk()).doubleValue()) : Integer.toString((int) doubleValue);
            } else {
                String valueOf;
                if (com_google_android_gms_internal_zzabh_ instanceof zzabk) {
                    zzvh com_google_android_gms_internal_zzvh = (zzvh) ((zzabk) com_google_android_gms_internal_zzabh_).zzMk();
                    if (com_google_android_gms_internal_zzvh instanceof zzvg) {
                        return ((zzvg) com_google_android_gms_internal_zzvh).getName();
                    }
                } else if (com_google_android_gms_internal_zzabh_ instanceof zzabm) {
                    Iterable arrayList = new ArrayList();
                    for (zzabh com_google_android_gms_internal_zzabh : (List) ((zzabm) com_google_android_gms_internal_zzabh_).zzMk()) {
                        if (com_google_android_gms_internal_zzabh == zzabl.zzbvM || com_google_android_gms_internal_zzabh == zzabl.zzbvN) {
                            arrayList.add("");
                        } else {
                            arrayList.add(zzd(com_google_android_gms_internal_zzabh));
                        }
                    }
                    return zzx.zzdk(",").zza(arrayList);
                } else if (com_google_android_gms_internal_zzabh_ instanceof zzabn) {
                    return "[object Object]";
                } else {
                    if (com_google_android_gms_internal_zzabh_ instanceof zzabp) {
                        return (String) ((zzabp) com_google_android_gms_internal_zzabh_).zzMk();
                    }
                }
                if (zzf(com_google_android_gms_internal_zzabh_)) {
                    valueOf = String.valueOf(com_google_android_gms_internal_zzabh_.toString());
                    valueOf = new StringBuilder(String.valueOf(valueOf).length() + 41).append("Illegal type given to stringEquivalent: ").append(valueOf).append(".").toString();
                } else {
                    valueOf = "Unknown type in stringEquivalent.";
                }
                throw new IllegalArgumentException(valueOf);
            }
        }
    }

    public static boolean zzd(zzabh<?> com_google_android_gms_internal_zzabh_, zzabh<?> com_google_android_gms_internal_zzabh_2) {
        zzaa.zzaj(com_google_android_gms_internal_zzabh_ != null);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_2 != null);
        String valueOf;
        if (zzf(com_google_android_gms_internal_zzabh_)) {
            valueOf = String.valueOf(com_google_android_gms_internal_zzabh_.toString());
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 46).append("Illegal type given to strictEqualityCompare: ").append(valueOf).append(".").toString());
        } else if (zzf(com_google_android_gms_internal_zzabh_2)) {
            valueOf = String.valueOf(com_google_android_gms_internal_zzabh_2.toString());
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 46).append("Illegal type given to strictEqualityCompare: ").append(valueOf).append(".").toString());
        } else {
            valueOf = zze(com_google_android_gms_internal_zzabh_);
            if (!valueOf.equals(zze(com_google_android_gms_internal_zzabh_2))) {
                return false;
            }
            boolean z = true;
            switch (valueOf.hashCode()) {
                case -1950496919:
                    if (valueOf.equals("Number")) {
                        z = true;
                        break;
                    }
                    break;
                case -1808118735:
                    if (valueOf.equals("String")) {
                        z = true;
                        break;
                    }
                    break;
                case 2439591:
                    if (valueOf.equals("Null")) {
                        z = true;
                        break;
                    }
                    break;
                case 965837104:
                    if (valueOf.equals("Undefined")) {
                        z = false;
                        break;
                    }
                    break;
                case 1729365000:
                    if (valueOf.equals("Boolean")) {
                        z = true;
                        break;
                    }
                    break;
            }
            switch (z) {
                case false:
                case true:
                    return true;
                case true:
                    double doubleValue = ((Double) ((zzabj) com_google_android_gms_internal_zzabh_).zzMk()).doubleValue();
                    double doubleValue2 = ((Double) ((zzabj) com_google_android_gms_internal_zzabh_2).zzMk()).doubleValue();
                    return (Double.isNaN(doubleValue) || Double.isNaN(doubleValue2)) ? false : doubleValue == doubleValue2;
                case true:
                    return ((String) ((zzabp) com_google_android_gms_internal_zzabh_).zzMk()).equals((String) ((zzabp) com_google_android_gms_internal_zzabh_2).zzMk());
                case true:
                    return ((Boolean) ((zzabi) com_google_android_gms_internal_zzabh_).zzMk()) == ((Boolean) ((zzabi) com_google_android_gms_internal_zzabh_2).zzMk());
                default:
                    return com_google_android_gms_internal_zzabh_ == com_google_android_gms_internal_zzabh_2;
            }
        }
    }

    private static String zze(zzabh<?> com_google_android_gms_internal_zzabh_) {
        return com_google_android_gms_internal_zzabh_ == zzabl.zzbvN ? "Undefined" : com_google_android_gms_internal_zzabh_ == zzabl.zzbvM ? "Null" : com_google_android_gms_internal_zzabh_ instanceof zzabi ? "Boolean" : com_google_android_gms_internal_zzabh_ instanceof zzabj ? "Number" : com_google_android_gms_internal_zzabh_ instanceof zzabp ? "String" : "Object";
    }

    private static boolean zzf(zzabh<?> com_google_android_gms_internal_zzabh_) {
        return (com_google_android_gms_internal_zzabh_ instanceof zzabo) || !(!(com_google_android_gms_internal_zzabh_ instanceof zzabl) || com_google_android_gms_internal_zzabh_ == zzabl.zzbvN || com_google_android_gms_internal_zzabh_ == zzabl.zzbvM);
    }
}
