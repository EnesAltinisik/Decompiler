package at.grabner.circleprogress;

import android.graphics.Paint.Cap;

public enum h {
    BUTT(Cap.BUTT),
    ROUND(Cap.ROUND),
    SQUARE(Cap.SQUARE);
    
    final Cap d;

    private h(Cap cap) {
        this.d = cap;
    }
}
