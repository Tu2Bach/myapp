package com.myapp.learnjpa.repository;

import com.myapp.learnjpa.entity.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {
    public List<Customer> getCustomerByName(String custName);
}
