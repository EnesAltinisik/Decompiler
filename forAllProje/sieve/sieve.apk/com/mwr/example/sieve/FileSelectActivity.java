package com.mwr.example.sieve;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileSelectActivity extends Activity implements OnItemClickListener {
    public static final String FILE = "com.mwr.example.sieve.FILE";
    private static final String root = "/";
    private TextView currentPath;
    private List<String> item = null;
    private List<String> path = null;
    private ListView pathList;
    private Intent resultIntent;
    private String startingPath;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file_select);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        this.startingPath = getExternalFilesDir(null).getPath();
        this.currentPath = (TextView) findViewById(R.id.fileselect_textview_path);
        this.pathList = (ListView) findViewById(R.id.fileselect_list_path);
        if (VERSION.SDK_INT >= 14) {
            getActionBar().setHomeButtonEnabled(true);
        }
        processDir(this.startingPath);
    }

    public void onBackPressed() {
        cancel();
    }

    private void processDir(String dir) {
        this.currentPath.setText(dir);
        this.item = new ArrayList();
        this.path = new ArrayList();
        File f = new File(dir);
        File[] files = f.listFiles();
        if (!dir.equals(root)) {
            this.item.add(root);
            this.path.add(root);
            this.item.add("../");
            this.path.add(f.getParent());
        }
        for (File file : files) {
            this.path.add(file.getPath());
            if (file.isDirectory()) {
                this.item.add(file.getName() + root);
            } else {
                this.item.add(file.getName());
            }
        }
        this.pathList.setAdapter(new ArrayAdapter(this, 17367043, this.item));
        this.pathList.setOnItemClickListener(this);
    }

    private void returnFile(String out) {
        this.resultIntent = new Intent(this, SettingsActivity.class);
        this.resultIntent.putExtra(FILE, out);
        setResult(-1, this.resultIntent);
        finish();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_file_select, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case 16908332:
                cancel();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void onItemClick(AdapterView<?> adapterView, View arg1, int pos, long id) {
        File file = new File((String) this.path.get(pos));
        if (file.isDirectory()) {
            if (file.canRead()) {
                processDir((String) this.path.get(pos));
            } else {
                new Builder(this).setIcon(R.drawable.ic_launcher).setTitle("[" + file.getName() + "] folder can't be read!").setPositiveButton("OK", new OnClickListener() {
                    public void onClick(DialogInterface dialog, int i) {
                    }
                }).show();
            }
        } else if (file.toString().endsWith(".xml") || file.toString().endsWith(".XML")) {
            returnFile(file.getAbsolutePath().toString());
        }
    }

    private void cancel() {
        this.resultIntent = new Intent(this, SettingsActivity.class);
        setResult(0, this.resultIntent);
        finish();
    }
}
