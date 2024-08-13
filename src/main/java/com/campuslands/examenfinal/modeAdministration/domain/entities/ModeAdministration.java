package com.campuslands.examenfinal.modeAdministration.domain.entities;

import jakarta.validation.constraints.Size;
import jakarta.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name="modeadministration")
public class ModeAdministration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Size(max=4)
    @Column(name = "id")
    private Long id;

    @Size(max=60)
    @Column(name = "descriptionMode")
    private String descriptionMode;
}
