package com.ecomarket.ecomarket.controller;

import com.ecomarket.ecomarket.model.Detalle;
import com.ecomarket.ecomarket.repository.DetalleRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/detalles")
public class DetalleController {

    @Autowired
    private DetalleRepository detalleRepository;

    @GetMapping
    public List<Detalle> getAllDetalles() {
        return detalleRepository.findAll();
    }
    // Logica
}
