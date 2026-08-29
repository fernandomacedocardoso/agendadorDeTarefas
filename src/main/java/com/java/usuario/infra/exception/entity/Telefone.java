package com.java.usuario.infra.exception.entity;


import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "telefone")
@Builder
public class Telefone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numero", length = 150)
    private String numero;

    @Column(name = "ddd",  length = 10)
    private String ddd;
}
