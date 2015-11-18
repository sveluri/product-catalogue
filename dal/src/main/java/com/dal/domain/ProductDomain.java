package com.dal.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Domain class For Product
 */
@Entity
@Table(name = "product")
public class ProductDomain {

    private int id;
    private String name;
    private String description;
    private int quantity;
    private double price;
    private Date creationDate;

    public ProductDomain(){}

    public ProductDomain(String name) {
        this.name = name;
    }

    /**
     * Gets id.
     *
     * @return Value of id.
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    /**
     * Gets name.
     *
     * @return Value of name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets new price.
     *
     * @param price New value of price.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Sets new name.
     *
     * @param name New value of name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets new quantity.
     *
     * @param quantity New value of quantity.
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Gets quantity.
     *
     * @return Value of quantity.
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Gets description.
     *
     * @return Value of description.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets new id.
     *
     * @param id New value of id.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets price.
     *
     * @return Value of price.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets new description.
     *
     * @param description New value of description.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductDomain that = (ProductDomain) o;

        if (id != that.id) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Product{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", quantity=").append(quantity);
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }

    /**
     * Sets new creationDate.
     *
     * @param creationDate New value of creationDate.
     */
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * Gets creationDate.
     *
     * @return Value of creationDate.
     */
    public Date getCreationDate() {
        return creationDate;
    }
}
