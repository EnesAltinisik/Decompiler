package com.google.firebase.auth;

import android.net.Uri;

public interface UserInfo {
    String getDisplayName();

    String getEmail();

    Uri getPhotoUrl();

    String getProviderId();

    String getUid();
}
