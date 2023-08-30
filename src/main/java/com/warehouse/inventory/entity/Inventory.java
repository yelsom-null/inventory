package com.warehouse.inventory.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "inventories")
public class Inventory {

    @Id
    private String id;
    private List<Part> allParts;
    private List<Product> allProducts;

    public Inventory() {
    }

    public void addPart(Part newPart){
        allParts.add(newPart);
    }

    public void addProduct(Product newProduct){
        allProducts.add(newProduct);
    }

    public Part lookUpPart(int partId){
     for(Part part : allParts){
         if(part.getId() == partId){
             return part;
         }
      }
     return null;
    }

    public Product lookUpProduct(String productId){
       for(Product product : allProducts){
           if(product.getId() == productId){
               return product;
           }
       }
       return null;
    }

    public Part lookUpPartName(String partName){
        for(Part part : allParts){
            if(part.getName().equals(partName)){
                return part;
            }
        }
        return null;
    }

    public Product lookUpProductName(String productName){
        for(Product product : allProducts){
            if(product.getName().equals(productName)){
                return product;
            }
        }
        return null;
    }


    public boolean deletePart(Part selectedPart){
        if(allParts.contains(selectedPart)){
            allParts.remove(selectedPart);
            return true;
        }
        System.out.print("Part not found.");
        return false;
    }

    public boolean deleteProduct(Product selectedProduct){
        if(allProducts.contains(selectedProduct)){
            allProducts.remove(selectedProduct);
            return true;
        }
        System.out.print("Product not found.");
        return false;
    }

    public List<Part> getAllParts() {
        return allParts;
    }

    public List<Product> getAllProducts() {
        return allProducts;
    }
}
