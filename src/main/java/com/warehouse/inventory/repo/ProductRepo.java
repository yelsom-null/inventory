package com.warehouse.inventory.repo;

import com.warehouse.inventory.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepo extends MongoRepository<Product,Long> {


}
