package com.jhonatan.sisventasjpa.app.repository;

import com.jhonatan.sisventasjpa.app.models.Cliente;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ClienteRepositoryTest {

    @Autowired
    ClienteRepository clienteRepository;

    @Test
    public void saveCliente() {
        Cliente cliente = Cliente.builder()
                .nombre("Fabia")
                .apellido("Perez")
                .email("fabia@hotmail.com")
                .telefono("987456332")
                .build();
        clienteRepository.save(cliente);
    }

    @Test
    public void findClienteByEmail(){
        String emailBD = clienteRepository.findClienteByEmail("fabia@hotmail.com").get().getEmail();
        assertEquals("fabias@hotmail.com", emailBD);
    }

    @Test
    public void findClientesByNombreContaining(){
        List<Cliente> clientes = clienteRepository.findByNombreContaining("A");
        clientes.forEach(System.out::println);
    }

    @Test
    public void findClientesByApellidoContaining(){
        List<Cliente> clientes = clienteRepository.findByNombreContaining("ASDFGH");
        assertFalse(clientes.isEmpty(),"La lista de cliente no debe estar vacia");
        clientes.forEach(System.out::println);
    }

    @Test
    public void findCClientesfindClientesByOrderByNombreAsc(){
        List<Cliente> clientes = clienteRepository.findClientesByOrderByNombreAsc();
        assertFalse(clientes.isEmpty(),"La lista de cliente no debe estar vacia");
        clientes.forEach(System.out::println);
    }
}