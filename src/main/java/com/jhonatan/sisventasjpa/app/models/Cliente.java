package com.jhonatan.sisventasjpa.app.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(
        name = "clientes",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "email_unique",
                        columnNames = "email"
                ),
                @UniqueConstraint(
                        name = "telefono_unique",
                        columnNames = "telefono"
                )
        }
)
public class Cliente {

    @Id
//    @SequenceGenerator(
//            name = "clientes_sequence",
//            sequenceName = "clientes_sequence",
//            allocationSize = 1
//    )
    @GeneratedValue(
            //generator = "clientes_sequence",
            strategy = GenerationType.IDENTITY
    )
    private Long idCliente;

    @Column(
            length = 45,
            nullable = false
    )
    private String nombre;

    @Column(
            length = 45,
            nullable = false
    )
    private String apellido;

    @Column(
            length = 50,
            nullable = false
    )
    private String email;

    @Column(
            length = 9
    )
    private String telefono;

    @Embedded
    private Direccion direccion;

    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER //trae las facturas de cada cliente
    )
    @JoinColumn(
            name = "id_cliente",
            referencedColumnName = "idCliente"
    )
    private List<Factura> facturas;
}
