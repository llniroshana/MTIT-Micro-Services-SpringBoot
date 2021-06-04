package com.sliit.mtit.microservice.orderservice.service;

import com.sliit.mtit.microservice.orderservice.dto.CustomerCreationRequest;
import com.sliit.mtit.microservice.orderservice.dto.CustomerCreationResponse;
import com.sliit.mtit.microservice.orderservice.dto.OrderRequest;
import com.sliit.mtit.microservice.orderservice.dto.OrderResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
public class OrderServiceImpl {

    @Autowired
    private RestTemplate restTemplate;

    public OrderResponse createOrder(OrderRequest orderRequest){

        var customerCreationRequest = new CustomerCreationRequest();
        customerCreationRequest.setAddress(orderRequest.getAddress());
        customerCreationRequest.setCustomerName(orderRequest.getCustomerName());
        ResponseEntity<CustomerCreationResponse> customerCreationResponse = restTemplate.postForEntity("http://localhost:8080/customers",customerCreationRequest, CustomerCreationResponse.class);

        var orderResponse = new OrderResponse();
        orderResponse.setOrderId(UUID.randomUUID().toString());
        orderResponse.setCustomerId(customerCreationResponse.getBody().getCustomerId());
        orderResponse.setMessage("Your order has been placed successfully!");

        return orderResponse;

    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }

}
