package com.google.android.gms.b;

import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

@vz
public class nd {
    private final mx a;
    private final int b;
    private String c;
    private String d;
    private final boolean e = false;
    private final int f;
    private final int g;

    public class a implements Comparator<mw> {
        public a(nd ndVar) {
        }

        public int a(mw mwVar, mw mwVar2) {
            if (mwVar.b() < mwVar2.b()) {
                return -1;
            }
            if (mwVar.b() > mwVar2.b()) {
                return 1;
            }
            if (mwVar.a() < mwVar2.a()) {
                return -1;
            }
            if (mwVar.a() > mwVar2.a()) {
                return 1;
            }
            float d = (mwVar.d() - mwVar.b()) * (mwVar.c() - mwVar.a());
            float d2 = (mwVar2.d() - mwVar2.b()) * (mwVar2.c() - mwVar2.a());
            return d <= d2 ? d < d2 ? 1 : 0 : -1;
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return a((mw) obj, (mw) obj2);
        }
    }

    public nd(int i, int i2, int i3) {
        this.b = i;
        if (i2 > 64 || i2 < 0) {
            this.f = 64;
        } else {
            this.f = i2;
        }
        if (i3 < 1) {
            this.g = 1;
        } else {
            this.g = i3;
        }
        this.a = new nc(this.f);
    }

    String a(String str, char c) {
        StringBuilder stringBuilder = new StringBuilder(str);
        Object obj = null;
        int i = 1;
        while (i + 2 <= stringBuilder.length()) {
            if (stringBuilder.charAt(i) == '\'') {
                if (stringBuilder.charAt(i - 1) == c || !((stringBuilder.charAt(i + 1) == 's' || stringBuilder.charAt(i + 1) == 'S') && (i + 2 == stringBuilder.length() || stringBuilder.charAt(i + 2) == c))) {
                    stringBuilder.setCharAt(i, c);
                } else {
                    stringBuilder.insert(i, c);
                    i += 2;
                }
                obj = 1;
            }
            i++;
        }
        return obj != null ? stringBuilder.toString() : null;
    }

    public String a(ArrayList<String> arrayList, ArrayList<mw> arrayList2) {
        Collections.sort(arrayList2, new a(this));
        HashSet hashSet = new HashSet();
        int i = 0;
        while (i < arrayList2.size() && a(Normalizer.normalize((CharSequence) arrayList.get(((mw) arrayList2.get(i)).e()), Form.NFKC).toLowerCase(Locale.US), hashSet)) {
            i++;
        }
        a aVar = new a();
        this.c = "";
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                aVar.a(this.a.a((String) it.next()));
            } catch (Throwable e) {
                zy.b("Error while writing hash to byteStream", e);
            }
        }
        return aVar.toString();
    }

    boolean a(String str, HashSet<String> hashSet) {
        String[] split = str.split("\n");
        if (split.length == 0) {
            return true;
        }
        for (String str2 : split) {
            String str22;
            String a;
            String[] a2;
            int i;
            Object obj;
            int i2;
            boolean z;
            if (str22.indexOf("'") != -1) {
                a = a(str22, ' ');
                if (a != null) {
                    this.d = a;
                    a2 = mz.a(a, true);
                    if (a2.length < this.g) {
                        for (i = 0; i < a2.length; i++) {
                            obj = "";
                            for (i2 = 0; i2 < this.g; i2++) {
                                if (i + i2 >= a2.length) {
                                    z = false;
                                    break;
                                }
                                if (i2 > 0) {
                                    obj = String.valueOf(obj).concat(" ");
                                }
                                String valueOf = String.valueOf(obj);
                                str22 = String.valueOf(a2[i + i2]);
                                obj = str22.length() == 0 ? valueOf.concat(str22) : new String(valueOf);
                            }
                            z = true;
                            if (!z) {
                                break;
                            }
                            hashSet.add(obj);
                            if (hashSet.size() < this.b) {
                                return false;
                            }
                        }
                        if (hashSet.size() >= this.b) {
                            return false;
                        }
                    }
                }
            }
            a = str22;
            a2 = mz.a(a, true);
            if (a2.length < this.g) {
                for (i = 0; i < a2.length; i++) {
                    obj = "";
                    for (i2 = 0; i2 < this.g; i2++) {
                        if (i + i2 >= a2.length) {
                            z = false;
                            break;
                        }
                        if (i2 > 0) {
                            obj = String.valueOf(obj).concat(" ");
                        }
                        String valueOf2 = String.valueOf(obj);
                        str22 = String.valueOf(a2[i + i2]);
                        if (str22.length() == 0) {
                        }
                    }
                    z = true;
                    if (!z) {
                        break;
                    }
                    hashSet.add(obj);
                    if (hashSet.size() < this.b) {
                        return false;
                    }
                }
                if (hashSet.size() >= this.b) {
                    return false;
                }
            }
        }
        return true;
    }
}
