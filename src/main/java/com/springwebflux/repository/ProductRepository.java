package com.springwebflux.repository;

import com.springwebflux.entity.Product;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ProductRepository extends ReactiveCrudRepository<Product, Long> {

}
