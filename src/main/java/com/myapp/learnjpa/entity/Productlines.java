package com.myapp.learnjpa.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "productlines")
@Getter
@Setter
public class Productlines implements Serializable {

    @Id
    @Column(name = "productLine")
    private String productLine;
    @Column(name = "textDescription")
    private String textDescription;
    @Column(name = "htmlDescription")
    private String htmlDescription;
    @Column(name = "image")
    private String image;

}
