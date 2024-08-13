package com.campuslands.examenfinal.region.domain.entities;

import com.campuslands.examenfinal.country.domain.entities.Country;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import lombok.Data;

    @Entity
    @Data
    @Table(name="region")
    public class Region {
        @Id
        @Size(max=5)
        @Column(name = "codereg", nullable = false)
        private String codeReg;

        @NotBlank
        @Size(max=50)
        @Column(name = "namereg", nullable = false)
        private String nameReg;

        @ManyToOne
        @NotNull
        @Size(max=5)
        @JoinColumn(name = "codecountry", referencedColumnName = "codecountry" ,nullable = false)
        private Country codeCountry;
}
