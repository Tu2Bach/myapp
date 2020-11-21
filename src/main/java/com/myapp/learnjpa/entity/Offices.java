package com.myapp.learnjpa.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "offices")
@Getter
@Setter
public class Offices implements Serializable {

    @Id
    @Column(name = "officeCode")
    private String officeCode;
    @Column(name = "city")
    private String city;
    @Column(name = "phone")
    private String phone;
    @Column(name = "addressLine1")
    private String addressLine1;
    @Column(name = "addressLine2")
    private String addressLine2;
    @Column(name = "state")
    private String state;
    @Column(name = "country")
    private String country;
    @Column(name = "postalCode")
    private String postalCode;
    @Column(name = "territory")
    private String territory;

}
