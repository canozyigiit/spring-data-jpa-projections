package com.canozyigit.springdatajpaprojections.service;

import com.canozyigit.springdatajpaprojections.model.Person;
import com.canozyigit.springdatajpaprojections.projection.PersonDto;
import com.canozyigit.springdatajpaprojections.projection.PersonView;
import com.canozyigit.springdatajpaprojections.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {
    private final PersonRepository personRepository;


    @Override
    public Person createPerson(Person person) {
        return personRepository.save(person);
    }

    @Override
    public Person getPersonByID(int id) {
        return personRepository.getById(id);
    }

    @Override
    public PersonView getPersonByLastName(String lastName) {
        return personRepository.findByLastName(lastName);
    }

    @Override
    public PersonDto getPersonByFirstName(String firstName) {
        return personRepository.findByFirstName(firstName);
    }

    @Override
    public <T> Optional<T> getPersonLastName(String lastName) {
        Optional<Person> person = personRepository.findByLastName(lastName, Person.class);
        Optional<PersonView> personView = personRepository.findByLastName(lastName, PersonView.class);
        Optional<PersonDto> personDto = personRepository.findByLastName(lastName, PersonDto.class);
        //return (Optional<T>) personView;
       // return (Optional<T>) person;
        return (Optional<T>) personDto;

    }

    @Override
    public List<Person> findAll() {
        return personRepository.findAll();
    }
}
