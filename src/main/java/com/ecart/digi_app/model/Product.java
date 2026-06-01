package com.ecart.digi_app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {
    private String name;
    private long productNumber;
    private char productSize;
    private double price;
    private String internalVendorNumber;
    private long vendorNumber;
    private long distributionChannel;
    private String salesOrderType;
}
