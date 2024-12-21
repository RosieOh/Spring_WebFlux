package com.springwebflux.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("TBL_PRODUCTS")
@Getter
@Setter
@ToString
public class Product {

    @Id
    private Long id;
    private String name;
    private Double price;
    private String description;

    // 기본 생성자
    public Product() {

    }

    // 생성자
    public Product(Long id, String name, Double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }


}
