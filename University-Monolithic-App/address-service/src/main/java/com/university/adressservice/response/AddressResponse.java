package com.university.adressservice.response;

import com.university.adressservice.entity.Address;

public class AddressResponse {

    private long addressId;
    private String street;
    private String city;

    public long getAddressId() {
        return addressId;
    }

    public AddressResponse(Address address){
        this.addressId = address.getId();
        this.street = address.getStreet();
        this.city = address.getCity();
    }

    public void setAddressId(long addressId) {
        this.addressId = addressId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

