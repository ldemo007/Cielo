package com.softwarecwb.cielo.response.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softwarecwb.cielo.response.model.entity.Erro;

public interface IErroRepository extends JpaRepository<Erro, Long> {

}
