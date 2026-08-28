package com.java.usuario.infra.exception.repository;

import com.java.usuario.infra.exception.entity.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Telefone, Long> {
}
