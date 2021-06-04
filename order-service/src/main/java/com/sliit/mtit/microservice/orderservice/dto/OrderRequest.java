package com.sliit.mtit.microservice.orderservice.dto;

public class OrderRequest {

    private String customerName;
    private String address;
    private String productName;
    private String quantity;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "customerName='" + customerName + '\'' +
                ", address='" + address + '\'' +
                ", productName='" + productName + '\'' +
                ", quantity='" + quantity + '\'' +
                '}';
    }
}
