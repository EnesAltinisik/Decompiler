package com.crashlytics.android.core;

import a.a.a.a.a.b.i;
import a.a.a.a.c;
import android.content.Context;
import java.io.Closeable;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;

final class ExceptionUtils {
    private ExceptionUtils() {
    }

    public static void writeStackTraceIfNotNull(Throwable th, OutputStream outputStream) {
        if (outputStream != null) {
            writeStackTrace(th, outputStream);
        }
    }

    public static void writeStackTrace(Context context, Throwable th, String str) {
        Closeable printWriter;
        Throwable e;
        try {
            printWriter = new PrintWriter(context.openFileOutput(str, 0));
            try {
                writeStackTrace(th, (Writer) printWriter);
                i.a(printWriter, "Failed to close stack trace writer.");
            } catch (Exception e2) {
                e = e2;
                try {
                    c.h().e(CrashlyticsCore.TAG, "Failed to create PrintWriter", e);
                    i.a(printWriter, "Failed to close stack trace writer.");
                } catch (Throwable th2) {
                    e = th2;
                    i.a(printWriter, "Failed to close stack trace writer.");
                    throw e;
                }
            }
        } catch (Exception e3) {
            e = e3;
            printWriter = null;
            c.h().e(CrashlyticsCore.TAG, "Failed to create PrintWriter", e);
            i.a(printWriter, "Failed to close stack trace writer.");
        } catch (Throwable th3) {
            e = th3;
            printWriter = null;
            i.a(printWriter, "Failed to close stack trace writer.");
            throw e;
        }
    }

    private static void writeStackTrace(Throwable th, OutputStream outputStream) {
        Throwable e;
        Closeable printWriter;
        try {
            printWriter = new PrintWriter(outputStream);
            try {
                writeStackTrace(th, (Writer) printWriter);
                i.a(printWriter, "Failed to close stack trace writer.");
            } catch (Exception e2) {
                e = e2;
                try {
                    c.h().e(CrashlyticsCore.TAG, "Failed to create PrintWriter", e);
                    i.a(printWriter, "Failed to close stack trace writer.");
                } catch (Throwable th2) {
                    e = th2;
                    i.a(printWriter, "Failed to close stack trace writer.");
                    throw e;
                }
            }
        } catch (Exception e3) {
            e = e3;
            printWriter = null;
            c.h().e(CrashlyticsCore.TAG, "Failed to create PrintWriter", e);
            i.a(printWriter, "Failed to close stack trace writer.");
        } catch (Throwable th3) {
            e = th3;
            printWriter = null;
            i.a(printWriter, "Failed to close stack trace writer.");
            throw e;
        }
    }

    private static void writeStackTrace(Throwable th, Writer writer) {
        Object obj = 1;
        while (th != null) {
            try {
                String message = getMessage(th);
                writer.write((obj != null ? "" : "Caused by: ") + th.getClass().getName() + ": " + (message != null ? message : "") + "\n");
                for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                    writer.write("\tat " + stackTraceElement.toString() + "\n");
                }
                th = th.getCause();
                obj = null;
            } catch (Throwable e) {
                c.h().e(CrashlyticsCore.TAG, "Could not write stack trace", e);
                return;
            }
        }
    }

    private static String getMessage(Throwable th) {
        String localizedMessage = th.getLocalizedMessage();
        if (localizedMessage == null) {
            return null;
        }
        return localizedMessage.replaceAll("(\r\n|\n|\f)", " ");
    }
}
