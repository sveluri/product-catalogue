package com.dal.impl;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.dal.ProductDao;
import com.dal.domain.ProductDomain;

/**
 * Integration test case for {@link com.dal.ProductDao}
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:test-database-beans.xml")
@Transactional
public class ProductDaoIntegrationTest {

    @Autowired
    private ProductDao productDao;

    @Test
    public void testGetProduct() {
        ProductDomain product = productDao.getProduct(1);
        assertThat(product, notNullValue());
        assertThat(product.getId(), is(1));
        assertThat(product.getName(), is("product1"));
    }

    @Test
    public void testGetAllProducts() {
        List<ProductDomain> products = productDao.getAllProducts();
        assertThat(products, notNullValue());
        assertThat(products.size(), is(4));
    }
}
