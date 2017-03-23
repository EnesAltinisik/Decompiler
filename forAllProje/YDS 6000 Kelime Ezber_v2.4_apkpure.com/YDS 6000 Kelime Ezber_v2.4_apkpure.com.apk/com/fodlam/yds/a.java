package com.fodlam.yds;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.support.v7.app.g;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

public abstract class a extends PreferenceActivity {
    private g a;

    private g a() {
        if (this.a == null) {
            this.a = g.a((Activity) this, null);
        }
        return this.a;
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        a().b(view, layoutParams);
    }

    public MenuInflater getMenuInflater() {
        return a().b();
    }

    public void invalidateOptionsMenu() {
        a().f();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a().a(configuration);
    }

    protected void onCreate(Bundle bundle) {
        a().i();
        a().a(bundle);
        super.onCreate(bundle);
    }

    protected void onDestroy() {
        super.onDestroy();
        a().g();
        this.a = null;
    }

    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        a().b(bundle);
    }

    protected void onPostResume() {
        super.onPostResume();
        a().e();
    }

    protected void onStop() {
        super.onStop();
        a().d();
    }

    protected void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        a().a(charSequence);
    }

    public void setContentView(int i) {
        a().b(i);
    }

    public void setContentView(View view) {
        a().a(view);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        a().a(view, layoutParams);
    }
}
