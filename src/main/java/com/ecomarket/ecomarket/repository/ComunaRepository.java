package com.ecomarket.ecomarket.repository;

import com.ecomarket.ecomarket.model.Comuna;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ComunaRepository extends JpaRepository<Comuna, Long> {

    List<Comuna> findByNombreComuna(String nombreComuna);

    List<Comuna> findByCalle(String calle);

    List<Comuna> findByNumero(Integer numero);

    List<Comuna> findByRegionIdRegion(Integer idRegion);
}