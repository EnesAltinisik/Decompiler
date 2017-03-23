package com.google.android.gms.b;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.google.android.gms.R;
import com.google.android.gms.ads.internal.v;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@vz
public class zl {
    private final Context a;
    private String b;
    private String c;
    private final float d;
    private float e;
    private float f;
    private float g;
    private int h;

    public zl(Context context) {
        this.h = 0;
        this.a = context;
        this.d = context.getResources().getDisplayMetrics().density;
    }

    public zl(Context context, String str) {
        this(context);
        this.b = str;
    }

    private int a(List<String> list, String str, boolean z) {
        if (!z) {
            return -1;
        }
        list.add(str);
        return list.size() - 1;
    }

    private void b() {
        if (this.a instanceof Activity) {
            CharSequence string;
            Resources s = v.i().s();
            if (s != null) {
                string = s.getString(R.string.debug_menu_title);
            } else {
                Object obj = "Select a Debug Mode";
            }
            String string2 = s != null ? s.getString(R.string.debug_menu_ad_information) : "Ad Information";
            String string3 = s != null ? s.getString(R.string.debug_menu_creative_preview) : "Creative Preview";
            String string4 = s != null ? s.getString(R.string.debug_menu_troubleshooting) : "Troubleshooting";
            List arrayList = new ArrayList();
            final int a = a(arrayList, string2, true);
            final int a2 = a(arrayList, string3, ((Boolean) pr.da.c()).booleanValue());
            final int a3 = a(arrayList, string4, ((Boolean) pr.db.c()).booleanValue());
            new Builder(this.a).setTitle(string).setItems((CharSequence[]) arrayList.toArray(new String[0]), new OnClickListener(this) {
                final /* synthetic */ zl d;

                public void onClick(DialogInterface dialogInterface, int i) {
                    if (i == a) {
                        this.d.c();
                    } else if (i == a2 && ((Boolean) pr.da.c()).booleanValue()) {
                        this.d.d();
                    } else if (i == a3 && ((Boolean) pr.db.c()).booleanValue()) {
                        this.d.e();
                    }
                }
            }).create().show();
            return;
        }
        zy.d("Can not create dialog without Activity Context");
    }

    static String c(String str) {
        if (TextUtils.isEmpty(str)) {
            return "No debug information";
        }
        Uri build = new Uri.Builder().encodedQuery(str.replaceAll("\\+", "%20")).build();
        StringBuilder stringBuilder = new StringBuilder();
        Map a = v.e().a(build);
        for (String str2 : a.keySet()) {
            stringBuilder.append(str2).append(" = ").append((String) a.get(str2)).append("\n\n");
        }
        Object trim = stringBuilder.toString().trim();
        return TextUtils.isEmpty(trim) ? "No debug information" : trim;
    }

    private void c() {
        if (this.a instanceof Activity) {
            final Object c = c(this.b);
            Builder builder = new Builder(this.a);
            builder.setMessage(c);
            builder.setTitle("Ad Information");
            builder.setPositiveButton("Share", new OnClickListener(this) {
                final /* synthetic */ zl b;

                public void onClick(DialogInterface dialogInterface, int i) {
                    v.e().a(this.b.a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", c), "Share via"));
                }
            });
            builder.setNegativeButton("Close", new OnClickListener(this) {
                public void onClick(DialogInterface dialogInterface, int i) {
                }
            });
            builder.create().show();
            return;
        }
        zy.d("Can not create dialog without Activity Context");
    }

    private void d() {
        zy.b("Debug mode [Creative Preview] selected.");
        zh.a(new Runnable(this) {
            final /* synthetic */ zl a;

            {
                this.a = r1;
            }

            public void run() {
                v.m().a(this.a.a, this.a.c);
            }
        });
    }

    private void e() {
        zy.b("Debug mode [Troubleshooting] selected.");
        zh.a(new Runnable(this) {
            final /* synthetic */ zl a;

            {
                this.a = r1;
            }

            public void run() {
                v.m().b(this.a.a, this.a.c);
            }
        });
    }

    public void a() {
        if (((Boolean) pr.db.c()).booleanValue() || ((Boolean) pr.da.c()).booleanValue()) {
            b();
        } else {
            c();
        }
    }

    void a(int i, float f, float f2) {
        if (i == 0) {
            this.h = 0;
            this.e = f;
            this.f = f2;
            this.g = f2;
        } else if (this.h == -1) {
        } else {
            if (i == 2) {
                if (f2 > this.f) {
                    this.f = f2;
                } else if (f2 < this.g) {
                    this.g = f2;
                }
                if (this.f - this.g > 30.0f * this.d) {
                    this.h = -1;
                    return;
                }
                if (this.h == 0 || this.h == 2) {
                    if (f - this.e >= 50.0f * this.d) {
                        this.e = f;
                        this.h++;
                    }
                } else if ((this.h == 1 || this.h == 3) && f - this.e <= -50.0f * this.d) {
                    this.e = f;
                    this.h++;
                }
                if (this.h == 1 || this.h == 3) {
                    if (f > this.e) {
                        this.e = f;
                    }
                } else if (this.h == 2 && f < this.e) {
                    this.e = f;
                }
            } else if (i == 1 && this.h == 4) {
                a();
            }
        }
    }

    public void a(MotionEvent motionEvent) {
        int historySize = motionEvent.getHistorySize();
        for (int i = 0; i < historySize; i++) {
            a(motionEvent.getActionMasked(), motionEvent.getHistoricalX(0, i), motionEvent.getHistoricalY(0, i));
        }
        a(motionEvent.getActionMasked(), motionEvent.getX(), motionEvent.getY());
    }

    public void a(String str) {
        this.c = str;
    }

    public void b(String str) {
        this.b = str;
    }
}
