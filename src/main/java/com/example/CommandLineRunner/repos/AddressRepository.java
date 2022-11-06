package com.example.CommandLineRunner.repos;

import com.example.CommandLineRunner.models.Address;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AddressRepository extends CrudRepository<Address, Long> {

    List<Address> findById(long id);
}
