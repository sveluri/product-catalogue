package com.dal.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.dal.ProductDao;
import com.dal.domain.ProductDomain;

import java.util.List;

/**
 * DAO Implementation for {@link com.dal.ProductDao}
 */
@Repository
public class ProductDaoImpl implements ProductDao {

    @PersistenceContext(unitName = "productCatalogue")
    private EntityManager entityManager;

    /**
     * Sets new entityManager.
     *
     * @param entityManager New value of entityManager.
     */
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public ProductDomain getProduct(int id) {

        Query query = entityManager.createQuery("FROM ProductDomain WHERE id = :id ");
        query.setParameter("id", id);

        List resultList = query.getResultList();
        if(resultList.isEmpty()) {
            return null;
        }
        else
            return (ProductDomain)resultList.get(0);
    }
}