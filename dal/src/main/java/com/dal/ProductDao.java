package com.dal;

import com.dal.domain.ProductDomain;

import java.util.Date;
import java.util.List;

/**
 * Contains all the operations with DB
 */
public interface ProductDao {

    /**
     * Responsible to read a single product
     * 
     * @param id product id
     * @return {@link com.dal.domain.ProductDomain} corresponding to id
     */
    ProductDomain getProduct(int id);

    /**
     * Responsible to retrieve all the products in data store
     * 
     * @return list of {@link com.dal.domain.ProductDomain}
     */
    List<ProductDomain> getAllProducts();


    void delete(Date doj);

}
