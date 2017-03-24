package com.mwr.example.sieve;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ContentValues;
import android.content.CursorLoader;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.app.NotificationCompat.Builder;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.util.Log;

public class AuthService extends Service {
    static final int MSG_CHECK = 2354;
    static final int MSG_CHECK_IF_INITALISED = 2;
    static final int MSG_FIRST_LAUNCH = 4;
    static final int MSG_SAY_HELLO = 1;
    static final int MSG_SET = 6345;
    static final int MSG_UNREGISTER = -1;
    public static final String PASSWORD = "com.mwr.example.sieve.PASSWORD";
    public static final String PIN = "com.mwr.example.sieve.PIN";
    private static final String TAG = "m_AuthService";
    static final int TYPE_KEY = 7452;
    static final int TYPE_PIN = 9234;
    private int NOTIFICATION = R.string.app_name;
    private NotificationManager nManager;
    private Messenger responseHandler;
    private Messenger serviceHandler;
    private Looper serviceLooper;

    private final class MessageHandler extends Handler {
        public MessageHandler(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message msg) {
            AuthService.this.responseHandler = msg.replyTo;
            Bundle returnBundle = msg.obj;
            int responseCode;
            int returnVal;
            switch (msg.what) {
                case 4:
                    if (!AuthService.this.checkKeyExists()) {
                        responseCode = 33;
                    } else if (AuthService.this.checkPinExists()) {
                        responseCode = 31;
                    } else {
                        responseCode = 32;
                    }
                    sendResponseMessage(3, responseCode, 1, null);
                    return;
                case AuthService.MSG_CHECK /*2354*/:
                    if (msg.arg1 == AuthService.TYPE_KEY) {
                        responseCode = 42;
                        if (AuthService.this.verifyKey(returnBundle.getString("com.mwr.example.sieve.PASSWORD"))) {
                            AuthService.this.showNotification();
                            returnVal = 0;
                        } else {
                            returnVal = 1;
                        }
                    } else if (msg.arg1 == AuthService.TYPE_PIN) {
                        responseCode = 41;
                        if (AuthService.this.verifyPin(returnBundle.getString("com.mwr.example.sieve.PIN"))) {
                            returnBundle = new Bundle();
                            returnBundle.putString("com.mwr.example.sieve.PASSWORD", AuthService.this.getKey());
                            returnVal = 0;
                        } else {
                            returnVal = 1;
                        }
                    } else {
                        sendUnrecognisedMessage();
                        return;
                    }
                    sendResponseMessage(5, responseCode, returnVal, returnBundle);
                    return;
                case AuthService.MSG_SET /*6345*/:
                    if (msg.arg1 == AuthService.TYPE_KEY) {
                        responseCode = 42;
                        if (AuthService.this.setKey(returnBundle.getString("com.mwr.example.sieve.PASSWORD"))) {
                            returnVal = 0;
                        } else {
                            returnVal = 1;
                        }
                    } else if (msg.arg1 == AuthService.TYPE_PIN) {
                        responseCode = 41;
                        if (AuthService.this.setPin(returnBundle.getString("com.mwr.example.sieve.PIN"))) {
                            returnVal = 0;
                        } else {
                            returnVal = 1;
                        }
                    } else {
                        sendUnrecognisedMessage();
                        return;
                    }
                    sendResponseMessage(4, responseCode, returnVal, null);
                    return;
                default:
                    Log.e(AuthService.TAG, "Error: unrecognized command: " + msg.what);
                    sendUnrecognisedMessage();
                    super.handleMessage(msg);
                    return;
            }
        }

        private void sendResponseMessage(int command, int arg1, int arg2, Bundle bundle) {
            try {
                Message msg = Message.obtain(null, command, arg1, arg2);
                if (bundle != null) {
                    msg.setData(bundle);
                }
                AuthService.this.responseHandler.send(msg);
            } catch (RemoteException e) {
                Log.e(AuthService.TAG, "Unable to send message: " + command);
            }
        }

        private void sendUnrecognisedMessage() {
            try {
                AuthService.this.responseHandler.send(Message.obtain(null, 111111, 122222, 1, null));
            } catch (RemoteException e) {
                Log.e(AuthService.TAG, "Unable to send message");
            }
        }
    }

    public void onCreate() {
        this.nManager = (NotificationManager) getSystemService("notification");
        HandlerThread thread = new HandlerThread(TAG, 10);
        thread.start();
        this.serviceLooper = thread.getLooper();
        this.serviceHandler = new Messenger(new MessageHandler(this.serviceLooper));
    }

    public IBinder onBind(Intent arg0) {
        return this.serviceHandler.getBinder();
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        return 1;
    }

    public void onDestroy() {
        this.nManager.cancelAll();
    }

    private void showNotification() {
        Builder builder = new Builder(this).setSmallIcon(R.drawable.ic_launcher).setContentTitle(getText(R.string.app_name)).setOngoing(true).setContentText("Click to access your passwords");
        Intent resultIntent = new Intent(this, MainLoginActivity.class);
        resultIntent.addFlags(AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_START);
        builder.setContentIntent(PendingIntent.getActivity(getApplicationContext(), 0, resultIntent, 268435456));
        this.nManager.notify(this.NOTIFICATION, builder.build());
    }

    private boolean verifyKey(String key) {
        return new CursorLoader(this, DBContentProvider.KEYS_URI, new String[]{PWTable.KEY_COLUMN_NAME_MAIN}, "Password = ?", new String[]{key}, null).loadInBackground().getCount() == 1;
    }

    private boolean verifyPin(String PIN) {
        return new CursorLoader(this, DBContentProvider.KEYS_URI, new String[]{PWTable.KEY_COLUMN_NAME_SHORT}, "pin = ?", new String[]{PIN}, null).loadInBackground().getCount() == 1;
    }

    private boolean setKey(String key) {
        ContentValues out = new ContentValues();
        out.put(PWTable.KEY_COLUMN_NAME_MAIN, key);
        return getContentResolver().insert(DBContentProvider.KEYS_URI, out) != null;
    }

    private boolean setPin(String key) {
        ContentValues out = new ContentValues();
        out.put(PWTable.KEY_COLUMN_NAME_SHORT, key);
        return getContentResolver().update(DBContentProvider.KEYS_URI, out, "pin IS NULL", null) > 0;
    }

    private String getKey() {
        Cursor c = new CursorLoader(this, DBContentProvider.KEYS_URI, new String[]{PWTable.KEY_COLUMN_NAME_MAIN}, null, null, null).loadInBackground();
        c.moveToFirst();
        return c.getString(c.getColumnIndex(PWTable.KEY_COLUMN_NAME_MAIN));
    }

    public boolean checkKeyExists() {
        return new CursorLoader(this, DBContentProvider.KEYS_URI, new String[]{PWTable.KEY_COLUMN_NAME_MAIN}, null, null, null).loadInBackground().getCount() > 0;
    }

    public boolean checkPinExists() {
        Cursor c = new CursorLoader(this, DBContentProvider.KEYS_URI, new String[]{PWTable.KEY_COLUMN_NAME_SHORT}, null, null, null).loadInBackground();
        boolean exists = false;
        c.moveToFirst();
        for (int i = 0; i < c.getCount(); i++) {
            if (c.getString(c.getColumnIndex(PWTable.KEY_COLUMN_NAME_SHORT)) != null) {
                exists = true;
            } else {
                exists = false;
            }
        }
        return exists;
    }
}
