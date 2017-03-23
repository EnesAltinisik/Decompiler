package com.crashlytics.android.core;

import a.a.a.a.a.b.i;
import a.a.a.a.a.b.l;
import a.a.a.a.a.b.o;
import a.a.a.a.a.f.a;
import a.a.a.a.a.g.p;
import a.a.a.a.a.g.q;
import a.a.a.a.c;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import com.crashlytics.android.core.internal.models.SessionEventData;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class CrashlyticsUncaughtExceptionHandler implements UncaughtExceptionHandler {
    private static final int ANALYZER_VERSION = 1;
    static final FilenameFilter ANY_SESSION_FILENAME_FILTER = new FilenameFilter() {
        public boolean accept(File file, String str) {
            return CrashlyticsUncaughtExceptionHandler.SESSION_FILE_PATTERN.matcher(str).matches();
        }
    };
    private static final String EVENT_TYPE_CRASH = "crash";
    private static final String EVENT_TYPE_LOGGED = "error";
    private static final String GENERATOR_FORMAT = "Crashlytics Android SDK/%s";
    private static final String[] INITIAL_SESSION_PART_TAGS = new String[]{SESSION_USER_TAG, SESSION_APP_TAG, SESSION_OS_TAG, SESSION_DEVICE_TAG};
    static final String INVALID_CLS_CACHE_DIR = "invalidClsFiles";
    static final Comparator<File> LARGEST_FILE_NAME_FIRST = new Comparator<File>() {
        public int compare(File file, File file2) {
            return file2.getName().compareTo(file.getName());
        }
    };
    private static final int MAX_COMPLETE_SESSIONS_COUNT = 4;
    private static final int MAX_LOCAL_LOGGED_EXCEPTIONS = 64;
    static final int MAX_OPEN_SESSIONS = 8;
    private static final Map<String, String> SEND_AT_CRASHTIME_HEADER = Collections.singletonMap("X-CRASHLYTICS-SEND-FLAGS", "1");
    static final String SESSION_APP_TAG = "SessionApp";
    static final String SESSION_BEGIN_TAG = "BeginSession";
    static final String SESSION_DEVICE_TAG = "SessionDevice";
    static final String SESSION_FATAL_TAG = "SessionCrash";
    static final FilenameFilter SESSION_FILE_FILTER = new FilenameFilter() {
        public boolean accept(File file, String str) {
            return str.length() == ClsFileOutputStream.SESSION_FILE_EXTENSION.length() + 35 && str.endsWith(ClsFileOutputStream.SESSION_FILE_EXTENSION);
        }
    };
    private static final Pattern SESSION_FILE_PATTERN = Pattern.compile("([\\d|A-Z|a-z]{12}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{12}).+");
    private static final int SESSION_ID_LENGTH = 35;
    static final String SESSION_NON_FATAL_TAG = "SessionEvent";
    static final String SESSION_OS_TAG = "SessionOS";
    static final String SESSION_USER_TAG = "SessionUser";
    static final Comparator<File> SMALLEST_FILE_NAME_FIRST = new Comparator<File>() {
        public int compare(File file, File file2) {
            return file.getName().compareTo(file2.getName());
        }
    };
    private final CrashlyticsCore crashlyticsCore;
    private final UncaughtExceptionHandler defaultHandler;
    private final DevicePowerStateListener devicePowerStateListener;
    private final AtomicInteger eventCounter = new AtomicInteger(0);
    private final CrashlyticsExecutorServiceWrapper executorServiceWrapper;
    private final a fileStore;
    private final o idManager;
    private final AtomicBoolean isHandlingException;
    private final LogFileManager logFileManager;
    private final String unityVersion;

    private static class AnySessionPartFileFilter implements FilenameFilter {
        private AnySessionPartFileFilter() {
        }

        public boolean accept(File file, String str) {
            return !CrashlyticsUncaughtExceptionHandler.SESSION_FILE_FILTER.accept(file, str) && CrashlyticsUncaughtExceptionHandler.SESSION_FILE_PATTERN.matcher(str).matches();
        }
    }

    static class FileNameContainsFilter implements FilenameFilter {
        private final String string;

        public FileNameContainsFilter(String str) {
            this.string = str;
        }

        public boolean accept(File file, String str) {
            return str.contains(this.string) && !str.endsWith(ClsFileOutputStream.IN_PROGRESS_SESSION_FILE_EXTENSION);
        }
    }

    private static final class SendSessionRunnable implements Runnable {
        private final CrashlyticsCore crashlyticsCore;
        private final File fileToSend;

        public SendSessionRunnable(CrashlyticsCore crashlyticsCore, File file) {
            this.crashlyticsCore = crashlyticsCore;
            this.fileToSend = file;
        }

        public void run() {
            if (i.n(this.crashlyticsCore.getContext())) {
                c.h().a(CrashlyticsCore.TAG, "Attempting to send crash report at time of crash...");
                CreateReportSpiCall createReportSpiCall = this.crashlyticsCore.getCreateReportSpiCall(q.a().b());
                if (createReportSpiCall != null) {
                    new ReportUploader(createReportSpiCall).forceUpload(new SessionReport(this.fileToSend, CrashlyticsUncaughtExceptionHandler.SEND_AT_CRASHTIME_HEADER));
                }
            }
        }
    }

    static class SessionPartFileFilter implements FilenameFilter {
        private final String sessionId;

        public SessionPartFileFilter(String str) {
            this.sessionId = str;
        }

        public boolean accept(File file, String str) {
            if (str.equals(this.sessionId + ClsFileOutputStream.SESSION_FILE_EXTENSION) || !str.contains(this.sessionId) || str.endsWith(ClsFileOutputStream.IN_PROGRESS_SESSION_FILE_EXTENSION)) {
                return false;
            }
            return true;
        }
    }

    CrashlyticsUncaughtExceptionHandler(UncaughtExceptionHandler uncaughtExceptionHandler, CrashlyticsExecutorServiceWrapper crashlyticsExecutorServiceWrapper, o oVar, UnityVersionProvider unityVersionProvider, a aVar, CrashlyticsCore crashlyticsCore) {
        this.defaultHandler = uncaughtExceptionHandler;
        this.executorServiceWrapper = crashlyticsExecutorServiceWrapper;
        this.idManager = oVar;
        this.crashlyticsCore = crashlyticsCore;
        this.unityVersion = unityVersionProvider.getUnityVersion();
        this.fileStore = aVar;
        this.isHandlingException = new AtomicBoolean(false);
        Context context = crashlyticsCore.getContext();
        this.logFileManager = new LogFileManager(context, aVar);
        this.devicePowerStateListener = new DevicePowerStateListener(context);
    }

    public synchronized void uncaughtException(final Thread thread, final Throwable th) {
        this.isHandlingException.set(true);
        try {
            c.h().a(CrashlyticsCore.TAG, "Crashlytics is handling uncaught exception \"" + th + "\" from thread " + thread.getName());
            this.devicePowerStateListener.dispose();
            final Date date = new Date();
            this.executorServiceWrapper.executeSyncLoggingException(new Callable<Void>() {
                public Void call() throws Exception {
                    CrashlyticsUncaughtExceptionHandler.this.handleUncaughtException(date, thread, th);
                    return null;
                }
            });
            c.h().a(CrashlyticsCore.TAG, "Crashlytics completed exception processing. Invoking default exception handler.");
            this.defaultHandler.uncaughtException(thread, th);
            this.isHandlingException.set(false);
        } catch (Throwable e) {
            c.h().e(CrashlyticsCore.TAG, "An error occurred in the uncaught exception handler", e);
            c.h().a(CrashlyticsCore.TAG, "Crashlytics completed exception processing. Invoking default exception handler.");
            this.defaultHandler.uncaughtException(thread, th);
            this.isHandlingException.set(false);
        } catch (Throwable th2) {
            c.h().a(CrashlyticsCore.TAG, "Crashlytics completed exception processing. Invoking default exception handler.");
            this.defaultHandler.uncaughtException(thread, th);
            this.isHandlingException.set(false);
        }
    }

    private void handleUncaughtException(Date date, Thread thread, Throwable th) throws Exception {
        this.crashlyticsCore.createCrashMarker();
        writeFatal(date, thread, th);
        doCloseSessions();
        doOpenSession();
        trimSessionFiles();
        if (!this.crashlyticsCore.shouldPromptUserBeforeSendingCrashReports()) {
            sendSessionReports();
        }
    }

    boolean isHandlingException() {
        return this.isHandlingException.get();
    }

    void writeToLog(final long j, final String str) {
        this.executorServiceWrapper.executeAsync(new Callable<Void>() {
            public Void call() throws Exception {
                if (!CrashlyticsUncaughtExceptionHandler.this.isHandlingException.get()) {
                    CrashlyticsUncaughtExceptionHandler.this.logFileManager.writeToLog(j, str);
                }
                return null;
            }
        });
    }

    void writeNonFatalException(final Thread thread, final Throwable th) {
        final Date date = new Date();
        this.executorServiceWrapper.executeAsync(new Runnable() {
            public void run() {
                if (!CrashlyticsUncaughtExceptionHandler.this.isHandlingException.get()) {
                    CrashlyticsUncaughtExceptionHandler.this.doWriteNonFatal(date, thread, th);
                }
            }
        });
    }

    void cacheUserData(final String str, final String str2, final String str3) {
        this.executorServiceWrapper.executeAsync(new Callable<Void>() {
            public Void call() throws Exception {
                new MetaDataStore(CrashlyticsUncaughtExceptionHandler.this.getFilesDir()).writeUserData(CrashlyticsUncaughtExceptionHandler.this.getCurrentSessionId(), new UserMetaData(str, str2, str3));
                return null;
            }
        });
    }

    void cacheKeyData(final Map<String, String> map) {
        this.executorServiceWrapper.executeAsync(new Callable<Void>() {
            public Void call() throws Exception {
                new MetaDataStore(CrashlyticsUncaughtExceptionHandler.this.getFilesDir()).writeKeyData(CrashlyticsUncaughtExceptionHandler.this.getCurrentSessionId(), map);
                return null;
            }
        });
    }

    void openSession() {
        this.executorServiceWrapper.executeAsync(new Callable<Void>() {
            public Void call() throws Exception {
                CrashlyticsUncaughtExceptionHandler.this.doOpenSession();
                return null;
            }
        });
    }

    private String getCurrentSessionId() {
        File[] listSortedSessionBeginFiles = listSortedSessionBeginFiles();
        return listSortedSessionBeginFiles.length > 0 ? getSessionIdFromSessionFile(listSortedSessionBeginFiles[0]) : null;
    }

    private String getPreviousSessionId() {
        File[] listSortedSessionBeginFiles = listSortedSessionBeginFiles();
        return listSortedSessionBeginFiles.length > 1 ? getSessionIdFromSessionFile(listSortedSessionBeginFiles[1]) : null;
    }

    private String getSessionIdFromSessionFile(File file) {
        return file.getName().substring(0, 35);
    }

    boolean hasOpenSession() {
        return listSessionBeginFiles().length > 0;
    }

    boolean finalizeSessions() {
        return ((Boolean) this.executorServiceWrapper.executeSyncLoggingException(new Callable<Boolean>() {
            public Boolean call() throws Exception {
                if (CrashlyticsUncaughtExceptionHandler.this.isHandlingException.get()) {
                    c.h().a(CrashlyticsCore.TAG, "Skipping session finalization because a crash has already occurred.");
                    return Boolean.FALSE;
                }
                c.h().a(CrashlyticsCore.TAG, "Finalizing previously open sessions.");
                SessionEventData externalCrashEventData = CrashlyticsUncaughtExceptionHandler.this.crashlyticsCore.getExternalCrashEventData();
                if (externalCrashEventData != null) {
                    CrashlyticsUncaughtExceptionHandler.this.writeExternalCrashEvent(externalCrashEventData);
                }
                CrashlyticsUncaughtExceptionHandler.this.doCloseSessions(true);
                c.h().a(CrashlyticsCore.TAG, "Closed all previously open sessions");
                return Boolean.TRUE;
            }
        })).booleanValue();
    }

    private void doOpenSession() throws Exception {
        Date date = new Date();
        String clsuuid = new CLSUUID(this.idManager).toString();
        c.h().a(CrashlyticsCore.TAG, "Opening an new session with ID " + clsuuid);
        writeBeginSession(clsuuid, date);
        writeSessionApp(clsuuid);
        writeSessionOS(clsuuid);
        writeSessionDevice(clsuuid);
        this.logFileManager.setCurrentSession(clsuuid);
    }

    void doCloseSessions() throws Exception {
        doCloseSessions(false);
    }

    private void doCloseSessions(boolean z) throws Exception {
        int i = z ? 1 : 0;
        trimOpenSessions(i + 8);
        File[] listSortedSessionBeginFiles = listSortedSessionBeginFiles();
        if (listSortedSessionBeginFiles.length <= i) {
            c.h().a(CrashlyticsCore.TAG, "No open sessions to be closed.");
            return;
        }
        writeSessionUser(getSessionIdFromSessionFile(listSortedSessionBeginFiles[i]));
        CrashlyticsCore crashlyticsCore = this.crashlyticsCore;
        p sessionSettingsData = CrashlyticsCore.getSessionSettingsData();
        if (sessionSettingsData == null) {
            c.h().a(CrashlyticsCore.TAG, "Unable to close session. Settings are not loaded.");
        } else {
            closeOpenSessions(listSortedSessionBeginFiles, i, sessionSettingsData.c);
        }
    }

    private void closeOpenSessions(File[] fileArr, int i, int i2) {
        c.h().a(CrashlyticsCore.TAG, "Closing open sessions.");
        while (i < fileArr.length) {
            File file = fileArr[i];
            String sessionIdFromSessionFile = getSessionIdFromSessionFile(file);
            c.h().a(CrashlyticsCore.TAG, "Closing session: " + sessionIdFromSessionFile);
            writeSessionPartsToSessionFile(file, sessionIdFromSessionFile, i2);
            i++;
        }
    }

    private void closeWithoutRenamingOrLog(ClsFileOutputStream clsFileOutputStream) {
        if (clsFileOutputStream != null) {
            try {
                clsFileOutputStream.closeInProgressStream();
            } catch (Throwable e) {
                c.h().e(CrashlyticsCore.TAG, "Error closing session file stream in the presence of an exception", e);
            }
        }
    }

    private void deleteSessionPartFilesFor(String str) {
        for (File delete : listSessionPartFilesFor(str)) {
            delete.delete();
        }
    }

    private File[] listSessionPartFilesFor(String str) {
        return listFilesMatching(new SessionPartFileFilter(str));
    }

    private File[] listCompleteSessionFiles() {
        return listFilesMatching(SESSION_FILE_FILTER);
    }

    File[] listSessionBeginFiles() {
        return listFilesMatching(new FileNameContainsFilter(SESSION_BEGIN_TAG));
    }

    private File[] listSortedSessionBeginFiles() {
        File[] listSessionBeginFiles = listSessionBeginFiles();
        Arrays.sort(listSessionBeginFiles, LARGEST_FILE_NAME_FIRST);
        return listSessionBeginFiles;
    }

    private File[] listFilesMatching(FilenameFilter filenameFilter) {
        return ensureFileArrayNotNull(getFilesDir().listFiles(filenameFilter));
    }

    private File[] ensureFileArrayNotNull(File[] fileArr) {
        return fileArr == null ? new File[0] : fileArr;
    }

    private void trimSessionEventFiles(String str, int i) {
        Utils.capFileCount(getFilesDir(), new FileNameContainsFilter(str + SESSION_NON_FATAL_TAG), i, SMALLEST_FILE_NAME_FIRST);
    }

    void trimSessionFiles() {
        Utils.capFileCount(getFilesDir(), SESSION_FILE_FILTER, 4, SMALLEST_FILE_NAME_FIRST);
    }

    private void trimOpenSessions(int i) {
        int i2 = 0;
        Set hashSet = new HashSet();
        File[] listSortedSessionBeginFiles = listSortedSessionBeginFiles();
        int min = Math.min(i, listSortedSessionBeginFiles.length);
        for (int i3 = 0; i3 < min; i3++) {
            hashSet.add(getSessionIdFromSessionFile(listSortedSessionBeginFiles[i3]));
        }
        this.logFileManager.discardOldLogFiles(hashSet);
        File[] listFilesMatching = listFilesMatching(new AnySessionPartFileFilter());
        int length = listFilesMatching.length;
        while (i2 < length) {
            File file = listFilesMatching[i2];
            Object name = file.getName();
            Matcher matcher = SESSION_FILE_PATTERN.matcher(name);
            matcher.matches();
            if (!hashSet.contains(matcher.group(1))) {
                c.h().a(CrashlyticsCore.TAG, "Trimming open session file: " + name);
                file.delete();
            }
            i2++;
        }
    }

    private File[] getTrimmedNonFatalFiles(String str, File[] fileArr, int i) {
        if (fileArr.length <= i) {
            return fileArr;
        }
        c.h().a(CrashlyticsCore.TAG, String.format(Locale.US, "Trimming down to %d logged exceptions.", new Object[]{Integer.valueOf(i)}));
        trimSessionEventFiles(str, i);
        return listFilesMatching(new FileNameContainsFilter(str + SESSION_NON_FATAL_TAG));
    }

    void cleanInvalidTempFiles() {
        this.executorServiceWrapper.executeAsync(new Runnable() {
            public void run() {
                CrashlyticsUncaughtExceptionHandler.this.doCleanInvalidTempFiles(CrashlyticsUncaughtExceptionHandler.this.listFilesMatching(ClsFileOutputStream.TEMP_FILENAME_FILTER));
            }
        });
    }

    void doCleanInvalidTempFiles(File[] fileArr) {
        deleteLegacyInvalidCacheDir();
        for (File file : fileArr) {
            c.h().a(CrashlyticsCore.TAG, "Found invalid session part file: " + file);
            final String sessionIdFromSessionFile = getSessionIdFromSessionFile(file);
            FilenameFilter anonymousClass13 = new FilenameFilter() {
                public boolean accept(File file, String str) {
                    return str.startsWith(sessionIdFromSessionFile);
                }
            };
            c.h().a(CrashlyticsCore.TAG, "Deleting all part files for invalid session: " + sessionIdFromSessionFile);
            for (File file2 : listFilesMatching(anonymousClass13)) {
                c.h().a(CrashlyticsCore.TAG, "Deleting session file: " + file2);
                file2.delete();
            }
        }
    }

    private void deleteLegacyInvalidCacheDir() {
        File file = new File(this.crashlyticsCore.getSdkDirectory(), INVALID_CLS_CACHE_DIR);
        if (file.exists()) {
            if (file.isDirectory()) {
                for (File delete : file.listFiles()) {
                    delete.delete();
                }
            }
            file.delete();
        }
    }

    private void writeFatal(Date date, Thread thread, Throwable th) {
        Throwable e;
        Closeable closeable;
        Flushable flushable = null;
        try {
            String currentSessionId = getCurrentSessionId();
            if (currentSessionId == null) {
                c.h().e(CrashlyticsCore.TAG, "Tried to write a fatal exception while no session was open.", null);
                i.a(null, "Failed to flush to session begin file.");
                i.a(null, "Failed to close fatal exception file output stream.");
                return;
            }
            CrashlyticsCore.recordFatalExceptionEvent(currentSessionId);
            Closeable clsFileOutputStream = new ClsFileOutputStream(getFilesDir(), currentSessionId + SESSION_FATAL_TAG);
            try {
                flushable = CodedOutputStream.newInstance((OutputStream) clsFileOutputStream);
                writeSessionEvent(flushable, date, thread, th, EVENT_TYPE_CRASH, true);
                i.a(flushable, "Failed to flush to session begin file.");
                i.a(clsFileOutputStream, "Failed to close fatal exception file output stream.");
            } catch (Exception e2) {
                e = e2;
                closeable = clsFileOutputStream;
                try {
                    c.h().e(CrashlyticsCore.TAG, "An error occurred in the fatal exception logger", e);
                    ExceptionUtils.writeStackTraceIfNotNull(e, closeable);
                    i.a(flushable, "Failed to flush to session begin file.");
                    i.a(closeable, "Failed to close fatal exception file output stream.");
                } catch (Throwable th2) {
                    e = th2;
                    i.a(flushable, "Failed to flush to session begin file.");
                    i.a(closeable, "Failed to close fatal exception file output stream.");
                    throw e;
                }
            } catch (Throwable th3) {
                e = th3;
                closeable = clsFileOutputStream;
                i.a(flushable, "Failed to flush to session begin file.");
                i.a(closeable, "Failed to close fatal exception file output stream.");
                throw e;
            }
        } catch (Exception e3) {
            e = e3;
            closeable = null;
            c.h().e(CrashlyticsCore.TAG, "An error occurred in the fatal exception logger", e);
            ExceptionUtils.writeStackTraceIfNotNull(e, closeable);
            i.a(flushable, "Failed to flush to session begin file.");
            i.a(closeable, "Failed to close fatal exception file output stream.");
        } catch (Throwable th4) {
            e = th4;
            closeable = null;
            i.a(flushable, "Failed to flush to session begin file.");
            i.a(closeable, "Failed to close fatal exception file output stream.");
            throw e;
        }
    }

    private void writeExternalCrashEvent(SessionEventData sessionEventData) throws IOException {
        Closeable clsFileOutputStream;
        Throwable e;
        Flushable flushable = null;
        try {
            String previousSessionId = getPreviousSessionId();
            if (previousSessionId == null) {
                c.h().e(CrashlyticsCore.TAG, "Tried to write a native crash while no session was open.", null);
                i.a(null, "Failed to flush to session begin file.");
                i.a(null, "Failed to close fatal exception file output stream.");
                return;
            }
            CrashlyticsCore.recordFatalExceptionEvent(previousSessionId);
            clsFileOutputStream = new ClsFileOutputStream(getFilesDir(), previousSessionId + SESSION_FATAL_TAG);
            try {
                flushable = CodedOutputStream.newInstance((OutputStream) clsFileOutputStream);
                NativeCrashWriter.writeNativeCrash(sessionEventData, new LogFileManager(this.crashlyticsCore.getContext(), this.fileStore, previousSessionId), new MetaDataStore(getFilesDir()).readKeyData(previousSessionId), flushable);
                i.a(flushable, "Failed to flush to session begin file.");
                i.a(clsFileOutputStream, "Failed to close fatal exception file output stream.");
            } catch (Exception e2) {
                e = e2;
                try {
                    c.h().e(CrashlyticsCore.TAG, "An error occurred in the native crash logger", e);
                    ExceptionUtils.writeStackTraceIfNotNull(e, clsFileOutputStream);
                    i.a(flushable, "Failed to flush to session begin file.");
                    i.a(clsFileOutputStream, "Failed to close fatal exception file output stream.");
                } catch (Throwable th) {
                    e = th;
                    i.a(flushable, "Failed to flush to session begin file.");
                    i.a(clsFileOutputStream, "Failed to close fatal exception file output stream.");
                    throw e;
                }
            }
        } catch (Exception e3) {
            e = e3;
            clsFileOutputStream = null;
            c.h().e(CrashlyticsCore.TAG, "An error occurred in the native crash logger", e);
            ExceptionUtils.writeStackTraceIfNotNull(e, clsFileOutputStream);
            i.a(flushable, "Failed to flush to session begin file.");
            i.a(clsFileOutputStream, "Failed to close fatal exception file output stream.");
        } catch (Throwable th2) {
            e = th2;
            clsFileOutputStream = null;
            i.a(flushable, "Failed to flush to session begin file.");
            i.a(clsFileOutputStream, "Failed to close fatal exception file output stream.");
            throw e;
        }
    }

    private void doWriteNonFatal(Date date, Thread thread, Throwable th) {
        Throwable e;
        Closeable closeable;
        Flushable flushable = null;
        String currentSessionId = getCurrentSessionId();
        if (currentSessionId == null) {
            c.h().e(CrashlyticsCore.TAG, "Tried to write a non-fatal exception while no session was open.", null);
            return;
        }
        CrashlyticsCore.recordLoggedExceptionEvent(currentSessionId);
        try {
            c.h().a(CrashlyticsCore.TAG, "Crashlytics is logging non-fatal exception \"" + th + "\" from thread " + thread.getName());
            Closeable clsFileOutputStream = new ClsFileOutputStream(getFilesDir(), currentSessionId + SESSION_NON_FATAL_TAG + i.a(this.eventCounter.getAndIncrement()));
            try {
                flushable = CodedOutputStream.newInstance((OutputStream) clsFileOutputStream);
                writeSessionEvent(flushable, date, thread, th, EVENT_TYPE_LOGGED, false);
                i.a(flushable, "Failed to flush to non-fatal file.");
                i.a(clsFileOutputStream, "Failed to close non-fatal file output stream.");
            } catch (Exception e2) {
                e = e2;
                closeable = clsFileOutputStream;
                try {
                    c.h().e(CrashlyticsCore.TAG, "An error occurred in the non-fatal exception logger", e);
                    ExceptionUtils.writeStackTraceIfNotNull(e, closeable);
                    i.a(flushable, "Failed to flush to non-fatal file.");
                    i.a(closeable, "Failed to close non-fatal file output stream.");
                    trimSessionEventFiles(currentSessionId, 64);
                } catch (Throwable th2) {
                    e = th2;
                    i.a(flushable, "Failed to flush to non-fatal file.");
                    i.a(closeable, "Failed to close non-fatal file output stream.");
                    throw e;
                }
            } catch (Throwable th3) {
                e = th3;
                closeable = clsFileOutputStream;
                i.a(flushable, "Failed to flush to non-fatal file.");
                i.a(closeable, "Failed to close non-fatal file output stream.");
                throw e;
            }
        } catch (Exception e3) {
            e = e3;
            closeable = null;
            c.h().e(CrashlyticsCore.TAG, "An error occurred in the non-fatal exception logger", e);
            ExceptionUtils.writeStackTraceIfNotNull(e, closeable);
            i.a(flushable, "Failed to flush to non-fatal file.");
            i.a(closeable, "Failed to close non-fatal file output stream.");
            trimSessionEventFiles(currentSessionId, 64);
        } catch (Throwable th4) {
            e = th4;
            closeable = null;
            i.a(flushable, "Failed to flush to non-fatal file.");
            i.a(closeable, "Failed to close non-fatal file output stream.");
            throw e;
        }
        try {
            trimSessionEventFiles(currentSessionId, 64);
        } catch (Throwable e4) {
            c.h().e(CrashlyticsCore.TAG, "An error occurred when trimming non-fatal files.", e4);
        }
    }

    private void writeBeginSession(String str, Date date) throws Exception {
        Closeable clsFileOutputStream;
        Throwable e;
        Flushable flushable = null;
        try {
            clsFileOutputStream = new ClsFileOutputStream(getFilesDir(), str + SESSION_BEGIN_TAG);
            try {
                flushable = CodedOutputStream.newInstance((OutputStream) clsFileOutputStream);
                SessionProtobufHelper.writeBeginSession(flushable, str, String.format(Locale.US, GENERATOR_FORMAT, new Object[]{this.crashlyticsCore.getVersion()}), date.getTime() / 1000);
                i.a(flushable, "Failed to flush to session begin file.");
                i.a(clsFileOutputStream, "Failed to close begin session file.");
            } catch (Exception e2) {
                e = e2;
                try {
                    ExceptionUtils.writeStackTraceIfNotNull(e, clsFileOutputStream);
                    throw e;
                } catch (Throwable th) {
                    e = th;
                    i.a(flushable, "Failed to flush to session begin file.");
                    i.a(clsFileOutputStream, "Failed to close begin session file.");
                    throw e;
                }
            }
        } catch (Exception e3) {
            e = e3;
            clsFileOutputStream = null;
            ExceptionUtils.writeStackTraceIfNotNull(e, clsFileOutputStream);
            throw e;
        } catch (Throwable th2) {
            e = th2;
            clsFileOutputStream = null;
            i.a(flushable, "Failed to flush to session begin file.");
            i.a(clsFileOutputStream, "Failed to close begin session file.");
            throw e;
        }
    }

    private void writeSessionApp(String str) throws Exception {
        Closeable clsFileOutputStream;
        Throwable e;
        Closeable closeable;
        OutputStream outputStream;
        Flushable flushable = null;
        try {
            Flushable newInstance;
            clsFileOutputStream = new ClsFileOutputStream(getFilesDir(), str + SESSION_APP_TAG);
            try {
                newInstance = CodedOutputStream.newInstance((OutputStream) clsFileOutputStream);
            } catch (Exception e2) {
                e = e2;
                closeable = clsFileOutputStream;
                try {
                    ExceptionUtils.writeStackTraceIfNotNull(e, outputStream);
                    throw e;
                } catch (Throwable th) {
                    e = th;
                    clsFileOutputStream = outputStream;
                    i.a(flushable, "Failed to flush to session app file.");
                    i.a(clsFileOutputStream, "Failed to close session app file.");
                    throw e;
                }
            } catch (Throwable th2) {
                e = th2;
                i.a(flushable, "Failed to flush to session app file.");
                i.a(clsFileOutputStream, "Failed to close session app file.");
                throw e;
            }
            try {
                SessionProtobufHelper.writeSessionApp(newInstance, this.idManager.c(), this.crashlyticsCore.getApiKey(), this.crashlyticsCore.getVersionCode(), this.crashlyticsCore.getVersionName(), this.idManager.b(), l.a(this.crashlyticsCore.getInstallerPackageName()).a(), this.unityVersion);
                i.a(newInstance, "Failed to flush to session app file.");
                i.a(clsFileOutputStream, "Failed to close session app file.");
            } catch (Throwable e3) {
                closeable = clsFileOutputStream;
                Flushable flushable2 = newInstance;
                e = e3;
                flushable = flushable2;
                ExceptionUtils.writeStackTraceIfNotNull(e, outputStream);
                throw e;
            } catch (Throwable e32) {
                Throwable th3 = e32;
                flushable = newInstance;
                e = th3;
                i.a(flushable, "Failed to flush to session app file.");
                i.a(clsFileOutputStream, "Failed to close session app file.");
                throw e;
            }
        } catch (Exception e4) {
            e = e4;
            outputStream = null;
            ExceptionUtils.writeStackTraceIfNotNull(e, outputStream);
            throw e;
        } catch (Throwable th4) {
            e = th4;
            clsFileOutputStream = null;
            i.a(flushable, "Failed to flush to session app file.");
            i.a(clsFileOutputStream, "Failed to close session app file.");
            throw e;
        }
    }

    private void writeSessionOS(String str) throws Exception {
        Closeable clsFileOutputStream;
        Throwable e;
        Flushable flushable = null;
        try {
            clsFileOutputStream = new ClsFileOutputStream(getFilesDir(), str + SESSION_OS_TAG);
            try {
                flushable = CodedOutputStream.newInstance((OutputStream) clsFileOutputStream);
                SessionProtobufHelper.writeSessionOS(flushable, i.g(this.crashlyticsCore.getContext()));
                i.a(flushable, "Failed to flush to session OS file.");
                i.a(clsFileOutputStream, "Failed to close session OS file.");
            } catch (Exception e2) {
                e = e2;
                try {
                    ExceptionUtils.writeStackTraceIfNotNull(e, clsFileOutputStream);
                    throw e;
                } catch (Throwable th) {
                    e = th;
                    i.a(flushable, "Failed to flush to session OS file.");
                    i.a(clsFileOutputStream, "Failed to close session OS file.");
                    throw e;
                }
            }
        } catch (Exception e3) {
            e = e3;
            clsFileOutputStream = null;
            ExceptionUtils.writeStackTraceIfNotNull(e, clsFileOutputStream);
            throw e;
        } catch (Throwable th2) {
            e = th2;
            clsFileOutputStream = null;
            i.a(flushable, "Failed to flush to session OS file.");
            i.a(clsFileOutputStream, "Failed to close session OS file.");
            throw e;
        }
    }

    private void writeSessionDevice(String str) throws Exception {
        Throwable e;
        OutputStream outputStream;
        OutputStream outputStream2 = null;
        Flushable flushable = null;
        try {
            OutputStream clsFileOutputStream = new ClsFileOutputStream(getFilesDir(), str + SESSION_DEVICE_TAG);
            try {
                flushable = CodedOutputStream.newInstance(clsFileOutputStream);
                Context context = this.crashlyticsCore.getContext();
                StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                SessionProtobufHelper.writeSessionDevice(flushable, this.idManager.h(), i.a(), Build.MODEL, Runtime.getRuntime().availableProcessors(), i.b(), ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize()), i.f(context), this.idManager.i(), i.h(context), Build.MANUFACTURER, Build.PRODUCT);
                i.a(flushable, "Failed to flush session device info.");
                i.a((Closeable) clsFileOutputStream, "Failed to close session device file.");
            } catch (Exception e2) {
                e = e2;
                outputStream2 = clsFileOutputStream;
                try {
                    ExceptionUtils.writeStackTraceIfNotNull(e, outputStream2);
                    throw e;
                } catch (Throwable th) {
                    e = th;
                    outputStream = outputStream2;
                    i.a(flushable, "Failed to flush session device info.");
                    i.a((Closeable) outputStream, "Failed to close session device file.");
                    throw e;
                }
            } catch (Throwable th2) {
                e = th2;
                i.a(flushable, "Failed to flush session device info.");
                i.a((Closeable) outputStream, "Failed to close session device file.");
                throw e;
            }
        } catch (Exception e3) {
            e = e3;
            ExceptionUtils.writeStackTraceIfNotNull(e, outputStream2);
            throw e;
        } catch (Throwable th3) {
            e = th3;
            outputStream = null;
            i.a(flushable, "Failed to flush session device info.");
            i.a((Closeable) outputStream, "Failed to close session device file.");
            throw e;
        }
    }

    private void writeSessionUser(String str) throws Exception {
        Throwable e;
        Flushable flushable = null;
        Closeable clsFileOutputStream;
        try {
            clsFileOutputStream = new ClsFileOutputStream(getFilesDir(), str + SESSION_USER_TAG);
            try {
                flushable = CodedOutputStream.newInstance((OutputStream) clsFileOutputStream);
                UserMetaData userMetaData = getUserMetaData(str);
                if (userMetaData.isEmpty()) {
                    i.a(flushable, "Failed to flush session user file.");
                    i.a(clsFileOutputStream, "Failed to close session user file.");
                    return;
                }
                SessionProtobufHelper.writeSessionUser(flushable, userMetaData.id, userMetaData.name, userMetaData.email);
                i.a(flushable, "Failed to flush session user file.");
                i.a(clsFileOutputStream, "Failed to close session user file.");
            } catch (Exception e2) {
                e = e2;
                try {
                    ExceptionUtils.writeStackTraceIfNotNull(e, clsFileOutputStream);
                    throw e;
                } catch (Throwable th) {
                    e = th;
                    i.a(flushable, "Failed to flush session user file.");
                    i.a(clsFileOutputStream, "Failed to close session user file.");
                    throw e;
                }
            }
        } catch (Exception e3) {
            e = e3;
            clsFileOutputStream = null;
            ExceptionUtils.writeStackTraceIfNotNull(e, clsFileOutputStream);
            throw e;
        } catch (Throwable th2) {
            e = th2;
            clsFileOutputStream = null;
            i.a(flushable, "Failed to flush session user file.");
            i.a(clsFileOutputStream, "Failed to close session user file.");
            throw e;
        }
    }

    private void writeSessionEvent(CodedOutputStream codedOutputStream, Date date, Thread thread, Throwable th, String str, boolean z) throws Exception {
        Thread[] threadArr;
        Map treeMap;
        Context context = this.crashlyticsCore.getContext();
        long time = date.getTime() / 1000;
        float c = i.c(context);
        int a = i.a(context, this.devicePowerStateListener.isPowerConnected());
        boolean d = i.d(context);
        int i = context.getResources().getConfiguration().orientation;
        long b = i.b() - i.b(context);
        long b2 = i.b(Environment.getDataDirectory().getPath());
        RunningAppProcessInfo a2 = i.a(context.getPackageName(), context);
        List linkedList = new LinkedList();
        StackTraceElement[] stackTrace = th.getStackTrace();
        String buildId = this.crashlyticsCore.getBuildId();
        String c2 = this.idManager.c();
        if (z) {
            Map allStackTraces = Thread.getAllStackTraces();
            threadArr = new Thread[allStackTraces.size()];
            int i2 = 0;
            for (Entry entry : allStackTraces.entrySet()) {
                threadArr[i2] = (Thread) entry.getKey();
                linkedList.add(entry.getValue());
                i2++;
            }
        } else {
            threadArr = new Thread[0];
        }
        if (i.a(context, "com.crashlytics.CollectCustomKeys", true)) {
            Map attributes = this.crashlyticsCore.getAttributes();
            treeMap = (attributes == null || attributes.size() <= 1) ? attributes : new TreeMap(attributes);
        } else {
            treeMap = new TreeMap();
        }
        SessionProtobufHelper.writeSessionEvent(codedOutputStream, time, str, th, thread, stackTrace, threadArr, linkedList, treeMap, this.logFileManager, a2, i, c2, buildId, c, a, d, b, b2);
    }

    private void writeSessionPartsToSessionFile(File file, String str, int i) {
        boolean z;
        c.h().a(CrashlyticsCore.TAG, "Collecting session parts for ID " + str);
        File[] listFilesMatching = listFilesMatching(new FileNameContainsFilter(str + SESSION_FATAL_TAG));
        boolean z2 = listFilesMatching != null && listFilesMatching.length > 0;
        c.h().a(CrashlyticsCore.TAG, String.format(Locale.US, "Session %s has fatal exception: %s", new Object[]{str, Boolean.valueOf(z2)}));
        File[] listFilesMatching2 = listFilesMatching(new FileNameContainsFilter(str + SESSION_NON_FATAL_TAG));
        if (listFilesMatching2 == null || listFilesMatching2.length <= 0) {
            z = false;
        } else {
            z = true;
        }
        c.h().a(CrashlyticsCore.TAG, String.format(Locale.US, "Session %s has non-fatal exceptions: %s", new Object[]{str, Boolean.valueOf(z)}));
        if (z2 || z) {
            synthesizeSessionFile(file, str, getTrimmedNonFatalFiles(str, listFilesMatching2, i), z2 ? listFilesMatching[0] : null);
        } else {
            c.h().a(CrashlyticsCore.TAG, "No events present for session ID " + str);
        }
        c.h().a(CrashlyticsCore.TAG, "Removing session part files for ID " + str);
        deleteSessionPartFilesFor(str);
    }

    private void synthesizeSessionFile(File file, String str, File[] fileArr, File file2) {
        Closeable clsFileOutputStream;
        Throwable e;
        boolean z = true;
        if (file2 == null) {
            z = false;
        }
        try {
            clsFileOutputStream = new ClsFileOutputStream(getFilesDir(), str);
            try {
                Flushable newInstance = CodedOutputStream.newInstance((OutputStream) clsFileOutputStream);
                c.h().a(CrashlyticsCore.TAG, "Collecting SessionStart data for session ID " + str);
                writeToCosFromFile(newInstance, file);
                newInstance.writeUInt64(4, new Date().getTime() / 1000);
                newInstance.writeBool(5, z);
                writeInitialPartsTo(newInstance, str);
                writeNonFatalEventsTo(newInstance, fileArr, str);
                if (z) {
                    writeToCosFromFile(newInstance, file2);
                }
                newInstance.writeUInt32(11, 1);
                newInstance.writeEnum(12, 3);
                i.a(newInstance, "Error flushing session file stream");
                i.a(clsFileOutputStream, "Failed to close CLS file");
            } catch (Exception e2) {
                e = e2;
                try {
                    c.h().e(CrashlyticsCore.TAG, "Failed to write session file for session ID: " + str, e);
                    ExceptionUtils.writeStackTraceIfNotNull(e, clsFileOutputStream);
                    i.a(null, "Error flushing session file stream");
                    closeWithoutRenamingOrLog(clsFileOutputStream);
                } catch (Throwable th) {
                    e = th;
                    i.a(null, "Error flushing session file stream");
                    i.a(clsFileOutputStream, "Failed to close CLS file");
                    throw e;
                }
            }
        } catch (Exception e3) {
            e = e3;
            clsFileOutputStream = null;
            c.h().e(CrashlyticsCore.TAG, "Failed to write session file for session ID: " + str, e);
            ExceptionUtils.writeStackTraceIfNotNull(e, clsFileOutputStream);
            i.a(null, "Error flushing session file stream");
            closeWithoutRenamingOrLog(clsFileOutputStream);
        } catch (Throwable th2) {
            e = th2;
            clsFileOutputStream = null;
            i.a(null, "Error flushing session file stream");
            i.a(clsFileOutputStream, "Failed to close CLS file");
            throw e;
        }
    }

    private static void writeNonFatalEventsTo(CodedOutputStream codedOutputStream, File[] fileArr, String str) {
        Arrays.sort(fileArr, i.a);
        for (File name : fileArr) {
            try {
                c.h().a(CrashlyticsCore.TAG, String.format(Locale.US, "Found Non Fatal for session ID %s in %s ", new Object[]{str, name.getName()}));
                writeToCosFromFile(codedOutputStream, name);
            } catch (Throwable e) {
                c.h().e(CrashlyticsCore.TAG, "Error writting non-fatal to session.", e);
            }
        }
    }

    private void writeInitialPartsTo(CodedOutputStream codedOutputStream, String str) throws IOException {
        for (String str2 : INITIAL_SESSION_PART_TAGS) {
            File[] listFilesMatching = listFilesMatching(new FileNameContainsFilter(str + str2));
            if (listFilesMatching.length == 0) {
                c.h().e(CrashlyticsCore.TAG, "Can't find " + str2 + " data for session ID " + str, null);
            } else {
                c.h().a(CrashlyticsCore.TAG, "Collecting " + str2 + " data for session ID " + str);
                writeToCosFromFile(codedOutputStream, listFilesMatching[0]);
            }
        }
    }

    private static void writeToCosFromFile(CodedOutputStream codedOutputStream, File file) throws IOException {
        Closeable fileInputStream;
        Throwable th;
        if (file.exists()) {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    copyToCodedOutputStream(fileInputStream, codedOutputStream, (int) file.length());
                    i.a(fileInputStream, "Failed to close file input stream.");
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    i.a(fileInputStream, "Failed to close file input stream.");
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = null;
                i.a(fileInputStream, "Failed to close file input stream.");
                throw th;
            }
        }
        c.h().e(CrashlyticsCore.TAG, "Tried to include a file that doesn't exist: " + file.getName(), null);
    }

    private static void copyToCodedOutputStream(InputStream inputStream, CodedOutputStream codedOutputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < bArr.length) {
            int read = inputStream.read(bArr, i2, bArr.length - i2);
            if (read < 0) {
                break;
            }
            i2 += read;
        }
        codedOutputStream.writeRawBytes(bArr);
    }

    private UserMetaData getUserMetaData(String str) {
        return isHandlingException() ? new UserMetaData(this.crashlyticsCore.getUserIdentifier(), this.crashlyticsCore.getUserName(), this.crashlyticsCore.getUserEmail()) : new MetaDataStore(getFilesDir()).readUserData(str);
    }

    private void sendSessionReports() {
        for (File sendSessionRunnable : listCompleteSessionFiles()) {
            this.executorServiceWrapper.executeAsync(new SendSessionRunnable(this.crashlyticsCore, sendSessionRunnable));
        }
    }

    private File getFilesDir() {
        return this.fileStore.a();
    }
}
