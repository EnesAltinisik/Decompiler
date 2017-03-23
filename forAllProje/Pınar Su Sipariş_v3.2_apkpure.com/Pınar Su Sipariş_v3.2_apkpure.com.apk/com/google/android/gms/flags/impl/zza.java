package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import com.google.android.gms.internal.zzsi;
import java.util.concurrent.Callable;

public abstract class zza<T> {

    public static class zza extends zza<Boolean> {

        class AnonymousClass1 implements Callable<Boolean> {
            final /* synthetic */ SharedPreferences a;
            final /* synthetic */ String b;
            final /* synthetic */ Boolean c;

            AnonymousClass1(SharedPreferences sharedPreferences, String str, Boolean bool) {
                this.a = sharedPreferences;
                this.b = str;
                this.c = bool;
            }

            public Boolean a() {
                return Boolean.valueOf(this.a.getBoolean(this.b, this.c.booleanValue()));
            }

            public /* synthetic */ Object call() throws Exception {
                return a();
            }
        }

        public static Boolean zza(SharedPreferences sharedPreferences, String str, Boolean bool) {
            return (Boolean) zzsi.zzb(new AnonymousClass1(sharedPreferences, str, bool));
        }
    }

    public static class zzb extends zza<Integer> {

        class AnonymousClass1 implements Callable<Integer> {
            final /* synthetic */ SharedPreferences a;
            final /* synthetic */ String b;
            final /* synthetic */ Integer c;

            AnonymousClass1(SharedPreferences sharedPreferences, String str, Integer num) {
                this.a = sharedPreferences;
                this.b = str;
                this.c = num;
            }

            public Integer a() {
                return Integer.valueOf(this.a.getInt(this.b, this.c.intValue()));
            }

            public /* synthetic */ Object call() throws Exception {
                return a();
            }
        }

        public static Integer zza(SharedPreferences sharedPreferences, String str, Integer num) {
            return (Integer) zzsi.zzb(new AnonymousClass1(sharedPreferences, str, num));
        }
    }

    public static class zzc extends zza<Long> {

        class AnonymousClass1 implements Callable<Long> {
            final /* synthetic */ SharedPreferences a;
            final /* synthetic */ String b;
            final /* synthetic */ Long c;

            AnonymousClass1(SharedPreferences sharedPreferences, String str, Long l) {
                this.a = sharedPreferences;
                this.b = str;
                this.c = l;
            }

            public Long a() {
                return Long.valueOf(this.a.getLong(this.b, this.c.longValue()));
            }

            public /* synthetic */ Object call() throws Exception {
                return a();
            }
        }

        public static Long zza(SharedPreferences sharedPreferences, String str, Long l) {
            return (Long) zzsi.zzb(new AnonymousClass1(sharedPreferences, str, l));
        }
    }

    public static class zzd extends zza<String> {

        class AnonymousClass1 implements Callable<String> {
            final /* synthetic */ SharedPreferences a;
            final /* synthetic */ String b;
            final /* synthetic */ String c;

            AnonymousClass1(SharedPreferences sharedPreferences, String str, String str2) {
                this.a = sharedPreferences;
                this.b = str;
                this.c = str2;
            }

            public String a() {
                return this.a.getString(this.b, this.c);
            }

            public /* synthetic */ Object call() throws Exception {
                return a();
            }
        }

        public static String zza(SharedPreferences sharedPreferences, String str, String str2) {
            return (String) zzsi.zzb(new AnonymousClass1(sharedPreferences, str, str2));
        }
    }
}
