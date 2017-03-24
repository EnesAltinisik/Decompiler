package com.mwr.example.sieve;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.ContentValues;
import android.content.CursorLoader;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import com.mwr.example.sieve.CryptoServiceConnector.ResponseListener;
import com.mwr.example.sieve.NetBackupHandler.ResultListener;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Timestamp;
import java.util.Date;
import java.util.LinkedList;

public class SettingsActivity extends Activity implements ResponseListener, ResultListener {
    private static final String BACKUP_FILENAME = "Backup";
    private static final int BACKUP_TO_NET = 64523;
    private static final int BACKUP_TO_SD = 2435;
    public static final int FILE = 293;
    private static final String NO = "Cancel";
    private static final int NOT_RUNNING = 834556;
    public static final String PASSWORD = "com.mwr.example.sieve.PASSWORD";
    public static final int PIN_REQUEST = 456;
    private static final String TAG = "m_Settings";
    private static final String YES = "Yes";
    private static final int writeable = 1;
    private String PIN;
    Builder backupNet;
    Builder backupSD;
    private Builder connectionError;
    Builder deleteALL;
    Builder errorCantChangePin;
    Builder errorCantRead;
    Builder errorDBEmpty;
    private LinkedList<PasswordEntry> ll;
    private String mainPassword;
    private NetBackupHandler netBackup;
    Builder netRestore;
    private StringBuffer out;
    Builder restore;
    private int runningState = NOT_RUNNING;
    private CryptoServiceConnector serviceConnection = new CryptoServiceConnector(this);

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        this.netBackup = new NetBackupHandler("10.0.2.2", "8001", this);
        this.backupSD = new Builder(this);
        this.backupSD.setMessage(R.string.settings_confirm_backup).setTitle("Confirm");
        this.backupSD.setPositiveButton(YES, new OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {
                SettingsActivity.this.backupToSD();
            }
        });
        this.backupSD.setNegativeButton(NO, new OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {
            }
        });
        this.backupSD.create();
        this.deleteALL = new Builder(this);
        this.deleteALL.setMessage(R.string.settings_confirm_delete).setTitle("Confirm");
        this.deleteALL.setPositiveButton(YES, new OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {
                SettingsActivity.this.deleteAll();
            }
        });
        this.deleteALL.setNegativeButton(NO, new OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {
            }
        });
        this.deleteALL.create();
        this.restore = new Builder(this);
        this.restore.setMessage(R.string.settings_confirm_restore).setTitle("Restore");
        this.restore.setPositiveButton(YES, new OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {
                SettingsActivity.this.restoreFromSD();
            }
        });
        this.restore.setNegativeButton(NO, new OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {
            }
        });
        this.restore.create();
        this.netRestore = new Builder(this);
        this.netRestore.setMessage(R.string.settings_confirm_netrestore).setTitle("Restore");
        this.netRestore.setPositiveButton(YES, new OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {
                SettingsActivity.this.restoreFromNet();
            }
        });
        this.netRestore.setNegativeButton(NO, new OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {
            }
        });
        this.netRestore.create();
        this.backupNet = new Builder(this);
        this.backupNet.setMessage(R.string.settings_confirm_netbackup).setTitle(BACKUP_FILENAME);
        this.backupNet.setPositiveButton(YES, new OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {
                SettingsActivity.this.backupToNet();
            }
        });
        this.backupNet.setNegativeButton(NO, new OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {
            }
        });
        this.backupNet.create();
        this.errorDBEmpty = new Builder(this);
        this.errorDBEmpty.setMessage(R.string.settings_error_dbempty).setTitle("Error");
        this.errorDBEmpty.setPositiveButton("OK", new OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {
            }
        });
        this.errorDBEmpty.create();
        this.errorCantRead = new Builder(this);
        this.errorCantRead.setMessage(R.string.settings_error_cantread).setTitle("Error");
        this.errorCantRead.setPositiveButton("OK", new OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {
            }
        });
        this.errorCantRead.create();
        this.errorCantChangePin = new Builder(this);
        this.errorCantChangePin.setMessage(R.string.settings_error_cantchangepin).setTitle("Error");
        this.errorCantChangePin.setPositiveButton("OK", new OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {
            }
        });
        this.errorCantChangePin.create();
        this.connectionError = new Builder(this);
        this.connectionError.setMessage(R.string.service_error_cantconnect).setTitle("Error");
        this.connectionError.setPositiveButton("OK", new OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {
            }
        });
        this.connectionError.create();
        if (VERSION.SDK_INT >= 14) {
            getActionBar().setHomeButtonEnabled(true);
        }
    }

    public void onPause() {
        super.onPause();
        unbind();
    }

    public void onResume() {
        super.onResume();
        bindService(new Intent(this, CryptoService.class), this.serviceConnection, 1);
    }

    private void unbind() {
        unbindService(this.serviceConnection);
    }

    private boolean checkSDState(int code) {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_settings, menu);
        return true;
    }

    public void onBackPressed() {
        finish();
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case 16908332:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void changePIN(View view) {
        Cursor k = new CursorLoader(this, DBContentProvider.KEYS_URI, null, null, null, null).loadInBackground();
        k.moveToFirst();
        this.PIN = k.getString(k.getColumnIndex(PWTable.KEY_COLUMN_NAME_SHORT));
        Intent intent = new Intent(this, PINActivity.class);
        intent.putExtra("com.mwr.example.sieve.PIN", this.PIN);
        intent.putExtra("com.mwr.example.sieve.REQUEST", PINActivity.REQUEST_EDIT);
        startActivityForResult(intent, PIN_REQUEST);
    }

    private void backupToSD() {
        if (this.runningState == NOT_RUNNING && checkSDState(1)) {
            this.runningState = BACKUP_TO_SD;
            getBackup();
        }
    }

    private void restoreFromSD() {
        startActivityForResult(new Intent(this, FileSelectActivity.class), FILE);
    }

    private void deleteAll() {
        getContentResolver().delete(DBContentProvider.PASSWORDS_URI, null, null);
        Toast.makeText(getApplicationContext(), "Database deleted", 0).show();
    }

    private void backupToNet() {
        if (this.runningState == NOT_RUNNING) {
            this.runningState = BACKUP_TO_NET;
            getBackup();
        }
    }

    private void restoreFromNet() {
        this.netBackup.performNetRestore();
    }

    private void getBackup() {
        this.ll = new LinkedList();
        this.out = new StringBuffer("<Passwords");
        Cursor c = new CursorLoader(this, DBContentProvider.PASSWORDS_URI, null, null, null, null).loadInBackground();
        Cursor k = new CursorLoader(this, DBContentProvider.KEYS_URI, null, null, null, null).loadInBackground();
        k.moveToFirst();
        String key = k.getString(k.getColumnIndex(PWTable.KEY_COLUMN_NAME_MAIN));
        this.out.append(" Key=\"" + key + "\" Pin=\"" + k.getString(k.getColumnIndex(PWTable.KEY_COLUMN_NAME_SHORT)) + "\">");
        if (c.getCount() > 0) {
            c.moveToFirst();
            for (int i = 0; i < c.getCount(); i++) {
                String service = c.getString(c.getColumnIndex(PWTable.COLUMN_NAME_SERVICE));
                String username = c.getString(c.getColumnIndex(PWTable.COLUMN_NAME_USERNAME));
                String email = c.getString(c.getColumnIndex(PWTable.COLUMN_NAME_SERVICE));
                byte[] password = c.getBlob(c.getColumnIndex(PWTable.COLUMN_NAME_PASSWORD));
                this.ll.offer(new PasswordEntry(service, username, email, null));
                this.serviceConnection.sendForDecryption(key.substring(0, 16), password, 0);
                c.moveToNext();
            }
            return;
        }
        Toast.makeText(getApplicationContext(), "Database exported", 0).show();
    }

    private void finaliseInsert(byte[] password) {
        PasswordEntry pe = (PasswordEntry) this.ll.poll();
        ContentValues out = new ContentValues();
        out.put(PWTable.COLUMN_NAME_SERVICE, pe.service);
        out.put(PWTable.COLUMN_NAME_USERNAME, pe.username);
        out.put(PWTable.COLUMN_NAME_PASSWORD, password);
        out.put(PWTable.COLUMN_NAME_EMAIL, pe.email);
        getContentResolver().insert(DBContentProvider.PASSWORDS_URI, out);
        if (this.ll.isEmpty()) {
            finaliseRestore();
        }
    }

    private void finaliseRestore() {
        Toast.makeText(getApplicationContext(), "Database Restored", 0).show();
        startActivity(new Intent(this, MainLoginActivity.class));
    }

    private boolean changePIN(String pin) {
        ContentValues out = new ContentValues();
        out.put(PWTable.KEY_COLUMN_NAME_SHORT, pin);
        String[] selectionArgs = new String[]{this.PIN};
        if (getContentResolver().update(DBContentProvider.KEYS_URI, out, "pin = ?", selectionArgs) > 0) {
            return true;
        }
        return false;
    }

    private void restoreFromString(String data) {
        try {
            getRestore(new ByteArrayInputStream(data.getBytes()));
        } catch (Exception e) {
            Log.e(TAG, "ERROR: Unable to read / process data from server: " + e.getMessage());
            this.errorCantRead.show();
        }
    }

    private void restoreFromFile(String filename) {
        try {
            getRestore(getContentResolver().openInputStream(Uri.withAppendedPath(FileBackupProvider.FILE_DATABASE, filename.substring(1))));
        } catch (Exception e) {
            this.errorCantRead.show();
        }
    }

    private void getRestore(InputStream is) throws Exception {
        BufferedInputStream bis = new BufferedInputStream(is);
        bis.mark(99999999);
        this.mainPassword = DBParser.getKey(bis);
        bis.reset();
        this.PIN = DBParser.getPIN(bis);
        bis.reset();
        this.ll = (LinkedList) DBParser.readFile(bis);
        getContentResolver().delete(DBContentProvider.KEYS_URI, null, null);
        getContentResolver().delete(DBContentProvider.PASSWORDS_URI, null, null);
        ContentValues out = new ContentValues();
        out.put(PWTable.KEY_COLUMN_NAME_MAIN, this.mainPassword);
        out.put(PWTable.KEY_COLUMN_NAME_SHORT, this.PIN);
        getContentResolver().insert(DBContentProvider.KEYS_URI, out);
        for (int i = 0; i < this.ll.size(); i++) {
            this.serviceConnection.sendForEncryption(this.mainPassword.substring(0, 16), ((PasswordEntry) this.ll.get(i)).password, 0);
        }
    }

    private void finaliseEntry(String password) {
        PasswordEntry pe = (PasswordEntry) this.ll.poll();
        pe.password = password;
        this.out.append(DBParser.processElement(pe));
        if (this.ll.isEmpty()) {
            finaliseOutput();
        }
    }

    private void finaliseOutput() {
        this.out.append("</Passwords>");
        switch (this.runningState) {
            case BACKUP_TO_SD /*2435*/:
                finaliseBackupToSD();
                break;
            case BACKUP_TO_NET /*64523*/:
                this.netBackup.performNetBackup(this.out.toString());
                break;
        }
        this.runningState = NOT_RUNNING;
    }

    private void finaliseBackupToSD() {
        File file = new File(getExternalFilesDir(null), "Backup (" + new Timestamp(new Date().getTime()).toString().replace(':', '-') + ").xml");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            OutputStream os = new FileOutputStream(file);
            os.write(this.out.toString().getBytes());
            os.close();
            Toast.makeText(getApplicationContext(), "Database exported", 0).show();
        } catch (IOException e) {
            Log.e(TAG, "ERROR: Unable to write to file");
            Log.e(TAG, e.getMessage());
        }
    }

    public void deleteAll(View view) {
        this.deleteALL.show();
    }

    public void backupToSD(View view) {
        this.backupSD.show();
    }

    public void restoreFromSD(View view) {
        this.restore.show();
    }

    public void backupToNet(View view) {
        this.backupNet.show();
    }

    public void restoreFromNet(View view) {
        this.netRestore.show();
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == FILE) {
            if (resultCode == -1) {
                restoreFromFile(data.getStringExtra(FileSelectActivity.FILE));
            }
        } else if (requestCode == PIN_REQUEST && resultCode == -1 && !changePIN(data.getStringExtra("com.mwr.example.sieve.PIN"))) {
            this.errorCantChangePin.show();
        }
    }

    public void onTaskFinish(int task, String result) {
        switch (task) {
            case NetBackupHandler.OPERATION_FAILED /*23485*/:
                Log.e(TAG, "Error during backup.");
                return;
            case NetBackupHandler.BACKUP_SUCCESS /*459835*/:
                Toast.makeText(getApplicationContext(), "Database exported", 0).show();
                return;
            case NetBackupHandler.RESTORE_SUCCESS /*745745*/:
                restoreFromString(result);
                return;
            default:
                return;
        }
    }

    public void decryptionReturned(String result, int code) {
        finaliseEntry(result);
    }

    public void encryptionReturned(byte[] result, int code) {
        finaliseInsert(result);
    }

    public void sendFailed() {
        this.connectionError.show();
    }

    public void connected() {
    }
}
