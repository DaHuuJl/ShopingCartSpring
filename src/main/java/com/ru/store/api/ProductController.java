package com.ru.store.api;

import com.ru.store.model.Product;
import com.ru.store.service.ProductService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/api/product",produces = {MediaType.APPLICATION_JSON_VALUE})
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping(value = "/getAllProductStock", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<Product> getAllProductStock(){
        return productService.getAllProductStock();
    }
}
