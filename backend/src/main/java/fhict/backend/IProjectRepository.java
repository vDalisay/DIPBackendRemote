package fhict.backend;

import classes.project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProjectRepository extends JpaRepository<project,Integer> {
}
