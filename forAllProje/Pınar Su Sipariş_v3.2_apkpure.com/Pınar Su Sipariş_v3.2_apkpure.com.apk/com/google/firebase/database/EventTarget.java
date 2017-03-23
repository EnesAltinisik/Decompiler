package com.google.firebase.database;

public interface EventTarget {
    void postEvent(Runnable runnable);

    void restart();

    void shutdown();
}
