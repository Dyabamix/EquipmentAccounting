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
    private int isProperly;


    public Equipment() {
    }

    public Equipment(String numberPosition, String name, int isProperly) {
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

    public int getIsProperly() {
        return isProperly;
    }

    public void setIsProperly (int isProperly) {
        this.isProperly = isProperly;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Equipment)) return false;

        Equipment equipment = (Equipment) o;

        if (isProperly != equipment.isProperly) return false;
        if (id != null ? !id.equals(equipment.id) : equipment.id != null) return false;
        if (numberPosition != null ? !numberPosition.equals(equipment.numberPosition) : equipment.numberPosition != null)
            return false;
        return name != null ? name.equals(equipment.name) : equipment.name == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (numberPosition != null ? numberPosition.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + isProperly;
        return result;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "id=" + id +
                ", numberPosition='" + numberPosition + '\'' +
                ", name='" + name + '\'' +
                ", isProperly=" + isProperly +
                '}';
    }
}
