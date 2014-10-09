package com.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.UUID;

/**
 * Product class
 */
@XmlRootElement
public class Product {

    private int id;
    private String name;
    private String description;
    private int quantity;
    private double price;

    public Product(){}

    public Product(String name) {
        this.name = name;
    }

    public Product(String name, String description, int quantity, double price) {
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    /**
     * Gets id.
     *
     * @return Value of id.
     */
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
}
