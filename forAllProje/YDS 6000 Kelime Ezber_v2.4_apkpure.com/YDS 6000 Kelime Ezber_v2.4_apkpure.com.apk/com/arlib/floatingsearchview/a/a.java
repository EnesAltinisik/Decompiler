package com.arlib.floatingsearchview.a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView.w;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.arlib.floatingsearchview.R;
import java.util.ArrayList;
import java.util.List;

public class a extends android.support.v7.widget.RecyclerView.a<w> {
    private List<com.arlib.floatingsearchview.a.a.a> a = new ArrayList();
    private a b;
    private Context c;
    private Drawable d;
    private boolean e = false;
    private int f;
    private int g = -1;
    private int h = -1;
    private b i;

    public interface a {
        void a(com.arlib.floatingsearchview.a.a.a aVar);

        void b(com.arlib.floatingsearchview.a.a.a aVar);
    }

    public interface b {
        void a(View view, ImageView imageView, TextView textView, com.arlib.floatingsearchview.a.a.a aVar, int i);
    }

    public static class c extends w {
        public TextView n;
        public ImageView o;
        public ImageView p;
        private a q;

        public interface a {
            void a(int i);

            void b(int i);
        }

        public c(View view, a aVar) {
            super(view);
            this.q = aVar;
            this.n = (TextView) view.findViewById(R.id.body);
            this.o = (ImageView) view.findViewById(R.id.left_icon);
            this.p = (ImageView) view.findViewById(R.id.right_icon);
            this.p.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ c a;

                {
                    this.a = r1;
                }

                public void onClick(View view) {
                    int e = this.a.e();
                    if (this.a.q != null && e != -1) {
                        this.a.q.b(this.a.e());
                    }
                }
            });
            this.a.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ c a;

                {
                    this.a = r1;
                }

                public void onClick(View view) {
                    int e = this.a.e();
                    if (this.a.q != null && e != -1) {
                        this.a.q.a(e);
                    }
                }
            });
        }
    }

    public a(Context context, int i, a aVar) {
        this.c = context;
        this.b = aVar;
        this.f = i;
        this.d = com.arlib.floatingsearchview.util.b.a(this.c, R.drawable.ic_arrow_back_black_24dp);
        android.support.v4.d.a.a.a(this.d, com.arlib.floatingsearchview.util.b.b(this.c, R.color.gray_active_icon));
    }

    public int a() {
        return this.a != null ? this.a.size() : 0;
    }

    public void a(w wVar, int i) {
        c cVar = (c) wVar;
        if (this.e) {
            cVar.p.setEnabled(true);
            cVar.p.setVisibility(0);
        } else {
            cVar.p.setEnabled(false);
            cVar.p.setVisibility(4);
        }
        com.arlib.floatingsearchview.a.a.a aVar = (com.arlib.floatingsearchview.a.a.a) this.a.get(i);
        cVar.n.setText(aVar.a());
        if (this.i != null) {
            this.i.a(cVar.a, cVar.o, cVar.n, aVar, i);
        }
    }

    public void a(b bVar) {
        this.i = bVar;
    }

    public void a(List<? extends com.arlib.floatingsearchview.a.a.a> list) {
        this.a.clear();
        this.a.addAll(list);
        e();
    }

    public void a(boolean z) {
        Object obj = null;
        if (this.e != z) {
            obj = 1;
        }
        this.e = z;
        if (obj != null) {
            e();
        }
    }

    public w b(ViewGroup viewGroup, int i) {
        w cVar = new c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.search_suggestion_item, viewGroup, false), new a(this) {
            final /* synthetic */ a a;

            {
                this.a = r1;
            }

            public void a(int i) {
                if (this.a.b != null) {
                    this.a.b.a((com.arlib.floatingsearchview.a.a.a) this.a.a.get(i));
                }
            }

            public void b(int i) {
                if (this.a.b != null) {
                    this.a.b.b((com.arlib.floatingsearchview.a.a.a) this.a.a.get(i));
                }
            }
        });
        cVar.p.setImageDrawable(this.d);
        cVar.n.setTextSize(0, (float) this.f);
        return cVar;
    }

    public List<? extends com.arlib.floatingsearchview.a.a.a> b() {
        return this.a;
    }

    public void d(int i) {
        Object obj = null;
        if (this.g != i) {
            obj = 1;
        }
        this.g = i;
        if (obj != null) {
            e();
        }
    }

    public void e(int i) {
        Object obj = null;
        if (this.h != i) {
            obj = 1;
        }
        this.h = i;
        if (obj != null) {
            e();
        }
    }
}
