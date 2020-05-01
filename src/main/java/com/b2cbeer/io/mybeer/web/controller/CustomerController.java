package com.b2cbeer.io.mybeer.web.controller;

import com.b2cbeer.io.mybeer.service.CustomerService;
import com.b2cbeer.io.mybeer.web.modal.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }

    @PostMapping
    public ResponseEntity<?> handleSave(@RequestBody Customer customer){
        Customer customer1 = customerService.saveNewUser(customer);

        return new ResponseEntity<Customer>(customer1, HttpStatus.CREATED);
    }

    @GetMapping("/{cus_id}")
    public ResponseEntity<Customer> handleFetch(@PathVariable UUID cus_id){
        return new ResponseEntity<>(customerService.getCustomer(cus_id), HttpStatus.OK);
    }

    @PutMapping("/{cus_id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void handleUpdate(@PathVariable UUID cus_id, @RequestBody Customer customer){
        customerService.updateCustomer(cus_id, customer);
    }

    @DeleteMapping("/{cus_id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void handleDelete(@PathVariable UUID cus_id){
        customerService.deleteCustomer(cus_id);
    }
}
