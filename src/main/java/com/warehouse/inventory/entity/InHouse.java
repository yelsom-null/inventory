package com.warehouse.inventory.entity;

import com.warehouse.inventory.entity.Part;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "inhouse_parts")
public class InHouse extends Part {

    private int machineId;
    public InHouse(int id, String name, double price, int stock, int min, int max) {
        super(id, name, price, stock, min, max);
    }

    public InHouse() {

    }

    public void setMachineId(int machineId){
        this.machineId = machineId;
    }

    public int getMachineId(){
        return machineId;
    }
}
