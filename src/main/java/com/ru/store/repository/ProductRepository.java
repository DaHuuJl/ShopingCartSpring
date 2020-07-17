package com.ru.store.repository;

import com.ru.store.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.ArrayList;

public interface ProductRepository extends JpaRepository<Product, Long> {
    ArrayList<Product> findAllByInStock(Boolean in_stock);
}
