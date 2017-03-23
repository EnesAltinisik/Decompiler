package com.crashlytics.android.core;

import a.a.a.a.a.b.a;
import a.a.a.a.a.b.r;
import a.a.a.a.a.e.c;
import a.a.a.a.a.e.d;
import a.a.a.a.a.e.e;
import a.a.a.a.i;
import java.util.Map.Entry;

class DefaultCreateReportSpiCall extends a implements CreateReportSpiCall {
    static final String FILE_CONTENT_TYPE = "application/octet-stream";
    static final String FILE_PARAM = "report[file]";
    static final String IDENTIFIER_PARAM = "report[identifier]";

    public DefaultCreateReportSpiCall(i iVar, String str, String str2, e eVar) {
        super(iVar, str, str2, eVar, c.POST);
    }

    DefaultCreateReportSpiCall(i iVar, String str, String str2, e eVar, c cVar) {
        super(iVar, str, str2, eVar, cVar);
    }

    public boolean invoke(CreateReportRequest createReportRequest) {
        d applyMultipartDataTo = applyMultipartDataTo(applyHeadersTo(getHttpRequest(), createReportRequest), createReportRequest);
        a.a.a.a.c.h().a(CrashlyticsCore.TAG, "Sending report to: " + getUrl());
        int b = applyMultipartDataTo.b();
        a.a.a.a.c.h().a(CrashlyticsCore.TAG, "Create report request ID: " + applyMultipartDataTo.b(a.HEADER_REQUEST_ID));
        a.a.a.a.c.h().a(CrashlyticsCore.TAG, "Result was: " + b);
        return r.a(b) == 0;
    }

    private d applyHeadersTo(d dVar, CreateReportRequest createReportRequest) {
        d a = dVar.a(a.HEADER_API_KEY, createReportRequest.apiKey).a(a.HEADER_CLIENT_TYPE, a.ANDROID_CLIENT_TYPE).a(a.HEADER_CLIENT_VERSION, CrashlyticsCore.getInstance().getVersion());
        d dVar2 = a;
        for (Entry a2 : createReportRequest.report.getCustomHeaders().entrySet()) {
            dVar2 = dVar2.a(a2);
        }
        return dVar2;
    }

    private d applyMultipartDataTo(d dVar, CreateReportRequest createReportRequest) {
        Report report = createReportRequest.report;
        return dVar.a(FILE_PARAM, report.getFileName(), FILE_CONTENT_TYPE, report.getFile()).e(IDENTIFIER_PARAM, report.getIdentifier());
    }
}
