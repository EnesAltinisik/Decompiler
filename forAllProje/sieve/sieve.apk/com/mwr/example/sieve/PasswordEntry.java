package com.mwr.example.sieve;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PasswordEntry implements Parcelable {
    public static final Creator<PasswordEntry> CREATOR = new Creator<PasswordEntry>() {
        public PasswordEntry createFromParcel(Parcel in) {
            return new PasswordEntry(in);
        }

        public PasswordEntry[] newArray(int size) {
            return new PasswordEntry[size];
        }
    };
    public String email;
    public String password;
    public String service;
    public String username;

    public PasswordEntry(String s, String u, String e, String p) {
        this.service = s;
        this.username = u;
        this.password = p;
        this.email = e;
    }

    public PasswordEntry(Parcel in) {
        String[] input = new String[4];
        in.readStringArray(input);
        this.service = input[0];
        this.username = input[1];
        this.email = input[2];
        this.password = input[3];
    }

    public String toString() {
        return this.service + "\n" + this.username;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel out, int arg1) {
        out.writeStringArray(new String[]{this.service, this.username, this.email, this.password});
    }

    public static Map<String, String> MapList(List<PasswordEntry> in) {
        Map<String, String> m = new HashMap();
        for (int i = 0; i < in.size(); i++) {
            m.put(((PasswordEntry) in.get(i)).service, ((PasswordEntry) in.get(i)).username);
        }
        return m;
    }
}
