package com.ru.store.service;

import com.ru.store.model.Product;
import com.ru.store.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class ProductService {
    public final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ArrayList<Product> getAllProductStock() {
        return productRepository.findAllByInStock(true);
    }
}
