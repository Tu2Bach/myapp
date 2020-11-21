package com.myapp.learnjpa.services;

import com.myapp.learnjpa.dto.CustomerDTO;
import com.myapp.learnjpa.entity.Customer;
import com.myapp.learnjpa.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Iterable<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public List<CustomerDTO> getCustomerByName(String custName) {
        return null;
    }
}
