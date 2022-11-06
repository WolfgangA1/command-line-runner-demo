package com.example.CommandLineRunner.models;

import com.example.CommandLineRunner.models.Address;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue()
    private Long id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String suffix;
    private Address address;


    protected Employee(){

    }

    public Employee(String firstName, String middleName, String lastName, String suffix, Address address){

        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.suffix = suffix;
        this.address = address;

    }

    @Override
    public String toString(){
        return String.format("Employee[id=%d, firstName='%s', middleName='%s', lastName='%s', suffix='%s']", id, firstName,middleName,lastName,
                suffix);
    }

    public Long getId(){
        return id;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getMiddleName(){
        return middleName;
    }

    public String getLastName(){
        return lastName;
    }

    public  String getSuffix(){
        return suffix;
    }

    public Address getAddress(){
        return address;
    }


}
