package ua.mishko.training.freezerApp.model.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Data
@Embeddable
public class DoorLightIndicator {

    @Column(name = "indicatorName")
    private String indicatorName;

    @Column(name = "indicatorValue")
    private Double indicatorValue;



}
