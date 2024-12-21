package com.springwebflux.service;

import com.springwebflux.entity.Product;
import com.springwebflux.repository.ProductRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // 모든 제품 조회
    public Flux<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // 제품 생성
    public Mono<Product> createProduct(Product product) {
        return productRepository.save(product);
    }
}
