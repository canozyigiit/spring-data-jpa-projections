package com.canozyigit.springdatajpaprojections.controller;


import com.canozyigit.springdatajpaprojections.model.Address;
import com.canozyigit.springdatajpaprojections.model.Person;
import com.canozyigit.springdatajpaprojections.projection.AddressView;
import com.canozyigit.springdatajpaprojections.projection.PersonView;
import com.canozyigit.springdatajpaprojections.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/api/")
public class PersonController {

    private final PersonService personService;

    @GetMapping("person/{lastName}")
    public PersonView getPersonByLastName(@PathVariable("lastName") String lastName) {
        return personService.getPersonByLastName(lastName);
    }


    @PostMapping("person")
    public Person createPerson(@RequestBody Person person) {
        return personService.createPerson(person);
    }
}
