package REST.backend;

import classes.Project;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.websocket.ClientEndpoint;
import java.io.IOException;

@ClientEndpoint
@Controller
@RequestMapping(value = "/project")
public class ProjectController {
    @Autowired
    IProjectRepository projectRepository;
    Gson gson = new Gson();

    public ProjectController(){ }

    @GetMapping("/all")
    public @ResponseBody
    Iterable<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    @GetMapping("/{id}")
    public @ResponseBody
    ResponseEntity<Project> getProject(@PathVariable(value = "id") int id){
        Project temp = projectRepository.findProjectById(id);
        return ResponseEntity.ok(temp);
    }

    @PostMapping("/")
    public @ResponseBody
    ResponseEntity<String> addNewProject(@RequestParam("name")String name, @RequestParam("description") String description, @RequestParam("file")MultipartFile file) throws IOException {
        Project temp = new Project(name,description,file);
        projectRepository.save(temp);
        return ResponseEntity.ok("Saved");
    }
}
