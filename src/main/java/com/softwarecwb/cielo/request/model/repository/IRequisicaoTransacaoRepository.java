package com.softwarecwb.cielo.request.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.softwarecwb.cielo.request.model.entity.RequisicaoTransacao;

@Repository
public interface IRequisicaoTransacaoRepository extends JpaRepository<RequisicaoTransacao, Long> {

}
