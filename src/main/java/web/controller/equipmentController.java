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


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


@Controller
public class equipmentController {

    private final ServiceEquipment serviceEquipment;

    public equipmentController(ServiceEquipment serviceEquipment) {
        this.serviceEquipment = serviceEquipment;

    }

    @GetMapping(value = "/")
    public String getListEquipmentsAndDeleteEquipment(ModelMap modelMap,
                                                      Model model) {


        List<Equipment> equipments = serviceEquipment.getAllEquipments();
        modelMap.addAttribute("equipments", equipments);
        model.addAttribute("equipment", new Equipment());

        return "index";
    }

    @PostMapping(value = "/create")
    public String create(@ModelAttribute("equipment") Equipment equipment) {

        serviceEquipment.add(equipment);

        return "redirect:/";
    }

}
