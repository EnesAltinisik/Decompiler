package com.mwr.example.sieve;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;

public class DBContentProvider extends ContentProvider {
    public static final int KEY = 200;
    public static final Uri KEYS_URI = Uri.parse("content://com.mwr.example.sieve.DBContentProvider/Keys");
    public static final int KEY_ID = 230;
    public static final int KEY_PASSWORD = 210;
    public static final int KEY_PIN = 220;
    public static final int PASSWORDS = 100;
    public static final int PASSWORDS_EMAIL = 140;
    public static final int PASSWORDS_ID = 110;
    public static final int PASSWORDS_PASSWORD = 150;
    public static final int PASSWORDS_SERVICE = 120;
    public static final Uri PASSWORDS_URI = Uri.parse("content://com.mwr.example.sieve.DBContentProvider/Passwords");
    public static final int PASSWORDS_USERNAME = 130;
    PWDBHelper pwdb;
    private UriMatcher sUriMatcher = new UriMatcher(-1);

    public int delete(Uri in, String selection, String[] selectionArgs) {
        int type = this.sUriMatcher.match(in);
        if (type == 100) {
            return this.pwdb.getWritableDatabase().delete(PWTable.TABLE_NAME, selection, selectionArgs);
        }
        if (type == KEY) {
            return this.pwdb.getWritableDatabase().delete(PWTable.KEY_TABLE_NAME, selection, selectionArgs);
        }
        return -1;
    }

    public String getType(Uri arg0) {
        return null;
    }

    public Uri insert(Uri in, ContentValues values) {
        int type = this.sUriMatcher.match(in);
        long id = -1;
        if (type == 100) {
            id = this.pwdb.getWritableDatabase().insert(PWTable.TABLE_NAME, null, values);
        } else if (type == KEY) {
            id = this.pwdb.getWritableDatabase().insert(PWTable.KEY_TABLE_NAME, null, values);
        }
        return ContentUris.withAppendedId(in, id);
    }

    public boolean onCreate() {
        this.pwdb = new PWDBHelper(getContext());
        this.sUriMatcher.addURI("com.mwr.example.sieve.DBContentProvider", PWTable.TABLE_NAME, 100);
        this.sUriMatcher.addURI("com.mwr.example.sieve.DBContentProvider", "Keys", KEY);
        return false;
    }

    public Cursor query(Uri in, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        int type = this.sUriMatcher.match(in);
        SQLiteQueryBuilder queryBuilder = new SQLiteQueryBuilder();
        if (type >= 100 && type < KEY) {
            queryBuilder.setTables(PWTable.TABLE_NAME);
        } else if (type >= KEY) {
            queryBuilder.setTables(PWTable.KEY_TABLE_NAME);
        }
        return queryBuilder.query(this.pwdb.getReadableDatabase(), projection, selection, selectionArgs, null, null, sortOrder);
    }

    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        int type = this.sUriMatcher.match(uri);
        if (type == 100) {
            return this.pwdb.getWritableDatabase().update(PWTable.TABLE_NAME, values, selection, selectionArgs);
        }
        if (type == KEY) {
            return this.pwdb.getWritableDatabase().update(PWTable.KEY_TABLE_NAME, values, selection, selectionArgs);
        }
        return -1;
    }
}
