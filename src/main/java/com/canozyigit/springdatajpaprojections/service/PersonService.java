package com.canozyigit.springdatajpaprojections.service;

import com.canozyigit.springdatajpaprojections.model.Person;
import com.canozyigit.springdatajpaprojections.projection.PersonDto;
import com.canozyigit.springdatajpaprojections.projection.PersonView;

import java.util.List;
import java.util.Optional;

public interface PersonService {
    Person createPerson(Person person);
    Person getPersonByID(int id);
    PersonView getPersonByLastName(String lastName);
    PersonDto getPersonByFirstName(String firstName);
    <T> Optional<T> getPersonLastName(String lastName);
    List<Person> findAll();
}
