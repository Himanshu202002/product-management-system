package com.ms.Productms.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "products")
public class PmsEntity {

    @Id
    private String id;
    private String name;
    private String description;
    private double price;
    private int quantity;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
