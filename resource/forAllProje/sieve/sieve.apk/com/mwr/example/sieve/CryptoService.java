package com.mwr.example.sieve;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

public class CryptoService extends Service {
    public static final String KEY = "com.mwr.example.sieve.KEY";
    public static final int MSG_DECRYPT = 13476;
    public static final int MSG_ENCRYPT = 3452;
    public static final String PASSWORD = "com.mwr.example.sieve.PASSWORD";
    public static final String RESULT = "com.mwr.example.sieve.RESULT";
    public static final String STRING = "com.mwr.example.sieve.STRING";
    private static final String TAG = "m_CryptoService";
    private Messenger responseHandler;
    private Messenger serviceHandler;
    private Looper serviceLooper;

    private final class MessageHandler extends Handler {
        public MessageHandler(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message msg) {
            CryptoService.this.responseHandler = msg.replyTo;
            byte[] recievedData = null;
            Bundle recievedBundle = msg.obj;
            switch (msg.what) {
                case CryptoService.MSG_ENCRYPT /*3452*/:
                    recievedBundle.putByteArray(CryptoService.RESULT, CryptoService.this.encrypt(recievedBundle.getString("com.mwr.example.sieve.KEY"), recievedBundle.getString("com.mwr.example.sieve.STRING")));
                    sendResponseMessage(9, 91, msg.arg1, recievedBundle);
                    break;
                case CryptoService.MSG_DECRYPT /*13476*/:
                    recievedBundle.putString(CryptoService.RESULT, CryptoService.this.decrypt(recievedBundle.getString("com.mwr.example.sieve.KEY"), recievedBundle.getByteArray("com.mwr.example.sieve.PASSWORD")));
                    sendResponseMessage(9, 92, msg.arg1, recievedBundle);
                    break;
                default:
                    Log.e(CryptoService.TAG, "Error: unrecognized command: " + msg.what);
                    sendUnrecognizedMessage();
                    break;
            }
            super.handleMessage(msg);
        }

        private void sendResponseMessage(int command, int arg1, int arg2, Bundle bundle) {
            try {
                Message msg = Message.obtain(null, command, arg1, arg2);
                if (bundle != null) {
                    msg.setData(bundle);
                }
                CryptoService.this.responseHandler.send(msg);
            } catch (RemoteException e) {
                Log.e(CryptoService.TAG, "Unable to send message: " + command);
            }
        }

        private void sendUnrecognizedMessage() {
            try {
                CryptoService.this.responseHandler.send(Message.obtain(null, 111111, null));
            } catch (RemoteException e) {
            }
        }
    }

    private native String runNDKdecrypt(String str, byte[] bArr);

    private native byte[] runNDKencrypt(String str, String str2);

    static {
        System.loadLibrary("encrypt");
        System.loadLibrary("decrypt");
    }

    public void onCreate() {
        HandlerThread thread = new HandlerThread(TAG, 10);
        thread.start();
        this.serviceLooper = thread.getLooper();
        this.serviceHandler = new Messenger(new MessageHandler(this.serviceLooper));
    }

    public IBinder onBind(Intent arg0) {
        return this.serviceHandler.getBinder();
    }

    private byte[] encrypt(String key, String string) {
        byte[] out = (byte[]) null;
        try {
            out = runNDKencrypt(key, string);
        } catch (Exception e) {
            Log.e(TAG, "ERROR: Error during encrytion: " + e.getMessage());
        }
        return out;
    }

    private String decrypt(String key, byte[] string) {
        String out = null;
        try {
            out = runNDKdecrypt(key, string);
        } catch (Exception e) {
            Log.e(TAG, "ERROR: Error during decrytion: " + e.getMessage());
        }
        return out;
    }
}
