package com.dkorobtsov.logging.internal;

import java.util.List;

public final class InterceptedResponse {

    public final List<String> segmentList;
    public final String header;
    public final int code;
    public final boolean isSuccessful;
    public final String message;
    public final InterceptedMediaType contentType;
    public final String url;
    public final String originalBody;
    public final boolean hasPrintableBody;
    public final long chainMs;

    InterceptedResponse(List<String> segmentList, String header, int code, boolean isSuccessful,
        String message, InterceptedMediaType contentType, String url,
        String originalBody, boolean hasPrintableBody, long chainMs) {
        this.segmentList = segmentList;
        this.header = header;
        this.code = code;
        this.isSuccessful = isSuccessful;
        this.message = message;
        this.contentType = contentType;
        this.url = url;
        this.originalBody = originalBody;
        this.hasPrintableBody = hasPrintableBody;
        this.chainMs = chainMs;
    }

    public static ResponseDetailsBuilder builder() {
        return new ResponseDetailsBuilder();
    }

    public static class ResponseDetailsBuilder {

        private List<String> segmentList;
        private String header;
        private int code;
        private boolean isSuccessful;
        private String message;
        private InterceptedMediaType contentType;
        private String url;
        private String originalBody;
        private boolean hasPrintableBody;
        private long chainMs;

        ResponseDetailsBuilder() {
        }

        public ResponseDetailsBuilder segmentList(List<String> segmentList) {
            this.segmentList = segmentList;
            return this;
        }

        public ResponseDetailsBuilder header(String header) {
            this.header = header;
            return this;
        }

        public ResponseDetailsBuilder code(int code) {
            this.code = code;
            return this;
        }

        public ResponseDetailsBuilder isSuccessful(boolean isSuccessful) {
            this.isSuccessful = isSuccessful;
            return this;
        }

        public ResponseDetailsBuilder message(String message) {
            this.message = message;
            return this;
        }

        public ResponseDetailsBuilder contentType(InterceptedMediaType contentType) {
            this.contentType = contentType;
            return this;
        }

        public ResponseDetailsBuilder url(String url) {
            this.url = url;
            return this;
        }

        public ResponseDetailsBuilder chainMs(long chainMs) {
            this.chainMs = chainMs;
            return this;
        }

        public ResponseDetailsBuilder originalBody(String originalBody) {
            this.originalBody = originalBody;
            return this;
        }

        public ResponseDetailsBuilder hasPrintableBody(boolean hasPrintableBody) {
            this.hasPrintableBody = hasPrintableBody;
            return this;
        }

        public InterceptedResponse build() {
            return new InterceptedResponse(segmentList, header, code, isSuccessful, message,
                contentType, url, originalBody, hasPrintableBody, chainMs);
        }

    }
}