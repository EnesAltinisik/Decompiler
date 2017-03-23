package com.google.android.gms.internal;

import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GetTokenResult;
import com.google.firebase.auth.UserProfileChangeRequest;

public interface zzaja {
    FirebaseUser getCurrentUser();

    Task<Void> zza(FirebaseUser firebaseUser, AuthCredential authCredential);

    Task<Void> zza(FirebaseUser firebaseUser, UserProfileChangeRequest userProfileChangeRequest);

    Task<AuthResult> zza(FirebaseUser firebaseUser, String str);

    Task<GetTokenResult> zza(FirebaseUser firebaseUser, boolean z);

    Task<Void> zzb(FirebaseUser firebaseUser);

    Task<AuthResult> zzb(FirebaseUser firebaseUser, AuthCredential authCredential);

    Task<Void> zzb(FirebaseUser firebaseUser, String str);

    Task<Void> zzc(FirebaseUser firebaseUser);

    Task<Void> zzc(FirebaseUser firebaseUser, String str);
}
