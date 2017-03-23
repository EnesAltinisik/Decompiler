package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.h.a;
import android.text.TextUtils;
import android.util.Log;

public final class MediaMetadataCompat implements Parcelable {
    public static final Creator<MediaMetadataCompat> CREATOR = new Creator<MediaMetadataCompat>() {
        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return a(i);
        }

        public MediaMetadataCompat a(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        public MediaMetadataCompat[] a(int i) {
            return new MediaMetadataCompat[i];
        }
    };
    private static final a<String, Integer> a = new a();
    private static final String[] b = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
    private static final String[] c = new String[]{"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
    private static final String[] d = new String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
    private final Bundle e;
    private Object f;
    private MediaDescriptionCompat g;

    static {
        a.put("android.media.metadata.TITLE", Integer.valueOf(1));
        a.put("android.media.metadata.ARTIST", Integer.valueOf(1));
        a.put("android.media.metadata.DURATION", Integer.valueOf(0));
        a.put("android.media.metadata.ALBUM", Integer.valueOf(1));
        a.put("android.media.metadata.AUTHOR", Integer.valueOf(1));
        a.put("android.media.metadata.WRITER", Integer.valueOf(1));
        a.put("android.media.metadata.COMPOSER", Integer.valueOf(1));
        a.put("android.media.metadata.COMPILATION", Integer.valueOf(1));
        a.put("android.media.metadata.DATE", Integer.valueOf(1));
        a.put("android.media.metadata.YEAR", Integer.valueOf(0));
        a.put("android.media.metadata.GENRE", Integer.valueOf(1));
        a.put("android.media.metadata.TRACK_NUMBER", Integer.valueOf(0));
        a.put("android.media.metadata.NUM_TRACKS", Integer.valueOf(0));
        a.put("android.media.metadata.DISC_NUMBER", Integer.valueOf(0));
        a.put("android.media.metadata.ALBUM_ARTIST", Integer.valueOf(1));
        a.put("android.media.metadata.ART", Integer.valueOf(2));
        a.put("android.media.metadata.ART_URI", Integer.valueOf(1));
        a.put("android.media.metadata.ALBUM_ART", Integer.valueOf(2));
        a.put("android.media.metadata.ALBUM_ART_URI", Integer.valueOf(1));
        a.put("android.media.metadata.USER_RATING", Integer.valueOf(3));
        a.put("android.media.metadata.RATING", Integer.valueOf(3));
        a.put("android.media.metadata.DISPLAY_TITLE", Integer.valueOf(1));
        a.put("android.media.metadata.DISPLAY_SUBTITLE", Integer.valueOf(1));
        a.put("android.media.metadata.DISPLAY_DESCRIPTION", Integer.valueOf(1));
        a.put("android.media.metadata.DISPLAY_ICON", Integer.valueOf(2));
        a.put("android.media.metadata.DISPLAY_ICON_URI", Integer.valueOf(1));
        a.put("android.media.metadata.MEDIA_ID", Integer.valueOf(1));
    }

    private MediaMetadataCompat(Parcel parcel) {
        this.e = parcel.readBundle();
    }

    public CharSequence a(String str) {
        return this.e.getCharSequence(str);
    }

    public String b(String str) {
        CharSequence charSequence = this.e.getCharSequence(str);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public Bitmap c(String str) {
        try {
            return (Bitmap) this.e.getParcelable(str);
        } catch (Throwable e) {
            Log.w("MediaMetadata", "Failed to retrieve a key as Bitmap.", e);
            return null;
        }
    }

    public MediaDescriptionCompat a() {
        Uri uri = null;
        if (this.g != null) {
            return this.g;
        }
        int i;
        Bitmap bitmap;
        String b = b("android.media.metadata.MEDIA_ID");
        CharSequence[] charSequenceArr = new CharSequence[3];
        CharSequence a = a("android.media.metadata.DISPLAY_TITLE");
        if (TextUtils.isEmpty(a)) {
            i = 0;
            int i2 = 0;
            while (i2 < charSequenceArr.length && i < b.length) {
                int i3 = i + 1;
                CharSequence a2 = a(b[i]);
                if (TextUtils.isEmpty(a2)) {
                    i = i2;
                } else {
                    i = i2 + 1;
                    charSequenceArr[i2] = a2;
                }
                i2 = i;
                i = i3;
            }
        } else {
            charSequenceArr[0] = a;
            charSequenceArr[1] = a("android.media.metadata.DISPLAY_SUBTITLE");
            charSequenceArr[2] = a("android.media.metadata.DISPLAY_DESCRIPTION");
        }
        for (String c : c) {
            Bitmap c2 = c(c);
            if (c2 != null) {
                bitmap = c2;
                break;
            }
        }
        bitmap = null;
        for (String b2 : d) {
            Object b3 = b(b2);
            if (!TextUtils.isEmpty(b3)) {
                uri = Uri.parse(b3);
                break;
            }
        }
        MediaDescriptionCompat.a aVar = new MediaDescriptionCompat.a();
        aVar.a(b);
        aVar.a(charSequenceArr[0]);
        aVar.b(charSequenceArr[1]);
        aVar.c(charSequenceArr[2]);
        aVar.a(bitmap);
        aVar.a(uri);
        this.g = aVar.a();
        return this.g;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.e);
    }

    public static MediaMetadataCompat a(Object obj) {
        if (obj == null || VERSION.SDK_INT < 21) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        c.a(obj, obtain, 0);
        obtain.setDataPosition(0);
        MediaMetadataCompat mediaMetadataCompat = (MediaMetadataCompat) CREATOR.createFromParcel(obtain);
        obtain.recycle();
        mediaMetadataCompat.f = obj;
        return mediaMetadataCompat;
    }
}
