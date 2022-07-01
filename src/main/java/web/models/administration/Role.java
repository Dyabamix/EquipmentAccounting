package web.models.administration;


import javax.persistence.*;

@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nameRole;


    public Role(String role) {
        this.nameRole = role;
    }

    public Role() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRole() {
        return nameRole;
    }

    public void setRole(String role) {
        this.nameRole = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Role)) return false;

        Role role = (Role) o;

        if (id != role.id) return false;
        return nameRole.equals(role.nameRole);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + nameRole.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return this.nameRole;
    }
}
