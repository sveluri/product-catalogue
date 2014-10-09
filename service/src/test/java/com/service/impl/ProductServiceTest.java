package com.service.impl;

import com.dal.ProductDao;
import com.dal.domain.ProductDomain;
import com.model.Product;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;

/**
 * Unit test case for {@link com.dal.ProductDao}
 */
@RunWith(MockitoJUnitRunner.class)
public class ProductServiceTest {

    @InjectMocks
    private ProductServiceImpl productService;

    @Mock
    private ProductDao productDao;

    private ProductDomain productDomain;

    @Before
    public void setUp() {
        productDomain = new ProductDomain("testProduct");
        when(productDao.getProduct(1)).thenReturn(productDomain);
    }

    @Test
    public void testReadProduct() {
        Product product = productService.readProduct(1);
        assertThat(product, notNullValue());
        assertThat(product.getName(), is("testProduct"));
    }
}
