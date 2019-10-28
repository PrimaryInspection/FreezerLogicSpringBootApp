package ua.mishko.training.freezerApp.model.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.mishko.training.freezerApp.model.entity.Door;
import ua.mishko.training.freezerApp.model.repository.DoorRepository;
import ua.mishko.training.freezerApp.model.service.DoorService;

import java.util.List;


@Service
public class DoorServiceImpl implements DoorService {

    @Autowired
    private DoorRepository doorRepository;

    @Override
    public void add(Door door) {
        doorRepository.save(door);
    }

    @Override
    public Door getOne(Long id) {
        return doorRepository.getOne(id);
    }

    @Override
    public List<Door> getAll() {
        return doorRepository.findAll();
    }
}
