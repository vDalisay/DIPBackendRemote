package REST.backend;

import classes.Project;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.websocket.ClientEndpoint;

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
    ResponseEntity<String> addNewProject(@RequestBody String body){
        Project temp = gson.fromJson(body,Project.class);
        projectRepository.save(temp);
        return ResponseEntity.ok("Saved");
    }
}
