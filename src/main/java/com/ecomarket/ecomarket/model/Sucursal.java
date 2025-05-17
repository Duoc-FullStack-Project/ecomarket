package com.ecomarket.ecomarket.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "SUCURSAL")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sucursal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_SUCURSAL")
    private Long idSucursal;

    @Column(name = "DIR_SUCURSAL", nullable = false, length = 200)
    private String direccionSucursal;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COMUNA_ID_COMUNA", nullable = false, referencedColumnName = "ID_COMUNA")
    private Comuna comuna;
}