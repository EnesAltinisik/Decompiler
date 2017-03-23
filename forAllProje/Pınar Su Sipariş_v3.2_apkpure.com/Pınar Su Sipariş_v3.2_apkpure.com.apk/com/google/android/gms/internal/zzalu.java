package com.google.android.gms.internal;

import a.a.a.a.a.d.b;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.sql.Timestamp;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;
import java.util.UUID;

public final class zzalu {
    public static final zzakr<String> zzbYA = new zzakr<String>() {
        public String a(zzalw com_google_android_gms_internal_zzalw) throws IOException {
            zzalx zzWa = com_google_android_gms_internal_zzalw.zzWa();
            if (zzWa != zzalx.NULL) {
                return zzWa == zzalx.BOOLEAN ? Boolean.toString(com_google_android_gms_internal_zzalw.nextBoolean()) : com_google_android_gms_internal_zzalw.nextString();
            } else {
                com_google_android_gms_internal_zzalw.nextNull();
                return null;
            }
        }

        public void a(zzaly com_google_android_gms_internal_zzaly, String str) throws IOException {
            com_google_android_gms_internal_zzaly.zziU(str);
        }

        public /* synthetic */ void zza(zzaly com_google_android_gms_internal_zzaly, Object obj) throws IOException {
            a(com_google_android_gms_internal_zzaly, (String) obj);
        }

        public /* synthetic */ Object zzb(zzalw com_google_android_gms_internal_zzalw) throws IOException {
            return a(com_google_android_gms_internal_zzalw);
        }
    };
    public static final zzakr<BigDecimal> zzbYB = new zzakr<BigDecimal>() {
        public BigDecimal a(zzalw com_google_android_gms_internal_zzalw) throws IOException {
            if (com_google_android_gms_internal_zzalw.zzWa() == zzalx.NULL) {
                com_google_android_gms_internal_zzalw.nextNull();
                return null;
            }
            try {
                return new BigDecimal(com_google_android_gms_internal_zzalw.nextString());
            } catch (Throwable e) {
                throw new zzako(e);
            }
        }

        public void a(zzaly com_google_android_gms_internal_zzaly, BigDecimal bigDecimal) throws IOException {
            com_google_android_gms_internal_zzaly.zza(bigDecimal);
        }

        public /* synthetic */ void zza(zzaly com_google_android_gms_internal_zzaly, Object obj) throws IOException {
            a(com_google_android_gms_internal_zzaly, (BigDecimal) obj);
        }

        public /* synthetic */ Object zzb(zzalw com_google_android_gms_internal_zzalw) throws IOException {
            return a(com_google_android_gms_internal_zzalw);
        }
    };
    public static final zzakr<BigInteger> zzbYC = new zzakr<BigInteger>() {
        public BigInteger a(zzalw com_google_android_gms_internal_zzalw) throws IOException {
            if (com_google_android_gms_internal_zzalw.zzWa() == zzalx.NULL) {
                com_google_android_gms_internal_zzalw.nextNull();
                return null;
            }
            try {
                return new BigInteger(com_google_android_gms_internal_zzalw.nextString());
            } catch (Throwable e) {
                throw new zzako(e);
            }
        }

        public void a(zzaly com_google_android_gms_internal_zzaly, BigInteger bigInteger) throws IOException {
            com_google_android_gms_internal_zzaly.zza(bigInteger);
        }

        public /* synthetic */ void zza(zzaly com_google_android_gms_internal_zzaly, Object obj) throws IOException {
            a(com_google_android_gms_internal_zzaly, (BigInteger) obj);
        }

        public /* synthetic */ Object zzb(zzalw com_google_android_gms_internal_zzalw) throws IOException {
            return a(com_google_android_gms_internal_zzalw);
        }
    };
    public static final zzaks zzbYD = zza(String.class, zzbYA);
    public static final zzakr<StringBuilder> zzbYE = new zzakr<StringBuilder>() {
        public StringBuilder a(zzalw com_google_android_gms_internal_zzalw) throws IOException {
            if (com_google_android_gms_internal_zzalw.zzWa() != zzalx.NULL) {
                return new StringBuilder(com_google_android_gms_internal_zzalw.nextString());
            }
            com_google_android_gms_internal_zzalw.nextNull();
            return null;
        }

        public void a(zzaly com_google_android_gms_internal_zzaly, StringBuilder stringBuilder) throws IOException {
            com_google_android_gms_internal_zzaly.zziU(stringBuilder == null ? null : stringBuilder.toString());
        }

        public /* synthetic */ void zza(zzaly com_google_android_gms_internal_zzaly, Object obj) throws IOException {
            a(com_google_android_gms_internal_zzaly, (StringBuilder) obj);
        }

        public /* synthetic */ Object zzb(zzalw com_google_android_gms_internal_zzalw) throws IOException {
            return a(com_google_android_gms_internal_zzalw);
        }
    };
    public static final zzaks zzbYF = zza(StringBuilder.class, zzbYE);
    public static final zzakr<StringBuffer> zzbYG = new zzakr<StringBuffer>() {
        public StringBuffer a(zzalw com_google_android_gms_internal_zzalw) throws IOException {
            if (com_google_android_gms_internal_zzalw.zzWa() != zzalx.NULL) {
                return new StringBuffer(com_google_android_gms_internal_zzalw.nextString());
            }
            com_google_android_gms_internal_zzalw.nextNull();
            return null;
        }

        public void a(zzaly com_google_android_gms_internal_zzaly, StringBuffer stringBuffer) throws IOException {
            com_google_android_gms_internal_zzaly.zziU(stringBuffer == null ? null : stringBuffer.toString());
        }

        public /* synthetic */ void zza(zzaly com_google_android_gms_internal_zzaly, Object obj) throws IOException {
            a(com_google_android_gms_internal_zzaly, (StringBuffer) obj);
        }

        public /* synthetic */ Object zzb(zzalw com_google_android_gms_internal_zzalw) throws IOException {
            return a(com_google_android_gms_internal_zzalw);
        }
    };
    public static final zzaks zzbYH = zza(StringBuffer.class, zzbYG);
    public static final zzakr<URL> zzbYI = new zzakr<URL>() {
        public URL a(zzalw com_google_android_gms_internal_zzalw) throws IOException {
            if (com_google_android_gms_internal_zzalw.zzWa() == zzalx.NULL) {
                com_google_android_gms_internal_zzalw.nextNull();
                return null;
            }
            String nextString = com_google_android_gms_internal_zzalw.nextString();
            return !"null".equals(nextString) ? new URL(nextString) : null;
        }

        public void a(zzaly com_google_android_gms_internal_zzaly, URL url) throws IOException {
            com_google_android_gms_internal_zzaly.zziU(url == null ? null : url.toExternalForm());
        }

        public /* synthetic */ void zza(zzaly com_google_android_gms_internal_zzaly, Object obj) throws IOException {
            a(com_google_android_gms_internal_zzaly, (URL) obj);
        }

        public /* synthetic */ Object zzb(zzalw com_google_android_gms_internal_zzalw) throws IOException {
            return a(com_google_android_gms_internal_zzalw);
        }
    };
    public static final zzaks zzbYJ = zza(URL.class, zzbYI);
    public static final zzakr<URI> zzbYK = new zzakr<URI>() {
        public URI a(zzalw com_google_android_gms_internal_zzalw) throws IOException {
            URI uri = null;
            if (com_google_android_gms_internal_zzalw.zzWa() == zzalx.NULL) {
                com_google_android_gms_internal_zzalw.nextNull();
            } else {
                try {
                    String nextString = com_google_android_gms_internal_zzalw.nextString();
                    if (!"null".equals(nextString)) {
                        uri = new URI(nextString);
                    }
                } catch (Throwable e) {
                    throw new zzakg(e);
                }
            }
            return uri;
        }

        public void a(zzaly com_google_android_gms_internal_zzaly, URI uri) throws IOException {
            com_google_android_gms_internal_zzaly.zziU(uri == null ? null : uri.toASCIIString());
        }

        public /* synthetic */ void zza(zzaly com_google_android_gms_internal_zzaly, Object obj) throws IOException {
            a(com_google_android_gms_internal_zzaly, (URI) obj);
        }

        public /* synthetic */ Object zzb(zzalw com_google_android_gms_internal_zzalw) throws IOException {
            return a(com_google_android_gms_internal_zzalw);
        }
    };
    public static final zzaks zzbYL = zza(URI.class, zzbYK);
    public static final zzakr<InetAddress> zzbYM = new zzakr<InetAddress>() {
        public InetAddress a(zzalw com_google_android_gms_internal_zzalw) throws IOException {
            if (com_google_android_gms_internal_zzalw.zzWa() != zzalx.NULL) {
                return InetAddress.getByName(com_google_android_gms_internal_zzalw.nextString());
            }
            com_google_android_gms_internal_zzalw.nextNull();
            return null;
        }

        public void a(zzaly com_google_android_gms_internal_zzaly, InetAddress inetAddress) throws IOException {
            com_google_android_gms_internal_zzaly.zziU(inetAddress == null ? null : inetAddress.getHostAddress());
        }

        public /* synthetic */ void zza(zzaly com_google_android_gms_internal_zzaly, Object obj) throws IOException {
            a(com_google_android_gms_internal_zzaly, (InetAddress) obj);
        }

        public /* synthetic */ Object zzb(zzalw com_google_android_gms_internal_zzalw) throws IOException {
            return a(com_google_android_gms_internal_zzalw);
        }
    };
    public static final zzaks zzbYN = zzb(InetAddress.class, zzbYM);
    public static final zzakr<UUID> zzbYO = new zzakr<UUID>() {
        public UUID a(zzalw com_google_android_gms_internal_zzalw) throws IOException {
            if (com_google_android_gms_internal_zzalw.zzWa() != zzalx.NULL) {
                return UUID.fromString(com_google_android_gms_internal_zzalw.nextString());
            }
            com_google_android_gms_internal_zzalw.nextNull();
            return null;
        }

        public void a(zzaly com_google_android_gms_internal_zzaly, UUID uuid) throws IOException {
            com_google_android_gms_internal_zzaly.zziU(uuid == null ? null : uuid.toString());
        }

        public /* synthetic */ void zza(zzaly com_google_android_gms_internal_zzaly, Object obj) throws IOException {
            a(com_google_android_gms_internal_zzaly, (UUID) obj);
        }

        public /* synthetic */ Object zzb(zzalw com_google_android_gms_internal_zzalw) throws IOException {
            return a(com_google_android_gms_internal_zzalw);
        }
    };
    public static final zzaks zzbYP = zza(UUID.class, zzbYO);
    public static final zzaks zzbYQ = new zzaks() {
        public <T> zzakr<T> zza(zzajz com_google_android_gms_internal_zzajz, zzalv<T> com_google_android_gms_internal_zzalv_T) {
            if (com_google_android_gms_internal_zzalv_T.zzWl() != Timestamp.class) {
                return null;
            }
            final zzakr zzk = com_google_android_gms_internal_zzajz.zzk(Date.class);
            return new zzakr<Timestamp>(this) {
                final /* synthetic */ AnonymousClass7 b;

                public Timestamp a(zzalw com_google_android_gms_internal_zzalw) throws IOException {
                    Date date = (Date) zzk.zzb(com_google_android_gms_internal_zzalw);
                    return date != null ? new Timestamp(date.getTime()) : null;
                }

                public void a(zzaly com_google_android_gms_internal_zzaly, Timestamp timestamp) throws IOException {
                    zzk.zza(com_google_android_gms_internal_zzaly, timestamp);
                }

                public /* synthetic */ void zza(zzaly com_google_android_gms_internal_zzaly, Object obj) throws IOException {
                    a(com_google_android_gms_internal_zzaly, (Timestamp) obj);
                }

                public /* synthetic */ Object zzb(zzalw com_google_android_gms_internal_zzalw) throws IOException {
                    return a(com_google_android_gms_internal_zzalw);
                }
            };
        }
    };
    public static final zzakr<Calendar> zzbYR = new zzakr<Calendar>() {
        public Calendar a(zzalw com_google_android_gms_internal_zzalw) throws IOException {
            int i = 0;
            if (com_google_android_gms_internal_zzalw.zzWa() == zzalx.NULL) {
                com_google_android_gms_internal_zzalw.nextNull();
                return null;
            }
            com_google_android_gms_internal_zzalw.beginObject();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (com_google_android_gms_internal_zzalw.zzWa() != zzalx.END_OBJECT) {
                String nextName = com_google_android_gms_internal_zzalw.nextName();
                int nextInt = com_google_android_gms_internal_zzalw.nextInt();
                if ("year".equals(nextName)) {
                    i6 = nextInt;
                } else if ("month".equals(nextName)) {
                    i5 = nextInt;
                } else if ("dayOfMonth".equals(nextName)) {
                    i4 = nextInt;
                } else if ("hourOfDay".equals(nextName)) {
                    i3 = nextInt;
                } else if ("minute".equals(nextName)) {
                    i2 = nextInt;
                } else if ("second".equals(nextName)) {
                    i = nextInt;
                }
            }
            com_google_android_gms_internal_zzalw.endObject();
            return new GregorianCalendar(i6, i5, i4, i3, i2, i);
        }

        public void a(zzaly com_google_android_gms_internal_zzaly, Calendar calendar) throws IOException {
            if (calendar == null) {
                com_google_android_gms_internal_zzaly.zzWk();
                return;
            }
            com_google_android_gms_internal_zzaly.zzWi();
            com_google_android_gms_internal_zzaly.zziT("year");
            com_google_android_gms_internal_zzaly.zzaN((long) calendar.get(1));
            com_google_android_gms_internal_zzaly.zziT("month");
            com_google_android_gms_internal_zzaly.zzaN((long) calendar.get(2));
            com_google_android_gms_internal_zzaly.zziT("dayOfMonth");
            com_google_android_gms_internal_zzaly.zzaN((long) calendar.get(5));
            com_google_android_gms_internal_zzaly.zziT("hourOfDay");
            com_google_android_gms_internal_zzaly.zzaN((long) calendar.get(11));
            com_google_android_gms_internal_zzaly.zziT("minute");
            com_google_android_gms_internal_zzaly.zzaN((long) calendar.get(12));
            com_google_android_gms_internal_zzaly.zziT("second");
            com_google_android_gms_internal_zzaly.zzaN((long) calendar.get(13));
            com_google_android_gms_internal_zzaly.zzWj();
        }

        public /* synthetic */ void zza(zzaly com_google_android_gms_internal_zzaly, Object obj) throws IOException {
            a(com_google_android_gms_internal_zzaly, (Calendar) obj);
        }

        public /* synthetic */ Object zzb(zzalw com_google_android_gms_internal_zzalw) throws IOException {
            return a(com_google_android_gms_internal_zzalw);
        }
    };
    public static final zzaks zzbYS = zzb(Calendar.class, GregorianCalendar.class, zzbYR);
    public static final zzakr<Locale> zzbYT = new zzakr<Locale>() {
        public Locale a(zzalw com_google_android_gms_internal_zzalw) throws IOException {
            if (com_google_android_gms_internal_zzalw.zzWa() == zzalx.NULL) {
                com_google_android_gms_internal_zzalw.nextNull();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(com_google_android_gms_internal_zzalw.nextString(), b.ROLL_OVER_FILE_NAME_SEPARATOR);
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            return (nextToken2 == null && nextToken3 == null) ? new Locale(nextToken) : nextToken3 == null ? new Locale(nextToken, nextToken2) : new Locale(nextToken, nextToken2, nextToken3);
        }

        public void a(zzaly com_google_android_gms_internal_zzaly, Locale locale) throws IOException {
            com_google_android_gms_internal_zzaly.zziU(locale == null ? null : locale.toString());
        }

        public /* synthetic */ void zza(zzaly com_google_android_gms_internal_zzaly, Object obj) throws IOException {
            a(com_google_android_gms_internal_zzaly, (Locale) obj);
        }

        public /* synthetic */ Object zzb(zzalw com_google_android_gms_internal_zzalw) throws IOException {
            return a(com_google_android_gms_internal_zzalw);
        }
    };
    public static final zzaks zzbYU = zza(Locale.class, zzbYT);
    public static final zzakr<zzakf> zzbYV = new zzakr<zzakf>() {
        public zzakf a(zzalw com_google_android_gms_internal_zzalw) throws IOException {
            zzakf com_google_android_gms_internal_zzakc;
            switch (com_google_android_gms_internal_zzalw.zzWa()) {
                case NUMBER:
                    return new zzakl(new zzalc(com_google_android_gms_internal_zzalw.nextString()));
                case BOOLEAN:
                    return new zzakl(Boolean.valueOf(com_google_android_gms_internal_zzalw.nextBoolean()));
                case STRING:
                    return new zzakl(com_google_android_gms_internal_zzalw.nextString());
                case NULL:
                    com_google_android_gms_internal_zzalw.nextNull();
                    return zzakh.zzbWr;
                case BEGIN_ARRAY:
                    com_google_android_gms_internal_zzakc = new zzakc();
                    com_google_android_gms_internal_zzalw.beginArray();
                    while (com_google_android_gms_internal_zzalw.hasNext()) {
                        com_google_android_gms_internal_zzakc.zzc((zzakf) zzb(com_google_android_gms_internal_zzalw));
                    }
                    com_google_android_gms_internal_zzalw.endArray();
                    return com_google_android_gms_internal_zzakc;
                case BEGIN_OBJECT:
                    com_google_android_gms_internal_zzakc = new zzaki();
                    com_google_android_gms_internal_zzalw.beginObject();
                    while (com_google_android_gms_internal_zzalw.hasNext()) {
                        com_google_android_gms_internal_zzakc.zza(com_google_android_gms_internal_zzalw.nextName(), (zzakf) zzb(com_google_android_gms_internal_zzalw));
                    }
                    com_google_android_gms_internal_zzalw.endObject();
                    return com_google_android_gms_internal_zzakc;
                default:
                    throw new IllegalArgumentException();
            }
        }

        public void a(zzaly com_google_android_gms_internal_zzaly, zzakf com_google_android_gms_internal_zzakf) throws IOException {
            if (com_google_android_gms_internal_zzakf == null || com_google_android_gms_internal_zzakf.zzVI()) {
                com_google_android_gms_internal_zzaly.zzWk();
            } else if (com_google_android_gms_internal_zzakf.zzVH()) {
                zzakl zzVL = com_google_android_gms_internal_zzakf.zzVL();
                if (zzVL.zzVO()) {
                    com_google_android_gms_internal_zzaly.zza(zzVL.zzVz());
                } else if (zzVL.zzVN()) {
                    com_google_android_gms_internal_zzaly.zzaX(zzVL.zzVE());
                } else {
                    com_google_android_gms_internal_zzaly.zziU(zzVL.zzVA());
                }
            } else if (com_google_android_gms_internal_zzakf.zzVF()) {
                com_google_android_gms_internal_zzaly.zzWg();
                Iterator it = com_google_android_gms_internal_zzakf.zzVK().iterator();
                while (it.hasNext()) {
                    a(com_google_android_gms_internal_zzaly, (zzakf) it.next());
                }
                com_google_android_gms_internal_zzaly.zzWh();
            } else if (com_google_android_gms_internal_zzakf.zzVG()) {
                com_google_android_gms_internal_zzaly.zzWi();
                for (Entry entry : com_google_android_gms_internal_zzakf.zzVJ().entrySet()) {
                    com_google_android_gms_internal_zzaly.zziT((String) entry.getKey());
                    a(com_google_android_gms_internal_zzaly, (zzakf) entry.getValue());
                }
                com_google_android_gms_internal_zzaly.zzWj();
            } else {
                String valueOf = String.valueOf(com_google_android_gms_internal_zzakf.getClass());
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 15).append("Couldn't write ").append(valueOf).toString());
            }
        }

