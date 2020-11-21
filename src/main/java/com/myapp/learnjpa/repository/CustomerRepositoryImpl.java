package com.myapp.learnjpa.repository;

import com.myapp.learnjpa.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class CustomerRepositoryImpl implements CustomerRepositoryCustom {

    @Autowired
    private EntityManager entityManager;

    public CustomerRepositoryImpl() {}

    @Override
    public List<Customer> getCustomerByName(String custName) {
        List<Customer> cust = null;
        String sql = " select c.customerNumber, c.customerName, c.contactLastName, c.contactFirstName, c.phone " +
                " c.addressLine1, c.addressLine2, c.city, c.state, c.postalCode, c.country, c.salesRepEmployeeNumber, " +
                " c.creaditLimit " +
                " from customers c " +
                " where c.customerName like '%" + custName + "%'";
        Query query = entityManager.createQuery(sql, Customer.class);
        return cust;
    }

}
