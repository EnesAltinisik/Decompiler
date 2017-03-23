package a.a.a.a.a.c;

/* compiled from: Priority */
public enum e {
    LOW,
    NORMAL,
    HIGH,
    IMMEDIATE;

    static <Y> int a(i iVar, Y y) {
        e priority;
        if (y instanceof i) {
            priority = ((i) y).getPriority();
        } else {
            priority = NORMAL;
        }
        return priority.ordinal() - iVar.getPriority().ordinal();
    }
}
