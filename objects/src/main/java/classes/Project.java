package classes;
import org.jetbrains.annotations.Nullable;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import javax.sound.sampled.AudioFormat;
import java.io.*;
import java.nio.file.Files;
import java.sql.Array;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Base64;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) private int id;
    public String description;
    public String name;
    //@Transient public MultipartFile fileRaw;
    //@Transient public String file;
    public String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }




    public Project(){

    }

    public Project(String name,String description,String status) {
        this.name = name;
        this.description = description;
        this.status = status;
    }

    public Project(int id){this.id=id;}


}
