package ua.mishko.training.freezerApp.model.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "door")
public class Door {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Embedded
    private DoorLightIndicator doorLightIndicator;

    @Column(name = "isDoorOpen")
    private String isDoorOpen;
}
