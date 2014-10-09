package com.dal.impl;

import com.dal.ProductDao;
import com.dal.domain.ProductDomain;
import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.hamcrest.core.IsNull.nullValue;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

/**
 * Unit test for {@link com.dal.ProductDao}
 */
@RunWith(MockitoJUnitRunner.class)
public class ProductDaoTest {

    @InjectMocks
    private ProductDaoImpl productDao;

    @Mock
    private EntityManager entityManager;

    @Mock
    private Query query;

    private List<ProductDomain> productDomainList;

    @Before
    public void setUp() {
        productDomainList = new ArrayList<>();
        productDomainList.add(new ProductDomain("testProduct"));
        when(entityManager.createQuery(anyString())).thenReturn(query);
        when(query.getResultList()).thenReturn(productDomainList);
    }

    @Test
    public void testGetProduct() {
        ProductDomain product = productDao.getProduct(1);
        assertThat(product, notNullValue());
        assertThat(product.getName(), is("testProduct"));
    }

    @Test
    public void testGetProduct_InvalidValue() {
        when(query.getResultList()).thenReturn(new ArrayList());
        ProductDomain product = productDao.getProduct(1);
        assertThat(product, nullValue());
    }

    @Test
    public void testGetAllProducts() {
        List<ProductDomain> products = productDao.getAllProducts();
        assertThat(products, CoreMatchers.notNullValue());
        assertThat(products.size(), is(1));
    }
}
