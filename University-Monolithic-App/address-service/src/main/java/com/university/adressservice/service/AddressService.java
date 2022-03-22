package com.university.adressservice.service;

import com.university.adressservice.entity.Address;
import com.university.adressservice.repository.AddressRepository;
import com.university.adressservice.request.CreateAddressRequest;
import com.university.adressservice.response.AddressResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    Logger logger = LoggerFactory.getLogger(AddressService.class);

    @Autowired
    AddressRepository addressRepository;

    public AddressResponse createAddress(CreateAddressRequest createAddressRequest){
        Address address = new Address();
        address.setStreet(createAddressRequest.getStreet());
        address.setCity(createAddressRequest.getCity());

        addressRepository.save(address);

        return new AddressResponse(address);
    }

    public AddressResponse getById(long id){
        logger.info("Inside getById " + id);

        Address address = addressRepository.findById(id).get();

        return new AddressResponse(address);
    }
}
