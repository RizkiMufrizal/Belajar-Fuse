package org.rizki.mufrizal.belajar.fuse.route;

import org.apache.camel.builder.RouteBuilder;

/**
 * @Author Rizki Mufrizal <mufrizalrizki@gmail.com>
 * @Web <https://RizkiMufrizal.github.io>
 * @Since 21 February 2019
 * @Time 18:04
 * @Project belajar-fuse
 * @Package org.rizki.mufrizal.belajar.fuse.route
 * @File GlobalRouteBuilder
 */
public class GlobalRouteBuilder extends RouteBuilder {
    private String restEndpoint;

    @Override
    public void configure() throws Exception {
        from(restEndpoint)
                .recipientList(simple("direct:${header.operationName}"));
    }

    public void setRestEndpoint(String restEndpoint) {
        this.restEndpoint = restEndpoint;
    }
}
