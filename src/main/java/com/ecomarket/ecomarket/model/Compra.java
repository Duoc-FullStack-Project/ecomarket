
package com.ecomarket.ecomarket.model;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "COMPRA")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_COMPRA")
    private Long idCompra;

    @Column(name = "FECHA_COMPRA", nullable = false)
    private Date fechaCompra;

    @Column(name = "NRO_FACTURA", nullable = false, length = 50)
    private String numeroFactura;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CLIENTE_RUN", nullable = false, referencedColumnName = "RUN")
    private Cliente cliente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SUCURSAL_ID_SUCURSAL", nullable = false)
    private Sucursal sucursal;

    @OneToMany(mappedBy = "compra", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Detalle> detalles = new ArrayList<>();
}