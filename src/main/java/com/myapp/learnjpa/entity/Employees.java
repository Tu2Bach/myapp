package com.myapp.learnjpa.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "employees")
@Getter
@Setter
public class Employees implements Serializable {

    @Id
    @Column(name = "employeeNumber")
    private long employeeNumber;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "extension")
    private String extension;
    @Column(name = "email")
    private String email;
    @Column(name = "officeCode")
    private String officeCode;
    /*@Column(name = "reportsTo")
    private long reportsTo;*/
//    @ManyToOne(cascade = {CascadeType.ALL})
//    @JoinColumn(name = "reportsTo", insertable = false, updatable = false)
//    private Employees reportsToObj;
//    @OneToMany(mappedBy = "reportsToObj")
//    private Set<Employees> subordinates = new HashSet<Employees>();
    //
    @Column(name = "jobTitle")
    private String jobTitle;
    @OneToOne
    @JoinColumn(name = "officeCode", insertable = false, updatable = false)
    private Offices officeCodeObj;

}
