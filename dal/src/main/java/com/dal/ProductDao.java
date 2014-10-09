package com.dal;

import com.dal.domain.ProductDomain;

/**
 * Contains all the operations with DB
 */
public interface ProductDao {

    ProductDomain getProduct(int id);

}
