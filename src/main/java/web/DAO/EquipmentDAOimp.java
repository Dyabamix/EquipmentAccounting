package web.DAO;

import org.springframework.stereotype.Repository;
import web.models.equipmentAccounting.Defect;
import web.models.equipmentAccounting.Equipment;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class EquipmentDAOimp implements EquipmentDAO{

    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public void add(Equipment equipment) {
        entityManager.persist(equipment);
        entityManager.flush();
    }

    @Override
    public void update(Equipment equipment) {
        entityManager.merge(equipment);
        entityManager.flush();
    }

    @Override
    public void delete(int id) {
        Equipment equipment = entityManager.find(Equipment.class, id);
        if (equipment != null){
            entityManager.remove(equipment);
        }
        entityManager.flush();
    }

    @Override
    public List<Equipment> getAllEquipments() {

        return entityManager.createQuery("from Equipment", Equipment.class).getResultList();
    }

    @Override
    public Equipment getEquipment(int id) {
        return entityManager.find(Equipment.class, id);
    }

    @Override
    public Defect getDefect(int defectId) {
        return entityManager.find(Defect.class, defectId);
    }

    @Override
    public List<Defect> getAllDefects() {
        return entityManager.createQuery("from Defect", Defect.class).getResultList();
    }
}
