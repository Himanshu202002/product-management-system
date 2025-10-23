package com.ms.Productms.Repo;

import com.ms.Productms.Entity.PmsEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PmsRepo extends MongoRepository<PmsEntity, String> {
    List<PmsEntity>findByNameContainingIgnoreCase(String name);
}
