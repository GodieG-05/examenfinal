package com.campuslands.examenfinal.country.domain.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import lombok.Data;

@Entity
@Data
@Table(name="country")
public class Country {
    @Id
    @Size(max=5)
    @Column(name = "codecountry", nullable = false)
    private String codeCountry;

    @NotBlank
    @Size(max=50)
    @Column(name = "namecountry", nullable = false)
    private String nameCountry;

}
