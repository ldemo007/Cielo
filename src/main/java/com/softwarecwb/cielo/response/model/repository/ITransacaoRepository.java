package com.softwarecwb.cielo.response.model.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.softwarecwb.cielo.response.model.entity.Transacao;

@Repository
public interface ITransacaoRepository extends JpaRepository<Transacao, UUID> {

}
