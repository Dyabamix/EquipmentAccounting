package web.models.equipmentAccounting;

import javax.persistence.*;

@Entity
@Table(name = "service_personnel_groups")
public class ServicePersonnelGroup {
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
