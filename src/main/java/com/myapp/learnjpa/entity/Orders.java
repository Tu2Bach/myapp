package com.myapp.learnjpa.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "orders")
@Getter
@Setter
public class Orders implements Serializable {

    @Id
    @Column(name = "orderNumber")
    private long orderNumber;
    @Column(name = "orderDate")
    private java.sql.Date orderDate;
    @Column(name = "requiredDate")
    private java.sql.Date requiredDate;
    @Column(name = "shippedDate")
    private java.sql.Date shippedDate;
    @Column(name = "status")
    private String status;
    @Column(name = "comments")
    private String comments;
    @Column(name = "customerNumber")
    private long customerNumber;

}
