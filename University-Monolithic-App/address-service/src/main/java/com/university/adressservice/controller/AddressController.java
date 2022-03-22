package com.university.adressservice.controller;

import com.university.adressservice.request.CreateAddressRequest;
import com.university.adressservice.response.AddressResponse;
import com.university.adressservice.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/address")
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping("/create")
    public AddressResponse createAddress(@RequestBody CreateAddressRequest createAddressRequest){
        return addressService.createAddress(createAddressRequest);
    }

    @GetMapping("getById/{id}")
    public AddressResponse getById(@PathVariable long id){
        return addressService.getById(id);
    }
}
