package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.zzc;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zzacv.zza;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.EmailAuthProvider;
import com.google.firebase.auth.FirebaseAuthProvider;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GetTokenResult;
import com.google.firebase.auth.ProviderQueryResult;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.auth.api.model.GetAccountInfoUser;
import com.google.firebase.auth.api.model.ProviderUserInfo;
import com.google.firebase.auth.api.model.VerifyAssertionRequest;
import java.util.ArrayList;
import java.util.List;

public class zzacn extends zzc<zza> {

    static final class a extends d<AuthResult, zzadc> {
        private String n;
        private String o;

        public a(String str, String str2) {
            super(2);
            this.n = zzaa.zzh(str, "email cannot be null or empty");
            this.o = zzaa.zzh(str2, "password cannot be null or empty");
        }

        public void a() throws RemoteException {
            this.e.zzc(this.n, this.o, this.b);
        }

        public void b() {
            FirebaseUser zzb = zzacn.zza(this.c, this.i);
            ((zzadc) this.f).zza(this.h, zzb);
            b(new zzade(zzb));
        }
    }

    static final class b extends d<Void, zzadk> {
        public b() {
            super(5);
        }

        public void a() throws RemoteException {
            this.e.zzg(this.d.zzOm(), this.b);
        }

        public void b() {
            ((zzadk) this.f).zzOk();
            b(null);
        }
    }

    static final class c extends d<ProviderQueryResult, zzadc> {
        private final String n;

        public c(String str) {
            super(3);
            this.n = zzaa.zzh(str, "email cannot be null or empty");
        }

        public void a() throws RemoteException {
            this.e.zzc(this.n, this.b);
        }

        public void b() {
            b(new zzadi(this.j));
        }
    }

    static final class d extends d<GetTokenResult, zzadc> {
        private final String n;

        public d(String str) {
            super(1);
            this.n = zzaa.zzh(str, "refresh token cannot be null");
        }

        public void a() throws RemoteException {
            this.e.zza(this.n, this.b);
        }

        public void b() {
            this.h.zzhH(this.n);
            ((zzadc) this.f).zza(this.h, this.d);
            b(new GetTokenResult(this.h.getAccessToken()));
        }
    }

    static final class e extends d<AuthResult, zzadc> {
        private final EmailAuthCredential n;

        public e(EmailAuthCredential emailAuthCredential) {
            super(2);
            this.n = (EmailAuthCredential) zzaa.zzb((Object) emailAuthCredential, (Object) "credential cannot be null");
        }

        public void a() throws RemoteException {
            this.e.zza(this.n.getEmail(), this.n.getPassword(), this.d.zzOm(), this.b);
        }

        public void b() {
            FirebaseUser zzb = zzacn.zza(this.c, this.i);
            ((zzadc) this.f).zza(this.h, zzb);
            b(new zzade(zzb));
        }
    }

    static final class f extends d<AuthResult, zzadc> {
        private final VerifyAssertionRequest n;

        public f(AuthCredential authCredential) {
            super(2);
            zzaa.zzb((Object) authCredential, (Object) "credential cannot be null");
            this.n = zzadd.zza(authCredential);
        }

        public void a() throws RemoteException {
            this.e.zza(this.d.zzOm(), this.n, this.b);
        }

        public void b() {
            FirebaseUser zzb = zzacn.zza(this.c, this.i);
            ((zzadc) this.f).zza(this.h, zzb);
            b(new zzade(zzb));
        }
    }

    private class g<ResultT, CallbackT> extends zzpd<zzaco, ResultT> implements c<ResultT> {
        final /* synthetic */ zzacn a;
        private d<ResultT, CallbackT> b;
        private TaskCompletionSource<ResultT> c;

        public g(zzacn com_google_android_gms_internal_zzacn, d<ResultT, CallbackT> dVar) {
            this.a = com_google_android_gms_internal_zzacn;
            this.b = dVar;
            this.b.a((c) this);
        }

        protected void a(zzaco com_google_android_gms_internal_zzaco, TaskCompletionSource<ResultT> taskCompletionSource) throws RemoteException {
            this.c = taskCompletionSource;
            this.b.a(com_google_android_gms_internal_zzaco.zzOs());
        }

