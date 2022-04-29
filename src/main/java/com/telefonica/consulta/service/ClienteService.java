package com.telefonica.consulta.service;

import java.util.List;

import com.telefonica.consulta.entity.LineaMovil;

public interface ClienteService {
    List<LineaMovil> getAllLineasMovilesByDocumentOfClient(String tipoDocumento,String numeroDocumento);
}
