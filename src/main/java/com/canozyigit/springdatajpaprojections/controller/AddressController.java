package com.canozyigit.springdatajpaprojections.controller;

import com.canozyigit.springdatajpaprojections.model.Address;
import com.canozyigit.springdatajpaprojections.projection.AddressView;
import com.canozyigit.springdatajpaprojections.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(path="/api/")

public class AddressController {
    private final AddressService addressService;


    @GetMapping("address/{state}")
    public List<AddressView> getAddressByState(@PathVariable("state") String state) {
        return addressService.getAddressByState(state);
    }


    @PostMapping("address")
    public Address createAddress(@RequestBody Address address) {
        return addressService.createAddress(address);
    }

}
