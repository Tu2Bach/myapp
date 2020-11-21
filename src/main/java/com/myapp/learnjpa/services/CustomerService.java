package com.myapp.learnjpa.services;

import com.myapp.learnjpa.dto.CustomerDTO;
import com.myapp.learnjpa.entity.Customer;
import org.springframework.security.access.annotation.Secured;

import java.util.List;

public interface CustomerService {
    @Secured({"ROLE_ADMIN"})
    Iterable<Customer> getAllCustomers();
    List<CustomerDTO> getCustomerByName(String custName);
}
