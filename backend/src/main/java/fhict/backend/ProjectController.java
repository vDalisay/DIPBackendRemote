package fhict.backend;

import classes.project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.websocket.ClientEndpoint;

@ClientEndpoint
@Controller
@RequestMapping(value = "/project")
public class ProjectController {
    @Autowired
    IProjectRepository projectRepository;

    public ProjectController(){ }

    @GetMapping("/all")
    public @ResponseBody
    Iterable<project> getAllProjects() {
        return projectRepository.findAll();
    }
}
