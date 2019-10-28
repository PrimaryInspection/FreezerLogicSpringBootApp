package ua.mishko.training.freezerApp.model.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.mishko.training.freezerApp.model.entity.FreezerBox;
import ua.mishko.training.freezerApp.model.repository.FreezerBoxRepository;
import ua.mishko.training.freezerApp.model.service.FreezerBoxService;

import java.util.List;

@Service
public class FreezerBoxServiceImpl implements FreezerBoxService {


    @Autowired
    private FreezerBoxRepository repository;


    @Override
    public void add(FreezerBox freezerBox) {
        repository.save(freezerBox);
    }

    @Override
    public List<FreezerBox> getAll() {
        return repository.findAll();
    }

    @Override
    public FreezerBox getOne(Long id) {
        return repository.getOne(id);
    }
}
