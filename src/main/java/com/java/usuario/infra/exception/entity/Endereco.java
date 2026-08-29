package com.java.usuario.infra.exception.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "endereco")
@Builder
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "rua")
    private String rua;

    @Column(name = "numero")
    private String numero;

    @Column(name = "complemento", length = 150)
    private String complemento;

    @Column(name = "cidade", length = 150)
    private String cidade;

    @Column(name = "estado", length = 100)
    private String estado;

    @Column(name = "cep", length = 150)
    private String cep;


}
