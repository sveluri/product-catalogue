package com.rest;

import com.model.Product;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Rest endpoints definition for Product
 */
public interface ProductEndpoints {

    @GET
    @Path("/{productid}")
    @Produces({ MediaType.APPLICATION_XML })
    Product readProduct(@PathParam("productid") int id);
}
