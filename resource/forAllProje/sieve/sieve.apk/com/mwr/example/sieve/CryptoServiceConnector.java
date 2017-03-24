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

public class CryptoServiceConnector extends Handler implements ServiceConnection {
    static final int MSG_ERROR = 111111;
    static final int MSG_RESULT = 9;
    private static final String TAG = "m_CryptoServiceConnector";
    static final int TYPE_DECRYPT = 92;
    static final int TYPE_ENCRYPT = 91;
    ResponseListener activity;
    private boolean bound;
    private Messenger responseHandler;
    private Messenger serviceMessenger;

    private class MessageHandler extends Handler {
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case 9:
                    switch (msg.arg1) {
                        case CryptoServiceConnector.TYPE_ENCRYPT /*91*/:
                            CryptoServiceConnector.this.activity.encryptionReturned(msg.getData().getByteArray(CryptoService.RESULT), msg.arg2);
                            return;
                        case CryptoServiceConnector.TYPE_DECRYPT /*92*/:
                            CryptoServiceConnector.this.activity.decryptionReturned(msg.getData().getString(CryptoService.RESULT), msg.arg2);
                            return;
                        default:
                            return;
                    }
                case CryptoServiceConnector.MSG_ERROR /*111111*/:
                    CryptoServiceConnector.this.activity.sendFailed();
                    return;
                default:
                    return;
            }
        }
    }

    public interface ResponseListener {
        void connected();

        void decryptionReturned(String str, int i);

        void encryptionReturned(byte[] bArr, int i);

        void sendFailed();
    }

    public CryptoServiceConnector(ResponseListener activity) {
        this.activity = activity;
    }

    public void onServiceConnected(ComponentName className, IBinder service) {
        this.serviceMessenger = new Messenger(service);
        this.responseHandler = new Messenger(new MessageHandler());
        this.bound = true;
        this.activity.connected();
    }

    public void onServiceDisconnected(ComponentName className) {
        this.activity.sendFailed();
        this.bound = false;
    }

    private void sendToServer(Message msg) {
        if (this.bound) {
            try {
                msg.replyTo = this.responseHandler;
                this.serviceMessenger.send(msg);
                return;
            } catch (RemoteException e) {
                Log.e(TAG, "Unable to send message to Service");
                this.activity.sendFailed();
                this.bound = false;
                return;
            }
        }
        Log.e(TAG, "ERROR: We are not bound to Crypto!");
        this.activity.sendFailed();
    }

    public void sendForEncryption(String key, String password, int code) {
        Bundle data = new Bundle();
        data.putString("com.mwr.example.sieve.KEY", key);
        data.putString("com.mwr.example.sieve.STRING", password);
        sendToServer(Message.obtain(null, CryptoService.MSG_ENCRYPT, code, 0, data));
    }

    public void sendForDecryption(String key, byte[] string, int code) {
        Bundle data = new Bundle();
        data.putString("com.mwr.example.sieve.KEY", key);
        data.putByteArray("com.mwr.example.sieve.PASSWORD", string);
        sendToServer(Message.obtain(null, CryptoService.MSG_DECRYPT, code, 0, data));
    }
}
