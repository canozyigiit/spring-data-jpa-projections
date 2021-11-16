package com.canozyigit.springdatajpaprojections.repository;

import com.canozyigit.springdatajpaprojections.model.Address;
import com.canozyigit.springdatajpaprojections.projection.AddressView;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address, Integer> {
    List<AddressView> getAddressByState(String state);


}
