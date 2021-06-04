package com.sliit.mtit.microservice.customerservice.dto;

public class CustomerRequest {

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

    @Override
    public String toString() {
        return "CustomerRequest{" +
                "customerName='" + customerName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
