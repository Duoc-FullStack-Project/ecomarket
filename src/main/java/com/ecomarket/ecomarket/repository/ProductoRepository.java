package com.ecomarket.ecomarket.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.math.BigDecimal;
import com.ecomarket.ecomarket.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
    List<Producto> findByNombreProductoContainingIgnoreCase(String nombre);

    List<Producto> findByPrecioBetween(BigDecimal precioMin, BigDecimal precioMax);

    List<Producto> findByStockGreaterThan(Integer stock);
}