        public final void a(ResultT resultT, Status status) {
            zzaa.zzb(this.c, (Object) "doExecute must be called before onComplete");
            if (status != null) {
                this.c.setException(zzacq.zzbN(status));
            } else {
                this.c.setResult(resultT);
            }
        }

        protected /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb, TaskCompletionSource taskCompletionSource) throws RemoteException {
            a((zzaco) com_google_android_gms_common_api_Api_zzb, taskCompletionSource);
        }
    }

    static final class h extends d<Void, zzadc> {
        private final VerifyAssertionRequest n;

        public h(AuthCredential authCredential) {
            super(2);
            zzaa.zzb((Object) authCredential, (Object) "credential cannot be null");
            this.n = zzadd.zza(authCredential);
        }

        public void a() throws RemoteException {
            this.e.zza(this.n, this.b);
        }

        public void b() {
            FirebaseUser zzb = zzacn.zza(this.c, this.i);
            if (this.d.getUid().equalsIgnoreCase(zzb.getUid())) {
                ((zzadc) this.f).zza(this.h, zzb);
                c();
                return;
            }
            a(zzadj.zzOS());
        }
    }

    static final class i extends d<Void, zzadc> {
        private final String n;
        private final String o;

        public i(String str, String str2) {
            super(2);
            this.n = zzaa.zzh(str, "email cannot be null or empty");
            this.o = zzaa.zzh(str2, "password cannot be null or empty");
        }

        public void a() throws RemoteException {
            this.e.zzd(this.n, this.o, this.b);
        }

        public void b() {
            FirebaseUser zzb = zzacn.zza(this.c, this.i);
            if (this.d.getUid().equalsIgnoreCase(zzb.getUid())) {
                ((zzadc) this.f).zza(this.h, zzb);
                c();
                return;
            }
            a(zzadj.zzOS());
        }
    }

    static final class j extends d<Void, zzadc> {
        public j() {
            super(2);
        }

        public void a() throws RemoteException {
            this.e.zzf(this.d.zzOm(), this.b);
        }

        public void b() {
            ((zzadc) this.f).zza(this.h, zzacn.zza(this.c, this.i, this.d.isAnonymous()));
            b(null);
        }
    }

    static final class k extends d<Void, zzadc> {
        private String n;

        public k(String str) {
            super(4);
            this.n = zzaa.zzh(str, "email cannot be null or empty");
        }

        public void a() throws RemoteException {
            this.e.zzd(this.n, this.b);
        }

        public void b() {
            c();
        }
    }

    static final class l extends d<AuthResult, zzadc> {
        public l() {
            super(2);
        }

        public void a() throws RemoteException {
            this.e.zza(this.b);
        }

        public void b() {
            FirebaseUser zzb = zzacn.zza(this.c, this.i, true);
            ((zzadc) this.f).zza(this.h, zzb);
            b(new zzade(zzb));
        }
    }

    static final class m extends d<AuthResult, zzadc> {
        private final VerifyAssertionRequest n;

        public m(AuthCredential authCredential) {
            super(2);
            zzaa.zzb((Object) authCredential, (Object) "credential cannot be null");
            this.n = zzadd.zza(authCredential);
        }

        public void a() throws RemoteException {
            this.e.zza(this.n, this.b);
        }

        public void b() {
            FirebaseUser zzb = zzacn.zza(this.c, this.i);
            ((zzadc) this.f).zza(this.h, zzb);
            b(new zzade(zzb));
        }
    }

    static final class n extends d<AuthResult, zzadc> {
        private final String n;

        public n(String str) {
            super(2);
            this.n = zzaa.zzh(str, "token cannot be null or empty");
        }

        public void a() throws RemoteException {
            this.e.zzb(this.n, this.b);
        }

        public void b() {
            FirebaseUser zzb = zzacn.zza(this.c, this.i);
            ((zzadc) this.f).zza(this.h, zzb);
            b(new zzade(zzb));
        }
    }

    static final class o extends d<AuthResult, zzadc> {
        private String n;
        private String o;

        public o(String str, String str2) {
            super(2);
            this.n = zzaa.zzh(str, "email cannot be null or empty");
            this.o = zzaa.zzh(str2, "password cannot be null or empty");
        }

        public void a() throws RemoteException {
            this.e.zzd(this.n, this.o, this.b);
        }

        public void b() {
            FirebaseUser zzb = zzacn.zza(this.c, this.i);
            ((zzadc) this.f).zza(this.h, zzb);
            b(new zzade(zzb));
        }
    }

    static final class p extends d<AuthResult, zzadc> {
        public p() {
            super(2);
        }

        public void a() throws RemoteException {
            this.e.zze(this.d.zzOm(), this.b);
        }

        public void b() {
            FirebaseUser zzb = zzacn.zza(this.c, this.i);
            ((zzadc) this.f).zza(this.h, zzb);
            b(new zzade(zzb));
        }
    }

    static final class q extends d<AuthResult, zzadc> {
        private String n;

        public q(String str) {
            super(2);
            this.n = zzaa.zzh(str, "provider cannot be null or empty");
        }

        public void a() throws RemoteException {
            this.e.zze(this.n, this.d.zzOm(), this.b);
        }

        public void b() {
            FirebaseUser zzb = zzacn.zza(this.c, this.i);
            ((zzadc) this.f).zza(this.h, zzb);
            b(new zzade(zzb));
        }
    }

    static final class r extends d<Void, zzadc> {
        private final String n;

        public r(String str) {
            super(2);
            this.n = zzaa.zzh(str, "email cannot be null or empty");
        }

        public void a() throws RemoteException {
            this.e.zza(this.d.zzOm(), this.n, this.b);
        }

        public void b() {
            ((zzadc) this.f).zza(this.h, zzacn.zza(this.c, this.i));
            c();
        }
    }

    static final class s extends d<Void, zzadc> {
        private final String n;

        public s(String str) {
            super(2);
            this.n = zzaa.zzh(str, "password cannot be null or empty");
        }

        public void a() throws RemoteException {
            this.e.zzb(this.d.zzOm(), this.n, this.b);
        }

        public void b() {
            ((zzadc) this.f).zza(this.h, zzacn.zza(this.c, this.i));
            c();
        }
    }

    static final class t extends d<Void, zzadc> {
        private final UserProfileChangeRequest n;

        public t(UserProfileChangeRequest userProfileChangeRequest) {
            super(2);
            this.n = (UserProfileChangeRequest) zzaa.zzb((Object) userProfileChangeRequest, (Object) "request cannot be null");
        }

        public void a() throws RemoteException {
            this.e.zza(this.d.zzOm(), this.n, this.b);
        }

        public void b() {
            ((zzadc) this.f).zza(this.h, zzacn.zza(this.c, this.i));
            c();
        }
    }

    zzacn(Context context, zza com_google_android_gms_internal_zzacv_zza) {
        super(context, zzacv.zzbFz, com_google_android_gms_internal_zzacv_zza);
    }

    private <ResultT, CallbackT> g<ResultT, CallbackT> zza(d<ResultT, CallbackT> dVar) {
        return new g(this, dVar);
    }

    private static zzadh zza(FirebaseApp firebaseApp, GetAccountInfoUser getAccountInfoUser) {
        return zza(firebaseApp, getAccountInfoUser, false);
    }

    private static zzadh zza(FirebaseApp firebaseApp, GetAccountInfoUser getAccountInfoUser, boolean z) {
        zzaa.zzz(firebaseApp);
        zzaa.zzz(getAccountInfoUser);
        List arrayList = new ArrayList();
        arrayList.add(new zzadf(getAccountInfoUser, FirebaseAuthProvider.PROVIDER_ID));
        List zzOD = getAccountInfoUser.zzOD();
        if (!(zzOD == null || zzOD.isEmpty())) {
            for (int i = 0; i < zzOD.size(); i++) {
                arrayList.add(new zzadf((ProviderUserInfo) zzOD.get(i)));
            }
        }
        zzadh com_google_android_gms_internal_zzadh = new zzadh(firebaseApp, arrayList);
        zzadh com_google_android_gms_internal_zzadh2 = (zzadh) com_google_android_gms_internal_zzadh.zzaK(z);
        if (!(TextUtils.isEmpty(getAccountInfoUser.getEmail()) || TextUtils.isEmpty(getAccountInfoUser.getPassword()))) {
            com_google_android_gms_internal_zzadh.zzhI(EmailAuthProvider.PROVIDER_ID);
        }
        return com_google_android_gms_internal_zzadh;
    }

    private Task<AuthResult> zza(FirebaseApp firebaseApp, AuthCredential authCredential, FirebaseUser firebaseUser, zzadc com_google_android_gms_internal_zzadc) {
        zzaa.zzz(firebaseApp);
        zzaa.zzz(authCredential);
        zzaa.zzz(firebaseUser);
        zzaa.zzz(com_google_android_gms_internal_zzadc);
        List providers = firebaseUser.getProviders();
        return (providers == null || !providers.contains(authCredential.getProvider())) ? zzb(zza(new f(authCredential).a(firebaseApp).a(firebaseUser).a((Object) com_google_android_gms_internal_zzadc))) : Tasks.forException(zzacq.zzbN(new Status(17015)));
    }

    private Task<AuthResult> zza(FirebaseApp firebaseApp, EmailAuthCredential emailAuthCredential, FirebaseUser firebaseUser, zzadc com_google_android_gms_internal_zzadc) {
        return zzb(zza(new e(emailAuthCredential).a(firebaseApp).a(firebaseUser).a((Object) com_google_android_gms_internal_zzadc)));
    }

    private Task<AuthResult> zza(FirebaseApp firebaseApp, FirebaseUser firebaseUser, zzadc com_google_android_gms_internal_zzadc) {
        return zzb(zza(new p().a(firebaseApp).a(firebaseUser).a((Object) com_google_android_gms_internal_zzadc)));
    }

    private Task<AuthResult> zza(FirebaseApp firebaseApp, String str, FirebaseUser firebaseUser, zzadc com_google_android_gms_internal_zzadc) {
        return zzb(zza(new q(str).a(firebaseApp).a(firebaseUser).a((Object) com_google_android_gms_internal_zzadc)));
    }

    public Task<AuthResult> zza(FirebaseApp firebaseApp, zzadc com_google_android_gms_internal_zzadc) {
        return zzb(zza(new l().a(firebaseApp).a((Object) com_google_android_gms_internal_zzadc)));
    }

    public Task<AuthResult> zza(FirebaseApp firebaseApp, AuthCredential authCredential, zzadc com_google_android_gms_internal_zzadc) {
        return zzb(zza(new m(authCredential).a(firebaseApp).a((Object) com_google_android_gms_internal_zzadc)));
    }

    public Task<Void> zza(FirebaseApp firebaseApp, FirebaseUser firebaseUser, AuthCredential authCredential, zzadc com_google_android_gms_internal_zzadc) {
        return zzb(zza(new h(authCredential).a(firebaseApp).a(firebaseUser).a((Object) com_google_android_gms_internal_zzadc)));
    }

    public Task<Void> zza(FirebaseApp firebaseApp, FirebaseUser firebaseUser, UserProfileChangeRequest userProfileChangeRequest, zzadc com_google_android_gms_internal_zzadc) {
        return zzb(zza(new t(userProfileChangeRequest).a(firebaseApp).a(firebaseUser).a((Object) com_google_android_gms_internal_zzadc)));
    }

    public Task<GetTokenResult> zza(FirebaseApp firebaseApp, FirebaseUser firebaseUser, String str, zzadc com_google_android_gms_internal_zzadc) {
        return zza(zza(new d(str).a(firebaseApp).a(firebaseUser).a((Object) com_google_android_gms_internal_zzadc)));
    }

    public Task<Void> zza(FirebaseApp firebaseApp, FirebaseUser firebaseUser, String str, String str2, zzadc com_google_android_gms_internal_zzadc) {
        return zzb(zza(new i(str, str2).a(firebaseApp).a(firebaseUser).a((Object) com_google_android_gms_internal_zzadc)));
    }

    public Task<ProviderQueryResult> zza(FirebaseApp firebaseApp, String str) {
        return zza(zza(new c(str).a(firebaseApp)));
    }

    public Task<AuthResult> zza(FirebaseApp firebaseApp, String str, zzadc com_google_android_gms_internal_zzadc) {
        return zzb(zza(new n(str).a(firebaseApp).a((Object) com_google_android_gms_internal_zzadc)));
    }

    public Task<AuthResult> zza(FirebaseApp firebaseApp, String str, String str2, zzadc com_google_android_gms_internal_zzadc) {
        return zzb(zza(new a(str, str2).a(firebaseApp).a((Object) com_google_android_gms_internal_zzadc)));
    }

    public Task<Void> zza(FirebaseUser firebaseUser, zzadk com_google_android_gms_internal_zzadk) {
        return zzb(zza(new b().a(firebaseUser).a((Object) com_google_android_gms_internal_zzadk)));
    }

    public Task<Void> zzb(FirebaseApp firebaseApp, FirebaseUser firebaseUser, zzadc com_google_android_gms_internal_zzadc) {
        return zza(zza(new j().a(firebaseApp).a(firebaseUser).a((Object) com_google_android_gms_internal_zzadc)));
    }

    public Task<AuthResult> zzb(FirebaseApp firebaseApp, FirebaseUser firebaseUser, AuthCredential authCredential, zzadc com_google_android_gms_internal_zzadc) {
        zzaa.zzz(firebaseApp);
        zzaa.zzz(authCredential);
        zzaa.zzz(firebaseUser);
        zzaa.zzz(com_google_android_gms_internal_zzadc);
        return EmailAuthCredential.class.isAssignableFrom(authCredential.getClass()) ? zza(firebaseApp, (EmailAuthCredential) authCredential, firebaseUser, com_google_android_gms_internal_zzadc) : zza(firebaseApp, authCredential, firebaseUser, com_google_android_gms_internal_zzadc);
    }

    public Task<Void> zzb(FirebaseApp firebaseApp, FirebaseUser firebaseUser, String str, zzadc com_google_android_gms_internal_zzadc) {
        return zzb(zza(new r(str).a(firebaseApp).a(firebaseUser).a((Object) com_google_android_gms_internal_zzadc)));
    }

    public Task<Void> zzb(FirebaseApp firebaseApp, String str) {
        return zzb(zza(new k(str).a(firebaseApp)));
    }

    public Task<AuthResult> zzb(FirebaseApp firebaseApp, String str, String str2, zzadc com_google_android_gms_internal_zzadc) {
        return zzb(zza(new o(str, str2).a(firebaseApp).a((Object) com_google_android_gms_internal_zzadc)));
    }

    public Task<Void> zzc(FirebaseApp firebaseApp, FirebaseUser firebaseUser, String str, zzadc com_google_android_gms_internal_zzadc) {
        return zzb(zza(new s(str).a(firebaseApp).a(firebaseUser).a((Object) com_google_android_gms_internal_zzadc)));
    }

    public Task<AuthResult> zzd(FirebaseApp firebaseApp, FirebaseUser firebaseUser, String str, zzadc com_google_android_gms_internal_zzadc) {
        zzaa.zzz(firebaseApp);
        zzaa.zzdl(str);
        zzaa.zzz(firebaseUser);
        zzaa.zzz(com_google_android_gms_internal_zzadc);
        List providers = firebaseUser.getProviders();
        if ((providers != null && !providers.contains(str)) || firebaseUser.isAnonymous()) {
            return Tasks.forException(zzacq.zzbN(new Status(17016, str)));
        }
        Object obj = -1;
        switch (str.hashCode()) {
            case 1216985755:
                if (str.equals(EmailAuthProvider.PROVIDER_ID)) {
                    obj = null;
                    break;
                }
                break;
        }
        switch (obj) {
            case null:
                return zza(firebaseApp, firebaseUser, com_google_android_gms_internal_zzadc);
            default:
                return zza(firebaseApp, str, firebaseUser, com_google_android_gms_internal_zzadc);
        }
    }
}
