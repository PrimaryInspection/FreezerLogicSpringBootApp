package ua.mishko.training.freezerApp.model.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "temperatureController")
public class TemperatureController {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "voiceSignal")
    private String voiceSignal;

    @Column(name = "isEngineEnabled")
    private boolean isEngineEnabled;

    @Column(name = "thermometerValue")
    private Double thermometerValue;

    @OneToOne(mappedBy = "temperatureController",fetch = FetchType.EAGER, optional=false)
    private FreezerBox freezerBox;


}
