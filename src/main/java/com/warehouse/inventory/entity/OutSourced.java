package com.warehouse.inventory.entity;

import com.warehouse.inventory.entity.Part;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "outsourced_parts")
public class OutSourced extends Part {

    private String companyName;
    public OutSourced(int id, String name, double price, int stock, int min, int max) {
        super(id, name, price, stock, min, max);
    }

    public OutSourced() {

    }

    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }

    public String getCompanyName(){return companyName;}

}
