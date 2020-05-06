package classes;
import org.jetbrains.annotations.Nullable;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import javax.sound.sampled.AudioFormat;
import java.io.*;
import java.nio.file.Files;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.Base64;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) private int id;
    public String description;
    public String name;
    @Transient public MultipartFile fileRaw;
    @Lob public byte[] file;


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

    public Project(String name,String description,MultipartFile file) throws IOException {
        this.name = name;
        this.description = description;
        this.file = Base64.getEncoder().encode(file.getBytes());
    }

    public Project(int id){this.id=id;}


}
