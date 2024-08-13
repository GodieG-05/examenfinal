package com.campuslands.examenfinal.medicine.domain.entities;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import com.campuslands.examenfinal.activePrinciple.domain.entities.ActivePrinciple;
import com.campuslands.examenfinal.labatory.domain.entities.Labatory;
import com.campuslands.examenfinal.modeAdministration.domain.entities.ModeAdministration;
import com.campuslands.examenfinal.unitMeasurement.domain.entities.UnitMeasurement;

import jakarta.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name="medicine")
public class Medicine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Size(max=4)
    @Column(name = "id")
    private Long id;

    @Size(max=10)
    @Column(name = "proceedings")
    private String proceedings;

    @Size(max=100)
    @Column(name = "namemedicine")
    private String nameMedicine;

    @Size(max=50)
    @Column(name = "healthregister")
    private String healthRegister;

    @Column(name = "description")
    private String description;

    @Size(max=60)
    @Column(name = "descriptionshort")
    private String descriptionShort;

    @ManyToOne
    @NotNull
    @Size(max=4)
    @JoinColumn(name = "codemodeadmin", referencedColumnName = "id" ,nullable = false)
    private ModeAdministration codeModeAdmin;

    @ManyToOne
    @NotNull
    @Size(max=4)
    @JoinColumn(name = "codeap", referencedColumnName = "idap" ,nullable = false)
    private ActivePrinciple codeAp;
    
    @ManyToOne
    @NotNull
    @Size(max=4)
    @JoinColumn(name = "codeum", referencedColumnName = "idum" ,nullable = false)
    private UnitMeasurement codeUm;

    @Size(max=100)
    @Column(name = "namerol")
    private String nameRol;

    @ManyToOne
    @NotNull
    @Size(max=4)
    @JoinColumn(name = "codelab", referencedColumnName = "id" ,nullable = false)
    private Labatory codeLab;

}
