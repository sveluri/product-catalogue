package com.dal.impl;

import com.dal.ProductDao;
import com.dal.domain.ProductDomain;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * TODO :
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:database-beans.xml")
@Transactional
public class ProductDaoTest {

    @Autowired
    private ProductDao productDao;

    /**
     * This tests directly the environment
     */
    @Ignore
    @Test
    public void testDatabase() {
        ProductDomain product = productDao.getProduct(1);
        System.out.println(product);
    }
}
