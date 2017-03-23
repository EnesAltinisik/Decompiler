package com.google.firebase.auth;

public class FacebookAuthProvider {
    public static final String PROVIDER_ID = "facebook.com";

    private FacebookAuthProvider() {
    }

    public static AuthCredential getCredential(String str) {
        return new FacebookAuthCredential(str);
    }
}
