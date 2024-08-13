package com.campuslands.examenfinal.city.domain.entities;

import com.campuslands.examenfinal.region.domain.entities.Region;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import lombok.Data;

@Entity
@Data
@Table(name="city")
public class City {
    @Id
    @Size(max=5)
    @Column(name = "codecity", nullable = false)
    private String codeCity;

    @NotBlank
    @Size(max=50)
    @Column(name = "namecity", nullable = false)
    private String nameCity;

    @ManyToOne
    @NotNull
    @Size(max=5)
    @JoinColumn(name = "codereg", referencedColumnName = "codereg" ,nullable = false)
    private Region codeReg;

}
