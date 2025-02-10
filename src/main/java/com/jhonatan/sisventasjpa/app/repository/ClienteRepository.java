package com.jhonatan.sisventasjpa.app.repository;

import com.jhonatan.sisventasjpa.app.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository
        extends JpaRepository<Cliente, Long> {

    Optional<Cliente> findClienteByEmail(String email);

}
