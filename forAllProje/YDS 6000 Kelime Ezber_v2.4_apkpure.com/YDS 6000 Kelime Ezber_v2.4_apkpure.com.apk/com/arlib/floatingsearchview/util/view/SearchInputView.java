package com.arlib.floatingsearchview.util.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.EditText;

public class SearchInputView extends EditText {
    private b a;
    private a b;
    private OnKeyListener c = new OnKeyListener(this) {
        final /* synthetic */ SearchInputView a;

        {
            this.a = r1;
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (i != 66 || this.a.a == null) {
                return false;
            }
            this.a.a.a();
            return true;
        }
    };

    public interface a {
        void a();
    }

    public interface b {
        void a();
    }

    public SearchInputView(Context context) {
        super(context);
        a();
    }

    public SearchInputView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public SearchInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    private void a() {
        setOnKeyListener(this.c);
    }

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 && this.b != null) {
            this.b.a();
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    public void setOnKeyboardDismissedListener(a aVar) {
        this.b = aVar;
    }

    public void setOnSearchKeyListener(b bVar) {
        this.a = bVar;
    }
}
