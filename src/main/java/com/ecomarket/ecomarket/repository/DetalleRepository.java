package com.ecomarket.ecomarket.repository;

import com.ecomarket.ecomarket.model.Detalle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface DetalleRepository extends JpaRepository<Detalle, Long> {

    // Buscar detalles por compra
    List<Detalle> findByCompraId(Long idCompra);

    // Buscar detalles por producto
    List<Detalle> findByProductoId(Long idProducto);

    // Contar detalles por compra
    Long countByCompraId(Long idCompra);

    // Buscar detalles por método de pago
    List<Detalle> findByMetodoPago(String metodoPago);

    // Consulta personalizada para sumar el total de una compra
    @Query("SELECT SUM(d.precioUnitario * d.cantidad) FROM Detalle d WHERE d.compra.id = :idCompra")
    BigDecimal calcularTotalCompra(@Param("idCompra") Long idCompra);

    // Buscar detalles con precio unitario mayor a
    List<Detalle> findByPrecioUnitarioGreaterThan(BigDecimal precio);

    // Buscar detalles por rango de cantidad
    List<Detalle> findByCantidadBetween(Integer min, Integer max);
}