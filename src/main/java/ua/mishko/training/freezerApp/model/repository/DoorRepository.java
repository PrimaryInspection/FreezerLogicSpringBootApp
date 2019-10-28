package ua.mishko.training.freezerApp.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.mishko.training.freezerApp.model.entity.Door;

public interface DoorRepository extends JpaRepository<Door,Long> {
}
