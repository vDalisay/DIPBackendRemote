package REST.backend;

import classes.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProjectRepository extends JpaRepository<Project,Integer> {
    Project findProjectById(int id);
}
