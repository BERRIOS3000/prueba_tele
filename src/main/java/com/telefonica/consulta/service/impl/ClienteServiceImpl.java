package com.telefonica.consulta.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.telefonica.consulta.entity.Cliente;
import com.telefonica.consulta.entity.LineaMovil;
import com.telefonica.consulta.repository.ClienteRepository;
import com.telefonica.consulta.service.ClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService{
    @Autowired
    private ClienteRepository clienteRepository;
    @Override
    public List<LineaMovil> getAllLineasMovilesByDocumentOfClient(String tipoDocumento,String numeroDocumento) {
        // TODO Auto-generated method stub
        List<Cliente> clientes=clienteRepository.findAllByTipoDocumentoAndNumeroDocumento(tipoDocumento,numeroDocumento);
        List<LineaMovil> lineasMoviles= new ArrayList<>(); 
    
        return clientes.isEmpty()?lineasMoviles: clientes.get(0).getLineaMoviles();
    }
    
}
