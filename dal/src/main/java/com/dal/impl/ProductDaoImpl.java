package com.dal.impl;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.dal.ProductDao;
import com.dal.domain.ProductDomain;
import org.springframework.transaction.annotation.Transactional;

/**
 * DAO Implementation for {@link com.dal.ProductDao}
 */
@Repository
@Transactional
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

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductDomain getProduct(int id) {

        Query query = entityManager.createQuery("FROM ProductDomain WHERE id = :id ");
        query.setParameter("id", id);

        List resultList = query.getResultList();
        if (resultList.isEmpty()) {
            return null;
        }
        else
            return (ProductDomain) resultList.get(0);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ProductDomain> getAllProducts() {
        Query query = entityManager.createQuery("FROM ProductDomain");
        return query.getResultList();
    }

    @Override
    public void delete(Date doj) {

        Query query = entityManager.createQuery("DELETE FROM ProductDomain WHERE creationDate >= :date ");
        query.setParameter("date", doj);

        int resultList = query.executeUpdate();
        System.out.println(resultList);
    }
}
