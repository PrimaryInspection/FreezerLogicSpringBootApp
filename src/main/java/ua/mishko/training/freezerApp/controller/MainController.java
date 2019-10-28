package ua.mishko.training.freezerApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import ua.mishko.training.freezerApp.model.entity.Door;
import ua.mishko.training.freezerApp.model.service.DoorService;

@Controller
public class MainController {

    @Autowired
    private DoorService doorService;

    @GetMapping("/add_door")
    public String getAddDoorPage(Model model){

        model.addAttribute("door", new Door()) ;
        return "/add_door";
    }

    //TODO разобраться с добавлением двери(Понять как записывать в форму вложенные обьекты,
    //TODO возможно фримаркер моменять на HTML и страдать.
    @PostMapping
    public String addDoor(@ModelAttribute Door door){

        doorService.add(door);
        return "redirect:/doors";
    }

    //TODO Не забыть сделать нормально, а не в тестовом режиме(см. файл index.ftl).
    //TODO Найти замену переменным-флагам типа Boolean, либо придумать шото лютое.
    @GetMapping("/doors/{id}")
    public String getDoorById(@PathVariable("id") Long id, Model model){
        model.addAttribute("door",doorService.getOne(id));

        return "/index";
    }

    @GetMapping("/doors")
    public String getAllDoors(Model model){
        model.addAttribute("doors",doorService.getAll());

        return "/doors";

    }
}
