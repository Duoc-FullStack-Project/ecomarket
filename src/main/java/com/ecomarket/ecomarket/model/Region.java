package com.ecomarket.ecomarket.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "REGION")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Region {

    @Id
    @Column(name = "ID_REGION", nullable = false, columnDefinition = "NUMBER(2)")
    private Integer idRegion;

    @Column(name = "NOMBRE_REGION", nullable = false, length = 100)
    private String nombreRegion;
}