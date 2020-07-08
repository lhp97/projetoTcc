package com.lhprado.projetotcc.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lhprado.projetotcc.domain.tblrecursos;

@Repository
public interface recursosRepository extends JpaRepository<tblrecursos, Integer>{

  List<tblrecursos> findAll();
  
  
}
