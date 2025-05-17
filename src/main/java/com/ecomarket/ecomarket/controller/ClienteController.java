package com.ecomarket.ecomarket.controller;

import com.ecomarket.ecomarket.model.Cliente;
import com.ecomarket.ecomarket.repository.ClienteRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public List<Cliente> getAllClientes() {
        return clienteRepository.findAll();
    }

    @PostMapping
    public Cliente createCliente(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @GetMapping("{id}")
    public Cliente getClienteById(@PathVariable String id) {
        return clienteRepository.findById(id).orElse(null);
    }

    @PutMapping("{id}")
    public Cliente updateCliente(@PathVariable String id, @RequestBody Cliente cliente) {
        if (clienteRepository.existsById(id)) {
            cliente.setRun(id);
            return clienteRepository.save(cliente);
        }
        return null;
    }

    @DeleteMapping("{id}")
    public void deleteCliente(@PathVariable String id) {
        clienteRepository.deleteById(id);
    }

}
