package com.b2cbeer.io.mybeer.service;

import com.b2cbeer.io.mybeer.web.modal.Customer;

import java.util.UUID;

public interface CustomerService {
    
    Customer saveNewUser(Customer customer);

    Customer getCustomer(UUID cus_id);

    void updateCustomer(UUID cus_id, Customer customer);

    void deleteCustomer(UUID cus_id);
}
