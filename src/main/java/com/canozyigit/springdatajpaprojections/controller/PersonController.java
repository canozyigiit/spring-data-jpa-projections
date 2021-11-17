package com.canozyigit.springdatajpaprojections.controller;


import com.canozyigit.springdatajpaprojections.model.Address;
import com.canozyigit.springdatajpaprojections.model.Person;
import com.canozyigit.springdatajpaprojections.projection.AddressView;
import com.canozyigit.springdatajpaprojections.projection.PersonDto;
import com.canozyigit.springdatajpaprojections.projection.PersonView;
import com.canozyigit.springdatajpaprojections.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/api/")
public class PersonController {

    private final PersonService personService;

    @GetMapping("person/lastName/interface/{lastName}")
    public PersonView getPersonByLastName(@PathVariable("lastName") String lastName) {
        return personService.getPersonByLastName(lastName);
    }
    @GetMapping("person/firstName/dto/{firstName}")
    public PersonDto getPersonByFirstName(@PathVariable("firstName") String firstName) {
        return personService.getPersonByFirstName(firstName);
    }
    @GetMapping("person/lastName/dynamic/{lastName}")
    public Optional<Object> getPersonLastName(@PathVariable("lastName") String lastName) {
        return personService.getPersonLastName(lastName);
    }


    @PostMapping("person")
    public Person createPerson(@RequestBody Person person) {
        return personService.createPerson(person);
    }
}
