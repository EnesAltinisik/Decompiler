package com.mwr.example.sieve;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.mwr.example.sieve.AuthServiceConnector.ResponseListener;

public class MainLoginActivity extends Activity implements ResponseListener {
    private static final int IS_AUTHENTICATED = 4521387;
    public static final int MAIN_PIN = 2;
    public static final int MAIN_SETTINGS = 3;
    public static final int MAIN_WELCOME = 1;
    private static final int NOT_AUTHENTICATED = 654987;
    private static final int NOT_INITALISED = 923472;
    public static final String PASSWORD = "com.mwr.example.sieve.PASSWORD";
    public static final String PIN = "com.mwr.example.sieve.PIN";
    private static final String TAG = "m_MainLogin";
    EditText entry;
    Button login_button;
    TextView prompt;
    private AuthServiceConnector serviceConnection;
    private int state = NOT_INITALISED;
    private Intent workingIntent = null;
    private String workingPassword = null;

    public void checkKeyResult(boolean status) {
        if (status) {
            loginSuccessful();
        } else {
            loginFailed();
        }
    }

    public void checkPinResult(boolean status) {
    }

    public void connected() {
        this.serviceConnection.checkFirstLaunch();
    }

    public void firstLaunchResult(int status) {
        switch (status) {
            case 31:
                initaliseActivity();
                return;
            case AccessibilityNodeInfoCompat.ACTION_LONG_CLICK /*32*/:
                setPin();
                return;
            case 33:
                welcomeUser();
                return;
            default:
                return;
        }
    }

    private void initaliseActivity() {
        setContentView(R.layout.activity_main_login);
        this.entry = (EditText) findViewById(R.id.mainlogin_edittext_entry);
        this.login_button = (Button) findViewById(R.id.mainlogin_button_login);
        this.prompt = (TextView) findViewById(R.id.mainlogin_textview_prompt);
    }

    public void login(View view) {
        this.workingPassword = this.entry.getText().toString();
        Log.d(TAG, "String enetered: " + this.workingPassword);
        this.serviceConnection.checkKey(this.workingPassword);
        this.login_button.setEnabled(false);
    }

    private void loginSuccessful() {
        this.login_button.setEnabled(true);
        Intent intent = new Intent(this, PWList.class);
        intent.putExtra("com.mwr.example.sieve.KEY", this.workingPassword);
        intent.setFlags(67108864);
        this.state = IS_AUTHENTICATED;
        startActivity(intent);
    }

    private void loginFailed() {
        this.prompt.setText(R.string.error_incorrect_password);
        this.login_button.setEnabled(true);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode) {
            case 1:
                if (resultCode == -1) {
                    this.workingIntent = data;
                    return;
                }
                return;
            case 2:
                if (resultCode == -1) {
                    this.workingIntent = data;
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void onBackPressed() {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        startActivity(intent);
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.serviceConnection = new AuthServiceConnector(this);
        this.state = NOT_AUTHENTICATED;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main_login, menu);
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
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void onPause() {
        super.onPause();
        unbind();
    }

    public void onResume() {
        super.onResume();
        bindService(new Intent(this, AuthService.class), this.serviceConnection, 1);
        switch (this.state) {
            case NOT_AUTHENTICATED /*654987*/:
            case NOT_INITALISED /*923472*/:
                if (this.workingIntent != null) {
                    if (this.workingIntent.getStringExtra(WelcomeActivity.PASS) != null) {
                        this.serviceConnection.setKey(this.workingIntent.getStringExtra(WelcomeActivity.PASS));
                    } else if (this.workingIntent.getStringExtra("com.mwr.example.sieve.PIN") != null) {
                        this.serviceConnection.setPin(this.workingIntent.getStringExtra("com.mwr.example.sieve.PIN"));
                    }
                    this.workingIntent = null;
                    return;
                }
                return;
            case IS_AUTHENTICATED /*4521387*/:
                startActivity(new Intent(this, ShortLoginActivity.class).putExtra("com.mwr.example.sieve.PASSWORD", this.workingPassword));
                return;
            default:
                return;
        }
    }

    protected void onStart() {
        super.onStart();
        startService(new Intent(this, AuthService.class));
    }

    private void openSettings() {
        startActivityForResult(new Intent(this, SettingsActivity.class), 3);
    }

    public void sendFailed() {
        new Builder(this).setMessage(R.string.service_error_cantconnect).setTitle("Error").setPositiveButton("OK", new OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
            }
        }).create().show();
    }

    public void setKeyResult(boolean status) {
        if (!status) {
            sendFailed();
        }
    }

    private void setPin() {
        Intent intent = new Intent(this, PINActivity.class);
        intent.putExtra("com.mwr.example.sieve.REQUEST", PINActivity.REQUEST_ADD);
        startActivityForResult(intent, 2);
    }

    public void setPinResult(boolean status) {
        if (!status) {
            sendFailed();
        }
    }

    private void unbind() {
        unbindService(this.serviceConnection);
    }

    private void welcomeUser() {
        startActivityForResult(new Intent(this, WelcomeActivity.class), 1);
    }
}
