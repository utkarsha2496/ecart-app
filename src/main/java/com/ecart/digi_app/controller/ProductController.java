package com.ecart.digi_app.controller;

import com.ecart.digi_app.model.Product;
import com.ecart.digi_app.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/mh-order-product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/product")
    public ResponseEntity bookProduct(@RequestBody Product product){
        log.info("request is entered inside controller");
        productService.validateProduct(product);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Product booked successfully");



    }
}
