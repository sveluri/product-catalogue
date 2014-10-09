package com.service.impl;

import com.dal.ProductDao;
import com.dal.domain.ProductDomain;
import com.model.Product;
import com.service.ProductService;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;

/**
 * Implementation for {@link com.service.ProductService}
 */
@Transactional
public class ProductServiceImpl implements ProductService {

    private ProductDao productDao;

    /**
     * Sets new productDao.
     *
     * @param productDao New value of productDao.
     */
    @Required
    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public Product readProduct(int id) {
        ProductDomain productDomain = productDao.getProduct(id);

        if(productDomain == null) {
            throw new EntityNotFoundException("Entity Not Found for given id " + id);
        }

        Product product = new Product(productDomain.getName(), productDomain.getDescription(),
                                      productDomain.getQuantity(), productDomain.getPrice());

        product.setId(productDomain.getId());

        return product;
    }
}
