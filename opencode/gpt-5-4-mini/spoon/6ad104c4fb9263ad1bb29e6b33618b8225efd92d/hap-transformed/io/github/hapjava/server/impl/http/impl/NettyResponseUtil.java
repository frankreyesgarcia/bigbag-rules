package io.github.hapjava.server.impl.http.impl;
import HttpHeaders.Names;
import HttpHeaders.Values;
import io.github.hapjava.server.impl.http.HttpResponse;
import java.util.Map.Entry;
import io.netty.buffer.Unpooled;
import io.netty.handler.codec.http.DefaultFullHttpResponse;
import io.netty.handler.codec.http.FullHttpResponse;
import io.netty.handler.codec.http.HttpHeaders;
import io.netty.handler.codec.http.HttpResponseStatus;
import io.netty.handler.codec.http.HttpVersion;
class NettyResponseUtil {
    private static final HttpVersion EVENT_VERSION = new HttpVersion("EVENT", 1, 0, true);

    public static FullHttpResponse createResponse(HttpResponse homekitResponse) {
        FullHttpResponse response = new DefaultFullHttpResponse(homekitResponse.getVersion() == HttpResponse.HttpVersion.EVENT_1_0 ? EVENT_VERSION : HttpVersion.HTTP_1_1, HttpResponseStatus.valueOf(homekitResponse.getStatusCode()), Unpooled.copiedBuffer(homekitResponse.getBody()));
        for (Entry<String, String> header : homekitResponse.getHeaders().entrySet()) {
            response.headers().add(header.getKey(), header.getValue());
        }
        response.headers().set(Names.CONTENT_LENGTH, response.content().readableBytes());
        response.headers().set(Names.CONNECTION, Values.KEEP_ALIVE);
        return response;
    }
}
