package com.example.CommandLineRunner.repos;

import com.example.CommandLineRunner.models.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    List<Employee> findByLastName(String lastName);

    Employee findById(long id);
}
