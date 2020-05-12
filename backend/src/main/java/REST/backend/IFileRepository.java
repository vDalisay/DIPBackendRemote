package REST.backend;

import classes.File;
import classes.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFileRepository extends JpaRepository<File,Integer> {
    File findByFilename(String name);
}
