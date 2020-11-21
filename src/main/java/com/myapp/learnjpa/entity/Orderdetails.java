package com.myapp.learnjpa.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "orderdetails")
@Getter
@Setter
public class Orderdetails implements Serializable {

    @Id
    @Column(name = "orderNumber")
    private long orderNumber;
    @Id
    @Column(name = "productCode")
    private String productCode;
    @Column(name = "quantityOrdered")
    private long quantityOrdered;
    @Column(name = "priceEach")
    private double priceEach;
    @Column(name = "orderLineNumber")
    private long orderLineNumber;

}
