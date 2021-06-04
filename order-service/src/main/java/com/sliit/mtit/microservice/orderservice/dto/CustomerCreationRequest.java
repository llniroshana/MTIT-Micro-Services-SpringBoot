package com.sliit.mtit.microservice.orderservice.dto;

public class CustomerCreationRequest {

    private String customerName;
    private String address;

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
}
