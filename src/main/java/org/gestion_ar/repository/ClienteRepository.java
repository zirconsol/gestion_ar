package org.gestion_ar.repository;

import org.gestion_ar.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    // Aquí podés agregar métodos personalizados si necesitás, pero no es obligatorio
}
