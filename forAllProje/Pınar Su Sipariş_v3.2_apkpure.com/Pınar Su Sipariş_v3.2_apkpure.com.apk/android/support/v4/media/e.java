package android.support.v4.media;

import android.media.VolumeProvider;

/* compiled from: VolumeProviderCompatApi21 */
class e {

    /* compiled from: VolumeProviderCompatApi21 */
    public interface a {
        void a(int i);

        void b(int i);
    }

    public static Object a(int i, int i2, int i3, final a aVar) {
        return new VolumeProvider(i, i2, i3) {
            public void onSetVolumeTo(int i) {
                aVar.a(i);
            }

            public void onAdjustVolume(int i) {
                aVar.b(i);
            }
        };
    }

    public static void a(Object obj, int i) {
        ((VolumeProvider) obj).setCurrentVolume(i);
    }
}
