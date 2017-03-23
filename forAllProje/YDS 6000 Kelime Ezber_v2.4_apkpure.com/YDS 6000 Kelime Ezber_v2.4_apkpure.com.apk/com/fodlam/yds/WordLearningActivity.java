package com.fodlam.yds;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupMenu;
import android.widget.PopupMenu.OnMenuItemClickListener;
import com.afollestad.materialdialogs.f.a;
import com.afollestad.materialdialogs.f.f;
import com.badoualy.stepperindicator.StepperIndicator;
import com.fodlam.yds.a.h;
import com.fodlam.yds.f.e;
import com.fodlam.yds.utility.b;
import com.google.firebase.database.d;
import java.lang.reflect.Field;

public class WordLearningActivity extends c {
    b m;
    h n;
    ViewPager o;
    private boolean p = false;
    private d q;

    private void j() {
        com.fodlam.yds.f.h a = this.n.a(this.o.getCurrentItem());
        if (!a.b) {
            new a(this).a((int) R.string.examplesentence).b(a.c()).f(R.string.ok).a(com.afollestad.materialdialogs.h.LIGHT).i(R.color.colorPrimary).d(-12303292).c();
        }
    }

    private void l() {
        final com.fodlam.yds.f.h a = this.n.a(this.o.getCurrentItem());
        if (!a.b) {
            new a(this).a((int) R.string.wordinform).f(R.string.ok).g(R.string.cancel).a(com.afollestad.materialdialogs.h.LIGHT).d(-12303292).e(R.array.items).a(null, new f(this) {
                final /* synthetic */ WordLearningActivity b;

                public boolean a(com.afollestad.materialdialogs.f fVar, Integer[] numArr, CharSequence[] charSequenceArr) {
                    if (numArr != null && numArr.length > 0) {
                        e eVar = a.l;
                        if (!eVar.c()) {
                            eVar.d();
                            com.fodlam.yds.c.a.a(null).a(eVar);
                            Object aVar = new com.fodlam.yds.f.a();
                            for (Integer intValue : numArr) {
                                switch (intValue.intValue()) {
                                    case 0:
                                        aVar.a(true);
                                        break;
                                    case 1:
                                        aVar.b(true);
                                        break;
                                    case 2:
                                        aVar.c(true);
                                        break;
                                    case 3:
                                        aVar.d(true);
                                        break;
                                    case 4:
                                        aVar.e(true);
                                        break;
                                    default:
                                        break;
                                }
                            }
                            this.b.q.a(OxfordApplication.c).a("alert").a(a.c + "").a(aVar);
                        }
                    }
                    fVar.dismiss();
                    return true;
                }
            }).c();
        }
    }

    public void b(int i) {
        if (this.o.getCurrentItem() != this.n.b() - 1) {
            com.fodlam.yds.utility.a.a(getApplicationContext()).d();
            this.o.a(this.o.getCurrentItem() + i, true);
        } else if (!this.p) {
            this.p = true;
            c(this.n.c());
            com.fodlam.yds.utility.a.a(getApplicationContext()).c();
        }
    }

    protected void onCreate(Bundle bundle) {
        int i = 2;
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_learning);
        a((Toolbar) findViewById(R.id.toolbar));
        setTitle(OxfordApplication.h.a() + " - " + (OxfordApplication.i + 1) + ". Test");
        ((FloatingActionButton) findViewById(R.id.fab)).setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ WordLearningActivity a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                this.a.j();
            }
        });
        this.m = b.a(getApplicationContext());
        this.o = (ViewPager) findViewById(R.id.viewPager);
        this.n = new h(this, bundle);
        this.o.setAdapter(this.n);
        this.o.setOffscreenPageLimit(this.n.b());
        final StepperIndicator stepperIndicator = (StepperIndicator) findViewById(R.id.stepIndicator);
        if (this.n.b() / 3 >= 2) {
            i = this.n.b() / 3;
        }
        stepperIndicator.setStepCount(i);
        this.o.a(new ViewPager.f(this) {
            boolean a = false;
            final /* synthetic */ WordLearningActivity c;

            public void a(int i) {
                boolean z = true;
                if (!(this.c.o.getCurrentItem() == this.c.n.b() - 1 && i == 1)) {
                    z = false;
                }
                this.a = z;
            }

            public void a(int i, float f, int i2) {
                if (this.c.n != null) {
                    int b = this.c.n.b() - 1;
                    if (this.a && i == b) {
                        this.c.b(1);
                    }
                }
            }

            public void b(int i) {
                stepperIndicator.setCurrentStep(i / 3);
                com.fodlam.yds.f.h a = this.c.n.a(this.c.o.getCurrentItem());
                e eVar = a.l;
                if (!a.b) {
                    if (eVar.a(OxfordApplication.h.c()) == 0) {
                        eVar.b(OxfordApplication.h.c(), 1);
                        com.fodlam.yds.c.a.a(this.c.getApplicationContext()).a(eVar);
                    }
                    if (i == 1) {
                        a = this.c.n.a(this.c.o.getCurrentItem() - 1);
                        if (!a.b) {
                            e eVar2 = a.l;
                            eVar2.b(OxfordApplication.h.c(), 1);
                            com.fodlam.yds.c.a.a(this.c.getApplicationContext()).a(eVar2);
                        }
                    }
                }
            }
        });
        if (bundle != null) {
            this.o.setCurrentItem(bundle.getInt("CurrentItem"));
        }
        if (getIntent().getSerializableExtra("notifyword") != null) {
            this.o.setCurrentItem(this.n.a((com.fodlam.yds.f.h) getIntent().getSerializableExtra("notifyword")));
            getIntent().removeExtra("notifyword");
        }
        this.q = com.google.firebase.database.f.a().b();
    }

    protected void onDestroy() {
        super.onDestroy();
        this.m = null;
        this.o = null;
        this.n = null;
    }

    protected void onResume() {
        super.onResume();
        if (com.google.firebase.database.f.a() != null) {
            com.google.firebase.database.f.a().c();
        }
    }

    protected void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("CurrentItem", this.o.getCurrentItem());
        bundle.putSerializable("wordlearninglist", this.n.a);
    }

    protected void onStop() {
        super.onStop();
        if (com.google.firebase.database.f.a() != null) {
            com.google.firebase.database.f.a().d();
        }
    }

    public void showPopupMenu(View view) {
        PopupMenu popupMenu = new PopupMenu(view.getContext(), view);
        try {
            for (Field field : popupMenu.getClass().getDeclaredFields()) {
                if ("mPopup".equals(field.getName())) {
                    field.setAccessible(true);
                    Object obj = field.get(popupMenu);
                    Class.forName(obj.getClass().getName()).getMethod("setForceShowIcon", new Class[]{Boolean.TYPE}).invoke(obj, new Object[]{Boolean.valueOf(true)});
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        popupMenu.getMenuInflater().inflate(R.menu.menu_poppupforlearningitem, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new OnMenuItemClickListener(this) {
            final /* synthetic */ WordLearningActivity a;

            {
                this.a = r1;
            }

            public boolean onMenuItemClick(MenuItem menuItem) {
                if (menuItem.getTitle().toString().startsWith("Kelime")) {
                    this.a.l();
                }
                return false;
            }
        });
        popupMenu.show();
    }
}
