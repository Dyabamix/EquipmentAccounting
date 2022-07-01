package web.DAO;

import web.models.equipmentAccounting.Defect;
import web.models.equipmentAccounting.Equipment;

import java.util.Date;
import java.util.List;

public interface EquipmentDAO {
    void add(Equipment equipment);
    void update(Equipment equipment);
    void delete(int id);
    List<Equipment> getAllEquipments();
    Equipment getEquipment(int id);
    Defect getDefect(int defectId);
    List<Defect> getAllDefects();
}
