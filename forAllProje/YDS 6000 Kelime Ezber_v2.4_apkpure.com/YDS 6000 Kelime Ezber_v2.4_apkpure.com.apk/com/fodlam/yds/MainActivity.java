package com.fodlam.yds;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.support.design.widget.NavigationView;
import android.support.design.widget.NavigationView.a;
import android.support.v4.view.q;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.e;
import android.support.v7.app.g;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView;
import android.widget.Toast;
import at.grabner.circleprogress.CircleProgressView;
import com.afollestad.materialdialogs.f;
import com.afollestad.materialdialogs.f.j;
import com.b.a.a.a.c;
import com.b.a.a.a.c.b;
import com.b.a.a.a.h;
import com.google.android.gms.ads.AdView;
import com.mikepenz.fontawesome_typeface_library.FontAwesome;
import com.nightonke.boommenu.BoomMenuButton;
import com.nightonke.boommenu.b.d;
import java.io.Serializable;
import java.util.HashSet;
import net.sqlcipher.database.SQLiteDatabase;

public class MainActivity extends e implements a {
    public static MainActivity m = null;
    private static final String u = MainActivity.class.getName();
    MenuItem n;
    int o = 0;
    DrawerLayout p;
    Menu q = null;
    CompoundButton r;
    AdView s = null;
    c t;
    private BoomMenuButton v;
    private CircleProgressView w;

    private void l() {
        if (OxfordApplication.f) {
            this.s = (AdView) findViewById(R.id.adView);
            this.s.a(new com.google.android.gms.ads.c.a().b("C9B31154FD5A55FF4A275F4A3F3BB278").b("59D066C8530C98987ECD6E439C59A14F").b("A9D382793880830FCEED935DA3BBFA59").a());
            this.s.setAdListener(new com.google.android.gms.ads.a(this) {
                final /* synthetic */ MainActivity a;

                {
                    this.a = r1;
                }

                public void a() {
                    super.a();
                    this.a.s.setVisibility(0);
                    this.a.findViewById(R.id.adsLinearLayout).setVisibility(8);
                }

                public void a(int i) {
                    super.a(i);
                    this.a.s.setVisibility(8);
                    this.a.findViewById(R.id.adsLinearLayout).setVisibility(0);
                }
            });
        }
    }

    private void m() {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        if (!defaultSharedPreferences.getString("com.fodlam.yds.full", "full").equals("com.fodlam.yds") && !defaultSharedPreferences.getString("com.fodlam.yds.noads", "full").equals("com.fodlam.yds")) {
            this.t = new c(this, "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxJvoOSAb8hUKvThiWh0Zc/U7u70eMBMrkrhDIdxvqTftqiOKqHxJJw1cIoOAdYUlBTWgJQnB9tbrZXzRYlPGokXd12L1KanIVc7QuDj2QPHjlfTOGLwD44bKsji1o8NqFmpDrbBieKyVCvffPfs0iCn8KslzwzbodLbaviOfDW0Mi0RGFZwW3WPigmZlHLgcngv9UFHDZuQ6wPNJ8BylsjNBtrwA+mwtkRWSBVkBoZ1p3ts5eWa864fqieqvENRIt2JRa4b+9bM4VX49yVBI1SlGpIAm6CLh6r12TYAIg/pFn7pebnvQxhq7UzG8p15p8lLAXX2EdMC51MNtVRSdpQIDAQAB", "13729865083699685309", new b(this) {
                final /* synthetic */ MainActivity a;

                {
                    this.a = r1;
                }

                public void a(int i, Throwable th) {
                }

                public void a(String str, h hVar) {
                }

                public void c_() {
                    this.a.o();
                }

                public void d_() {
                }
            });
        }
    }

