package com.jhonatan.sisventasjpa.app.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Embeddable
@AttributeOverrides({
        @AttributeOverride(
                name = "calle",
                column = @Column(name = "calle", length = 50, nullable = false)
        ),
        @AttributeOverride(
                name = "ciudad",
                column = @Column(name = "ciudad", length = 50, nullable = false)
        )
})
public class Direccion {
    @Column( length = 50, nullable = false)
    private String calle;

    @Column(length = 50)
    private String ciudad;

    @Column(length = 50)
    private String codigoPostal;

    @Column(length = 50)
    private String pais;
}
