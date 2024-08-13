package com.campuslands.examenfinal.labatory.domain.entities;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import com.campuslands.examenfinal.city.domain.entities.City;

import jakarta.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name="labatory")
public class Labatory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Size(max=4)
    @Column(name = "id")
    private Long id;

    @Size(max=50)
    @Column(name = "namelab")
    private String nameLab;

    @ManyToOne
    @NotNull
    @Size(max=5)
    @JoinColumn(name = "codecityreg", referencedColumnName = "codecity" ,nullable = false)
    private City codeCityReg;
}
