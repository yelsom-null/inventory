package com.warehouse.inventory;

import javafx.collections.ObservableList;

public class Product {
    private ObservableList<Part>associatedParts;
    private int id;
    private String name;
    private int price;
    private int stock;
    private int min;
    private int max;

    public Product(int id, String name,int min, int max){
        this.id = id;
        this.name = name;
        this.min = min;
        this.max = max;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void addAssociatedPart(Part newPart){
        associatedParts.add(newPart);
    }
    public boolean deleteAssociatedPart(Part selectedAssociatedPart){
        if(associatedParts.contains(selectedAssociatedPart));
       return true;
    }

    public ObservableList<Part> getAllAssociatedParts(){
        return associatedParts;
    }
}