    private void n() {
        if (com.fodlam.yds.utility.b.a((Context) this).a().size() == 0) {
            final SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
            if (!defaultSharedPreferences.getBoolean("dontremindmefortts", false)) {
                new Handler().postDelayed(new Runnable(this) {
                    final /* synthetic */ MainActivity b;

                    public void run() {
                        new f.a(this.b).a((int) R.string.ttsdownloadtitle).b(this.b.getString(R.string.ttsdownloadsummary)).b(false).f(R.string.download).g(R.string.dontremindme).a(new j(this) {
                            final /* synthetic */ AnonymousClass5 a;

                            {
                                this.a = r1;
                            }

                            public void a(f fVar, com.afollestad.materialdialogs.b bVar) {
                                fVar.dismiss();
                                Intent intent = new Intent("android.intent.action.VIEW");
                                intent.setData(Uri.parse("market://details?id=com.google.android.tts"));
                                this.a.b.startActivity(intent);
                            }
                        }).b(new j(this) {
                            final /* synthetic */ AnonymousClass5 a;

                            {
                                this.a = r1;
                            }

                            public void a(f fVar, com.afollestad.materialdialogs.b bVar) {
                                defaultSharedPreferences.edit().putBoolean("dontremindmefortts", true).commit();
                            }
                        }).c();
                    }
                }, 1000);
            }
            OxfordApplication.a = 3;
        }
    }

    private void o() {
        if (this.t != null) {
            Editor edit = PreferenceManager.getDefaultSharedPreferences(this).edit();
            if (this.t.a("com.fodlam.yds.full") && this.t.a("com.fodlam.yds.noads")) {
                edit.putString("com.fodlam.yds.full", "com.fodlam.yds").commit();
                edit.putString("com.fodlam.yds.noads", "com.fodlam.yds").commit();
                OxfordApplication.d(this);
            } else if (this.t.a("com.fodlam.yds.full")) {
                edit.putString("com.fodlam.yds.full", "com.fodlam.yds").commit();
                OxfordApplication.d(this);
            } else if (this.t.a("com.fodlam.yds.noads")) {
                edit.putString("com.fodlam.yds.noads", "com.fodlam.yds").commit();
                OxfordApplication.d(this);
            }
            if (!OxfordApplication.f && this.s != null) {
                ((View) findViewById(R.id.adsLinearLayout).getParent()).setVisibility(8);
                ((View) findViewById(R.id.adView).getParent()).setVisibility(8);
            }
        }
    }

    private void p() {
        Serializable serializableExtra = getIntent().getSerializableExtra("notifyword");
        if (serializableExtra != null) {
            final com.fodlam.yds.f.h hVar = (com.fodlam.yds.f.h) serializableExtra;
            OxfordApplication.i = hVar.e / 15;
            OxfordApplication.g = hVar.d;
            OxfordApplication.h = OxfordApplication.a.LEARNING;
            final f c = new f.a(this).a((int) R.string.setupprogress).c((int) R.string.pleasewait).a(true, 0).a(false).b(false).c();
            new Handler().postDelayed(new Runnable(this) {
                final /* synthetic */ MainActivity c;

                public void run() {
                    Intent intent = new Intent(this.c, WordLearningActivity.class);
                    intent.putExtra("notifyword", hVar);
                    this.c.startActivity(intent);
                    c.dismiss();
                }
            }, 1000);
            getIntent().removeExtra("notifyword");
        }
    }

    private void q() {
        int[] iArr = new int[]{R.drawable.ic_filter_1_black_24px, R.drawable.ic_filter_2_black_24px, R.drawable.ic_filter_3_black_24px, R.drawable.ic_filter_tilt_shift_black_24dp};
        g.a(true);
        com.fodlam.yds.c.b a = com.fodlam.yds.c.b.a();
        this.v.setButtonEnum(com.nightonke.boommenu.b.Ham);
        this.v.setButtonPlaceEnum(d.HAM_4);
        this.v.setPiecePlaceEnum(com.nightonke.boommenu.c.d.HAM_4);
        for (int i = 0; i < this.v.getPiecePlaceEnum().a(); i++) {
            this.v.a(new com.nightonke.boommenu.b.f.a().a(android.support.v4.c.a.a(this, iArr[i])).a(a.c(i).a).b(16).c(R.color.colorPrimary).a(Typeface.DEFAULT_BOLD).d(R.color.material_white).a(true));
        }
        this.v.setOnBoomListener(new com.nightonke.boommenu.d(this) {
            final /* synthetic */ MainActivity a;

            {
                this.a = r1;
            }

            public void a() {
            }

            public void a(int i, com.nightonke.boommenu.b.a aVar) {
                this.a.b(i);
                aVar.t();
            }

            public void b() {
            }

            public void c() {
            }

            public void d() {
            }

            public void e() {
            }
        });
    }

