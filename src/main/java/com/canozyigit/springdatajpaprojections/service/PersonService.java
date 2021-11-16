package com.canozyigit.springdatajpaprojections.service;

import com.canozyigit.springdatajpaprojections.model.Person;
import com.canozyigit.springdatajpaprojections.projection.PersonView;

import java.util.List;

public interface PersonService {
    Person createPerson(Person person);
    Person getPersonByID(int id);
    PersonView getPersonByLastName(String lastName);
    List<Person> findAll();
}
