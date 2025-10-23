package com.ms.Productms.Service;

import com.ms.Productms.Entity.PmsEntity;
import com.ms.Productms.Repo.PmsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class PmsService {

    @Autowired
    private PmsRepo pmsRepo;

    public List<PmsEntity> getAllProducts(){
        return pmsRepo.findAll();
    }

    public Optional<PmsEntity> findById(String id){
        return pmsRepo.findById(id);
    }

    public PmsEntity addProduct(PmsEntity product){
        product.setCreatedAt(LocalDateTime.now());
        product.setUpdatedAt(LocalDateTime.now());
        return pmsRepo.save(product);
    }

    public PmsEntity updateProduct(String id, PmsEntity updatedProduct){
        return pmsRepo.findById(id).map(product -> {
            product.setName(updatedProduct.getName());
            product.setDescription(updatedProduct.getDescription());
            product.setPrice(updatedProduct.getPrice());
            product.setQuantity(updatedProduct.getQuantity());
            product.setUpdatedAt(LocalDateTime.now());
            return pmsRepo.save(product);
        }).orElse(null);
    }

    public void deleteProduct(String id){
        pmsRepo.deleteById(id);
    }

    public List<PmsEntity> searchProduct(String name){
        return pmsRepo.findByNameContainingIgnoreCase(name);
    }
}
