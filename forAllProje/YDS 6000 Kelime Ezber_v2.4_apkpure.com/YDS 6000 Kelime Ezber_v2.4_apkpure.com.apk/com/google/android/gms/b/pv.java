package com.google.android.gms.b;

import android.text.TextUtils;

@vz
public class pv {
    public pt a(ps psVar) {
        if (psVar == null) {
            throw new IllegalArgumentException("CSI configuration can't be null. ");
        } else if (!psVar.a()) {
            ze.a("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
            return null;
        } else if (psVar.c() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        } else if (!TextUtils.isEmpty(psVar.d())) {
            return new pt(psVar.c(), psVar.d(), psVar.b(), psVar.e());
        } else {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
    }
}
