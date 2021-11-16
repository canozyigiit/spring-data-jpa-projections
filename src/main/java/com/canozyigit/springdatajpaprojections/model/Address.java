package com.canozyigit.springdatajpaprojections.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Data
@Entity
public class Address {
    @Id
    private Integer id;

    @OneToOne
    private Person person;

    private String state;

    private String city;

    private String street;

    private String zipCode;
}
