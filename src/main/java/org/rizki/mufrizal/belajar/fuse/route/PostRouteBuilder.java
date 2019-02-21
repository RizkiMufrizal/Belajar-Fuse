package org.rizki.mufrizal.belajar.fuse.route;

import org.apache.camel.builder.RouteBuilder;
import org.rizki.mufrizal.belajar.fuse.entity.Post;

import javax.ws.rs.core.Response;
import java.util.Date;

/**
 * @Author Rizki Mufrizal <mufrizalrizki@gmail.com>
 * @Web <https://RizkiMufrizal.github.io>
 * @Since 21 February 2019
 * @Time 16:28
 * @Project belajar-fuse
 * @Package org.rizki.mufrizal.belajar.fuse.route
 * @File PostRouteBuilder
 */
public class PostRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("direct:getPosts")
                .process(exchange -> {
                    Post blogPost = new Post();
                    blogPost.setId(1);
                    blogPost.setTitle("My Title");
                    blogPost.setContent("##Secondary title");
                    blogPost.setPublishedDate(new Date());
                    exchange.getOut().setBody(Response.status(Response.Status.OK).entity(blogPost).build());
                }).end();

        from("direct:savePost")
                .process(exchange -> {
                    Post post = (Post) exchange.getIn().getBody();
                    post.setContent("Change Content Ok from : " + post.getContent());
                    exchange.getOut().setBody(Response.status(Response.Status.OK).entity(post).build());
                }).end();
    }
}
