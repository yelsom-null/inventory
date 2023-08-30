package com.warehouse.inventory.entity;


import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "inhouse_parts")
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
