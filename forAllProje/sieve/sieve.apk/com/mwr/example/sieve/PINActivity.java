package com.mwr.example.sieve;

import android.app.Activity;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.regex.Pattern;

public class PINActivity extends Activity {
    public static final String PIN = "com.mwr.example.sieve.PIN";
    public static final String REQUEST = "com.mwr.example.sieve.REQUEST";
    public static final int REQUEST_ADD = 432987;
    public static final int REQUEST_EDIT = 92635;
    private String currentPIN = null;
    private EditText entryOne;
    private EditText entryThree;
    private EditText entryTwo;
    private TextView prompt;
    private int requestCode;
    Intent resultIntent;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pin);
        this.entryOne = (EditText) findViewById(R.id.pinentry_edittext_pin);
        this.entryTwo = (EditText) findViewById(R.id.pinentry_edittext_pinagain);
        this.entryThree = (EditText) findViewById(R.id.pinentry_edittext_pinold);
        this.prompt = (TextView) findViewById(R.id.pinentry_textview_prompt);
        Intent requestIntent = getIntent();
        this.requestCode = requestIntent.getIntExtra("com.mwr.example.sieve.REQUEST", 0);
        switch (this.requestCode) {
            case REQUEST_EDIT /*92635*/:
                this.currentPIN = requestIntent.getStringExtra("com.mwr.example.sieve.PIN");
                break;
            case REQUEST_ADD /*432987*/:
                ((TextView) findViewById(R.id.text_view_pin_password_old)).setVisibility(4);
                ((EditText) findViewById(R.id.pinentry_edittext_pinold)).setVisibility(4);
                break;
        }
        if (VERSION.SDK_INT >= 14) {
            getActionBar().setHomeButtonEnabled(true);
        }
    }

    public void onBackPressed() {
        cancel();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_pin, menu);
        return true;
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

    public void submit(View view) {
        switch (this.requestCode) {
            case REQUEST_EDIT /*92635*/:
                submitEdit();
                return;
            case REQUEST_ADD /*432987*/:
                submitEntry();
                return;
            default:
                return;
        }
    }

    private void submitEdit() {
        String one = this.entryOne.getText().toString();
        String two = this.entryTwo.getText().toString();
        String three = this.entryThree.getText().toString();
        boolean hasSpecialChar = Pattern.compile("[^0-9]").matcher(one).find();
        if (!three.equals(this.currentPIN)) {
            this.prompt.setText(R.string.text_view_pin_notold);
        } else if (one.length() != 4) {
            this.prompt.setText(R.string.text_view_pin_tooshort);
        } else if (hasSpecialChar) {
            this.prompt.setText(R.string.text_view_pin_notstandard);
        } else if (one.equals(two)) {
            this.resultIntent = new Intent(this, MainLoginActivity.class);
            this.resultIntent.putExtra("com.mwr.example.sieve.PIN", one);
            setResult(-1, this.resultIntent);
            finish();
        } else {
            this.prompt.setText(R.string.text_view_pin_dontmatch);
        }
    }

    private void submitEntry() {
        String one = this.entryOne.getText().toString();
        String two = this.entryTwo.getText().toString();
        boolean hasSpecialChar = Pattern.compile("[^0-9]").matcher(one).find();
        if (one.length() != 4) {
            this.prompt.setText(R.string.text_view_pin_tooshort);
        } else if (hasSpecialChar) {
            this.prompt.setText(R.string.text_view_pin_notstandard);
        } else if (one.equals(two)) {
            this.resultIntent = new Intent(this, MainLoginActivity.class);
            this.resultIntent.putExtra("com.mwr.example.sieve.PIN", one);
            setResult(-1, this.resultIntent);
            finish();
        } else {
            this.prompt.setText(R.string.text_view_pin_dontmatch);
        }
    }

    private void cancel() {
        this.resultIntent = new Intent(this, MainLoginActivity.class);
        setResult(0, this.resultIntent);
        finish();
    }
}
