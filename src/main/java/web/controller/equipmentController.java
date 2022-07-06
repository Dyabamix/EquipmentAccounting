package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import web.models.equipmentAccounting.Equipment;
import web.service.ServiceEquipment;



import java.util.List;


@Controller
@RequestMapping("/")
public class equipmentController {

    private final ServiceEquipment serviceEquipment;

    public equipmentController(ServiceEquipment serviceEquipment) {
        this.serviceEquipment = serviceEquipment;

    }

    @GetMapping(value = "/")
    public String getListEquipmentsAndDeleteEquipment(Model model) {

        model.addAttribute("equipments", serviceEquipment.getAllEquipments());
        model.addAttribute("equipment", new Equipment());

        return "index";
    }

    @PostMapping(value = "/create")
    public String create(@ModelAttribute("equipment") Equipment equipment) {

        serviceEquipment.add(equipment);

        return "redirect:/";
    }

}
