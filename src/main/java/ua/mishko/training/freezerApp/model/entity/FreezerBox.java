package ua.mishko.training.freezerApp.model.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "freezerBox")
public class FreezerBox {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "isDoorOpen")
    private String isDoorOpen;

    @OneToOne(optional=false, cascade=CascadeType.ALL)
    @JoinColumn (name="temperatureController_id")
    private TemperatureController temperatureController;





}
