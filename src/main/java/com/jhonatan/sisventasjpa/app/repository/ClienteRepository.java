package com.jhonatan.sisventasjpa.app.repository;

import com.jhonatan.sisventasjpa.app.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClienteRepository
        extends JpaRepository<Cliente, Long> {

    Optional<Cliente> findClienteByEmail(String email);

    List<Cliente> findByNombreContaining(String nombre);

    List<Cliente> findByApellidoContaining(String apellido);

    List<Cliente> findClientesByOrderByNombreAsc();
}
