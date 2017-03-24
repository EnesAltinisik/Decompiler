package com.mwr.example.sieve;

import android.app.Activity;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class WelcomeActivity extends Activity {
    public static final String PASS = "com.mwr.example.sieve.PASS";
    private EditText entryOne;
    private EditText entryTwo;
    private TextView prompt;
    Intent resultIntent;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        if (VERSION.SDK_INT >= 14) {
            getActionBar().setHomeButtonEnabled(true);
        }
        this.entryOne = (EditText) findViewById(R.id.welcome_edittext_password);
        this.entryTwo = (EditText) findViewById(R.id.welcome_edittext_passwordagain);
        this.prompt = (TextView) findViewById(R.id.welcome_textview_prompt);
    }

    public void onBackPressed() {
        cancel();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_welcome, menu);
        return true;
    }

    public void submit(View view) {
        String one = this.entryOne.getText().toString();
        String two = this.entryTwo.getText().toString();
        boolean meetsStandard = one.matches("[a-zA-Z0-9]+");
        if (one.length() < 16) {
            this.prompt.setText(R.string.text_view_password_tooshort);
        } else if (!meetsStandard) {
            this.prompt.setText(R.string.text_view_password_notstandard);
        } else if (one.equals(two)) {
            this.resultIntent = new Intent(this, MainLoginActivity.class);
            this.resultIntent.putExtra(PASS, one);
            setResult(-1, this.resultIntent);
            finish();
        } else {
            this.prompt.setText(R.string.text_view_password_dontmatch);
        }
    }

    private void cancel() {
        this.resultIntent = new Intent(this, MainLoginActivity.class);
        setResult(0, this.resultIntent);
        finish();
    }
}
