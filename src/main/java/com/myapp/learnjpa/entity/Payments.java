package com.myapp.learnjpa.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "payments")
@Getter
@Setter
public class Payments implements Serializable {

    @Id
    @Column(name = "customerNumber")
    private long customerNumber;
    @Id
    @Column(name = "checkNumber")
    private String checkNumber;
    @Column(name = "paymentDate")
    private java.sql.Date paymentDate;
    @Column(name = "amount")
    private double amount;

}
