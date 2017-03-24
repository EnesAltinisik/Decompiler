package com.mwr.example.sieve;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;

public class FileBackupProvider extends ContentProvider {
    private static final int DATABASE = 2346456;
    public static final Uri FILE_DATABASE = Uri.parse("content://com.mwr.example.sieve.FileBackupProvider");
    private static final String TAG = "m_FileBackupProvider";
    private UriMatcher sUriMatcher = new UriMatcher(-1);

    public int delete(Uri arg0, String arg1, String[] arg2) {
        return 0;
    }

    public String getType(Uri arg0) {
        return null;
    }

    public Uri insert(Uri arg0, ContentValues arg1) {
        return null;
    }

    public boolean onCreate() {
        this.sUriMatcher.addURI("com.mwr.example.sieve.FileBackupProvider", "*", DATABASE);
        return false;
    }

    public ParcelFileDescriptor openFile(Uri uri, String mode) {
        int modeCode;
        ParcelFileDescriptor parcelFileDescriptor = null;
        if (mode.equals("r")) {
            modeCode = 268435456;
        } else if (mode.equals("rw")) {
            modeCode = 805306368;
        } else if (mode.equals("rwt")) {
            modeCode = 805306368;
        } else {
            Log.w(TAG, "Unrecognised code to open file: " + mode);
            return parcelFileDescriptor;
        }
        try {
            parcelFileDescriptor = ParcelFileDescriptor.open(new File(uri.getPath()), modeCode);
        } catch (FileNotFoundException e) {
            Log.e(TAG, "ERROR: unable to open file: " + e.getMessage());
        }
        return parcelFileDescriptor;
    }

    public Cursor query(Uri arg0, String[] arg1, String arg2, String[] arg3, String arg4) {
        return null;
    }

    public int update(Uri arg0, ContentValues arg1, String arg2, String[] arg3) {
        return 0;
    }
}
