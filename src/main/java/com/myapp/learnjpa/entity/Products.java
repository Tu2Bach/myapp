package com.myapp.learnjpa.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "products")
@Getter
@Setter
public class Products implements Serializable {

    @Id
    @Column(name = "productCode")
    private String productCode;
    @Column(name = "productName")
    private String productName;
    @Column(name = "productLine")
    private String productLine;
    @Column(name = "productScale")
    private String productScale;
    @Column(name = "productVendor")
    private String productVendor;
    @Column(name = "productDescription")
    private String productDescription;
    @Column(name = "quantityInStock")
    private long quantityInStock;
    @Column(name = "buyPrice")
    private double buyPrice;
    @Column(name = "msrp")
    private double msrp;

}
