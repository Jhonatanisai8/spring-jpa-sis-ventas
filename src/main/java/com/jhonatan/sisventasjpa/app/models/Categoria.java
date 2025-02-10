package com.jhonatan.sisventasjpa.app.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(
        name = "categorias",
        uniqueConstraints = @UniqueConstraint(
                name = "nombre_categoria_unique",
                columnNames = "nombre_categoria"
        )
)
public class Categoria {
    @Id
    @SequenceGenerator(
            name = "categorias_sequence",
            sequenceName = "categorias_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "categorias_sequence",
            strategy = GenerationType.SEQUENCE
    )
    private Integer idCategoria;
    @Column(
            nullable = false,
            length = 30
    )
    private String nombreCategoria;
}
