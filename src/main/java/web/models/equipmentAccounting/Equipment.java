package web.models.equipmentAccounting;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "equipments")
public class Equipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numberPosition;
    private String name;
    private byte isProperly;


    public Equipment() {
    }

    public Equipment(String numberPosition, String name, byte isProperly) {
        this.numberPosition = numberPosition;
        this.name = name;
        this.isProperly = isProperly;
    }

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

    public String getNumberPosition() {
        return numberPosition;
    }

    public void setNumberPosition(String numberPosition) {
        this.numberPosition = numberPosition;
    }

    public byte getIsProperly() {
        return isProperly;
    }

    public void setIsProperly(byte isProperly) {
        this.isProperly = isProperly;
    }

}
