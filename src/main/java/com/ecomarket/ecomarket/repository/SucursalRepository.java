package com.ecomarket.ecomarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.ecomarket.ecomarket.model.Sucursal;

@Repository
public interface SucursalRepository extends JpaRepository<Sucursal, Long> {

    List<Sucursal> findByDireccionSucursal(String direccionSucursal);

    List<Sucursal> findByComunaIdComuna(Integer comunaIdComuna);
}