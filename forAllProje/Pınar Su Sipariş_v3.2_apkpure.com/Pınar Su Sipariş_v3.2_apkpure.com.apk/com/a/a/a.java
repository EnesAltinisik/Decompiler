package com.a.a;

import b.d;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Call.Factory;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request.Builder;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit.client.Client;
import retrofit.client.Header;
import retrofit.client.Request;
import retrofit.client.Response;
import retrofit.mime.TypedInput;
import retrofit.mime.TypedOutput;

/* compiled from: Ok3Client */
public final class a implements Client {
    private final Factory a;

    public a() {
        this(new OkHttpClient());
    }

    public a(OkHttpClient okHttpClient) {
        this((Factory) okHttpClient);
    }

    public a(Factory factory) {
        if (factory == null) {
            throw new NullPointerException("client == null");
        }
        this.a = factory;
    }

    public Response execute(Request request) throws IOException {
        return a(this.a.newCall(a(request)).execute());
    }

    static okhttp3.Request a(Request request) {
        Builder method = new Builder().url(request.getUrl()).method(request.getMethod(), a(request.getBody()));
        List headers = request.getHeaders();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            Header header = (Header) headers.get(i);
            String value = header.getValue();
            if (value == null) {
                value = "";
            }
            method.addHeader(header.getName(), value);
        }
        return method.build();
    }

    static Response a(okhttp3.Response response) {
        return new Response(response.request().url().toString(), response.code(), response.message(), a(response.headers()), a(response.body()));
    }

    private static RequestBody a(final TypedOutput typedOutput) {
        if (typedOutput == null) {
            return null;
        }
        final MediaType parse = MediaType.parse(typedOutput.mimeType());
        return new RequestBody() {
            public MediaType contentType() {
                return parse;
            }

            public void writeTo(d dVar) throws IOException {
                typedOutput.writeTo(dVar.c());
            }

            public long contentLength() {
                return typedOutput.length();
            }
        };
    }

    private static TypedInput a(final ResponseBody responseBody) {
        if (responseBody.contentLength() == 0) {
            return null;
        }
        return new TypedInput() {
            public String mimeType() {
                MediaType contentType = responseBody.contentType();
                return contentType == null ? null : contentType.toString();
            }

            public long length() {
                return responseBody.contentLength();
            }

            public InputStream in() throws IOException {
                return responseBody.byteStream();
            }
        };
    }

    private static List<Header> a(Headers headers) {
        int size = headers.size();
        List<Header> arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new Header(headers.name(i), headers.value(i)));
        }
        return arrayList;
    }
}
