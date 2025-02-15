package com.jhonatan.sisventasjpa.app.repository;

import com.jhonatan.sisventasjpa.app.models.Factura;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FacturaRepositoryTest {

    @Autowired
    private FacturaRepository facturaRepository;

    @Test
    void testFindAllClientesFacturas() {
        facturaRepository.findAll().forEach(System.out::println);
    }
}