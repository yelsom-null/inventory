package com.warehouse.inventory.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import javafx.collections.ObservableList;

@Document(collection = "product")
public class Product {

    @DBRef
    private Inventory inventory;

    private ObservableList<Part> associatedParts;

    @Id
    private String id;

    private String name;
    private int price;
    private int stock;
    private int min;
    private int max;

    public Product() {
    }

    public Product(String id, String name, int min, int max) {
        this.id = id;
        this.name = name;
        this.min = min;
        this.max = max;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
