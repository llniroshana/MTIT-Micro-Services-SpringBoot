package com.sliit.mtit.microservice.customerservice.controller;

import com.sliit.mtit.microservice.customerservice.dto.CustomerRequest;
import com.sliit.mtit.microservice.customerservice.dto.CustomerResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody
    CustomerResponse createCustomer(@RequestBody CustomerRequest customerRequest){

        System.out.println("Customer Details: " + customerRequest);

        var customerResponse = new CustomerResponse();
        customerResponse.setCustomerId(UUID.randomUUID().toString());
        customerResponse.setMessage("Successfully created the customer account!");

        return customerResponse;

    }


}
