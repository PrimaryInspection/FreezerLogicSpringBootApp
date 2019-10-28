package ua.mishko.training.freezerApp.model.service;


import ua.mishko.training.freezerApp.model.entity.Door;

import java.util.List;

public interface DoorService {

    void add(Door door);

    Door getOne(Long id);

    List<Door> getAll();


}
