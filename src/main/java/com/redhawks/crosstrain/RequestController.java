package com.redhawks.crosstrain;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import javax.ws.rs.core.MediaType;

@Path("request")
public class RequestController {
    private RequestService requestService = new RequestService();

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String createRequest() {
        requestService.createDocument();
        return "ok";
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getRequest() {
        return requestService.hello();
    }

    @DELETE
    @Produces(MediaType.TEXT_PLAIN)
    public String deleteRequest() {
        return requestService.delete();
    }
}
