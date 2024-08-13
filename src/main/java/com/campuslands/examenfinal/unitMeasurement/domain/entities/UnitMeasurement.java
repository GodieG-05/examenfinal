package com.campuslands.examenfinal.unitMeasurement.domain.entities;

import jakarta.validation.constraints.Size;
import jakarta.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name="unitmeasurement")
public class UnitMeasurement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Size(max=4)
    @Column(name = "idum")
    private Long idUm;

    @Size(max=60)
    @Column(name = "nameum")
    private String nameUm;
}
