package retrofit.mime;

import com.adjust.sdk.Constants;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class MimeUtil {
    private static final Pattern CHARSET = Pattern.compile("\\Wcharset=([^\\s;]+)", 2);

    @Deprecated
    public static String parseCharset(String str) {
        return parseCharset(str, Constants.ENCODING);
    }

    public static String parseCharset(String str, String str2) {
        Matcher matcher = CHARSET.matcher(str);
        if (matcher.find()) {
            return matcher.group(1).replaceAll("[\"\\\\]", "");
        }
        return str2;
    }

    private MimeUtil() {
    }
}
