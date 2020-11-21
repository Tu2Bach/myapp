package com.myapp.learnjpa.repository;

import com.myapp.learnjpa.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom {
    @Query(value = "SELECT * FROM customers WHERE customerName LIKE %?1%", nativeQuery = true)
    List<Customer> findByName(String custName);
}
