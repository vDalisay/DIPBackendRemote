package classes;
import org.jetbrains.annotations.Nullable;

import javax.persistence.*;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) private int id;
    public String description;
    public String name;

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

    public Project(int id){this.id=id;}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
