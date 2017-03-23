package retrofit;

public interface Profiler<T> {

    public static final class RequestInformation {
        private final String baseUrl;
        private final long contentLength;
        private final String contentType;
        private final String method;
        private final String relativePath;

        public RequestInformation(String str, String str2, String str3, long j, String str4) {
            this.method = str;
            this.baseUrl = str2;
            this.relativePath = str3;
            this.contentLength = j;
            this.contentType = str4;
        }

        public String getMethod() {
            return this.method;
        }

        public String getBaseUrl() {
            return this.baseUrl;
        }

        public String getRelativePath() {
            return this.relativePath;
        }

        public long getContentLength() {
            return this.contentLength;
        }

        public String getContentType() {
            return this.contentType;
        }
    }

    void afterCall(RequestInformation requestInformation, long j, int i, T t);

    T beforeCall();
}
