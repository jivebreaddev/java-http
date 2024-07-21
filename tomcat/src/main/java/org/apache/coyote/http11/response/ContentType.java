package org.apache.coyote.http11.response;

public enum ContentType {
    js("application/javascript;charset=utf-8"),
    html("text/html;charset=utf-8"),
    css("text/css"),
    svg("image/svg+xml"),
    ttf("application/octet-stream"),
    otf("application/x-font-opentype"),
    woff("application/font-woff"),
    woff2("application/font-woff2"),
    ico("image/avif"),
    json("application/json");

    private final String contentType;

    ContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getContentType() {
        return contentType;
    }

    @Override
    public String toString() {
        return "ContentType{" +
            "contentType='" + contentType + '\'' +
            '}';
    }
}
