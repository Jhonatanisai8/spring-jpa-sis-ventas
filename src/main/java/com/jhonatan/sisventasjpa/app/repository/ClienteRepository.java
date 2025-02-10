package com.jhonatan.sisventasjpa.app.repository;

import com.jhonatan.sisventasjpa.app.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository
        extends JpaRepository<Cliente, Long> {

}
