package com.canozyigit.springdatajpaprojections.service;

import com.canozyigit.springdatajpaprojections.model.Address;
import com.canozyigit.springdatajpaprojections.projection.AddressView;
import com.canozyigit.springdatajpaprojections.repository.AddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {
    private final AddressRepository addressRepository;

    @Override
    public Address createAddress(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public Address getAddressByID(int id) {
        return addressRepository.getById(id);
    }

    @Override
    public List<AddressView> getAddressByState(String state) {
        return addressRepository.getAddressByState(state);
    }

    @Override
    public List<Address> findAll() {
        return addressRepository.findAll();
    }
}
