package com.example.CommandLineRunner.repos;

import com.example.CommandLineRunner.models.Project;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProjectRepository extends CrudRepository<Project, Long> {

    List<Project> findById(long id);
}
