package com.ecommerce.Inventory.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document
@Data
public class Product {
    @Id
    private  String id;
    private  String name;
    private BigDecimal price;
    private  int quantity;
}