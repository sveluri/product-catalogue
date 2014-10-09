package com.rest.impl;

import com.model.Product;
import com.rest.ProductEndpoints;
import com.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * Implementation for {@link com.rest.ProductEndpoints}
 */
@Path("/products")
public class ProductEndpointsImpl implements ProductEndpoints {


    private ProductService productService;

    /**
     * Sets new productService.
     *
     * @param productService New value of productService.
     */
    @Required
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public Product readProduct(int id) {
        return productService.readProduct(id);
    }
}
