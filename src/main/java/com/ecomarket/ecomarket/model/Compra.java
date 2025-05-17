/**
 * Clase modelo que representa una compra en el sistema EcoMarket.
 * 
 * <p>Esta clase encapsula toda la información relacionada con una transacción de compra
 * realizada por un usuario en la plataforma EcoMarket. Almacena datos como el usuario
 * que realizó la compra, los productos adquiridos, la fecha de la transacción, el método
 * de pago utilizado, el total de la compra, entre otros detalles relevantes.</p>
 * 
 * <p>La clase Compra forma parte del modelo de datos central del sistema EcoMarket y se
 * utiliza para gestionar el historial de compras, generar reportes de ventas, procesar
 * devoluciones y mantener un registro de todas las transacciones comerciales.</p>
 * 
 * <p>Esta entidad establece relaciones con otras clases del modelo como Usuario, Producto,
 * MetodoPago, etc., para formar un modelo de datos cohesivo para la plataforma de comercio
 * electrónico orientada a productos ecológicos.</p>
 * 
 * @author Axel
 * @version 1.0
 */
package com.ecomarket.ecomarket.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.ecomarket.ecomarket.model.Detalle;

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
    private LocalDate fechaCompra;

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