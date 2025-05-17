package com.ecomarket.ecomarket.repository;

import com.ecomarket.ecomarket.model.Compra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.time.LocalDate;

@Repository
public interface CompraRepository extends JpaRepository<Compra, Long> {
    List<Compra> findByClienteRun(String runCliente);

    List<Compra> findBySucursalIdSucursal(Long idSucursal);

    List<Compra> findByFechaCompraBetween(LocalDate fechaInicio, LocalDate fechaFin);
}