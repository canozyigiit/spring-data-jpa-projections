package com.canozyigit.springdatajpaprojections.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Data
@Entity
public class Person {

    @Id
    private Integer id;

    private String firstName;

    private String lastName;

    @OneToOne(mappedBy = "person")
    private Address address;
}
