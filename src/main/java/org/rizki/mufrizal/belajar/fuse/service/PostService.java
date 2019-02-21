package org.rizki.mufrizal.belajar.fuse.service;

import org.rizki.mufrizal.belajar.fuse.entity.Post;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @Author Rizki Mufrizal <mufrizalrizki@gmail.com>
 * @Web <https://RizkiMufrizal.github.io>
 * @Since 21 February 2019
 * @Time 16:22
 * @Project belajar-fuse
 * @Package org.rizki.mufrizal.belajar.fuse.service
 * @File PostService
 */
@Path("/api")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PostService {

    @GET
    @Path("/posts")
    public Response getPosts() {
        return null;
    }

    @POST
    @Path("/posts")
    public Response savePost(Post post) {
        return null;
    }

}
