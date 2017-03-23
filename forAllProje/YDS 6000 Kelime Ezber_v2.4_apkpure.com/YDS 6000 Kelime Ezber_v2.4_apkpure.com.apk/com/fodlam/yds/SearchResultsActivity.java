package com.fodlam.yds;

import android.os.Bundle;
import android.support.v7.app.e;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import com.arlib.floatingsearchview.FloatingSearchView;
import com.arlib.floatingsearchview.FloatingSearchView.g;
import com.arlib.floatingsearchview.a.a.a;
import com.fodlam.yds.a.f;
import com.fodlam.yds.c.b;

public class SearchResultsActivity extends e {
    boolean m = true;
    Menu n;
    private RecyclerView o;
    private f p;
    private LinearLayoutManager q;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_search_results);
        setTitle("");
        this.o = (RecyclerView) findViewById(R.id.my_recycler_view);
        this.o.setBackgroundResource(R.drawable.backalt);
        this.o.setHasFixedSize(true);
        this.q = new LinearLayoutManager(this);
        this.o.setLayoutManager(this.q);
        this.p = new f(this);
        this.o.setAdapter(this.p);
        final FloatingSearchView floatingSearchView = (FloatingSearchView) findViewById(R.id.floating_search_view);
        floatingSearchView.setOnQueryChangeListener(new FloatingSearchView.f(this) {
            final /* synthetic */ SearchResultsActivity b;

            public void a(String str, String str2) {
                if (str.equals("") || !str2.equals("")) {
                    floatingSearchView.a();
                    floatingSearchView.a(this.b.p.a(this.b.m, str2));
                    floatingSearchView.b();
                    return;
                }
                floatingSearchView.c();
            }
        });
        floatingSearchView.setOnSearchListener(new g(this) {
            final /* synthetic */ SearchResultsActivity a;

            {
                this.a = r1;
            }

            public void a(a aVar) {
                this.a.q.b(this.a.p.b(this.a.m, aVar.a()), 0);
            }

            public void a(String str) {
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.searchactivity_menu, menu);
        this.n = menu;
        return true;
    }

    protected void onDestroy() {
        try {
            b.a().j();
        } catch (Exception e) {
        }
        super.onDestroy();
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.action) {
            Object charSequence = this.n.findItem(R.id.turkish).getTitle().toString();
            this.n.findItem(R.id.turkish).setTitle(this.n.findItem(R.id.english).getTitle().toString());
            this.n.findItem(R.id.english).setTitle(charSequence);
            this.m = !charSequence.toLowerCase().startsWith("t");
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
