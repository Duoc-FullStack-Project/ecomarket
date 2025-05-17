package com.ecomarket.ecomarket.model;

import java.math.BigInteger;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "COMUNA")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comuna {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_COMUNA")
    private Integer idComuna;

    @Column(name = "NOMBRE_COMUNA", nullable = false, length = 100)
    private String nombreComuna;

    @Column(name = "CALLE", nullable = false, length = 100)
    private String calle;

    @Column(name = "NUMERO", nullable = false)
    private Integer numero;

    @ManyToOne
    @JoinColumn(name = "REGION_ID_REGION", nullable = false, referencedColumnName = "ID_REGION")
    private Region region;
}