package com.service.impl;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import javax.persistence.EntityNotFoundException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.model.Product;
import com.service.ProductService;

/**
 * Integration test for {@link com.service.ProductService}
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:service-test-beans.xml"})
public class ProductServiceIntegrationTest {

    @Autowired
    private ProductService productService;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testReadProduct() throws Exception {
        Product product = productService.readProduct(1);
        assertThat(product, notNullValue());
    }

    @Test
    public void testReadProduct_Invalid() throws Exception {
        expectedException.expect(EntityNotFoundException.class);
        productService.readProduct(100);
    }
}
