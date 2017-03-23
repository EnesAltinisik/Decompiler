package com.google.android.gms.internal;

import a.a.a.a.a.d.b;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class zzamk {
    private static void zza(String str, Object obj, StringBuffer stringBuffer, StringBuffer stringBuffer2) throws IllegalAccessException, InvocationTargetException {
        if (obj != null) {
            if (obj instanceof zzamj) {
                int modifiers;
                String name;
                int length = stringBuffer.length();
                if (str != null) {
                    stringBuffer2.append(stringBuffer).append(zzja(str)).append(" <\n");
                    stringBuffer.append("  ");
                }
                Class cls = obj.getClass();
                for (Field field : cls.getFields()) {
                    modifiers = field.getModifiers();
                    name = field.getName();
                    if (!("cachedSize".equals(name) || (modifiers & 1) != 1 || (modifiers & 8) == 8 || name.startsWith(b.ROLL_OVER_FILE_NAME_SEPARATOR) || name.endsWith(b.ROLL_OVER_FILE_NAME_SEPARATOR))) {
                        Class type = field.getType();
                        Object obj2 = field.get(obj);
                        if (!type.isArray()) {
                            zza(name, obj2, stringBuffer, stringBuffer2);
                        } else if (type.getComponentType() == Byte.TYPE) {
                            zza(name, obj2, stringBuffer, stringBuffer2);
                        } else {
                            int length2 = obj2 == null ? 0 : Array.getLength(obj2);
                            for (modifiers = 0; modifiers < length2; modifiers++) {
                                zza(name, Array.get(obj2, modifiers), stringBuffer, stringBuffer2);
                            }
                        }
                    }
                }
                for (Method name2 : cls.getMethods()) {
                    String name3 = name2.getName();
                    if (name3.startsWith("set")) {
                        String substring = name3.substring(3);
                        try {
                            name = "has";
                            name3 = String.valueOf(substring);
                            if (((Boolean) cls.getMethod(name3.length() != 0 ? name.concat(name3) : new String(name), new Class[0]).invoke(obj, new Object[0])).booleanValue()) {
                                try {
                                    name = "get";
                                    name3 = String.valueOf(substring);
                                    zza(substring, cls.getMethod(name3.length() != 0 ? name.concat(name3) : new String(name), new Class[0]).invoke(obj, new Object[0]), stringBuffer, stringBuffer2);
                                } catch (NoSuchMethodException e) {
                                }
                            }
                        } catch (NoSuchMethodException e2) {
                        }
                    }
                }
                if (str != null) {
                    stringBuffer.setLength(length);
                    stringBuffer2.append(stringBuffer).append(">\n");
                    return;
                }
                return;
            }
            stringBuffer2.append(stringBuffer).append(zzja(str)).append(": ");
            if (obj instanceof String) {
                stringBuffer2.append("\"").append(zzcw((String) obj)).append("\"");
            } else if (obj instanceof byte[]) {
                zza((byte[]) obj, stringBuffer2);
            } else {
                stringBuffer2.append(obj);
            }
            stringBuffer2.append("\n");
        }
    }

    private static void zza(byte[] bArr, StringBuffer stringBuffer) {
        if (bArr == null) {
            stringBuffer.append("\"\"");
            return;
        }
        stringBuffer.append('\"');
        for (byte b : bArr) {
            int i = b & 255;
            if (i == 92 || i == 34) {
                stringBuffer.append('\\').append((char) i);
            } else if (i < 32 || i >= 127) {
                stringBuffer.append(String.format("\\%03o", new Object[]{Integer.valueOf(i)}));
            } else {
                stringBuffer.append((char) i);
            }
        }
        stringBuffer.append('\"');
    }

    private static String zzcw(String str) {
        if (!str.startsWith("http") && str.length() > 200) {
            str = String.valueOf(str.substring(0, 200)).concat("[...]");
        }
        return zzdu(str);
    }

    private static String zzdu(String str) {
        int length = str.length();
        StringBuilder stringBuilder = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt < ' ' || charAt > '~' || charAt == '\"' || charAt == '\'') {
                stringBuilder.append(String.format("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
            } else {
                stringBuilder.append(charAt);
            }
        }
        return stringBuilder.toString();
    }

    public static <T extends zzamj> String zzf(T t) {
        String str;
        String valueOf;
        if (t == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            zza(null, t, new StringBuffer(), stringBuffer);
            return stringBuffer.toString();
        } catch (IllegalAccessException e) {
            str = "Error printing proto: ";
            valueOf = String.valueOf(e.getMessage());
            return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
        } catch (InvocationTargetException e2) {
            str = "Error printing proto: ";
            valueOf = String.valueOf(e2.getMessage());
            return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
        }
    }

    private static String zzja(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (i == 0) {
                stringBuffer.append(Character.toLowerCase(charAt));
            } else if (Character.isUpperCase(charAt)) {
                stringBuffer.append('_').append(Character.toLowerCase(charAt));
            } else {
                stringBuffer.append(charAt);
            }
        }
        return stringBuffer.toString();
    }
}
