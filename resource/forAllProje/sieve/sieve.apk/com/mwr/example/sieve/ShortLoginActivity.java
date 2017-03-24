package com.mwr.example.sieve;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.mwr.example.sieve.AuthServiceConnector.ResponseListener;

public class ShortLoginActivity extends Activity implements ResponseListener {
    public static final String PASSWORD = "com.mwr.example.sieve.PASSWORD";
    public static final String PIN = "com.mwr.example.sieve.PIN";
    public static final String TAG = "m_ShortLogin";
    private Builder connectionError;
    private String mainKey = null;
    private TextView prompt;
    private EditText pwEntry;
    private AuthServiceConnector serviceConnection;
    private Button submitButton;
    private String workingPIN = null;

    private void unbind() {
        unbindService(this.serviceConnection);
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_short_login);
        this.serviceConnection = new AuthServiceConnector(this);
        this.mainKey = getIntent().getStringExtra("com.mwr.example.sieve.PASSWORD");
        this.pwEntry = (EditText) findViewById(R.id.shortlogin_edittext_entry);
        this.prompt = (TextView) findViewById(R.id.shortlogin_textview_prompt);
        this.submitButton = (Button) findViewById(R.id.shortlogin_button_submit);
        this.connectionError = new Builder(this);
        this.connectionError.setMessage(R.string.service_error_cantconnect).setTitle("Error");
        this.connectionError.setPositiveButton("OK", new OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {
            }
        });
        this.connectionError.create();
    }

    public void onPause() {
        super.onPause();
        unbind();
    }

    public void onResume() {
        super.onResume();
        bindService(new Intent(this, AuthService.class), this.serviceConnection, 1);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_short_login, menu);
        return true;
    }

    public void submit(View view) {
        this.workingPIN = this.pwEntry.getText().toString();
        Log.d(TAG, "user has entered a pin: " + this.workingPIN);
        this.serviceConnection.checkPin(this.workingPIN);
        this.submitButton.setEnabled(false);
    }

    public void onBackPressed() {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        startActivity(intent);
    }

    public void loginSuccessful() {
        this.submitButton.setEnabled(true);
        Intent intent = new Intent(this, PWList.class);
        intent.putExtra("com.mwr.example.sieve.KEY", this.mainKey);
        startActivity(intent);
    }

    public void loginFailed() {
        this.prompt.setText(R.string.error_incorrect_password);
        this.submitButton.setEnabled(true);
    }

    public void connected() {
        this.submitButton.setEnabled(true);
    }

    public void setKeyResult(boolean stauts) {
        Log.wtf(TAG, "called setKeyResult?");
    }

    public void setPinResult(boolean status) {
        Log.wtf(TAG, "called setPinResult?");
    }

    public void checkKeyResult(boolean status) {
        Log.wtf(TAG, "called checkKeyResult?");
    }

    public void checkPinResult(boolean status) {
        if (status) {
            loginSuccessful();
        } else {
            loginFailed();
        }
    }

    public void firstLaunchResult(int status) {
        Log.wtf(TAG, "called firstLaunchResult?");
    }

    public void sendFailed() {
        this.connectionError.show();
    }
}
