package com.mwr.example.sieve;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

public class AuthServiceConnector extends Handler implements ServiceConnection {
    static final int MSG_CHECK = 5;
    static final int MSG_ERROR = 111111;
    static final int MSG_FIRST_LAUNCH = 3;
    static final int MSG_SET = 4;
    private static final String TAG = "m_AuthServiceConnector";
    static final int TYPE_HAS_KEY_HAS_PIN = 31;
    static final int TYPE_HAS_KEY_NO_PIN = 32;
    static final int TYPE_KEY = 42;
    static final int TYPE_MSG_UNDEFINED = 122222;
    static final int TYPE_NO_KEY_NO_PIN = 33;
    static final int TYPE_PIN = 41;
    ResponseListener activity;
    private boolean bound;
    private Messenger responseHandler;
    private Messenger serviceMessenger;

    private class MessageHandler extends Handler {
        public void handleMessage(Message msg) {
            boolean z = true;
            ResponseListener responseListener;
            switch (msg.what) {
                case 3:
                    AuthServiceConnector.this.activity.firstLaunchResult(msg.arg1);
                    return;
                case 4:
                    switch (msg.arg1) {
                        case AuthServiceConnector.TYPE_PIN /*41*/:
                            responseListener = AuthServiceConnector.this.activity;
                            if (msg.arg2 != 0) {
                                z = false;
                            }
                            responseListener.setPinResult(z);
                            return;
                        case AuthServiceConnector.TYPE_KEY /*42*/:
                            responseListener = AuthServiceConnector.this.activity;
                            if (msg.arg2 != 0) {
                                z = false;
                            }
                            responseListener.setKeyResult(z);
                            return;
                        default:
                            return;
                    }
                case 5:
                    switch (msg.arg1) {
                        case AuthServiceConnector.TYPE_PIN /*41*/:
                            responseListener = AuthServiceConnector.this.activity;
                            if (msg.arg2 != 0) {
                                z = false;
                            }
                            responseListener.checkPinResult(z);
                            return;
                        case AuthServiceConnector.TYPE_KEY /*42*/:
                            responseListener = AuthServiceConnector.this.activity;
                            if (msg.arg2 != 0) {
                                z = false;
                            }
                            responseListener.checkKeyResult(z);
                            return;
                        default:
                            return;
                    }
                case AuthServiceConnector.MSG_ERROR /*111111*/:
                    AuthServiceConnector.this.activity.sendFailed();
                    break;
            }
            Log.e(AuthServiceConnector.TAG, "Error: Recieved unrecognised Message, what: " + msg.what + ", arg1: " + msg.arg1);
        }
    }

    public interface ResponseListener {
        void checkKeyResult(boolean z);

        void checkPinResult(boolean z);

        void connected();

        void firstLaunchResult(int i);

        void sendFailed();

        void setKeyResult(boolean z);

        void setPinResult(boolean z);
    }

    public AuthServiceConnector(ResponseListener activity) {
        this.activity = activity;
    }

    public void onServiceConnected(ComponentName className, IBinder service) {
        this.serviceMessenger = new Messenger(service);
        this.responseHandler = new Messenger(new MessageHandler());
        this.bound = true;
        this.activity.connected();
    }

    public void onServiceDisconnected(ComponentName className) {
        this.bound = false;
        this.activity.sendFailed();
    }

    private void sendToServer(Message msg) {
        if (this.bound) {
            try {
                msg.replyTo = this.responseHandler;
                this.serviceMessenger.send(msg);
                return;
            } catch (RemoteException e) {
                Log.e(TAG, "Unable to send message: " + msg.what);
                this.activity.sendFailed();
                return;
            }
        }
        Log.e(TAG, "ERROR: We are not bound to Crypto!");
    }

    public void checkFirstLaunch() {
        sendToServer(Message.obtain(null, 4));
    }

    public void checkKey(String key) {
        Bundle data = new Bundle();
        data.putString("com.mwr.example.sieve.PASSWORD", key);
        sendToServer(Message.obtain(null, 2354, 7452, 0, data));
    }

    public void checkPin(String pin) {
        Bundle data = new Bundle();
        data.putString("com.mwr.example.sieve.PIN", pin);
        sendToServer(Message.obtain(null, 2354, 9234, 0, data));
    }

    public void setKey(String key) {
        Bundle data = new Bundle();
        data.putString("com.mwr.example.sieve.PASSWORD", key);
        sendToServer(Message.obtain(null, 6345, 7452, 0, data));
    }

    public void setPin(String pin) {
        Bundle data = new Bundle();
        data.putString("com.mwr.example.sieve.PIN", pin);
        sendToServer(Message.obtain(null, 6345, 9234, 0, data));
    }
}
