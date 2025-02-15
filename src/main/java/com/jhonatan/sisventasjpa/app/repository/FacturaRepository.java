package com.jhonatan.sisventasjpa.app.repository;

import com.jhonatan.sisventasjpa.app.models.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaRepository
extends JpaRepository<Factura, Long> {
}
