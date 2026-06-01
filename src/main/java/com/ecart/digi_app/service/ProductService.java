package com.ecart.digi_app.service;

import com.ecart.digi_app.exception.MandatoryValidationException;
import com.ecart.digi_app.model.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    public void validateProduct(Product product) {
        try {
            if (product.getName().isBlank()) {
                throw new MandatoryValidationException("name should not be blank");

            }
            if (product.getPrice() < 100) {
                throw new MandatoryValidationException("price should not be less than 100");
            }

        } catch (MandatoryValidationException e) {
            throw new MandatoryValidationException("mandatory validation failed");
        }
    }
}