        public /* synthetic */ void zza(zzaly com_google_android_gms_internal_zzaly, Object obj) throws IOException {
            a(com_google_android_gms_internal_zzaly, (zzakf) obj);
        }

        public /* synthetic */ Object zzb(zzalw com_google_android_gms_internal_zzalw) throws IOException {
            return a(com_google_android_gms_internal_zzalw);
        }
    };
    public static final zzaks zzbYW = zzb(zzakf.class, zzbYV);
    public static final zzaks zzbYX = new zzaks() {
        public <T> zzakr<T> zza(zzajz com_google_android_gms_internal_zzajz, zzalv<T> com_google_android_gms_internal_zzalv_T) {
            Class zzWl = com_google_android_gms_internal_zzalv_T.zzWl();
            if (!Enum.class.isAssignableFrom(zzWl) || zzWl == Enum.class) {
                return null;
            }
            if (!zzWl.isEnum()) {
                zzWl = zzWl.getSuperclass();
            }
            return new a(zzWl);
        }
    };
    public static final zzakr<Class> zzbYg = new zzakr<Class>() {
        public Class a(zzalw com_google_android_gms_internal_zzalw) throws IOException {
            if (com_google_android_gms_internal_zzalw.zzWa() == zzalx.NULL) {
                com_google_android_gms_internal_zzalw.nextNull();
                return null;
            }
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        public void a(zzaly com_google_android_gms_internal_zzaly, Class cls) throws IOException {
            if (cls == null) {
                com_google_android_gms_internal_zzaly.zzWk();
            } else {
                String valueOf = String.valueOf(cls.getName());
                throw new UnsupportedOperationException(new StringBuilder(String.valueOf(valueOf).length() + 76).append("Attempted to serialize java.lang.Class: ").append(valueOf).append(". Forgot to register a type adapter?").toString());
            }
        }

        public /* synthetic */ void zza(zzaly com_google_android_gms_internal_zzaly, Object obj) throws IOException {
            a(com_google_android_gms_internal_zzaly, (Class) obj);
        }

        public /* synthetic */ Object zzb(zzalw com_google_android_gms_internal_zzalw) throws IOException {
            return a(com_google_android_gms_internal_zzalw);
        }
    };
    public static final zzaks zzbYh = zza(Class.class, zzbYg);
    public static final zzakr<BitSet> zzbYi = new zzakr<BitSet>() {
        public BitSet a(zzalw com_google_android_gms_internal_zzalw) throws IOException {
            String valueOf;
            if (com_google_android_gms_internal_zzalw.zzWa() == zzalx.NULL) {
                com_google_android_gms_internal_zzalw.nextNull();
                return null;
            }
            BitSet bitSet = new BitSet();
            com_google_android_gms_internal_zzalw.beginArray();
            zzalx zzWa = com_google_android_gms_internal_zzalw.zzWa();
            int i = 0;
            while (zzWa != zzalx.END_ARRAY) {
                boolean z;
                switch (zzWa) {
                    case NUMBER:
                        if (com_google_android_gms_internal_zzalw.nextInt() == 0) {
                            z = false;
                            break;
                        }
                        z = true;
                        break;
                    case BOOLEAN:
                        z = com_google_android_gms_internal_zzalw.nextBoolean();
                        break;
                    case STRING:
                        Object nextString = com_google_android_gms_internal_zzalw.nextString();
                        try {
                            if (Integer.parseInt(nextString) == 0) {
                                z = false;
                                break;
                            }
                            z = true;
                            break;
                        } catch (NumberFormatException e) {
                            String str = "Error: Expecting: bitset number value (1, 0), Found: ";
                            valueOf = String.valueOf(nextString);
                            throw new zzako(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                        }
                    default:
                        valueOf = String.valueOf(zzWa);
                        throw new zzako(new StringBuilder(String.valueOf(valueOf).length() + 27).append("Invalid bitset value type: ").append(valueOf).toString());
                }
                if (z) {
                    bitSet.set(i);
                }
                i++;
                zzWa = com_google_android_gms_internal_zzalw.zzWa();
            }
            com_google_android_gms_internal_zzalw.endArray();
            return bitSet;
        }

        public void a(zzaly com_google_android_gms_internal_zzaly, BitSet bitSet) throws IOException {
            if (bitSet == null) {
                com_google_android_gms_internal_zzaly.zzWk();
                return;
            }
            com_google_android_gms_internal_zzaly.zzWg();
            for (int i = 0; i < bitSet.length(); i++) {
                com_google_android_gms_internal_zzaly.zzaN((long) (bitSet.get(i) ? 1 : 0));
            }
            com_google_android_gms_internal_zzaly.zzWh();
        }

        public /* synthetic */ void zza(zzaly com_google_android_gms_internal_zzaly, Object obj) throws IOException {
            a(com_google_android_gms_internal_zzaly, (BitSet) obj);
        }

        public /* synthetic */ Object zzb(zzalw com_google_android_gms_internal_zzalw) throws IOException {
            return a(com_google_android_gms_internal_zzalw);
        }
    };
    public static final zzaks zzbYj = zza(BitSet.class, zzbYi);
    public static final zzakr<Boolean> zzbYk = new zzakr<Boolean>() {
        public Boolean a(zzalw com_google_android_gms_internal_zzalw) throws IOException {
            if (com_google_android_gms_internal_zzalw.zzWa() != zzalx.NULL) {
                return com_google_android_gms_internal_zzalw.zzWa() == zzalx.STRING ? Boolean.valueOf(Boolean.parseBoolean(com_google_android_gms_internal_zzalw.nextString())) : Boolean.valueOf(com_google_android_gms_internal_zzalw.nextBoolean());
            } else {
                com_google_android_gms_internal_zzalw.nextNull();
                return null;
            }
        }

        public void a(zzaly com_google_android_gms_internal_zzaly, Boolean bool) throws IOException {
            if (bool == null) {
                com_google_android_gms_internal_zzaly.zzWk();
            } else {
                com_google_android_gms_internal_zzaly.zzaX(bool.booleanValue());
            }
        }

        public /* synthetic */ void zza(zzaly com_google_android_gms_internal_zzaly, Object obj) throws IOException {
            a(com_google_android_gms_internal_zzaly, (Boolean) obj);
        }

        public /* synthetic */ Object zzb(zzalw com_google_android_gms_internal_zzalw) throws IOException {
            return a(com_google_android_gms_internal_zzalw);
        }
    };
    public static final zzakr<Boolean> zzbYl = new zzakr<Boolean>() {
        public Boolean a(zzalw com_google_android_gms_internal_zzalw) throws IOException {
            if (com_google_android_gms_internal_zzalw.zzWa() != zzalx.NULL) {
                return Boolean.valueOf(com_google_android_gms_internal_zzalw.nextString());
            }
            com_google_android_gms_internal_zzalw.nextNull();
            return null;
        }

        public void a(zzaly com_google_android_gms_internal_zzaly, Boolean bool) throws IOException {
            com_google_android_gms_internal_zzaly.zziU(bool == null ? "null" : bool.toString());
        }

        public /* synthetic */ void zza(zzaly com_google_android_gms_internal_zzaly, Object obj) throws IOException {
            a(com_google_android_gms_internal_zzaly, (Boolean) obj);
        }

        public /* synthetic */ Object zzb(zzalw com_google_android_gms_internal_zzalw) throws IOException {
            return a(com_google_android_gms_internal_zzalw);
        }
    };
    public static final zzaks zzbYm = zza(Boolean.TYPE, Boolean.class, zzbYk);
    public static final zzakr<Number> zzbYn = new zzakr<Number>() {
        public Number a(zzalw com_google_android_gms_internal_zzalw) throws IOException {
            if (com_google_android_gms_internal_zzalw.zzWa() == zzalx.NULL) {
                com_google_android_gms_internal_zzalw.nextNull();
                return null;
            }
            try {
                return Byte.valueOf((byte) com_google_android_gms_internal_zzalw.nextInt());
            } catch (Throwable e) {
                throw new zzako(e);
            }
        }

        public void a(zzaly com_google_android_gms_internal_zzaly, Number number) throws IOException {
            com_google_android_gms_internal_zzaly.zza(number);
        }

        public /* synthetic */ void zza(zzaly com_google_android_gms_internal_zzaly, Object obj) throws IOException {
            a(com_google_android_gms_internal_zzaly, (Number) obj);
        }

        public /* synthetic */ Object zzb(zzalw com_google_android_gms_internal_zzalw) throws IOException {
            return a(com_google_android_gms_internal_zzalw);
        }
    };
    public static final zzaks zzbYo = zza(Byte.TYPE, Byte.class, zzbYn);
    public static final zzakr<Number> zzbYp = new zzakr<Number>() {
        public Number a(zzalw com_google_android_gms_internal_zzalw) throws IOException {
            if (com_google_android_gms_internal_zzalw.zzWa() == zzalx.NULL) {
                com_google_android_gms_internal_zzalw.nextNull();
                return null;
            }
            try {
                return Short.valueOf((short) com_google_android_gms_internal_zzalw.nextInt());
            } catch (Throwable e) {
                throw new zzako(e);
            }
        }

        public void a(zzaly com_google_android_gms_internal_zzaly, Number number) throws IOException {
            com_google_android_gms_internal_zzaly.zza(number);
        }

        public /* synthetic */ void zza(zzaly com_google_android_gms_internal_zzaly, Object obj) throws IOException {
            a(com_google_android_gms_internal_zzaly, (Number) obj);
        }

        public /* synthetic */ Object zzb(zzalw com_google_android_gms_internal_zzalw) throws IOException {
            return a(com_google_android_gms_internal_zzalw);
        }
    };
    public static final zzaks zzbYq = zza(Short.TYPE, Short.class, zzbYp);
    public static final zzakr<Number> zzbYr = new zzakr<Number>() {
        public Number a(zzalw com_google_android_gms_internal_zzalw) throws IOException {
            if (com_google_android_gms_internal_zzalw.zzWa() == zzalx.NULL) {
                com_google_android_gms_internal_zzalw.nextNull();
                return null;
            }
            try {
                return Integer.valueOf(com_google_android_gms_internal_zzalw.nextInt());
            } catch (Throwable e) {
                throw new zzako(e);
            }
        }

        public void a(zzaly com_google_android_gms_internal_zzaly, Number number) throws IOException {
            com_google_android_gms_internal_zzaly.zza(number);
        }

        public /* synthetic */ void zza(zzaly com_google_android_gms_internal_zzaly, Object obj) throws IOException {
            a(com_google_android_gms_internal_zzaly, (Number) obj);
        }

        public /* synthetic */ Object zzb(zzalw com_google_android_gms_internal_zzalw) throws IOException {
            return a(com_google_android_gms_internal_zzalw);
        }
    };
    public static final zzaks zzbYs = zza(Integer.TYPE, Integer.class, zzbYr);
    public static final zzakr<Number> zzbYt = new zzakr<Number>() {
        public Number a(zzalw com_google_android_gms_internal_zzalw) throws IOException {
            if (com_google_android_gms_internal_zzalw.zzWa() == zzalx.NULL) {
                com_google_android_gms_internal_zzalw.nextNull();
                return null;
            }
            try {
                return Long.valueOf(com_google_android_gms_internal_zzalw.nextLong());
            } catch (Throwable e) {
                throw new zzako(e);
            }
        }

        public void a(zzaly com_google_android_gms_internal_zzaly, Number number) throws IOException {
            com_google_android_gms_internal_zzaly.zza(number);
        }

        public /* synthetic */ void zza(zzaly com_google_android_gms_internal_zzaly, Object obj) throws IOException {
            a(com_google_android_gms_internal_zzaly, (Number) obj);
        }

        public /* synthetic */ Object zzb(zzalw com_google_android_gms_internal_zzalw) throws IOException {
            return a(com_google_android_gms_internal_zzalw);
        }
    };
    public static final zzakr<Number> zzbYu = new zzakr<Number>() {
        public Number a(zzalw com_google_android_gms_internal_zzalw) throws IOException {
            if (com_google_android_gms_internal_zzalw.zzWa() != zzalx.NULL) {
                return Float.valueOf((float) com_google_android_gms_internal_zzalw.nextDouble());
            }
            com_google_android_gms_internal_zzalw.nextNull();
            return null;
        }

        public void a(zzaly com_google_android_gms_internal_zzaly, Number number) throws IOException {
            com_google_android_gms_internal_zzaly.zza(number);
        }

        public /* synthetic */ void zza(zzaly com_google_android_gms_internal_zzaly, Object obj) throws IOException {
            a(com_google_android_gms_internal_zzaly, (Number) obj);
        }

        public /* synthetic */ Object zzb(zzalw com_google_android_gms_internal_zzalw) throws IOException {
            return a(com_google_android_gms_internal_zzalw);
        }
    };
    public static final zzakr<Number> zzbYv = new zzakr<Number>() {
        public Number a(zzalw com_google_android_gms_internal_zzalw) throws IOException {
            if (com_google_android_gms_internal_zzalw.zzWa() != zzalx.NULL) {
                return Double.valueOf(com_google_android_gms_internal_zzalw.nextDouble());
            }
            com_google_android_gms_internal_zzalw.nextNull();
            return null;
        }

        public void a(zzaly com_google_android_gms_internal_zzaly, Number number) throws IOException {
            com_google_android_gms_internal_zzaly.zza(number);
        }

        public /* synthetic */ void zza(zzaly com_google_android_gms_internal_zzaly, Object obj) throws IOException {
            a(com_google_android_gms_internal_zzaly, (Number) obj);
        }

        public /* synthetic */ Object zzb(zzalw com_google_android_gms_internal_zzalw) throws IOException {
            return a(com_google_android_gms_internal_zzalw);
        }
    };
    public static final zzakr<Number> zzbYw = new zzakr<Number>() {
        public Number a(zzalw com_google_android_gms_internal_zzalw) throws IOException {
            zzalx zzWa = com_google_android_gms_internal_zzalw.zzWa();
            switch (zzWa) {
                case NUMBER:
                    return new zzalc(com_google_android_gms_internal_zzalw.nextString());
                case NULL:
                    com_google_android_gms_internal_zzalw.nextNull();
                    return null;
                default:
                    String valueOf = String.valueOf(zzWa);
                    throw new zzako(new StringBuilder(String.valueOf(valueOf).length() + 23).append("Expecting number, got: ").append(valueOf).toString());
            }
        }

        public void a(zzaly com_google_android_gms_internal_zzaly, Number number) throws IOException {
            com_google_android_gms_internal_zzaly.zza(number);
        }

        public /* synthetic */ void zza(zzaly com_google_android_gms_internal_zzaly, Object obj) throws IOException {
            a(com_google_android_gms_internal_zzaly, (Number) obj);
        }

        public /* synthetic */ Object zzb(zzalw com_google_android_gms_internal_zzalw) throws IOException {
            return a(com_google_android_gms_internal_zzalw);
        }
    };
    public static final zzaks zzbYx = zza(Number.class, zzbYw);
    public static final zzakr<Character> zzbYy = new zzakr<Character>() {
        public Character a(zzalw com_google_android_gms_internal_zzalw) throws IOException {
            if (com_google_android_gms_internal_zzalw.zzWa() == zzalx.NULL) {
                com_google_android_gms_internal_zzalw.nextNull();
                return null;
            }
            String nextString = com_google_android_gms_internal_zzalw.nextString();
            if (nextString.length() == 1) {
                return Character.valueOf(nextString.charAt(0));
            }
            String str = "Expecting character, got: ";
            nextString = String.valueOf(nextString);
            throw new zzako(nextString.length() != 0 ? str.concat(nextString) : new String(str));
        }

        public void a(zzaly com_google_android_gms_internal_zzaly, Character ch) throws IOException {
            com_google_android_gms_internal_zzaly.zziU(ch == null ? null : String.valueOf(ch));
        }

        public /* synthetic */ void zza(zzaly com_google_android_gms_internal_zzaly, Object obj) throws IOException {
            a(com_google_android_gms_internal_zzaly, (Character) obj);
        }

        public /* synthetic */ Object zzb(zzalw com_google_android_gms_internal_zzalw) throws IOException {
            return a(com_google_android_gms_internal_zzalw);
        }
    };
    public static final zzaks zzbYz = zza(Character.TYPE, Character.class, zzbYy);

    private static final class a<T extends Enum<T>> extends zzakr<T> {
        private final Map<String, T> a = new HashMap();
        private final Map<T, String> b = new HashMap();

        public a(Class<T> cls) {
            try {
                for (Enum enumR : (Enum[]) cls.getEnumConstants()) {
                    String name = enumR.name();
                    zzaku com_google_android_gms_internal_zzaku = (zzaku) cls.getField(name).getAnnotation(zzaku.class);
                    if (com_google_android_gms_internal_zzaku != null) {
                        name = com_google_android_gms_internal_zzaku.value();
                        for (Object put : com_google_android_gms_internal_zzaku.zzVR()) {
                            this.a.put(put, enumR);
                        }
                    }
                    String str = name;
                    this.a.put(str, enumR);
                    this.b.put(enumR, str);
                }
            } catch (NoSuchFieldException e) {
                throw new AssertionError();
            }
        }

        public T a(zzalw com_google_android_gms_internal_zzalw) throws IOException {
            if (com_google_android_gms_internal_zzalw.zzWa() != zzalx.NULL) {
                return (Enum) this.a.get(com_google_android_gms_internal_zzalw.nextString());
            }
            com_google_android_gms_internal_zzalw.nextNull();
            return null;
        }

        public void a(zzaly com_google_android_gms_internal_zzaly, T t) throws IOException {
            com_google_android_gms_internal_zzaly.zziU(t == null ? null : (String) this.b.get(t));
        }

        public /* synthetic */ void zza(zzaly com_google_android_gms_internal_zzaly, Object obj) throws IOException {
            a(com_google_android_gms_internal_zzaly, (Enum) obj);
        }

        public /* synthetic */ Object zzb(zzalw com_google_android_gms_internal_zzalw) throws IOException {
            return a(com_google_android_gms_internal_zzalw);
        }
    }

    public static <TT> zzaks zza(final zzalv<TT> com_google_android_gms_internal_zzalv_TT, final zzakr<TT> com_google_android_gms_internal_zzakr_TT) {
        return new zzaks() {
            public <T> zzakr<T> zza(zzajz com_google_android_gms_internal_zzajz, zzalv<T> com_google_android_gms_internal_zzalv_T) {
                return com_google_android_gms_internal_zzalv_T.equals(com_google_android_gms_internal_zzalv_TT) ? com_google_android_gms_internal_zzakr_TT : null;
            }
        };
    }

    public static <TT> zzaks zza(final Class<TT> cls, final zzakr<TT> com_google_android_gms_internal_zzakr_TT) {
        return new zzaks() {
            public String toString() {
                String valueOf = String.valueOf(cls.getName());
                String valueOf2 = String.valueOf(com_google_android_gms_internal_zzakr_TT);
                return new StringBuilder((String.valueOf(valueOf).length() + 23) + String.valueOf(valueOf2).length()).append("Factory[type=").append(valueOf).append(",adapter=").append(valueOf2).append("]").toString();
            }

            public <T> zzakr<T> zza(zzajz com_google_android_gms_internal_zzajz, zzalv<T> com_google_android_gms_internal_zzalv_T) {
                return com_google_android_gms_internal_zzalv_T.zzWl() == cls ? com_google_android_gms_internal_zzakr_TT : null;
            }
        };
    }

    public static <TT> zzaks zza(final Class<TT> cls, final Class<TT> cls2, final zzakr<? super TT> com_google_android_gms_internal_zzakr__super_TT) {
        return new zzaks() {
            public String toString() {
                String valueOf = String.valueOf(cls2.getName());
                String valueOf2 = String.valueOf(cls.getName());
                String valueOf3 = String.valueOf(com_google_android_gms_internal_zzakr__super_TT);
                return new StringBuilder(((String.valueOf(valueOf).length() + 24) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("Factory[type=").append(valueOf).append("+").append(valueOf2).append(",adapter=").append(valueOf3).append("]").toString();
            }

            public <T> zzakr<T> zza(zzajz com_google_android_gms_internal_zzajz, zzalv<T> com_google_android_gms_internal_zzalv_T) {
                Class zzWl = com_google_android_gms_internal_zzalv_T.zzWl();
                return (zzWl == cls || zzWl == cls2) ? com_google_android_gms_internal_zzakr__super_TT : null;
            }
        };
    }

    public static <TT> zzaks zzb(final Class<TT> cls, final zzakr<TT> com_google_android_gms_internal_zzakr_TT) {
        return new zzaks() {
            public String toString() {
                String valueOf = String.valueOf(cls.getName());
                String valueOf2 = String.valueOf(com_google_android_gms_internal_zzakr_TT);
                return new StringBuilder((String.valueOf(valueOf).length() + 32) + String.valueOf(valueOf2).length()).append("Factory[typeHierarchy=").append(valueOf).append(",adapter=").append(valueOf2).append("]").toString();
            }

            public <T> zzakr<T> zza(zzajz com_google_android_gms_internal_zzajz, zzalv<T> com_google_android_gms_internal_zzalv_T) {
                return cls.isAssignableFrom(com_google_android_gms_internal_zzalv_T.zzWl()) ? com_google_android_gms_internal_zzakr_TT : null;
            }
        };
    }

    public static <TT> zzaks zzb(final Class<TT> cls, final Class<? extends TT> cls2, final zzakr<? super TT> com_google_android_gms_internal_zzakr__super_TT) {
        return new zzaks() {
            public String toString() {
                String valueOf = String.valueOf(cls.getName());
                String valueOf2 = String.valueOf(cls2.getName());
                String valueOf3 = String.valueOf(com_google_android_gms_internal_zzakr__super_TT);
                return new StringBuilder(((String.valueOf(valueOf).length() + 24) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("Factory[type=").append(valueOf).append("+").append(valueOf2).append(",adapter=").append(valueOf3).append("]").toString();
            }

            public <T> zzakr<T> zza(zzajz com_google_android_gms_internal_zzajz, zzalv<T> com_google_android_gms_internal_zzalv_T) {
                Class zzWl = com_google_android_gms_internal_zzalv_T.zzWl();
                return (zzWl == cls || zzWl == cls2) ? com_google_android_gms_internal_zzakr__super_TT : null;
            }
        };
    }
}
