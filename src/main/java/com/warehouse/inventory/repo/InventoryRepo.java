package com.warehouse.inventory.repo;

import com.warehouse.inventory.entity.Inventory;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InventoryRepo extends MongoRepository<Inventory, Long> {
}
