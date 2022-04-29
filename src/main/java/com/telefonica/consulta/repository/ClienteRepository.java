package com.telefonica.consulta.repository;

import java.util.List;

import com.telefonica.consulta.entity.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ClienteRepository extends  JpaRepository<Cliente,Long>{
     List<Cliente> findAllByTipoDocumentoAndNumeroDocumento(String tipoDocumento,String numeroDocumento);
}
