package com.example.module3_javaweb.entity;

public class ProductDiscount {
    private String productDescription;
    private double listPrice;
    private double discountPercent;

    public ProductDiscount(String productDescription, double listPrice, double discountPercent) {
        this.productDescription = productDescription;
        this.listPrice = listPrice;
        this.discountPercent = discountPercent;
    }

    public ProductDiscount() {
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getListPrice() {
        return listPrice;
    }

    public void setListPrice(double listPrice) {
        this.listPrice = listPrice;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }
}
