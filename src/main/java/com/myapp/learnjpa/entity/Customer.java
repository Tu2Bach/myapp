package com.myapp.learnjpa.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "customers")
@Getter
@Setter
public class Customer implements Serializable {

    @Id
    @Column(name = "customerNumber")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerNumber;
    @Column(name = "customerName")
    private String customerName;
    @Column(name = "contactLastName")
    private String contactLastName;
    @Column(name = "contactFirstName")
    private String contactFirstName;
    @Column(name = "phone")
    private String phone;
    @Column(name = "addressLine1")
    private String addressLine1;
    @Column(name = "addressLine2")
    private String addressLine2;
    @Column(name = "city")
    private String city;
    @Column(name = "state")
    private String state;
    @Column(name = "postalCode")
    private String postalCode;
    @Column(name = "country")
    private String country;
    @Column(name = "salesRepEmployeeNumber")
    private String salesRepEmployeeNumber;
    @Column(name = "creditLimit")
    private String creditLimit;

    public Customer() {

    }

    public Customer(int customerNumber, String customerName) {
        this.customerNumber = customerNumber;
        this.customerName = customerName;
    }
}
