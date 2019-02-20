package org.rizki.mufrizal.belajar.fuse.route;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;

/**
 * @Author Rizki Mufrizal <mufrizalrizki@gmail.com>
 * @Web <https://RizkiMufrizal.github.io>
 * @Since 20 February 2019
 * @Time 14:50
 * @Project camel-blueprint
 * @Package org.rizki.mufrizal.belajar.fuse.route
 * @File SampleLogRoute
 */
public class SampleLogRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("timer:foo?period=2000")
                .setBody()
                .simple("Hello")
                .log(LoggingLevel.INFO, "logging ${body}");
    }
}