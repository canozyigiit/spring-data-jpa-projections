package com.canozyigit.springdatajpaprojections.service;

import com.canozyigit.springdatajpaprojections.model.Address;
import com.canozyigit.springdatajpaprojections.projection.AddressView;

import java.util.List;

public interface AddressService {

    Address createAddress(Address address);
    Address getAddressByID(int id);
    List<AddressView> getAddressByState(String state);
    List<Address> findAll();
}
