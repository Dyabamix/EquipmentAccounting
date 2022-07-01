package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.equipmentAccounting.Equipment;
import web.service.ServiceEquipment;


import java.util.HashSet;
import java.util.List;


@Controller
public class UserController {

    private final ServiceEquipment serviceEquipment;

    public UserController(ServiceEquipment serviceEquipment) {
        this.serviceEquipment = serviceEquipment;

    }

    @GetMapping(value = "/")
    public String getListEquipmentsAndDeleteEquipment(@RequestParam(name = "equipment_id", required = false) Integer equipment_id,
                                            ModelMap modelMap) {
        if (equipment_id != null) {
            serviceEquipment.delete(equipment_id);
            return "redirect:/";
        }

        List<Equipment> equipments = serviceEquipment.getAllEquipments();
        modelMap.addAttribute("equipments", equipments);

        return "index";
    }

}
