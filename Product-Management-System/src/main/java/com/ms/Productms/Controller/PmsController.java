package com.ms.Productms.Controller;

import com.ms.Productms.Entity.PmsEntity;
import com.ms.Productms.Service.PmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/products")
public class PmsController {

    @Autowired
    private PmsService pmsService;

    @GetMapping("/healthcheck")
    public String healthCheck() {
        return "✅ Product Management API is running!";
    }
    
    @GetMapping
    public List<PmsEntity> getAllProducts(){
        return pmsService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Optional<PmsEntity> findById(@PathVariable String id){
        return pmsService.findById(id);
    }

    @PostMapping
    public PmsEntity addProduct(@RequestBody PmsEntity product){
        return pmsService.addProduct(product);
    }

    @PutMapping("/{id}")
    public PmsEntity updateProduct(@PathVariable String id, @RequestBody PmsEntity product){
        return pmsService.updateProduct(id, product);
    }

    @DeleteMapping("/{id}")
    private String deleteProduct(@PathVariable String id){
        pmsService.deleteProduct(id);
        return "Successfully Deleted!";
    }

    @GetMapping("/search")
    public List<PmsEntity> searchProducts(@RequestParam String name){
        return pmsService.searchProduct(name);
    }

}
