package ua.mishko.training.freezerApp.model.service;

import ua.mishko.training.freezerApp.model.entity.FreezerBox;

import java.util.List;

public interface FreezerBoxService {

    void add(FreezerBox freezerBox);

    FreezerBox getOne(Long id);

    List<FreezerBox> getAll();

}
