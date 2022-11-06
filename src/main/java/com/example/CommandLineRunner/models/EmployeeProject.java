package com.example.CommandLineRunner.models;

import com.example.CommandLineRunner.repos.AddressRepository;
import com.example.CommandLineRunner.repos.EmployeeRepository;
import com.example.CommandLineRunner.repos.ProjectRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class EmployeeProject implements CommandLineRunner {

    @Resource
    private EmployeeRepository employeeRepo;
    private AddressRepository addressRepo;
    private ProjectRepository projectRepo;

    @Override
    public void run(String... args) throws Exception{

    }


}
