package com.canozyigit.springdatajpaprojections.repository;

import com.canozyigit.springdatajpaprojections.model.Person;
import com.canozyigit.springdatajpaprojections.projection.PersonDto;
import com.canozyigit.springdatajpaprojections.projection.PersonView;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person, Integer> {
    PersonView findByLastName(String lastName);//Interface-Based Projections

    PersonDto findByFirstName(String firstName);//Class-Based Projections

    <T> Optional<T> findByLastName(String lastName, Class<T> type);// Dynamic Projections

}
