package com.mwr.example.sieve;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class AddEntryActivity extends Activity {
    public static final String ENTRY = "com.mwr.example.sieve.ENTRY";
    public static final String REQUEST = "com.mwr.example.sieve.REQUEST";
    public static final int REQUEST_ADD = 4365;
    public static final int REQUEST_EDIT = 2346;
    private static final String TAG = "m_AddEntry";
    Builder ausDelete;
    private EditText editEmail;
    private EditText editPassword;
    private EditText editPasswordAgain;
    private EditText editService;
    private EditText editUsername;
    private TextView prompt;
    private int requestCode = 0;
    Intent resultIntent;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_entry);
        this.editService = (EditText) findViewById(R.id.addentry_edittext_service);
        this.editUsername = (EditText) findViewById(R.id.addentry_edittext_username);
        this.editEmail = (EditText) findViewById(R.id.addentry_edittext_email);
        this.editPassword = (EditText) findViewById(R.id.addentry_edittext_password);
        this.editPasswordAgain = (EditText) findViewById(R.id.addentry_edittext_passwordagain);
        this.prompt = (TextView) findViewById(R.id.addentry_textview_prompt);
        this.ausDelete = new Builder(this);
        this.ausDelete.setMessage(R.string.addentry_confirm_delete).setTitle("Confirm");
        this.ausDelete.setPositiveButton("Yes", new OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {
                AddEntryActivity.this.returnForDelete();
            }
        });
        this.ausDelete.setNegativeButton("No", new OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {
            }
        });
        this.ausDelete.create();
        this.resultIntent = getIntent();
        if (this.resultIntent == null) {
            Log.e(TAG, "requestIntent = null");
        }
        this.requestCode = this.resultIntent.getIntExtra("com.mwr.example.sieve.REQUEST", 0);
        switch (this.requestCode) {
            case REQUEST_EDIT /*2346*/:
                fillData((PasswordEntry) this.resultIntent.getParcelableExtra(ENTRY));
                break;
        }
        if (VERSION.SDK_INT >= 14) {
            getActionBar().setHomeButtonEnabled(true);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        switch (this.requestCode) {
            case REQUEST_EDIT /*2346*/:
                getMenuInflater().inflate(R.menu.activity_add_entry_edit, menu);
                break;
        }
        getMenuInflater().inflate(R.menu.activity_add_entry_add, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case 16908332:
                cancel();
                return true;
            case R.id.menu_add_delete:
                this.ausDelete.show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void onBackPressed() {
        cancel();
    }

    private void fillData(PasswordEntry pe) {
        this.editService.setText(pe.service);
        this.editUsername.setText(pe.username);
        this.editEmail.setText(pe.email);
        this.editPassword.setText(pe.password);
        this.editPasswordAgain.setText(pe.password);
    }

    public void save(View view) {
        returnToActivity();
    }

    private void returnForDelete() {
        this.resultIntent = new Intent(this, PWList.class);
        setResult(-1, this.resultIntent);
        finish();
    }

    private void returnToActivity() {
        String service = this.editService.getText().toString();
        String username = this.editUsername.getText().toString();
        String email = this.editEmail.getText().toString();
        String one = this.editPassword.getText().toString();
        String two = this.editPasswordAgain.getText().toString();
        if (one == null || one.equals("")) {
            this.prompt.setText(R.string.error_incorrect_password);
        } else if (!one.equals(two)) {
            this.prompt.setText(R.string.text_view_password_dontmatch);
        } else if (one.length() < 4) {
            this.prompt.setText(R.string.error_incorrect_password);
        } else {
            this.resultIntent.putExtra(ENTRY, new PasswordEntry(service, username, email, one));
            setResult(-1, this.resultIntent);
            finish();
        }
    }

    private void cancel() {
        this.resultIntent = new Intent(this, PWList.class);
        setResult(0, this.resultIntent);
        finish();
    }

    public void cancel(View view) {
        cancel();
    }
}
