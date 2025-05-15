package org.gestion_ar.service;

import org.gestion_ar.model.Cliente;
import org.gestion_ar.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> obtenerTodos() {
        return clienteRepository.findAll();
    }

    public Optional<Cliente> obtenerPorId(Long id) {
        return clienteRepository.findById(id);
    }

    public Cliente guardar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public void eliminar(Long id) {
        clienteRepository.deleteById(id);
    }

    public Cliente actualizar(Long id, Cliente clienteDetalles) {
        Optional<Cliente> clienteExistente = clienteRepository.findById(id);
        if (clienteExistente.isPresent()) {
            Cliente cliente = clienteExistente.get();
            cliente.setNombre(clienteDetalles.getNombre());
            cliente.setEmail(clienteDetalles.getEmail());
            return clienteRepository.save(cliente);
        } else {
            // Opcional: lanzar excepción o retornar null
            return null;
        }
    }
}
