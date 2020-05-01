package com.b2cbeer.io.mybeer.service.impl;

import com.b2cbeer.io.mybeer.service.CustomerService;
import com.b2cbeer.io.mybeer.web.modal.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public Customer saveNewUser(Customer customer){
        log.debug("customer creating...");
        return Customer.builder().id(UUID.randomUUID())
                .build();
    }

    @Override
    public Customer getCustomer(UUID uuid){
        log.debug("fetching customer data");
        return Customer.builder().id(UUID.randomUUID())
                .username("demon")
                .build();
    }

    @Override
    public void updateCustomer(UUID cus_id, Customer customer) {
        log.debug("Updating customer");
    }

    @Override
    public void deleteCustomer(UUID cus_id) {
        log.debug("Deleting Customer");
    }


}
