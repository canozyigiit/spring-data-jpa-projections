package com.canozyigit.springdatajpaprojections.repository;

import com.canozyigit.springdatajpaprojections.model.Person;
import com.canozyigit.springdatajpaprojections.projection.PersonView;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
    PersonView findByLastName(String lastName);

}
