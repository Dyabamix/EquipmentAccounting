package web.models.equipmentAccounting;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "places_of_operation")
public class PlaceOfOperation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;


    public void setId(Long id) {
        this.id = id;
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
