package classes;
import org.jetbrains.annotations.Nullable;

import javax.persistence.*;

@Entity
public class project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String name;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String description;

    public project(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
