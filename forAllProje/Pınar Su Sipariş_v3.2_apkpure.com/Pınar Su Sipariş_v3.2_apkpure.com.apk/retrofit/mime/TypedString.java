package retrofit.mime;

import com.adjust.sdk.Constants;
import java.io.UnsupportedEncodingException;

public class TypedString extends TypedByteArray {
    public TypedString(String str) {
        super("text/plain; charset=UTF-8", convertToBytes(str));
    }

    private static byte[] convertToBytes(String str) {
        try {
            return str.getBytes(Constants.ENCODING);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public String toString() {
        try {
            return "TypedString[" + new String(getBytes(), Constants.ENCODING) + "]";
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError("Must be able to decode UTF-8");
        }
    }
}
