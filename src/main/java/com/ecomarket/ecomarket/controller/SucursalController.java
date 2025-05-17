package com.ecomarket.ecomarket.controller;

import com.ecomarket.ecomarket.model.Sucursal;
import com.ecomarket.ecomarket.repository.SucursalRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/sucursales")
public class SucursalController {

    @Autowired
    private SucursalRepository sucursalRepository;

    @GetMapping
    public List<Sucursal> getAllSucursales() {
        return sucursalRepository.findAll();
    }
    // Logica
}
