package butterknife;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.util.Log;
import android.util.Property;
import android.view.View;
import butterknife.internal.ButterKnifeProcessor;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class ButterKnife {
    static final Map<Class<?>, Injector<Object>> INJECTORS = new LinkedHashMap();
    static final Injector<Object> NOP_INJECTOR = new Injector<Object>() {
        public void inject(Finder finder, Object obj, Object obj2) {
        }

        public void reset(Object obj) {
        }
    };
    private static final String TAG = "ButterKnife";
    private static boolean debug = false;

    public interface Injector<T> {
        void inject(Finder finder, T t, Object obj);

        void reset(T t);
    }

    public interface Action<T extends View> {
        void apply(T t, int i);
    }

    public enum Finder {
        VIEW {
            protected View findView(Object obj, int i) {
                return ((View) obj).findViewById(i);
            }

            protected Context getContext(Object obj) {
                return ((View) obj).getContext();
            }
        },
        ACTIVITY {
            protected View findView(Object obj, int i) {
                return ((Activity) obj).findViewById(i);
            }

            protected Context getContext(Object obj) {
                return (Activity) obj;
            }
        },
        DIALOG {
            protected View findView(Object obj, int i) {
                return ((Dialog) obj).findViewById(i);
            }

            protected Context getContext(Object obj) {
                return ((Dialog) obj).getContext();
            }
        };

        protected abstract View findView(Object obj, int i);

        protected abstract Context getContext(Object obj);

        public static <T> T[] arrayOf(T... tArr) {
            return tArr;
        }

        public static <T> List<T> listOf(T... tArr) {
            return new ImmutableList(tArr);
        }

        public <T> T findRequiredView(Object obj, int i, String str) {
            T findOptionalView = findOptionalView(obj, i, str);
            if (findOptionalView != null) {
                return findOptionalView;
            }
            throw new IllegalStateException("Required view '" + getContext(obj).getResources().getResourceEntryName(i) + "' with ID " + i + " for " + str + " was not found. If this view is optional add '@Optional' annotation.");
        }

        public <T> T findOptionalView(Object obj, int i, String str) {
            return castView(findView(obj, i), i, str);
        }

        public <T> T castView(View view, int i, String str) {
            return view;
        }

        public <T> T castParam(Object obj, String str, int i, String str2, int i2) {
            return obj;
        }
    }

    public interface Setter<T extends View, V> {
        void set(T t, V v, int i);
    }

    private ButterKnife() {
        throw new AssertionError("No instances.");
    }

    public static void setDebug(boolean z) {
        debug = z;
    }

    public static void inject(Activity activity) {
        inject(activity, activity, Finder.ACTIVITY);
    }

    public static void inject(View view) {
        inject(view, view, Finder.VIEW);
    }

    public static void inject(Dialog dialog) {
        inject(dialog, dialog, Finder.DIALOG);
    }

    public static void inject(Object obj, Activity activity) {
        inject(obj, activity, Finder.ACTIVITY);
    }

    public static void inject(Object obj, View view) {
        inject(obj, view, Finder.VIEW);
    }

    public static void inject(Object obj, Dialog dialog) {
        inject(obj, dialog, Finder.DIALOG);
    }

    public static void reset(Object obj) {
        Class cls = obj.getClass();
        try {
            if (debug) {
                Log.d(TAG, "Looking up view injector for " + cls.getName());
            }
            Injector findInjectorForClass = findInjectorForClass(cls);
            if (findInjectorForClass != null) {
                findInjectorForClass.reset(obj);
            }
        } catch (RuntimeException e) {
            throw e;
        } catch (Throwable e2) {
            throw new RuntimeException("Unable to reset views for " + obj, e2);
        }
    }

    static void inject(Object obj, Object obj2, Finder finder) {
        Class cls = obj.getClass();
        try {
            if (debug) {
                Log.d(TAG, "Looking up view injector for " + cls.getName());
            }
            Injector findInjectorForClass = findInjectorForClass(cls);
            if (findInjectorForClass != null) {
                findInjectorForClass.inject(finder, obj, obj2);
            }
        } catch (RuntimeException e) {
            throw e;
        } catch (Throwable e2) {
            throw new RuntimeException("Unable to inject views for " + obj, e2);
        }
    }

    private static Injector<Object> findInjectorForClass(Class<?> cls) throws IllegalAccessException, InstantiationException {
        Injector<Object> injector = (Injector) INJECTORS.get(cls);
        if (injector == null) {
            String name = cls.getName();
            if (name.startsWith(ButterKnifeProcessor.ANDROID_PREFIX) || name.startsWith(ButterKnifeProcessor.JAVA_PREFIX)) {
                if (debug) {
                    Log.d(TAG, "MISS: Reached framework class. Abandoning search.");
                }
                return NOP_INJECTOR;
            }
            try {
                injector = (Injector) Class.forName(name + ButterKnifeProcessor.SUFFIX).newInstance();
                if (debug) {
                    Log.d(TAG, "HIT: Class loaded injection class.");
                }
            } catch (ClassNotFoundException e) {
                if (debug) {
                    Log.d(TAG, "Not found. Trying superclass " + cls.getSuperclass().getName());
                }
                injector = findInjectorForClass(cls.getSuperclass());
            }
            INJECTORS.put(cls, injector);
            return injector;
        } else if (!debug) {
            return injector;
        } else {
            Log.d(TAG, "HIT: Cached in injector map.");
            return injector;
        }
    }

    public static <T extends View> void apply(List<T> list, Action<? super T> action) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            action.apply((View) list.get(i), i);
        }
    }

    public static <T extends View, V> void apply(List<T> list, Setter<? super T, V> setter, V v) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            setter.set((View) list.get(i), v, i);
        }
    }

    @TargetApi(14)
    public static <T extends View, V> void apply(List<T> list, Property<? super T, V> property, V v) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            property.set(list.get(i), v);
        }
    }

    public static <T extends View> T findById(View view, int i) {
        return view.findViewById(i);
    }

    public static <T extends View> T findById(Activity activity, int i) {
        return activity.findViewById(i);
    }

    public static <T extends View> T findById(Dialog dialog, int i) {
        return dialog.findViewById(i);
    }
}
