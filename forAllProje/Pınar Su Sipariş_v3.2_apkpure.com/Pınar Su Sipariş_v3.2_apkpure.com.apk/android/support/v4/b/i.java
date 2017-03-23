package android.support.v4.b;

import android.content.SharedPreferences.Editor;

/* compiled from: EditorCompatGingerbread */
class i {
    public static void a(Editor editor) {
        try {
            editor.apply();
        } catch (AbstractMethodError e) {
            editor.commit();
        }
    }
}
