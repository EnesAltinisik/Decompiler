package com.google.gson;

import com.google.gson.internal.C$Gson$Preconditions;
import com.google.gson.internal.Streams;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* compiled from: TreeTypeAdapter */
final class b<T> extends TypeAdapter<T> {
    private final JsonSerializer<T> a;
    private final JsonDeserializer<T> b;
    private final Gson c;
    private final TypeToken<T> d;
    private final TypeAdapterFactory e;
    private TypeAdapter<T> f;

    /* compiled from: TreeTypeAdapter */
    private static class a implements TypeAdapterFactory {
        private final TypeToken<?> a;
        private final boolean b;
        private final Class<?> c;
        private final JsonSerializer<?> d;
        private final JsonDeserializer<?> e;

        a(Object obj, TypeToken<?> typeToken, boolean z, Class<?> cls) {
            this.d = obj instanceof JsonSerializer ? (JsonSerializer) obj : null;
            if (obj instanceof JsonDeserializer) {
                obj = (JsonDeserializer) obj;
            } else {
                obj = null;
            }
            this.e = obj;
            boolean z2 = (this.d == null && this.e == null) ? false : true;
            C$Gson$Preconditions.checkArgument(z2);
            this.a = typeToken;
            this.b = z;
            this.c = cls;
        }

        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            boolean isAssignableFrom = this.a != null ? this.a.equals(typeToken) || (this.b && this.a.getType() == typeToken.getRawType()) : this.c.isAssignableFrom(typeToken.getRawType());
            return isAssignableFrom ? new b(this.d, this.e, gson, typeToken, this) : null;
        }
    }

    b(JsonSerializer<T> jsonSerializer, JsonDeserializer<T> jsonDeserializer, Gson gson, TypeToken<T> typeToken, TypeAdapterFactory typeAdapterFactory) {
        this.a = jsonSerializer;
        this.b = jsonDeserializer;
        this.c = gson;
        this.d = typeToken;
        this.e = typeAdapterFactory;
    }

    public T read(JsonReader jsonReader) throws IOException {
        if (this.b == null) {
            return a().read(jsonReader);
        }
        JsonElement parse = Streams.parse(jsonReader);
        if (parse.isJsonNull()) {
            return null;
        }
        return this.b.deserialize(parse, this.d.getType(), this.c.deserializationContext);
    }

    public void write(JsonWriter jsonWriter, T t) throws IOException {
        if (this.a == null) {
            a().write(jsonWriter, t);
        } else if (t == null) {
            jsonWriter.nullValue();
        } else {
            Streams.write(this.a.serialize(t, this.d.getType(), this.c.serializationContext), jsonWriter);
        }
    }

    private TypeAdapter<T> a() {
        TypeAdapter<T> typeAdapter = this.f;
        if (typeAdapter != null) {
            return typeAdapter;
        }
        typeAdapter = this.c.getDelegateAdapter(this.e, this.d);
        this.f = typeAdapter;
        return typeAdapter;
    }

    public static TypeAdapterFactory a(TypeToken<?> typeToken, Object obj) {
        return new a(obj, typeToken, false, null);
    }

    public static TypeAdapterFactory b(TypeToken<?> typeToken, Object obj) {
        return new a(obj, typeToken, typeToken.getType() == typeToken.getRawType(), null);
    }

    public static TypeAdapterFactory a(Class<?> cls, Object obj) {
        return new a(obj, null, false, cls);
    }
}
