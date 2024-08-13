package com.campuslands.examenfinal.activePrinciple.domain.entities;

import jakarta.validation.constraints.Size;
import jakarta.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name="activeprinciple")
public class ActivePrinciple {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Size(max=4)
    @Column(name = "idap")
    private Long idAp;

    @Size(max=60)
    @Column(name = "nameap")
    private String nameAp;
}
