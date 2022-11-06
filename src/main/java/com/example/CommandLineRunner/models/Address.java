package com.example.CommandLineRunner.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Address {
    @Id
    @GeneratedValue
    private Long id;
    private String addressLine1;
    private String addressLine2;
    private Integer apartmentNum;
    private String city;
    private String state;
    private Integer zip;
    private Integer zipFour;
    private String county;
    private String country;

    protected Address() {

    }

    public Address(Long id, String addressLine1, String addressLine2, Integer apartmentNum, String city, String state, Integer zip, Integer zipFour, String county, String country) {
        this.id = id;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.apartmentNum = apartmentNum;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.zipFour = zipFour;
        this.county = county;
        this.country = country;
    }

    public Long getId() {
        return id;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public Integer getApartmentNum() {
        return apartmentNum;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public Integer getZip() {
        return zip;
    }

    public Integer getZipFour() {
        return zipFour;
    }

    public String getCounty() {
        return county;
    }

    public String getCountry() {
        return country;
    }
}