    public boolean a(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.nav_help) {
            startActivity(new Intent(this, HelperActivity.class));
        } else if (itemId == R.id.statistic) {
            startActivity(new Intent(this, StatisticActivity.class));
        } else if (itemId == R.id.nav_store) {
            startActivity(new Intent(this, FodlaBillingActivity.class));
        } else {
            if (itemId != R.id.nav_soundOnOff) {
                if (itemId == R.id.nav_manage) {
                    startActivity(new Intent(this, SettingsActivity.class));
                } else if (itemId == R.id.nav_share) {
                    r1 = new Intent("android.intent.action.SEND");
                    r1.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
                    r1.setType("text/plain");
                    r1.putExtra("android.intent.extra.TEXT", "Merhabalar, lütfen bu uygumalayı indirin!\nhttp://play.google.com/store/apps/details?id=" + getPackageName() + "\n");
                    startActivity(r1);
                } else if (itemId == R.id.nav_more) {
                    r1 = new Intent("android.intent.action.VIEW");
                    r1.setData(Uri.parse("market://search?id=Fodla%20Media"));
                    startActivity(r1);
                } else if (itemId == R.id.nav_grade) {
                    r1 = new Intent("android.intent.action.VIEW");
                    r1.setData(Uri.parse("market://details?id=" + getPackageName()));
                    startActivity(r1);
                }
            }
            return true;
        }
        if (itemId == R.id.nav_not) {
            startActivity(new Intent(this, NewsMessagesActivity.class));
        }
        this.p.f(8388611);
        return true;
    }

    public void b(int i) {
        OxfordApplication.c(getApplicationContext());
        if (com.fodlam.yds.c.b.a().c(i).c) {
            OxfordApplication.g = i;
            Editor edit = PreferenceManager.getDefaultSharedPreferences(this).edit();
            edit.putInt("CurrentCategory", i);
            edit.commit();
            OxfordApplication.i = 0;
            j();
        }
    }

    public void clickLearnedWords(View view) {
        startActivity(new Intent(this, WordListActivity.class));
    }

    public void clickPlayButton(View view) {
        if (com.fodlam.yds.c.b.a().g().a() < 1) {
            Toast.makeText(this, R.string.addawordtofavoritecat, 0).show();
        } else {
            startActivity(new Intent(this, WordLearningActivity.class));
        }
    }

    public void clickTests(View view) {
        if (com.fodlam.yds.c.b.a().g().a() < 1) {
            Toast.makeText(this, R.string.addawordtofavoritecat, 0).show();
        } else {
            startActivity(new Intent(this, TestLevelActivity.class));
        }
    }

    void j() {
        if (com.fodlam.yds.c.b.a() == null) {
            com.fodlam.yds.c.b.a((Context) this, true);
        }
        com.fodlam.yds.f.b g = com.fodlam.yds.c.b.a().g();
        this.n.setTitle(g.b());
        ((TextView) findViewById(R.id.levelTextView)).setText(g.b());
        ((TextView) findViewById(R.id.levelTextView2)).setText(g.c());
        this.w.d();
        this.w.c();
        float f = 0.0f;
        if (g.a() != 0) {
            f = (100.0f * ((float) g.h())) / ((float) g.a());
        }
        this.w.setValueAnimated(f);
    }

    public void k() {
        if (this.q != null) {
            int size = PreferenceManager.getDefaultSharedPreferences(this).getStringSet("news_messages", new HashSet()).size();
            if (size > 0) {
                com.mikepenz.actionitembadge.library.a.a((Activity) this, this.q.findItem(R.id.item_samplebadge), FontAwesome.a.faw_envelope, com.mikepenz.actionitembadge.library.a.b.RED, size);
            } else {
                com.mikepenz.actionitembadge.library.a.a(this.q.findItem(R.id.item_samplebadge));
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void onBackPressed() {
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawerLayout.g(8388611)) {
            drawerLayout.f(8388611);
            return;
        }
        this.o++;
        if (this.o == 2) {
            finish();
        } else {
            Toast.makeText(this, R.string.quitcontent, 0).show();
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        a(toolbar);
        setTitle(getString(R.string.app_name));
        this.p = (DrawerLayout) findViewById(R.id.drawer_layout);
        DrawerLayout.f bVar = new android.support.v7.app.b(this, this.p, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        this.p.a(bVar);
        bVar.a();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setItemIconTintList(null);
        this.r = (CompoundButton) q.a(navigationView.getMenu().findItem(R.id.nav_soundOnOff));
        this.r.setOnCheckedChangeListener(new OnCheckedChangeListener(this) {
            final /* synthetic */ MainActivity a;

            {
                this.a = r1;
            }

            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                OxfordApplication.d = z;
                PreferenceManager.getDefaultSharedPreferences(this.a).edit().putBoolean("test_sound_on", z).commit();
            }
        });
        this.r.setChecked(OxfordApplication.d);
        this.n = navigationView.getMenu().findItem(R.id.nav_level);
        this.v = (BoomMenuButton) q.a(navigationView.getMenu().findItem(R.id.nav_level));
        q();
        this.w = (CircleProgressView) findViewById(R.id.circleView);
        this.w.setSpinSpeed(5.0f);
        findViewById(R.id.mainspinnerback).setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ MainActivity a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                this.a.v.b();
            }
        });
        com.balysv.materialripple.a.a(findViewById(R.id.playTestButton)).a(Color.parseColor("#BBDEFB")).a(0.3f).b(true).a();
        com.balysv.materialripple.a.a(findViewById(R.id.levelButton)).a(Color.parseColor("#BBDEFB")).a(0.3f).b(true).a();
        com.balysv.materialripple.a.a(findViewById(R.id.learnedWordsButton)).a(Color.parseColor("#BBDEFB")).a(0.3f).b(true).a();
        com.google.firebase.messaging.a.a().a("ydstest");
        m = this;
        j();
        m();
        l();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mainactivity_menu, menu);
        this.q = menu;
        k();
        return true;
    }

    protected void onDestroy() {
        super.onDestroy();
        OxfordApplication.b();
        this.v = null;
        this.w = null;
        this.n = null;
        this.p = null;
        this.r = null;
        if (this.t != null) {
            this.t.c();
        }
        finishAffinity();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.item_samplebadge) {
            com.mikepenz.actionitembadge.library.a.a(menuItem, 0);
            startActivity(new Intent(this, NewsMessagesActivity.class));
            return true;
        } else if (itemId != R.id.search) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            startActivity(new Intent(this, SearchResultsActivity.class));
            return true;
        }
    }

    protected void onResume() {
        j();
        this.o = 0;
        k();
        if (this.r != null) {
            this.r.setChecked(OxfordApplication.d);
        }
        p();
        if (!(OxfordApplication.f || this.s == null)) {
            ((View) findViewById(R.id.adsLinearLayout).getParent()).setVisibility(8);
            ((View) findViewById(R.id.adView).getParent()).setVisibility(8);
        }
        super.onResume();
        n();
    }

    public void setClickBanner(View view) {
        startActivity(new Intent(this, FodlaBillingActivity.class));
    }
}
