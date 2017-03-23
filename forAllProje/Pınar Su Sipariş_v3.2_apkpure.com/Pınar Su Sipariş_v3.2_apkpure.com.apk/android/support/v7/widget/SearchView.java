package android.support.v7.widget;

import android.annotation.TargetApi;
import android.app.SearchableInfo;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.ResultReceiver;
import android.support.v4.widget.f;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.drive.DriveFile;
import com.google.android.gms.internal.zzamj;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class SearchView extends ai implements android.support.v7.view.c {
    static final a a = new a();
    private static final boolean b;
    private boolean A;
    private boolean B;
    private int C;
    private boolean D;
    private CharSequence E;
    private boolean F;
    private int G;
    private SearchableInfo H;
    private Bundle I;
    private Runnable J;
    private final Runnable K;
    private Runnable L;
    private final WeakHashMap<String, ConstantState> M;
    private final SearchAutoComplete c;
    private final View d;
    private final View e;
    private final ImageView f;
    private final ImageView g;
    private final ImageView h;
    private final ImageView i;
    private final ImageView j;
    private final Drawable k;
    private final int l;
    private final int m;
    private final Intent n;
    private final Intent o;
    private final CharSequence p;
    private c q;
    private b r;
    private OnFocusChangeListener s;
    private d t;
    private OnClickListener u;
    private boolean v;
    private boolean w;
    private f x;
    private boolean y;
    private CharSequence z;

    static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new Creator<SavedState>() {
            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return a(parcel);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return a(i);
            }

            public SavedState a(Parcel parcel) {
                return new SavedState(parcel);
            }

            public SavedState[] a(int i) {
                return new SavedState[i];
            }
        };
        boolean a;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.a));
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.a + "}";
        }
    }

    public static class SearchAutoComplete extends f {
        private int a;
        private SearchView b;

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, android.support.v7.a.a.a.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.a = getThreshold();
        }

        void setSearchView(SearchView searchView) {
            this.b = searchView;
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.a = i;
        }

        protected void replaceText(CharSequence charSequence) {
        }

        public void performCompletion() {
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.b.hasFocus() && getVisibility() == 0) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                if (SearchView.a(getContext())) {
                    SearchView.a.a(this, true);
                }
            }
        }

        protected void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.b.d();
        }

        public boolean enoughToFilter() {
            return this.a <= 0 || super.enoughToFilter();
        }

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                DispatcherState keyDispatcherState;
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState == null) {
                        return true;
                    }
                    keyDispatcherState.startTracking(keyEvent, this);
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.b.clearFocus();
                        this.b.setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }
    }

    private static class a {
        private Method a;
        private Method b;
        private Method c;
        private Method d;

        a() {
            try {
                this.a = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.a.setAccessible(true);
            } catch (NoSuchMethodException e) {
            }
            try {
                this.b = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.b.setAccessible(true);
            } catch (NoSuchMethodException e2) {
            }
            try {
                this.c = AutoCompleteTextView.class.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.c.setAccessible(true);
            } catch (NoSuchMethodException e3) {
            }
            try {
                this.d = InputMethodManager.class.getMethod("showSoftInputUnchecked", new Class[]{Integer.TYPE, ResultReceiver.class});
                this.d.setAccessible(true);
            } catch (NoSuchMethodException e4) {
            }
        }

        void a(AutoCompleteTextView autoCompleteTextView) {
            if (this.a != null) {
                try {
                    this.a.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception e) {
                }
            }
        }

        void b(AutoCompleteTextView autoCompleteTextView) {
            if (this.b != null) {
                try {
                    this.b.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception e) {
                }
            }
        }

        void a(AutoCompleteTextView autoCompleteTextView, boolean z) {
            if (this.c != null) {
                try {
                    this.c.invoke(autoCompleteTextView, new Object[]{Boolean.valueOf(z)});
                } catch (Exception e) {
                }
            }
        }
    }

    public interface b {
        boolean a();
    }

    public interface c {
        boolean a(String str);
    }

    public interface d {
    }

    static {
        boolean z;
        if (VERSION.SDK_INT >= 8) {
            z = true;
        } else {
            z = false;
        }
        b = z;
    }

    int getSuggestionRowLayout() {
        return this.l;
    }

    int getSuggestionCommitIconResId() {
        return this.m;
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.H = searchableInfo;
        if (this.H != null) {
            if (b) {
                l();
            }
            k();
        }
        boolean z = b && e();
        this.D = z;
        if (this.D) {
            this.c.setPrivateImeOptions("nm");
        }
        a(c());
    }

    public void setAppSearchData(Bundle bundle) {
        this.I = bundle;
    }

    public void setImeOptions(int i) {
        this.c.setImeOptions(i);
    }

    public int getImeOptions() {
        return this.c.getImeOptions();
    }

    public void setInputType(int i) {
        this.c.setInputType(i);
    }

    public int getInputType() {
        return this.c.getInputType();
    }

    public boolean requestFocus(int i, Rect rect) {
        if (this.B || !isFocusable()) {
            return false;
        }
        if (c()) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.c.requestFocus(i, rect);
        if (requestFocus) {
            a(false);
        }
        return requestFocus;
    }

    public void clearFocus() {
        this.B = true;
        setImeVisibility(false);
        super.clearFocus();
        this.c.clearFocus();
        this.B = false;
    }

    public void setOnQueryTextListener(c cVar) {
        this.q = cVar;
    }

    public void setOnCloseListener(b bVar) {
        this.r = bVar;
    }

    public void setOnQueryTextFocusChangeListener(OnFocusChangeListener onFocusChangeListener) {
        this.s = onFocusChangeListener;
    }

    public void setOnSuggestionListener(d dVar) {
        this.t = dVar;
    }

    public void setOnSearchClickListener(OnClickListener onClickListener) {
        this.u = onClickListener;
    }

    public CharSequence getQuery() {
        return this.c.getText();
    }

    public void a(CharSequence charSequence, boolean z) {
        this.c.setText(charSequence);
        if (charSequence != null) {
            this.c.setSelection(this.c.length());
            this.E = charSequence;
        }
        if (z && !TextUtils.isEmpty(charSequence)) {
            m();
        }
    }

    public void setQueryHint(CharSequence charSequence) {
        this.z = charSequence;
        k();
    }

    public CharSequence getQueryHint() {
        if (this.z != null) {
            return this.z;
        }
        if (!b || this.H == null || this.H.getHintId() == 0) {
            return this.p;
        }
        return getContext().getText(this.H.getHintId());
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.v != z) {
            this.v = z;
            a(z);
            k();
        }
    }

    public void setIconified(boolean z) {
        if (z) {
            o();
        } else {
            p();
        }
    }

    public boolean c() {
        return this.w;
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.y = z;
        a(c());
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.A = z;
        if (this.x instanceof at) {
            ((at) this.x).a(z ? 2 : 1);
        }
    }

    public void setSuggestionsAdapter(f fVar) {
        this.x = fVar;
        this.c.setAdapter(this.x);
    }

    public f getSuggestionsAdapter() {
        return this.x;
    }

    public void setMaxWidth(int i) {
        this.C = i;
        requestLayout();
    }

    public int getMaxWidth() {
        return this.C;
    }

    protected void onMeasure(int i, int i2) {
        if (c()) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        switch (mode) {
            case zzamj.UNSET_ENUM_VALUE /*-2147483648*/:
                if (this.C <= 0) {
                    size = Math.min(getPreferredWidth(), size);
                    break;
                } else {
                    size = Math.min(this.C, size);
                    break;
                }
            case 0:
                if (this.C <= 0) {
                    size = getPreferredWidth();
                    break;
                } else {
                    size = this.C;
                    break;
                }
            case 1073741824:
                if (this.C > 0) {
                    size = Math.min(this.C, size);
                    break;
                }
                break;
        }
        super.onMeasure(MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(android.support.v7.a.a.d.abc_search_view_preferred_width);
    }

    private void a(boolean z) {
        boolean z2;
        boolean z3 = true;
        int i = 8;
        this.w = z;
        int i2 = z ? 0 : 8;
        if (TextUtils.isEmpty(this.c.getText())) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f.setVisibility(i2);
        b(z2);
        View view = this.d;
        if (z) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        view.setVisibility(i2);
        if (!(this.j.getDrawable() == null || this.v)) {
            i = 0;
        }
        this.j.setVisibility(i);
        h();
        if (z2) {
            z3 = false;
        }
        c(z3);
        g();
    }

    @TargetApi(8)
    private boolean e() {
        if (this.H == null || !this.H.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.H.getVoiceSearchLaunchWebSearch()) {
            intent = this.n;
        } else if (this.H.getVoiceSearchLaunchRecognizer()) {
            intent = this.o;
        }
        if (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) {
            return false;
        }
        return true;
    }

    private boolean f() {
        return (this.y || this.D) && !c();
    }

    private void b(boolean z) {
        int i = 8;
        if (this.y && f() && hasFocus() && (z || !this.D)) {
            i = 0;
        }
        this.g.setVisibility(i);
    }

    private void g() {
        int i = 8;
        if (f() && (this.g.getVisibility() == 0 || this.i.getVisibility() == 0)) {
            i = 0;
        }
        this.e.setVisibility(i);
    }

    private void h() {
        int i = 1;
        int i2 = 0;
        int i3 = !TextUtils.isEmpty(this.c.getText()) ? 1 : 0;
        if (i3 == 0 && (!this.v || this.F)) {
            i = 0;
        }
        ImageView imageView = this.h;
        if (i == 0) {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        Drawable drawable = this.h.getDrawable();
        if (drawable != null) {
            drawable.setState(i3 != 0 ? ENABLED_STATE_SET : EMPTY_STATE_SET);
        }
    }

    private void i() {
        post(this.K);
    }

    protected void onDetachedFromWindow() {
        removeCallbacks(this.K);
        post(this.L);
        super.onDetachedFromWindow();
    }

    private void setImeVisibility(boolean z) {
        if (z) {
            post(this.J);
            return;
        }
        removeCallbacks(this.J);
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        }
    }

    void a(CharSequence charSequence) {
        setQuery(charSequence);
    }

    private CharSequence b(CharSequence charSequence) {
        if (!this.v || this.k == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.c.getTextSize()) * 1.25d);
        this.k.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.k), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private void k() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.c;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(b(queryHint));
    }

    @TargetApi(8)
    private void l() {
        int i = 1;
        this.c.setThreshold(this.H.getSuggestThreshold());
        this.c.setImeOptions(this.H.getImeOptions());
        int inputType = this.H.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.H.getSuggestAuthority() != null) {
                inputType = (inputType | 65536) | 524288;
            }
        }
        this.c.setInputType(inputType);
        if (this.x != null) {
            this.x.a(null);
        }
        if (this.H.getSuggestAuthority() != null) {
            this.x = new at(getContext(), this, this.H, this.M);
            this.c.setAdapter(this.x);
            at atVar = (at) this.x;
            if (this.A) {
                i = 2;
            }
            atVar.a(i);
        }
    }

    private void c(boolean z) {
        int i;
        if (this.D && !c() && z) {
            i = 0;
            this.g.setVisibility(8);
        } else {
            i = 8;
        }
        this.i.setVisibility(i);
    }

    private void m() {
        CharSequence text = this.c.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            if (this.q == null || !this.q.a(text.toString())) {
                if (this.H != null) {
                    a(0, null, text.toString());
                }
                setImeVisibility(false);
                n();
            }
        }
    }

    private void n() {
        this.c.dismissDropDown();
    }

    private void o() {
        if (!TextUtils.isEmpty(this.c.getText())) {
            this.c.setText("");
            this.c.requestFocus();
            setImeVisibility(true);
        } else if (!this.v) {
        } else {
            if (this.r == null || !this.r.a()) {
                clearFocus();
                a(true);
            }
        }
    }

    private void p() {
        a(false);
        this.c.requestFocus();
        setImeVisibility(true);
        if (this.u != null) {
            this.u.onClick(this);
        }
    }

    void d() {
        a(c());
        i();
        if (this.c.hasFocus()) {
            q();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        i();
    }

    public void b() {
        a((CharSequence) "", false);
        clearFocus();
        a(true);
        this.c.setImeOptions(this.G);
        this.F = false;
    }

    public void a() {
        if (!this.F) {
            this.F = true;
            this.G = this.c.getImeOptions();
            this.c.setImeOptions(this.G | 33554432);
            this.c.setText("");
            setIconified(false);
        }
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = c();
        return savedState;
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            a(savedState.a);
            requestLayout();
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    private void setQuery(CharSequence charSequence) {
        this.c.setText(charSequence);
        this.c.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    private void a(int i, String str, String str2) {
        getContext().startActivity(a("android.intent.action.SEARCH", null, null, str2, i, str));
    }

    private Intent a(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(DriveFile.MODE_READ_ONLY);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.E);
        if (str3 != null) {
            intent.putExtra(SearchIntents.EXTRA_QUERY, str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        if (this.I != null) {
            intent.putExtra("app_data", this.I);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        if (b) {
            intent.setComponent(this.H.getSearchActivity());
        }
        return intent;
    }

    private void q() {
        a.a(this.c);
        a.b(this.c);
    }

    static boolean a(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }
}
