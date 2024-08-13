package com.campuslands.examenfinal.customer.domain.entities;

import java.time.LocalDate;

import com.campuslands.examenfinal.city.domain.entities.City;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import lombok.Data;

@Entity
@Data
@Table(name="customer")
public class Customer {
    @Id
    @Size(max=20)
    @Column(name = "idcostumer", nullable = false)
    private String idCustomer;

    @Size(max=20)
    @Column(name = "namecostumer")
    private String nameCostumer;

    @Size(max=20)
    @Column(name = "lastnamecostumer")
    private String lastNameCostumer;

    @ManyToOne
    @NotNull
    @Size(max=5)
    @JoinColumn(name = "codecitycostumer", referencedColumnName = "codecity" ,nullable = false)
    private City codeCityCostumer;

    @Size(max=100)
    @Column(name = "emailcostumer")
    private String emailCostumer;

    @Column(name = "birthdate")
    private LocalDate birthDate;

    @Size(max=8)
    @Column(name = "lon")
    private Float lon;

    @Size(max=8)
    @Column(name = "latitud")
    private Float latitud;

}
