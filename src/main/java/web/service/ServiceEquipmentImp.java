package web.service;

import org.springframework.stereotype.Service;
import web.DAO.EquipmentDAO;
import web.models.equipmentAccounting.Defect;
import web.models.equipmentAccounting.Equipment;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ServiceEquipmentImp implements ServiceEquipment{

    private EquipmentDAO equipmentDAO;

    public ServiceEquipmentImp(EquipmentDAO equipmentDAO) {
        this.equipmentDAO = equipmentDAO;
    }

    @Override
    public void add(Equipment equipment) {
        equipmentDAO.add(equipment);
    }

    @Override
    public void update(Equipment equipment) {
        equipmentDAO.update(equipment);
    }

    @Override
    public void delete(int id) {
        equipmentDAO.delete(id);
    }

    @Override
    public List<Equipment> getAllEquipments() {
        return equipmentDAO.getAllEquipments();
    }

    @Override
    public Equipment getEquipment(int id) {
        return equipmentDAO.getEquipment(id);
    }

    @Override
    public Defect getDefect(int defectId) {
        return equipmentDAO.getDefect(defectId);
    }

    @Override
    public List<Defect> getAllDefects() {
        return equipmentDAO.getAllDefects();
    }
}
