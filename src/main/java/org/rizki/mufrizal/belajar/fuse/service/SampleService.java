package org.rizki.mufrizal.belajar.fuse.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @Author Rizki Mufrizal <mufrizalrizki@gmail.com>
 * @Web <https://RizkiMufrizal.github.io>
 * @Since 20 February 2019
 * @Time 15:30
 * @Project camel-blueprint
 * @Package org.rizki.mufrizal.belajar.fuse.service
 * @File SampleService
 */
@Path("/")
public class SampleService {

    @GET
    @Path("/sample")
    @Produces(MediaType.APPLICATION_JSON)
    public String getSample() {
        return "Hello Sample";
    }
}
