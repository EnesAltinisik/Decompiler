package com.mwr.example.sieve;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ContentValues;
import android.content.CursorLoader;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.database.Cursor;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.widget.SimpleCursorAdapter;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.mwr.example.sieve.CryptoServiceConnector.ResponseListener;

public class PWList extends Activity implements OnItemClickListener, ResponseListener, OnItemLongClickListener {
    public static final int FOR_ACCESS = 653;
    public static final int FOR_EDIT = 468;
    public static final int FOR_INSERT = 735;
    public static final String KEY = "com.mwr.example.sieve.KEY";
    private static final int PWLIST_ADD = 1;
    private static final int PWLIST_EDIT = 2;
    private static final int PWLIST_SETTINGS = 3;
    public static final String REQUEST_TYPE = "com.mwr.example.sieve.REQUEST_TYPE";
    public static final String STRING = "com.mwr.example.sieve.STRING";
    private static final String TAG = "m_PWList";
    private String MainPassword;
    private SimpleCursorAdapter adapter = null;
    Builder builder;
    AlertDialog canCon;
    AlertDialog cannotCon;
    private Builder connectionError;
    private TextView prompt;
    private ListView pwList;
    private CryptoServiceConnector serviceConnection;
    private PasswordEntry workingEntry;
    private int workingRow = -1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pwlist);
        this.MainPassword = getIntent().getStringExtra("com.mwr.example.sieve.KEY");
        this.serviceConnection = new CryptoServiceConnector(this);
        this.adapter = new SimpleCursorAdapter(this, 17367044, null, new String[]{PWTable.COLUMN_NAME_SERVICE, PWTable.COLUMN_NAME_USERNAME}, new int[]{16908308, 16908309}, 2);
        this.pwList = (ListView) findViewById(R.id.pwlist_list_pwlist);
        this.pwList.setAdapter(this.adapter);
        this.pwList.setOnItemClickListener(this);
        this.pwList.setOnItemLongClickListener(this);
        this.prompt = (TextView) findViewById(R.id.pwlist_textview_prompt);
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

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_pwlist, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case 16908332:
                onBackPressed();
                return true;
            case R.id.menu_settings:
                openSettings();
                return true;
            case R.id.menu_add:
                addEntry();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void onBackPressed() {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        intent.setFlags(67108864);
        startActivity(intent);
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case 1:
            case 2:
                if (resultCode == -1) {
                    PasswordEntry temp = (PasswordEntry) data.getParcelableExtra(AddEntryActivity.ENTRY);
                    if (temp == null) {
                        deleteEntry(this.workingRow);
                        return;
                    }
                    this.workingEntry = temp;
                    if (requestCode == 1) {
                        this.serviceConnection.sendForEncryption(this.MainPassword, this.workingEntry.password, FOR_INSERT);
                        return;
                    } else if (requestCode == 2) {
                        this.serviceConnection.sendForEncryption(this.MainPassword, this.workingEntry.password, FOR_EDIT);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                return;
        }
    }

    public void connected() {
        populateList();
    }

    public void sendFailed() {
        this.connectionError.show();
    }

    public void decryptionReturned(String result, int code) {
        switch (code) {
            case FOR_EDIT /*468*/:
                this.workingEntry.password = result;
                Intent intent = new Intent(this, AddEntryActivity.class);
                intent.putExtra(AddEntryActivity.ENTRY, this.workingEntry);
                intent.putExtra("com.mwr.example.sieve.REQUEST", AddEntryActivity.REQUEST_EDIT);
                intent.putExtra(REQUEST_TYPE, FOR_EDIT);
                startActivityForResult(intent, 2);
                return;
            case FOR_ACCESS /*653*/:
                ((ClipboardManager) getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(PWTable.KEY_COLUMN_NAME_MAIN, result));
                Toast.makeText(getApplicationContext(), "Password Copied to clipboard", 0).show();
                return;
            default:
                return;
        }
    }

    public void encryptionReturned(byte[] result, int code) {
        if (finaliseEntry(result, code)) {
            populateList();
            if (code == FOR_INSERT) {
                Toast.makeText(getApplicationContext(), "Entry Added", 0).show();
                return;
            } else if (code == FOR_EDIT) {
                Toast.makeText(getApplicationContext(), "Entry Updated", 0).show();
                return;
            } else {
                return;
            }
        }
        Log.e(TAG, "entry to db failed!");
    }

    private void unbind() {
        unbindService(this.serviceConnection);
    }

    private void populateList() {
        Cursor c = new CursorLoader(this, DBContentProvider.PASSWORDS_URI, null, null, null, PWTable.COLUMN_NAME_SERVICE).loadInBackground();
        this.adapter.changeCursor(c);
        if (c.getCount() > 0) {
            this.prompt.setVisibility(4);
        } else {
            this.prompt.setVisibility(0);
        }
    }

    private boolean finaliseEntry(byte[] encryptedString, int code) {
        switch (code) {
            case FOR_EDIT /*468*/:
                return finaliseUpdate(encryptedString);
            case FOR_INSERT /*735*/:
                return finaliseInsert(encryptedString);
            default:
                Log.e(TAG, "unrecognised MSG_TYPE for finalisedEntry: " + code);
                return false;
        }
    }

    private boolean finaliseInsert(byte[] encryptedString) {
        ContentValues out = new ContentValues();
        out.put(PWTable.COLUMN_NAME_SERVICE, this.workingEntry.service);
        out.put(PWTable.COLUMN_NAME_USERNAME, this.workingEntry.username);
        out.put(PWTable.COLUMN_NAME_PASSWORD, encryptedString);
        out.put(PWTable.COLUMN_NAME_EMAIL, this.workingEntry.email);
        return getContentResolver().insert(DBContentProvider.PASSWORDS_URI, out) != null;
    }

    private boolean finaliseUpdate(byte[] encryptedString) {
        String[] selectionArgs = new String[]{String.valueOf(this.workingRow)};
        if (getContentResolver().delete(DBContentProvider.PASSWORDS_URI, "_id = ?", selectionArgs) == 1) {
            return finaliseInsert(encryptedString);
        }
        Log.e(TAG, "failed to delete entry from database");
        return false;
    }

    private void deleteEntry(int id) {
        String[] selectionArgs = new String[]{String.valueOf(id)};
        getContentResolver().delete(DBContentProvider.PASSWORDS_URI, "_id = ?", selectionArgs);
        Toast.makeText(getApplicationContext(), "Entry deleted", 0).show();
        populateList();
    }

    private void addEntry() {
        Intent intent = new Intent(this, AddEntryActivity.class);
        intent.putExtra("com.mwr.example.sieve.REQUEST", AddEntryActivity.REQUEST_ADD);
        intent.putExtra(REQUEST_TYPE, FOR_INSERT);
        startActivityForResult(intent, 1);
    }

    private void openSettings() {
        startActivityForResult(new Intent(this, SettingsActivity.class), 3);
    }

    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int element, long b) {
        Cursor c = this.adapter.getCursor();
        c.moveToPosition(element);
        this.workingRow = c.getInt(c.getColumnIndex("_id"));
        this.workingEntry = new PasswordEntry(c.getString(c.getColumnIndex(PWTable.COLUMN_NAME_SERVICE)), c.getString(c.getColumnIndex(PWTable.COLUMN_NAME_USERNAME)), c.getString(c.getColumnIndex(PWTable.COLUMN_NAME_EMAIL)), null);
        this.serviceConnection.sendForDecryption(this.MainPassword, c.getBlob(c.getColumnIndex(PWTable.COLUMN_NAME_PASSWORD)), FOR_EDIT);
        return false;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int element, long b) {
        Cursor c = this.adapter.getCursor();
        c.moveToPosition(element);
        this.serviceConnection.sendForDecryption(this.MainPassword, c.getBlob(c.getColumnIndex(PWTable.COLUMN_NAME_PASSWORD)), FOR_ACCESS);
    }
}
