package com.mwr.example.sieve;

import android.os.AsyncTask;
import android.util.Log;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

public class NetBackupHandler {
    public static final int BACKUP_SUCCESS = 459835;
    private static final String END_HEADER = "\r\n\r\n";
    private static final String GET_REQUEST = "GET /Backup.xml HTTP/1.1";
    private static final int NOT_RUNNING = 243652;
    public static final int OPERATION_FAILED = 23485;
    private static final String POST_REQUEST = "POST /Backup.xml HTTP/1.1";
    public static final int RESTORE_SUCCESS = 745745;
    private static final int RUNNING_BACKUP = 2436235;
    private static final int RUNNING_RESTORE = 67456234;
    private static final String TAG = "m_NetBackup";
    private String port = "8000";
    private int result = -1;
    private ResultListener rl;
    private int state = NOT_RUNNING;
    private String url = "localhost";

    private class NetBackup extends AsyncTask<String, Void, Object> {
        private NetBackup() {
        }

        protected Void doInBackground(String... ins) {
            OutputStream os = null;
            InputStream is = null;
            byte[] buffer = new byte[4096];
            ByteBuffer bb = ByteBuffer.allocate(4096);
            bb.mark();
            try {
                Socket connection = NetBackupHandler.this.getNewHttpConnection();
                if (connection.isConnected()) {
                    os = connection.getOutputStream();
                    is = connection.getInputStream();
                } else {
                    Log.e(NetBackupHandler.TAG, "Socket is NOT Connected!");
                    NetBackupHandler.this.result = NetBackupHandler.OPERATION_FAILED;
                }
                if (os == null || is == null) {
                    Log.e(NetBackupHandler.TAG, "Connection to server failed!");
                    NetBackupHandler.this.result = NetBackupHandler.OPERATION_FAILED;
                } else {
                    os.write(("POST /Backup.xml HTTP/1.1\r\nContent-Length: " + ins[0].length() + NetBackupHandler.END_HEADER + ins[0]).getBytes());
                    while (true) {
                        int bytesRead = is.read(buffer);
                        if (bytesRead == -1) {
                            break;
                        }
                        bb.put(buffer, 0, bytesRead);
                    }
                    bb.reset();
                    NetBackupHandler.this.result = NetBackupHandler.BACKUP_SUCCESS;
                }
                connection.close();
            } catch (Exception e) {
                Log.e(NetBackupHandler.TAG, "Error during connection: " + e.getMessage());
            }
            return null;
        }

        protected void onPostExecute(Object out) {
            NetBackupHandler.this.state = NetBackupHandler.NOT_RUNNING;
            NetBackupHandler.this.rl.onTaskFinish(NetBackupHandler.this.result, null);
        }
    }

    private class NetRestore extends AsyncTask<Void, Void, String> {
        private NetRestore() {
        }

        protected String doInBackground(Void... arg0) {
            byte[] buffer = new byte[4096];
            ByteBuffer bb = ByteBuffer.allocate(4096);
            bb.mark();
            try {
                Socket connection = NetBackupHandler.this.getNewHttpConnection();
                if (connection.isConnected()) {
                    OutputStream os = connection.getOutputStream();
                    InputStream is = connection.getInputStream();
                    if (os != null) {
                        os.write("GET /Backup.xml HTTP/1.1\r\n\r\n".getBytes());
                        while (true) {
                            int bytesRead = is.read(buffer);
                            if (bytesRead == -1) {
                                bb.reset();
                                String response = new String(bb.array());
                                response.trim();
                                String out = response.split(NetBackupHandler.END_HEADER)[1].split("\u0000")[0];
                                NetBackupHandler.this.result = NetBackupHandler.RESTORE_SUCCESS;
                                return out;
                            }
                            bb.put(buffer, 0, bytesRead);
                        }
                    }
                    return null;
                }
                Log.e(NetBackupHandler.TAG, "Socket is NOT Connected!");
                NetBackupHandler.this.result = NetBackupHandler.OPERATION_FAILED;
                return null;
            } catch (Exception e) {
                Log.e(NetBackupHandler.TAG, "Error during connection: " + e.getMessage());
                NetBackupHandler.this.result = NetBackupHandler.OPERATION_FAILED;
            }
        }

        protected void onPostExecute(String out) {
            NetBackupHandler.this.state = NetBackupHandler.NOT_RUNNING;
            NetBackupHandler.this.rl.onTaskFinish(NetBackupHandler.this.result, out);
        }
    }

    public interface ResultListener {
        void onTaskFinish(int i, String str);
    }

    private Socket getNewHttpConnection() {
        TrustManager tm = new X509TrustManager() {
            public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
            }

            public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
            }

            public X509Certificate[] getAcceptedIssuers() {
                return null;
            }
        };
        try {
            SSLContext context = SSLContext.getInstance("TLS");
            context.init(new KeyManager[0], new TrustManager[]{tm}, new SecureRandom());
            return context.getSocketFactory().createSocket(this.url, Integer.parseInt(this.port));
        } catch (Exception e) {
            Log.e(TAG, "ERROR: Socket createion error: " + e.getMessage());
            return null;
        }
    }

    public NetBackupHandler(String iurl, String iport, ResultListener irl) {
        this.url = iurl;
        this.port = iport;
        this.rl = irl;
    }

    public synchronized void performNetBackup(String data) {
        if (this.state == NOT_RUNNING) {
            this.state = RUNNING_BACKUP;
            new NetBackup().execute(new String[]{data});
        }
    }

    public synchronized void performNetRestore() {
        Log.i(TAG, "performNetRestore");
        if (this.state == NOT_RUNNING) {
            this.state = RUNNING_RESTORE;
            new NetRestore().execute(new Void[0]);
        }
    }
}
