package classes;

import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;

@Entity
public class File {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) private int id;
    public @Lob String filebase64;
    public String filename;
    public String filetype;

}
