package ua.mishko.training.freezerApp.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.mishko.training.freezerApp.model.entity.FreezerBox;

public interface FreezerBoxRepository extends JpaRepository<FreezerBox,Long> {
}
